import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import POM_Deductible from '../Functional_POM/POM_Deductible';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Document_Event from '../Functional_POM/POM_Document_Event';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Verify_Utility = new Verification_Utility();
const Deductible_POM = new POM_Deductible();
const In_Utility = new Input_Utility();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const ClearCheack_POM = new POM_ClearCheack();
const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();
const Event_POM = new POM_Document_Event();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-102173
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : Reserve Type should be : 'E Expense'
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');
const fs = require('fs')
//Global Variable Declaration
var strManagerLastName = "Sr_" + "" + faker.name.lastName();
var strManagerFirstName = "Sr_" + "" + faker.name.firstName();
var strGroundUserLastName = "Usr_" + "" + faker.name.lastName();
var strGroundUserFirstName = "Usr_" + "" + faker.name.firstName();
var strManager;
var strGroundUser;

var strClaimNumber1;
var strControlNumber1;
var strClaimNumber2;
var strControlNumber2;

DataIUT.forEach(data => {
    fixture`Smoke_PayDetailLimit`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_LoginWithUser_ConfigurationManagerSetting_Test_01 :
          1. Login Into Application with User
          2. Configuration Manager Setting on Payment Parameter SetUp
          3. Checked Supervisory Approval
          4. Checked Payment Detail Limits Are Exceeded
          5. End
      */
    test('AssureClaims_LoginWithUser_ConfigurationManagerSetting_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Payment Parameter SetUp in Configuration Manager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_UseSupervisoryApproval, "Check", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_PayDetailLimitsExceeded, "Check", "Per Claim Pay Limits Exceeded Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration Manager ended================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    });


    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_02 :
       1. Login Into Application with User
       2. Creation of Manager User
       3. Creation of Ground User
       4. Securities > user privilege setup
       5. Select LOB > General claim
       6. Select Limit type > payment detail limit > enable Payment Detail Limits
       7. Select the ground user > add reserve type, amount and Click on add
       8. Logout
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
        //==============================================================Creation of Manager User started==================================================================
        strManager = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strManagerLastName, strManagerFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Manager User ended==================================================================
        //==============================================================Creation of Ground User started==================================================================

        strGroundUser = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strGroundUserLastName, strGroundUserFirstName, strManagerFirstName + " " + strManagerLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Ground User ended==================================================================
        await t.wait(5000)
        await t.switchToMainWindow()

        await t.wait(5000)
        console.log("Login Into Application!!".green)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================
        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================
        //==============================================================Select Limit type > payment detail limit > enable Payment Detail Limits started==================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Pay Detail Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Pay Detail Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > payment detail limit > enable Payment Detail Limits ended==================================================================
        //==============================================================Select the ground user > add reserve type, amount and claim type and Click on add started==================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUser, "Ground User")
        await t.pressKey('tab');
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Lst_ReserveType, data.ReserveType, "Reserve Type")
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, data.DepositAmount, "Ground User")
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //==============================================================Select the ground user > add reserve type, amount and claim type and Click on add ended==================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    });


 

    /* Steps performed by AssureClaims_GCClaimCreationAndPaymentCreation_Test_03 :
       1. Login Into Application with Ground User
       2. Corporate GC Creation
       3. Reserve Creation
       4. Payment Creation
       5. Payment hold Verification
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
        strClaimNumber1 = await Function_Utility.AssureClaims_GeneralClaimCreation(
            d,
            d,
            data.ClaimStatus,
            data.GCClaimType,
            data.Department,
            data.GCPolicyLOB
        );
        console.log(
            "New Cooperate General Claim is Created with Claim Number: ".green +
            strClaimNumber1
        );
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //=====================================Reserve Creation started here===================================================================================================================================

        await Function_Utility.AssureClaims_Reserve_Utility(
            data.ReserveType,
            data.ReserveAmount,
            data.ReserveStatus
        );
        //=====================================Reserve Creation completed here===================================================================================================================================
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
            data.InternalPolicyLimit
        );
        //=====================================Payment Creation completed here===================================================================================================================================
        //====================================================Verification of toast message started============================================================================
        let strSaveMessageVerification = `Payment has been set to Hold and requires supervisory approval because Exceeded Payment Detail Limit .The amount assigned to the reserve type: Expense exceeds the amount authorized for that reserve type and requires managerial approval.`;
        await t.wait(3000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            strSaveMessageVerification,
            true,
            "Verification for payment on hold"
        );
        //====================================================Verification of toast message ended============================================================================

        //=================================================Verification of check status -> hold,  started===================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusHold, "CheckStatus TextBox");
        await t.switchToMainWindow()
        // Go to my work> My Pending Transaction for ground user>Select payment tab
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, strClaimNumber1, "Claim Number")
        const ColHeader1 = ["Claim Number"]
        const ColValue1 = [strClaimNumber1]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber1, "Pending Payments Tab View", ColHeader1, ColValue1)
        //=================================================Verification of check status -> hold,  ended===================================================================================
    });

    /* Steps performed by AssureClaims_ManagerApproval_Test_04 :
         1. Login Into Application with with Manager
         2. Verify the claim no. with the payment having status hold
         3. Approve Payment on hold
     */
    test('AssureClaims_ManagerApproval_Test_04', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strManager, "abkabk1", data.DSN, 'Claims')
        await t.wait(10000)
        //=============================================================Login Into Application with User ended=========================================================================
        //=============================================================Approval of Payment on hold started=========================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager Started=====================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber1, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber1, "Exceeded Payment Detail Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber1, "Payment Supervisory Approval", Header1, Value1)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager ended=====================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        //=============================================================Approval of Payment on hold ended=========================================================================
    });

    /* Steps performed by AssureClaims_VerificationOfPaymentStatusAfterApproval_Test_05 :
          1. Login Into Application with Ground User
          2. Verification of check status -> 'Released' in transaction History screen
          3. Verification of check status -> 'Released' in transaction screen
      */
    test('AssureClaims_VerificationOfPaymentStatusAfterApproval_Test_05', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================
        //==============================================================Search Claim started==================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber1, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        //==============================================================Search Claim ended==================================================================================
        //==============================================================Verification of check status -> 'Released' in transaction History screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber1, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Released"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History grid view", ColHeader1, ColValue1)
        //==============================================================Verification of check status -> 'Released' in transaction History screen ended==================================================================================
        //==============================================================Verification of check status -> 'Released' in transaction screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
        await t.wait(5000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
        //==============================================================Verification of check status -> 'Released' in transaction screen ended==================================================================================
    });

    /* Steps performed by AssureClaims_GCClaimCreationAndPaymentCreation_Test_06 :
    1. Login Into Application with Ground User
    2. Corporate GC Creation
    3. Reserve Creation
    4. Payment Creation
    5. Payment hold Verification
  */
    test('AssureClaims_GCClaimCreationAndPaymentCreation_Test_06', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================

        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
            "MM/DD/yyyy"
        );
        //=====================================Corporate GC  Creation started here===================================================================================================================================
        strClaimNumber2 = await Function_Utility.AssureClaims_GeneralClaimCreation(
            d,
            d,
            data.ClaimStatus,
            data.GCClaimType,
            data.Department,
            data.GCPolicyLOB
        );
        console.log(
            "New Cooperate General Claim is Created with Claim Number: ".green +
            strClaimNumber2
        );
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //=====================================Reserve Creation started here===================================================================================================================================

        await Function_Utility.AssureClaims_Reserve_Utility(
            data.ReserveType,
            data.ReserveAmount,
            data.ReserveStatus
        );
        //=====================================Reserve Creation completed here===================================================================================================================================
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

        strControlNumber2 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
            data.BankAccount,
            data.PayeeType,
            data.LastName,
            data.TransactionType,
            data.InternalPolicyLimit
        );
        //=====================================Payment Creation completed here===================================================================================================================================
        //====================================================Verification of toast message started============================================================================
        let strSaveMessageVerification = `Payment has been set to Hold and requires supervisory approval because Exceeded Payment Detail Limit .The amount assigned to the reserve type: Expense exceeds the amount authorized for that reserve type and requires managerial approval.`;
        await t.wait(3000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            strSaveMessageVerification,
            true,
            "Verification for payment on hold"
        );
        //====================================================Verification of toast message ended============================================================================

        //=================================================Verification of check status -> hold,  started===================================================================================
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusHold, "CheckStatus TextBox");
        await t.switchToMainWindow()
        // Go to my work> My Pending Transaction for ground user>Select payment tab
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, strClaimNumber2, "Claim Number")
        const ColHeader1 = ["Claim Number"]
        const ColValue1 = [strClaimNumber2]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber2, "Pending Payments Tab View", ColHeader1, ColValue1)
        //=================================================Verification of check status -> hold,  ended===================================================================================
    });

    /* Steps performed by AssureClaims_ManagerRejection_Test_07 :
         1. Login Into Application with with Manager
         2. Verify the claim no. with the payment having status hold
         3. Reject Payment on hold
     */
    test('AssureClaims_ManagerRejection_Test_07', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strManager, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================
        //=============================================================Rejection of Payment on hold started=========================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager Started=====================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber2, "Exceeded Payment Detail Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber2, "Payment Supervisory Approval", Header1, Value1)
        //==================================verification of Claim Number getting Displayed on supervisory approval screen of Manager ended=====================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_RejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //=============================================================Rejection of Payment on hold ended=========================================================================
    });

    /* Steps performed by AssureClaims_VerificationOfPaymentStatusAfterRejection_Test_08 :
          1. Login Into Application with Ground User
          2. Verification of check status -> 'Reviewed But Denied' in transaction History screen
          3. Verification of check status -> 'Reviewed But Denied' in transaction screen
      */
    test('AssureClaims_VerificationOfPaymentStatusAfterRejection_Test_08', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================
        //==============================================================Search Claim started==================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber2, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        //==============================================================Search Claim ended==================================================================================
        //==============================================================Verification of check status -> 'Reviewed But Denied' in transaction History screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber2, "Control Number 2")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Reviewed But Denied"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History grid view", ColHeader1, ColValue1)
        //==============================================================Verification of check status -> 'Reviewed But Denied' in transaction History screen ended==================================================================================
        //==============================================================Verification of check status -> 'Reviewed But Denied' in transaction screen started==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
        await t.wait(5000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRDReviewedButDenied, "CheckStatus TextBox");
        //==============================================================Verification of check status -> 'Reviewed But Denied' in transaction screen ended==================================================================================
    });

    /* Steps performed by AssureClaims_UserPrivilegeSetup_Test_09 :
         1. Login to Assure claims > Securities > user privilege setup
         2. Select LOB > General claim   
         3. Select Limit type > payment detail limit > disable Payment Detail Limits
         4. Select Limit type > Event Type Limits > enable Event Type Limits
         5. Select the ground user and Event Type and then Add
         6. Logout
     */
    test('AssureClaims_UserPrivilegeSetup_Test_09', async t => {
        //==============================================================Login to Assure claims > Securities > user privilege setup started==================================================================

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================
        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================
        //==============================================================Select Limit type > payment detail limit > disable Payment Detail Limits started==================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Pay Detail Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "Checked Enable Pay Detail Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > payment detail limit > disable Payment Detail Limits ended==================================================================
        //==============================================================Select Limit type > Event Type Limits > enable Event Type Limits started==================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Event Type Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Event Type Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > Event Type Limits > enable Event Type Limits ended==================================================================
        //==============================================================Select the ground user and Event started==================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUser, "Ground User")
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_EventType, "Event type Lookup")
        const ele_EventType = Event_POM.AssureClaims_EventCreation_Txt_SelectEventType.withText(data.EventType)
        await t.expect(ele_EventType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_EventType, "Event Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //==============================================================Select the ground user and Event ended==================================================================
        await t.wait(3000)
        //===================================== Logout ====================================================================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    });

    /* Steps performed by AssureClaims_EventCreation_Test_10 :
        1. Login Into Application with Ground User
        2. Event Creation
        3. Reserve Creation
    */
    test('AssureClaims_EventCreation_Test_10', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUser, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================
        //==================================================================Event Creation Starts Here=============================================================================================================

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_EventCreation Function is Called To Create Event".yellow);
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Event")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_EventFrame);
        await t.wait(7000)
        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_EventCreation_Txt_DateOfEvent, d, "Date Of Event")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_TimeOfEvent, "Time Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_EventCreation_Txt_DateReported, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_TimeReported, "Time Reported")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_EventStatus, "Event Status Lookup")
        const ele_EventStatus = Event_POM.AssureClaims_EventCreation_Txt_SelectEventStatus.withText(data.EventStatus)
        await t.expect(ele_EventStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_EventStatus, "Event Status Option")

        await Nav_Utility.AssureClaims_ElementClick_Utility(Event_POM.AssureClaims_EventCreation_Txt_EventType, "Event type Lookup")
        const ele_EventType = Event_POM.AssureClaims_EventCreation_Txt_SelectEventType.withText(data.EventType)
        await t.expect(ele_EventType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_EventType, "Event Type Option")

        await In_Utility.AssureClaims_SetValue_Utility(Event_POM.AssureClaims_EventCreation_Txt_ClaimInfo_Dept, data.Department, "Department selected")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Event creation Screen");
        await t.wait(10000)
        //==================================================================Verification for preventing Event Creation Starts Here=============================================================================================================
        let SaveMessageVerification = `Configured User Limit prevents saving events of type ${data.EventType}.`;
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
            SaveMessageVerification,
            true,
            "Verification for Prevention of Event Creation"
        );
        await t.wait(3000);

        //==================================================================Verification for preventing Event Creation Ends Here=============================================================================================================
        //==================================================================Event Creation Ends Here=============================================================================================================
    });

    /* Steps performed by AssureClaims_LoginWithUser_ReverseConfigManagerSetting_Test_11 :
         1. Login Into Application with with User
         2. Reversing Utilities Setting on Payment Parameter SetUp For Reserve
     */
    test('AssureClaims_LoginWithUser_ReverseConfigManagerSetting_Test_11', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
         await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Payment Parameter SetUp in Configuration strManager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_UseSupervisoryApproval, "UnCheck", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_PayDetailLimitsExceeded, "UnCheck", "Per Claim Pay Limits Exceeded Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration strManager ended================================================

    });

    /* Steps performed by AssureClaims_UserDeletion_Test_12 :
          1. Login Into Application with Ground User
          2. Deletion of Ground User
          3. Deletion of Manager User
      */
    test('AssureClaims_UserDeletion_Test_12', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Manager User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strManagerFirstName + " " + strManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Manager User ended===================================================================================
        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strGroundUserFirstName + " " + strGroundUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

    });

});


