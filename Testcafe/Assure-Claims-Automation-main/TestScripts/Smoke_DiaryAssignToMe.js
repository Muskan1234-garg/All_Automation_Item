import { Selector, Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_DiaryList from '../Functional_POM/POM_DiaryList';
import POM_Home from '../Functional_POM/POM_Home';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Diary_Creation = new POM_DiaryList();
const ConfigMgr_POM = new POM_Config_Manager();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const GenSysPar_POM = new POM_GeneralSystemParameter();

var faker = require('faker');

//Global Variable Declaration

var date = new Date();
var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
var strTaskName;
var strUserLastName = "Auto_" + faker.name.lastName();
var strUserFirstName = "Auto_" + faker.name.lastName();

DataIUT.forEach(data => {
  fixture`Smoke_DiaryAssignToMe`.beforeEach(async t => {
    await t.wait(5000);
    await t.navigateTo(data.URL);
    await t.maximizeWindow();
  });

  // 1. Create User

  test('AssureClaims_UserCreation_Test_01', async t => {
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security');
    console.log("Login Into Application!!".green);
    //=================================================User creation starts here ====================================================================================================
    console.log("AssureClaims_SMSUserAddEditDelete_Utility Function is Called To Create User");
    await Function_Utility.AssureClaims_SMSUserAddEditDelete_Utility('Add', strUserLastName, strUserFirstName, 'NA', data.DSN, 'Administrator');
    console.log("User Created :" + strUserFirstName);
  });
  //=================================================User creation ends here ========================================================================================================

// 1. turn on Allow Diary Peek setting from configuration manager
// 2. turn off Default Assigned To Dairy Current User
// 3. Peek diary
// 4. verify
  test('AssureClaims_DiaryPeek_Route_Test_02', async t => {
    // ==================================================Login into application ========================================================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager');
    await t.wait(5000);
    // =====================================================Turn on/off Setting starts from here ======================================================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Diary");
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser, 'UnCheck', "Uncheck Default Assigned To Diary User Check Box");
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_AllowDiaryPeek, 'Check', "Check Allow Global Peek for Diaries CheckBox");
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save");
    await t.wait(10000);
    // =====================================================Turn on/off Setting ends from here ======================================================================================
    //  ====================================================================Zone Switching starts here ==============================================================================
    console.log("Login Into Application!!".green);
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(10000);
    // =================================================================Zone switching ends here ====================================================================================

    console.log("AssureClaims_Diary_Creation_Utility Function is Called To Create Diary");
    strTaskName = await Function_Utility.AssureClaims_Diary_Creation_Utility(strUserFirstName);
    console.log("Diary Created with Taskname : " + strTaskName);
    //=================================================================Steps for Peek Diary starts here ==============================================================================
    await t.wait(8000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_DiariesPeek_Btn_Peek, "Click on peek button");
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_AvailableUsers, strUserFirstName, "Available User TextBox");
    await t.pressKey('tab');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_Peek, "Click on peek button");
    await t.wait(12000);
    // =================================RMA-102172: Yashaswi's Code to get toolbar buttons after peek starts here =====================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_DiaryCreation_Btn_Create, "Diary Button on Claim Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Cancle, "Click Cancel");
    // =================================RMA-102172: Yashaswi's Code to get toolbar buttons after peek ends here =====================================================================

    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName, strTaskName, "strTaskName TextBox");
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_SystemUsers_Btn_FilterSearchTaskName1, "Click on Search Button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_SystemUsers_Img_RowSelector, "Select the user");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_Diary_Btn_AssignToMeDiary, "Assign to me btn clicked");
    await t.wait(2000);
    console.log("Diary is assigned to logged in user!!".green);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_Diary_Btn_Home, "Click on Home button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_Diaries_Img_DropDown, "Click on DropDown")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Diary_Creation.AssureClaimsApp_Diaries_Chk_ActiveDiaries, 'Check', "Checked Active Diaries Check Box")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Diary_Creation.AssureClaimsApp_Diaries_Chk_ShowNotes, 'Check', "Checked Show Notes Check Box")
    await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName, strTaskName, "strTaskName TextBox")
    await t.pressKey('tab');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaims_SystemUsers_Btn_FilterSearchTaskName1, "Click on Search Button")
    await t.wait(1000);
    const ColName1 = ["Work Activity"]
    const ColVal1 = ["ABC"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("ABC", 'Diary Grid View', ColName1, ColVal1)
    const ColHead = ["Assigned User", "Assigning User"];
    const ColVal = [data.Username.toLowerCase(), data.Username.toLowerCase()];
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility('ABC', 'Diary Grid View', ColHead, ColVal)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Image reload");

    //=================================================================Steps for Peek Diary ends here =======================================================================

    
  });
// 1. delete created user
  test('AssureClaims_Security_UserDeletion_Test_03', async t => {
    //==============================================================Login Into Application with User started==================================================================

    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    //==============================================================Login Into Application with User ended===================================================================

    console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
    //==============================================================Deletion of User started=================================================================================
    await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
    //==============================================================Deletion of User ended===================================================================================
    await t.wait(3000)
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    // ===============================================================Logout from Application =================================================================================

  });
  // ====================================================================User deletion ends here ==============================================================================
});
