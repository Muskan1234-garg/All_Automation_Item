import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import Input_Utility from '../Functional_Utilities/Input_Utility'
import POM_WorkLossRestriction from '../Functional_POM/POM_WorkLossRestriction';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';

const DataSTG = require('../DataFiles/DataAutoRegDSN_1.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const In_Utility = new Input_Utility();
const GenSysPara_POM = new POM_GeneralSystemParameter();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Verification_Msg = new POM_VerificationMessage();
const WorkLoss_POM = new POM_WorkLossRestriction();


// ***************************************************************************************************************
//JIRA ID OF STORY   : RMA-101853
//Description        : Check setting "Create Work Loss and Restriction Records From Funds From/To Dates"
//Check case management
//Add/Delete Workloss record, Add/Delete Restriction record
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


    fixture`WLR1_ConfigSetting`.beforeEach(async t => {
        await t.wait(3000)
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerLogin);
    });

    /*
    1) Check setting Create Work Loss and Restriction Records From Funds From/To Dates
    */
    test('AssureClaims_ConfigurationManager_TurnOnSettingCreateWLRFromFundsFromToDate_Test_01', async t => {

        //===============================Payment Parameter->Payment->More Configuration->Create Work Loss and Restriction Records From Funds From/To Dates(check checkbox) started here=======================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "More Configurations")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CreateWorkLossAndRestrictionRecordsFromFundsFromToDates, "Check", "Create Work Loss and Restriction Records From Funds From/To Dates")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        //==================================Payment Parameter->Payment->More Configuration->Create Work Loss and Restriction Records From Funds From/To Dates(check checkbox) ended here=======================================================================================================
    
    });


    /*
    1) Check setting Case Management
    */
    test('AssureClaims_ConfigurationManager_TurnOnSettingCaseManagment_Test_02', async t => {

        //==================================General System Parameter-Claims Module->Case Management->Turn on Case Management setting started here=======================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Claims Module", "Case Management")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPara_POM.AssureClaims_ConfigManager_Chk_UseCaseManagement, "Check", "case management")
        if (await ConfigMgr_POM.AssureClaims_ConfigManager_Txt_CaseManagementPassword.exists) {
            await In_Utility.AssureClaims_SetValue_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Txt_CaseManagementPassword, data.CaseManagmentPassword, "Case Management Password")
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_CaseManagementPasswordOk, "Ok Button")
        }
        else {
            console.log(`case management setting is already checked`);
        }
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        //==================================General System Parameter-Claims Module->Case Management->Turn on Case Management setting ended here=======================================================================================================

    });

    /*
    1)Add workloss record with transaction type 'Investigation Expense'
    2)Again add the same record and verify text 'Record already exists'
    3)Delete workloss record
    4)Add restriction record with transaction type 'Expert Witness Fees'
    2)Again add the same record and verify text 'Record already exists'
    3)Delete restriction record
    */
    test('AssureClaims_AddDeleteWorklossRestrictionRecord_Test_03', async t => {

        await t.wait(2000)

        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Work Loss/Restrictions Mapping");
        await t.wait(5000);
        await t.switchToIframe(Selector('#worklossrestrictions'))
       // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkLossRestrictionsMappingIframe);
        await t.wait(5000);

        //==========================================Work Loss/Restrictions Mapping->Add Record of WorkLoss(IV Investigation Expense) Started here ==============================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_Add, "Add Record")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_LOB, "LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("WC Worker's Compensation"), "Select LOB")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_RecordType, "Record Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("Work Loss"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_TransactionType, "Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SelectTransactionType.withText("Investigation Expense"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SaveBtn, "Save Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
        //==================================================Work Loss/Restrictions Mapping->Add Record of WorkLoss(IV Investigation Expense) ended here ==============================================================================================================

        //==================================================Work Loss/Restrictions Mapping->Add same Record of WorkLoss(IV Investigation Expense) to verify record already exist msg started here==============================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_Add, "Add Record")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_LOB, "LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("WC Worker's Compensation"), "Select LOB")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_RecordType, "Record Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("Work Loss"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_TransactionType, "Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SelectTransactionType.withText("Investigation Expense"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SaveBtn, "Save Button")
        await t.wait(3000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').find('div').withText('Record already exists.'), "Verify Text Record already exists.");
        //==================================================Work Loss/Restrictions Mapping->Add same Record of WorkLoss(IV Investigation Expense) to verify record already exist msg ended here==============================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ConfirmButtton, "Confirm Button")
        await t.wait(7000)
        await t.switchToIframe(Selector('#worklossrestrictions'))
       // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkLossRestrictionsMappingIframe);
        await t.wait(4000)

        //=========================================================Delete Created Record started here===============================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Chk_SelectRecord, "Select created record")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_DeleteRecord, "Delete record")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ConfirmButtton, "Confirm Button")
        await t.wait(7000)
        //=========================================================Delete Created Record ended here===============================================================================================================================================================================

        //==================================================Work Loss/Restrictions Mapping->Add Record of Restriction(EXF Expert Witness Fees) started here==============================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_Add, "Add Record")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_LOB, "LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("WC Worker's Compensation"), "Select LOB")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_RecordType, "Record Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("Restrictions"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_TransactionType, "Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SelectTransactionType.withText("Expert Witness Fees"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SaveBtn, "Save Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
        //==================================================Work Loss/Restrictions Mapping->Add Record of Restriction(EXF Expert Witness Fees) ended here==============================================================================================================

        //==================================================Work Loss/Restrictions Mapping->Add same Record of Restriction(EXF Expert Witness Fees),to verify Record already exists msg started here============================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_Add, "Add Record")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_LOB, "LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("WC Worker's Compensation"), "Select LOB")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_RecordType, "Record Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("Restrictions"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_TransactionType, "Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SelectTransactionType.withText("Expert Witness Fees"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SaveBtn, "Save Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').find('div').withText('Record already exists.'), "Verify Text Record already exists.");
        //==================================================Work Loss/Restrictions Mapping->Add same Record of Restriction(EXF Expert Witness Fees),to verify Record already exists msg ended here============================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ConfirmButtton, "Confirm Button")
        await t.wait(7000)
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


    });


    /*
    1)Add workloss record with transaction type 'Investigation Expense'
    2)Add restriction record with transaction type 'Expert Witness Fees'
    */
    test('AssureClaims_AddWorklossRestrictionRecord_Test_04', async t => {

        await t.wait(2000)

        //==================================================Work Loss/Restrictions Mapping->Add Record of WorkLoss(IV Investigation Expense) started here==============================================================================================================
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Work Loss/Restrictions Mapping");
        await t.wait(5000);
        await t.switchToIframe(Selector('#worklossrestrictions'))
        //await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkLossRestrictionsMappingIframe);
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_Add, "Add Record")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_LOB, "LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("WC Worker's Compensation"), "Select LOB")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_RecordType, "Record Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("Work Loss"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_TransactionType, "Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SelectTransactionType.withText("Investigation Expense"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SaveBtn, "Save Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
        //==================================================Work Loss/Restrictions Mapping->Add Record of WorkLoss(IV Investigation Expense) ended here==============================================================================================================

        //==================================================Work Loss/Restrictions Mapping->Add Record of Restriction(EXF Expert Witness Fees) started here==============================================================================================================    
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_Add, "Add Record")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_LOB, "LOB")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("WC Worker's Compensation"), "Select LOB")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_RecordType, "Record Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Lst_SelectValue.find('span').withText("Restrictions"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_TransactionType, "Transaction Type")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SelectTransactionType.withText("Expert Witness Fees"), "Select Record Type")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WLR_Btn_SaveBtn, "Save Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Msg_GenericToastMessage.find('div').withText('Saved Successfully'), "Verify Text Saved Successfully.");
        //==================================================Work Loss/Restrictions Mapping->Add Record of Restriction(EXF Expert Witness Fees) ended here==============================================================================================================    




    });

})

