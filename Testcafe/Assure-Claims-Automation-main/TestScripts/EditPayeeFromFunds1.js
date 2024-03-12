import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Home from '../Functional_POM/POM_Home';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_People from '../Functional_POM/POM_People';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Maint_Utility = new Maintenance_Functionality_Utility();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const People_POM = new POM_People();
const SMS_POM = new POM_SMS();
var faker = require('faker');
//***********************************************************************************

//JIRA ID OF STORY :RMA-90827

//Description      :Edit Payee from Funds 1

//AUTHOR           :Sai Krishna Maddula

//DEPENDANCY       :NO

// PRE-REQUISITES  :NO

//Preferred Server :194Automation, DSN2

//***********************************************************************************
DataIUT.forEach(data => {
  fixture`EditPayeeFromFunds1`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
  //======================================================Global Variable Starts Here=========================================================================================
  var StrClaimNumber;
  var FetchStrSSN;
  var LastName;
  var FetchStrFirstName;
  var FetchStrAddress1;
  var FetchStrCity;
  var FetchStrZipCode;
  var FetchStrPayToTheOrderOf;
  //Sai's Code :RMA-97097 Starts Here
  var strEntity2LastName;
  //Sai's Code :RMA-97097 Ends Here
  //======================================================Global Variable Ends Here=========================================================================================
  // Verify from SMS -> Funds Management -> transaction -> following settins are ON
  // Allow Edit of Entity Tax ID,
  // Allow Edit Of Generate Pay To The Order Of,
  // Allow Edit of Mail To Address
  // Allow Edit Of Pay To The Order Of
  test('AssureClaims_Security_PermissionsForEditPayeeFromFunds_Test_01', async t => {
    await t.wait(10000)
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    //======================================================Login Into Application Starts Here==========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
    //======================================================Login Into Application Ends Here==========================================================================
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    const elementWithId1 = Selector(id => { return document.getElementById(id); });
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Data Source")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DSN_RMATest_2, "Expand DSN")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_ModuleSecGroups, "Expand Module Security Group")
    //Sai's Code :RMA-97097 Starts Here
    await t.click(elementWithId1('Administrator'));
    //Sai's Code :RMA-97097 Ends Here
    //===============Turning On settings Of Allow Edit of Entity Tax ID, Allow Edit Of Generate Pay To The Order Of,Allow Edit of Mail To Address,Allow Edit Of Pay To The Order Of Starts Here===================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster, "Expand RiskMaster")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster_FundsManagement, "Expand FundsManagement")
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_RiskMaster_FundsManagement_Transaction, "Expand FundsManagement Transaction")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditofEntityTaxID, 'Check', "Click Allow_Edit_of_Entity_Tax_ID  FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditofMailToAddress, 'Check', "Click Allow_Edit_of_Mail_To_Address FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditOfPayToTheOrderOf, 'Check', "Click Allow_Edit_Of_Pay_To_The_Order_Of FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_AllowEditOfGeneratePayToTheOrderOf, 'Check', "Click Allow_Edit_Of_Generate_Pay_To_The_Order_Of FundsManagement RiskMaster branch on Module Access Permissions On SMS Screen")
    //Sai's Code :RMA-97097 Starts Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Save, "save button")
    //Sai's Code :RMA-97097 Starts Here
    //===============Turning On settings Of Allow Edit of Entity Tax ID, Allow Edit Of Generate Pay To The Order Of,Allow Edit of Mail To Address,Allow Edit Of Pay To The Order Of Ends Here===================================
  })
  //Goto Maintenance Zone & Create an entity(people) with valid SSN
  test("AssureClaims_Maintenance_EntityPeopleCreation_Test_02", async t => {
    //======================================================Login Into Application Starts Here==========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //======================================================Login Into Application Ends Here==========================================================================
    console.log("AssureClaims_MaintenanceAddNewEntityUtility Function is Called To Create People".yellow);
    //===========================================================Createing An Entity(People) With Valid SSN Starts Here========================================================
    LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New Entity is Created with Last Name: ".green + LastName);
    //===========================================================Createing An Entity(People) With Valid SSN Ends Here========================================================
    //=============================================================Fetching SNN,FirstName,Address1,City,ZipCode Starts Here===============================================================
    FetchStrSSN = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_SSN, "value");
    console.log(FetchStrSSN.yellow);
    FetchStrFirstName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_FirstName, "value");
    console.log(FetchStrFirstName.yellow);
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_EditAddress, "Edit New Address Button On Employee Creation Screen");
    FetchStrAddress1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_Addr1, "value");
    console.log(FetchStrAddress1.yellow);
    FetchStrCity = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_City, "value");
    console.log(FetchStrCity.yellow);
    FetchStrZipCode = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode, "value");
    console.log(FetchStrZipCode.yellow);
    //=============================================================Fetching SNN,FirstName,Address1,City,ZipCode Ends Here===============================================================
  })
  //Sai's Code :RMA-97097 Starts Here
  //Goto Maintenance Zone & Create an entity(people) with valid SSN
  test("AssureClaims_Maintenance_EntityPeopleCreation_Test_03", async t => {
    //======================================================Login Into Application Starts Here==========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //======================================================Login Into Application Ends Here==========================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create People".yellow);
    //===========================================================Createing An Entity(People) With Valid SSN Starts Here========================================================
    strEntity2LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New Entity is Created with Last Name: ".green + strEntity2LastName);
    //===========================================================Createing An Entity(People) With Valid SSN Starts Here========================================================
  })
  //Sai's Code :RMA-97097 Ends Here
  //Creating General Claim
  //Creating Reserve
  test('AssureClaims_GCCreation_Test_04', async t => {
    console.log("GeneralClaim Creation_Test_04 Started".rainbow);
    //======================================================Login Into Application Starts Here==========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here==========================================================================
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //=================================================================Claim Creation Started Here===================================================================================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //=====================================================================Claim Creation  completed====================================================================================  
    //==============================================================Reserve Creation Starts Here======================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "1000", data.ReserveStatus)
    //=========================================================Reserve creation Ends Here=====================================================================================================
  });
  // Create a payment of $10 with 2 payees
  // Verify user is able to modify the tax ID & save the transaction
  // Verify user is able to click Generate Pay To The Order Of
  // Verify user is able to modify Mail To Address
  // Verify user is able to Edit Of Pay To The Order Of
  test('AssureClaims_PaymentCreationForScenario1_Test_05', async t => {
    console.log("PaymentCreation On GeneralClaim Started".rainbow);
    //======================================================Login Into Application Starts Here==========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here========================================================================== 

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, LastName, data.TransactionType, "10");

    //===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================
    //===========================================================Adding Second Payeee Starts Here=============================================================================================================================================================
    await t.wait(3000);
    //Sai's Code :RMA-97097 Starts Here
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, strEntity2LastName, "Last Name Text Box On Payment Creation Screen")
    //Sai's Code :RMA-97097 Ends Here
    //===========================================================Adding Second Payeee Ends Here=============================================================================================================================================================
    await t.wait(3000);
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    await t.wait(3000);
    //==============================================Verification Of User Is Able To Modify The Tax ID & Able To Click Generate Pay To The Order Of & Able To Modify Mail To Address & Able To Edit Of Pay To The Order Of Starts Here===============================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId, "Tax ID Button is Clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Cancle, "Click Cancle on EDIT TaxID Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_PayToTheOrderOfLookUP, "Clicked on Pay_To_The_Order_Of_LookUP on EDIT TaxID Payment Creation Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePhraseLocationFirst, 'Before', "Payee_Phrase_Location_First On Payment Creation Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePhraseLocationSecond, 'Before', "Payee_Phrase_Location_Second On Payment Creation Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_payeePhraseFirst, 'and', "payee_Phrase_First On Payment Creation Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_payeePhraseSecond, 'and', "payee_Phrase_Second On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Preview, "Clicked on Pay_To_The_Order_Of_LookUP on EDIT TaxID Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    FetchStrPayToTheOrderOf = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_PayToTheOrderOf, "Fetching value of Pay To The Order Of In Transaction Screen");
    console.log(FetchStrPayToTheOrderOf.yellow);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_PayToTheOrderOf, FetchStrPayToTheOrderOf, "Pay To The Order Of In Transaction Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_PayToTheOrderOfEdit, "Clicked on Pay_To_The_Order_Of_Edit on EDIT TaxID Payment Creation Screen")
    await t
      .click(Payment_POM.AssureClaims_PaymentCollection_Txt_PayToTheOrderOfContent)
      .typeText(Payment_POM.AssureClaims_PaymentCollection_Txt_PayToTheOrderOfContent, "Modified").setTestSpeed(0.7);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_OkForPayToTheOrderOf, "Click Ok Payment Creation Screen")
    await t.wait(3000);
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_MailToLastName, 'krishm', "Last Name Text Box On Payment Creation Screen")
    await t.wait(3000);
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    await t.wait(3000);
    //==============================================Verification Of User Is Able To Modify The Tax ID & Able To Click Generate Pay To The Order Of & Able To Modify Mail To Address & Able To Edit Of Pay To The Order Of Starts Here===============================================================================================
  });

  // Select payeet type as 'O Other Payees' & mention tax ID of the entity created above.
  // Verify data is loaded of the selected entity over the transaction screen.
  // Save the transaction by providing mandatory fields.
  // Click to 'Edit tax ID' to modify the tax ID of selected payee.
  // Modify the tax ID & click to Save.
  // Verify message - Are you sure you want to update tax id for Anil Singh
  test('AssureClaims_PaymentCreationForScenario2_Test_06', async t => {
    console.log("PaymentCreation On GeneralClaim Started".rainbow);
    //======================================================Login Into Application Starts Here==========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Starts Here==========================================================================

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    /*==============================Select payeet type as 'O Other Payees' & mention tax ID of the entity created above.
      Verify data is loaded of the selected entity over the transaction screen.
     Save the transaction by providing mandatory fields Starts Here
     Click to 'Edit tax ID' to modify the tax ID of selected payee.
     Modify the tax ID & click to Save.
     Verify message - Are you sure you want to update tax id 
     Starts Here==================================================================================*/
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    //Sai's Code :RMA-97097 Starts Here
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
    //Sai's Code :RMA-97097 Ends Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText('O-Other Payees (People & Entities)'), "Payee Payor Type Value On Payment Creation Screen")
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_TaxID, FetchStrSSN, "Transaction Amount On Funds Split Detail Screen")
    await t.pressKey('tab')
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, LastName, "Payee NameCreation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
    //Sai's Code :RMA-97097 Starts Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.TransactionType), "Transaction Type Value On Funds Split Detail Screen")
    //Sai's Code :RMA-97097 Ends Here
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "10", "Transaction Amount On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId, "Tax ID Button is Clicked")
    await t
      .click(Payment_POM.AssureClaims_PaymentCollection_Btn_Edit_TaxId)
      .pressKey('ctrl+b backspace')
      .typeText(Payment_POM.AssureClaims_PaymentCollection_Btn_Edit_TaxId, "5").setTestSpeed(0.7);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button EDIT TaxID On Payment Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Ok, "Click Ok Payment Creation Screen")
    /*===========================================Select payeet type as 'O Other Payees' & mention tax ID of the entity created above.
        Verify data is loaded of the selected entity over the transaction screen.
        Save the transaction by providing mandatory fields Starts Here
        Click to 'Edit tax ID' to modify the tax ID of selected payee.
        Modify the tax ID & click to Save.
        Verify message - Are you sure you want to update tax id Ends Here ==================================================================================*/
  })
  //Sai's Code :RMA-97097 Starts Here
  //Delete Created entity(people) with valid SSN
  test('AssureClaims_DeleteEntityOnMaintenanceScreen_Test_07', async t => {
    console.log("AssureClaims Delete Entity On Maintenance Screen Started".rainbow);
    //======================================================Login Into Application Starts Here===========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Starts Here===========================================================================
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', LastName, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await t.wait(5000)
    //==========================================================People Entity Delete Starts Here====================================================================================================================
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Entity Creation Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
    //==========================================================People Entity Delete Ends Here====================================================================================================================
  })

  //Delete Created entity(people) with valid SSN
  test('AssureClaims_DeleteEntityOnMaintenanceScreen_Test_08', async t => {
    console.log("Delete Entity On Maintenance Screen Started".rainbow);
    //======================================================Login Into Application Starts Here===========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here===========================================================================
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', strEntity2LastName, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await t.wait(5000)
    //==========================================================People Entity Delete Starts Here====================================================================================================================
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Entity Creation Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
    //==========================================================People Entity Delete Starts Here====================================================================================================================
  })
  //Sai's Code :RMA-97097 Starts Here
})
