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
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Adjuster from '../Functional_POM/POM_Adjuster';
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";

const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const In_Utility = new Input_Utility();
const Verification_Msg = new POM_VerificationMessage();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Home_POM = new POM_Home();
const Adjuster_POM = new POM_Adjuster();
const Payment_POM = new POM_PaymentsCollections();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-107063
//Description      : 1. Create 3 user & set limits for first user
//                   2. Turn on supervisory Approval settings
//                   3. Create GC and 2 Reserve with amount 500
//                   4. Login with second user ,  appove & reject reserve
//                   5. Login with User, verify Reserve status 
//                   6. Revert settings
//AUTHOR           : Muskan Garg
//DEPENDANCY       : No
//PRE-REQUISITES  :  None
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');
const fs = require('fs')

//Global Variable Declaration

var strFirstUserLastName = "First_" + "" + faker.name.lastName();
var strFirstUserFirstName = "First_" + "" + faker.name.firstName();
var strSecondUserLastName = "Second_" + "" + faker.name.lastName();
var strSecondUserFirstName = "Second_" + "" + faker.name.firstName();
var strAdjUserLastName = "Adj_" + "" + faker.name.lastName();
var strAdjUserFirstName = "Adj_" + "" + faker.name.firstName();
var strAdjustertLastName = "auto_" + faker.name.lastName();

var strClaimNumber
var strReserveApprovedByAdjuster;
var strReserveRejectedByAdjuster;
var strFirstUserName
var strAdjusterUserName
var strSecondUserName

DataIUT.forEach(data => {
    fixture`ReserveLimit_AdjusterChain`.beforeEach(async t => {
        await t.wait(8000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01 :
    1) Login Into Application with User
    2) Creation of First User
    3) Creation of Second User
    4) Creation of Adjuster User
    5) Security > user privilege setup
    6) Select LOB > General claim
    7) Select Limit type > Reserve Limit > enable Reserve Limit
    8) Set Reserve Limit for first user -> 100
    9) Logout
    */
    test('AssureClaims_UserCreationAndUserPrivilegeSetting_Test_01', async t => {

        //==============================================================Login Into Application with User started==============================================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended=================================================================================================

        //==============================================================Creation of First User started===================================================================================================
        strFirstUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strFirstUserLastName, strFirstUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of First User ended====================================================================================================

        //==============================================================Creation of Second User started================================================================================================
        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        strSecondUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strSecondUserLastName, strSecondUserFirstName, strFirstUserFirstName + " " + strFirstUserLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Second User ended==================================================================================================

        //==============================================================Creation of Adjuster User started===================================================================================================
        strAdjusterUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strAdjUserLastName, strAdjUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Adjuster User ended====================================================================================================


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

        //==============================================================Select Limit type > Reserve limit > enable Reserve Limit started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Reserve Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "Check", "Checked Enable Reserve Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > Reserve limit > enable Reserve limit ended=============================================================

        //===================================================Set Reserve limit for User 100$ started here===============================================================================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSecondUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        let closeBtnExist = await Selector('[name="btn_cancel"]').exists
        if (closeBtnExist) {
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
            await t.wait(2000)
            await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        }
        else {
            await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        }
        //===================================================Set Reserve limit for User 100$ ended here===============================================================================================================================================================================================

        // ========================================================== Logout from the application starts here ================================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        // ========================================================== Logout from the application ends here ================================================================================================

    });

    /*
    1)Check/Uncheck settings for supervisory reserve from Configuration manager
    */
    test('AssureClaims_ConfigurationSettingForSupervisory_Test_02', async t => {


        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "Check", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "UnCheck", "Allow the group of supervisor to approve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame, "Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame.find('span').withText('Days'), "Select Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_ReserveDaysHoursForApproval.find('input'), "0", "Days/Hours For Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveZeroAsValidValueForEscalation, "UnCheck", "0 as Valid value for Escalation")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveNotifyTheImmediateSupervisor, "UnCheck", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseCurrentAdjusterChain, "Check", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_IncurredLimitsAreExceeded, "UnCheck", "Incurred Limits are exceeded")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Approval Notification")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveDisableEmailToSupervisor, "UnCheck", "Disable Email To Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveDisableDiaryToSupervisor, "UnCheck", "Disable Diary To Supervisor")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================
    });


    /*
    1)Login into claim zone
    2)Create claim
    3)Create an adjuster & Assign Second user over RISKMASTER Login
    4)Create 2 reserve 
    5)Verify Hold reason
    6)Verify records over My work -> My pending transaction
    */
    test("AssureClaims_ClaimReserveCreation_Test_03", async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSecondUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${strSecondUserFirstName}`)
        //===================================================Login into claim started here==================================================================================================================

        //===================================================Claim creation started here==================================================================================================================
        await t.wait(10000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
        //===================================================claim creation ended here==================================================================================================================

        //===================================================create a adjuster & assign riskmaster login to Second user started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
        await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, strAdjustertLastName, "Adjuster Last Name")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaimsApp_Adjuster_Btn_AddNewAdjusterButton, "Add button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaimsApp_Adjuster_Btn_RiskmasterLoginLookupBtn, "Riskmaster login lookup button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SystemUser, "User button click")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Txt_FirstName.nth(2), strAdjUserFirstName, "Second user name")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_SearchButton.nth(2), "Search button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "Select row")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_LOBTopLevelApproval_Btn_OkButton, "Ok button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Adjuster creation Screen");
        //===================================================create a adjuster & assign riskmaster login to Second user ended here==================================================================================================================



        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        //===================================================Create first reserve (500), verify reserve goes on hold started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        strReserveApprovedByAdjuster = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(1, "500", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        //===================================================Create first reserve (500), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Create second reserve (500), verify reserve goes on hold started here==================================================================================================================
        strReserveRejectedByAdjuster = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(2, "500", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        //===================================================Create second reserve (500), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Verification of 1st record on my pending transaction screen started here==================================================================================================================
        const ColHeader1 = ["Hold Reason", "Reserve Type"]
        const ColValue1 = ["Exceeded Reserve Limit", strReserveApprovedByAdjuster]
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveApprovedByAdjuster, "Enter Reserve Type")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, strClaimNumber, "Claim Number")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Reserve Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        //===================================================Verification of 1st record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 2nd record on my pending transaction screen started here==================================================================================================================
        const ColHeader2 = ["Hold Reason", "Reserve Type"]
        const ColValue2 = ["Exceeded Reserve Limit", strReserveRejectedByAdjuster]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveRejectedByAdjuster, "Enter Reserve Type")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, strClaimNumber, "Claim Number")
        await t.wait(2000)
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Reserve Limit", "Pending Transaction Grid", ColHeader2, ColValue2)
        //===================================================Verification of 2nd record on my pending transaction screen ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /*
    1)Login into claim zone with Adjuster user
    2)Approve first Reserve
    3)Reject second reserve
    4)Logout
    */
    test('AssureClaims_AdjusterUserApproveAndRejectReserve_Test_04', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strAdjUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Middle Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================verification of Reserve getting Displayed on supervisory approval screen of Adjuster user started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Reserve, "Reserve Tab")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, strClaimNumber, "Claim Number")
        await t.wait(2000)
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveApprovedByAdjuster, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header1, Value1)
        //============================verification of Reserve getting Displayed on supervisory approval screen of Adjuster user ended here==================================================================================================================

        //============================Adjuster user approved the reserve started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Reserve Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //============================Adjuster user approved the reserve ended here==================================================================================================================


        //============================verification of Reserve getting Displayed on supervisory approval screen of Adjuster user started here==================================================================================================================
        const Header2 = ["Claim Number", "Hold Reason"]
        const Value2 = [strClaimNumber, "Exceeded Reserve Limit"]
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, strClaimNumber, "Claim Number")
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveRejectedByAdjuster, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header2, Value2)
        //============================verification of Reserve getting Displayed on supervisory approval screen of Adjuster user ended here==================================================================================================================

        //============================Adjuster user Reject the reserve started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResRejectReason, "Reserve Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //============================Adjuster user Reject the reserve ended here==================================================================================================================

        //============================Verify No Recorde aval started here==================================================================================================================
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
        //============================Verify No Recorde aval started here ended here=================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into claim zone with user
    2)Verify Reserve status 
    */
    test('AssureClaims_UserVerificationOfReserveStatus_Test_05', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSecondUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with User!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(25000)

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")

        //===================================================Verfication of the reserve status & balance started here==================================================================================================================
        const ColHeader1 = ["Status", "Balance"]
        const ColValue1 = ["O - Open", "$500.00"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveApprovedByAdjuster, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Financial grid view", ColHeader1, ColValue1)
        //===================================================Verfication of the reserve status & balance ended here==================================================================================================================

        //===================================================Verfication of the reserve status & balance started here==================================================================================================================
        const ColHeader2 = ["Status", "Balance"]
        const ColValue2 = ["O - Open", "$0.00"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveRejectedByAdjuster, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Financial grid view", ColHeader2, ColValue2)
        //===================================================Verfication of the reserve status & balance ended here==================================================================================================================

        //===================================================================Verify data on reserve history screen started Here==============================================================================================
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveApprovedByAdjuster, "Enter Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_ReserveHistory, "Reserve History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(5000);
        const ColHeader3 = ["User", "Status"]
        const ColValue3 = [strAdjUserLastName + " " + strAdjUserFirstName, "Open"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strAdjUserLastName + " " + strAdjUserFirstName, "Reserve History Screen", ColHeader3, ColValue3)
        //===================================================================Verify data on reserve history screen completed Here==============================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)


        //===================================================================Verify data on reserve history screen started Here==============================================================================================
        await t.wait(2000)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveRejectedByAdjuster, "Enter Reserve Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_InsufficientReserve_Btn_ReserveHistory, "Reserve History Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await t.wait(5000);
        const ColHeader4 = ["User", "Status"]
        const ColValue4 = [strAdjUserLastName + " " + strAdjUserFirstName, "Rejected"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strAdjUserLastName + " " + strAdjUserFirstName, "Reserve History Screen", ColHeader4, ColValue4)
        //===================================================================Verify data on reserve history screen completed Here==============================================================================================

    });


    /*
    1)Check/Uncheck settings for supervisory reserve from Configuration manager
    */
    test('AssureClaims_RevertConfigurationSettingForSupervisory_Test_06', async t => {


        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")
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
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================
    });
    /*
    1)Login to Security
    2)Revert setting for Reserve Limits
    3)Logout
    */
    test("AssureClaims_RevertSecuritySetting_Test_07", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        console.log(`Login Into Application`)
        //===================================================Login into security ended here==================================================================================================================

        //===================================================Uncheck Per claim pay Limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Reserve Limits', "Select Limit Type")

        //===================================================Remove Per claim pay limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSecondUserFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        await t.wait(3000)
        //===================================================Remove Per claim pay limit for Ground User 100$ ended here==================================================================================================================

        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Enable Payment Limits")
        //===================================================Uncheck Per claim pay Limit ended here==================================================================================================================

    });


    /* 
    1)Login Into Application 
    2)Deletion of first User
    3)Deletion of second User
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

        //==============================================================Deletion of First User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strFirstUserFirstName + " " + strFirstUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of First User ended===================================================================================

        //==============================================================Deletion of Second User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strSecondUserFirstName + " " + strSecondUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Second User ended==================================================================

        //==============================================================Deletion of Adjuster User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strAdjUserFirstName + " " + strAdjUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Adjuster User ended==================================================================
    });

});



