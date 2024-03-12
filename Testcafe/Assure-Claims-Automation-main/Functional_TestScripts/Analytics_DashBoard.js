import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_Analytics_DashBoard from '../Functional_POM/POM_Analytics_DashBoard';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
const Verify_Utility = new Verification_Utility();
const In_Utility = new Input_Utility();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const POM_Analytics_DashBoards = new POM_Analytics_DashBoard();
const DataIUT = require('../DataFiles/DataIUT.json');


//***********************************************************************************************************************************************************************************************************
//JIRA ID OF STORY : RMA-109526
//Description : Setting the value of Dashboard in config keysas true
//AUTHOR : Vikrant Agarwal
//DEPENDANCY : No
//PRE-REQUISITE : No
//Preferred Server: Any SERVER LIKE :- IUT OR STAGING or Regression (DataAutoRegDSN_1)
//****************************************************************************************************************************************************************//


DataIUT.forEach(data => {
    const ConfigManagerLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility1 Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(10000)
        console.log("Login Into Configuration Manager Application!!".green)
    }, { preserveUrl: true }
    );

    DataIUT.forEach(data => {

        const LoggedInUser = Role(data.URL, async t => {
await t.maximizeWindow()
          console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
          await Function_Utility.AssureClaims_LoginIntoApplication_Utility1(data.Username, data.Password, data.DSN, 'Claims')
          await t.wait(5000)
          console.log("Login Into Application!!".green)
        }, { preserveUrl: true }
  );

/* Steps performed by AssureClaims_Analytics_dashbaord_config_settings code :
        1. Login Into Application with User
        2. Go to config manager -> Config Settings
        3. Search for insight keys in Section name & Insight dashboard in Key Name
        4. Click on edit button & set the value to true in key details & if the value is already true then dont change it.
        5. Search for Insight keys in section Name & DashboardURL in key name
        6. Click on edit button & set the dashboard URL which is define in data file & clcik on save button.
    */
    
     fixture`Analytics_DashBoard`.beforeEach(async t => {
     });
test('AnalyticsDashBoard', async t => {
    await t.setNativeDialogHandler(() =>true).useRole(ConfigManagerLogin)
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSetting_Clicking_On_Screen,"Clicking On Config settings")
    await t.wait(10000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_Analytics_DashBoardIFrame)
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(POM_Analytics_DashBoards.AssureClaims_Grid_filter_Txt_SectionName,"InsightKeys","Inputing the value in the filter Section Name")
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(POM_Analytics_DashBoards.AssureClaims_Grid_filter_Txt_KeyName,"InsightDashboard","Inputing the value in the filter Key Name")
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSetting_Btn_Edit,"Clicking on Edit button")
    await t.wait(5000);

    var boolearn_value  = await Verify_Utility.AssureClaims_AttributeFetch_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSettings_Txt_KeyDeatils)
    console.log(boolearn_value)
    await t.wait(5000);


     if (boolearn_value === "true") {
         console.log("Key details is already true");
         await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSettings_KeyDetail_Btn_Cancel,"Clicking on Cancel button")
    await t.wait(5000);
    
    }
else{
    await In_Utility.AssureClaims_SetValue_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSettings_Txt_KeyDeatils,"true","Setting the value true in key details")
    await t. wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSettings_KeyDetail_Btn_Save,"Clicking on save button")
    await t.wait(5000);
}

await In_Utility.AssureClaims_SetValue_Utility(POM_Analytics_DashBoards.AssureClaims_Grid_filter_Txt_SectionName,"InsightKeys","Inputing the value in the filter Section Name")
await t.wait(5000);
await In_Utility.AssureClaims_SetValue_Utility(POM_Analytics_DashBoards.AssureClaims_Grid_filter_Txt_KeyName,"DashboardURL","Inputing the value in the filter Key Name")
await t.wait(5000);
await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSetting_Btn_Edit,"Clicking on Edit button")
await t.wait(5000);
await In_Utility.AssureClaims_SetValue_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSettings_Txt_KeyDeatils,data.SysenDashboardURL,"Inputing the relevant dashboard URL")
await t. wait(5000);
await Nav_Utility.AssureClaims_ElementClick_Utility(POM_Analytics_DashBoards.AssureClaims_ConfigSettings_KeyDetail_Btn_Save,"Clicking on save button")
await t.wait(5000);
    
 })

    });
});