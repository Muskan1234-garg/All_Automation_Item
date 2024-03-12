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
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const ConfigMgr_POM = new POM_Config_Manager();
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

DataIUT.forEach(data => {
  fixture`BankReconciliation6`.beforeEach(async t => {
    await t.wait(15000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });

  var StrBankAccountName1;
  var StrSubBankAccountName;
  var StrControlNumberCollection;
  var StrSubBankAccountName1;
  var FetchPriorBalance;
  var FetchInsufficientPayments;
  var StrSubBankAccountNumber;

  // Create Bank Account
  // Add Check Stock to newly created Bank Account.
  // Add Sub Bank Account 1 to it without any 'Minimum Balance'
  // Create Deposit Sub Bank Account 1 of $100 with Transaction Date = Current Date - 1 Year & 1 Month
  //Create Deposit Sub Bank Account 1 of $50
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
    var SubBankAccountName1 = "SubBank_" + faker.name.lastName();
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
    await t.wait(15000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe);
    StrSubBankAccountNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_BankAccount_Txt_BankAccountNumber, "value");
    console.log("Bank Account With SubBankAccount Number Has Been Created :".yellow + StrSubBankAccountNumber);
    //====================================================BankAccount+CheckStock Creation End Here=====================================

    //#########################################===========Scenario 1============####################################################################
    //====================================================SubBankAccount 1 Creation Starts Here===============================================================
    console.log("AssureClaims_BankAccount_SubBankAccount_Utility Function is Called To Create BankAccount_SubBankAccount".yellow);
    await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
    StrSubBankAccountName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
    console.log("Bank Account With SubBankAccount Has Been Created :".yellow + StrSubBankAccountName);
    //Bank Account With Check Stock Has Been Created
    await t.wait(15000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount Creation Ends Here==================================================================
    //########################################============Scenario 1 End Here============####################################################################
    //====================================================SubBankAccount 2 Creation Starts Here===============================================================
    console.log("AssureClaims_BankAccount_SubBankAccount2_Utility Function is Called To Create BankAccount_SubBankAccount".yellow);
    await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(SubBankAccountName1, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
    StrSubBankAccountName1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
    console.log("Bank Account With SubBankAccount 2 Has Been Created :".yellow + StrSubBankAccountName1);
    //Bank Account With Check Stock Has Been Created
    await t.wait(15000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================SubBankAccount 2 Creation Ends Here==================================================================

    //########################################============Scenario 1 Start Here For Deposit============####################################################################
    //====================================================Deposit Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", StrSubBankAccountName, "100")
    console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");
    await t.wait(15000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Deposit Creation End Here==================================================================
    //########################################============Scenario 1 Start End For Deposit============####################################################################
    //########################################============Scenario 1 Start Start For Deposit============####################################################################
    //====================================================Deposit 2 Creation Starts Here===============================================================
    var ONDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    var TransactionDateLess = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    console.log("AssureClaims_BankAccount_Deposit_Utility Function is Called To Create BankAccount_Deposit".yellow);
    await Function_Utility.AssureClaims_BankAccount_Deposit_Utility(TransactionDateLess, "NA", StrSubBankAccountName1, "50")
    console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Creation OF BankAccount Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " BankAccount Creation Screen");
    await t.wait(15000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs ")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
    //====================================================Deposit 2 Creation End Here==================================================================
  })

  //================================Scenario 1 Start Here====================================================================================================
  //Create Collection on Sub Bank Account 1 of $50 with Transaction Date = Current Date - 1 Year & 1 Month
  //#########################=================Create Collection on Sub Bank Account 1==================################################################
  test('AssureClaims_Funds_CollectionCreation_Test_02', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    console.log("Funds Collection Creation_Test_03 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    
    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Collection ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("1", "NA", CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "50")
    console.log("Funds Transaction Of Collection is Created");
    StrControlNumberCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("ControlNumber Of Collection  : ".green + StrControlNumberCollection);
  });

  //Create Printed Transaction on Sub Bank Account 1 of $10 with Transaction Date = Current Date - 1 Year & 1 Month
  //####################################=========Create Printed Transaction on Sub Bank Account 1===========################################################################################################
  test('AssureClaims_Funds_TransactionCreation_Test_03', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, -1, 0, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_04 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User   
    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", "NA", CollectionTransactionDate, "NA", "NA", StrSubBankAccountName, data.PayeeType, data.LastName, "NA", data.TransactionType, "10")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberVoidOrphan.toString(), "Text CheckNumberA")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(15000)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
  })
  //==================================================Scenario 1 ended Here==============================================================
  
  //==================================================Scenario 2 Start Here==============================================================
 
  // Create Transaction of $75 for same Sub Bank Account
  // Print that transaction from Funds Menu
  // Precheck pdf will show the message - The following payments will not be printed due to insufficient funds.
  // Transaction screen will show the Check Status as 'I Insufficient Funds'
  test('AssureClaims_Funds_TransactionCreation_Test_04', async t => {
    var checknumberVoidOrphan = faker.random.number({ min: 10000, max: 99999 });
    var CollectionTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 0, "MM/DD/YYYY")
    var CheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 0, "MM/DD/YYYY")
    console.log("Funds Transaction Creation_Test_05 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    
    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", "NA", CollectionTransactionDate, "NA", "NA", StrSubBankAccountName1, data.PayeeType, data.LastName, "NA", data.TransactionType, "75")
    console.log("Funds Transaction is Created");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Orphan Transaction Status Released Verified
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_PrintCheck, "Print Check On Payment Creation Screen")
    await t.wait(15000)
    // const ele_PrintCheck =Payment_POM.AssureClaims_PaymentCollection_Line_PrintCheckVerification.withText("There are payments to sub bank accounts with insufficient funds. Do you wish to print checks from the accounts that have sufficient funds?").with({visibilityCheck:true})
    // await t.expect(ele_PrintCheck.exists).ok('',{timeout: 20000})
    await Verify_Utility.AssureClaims_ElementExist_Utility(Payment_POM.AssureClaims_PaymentCollection_Line_PrintCheckVerification, "There are payments to sub bank accounts with Insufficient Funds . Do you wish to print checks from the accounts that have sufficient funds?");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(15000)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatus_I_Insufficient_Funds, "CheckStatus TextBox");

  });

  //Verify at Account Balance window (from Bank Account) Insufficient Payments will be equal to transaction amount (i.e. $75)
  //Verify at Account Balance window (from Bank Account) -> Prior balance=deposit(<begindate) + collection(<begindate ) - printed payments(<begindate)
  test('AssureClaims_Verification_OnTheAccountBalanceScreen_Test_06', async t => {
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
    await t.wait(15000);
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrSubBankAccountNumber, "Bank Account Name")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.wait(15000)
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName1), "Bank Account Name link")
    console.log("Search is Completed");
    await t.wait(15000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
    await t.wait(6000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(2), "Close Button on Left Hand Side Of Screen")
    await t.wait(15000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
    await t.wait(15000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
    await t.wait(15000);
    var PriorBalance = "$140.00"
    var Insufficient_Payments = "$75.00"
    FetchPriorBalance = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_PriorBalance, "value");
    console.log("Prior Balance On Account Balance Screen is : ".green + FetchPriorBalance);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_PriorBalance, PriorBalance, "Prior Balance");
    console.log("Verification Of Prior Balance Is Successful".green)

    FetchInsufficientPayments = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_InsufficientPayments, "value");
    console.log("InsufficientPayments On Account Balance Screen is : ".green + FetchInsufficientPayments);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_InsufficientPayments, Insufficient_Payments, "InsufficientPayments");
    console.log("Verification Of InsufficientPayments Is Successful".green)

  });

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
  await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.nth(2).withText(StrSubBankAccountName), "SubBankAccount Number link Clicked")
  await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Sub Bank Account Screen", "", "");
  await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Sub Bank Account Screen", "", "");
  await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Bank Account Screen");
  await t.wait(4000)

  await t.switchToMainWindow();
  await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
  await t.wait(4000)
  await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_SearchSubBankAccount_Lnk_BankAccount.nth(1).withText(StrSubBankAccountName1), "SubBankAccount Number link Clicked")
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
              //====================================================Deletion of Bank and Sub Bank Account Ended ================================================

})

test('AssureClaims_ConfigurationManager_BankAccountSetting_Test_06', async t => {
        
  //==============================================================Login Into Application with User started==================================================================
  await t.wait(10000)
  await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
  console.log(`Login Into Application with ${data.Username}`)
  //=============================================================Login Into Application with User ended=========================================================================
  //====================================================Payment Parameter SetUp in Configuration manager started================================================
  
  await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Bank Account")
  await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_ConfigManager_Chk_UseSubBankAccounts,"UnCheck", "Use Sub Bank Account Checkbox uncheck")
  await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_ConfigManager_Chk_UseMasterBankAccount,"Check", "Use Master Bank Account checkbox checkbox")
  await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
  //====================================================Payment Parameter SetUp in Configuration manager ended================================================
});
});
