import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const ConfigMgr_POM = new POM_Config_Manager();
const GenSysPar_POM = new POM_GeneralSystemParameter();
const Nav_Utility = new Navigation_Utility();
const Function_Utility = new Functionality_Utility();

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

var faker = require('faker');
/*************************************************************************************************
//JIRA ID OF STORY : RMA-107095
//Description      : Automate a testcafe scripts to Enable/Disable setting for Combine payment.
                      Required Settings:

                  1. General System Parameters -> Maintenance -> Enable Multiple Address Check Box
                  2. General System Parameters -> Maintenance -> Enable Add Modify Addresses Check Box
                  3. Payment Parameters -> Payment -> Bank Account -> Disable Use Sub Bank Accounts
                  4. Payment Parameters -> Check -> EOB -> Disable 'Print EOB Detail On Check Stub'
                  5. Payment Parameters -> Check -> EOB -> Disable 'Print EOBs with Checks'
                  6. Payment Parameters > Check -> Roll Up> Disable 'Roll Up Checks to the same payee'

//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : NO
//PRE-REQUISITES   : NO
//Preferred Server : 194Automation, DSN2
//************************************************************************************************* */


DataIUT.forEach(data => {
    fixture`CombinedPayments_Settings`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });


    test('AssureClaims_ConfigurationManager_CombinedPaymentSetting_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================General System Parameters in Configuration manager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Maintenance")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities, 'Check', "check Enable Multiple Addresses For Entities Check Box")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Chk_EnableAddModifyAddresses, 'Check', "check Enable Multiple Addresses For Entities Check Box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================General System Parameters in Configuration manager ended================================================
        
        await t.switchToMainWindow()
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_MenuButton, "Menu Button Clicked")
        await t.wait(2000)

        //====================================================Payment Parameter SetUp in Configuration manager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Bank Account")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_ConfigManager_Chk_UseSubBankAccounts, "UnCheck", "Use Sub Bank Account Checkbox uncheck")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Check")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("EOB")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Chk_PrintEOBStub, "UnCheck", "print EOB Stub Checkbox uncheck")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Chk_PrintEOBChecks, "UnCheck", "print EOB Checks Checkbox uncheck")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Roll Up")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_rollUpChecks, "UnCheck", "Disable roll up checks")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration manager ended================================================



    });
});
