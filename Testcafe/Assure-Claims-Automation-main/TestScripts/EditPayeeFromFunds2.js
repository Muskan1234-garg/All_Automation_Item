import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
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
  fixture`EditPayeeFromFunds2`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
  //==================================================Global Veriables Starts Here===================================================================================================
  var StrClaimNumber;
  var FetchStrSSN;
  var LastName;
  var FetchStrFirstName;
  var FetchStrAddress1;
  var FetchStrCity;
  var FetchStrZipCode;
  var FetchStrAddress1FromTransaction;
  var FetchStrCityFromTransaction;
  var FetchStrZipCodeFromTransaction;
  var FetchStrSSNFromTransaction;
  var FetchStrFirstNameFromTransaction;
  var FetchStrLastNameFromTransaction;
  var FetchStrLastNameFromTransactionPayee;
  var FetchStrSSNForTESTCASE7;
  //==================================================Global Veriables Starts Here===================================================================================================
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
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    //======================================================Login Into Application Ends Here==========================================================================
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
    //===============Turning On settings Of Allow Edit of Entity Tax ID, Allow Edit Of Generate Pay To The Order Of,Allow Edit of Mail To Address,Allow Edit Of Pay To The Order Of Ends Here===================================
    //Sai's Code :RMA-97097 Starts Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Save, "save button")
    //Sai's Code :RMA-97097 Ends Here
  })
  //Goto Maintenance Zone & Create an entity(people) with valid SSN
  test("AssureClaims_Maintenance_EntityPeopleCreation_Test_02", async t => {
    //======================================================Login Into Application Starts Here==========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //======================================================Login Into Application Ends Here==========================================================================
    console.log("AssureClaims MaintenanceAddNewEntity Utility Function is Called To Create People".yellow);
    //===========================================================Createing An Entity(People) With Valid SSN Starts Here========================================================
    LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New Entity is Created with Last Name: ".green + LastName);
    //===========================================================Createing An Entity(People) With Valid SSN Starts Here========================================================
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
  //Creating General Claim
  //Creating Reserve
  test('AssureClaims_GCCreation_Test_03', async t => {
    console.log("AssureClaims GeneralClaim Creation Test 03 Started".rainbow);
    await t.wait(10000)
    //======================================================Login Into Application Starts Here==========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here==========================================================================
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //==========================================================Claim Creation Started Here============================================================================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //===========================================================Claim Creation  completed========================================================================================
    //===========================================================Reserve Creation Started Here======================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "1000", data.ReserveStatus)
    //============================================================Reserve creation Completed Here================================================================================ 
  });

  // Create 1 transaction after providing the mandatory fields.
  // Save the transaction with the payee created above.
  // click to 'Load Entity'.
  // Verify new frame got open in Left MDI tree.
  // Verify payee's Lastname, SSN, Address 1, City, State & Zipcode are same as entity's Lastname, SSN, Address 1, City, State & Zipcode
  // Modify Initials & SSN.Save the entity.

  test('AssureClaims_PaymentCreationForScenario3_Test_04', async t => {
    var SSN = faker.random.number({ min: 100000000, max: 999999999 });
    console.log("AssureClaims PaymentCreation On GeneralClaim Started".rainbow);
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
    // Payment is Created
    //===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================
    //========================================Verification Of Payee's Lastname, SSN, Address 1, City, State & Zipcode are same as entity's Lastname, SSN, Address 1, City, State & Zipcode on Load Entity Screen Starts Here=====================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_LoadEntity, "Load entity is clicked Payment Creation Screen")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFROMPaymentFrame);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Name, LastName, "Last Name In PeopleCreation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Tab_Addresses, "Addresses Tab On People Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_EditAddress, "Edit New Address Button On People Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Addr1, FetchStrAddress1, "Address1 In People Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_City, FetchStrCity, "City In People Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode, FetchStrZipCode, "ZipCode In People Creation Screen");
    //========================================Verification Of Payee's Lastname, SSN, Address 1, City, State & Zipcode are same as entity's Lastname, SSN, Address 1, City, State & Zipcode on Load Entity Screen Ends Here=====================================================================================
    //========================================================================Modification Of Initials & SSN & Save the entity Starts Here===============================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_Close, "Click Cancle  In People Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_Entity_Tab_Entity, "People Tab On Entity Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_Entity_Txt_Abbreviation, "SK", "Abbreviation on people maintenance Screen")
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_SSN, SSN.toString(), "SSN Number on people maintenance Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    FetchStrSSNForTESTCASE7 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_SSN, "value");
    console.log(FetchStrSSNForTESTCASE7.yellow + "Is Feteched From Address1 From People In Transaction Screen");
    //========================================================================Modification Of Initials & SSN & Save the entity Ends Here===============================================================================================================================
  })
  // Goto Mainteance zone & search for the recently modified entity again.
  // Verify Initials & SSN are same as modified
  test('AssureClaims_Maintenance_SearchEntityPeople_Test_05', async t => {
    console.log("AssureClaims Maintenance Search Entity People Test 05 Started".rainbow);
    //======================================================Login Into Application Starts Here==========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here===========================================================================
    //Sai's Code :RMA-97097 Starts Here
    //======================================================Muskan's Code :RMA-97695 Entity search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', LastName, "NA");
    //======================================================Muskan's Code :RMA-97695 Entity search started completed here=========================================================================================================
    //Sai's Code :RMA-97097 Ends Here
    //========================================================Verification Of Modified Initials & SSN Are Same Starts Here======================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_SSN, FetchStrSSNForTESTCASE7, "SSN Number Entered On People  Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_Entity_Txt_Abbreviation, "SK", "Abbreviation Entered on People  Creation Screen");
    //========================================================Verification Of Modified Initials & SSN Are Same Ends Here======================================================================================
  })
  // Click to add new payment
  // Provide mandatory fields to transaction page & select 'Payee Type' as 'O Other Payee'
  // Mention Lastname click to add button below the control
  // Verify new popup opens for the selection of Peopl/Entity.
  // Veiry click to People opens new people mantenance form.
  // Provivde Firstname & Address fields.
  // Verify click to save button closed the people mantenance form.
  // Verify, Firsname, Lasname & Address fields are populated with the fields mentione while create people mainatenance.
  // Save the transaction.
  // Goto Maintenance zone & search for the entity created while transaction.
  // Verify Entity is available with same details i.e. Firstname, Lastname & address
  test('AssureClaims_PaymentCreation_For_Scenario4_Test_06', async t => {

    var EntityName = faker.name.lastName();
    var FirstName = faker.name.firstName();
    var Address1 = faker.address.streetName();
    var Address2 = faker.address.streetAddress();
    var Address3 = faker.address.cityPrefix();
    var SSN = faker.random.number({ min: 100000000, max: 999999999 });
    var City = faker.address.city();
    var Zip = faker.random.number({ min: 10000, max: 99999 });
    console.log("AssureClaims PaymentCreation On GeneralClaim Started".rainbow);
    //======================================================Login Into Application Starts Here==========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Starts Here==========================================================================

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search  completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
    await t.wait(2000)
    //===============================Providing Mandatory Fields To Transaction Page & Select 'Payee Type' as 'O Other Payee' Starts Here==========================================================
    //Sai's Code :RMA-97097 Starts Here
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
    //Sai's Code :RMA-97097 Ends Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText('O-Other Payees (People & Entities)'), "Payee Payor Type Value On Payment Creation Screen")
    await t.wait(3000)
    //===============================Providing Mandatory Fields To Transaction Page & Select 'Payee Type' as 'O Other Payee' Ends Here==========================================================
    //=======================================Mentioning Lastname In Lastname TextBox & click On add button below the control Starts Here============================================
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, 'paye', "Last Name Text Box On Payment Creation Screen")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Add_LastName, "Add New Button Of Last Name On Payment Creation Screen")
    //=======================================Mentioning Lastname In Lastname TextBox & click On add button below the control Ends Here============================================
    //==============================Clicking On People opens new people mantenance Screen Starts Here========================================================================= 
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_EntitySelection, "Entity Selection is clicked On Payment Creation Screen")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccidentClaimIframe)
    //==============================Clicking On People opens new people mantenance Screen Ends Here========================================================================= 
    //====================================================Provivding EntityLastName, Firstname & Address Fields Starts Here=================================================================================
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, EntityName, "Last Name Textbox On People Creation Screen");
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, "Broker", "Type Of People Drop Down On Entity Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_FirstName, FirstName, "First Name Textbox On People Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_SSN, SSN.toString(), "First Name Textbox On People Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Tab_Addresses, "Addresses Tab On People Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_AddNewAddress, "Add New Address Button On People Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_AddrType, "HADDR", "Address type Textbox on People Creation Screen ");
    await t.pressKey('tab');
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Addr1, Address1, "Address 1 Textbox On People Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Addr2, Address2, "Address 2 Textbox On People Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Addr3, Address3, "Address 3 Textbox On People Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_City, City, "City Textbox On People Creation Screen");
    await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode, Zip.toString(), "Zip Code Textbox On People Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Button On Address PopUp");
    //====================================================Provivding EntityLastName, Firstname & Address Fields Ends Here=================================================================================
    //========================================================Fetching Address1,City,ZipCode,SSN,FirstName,LastName From People Maintenance Screen Starts Here===============================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_EditAddress, "Edit New Address Button On People Creation Screen");
    FetchStrAddress1FromTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_Addr1, "value");
    console.log(FetchStrAddress1FromTransaction.yellow + "Is Feteched From Address1 From People In Transaction Screen");
    FetchStrCityFromTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_City, "value");
    console.log(FetchStrCityFromTransaction.yellow + "Is Feteched From city From People In Transaction Screen");
    FetchStrZipCodeFromTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode, "value");
    console.log(FetchStrZipCodeFromTransaction.yellow + "Is Feteched From Zip Code From People In Transaction Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_Close, "Close Button On Address Tab Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Tab_Entity, "Addresses Tab On People Creation Screen");
    FetchStrSSNFromTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_SSN, "value");
    console.log(FetchStrSSNFromTransaction.yellow + "Is Feteched From SSN Number From People In Transaction Screen");
    FetchStrFirstNameFromTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_FirstName, "value");
    console.log(FetchStrFirstNameFromTransaction.yellow + "Is Feteched From Last Name From People In Transaction Screen");
    FetchStrLastNameFromTransaction = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_Name, "value");
    console.log(FetchStrLastNameFromTransaction.yellow + "Is Feteched From Last Name From People In Transaction Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
    //========================================================Fetching Address1,City,ZipCode,SSN,FirstName,LastName From People Maintenance Screen Ends Here===============================================================================
    //===========================================Transaction Creation & Verifing, Firsname, Lasname & Address fields are populated with the fields mentione while create people mainatenance Starts Here====================================================================
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText('EXF Expert Witness Fees'), "Transaction Type Value On Funds Split Detail Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, "10", "Transaction Amount On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_FirstNameInTransactionScreen, FetchStrFirstNameFromTransaction, " Fetch FirstName From Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_Address1InTransactionScreen, FetchStrAddress1FromTransaction, " Fetch Address1 From Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_CityInTransactionScreen, FetchStrCityFromTransaction, " Fetch City From Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ZipCodeInTransactionScreen, FetchStrZipCodeFromTransaction, " Fetch ZipCode From Transaction Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, FetchStrLastNameFromTransaction, " Fetch LastName From Transaction Screen");
    FetchStrLastNameFromTransactionPayee = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, "value");
    console.log(FetchStrLastNameFromTransactionPayee.yellow + "Is Fetched From Last Name From Transaction Screen ")
    //===========================================Transaction Creation & Verifing, Firsname, Lasname & Address fields are populated with the fields mentione while create people mainatenance Ends Here====================================================================
    //=====================Goto Maintenance Zone & Search For The Entity Created While Transaction Creation & Verifing Entity is available with same details i.e. Firstname, Lastname & address Starts Here================================================================
    //==============================================================Zone Switched to Maintenance Starts Here=========================================================================================
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(10000);
    //==============================================================Zone Switched to Maintenance Ends Here=========================================================================================
    //Sai's Code :RMA-97097 Starts Here
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', FetchStrLastNameFromTransactionPayee, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //Sai's Code :RMA-97097 Starts Here
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_FirstName, FetchStrFirstNameFromTransaction, "First Name In People Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Name, FetchStrLastNameFromTransactionPayee, "Last Name In People Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Tab_Addresses, "Addresses Tab On People Creation Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_EditAddress, "Edit New Address Button On People Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Addr1, FetchStrAddress1FromTransaction, "Address1 In People Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_City, FetchStrCityFromTransaction, "City In People Creation Screen");
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode, FetchStrZipCodeFromTransaction, "Zip Code In People Creation Screen");
    //=====================Goto Maintenance Zone & Search For The Entity Created While Transaction Creation & Verifing Entity is available with same details i.e. Firstname, Lastname & address Starts Here================================================================
  })
  //Sai's Code :RMA-97097 Starts Here
  //Delete Created entity(people) with valid SSN
  test('AssureClaims_DeleteEntityOnMaintenanceScreen_Test_07', async t => {
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
    //==========================================================People Entity Delete Starts Here====================================================================================================================

  })
  //Sai's Code :RMA-97097 Starts Here
})
