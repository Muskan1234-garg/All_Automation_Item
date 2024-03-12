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
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-104779
//Description      : 1. Create 4 user.
//                   2. set reserve limit for ground user & mide user (100,200)
//                   3. Turn on supervisory Approval settings
//                   4. Create GC and two Reserve With exceeding limit
//                   5. Login with mid manager & approve reserve withing his limit
//                   6. Login with senior manager and verfy reserve is visible
//                   7. Login with other user & approve reserve withing his limit
//                   8. Login with Ground user and Verification of status -> 'Open' 
//                   9. Revert settings
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES  :  None
//Preferred Server : None
// *******************************************************************************************************************************

var faker = require('faker');

//Global Variable Declaration
var strSeniorManagerLastName = "Sr_" + "" + faker.name.lastName();
var strSeniorManagerFirstName = "Sr_" + "" + faker.name.firstName();
var strMidManagerLastName = "Mid_" + "" + faker.name.lastName();
var strMidManagerFirstName = "Mid_" + "" + faker.name.firstName();
var strGroundUserLastName = "Grd_" + "" + faker.name.lastName();
var strGroundUserFirstName = "Grd_" + "" + faker.name.firstName();
var strUserLastName = "Usr_" + "" + faker.name.lastName();
var strUserFirstName = "Usr_" + "" + faker.name.firstName();

var strClaimNumber;
var strFirstReserveType;
var strSecondReserveType;


DataIUT.forEach(data => {
    fixture`ReserveLimit_SameModuleGroup`.beforeEach(async t => {
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

        //==============================================================Creation of Ground User started==================================================================
        var strUserName = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", strUserLastName, strUserFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Ground User ended==================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /* Steps performed by AssureClaims_UserPrivilegeSetting_Test_02 :
    1. Log in With User
    2. Securities > user privilege setup
    3. Select LOB > General claim
    4. Select Limit type > reserve > enable reserve Limits
    5. Select the ground user > amount and Click on add
    6. Select the mid user > amount and Click on add
    7. Logout
    */
    test('AssureClaims_UserPrivilegeSetting_Test_02', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================

        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================

        //==============================================================Select Limit type > reserve limit > enable reserve Limits started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Reserve Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "Check", "Checked Enable Reserve Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > reserve limit > enable reserve Limits ended==================================================================

        //===================================================Set Reserve Limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strGroundUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set Reserve Limit for Ground User 100$ ended here==================================================================================================================

        await t.wait(3000)

        //===================================================Set Reserve Limit for Ground User 200$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidManagerLastName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "200", "Max Amount TextBox")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        //===================================================Set Reserve Limit for Ground User 200$ ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /* Steps performed by AssureClaims_ConfigurationManager_SettingForSupervisory_Test_03 : 
    1)Check settings for supervisory reserve from Configuration manager
    */
    test('AssureClaims_ConfigurationManager_SettingForSupervisory_Test_03', async t => {

        await t.wait(10000)
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here===================================================================================

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started here=====================================================================
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "Check", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "Check", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "Check", "Allow the group of supervisor to approve")
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
    });


    /* Steps performed by AssureClaims_GCCreationAndPaymentCreation_Test_04 :
    1. Login Into Application with Ground User
    2. Corporate GC Creation
    3. Reserve Creation
    4. Reserve hold Verification
   */
    test('AssureClaims_GCCreationAndReserveCreation_Test_04', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strGroundUserFirstName, "abkabk1", data.DSN, 'Claims')
        //=============================================================Login Into Application with User ended=========================================================================

        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/yyyy");

        //=====================================Corporate GC  Creation started here===================================================================================================================================
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
        console.log("New Cooperate General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //===================================================Create 1st reserve ($500), verify reserve goes on hold started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        strFirstReserveType = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(1, "500", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        //===================================================Create 1st reserve ($500), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Create 2nd reserve ($150), verify reserve goes on hold started here==================================================================================================================
        strSecondReserveType = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(2, "150", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        //===================================================Create 2nd reserve ($150), verify reserve goes on hold ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /* Steps performed by AssureClaims_MidManagerVerification_Test_05 :
    1. Login Into Application with Mid Manager User
    2. Funds > Supervisory Approval > Reserve > Select group icon > Verify 2nd reserve is present which in under mid manager's limit
    3. Approve reserve
    4. Logout
    */
    test('AssureClaims_MidManagerVerifyAndApproveSecondReserve_Test_05', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strMidManagerFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Middle Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Reserve, "Reserve Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ReserveGroup, "Group button")
        await t.wait(2000)
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchClaimNumber, strClaimNumber, "Enter claim number")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strSecondReserveType, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header1, Value1)
        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================

        //============================MidManager approved the reserve as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Reserve Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //============================MidManager approved the reserve as it is within his limit ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /* Steps performed by AssureClaims_SeniorManagerVerification_Test_06 :
    1. Login Into Application with Senior Manager User
    2. Funds > Supervisory Approval > Reserve > Select group icon > Verify 1st reserve is present which in under senior  manager's limit
    3. Logout
    */
    test('AssureClaims_SeniorManagerVerificationOfFirstReserve_Test_06', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSeniorManagerFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with senior Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================verification of Reserve getting Displayed on supervisory approval screen of Senior Manager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Reserve, "Reserve Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ReserveGroup, "Group button")
        await t.wait(2000)
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchClaimNumber, strClaimNumber, "Enter claim number")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strFirstReserveType, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header1, Value1)
        //============================verification of Reserve getting Displayed on supervisory approval screen of Senior Manager ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /* Steps performed by AssureClaims_GroundUserVerification_Test_07 :
    1. Login Into Application with other User
    2. Funds > Supervisory Approval > Reserve > Select group icon > Verify 1st reserve is present
    3. Approve reserve
    4. Logout
    */
    test('AssureClaims_OtherUserVerifyAndApproveFirstReserve_Test_07', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with another user !!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //============================verification of Reserve getting Displayed on supervisory approval screen of other user started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Reserve, "Reserve Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ReserveGroup, "Group button")
        await t.wait(2000)
        const Header2 = ["Claim Number", "Hold Reason"]
        const Value2 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchClaimNumber, strClaimNumber, "Enter claim number")
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strFirstReserveType, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header2, Value2)
        //============================verification of Reserve getting Displayed on supervisory approval screen of other user ended here==================================================================================================================

        //============================other user approve the reserve started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Approve Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Reserve Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        //============================other user approve the reserve ended here==================================================================================================================


        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });


    /* Steps performed by AssureClaims_GroundUserVerifyReserveStatusAsOpen_Test_08 :
    1. Login Into Application with ground User
    2. Verify reserve status is open 
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
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")

        //============================Verification of Reserve status as 'O - Open' for both reserve started here==================================================================================================================
        const ColHeader = ["Status", "Reserve Type"]
        const ColValue = ["O - Open", strFirstReserveType]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strFirstReserveType, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Transaction Grid", ColHeader, ColValue)

        const ColHeader1 = ["Status", "Reserve Type"]
        const ColValue1 = ["O - Open", strSecondReserveType]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strSecondReserveType, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Transaction Grid", ColHeader1, ColValue1)
        //============================Verification of Reserve status as 'O - Open' for both reserve ended here==================================================================================================================

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

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")

        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here===================================================================================

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

    });

    /* Steps performed by AssureClaims_RevertSecuritySetting_Test_10
    1. Login to Security
    2. UnCheck Reserve limit 
    3. Logout
    */
    test("AssureClaims_RevertSecuritySetting_Test_10", async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        await t.wait(5000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        //==============================================================Login to Assure claims > Securities > user privilege setup ended==================================================================

        //==============================================================Select LOB > General claim started==================================================================
        await t.wait(5000);
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")
        //==============================================================Select LOB > General claim ended==================================================================

        //==============================================================Select Limit type > reserve limit > enable reserve Limits started==================================================================
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Reserve Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "UnCheck", "UnChecked Enable Reserve Limits")
        await t.wait(7000);
        //==============================================================Select Limit type > reserve limit > enable reserve Limits ended==================================================================
    
    });


    /* Steps performed by AssureClaims_UserDeletion_Test_11 :
    1. Login Into Application with User
    2. Deletion of Ground Users
    3. Deletion of Manager Users
    */
    test('AssureClaims_UserDeletion_Test_11', async t => {

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
        
        //==============================================================Deletion of Ground User started==============================================================================
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", strUserFirstName + " " + strUserLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Ground User ended==================================================================

    });


});
