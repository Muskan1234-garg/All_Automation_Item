import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_Home from '../Functional_POM/POM_Home';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataSTG = require('../DataFiles/DataAutoRegDSN_2.json');
const Maint_Utility = new Maintenance_Functionality_Utility();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const In_Utility = new Input_Utility();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Home_POM = new POM_Home();
const Verify_Utility = new Verification_Utility();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const Reserve_Utility = new POM_FinancialReserves();
const GenSysPara_POM = new POM_GeneralSystemParameter();
const ConfigMgr_POM = new POM_Config_Manager();


var faker = require('faker');

var SrLastName = "Sr_" + "" + faker.name.lastName();
var SrFirstName = "Sr_" + "" + faker.name.firstName();
var UserLastName = "Usr_" + "" + faker.name.lastName();
var UserFirstName = "Usr_" + "" + faker.name.firstName();

var StrClaimNumber;
var StrControlNumber2;
var StrControlNumber3;
var StrControlNumber4;
var ExpectedStatus = "Q Queued Payment";
var SaveMessageVerification = "Payment has been queued and requires supervisory approval because: The amount of this payment exceeds the user's limit and requires managerial approval.";
const ColHeader1 = ["Hold Reason"]
const ColValue1 = ["Exceeded Payment Limit"]



// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-90825, RMA-90881,RMA-98974	
//Description      : SCENARIO OF THE STORY(POINTER)
//AUTHOR           : Muskan Garg
//DEPENDANCY       : No
//PRE-REQUISITE    : Payment limit should be off in security zone.
// Payament Parameter setup -> Supervisory tab -> Payment Limits Are Exceeded, Queue Payments Instead Of Placing On Hold,
// Supervisory Approval should be off.
// General System Parameter -> Use Entity Payment Approval Check Box should be off.
// data.Lastname should be approved entity.
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
// *******************************************************************************************************************************

DataSTG.forEach(data => {
    fixture`Smoke_QueuedPayment_Config`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /*
    1)Login into Claim zone
    2)Claim Creation
    3)Reserve Creation
    4)Payment Creation,Check Status as Queued Payment, Verify Control number
    5)Verify Void Checkbox is checked 
    6)Verify Bank Account is in disabled state, amount is in disabled state
    7)Verify over Transaction history, Payment status is as Queued Payment
    8)Set Check status as Released
    9)Verify Void check is unchecked.
    10)Verify Bank account is in Enable state
    11)Verify Amount is in Enable state
    */
    test('AssureClaims_ClaimPaymentCreationWithoutQueuedPaymentSetting_Test_01', async t => {

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //Login Into Application!!

        //===================================================================Claim Creation Started Here==============================================================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + StrClaimNumber)
        //===================================================================Claim Creation Completeed Here==============================================================================================

        //===================================================================Reserve Creation Started Here==============================================================================================
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
        //===================================================================Reserve Creation Started Here==============================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")

        //===================================================================Payment Creation Started Here==============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
        await t.wait(1000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, data.PayeeType, "Payee Type")
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName, "Last Name Text Box On Payment Creation Screen")
        await t.wait(4000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').nth(1), "Transaction Type")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, data.Amount, "Transaction Amount On Funds Split Detail Screen")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_statusLookup, "Check Status");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_SelectStatus.withText('Queued Payment'), "Check Status as Queued Payment");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await t.wait(3000)
        var StrControlNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        console.log("StrControlNumber is :" + StrControlNumber);
        //===================================================================Payment Creation Completed Here==============================================================================================

        //===================================================================Verify-->Void Checkbox,Transaction History Screen,When Check Status is Queued Payment Started Here==============================================================================================
        await Verify_Utility.AssureClaims_CheckedUncheckedStateVerification_Utility(Payment_POM.AssureClaims_QueuedPayment_Checkbox_Void, 'Checked', "Void Checkbox is already checked");
        await Verify_Utility.AssureClaims_EnbDisbStateVerify_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, 'Disable', "Bank Account is disabled");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_Edit, "Transaction split edit button");
        await Verify_Utility.AssureClaims_EnbDisbStateVerify_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, 'Disable', "Amount is disabled");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_Close, "Close")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(3000)
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Queued Payment"]
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Queued Payment", "Transaction History Screen", ColHeader1, ColValue1)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_done.withText("done"), "Done with ok")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        //===================================================================Verify-->Void Checkbox,Transaction History Screen,When Check Status is Queued Payment Cpmpleted Here==============================================================================================

        //===================================================================Verify-->Void Checkbox,Transaction History Screen,When Check Status is Released Payment Started Here==============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_statusLookup, "Check Status");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_SelectStatus.withText('Released'), "Check Status as Released Payment");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await t.wait(8000)
        await Verify_Utility.AssureClaims_CheckedUncheckedStateVerification_Utility(Payment_POM.AssureClaims_QueuedPayment_Checkbox_Void, 'Unchecked', "Void Checkbox is Unchecked");
        await Verify_Utility.AssureClaims_EnbDisbStateVerify_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, 'Enable', "Bank Account is Enabled");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_Edit, "Transaction split edit button");
        await Verify_Utility.AssureClaims_EnbDisbStateVerify_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, 'Enable', "Amount is Enabled");
        //===================================================================Verify-->Void Checkbox,Transaction History Screen,When Check Status is Released Payment Completed Here==============================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into Security
    2)Created 2 user {Manager User, Ground User}
    3)Set Ground user Payment limit as 100
    */
    test('AssureClaims_UserCreationAndSetPaymentLimit_Test_02', async t => {


        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)

        //===================================================================User Creation Started Here==============================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", SrLastName, SrFirstName, "NA", "NA", data.DSN, data.ModuleName)
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", UserLastName, UserFirstName, SrFirstName + " " + SrLastName, "NA", data.DSN, data.ModuleName)
        //===================================================================User Creation Completed Here==============================================================================================

        //===================================================================Security->User Privilege Setup -->Setting Limit Started Here==============================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Payment Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "Check", "Checked Enable Payment Limits")
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, UserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button");
        //===================================================================Security->User Privilege Setup -->Setting Limit Completed Here==============================================================================================

    });

    /*
    1)Login into Configuration Manager
    2)Checked setting :-Payment Limits Are Exceeded,Queue Payments instead of Hold
    Use Supervisory Approval,Use Entity Payment Approval
    */


    test('AssureClaims_TurnOnSettingFromConfigurationManager_Test_03', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "Check", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "Check", "Queue Payments instead of Hold")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseCurrentAdjusterChain, "UnCheck", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove, "UnCheck", "Allow Group of Supervisor to Approve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor, "UnCheck", "Notify The Immediate Supervisor")
    
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentTimeFrame,"Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_PaymentSelectTimeFrame.find('span').withText('Days'),"Time frame")
    
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentZeroAsValidValueForEscalation, "UnCheck", "0 as Valid value for Escalation")
    
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentCheckLimitsForManualPayments, "UnCheck", "Check Limits for Manual Payments")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed, "Check", "Payment Limits Are Exceeded")
    
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPayLimitsExceeded, "UnCheck", "Per Claim Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPerPolicyPayLimitsExceeded, "UnCheck", "Per Claim Per Policy Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerClaimPerCoveragePayLimitsExceeded, "UnCheck", "Per Claim Per Coverage Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PerFinancialKeyPayLimitsExceeded, "UnCheck", "Per Financial Key Pay Limits Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentDetailLimitsAreExceeded, "UnCheck", "Payment Detail Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PayeeDoesNotExistInSystem, "UnCheck", "Payee does Not Exist in System")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "Check", "Use Entity Payment Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(10000);
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================

    });


    /*
    1)Login into MaintenanceZone
    2)Create Entity
    3)Switch to Claim zone
    4)Search Created Claim
    5)Create Payment of amount 50 and choose entity that we have created (unapproved entity), Verify Payment has been queued
    6)Verify over Transaction history, Payment status is as Queued Payment
    7)Logout
    */

    test('AssureClaims_EntityCreationAndCreatePaymentWithUnAprrovedEntity_Test_04', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(UserFirstName, 'abkabk1', data.DSN, 'Maintenance')
        console.log(`Login Into Application with ${UserFirstName}`)
        //Login Into Application with User

        //===================================================================Entity Creation from Maintenance Started here==============================================================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
        var EntityName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
        console.log("New Entity is Created with Last Name: ".green + EntityName);
        //New Entity Is Created
        //===================================================================Entity Creation from Maintenance Completed here==============================================================================================


        await t.wait(10000)
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(20000);
        //Zone Switched to Claim


        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================


        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        var StrControlNumber1 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, EntityName, data.TransactionType, data.PaymentAmount)
        console.log("New Payment is Created " + StrControlNumber1);
        var SaveMessageVerification1 = `Payment has been queued and requires supervisory approval because: The payee ${EntityName} of this payment has not been approved and requires managerial approval.`;
        console.log(SaveMessageVerification1);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification1, true, "Payment has been queued")

        //===================================================================Verifiation on Transaction History Screen, Status as Queued Payment Started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(3000)
        const ColHeader2 = ["Status"]
        const ColValue2 = ["Queued Payment"]
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber1, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Queued Payment", "Transaction History Screen", ColHeader2, ColValue2)
        //===================================================================Verifiation on Transaction History Screen, Status as Queued Payment Completed Here=============================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /*
    1)Login into ClaimZone
    2)Search Created Claim
    3)Create 1st Payment of amount 101 with approved entity, verify has been queued
    4)Verify check status is as Queued Payment
    5)Verify over Transaction history, Payment status is as Queued Payment
    6)Verify Hold reason as Exceeded Payment Limit over My Work:My Pending Transactions
    7)Funds-->Supevisory Approval -->Reject the payment
    8)Logout
    */
    test('AssureClaims_CreatePaymentAboveThanUserLimitAndRejectPaymentFromUser_Test_05', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(UserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${UserFirstName}`)
        //Login Into Application with User

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")

        //===================1st Payment Creation above than User Limit and Verified the check status as Queued Payment Started here===================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        StrControlNumber2 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.QueuedPayment)
        console.log("New Payment is Created " + StrControlNumber2);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification, true, "Payment has been queued")
        var ActualStatus = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, "value");
        if (ActualStatus === ExpectedStatus)
            console.log("Check Status is Q Queued Payment hence Verification is successful");
        else
            console.log("verification can not be done");
        //===================1st Payment Creation above than User Limit and Verified the check status as Queued Payment Completed here===================================================================

        //===================================================================Verifiation on Transaction History Screen, Status as Queued Payment Started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(3000)
        const ColHeader3 = ["Status"]
        const ColValue3 = ["Queued Payment"]
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number 2")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Queued Payment", "Transaction History Screen", ColHeader3, ColValue3)
        //===================================================================Verifiation on Transaction History Screen, Status as Queued Payment Completed Here=============================================================================================

        //===================================================================Verifiation on  Screen,My Pending Transactions Exceeded Payment Limit Started Here=============================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber2, "Enter Control Number")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        //Verification of 1st record on my pending transaction screen
        //===================================================================Verifiation on  Screen,My Pending Transactions Exceeded Payment Limit Completed Here=============================================================================================

        //===================================================================Verifiation on  Screen,Funds->Supervisory Approval,Queued Payment Started Here=============================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_QueuedPayment, "Queued Payment button")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber2, "Enter Control Number")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        //===================================================================Verifiation on  Screen,Funds->Supervisory Approval,Queued Payment Completed Here=============================================================================================

        //==================================================================Reject the queued payment , and check after rejecting the record is not there,started Here=======================================================================================================================================  
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_RejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber2, "Enter Control Number")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "No row exist");
        //===================================================================Reject the queued payment and check after rejecting the record is not there Completed Here=============================================================================================================================================== 

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into ClaimZone
    2)Search Created Claim
    3)Create 2nd Payment of amount 101 with approved entity, verify has been queued
    4)Verify check status is as Queued Payment
    5)Create 3rd Payment of amount 101 with approved entity, verify has been queued
    6)Verify check status is as Queued Payment
    */
    test('AssureClaims_CreateTwoPaymentAboveThanUserLimit_Test_06', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(UserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${UserFirstName}`)
        //Login Into Application with User

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")

        //===================2nd Payment Creation above than User Limit and Verified the check status as Queued Payment Started here===================================================================
        StrControlNumber3 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.QueuedPayment)
        console.log("New Payment is Created " + StrControlNumber2);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification, true, "Payment has been queued")
        var ActualStatus = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, "value");
        if (ActualStatus === ExpectedStatus)
            console.log("Check Status is Q Queued Payment hence Verification is successful");
        else
            console.log("verification can not be done");
        //===================2nd Payment Creation above than User Limit and Verified the check status as Queued Payment Completed here===================================================================

        await t.switchToMainWindow();
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

        //===================3rd Payment Creation above than User Limit and Verified the check status as Queued Payment Started here===================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        StrControlNumber4 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.QueuedPayment)
        console.log("New Payment is Created " + StrControlNumber2);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification, true, "Payment has been queued")
        var ActualStatus = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, "value");
        if (ActualStatus === ExpectedStatus)
            console.log("Check Status is Q Queued Payment hence Verification is successful");
        else
            console.log("verification can not be done");
        //===================3rd Payment Creation above than User Limit and Verified the check status as Queued Payment Completed here===================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into ClaimZone with Manager User
    2)Funds:Supervisory Approval, Reject the Payment by Manager level User
    3)Approve the Payment by Manager level User
    4)Logout 
    */
    test('AssureClaims_ApproveAndRejectPaymentByManager_Test_07', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(SrFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${SrFirstName}`)
        //Login Into Application with User

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval")
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await t.wait(10000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Payment, "Payment Tab")
        await t.wait(5000)

        //===================Reject the Payment by Manager level User , and after rejecting the payment, check Payment is not there Started here===================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber3, "Enter Control Number")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_RejectReason, "Payment Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber3, "Enter Control Number")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "No row exist");
        //===================Reject the Payment by Manager level User , and after rejecting the payment, check Payment is not there Completed here===================================================================

        //===================Approve the Payment by Manager level User , and after Approving the payment, check Payment is not there Started here===================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber4, "Enter Control Number")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Payment Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Btn_Approve, "Approve Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason, "Payment Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchCntrlNo, StrControlNumber4, "Enter Control Number")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "No row exist");
        //===================Approve the Payment by Manager level User , and after Approving the payment, check Payment is not there Completed here===================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into ClaimZone with Ground User
    2)Search Created Claim
    3)Verification of 1st record-->Rejected by Groud level over Transaction history screen, status as Reviewed But Denied
    5)Verification of 2nd record-->Rejected by Manager level over Transaction history screen status as Reviewed But Denied
    6)Verification of 3rd record-->Approved by Manager over Transaction history screen status as Released
    4)Logout 
    */

    test('AssureClaims_VerifyStatusOverTransactionHistoryScreen_Test_08', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(UserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${UserFirstName}`)
        //Login Into Application with User


        //=======================================================Verification of records on Transaction History Screen Started here=======================================================================
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(3000)

        //==========================================================Verification of 1st record-->Rejected by Groud level User Started here===================================================================
        const ColHeader1 = ["Status"]
        const ColValue1 = ["Reviewed But Denied"]
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number 2")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History Screen", ColHeader1, ColValue1)
        //==========================================================Verification of 1st record-->Rejected by Groud level User Completed here===================================================================

        //==========================================================Verification of 2nd record-->Rejected by Manager level User Started here===================================================================
        const ColHeader2 = ["Status"]
        const ColValue2 = ["Reviewed But Denied"]
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber3, "Control Number 3")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Reviewed But Denied", "Transaction History Screen", ColHeader2, ColValue2)
        //==========================================================Verification of 2nd record-->Rejected by Manager level User Completed here===================================================================

        //==========================================================Verification of 3rd record-->Approved by Manager level User Started here===================================================================
        const ColHeader3 = ["Status"]
        const ColValue3 = ["Released"]
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber4, "Control Number 4")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Released", "Transaction History Screen", ColHeader3, ColValue3)
        //==========================================================Verification of 3rd record-->Approved by Manager level User Completed here===================================================================
        //=======================================================Verification of records on Transaction History Screen Completed here============================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into Security
    2)Uncheck Payment Limits
    */
    test('AssureClaims_UncheckPaymentLimitFromSecurity_Test_09', async t => {


        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)

        //===================================================================Security->User Privilege Setup -->Setting Limit Started Here==============================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Payment Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Enable Payment Limits")
        //===================================================================Security->User Privilege Setup -->Setting Limit Completed Here==============================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /*
    1)Login into Configuration Manager
    2)UnChecked setting :-Payment Limits Are Exceeded,Queue Payments instead of Hold
    //Use Supervisory Approval,Use Entity Payment Approval
    */
    test('AssureClaims_TurnOffSettingFromConfigurationManager_Test_010', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Payment Parameter SetUp in Configuration manager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed, "UnCheck", "Payment Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queue Payments instead of Hold")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Payment Approval")

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")

        //====================================================Payment Parameter SetUp in Configuration manager ended================================================

    });


        /* 
      1)Login Into Application 
      2)Deletion of Ground User
      3)Deletion of Manager User
  */
      test('AssureClaims_UserDeletion_Test_011', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(30000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Manager User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", SrFirstName + " " + SrLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Manager User ended===================================================================================

        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", UserFirstName + " " + UserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

    });
});


