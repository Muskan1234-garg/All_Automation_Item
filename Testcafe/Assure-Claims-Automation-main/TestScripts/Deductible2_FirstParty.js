import { Selector, Role } from 'testcafe';
import { ClientFunction } from 'testcafe';
import Colors from 'colors';

import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';

import POM_Home from '../Functional_POM/POM_Home';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Deductible from '../Functional_POM/POM_Deductible';

// const DataIUT = require('../DataFiles/DataIUT.json');
// const DataIUT = require('../DataFiles/DataAutoReg.json');
const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');

const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();

const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();
const Deductible_POM = new POM_Deductible();
const Home_POM = new POM_Home();

var faker = require('faker');

//global variables
var StrClaimNumber;
var StrControlNumber;
var StrControlNumber1;
var StrControlNumber2;

DataIUT.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    //Login into Claims zone
    await t.wait(10000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`Deductible2_FirstParty`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  test('CarrierGCClaimCreation_Test_01', async t => {

    //=====================================Carrier Claim Creation started here===================================================================================================================================
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_CarrierGCClaimCreation(d, d, data.GCCarrierClaimType, data.ClaimStatus, data.Department, data.GCCarrierPolicyLOB, data.PolicySystem, data.PolicyName)
    console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //=====================================Carrier Claim Creation completed here===================================================================================================================================

    //=====================================First Party Deductible Creation started here===================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_DeductibleSummary, "Deductible Summary button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_PolicyName, "Link on Deductible Summary")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_DeductibleTypeLookup, "Deductible type Lookup")
    const ele1 = Deductible_POM.AssureClaims_Claims_Lnk_SelectDeductibleType.withText(data.DeductibleType_FP).with({ visibilityCheck: true })
    await t.expect(ele1.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Deductible type Option")

    await In_Utility.AssureClaims_SetValue_Utility(Deductible_POM.AssureClaims_Claims_Txt_DeductibleDedAmount, data.DeductibleAmount, "Ded/Sir Amount text box")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_ExcludeReserveType, "Exclude Reserve Type radio button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Click on Save Button")
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_CloseButton, "Close button")
    //=====================================First Party Deductible Creation completed here===================================================================================================================================

    //=====================================Verify after creating First party deductible-->No reserve is created,started here===================================================================================================================================
    await t.wait(2000)
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available."), "No records Available text ")
    //=====================================Verify after creating First party deductible-->No reserve is created,completed here===================================================================================================================================






  });


  test('FirstPartyDeductible_ReserveCreation_Test_02', async t => {

    //=====================================Search Claim->Create reserve with same policy coverage type started here===================================================================================================================================
    await t.wait(10000);

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Function_Utility.AssureClaims_CarrierReserveAddition_Utility(data.DeductibleReserveAmount, data.PolicyCoverage, data.PolicyLossCode, data.PolicyUnit, data.ReserveStatus, data.DeductibleReserveType_Ex)
    console.log("New Carrier Reserve is Created".green);
    await t.wait(5000)
    //=====================================Search Claim->Create reserve with same policy coverage type completed here===================================================================================================================================


    //=========Verify over financial/reserve screen 2 transaction gets created-->One we have created,another created automatically for deductible reserve started here===================================================================================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchBalance, data.DeductibleReserveAmount, "Enter Balance")
    await t.wait(4000)
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve type")
    await t.pressKey('ctrl+a delete')

    await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve, data.DeductibleReserveType_Ex1, "Enter Reserve Type")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve type")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Select row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
    //======Verify over financial/reserve screen 2 transaction gets created-->One we have created,another created automatically for deductible reserve completed here===================================================================================================================================

    //=====================================Not able to create payment when deductible reserve type is selected started here===================================================================================================================================
    var Msg_PaymentCreationDeductibleReserve = "You are not allowed perform any operation on deductible reserve. Please select payment reserve to create a payment.";
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Msg_PaymentCreationDeductibleReserve, true, "Payment can not be created on deductible reserve")
    //=====================================Not able to create payment when deductible reserve type is selected started completed here===================================================================================================================================



  });


  test('FirstPartyDeductible_PaymentAgainstClaimant_Test_03', async t => {

    //=====================================Search Claim->Create Payment(when payee type claimant) on non-Deductible reserve started here===================================================================================================================================
    await t.wait(10000);

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist.nth(1), "Select row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
    await Function_Utility.AssureClaims_CarrierCollectionPaymentAddition_Utility(data.BankAccount, data.PayeeTypeClaimant, data.TransactionType, data.DeductiblePaymentAmount, data.PolicyUnit, data.PolicyCoverage, data.PolicyLossCode)
    console.log("New Carrier Payment is Created".green);
    StrControlNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
    //=====================================Search Claim->Create Payment(when payee type claimant) on non-Deductible reserve completed here===================================================================================================================================

    //=====================================Verify Over Transaction History Screen that one transaction gets created started here===================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber, "Control Number 1")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve type")
    //=====================================Verify Over Transaction History Screen that one transaction gets created completed here===================================================================================================================================

    //=====================================Print the Created Transaction started here================================================================================================================================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Image reload");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_PrintCheck.withText('Print Check'), "Print Check Option From The List")
    await t.wait(2000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_PrintButton, "Print button")
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_OkToPrintCheck, "ok button to print check")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_OkToPrintCheckRange, "ok button to print check range")
    await t.wait(5000)
    //=====================================Print the created Transaction completed here===================================================================================================================================

    //=====================After Print Transaction -->verify over Transaction history screen one more control number is generated with name (Controlnumber_D) started here================================================================================
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    var Deductible_ControlNumber = StrControlNumber + "_D"
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber, "Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    const ColHeader1 = ["Type"]
    const ColValue1 = ["Payment"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Payment", "Transaction History Screen", ColHeader1, ColValue1)

    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, Deductible_ControlNumber, "Deductible Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    const ColHeader2 = ["Type", "Check #"]
    const ColValue2 = ["Collection", "-1"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Collection", "Transaction History Screen", ColHeader2, ColValue2)
    //=====================After Print Transaction -->verify over Transaction history screen one more control number is generated with name (Controlnumber_D) completed here================================================================================


    //=====================Go to this (Controlnumber_D) number and verify payeetype always ='O-Other Payees (People & Entities)' and lastname is policy insured name started here================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
    await t.wait(5000)
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    var ActualPayeeType = await Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withAttribute('selected').innerText;
    var ActualLastName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    var ExpectedPayeeType = data.PayeeType;
    var ExpectedLastName = data.ClaimantName;
    if (ActualPayeeType === ExpectedPayeeType)
      console.log(ExpectedPayeeType.green + "is matched with".yellow + " " + ActualPayeeType.green + "Hence verification successful".green)
    else
      console.log(ExpectedPayeeType.red + "is matched with".red + " " + ActualPayeeType.red + "Hence verification is not successful".red)
    if (ActualLastName === ExpectedLastName)
      console.log(ExpectedLastName.green + "is matched with".yellow + " " + ActualLastName.green + "Hence verification successful".green)
    else
      console.log(ExpectedLastName.red + "is matched with".red + " " + ActualLastName.red + "Hence verification is not successful".red)
    //=====================Go to this (Controlnumber_D) number and verify payeetype always ='O-Other Payees (People & Entities)' and lastname is policy insured name completed here================================================================================

  });


  test('FirstPartyDeductible_PaymentAgainstOtherPayee_Test_04', async t => {

    //=====================================Search Claim->Create Payment (When payee type-->Other payee)on non-Deductible reserve started here===================================================================================================================================
    await t.wait(10000);

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist.nth(1), "Select row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, "Bank Account")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(data.BankAccount), "Select bank account")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType), "Payee Payor Type Value On Payment Creation Screen")
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, data.LastName, "Last Name Text Box On Payment Creation Screen")
    await t.wait(3000)
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await t.wait(20000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType), "Transaction Type Value On Funds Split Detail Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, data.DeductiblePaymentAmount, "Transaction Amount On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit, "PaymentUnit Type")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundUnit.find('option').withText(data.PolicyUnit), "PaymentUnit Type Value")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType, "Fund Coverage Type")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundCoverageType.find('option').withText(data.PolicyCoverage), "Fund Coverage Type Value")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType, "Fund Loss Type")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_FundLossType.find('option').withText(data.PolicyLossCode), "Fund Loss Type Value")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    console.log("New Carrier Payment is Created".green);
    StrControlNumber1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
    //=====================================Search Claim->Create Payment (When payee type-->Other payee)on non-Deductible reserve completed here===================================================================================================================================

    //=====================================Verify Over Transaction History Screen that one transaction gets created started here===================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await t.wait(2000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber1, "Control Number 1")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve type")
    //=====================================Verify Over Transaction History Screen that one transaction gets created completed here===================================================================================================================================

    //=====================================Print the Created Transaction started here================================================================================================================================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Image reload");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_PrintCheck.withText('Print Check'), "Print Check Option From The List")
    await t.wait(2000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_PrintButton, "Print button")
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_OkToPrintCheck, "ok button to print check")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_OkToPrintCheckRange, "ok button to print check range")
    await t.wait(5000)
    //=====================================Print the Created Transaction completed here================================================================================================================================================================================

    //=====================After Print Transaction -->verify over Transaction history screen one more control number is generated with name (Controlnumber_D) started here================================================================================
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    var Deductible_ControlNumber = StrControlNumber1 + "_D"

    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber1, "Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    const ColHeader1 = ["Type"]
    const ColValue1 = ["Payment"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Payment", "Transaction History Screen", ColHeader1, ColValue1)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, Deductible_ControlNumber, "Deductible Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    const ColHeader2 = ["Type", "Check #"]
    const ColValue2 = ["Collection", "-1"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Collection", "Transaction History Screen", ColHeader2, ColValue2)
    //=====================After Print Transaction -->verify over Transaction history screen one more control number is generated with name (Controlnumber_D) completed here================================================================================

    //=====================Go to this (Controlnumber_D) number and verify payeetype always ='O-Other Payees (People & Entities)' and lastname is policy insured name started here================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_ControlNumber, "Control number link")
    await t.wait(5000)
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    var ActualPayeeType = await Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withAttribute('selected').innerText;
    var ActualLastName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    var ExpectedPayeeType = data.PayeeType;
    var ExpectedLastName = data.ClaimantName;
    if (ActualPayeeType === ExpectedPayeeType)
      console.log(ExpectedPayeeType.green + "is matched with".yellow + " " + ActualPayeeType.green + "Hence verification successful".green)
    else
      console.log(ExpectedPayeeType.red + "is matched with".red + " " + ActualPayeeType.red + "Hence verification is not successful".red)
    if (ActualLastName === ExpectedLastName)
      console.log(ExpectedLastName.green + "is matched with".yellow + " " + ActualLastName.green + "Hence verification successful".green)
    else
      console.log(ExpectedLastName.red + "is matched with".red + " " + ActualLastName.red + "Hence verification is not successful".red)
    //=====================Go to this (Controlnumber_D) number and verify payeetype always ='O-Other Payees (People & Entities)' and lastname is policy insured name completed here================================================================================


  });


  test('FirstPartyDeductible_PaymentwhenDeductibleAmountIsEroded_Test_05', async t => {

    //=====================================Search Claim->Create Payment(when payee type claimant) on non-Deductible reserve started here===================================================================================================================================
    await t.wait(10000);

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist.nth(1), "Select row")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
    await Function_Utility.AssureClaims_CarrierCollectionPaymentAddition_Utility(data.BankAccount, data.PayeeTypeClaimant, data.TransactionType, data.DeductiblePaymentAmount, data.PolicyUnit, data.PolicyCoverage, data.PolicyLossCode)
    console.log("New Carrier Payment is Created".green);
    StrControlNumber2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
    //=====================================Search Claim->Create Payment(when payee type claimant) on non-Deductible completed started here===================================================================================================================================

    //=====================================Verify Over Transaction History Screen that one transaction gets created started here===================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number 1")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist for entered reserve type")
    //=====================================Verify Over Transaction History Screen that one transaction gets created completed here===================================================================================================================================

    //=====================================Print the Created Transaction started here================================================================================================================================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Image reload");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Lnk_PrintCheck.withText('Print Check'), "Print Check Option From The List")
    await t.wait(2000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_PrintButton, "Print button")
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_OkToPrintCheck, "ok button to print check")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Claims_Btn_OkToPrintCheckRange, "ok button to print check range")
    await t.wait(5000)
    //=====================================Print the Created Transaction completed here================================================================================================================================================================================

    //=====================After Print Transaction -->verify over Transaction history screen one more control number is NOT generated with name (Controlnumber_D) as DEDUCTIBLE AMOUNT GETS ERODED started here================================================================================
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    var Deductible_ControlNumber = StrControlNumber2 + "_D"
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    const ColHeader1 = ["Type"]
    const ColValue1 = ["Payment"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Payment", "Transaction History Screen", ColHeader1, ColValue1)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, Deductible_ControlNumber, "Deductible Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await t.wait(4000)
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row does not exist for entered reserve type")
    //=====================After Print Transaction -->verify over Transaction history screen one more control number is NOT generated with name (Controlnumber_D) as DEDUCTIBLE AMOUNT GETS ERODED completed here================================================================================




  });













});






//Jira id - RMA-92767
//Policy-->test10
//coverage-->101 auto bodily injury
//lossscode-->NEWCODE
//Claimantname-->Jerry Spiegel Associates, et al
//Unit-->0000056
//ReserveType-->Expense


