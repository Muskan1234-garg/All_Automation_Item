import { Selector,Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Search from '../Functional_POM/POM_Search';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home'; 

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();
const Search_POM = new POM_Search();
const Home_POM = new POM_Home();
const Maint_Utility = new Maintenance_Functionality_Utility();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();

var faker = require('faker');

DataIUT.forEach(data => {
  fixture `CopyTransaction2_OrphanTransaction`.beforeEach(async t => {
          await t.wait(4000)
          await t.navigateTo(data.URL)
          await t.maximizeWindow()    
});

var LastName;
var StrBankAccountName;

test('AssureClaims_PeopleEntityCreation_Test_01', async t => { 
    console.log("People Entity Creation From Maintenance_Test_01 Started".rainbow);
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Maintenance')
    await t.wait(5000)
    console.log("Login Into Application->Maintenance!!".green)
        console.log("AssureClaims_MaintenanceAddPeopleEntity_Utility Function is Called To Create People".yellow);
         LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker",data.Country,data.State);
        console.log("New People Entity is Created with Last Name: ".green+LastName);
        //New Entity Is Created
});

test('AssureClaims_BankCreation_Test_02', async t => {
  //=================================================BankAccount+CheckStock Creation Start Here================================
  var AccountNo=Generic_Utility.AssureClaims_RandomNumberGeneration_Utility(5);   
  var BankLastName = faker.name.lastName();
      var Address1= faker.address.streetName();
      var Address2= faker.address.streetAddress();
      var City = faker.address.city();
      var ZipCode = faker.random.number({min:10000, max:99999});
      var AccountName=faker.name.lastName();
      var NextCheck=faker.random.number({min:1, max:9999});
      // Local Variables

      console.log("BankAccount Creation_Test_02 Started".rainbow);
      await t.wait(10000)
      await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Claims')
      console.log(`Login Into Application->Claims`)
      //Login Into Application with User
      //------------------------------------------BankAccount Creation------------------------------------------------------------
      console.log("AssureClaims_BankAccount_AddEdit_Utility Function is Called To Create BankAccount".yellow); 
      StrBankAccountName=await Function_Utility.AssureClaims_BankAccount_AddEdit_Utility('Create',BankLastName,Address1,Address2,data.Country,data.State,
      City,ZipCode,(await AccountNo).toString(),AccountName,data.AccountType,NextCheck) 
})

//======================================Copy Transaction For Orphan Released Treansaction===========================================================
test('AssureClaims_CopyTransactionForReleasedOrphanTransaction_Test_03', async t => {
    console.log("Copy Transaction For Orphan Released Transaction Test 03 Started".rainbow);   
    await t.wait(10000)
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA","NA","NA","NA","NA",StrBankAccountName,data.PayeeType,LastName,"NA",data.TransactionType,"50")
    console.log("Funds Transaction is Createdr");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus,data.CheckStatusRReleased, "CheckStatus TextBox In Orphan Transaction");
    //Orphan Transaction Status Released Verified
    
    var StrControlNumberFundsReleasedOrphanPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
//Fetched Control Number
console.log(" New Contol Number is  : ".green+StrControlNumberFundsReleasedOrphanPayment);

var StrLastNameFundsReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName,"Fetched LastName value In Orphan Transaction");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green+StrLastNameFundsReleasedPayment);
     var StrDistributionTypeFundsReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType,"Fetched Distribution Type value in Funds Split");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green+StrDistributionTypeFundsReleasedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    var StrFundsSplitAmountForFundsReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,"Fetched Amount value in Funds Split");
    //Fetched Amout
    console.log(" Fetched Amount is : ".green+StrFundsSplitAmountForFundsReleasedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
//Copy Transaction starts
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Orphan Transaction screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Orphan Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
          .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberFundsReleasedOrphanPayment);
    console.log("Verification Of First Name Not Exist In Entity")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName+" is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType+" is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypeFundsReleasedPayment,"Verify Distribution Type In Orphan Transaction Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate,"Verify Transaction Date In Orphan Transaction Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate,"Verify Check Date In Orphan Transaction Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, StrLastNameFundsReleasedPayment,"Verify Check Date In Orphan Transaction Screen");
    //Verifing LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,StrFundsSplitAmountForFundsReleasedPayment,"Verify Check Date In Orphan Transaction Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType+" is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
    //Copy Transaction is Saved
    var StrControlNumberReleasedPayment_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
    //Fetched Control Number
    console.log("New ControlNumber Of Copy Transaction is Created with ID: ".green+StrControlNumberReleasedPayment_CopyTransaction);

})

//======================================Copy Transaction For Orphan Released Transaction Ends Here===========================================================
//======================================Copy Transaction For Orphan Printed Transaction Starts Here===========================================================
test('AssureClaims_CopytransactionForPrintedOrphanTransaction_Test_04', async t => {
    console.log("Copy Transaction For Orphan Printed Transaction Test04 Started".rainbow);   
    await t.wait(10000)
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    var checknumber= faker.random.number({min: 10000, max: 99999});
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Printed Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA","NA","NA","NA","NA",StrBankAccountName,data.PayeeType,LastName,"NA",data.TransactionType,"60")
    console.log("Funds Transaction is Createdr");
    //New Collection Is Created
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus,data.CheckStatusRReleased, "CheckStatus TextBox In Orphan Transaction");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber,checknumber.toString(),"Text CheckNumber In Orphan Transaction")
    await t.wait(3000)
    await t.pressKey('tab')
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok,"Click Ok Orphan Transaction Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus,data.CheckStatusPPrinted, "CheckStatus TextBox in Orphan Transaction");
    //Orphan Transaction Status Printed Verified
    
var StrControlNumberFundsPrintedOrphanPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
//Fetched Control Number
console.log(" New Contol Number is  : ".green+StrControlNumberFundsPrintedOrphanPayment);

var StrLastNameFundsPrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName,"Fetched LastName value in Orphan Transaction");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green+StrLastNameFundsPrintedPayment);
    var StrDistributionTypeFundsPrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType,"Fetched Distribution value In Orphan Transaction");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green+StrDistributionTypeFundsPrintedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    var StrFundsSplitAmountForFundsPrintedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,"Fetche The Amount value From Funds Split");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green+StrFundsSplitAmountForFundsPrintedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
   // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
//Copy Transaction starts
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Transaction screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Orphan Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
          .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberFundsPrintedOrphanPayment);
    console.log("Verification Of First Name Not Exist In Entity")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName+" is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType+" is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypeFundsPrintedPayment,"Verify Distribution Type In Orphan Transaction Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate,"Verify Transaction Date In Orphan Transaction Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate,"Verify Check Date In Orphan Transaction Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, StrLastNameFundsPrintedPayment,"Verify Check Date In Orphan Transaction Screen");
    //Verifing LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,StrFundsSplitAmountForFundsPrintedPayment,"Verify Check Date In Orphan Transaction Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType+" is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus,data.CheckStatusRReleased, "CheckStatus TextBox In Orphan Transaction");
    //Orphan Transaction Status Released Verified
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber,checknumber.toString(),"Text CheckNumber in Orphan Transaction")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
    //Copy Transaction is Saved
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus,data.CheckStatusPPrinted, "CheckStatus TextBox");
    //Check Status Printed Verified
      var StrControlNumberReleasedPayment_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
    //Fetched Control Number
    console.log("New ControlNumber Of Copy Transaction is Created with ID: ".green+StrControlNumberReleasedPayment_CopyTransaction);

})

//======================================Copy Transaction For Orphan Printed Transaction Ends Here===========================================================
//======================================Copy Transaction For Orphan Released Collection Starts Here=========================================================
test('AssureClaims_CopyTransactionForReleasedOrphanCollection_Test_05', async t => {
    console.log("Copy Transaction For Orphan Released Collection Test_05 Started".rainbow);   
    await t.wait(10000)
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    var checknumber= faker.random.number({min: 10000, max: 99999});
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Released Collection ".yellow);
await Function_Utility.AssureClaims_Funds_Transaction_Creation("1","NA","NA","NA","NA",StrBankAccountName,data.PayeeType,LastName,"NA",data.TransactionType,"70")
console.log("Funds Transaction is Createdr");
//New Collection Is Created
var StrControlNumberFundsReleasedCollection= await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
//Fetched Control Number
console.log("Released Copy Transaction ControlNumber is : ".green+StrControlNumberFundsReleasedCollection);

var StrLastNameFundsReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName,"Fetched LastName value From Orphan Transaction");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green+StrLastNameFundsReleasedCollection);
     var StrDistributionTypeFundsReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType,"Fetched Didtribution Type value From Orphan Transaction ");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green+StrDistributionTypeFundsReleasedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    var StrFundsSplitAmountForFundsReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,"Fetched Amount value From Funds Split");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green+StrFundsSplitAmountForFundsReleasedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
   // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
//Copy Transaction starts
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_CopyTransactionForReleasedCollection, "Copy Transaction Button On Orphan Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
          .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberFundsReleasedCollection);
    console.log("Verification Of First Name Not Exist In Entity")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName+" is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType+" is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypeFundsReleasedCollection,"Verify Distribution Type In Orphan Transaction Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate,"Verify Transaction Date In Orphan Transaction Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate,"Verify Check Date In Orphan Transaction Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, StrLastNameFundsReleasedCollection,"Verify Check Date In Orphan Transaction Screen");
    //Verifing LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,StrFundsSplitAmountForFundsReleasedCollection,"Verify Check Date In Orphan Transaction Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType+" is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
  // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
    //Copy Transaction is Saved
    var StrControlNumberReleasedPayment_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
    //Fetched Control Number
    console.log("New ControlNumber Of Copy Transaction is Created with ID: ".green+StrControlNumberReleasedPayment_CopyTransaction);
})
//======================================Copy Transaction For Orphan Printed Collection Starts Here=========================================================

test('AssureClaims_CopyTransactionForPrintedOrphanCollection_Test_06', async t => {
    console.log("Copy Transaction For Orphan Printed Collection Test_06 Started".rainbow);   
    await t.wait(10000)
    var TransactionDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    var checknumber= faker.random.number({min: 10000, max: 99999});
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Claims')
    console.log(`Login Into Application->Claims`)
    //Login Into Application with User
console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Printed Collection ".yellow);
await Function_Utility.AssureClaims_Funds_Transaction_Creation("1","NA","NA","NA","NA",StrBankAccountName,data.PayeeType,LastName,"NA",data.TransactionType,"80")
console.log("Funds Transaction is Createdr");
//New Collection Is Created
var StrControlNumberFundsPrintedCollection= await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
//Fetched Control Number
console.log("Copy Transaction ControlNumber is : ".green+StrControlNumberFundsPrintedCollection);
await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber,checknumber.toString(),"Text OF CheckNumber Of Orphan Transaction")
await t.wait(3000)
await t.pressKey('tab')
await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok,"Click Ok Orphan Transaction Creation Screen")

//fetching & To Do verification for copy Transaction
var StrLastNameFundsPrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName,"Fetched LastName value From Orphan Transaction");
    //Fetched Last Name
    console.log(" Fetched Lastname is  : ".green+StrLastNameFundsPrintedCollection);
     var StrDistributionTypeFundsPrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType,"Fetched Distribution value From  Orphan Transaction");
    //Fetched DistributionType
    console.log("Fetched DistributionType is : ".green+StrDistributionTypeFundsPrintedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    var StrFundsSplitAmountForFundsPrintedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,"Fetched Amount value Fron FundsSplit");
    //Fetched DistributionType
    console.log(" Fetched Amount is : ".green+StrFundsSplitAmountForFundsPrintedCollection);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
    //await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
//Copy Transaction starts
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Orphan Transaction screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Orphan Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const VerifyText_Of_ControlNumber_NotExist = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t
          .expect(VerifyText_Of_ControlNumber_NotExist).notContains(StrControlNumberFundsPrintedCollection);
    console.log("Verification Of First Name Not Exist In Copy Transaction Of Orphan Transaction")
    //verifing Control Number is NotExist
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName+" is Present in BanckAccount Field ".green);
    //verifing Bank Account Name
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType+" is Present in payeeType Field ".green);
    //verifing Payee Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_ScheduleCheck_Txt_DistributionType, StrDistributionTypeFundsPrintedCollection,"Verify Distribution Type In Orphan Transaction Screen");
    //verifing Distribution Type
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate,"Verify Transaction Date In Orphan Transaction Screen");
    //verifing Transaction Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckDate, TransactionDate,"Verify Check Date In Orphan Transaction Screen");
    //verifing Check Date
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, StrLastNameFundsPrintedCollection,"Verify Check Date In Orphan Transaction Screen");
    //Verifing LastName
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail,"Transaction Detail Tab On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EditFundsSplit,"Edit Funds Button On Orphan Transaction Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount,StrFundsSplitAmountForFundsPrintedCollection,"Verify Check Date In Orphan Transaction Screen");
    // verifing Amount on Funds Split
    await t.expect(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType).innerText).eql(data.TransactionType);
    console.log(data.TransactionType+" is Present in payeeType Field ".green);
    //verifing Transaction Type
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetailsScreen_Btn_Close,"Close Button On FundsSplit Screen On Orphan Transaction Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction,"Transaction Tab On Orphan Transaction Creation Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CheckNumber,checknumber.toString(),"Text OF CheckNumber")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Orphan Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Orphan Transaction Creation Screen");
    //Copy Transaction is Saved
    var StrControlNumberReleasedPayment_CopyTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber,"Fetched The value of ControlNumber");
    //Fetched Control Number
    console.log("New CopyTransaction ControlNumber is Created with ID: ".green+StrControlNumberReleasedPayment_CopyTransaction);

})

})
