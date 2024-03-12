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
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';
import POM_Entity from '../Functional_POM/POM_Entity';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

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
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();
const Entity_POM = new POM_Entity();
const ConfigMgr_POM = new POM_Config_Manager();

var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

DataIUT.forEach(data => {
  fixture`CopyTransaction3_ExistForVoid_Config`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
  // ************************************************************************************************
  //JIRA ID OF STORY : RMA-90897,RMA-98187,RMA-98985
  //Description      : Copy Transaction
  //AUTHOR           : Sai Krishna Maddula, Garima Singhal,Muskan Garg
  //DEPENDANCY       : NO
  //PRE-REQUISITES   : 1. turn on copy transaction from security, turn off sub-bank account
  //Preferred Server : 194Automation, DSN2
  //*************************************************************************************************

  //===============================================================Global Variables============================================================================================================
  var LastName_For_Hold_Transaction;
  var StrClaimNumber;
  var StrControlNumberReleasedPayment;
  var StrBankAccountName;
  var LastName;

    /*
    1)Login into Configuration Manager
    2)Checked setting :- Check Void Reason
    */
  test('AssueClaims_TurnOnSettingFromConfigManager_Test_01', async t => {

    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application Configuration Manager`)
    //=============================================================Login Into Application with User ended=========================================================================

    //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Void")

    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CheckVoidReason, "Check", "Void code reason")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
    //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================

  });

  
    /*
    1)Login into Maintenance
    2)Create Entity
    */
  test('AssureClaims_EntityCreation_Test_02', async t => {
    console.log("Entity Creation From Maintenance_Test_02 Started".rainbow);
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(10000)
    console.log("Login Into Application->Maintenance!!".green)
    //====================================================================Entity Maintenance Start Here===================================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
    LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
    console.log("New Entity is Created with Last Name: ".green + LastName);
    //New Entity Is Created
    //=====================================================================Entity Maintenance End Here=======================================================================================
  });

    /*
    1)Login into Claims
    2)Create Bank Account
    */
  test('AssureClaims_BankCreation_Test_03', async t => {
    //=======================================================================BankAccount+CheckStock Creation Start Here===============================================================
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
    //==================================================================Login Into Application with User===================================================================================
    //==================================================================BankAccount Creation=====================================================================================================
    console.log("AssureClaims_BankAccount_AddEdit_Utility Function is Called To Create BankAccount".yellow);
    StrBankAccountName = await Function_Utility.AssureClaims_BankAccount_AddEdit_Utility('Create', BankLastName, Address1, Address2, data.Country, data.State,
      City, ZipCode, (await AccountNo).toString(), AccountName, data.AccountType, NextCheck)
  })

    /*
    1)Login into Claims
    2)General Claim Creation,Reserve Creation
    */
  test('AssureClaims_GCReserveCreation_Test_04', async t => {
    console.log("GeneralClaim Creation_Test_04 Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //==================================================================Login Into Application with User ===================================================================================== 
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //===================================================================Claim Creation Started Here=============================================================================================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //====================================================================Claim Creation  completed==============================================================================================  
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "1000", data.ReserveStatus)
    //=====================================================================Reserve created=============================================================================================== 
  });

    /*
    1)Login into Claims
    2)Search Claim,Create Payment, set status as Released, set void reason as Cancelled Payment
    3)Check void checkbox
    4)Copy transaction and save
    */

  test('AssureClaims_CopyTransactionExistForReleasedVoidPayments_Test_05', async t => {
    console.log("Verification For CopyTransaction Exist IN Released Void Payments On GeneralClaim Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //==================================================================Login Into Application with User================================================================================ 

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here===========================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, data.TransactionType, "10");
    //===========================================================Payment Creation Is Completed Here============================================================================================================================================================================================================================================================
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox")
    StrControlNumberReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberReleasedPayment);
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_VoidReasonCode, data.VoidReasonCode, "Void Reason On Payment Creation Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Chk_voidCheck, 'Check', "Void CheckBox");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    //=============================================================RMA-98187 : team 1 general enhancement code changes start here ===========================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Transaction screen")
    await t.wait(2000)
    await Verify_Utility.AssureClaims_ElementExist_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, " Copy Transaction Exist");
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const StrControlNumber = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t.wait(3000)
    await t
      .expect(StrControlNumber).notContains(StrControlNumberReleasedPayment);
    await t.wait(3000)
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName + " is Present in BanckAccount Field ".green);
    await t.wait(3000)
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType + " is Present in payeeType Field ".green);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    //=============================================================RMA-98187 : team 1 general enhancement code changes ends here ===========================================================================

  })

    /*
    1)Login into Claims
    2)Search Claim,Create collection, set void reason as Cancelled Payment
    3)Check void checkbox
    4)Copy transactiod ans save
    */  

  test('AssureClaims_CopyTransactionExistForReleasedVoidCollection_Test_06', async t => {
    console.log("Verification For Copy Transaction  Exist In Released Void Collection Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //============================================================Login Into Application with User=======================================================================================

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Collection Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, "NA", data.TransactionType, "30")
    //===========================================================Collection Creation Is Completed Here======================================================================================================================================================================================================================================================================================================== 
    var StrControlNumberForReleasedCollection = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberForReleasedCollection);
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_VoidReasonCode, data.VoidReasonCode, "Void Reason On Payment Creation Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Chk_voidCheck, 'Check', "Void CheckBox");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    //==========================RMA-98187 : team 1 general enhancement code changes start here,for void payment copy transaction option visible  ===========================================================================
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Transaction screen")
    await t.wait(2000)
    await Verify_Utility.AssureClaims_ElementExist_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, " Copy Transaction Exist");
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Button On Transaction screen")
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.innerText).eql('');
    const StrControlNumber = Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber.textContent;
    await t.wait(3000)
    await t
      .expect(StrControlNumber).notContains(StrControlNumberReleasedPayment);
    await t.wait(3000)
    await t.expect(Payment_POM.AssureClaims_Payment_Lst_BankAccount.find('option').withText(StrBankAccountName).innerText).eql(StrBankAccountName);
    console.log(StrBankAccountName + " is Present in BanckAccount Field ".green);
    await t.wait(3000)
    await t.expect(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeType).innerText).eql(data.PayeeType);
    console.log(data.PayeeType + " is Present in payeeType Field ".green);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    //====================================RMA-98187 : team 1 general enhancement code changes ends here,for void payment copy transaction option visible ===========================================================================

  })

    /*
    1)Login into Configuration Manager
    2)UnCheck setting :- Check Void Reason
    */
  test('AssueClaims_TurnOffSettingFromConfigManager_Test_07', async t => {
    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application Configuration Manager`)
    //=============================================================Login Into Application with User ended=========================================================================

    //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Void")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CheckVoidReason, "UnCheck", "Void code reason")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
    //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================
  })

    /*
    1)Login into Configuration Manager
    2)Check setting :-Use Entity Payment Approval,Payee does Not Exist in system
    */
  test('AssureClaims_TurnOnSettingsFromConfigManager_Test_08', async t => {
    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application Configuration Manager`)
    //=============================================================Login Into Application with User ended=========================================================================

    //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")

    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "Check", "Use Entity Payment Approval")
    await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Void")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CheckVoidReason, "Check", "Payee does Not Exist in System")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
    //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================

  });

    /*
    1)Login into Maintenance
    2)Create Entity
    */
  test('AssureClaims_UnApprovedEntityCreation_Test_09', async t => {
    console.log("Entity Creation From Maintenance UseEntityPaymentApproval Test_09 Started".rainbow);
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(10000)
    console.log("Login Into Application->Maintenance!!".green)
    //==============================================================Entity Maintenance Start Here=================================================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
    LastName_For_Hold_Transaction = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
    var StrEntityPaymentApprovalStatus = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Entity_POM.AssureClaims_Txt_Entity_Payment_Approval_Status, "value");
    console.log(" Fetched Amount is : ".green + StrEntityPaymentApprovalStatus);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_Txt_Entity_Payment_Approval_Status, StrEntityPaymentApprovalStatus, "Verify Entity Payment Approval Status In Maintenance Entity Screen");
    console.log("New Entity is Created with Last Name: ".green + LastName_For_Hold_Transaction);
  });

    /*
    1)Login into Claims
    2)Search Created Claim,Create Payment,Verify payment is on hold due to unapproved entity
    */
  test('Validate_CopyTransaction_ForPaymentCreationDoesNotExistForHoldTransaction_Test_10', async t => {
    console.log("Validate CopyTransaction For PaymentCreation DoesNot Exist For Hold Transaction Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //=============================================Login Into Application with User =========================================================================================================

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here==============================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName_For_Hold_Transaction, data.TransactionType, "10");
    //===========================================================Payment Creation Is Completed Here===============================================================================================================================================================================================================================================================================
    var HoldTransaction_UXErrorMessage = "A hold requiring supervisory approval has been placed on this payment because " + LastName_For_Hold_Transaction + " Payee Not Approved and requires managerial approval."
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(HoldTransaction_UXErrorMessage, 'True', "Verify Entity Payment Approval Status In Maintenance Entity Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.HoldTransactionStatus, "CheckStatus TextBox");
    StrControlNumberReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "Control Number value");
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberReleasedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Collection screen")
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Not Exist");
  })

    /*
    1)Login into Configuration Manager
    2)UnCheck setting :-Use Entity Payment Approval
    Check:-Payee does Not Exist in system
    */
  test('AssureClaims_TurnOffSettingsFromConfigManager_Test_11', async t => {

    //==============================================================Login Into Application with User started==================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log(`Login Into Application Configuration Manager`)
    //=============================================================Login Into Application with User ended=========================================================================

    //====================================================Setting over Payment Parameter SetUp in Configuration manager started================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval, "UnCheck", "Use Entity Payment Approval")
    await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Void")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_CheckVoidReason, "UnCheck", "Payee does Not Exist in System")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_SaveBtn, "Save")
    //====================================================Settings over Payment Parameter SetUp in Configuration manager ended================================================



  });

    /*
    1)Login into Security
    2)UnCheck setting :- Copy transaction
    */
  test('AssureClaims_RevertSMSPermissionsForCopyTransaction_Test_12', async t => {
    
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
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
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_Copy_Transaction, "UnCheck", " CopyTransaction of Transaction on  FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Save, "save button")
  })


    /*
    1)Login into Claim
    2)Search Claim, Create Payment
    3)Verify Copy transaction btn is not there
    */
  test('AssureClaims_CopyTransactionNotExistForReleasePayments_Test_13', async t => {
    console.log("PaymentCreation For CopyTransaction For Released Payments On GeneralClaim Started".rainbow);
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here==============================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(StrBankAccountName, data.PayeeType, LastName, data.TransactionType, "10");
    //===========================================================Payment Creation Is Completed Here===============================================================================================================================================================================================================================================================================
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //=============================================================================Check Status Released Verified======================================================================
    StrControlNumberReleasedPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    console.log("New ControlNumber is Created with ID: ".green + StrControlNumberReleasedPayment);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_More, "More Button On Collection screen")
    await Verify_Utility.AssureClaims_ElementNotExist_Utility(Payment_POM.AssureClaims_Payment_Btn_Copy_Transaction, "Copy Transaction Not Exist");
  })


});

