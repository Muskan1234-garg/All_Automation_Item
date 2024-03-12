import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility'
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_AdminTracking from '../Functional_POM/POM_AdminTracking';

const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');
const Function_Utility = new Functionality_Utility();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Verify_Utility = new Verification_Utility();
const SMS_POM = new POM_SMS();
const Home_POM = new POM_Home();
const AdminTrack_POM = new POM_AdminTracking();

const faker = require('faker')

const strTableName = faker.name.firstName();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-102144
//Description      : Automating settings for Admin tracking.
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_3
// *******************************************************************************************************************************


DataIUT.forEach(data => {

    const SecurityLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ConfigManagerLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Configuration Manager Application!!".green)
    }, { preserveUrl: true }
    );

    const MaintenanceLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application-->Maintenance!!".green)
    }, { preserveUrl: true }
    );

    fixture`AdminTracking1_Settings`.beforeEach(async t => {

    });

    /* Steps performed by AssureClaims_TableCreation_Test_01 :
        1. Login Into Application with User
        2. Go to config manager -> Administrative Tracking
        3. Click on add table
        4. Verify user is able provide details on mandatory fields and checked 'soft delete' checkbox then save.
        5. Verify that record has been created successfully.
        6. End
    */
    test('AssureClaims_TableCreation_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        await t.wait(4000)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Administrative Tracking SetUp in Configuration manager started================================================
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Administrative Tracking");
        await t.wait(8000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AdminTrackingIframe);
        //====================================================Administrative Tracking SetUp in Configuration manager ended================================================
        //====================================================Table AdditionAdministrative Tracking started================================================
        await t.wait(8000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Btn_AddTable, "add table")
        await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Txt_UserTableName, strTableName, "enter username")
        await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Txt_SystemTableName, strTableName, "enter system table name")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Chk_AllowSoftDelete, "Check", "Allow Soft Delete")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Btn_Save, "save button")
        await t.wait(2000)
        //====================================================Table AdditionAdministrative Tracking ended================================================
        // =======================================Verification for presence of created table started ==========================================================
        await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        await Verify_Utility.AssureClaims_ElementExist_Utility(await AdminTrack_POM.AssureClaims_AdminTracking_Lnk_TableName(strTableName), `Table with name ${strTableName} on Admin tracking Page`);
        // =======================================Verification for presence of created table ended ==========================================================


    });

    /* Steps performed by AssureClaims_MaintenanceSetting_Test_02 :
            1. Login Into Application with User
            2. Go to maintenance zone -> Admin Tracking 
            3. Verify that after creating table and without giving permission to the table, the same should not open on Admin
            4. End
            */
    test('AssureClaims_MaintenanceVerification_Test_02', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Navigation to maintenance zone -> Admin Tracking  started================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Admin Tracking List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_AdminTrackingListIframe);
        //====================================================Navigation to maintenance zone -> Admin Tracking  ended================================================
        // =======================================Negative Verification for presence of created table started ==========================================================
        
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Selector('td').withExactText("strTableName"), "Row corresponding to Created Table");
        // =======================================Negative Verification for presence of created table ended ==========================================================
        

    });

/* Steps performed by AssureClaims_SecuritySettingAndMaintenanceVerification_Test_03 :
            1. Login Into Application with User
            2. Navigation to SMS and give permission to all the SMS settings of the created table. 
            3. Verification of the name of table in Admin tracking List in Maintenance zone .
            4. End
            */


    test('AssureClaims_SecuritySettingAndMaintenanceVerification_Test_03', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await t.setNativeDialogHandler(() => true).useRole(SecurityLogin);
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Navigation to SMS and give permission to all the SMS settings of the created table started================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Icon For Datasources On SMS Screen");
        var DSNExpand = Selector('[id="' + data.DSN + '"]').parent('li').find('[class="tree-branch-head c-iCollapsed"]');
        await Nav_Utility.AssureClaims_ElementClick_Utility(DSNExpand, "Expand Icon For DSN On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_ModuleSecGroups, "Expand Icon for Module Security Group On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Label_Options.withText(data.ModuleName_Administrator), "Module Security Group on SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("RISKMASTER"), "RISKMASTER Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(await SMS_POM.AssureClaims_SMS_GenericExpandIcon("Administrative Tracking"), "Administrative Tracking Expand Option On SMS Screen");
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(await SMS_POM.AssureClaims_SMS_Chk_CustomModuleCheckbox(strTableName), "Check", "Created table checked On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_GrantPermission, "Grant Permission On SMS Screen");
        //====================================================Navigation to SMS and give permission to all the SMS settings of the created table ended================================================
        await t.wait(2000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Payment Parameter SetUp in Configuration manager started================================================
        //====================================================Verification of the name of table in Admin tracking List in Maintenance zone started================================================
        
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Admin Tracking List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_AdminTrackingListIframe);
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(AdminTrack_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(Selector('td').withExactText(strTableName), "Row corresponding to Created Table")
        //====================================================Verification of the name of table in Admin tracking List in Maintenance zone ended================================================
        //====================================================Verification of Admin tracking having no input field in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('td').withExactText(strTableName), "Table Name");
        await t.wait(2000)
        await t.switchToMainWindow()
        await t.wait(6000);
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame);
        var strErrorMessage = `Selected Admin tracking table does not have any input field.`;
        console.log(strErrorMessage);
        await t.wait(3000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            strErrorMessage,
            true,
            "Verification Done"
            );
            await t.wait(2000);
            //====================================================Verification of Admin tracking having no input field in Maintenance zone ended================================================
            await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
           


    });

});




