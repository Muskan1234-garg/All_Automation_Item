import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_UserPrivilegesSetUp from '../Functional_POM/POM_UserPrivilegesSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';

const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const GenSysPara_POM = new POM_GeneralSystemParameter();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const UserPrevSetUp_POM = new POM_UserPrivilegesSetUp();
const Verification_Msg = new POM_VerificationMessage();

const DataIUT = require('../DataFiles/Smoke.json');


DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const securityLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(15000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`Prerequisites.js`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    var CP = "E514E-AF10D-BFD6E-76D45-4A612";

    test('AssureClaims_ConfigurationManager_Setting_Test_01', async t => {

        await t.wait(10000)
        //====================================================General System Parameters in Configuration manager started================================================
        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Claims Module", "Case Management")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPara_POM.AssureClaims_ConfigManager_Chk_UseCaseManagement, "UnCheck", "Use case management")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================General System Parameters in Configuration manager ended================================================

        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Policy Interface")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#usePolicyInterface-input'), "Check", "use Policy system Interface")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        if (data.DSN === "RM202REG_Test2") {
            await t.wait(5000);
            await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Client Program")
            await t.wait(5000);
            await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useClientProgram-input'), "Check", "client program")
            let active = await Selector('#activationCodeVal').exists
            if (active) {
                await In_Utility.AssureClaims_SetValue_Utility(Selector('#activationCodeVal'), CP, "Client program")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('#button_button'), "Ok Button")
            }
            else {
                console.log(`client program setting is already checked`);
            }
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        }

        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("System")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("General")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#searchCodeDescription-input'), "Check", "Search on Short Code & Code Description")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Diaries / Text Fields")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Diary")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#defAssignedTo-input'), "Check", "Default Assigned to in Create Diary to Current User")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#currentDateForDiaries-input'), "UnCheck", "Use Current Date for Completed Diaries")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.switchToMainWindow()
        await t.click(Selector('[aria-label="Close"]').find('mat-icon'))
        await t.wait(2000)
        await t.click("#menuButton")
        await t.wait(2000)
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

        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("More Configurations")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#fnolReserve-input'), "UnCheck", "fnol Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

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

        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("More Configurations")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useResFilter-input'), "Check", "Use Reserve Type to Filter Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")


        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Bank Account")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#subBankAcc-input'), "UnCheck", "Use Sub Bank Accounts")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useMasterBankAcc-input'), "Check", "Use Master Bank Accounts")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#accMasterDepositBal-input'), "Check", "Do Not Check Master Account Deposit Balances")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Void")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#enableVoidReasonComment-input'), "UnCheck", "Check void reason")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")


        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Check")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Roll Up")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#rollUpChecks-input'), "UnCheck", "Roll Up Checks to the same payee")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")



        await t.switchToMainWindow()
        await t.click(Selector('[aria-label="Close"]').find('mat-icon'))
        await t.wait(2000)
        await t.click("#menuButton")
        await t.wait(2000)
        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Policy Interface Setting", "policyinterface", "Policy System Setup", "Policy Configuration")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useCodeMapping-input'), "Check", "use Code Mapping")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#allowAutoLogin-input'), "Check", "Allow AutoLogin from External Policy System")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#showMediaViewButton-input'), "Check", "show Media View Button")
        await In_Utility.AssureClaims_SetValue_Utility(Selector('#policySearchCount'), "100", "Fetch Records on Policy Search")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")



    });

    test('AssureClaims_ConfigManagerSetting_Test_02', async t => {
       
        await t.wait(10000)

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Property Claim Parameters", "pc", "Claim", "Duplicate Criteria")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkDuplicateClaim-input'), "UnCheck", "Allow Check For Possible Duplicate Claims")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Check/Uncheck Setting for supervisory payment over Configuration manager started here===================================================================================

        await t.switchToMainWindow()
        await t.click(Selector('[aria-label="Close"]').find('mat-icon'))
        await t.wait(2000)
        await t.click("#menuButton")
        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Vehicle Accident Claim Parameters", "va", "Claim", "Duplicate Criteria")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkDuplicateClaim-input'), "UnCheck", "Allow Check For Possible Duplicate Claims")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")


        await t.switchToMainWindow()
        await t.click(Selector('[aria-label="Close"]').find('mat-icon'))
        await t.wait(2000)
        await t.click("#menuButton")
        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Workers' Compensation Claim Parameters", "wc", "Claim", "Duplicate Criteria")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkDuplicateClaim-input'), "UnCheck", "Allow Check For Possible Duplicate Claims")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

    });

    test('AssureClaims_ConfigManagerSetting_Test_03', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Third Party Module", "Policy Management")
        await t.wait(5000);

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useEnhPol-input'), "Check", "Use Policy Managment")
        var active = await Selector('#activationCodeVal').exists

        if (data.DSN === "RM202REG_Test1") {
        
            if (active) {
                await In_Utility.AssureClaims_SetValue_Utility(Selector('#activationCodeVal'), "A40AC-43CA4-D95E6-6719A-5EF8C", "Use Policy Managment")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('#button_button'), "Ok Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector("#lobparameterssetup_SAVE_button"), "Save")
            }
            else {
                console.log(`Use Policy Managment setting is already checked`);
            }
        }
        if (data.DSN === "RM202REG_Test2") {
            if (active) {
                await In_Utility.AssureClaims_SetValue_Utility(Selector('#activationCodeVal'), "A40AC-43CA7-7B93F-FE962-27B98", "Use Policy Managment")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('#button_button'), "Ok Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector("#lobparameterssetup_SAVE_button"), "Save")
            }
            else {
                console.log(`Use Policy Managment setting is already checked`);
            }
        }
        if (data.DSN === "RM202REG_Test3") {
            if (active) {
                await In_Utility.AssureClaims_SetValue_Utility(Selector('#activationCodeVal'), "A40AC-43CAA-347E2-FB52B-9D00D", "Use Policy Managment")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('#button_button'), "Ok Button")
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector("#lobparameterssetup_SAVE_button"), "Save")
            }
            else {
                console.log(`Use Policy Managment setting is already checked`);
            }
        }


        await Nav_Utility.AssureClaims_ElementClick_Utility(Selector("#lobparameterssetup_SAVE_button"), "Save")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(8000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Reserve")
        await t.wait(10000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Main Configurations")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkInsufficientReserve-input'), "UnCheck", "UnCheck for Insufficient Reserve Funds")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Claim")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Duplicate Criteria")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkDuplicateClaim-input'), "UnCheck", "UnCheck forAllow Check For Possible Duplicate Claims")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        if (data.DSN === "RM202REG_Test3") {

            await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Deductible")
            await t.wait(2000);
            await Nav_Utility.AssureClaims_ConfigManagerLeftTab("More Configurations")

            await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#calculateDeductiblePayments-input'), "Check", "Check for Calculate Deductible on Payments")
            await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#preventPrintZeroCheck-input'), "UnCheck", "UnCheck for Prevent Printing Zero or Negative Amount Checks and Set to Printed")

            await t.click(Selector('[aria-labelledby="lbl_dedRecoveryIdentifierChar"]'))
            await t.pressKey('ctrl+a delete')
            await t.typeText(Selector('[aria-labelledby="lbl_dedRecoveryIdentifierChar"]'), 'D')

            await t.wait(2000)
            await t.click(Selector('[aria-labelledby="lbl_manualDedRecoveryIdentifierChar"]'))
            await t.pressKey('ctrl+a delete')
            await t.typeText(Selector('[aria-labelledby="lbl_manualDedRecoveryIdentifierChar"]'), 'MD')

            await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#showRecoveryReserveRowWhenDeductibleIsOn-input'), "Check", "Show Recovery Reserve Row When Deductible Is On");
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")


        }




    });


    test('AssureClaims_OffLimitSettings_Test_04', async t => {

        await t.wait(10000)

        await t.setNativeDialogHandler(() => true).useRole(securityLogin);
        await t.wait(10000)

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:User Privileges Setup")
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UserPrivilegesIframe)
        await t.wait(5000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LOB, 'GC - General Claims', "Select LOB")

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Reserve Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Reserve Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Print Check Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "Print Check Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Payment Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Payment Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Pay Detail Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Pay Detail Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Claim Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Claim Limits")
        await t.wait(2000)
       
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Event Type Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Event Type Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Pay Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Per Claim Pay Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Incurred Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Per Claim Incurred Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Per Policy Pay Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Per Claim Per Policy Pay Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Claim Per Coverage Pay Limits', "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Per Claim Per Coverage Pay Limits")
        await t.wait(2000)

        await In_Utility.AssureClaims_ElementWebListSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrev_Lst_LimitType, 'Per Financial Key Pay Limits' , "Select Limit Type")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(UserPrevSetUp_POM.AssureClaims_UserPrevLimit_Chk_EnbPayLmt, "UnCheck", "UnChecked Per Financial Key Pay Limits")
        await t.wait(2000)
    });

});
