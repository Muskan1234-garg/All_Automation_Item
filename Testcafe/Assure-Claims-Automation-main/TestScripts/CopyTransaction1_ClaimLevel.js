import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_Home from '../Functional_POM/POM_Home';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';

const Maint_Utility = new Maintenance_Functionality_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const SMS_POM = new POM_SMS();

var faker = require('faker');
const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

var StrClaimNumber;
//Global Variable Declaration

DataIUT.forEach(data => {
  fixture`CopyTransaction1_ClaimLevel`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });



  var StrClaimNumber;
  var StrControlNumberReleasedPayment;
  var StrControlNumberForPrintedPayment;
  var StrDistributionTypeReleasedPayment;
  var StrLastNameReleasedPayment;
  var StrLastNameReleasedPayment;
  var StrFundsSplitAmountForReleasedPayment;
  var StrControlNumberReleasedPayment_CopyTransaction;
  var StrBankAccountName;
  var LastName;
  var StrControlNumberPrintedPayment_CopyTransaction;

  var checknumber = faker.random.number({ min: 10000, max: 99999 });

   //====================================================SMS Permissions ON For copy TRansaction Starts Here====================================================
   test('AssureClaims_SMS_TurnONCopyTransaction_Test_01', async t => {
    await t.wait(10000)
    console.log("AssureClaims SMS Turn ON Copy Transaction Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(10000)
    console.log("Login Into Application!!".green)
    const elementWithId1 = Selector(id => { return document.getElementById(id); });
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Data Source")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DSN_RMATest_2, "Expand DSN")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_ModuleSecGroups, "Expand Module Security Group")
    await t.click(elementWithId1('Administrator'));
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster, "Expand RiskMaster")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster_FundsManagement, "Expand FundsManagement")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster_FundsManagement_Transaction, "Expand FundsManagement Transaction")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_Copy_Transaction, "Check", " CopyTransaction of Transaction on  FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Save, "save button")
  })
  //=====================================SMS Permissions ON For copy TRansaction Starts Here============================================================

  test('AssureClaims_EntityCreation_Test_02', async t => {
    console.log("Entity Creation From Maintenance_Test_01 Started".rainbow);
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    console.log("Login Into Application->Maintenance!!".green)

    //===============================================Entity Maintenance Start Here=================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
    LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
    console.log("New Entity is Created with Last Name: ".green + LastName);
    //New Entity Is Created
    //=================================================Entity Maintenance End Here===============================================

  });

  test('AssureClaims_BankCreation_Test_03', async t => {
    //=================================================BankAccount+CheckStock Creation Start Here================================
    var AccountNo = Generic_Utility.AssureClaims_RandomNumberGeneration_Utility(5);
    var BankLastName = faker.name.lastName();
    var Address1 = faker.address.streetName();
    var Address2 = faker.address.streetAddress();
    var City = faker.address.city();
    var ZipCode = faker.random.number({ min: 10000, max: 99999 });
    var AccountName = faker.name.lastName();
    var NextCheck = faker.random.number({ min: 1, max: 9999 });
    // Local Variables

    console.log("Bank With CheckStock Creation_Test_03 Started\n".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    //------------------------------------------BankAccount Creation------------------------------------------------------------
    console.log("AssureClaims_BankAccount_AddEdit_Utility Function is Called To Create BankAccount".yellow);
    StrBankAccountName = await Function_Utility.AssureClaims_BankAccount_AddEdit_Utility('Create', BankLastName, Address1, Address2, data.Country, data.State,
      City, ZipCode, (await AccountNo).toString(), AccountName, data.AccountType, NextCheck)
  })

  test('AssureClaims_GCCreation_Test_04', async t => {
    console.log("GeneralClaim Creation_Test_04 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User  
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //======Claim Creation Started Here=====================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //Claim Creation  completed  
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "1000", data.ReserveStatus)
    //Reserve created   
  });

  //======================================Copy Transaction For Released Payments Starts Here========================================
  test('AssureClaims_CopyTransactionForReleasePayment_Test_05', async t => {
    console.log("PaymentCreation For CopyTransaction For Released Payments On GeneralClaim Started".rainbow);
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User 


    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    /*===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, data.TransactionType, "10");
    // Payment is Created
    /*===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Check Status Released Verified
    StrControlNumberReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberReleasedPayment);
    StrLastNameReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green + StrLastNameReleasedPayment);
    StrDistributionTypeReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, "value");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green + StrDistributionTypeReleasedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Payment Creation Screen")
    StrFundsSplitAmountForReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "value");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green + StrFundsSplitAmountForReleasedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    //Copy Transaction starts
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Transaction screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
      .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberReleasedPayment);
    console.log("Verification Of First Name Not Exist In Entity")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName + " is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType + " is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypeReleasedPayment, "Verify Distribution Type In Transaction Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate, "Verify Transaction Date In Transaction Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate, "Verify Check Date In Transaction Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, LastName, "Verify Check Date In Transaction Screen");
    //Verifing LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Payment Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, StrFundsSplitAmountForReleasedPayment, "Verify Check Date In Transaction Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType + " is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    //Copy Transaction is Saved
    StrControlNumberReleasedPayment_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberReleasedPayment_CopyTransaction);


  });

  //==========================================CopyTransaction For Printed Payments Starts Here=============================================
  test('AssureClaims_CopyTransactionForPrintedPayments_Test_06', async t => {
    console.log("PaymentCreation For Copy Transaction For Printed Payments Started".rainbow);
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    var checknumber = faker.random.number({ min: 10000, max: 99999 });
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User  

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, data.TransactionType, "20");
    // Payment is Created
    //===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //Check Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumber.toString(), "Text CheckNumber")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(2000)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
    var StrControlNumberForPrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log(" ControlNumber For Printed Payment is  : ".green + StrControlNumberForPrintedPayment);
    var StrLastNamePrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    //Fetched Last Name
    console.log("New LastName is  : ".green + StrLastNamePrintedPayment);
    var StrDistributionTypePrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, "value");
    //Fetched DistributionType
    console.log("New CheckStatus is : ".green + StrDistributionTypePrintedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Payment Creation Screen")
    var StrFundsSplitAmountForPrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "value");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green + StrFundsSplitAmountForPrintedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");

    //===============================copy transaction==========================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Transaction screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
      .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberReleasedPayment);
    console.log("Verification Of First Name Not Exist In Entity")
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName + " is Present in BanckAccount Field ".green);
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType + " is Present in payeeType Field ".green);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypePrintedPayment, "Verify Distribution Type In Transaction Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate, "Verify Transaction Date In Transaction Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate, "Verify Check Date In Transaction Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, LastName, "Verify Check Date In Transaction Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Payment Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, StrFundsSplitAmountForPrintedPayment, "Verify Check Date In Transaction Screen");
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType + " is Present in payeeType Field ".green);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumber.toString(), "Text CheckNumber")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    //await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
    StrControlNumberPrintedPayment_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberPrintedPayment_CopyTransaction);
  })
  //==========================================CopyTransaction For Printed Payments Ends Here=======================================================
 
  //==========================================CopyTransaction For Released Collection Starts Here==============================================================
  test('AssureClaims_CopyTransactionForReleasedCollection_Test_05', async t => {
    console.log("CollectionCreation For Copy Transaction For Collection Started".rainbow);
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User   

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Collection Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, "NA", data.TransactionType, "30")
    // Collection is Created 
    //===========================================================Collection Creation Is Completed Here======================================================================================================================================================================================================================================================================================================== 
    var StrControlNumberForReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberForReleasedCollection);
    var StrLastNameReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green + StrLastNameReleasedCollection);
    var StrDistributionTypeReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, "value");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green + StrDistributionTypeReleasedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Collection Creation Screen")
    var StrFundsSplitAmountForReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "value");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green + StrFundsSplitAmountForReleasedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Collection Creation Screen");
    //await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Collection Creation Screen");
    //===============================copy transaction==========================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Collection screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Collection screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
      .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberReleasedPayment);
    console.log("Verification Of First Name Not Exist In Entity")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName + " is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType + " is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypeReleasedCollection, "Verify Distribution Type In Collection Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate, "Verify Transaction Date In Collection Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate, "Verify Check Date In Collection Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, StrLastNameReleasedCollection, "Verify Check Date In Collection Screen");
    //LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Collection Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, StrFundsSplitAmountForReleasedCollection, "Verify Check Date In Collection Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType + " is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Collection Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Collection Creation Screen");
    //Copy Transaction is Saved
    var StrControlNumberReleasedCollection_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberReleasedCollection_CopyTransaction);
  });
  //==========================================CopyTransaction For Released Collection Ends Here==============================================================
 
  //==========================================CopyTransaction For Printed Collection Starts Here==============================================================
  test('Assureclaims_CopyTransactionForPrintedCollection_Test_06', async t => {
    console.log("CollectionCreation For Copy Transaction For Collection Started".rainbow);
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    var checknumber = faker.random.number({ min: 10000, max: 99999 });
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User    

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Collection Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, "NA", data.TransactionType, "40")
    // Collection is Created 
    //===========================================================Collection Creation Is Completed Here======================================================================================================================================================================================================================================================================================================== 
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumber.toString(), "Text CheckNumber")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    await t.wait(2000)
    var StrControlNumberForPrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberForPrintedCollection);
    var StrLastNamePrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green + StrLastNamePrintedCollection);
    var StrDistributionTypePrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, "value");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green + StrDistributionTypePrintedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Collection Creation Screen")
    var StrFundsSplitAmountForPrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "value");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green + StrFundsSplitAmountForPrintedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Collection Creation Screen");
    //await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Collection Creation Screen");
    //===============================copy transaction==========================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Collection screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Collection screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
      .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberReleasedPayment);
    console.log("Verification Of First Name Not Exist In Entity")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName + " is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType + " is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypePrintedCollection, "Verify Distribution Type In Collection Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate, "Verify Transaction Date In Collection Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate, "Verify Check Date In Collection Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, StrLastNamePrintedCollection, "Verify Check Date In Collection Screen");
    //LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit, "Edit Funds Button On Collection Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, StrFundsSplitAmountForPrintedCollection, "Verify Check Date In Collection Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType + " is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close, "Close Button On FundsSplit Screen On Collection Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Collection Creation Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber, checknumber.toString(), "Text CheckNumber")
    await t.wait(3000)
    //Check Printed
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Collection Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Collection Creation Screen");
    //Copy Transaction is Saved
    var StrControlNumberPrintedCollection_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //Fetched Control Number
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberPrintedCollection_CopyTransaction);
  });
  //==========================================CopyTransaction For Released Collection Starts Here==============================================================


})
