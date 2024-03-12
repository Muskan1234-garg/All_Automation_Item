import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
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
const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');
//const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');
const Home_POM = new POM_Home();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();

var faker = require('faker');
//************************************************************************************************
//JIRA ID OF STORY : RMA-87955(Story - 2)
//Description      : Bank Account Reconciliation
//AUTHOR           : Sai Krishna Maddula
//DEPENDANCY       : NO
//PRE-REQUISITES   : NO
//Preferred Server : 194Automation, DSN2
//*************************************************************************************************
DataIUT.forEach(data => {
  fixture`BankReconciliation3`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });

  var StrBankAccountName1
  var StrSubBankAccountName
  var StrControlNumberPayment
  var FetchReconciliationTotalDeposits
  var FetchReconciliationTotalChecks
  var FetchReconciliationTotalAdjustments
  var FetchReconciledItems
  var StrSubBankAccountNumber
  var StrBankAccountName2
  var StrSubBankAccountNumber2
  var StrSubBankAccountName2

  test('AssureClaims_Bank_With_CheckStock_SubBankAccount_Deposit Creation_Test_01', async t => {
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

    //====================================================SubBankAccount Creation Starts Here===============================================================
    console.log("AssureClaims_BankAccount_SubBankAccount_Utility Function is Called To Create BankAccount_SubBankAccount".yellow);
    await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
    StrSubBankAccountName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
    console.log("Bank Account With SubBankAccount Has Been Created :".yellow + StrSubBankAccountName);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount Creation Ends Here==================================================================

    //====================================================Deposit Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", SubBankAccountName, "50")
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

    //====================================================Second Deposit Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", SubBankAccountName, "60")
    console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_ClearCheckBox, 'Check', "check UseSubBankAccounts Check Box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Deposit Creation Screen")
    console.log("New Cleared Deposite  is Created ".green);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositONDate, ONDate, "Date Of Transaction")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Second Deposit Creation End Here==================================================================

    //==================================================== Adjustment Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", SubBankAccountName, "30")
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
    //====================================================Second Adjustment Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", SubBankAccountName, "40")
    console.log(" Adjustment On Deposit Has Been Created on the SubBankAccount".yellow)

    await In_Utility.AssureClaims_ElementWebListSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Lst_DepositTransactionType, 'Adjustment', "Check stock is Selected From the Checkstock DropDown")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(BankAccount_POM.AssureClaims_BankAccount_Chk_ClearCheckBox, 'Check', "check UseSubBankAccounts Check Box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    console.log("New Cleared Adjustment is Created ".green);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositONDate, ONDate, "Date Of Transaction")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Adjustment Creation End Here==================================================================
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

  //Create a CLEARED payment (from Funds -> Transaction; not fro CLAIM) of $15 with Transaction Date = Check Date = Current Date - 2
  test('AssureClaims_Funds_Transaction_Creation_Test_02', async t => {
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

  //Goto Account Balance Information
  // Verify Reconciliation Total Deposit [J. (Reconciliation Total) Deposits] = Deposits which are cleared(existing formula)
  // Verify Reconciliation Total Checks [K. (Reconciliation Total) Checks] = Cleared Payments(within in reconciliation dates)(existing formula)
  // Verify Reconciliation Total adjustments [L. (Reconciliation Total) Adjustments] = Deposits which are cleared and transaction type of adjustment(existing formula)
  // Verify Reconciled Items [Reconciled Items [J+L-K]] = Reconciliation Total Deposit + Reconciliation Total adjustments - Reconciliation Total Checks(existing
  test('AssureClaims_Verification_On_AccountBalanceScreen_Test_03', async t => {
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
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrSubBankAccountNumber, "Bank Account Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName1), "Bank Account Name link")
    console.log("Search is Completed");
    await t.switchToMainWindow();
    await t.wait(8000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft, "Close Button on Left Hand Side Of Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
    await t.wait(5000);

    var ReconciliationTotalDeposits = "$110.00"
    var ReconciliationTotalChecks = "$15.00"
    var ReconciliationTotalAdjustments = "$70.00"
    var ReconciledItems = "$165.00"
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
  });

  //Create New Bank Account.
  // Add Check Stock to newly created Bank Account.
  // Add Sub Bank Account to it without any 'Minimum Balance'
  // CLick to Account Balance.
  // Verify label showing "Reconciliation not done for this Bank Account" in bold will be shown on topmost row
  test('AssureClaims_Bank With CheckStockSubBankAccount_DepositCreation_Test_04', async t => {
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


    console.log("Bank With CheckStock_SubBankAccount_Deposit Creation_Test_04 Started\n".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    //------------------------------------------BankAccount Creation------------------------------------------------------------
    console.log("AssureClaims_BankAccount_AddEdit_Utility Function is Called To Create BankAccount".yellow);
    StrBankAccountName2 = await Function_Utility.AssureClaims_BankAccount_AddEdit_Utility('Create', BankLastName, Address1, Address2, data.Country, data.State,
      City, ZipCode, (await AccountNo).toString(), AccountName, data.AccountType, NextCheck)
    //------------------------------Check Stocks Creation -----------------------------------------------------------------------
    var CheckStockCreation_Txt_StockName = "Stock_" + faker.name.lastName();
    console.log("AssureClaims_BankAccount_CheckStocks_Utility Function is Called To Create BankAccount_CheckStocks".yellow);
    await Function_Utility.AssureClaims_BankAccount_CheckStocks_Utility(CheckStockCreation_Txt_StockName, "Arial", "6")
    console.log("Bank Account With Check Stock Has Been Created: ".yellow + StrBankAccountName1);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe);
    StrSubBankAccountNumber2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_BankAccount_Txt_BankAccountNumber, "value");
    console.log("Bank Account With SubBankAccount Number Has Been Created :".yellow + StrSubBankAccountNumber);
    //====================================================BankAccount+CheckStock Creation End Here=====================================

    //====================================================SubBankAccount Creation Starts Here===============================================================
    console.log("AssureClaims_BankAccount_SubBankAccount_Utility Function is Called To Create BankAccount_SubBankAccount".yellow);
    await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
    StrSubBankAccountName2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
    console.log("Bank Account With SubBankAccount Has Been Created :".yellow + StrSubBankAccountName2);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount Creation Ends Here==================================================================
    //====================================================Verification On Account Balance====================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
    await t.wait(5000);
    const ele_ReconciledVerification = BankAccount_POM.AssureClaims_BankAccount_Txt_ReconciliationVerification.withText('Reconciliation not done for this Bank Account').with({ visibilityCheck: true })
    await t.expect(ele_ReconciledVerification.exists).ok('', { timeout: 20000 })
    console.log("Reconciliation not done for this Bank Account : ".green);

  });


  // Deleting Bank and Sub bank Accounts
  test('AssureClaims_BankAccount_Delection_Test_05', async t => {
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.nth(3).withText(StrSubBankAccountName), "SubBankAccount Number link Clicked")
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    await t.wait(4000)
    await t.switchToMainWindow();
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    //====================================================Deletion of Bank and Sub Bank Account Ended ================================================

  })
  // Deleting Bank and Sub bank Accounts




  test('AssureClaims_BankAccount_Delection_Test_06', async t => {

    console.log("Verification On The Account Balance Screen".rainbow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    //====================================================Searching Bank Account Started ================================================
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_BankAccount_Label_MenuOption, "BankAccount Menu");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountName, StrBankAccountName2, "Bank Account Name")
    console.log("AssureClaims_Search Function is Called To Search Bank Account ");
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrSubBankAccountNumber2, "Bank Account Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName2), "Bank Account Name link")
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.withText(StrSubBankAccountName2), "SubBankAccount Number link Clicked")
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    await t.wait(4000)
    await t.switchToMainWindow();
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    //====================================================Deletion of Bank and Sub Bank Account Ended ================================================

  })

})
