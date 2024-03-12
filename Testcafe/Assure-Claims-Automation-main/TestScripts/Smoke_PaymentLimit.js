import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_Home from '../Functional_POM/POM_Home';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_DiaryList from '../Functional_POM/POM_DiaryList';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_DiaryUtilities from '../Functional_POM/POM_DiaryUtilities';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';


const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Diary_Utilities = new POM_DiaryUtilities();
const Verification_Msg = new POM_VerificationMessage();
const Diary_Creation = new POM_DiaryList();
const Payment_POM = new POM_PaymentsCollections();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Home_POM = new POM_Home();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const ConfigMgr_POM = new POM_Config_Manager();


var faker = require('faker');

//Global Variable Declaration


var strSrLastName = "Sr_" + "" + faker.name.lastName();
var strSrFirstName = "Sr_" + "" + faker.name.firstName();
var strMidLastName = "Mid_" + "" + faker.name.lastName();
var strMidFirstName = "Mid_" + "" + faker.name.firstName();
var strUserLastName = "Usr_" + "" + faker.name.lastName();
var strUserFirstName = "Usr_" + "" + faker.name.firstName();
var strClaimNumber;
var strControlNumber1;
var strControlNumber2;
var strControlNumber3;
var strControlNumber4;


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-82373,RMA-82831
//Description      :Successful Set Payment Limits At User And Validate It On Supervisory Chain
// Created Payment On Hold When Payment Limits Exceed
// Manager's Authority To Either Able To Approve Or Not The Payment Based On Payment Limit
// Revert the SA setup done in first test case
//AUTHOR           : Muskan Garg
//DEPENDANCY       : No
//PRE-REQUISITE    : None
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
// *******************************************************************************************************************************

DataIUT.forEach(data => {
    fixture`Smoke_PaymentLimit`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /*
    1)Login to Security
    2)Create 3 users
    3)Logout
    */
    test('AssureClaims_UserCreation_Test_01', async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //===================================================Logged into security===============================================================================================================================

        //===================================================Creating 3 users started here==================================================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strSrLastName, strSrFirstName, "NA", "NA", data.DSN, data.ModuleName)
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strMidLastName, strMidFirstName, strSrFirstName + " " + strSrLastName, "NA", data.DSN, data.ModuleName)
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strUserLastName, strUserFirstName, strMidFirstName + " " + strMidLastName, "NA", data.DSN, data.ModuleName)
        //===================================================Creating 3 users ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Check/Uncheck settings for supervisory reserve from Configuration manager
    */
    test('AssureClaims_LoginWithUserIntoConfiguration_SettingForSupervisory_Test_02', async t => {

        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Uncheck Setting for supervisory reserve over Configuration manager started here================================================
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
        //====================================================Uncheck Setting for supervisory reserve over Configuration manager ended here===================================================================================

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here===================================================================================
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Payment")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Supervisory Approval")

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
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalDiary, "Check", "Enable Payment Approval Diary")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalEmail, "UnCheck", "Enable Payment Approval Email")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryNotificationForUnapprovedEntity, "UnCheck", "Disable Diary Notification for Unapproved Entity")

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(3000)

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager ended here===================================================================================
    });

    /*
    1)Login to Security
    2)Set payment limit for users
    3)Logout
    */
    test("AssureClaims_SecuritySetting_Test_03", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Set Payment Limit for all Users started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Payment Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Payment Limits")

        //===================================================Set Payment Limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set Payment Limit for Ground User 100$ ended here==================================================================================================================

        //===================================================Set Payment Limit for Mid User 200$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "200", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set Payment Limit for Mid User 200$ ended here==================================================================================================================

        //===================================================Set Payment Limit for Senior User 300$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSrFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "300", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set Payment Limit for Senior User 300$ ended here==================================================================================================================

        //===================================================Set Payment Limit for all Users ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });


    /*
    1)Login into claim zone
    2)Create claim
    3)Create 4 payment above than user limit
    4)Verify Hold reason & Reserve type over My Work->My Pending Transactions
    */
    test("AssureClaims_ClaimPaymentCreation_Test_04", async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into claim ended here==================================================================================================================

        //===================================================Claim creation started here==================================================================================================================
        await t.wait(10000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
        //===================================================Claim creation ended here==================================================================================================================


        //===================================================Create 1st payment ($105), verify payment goes on hold started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        strControlNumber1 = await Function_Utility.AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(data.BankAccount, data.PayeeType, data.LastName, 2, 1, "105", Verification_Msg.ExceedPaymentLimitsOnHold)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        //===================================================Create 1st payment ($105), verify payment goes on hold ended here==================================================================================================================


        //===================================================Create 2nd payment ($105), verify payment goes on hold started here==================================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        strControlNumber2 = await Function_Utility.AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(data.BankAccount, data.PayeeType, data.LastName, 5, 1, "105", Verification_Msg.ExceedPaymentLimitsOnHold)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        //===================================================Create 2nd payment ($105), verify payment goes on hold ended here==================================================================================================================


        //===================================================Create 3rd payment ($210), verify payment goes on hold started here==================================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        strControlNumber3 = await Function_Utility.AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(data.BankAccount, data.PayeeType, data.LastName, 7, 1, "210", Verification_Msg.ExceedPaymentLimitsOnHold)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        //===================================================Create 3rd payment ($210), verify payment goes on hold ended here==================================================================================================================


        //===================================================Create 4th payment ($210), verify payment goes on hold started here==================================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        strControlNumber4 = await Function_Utility.AssureClaims_PaymentCorpAdditionWithSaveMessageVerification_Utility(data.BankAccount, data.PayeeType, data.LastName, 9, 1, "210", Verification_Msg.ExceedPaymentLimitsOnHold)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        //===================================================Create 4th payment ($210), verify payment goes on hold ended here==================================================================================================================


        //===================================================Verify 1st payment status as Hold started here==================================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber1, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const Header1 = ["Status"]
        const Val1 = ["Hold"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold", "Transaction History grid view", Header1, Val1)
        //===================================================Verify 1st payment status as Hold ended here==================================================================================================================


        //===================================================Verify 2nd payment status as Hold started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber2, "Control Number 2")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const Header2 = ["Status"]
        const Val2 = ["Hold"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold", "Transaction History grid view", Header2, Val2)
        //===================================================Verify 2nd payment status as Hold ended here==================================================================================================================


        //===================================================Verify 3rd payment status as Hold started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber3, "Control Number 3")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const Header3 = ["Status"]
        const Val3 = ["Hold"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold", "Transaction History grid view", Header3, Val3)
        //===================================================Verify 3rd payment status as Hold ended here==================================================================================================================


        //===================================================Verify 4th payment status as Hold started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber4, "Control Number 4")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const Header4 = ["Status"]
        const Val4 = ["Hold"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold", "Transaction History grid view", Header4, Val4)
        //===================================================Verify 1st payment status as Hold ended here==================================================================================================================


        //===================================================Verification of 1st record on my pending transaction screen started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber1, "Enter Control Number")
        const ColHeader1 = ["Hold Reason"]
        const ColValue1 = ["Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        //===================================================Verification of 1st record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 2nd record on my pending transaction screen started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const ColHeader2 = ["Hold Reason"]
        const ColValue2 = ["Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader2, ColValue2)
        //===================================================Verification of 2nd record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 3rd record on my pending transaction screen started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber3, "Enter Control Number")
        const ColHeader3 = ["Hold Reason"]
        const ColValue3 = ["Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader3, ColValue3)
        //===================================================Verification of 3rd record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 4th record on my pending transaction screen started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber4, "Enter Control Number")
        const ColHeader4 = ["Hold Reason"]
        const ColValue4 = ["Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader4, ColValue4)
        //===================================================Verification of 4th record on my pending transaction screen ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /*
    1)Login into claim zone with MidManager
    2)Verify Diaries
    3)Approve & reject payment which is under miduser limit
    4)Approve payment which is not under miduser limit
    5)Logout
    */
    test('AssureClaims_MidMgrApproveRejectPayment_Test_05', async t => {


        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strMidFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Middle Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //===================================================Verification of 1st Payment approval diary for MidManager started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText1 = "Check On Hold - " + strControlNumber1
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText1), "Approval of Diary")
        const UserApprovalHead1 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal1 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead1, UserApprovalVal1)
        //===================================================Verification of 1st Payment approval diary for MidManager ended here==================================================================================================================

        //===================================================Verification of 2nd Payment approval diary for MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber2, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText2 = "Check On Hold - " + strControlNumber2
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText2), "Approval of Diary")
        const UserApprovalHead2 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal2 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead2, UserApprovalVal2)
        //===================================================Verification of 2nd Payment approval diary for MidManager ended here==================================================================================================================


        //===================================================Verification of 3rd Payment approval diary for MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber3, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText3 = "Check On Hold - " + strControlNumber3
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText3), "Approval of Diary")
        const UserApprovalHead3 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal3 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead3, UserApprovalVal3)
        //===================================================Verification of 3rd Payment approval diary for MidManager ended here==================================================================================================================

        //==================================================Verification of 4th Payment approval diary for MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber4, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText4 = "Check On Hold - " + strControlNumber4
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText4), "Approval of Diary")
        const UserApprovalHead4 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal4 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead4, UserApprovalVal4)
        //===================================================Verification of 4th Payment approval diary for MidManager ended here==================================================================================================================

        //===============================verification of Payment getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        //MidManager Payment Approval
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber1, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //==============================verification of Payment getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================

        //===================================================MidManager approved the Payment as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //===================================================MidManager approved the Payment as it is within his limit ended here==================================================================================================================

        //===============================verification of Payment getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const Header2 = ["Claim Number", "Hold Reason"]
        const Value2 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header2, Value2)
        //===============================verification of Payment getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================

        //===================================================MidManager Reject the Payment as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayRejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //===================================================MidManager Reject the Payment as it is within his limit ended here==================================================================================================================

        //=================================verification of Payment getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber3, "Enter control number")
        await t.wait(2000)
        const Header3 = ["Claim Number", "Hold Reason"]
        const Value3 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header3, Value3)
        //==================================verification of Payment getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================

        //==========================================MidManager can not approved the Payment as it is not within his limit  started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Trying To Approve The Payment", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        var LimitMessageVerification = "Control Number: " + strControlNumber3 + ", Amount exceeds user's payment limit. It is submitted to User's manager for approval."
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(LimitMessageVerification, true, "Hold status as Payment limit exceed")
        //=========================================MidManager can not approved the Payment as it is not within his limit ended here==================================================================================================================

        //===============================verification of Payment getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber4, "Enter Control Number")
        await t.wait(2000)
        const Header4 = ["Claim Number", "Hold Reason"]
        const Value4 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header4, Value4)
        //================================verification of Payment getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================

        //===========================================MidManager Trying to Approve the Payment as it is not within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Approve Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Trying to approve the Payment", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        var LimitMessageVerification1 = "Control Number: " + strControlNumber4 + ", Amount exceeds user's payment limit. It is submitted to User's manager for approval."
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(LimitMessageVerification1, true, "Hold status as Payment limit exceed")
        //==========================================MidManager Trying to Approve the Payment as it is not within his limit  ended here==================================================================================================================

        //===================================================Verify No Records Aval started here==================================================================================================================
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
        //===================================================Verify No Records Aval ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });


    /*
    1)Login into claim zone with SeniorManager
    2)Verify Diaries
    3)Approve & reject payment which is under senior user limit
    4)Logout
    */
    test('AssureClaims_SeniorManagerApproveRejectPayment_Test_06', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSrFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Senior Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //===================================================Verification of Payment approve by SeniorManager started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber3, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText1 = "Check On Hold - " + strControlNumber3
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText1), "Approval of Payment By SeniorManager")
        const SrManagerApprovalHead1 = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerApprovalVal1 = [strSrLastName + " " + strSrFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strSrLastName + " " + strSrFirstName, "Diary grid view", SrManagerApprovalHead1, SrManagerApprovalVal1)
        //===================================================Verification of Payment approve by SeniorManager ended here==================================================================================================================

        //===================================================Verification of Payment approval by SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber4, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText2 = "Check On Hold - " + strControlNumber4
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText2), "Approval of Payment By MidManager")
        const SrManagerApprovalHead2 = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerApprovalVal2 = [strSrLastName + " " + strSrFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strSrLastName + " " + strSrFirstName, "Diary grid view", SrManagerApprovalHead2, SrManagerApprovalVal2)
        //===================================================Verification of Payment approval by SeniorManager ended here==================================================================================================================

        //========================verification of Payment getting Displayed on supervisory approval screen of SeniorManager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber3, "Enter Control Number")
        const ColHeader1 = ["Claim Number", "Hold Reason"]
        const ColValue1 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", ColHeader1, ColValue1)
        //========================verification of Payment getting Displayed on supervisory approval screen of SeniorManager ended here==================================================================================================================

        //===================================================SeniorManager approved the Payment as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Approve The Payment", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //===================================================SeniorManager approved the Payment as it is within his limit ended here==================================================================================================================


        //==============================verification of Payment getting Displayed on supervisory approval screen of SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber4, "Enter Control Number")
        const ColHeader2 = ["Claim Number", "Hold Reason"]
        const ColValue2 = [strClaimNumber, "Exceeded Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", ColHeader2, ColValue2)
        //==============================verification of Payment getting Displayed on supervisory approval screen of SeniorManager ended here==================================================================================================================

        //===================================================SeniorManager Reject the Payment as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayRejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //===================================================SeniorManager Reject the Payment as it is within his limit ended here==================================================================================================================


        //===================================================Verify No Records Aval started here==================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
        //===================================================Verify No Records Aval ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /*
    1)Login into claim zone with Ground user
    2)Verify Diaries
    3)Verify reserve status over financial/reserve screen
    */
    test('AssureClaims_UserVerification_Test_07', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with User!!")
        //===================================================Login into claim started here==================================================================================================================

        await t.wait(15000)

        //===================================================Verfication of the Payment approved diary for the user started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText1 = "Check Approved - " + strControlNumber1
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText1), "Approve of Payment By MidManager")
        const UserApproveHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApproveVal = [strUserLastName + " " + strUserFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", UserApproveHead, UserApproveVal)
        //===================================================Verfication of the Payment approved diary for the user ended here==================================================================================================================


        //===================================================Verfication of the Payment Rejected diary for the user started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber2, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryTextRej1 = "Check Denied - " + strControlNumber2
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryTextRej1), "Reject of Payment By MidManager")
        const UserRejectHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserRejectVal = [strUserLastName + " " + strUserFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", UserRejectHead, UserRejectVal)
        //===================================================Verfication of the Payment Rejected diary for the user ended here==================================================================================================================

        //===================================================Verification of Payment approve by SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber3, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText2 = "Check Approved - " + strControlNumber3
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText2), "Approve of Payment By MidManager")
        const SrManagerApproveHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerApproveVal = [strUserLastName + " " + strUserFirstName, strSrLastName + " " + strSrFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", SrManagerApproveHead, SrManagerApproveVal)
        //===================================================Verification of Payment approve by SeniorManager ended here==================================================================================================================

        //===================================================Verification of Payment Reject by SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strControlNumber4, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryTextRej2 = "Check Denied - " + strControlNumber4
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryTextRej2), "Reject of Payment By SeniorManager")
        const SrManagerRejectHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerRejectVal = [strUserLastName + " " + strUserFirstName, strSrLastName + " " + strSrFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", SrManagerRejectHead, SrManagerRejectVal)
        //==================================================Verification of Payment Reject by SeniorManager ended here==================================================================================================================

        //===================================================Verfication of the approve (1st)payment status started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_Diary_Lnk_AttachRecord.withText("Claim:" + strClaimNumber), "Claim Number Link")
        await t.wait(4000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber1, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Released"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History grid view", ColHeader1, ColValue1)
        //===================================================Verfication of the approve (1st)payment status ended here==================================================================================================================

        //===================================================Verfication of the reject (2nd)payment status started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber2, "Control Number 2")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader2 = ["Status"]
        const ColValue2 = ["Reviewed But Denied"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History grid view", ColHeader2, ColValue2)
        //===================================================Verfication of the reject (2nd)payment status ended here==================================================================================================================

        //===================================================Verfication of the approve (3rd)payment status here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber3, "Control Number 3")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader3 = ["Status"]
        const ColValue3 = ["Released"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History grid view", ColHeader3, ColValue3)
        //===================================================Verfication of the approve (3rd)payment status ended here==================================================================================================================

        //===================================================Verfication of the reject (4th)payment status started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber4, "Control Number 4")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader4 = ["Status"]
        const ColValue4 = ["Reviewed But Denied"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History grid view", ColHeader4, ColValue4)
        //===================================================Verfication of the reject (4th)payment status ended here==================================================================================================================

    });

    /*
    1)Uncheck settings for supervisory reserve from Configuration manager
    */
    test('AssureClaims_LoginWithUserIntoConfiguration_RevertSettingForSupervisory_Test_08', async t => {

        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================
    
        //====================================Uncheck Setting for supervisory reserve over Configuration manager started here======================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "UnCheck", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "UnCheck", "Allow the group of supervisor to approve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame,"Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame.find('span').withText('Days'),"Select Time frame")
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
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentTimeFrame,"Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentSelectTimeFrame.find('span').withText('Days'),"Time frame")
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
    2)UnCheck reserve limit 
    3)Logout
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
        
          //===================================================Remove payment limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove payment limit for Ground User 100$ ended here==================================================================================================================

        await t.wait(3000)

        //===================================================Remove payment limit for Mid User 200$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove payment limit for Mid User 200$ ended here==================================================================================================================
        await t.wait(2000)

        //===================================================Remove payment limit for Senior User 300$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSrFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove payment limit for Senior User 300$ ended here==================================================================================================================
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Enable Payment Limits")
       
        //===================================================Uncheck Payment Limit ended here==================================================================================================================
    });


    /* 
      1)Login Into Application 
      2)Deletion of Ground User
      3)Deletion of Mid User
      4)Deletion of Manager User
  */
    test('AssureClaims_UserDeletion_Test_010', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(30000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Manager User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strSrFirstName + " " + strSrLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Manager User ended===================================================================================

        //==============================================================Deletion of Mid User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strMidFirstName + " " + strMidLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Mid User ended==================================================================

        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

    });

});

