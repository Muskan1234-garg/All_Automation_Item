import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Home from '../Functional_POM/POM_Home';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_GeneralClaimParameter from '../Functional_POM/POM_GeneralClaimParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataSTG = require('../DataFiles/DataAutoRegDSN_1.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const GCP_POM = new POM_GeneralClaimParameter();

var faker = require('faker');
var strClaimNumber;

var strSrLastName = "Sr_" + "" + faker.name.lastName();
var strSrFirstName = "Sr_" + "" + faker.name.firstName();
var strUserLastName = "Usr_" + "" + faker.name.lastName();
var strUserFirstName = "Usr_" + "" + faker.name.firstName();

var strSaveMessageVerification = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";

// ***************************************************************************************************************
//JIRA ID OF STORY   : RMA-90668, RMA-91094, RMA-98975
//Description        : Verify user is able to check setting ‘Check for Insufficient Reserve Funds’, 'Supervisory Approval', 'Payment Limits Are Exceeded'
//Verify transaction is created with HOLD status & reserve is updated if user set reserve amount greater than payment limit
//Verify user is able to Uncheck setting ‘Check for Insufficient Reserve Funds’ is off.
//AUTHOR             : Muskan garg
//DEPENDANCY         : NO
//PRE-REQUISITE      : 1. Utillities-->LOB--->reserve Option --->Check for Insufficient Reserve Funds turn on 
//                     2. Utilities--> payment Parameter setup ---> Supervisor approval Configuration--> Payment Limits Are Exceeded --> ON
//                     3. Utilities--> payment Parameter setup ---> Supervisor approval Configuration-->Supervisory Approval ---> ON 
// Preferred Env.    : None
// **********************************************************************************************************************


DataSTG.forEach(data => {
    fixture`InsufficientReserve2_Supervisory`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });


    var strExpectedMessage = `The Amount for this Transaction that is to be applied to the Reserve ${data.InsufficientReserveType} Type is greater than the balance amount`;

    /*
    1)Create 2 user (manager user, ground user)
    2)set ground user payment limit 500
    3)Logout from application
    */
    //==============================================================create 2 users(ground & manager level) and set payment limit for ground level user started here======================================
    test('AssureClaims_UserCreation_Test_01', async t => {


        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)

        //===================================================================User Creation Started Here==============================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strSrLastName, strSrFirstName, "NA", "NA", data.DSN, data.ModuleName)
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strUserLastName, strUserFirstName, strSrFirstName + " " + strSrLastName, "NA", data.DSN, data.ModuleName)
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
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "500", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button");
        //===================================================================Security->User Privilege Setup -->Setting Limit Completed Here==============================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });
    //==============================================================create 2 users(ground & manager level) and set payment limit for ground level user completed here======================================

    /*
    1)Turn on setting 'Check for Insufficient Reserve Funds' from config manager
    2)Turn on setting 'Supervisory Approval' for payment from config manager
    3)Turn on setting 'Payment Limits Are Exceeded' from config manager
    */
    //==========================Verify user is able to Uncheck setting ‘Check for Insufficient Reserve Funds’ is on. started here===========================================================================================================
    test('AssureClaims_TurnOnConfigSettingForSupervisory_InSufficientReserve_Test_02', async t => {

        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)

        //============================================================Utility Setting ->Check for Insufficient Reserve Funds-> on->Started here================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Main Configurations")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Chk_InsuffiecientReserve, "Check", "Insufficient Reserve Funds")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(4000);
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")
        await t.wait(4000);
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "Check", "Use Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold, "UnCheck", "Queue Payments instead of Hold")
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
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Payment Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(10000);
        //============================================================Utility Setting ->Check for Insufficient Reserve Funds-> on->completed here================================================================================================
    });
    //==========================Verify user is able to Uncheck setting ‘Check for Insufficient Reserve Funds’ is off. completed here=========================================================================================================

    /*
    1)claim creation
    2)create reserve of amount 400
    3)create payment of amount 600
    4) set the reserve
    5) Verify values over reserve history screen
    6)Logout from application
    */
    //=================================================Verify transaction is created with HOLD status & reserve is updated if user set reserve amount greater than payment limit. started here===========================================================================
    test('AssureClaims_Set_InSufficientReserve_Test_03', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //Login Into Application with User

        //===================================================================Claim Creation Started Here==============================================================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
        //===================================================================Claim Creation Completeed Here==============================================================================================

        //===================================================================Reserve Creation Started Here==============================================================================================
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "400", data.ReserveStatus)
        //===================================================================Reserve Creation Started Here==============================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

        //===================================================================Payment Creation more than reserve amount & more than payment limit Started Here==============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName, "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.WorkTransactionType), "Transaction Type Value On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "600", "Transaction Amount On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        //===================================================================Payment Creation more than reserve amount & more than payment limit completed Here================================================================================================================================

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_CommentFrame, "Switch to new open Insufficient Reserves frame")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_VerifyMsg, "Insufficient Reserve Msg");

        //===================================================================Verify Insufficient reserve message started  Here==============================================================================================
        var actualInsufficientMsg = await Reserve_Utility.AssureClaims_InsufficientReserve_VerifyMsg.innerText;
        console.log("actualInsufficientMsg :" + actualInsufficientMsg);
        if (actualInsufficientMsg === strExpectedMessage) {
            console.log("Verification Of Existence For ".green + actualInsufficientMsg.yellow + " is successful".green);
        }
        else {
            console.log("Verification Of Existence For " + actualInsufficientMsg + " is not successful");
        }
        //===================================================================Verify Insufficient reserve message completed  Here==============================================================================================


        //===================================================================set reserve amount as 200 started  Here==============================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Txt_ReserveAmount, "200", "Set Reserve Amount")
        await t.wait(6000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_Continue, "Continue Button")
        await t.wait(6000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification, true, "Payment has been queued");
        var strControlNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        console.log("Transaction is Created with control Number" + strControlNumber);
        //===================================================================set reserve amount as 200 completed Here==============================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

        ///===================================================================Verify data over reserve history screen started Here==============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_ReserveHistory, "Reserve History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        var amount = await Generic_Utility.AssureClaims_FormatANumber_Utility("400");
        const ColHeader1 = ["Reserve Amount"]
        const ColValue1 = [amount]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_InsufficientReserveOn_ReserHistory_Txt_ReserveAmount, "400", "Reserve Amount")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(amount, "Reserve History Screen", ColHeader1, ColValue1)
        //===================================================================Verify data over reserve history screen completed Here==============================================================================================


        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });
    //=================================================Verify transaction is created with HOLD status & reserve is updated if user set reserve amount greater than payment limit. completed here=========================================================================


    /*
    1)Turn off setting 'Check for Insufficient Reserve Funds' from config manager
    */
    //==========================Verify user is able to Uncheck setting ‘Check for Insufficient Reserve Funds’ is off. started here===========================================================================================================
    test('AssureClaims_TurnOffConfigSettingForSupervisory_InSufficientReserve_Test_04', async t => {

        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)

        //============================================================Check for Insufficient Reserve Funds,'Supervisory Approval', 'Payment Limits Are Exceeded'-> off->Started here================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Main Configurations")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Chk_InsuffiecientReserve, "UnCheck", "Insufficient Reserve Funds")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(6000);
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")
        await t.wait(6000);
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed, "UnCheck", "Payment Limits Are Exceeded")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await t.wait(10000);
        //============================================================Check for Insufficient Reserve Funds,'Supervisory Approval', 'Payment Limits Are Exceeded'-> off->completed here================================================================================================
    });
    //==========================Verify user is able to Uncheck setting ‘Check for Insufficient Reserve Funds’ is off. completed here=========================================================================================================

    /*
    1)Uncheck payment limit from security
    */
    //==============================================================Disbale payment limit for ground level user started here======================================
    test('AssureClaims_DisablePaymentLimit_InSufficientReserve_Test_05', async t => {


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

        //===================================================================Utility Setting for insufficient reserve Payment Completed here==============================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });
    //==============================================================Disbale payment limit for ground level user completed here======================================

        /* 
      1)Login Into Application 
      2)Deletion of Ground User
      3)Deletion of Manager User
  */
      test('AssureClaims_UserDeletion_Test_06', async t => {
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

        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

    });

});

