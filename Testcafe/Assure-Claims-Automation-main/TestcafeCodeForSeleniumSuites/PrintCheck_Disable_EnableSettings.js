import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import { ClientFunction } from 'testcafe';

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Function_Utility = new Functionality_Utility();
const ConfigMgr_POM = new POM_Config_Manager();

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109971
//Description      : 
//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : No
/* PRE-REQUISITES  : 
1.  CM >> Payment Parameters >> Check >> Check Output >> Uncehck - Allow Post Date of Checks
2. CM >> Payment Parameters >> Check >> EOB >> Uncehck -Print EOBs with Checks
3. CM >> Payment Parameters >> Check >> EOB >> Uncehck -Print EOB Detail On Check Stub
4. CM >> Payment Parameters >> Check >> Roll Up >> Check - Roll Up Checks to the same payee
5. Distribution Type to Print Type Mapping
   5.1. Expresss Mail to File Only
   5.2. Regular Mail to Printer & File
   5.3. FX-Wires to Custom File Only
   5.4. Wire TRansfer to Printer Only
 
*/
//Preferred Server : 194Automation, DSN3 : RM202REG_Test3
// *******************************************************************************************************************************

DataIUT.forEach(data => {
    fixture`PrintCheck_Disable/EnableSetting`.beforeEach(async t => {
        await t.wait(5000);
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
    });

    test('AssureClaims_PrintCheckSetting_Test_01', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager');
        console.log("Login Into Application!!--> Configuration Manager ".bgCyan);
        await t.wait(4000);
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Check", "Check Output");

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Chk_AllowPostChecks, "UnCheck", "Use FNOL Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        await t.wait(2000)
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
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ConfigManagerUpperTab("Check")
        await t.wait(1000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Check Output")
        await t.wait(2000);
        // const table = Selector('[role="table"]');
        const rowCount = await (PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_SelectGridRow).count;
        console.log('Number of rows in the table:', rowCount);

        if (rowCount > 0) {
            for (let i = 0; i < rowCount; i++) {
                await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_SelectGridRow, "Select gride Successfully ")
                await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_DeleteGridRow, "Delete Grid button clicked")
                await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ConfirmDelete, "Deleted Successfully "+i)
                console.log("Deleted all records")
            }
        }
        else {
            console.log('No checkboxes was found.');
        }
        // --------------------------------------------------------------------------First Record Starts here ----------------------------------------------------------------------------------------------------
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_Add, "Add button clicked")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_DistributionType, "FX Wires", "Add FX Wires DistributionType")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_PrintCheckToFileOption, "To Custom File Only", "Add To Custom File Only over Print Check To File Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save.nth(1), "Save")
        // --------------------------------------------------------------------------First Record Ends here ----------------------------------------------------------------------------------------------------
        // --------------------------------------------------------------------------Second Record Starts here ----------------------------------------------------------------------------------------------------

        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_Add, "Add button clicked")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_DistributionType, "Express Mail", "Add FX Wires DistributionType")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_PrintCheckToFileOption, "To File Only", "Add To File Only over Print Check To File Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save.nth(1), "Save")
        // --------------------------------------------------------------------------Second Record Ends here ----------------------------------------------------------------------------------------------------
        // --------------------------------------------------------------------------Third Record Starts here ----------------------------------------------------------------------------------------------------

        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_Add, "Add button clicked")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_DistributionType, "Regular Mail", "Add FX Wires DistributionType")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_PrintCheckToFileOption, "To Printer and File", "Add To Printer and File over Print Check To File Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save.nth(1), "Save")
        // --------------------------------------------------------------------------Third Record Ends here ----------------------------------------------------------------------------------------------------
        // --------------------------------------------------------------------------Fourth Record Starts here ----------------------------------------------------------------------------------------------------

        await Nav_Utility.AssureClaims_ElementClick_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Btn_Add, "Add button clicked")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_DistributionType, "Wire Transfer", "Add Wire Transfer DistributionType")
        await t.wait(4000);
        await In_Utility.AssureClaims_ConfigManagerElementWebList_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Txt_PrintCheckToFileOption, "To Printer Only", "Add To Printer Only over Print Check To File Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save.nth(1), "Save")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        // --------------------------------------------------------------------------Fourth Record Ends here ----------------------------------------------------------------------------------------------------

        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        console.log("Logout from Application!!");
        // --------------------------------------------------------------------------Logout from the Appliction---------------------------------------------------------------------------------------------------
    });
});