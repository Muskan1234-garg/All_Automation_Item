import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_Home from '../Functional_POM/POM_Home';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';

const DataIUT = require('../DataFiles/DataAutoRegDSN_1.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Verify_Utility = new Verification_Utility();
const In_Utility = new Input_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const ConfigMgr_POM = new POM_Config_Manager();
const Home_POM = new POM_Home();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Payment_POM = new POM_PaymentsCollections();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-104784
//Description      : 1. Create 4 user.
//                   2. set per claim pay limit for ground user & mid user  & senior user(100,200,300)
//                   3. Turn on supervisory Approval settings
//                   4. Create GC and two Reserve with Two Payment(one is under limit & other is beyond limit)
//                   5. Login with mid manager & approve payment which is not under his limit and verify hold msg
//                   6. Login with senior manager and verfy payment is visible
//                   7. Login with other user & approve payment 
//                   8. Login with Ground user and Verification of status -> "Reviewed but denied"
//                   9. Revert settings
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES  :  None
//Preferred Server : Auto reg env DSN-1 "RM202REG_Test1"
// *******************************************************************************************************************************

var faker = require('faker');

//Global Variable Declaration
var strSeniorManagerLastName = "Z1Sr_" + "" + faker.name.lastName();
var strSeniorManagerFirstName = "Z1Sr_" + "" + faker.name.firstName();
var strMidManagerLastName = "Z1Mid_" + "" + faker.name.lastName();
var strMidManagerFirstName = "Z1Mid_" + "" + faker.name.firstName();
var strGroundUserLastName = "Z1Grd_" + "" + faker.name.lastName();
var strGroundUserFirstName = "Z1Grd_" + "" + faker.name.firstName();
var strUserLastName = "Z1Usr_" + "" + faker.name.lastName();
var strUserFirstName = "Z1Usr_" + "" + faker.name.firstName();

var strClaimNumber;
var strControlNumber1;
var strControlNumber2;


DataIUT.forEach(data => {
    fixture`PerClaimPayLimit_SameModuleGroup`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });



    /* Steps performed by AssureClaims_UserCreation_Test_01 :
    1. Login Into Application with User
    2. Creation of Senior Manager User
    3. Creation of Mid Level Manager User
    4. Creation of Ground User with manager and Ground User without manager
    */
    test('AssureClaims_UserCreation_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);

        //==============================================================Creation of Senior Manager User started==================================================================
        var strSeniorManagerUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strSeniorManagerLastName, strSeniorManagerFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Senior Manager User ended==================================================================

        //==============================================================Creation of Mid Manager User started==================================================================
        var strMidManagerUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strMidManagerLastName, strMidManagerFirstName, strSeniorManagerFirstName + " " + strSeniorManagerLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Mid Manager User ended==================================================================

        //==============================================================Creation of Ground User started==================================================================
        var strGroundUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strGroundUserLastName, strGroundUserFirstName, strMidManagerFirstName + " " + strMidManagerLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Ground User ended==================================================================

        //==============================================================Creation of Other User started==================================================================
        var strUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strUserLastName, strUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Other User ended==================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /* Steps performed by AssureClaims_UserPrivilegeSetting_Test_02 :
    1. Log in With User
    2. Securities > user privilege setup
    3. Select LOB > General claim
    4. Select Limit type > per claim pay limit > enable per claim pay limit
    5. Select the ground user > amount(100) and Click on add
    6. Select the mid user > amount(200) and Click on add
    7. Select the senior user > amount(300) and Click on add
    8. Logout
    */
    test('AssureClaims_UserPrivilegeSetting_Test_02', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        //==============================================================Security > user privilege setup started==================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Security > user privilege setup ended==================================================================

        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================

        //==============================================================Select Limit type > per claim pay limit > enable per claim pay limit started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Pay Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "Check", "Checked Enable Per Claim Pay Limits")
        await t.wait(7000);
        //==============================================================Select Limit type >per claim pay limit > enable per claim pay Limit ended==================================================================

        //===================================================Set per claim pay Limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set per claim pay Limit for Ground User 100$ ended here==================================================================================================================

        //===================================================Set per claim pay Limit for Mid User 200$ started here==================================================================================================================
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidManagerLastName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "200", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set per claim pay Limit for Mid User 200$ ended here==================================================================================================================

        //===================================================Set per claim pay Limit for senior User 300$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSeniorManagerFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "300", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set per claim pay Limit for senior User 300$ ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /* Steps performed by AssureClaims_ConfigurationManager_SettingForSupervisory_Test_03 : 
    1)Check settings for supervisory reserve from Configuration manager
    */
    test('AssureClaims_ConfigurationManager_SettingForSupervisory_Test_03', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(15000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here===================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        //====================================================Setting over Payment Parameter SetUp in Configuration manager started here=====================================================================
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "Check", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queue Payments instead of Hold")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseCurrentAdjusterChain, "UnCheck", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove, "Check", "Allow Group of Supervisor to Approve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor, "Check", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentTimeFrame, "Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentSelectTimeFrame.find('span').withText('Days'), "Time frame")
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
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalDiary, "UnCheck", "Enable Payment Approval Diary")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalEmail, "UnCheck", "Enable Payment Approval Email")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryNotificationForUnapprovedEntity, "UnCheck", "Disable Diary Notification for Unapproved Entity")

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(3000)
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended here================================================
        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager ended here===================================================================================
    });

    /* Steps performed by AssureClaims_GCCreationAndPaymentCreation_Test_04 :
    1. Login Into Application with Ground User
    2. Corporate GC Creation
    3. Reserve Creation
    4. Payment Creation
    5. Verify Payment status over "Financial Detail History" screen
   */
    test('AssureClaims_GCCreationAndPaymentCreation_Test_04', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================

        //=====================================Corporate GC Creation started here===================================================================================================================================
        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/yyyy");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
        console.log("New Cooperate General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=====================================Corporate GC Creation completed here===================================================================================================================================

        //===========================================================First Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType_BI, data.ReserveAmount, data.ReserveStatus)
        //===========================================================First Reserve Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        //===========================================================First Payment Creation under user limit(100) Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select row")
        strControlNumber1 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_BI, "100");
        //===========================================================First Payment Creation under user limit(100) Completed Here========================================================================================================================================================================================================================================================================================================*/

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        //===========================================================Second Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_AddReserve, "Add Reserve")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_ReserveType, data.ReserveType_Ex, "Reserve Type")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_ReserveAmount, data.ReserveAmount.toString(), "Amount Type")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Lst_Status, data.ReserveStatus, "Reserve Status")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Reserve Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Reserve Creation Screen");
        //===========================================================Second Reserve Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        //===========================================================Second Payment Creation beyond user's limit Started Here========================================================================================================================================================================================================================================================================================================*/
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, data.ReserveType_Ex, "Enter Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select row")
        strControlNumber2 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_PD, "250");
        var strSaveMessageVerification = "A hold requiring supervisory approval has been placed on this payment because Exceeded Per Claim Payment Limit.You do not have authority to pay more than $100.00 per claim."
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification, true, "Hold status as reserve limit exceed")
        //===========================================================Second Payment Creation beyond user's limit Completed Here========================================================================================================================================================================================================================================================================================================*/

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        //===========================================================Verification of payment status over Financial detail history Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Reserve_Detailed_History, "Financial Detail History")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);

        //===========================================================Verification of First payment status as "Released Payment" as it is under user's limit over Financial detail history Started Here========================================================================================================================================================================================================================================================================================================*/
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveHistroy_Txt_SearchControlNumber, strControlNumber1, "Enter control number")
        const header1 = ["Status", "Control #"]
        const val1 = ["Released Payment", strControlNumber1]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released Payment", 'Transaction grid view', header1, val1);
        //===========================================================Verification of First payment status as "Released Payment" as it is under user's limit over Financial detail history ended Here========================================================================================================================================================================================================================================================================================================*/

        //===========================================================Verification of second payment status as "Released Payment" as it is beyond user's limit over Financial detail history Started Here========================================================================================================================================================================================================================================================================================================*/
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveHistroy_Txt_SearchControlNumber, strControlNumber2, "Enter control number")
        const header2 = ["Status", "Control #"]
        const val2 = ["Hold Payment", strControlNumber2]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Hold Payment", 'Transaction grid view', header2, val2);
        //===========================================================Verification of second payment status as "Released Payment" as it is beyond user's limit over Financial detail history ended Here========================================================================================================================================================================================================================================================================================================*/
        //===========================================================Verification of payment status over Financial detail history ended Here========================================================================================================================================================================================================================================================================================================*/

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /* Steps performed by AssureClaims_MidManagerApprovePaymentAndVerifyHoldMsg_Test_05 :
    1. Login Into Application with Mid Manager User
    2. Funds > Supervisory Approval > Payment 
    3. Approve 2nd Payment & verify payment goes on hold
    4. Logout
    */
    test('AssureClaims_MidManagerApprovePaymentAndVerifyHoldMsg_Test_05', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strMidManagerFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Middle Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================Verification of Payment getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")

        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const Header2 = ["Claim Number", "Hold Reason"]
        const Value2 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header2, Value2)
        //============================Verification of Payment getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================

        //===================================================MidManager approved the Payment,it is not within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //===================================================MidManager approved the Payment,it is not within his limit ended here==================================================================================================================

        //===================================================Verification of msg "exceeds user's per claim pay limit" started here==================================================================================================================
        var strLimitMessageVerification = "Control Number: " + strControlNumber2 + ", Amount exceeds user's per claim pay limit. It is submitted to User's manager for approval."
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strLimitMessageVerification, true, "Hold status as per claim pay limit exceed")
        //===================================================Verification of msg "exceeds user's per claim pay limit" ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /* Steps performed by AssureClaims_SeniorManagerVerificationOfSecondPayment_Test_06 :
    1. Login Into Application with Senior Manager User
    2. Funds > Supervisory Approval > Payment > Verify 2nd Payment is present which in under senior  manager's limit
    3. Logout
    */
    test('AssureClaims_SeniorManagerVerificationOfSecondPayment_Test_06', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSeniorManagerFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with senior Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================verification of Payment getting Displayed on supervisory approval screen of Senior Manager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //============================verification of Payment getting Displayed on supervisory approval screen of Senior Manager ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /* Steps performed by AssureClaims_OtherUserVerifyAndRejectSecondPayment_Test_07 :
    1. Login Into Application with other User
    2. Funds > Supervisory Approval > Payment > Verify 2nd payment is present
    3. Reject Payment
    4. Logout
    */
    test('AssureClaims_OtherUserVerifyAndRejectSecondPayment_Test_07', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with another user !!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================Verification of payment getting Displayed on supervisory approval screen of other user started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_PaymentGroup, "Group button")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, strControlNumber2, "Enter Control Number")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Per Claim Payment Limit"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Payment Supervisory Approval", Header1, Value1)
        //============================Verification of ppayment getting Displayed on supervisory approval screen of other user ended here==================================================================================================================

        //===================================================Other user Reject the Payment started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayRejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //===================================================Other user Reject the Payment ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /* Steps performed by AssureClaims_GroundUserVerifyReserveStatusAsOpen_Test_08 :
    1. Login Into Application with ground User
    2. Verify reserve status is "Reviewed But Denied"
    3. Logout
    */
    test('AssureClaims_GroundUserVerifyReserveStatusAsOpen_Test_08', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Ground user!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        await t.wait(2000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")

        //======================================================Verification of status over transaction history screen started here=========================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Transaction_Btn_TransactionHistory, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber2, "Control Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Reviewed But Denied"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History Screen", ColHeader1, ColValue1)
        //======================================================Verification of status over transaction history screen started  completed here=========================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /* Steps performed by AssureClaims_LoginWithUser_ReverseConfigManagerSetting_Test_09 :
    1. Login Into Application with with User
    2. Reversing Setting on Payment Parameter SetUp For Reserve
    */
    test('AssureClaims_LoginWithUser_ReverseConfigManagerSetting_Test_09', async t => {
        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here===================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")
        //====================================================Setting over Payment Parameter SetUp in Configuration manager started here=====================================================================
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "UnCheck", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "UnCheck", "Allow the group of supervisor to approve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame, "Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame.find('span').withText('Days'), "Select Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_ReserveDaysHoursForApproval.find('input'), "0", "Days/Hours For Approval")
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
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended here================================================
        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager ended here===================================================================================
    });

    /* Steps performed by AssureClaims_RevertSecuritySetting_Test_10
    1. Login to Security
    2. Remove limit for all users
    3. UnCheck per claim pay limit 
    4. Logout
    */
    test('AssureClaims_RevertUserPrivilegeSetting_Test_010', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        //==============================================================Security > user privilege setup started here==================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Security > user privilege setup ended here==================================================================

        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================

        //==============================================================Select Limit type > per claim pay limit > enable per claim pay Limits started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Pay Limits', "Select Limit Type")
        //==============================================================Select Limit type > per claim pay limit > enable per claim pay Limits ended==================================================================

        //===================================================Remove per claim pay limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUserFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove per claim pay limit for Ground User 100$ ended here==================================================================================================================

        await t.wait(3000)

        //===================================================Remove per claim pay limit for Mid User 200$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidManagerLastName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove per claim pay limit for Mid User 200$ ended here==================================================================================================================
        await t.wait(2000)

        //===================================================Remove per claim pay limit for Senior User 300$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSeniorManagerFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove per claim pay limit for Senior User 300$ ended here==================================================================================================================
        await t.wait(2000)

        //===================================================Uncheck per claim pay limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "UnCheck", "Checked Enable Per Claim Pay Limits")
        await t.wait(3000)
        //===================================================Uncheck per claim pay limit ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /* Steps performed by AssureClaims_UserDeletion_Test_11 :
    1. Login Into Application with User
    2. Deletion of Ground Users
    3. Deletion of Manager Users
    */
    test('AssureClaims_UserDeletion_Test_011', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Senior Manager User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strSeniorManagerFirstName + " " + strSeniorManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Senior Manager User ended===================================================================================   

        //==============================================================Deletion of Mid Manager User started====================================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strMidManagerFirstName + " " + strMidManagerLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Mid Manager User ended===================================================================================

        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strGroundUserFirstName + " " + strGroundUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

        //==============================================================Deletion of Other User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Other User ended==================================================================

    });


});
