import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_ClearCheack from '../Functional_POM/POM_ClearCheack';
import POM_StopPay from '../Functional_POM/POM_StopPay';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';


const Maint_Utility = new Maintenance_Functionality_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const ConfigMgr_POM = new POM_Config_Manager();
const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();

const DataAutoReg = require('../DataFiles/DataAutoRegDSN_1.json');
var d;
var LastName1;
var SaveMessageVerification1;
var SaveMessageVerification2;
//Global Variable Declaration


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-93527, RMA-102196
//Description      : Check Jira
//AUTHOR           : Yashaswi Mendekar, Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194Automation, DSN3 : RM202REG_Test1
// *******************************************************************************************************************************

DataAutoReg.forEach(data => {
  fixture`StopPay4_DifferentStatusMessage`.beforeEach(async t => {
    await t.wait(4000)
    await t.setNativeDialogHandler(() => true)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });


  // // ===========================================1. Released Status================================================================

  test('AssureClaims_StopPay_CheckReleasedStatus_Test_01', async t => {

    //===============================================Login into application======================================================================== 
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    //============================================General Claim Creation Started Here==============================================================================================


    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    console.log("AssureClaims_ClaimCreation Function is Called To Create Claim".yellow);
    var StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);

    console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //===============================================Claim Creation Completeed Here==============================================================================================

    //===============================================Reserve Creation Started Here==============================================================================================
    console.log("AssureClaims_Reserve Creation Function is Called To Create Reserve".yellow);
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.AmountType, data.ReserveStatus);
    console.log("New Reserve is Created : ".green);
    //===============================================Reserve Creation ends Here==============================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");

    //================================================Payment Creation Started Here==============================================================================================
    console.log("AssureClaims_Payment Creation Function is Called To Create payment".yellow);
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.Amount)
    await t.wait(8000)
    console.log("Payment is Created : ".green);
    //================================================Payment Creation ends Here==============================================================================================
    //================================================Verify-->Check Status,No stop pay button exists==============================================================================================

    const actualValue = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus);
    const expectedValue = "R Released";
    if (expectedValue === actualValue) {
      console.log(
        expectedValue.green + "is matched with".yellow + " " + actualValue.green + "Hence verification successful".green);
      await t.wait(5000)
      await Verify_Utility.AssureClaims_ElementNotExist_Utility(StopPay_POM.AssureClaims_Claims_Btn_StopPay, "No StopPay Button Exists");

    }
    else {
      console.log(expectedValue.red + "is matched with".red + " " + actualValue.red + "Hence verification is not successful".red);
    }
    //================================================Verification ends here ==============================================================================================

    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    // =====================================================Logout from application ===========================================================================


  });

  // ===============================================2. On Hold=============================================================

  test('AssureClaims_StopPay_ConfigManager_CheckHoldMsg_Test_02', async t => {


    await t.wait(10000)
    
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application with ${data.Username}`)
    //=============================================================Login Into Application with User ended=========================================================================

    //====================================================Payment Parameter SetUp in Configuration manager started================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "Check", "Use Entity Payment Approval")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PayeeDoesNotExistInSystem, "Check", "Payee does not exist in system")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queued Payments instead of hold")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
    //====================================================Payment Parameter SetUp in Configuration manager ended================================================

    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();

    console.log("Logout from Application!!")
    //================================================Logout from Configuration Manager====================================================================
    //====================================================Login to Maintenance====================================================================
    await t.wait(5000)

    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(2000)
    console.log("Login Into Maintenance".green)
    await t.wait(2000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await t.wait(5000)
    //=======================================Entity creation Starts here===================================================================================

    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
    LastName1 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
    console.log("New Entity is Created with Last Name: ".green + LastName1);
    await t.wait(2000)
    //=======================================Entity creation Ends here===================================================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //========================================Logout from maintenance===================================================================================
    await t.wait(1000)

    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')

    //===============================================Claim Creation Started Here==============================================================================================
    console.log("AssureClaims_claim Creation Function is Called To Create claim".yellow);
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    await t.wait(2000)
    await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
    await t.wait(2000)
    console.log("New Claim is Created : ".green);

    //===============================================Claim Creation ends Here==============================================================================================

    //===============================================Reserve Creation Started Here==============================================================================================
    console.log("AssureClaims_Reserve Creation Function is Called To Create Reserve".yellow);
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.AmountType, data.ReserveStatus);
    console.log("New Reserve is Created : ".green);

    //===============================================Reserve Creation ends Here==============================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");
    //===============================================Payment Creation Started Here==============================================================================================
    console.log("AssureClaims_Payment Creation Function is Called To Create Payment".yellow);

    await t.wait(5000)
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, LastName1, data.TransactionType, data.Amount)
    await t.wait(5000)
    console.log("Payment is Created : ".green);
    //===============================================Payment Creation ends Here==============================================================================================

    //===============================================Payment Goes on Hold Verification starts here ==============================================================================================

    SaveMessageVerification1 = `A hold requiring supervisory approval has been placed on this payment because ${LastName1} Payee Not Approved and requires managerial approval.`;
    console.log(SaveMessageVerification1);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification1, true, "Payment has been on hold")
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(StopPay_POM.AssureClaims_Claims_Btn_StopPay, "No StopPay Button Exists");
    // =====================================================Logout from application ===========================================================================

    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //===============================================Payment Goes on Hold Verification ends here ==============================================================================================

  });

  // ================================================3. Queued Status===========================================================

  test('AssureClaims_StopPay_ConfigurationManagerSettingsCheckQueuedMsg_Test_03', async t => {


    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application with ${data.Username}`)
    //=============================================================Login Into Configuration manager with User ended=========================================================================

    //====================================================Payment Parameter SetUp in Configuration manager started================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "Check", "Queued Payments instead of hold")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_NotifyImmediateSupervisor, "Check", "Notify Immediate Supervisor")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
       //====================================================Payment Parameter SetUp in Configuration manager ended================================================
 
    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();

    console.log("Logout from Application!!")
    //================================================Logout from Configuration manager===================================================================
    //================================================Login into Claims====================================================================

    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')

    //===============================================Claim Creation starts Here==============================================================================================

    await t.wait(8000)
    console.log("AssureClaims_claim Creation Function is Called To Create claim".yellow);
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/yyyy");
    await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
    console.log("New claim is Created : ".green);

    //===============================================Claim Creation ends Here==============================================================================================

    //===============================================Reserve Creation starts Here==============================================================================================
    await t.wait(5000)
    console.log("AssureClaims_Reserve Creation Function is Called To Create Reserve".yellow);
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.AmountType, data.ReserveStatus);
    console.log("New Reserve is Created : ".green);

    //===============================================Reserve Creation ends Here==============================================================================================
    await t.wait(3000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");
    // back button
    await t.wait(3000)
    //===============================================Payment Creation starts Here==============================================================================================
    console.log("AssureClaims_Payment Creation Function is Called To Create Payment".yellow);
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, LastName1, data.TransactionType, data.Amount)
    console.log("Payment is Created : ".green);
    await t.wait(5000)
    //===============================================Payment Creation ends Here==============================================================================================

    //===============================================Verify Msg--->Transaction Screen,When Check Status is Queued==============================================================================================

    SaveMessageVerification2 = `Payment has been queued and requires supervisory approval because: The payee ${LastName1} of this payment has not been approved and requires managerial approval.`;
    console.log(SaveMessageVerification2);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification2, true, "Payment has been on Queued")
    await t.wait(5000)
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(StopPay_POM.AssureClaims_Claims_Btn_StopPay, "No StopPay Button Exists");
    // ===============================================Verification ends here==============================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //=========================================================Logout from Application===========================================================

  });

  // ======================================================4.Ready to Print =====================================================================
  test('AssureClaims_StopPay_ReadyToPrint_CheckPrintStatus_Test_04', async t => {

    // ====================================================Login into application================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log("AssureClaims_Claim Creation Function is Called To Create Claim".yellow);
    // ====================================================Claim Creation Starts here =====================================================================

    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/yyyy");
    var StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
    console.log("New Claim is Created : ".green);

    // ======================================================Claim Creation ends here=====================================================================
    // ======================================================Reserve Creation Starts here=====================================================================
    await t.wait(3000)
    console.log("AssureClaims_Reserve Creation Function is Called To Create Reserve".yellow);
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.AmountType, data.ReserveStatus);
    await t.wait(3000)
    console.log("Reserve is Created : ".green);

    // ======================================================Reserve Creation ends here=====================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");
    // back button
    await t.wait(3000)

    // ======================================================Payment Creation Starts here=====================================================================
    console.log("AssureClaims_Payment Creation Function is Called To Create Payment".yellow);
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.Amount)
    console.log("Payment is Created : ".green);
    await t.wait(5000)
    // ======================================================Payment Creation ends here=====================================================================
    //=======================================================Checked Ready to print Checkbox====================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Chk_ReadyToPrint, "Clicked on ready to print chckbox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Btn_OkToReadyToPrintConfirmation, "Ready to print Confirmation button clicked")
    //=======================================Checked Ready to print Checkbox ends here====================================================================

    // ======================================================Verify ----> no stop pay button exits  =====================================================================

    await Verify_Utility.AssureClaims_ElementNotExist_Utility(StopPay_POM.AssureClaims_Claims_Btn_StopPay, "No StopPay Button Exists");
    // ======================================================Verify ----> ends here========================================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();

    console.log("Logout from Application!!")
    // =====================================================Logout from application ===========================================================================

  });
  
  
  test('AssureClaims_StopPay_RevertConfigManagerSetting_Test_05', async t => {
    await t.wait(10000)
    //=============================================================Login Into Configuration manager with User ended=========================================================================
     await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application with ${data.Username}`)

    //====================================================Payment Parameter SetUp in Configuration manager started================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Payment Approval")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PayeeDoesNotExistInSystem, "UnCheck", "Payee does not exist in system")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queued Payments instead of hold")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_NotifyImmediateSupervisor, "UnCheck", "Notify Immediate Supervisor")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
    //====================================================Payment Parameter SetUp in Configuration manager ended================================================

    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    console.log("Logout from Application!!")
  });
 
  

});



//RMA-92828 :-Story 1: Stop Pay from Transaction Screen itself
