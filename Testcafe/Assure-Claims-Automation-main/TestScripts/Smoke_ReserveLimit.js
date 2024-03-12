import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_SupervisoryApproval from '../Functional_POM/POM_SupervisoryApproval';
import POM_DiaryList from '../Functional_POM/POM_DiaryList';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_DiaryUtilities from '../Functional_POM/POM_DiaryUtilities';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';


const DataSTG = require('../DataFiles/DataAutoRegDSN_2.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Diary_Utilities = new POM_DiaryUtilities();
const Verification_Msg = new POM_VerificationMessage();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Diary_Creation = new POM_DiaryList();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const SupervisoryApproval_POM = new POM_SupervisoryApproval();
const ConfigMgr_POM = new POM_Config_Manager();


var faker = require('faker');

var strSrLastName = "AutoSr_" + "" + faker.name.lastName();
var strSrFirstName = "AutoSr_" + "" + faker.name.firstName();
var strMidLastName = "AutoMid_" + "" + faker.name.lastName();
var strMidFirstName = "AutoMid_" + "" + faker.name.firstName();
var strUserLastName = "AutoUsr_" + "" + faker.name.lastName();
var strUserFirstName = "AutoUsr_" + "" + faker.name.firstName();

var strClaimNumber;
var strReserveTypeApprovedByMidManager;
var strReserveTypeRejectedByMidManager;
var strReserveTypeApprovedBySeniorManager;
var strReserveTypeRejectedBySeniorManager;
var strReserveTypeApprovedByMidManager1;
var strReserveTypeRejectedByMidManager1;
var strReserveTypeApprovedBySeniorManager1;
var strReserveTypeRejectedBySeniorManager1;


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-82373,RMA-82830
//Description      :Successful Reserve Can Be Created And Is Going On Hold Because Of Exceeded Successful Reserve Can Be Created And Is Going On Hold Because Of Exceeded  Reserve Limits Is Validated
// Successful Verify That The Manager Can Have The Authority To Either Successful Verify That The Manager Can Have The Authority To Either Approve Or Not Approve The Reserve Based On Reserve Limit Is Validated
// Successful Verify Any User In Managerial Chain, Who Can See Reserve Successful Verify Any User In Managerial Chain, Who Can See Reserve In Its Supervisory Approval View Can Reject the Reserve Irrespective Of Its  Limit Is Validated  
//AUTHOR           : Muskan Garg
//DEPENDANCY       : No
//PRE-REQUISITE    : Payment limit should be off in security zone.
// Payament Parameter setup -> Supervisory tab -> Payment Limits Are Exceeded, Queue Payments Instead Of Placing On Hold,
// Supervisory Approval should be off.
// General System Parameter -> Use Entity Payment Approval Check Box should be off.
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
// *******************************************************************************************************************************

DataSTG.forEach(data => {
    fixture`Smoke_ReserveLimit`.beforeEach(async t => {
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

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "Check", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "Check", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "Check", "Allow the group of supervisor to approve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame,"Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame.find('span').withText('Days'),"Select Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_ReserveDaysHoursForApproval.find('input'),"0","Days/Hours For Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveZeroAsValidValueForEscalation, "UnCheck", "0 as Valid value for Escalation")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveNotifyTheImmediateSupervisor, "Check", "Notify The Immediate Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseCurrentAdjusterChain, "UnCheck", "Use Current Adjuster Chain")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_IncurredLimitsAreExceeded, "UnCheck", "Incurred Limits are exceeded")        

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Approval Notification")
        await t.wait(3000)

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveDisableEmailToSupervisor, "Check", "Disable Email To Supervisor")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveDisableDiaryToSupervisor, "UnCheck", "Disable Diary To Supervisor")

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================
    });


    /*
    1)Login to Security
    2)Set reserve limit for users
    3)Logout
    */
    test("AssureClaims_SecuritySetting_Test_03", async t => {

        //===================================================Login into security started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into security started here==================================================================================================================

        //===================================================Set Reserve Limit for all Users started here==================================================================================================================
        
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Reserve Limits'), "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "Check", "Checked Enable Reserve Limits")

        //===================================================Set Reserve Limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)

        //start
        let closeBtnExist = await Selector('[name="btn_cancel"]').exists
        if (closeBtnExist) {
            console.log(`Limit is already set for user`);
        }
        else {
            await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "100", "Max Amount TextBox")
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        }
        //===================================================Set Reserve Limit for Ground User 100$ ended here===================================================================================================================

        //===================================================Set Reserve Limit for Mid User 200$ started here===================================================================================================================
        //Reserve Limit for Mid_User 200$
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        if (closeBtnExist) {
            console.log(`Limit is already set for user`);
        }
        else {
            await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "200", "Max Amount TextBox")
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        }
        //===================================================Set Reserve Limit for Mid User 200$ ended here===================================================================================================================

        //===================================================Set Reserve Limit for Senior User 300$ started here===================================================================================================================
        //Reserve Limit for Sr_User 300$
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSrFirstName, "User TextBox")
        await t.pressKey('tab');
        await t.wait(1000)
        if (closeBtnExist) {
            console.log(`Limit is already set for user`);
        }
        else {
            await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_MaxAmount, "300", "Max Amount TextBox")
            await t.wait(1000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_Add, "Add Button")
        }
        //===================================================Set Reserve Limit for Senior User 300$ ended here===================================================================================================================
        
        //===================================================Set Reserve Limit for all Users ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into claim zone
    2)Create claim
    3)Create 4 reserve above than user limit
    4)Verify Hold reason & Reserve type over My Work->My Pending Transactions
    */
    test("AssureClaims_ClaimReserveCreation_Test_04", async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //===================================================Login into claim started here==================================================================================================================

        //===================================================Claim creation started here==================================================================================================================
        await t.wait(10000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("AssureClaims_GeneralClaimCreation is called to create a claim with Claim Number:" + strClaimNumber)
        //===================================================claim creation ended here==================================================================================================================

        //===================================================Create 1st reserve ($105), verify reserve goes on hold started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        strReserveTypeApprovedByMidManager = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(1, "105", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        strReserveTypeApprovedByMidManager1 = strReserveTypeApprovedByMidManager.replace(' ', ' - ')
        //===================================================Create 1st reserve ($105), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Create 2nd reserve ($105), verify reserve goes on hold started here==================================================================================================================
        strReserveTypeRejectedByMidManager = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(2, "105", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        strReserveTypeRejectedByMidManager1 = strReserveTypeRejectedByMidManager.replace(' ', ' - ')
        //===================================================Create 2nd reserve ($105), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Create 3rd reserve ($210), verify reserve goes on hold started here==================================================================================================================
        strReserveTypeApprovedBySeniorManager = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(3, "210", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        strReserveTypeApprovedBySeniorManager1 = strReserveTypeApprovedBySeniorManager.replace(' ', ' - ')
        //===================================================Create 3rd reserve ($210), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Create 4th reserve ($210), verify reserve goes on hold started here==================================================================================================================
        strReserveTypeRejectedBySeniorManager = await Function_Utility.AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(4, "210", data.ReserveStatus, Verification_Msg.ExceedReserveLimitsOnHold, strClaimNumber, "NA")
        console.log("AssureClaims_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility is called to create a reserve")
        strReserveTypeRejectedBySeniorManager1 = strReserveTypeRejectedBySeniorManager.replace(' ', ' - ')
        //===================================================Create 4th reserve ($210), verify reserve goes on hold ended here==================================================================================================================

        //===================================================Verification of 1st record on my pending transaction screen started here==================================================================================================================
        const ColHeader1 = ["Hold Reason", "Reserve Type"]
        const ColValue1 = ["Exceeded Reserve Limit", strReserveTypeApprovedByMidManager]
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("My Work:My Pending Transactions")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PendingTransIframe)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedByMidManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Reserve Limit", "Pending Transaction Grid", ColHeader1, ColValue1)
        //===================================================Verification of 1st record on my pending transaction screen ended here==================================================================================================================
   
        //===================================================Verification of 2nd record on my pending transaction screen started here==================================================================================================================
        const ColHeader2 = ["Hold Reason", "Reserve Type"]
        const ColValue2 = ["Exceeded Reserve Limit", strReserveTypeRejectedByMidManager]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedByMidManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Reserve Limit", "Pending Transaction Grid", ColHeader2, ColValue2)
        //===================================================Verification of 2nd record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 3rd record on my pending transaction screen started here==================================================================================================================
        const ColHeader3 = ["Hold Reason", "Reserve Type"]
        const ColValue3 = ["Exceeded Reserve Limit", strReserveTypeApprovedBySeniorManager]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Reserve Limit", "Pending Transaction Grid", ColHeader3, ColValue3)
        //===================================================Verification of 3rd record on my pending transaction screen ended here==================================================================================================================

        //===================================================Verification of 4th record on my pending transaction screen started here==================================================================================================================
        const ColHeader4 = ["Hold Reason", "Reserve Type"]
        const ColValue4 = ["Exceeded Reserve Limit", strReserveTypeRejectedBySeniorManager]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Exceeded Reserve Limit", "Pending Transaction Grid", ColHeader4, ColValue4)
        //===================================================Verification of 4th record on my pending transaction screen ended here==================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application

    });

    /*
    1)Login into claim zone with MidManager
    2)Verify Diaries
    3)Approve & reject reserve which is under miduser limit
    4)Approve which is not under miduser limit
    5)Logout
    */
    test('AssureClaims_MidMgrApproveRejectReserve_Test_05', async t => {

        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strMidFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Middle Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //===================================================Verification of 1st reserve approval diary for MidManager started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeApprovedByMidManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText1 = "Reserve Approval Request of"
        var DiaryText2 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText1), "Approval of Diary")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText2), "Approval of Diary")
        const UserApprovalHead1 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal1 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead1, UserApprovalVal1)
        //===================================================Verification of 1st reserve approval diary for MidManager ended here==================================================================================================================

        //===================================================Verification of 2nd reserve approval diary for MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeRejectedByMidManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText3 = "Reserve Approval Request of"
        var DiaryText4 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText3), "Approval of Diary")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText4), "Approval of Diary")
        const UserApprovalHead2 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal2 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead2, UserApprovalVal2)
        //===================================================Verification of 2nd reserve approval diary for MidManager ended here==================================================================================================================

        //===================================================Verification of 3rd reserve approval diary for MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeApprovedBySeniorManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText5 = "Reserve Approval Request of"
        var DiaryText6 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText5), "Approval of Diary")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText6), "Approval of Diary")
        const UserApprovalHead3 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal3 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead3, UserApprovalVal3)
        //===================================================Verification of 3rd reserve approval diary for MidManager ended here==================================================================================================================


        //===================================================Verification of 4th reserve approval diary for MidManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeRejectedBySeniorManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var DiaryText7 = "Reserve Approval Request of"
        var DiaryText8 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText7), "Approval of Diary")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(DiaryText8), "Approval of Diary")
        const UserApprovalHead4 = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApprovalVal4 = [strMidLastName + " " + strMidFirstName, strUserLastName + " " + strUserFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strMidLastName + " " + strMidFirstName, "Diary grid view", UserApprovalHead4, UserApprovalVal4)
        //===================================================Verification of 4th reserve approval diary for MidManager ended here==================================================================================================================

        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Reserve, "Reserve Tab")
        const Header1 = ["Claim Number", "Hold Reason"]
        const Value1 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedByMidManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header1, Value1)
        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================
      
        //============================MidManager approved the reserve as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Reserve Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //============================MidManager approved the reserve as it is within his limit ended here==================================================================================================================


        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        const Header2 = ["Claim Number", "Hold Reason"]
        const Value2 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedByMidManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header2, Value2)
        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================
        
        //============================MidManager Reject the reserve as it is within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResRejectReason, "Reserve Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //============================MidManager Reject the reserve as it is within his limit ended here==================================================================================================================

        
        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await t.wait(2000)
        const Header3 = ["Claim Number", "Hold Reason"]
        const Value3 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header3, Value3)
        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================
      
        //============================MidManager can not approved the reserve as it is not within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Trying To Approve The Reserve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        var LimitMessageVerification = "Claim Number: " + strClaimNumber + " Reserve Type: "
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(LimitMessageVerification, true, "Hold status as reserve limit exceed")
        //============================MidManager can not approved the reserve as it is not within his limit ended here==================================================================================================================

        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager started here==================================================================================================================
        await t.wait(2000)
        const Header4 = ["Claim Number", "Hold Reason"]
        const Value4 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", Header4, Value4)
        //============================verification of Reserve getting Displayed on supervisory approval screen of MidManager ended here==================================================================================================================
        
        //============================MidManager Trying to Approve the reserve as it is not within his limit started here==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Approve Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Trying to approve the Reserve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Approve Comment save")
        var LimitMessageVerification1 = "Claim Number: " + strClaimNumber + " Reserve Type: "
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(LimitMessageVerification1, true, "Hold status as reserve limit exceed")
        //============================MidManager Trying to Approve the reserve as it is not within his limit ended here==================================================================================================================

        //============================Verify No Recorde aval started here==================================================================================================================
        await t.wait(2000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
        //============================Verify No Recorde aval started here ended here=================================================================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });

    /*
    1)Login into claim zone with SeniorManager
    2)Verify Diaries
    3)Approve & reject reserve which is under senior user limit
    4)Logout
    */
    test('AssureClaims_SeniorManagerApproveRejectReserve_Test_06', async t => {

        
        //===================================================Login into claim started here==================================================================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strSrFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log("Login Into Application with Senior Manager!!")
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(15000)

        //===================================================Verification of reserve approve by SeniorManager started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeApprovedBySeniorManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText1 = "Reserve Approval Request of"
        var UserDiaryText2 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText1), "Approval of Reserve By SeniorManager")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText2), "Approval of Reserve By SeniorManager")
        const SrManagerApprovalHead1 = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerApprovalVal1 = [strSrLastName + " " + strSrFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strSrLastName + " " + strSrFirstName, "Diary grid view", SrManagerApprovalHead1, SrManagerApprovalVal1)
        //===================================================Verification of reserve approve by SeniorManager ended here==================================================================================================================

        //===================================================Verification of reserve approval by SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeRejectedBySeniorManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText3 = "Reserve Approval Request of"
        var UserDiaryText4 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText3), "Approval of Reserve By MidManager")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText4), "Approval of Reserve By MidManager")
        const SrManagerApprovalHead2 = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerApprovalVal2 = [strSrLastName + " " + strSrFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strSrLastName + " " + strSrFirstName, "Diary grid view", SrManagerApprovalHead2, SrManagerApprovalVal2)
        //===================================================Verification of reserve approval by SeniorManager ended here==================================================================================================================

        //=============================verification of Reserve getting Displayed on supervisory approval screen of SeniorManager started here==================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Supervisory Approval");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SupervisoryApprovalIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Tab_Reserve, "Reserve Tab")
        const ColHeader1 = ["Claim Number", "Hold Reason"]
        const ColValue1 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", ColHeader1, ColValue1)
        //==============================verification of Reserve getting Displayed on supervisory approval screen of SeniorManager ended here==================================================================================================================

        //==============================SeniorManager approved the reserve as it is within his limit started here=============================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Approve, "Aprrove Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResApproveReason, "Reserve Approve", "Approve Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Aprrove Comment save")
        //==============================SeniorManager approved the reserve as it is within his limit ended here=================================================================================================================================================

        //==============================verification of Reserve getting Displayed on supervisory approval screen of SeniorManager started here=============================================================================================================================================
        const ColHeader2 = ["Claim Number", "Hold Reason"]
        const ColValue2 = [strClaimNumber, "Exceeded Reserve Limit"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strClaimNumber, "Reserve Supervisory Approval", ColHeader2, ColValue2)
        //==============================verification of Reserve getting Displayed on supervisory approval screen of SeniorManager ended here=============================================================================================================================================
       
        //==============================SeniorManager Reject the reserve as it is within his limit started here=============================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection, "Select First Row")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_Reject, "Reject Button")
        await In_Utility.AssureClaims_SetValue_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_ResRejectReason, "Reserve Reject", "Reject Reason TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment, "Reject Comment save")
        //==============================SeniorManager Reject the reserve as it is within his limit ended here=============================================================================================================================================

        //============================Verify No Recorde aval started here==================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(SupervisoryApproval_POM.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
        //============================Verify No Recorde aval ended here==================================================================================================================

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
        //===================================================Login into claim ended here==================================================================================================================
        await t.wait(25000)

        //===================================================Verfication of the reserve approved diary for the user started here==================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Diaries:Diary List");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.Assureclaims_Generic_DiaryFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeApprovedByMidManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText1 = "Reserve Approve Request of"
        var UserDiaryText2 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText1), "Approve of Reserve By MidManager")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText2), "Approve of Reserve By MidManager")
        const UserApproveHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserApproveVal = [strUserLastName + " " + strUserFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", UserApproveHead, UserApproveVal)
        //===================================================Verfication of the reserve approved diary for the user ended here==================================================================================================================


        //===================================================Verfication of the reserve Rejected diary for the user started here==================================================================================================================       
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeRejectedByMidManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryTextRej1 = "Reserve Reject Request of"
        var UserDiaryTextRej2 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryTextRej1), "Reject of Reserve By MidManager")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryTextRej2), "Reject of Reserve By MidManager")
        const UserRejectHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const UserRejectVal = [strUserLastName + " " + strUserFirstName, strMidLastName + " " + strMidFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", UserRejectHead, UserRejectVal)
        //===================================================Verfication of the reserve Rejected diary for the user ended here==================================================================================================================

        //===================================================Verification of reserve approve by SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeApprovedBySeniorManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryText3 = "Reserve Approve Request of"
        var UserDiaryText4 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText3), "Approve of Reserve By MidManager")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryText4), "Approve of Reserve By MidManager")
        const SrManagerApproveHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerApproveVal = [strUserLastName + " " + strUserFirstName, strSrLastName + " " + strSrFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", SrManagerApproveHead, SrManagerApproveVal)
        //===================================================Verification of reserve approve by SeniorManager ended here==================================================================================================================

        //===================================================Verification of reserve Reject by SeniorManager started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Diary_Utilities.AssureClaims_TaskName_DiaryVerification, strReserveTypeRejectedBySeniorManager1, "TaskName TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Utilities.AssureClaims_SystemUsers_Btn_FilterSearchTaskName, "Search Button Clicked")
        await t.wait(2000)
        var UserDiaryTextRej3 = "Reserve Reject Request of"
        var UserDiaryTextRej4 = "Reserve for Claim " + strClaimNumber
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryTextRej3), "Reject of Reserve By SeniorManager")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Diary_Creation.AssureClaimsApp_Diary_Lbl_ApprovalTaskname.withText(UserDiaryTextRej4), "Reject of Reserve By SeniorManager")
        const SrManagerRejectHead = ["Assigned User's FullName", "Assigning User's FullName"]
        const SrManagerRejectVal = [strUserLastName + " " + strUserFirstName, strSrLastName + " " + strSrFirstName]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(strUserLastName + " " + strUserFirstName, "Diary grid view", SrManagerRejectHead, SrManagerRejectVal)
        //===================================================Verification of reserve Reject by SeniorManager ended here==================================================================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(Diary_Creation.AssureClaimsApp_Diary_Lnk_AttachRecord.withText("Claim: " + strClaimNumber), "Claim Number Link")
        await t.wait(2000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Btn_MiniFinancialGraph, "Minimize Financial graph")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Finance Reserve Button")

        //===================================================Verfication of the reserve status & balance started here==================================================================================================================
        const ColHeader1 = ["Status", "Balance"]
        const ColValue1 = ["O - Open", "$105.00"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedByMidManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Financial grid view", ColHeader1, ColValue1)
        //===================================================Verfication of the reserve status & balance ended here==================================================================================================================

        //===================================================Verfication of the reserve status & balance started here==================================================================================================================
        const ColHeader2 = ["Status", "Balance"]
        const ColValue2 = ["O - Open", "$0.00"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedByMidManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Financial grid view", ColHeader2, ColValue2)
        //===================================================Verfication of the reserve status & balance ended here==================================================================================================================

        //===================================================Verfication of the reserve status & balance started here==================================================================================================================
        const ColHeader3 = ["Status", "Balance"]
        const ColValue3 = ["O - Open", "$210.00"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeApprovedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Financial grid view", ColHeader3, ColValue3)
        //===================================================Verfication of the reserve status & balance ended here==================================================================================================================

        //===================================================Verfication of the reserve status & balance started here==================================================================================================================
        const ColHeader4 = ["Status", "Balance"]
        const ColValue4 = ["O - Open", "$0.00"]
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, strReserveTypeRejectedBySeniorManager, "Enter Reserve Type")
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("O - Open", "Financial grid view", ColHeader4, ColValue4)
        //===================================================Verfication of the reserve status & balance ended here==================================================================================================================
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

        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")


        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "UnCheck", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove, "UnCheck", "Allow the group of supervisor to approve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame,"Time frame")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame.find('span').withText('Days'),"Select Time frame")
        await In_Utility.AssureClaims_SetValue_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Txt_ReserveDaysHoursForApproval.find('input'),"0","Days/Hours For Approval")

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
    2)UnCheck reserve limit 
    3)Logout
    */
    test("AssureClaims_RevertSecuritySetting_Test_09", async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(strUserFirstName, 'abkabk1', data.DSN, 'Security')
        console.log(`Login Into Application with ${strUserFirstName}`)
        //==============================================================Login Into Application with User ended==================================================================

        //==============================================================Uncheck reserve limit started here==================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, "Policy LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB.find('option').withText('GC - General Claims'), "Select LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, "LimitType")
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType.find('option').withText('Reserve Limits'), "Select Limit Type")
       
        //===================================================Remove reserve limit for Ground User 100$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strUserFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove reserve limit for Ground User 100$ ended here==================================================================================================================

        await t.wait(3000)

        //===================================================Remove reserve limit for Mid User 200$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strMidFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove reserve limit for Mid User 200$ ended here==================================================================================================================
        await t.wait(2000)

        //===================================================Remove reserve limit for Senior User 300$ started here==================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Txt_User, strSrFirstName, "User TextBox")
        await t.pressKey('tab')
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Btn_CancelLimit, "Cancel button")
        //===================================================Remove reserve limit for Senior User 300$ ended here==================================================================================================================
        await t.wait(2000)
        
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbLmt, "UnCheck", "UnChecked Enable Reserve Limits")
        //==============================================================Uncheck reserve limit ended here==================================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
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
        await t.wait(1000)
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

