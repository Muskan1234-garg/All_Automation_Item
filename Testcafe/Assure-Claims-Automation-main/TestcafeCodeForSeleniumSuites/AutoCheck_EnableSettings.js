import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Nav_Utility = new Navigation_Utility();
const Function_Utility = new Functionality_Utility();
const ConfigMgr_POM = new POM_Config_Manager();

const DataIUT = require('../DataFiles/DataAutoRegDSN_1.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109246 
//Description      : 
// 1. Payment Parameters -> Payment (Horizontal Menu) -> Void (Verticle Menu) -> Check 'Check Void Reason' -> Turn ON
// 2. Payment Parameters -> Payment (Horizontal Menu) -> Payee (Verticle Menu) -> Check 'Include Prefix on Payments' & Check 'Include Suffix on Payments' -> Turn ON
//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : No
/* PRE-REQUISITES  : 

 
*/
//Preferred Server : 194Automation, DSN3 : RM202REG_Test3
// *******************************************************************************************************************************

DataIUT.forEach(data => {
    fixture`AutoCheck_EnableSettings`.beforeEach(async t => {
        await t.wait(5000);
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
    });

    test('AssueClaims_TurnOnSettingFromConfigManager_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application Configuration Manager`)
        //=============================================================Login Into Application with User ended=========================================================================
    
        //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Void")
    
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CheckVoidReason, "Check", "Void code reason")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Payee")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_IncludePrefixOnPayments, "Check", "Void code reason")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_IncludeSuffixOnPayments, "Check", "Void code reason")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
        // --------------------------------------------------------------------------Fourth Record Ends here ----------------------------------------------------------------------------------------------------

        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        console.log("Logout from Application!!");
        // --------------------------------------------------------------------------Logout from the Appliction---------------------------------------------------------------------------------------------------
    });
});