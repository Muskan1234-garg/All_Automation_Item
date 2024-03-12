import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'

import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';

const DataAutoreg_ERON = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();

var faker = require('faker');

var strEntityName = "Auto_" + faker.name.lastName();
var strSSN = faker.random.number({ min: 100000000, max: 999999999 }).toString();
var StrClaimNumber;
var Payment_controlNumber;
var OrphanTransaction_controlNumber;
var Collection_controlNumber;
var ScheduleCheck_controlNumber;

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-97292
//Description      : Verify any Entity created from Entity Maintenance is available for making a Payment when select Payee as 'Other Payees (People & Entities)'
// Verify created entity is available for making a Collection when Payee Type is 'Other (Entity-People)'
// Verify created entity is available for making Auto Checks when Payee Type is 'Other (Entity-People)'
// Verify created entity is available for making Orphan Transaction when Payee Type is 'Other (Entity-People)'
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITE    : Entity role should be ON for that particular DSN
// Preffered Env.  : 194 Autoreg env. "RM231REG_ERON" DSN
//*********************************************************************************************************************************************

DataAutoreg_ERON.forEach(data => {
    const MaintenanceZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ClaimZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`EntityRoleON3_PaymentLevel`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZone);
    });

    /*
    1)Entity Creation
    */
    test('AssureClaims_EntityCreation_Test_01', async t => {

        //===========================Logged in into Maintenance zone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into Maintnance zone, ended here==========================================================================================================================================================================================================

        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Business, strEntityName, data.IdType, strSSN);
        //===========================Entity Creation, ended here============================================================================================================================================================================================================
  
    });

    /*
    1)Claim Creation
    2)Reserve Creation
    3)Payment Creation with Created Entity
    */
    test('AssureClaims_ClaimReservePaymentCreationWithCreatedEntity_Test_02', async t => {

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        //===========================================================Claim Creation Started Here===================================================================================================================================================================================================================================================================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
        //===========================================================Claim Creation ended Here===================================================================================================================================================================================================================================================================


        /*===========================================================Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType_Expense, data.ReserveAmount, data.ReserveStatus)
        /*===========================================================Reserve Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/
       
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
       
        /*===========================================================Payment Creation with created Entity Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select reserve")
        Payment_controlNumber=await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType_OtherPayee, strEntityName, data.TransactionType_EXF, data.PaymentAmount);
        console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
        console.log("Payment is created with control number "+Payment_controlNumber.yellow)
        /*===========================================================Payment Creation with created Entity Completed Here========================================================================================================================================================================================================================================================================================================*/



    });

    /*
    1)Search Claim
    2)Collection Creation with Created Entity
    */
    test('AssureClaims_CollectionCreationWithCreatedEntity_Test_03', async t => {

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
       
        /*===========================================================Collection Creation with created entity Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select reserve")
        await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(data.BankAccount, data.PayeeType_OtherPayee, strEntityName, "NA", data.TransactionType_EXF, data.PaymentAmount)
        Collection_controlNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        console.log("Payment is created with control number "+Collection_controlNumber.yellow)
        /*===========================================================Collection Creation with created entity Completed Here========================================================================================================================================================================================================================================================================================================*/
    
    });

    /*
    1)Search Claim
    2)Schedule Check Creation with Created Entity
    */
    test('AssureClaims_ScheduleCheckCreationWithCreatedEntity_Test_04', async t => {
        
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=======================================================================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
       
        /*=====================================================Schedule Check Creation with created entity Started Here========================================================================================================================================================================================================================================================================================================*/
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "select reserve")
        await Function_Utility.AssureClaims_ScheduleCheck_Creation(data.NumberOfPayments, data.PayInterval, data.BankAccount, data.DistributionType, data.AutoCheckPayeeType_OtherPayee, strEntityName, data.AutoCheckTransactionType_EXF, data.AutoCheckAmount)
        ScheduleCheck_controlNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        console.log("Payment is created with control number "+ScheduleCheck_controlNumber.yellow)
        /*=====================================================Schedule Check Creation with created entity Completed Here========================================================================================================================================================================================================================================================================================================*/
    
    });

    /*
    1)Search Claim
    2)Orphan Transaction Creation with Created Entity
    */
    test('AssureClaims_OrphanTransactionCreationWithCreatedEntity_Test_05', async t => {

        /*=====================================================Orphan Transaction Creation with created entity Started Here========================================================================================================================================================================================================================================================================================================*/
        var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
        var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
        console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
        OrphanTransaction_controlNumber=await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", data.BankAccount, data.PayeeType_OtherPayee, strEntityName, "NA", data.TransactionType_EXF, data.Amount)
        console.log("Funds Transaction is Created");
        console.log("Payment is created with control number "+OrphanTransaction_controlNumber.yellow)
        /*=====================================================Orphan Transaction Creation with created entity Started Here========================================================================================================================================================================================================================================================================================================*/

       

    });

    /*
    1)Delete Created Entity
    */
    test('AssureClaims_DeleteCreatedEntity_Test_06', async t => {

        //===========================Logged in into MaintenanceZone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
        console.log("Login Into Application!!".green)
        await t.wait(15000);
        //===========================Logged in into MaintenanceZone, ended here==========================================================================================================================================================================================================
        //==============================================Delete created witness, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strEntityName, 1);
        //==============================================Delete created witness, ended Here=======================================================================================================================================================================================

    });


});







//data json
