import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import { ClientFunction } from 'testcafe';

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const Nav_Utility = new Navigation_Utility();
const Function_Utility = new Functionality_Utility();
const ConfigMgr_POM = new POM_Config_Manager();
const Deductible_POM = new POM_Deductible();

const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-90670,RMA-106956
//Description      : 
//AUTHOR           : Muskan Garg / Yashaswi Mendhekar
//DEPENDANCY       : No
/* PRE-REQUISITES  : No
*/
//Preferred Server : 194Automation, DSN3 : RM202REG_Test3
// *******************************************************************************************************************************

DataIUT.forEach(data => {
    fixture`Deductible5_RevertSetting`.beforeEach(async t => {
        await t.wait(5000)
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
    });

    test('AssureClaims_RevertDeductibleUtilitySetting_Test_01', async t => {
        // ============================================Logging into application starts here =========================================================

        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
        await t.wait(4000)
        // ============================================Logging into application ends here =========================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Deductible", "More Configurations")
        await t.wait(5000)
        // ==============================================Configuration Manager Setting OFF--->General Claim Parameter-->Turn OFF Deductible settings starts here============================================================

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Deductible_POM.AssureClaims_Utility_Chk_CalculateDeductiblePayments, "UnCheck", "Calculate Deductible on Payments");
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Deductible_POM.AssureClaims_Utility_Chk_PreventPrintingZeroOrNegativeAmountChecks, "UnCheck", "Prevent Printing Zero or Negative Amount Checks and Set to Printed");
        await t.click(Deductible_POM.AssureClaims_Utility_Txt_AutomaticDeductibleRecoveryIdentifierCharacter)
        await t.pressKey('ctrl+a delete')
        await t.click(Deductible_POM.AssureClaims_Utility_Txt_ManualDeductibleRecoveryIdentifierCharacter)
        await t.pressKey('ctrl+a delete')
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Deductible_POM.AssureClaims_Utility_Chk_ShowRecoveryReserveRowWhenDeductibleIsOn, "UnCheck", "Show Recovery Reserve Row When Deductible Is On");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(5000);
        // ==============================================Configuration Manager Setting OFF--->General Claim Parameter-->Turn OFF Deductible settings ends here============================================================

        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        console.log("Logout from Application!!")

    });

});
