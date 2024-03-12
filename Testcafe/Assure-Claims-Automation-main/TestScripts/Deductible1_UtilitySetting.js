import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import { ClientFunction } from 'testcafe';

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_GeneralClaimParameter from '../Functional_POM/POM_GeneralClaimParameter';

const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Function_Utility = new Functionality_Utility();
const Verify_Utility = new Verification_Utility();
const Deductible_POM = new POM_Deductible();
const ConfigMgr_POM = new POM_Config_Manager();
const GCP_POM = new POM_GeneralClaimParameter();

const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-90670,RMA-106956
//Description      : 
//AUTHOR           : Muskan Garg / Yashaswi Mendhekar
//DEPENDANCY       : No
/* PRE-REQUISITES  : 1. GCP --> Deductible --> Deductible reserve Mapping : Mapping required.
                     2. For Mapping : Reserve Type -> E Expense,  Deductible Reserve Type->  DE Deductible Expense , Deductible Transaction Type -> TDE Transaction Deductible Expense
 
*/
//Preferred Server : 194Automation, DSN3 : RM202REG_Test3
// *******************************************************************************************************************************

DataIUT.forEach(data => {
  fixture`Deductible1_UtilitySetting`.beforeEach(async t => {
    await t.wait(5000)
    await t.navigateTo(data.URL);
    await t.maximizeWindow();
  });



  test('AssureClaims_DeductibleUtilitySetting_Test_01', async t => {

    // ============================================Logging into application starts here =========================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
    await t.wait(14000)
    //  ============================================================ Logged into application ends here ==============================================================

    // ==============================================Configuration Manager Setting ON--->General Claim Parameter-->Turn On Use Policy Managment System starts here============================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Third Party Module", "Policy Management")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Chk_UsePolicyManagementSystem, "Check", "Check Use Policy Managment")

    if (await ConfigMgr_POM.AssureClaims_ConfigManager_Txt_ActivationCode.exists) {
      await In_Utility.AssureClaims_SetValue_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Txt_ActivationCode, data.UsePolicyManagmentSystem_ActivationCode, "Use Policy Managment activation password typed")
      await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_SavePassword, "Ok Button")
      await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_Save, "Save button clicked")
    }
    else {
      console.log(`Use Policy Managment setting is already checked`);
    }
    // ==============================================Configuration Manager Setting ON--->General Claim Parameter-->Turn On Use Policy Managment System ends here============================================================

    await t.wait(4000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_CloseBtn, "Close button clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
    await t.wait(4000)
    // ==============================================Configuration Manager Setting ON--->General Claim Parameter-->Turn On Deductible settings starts here============================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Deductible", "More Configurations")

    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Deductible_POM.AssureClaims_Utility_Chk_CalculateDeductiblePayments, "Check", "Calculate Deductible on Payments");
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Deductible_POM.AssureClaims_Utility_Chk_PreventPrintingZeroOrNegativeAmountChecks, "UnCheck", "Prevent Printing Zero or Negative Amount Checks and Set to Printed");
    await In_Utility.AssureClaims_SetValue_Utility(Deductible_POM.AssureClaims_Utility_Txt_AutomaticDeductibleRecoveryIdentifierCharacter, "D", "Automatic Deductible Recovery Identifier Character")
    await In_Utility.AssureClaims_SetValue_Utility(Deductible_POM.AssureClaims_Utility_Txt_ManualDeductibleRecoveryIdentifierCharacter, "MD", "Manual Deductible Recovery Identifier Character")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Deductible_POM.AssureClaims_Utility_Chk_ShowRecoveryReserveRowWhenDeductibleIsOn, "Check", "Show Recovery Reserve Row When Deductible Is On");
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
    await t.wait(5000);
    // ==============================================Configuration Manager Setting ON--->General Claim Parameter-->Turn On Deductible settings ends here============================================================
    await t.wait(4000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_CloseBtn, "Close button clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
    await t.wait(4000)
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Deductible", "Deductible Reserve Mapping")
    await Verify_Utility.AssureClaims_ElementExist_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Lst_Exists, "Deductible mapping record exists");
  
    //  ===================================================Logout from Application starts here ===============================================================================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    console.log("Logout from Application!!")
    //  ===================================================Logout from Application ends here ===============================================================================================================

  });

});

