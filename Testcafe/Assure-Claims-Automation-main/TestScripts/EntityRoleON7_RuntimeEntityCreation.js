import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Entity from '../Functional_POM/POM_Entity'
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Search from '../Functional_POM/POM_Search';
import POM_AddressMaintenance from '../Functional_POM/POM_AddressMaintenance';

const DataAutoreg_ERON = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Entity_POM = new POM_Entity();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const Search_POM = new POM_Search();
const MaintAddress_POM = new POM_AddressMaintenance();

var faker = require('faker');

var strEntityLastName = faker.name.lastName();
var strSSN = faker.random.number({ min: 100000000, max: 999999999 }).toString();

/**********************************************************************************************************************************************
JIRA ID OF STORY : RMA-103461
Description      :    1. Create Ophan Transaction and create entity from transaction screen
                      2. Search Created Entity and delete it
                      3. Verify deleted entity.
AUTHOR           : Yashaswi Mendhekar
DEPENDANCY       : None
PRE-REQUISITE    : Entity role should be ON for that particular DSN
Preffered Env.   : 194 Autoreg env. "RM231REG_ERON" DSN
//**********************************************************************************************************************************************/

DataAutoreg_ERON.forEach(data => {
    const MaintenanceZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ClaimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`EntityRoleON7_RuntimeEntityCreation`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
    });
    /*
      1) create orphan transaction
      2) create entity from transaction screen
    */
    // ============================================================================================Test 1 starts from here======================================================================================
    test('AssureClaims_EntitiesCreation_FromTransactionScreen_Test_01', async t => {
        //=====================================================Logged in into Claim Zone, started here=========================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(15000);
        //=====================================================Logged in into Claim Zone, ended here===========================================================================================================

        //=====================================================Creation of Transaction Starts here ============================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Transaction")
        await t.wait(4000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Funds_Transaction_ClaimGCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType), "Payee Payor Type On Payment Creation Screen")
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "xyyz", "Last Name Text Box On Payment Creation Screen")
        await t.wait(3000)
        await t.scrollIntoView(MaintAddress_POM.AssureClaims_Funds_Transaction_Txt_State)
        //=====================================================Creation of Entity Starts here================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddLastName.nth(1), "Payee Payor Type On Payment Creation Screen");
        await t.wait(3000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await t.wait(3000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_Maintenence_Lst_EntityType, "Entity Type");
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_Maintenence_Lst_EntityType.find('option').withAttribute('label', data.EntityType_Business), "Business Entity Type");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_Manitenance_Btn_CategoryLookUp, "Entity Category Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_GenericTxt_Txt_DescriptionTextboxOnLookup.nth(1), data.EntityCategory_Insurers, "Type Entity Catrgory");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_DescriptionSearchIconOnLookup.nth(1), "Search Button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericLnk_Lnk_LnkforSelectValueFromLookUp, "Select Entity Category");
        await t.wait(2000);
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityEron_Txt_LastName, strEntityLastName, "Last Name Textbox Entity Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_EntityEron_Txt_SSN, strSSN, "SSN Textbox On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //=====================================================Creation of Entity ends here ==================================================================================================================
        await t.switchToMainWindow();
        await t.wait(4000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Funds_Transaction_ClaimGCIframe);
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType_EXF), "Transaction Type Value On Funds Split Detail Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, data.Amount, "Transaction Amount On Funds Split Detail Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        var strCtrlNumber = Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
        console.log("Control Number for the created transaction is : " + strCtrlNumber.green)
        //=====================================================Creation of transaction with entity ends here =================================================================================================
    });
    /*
      1) Search Created entity from transaction screen and delete it
    */
    test('AssureClaims_DeleteEntity_Test_02', async t => {

        //========================================================Search created entity and delete, started Here==========================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strEntityLastName, 1);
        //=========================================================Search created entity and delete, ended Here===========================================================================================================
        
    });

    /*
     1) verify deleted Entity record is not present
    */
    test('AssureClaims_Search_VerifyDeletedEntity_Test_03', async t => {

        //===========================Search deleted entity,and Verify "No records available text" started here===================================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, strEntityLastName, "entity lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
        await t.wait(3000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(Home_POM.AssureClaims_Generic_Txt_VerifyNoRecordsAvalText.withText("No Records Available."), "No records available text")
        //===========================Search deleted Entity,and Verify "No records available text" ended here===================================================================================================================================

    });

});
