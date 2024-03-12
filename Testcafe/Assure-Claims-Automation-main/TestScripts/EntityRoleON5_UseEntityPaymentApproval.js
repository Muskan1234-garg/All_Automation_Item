import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Entity from '../Functional_POM/POM_Entity'
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_ClearCheack from '../Functional_POM/POM_ClearCheack';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';

const DataAutoreg_ERON = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verify_Utility = new Verification_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const ConfigMgr_POM = new POM_Config_Manager();
const ClearCheack_POM = new POM_ClearCheack();
const Entity_POM = new POM_Entity();
const Home_POM = new POM_Home();

var faker = require('faker');

var strClaimNumber;
var strLastName = "Auto_" + faker.name.lastName();

/**********************************************************************************************************************************************
JIRA ID OF STORY : RMA-99703
Description      :      1. Turn ON Use Entity Payment From configuration (Go to Configuration Manager> Payment Parameter > Payment > Supervisory Approval)
                        2. When 'Entity Payment Approval Status' is Pending Approval and gets approved
                        3. When 'Entity Payment Approval Status' is Approved and gets Rejected
                        4. Turn OFF Use Entity Payment From configuration (Go to Configuration Manager> Payment Parameter > Payment > Supervisory Approval)
AUTHOR           : Yashaswi Mendhekar
DEPENDANCY       : None
PRE-REQUISITE    : Entity role should be ON for that particular DSN
Preffered Env.   : 194 Autoreg env. "RM231REG_ERON" DSN
//**********************************************************************************************************************************************/

DataAutoreg_ERON.forEach(data => {
    const MaintenanceZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );
    const ConfigurationManager = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ClaimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`EntityRoleON5_UseEntityPaymentApproval`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationManager);
    });
    /*
        1. Turn ON use Entity Setting from Congiguration manager (Go to Configuration Manager> Payment Parameter > Payment > Supervisory Approval)
        2. Create Entity
        3. Verify 2 Feilds present or not i.e Entity Payment Approval Status and Payment Approval/Rejected Reason.
    */
    // ============================================================================================Test 1 starts from here======================================================================================
    test('AssureClaims_EntitiesCreation_StatusAsPendindApproval_Test_01', async t => {

        //====================================================Payment Parameter SetUp in Configuration manager started ============================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "Check", "Use Entity Approval ON")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration manager ended ===============================================================

        // ================================================ Zone Switched to Maintenance starts here ================================================================================
        await t.wait(5000)
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.wait(5000)
        // =================================================Zone Switched to Maintenance ends here==================================================================================

        //====================================================Entity Creation, started here=========================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strLastName, "NA", "NA");
        console.log(strLastName)
        //==================================================Entity Creation, ended here============================================================================================
        await t.scrollIntoView(Entity_POM.AsssureClaims_Manitenance_Tab_GenericAccordian.nth(0))
        await t.wait(5000);
        var StrEntityPaymentApprovalStatus = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_Txt_Entity_Payment_Approval_Status, "value");
        console.log(" Fetched Amount is : ".green + StrEntityPaymentApprovalStatus);
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_Txt_Entity_Payment_Approval_Status, StrEntityPaymentApprovalStatus, "Verify Entity Payment Approval Status In Maintenance Entity Screen");
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_Entity_Txt_ApprovalStatus, "Entity Payment Approval Status Available.");
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_Manitenance_Txt_PaymentApprovalRejectedReason, "Payment Approval/Rejected Reason Available.");
    });
    // ============================================================================================Test 1 ends here======================================================================================

    /*
       1.  Create GC claim
       2.  Create Reserve
       3.  Create Payment with created entity name in Test 1
       4.  Verify Payment on hold msg
       5.  Go to Maintenance Zone and search for Created entity in test 1 and change Entity payment Approval status from Pending Approval to Approved
       6.  Create a Payment with same entity name on Created GC and verify save successfully msg. 
    */
    //     ==========================================================================Test 2 Starts here ====================================================================================
    test('AssureClaims_EntitiesCreation_StatusAsApproved_Test_02', async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        //====================================================Claim Creation Started Here===============================================================================================================
        await t.wait(5000);
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //====================================================Claim Creation ends Here===============================================================================================================

        /*===========================================================New Reserve Creation Is Started Here=============================================================================*/
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)

        /*===========================================================New Reserve Creation Is Completed Here=================================================================================================================================================================================================================*/
        await t.wait(5000);
        await t.switchToMainWindow();
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");

        //================================================Payment Creation Started Here==============================================================================================
        console.log("AssureClaims_Payment Creation Function is Called To Create Payment".yellow);
        await t.wait(5000)
        await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strLastName, data.TransactionType, data.Amount)
        await t.wait(5000)
        console.log("Payment is Created : ".green);
        //================================================Payment Creation ends Here==============================================================================================
        //===============================================Payment Goes on Hold Verification starts here ==============================================================================================
        var strSaveMessageVerification = `A hold requiring supervisory approval has been placed on this payment because ${strLastName} Payee Not Approved and requires managerial approval.`
        console.log(strSaveMessageVerification.yellow);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification, true, "Payment has been on hold")
        //===============================================Payment Goes on Hold Verification ends here ==============================================================================================
        await t.wait(5000);
        //================================================================Zone Switched to Maintenance Starts Here================================================================================
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(10000);
        //====================================================================Zone Switched to Maintenance Ends Here==================================================================================
        //===========================Search created entity, started here===================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strLastName, 0);
        //===========================Search created entity, ended here===================================================================================================================================

        await t.wait(5000);
        await t.scrollIntoView(Entity_POM.AsssureClaims_Manitenance_Tab_GenericAccordian.nth(0))
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Btn_ApprovalStatusLookup, "Entituy Approval button")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_GenericTxt_Txt_DescriptionTextboxOnLookup.nth(1), data.EntityStatus_Approved, "Type Entity Status Catrgory")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_DescriptionSearchIconOnLookup.nth(1), "Search Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericLnk_Lnk_LnkforSelectValueFromLookUp, "Select Entity Status Category")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //================================================================Zone Switched to Claims Starts Here================================================================================
        await t.wait(10000);
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(10000);
        //===============================================================Zone Switched to Claims Ends Here==================================================================================

        //======================================================Muskan's Code :RMA-97695 Claim search started here================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=====================================================================

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        /*=====================================================Schedule Check Creation with created entity Started Here==============================================================*/

        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select reserve")
        // =====================================================Logout from application ==========================================================================================================

        //================================================Payment Creation Started Here===========================================================================================================
        console.log("AssureClaims_Payment Creation Function is Called To Create payment".yellow);
        await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strLastName, data.TransactionType, data.Amount)
        await t.wait(8000)
        console.log("Payment is Created : ".green);
        //================================================Payment Creation ends Here==============================================================================================
    });
    //     ==========================================================================Test 2 ends here ====================================================================================

    /*
       1.  Go to Maintenance Zone and search for Created entity in Test 1 and change Entity payment Approval status from Approved to Rejected
       2.  Search GC claim
       3.  Create Payment with created entity name in Test 1
       4.  Verify Payment on hold msg
    */
    //     ==========================================================================Test 3 Starts here ====================================================================================

    test('AssureClaims_EntitiesCreation_StatusAsRejected_Test_03', async t => {

        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
        //===========================Search created entity, started here===================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strLastName, 0);
        //===========================Search created entity, ended here===================================================================================================================================

        await t.scrollIntoView(Entity_POM.AsssureClaims_Manitenance_Tab_GenericAccordian.nth(0))
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Entity_Btn_ApprovalStatusLookup, "entity status as reject")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_GenericTxt_Txt_DescriptionTextboxOnLookup.nth(1), data.EntityStatus_Rejected, "Type Entity Status Catrgory")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_DescriptionSearchIconOnLookup.nth(1), "Search Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericLnk_Lnk_LnkforSelectValueFromLookUp, "Select Entity Status Category")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");

        //================================================================Zone Switched to Claims Starts Here================================================================================
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(10000);
        //================================================================Zone Switched to Claims Ends Here==================================================================================

        //======================================================Muskan's Code :RMA-97695 Claim search started here============================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here==================================================================

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select reserve")

        //======================================================Payment Creation Started Here ===================================================================================================
        console.log("AssureClaims_Payment Creation Function is Called To Create payment".yellow);
        await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strLastName, data.TransactionType, data.Amount)
        await t.wait(8000)
        console.log("Payment is Created : ".green);
        //=================================================Payment Creation ends Here===========================================================================================================
        //================================================Payment Goes on Hold Verification starts here =========================================================================================

        var strSaveMessageVerification = `A hold requiring supervisory approval has been placed on this payment because ${strLastName} Payee Not Approved and requires managerial approval.`;

        console.log(strSaveMessageVerification.yellow);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification, true, "Payment has been on hold")
        //===============================================Payment Goes on Hold Verification ends here ===========================================================================================
    });
    //     ==========================================================================Test 3 Ends here ====================================================================================

    /*
        1.  Turn OFF use Entity Setting from Congiguration manager (Go to Configuration Manager> Payment Parameter > Payment > Supervisory Approval)
        2.  Open Entity Screen
        3.  Verify 2 Feilds present or not i.e Entity Payment Approval Status and Payment Approval/Rejected Reason.
    */
    //     ==========================================================================Test 4 Starts here ====================================================================================

    test('AssureClaims_EntitiesCreation_UseEntityPaymentApprovalAsOFF_Test_04', async t => {
        //====================================================Payment Parameter SetUp in Configuration manager(Use Entity Payment Approval --> OFF) started=====================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Approval ON")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration manager ended============================================================================

        // =====================================================Zone Switched to Maintenance starts here=======================================================================================
        await t.wait(5000)
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.wait(5000)
        // =================================================Zone Switched to Maintenance ends here=============================================================================================
        // =================================================Verification of Payment approval and reason starts here =========================================================================== 
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame);
        await t.scrollIntoView(Entity_POM.AsssureClaims_Manitenance_Tab_GenericAccordian.nth(0))
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Entity_Txt_ApprovalStatus, "Entity Payment Approval Status not Available.");
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AsssureClaims_Manitenance_Txt_PaymentApprovalRejectedReason, "Payment Approval/Rejected Reason not Available.");
        console.log("verification Successfull".green)
        // =================================================Verification of Payment approval and reason ends here =========================================================================== 
    });
    //     ==========================================================================Test 4 Ends here ====================================================================================

});
