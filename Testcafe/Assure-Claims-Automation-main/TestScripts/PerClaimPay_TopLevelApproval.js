import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_DiaryUtilities from '../Functional_POM/POM_DiaryUtilities';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_Home from '../Functional_POM/POM_Home';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_DiaryList from '../Functional_POM/POM_DiaryList';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const In_Utility = new Input_Utility();
const Diary_Utilities = new POM_DiaryUtilities();
const Verification_Msg = new POM_VerificationMessage();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const Diary_Creation = new POM_DiaryList();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-104786
//Description      : 1. Create 5 user & set limits for all the user
//                   2. Turn on supervisory Approval settings
//                   3. Create GC and Payment with amount 600
//                   4. Login with Top Level user , verify diary &  appove payment
//                   5. Login with User, verify diary & Payment status as "Released"
//                   6. Revert settings
//AUTHOR           : Muskan Garg
//DEPENDANCY       : No
//PRE-REQUISITES  :  None
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
var strTopManagerLastName = "Top_" + "" + faker.name.lastName();
var strTopManagerFirstName = "Top_" + "" + faker.name.firstName();
var strLOBManagerFirstName = "LOB_" + "" + faker.name.lastName();
var strLOBManagerLastName = "LOB_" + "" + faker.name.lastName();

var strClaimNumber
var strControlNumber;
var strSeniorManagerName
var strMidManagerName
var strGroundUserName
var strLOBManagerName
var strTopManagerName

DataIUT.forEach(data => {
    fixture`PerClaimPay_TopLevelApproval`.beforeEach(async t => {
        await t.wait(8000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01 :
    1) Login Into Application with User
    2) Creation of Senior Manager User
    3) Creation of Mid Level Manager User
    4) Creation of Ground User 
    5) Creation of LOB Manager User
    6) Creation of Top Level Manager User
    7) Security > user privilege setup
    8) Select LOB > General claim
    9) Select Limit type > Per claim pay Limit > enable Per claim pay limit
    10) Set Per claim pay limit for Senior, Mid , Ground user -> 100,200,300
    11) Do Additional setting for LOBManager & TopManager 
    12) Logout
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

        //==============================================================Creation of LOB Manager started=======================================================================================================
        strLOBManagerName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strLOBManagerLastName, strLOBManagerFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of LOB Manager ended========================================================================================================

        //==============================================================Creation of Top Manager started=======================================================================================================
        strTopManagerName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strTopManagerLastName, strTopManagerFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Top Manager ended========================================================================================================

        //============================================================== Securities > user privilege setup=========================================================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)

        //==============================================================Select LOB > General claim started===============================================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================================================

        //==============================================================Select Limit type > per claim pay limit > enable per claim pay Limit started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Pay Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "Check", "Checked Enable Per Claim Pay Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > per claim pay limit > enable per claim pay limit ended=============================================================

        //===================================================Set per claim pay limit for User 100$ started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set per claim pay limit for User 100$ ended here===============================================================================================================================================================================================

        //===================================================Set per claim pay limit for Mid Manager User 200$ started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidManagerFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "200", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set per claim pay limit for Mid Manager User 200$ ended here===============================================================================================================================================================================================

        //===================================================Set per claim pay limit for Senior Manager User 300$ started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSeniorManagerFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "300", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set per claim pay limit for Senior Manager User 300$ ended here===============================================================================================================================================================================================

        //===========================================Additional setting -> Select LOB -> GC -> Payment (500) -> select user (LOBManager) started here===============================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_AdditionalSetting, "additional setting")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Lst_SelectLOB, 'GC - General Claims', "Select LOB")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_UsernameLookup, "User look up button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SystemUser, "User button click")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Txt_FirstName.nth(2), strLOBManagerFirstName, "LOB manager name")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SearchButton.nth(2), "Search button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "Select row")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_OkButton, "Ok button")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Txt_PaymentMax, "500", "Payment max")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SaveButton, "Save button")
        await t.wait(2000)
        //===========================================Additional setting -> Select LOB -> GC -> Payment (500) -> select user (LOBManager) ended here ===============================================================================================================================================================================================

        //===========================================Additional setting -> Select LOB -> Top Level -> select user (TopManager) started here ===============================================================================================================================================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Lst_SelectLOB, 'Top Level', "Select LOB")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_UsernameLookup, "User look up button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SystemUser, "User button click")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Txt_FirstName.nth(2), strTopManagerFirstName, "Top manager name")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SearchButton.nth(2), "Search button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "Select row")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_OkButton, "Ok button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SaveButton, "Save button")
        await t.wait(2000)
        //===========================================Additional setting -> Select LOB -> Top Level -> select user (TopManager) ended here ===============================================================================================================================================================================================

        // ========================================================== Logout from the application starts here ================================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        // ========================================================== Logout from the application ends here ================================================================================================

    });

    /* Steps performed by AssureClaims_Configuration_SettingForSupervisory_Test_02:
    1) Check/Uncheck settings for Supervisory Per claim pay from Configuration manager
    */
    test('AssureClaims_ConfigurationSettingForSupervisory_Test_02', async t => {

        //==============================================================Login Into Application with User started==========================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, 'abkabk1', data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended==============================================================================================

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started========================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "Check", "Use Supervisory Approval")
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
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPayLimitsExceeded, "Check", "Per Claim Pay Limits Exceeded")
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
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalDiary, "Check", "Enable Payment Approval Diary")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalEmail, "UnCheck", "Enable Payment Approval Email")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryNotificationForUnapprovedEntity, "UnCheck", "Disable Diary Notification for Unapproved Entity")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(3000)
        //====================================================Setting over Payment Parameter SetUp in Configuration manager ended========================================================================

    });

    /*
    1)Login into claim zone
    2)Create claim
    3)Create a payment of amount 600
    4)Verify Hold reason over transaction history
    5)Verify approver over Financial Details History
    */
    test("AssureClaims_ClaimPaymentCreationAndVerifyPaymentStatusAndApprover_Test_03", async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${strGroundUserFirstName}`)
        //===================================================Login into claim ended here==================================================================================================================

        //===================================================Claim creation started here==================================================================================================================
        await t.wait(10000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
        //===================================================Claim creation ended here==================================================================================================================

        //===================================================Create payment ($600), verify payment goes on hold started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        var strSaveMessageVerification = "A hold requiring supervisory approval has been placed on this payment because Exceeded Per Claim Payment Limit.You do not have authority to pay more than $100.00 per claim.";
        strControlNumber = await Function_Utility.AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(data.BankAccount, data.PayeeType, data.LastName, 2, 1, "600", strSaveMessageVerification)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        //===================================================Create payment ($600), verify payment goes on hold ended here==================================================================================================================

        //===================================================Verify payment status as Hold started here==================================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const Header1 = ["Status"]
        const Val1 = ["Hold"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold", "Transaction History grid view", Header1, Val1)
        //===================================================Verify payment status as Hold ended here==================================================================================================================

        //===============================================Verification of Approver over Financial detail history Started Here========================================================================================================================================================================================================================================================================================================*/
        await t.wait(2000)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Reserve_Detailed_History, "Financial Detail History")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveHistroy_Txt_SearchControlNumber, strControlNumber, "Enter control number")
        const header1 = ["Approver", "Control #"]
        const val1 = [strTopManagerLastName + " " + strTopManagerFirstName, strControlNumber]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strTopManagerLastName + " " + strTopManagerFirstName, 'Transaction grid view', header1, val1);
        //=================================================Verification of Approver over Financial detail history ended Here========================================================================================================================================================================================================================================================================================================*/


        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /*
    1)Login into claim zone with TopManager
    2)Verify Diary
    3)Approve Payment
    4)Logout
    */
    test('AssureClaims_TopManagerVerifyDiaryAndApprovePayment_Test_04', async t => {


        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strTopManagerFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Middle Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //===================================================Verification of Payment approval diary for TopManager started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText1 = "Check On Hold - " + strControlNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText1), "Approval of Diary")
        const UserApprovalHead1 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal1 = [strTopManagerLastName + " " + strTopManagerFirstName, strGroundUserLastName + " " + strGroundUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strTopManagerLastName + " " + strTopManagerFirstName, "Diary grid view", UserApprovalHead1, UserApprovalVal1)
        //===================================================Verification of Payment approval diary for TopManager ended here==================================================================================================================

        //===============================verification of Payment getting Displayed on supervisory approval screen of TopManager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //==============================verification of Payment getting Displayed on supervisory approval screen of TopManager ended here==================================================================================================================

        //===================================================TopManager approved the Payment started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //===================================================TopManager approved the Payment ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into claim zone with user
    2)Verify Diary
    3)Verify Payment status 
    */
    test('AssureClaims_UserVerificationOfDiaryAndPaymentStatus_Test_05', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with User!!")
        //===================================================Login into claim started here==================================================================================================================

        await t.wait(15000)

        //===================================================Verfication of the Payment approved diary for the user started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText1 = "Check Approved - " + strControlNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText1), "Approve of Payment By MidManager")
        const UserApproveHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApproveVal = [strGroundUserLastName + " " + strGroundUserFirstName, strTopManagerLastName + " " + strTopManagerFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strGroundUserLastName + " " + strGroundUserFirstName, "Diary grid view", UserApproveHead, UserApproveVal)
        //===================================================Verfication of the Payment approved diary for the user ended here==================================================================================================================

        //===================================================Verfication of the approve payment status started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_Diary_Lnk_AttachRecord.withText("Claim:" + strClaimNumber), "Claim Number Link")
        await t.wait(4000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Released"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History grid view", ColHeader1, ColValue1)
        //===================================================Verfication of the approve payment status ended here==================================================================================================================

    });


    /*
    1)Uncheck settings for supervisory per claim pay from Configuration manager
    */
    test('AssureClaims_RevertConfigurationSettingForSupervisory_Test_06', async t => {

        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, 'abkabk1', data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================Uncheck Setting for supervisory Payment over Configuration manager started here======================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await t.wait(5000)
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

        //====================================Uncheck Setting for supervisory Payment over Configuration manager ended here==========================================================================================
    });

    /*
    1)Login to Security
    2)Revert setting for Per claim pay limit
    3)Logout
    */
    test("AssureClaims_RevertSecuritySetting_Test_07", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strGroundUserFirstName}`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Uncheck Per claim pay Limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Pay Limits', "Select Limit Type")

        //===================================================Remove Per claim pay limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUserFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        await t.wait(3000)
        //===================================================Remove Per claim pay limit for Ground User 100$ ended here==================================================================================================================

        //===================================================Remove Per claim pay limit for Mid User 200$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidManagerFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        await t.wait(2000)
        //===================================================Remove Per claim pay limit for Mid User 200$ ended here==================================================================================================================

        //===================================================Remove Per claim pay limit for Senior User 300$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSeniorManagerFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove Per claim pay limit for Senior User 300$ ended here==================================================================================================================

        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Enable Payment Limits")
        //===================================================Uncheck Per claim pay Limit ended here==================================================================================================================

        //===================================================Revert additional setting for LOB Manager started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_AdditionalSetting, "additional setting")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Lst_SelectLOB, 'GC - General Claims', "Select LOB")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Txt_PaymentMax, "0", "Payment max")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, "Username")
        await t.pressKey('ctrl+a delete')
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SaveButton, "Save button")
        await t.wait(2000)
        //===================================================Revert additional setting for LOB Manager ended here==================================================================================================================

        //===================================================Revert additional setting for Top Manager started here==================================================================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Lst_SelectLOB, 'Top Level', "Select LOB")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, "Username")
        await t.pressKey('ctrl+a delete')
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SaveButton, "Save button")
        await t.wait(2000)
        //===================================================Revert additional setting for Top Manager ended here==================================================================================================================


    });


    /* 
    1)Login Into Application 
    2)Deletion of Ground User
    3)Deletion of Mid User
    4)Deletion of Manager User
    5)Deletion of LOB Manager User
    6)Deletion of Top Manager User
    */
    test('AssureClaims_UserDeletion_Test_08', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(30000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To delete User".yellow);

        //==============================================================Deletion of Manager User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strSeniorManagerFirstName + " " + strSeniorManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Manager User ended===================================================================================

        //==============================================================Deletion of Mid User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strMidManagerFirstName + " " + strMidManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Mid User ended==================================================================

        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strGroundUserFirstName + " " + strGroundUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

        //==============================================================Deletion of LOB Manager started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strLOBManagerFirstName + " " + strLOBManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of LOB Manager ended==================================================================

        //==============================================================Deletion of Top Manager started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strTopManagerFirstName + " " + strTopManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Top Manager ended==================================================================


    });

});


