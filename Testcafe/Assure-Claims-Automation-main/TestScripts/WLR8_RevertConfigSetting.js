import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_WorkLossRestriction from '../Functional_POM/POM_WorkLossRestriction';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';

const DataSTG = require('../DataFiles/DataAutoRegDSN_1.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const WorkLoss_POM = new POM_WorkLossRestriction();
const GenSysPara_POM = new POM_GeneralSystemParameter();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Verification_Msg = new POM_VerificationMessage();

// ***************************************************************************************************************
//JIRA ID OF STORY   : RMA-101853
//Description        :UnCheck setting "Create Work Loss and Restriction Records From Funds From/To Dates"
//UnCheck case management
//Delete Workloss record, Delete Restriction record
//AUTHOR             : Muskan garg
//DEPENDANCY         : NO
//PRE-REQUISITE      : None
//Preferred Env.    :  None
// *******************************************************************************************************************

DataSTG.forEach(data => {
    const ConfigurationManagerLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );


    fixture`WLR8_RevertConfigSetting`.beforeEach(async t => {
        await t.wait(3000)
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerLogin);
    });

    /*
    1) UnCheck setting Create Work Loss and Restriction Records From Funds From/To Dates
    */
    test('AssureClaims_ConfigurationManager_TurnOffSettingCreateWLRFromFundsFromToDate_Test_01', async t => {

        //===============================Payment Parameter->Payment->More Configuration->Create Work Loss and Restriction Records From Funds From/To Dates(Uncheck checkbox) started here=======================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "More Configurations")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CreateWorkLossAndRestrictionRecordsFromFundsFromToDates, "UnCheck", "Create Work Loss and Restriction Records From Funds From/To Dates")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        //===============================Payment Parameter->Payment->More Configuration->Create Work Loss and Restriction Records From Funds From/To Dates(Uncheck checkbox) started here=======================================================================================================
    });

    /*
    1) UnCheck setting Case Management
    */
    test('AssureClaims_ConfigurationManager_TurnOffSettingCaseManagment_Test_02', async t => {

        //==================================General System Parameter-Claims Module->Case Management->Turn off Case Management setting started here=======================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Claims Module", "Case Management")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPara_POM.AssureClaims_ConfigManager_Chk_UseCaseManagement, "UnCheck", "case management")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        //==================================General System Parameter-Claims Module->Case Management->Turn off Case Management setting ended here=======================================================================================================
    });

    /*
    1)Delete workloss record
    2)Delete restriction record
    */
    test('AssureClaims_DeleteWorklossRestrictionRecord_Test_03', async t => {

        await t.wait(2000)

        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Work Loss/Restrictions Mapping");
        await t.wait(5000);
        await t.switchToIframe(Selector('#worklossrestrictions'))
        //await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkLossRestrictionsMappingIframe);
        await t.wait(5000);

        //=========================================================Delete Created Record started here===============================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Chk_SelectRecord, "Select created record")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_DeleteRecord, "Delete record")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ConfirmButtton, "Confirm Button")
        await t.wait(7000)
        //=========================================================Delete Created Record started here===============================================================================================================================================================================

        //=========================================================Delete Created Record started here===============================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Chk_SelectRecord, "Select created record")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_DeleteRecord, "Delete record")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ConfirmButtton, "Confirm Button")
        await t.wait(7000)
        //=========================================================Delete Created Record started here===============================================================================================================================================================================



    });



})

