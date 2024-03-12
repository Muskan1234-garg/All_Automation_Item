import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_Adjuster from '../Functional_POM/POM_Adjuster';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const In_Utility = new Input_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Deductible_POM = new POM_Deductible();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const ClearCheack_POM = new POM_ClearCheack();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();
const Adjuster_POM = new POM_Adjuster();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-107076
//Description      : 1. Create 3 users & set limit for the ground user.
//                   2. Turn on appropriate settings-> check Use Current Adjuster, Per Claim Pay Limits .
//                   3. Create GC , Addition of adjuster with any name and selection of strAdjusterUser in "RiskMaster Login" Textbox and Save
//                   4. Login with Adjuster user , verify both payments, Approve first payment and Reject second payment.
//                   5. Login with Ground User, verify first Payment status as "Released" and second payment status as "Reviewed But Denied"
//                   6. Revert settings and delete users.
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');
//Global Variable Declaration
var strAdjusterLastName = "Adj_" + "" + faker.name.lastName();
var strAdjusterFirstName = "Adj_" + "" + faker.name.firstName();
var strManagerLastName = "Sr_" + "" + faker.name.lastName();
var strManagerFirstName = "Sr_" + "" + faker.name.firstName();
var strGroundUserLastName = "Usr_" + "" + faker.name.lastName();
var strGroundUserFirstName = "Usr_" + "" + faker.name.firstName();
var strManager;
var strGroundUser;
var strAdjusterUser;

var strClaimNumber;
var strControlNumber1;
var strControlNumber2;

DataIUT.forEach(data => {
    fixture`PerClaimPayLimit_AdjusterChain`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_LoginWithUser_ConfigurationManagerSetting_Test_01 :
          1. Login Into Application with User
          2. Configuration Manager Setting on Payment Parameter SetUp
          3. Checked Use Current Adjuster
          4. Checked Per Claim Pay Limits Are Exceeded
          5. Uncheck all other settings in the current tab
      */
    test('AssureClaims_LoginWithUser_ConfigurationManagerSetting_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Payment Parameter SetUp in Configuration Manager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_UseSupervisoryApproval, "UnCheck", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_PayDetailLimitsExceeded, "UnCheck", "Pay Detail Limits Exceeded Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queue Payments instead of Hold")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove, "UnCheck", "Allow Group of Supervisor to Approve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor, "UnCheck", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentCheckLimitsForManualPayments, "UnCheck", "Check Limits for Manual Payments")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPayLimitsExceeded, "UnCheck", "Per Claim Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPerPolicyPayLimitsExceeded, "UnCheck", "Per Claim Per Policy Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPerCoveragePayLimitsExceeded, "UnCheck", "Per Claim Per Coverage Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerFinancialKeyPayLimitsExceeded, "UnCheck", "Per Financial Key Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDetailLimitsAreExceeded, "UnCheck", "Payment Detail Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PayeeDoesNotExistInSystem, "UnCheck", "Payee does Not Exist in System")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Payment Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseCurrentAdjusterChain, "Check", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_PerClaimPayLimitsExceeded, "Check", "Per Claim Pay Limits Exceeded Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration Manager ended================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    });

    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_02 :
    1. Login Into Application with User
    2. Creation of Adjuster User
    3. Creation of Manager User
    4. Creation of Ground User
    5. Securities > user privilege setup
    6. Select LOB > General claim
    7. Select Limit type >Per Claim Pay limit > enable Per Claim Pay Limit
    8. Select the ground user >enter amount and Click on add
    9. Logout
   */
    test('AssureClaims_UserCreationAndUserPrivilegeSetting_Test_02', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Creation of Adjuster User started==================================================================
        strAdjusterUser = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strAdjusterLastName, strAdjusterFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Adjuster User ended==================================================================
        //==============================================================Creation of Ground User started==================================================================
        //==============================================================Creation of Manager User started==================================================================
        strManager = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strManagerLastName, strManagerFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Manager User ended==================================================================
        //==============================================================Creation of Ground User started==================================================================

        strGroundUser = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strGroundUserLastName, strGroundUserFirstName, strManagerFirstName + " " + strManagerLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Ground User ended==================================================================
        await t.wait(5000)
        await t.switchToMainWindow()

        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================
        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================
        //==============================================================Select Limit type > Per Claim Pay Limits > enable Per Claim Pay Limits started==================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Per Claim Pay Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Per Claim Pay Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > Per Claim Pay Limits > enable Per Claim Pay Limits ended==================================================================
        //==============================================================Select the ground user > add amount and Click on add started==================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUser, "Ground User")
        await t.pressKey('tab');


        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, data.DepositAmount, "Ground User")
        await t.pressKey('tab');


        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //==============================================================Select the ground user > add amount and Click on add ended==================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    });


    /* Steps performed by AssureClaims_GCClaimCreationAndPaymentCreation_Test_03 :
       1. Login Into Application with Ground User
       2. Corporate GC Creation
       3. Addition of adjuster with any name and selection of strAdjusterUser in "RiskMaster Login" Textbox and Save.
       4. Two Payments Creation for the created claim
       5. Payment hold Verification for both payments
   */
    test('AssureClaims_GCClaimCreationAndPaymentCreation_Test_03', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================

        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
            "MM/DD/yyyy"
        );
        //=====================================Corporate GC  Creation started here===================================================================================================================================
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(
            d,
            d,
            data.ClaimStatus,
            data.GCClaimType,
            data.Department,
            data.GCPolicyLOB
        );
        console.log(
            "New Cooperate General Claim is Created with Claim Number: ".green +
            strClaimNumber
        );
        //=====================================Corporate GC  Creation completed here===================================================================================================================================
        //=============================================================================== Creation of Adjuster And Assign an Adjuster with RM login of Adjuster User Starts Here=================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
        await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, data.MyPendingClaimAdjusterLastName1, "Adjuster Last Name")
        await t.pressKey('tab')
        await t.wait(10000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_RiskmasterLogin, "RiskMaster Login Lookup")
        await t.wait(10000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Users, "Users Button RiskMaster Login Lookup Page On Adjuster Screen")
        await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaimsApp_Adjuster_Txt_LoginName, strAdjusterUser, "LoginName TextBox Of RiskMaster Login Lookup Page On Adjuster Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup.nth(0), "Description Search Icon Of RiskMaster Login Lookup Page On Adjuster Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select grid Of RiskMaster Login Lookup Page On Adjuster Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_Adjuster_Btn_Ok, "Click Ok Of RiskMaster Login Lookup Page Button On Adjuster Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Adjuster Creation Screen");

        //=============================================================================== Creation of Adjuster And Assign an Adjuster with RM login of Adjuster User Ends Here=================================================================================
        await t.wait(2000);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after adjuster creation"
        );
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(5000);
        //=====================================Reserve Creation started here===================================================================================================================================

        await Function_Utility.AssureClaims_Reserve_Utility(
            data.ReserveType,
            data.ReserveAmount,
            data.ReserveStatus
        );
        //=====================================Reserve Creation completed here===================================================================================================================================

        let strSaveMessageVerification = `A hold requiring supervisory approval has been placed on this payment because Exceeded Per Claim Payment Limit.You do not have authority to pay more than $${data.DepositAmount}.00 per claim.`



        await t.wait(2000);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after reserve creation"
        );
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
            "grid button"
        );
        await t.wait(3000);
        //=====================================Payment Creation started here===================================================================================================================================




        strControlNumber1 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
            data.BankAccount,
            data.PayeeType,
            data.LastName,
            data.TransactionType,
            "105"
        );
        //=====================================Payment Creation completed here===================================================================================================================================
        //====================================================Verification of toast message started============================================================================
        await t.wait(3000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            strSaveMessageVerification,
            true,
            "Verification for payment on hold"

        );
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusHold, "CheckStatus TextBox");
        //====================================================Verification of toast message ended============================================================================

        await t.wait(2000);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after first payment creation"
        );
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
            "grid button"
        );
        await t.wait(3000);
        //=====================================Second Payment Creation started here===================================================================================================================================


        strControlNumber2 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
            data.BankAccount,
            data.PayeeType,
            data.LastName,
            data.TransactionType,
            "105"
        );
        //=====================================Payment Creation completed here===================================================================================================================================
        //====================================================Verification of toast message started============================================================================
        await t.wait(3000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            strSaveMessageVerification,
            true,
            "Verification for payment on hold"

        );
        await t.wait(2000)
        //=================================================Verification of check status -> hold,  started===================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusHold, "CheckStatus TextBox");
        //=================================================Verification of check status -> hold,  ended===================================================================================
        //===================================================Verification of 1st record on my pending transaction screen started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber1, "Enter Control Number")
        const ColHeader1 = ["Claim Number", "Hold Reason"]
        const ColValue1 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Pending Transaction Grid", ColHeader1, ColValue1)
        //===================================================Verification of 1st record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 2nd record on my pending transaction screen started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const ColHeader2 = ["Claim Number", "Hold Reason"]
        const ColValue2 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Pending Transaction Grid", ColHeader2, ColValue2)
        //===================================================Verification of 2nd record on my pending transaction screen ended here==================================================================================================================



    });

    /* Steps performed by AssureClaims_AdjusterApprovalAndRejection_Test_04 :
         1. Login Into Application with with Adjuster
         2. Verify the claim no. with the payment having status hold
         3. Approve first payment and reject second payment
     */
    test('AssureClaims_AdjusterApprovalAndRejection_Test_04', async t => {

        //==============================================================Login Into Application with Adjuster User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strAdjusterUser, "abkabk1", data.DSN, 'Claims')
        await t.wait(10000)
        //=============================================================Login Into Application with User ended=========================================================================
        //=============================================================Approval of first and rejection of second Payment on hold started=========================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await t.wait(10000)
        //==================================verification of Claim Number, Hold Reason getting Displayed on supervisory approval screen of Adjuster Started=====================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber1, "Enter First Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //==================================verification of Claim Number, Hold Reason getting Displayed on supervisory approval screen of Adjuster ended=====================================================
        //=============================================================Approval of first Payment on hold started=========================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Approve Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        //=============================================================Approval of first Payment on hold end=========================================================================
        //=============================================================Rejection of first Payment on hold starts=========================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Second Control Number")
        const Header2 = ["Claim Number", "Hold Reason"]
        const Value2 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header2, Value2)
        //==================================verification of Claim Number, Hold Reason getting Displayed on supervisory approval screen of Adjuster ended=====================================================
        //=============================================================Approval of first Payment on hold started=========================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_RejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        await t.wait(2000)
        //=============================================================Rejection of first Payment on hold end=========================================================================
        //=============================================================Approval of first and rejection of second Payment on hold ended=========================================================================
    });

    /* Steps performed by AssureClaims_VerificationOfPaymentStatusAfterApproval_Test_05 :
          1. Login Into Application with Ground User
          2. Verification of check status -> "Released" for first payment and "Reviewed But Denied" for second payment in transaction History screen
          3. Verification of check status -> "Released" for first payment and "Reviewed But Denied" for second payment in transaction screen
      */
    test('AssureClaims_VerificationOfPaymentStatusAfterApproval_Test_05', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================
        //==============================================================Search Claim started==================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        //==============================================================Search Claim ended==================================================================================
        //==============================================================Verification of check status -> 'Released' for First Payment in transaction History screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber1, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Released"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History grid view", ColHeader1, ColValue1)
        //==============================================================Verification of check status -> 'Released' for First Payment in transaction History screen ended==================================================================================
        //==============================================================Verification of check status -> 'Released' for First Payment in transaction screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
        await t.wait(5000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
        //==============================================================Verification of check status -> 'Released' for First Payment in transaction screen ended==================================================================================
        // back to reserve window
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );
        //==============================================================Verification of check status -> 'Reviewed But Denied' for second payment in transaction History screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber2, "Control Number 2")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader2 = ["Status"]
        const ColValue2 = ["Reviewed But Denied"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History grid view", ColHeader2, ColValue2)
        //==============================================================Verification of check status -> 'Reviewed But Denied' for second payment in transaction History screen ended==================================================================================
        //==============================================================Verification of check status -> 'Reviewed But Denied' for second payment in transaction screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
        await t.wait(5000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRDReviewedButDenied, "CheckStatus TextBox");
        //==============================================================Verification of check status -> 'Reviewed But Denied' for second payment in transaction screen ended==================================================================================

    });

    /*
        1)Uncheck settings for supervisory reserve from Configuration manager
        */
    test('AssureClaims_LoginWithUserIntoConfiguration_RevertSettingForSupervisory_Test_06', async t => {

        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================Uncheck Setting for supervisory reserve over Configuration manager started here======================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "UnCheck", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "UnCheck", "Allow the group of supervisor to approve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame, "Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame.find('span').withText('Days'), "Select Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_ReserveDaysHoursForApproval, "0", "Days/Hours For Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveZeroAsValidValueForEscalation, "UnCheck", "0 as Valid value for Escalation")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveNotifyTheImmediateSupervisor, "UnCheck", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseCurrentAdjusterChain, "UnCheck", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_IncurredLimitsAreExceeded, "UnCheck", "Incurred Limits are exceeded")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Approval Notification")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveDisableEmailToSupervisor, "UnCheck", "Disable Email To Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveDisableDiaryToSupervisor, "UnCheck", "Disable Diary To Supervisor")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        //====================================Uncheck Setting for supervisory reserve over Configuration manager ended here==========================================================================================

        //====================================Check/Uncheck Setting for supervisory payment over Configuration manager ended here==========================================================================================
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Payment")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "UnCheck", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queue Payments instead of Hold")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseCurrentAdjusterChain, "UnCheck", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove, "UnCheck", "Allow Group of Supervisor to Approve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor, "UnCheck", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentTimeFrame, "Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentSelectTimeFrame.find('span').withText('Days'), "Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_PaymentDaysHoursForApproval, "0", "Days/Hours For Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentZeroAsValidValueForEscalation, "UnCheck", "0 as Valid value for Escalation")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentCheckLimitsForManualPayments, "UnCheck", "Check Limits for Manual Payments")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed, "UnCheck", "Payment Limits Are Exceeded")
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

        //====================================Check/Uncheck Setting for supervisory payment over Configuration manager ended here==========================================================================================
    });

    /*
       1)Login to Security
       2)UnCheck Per Claim Pay limit 
       */
    test("AssureClaims_RevertSecuritySetting_Test_07", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strGroundUser}`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Uncheck Payment Limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Pay Limits', "Select Limit Type")

        //===================================================Remove payment limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUser, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove payment limit for Ground User 100$ ended here==================================================================================================================

        await t.wait(3000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Enable Per Claim Pay Limits")

        //===================================================Uncheck Payment Limit ended here==================================================================================================================
    });

    /* 
        1)Login Into Application 
        2)Deletion of Ground User
        3)Deletion of Manager User
        4)Deletion of Adjuster User
        5)Logout
    */
    test('AssureClaims_UserDeletion_Test_08', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(30000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Ground User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strGroundUserFirstName + " " + strGroundUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended===================================================================================

        //==============================================================Deletion of Manager User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strManagerFirstName + " " + strManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Manager User ended==================================================================

        //==============================================================Deletion of Adjuster User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strAdjusterFirstName + " " + strAdjusterLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Adjuster User ended==================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();

    });

});


