import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_WCClaimParameters from '../Functional_POM/POM_WCClaimParameters';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const ConfigMgr_POM = new POM_Config_Manager();
const GenSysPar_POM = new POM_GeneralSystemParameter();
const WCClaimParameters_POM = new POM_WCClaimParameters();
const Nav_Utility = new Navigation_Utility();
const Function_Utility = new Functionality_Utility_Sec_Exh();

//***********************************************************************************
//JIRA ID OF STORY : RMA-97883, RMA-103620
//Description      : ExhSmoke_ConfigurationManager
//AUTHOR           : Saikrishan Maddula, Tushar Bachchan
//DEPENDANCY       : No
// PRE-REQUISITES  : No
//Preferred Server : IUTSQL
//***********************************************************************************
DataIUT.forEach(data => {

    const ConfigManagerLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Configuration Manager Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`ExhSmoke_ConfigurationManager`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
    });
    //Login Into ConfigurationManager
    //Go to General System Parameters Link On Config Manager Screen
    //Go to Diaries / Text Fields Tab On General System Parameters Screen
    //Click On Enhanced Notes  On Section General System Parameters Screen
    //Check Use Draft In Notes Checkbox On General System Parameters Screen
    test('AssureClaims_CheckUncheckConfigManagerSettings_Test_01', async t => {


        //============================================== Configuration Manager Settings -> Check 'use drafts' checkbox started ============================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Diaries / Text Fields", "Enhanced Notes");
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_UseDraftInNotes, "Check", "Use Draft In Notes Checkbox On General System Parameters Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
        await t.wait(3000);
        //============================================== Configuration Manager Settings -> Check 'use drafts' checkbox ended ============================================================
        //============================================== Configuration Manager Settings -> UnCheck 'use drafts' checkbox started ============================================================
        await t.wait(7000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_UseDraftInNotes, "UnCheck", "Use Draft In Notes Checkbox On General System Parameters Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
        //============================================== Configuration Manager Settings -> UnCheck 'use drafts' checkbox ended ============================================================
        await t.wait(3000);
    });
    /*
    1.Check/Uncheck Configuration Manager Settings
    */
    test('AssureClaims_CheckUncheckConfigManagerSettings_Test_02', async t => {

        //============================================== Configuration Manager Settings -> Check/UnCheck in General System Parameters started ============================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Claim");
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Lst_AutoAssignAdjuster, "Auto Assign Adjuster Dropdown");
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Lst_AutoAssignAdjusterOption.withText('Work Items'), "Auto Assign Adjuster Dropdown Option -> Work Items");
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_PrioritizeAdjustersHandlingExistingClaims, "Check", "Prioritize Adjusters Handling Existing Claims on General System Parameters Screen");

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_PrioritizeAdjustersHandlingExistingClaims, "UnCheck", "Prioritize Adjusters Handling Existing Claims on General System Parameters Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Lst_AutoAssignAdjuster, "Auto Assign Adjuster Dropdown");
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Lst_AutoAssignAdjusterOption.withText('Date/Time Assigned'), "Auto Assign Adjuster Dropdown Option -> Date/Time Assigned");
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_GenSysParaSetup_Chk_PrioritizeAdjustersHandlingExistingClaims, "UnCheck", "Prioritize Adjusters Handling Existing Claims on General System Parameters Screen");


        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");

        //============================================== Configuration Manager Settings -> Check/UnCheck in General System Parameters ended ============================================================
        //============================================== Configuration Manager Settings -> Check/UnCheck in Workers' Compensation Claim Parameters started ============================================================
        await t.switchToMainWindow()

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")
        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Workers' Compensation Claim Parameters", "wc", "Reserve", "Collections/Recoveries");

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(WCClaimParameters_POM.AssureClaims_WCClaimParameters_Chk_CalculateCollectioninReserveBalance, "Check", "Calculate Collections in Reserve Balance");

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(WCClaimParameters_POM.AssureClaims_WCClaimParameters_Chk_CalculateCollectioninReserveBalance, "UnCheck", "Calculate Collections in Reserve Balance");

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
        //============================================== Configuration Manager Settings -> Check/UnCheck in Workers' Compensation Claim Parameters ended ============================================================
        //============================================== Configuration Manager Settings ->Check/UnCheck Payment Parameters in started ============================================================

        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "Supervisory Approval")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "Check", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "Check", "Supervisory Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded, "UnCheck", "Reserve Limits Are Exceeded")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval, "UnCheck", "Supervisory Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
        //============================================== Configuration Manager Settings ->Check/UnCheck Payment Parameters in ended ============================================================

        await t.wait(3000);
    });
});
