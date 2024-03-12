import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataAutoRegDSN_1.json');

const ConfigMgr_POM = new POM_Config_Manager();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Home_POM = new POM_Home();
const fs = require('fs')

//******************************************************************************************************************************//
//JIRA ID OF STORY : RMA-94580,RMA-94320, RMA-99408
//Description : 
//AUTHOR : Muskan Garg
//DEPENDANCY : Run this UnclaimedAndEscheatPaymentConfiguration.js 
//PRE-REQUISITE : NONE
//Preferred Server: 194 Automation DSN1 
//******************************************************************************************************************************//

//Global variable
var strEntityLastname;

DataIUT.forEach(data => {
  fixture`UnclaimedEscheat3_RolledUpPaymentPart1`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });

  /*
   1. Go to maintenance. Create entity.
   2. Go to the configuration manager and turn on roll up setting ,Payment parameter-- > checks-- -> roll - up.
  */
  test('EntityCreationAndUtilitySetting_Test_01', async t => {

    //============================================Logging into application starts here =========================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log("Login Into Application!!-->Maintenance".bgCyan)
    await t.wait(4000)
    //======================================== Logged into application ends here==============================================================

    //===================================== Entity Creation started here ===================================================================================================================================
    strEntityLastname = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", data.EntityTypePolicyMCO_Adjuster, data.FundsDormancyCountry, data.FundsDormancyState);
    console.log("First  Entity is Created with Last Name: ".green + strEntityLastname);
    await t.wait(10000)
    //===================================== Entity Creation ends here ===================================================================================================================================

    //===============================================Logout from application started here=================================================================================================================
    await t.switchToMainWindow()
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //================================================Logout from application completed here==============================================================================================================

    //============================================Logging into application starts here =========================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
    await t.wait(4000)
    //============================================Logging into application ends here =========================================================

    //============================================Payment parameter setup-->check Roll up check for payee checkbox starts here=========================================================
    await t.wait(10000)
    //====================================================Payment Parameter SetUp in Configuration manager started================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Check", "Roll Up")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_rollUpChecks, "Check", "Rollup checks")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
    //====================================================Payment Parameter SetUp in Configuration manager ended================================================


    //===============================================Logout from application started here=================================================================================================================
    await t.switchToMainWindow()
    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    console.log("Logout from Application!!")
    //================================================Logout from application completed here==============================================================================================================

  });

  /*
  1. Create a claim, Add reserve and transaction.( Transaction and check date beyond unclaimed and escheat limit)
  2. Copy the transaction and set Transaction and check date beyond unclaimed and escheat limit.
  3. From claim screen print the check . (Funds: print check)
  */
  test('GCCreationPaymentCreation_PrintCheck_Test_02', async t => {

    //============================================Logging into application starts here =========================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log("Login Into Application!!-->Claims".bgCyan)
    await t.wait(4000)
    //======================================= Logged into application ends here ==============================================================

    //======================================= General Claim Creation Starts here==============================================================
    var d = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    var StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    //=====================================RMA-99408 : Exporting variables started here===================================================================================================================================

    fs.writeFile('UnclaimedEscheat_RolledUpPayment_ExportedVariables.js', 'export var StrClaimNumber = ' + "'" + StrClaimNumber + "';\n" + "module.exports.StrClaimNumber=StrClaimNumber;", (err) => console.log("Users copied"))

    //=====================================RMA-99408 : Exporting variables started here===================================================================================================================================
    //=======================================Reserve Creation starts here =================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
    //=======================================Reserve Creation ends here ===================================================================================

    await t.wait(3000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Row_SelectAndCheckRowExist, "Select reserve row");
    await t.wait(3000)

    //================================================Payment Creation Started Here==============================================================================================
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strEntityLastname, data.TransactionType, data.PaymentAmount)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, d, "Transaction Date In Transaction Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PrintCheck_Txt_CheckDateOverTransactionScreen, d, "Transaction Date In Transaction Screen");
    //=======================================Changing Distribution type of created payment Starts here==============================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_Payment_Btn_DistributionTypeLookup, "Distribution type Lookup")
    const ele_DistributionType = Payment_POM.AssureClaimsApp_Payment_Btn_SelectDistributionType.withText(data.DistributionType).with({ visibilityCheck: true })
    await t.expect(ele_DistributionType.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele_DistributionType, "Distribution type Option")
    //=======================================Changing Distribution type of created payment ends here==============================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await t.wait(8000)
    console.log("Payment is Created : ".green);
    //================================================Payment Creation ends Here=================================================================================================

    //================================================Copy transaction starts Here=================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Transaction screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Transaction screen")
    //=======================================Changing Distribution type of created payment Starts here==============================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_Payment_Btn_DistributionTypeLookup, "Distribution type Lookup")
    const ele_DistributionType1 = Payment_POM.AssureClaimsApp_Payment_Btn_SelectDistributionType.withText(data.DistributionType).with({ visibilityCheck: true })
    await t.expect(ele_DistributionType1.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele_DistributionType1, "Distribution type Option")
    //=======================================Changing Distribution type of created payment ends here==============================================================
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, d, "Transaction Date In Transaction Screen");
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PrintCheck_Txt_CheckDateOverTransactionScreen, d, "Transaction Date In Transaction Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    console.log("Payment is Created : ".green);
    //================================================Copy transaction ends Here=================================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Print Checks")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_printCheckIframe);
    await t.wait(5000)
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_BankAccount, data.BankAccount, "Select Bank Account")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Txt_FromDate, d, "from date")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_DistributionType, data.DistributionType, "distribution Type")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_SelectCheck, data.Checks, "Select Check")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PrintCheck_Btn_CheckSelection, "button for check selection")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, StrClaimNumber, "Claim Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_SelectAllGrid, "select grid")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_Btn_OkButton, "ok button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Btn_PrintButton, "print button")
    await t.wait(30000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Btn_Okbutton, "ok button")
  });


});

































































