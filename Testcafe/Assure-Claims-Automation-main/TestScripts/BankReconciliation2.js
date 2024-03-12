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
const Home_POM = new POM_Home();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();

var faker = require('faker');
//************************************************************************************************
//JIRA ID OF STORY : RMA-87954(Story - 1,Scenario2&3)
//Description      : Bank Account Reconciliation
//AUTHOR           : Sai Krishna Maddula
//DEPENDANCY       : NO
//PRE-REQUISITES   : NO
//Preferred Server : 194Automation, DSN2
//*************************************************************************************************

DataIUT.forEach(data => {
  fixture`BankReconciliation2`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });

  var StrBankAccountName1
  var StrBankAccountName2
  var StrBankAccountNumber2
  var DepositTransit
  var StrSubBankAccountName
  var StrControlNumberPayment
  var FetchStatementBalance1
  var StrControlNumberCollection
  var FetchBalancePerBankStatement
  var FetchPriorBalance
  var StrSubBankAccountNumber

  //Bank Account Creation + CheckStocks Creation + Sub BankAccount Creations + Deposit Creation +Balance Screen(Bank Account Reconciliation) Started Here
  test('AssureClaims_Bank_With_CheckStock_SubBankAccount_Deposit_Creation_Test_01', async t => {
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount Creation Ends Here==================================================================

    //====================================================Deposit Creation Starts Here===============================================================
    //var TransactionDate =await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -7, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", SubBankAccountName, data.DepositAmount)
    console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
    //====================================================Deposit Creation End Here==================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    var StatementBeginDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -4, "MM/DD/YYYY")
    var StatementEndDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -3, "MM/DD/YYYY")
    //Navigation to Balance Screen(Bank Account Reconciliation)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_Balance, "Balance On BankAccount ")
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementBeginDate, StatementBeginDate, "in Statement Begin Date On Balance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementEndDate, StatementEndDate, "in Statement To Date On Balance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementBalance, data.StatementBalance, "Statement Balance  On Balance Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_Save, "Save Image Button On Balance Creation OF BankAccount Screen");

    await t.switchToMainWindow()

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    var StatementBeginDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var StatementEndDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -1, "MM/DD/YYYY")
    //Navigation to Balance Screen (Bank Account Reconciliation)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_Balance, "Balance On BankAccount")
    await t.wait(5000);
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementBeginDate, StatementBeginDate, "in Statement Begin Date On Balance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementEndDate, StatementEndDate, "in Statement To Date On Balance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_StatementBalance, data.StatementBalance1, "Statement Balance On Balance Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Balance_Save, "Save Image Button On Balance Creation OF BankAccount Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Bank Account creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");

    await t.switchToMainWindow()

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //Navigation to Account Balance Screen
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount")
    await t.wait(5000);
    DepositTransit = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositTransit, "value");
    console.log("Value of Deposits in Transit is : ".green + DepositTransit);
    await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositTransit.value).eql(DepositTransit);
    console.log("Verification Of Deposit Transit on the Account balance Screen Is Successful".green)

  });
  //Bank Account Creation + CheckStocks Creation + Sub BankAccount Creations + Deposit Creation +Balance Screen(Bank Account Reconciliation) Ended Here

  //Collection Creation From Funds Based On Sub Bank For Bank Reconciliation Started Here
  test('AssureClaims_Funds_Collection_Creation_Test_02', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -5, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -5, "MM/DD/YYYY")
    console.log("Funds Collection Creation_Test_03 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Collection ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("1", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, data.CollectionBalance)
    console.log("Funds Transaction Of Collection is Created");

    StrControlNumberCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number

    console.log("ControlNumber Of Collection  : ".green + StrControlNumberCollection);
  });
  //Collection Creation From Funds Based On Sub Bank For Bank Reconciliation Ended Here

  //Payment Creation From Funds Based On Sub Bank For Bank Reconciliation Started Here
  test('AssureClaims_Funds_Payment_Creation_Test_03', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -5, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -5, "MM/DD/YYYY")
    console.log("Funds Payments Creation_Test_0 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", CheckDate, CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, data.PaymentBalance)
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
    StrControlNumberPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("ControlNumber Of Printed Payment : ".green + StrControlNumberPayment);
  });
  //Payment Creation From Funds Based On Sub Bank For Bank Reconciliation Ended Here

  //Verification Over Account Balance Information On Bank Account Screen Started Here
  test('AssureClaims_Verification_On_The_AccountBalanceScreen_Test_04', async t => {
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
    await t.switchToMainWindow()
    await t.wait(8000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft, "Close Button on Left Hand Side Of Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
    await t.wait(5000);

    var StatementBeginDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -2, "MM/DD/YYYY")
    var StatementEndDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -1, "MM/DD/YYYY")
    var StatementBeginDate1 = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -4, "MM/DD/YYYY")

    await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementFromDateDisAbled.value).eql(StatementBeginDate);
    console.log("Verification Of FromDate Is Successful".green)
    await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementToDateDisabled.value).eql(StatementEndDate);
    console.log("Verification Of TO Date Is Successful".green)
    FetchStatementBalance1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBankStatement, "value");
    console.log("Balance Per Bank Statement Before clicking Search Button On Account Balance Screen is : ".green + FetchStatementBalance1);
    await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBankStatement.value).eql(FetchStatementBalance1);
    console.log("Verification Of Balance Per Bank Statement Is Successful".green)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_SearchOnAccountBalance, "Search Button On Account Balance On BankAccount ")
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BrginDateOnSearch.withText(StatementBeginDate1), "Date Link on Search On Account Balance On BankAccount")
    await t.wait(5000);
    FetchPriorBalance = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_PriorBalance, "value");
    console.log("Value of Prior Balance is : ".green + FetchPriorBalance);
    await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_PriorBalance.value).eql(FetchPriorBalance);
    console.log("Verification Of Prior Balance on the Account balance Screen Is Successful".green)
    FetchBalancePerBankStatement = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBankStatement, "value");
    console.log("Value of BalancePerBankStatement is : ".green + FetchBalancePerBankStatement);
    await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_BalancePerBankStatement.value).eql(FetchBalancePerBankStatement);
    console.log("Verification Of Balance Per BankStatement on the Account balance Screen Is Successful".green)
  });
  //Verification Over Account Balance Information On Bank Account Screen Ended Here

  //Bank Account Creation + CheckStocks Creation + Adding Deposit & Verifying Toaster Message Of Sub Bank Account(s) need to be created before doing Deposit(s) Started Here
  test('AssureClaims_Verification_Of_ToasterMessage_WithOutSubBankAccountCreation_And_CreatingDepositOnBankAccountCreation_Test_05', async t => {
    //=================================================BankAccount+CheckStock Creation Start Here================================
    var AccountNo = Generic_Utility.AssureClaims_RandomNumberGeneration_Utility(5);
    var BankLastName = "Bank_" + faker.name.lastName();
    var Address1 = faker.address.streetName();
    var Address2 = faker.address.streetAddress();
    var City = faker.address.city();
    var ZipCode = faker.random.number({ min: 10000, max: 99999 });
    var AccountName = "Bank_" + faker.name.lastName();
    var NextCheck = faker.random.number({ min: 1, max: 99999 });
    var SubBankAccountName = "Bank_" + faker.name.lastName();
    // Local Variable Declaration

    console.log("Verification Of Toaster Message WithOut Sub Bank Account  Creation And Creating Deposit On Bank Account Creation Test_06 Started\n".rainbow);
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
    console.log("Bank Account With Check Stock Has Been Created: ".yellow + StrBankAccountName2);
    //Bank Account With Check Stock Has Been Created
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe);
    StrBankAccountNumber2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_BankAccount_Txt_BankAccountNumber, "value");

    //====================================================BankAccount+CheckStock Creation End Here=====================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Deposit_Btn_AddDeposit, "Deposit On BankAccount")
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_OrangeToasterOFDeposit, false, "Verifying Toaster Massage For Without Sub Bank Creation BankAccount Screen");
  })
  //Bank Account Creation + CheckStocks Creation + Adding Deposit & Verifying Toaster Message Of Sub Bank Account(s) need to be created before doing Deposit(s) Ended Here

  // Bank and Sub-bank deletion started
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.nth(1).withText(StrSubBankAccountName), "SubBankAccount Number link Clicked")
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
    //====================================================Deletion of Bank and Sub Bank Account Started ================================================

  })
  // Bank Deletion Started
  test('AssureClaims_BankAccount_Delection_Test_07', async t => {
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
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrBankAccountNumber2, "Bank Account Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    //====================================================Searching Bank Account Ended ================================================
    //====================================================Deletion of Bank and Sub Bank Account Started ================================================

    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName2), "Bank Account Name link")
    console.log("Search is Completed");
    await t.switchToMainWindow();
    await t.wait(8000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(2), "Close Button on Left Hand Side Of Screen")
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Bank Account Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Bank Account Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
    //====================================================Deletion of Bank and Sub Bank Account Ended ================================================

  })



});
