import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import { throwError } from 'fp-ts/lib/Option';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility'
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_AdminTracking from '../Functional_POM/POM_AdminTracking';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_Search from '../Functional_POM/POM_Search'
import POM_DiaryList from '../Functional_POM/POM_DiaryList';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';



const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');
const Function_Utility = new Functionality_Utility();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Verify_Utility = new Verification_Utility();
const SMS_POM = new POM_SMS();
const AdminTracking_POM = new POM_AdminTracking();
const Home_POM = new POM_Home();
const Generic_Claims = new POM_Generic_Claims();
const Search_POM = new POM_Search();
const Diary_Creation = new POM_DiaryList();
const ConfigMgr_POM = new POM_Config_Manager();

const faker = require('faker')

let strTableName = faker.name.firstName();
var StrClaimNumber;
var tdTagSelector;


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-102144, RMA-102154, RMA-102177, RMA-102178, RMA-102179, RMA-107094[Latest 23.4]
/* Description      : 1) Automating settings for Admin tracking.
                      2) Addition and Editing of 24 Fields.
                      3) Creation and Verification of Admin tracking Record.
                      4) Verification for Group Association Scenario in Admin Tracking.
                      5) Deletion of the Created Table and Negative verification of Deleted Table.
                    */

//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_3
// *******************************************************************************************************************************


DataIUT.forEach(data => {

    const LoggedInUser = Role(data.URL, async t => {
        await t.wait(3000)
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

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





    fixture`Smoke_AdminTracking`.beforeEach(async t => {

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
        //******************If Card View -> Proceed, Else Change to Card View and Proceed starts======================================================================= */
        // if add button in card view exists
        if (await AdminTracking_POM.AssureClaims_AdminTracking_Btn_AddTable.exists) {
            // click on add button
            await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_AddTable, "add table")
        }
        // if add button in List view exists
        else {
            // click on card view button
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CardView), "add table")
            await t.wait(5000)
            // click on add button
            await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_AddTable, "add table")
        }
        //******************If Card View -> Proceed, Else Change to Card View and Proceed ends======================================================================= */
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_UserTableName, strTableName, "enter username")
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_SystemTableName, strTableName, "enter system table name")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_AllowSoftDelete, "Check", "Allow Soft Delete")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_Save, "save button")
        await t.wait(2000)
        //====================================================Table AdditionAdministrative Tracking ended================================================
        // =======================================Verification for presence of created table started ==========================================================
        //******************If Card View -> Proceed, Else Change to Card View and Proceed starts======================================================================= */
        // If searchbar exists
        if (await AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch.exists) {
            // search
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        else {
            // click on card view button
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CardView), "add table")
            await t.wait(5000)
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        //******************If Card View -> Proceed, Else Change to Card View and Proceed ends======================================================================= */
        await Verify_Utility.AssureClaims_ElementExist_Utility(await AdminTracking_POM.AssureClaims_AdminTracking_Lnk_TableName(strTableName), `Table with name ${strTableName} on Admin tracking Page`);
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
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        tdTagSelector = await Home_POM.AssureClaims_Generic_CustomTagSelector("td");
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(tdTagSelector.withExactText("strTableName"), "Row corresponding to Created Table");
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
        await t.wait(10000)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Payment Parameter SetUp in Configuration manager started================================================
        //====================================================Verification of the name of table in Admin tracking List in Maintenance zone started================================================

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Admin Tracking List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_AdminTrackingListIframe);
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(tdTagSelector.withExactText(strTableName), "Row corresponding to Created Table")
        //====================================================Verification of the name of table in Admin tracking List in Maintenance zone ended================================================
        //====================================================Verification of Admin tracking having no input field in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(tdTagSelector.withExactText(strTableName), "Table Name");
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

    /* Steps performed by AssureClaims_AdminTrackingAddEditFields_Test_04 :
                1. Login Into Configuration Manager Zone with User
                2. Addition of 24 Fields for the created Table
                3. Editing of 24 Fields for the created Table and verification of edited Table.
                4. End
                */
    test('AssureClaims_AdminTrackingAddEditFields_Test_04', async t => {
        //==============================================================Login Into Application with User started==================================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Administrative Tracking");
        await t.wait(8000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AdminTrackingIframe);
        await t.wait(2000);

        //******************If Card View -> Proceed, Else Change to Card View and Proceed starts======================================================================= */
        // If searchbar exists
        if (await AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch.exists) {
            // search
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        else {
            // click on card view button
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CardView), "add table")
            await t.wait(5000)
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        //******************If Card View -> Proceed, Else Change to Card View and Proceed ends======================================================================= */
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_AddFields, "Add Fields button")



        //====================================================Addition of 24 Fields for the created Table started================================================

        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Admin Tracking Lookup", "UsrAdminTrackingLookup", "NA", "SysAdminTrackingLookup", "UnCheck", "NA", "NA", "Bond Abstract")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Checkbox", "UsrCheckbox", "NA", "SysCheckbox", "NA", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Claim Number Lookup", "UsrClaimNumberLookup", "NA", "SysClaimNumberLookup", "UnCheck", "Check", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Code", "UsrCode", "NA", "SysCode", "UnCheck", "UnCheck", "UnCheck", "360 Globalnet Mapping Type")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Currency", "UsrCurrency", "NA", "SysCurrency", "Check", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Date", "UsrDate", "NA", "SysDate", "UnCheck", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Email", "UsrEmail", "NA", "SysEmail", "UnCheck", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Entity", "UsrEntity", "NA", "SysEntity", "UnCheck", "UnCheck", "NA", "Additional Insured")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Event Number Lookup", "UsrEventNumberLookup", "NA", "SysEventNumberLookup", "UnCheck", "UnCheck", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Free Text", "UsrFreeText", "NA", "SysFreeText", "UnCheck", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Grid", "UsrGrid", "NA", "SysGrid", "UnCheck", "UnCheck", "NA", "Coulmn1")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Supplemental History Grid", "UsrSupplementalHistoryGrid", "NA", "SysSupplementalHistoryGrid", "NA", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "HTML Text", "UsrHTMLText", "NA", "SysHTMLText", "UnCheck", "UnCheck", "UnCheck", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Hyperlink", "UsrHyperlink", "NA", "SysHyperlink", "UnCheck", "UnCheck", "NA", "psaxena24")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Multi Text/Codes", "UsrMultiTextCodes", "NA", "SysMultiTextCodes", "UnCheck", "UnCheck", "UnCheck", "ADJUST_DATED_TEXT")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Multi-Code", "UsrMultiCode", "NA", "SysMultiCode", "UnCheck", "UnCheck", "UnCheck", "Access Type Code")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Multi-Entity", "UsrMultiEntity", "NA", "SysMultiEntity", "UnCheck", "UnCheck", "NA", "Adjusters")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Multi-State", "UsrMultiState", "NA", "SysMultiState", "UnCheck", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Number", "UsrNumber", "NA", "SysNumber", "UnCheck", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "State", "UsrState", "NA", "SysState", "UCheck", "UCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Time", "UsrTime", "NA", "SysTime", "UnCheck", "UnCheck", "NA", "NA")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "String", "UsrString", "NA", "SysString", "UnCheck", "UnCheck", "NA", "Free-Form")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "User Lookup", "UsrUserLookup", "NA", "SysUserLookup", "UnCheck", "UnCheck", "UnCheck", "Users")
        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add", "Vehicle Lookup", "UsrVehicleLookup", "NA", "SysVehicleLookup", "UnCheck", "UnCheck", "NA", "NA")
        // await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Add","Attachment (for Data Collection)","UsrAttachment","NA","SysAttachment","UnCheck","UnCheck","NA","NA")

        //====================================================Addition of 24 Fields for the created Table ended================================================
        //====================================================Editing of 24 Fields for the created Table started================================================

        var arr = ["EditUsrAdminTrackingLookup", "EditUsrCheckbox", "EditUsrClaimNumberLookup", "EditUsrCode", "EditUsrCurrency", "EditUsrDate", "EditUsrEmail", "EditUsrEntity", "EditEventNumberLookup", "EditUsrFreeText", "EditUsrGrid", "EditUsrSupplementalHistoryGrid", "EditUsrHTMLText", "EditUsrHyperlink", "EditUsrMultiTextCodes", "EditUsrMultiCode", "EditUsrMultiEntity", "EditUsrMultiState", "EditUsrNumber", "EditUsrState", "EditUsrTime", "EditUsrString", "EditUsrUserLookup", "EditUsrVehicleLookup", "EditAttachmentField"]

        await Function_Utility.AssureClaims_AddEditAdminTrackingField_Utility("Edit", "NA", "NA", arr, "NA", "NA", "NA", "NA", "NA")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_UpdateViews, "Update View Button")
        //====================================================Editing of 24 Fields for the created Table ended================================================
    });

    /* Steps performed by AssureClaims_AdminTrackingRecordCreation_Test_05 :
                    1. Login Into Claim zone> Create a new General claim
                    2. Login Into Maintenance zone> Admin Tracking Table
                    3. Opened the recently created table > Gave details in the fields and save (At least 6-8 fields) > 1 Record Created
                    4. Verification of value "1" in the 'Go To Record' textbox.
                    5. Testing of toolbar buttons
                        a. Open Dairy and create a Dairy
                        b. Open View Record Dairy and verify
                        c. Open Record Summary and verify
                        d. Click on lookup button and verify
                        e. Click on grid & verify added grid field name exist or not.
                    */

    test('AssureClaims_AdminTrackingRecordCreationAndVerification_Test_05', async t => {

        //=============================================================Login Into Claim Zone to create General Claim started=========================================================================

        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
        await t.wait(5000)


        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        //========================================================================Claim Creation Started Here======================================================================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
        //========================================================================Claim Creation Ended Here======================================================================
        //=============================================================Login Into Claim Zone to create General Claim ended=========================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        //====================================================Filling of Fields for the table in Admin tracking List in Maintenance zone started================================================

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Admin Tracking List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_AdminTrackingListIframe);
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(tdTagSelector.withExactText(strTableName), "Row corresponding to Created Table")

        await Nav_Utility.AssureClaims_ElementClick_Utility(tdTagSelector.withExactText(strTableName), "Table Name");
        await t.wait(5000)
        await t.switchToMainWindow()
        await t.wait(6000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame);

        //====================================================Checkbox Check for Admin Tracking Record Creation in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_UsrCheckbox, "Check", "EditUsrCheckbox")
        //====================================================Checkbox Check for Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Save for Admin Tracking Record Creation in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveRecord, "Save");
        //====================================================Save for Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Verification for not filling Mandatory Fields for  Admin Tracking Record Creation in Maintenance zone started================================================
        await t.wait(3000)
        var strErrorMessage = `Not all required fields contain the value. Please enter data in all mandatory fields.`;
        console.log(strErrorMessage);
        await t.wait(3000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            strErrorMessage,
            true,
            "Verification Done"
        );
        await t.wait(2000);
        //====================================================Verification for not filling Mandatory Fields for  Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Filling Currency Amount (Mandatory field) for Admin Tracking Record Creation in Maintenance zone started================================================
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_UsrCurrency, "10", "EditUsrCurrency")
        //====================================================Filling Currency Amount (Mandatory field) for Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Filling Date for Admin Tracking Record Creation in Maintenance zone started================================================

        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_UsrDate, d, "EditUsrDate")
        await t.wait(5000)
        //====================================================Filling Date for Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Filling Code Lookup for Admin Tracking Record Creation in Maintenance zone started================================================            
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_UsrcodeLookup, "EditUsrCode")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.Code_Contacts, "Description Search Textbox ");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon");
        const ele = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(data.Code_Contacts).with({ visibilityCheck: true })
        await t.expect(ele.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele, "Usr Code Lookup Option")
        //====================================================Filling Code Lookup for Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Filling Email for Admin Tracking Record Creation in Maintenance zone started================================================
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_UsrEmail, `${strTableName}@dxc.com`, "EditUsrEmail");
        //====================================================Filling Email for Admin Tracking Record Creation in Maintenance zone ended================================================

        //====================================================Filling ClaimNumber SearchBox for Admin Tracking Record Creation in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_UsrClaimNumberSearch, "Search Icon In Claim Number Searchbox");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, StrClaimNumber, "Claim Number")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(StrClaimNumber), "ClaimNumber link")
        console.log("Claim Selected");
        await t.wait(2000)
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame);
        //====================================================Filling ClaimNumber SearchBox for Admin Tracking Record Creation in Maintenance zone ended================================================

        //====================================================Save for Admin Tracking Record Creation in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveRecord, "Save");
        //====================================================Save for Admin Tracking Record Creation in Maintenance zone ended================================================

        //====================================================Verification for creation of 1 Admin Tracking Record started=================================================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_GoToRecord, "1", "Record Value");
        //====================================================Verification for creation of 1 Admin Tracking Record ended=================================================================================================================


        //====================================================Filling of Fields for the table in Admin tracking List in Maintenance zone ended================================================



        //=====================================================Verification of Toolbar Buttons in Admin Tracking Record Page in Maintenance zone started=============================================================

        //=====================================================Verification of Diary Button in Admin Tracking Record Page in Maintenance zone started=============================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_ToolBarButtonDiary, "Diary Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DairyIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaims_DiaryCreation_Txt_TaskName, `${strTableName} Diary`, "Claim Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveRecord, "Save");
        await t.wait(2000)
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame);

        //=====================================================Verification of Diary Button in Admin Tracking Record Page in Maintenance zone ended=============================================================




        //=====================================================Verification of View Record Diary Button in Admin Tracking Record Page in Maintenance zone started=============================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_ToolBarButtonViewRecordDiaries, "View Record Diary");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DairyIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName, `${strTableName} Diary`, "Diary Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_Diaries_Txt_TaskName.nextSibling(), "Search button");
        await Verify_Utility.AssureClaims_ElementExist_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lnk_SearchedDiaryName.withText(strTableName + " Diary"), "Searched Diary")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CloseViewRecordDiary, "close btn");

        //=====================================================Verification of View Record Diary Button in Admin Tracking Record Page in Maintenance zone ended=============================================================




        //=====================================================Verification of Record Summary Button in Admin Tracking Record Page in Maintenance zone started=============================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_ToolBarButtonRecordSummary, "Record Summary");
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Val_TableNameHeading.withText(strTableName), "Tablename")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CancelViewRecordSummary, "Cancel button");
        await t.wait(2000)

        //=====================================================Verification of Record Summary Button in Admin Tracking Record Page in Maintenance zone ended=============================================================




        //=====================================================Verification of Supplemental Grid Button in Admin Tracking Record Page in Maintenance zone started=============================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_ToolBarButtonSupplementalGrid, "Record Summary");
        let aTagSelector = await Home_POM.AssureClaims_Generic_CustomTagSelector("a");

        await Nav_Utility.AssureClaims_ElementClick_Utility(aTagSelector.withText("EditUsrGrid"), "Edit User Grid");
        await t.wait(2000)
        let spanTagSelector = await Home_POM.AssureClaims_Generic_CustomTagSelector("span");
        await Verify_Utility.AssureClaims_ElementExist_Utility(spanTagSelector.withText("Coulmn1"), "Created Column")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SupplementalGridDone, "Done button");
        await t.wait(2000)

        //=====================================================Verification of Supplemental Grid Button in Admin Tracking Record Page in Maintenance zone ended=============================================================




        //=====================================================Verification of Lookup Button in Admin Tracking Record Page in Maintenance zone started=============================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_ToolBarButtonLookup, "Lookup Button");
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_LookupSearchClaimNumber, StrClaimNumber, "Claim Number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lnk_SearchedClaimNumber.withText(StrClaimNumber), StrClaimNumber)
        await t.wait(2000)

        //=====================================================Verification of Lookup Button in Admin Tracking Record Page in Maintenance zone ended=============================================================

        //=====================================================Verification of Toolbar Buttons in Admin Tracking Record Page in Maintenance zone ended=============================================================



    });

    /* Steps performed by AssureClaims_AdminTrackingFieldCreationWithGroupAssociation_Test_06 :
            1. Login Into Configuration Manager Zone with User
            2. Creation of a Checkbox with Group Association
            3. End
            */
    test('AssureClaims_AdminTrackingFieldCreationWithGroupAssociation_Test_06', async t => {
        //==============================================================Login Into Application with User started==================================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        //==============================================================Login Into Application with User ended==================================================================
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Administrative Tracking");
        await t.wait(8000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AdminTrackingIframe);
        await t.wait(2000);
        //******************If Card View -> Proceed, Else Change to Card View and Proceed starts======================================================================= */
        if (await AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch.exists) {
            // search
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        else {
            // click on card view button
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CardView), "add table")
            await t.wait(5000)
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        //******************If Card View -> Proceed, Else Change to Card View and Proceed ends======================================================================= */
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_AddFields, "Add Fields button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_Add, "Add button")
        await t.wait(2000)
        //==============================================================Creation of Checkbox with Group Association started==================================================================
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_FieldType, "Checkbox", "select field name")
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_UserPrompt, "GroupAssociatedCheckbox", "User prompt")
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_SystemFieldName, "GroupAssociatedCheckbox", "System Field Name")
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SourceField, "EditUsrCode", "select Source Field")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_CodeOrEntities.parent('div').find('div').withAttribute("role", "button"), "Add button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Lnk_GroupAssociationOption.withText("Contacts"), `${data.Code_Contacts}`)
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveBtn, "Save button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_UpdateViews, "Update View Button")
        await t.wait(5000)
        //==============================================================Creation of Checkbox with Group Association ended==================================================================

    });


    /* Steps performed by AssureClaims_AdminTrackingRecordCreationWithGroupAssociation_Test_07 :
    1. Login Into Maintenance Zone with User
    2. Navigation to the created Table
    3. Negative and Positive Verification of Group Association checkbox depending on Selected Code 
    4. Creation of record and verification of '2' in Go To Records
    5. End
    */
    test('AssureClaims_AdminTrackingRecordCreationWithGroupAssociation_Test_07', async t => {
        //==============================================================Login Into Application with User started==================================================================
        await t.navigateTo(data.URL)
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        //==============================================================Login Into Application with User ended==================================================================
        //==============================================================Navigation to the created Table started==================================================================
        await t.wait(25000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Admin Tracking List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_AdminTrackingListIframe);
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        tdTagSelector = await Home_POM.AssureClaims_Generic_CustomTagSelector("td");
        await Verify_Utility.AssureClaims_ElementExist_Utility(tdTagSelector.withExactText(strTableName), "Row corresponding to Created Table")

        await Nav_Utility.AssureClaims_ElementClick_Utility(tdTagSelector.withExactText(strTableName), "Table Name");
        await t.wait(5000)
        await t.switchToMainWindow()
        //==============================================================Navigation to the created Table ended==================================================================

        await t.wait(6000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AdminTrackingFrame);
        //====================================================Verification for not filling Mandatory Fields for  Admin Tracking Record Creation in Maintenance zone ended================================================
        //====================================================Filling Currency Amount (Mandatory field) for Admin Tracking Record Creation in Maintenance zone started================================================
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_UsrCurrency, "10", "EditUsrCurrency")
        //====================================================Filling Currency Amount (Mandatory field) for Admin Tracking Record Creation in Maintenance zone ended================================================



        //====================================================Filling Code Lookup for Admin Tracking Record Creation in Maintenance zone started================================================            
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_UsrcodeLookup, "EditUsrCode")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.Code_Steps, "Description Search Textbox ");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon");
        const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(data.Code_Steps).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Usr Code Lookup Option")
        await t.wait(5000)
        //====================================================Filling Code Lookup for Admin Tracking Record Creation in Maintenance zone ended================================================



        //====================================================Verification for Abscence of Goup Association checkbox in Admin Tracking Record Creation in Maintenance zone started================================================

        let strIsVisible = await AdminTracking_POM.AssureClaims_AdminTracking_Chk_GroupAssociatedCheckBox.parent('div').getAttribute('aria-hidden')
        let bIsVisible = JSON.parse(strIsVisible)
        if (bIsVisible) {
            console.log("Group Association checkbox is Not Present");
        } else {
            throw new Error("Group Association checkbox is Present");
        }
        //====================================================Verification for Abscence of Goup Association checkbox in Admin Tracking Record Creation in Maintenance zone ended================================================




        //====================================================Filling Code Lookup for Admin Tracking Record Creation in Maintenance zone started================================================            
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_UsrcodeLookup, "EditUsrCode")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.Code_Contacts, "Description Search Textbox ");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon");
        const ele = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(data.Code_Contacts).with({ visibilityCheck: true })
        await t.expect(ele.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele, "Usr Code Lookup Option")
        await t.wait(5000)
        //====================================================Filling Code Lookup for Admin Tracking Record Creation in Maintenance zone ended================================================




        //====================================================Verification for Presence of Goup Association checkbox in Admin Tracking Record Creation in Maintenance zone started================================================

        strIsVisible = await AdminTracking_POM.AssureClaims_AdminTracking_Chk_GroupAssociatedCheckBox.parent('div').getAttribute('aria-hidden')
        bIsVisible = JSON.parse(strIsVisible)
        if (bIsVisible) {
            throw new Error("Group Association checkbox is Not Present");
        } else {
            console.log("Group Association checkbox is Present");
        }

        //====================================================Checkbox Check for Admin Tracking Record Creation in Maintenance zone started================================================
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Chk_GroupAssociatedCheckBox, "Check", "Group Association Checkbox")
        //====================================================Checkbox Check for Admin Tracking Record Creation in Maintenance zone ended================================================


        //====================================================Verification for Presence of Goup Association checkbox in Admin Tracking Record Creation in Maintenance zone ended================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_SaveRecord, "Save");
        //====================================================Save for Admin Tracking Record Creation in Maintenance zone ended================================================

        //====================================================Verification for creation of 2 Admin Tracking Record started=================================================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_GoToRecord, "2", "Record Value");
        //====================================================Verification for creation of 2 Admin Tracking Record ended=================================================================================================================
    });

    /* Steps performed by AssureClaims_AdminTrackingDeleteTable_Test_08 :
               1. Login Into Application with User
               2. Go to Configuration Manager Zone -> Administrative Tracking
               3. Search the created Table and Delete it.
               4. End
               */

    test('AssureClaims_AdminTrackingDeleteTable_Test_08', async t => {
        //==============================================================Login Into Application with User started==================================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        //==============================================================Login Into Application with User ended==================================================================
        //==============================================================Navigation to Configuration Manager Zone -> Administrative Tracking ended -> Search and Delete Table started==================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Administrative Tracking");
        await t.wait(8000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AdminTrackingIframe);
        await t.wait(2000);

        //******************If Card View -> Proceed, Else Change to Card View and Proceed starts======================================================================= */
        // If searchbar exists
        if (await AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch.exists) {
            // search
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        else {
            // click on card view button
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector(AdminTracking_POM.AssureClaims_AdminTracking_Btn_CardView), "add table")
            await t.wait(5000)
            await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "enter search")
        }
        //******************If Card View -> Proceed, Else Change to Card View and Proceed ends======================================================================= */
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_DeleteTable, "Delete Table")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Btn_DeleteTableOKButton, "Delete Table Confirm")
        await t.wait(2000)
        // =======================================Verification for absence of created table started ==========================================================
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListSearch, strTableName, "Search Tables")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(await AdminTracking_POM.AssureClaims_AdminTracking_Lnk_TableName(strTableName), `Table with name ${strTableName} on Admin tracking Page`);
        // =======================================Verification for absence of created table ended ==========================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        //==============================================================Navigation to Configuration Manager Zone -> Administrative Tracking ended -> Search and Delete Table ended==================================================================

    });

    /* Steps performed by AssureClaims_MaintenanceVerification_Test_09 :
            1. Login Into Application with User
            2. Go to maintenance zone -> Admin Tracking 
            3. Negative Verification of Deleted Table in admin Tracking List
            4. End
            */
    test('AssureClaims_NegativeVerificationOfDeletedTable_Test_09', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.navigateTo(data.URL)
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        //==============================================================Login Into Application with User ended==================================================================
        //====================================================Navigation to maintenance zone -> Admin Tracking  started================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Admin Tracking List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_AdminTrackingListIframe);
        //====================================================Navigation to maintenance zone -> Admin Tracking  ended================================================
        // =======================================Negative Verification for presence of created table started ==========================================================

        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(AdminTracking_POM.AssureClaims_AdminTracking_Txt_ListViewSearch, strTableName, "enter search")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(tdTagSelector.withExactText("strTableName"), "Row corresponding to Created Table");
        // =======================================Negative Verification for presence of created table ended ==========================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        await t.wait(10000)

    });


});




