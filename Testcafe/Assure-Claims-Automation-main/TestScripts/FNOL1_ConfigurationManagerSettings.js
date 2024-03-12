import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_FNOL from '../Functional_POM/POM_FNOL';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';

const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');

const Function_Utility = new Functionality_Utility();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const FNOL_POM = new POM_FNOL();

// Function to select a value of dropdown in Policy Interface Setting Page
const selectDropdown = async (Element, dropdownName, Value) => {

    await Nav_Utility.AssureClaims_ElementClick_Utility(Element, `Dropdown ${dropdownName} is clicked`)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="option"]').find('span').withText(Value), `${Value} is selected`)

}

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-99680, RMA-103318
//Description      : Automating settings for FNOL Reserves.
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_3
// *******************************************************************************************************************************


DataIUT.forEach(data => {
    fixture`FNOL1_ConfigurationManagerSettings`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });

    /* Steps performed by AssureClaims_EnableFNOLReserves_Test_01 :
        1. Login Into Application with User
        2. Payment Parameter SetUp in Configuration manager page
        3. Checked Use FNOL Reserve
        4. Policy interface Code Mapping for Policy System, Policy LOB, Coverage Type and Loss type
        5. Loss Code Mapping
        6. Creation of Fnol Reserve
        7. End
    */
    test('AssureClaims_EnableFNOLReserves_Test_01', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${data.Username}`)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Payment Parameter SetUp in Configuration manager started================================================

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "More Configurations")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaimsApp_PaymentParameters_Chk_UseFNOLReserve, "Check", "Use FNOL Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        await t.wait(2000)

        //====================================================Payment Parameter SetUp in Configuration manager ended================================================

        await t.wait(2000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Policy Interface Setting", "policyinterface", "Code Mapping", "Policy Interface")
        //===================================================================Policy LOB Mapping Started===================================================================================
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_PolicySystem, "Policy System", data.PolicySystem)
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CodeType, "Code Type", "Policy LOB")
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "APV - APV" started here===================================================================================
        
        {
            const strGridFilledStatus = Selector('[class="ag-overlay-no-rows-center"]').innerText ?? "Rows Present";
            const gridValues = await Selector('#myGrid').find('[class="ag-selection-checkbox"]').sibling(0)
            let bPolicyLOBExists = false;
            if(strGridFilledStatus !== "No Rows To Show"){
                let iterations = await gridValues.count;
                for (let i = 0; i < iterations; i++) {
                    let strVal = await gridValues.nth(i).innerText;
                    if (strVal === data.PolicyClaimCodeAPV) {
                        bPolicyLOBExists = true;
                    }
                }
            }
            
            
            
            if (!bPolicyLOBExists) {
                
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_PolicyCodeMapping, "Add Button")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystem, "Policy System", data.PolicySystem)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlCodeType, "Code Type", "Policy LOB")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlClaimcodes, "Claim Codes", data.PolicyClaimCodeAPV)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystemInterfacecodes, "Policy System Interface codes", data.PolicyClaimCodeAPV)
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_ToolbarSave, "Save")
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Cancel, "Cancel Button")
                await t.wait(4000)
                
            }
        }
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "APV - APV" ended here===================================================================================
        
        //===================================================================Policy LOB Mapping Ended===================================================================================
        //===================================================================Coverage Type  Mapping Started===================================================================================
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "101 - 101" started here===================================================================================
        
        
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_PolicySystem, "Policy System", data.PolicySystem)
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CodeType, "Code Type", "Coverage Types")
        {
            const strGridFilledStatus = Selector('[class="ag-overlay-no-rows-center"]').innerText ?? "Rows Present";
            const gridValues = await Selector('#myGrid').find('[class="ag-selection-checkbox"]').sibling(0)
            let bCoverageTypeExists = false;
            if(strGridFilledStatus !== "No Rows To Show"){
                let iterations = await gridValues.count;
                for (let i = 0; i < iterations; i++) {
                    let strVal = await gridValues.nth(i).innerText;
                    if (strVal === data.PolicyClaimCode101) {
                        bCoverageTypeExists = true;
                    }
                }
            }
            
            
            if (!bCoverageTypeExists) {
                
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_PolicyCodeMapping, "Add Button")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystem, "Policy System", data.PolicySystem)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlCodeType, "Code Type", "Coverage Types")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlClaimcodes, "Claim Codes", data.PolicyClaimCode101)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystemInterfacecodes, "Policy System Interface codes", data.PolicyClaimCode101)
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_ToolbarSave, "Save")
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Cancel, "Cancel Button")
                await t.wait(4000)
                
            }
        }
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "101 - 101" ended here===================================================================================
        
        //===================================================================Coverage Type Mapping Ended===================================================================================
        //===================================================================Loss Type Codes Mapping Started===================================================================================
        
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "NEWCODE - NEWCODE" started here===================================================================================
        
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_PolicySystem, "Policy System", data.PolicySystem)
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CodeType, "Code Type", "Loss Type Codes")
        {
            const strGridFilledStatus = Selector('[class="ag-overlay-no-rows-center"]').innerText ?? "Rows Present";
            const gridValues = await Selector('#myGrid').find('[class="ag-selection-checkbox"]').sibling(0)
            let bLossTypeCodesExists = false;
            if(strGridFilledStatus !== "No Rows To Show"){
                let iterations = await gridValues.count;
                for (let i = 0; i < iterations; i++) {
                    let strVal = await gridValues.nth(i).innerText;
                    if (strVal === data.PolicyClaimCodeNEWCODE) {
                        bLossTypeCodesExists = true;
                    }
                }
            }
            
            if (!bLossTypeCodesExists) {
                
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_PolicyCodeMapping, "Add Button")
                
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystem, "Policy System", data.PolicySystem)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlCodeType, "Code Type", "Loss Type Codes")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlClaimcodes, "Claim Codes", data.PolicyClaimCodeNEWCODE)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystemInterfacecodes, "Policy System Interface codes", data.PolicyClaimCodeNEWCODE)
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_ToolbarSave, "Save")
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Cancel, "Cancel Button")
                await t.wait(4000)
            }
        }
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "NEWCODE - NEWCODE" started here===================================================================================
        //===================================================================Loss Type Codes Mapping Ended===================================================================================
        //===================================================================Loss Type Mapping Started===================================================================================
        
        await t.wait(2000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('mat-icon').withText("close"), "Close Policy System Interface Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")
        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Policy Interface Setting", "policyinterface", "Code Mapping", "Loss Code")
        
        
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_PolicySystem, "Policy System", data.PolicySystem)
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_PolicyClaimLob, "Policy Claim LOB", data.PolicyClaimCodeAPV)
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CoverageType, "Coverage Type", data.PolicyClaimCode101)
        await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_PolicySystemLossCode, "Policy System Loss code", data.PolicyClaimCodeNEWCODE)
        
        //===================================================================Block of Code to check if Row corresponding to the 4 filled fields is present in the grid : if present move forward else add the required values started here===================================================================================
        await t.wait(2000)
        
        {
            const strGridFilledStatus = Selector('[class="ag-overlay-no-rows-center"]').innerText ?? "Rows Present";
            const gridValues = await Selector('#myGrid').find('[class="ag-selection-checkbox"]').sibling(0)
            let bLossTypeCodesExists = false;
            if (strGridFilledStatus !== "No Rows To Show") {
                let iterations = await gridValues.count;
                for (let i = 0; i < iterations; i++) {
                    let strVal = await gridValues.nth(i).innerText;
                    if (strVal === data.PolicySystem) {
                        bLossTypeCodesExists = true;
                    }
                }
            }
            if (!bLossTypeCodesExists) {
                
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Lst_LossCodeMapping, "Add Button")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystem, "Policy System", data.PolicySystem)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicyClaimLob, "Policy LOB", data.PolicyClaimCodeAPV)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlCoverageType, "Coverage type", data.PolicyClaimCode101)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlPolicySystemLoss, "Policy System Loss", data.PolicyClaimCodeNEWCODE)
                await t.wait(2000)
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_CtrlClaimLossCode, "Claim Loss", data.PolicyClaimCodeNEWCODE)
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_ToolbarSave, "Save")
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Cancel, "Cancel Button")
                await t.wait(4000)
                
            }
        }
        //===================================================================Block of Code to check if Row corresponding to the 4 filled fields is present in the grid : if present move forward else add the required values ended here===================================================================================
        
        //===================================================================Loss Type Mapping Ended===================================================================================
        //===================================================================Creation of Fnol Reserve Started===================================================================================
        
        await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[class="ag-selection-checkbox"]').find('input'), "Checked the first row")
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "APV - APV" started here===================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_LossCodeMappingAddReserve, "Add Reserves")
        {
            const strGridFilledStatus = Selector('[class="ag-overlay-no-rows-center"]').innerText ?? "Rows Present";
            const gridValues = await Selector('#myGrid').find('[class="ag-selection-checkbox"]').sibling(0)
            let bExpenseTypeExists = false;
            if (strGridFilledStatus !== "No Rows To Show") {
                let iterations = await gridValues.count;
                for (let i = 0; i < iterations; i++) {
                    let strVal = await gridValues.nth(i).innerText;
                    if (strVal === "Expense") {
                        bExpenseTypeExists = true;
                    }
                }
            }
            if (!bExpenseTypeExists) {
                
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_LossCodeReservesAdd, "Add button")
                await selectDropdown(FNOL_POM.AssureClaims_FNOL_Lst_ReserveType, "Reserve Type", "E - Expense")
                await In_Utility.AssureClaims_SetValue_Utility(FNOL_POM.AssureClaims_FNOL_Lst_ReserveAmount, "50", "Reserve Amount")
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_ToolbarSave, "Save")
                await Nav_Utility.AssureClaims_ElementClick_Utility(FNOL_POM.AssureClaims_FNOL_Btn_Cancel, "Cancel Button")
                await t.wait(4000)
                
            }
        }
        //===================================================================Block of Code to check if Policy Claim Code is present in the grid : if present move forward else add the required values : Here the policy claim Code is "APV - APV" started here===================================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        //===================================================================Creation of Fnol Reserve Ended===================================================================================
        
    });
});




