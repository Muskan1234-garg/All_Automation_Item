import { Role } from 'testcafe';
import { Selector, t } from 'testcafe';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_WebLinksSetup from '../Functional_POM/POM_WebLinksSetup';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import WebLinksSetup_Utility from '../Functional_Utilities/WebLinksSetup_Utility';
const DataIUT = require('../DataFiles/DataIUT.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const POM_Web = new POM_WebLinksSetup();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();
const WebLinks_Utility=new WebLinksSetup_Utility();
var faker = require('faker');
var StrUrlShortNamePublic = 'WL_PB' + faker.random.number();
var StrUrlShortNamePublic1 = 'WL_PB' + faker.random.number();
var StrUrlShortNamePublic2 = 'WL_PB' + faker.random.number();
var StrUrlShortNameEdit = 'WL_PB_EDIT' + faker.random.number();

//***********************************************************************************************************************************************************************************************************
//JIRA ID OF STORY : RMA-109573
//Description : WebLinksSetup Configuration 
//AUTHOR : Nalayirem Subramanian
//DEPENDANCY : No
//PRE-REQUISITE : No
//Preferred Server: Any SERVER LIKE :- IUT OR STAGING or Regression - DSN name:RM202REG_Test2
//****************************************************************************************************************************************************************//

DataIUT.forEach(data => {

  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    await t.wait(2000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );
  const LoggedInUser1 = Role(data.URL, async t => {
    await t.maximizeWindow()
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(2000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  const LoggedInUser2 = Role(data.URL, async t => {
    await t.maximizeWindow()
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username1, data.Password1, data.DSN, 'Claims')
    await t.wait(2000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  const LoggedInUser3 = Role(data.URL, async t => {
    await t.maximizeWindow()
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username1, data.Password1, data.DSN, 'Configuration Manager')
    await t.wait(2000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`Weblinkssetup`.beforeEach(async t => {

  });

  // Scenario1
  // This testcase works on the following Scenerios
  // 1.Creating a Weblink Record with the URL TYPE as PUBLIC
  // 2.Clicking on CONFIRM and checking wheather all values are getting empty or not and printing in the logs then closing the add
  // 3.opening and closing the add without entering data
  // 4.Giving the same name for the record which is already given,then checking error message is coming or not while saving and printing in the logs
  
  test('WeblinkssetupConfiguration_Test_ADD_Public_Scenario1', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lnk_Screen, "Opening the screen weblinks Setup")
    await t.wait(2000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_WebLinksSetupIframe)
    console.log("Weblinks setup iframe loaded")

    //Add test case for PUBLIC
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_add, "Clicking on Add button on the screen")
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName, StrUrlShortNamePublic, "Clicking on URL Short Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_Type, "URL TYPE Dropdown");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(data.UrlType), "Clicking on URL Type")
    //verifying the URL string starts with http
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_Supplemental_Link, "Check", "Clicking on Use As Supplemental Link")
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String, data.UrlstringFake, "Clicking on URL String and giving fake URL")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Add_Save, "Save Image Button");
    await Verify_Utility.AssureClaims_VerifyUXMessage_ToastMessage_Utility(Verification_Msg.AssureClaims_URLString_ErrorMessage, false, "WebLink Setup Screen");
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String, data.UrlString, "Clicking on URL String")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_Select_Parameter, "Select Parameter dropdown is clicked");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(data.SelectParameter), "Selecting Select Parameter")
    await In_Utility.AssureClaims_SetValue_Append_For_Existing_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String, data.UrlStringAppend, "Clicking on URL String")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_Select_Parameter, "Select Parameter dropdown is clicked");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(data.SelectParameterAppend), "Selecting Select Parameter")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Add_Save, "Save Image Button On Web Link Setup Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_gridid_delete_Confirm_button, "Clicking on Confirm Button");
    ///---Verifying whether the fields are coming as empty or not when clicking on confirm---///
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName, data.CheckUrlShortNmae, "Checking Url ShortNmae");
    await Verify_Utility.AssureClaims_CheckedUncheckedStateVerification_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_Supplemental_Link, 'Unchecked', "Checking checkbox");
    (await POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String_Verify.find('span').exists) ? console.log('URL_String input is not empty') : console.log('URL_String input is empty');
    (await POM_Web.AssureClaims_WebLinksSetup_Lst_URL_Type_Verify.find('span').exists) ? console.log('URL_Type input is not empty') : console.log('URL_Type input is empty');
    (await POM_Web.AssureClaims_WebLinksSetup_Lst_Select_Parameter_Verify.find('span').exists) ? console.log('Select_Parameter input is not empty') : console.log('Select_Parameter input is empty');
    (await POM_Web.AssureClaims_WebLinksSetup_Lst_Select_Function_Verify.find('span').exists) ? console.log('Select_Function input is not empty') : console.log('Select_Function input is empty');
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Dlgbox_Cancel, "clicking on cancel button");
    //--verifying wheather duplicate short name is throwing the error message or not--//
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_add, "Clicking on Add button on the screen")
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName, StrUrlShortNamePublic, "Clicking on URL Short Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_Type, "URL TYPE Dropdown");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(data.UrlType), "Clicking on URL Type")
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String, data.UrlString, "Clicking on URL String")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Add_Save, "Save Image Button On Web Link Setup Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_ToastMessage_Utility(Verification_Msg.AssureClaims_UniqueShortName_ErrorMessage, false, "WebLink Setup Screen");

    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Dlgbox_Cancel, "Clicking on Cancel Button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_gridid_delete_Confirm_button, "Clicking on Confirm Button");
    // Verifying whether the record is present or not in the grid using the grid filter.
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Weblink_Filter_Selection, "Clicking on the grid filter");
    const StrColName = ["URL Short Name"]
    const StrColVal = [StrUrlShortNamePublic];
    await t.wait(3000)
    await WebLinks_Utility.AssureClaims_FilteringRowsAgainstFilterInClaimsGrid_For_Configuration(StrColName, StrColVal);
    await t.wait(8000)
  })

  //Navigating to the CLAIMS ZONE and checking wheather the created records(one with URLTYPE public other with private)
  //Were present in the claims zone >my work > weblinks > UrlShortNamePublic. this weblink record shortname should be visible
  //As it is a public record and should be visible to any user.Trying with one user to check private record also showing or not.
  //Private record should not be visible. As it is given with another username.
  // test('WebLinkSetup_MyWork_User1_Scenario1', async t => {
  //   await t.setNativeDialogHandler(() => true).useRole(LoggedInUser1);
  //   console.log("Executing My Work");
  //   await t.switchToMainWindow();
  //   await t.wait(1000)
  //   await Nav_Utility.AssureClaims_MenuOptionClick_Utility('My Work:Web Links')
  //   await t.wait(1000)
  //   await Nav_Utility.AssureClaims_SubMenuOptionCheck_Utility(StrUrlShortNamePublic)
  //   await t.wait(1000)
  // })


  // // Testcase for Jumping into the SupplementalFieldData Screen to check wheather the record we created with "Use As Supplemental Link"
  // // Is showing in the Hyperlink dropdown or not.
  // // This will click on any record from grid > add > FieldType(Selects Hyperlink) > Hyperlink (checks in hyperlink dropdown)
  test('Weblinkssetup_Test_Supplemental_Screen_Scenario2', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    //-----From here we are checking wheather the record which we have given with ,use as suplemental Link, is appearing in Hyper link (of supplemental field screen)or not----// 

    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_SuplementalField_Lnk_Screen, "Opening the screen Supplemental field screen")
    await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_SuplementalField_Lnk_Iframe)
    console.log("SupplementalField iframe loaded")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Suplemental_Grid, "Clicking on the grid");
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_suplementalField_Add, "Clicking on the Add");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Suplemental_Field_Type, "Clicking on FieldType dropdown")

    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(data.SuplementalFieldType), "Selecting on FieldType")
    console.log("On supplemental field data screen inside the Field Type dropdown list Hyperlink is clicked".green)

    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Suplemental_Hyper_Link, "Clicking on Hyperlink dropdown")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(StrUrlShortNamePublic), "Selecting on HyperLink")
    console.log("On supplemental field data screen inside the Hyperlink dropdown list " + StrUrlShortNamePublic + " is clicked".green)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Suplemental_Hyper_Link_Close, "Clicking on Hyperlink dropdown")
    await t.switchToMainWindow()
    await t.click(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_MenuButton)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lnk_Screen, "Opening the screen weblinks Setup")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid_Refresh, "Clicking on refresh");
  });

  // // Testcase for clicking on the desired record checkbox and clicking on edit button and  checking wheather the values are prepopulating or not
  // // changing a field data and clicking on save
  // // checking on grid filter wheather the got updated with the edited name or not.
  test('Weblinkssetup_Test_Edit_Scenario3', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lnk_Screen, "Opening the screen weblinks Setup")
    await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_WebLinksSetupIframe)
    console.log("Weblinks setup iframe loaded")
    await t.wait(5000)
    //---Edit Scenerio---//
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Grid_View, "Clicking on the grid");
    await t.wait(2000)
    const StrColName1 = ["URL Short Name"]
    const StrColVal1 = [StrUrlShortNamePublic];
    await WebLinks_Utility.AssureClaims_FilteringRowsAgainstFilterInClaimsGrid_For_Configuration(StrColName1, StrColVal1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Screen_Click, "Clicking on the screen");
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid, "Checked", "Clicking on checkbox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid_Delete.withText(StrUrlShortNamePublic).sibling('div').withAttribute('role', 'presentation'), "Clicking on grid checkbox");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_gridid_edit_button, "Clicking on grid Edit Button")
    await t.wait(2000)
    //---Verifying whether the data is coming as prepopulating or not in edit scenerio---//
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName, StrUrlShortNamePublic, "Checking Url ShortNmae");
    var Checking_ForEdit = await POM_Web.AssureClaims_WebLinksSetup_Lst_URL_Type_Checking_ForEdit.innerText;
    if (Checking_ForEdit.trim() === "PUBLIC") {
      console.log("The selected value is PUBLIC");
    } else if (Checking_ForEdit.trim() === "PRIVATE") {
      console.log("The selected value is  PRIVATE");
    }
    await Verify_Utility.AssureClaims_CheckedUncheckedStateVerification_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_Supplemental_Link, 'Checked', "Checking checkbox");
    var Checking_ForEdit_URL_String = await POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String_Edit.value;
    if (Checking_ForEdit_URL_String.trim() === data.UrlStringEdit) {
      console.log("The selected value is " + data.UrlStringEdit);
    } else {
      console.log("The selected value is not " + data.UrlStringEdit);
    }
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName, StrUrlShortNameEdit, "Clicking on URL Short Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Add_Save, "Save Image Button On Web Links Setup Screen");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_Filter_Refresh, "Clicking on refresh");
    //Verifying Whether we are adding duplicate record or not. 
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_add, "Clicking on Add button on the screen")
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName, StrUrlShortNameEdit, "Clicking on URL Short Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_Type, "URL TYPE Dropdown");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URLTYPE.withText(data.UrlType), "Clicking on URL Type")
    await In_Utility.AssureClaims_SetValue_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_String, data.UrlString, "Clicking on URL String")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Add_Save, "Save Image Button On WebLinks Setup Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_ToastMessage_Utility(Verification_Msg.AssureClaims_UniqueShortName_ErrorMessage, false, "WebLink Setup Screen");
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Add_Cancel, "Cancel Image Button On Web Link Setup Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_gridid_delete_Confirm_button, "clicking on Confirm button");
    //Verifying whether the recors is populated over grid
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Weblink_Filter_Selection, "Clicking on the grid filter");
    const StrColName = ["URL Short Name"]
    const StrColVal = [StrUrlShortNameEdit];
    await Function_Utility.AssureClaims_FilteringRowsAgainstFilterInClaimsGrid_For_Configuration(StrColName, StrColVal);
  })

  //Test case for deleting a single row
test('WebLink_Delete_Scenario4', async t => {
  await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lnk_Screen,"Opening the screen weblinks Setup")
  await t.wait(4000)
  await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_WebLinksSetupIframe)
  console.log("Weblinks setup iframe loaded")
  await t.wait(3000)
//---Delete Scenerio for public user--//
await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_Weblink_Filter_Selection, "Clicking on the grid filter");

  const StrColName1 = ["URL Short Name","URL Type","Use As Supplemental Link","URL String","Users"]
  const StrColVal1 = [StrUrlShortNameEdit,data.UrlType, data.Supllementalcheckbox,data.UrlString,data.UsersPublic];
  const StrColId1 = ["urlShortName", "urlType", "useAsSupplementalLink","urlString","users"]
  await Function_Utility.AssureClaims_VerifyRowsAgainstFilterInClaimsGrid_For_Configuration(StrColName1, StrColVal1, StrColId1);
await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_URL_ShortName_Grid_Delete, "Clicking on grid checkbox");
await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_gridid_delete_button, "Clicking on grid delete Button")
await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Web.AssureClaims_WebLinksSetup_Lst_gridid_delete_Confirm_button, "Clicking on Confirm Button");
await Verify_Utility.AssureClaims_VerifyUXMessage_ToastMessage_Utility(Verification_Msg.AssureClaims_Delete_ConfirmMessage, false, "WebLink Setup Screen");
await t.wait(3000);
 await t.switchToMainWindow()
    await t.click(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_MenuButton)
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(claimsSubMenu, "Clicking on the Claims Button");

    await t.maximizeWindow()
  console.log("Executing My Work");
  await t.wait(3000)
  await Nav_Utility.AssureClaims_MenuOptionClick_Utility('My Work:Web Links')
    await t.wait(5000)
    await Nav_Utility.AssureClaims_SubMenuOptionCheck_Utility(StrUrlShortNameEdit)
    await t.wait(1000)    
})

})