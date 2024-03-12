import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const In_Utility = new Input_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Deductible_POM = new POM_Deductible();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const Payment_POM = new POM_PaymentsCollections();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-102127
//Description      : 1. Create 4 user. 3 with same module group 1 with differnt module group and set Limit for ground user
//                   2. Turn on supervisory Approval settings
//                   3. Create GC and transaction With exceeding limit
//                   4. Login with User with different module group and verify the claim no is not visible in superviory screen
//                   5. Login with Mid manager and verfy claim is visible
//                   6. Login with Senior manager and verify claim no . is visible and approve the transaction.
//                   7. Login with Ground user and Verification of check status -> 'Released' in transaction History screen
//                   8. Revert settings

//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : No
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');
const fs = require('fs')

//Global Variable Declaration

var strSeniorManagerLastName = "Sr_" + "" + faker.name.lastName();
var strSeniorManagerFirstName = "Sr_" + "" + faker.name.firstName();
var strMidManagerLastName = "Mid_" + "" + faker.name.lastName();
var strMidManagerFirstName = "Mid_" + "" + faker.name.firstName();
var strGroundUserLastName = "Grd_" + "" + faker.name.lastName();
var strGroundUserFirstName = "Grd_" + "" + faker.name.firstName();
var strUserLastName = "Usr_" + "" + faker.name.lastName();
var strUserFirstName = "Usr_" + "" + faker.name.firstName();

var strSeniorManagerName;
var strMidManagerName;
var strGroundUserName;
var strUserName;
var strClaimNumber;
var strControlNumber;

DataIUT.forEach(data => {
    fixture`PaymentLimit_DifferentAdminGroup`.beforeEach(async t => {
        await t.wait(8000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01 :
          1. Login Into Application with User
          2. Creation of Senior Manager User
          3. Creation of Mid Level Manager User
          4. Creation of Ground User with manager and Ground User with different module group
          5. Securities > user privilege setup
          6. Select LOB > General claim
          7. Select Limit type > payment detail limit > enable Payment Detail Limits
          8. Select the ground user > add reserve type, amount and Click on add
          9. Logout
      */
    test('AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01', async t => {

        //==============================================================Login Into Application with User started==============================================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended=================================================================================================

        //==============================================================Creation of Senior Manager User started================================================================================================
        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        strSeniorManagerName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strSeniorManagerLastName, strSeniorManagerFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)

        //==============================================================Creation of Senior Manager User ended==================================================================================================

        //==============================================================Creation of Mid Manager User started===================================================================================================
        strMidManagerName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strMidManagerLastName, strMidManagerFirstName, strSeniorManagerFirstName + " " + strSeniorManagerLastName, "NA", data.DSN, data.ModuleName_Administrator)

        //==============================================================Creation of Mid Manager User ended====================================================================================================

        //==============================================================Creation of Ground User started=======================================================================================================
        strGroundUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strGroundUserLastName, strGroundUserFirstName, strMidManagerFirstName + " " + strMidManagerLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Ground User ended=========================================================================================================

        //==============================================================Creation of Ground User started=======================================================================================================
        strUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strUserLastName, strUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Training)
        //==============================================================Creation of Ground User ended========================================================================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)

        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================

        //==============================================================Select LOB > General claim started===============================================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================================================

        //==============================================================Select Limit type > payment limit > enable Payment Limits started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Payment Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Payment Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > payment limit > enable Payment Detail Limits ended=============================================================

        //===================================================Set Payment Limit for Ground User 100$ started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")

        //===================================================Set Payment Limit for Ground User 100$ ended here===============================================================================================================================================================================================
        
        // ========================================================== Logout from the application starts here ================================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        // ========================================================== Logout from the application ends here ================================================================================================
 
    });

    /* Steps performed by AssureClaims_Configuration_SettingForSupervisory_Test_02:
          1. Check/Uncheck settings for Supervisory Reserve from Configuration manager
    */

    test('AssureClaims_Configuration_SettingForSupervisory_Test_02', async t => {

        //==============================================================Login Into Application with User started==========================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserName, 'abkabk1', data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended==============================================================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here================================================================================================================================================================================================

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "Check", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queue Payments instead of Hold")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseCurrentAdjusterChain, "UnCheck", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove, "Check", "Allow Group of Supervisor to Approve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor, "Check", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentTimeFrame, "Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentSelectTimeFrame.find('span').withText('Days'), "Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_PaymentDaysHoursForApproval, "0", "Days/Hours For Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentZeroAsValidValueForEscalation, "UnCheck", "0 as Valid value for Escalation")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentCheckLimitsForManualPayments, "UnCheck", "Check Limits for Manual Payments")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed, "Check", "Payment Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPayLimitsExceeded, "UnCheck", "Per Claim Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPerPolicyPayLimitsExceeded, "UnCheck", "Per Claim Per Policy Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPerCoveragePayLimitsExceeded, "UnCheck", "Per Claim Per Coverage Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerFinancialKeyPayLimitsExceeded, "UnCheck", "Per Financial Key Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDetailLimitsAreExceeded, "UnCheck", "Payment Detail Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PayeeDoesNotExistInSystem, "UnCheck", "Payee does Not Exist in System")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Payment Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Approval Notification")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryToSupervisor, "UnCheck", "Disable Diary To Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDisableEmailToSupervisor, "UnCheck", "Disable Email To Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalDiary, "UnCheck", "Enable Payment Approval Diary")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalEmail, "UnCheck", "Enable Payment Approval Email")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryNotificationForUnapprovedEntity, "UnCheck", "Disable Diary Notification for Unapproved Entity")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(3000)

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager ended here==============================================================================================================================================================================================

    });

    /* Steps performed by AssureClaims_GCClaimCreationAndPaymentCreation_Test_03 :
          1. Login Into Application with Ground User
          2. Corporate GC Creation
          3. Payment Creation
          4. Payment hold Verification
      */

    test('AssureClaims_GCClaimCreationAndPaymentCreation_Test_03', async t => {

        //==============================================================Login Into Application with User started==============================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserName, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=================================================================================================
        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/yyyy");
        //=====================================Corporate GC  Creation started here=================================================================================================================================================================================================

        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
        console.log("New Cooperate General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=====================================Corporate GC  Creation completed here==================================================================================================================================================================================================

        //===================================================Create 1st payment ($105), verify payment goes on hold started here=================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        strControlNumber = await Function_Utility.AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(data.BankAccount, data.PayeeType, data.LastName, 2, 1, "105", Verification_Msg.ExceedPaymentLimitsOnHold)
        console.log(strControlNumber)
        //===================================================Create 1st payment ($105), verify payment goes on hold ended here=================================================================================================================================================================================================
        
        //=================================================Verification of check status -> hold on Transaction Page,  started===================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusHold, "CheckStatus TextBox");
        //=================================================Verification of check status -> hold on Transaction Page,  started===================================================================================
        await t.wait(8000)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")

        //===================================================Verify payment status as Hold in Transaction History started here==================================================================================================================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber, "Control Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const Header1 = ["Status"]
        const Val1 = ["Hold"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold", "Transaction History grid view", Header1, Val1)
        //===================================================Verify payment status as Hold ended here==================================================================================================================================================================================================

    });


    /* Steps performed by AssureClaims_VerifyClaimNoWithDifferenytModuleGroup_Test_04 :
         1. Login Into Application with user with different module group
         2. Verify the claim no. 
         3. Verification of Claim Number not getting Displayed on supervisory approval screen of user with different module group
     */

    test('AssureClaims_VerifyClaimForUserWithDifferentModuleGroup_Test_04', async t => {

        //==============================================================Login Into Application with User started=============================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserName, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_PaymentGroup, "Group Icon")
        await t.wait(8000)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager Started=================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")

        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager ended===================================================================

    });


    /* Steps performed by AssureClaims_MidManagerApproval_Test_05 :
         1. Login Into Application with Mid Manager
         2. Verify the claim no. with the payment having status hold
     */

    test('AssureClaims_VerifyClaimForMidManager_Test_05', async t => {

        //==============================================================Login Into Application with User started============================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strMidManagerName, "abkabk1", data.DSN, 'Claims')
        await t.wait(10000)
        //=============================================================Login Into Application with User ended================================================================================================
        //=============================================================Approval of Payment on hold started===================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        // paygropuicon
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_PaymentGroup, "Group Icon")
        await t.wait(4000)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager Started===============================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager ended==================================================================

    });

    /* Steps performed by AssureClaims_VerifyClaimNoAndTransactionApproval_Test_06
          1. Login with Senior Manager
          2. Verify the claim no. with the payment having status hold
          3. Approve transaction
    */

    test('AssureClaims_VerifyClaimForSeniorMgrAndApproveTransaction_Test_06', async t => {

        //==============================================================Login Into Application with User started=======================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSeniorManagerName, "abkabk1", data.DSN, 'Claims')
        await t.wait(10000)
        //=============================================================Login Into Application with User ended==========================================================================================
        //=============================================================Approval of Payment on hold started=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        // ============================================================ Pay Group Icon Click ===========================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_PaymentGroup, "Group Icon")
        await t.wait(4000)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager Started============================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager ended==============================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        // =============================================================Approval of Payment on hold ended================================================================================================

    });

    /* Steps performed by AssureClaims_VerificationOfPaymentStatusAfterApproval_Test_07 :
          1. Login Into Application with Ground User
          2. Verification of check status -> 'Released' in transaction History screen
          3. Verification of check status -> 'Released' in transaction screen
    */

    test('AssureClaims_VerificationOfPaymentStatusAfterApproval_Test_07', async t => {

        //==============================================================Login Into Application with User started====================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserName, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=======================================================================================
        //==============================================================Search Claim started========================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        //==============================================================Search Claim ended===========================================================================================================
        //==============================================================Verification of check status -> 'Released' in transaction History screen started======================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber, "Control Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Released"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History grid view", ColHeader1, ColValue1)
        //==============================================================Verification of check status -> 'Released' in transaction History screen ended=========================================================================================================================================================================================
        //==============================================================Verification of check status -> 'Released' in transaction screen started=======================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
        await t.wait(5000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
        //==============================================================Verification of check status -> 'Released' in transaction screen ended=========================================================================================================================================================================================

    });

    /*
    Steps performed by AssureClaims_LoginWithUser_ReverseConfigManagerSetting_Test_08 
       1. Reverse Utility Setting.
       2. Turn OFF Supervisory Approval, Payment allow group of supervisor to Apporve, Notify the Immediate Supervisor, Payment Limit Exceed.
    */

    test('AssureClaims_ReverseConfigManagerSetting_Test_08', async t => {

        //==============================================================Login Into Application with User started=========================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended=============================================================================================

        //====================================================Payment Parameter SetUp in Configuration strManager started=================================================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "UnCheck", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove, "UnCheck", "Allow Group of Supervisor to Approve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor, "UnCheck", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed, "UnCheck", "Payment Limits Are Exceeded")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        //====================================================Payment Parameter SetUp in Configuration strManager ended====================================================================================

    });

    /* Steps performed by AssureClaims_RevertSecuritySetting_Test_09
        1. Login to Security
        2. UnCheck Payment limit 
        3. Logout
    */
    test("AssureClaims_RevertSecuritySetting_Test_09", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Uncheck Payment Limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Payment Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Enable Payment Limits")
        //===================================================Uncheck Payment Limit ended here==================================================================================================================
      
        // ========================================================== Logout from the application starts here ================================================================================================
       await t.wait(3000)
       await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
       // ========================================================== Logout from the application ends here ================================================================================================

    });


    /* Steps performed by AssureClaims_UserDeletion_Test_10 :
        1. Login Into Application with Ground User
        2. Deletion of Ground User
        3. Deletion of Manager User
        4. Deletion of Senior User
        5. Deletion of User with different module group
    */

    test('AssureClaims_UserDeletion_Test_10', async t => {

        //==============================================================Login Into Application with User started======================================================================================

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended=========================================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Senior Manager User started========================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strSeniorManagerFirstName + " " + strSeniorManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Senior Manager User ended==========================================================================================
        await t.switchToMainWindow()
        //==============================================================Deletion of Mid Manager User started===========================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strMidManagerFirstName + " " + strMidManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Mid Manager User ended=============================================================================================
        //==============================================================Deletion of Ground User started================================================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strGroundUserFirstName + " " + strGroundUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================================================
        //==============================================================Deletion of Ground User with different module group started================================================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User with different module group  ended==================================================================================================

    });

});


