import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import { ClientFunction } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility'
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Search from '../Functional_POM/POM_Search'
import POM_BankAccount from '../Functional_POM/POM_BankAccount';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';

const GenSysPar_POM = new POM_GeneralSystemParameter();
const BankAccount_POM = new POM_BankAccount();
const Payment_POM = new POM_PaymentsCollections();
const Search_POM = new POM_Search();
//const DataIUT = require('../DataFiles/DataBurp_DSN1.json');
const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');
const Home_POM = new POM_Home();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();

var faker = require('faker');
//************************************************************************************************
//JIRA ID OF STORY : RMA-87956(Story-3)
//Description      : Bank Account Reconciliation
//AUTHOR           : Sai Krishna Maddula
//DEPENDANCY       : NO
//PRE-REQUISITES   : NO
//Preferred Server : 194Automation, DSN2
//*************************************************************************************************


DataIUT.forEach(data => {
  fixture`BankReconciliation4`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });

  var StrBankAccountName1;
  var StrSubBankAccountName;
  var StrControlNumberPayment;
  var FetchReconciliationTotalDeposits;
  var StrControlNumberCollection;
  var FetchReconciliationTotalChecks;
  var FetchReconciliationTotalAdjustments;
  var FetchReconciledItems;
  var StrSubBankAccountName1;
  var FetchPriorBalance;
  var FetchOutOfBalance;
  var FetchClearedChecks;
  var FetchOutOfBalance;
  var FetchBalancePerBooks;
  var FetchSubTotal;
  var FetchBalancePerBankStatement;
  var FetchReleasedPayments;
  var FetchOutStandingChecks;
  var FetchDepositTransit;
  var StrSubBankAccountNumber;

  // Create Bank Account
  // Add Check Stock to newly created Bank Account.
  // Add Sub Bank Account 1 to it without any 'Minimum Balance'
  // Create Deposit Sub Bank Account 1 of $50 on Sub Bank Account with Transaction Date = Current Date - 2
  // Clear the Deposit Sub Bank Account 1 on with On Date = Current Date - 2
  // Create Adjustment Sub Bank Account 1 of $30 on Sub Bank Account with Transaction Date = Current Date - 2
  // Clear the Adjustment on Sub Bank Account 1 with On Date = = Current Date - 2
  // Add Sub Bank Account 2 to it without any 'Minimum Balance'
  // Create Deposit on Sub Bank Account 2 of $40 on Sub Bank Account with Transaction Date = Current Date - 2
  // Clear the Deposit on Sub Bank Account 2 on with On Date = Current Date - 2
  // Create Adjustment on Sub Bank Account 2 of $20 on Sub Bank Account with Transaction Date = Current Date - 2
  // Clear the Adjustment on Sub Bank Account 2 with On Date = = Current Date - 2
  // At Master bank, add Balance with Statement Begin Date = Current Date - 2; Statement End Date = Current Date - 1; Statement Balance = 100
  test('AssureClaims_Bank_WithCheckStockSubBankAccount_DepositCreation_Test_01', async t => {
    //=================================================BankAccount+CheckStock Creation Start Here================================
    var AccountNo = Generic_Utility.AssureClaims_RandomNumberGeneration_Utility(5);
    var BankLastName = "Bank_" + faker.name.lastName();
    var Address1 = faker.address.streetName();
    var Address2 = faker.address.streetAddress();
    var City = faker.address.city();
    var ZipCode = faker.random.number({ min: 10000, max: 99999 });
    var AccountName = "Bank_" + faker.name.lastName();
    var NextCheck = faker.random.number({ min: 1, max: 99999 });
    var SubBankAccountName = "SubBank_" + faker.name.lastName();
    // Local Variable Declaration

    console.log("Bank With CheckStock_SubBankAccount_Deposit Creation_Test_01 Started\n".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    //------------------------------------------BankAccount Creation------------------------------------------------------------
    console.log("AssureClaims_BankAccount_AddEdit_Utility Function is Called To Create BankAccount".yellow);
    StrBankAccountName1 = await Function_Utility.AssureClaims_BankAccount_AddEdit_Utility('Create', BankLastName, Address1, Address2, data.Country, data.State,
      City, ZipCode, (await AccountNo).toString(), AccountName, data.AccountType, NextCheck)
    //------------------------------Check Stocks Creation -----------------------------------------------------------------------
    var CheckStockCreation_Txt_StockName = "Stock_" + faker.name.lastName();
    console.log("AssureClaims_BankAccount_CheckStocks_Utility Function is Called To Create BankAccount_CheckStocks".yellow);
    await Function_Utility.AssureClaims_BankAccount_CheckStocks_Utility(CheckStockCreation_Txt_StockName, "Arial", "6")
    console.log("Bank Account With Check Stock Has Been Created: ".yellow + StrBankAccountName1);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe);
    StrSubBankAccountNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_BankAccount_Txt_BankAccountNumber, "value");
    console.log("Bank Account With SubBankAccount Number Has Been Created :".yellow + StrSubBankAccountNumber);
    //====================================================BankAccount+CheckStock Creation End Here=====================================

    //====================================================SubBankAccount 1 Creation Starts Here===============================================================
    console.log("AssureClaims_BankAccount_SubBankAccount_Utility Function is Called To Create BankAccount_SubBankAccount".yellow);
    await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
    StrSubBankAccountName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
    console.log("Bank Account With SubBankAccount Has Been Created :".yellow + StrSubBankAccountName);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount Creation Ends Here==================================================================
    //====================================================SubBankAccount 2 Creation Starts Here===============================================================
    console.log("AssureClaims_BankAccount_SubBankAccount2_Utility Function is Called To Create BankAccount_SubBankAccount".yellow);
    await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
    StrSubBankAccountName1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
    console.log("Bank Account With SubBankAccount 2 Has Been Created :".yellow + StrSubBankAccountName1);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount 2 Creation Ends Here==================================================================
    //====================================================Deposit Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", StrSubBankAccountName, "50")
    console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_ClearCheckBox, 'Check', "check UseSubBankAccounts Check Box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Deposit Creation Screen")
    console.log("New Cleared Check Payment  is Created ".green);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositONDate, ONDate, "Date Of Transaction")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Deposit Creation End Here==================================================================

    //====================================================Deposit 2 Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", StrSubBankAccountName1, "40")
    console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_ClearCheckBox, 'Check', "check UseSubBankAccounts Check Box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Deposit Creation Screen")
    console.log("New Cleared Check Payment  is Created ".green);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositONDate, ONDate, "Date Of Transaction")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Deposit 2 Creation End Here==================================================================
    //==================================================== Adjustment 1 Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", StrSubBankAccountName, "30")
    console.log(" Adjustment On Deposit Has Been Created on the SubBankAccount".yellow)

    await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Lst_DepositTransactionType, 'Adjustment', "Check stock is Selected From the Checkstock DropDown")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_ClearCheckBox, 'Check', "check UseSubBankAccounts Check Box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    console.log("New Cleared Adjustment  is Created ".green);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositONDate, ONDate, "Date Of Transaction")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Adjustment Creation End Here==================================================================
    //==================================================== Adjustment 2 Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_AdjustMent2_Utility Function is Called To Create BankAccount_Adjustment".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", StrSubBankAccountName1, "20")
    console.log(" Adjustment On Deposit Has Been Created on the SubBankAccount".yellow)

    await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Lst_DepositTransactionType, 'Adjustment', "Check stock is Selected From the Checkstock DropDown")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_ClearCheckBox, 'Check', "check UseSubBankAccounts Check Box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    console.log("New Cleared Adjustment  is Created ".green);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositONDate, ONDate, "Date Of Transaction")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Adjustment 2 Creation End Here==================================================================
    //====================================================Statement Balance Starts Here=============================================================================
    var StatementBeginDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var StatementEndDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -1, "MM/DD/YYYY")
    //Navigation to Balance Screen
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_Balance, "Balance On BankAccount ")
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementBeginDate, StatementBeginDate, "in Statement Begin Date On Balance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementEndDate, StatementEndDate, "in Statement To Date On Balance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementBalance, data.StatementBalance, "Statement Balance  On Balance Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_Save, "Save Image Button On Balance Creation OF BankAccount Screen");
    await t.switchToMainWindow()
    //====================================================Statement Balance Starts Here=============================================================================
  });

  //Create a CLEARED payment (from Funds -> Transaction; not fro CLAIM) on Sub Bank Account 1 of $15 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_TransactionCreation_Test_02', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_03 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "15")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberVoidOrphan.toString(), "Text CheckNumberA")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Chk_Cleared, 'Check', "Click Cleared Cheack Box On Payment Creation Screen")
    //Check Cleared using Cleared Check Box
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
    StrControlNumberPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("ControlNumber Of Printed Payment : ".green + StrControlNumberPayment);
  });

  // Create a CLEARED payment (from Funds -> Transaction; not fro CLAIM) on Sub Bank Account 2 of $5 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_TransactionSecondCreation_Test_03', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_04 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction2_Creation Function is Called To Create Payment2 ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName1, data.PayeeType, data.LastName, "NA", data.TransactionType, "5")
    console.log("Funds Transaction2 is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberVoidOrphan.toString(), "Text CheckNumberA")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Chk_Cleared, 'Check', "Click Cleared Cheack Box On Payment Creation Screen")
    //Check Cleared using Cleared Check Box
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
    StrControlNumberPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("ControlNumber Of Printed Payment : ".green + StrControlNumberPayment);
  });

  //Create Collection on Sub Bank Account 1 of $80 Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_CollectionCreation_Test_04', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Collection Creation_Test_05 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Collection ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("1", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "80")
    console.log("Funds Transaction Of Collection is Created");

    StrControlNumberCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number

    console.log("ControlNumber Of Collection  : ".green + StrControlNumberCollection);
  });

  //Create Collection on Sub Bank Account 2 of $70 Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_CollectionCreation_Test_05', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -5, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -5, "MM/DD/YYYY")
    console.log("Funds Collection Creation_Test_06 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Collection ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("1", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName1, data.PayeeType, data.LastName, "NA", data.TransactionType, "70")
    console.log("Funds Transaction Of Collection is Created");

    StrControlNumberCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number

    console.log("ControlNumber Of Collection  : ".green + StrControlNumberCollection);
  });

  //Create Released Payment on Sub Bank Account 2 of $8 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_TransactionCreation_Test_06', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_07 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "8")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
  })

  //Create Released Payment on Sub Bank Account 1 of $7 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_TransactionCreation_Test_07', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_08 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "7")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
  })

  //Create Outstanding Checks (Printed but not Cleared) on Sub Bank Account 1 of $13 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_TransactionCreation_Test_08', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_09 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "13")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberVoidOrphan.toString(), "Text CheckNumberA")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(2000)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
  })

  //Create Outstanding Checks (Printed but not Cleared) on Sub Bank Account 2 of $12 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_TransactionCreation_Test_09', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_10 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "12")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberVoidOrphan.toString(), "Text CheckNumberA")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(2000)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
  })

  // Verify all the fields expcept PRIOR BALANCE should show addition of Sub Bank Account 1 & Sub Bank Account 2 [Deposits in Transit, Released Payments, Outstanding ChecksCleared Checks, (Reconciliation Total) Deposits, (Reconciliation Total) Checks, (Reconciliation Total) Adjustments]
  // Verify the Count of Sub Bank Account 1 & Sub Bank Account 2 [Deposits in Transit, Released Payments, Outstanding ChecksCleared Checks, (Reconciliation Total) Deposits, (Reconciliation Total) Checks, (Reconciliation Total) Adjustments]
  test('AssureClaims_Verification_OnTheAccountBalanceScreen_Test_10', async t => {
    console.log("Verification On The Account Balance Screen".rainbow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    //-------------------------------------------------------------------------
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_BankAccount_Label_MenuOption, "BankAccount Menu");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountName, StrBankAccountName1, "Bank Account Name")
    console.log("AssureClaims_Search Function is Called To Search Bank Account ");
    //StrBankAccountName1
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrSubBankAccountNumber, "Bank Account Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName1), "Bank Account Name link")
    console.log("Search is Completed");
    await t.switchToMainWindow()
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
    await t.wait(6000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(2), "Close Button on Left Hand Side Of Screen")
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
    await t.wait(5000);

    var ReconciliationTotalDeposits = "$90.00"
    var ReconciliationTotalChecks = "$20.00"
    var ReconciliationTotalAdjustments = "$50.00"
    var ReconciledItems = "$120.00"
    var PriorBalance = "$70.00"
    var BalancePerBankStatement = "$100.00"
    var ClearedChecks = "$20.00"
    var SubTotal = "$35.00"
    var BalancePerBooks = "$245.00"
    var OutOfBalance = "$65.00"
    var Check = "2"
    var ReleasedPayments = "$15.00"
    var OutStandingChecks1 = "$25.00"
    var DepositTransit = "$80.00"
    FetchReconciliationTotalDeposits = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationTotalDeposits, "value");
    console.log("Reconciliation Total Deposits On Account Balance Screen is : ".green + FetchReconciliationTotalDeposits);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationTotalDeposits, ReconciliationTotalDeposits, "Reconciliation Total Deposits");
    console.log("Verification Of ReconciliationTotalDeposits Is Successful".green)

    FetchReconciliationTotalChecks = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationTotalChecks, "value");
    console.log("Reconciliation Total Checks On Account Balance Screen is : ".green + FetchReconciliationTotalChecks)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationTotalChecks, ReconciliationTotalChecks, "Reconciliation Total Checks");
    console.log("Verification Of ReconciliationTotalChecks Is Successful".green)
    FetchReconciliationTotalAdjustments = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationTotalAdjustments, "value");
    console.log("Reconciliation Total Adjustments On Account Balance Screen is : ".green + FetchReconciliationTotalAdjustments);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationTotalAdjustments, ReconciliationTotalAdjustments, "Reconciliation Total Adjustments");
    console.log("Verification Of Reconciliation Total Adjustments Is Successful".green)

    FetchReconciledItems = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciledItems, "value");
    console.log("Reconciled Items On Account Balance Screen is : ".green + FetchReconciledItems);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciledItems, ReconciledItems, "Reconciled Items");
    console.log("Verification Of Reconciled Items Is Successful".green)

    FetchPriorBalance = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_PriorBalance, "value");
    console.log("Prior Balance On Account Balance Screen is : ".green + FetchPriorBalance);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_PriorBalance, PriorBalance, "Prior Balance");
    console.log("Verification Of Prior Balance Is Successful".green)

    FetchBalancePerBankStatement = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBankStatement, "value");
    console.log(" BalancePerBankStatement On Account Balance Screen is : ".green + FetchBalancePerBankStatement);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBankStatement, BalancePerBankStatement, "Prior Balance");
    console.log("Verification Of Prior Balance Is Successful".green)

    FetchClearedChecks = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ClearedChecks, "value");
    console.log(" Cleared Checks On Account Balance Screen is : ".green + FetchClearedChecks);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ClearedChecks, ClearedChecks, "Prior Balance");
    console.log("Verification Of Cleared Checks Is Successful".green)

    FetchSubTotal = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_SubTotal, "value");
    console.log("SubTotal On Account Balance Screen is : ".green + FetchSubTotal);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_SubTotal, SubTotal, "Prior Balance");
    console.log("Verification Of SubTotal Is Successful".green)

    FetchBalancePerBooks = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBooks, "value");
    console.log("BalancePerBooks On Account Balance Screen is : ".green + FetchSubTotal);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBooks, BalancePerBooks, "Prior Balance");
    console.log("Verification Of BalancePerBooks Is Successful".green)

    FetchOutOfBalance = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_OutOfBalance, "value");
    console.log("OutOfBalance On Account Balance Screen is : ".green + FetchSubTotal);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_OutOfBalance, OutOfBalance, "Prior Balance");
    console.log("Verification Of OutOfBalance Is Successful".green)

    FetchReleasedPayments = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReleasedPayments, "value");
    console.log("Released Payments On Account Balance Screen is: ".green + FetchReleasedPayments);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReleasedPayments, ReleasedPayments, "Prior Balance");
    console.log("Verification Of ReleasedPayments Is Successful".green)
    await t.wait(9000)
    FetchOutStandingChecks = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_OutStandingChecks, "value");
    console.log("OutStanding ChecksOn Account Balance Screen is : ".green + FetchOutStandingChecks);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_OutStandingChecks, OutStandingChecks1, "Prior Balance");
    console.log("Verification Of OutStandingChecks Is Successful".green)

    FetchDepositTransit = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositTransit, "value");
    console.log("Deposits in Transit On Account Balance Screen is is : ".green + FetchDepositTransit);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositTransit, DepositTransit, "Prior Balance");
    console.log("Verification Of DepositTransit Is Successful".green)

    var DepositCount = "1"
    var PaymentsCount = "2"
    var OutStandingChecksCount = "2"
    var Checks_ReconciliationTotalDepositsCount = "2"
    var Checks_ReconciliationTotalChecksCount = "2"
    var ReconciliationTotalAdjustmentsCount = "2"
    const ele_Check = BankAccount_POM.AssureClaims_BankAccount_Txt_ClearChecks.withText(Check).with({ visibilityCheck: true })
    await t.expect(ele_Check.exists).ok('', { timeout: 20000 })

    const ele_Deposit = BankAccount_POM.AssureClaims_BankAccount_Txt_Deposit.withText(DepositCount).with({ visibilityCheck: true })
    await t.expect(ele_Deposit.exists).ok('', { timeout: 20000 })

    const ele_Payments = BankAccount_POM.AssureClaims_BankAccount_Txt_Payments.withText(PaymentsCount).with({ visibilityCheck: true })
    await t.expect(ele_Payments.exists).ok('', { timeout: 20000 })

    const ele_OutStandingChecks = BankAccount_POM.AssureClaims_BankAccount_Txt_Checks_OutStandingChecks.withText(OutStandingChecksCount).with({ visibilityCheck: true })
    await t.expect(ele_OutStandingChecks.exists).ok('', { timeout: 20000 })

    const ele_Checks_ReconciliationTotalDeposits = BankAccount_POM.AssureClaims_BankAccount_Txt_Checks_ReconciliationTotalDeposits.withText(Checks_ReconciliationTotalDepositsCount).with({ visibilityCheck: true })
    await t.expect(ele_Checks_ReconciliationTotalDeposits.exists).ok('', { timeout: 20000 })

    const ele_Checks_ReconciliationTotalChecks = BankAccount_POM.AssureClaims_BankAccount_Txt_Checks_ReconciliationTotalChecks.withText(Checks_ReconciliationTotalChecksCount).with({ visibilityCheck: true })
    await t.expect(ele_Checks_ReconciliationTotalChecks.exists).ok('', { timeout: 20000 })

    const ele_ReconciliationTotalAdjustments = BankAccount_POM.AssureClaims_BankAccount_Txt_Checks_ReconciliationTotalAdjustments.withText(ReconciliationTotalAdjustmentsCount).with({ visibilityCheck: true })
    await t.expect(ele_ReconciliationTotalAdjustments.exists).ok('', { timeout: 20000 })




  });
  // Deleting Bank Account and Sub-bank Accounts 
  test('AssureClaims_BankAccount_Delection_Test_11', async t => {

    console.log("Verification On The Account Balance Screen".rainbow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    //====================================================Searching Bank Account Started ================================================

    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_BankAccount_Label_MenuOption, "BankAccount Menu");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountName, StrBankAccountName1, "Bank Account Name")
    console.log("AssureClaims_Search Function is Called To Search Bank Account ");
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrSubBankAccountNumber, "Bank Account Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName1), "Bank Account Name link")
    console.log("Search is Completed");
    //====================================================Searching Bank Account Ended ================================================
    //====================================================Deletion of Bank and Sub Bank Account Started ================================================

    await t.switchToMainWindow();
    await t.wait(8000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(2), "Close Button on Left Hand Side Of Screen")
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")

    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    console.log(`StrSubBankAccountName : ${StrSubBankAccountName}`)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.nth(3).withText(StrSubBankAccountName), "SubBankAccount Number link Clicked")
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Sub Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Sub Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    await t.wait(4000)

    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.withText(StrSubBankAccountName), "SubBankAccount Number link Clicked")
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Sub Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Sub Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    await t.wait(4000)

    await t.switchToMainWindow();
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    //====================================================Deletion of Bank and Sub Bank Account Started ================================================

  })

})
