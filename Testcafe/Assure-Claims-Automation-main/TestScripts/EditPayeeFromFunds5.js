import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
//Sai's Code :RMA-97097 Starts Here
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
//Sai's Code :RMA-97097 Ends Here
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_SMS from '../Functional_POM/POM_SMS';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
//Sai's Code :RMA-97097 Starts Here
const Maint_Utility = new Maintenance_Functionality_Utility();
const Verify_Utility = new Verification_Utility();
//Sai's Code :RMA-97097 Ends Here
const Generic_Utility = new GenericUsages_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const SMS_POM = new POM_SMS();
var faker = require('faker');
//***********************************************************************************

//JIRA ID OF STORY :RMA-91580

//Description      :Edit Payee from Funds 3

//AUTHOR           :Sai Krishna Maddula

//DEPENDANCY       :NO

// PRE-REQUISITES  :NO

//Preferred Server :194Automation, DSN2

//***********************************************************************************
DataIUT.forEach(data => {
  fixture`EditPayeeFromFunds5`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
//=====================================================================Global Variable Starts Here=========================================================
  var StrClaimNumber;
  //Sai's Code :RMA-97097 Starts Here
  var LastName;
  //Sai's Code :RMA-97097 Starts Here
  var d;
  //=====================================================================Global Variable Ends Here=========================================================
  // Goto SMS
  // From RHS, expand DataSources -> DSN, Module
  // Select Module Group
  // From RHS Module Access Permissions, goto RISKMASTER -> Funds Management -> Transactions
  // Uncheck 'Allow Edit of Entity Tax ID'
  // Uncheck Allow Edit Of Generate Pay To The Order Of,
  // Uncheck Allow Edit of Mail To Address
  // Uncheck Allow Edit Of Pay To The Order Of
  test('AssureClaims_Security_PermissionsForEditPayeeFromFunds_Test_01', async t => {
    console.log("Security_Permissions_For_Edit_Payee_From_Funds Creation_Test_01 Started".rainbow);
    await t.wait(10000)
    //========================================================Login In To MAintanence Zone Starts Here==================================================
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    await t.wait(5000)
    //========================================================Login In To MAintanence Zone Ends Here==================================================
    console.log("Login Into Application!!".green)
    const elementWithId1 = Selector(id => { return document.getElementById(id); });
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Data Source")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DSN_RMATest_2, "Expand DSN")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_ModuleSecGroups, "Expand Module Security Group")
    //============================================================Sai's Code :RMA-97097 Starts Here==========================================================
    await t.click(elementWithId1('Administrator'));
    //============================================================Sai's Code :RMA-97097 Ends Here============================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster, "Expand RiskMaster")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster_FundsManagement, "Expand FundsManagement")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster_FundsManagement_Transaction, "Expand FundsManagement Transaction")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditofEntityTaxID, 'UnCheck', "Click Allow_Edit_of_Entity_Tax_ID  FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditofMailToAddress, 'UnCheck', "Click Allow_Edit_of_Mail_To_Address FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditOfPayToTheOrderOf, 'UnCheck', "Click Allow_Edit_Of_Pay_To_The_Order_Of FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditOfGeneratePayToTheOrderOf, 'UnCheck', "Click Allow_Edit_Of_Generate_Pay_To_The_Order_Of FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Save, "save button")
  })
  //Sai's Code :RMA-97097 Starts Here
  //Goto Maintenance Zone & Create an Entity(People) With Valid SSN
  test("AssureClaims_Maintenance_People_Test_02", async t => {
    //========================================================Login In To MAintanence Zone Starts Here==================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //========================================================Login In To MAintanence Zone Ends Here==================================================
    //===========================================================Createing an Entity(People) With Valid SSN Starts Here========================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create People".yellow);
    LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New Entity is Created with Last Name: ".green + LastName);
    //===========================================================Createing an Entity(People) With Valid SSN Ends Here========================================================
  })
  //Sai's Code :RMA-97097 Starts Here
  //Creating General Claim
  //Creating Reserve
  test('AssureClaims_GCCreation_Test_03', async t => {
    console.log("AssureClaims GeneralClaim Creation Test 03 Started".rainbow);
    //=========================================================================Login Into Application Starts Here====================================================  
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //==========================================================================Login Into Application Ends Here=============================================================  
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //====================================================================Claim Creation Starts Here====================================================================================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //====================================================================Claim Creation Ends Here====================================================================================
    //====================================================================Reserve Creation Starts Here================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "1000", data.ReserveStatus)
    //====================================================================Reserve Creation Ends Here================================================================================
  });
  // Create 1 transaction after providing the mandatory fields.
  // Save the transaction.
  // Verify, user is unable to 'Tax ID' i.e. Control is disabled.
  // Goto Reserve List again .
  // Goto Auto Checks 
  // Select the payee Which has proper ssn id.
  // After providing other fields Save the Auto Check.
  // Goto Reserve List again
  // Go to Transaction History - >Autocheck & select the Recently Created Auto Check.
  // Verify user is able to modify the tax ID & save the transaction
  test('AssureClaims_PaymentCreationForScenario3_Test_04', async t => {
    console.log("AssureClaims PaymentCreation For Scenario1 On GeneralClaim Started".rainbow);
    await t.wait(10000)
    //==============================================================Login Into Application Starts Here======================================================================================================  
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //==============================================================Login Into Application Ends Here======================================================================================================  
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    //Sai's Code :RMA-97097 Starts Here
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, LastName, data.TransactionType, "10");
    //Sai's Code :RMA-97097 Starts Here
    // Payment is Created
    //===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================
    //============================================================Verification Of Read OnlyMode of TaxID Starts Here===================================================================
    const VerifyTaxID = Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId
    await t.expect(VerifyTaxID.hasAttribute('disabled')).notOk('', { timeout: 20000 })
    console.log("Verification Of Read OnlyMode of TaxID Is Successful".green)
    //============================================================Verification Of Read OnlyMode of TaxID Ends Here===================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    /*===========================================================New Schedule Check Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
    //Sai's Code :RMA-97097 Starts Here
    await Function_Utility.AssureClaims_ScheduleCheck_Creation(data.NumberOfPayments, data.PayInterval, data.BankAccount, data.DistributionType, data.AutoCheckPayeeType, LastName, data.AutoCheckTransactionType, data.AutoCheckAmount)
    //Sai's Code :RMA-97097 Starts Here
    // Schedule Check is Created 
    /*===========================================================New Schedule Check Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await t.wait(5000);
    //===================================================Go to Transaction History - >Autocheck And Select the Recently Created Auto Check Verify user is able to modify the tax ID & save the transaction Starts Here======================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Reserve_History, "Reserve History")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AutoCheck_On_TransactionHistory_Screen, "Auto Check On Reserve History")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lnk_AutoCheckDate.withText(d), "Auto Check Date On Reserve History")
    await t.switchToMainWindow();
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId, "Tax ID Button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Cancle, "Click Cancle on EDIT TaxID Payment Creation Screen")
    //==================================================Go to Transaction History - >Autocheck And Select the Recently Created Auto Check Verify user is able to modify the tax ID & save the transaction Ends Here======================================================================================================
  });
  //Delete Created entity(people) with valid SSN
  //Sai's Code :RMA-97097 Starts Here
  test('AssureClaims_Delete_EntityPeopleOnMaintenanceScreen_Test_05', async t => {
    console.log("AssureClaims Delete Entity On Maintenance Screen Started".rainbow);
    await t.wait(10000)
    //======================================================Login Into Application Starts Here==============================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //=======================================================Login Into Application Ends Here================================================================================= 
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', LastName, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    //==========================================================People Entity Delete Starts Here====================================================================================================================
    await t.wait(5000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Entity Creation Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
    //==========================================================People Entity Delete Ends Here====================================================================================================================
  })
  //Sai's Code :RMA-97097 Starts Here
});
