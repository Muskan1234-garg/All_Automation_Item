import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Search from '../Functional_POM/POM_Search'
import POM_BankAccount from '../Functional_POM/POM_BankAccount';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const ConfigMgr_POM = new POM_Config_Manager();
const GenSysPar_POM = new POM_GeneralSystemParameter();
const BankAccount_POM = new POM_BankAccount();
const Payment_POM = new POM_PaymentsCollections();
//const GenSysPar_POM = new POM_GeneralSystemParameter();
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
//JIRA ID OF STORY : RMA-87954(Story - 1,Scenario1), RMA-98987
//Description      : Bank Account Reconciliation
//AUTHOR           : Sai Krishna Maddula, Tushar Bachchan
//DEPENDANCY       : NO
//PRE-REQUISITES   : NO
//Preferred Server : 194Automation, DSN2
//*************************************************************************************************


DataIUT.forEach(data => {
      fixture`BankReconciliation1`.beforeEach(async t => {
            await t.wait(4000)
            await t.navigateTo(data.URL)
            await t.maximizeWindow()
      });

      var StrBankAccountName1
      var DepositTransit
      var StrSubBankAccountName
      var StrClaimNumber
      var StrControlNumberPayment
      var StrControlNumberPayment1
      var ReleasedPayments
      var OutStandingChecks
      var ClearedChecks
      var FromDate
      var ToDate
      var StrSubBankAccountNumber

      //Configuration Manager Setting: Payment Parameter - 2 settings
      // Turn on Use Sub Bank account Setting and Assign Check Stocks setting
      test('AssureClaims_ConfigurationManager_BankAccountSetting_Test_01', async t => {

            //==============================================================Login Into Application with User started==================================================================
            await t.wait(10000)
            await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
            console.log(`Login Into Application with ${data.Username}`)
            //=============================================================Login Into Application with User ended=========================================================================
            //====================================================Payment Parameter SetUp in Configuration manager started================================================

            await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Bank Account")
            await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_ConfigManager_Chk_UseSubBankAccounts,"Check", "Use Sub Bank Account Checkbox uncheck")
            await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPar_POM.AssureClaims_ConfigManager_Chk_AssignCheckStocksToSubAccounts,"Check", "Use Master Bank Account checkbox checkbox")
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
            //====================================================Payment Parameter SetUp in Configuration manager ended================================================
      });



   
      // Create Check Stock - Exist in Testcafe
      // Create Sub Bank Account - New
      // Create Deposit on Sub Bank From the Bank A/c screen- New
      // Deposit in Transit (AB) = Deposit of Sub Bank A/c
      test('AssureClaims_BankWithCheckStockSubBankAccount_DepositCreation_Test_02', async t => {
            //=================================================BankAccount+CheckStock Creation Start Here================================
            var AccountNo = Generic_Utility.AssureClaims_RandomNumberGeneration_Utility(5);
            var BankLastName = "Bank_" + faker.name.lastName();
            var Address1 = faker.address.streetName();
            var Address2 = faker.address.streetAddress();
            var City = faker.address.city();
            var ZipCode = faker.random.number({ min: 10000, max: 99999 });
            var AccountName = faker.name.lastName();
            var NextCheck = faker.random.number({ min: 1, max: 99999 });
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
            await Function_Utility.AssureClaims_BankAccount_SubBankAccount_Utility(AccountName, (await AccountNo).toString(), CheckStockCreation_Txt_StockName)
            StrSubBankAccountName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName, "value");
            console.log("Bank Account With SubBankAccount Has Been Created :".yellow + StrSubBankAccountName);
            //Bank Account With Check Stock Has Been Created
            await t.switchToMainWindow()
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
            //====================================================SubBankAccount Creation Ends Here==================================================================

            //====================================================Deposit Creation Starts Here===============================================================
            var TransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 0, "MM/DD/YYYY")
            console.log("AssureClaims_BankAccount_Deposite_Utility Function is Called To Create BankAccount_Deposite".yellow);
            await Function_Utility.AssureClaims_BankAccount_Deposit_Utility("NA", TransactionDate, AccountName, data.DepositAmount)
            console.log(" Deposit Has Been Created on the SubBankAccount".yellow)
            //====================================================Deposit Creation End Here==================================================================
            await t.switchToMainWindow()
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_BankAccountIframe)
            //Navigation to Account Balance Screen
            await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
            await t.wait(5000);
            DepositTransit = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositTransit, "value");
            console.log("Value of Deposits in Transit is : ".green + DepositTransit);
            await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_DepositTransit.value).eql(DepositTransit);
            console.log("Verification Of Deposit Transit on the Account balance Screen Is Successful".green)
      });

      //Create Claim, Create Reserve,Create Payment on sub bank a/c (Released)
      //Released Payment (AB)= Payment (Released)
      //Create 2nd Transaction and print it manually
      //Outstanding Checks(AB) = Printed Payment
      //Create 3rd Transaction and print it manually and then clear it
      //Cleared Checks(AB) = Cleared Payment 
      test('AssureClaims_GeneralClaimReserveTransactions_Creation_Test_03', async t => {
            console.log("GeneralClaim_Reserve_Transactions Creation_Test_03 Started".rainbow);
            await t.wait(10000)
            await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
            console.log(`Login Into Application->Claims`)
            //Login Into Application with User    
            //====================================================General Claim Creation Start Here============================================
            var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
            console.log("AssureClaims_GeneralClaimCreation Function is Called To Create GeneralClaim".yellow);
            StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
            console.log("New ClaimNumber is Created with ID: ".green + StrClaimNumber);
            //New GeneralClaim Is Created
            //=================================================General Claim Creation End Here================================================
            //==================================================Reserve Creation Started Here=====================================================
            await t.switchToMainWindow();
            await t.wait(3000)
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
            await t.wait(3000)
            console.log("AssureClaims_Reserve_Utility Function is Called To Create Reserve ".yellow);
            await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
            console.log("New Reserve is Created");
            //New Reserve Is Created
            //==================================================Reserve Creation End Here=====================================================
            await t.switchToMainWindow()
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
            //-----------------------------------Release Payment Creation Starts Here-----------------------------------------------------   
            console.log("AssureClaims_PaymentCorpAddition_Utility Function is Called To Create Reserve ".yellow);
            await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrSubBankAccountName, data.PayeeType, data.LastName, data.TransactionType, data.PaymentAmount)
            console.log("New Payment is Createdr");
            //Release Payment Is Created
            await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
            //Check Status Released Verified
            StrControlNumberPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
            //Fetched Control Number
            console.log("New Release Payment  is Created with ControlNumber : ".green + StrControlNumberPayment);
            await t.switchToMainWindow()
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
            //-----------------------------------Printed Payment Creation Starts Here-----------------------------------------------------   
            var checknumberForVoid = faker.random.number({ min: 10000, max: 99999 });
            console.log("AssureClaims_PaymentCorpAddition_Utility Function is Called To Create Reserve ".yellow);
            await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName1, data.PayeeType, data.LastName, data.TransactionType, data.PaymentAmount)
            console.log("New Payment is Createdr");
            //New Printed Payment Is Created
            await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
            //Check Status Released Verified
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberForVoid.toString(), "Text CheckNumber")
            await t.wait(3000)
            await t.pressKey('tab')
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
            await t.wait(2000)
            await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
            //Check Status Printed Verified
            StrControlNumberPayment1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
            //Fetched Control Number
            console.log("New Printed Payment  is Created with ControlNumber :: ".green + StrControlNumberPayment1);
            await t.switchToMainWindow()
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
            //-----------------------------------Clear Check Payment Creation Starts Here-----------------------------------------------------   
            var checknumberForClearCheck = faker.random.number({ min: 10000, max: 99999 });
            console.log("AssureClaims_PaymentCorpAddition_Utility Function is Called To Create Reserve ".yellow);
            await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName1, data.PayeeType, data.LastName, data.TransactionType, data.PaymentAmount)
            console.log("New Payment is Createdr");
            //New Released Payment Is Created
            await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
            //Check Status Released Verified
            await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumberForClearCheck.toString(), "Text CheckNumber")
            await t.wait(3000)
            await t.pressKey('tab')
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
            await t.wait(2000)
            await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
            //Check Status Printed Verified
            await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Chk_Cleared, 'Check', "Click Cleared Cheack Box On Payment Creation Screen")
            //Check Cleared using Cleared Check Box
            await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
            console.log("New Cleared Check Payment  is Created ".green);
      });

      //Verify Statement Dates (From & To) Dates are edtable
      //Verify Statement Dates (From & To) Dates are by default populated with Current Dates
      // Deleting Bank and Sub Bank Accounts
      test('AssureClaims_VerificationOnTheAccountBalanceScreen_Test_04', async t => {
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
            await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_BankAccountNumber, StrSubBankAccountNumber, "Bank Account Name")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
            await t.switchToMainWindow();
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName1), "Bank Account Name link")
            console.log("Search is Completed");
            await t.switchToMainWindow();
            await t.wait(8000);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft, "Close Button on Left Hand Side Of Screen")
            await t.wait(4000);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
            await t.wait(4000)
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
            await t.wait(4000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(BankAccount_POM.AssureClaims_BankAccount_Btn_AccountBalance, "Account Balance On BankAccount is Clicked")
            await t.wait(5000);

            ReleasedPayments = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ReleasedPayments, "value");
            console.log("Released Payments: ".green + ReleasedPayments);

            await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_ReleasedPayments.value).eql(ReleasedPayments);
            console.log("Verification Of ReleasedPayments Is Successful".green)

            OutStandingChecks = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_OutStandingChecks, "value");
            console.log("OutStanding Checks: ".green + OutStandingChecks);

            await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_OutStandingChecks.value).eql(OutStandingChecks);
            console.log("Verification Of OutStandingChecks Is Successful".green)

            ClearedChecks = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_ClearedChecks, "value");
            console.log("Cleared Checks : ".green + ClearedChecks);

            await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_ClearedChecks.value).eql(ClearedChecks);
            console.log("Verification Of ClearedChecks Is Successful".green)

            FromDate = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementFromDate, "value");
            console.log("FromDate : ".green + FromDate);

            await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementFromDate.value).eql(FromDate);
            console.log("Verification Of FromDate Is Successful".green)

            ToDate = await Verify_Utility.AssureClaims_AttributeFetch_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementToDate, "value");
            console.log("ToDate : ".green + ToDate);

            await t.expect(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementToDate.value).eql(ToDate);
            console.log("Verification Of ToDate Is Successful".green)

            var FromDateDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1, 0, 0, "MM/DD/YYYY")
            var ToDateDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, 0, "MM/DD/YYYY")
            await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementFromDate, FromDateDate, "SubBank Account Name is Typed")
            await In_Utility.AssureClaims_SetValue_Utility(BankAccount_POM.AssureClaims_BankAccount_Txt_StatementToDate, ToDateDate, "SubBank Account Name is Typed")

            const FromDateDate1 = BankAccount_POM.AssureClaims_BankAccount_Txt_StatementFromDate
            await t.expect(FromDateDate1.hasAttribute('aria-disabled')).ok('', { timeout: 20000 })
            console.log("Verification Of Read Only Mode of Statement From Date Is Successful".green)

            const ToDateDate1 = BankAccount_POM.AssureClaims_BankAccount_Txt_StatementToDate
            await t.expect(ToDateDate1.hasAttribute('aria-disabled')).ok('', { timeout: 20000 })
            console.log("Verification Of Read Only Mode of Statement To Date Is Successful".green)
      });
      //Deleting Bank and Sub Bank Accounts
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
            //====================================================Searching Bank Account Ended ================================================
            //====================================================Deletion of Bank and Sub Bank Account Started ================================================
            await t.switchToMainWindow();
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_BankAccountIframe1);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_BankAccountName.withText(StrBankAccountName1), "Bank Account Name link")
            console.log("Search is Completed");
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
            //====================================================Deletion of Bank and Sub Bank Account Ended ================================================
      })
});
