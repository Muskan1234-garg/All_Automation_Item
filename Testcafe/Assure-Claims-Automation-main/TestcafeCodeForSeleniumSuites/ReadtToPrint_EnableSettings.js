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
//JIRA ID OF STORY : RMA-109247 
//Description      :
// Payment Parameters > Payment > More Configuration > Prompt to Mark Transaction as ready to print > Enable
//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : No
/* PRE-REQUISITES  : 
*/
//Preferred Server : None
// *******************************************************************************************************************************

DataIUT.forEach(data => {
    fixture`ReadyToPrint_EnableSettings`.beforeEach(async t => {
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
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "More Configurations")
    
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_PromptToMarkTransactionAsReadyToPrint, "Check", "Enable Prompt to mark transaction as ready to print")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
      
        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        console.log("Logout from Application!!");
        // --------------------------------------------------------------------------Logout from the Appliction---------------------------------------------------------------------------------------------------
    });
});