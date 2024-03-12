import { Selector, Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PowerView_New from '../Functional_POM/POM_PowerView';
import POM_Login from '../Functional_POM/POM_Login';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';

const Home_POM = new POM_Home();
const DataIUT = require('../DataFiles/DataIUT.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const PowerView_POM = new POM_PowerView_New();
const POM_LoginPOM = new POM_Login();
const Generic_Claims = new POM_Generic_Claims();
const fs = require('fs');

var faker = require('faker');
var StrReporterPowerView_Name = "Auto " + faker.name.lastName();
var StrReporterPowerView_Description = StrReporterPowerView_Name + "Description";
var StrClaimNumber;
var d;

//**********************************************************************************************
//JIRA ID OF STORY : RMA-109530
//Description      : Verification Of Claims Dashboard button When User Is In Default View And When User Is Added In Power view
//AUTHOR 		       : 0.0 Parul Sharma 03/10/2024
//DEPENDANCY 	     : Need to Run Analytics_Dashboard Test case before running this.
//PRE-REQUISITES   : None
//Preferred Server : IUT OR STAGING or Regression (DataAutoRegDSN_3)
//Revision         : 
// **********************************************************************************************

DataIUT.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );
  const LoggedInUser1 = Role(data.URL, async t => {
    await t.maximizeWindow()
    await t.wait(4000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    await t.wait(2000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );
  const LoggedInUser2 = Role(data.URL, async t => {
    await t.maximizeWindow()
    await Function_Utility.AssureClaims_LoginIntoApplication_PowerView_Utility(data.Username, data.Password, data.DSN, 'Claims', StrReporterPowerView_Name)
    await t.wait(2000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`Analytics_DashBoard_View_Verification_Scenario`.beforeEach(async t => {

  });

  /* Steps performed by Analytics_DashBoard_View_Verification_Scenario_01 code :
          1. Login Into Application with User In Default View
          2. Select DSN 
          3. Create GC Claim
          4. Verify Analytics Claims Dashboard Button Is Not Present On Claims Screen
              */
  test('Analytics_DashBoard_View_Verification_Scenario_01', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //======Claim Creation Started Here=====================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //Claim Creation  completed      
    // Analytics Claims Dashboard Button Does Not Exists On Claims Screen When User Is In Default View Started Here====================================================================================       
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_AnalyticsClaimsDashboard, "Claims Dashboard Button does not exist On Claims Screen")
    await t.wait(2000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_LogOut_LogoutBtnOptions, "Logout Options")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_LogOut_LogoutBtn, "Logout Button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_LogOut_LogoutOkBtn, "Ok Button On Logout PopUp")
    // Analytics Claims Dashboard Button Does Not Exists On Claims Screen When User Is In Default View Completed Here====================================================================================       

  });

  /* Steps performed by Analytics_DashBoard_View_Verification_Scenario_02 code :
        1. Login Into Application with User
        2. Open Power View Editor
        3. Create New Power View
        4. Edit Power View and Select General Claim Screen and Select Current Logged In User In user List
        5. Save it and Open General Claim Screen
        6. Click on Dashboard Configuration Button
        7. Enable Visible Checkbox,Check Adjuster Filter Checkbox,Select Adjuster Filter,Verify Dashboard Url is same as Config Setting URL
        8. Save Configuration and Power View
        9. Logout From Application
            */
  test('Analytics_DashBoard_View_Verification_Scenario_02', async t => {
    await t.wait(15000)
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser1);

    /*==============Configuration Manager Setting for Power View Creation And Edit Of Power View Started Here ==============*/

    await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Powerview Editor");
    await t.wait(5000);
    await t.switchToIframe(Selector("#" + Verification_Msg.AssureClaims_PowerviewIframe + ""))
    await t.wait(5000)
    await Function_Utility.AssureClaims_Analytics_PowerViewCreation(StrReporterPowerView_Name, StrReporterPowerView_Description, "Add", "Na", "Na");
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Search_Filter, "Search Filter Field Is Clicked")
    await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Search_Filter, StrReporterPowerView_Name, "ReporterPowerView_Name Entered in Search Filter Field")
    const ColName = ["View Name", "View Description"]
    const ColVal = [StrReporterPowerView_Name, StrReporterPowerView_Description]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(StrReporterPowerView_Name, "Power Views Setup", ColName, ColVal);
    await t.wait(4000);
    const Power_View_Name = await Selector('[row-render-index="rowRenderIndex"]>div:nth-child(2)>div>a');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Power_View_Name, "Search Filter Field Is Clicked")
    await t.wait(4000);
    await Function_Utility.AssureClaims_Analytics_PowerViewCreation(StrReporterPowerView_Name, StrReporterPowerView_Description, "Edit", "Na", "General Claims");
    await t.wait(14000);
    await t.wait(30000);
    await Function_Utility.AssureClaims_Analytics_PowerViewCreation(StrReporterPowerView_Name, StrReporterPowerView_Description, "AddUser", data.Username, "Na");
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Available_Claims_Checkbox.withText('Claims'), "Claim Form Checkbox Is Clicked")
    const pSiblingsDiv = PowerView_POM.AssureClaimsApp_Lnk_Power_View_GeneralClaims_Form.nextSibling('span');
    await Nav_Utility.AssureClaims_ElementClick_Utility(pSiblingsDiv, "Power view Name Is Clicked")
    await t.wait(4000);
    await t.expect(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Page_Form_Label.innerText).contains(StrReporterPowerView_Name);
    console.log("-- ReporterPowerView_Name Of Power View Screen --".yellow + 'is matched with '.green + "-- ReporterPowerView_Name Of Power View Screen --".yellow + 'Hence verification successful'.green);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Page_Form_Label_Insight_button, "Claim Dashboard Configuration Button")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaims_Btn_Visible, "Turning on visible Button")
    await t.wait(2000);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(PowerView_POM.AssureClaims_DashBoard_URL_Txt_box, data.SysenDashboardURL, "Url is verified")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(PowerView_POM.AssureClaims_Chk_Box_Assure_Insights_URL, 'Check', "Selecting the checkbox Assure insights Url")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(PowerView_POM.AssureClaims_Chk_Box_Filter_Configuration_Adjuster, 'Check', "Selecting the Checkbox Adjuster filter Configuration")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaims_Btn_Ok, "Clicking on OK Button")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Edit_View_Save_Button, "Clicking on Save Button")
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaims_Btn_Logout, "Clicking On Logout Button")
    /*==============Configuration Manager Setting for Power View Creation And Edit Of Power View Completed Here ==============*/
  });
  /* Steps performed by Analytics_DashBoard_View_Verification_Scenario_03 code :
          1. Login Into Application with User
          2. Select DSN and Power View
          3. Search For Claim
          4. Open Claim
          8. Verify Analytics Claims Dashboard Button Is Present On Claims Screen
              */
  test('Analytics_DashBoard_View_Verification_Scenario_03', async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser2);
    // Analytics Claims Dashboard Button Exists On Claims Screen When User Is In Power View Started Here====================================================================================       
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_AnalyticsClaimsDashboard, "Claims Dashboard Button Is Clicked");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Analytics_Frame_AnalyticsDashboardLabel.withText("Claims Dashboard"), "Analytics Dashboard Frame Is Clicked");
    await t.wait(2000)
    // Analytics Claims Dashboard Button Exists On Claims Screen When User Is In Power View Completed Here====================================================================================       
  });

});
