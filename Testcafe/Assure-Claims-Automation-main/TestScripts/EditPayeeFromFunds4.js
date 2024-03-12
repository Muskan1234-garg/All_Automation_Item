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
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_People from '../Functional_POM/POM_People';
import POM_Home from '../Functional_POM/POM_Home';

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
const People_POM = new POM_People();
const Home_POM = new POM_Home();
//***********************************************************************************

//JIRA ID OF STORY :RMA-91580,RMA-108972

//Description      :1. Create 3 people Entity with vaid SSN
                 // 2. Create GC ,Reserve and transaction with 2  payee
                 // 3. Verify TaxID and LastName and open edit TaxID
                 // 4. Delete created Entity

//AUTHOR           :Sai Krishna Maddula,Yashaswi Mendhekar

//DEPENDANCY       :NO

// PRE-REQUISITES  :NO

//Preferred Server :194Automation, DSN2

//***********************************************************************************
DataIUT.forEach(data => {
  fixture`EditPayeeFromFunds4`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });
  //=========================================================Global Variable Starts Here==============================================================================================
  var strClaimNumber
  var strFetchSSN1
  var strLastName1
  var strFetchSSN2
  var strLastName2
  var strFetchSSN3
  var strLastName3
  var strCleanSSN2
  var strCleanSSN1
  var strCleanSSN3
  var strTaxID1
  var strTaxID2
  var strTaxID3
  var strCleanTaxID1
  var strCleanTaxID2
  var strCleanTaxID3
  //=========================================================Global Variable Ends Here==============================================================================================

  //Goto Maintenance Zone & Create An First Entity(People) With Valid SSN

  test("AssureClaims_MaintenanceEntityPeopleCreation_Test_01", async t => {
    console.log("AssureClaims Maintenance People Creation Test 01 Started".rainbow);
    //======================================================Login Into Application Starts Here===========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //======================================================Login Into Application Ends Here===========================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create People".yellow);
    //===========================================================Createing An First Entity(People) With Valid SSN Starts Here========================================================
    strLastName1 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New People Entity is Created with Last Name: ".green + strLastName1);
    //===========================================================Createing An First Entity(People) With Valid SSN Starts Here========================================================
    //==========================================================Fetching First SSN Starts Here=======================================================================================
    strFetchSSN1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_SSN, "value");
    console.log(strFetchSSN1.yellow);
    strCleanSSN1 = strFetchSSN1.replace(/-/g, '');
    console.log(strCleanSSN1.yellow);

    //==========================================================Fetching First SSN Starts Here=======================================================================================

  })

  //Goto Maintenance Zone & Create A Second Entity(People) With Valid SSN

  test("AssureClaims_Maintenance_EntityPeopleCreation_Test_02", async t => {
    console.log("AssureClaims Maintenance People Creation Test 02 Started".rainbow);
    //======================================================Login Into Application Starts Here=========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //======================================================Login Into Application Starts Here===========================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create People".yellow);
    //===========================================================Createing An Second Entity(People) With Valid SSN Starts Here=======================================================
    strLastName2 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New Entity is Created with Last Name: ".green + strLastName2);
    //===========================================================Createing An Second Entity(People) With Valid SSN Starts Here=======================================================
    //==============================================================Fetching Second SSN Starts Here===================================================================================
    strFetchSSN2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_SSN, "value");
    console.log(strFetchSSN2.yellow);
    strCleanSSN2 = strFetchSSN2.replace(/-/g, '');
    console.log(strCleanSSN2.yellow);
    //==============================================================Fetching Second SSN Starts Here===================================================================================
  })

  //Goto Maintenance Zone & Create An Third Entity(People) With Valid SSN

  test("AssureClaims_Maintenance_EntityPeopleCreation_Test_03", async t => {
    console.log("AssureClaims Maintenance People Creation Test 03 Started".rainbow);
    //======================================================Login Into Application Starts Here==============================================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    await t.wait(5000)
    //======================================================Login Into Application Starts Here==============================================================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create People".yellow);
    //===========================================================Createing An Third Entity(People) With Valid SSN Starts Here=======================================================
    strLastName3 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", "Broker", data.Country, data.State);
    console.log("New Entity is Created with Last Name: ".green + strLastName3);
    //===========================================================Createing An Third Entity(People) With Valid SSN Starts Here=======================================================
    //===========================================================Fetching Third SSN Starts ================================================================================================
    strFetchSSN3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(People_POM.AssureClaims_People_Txt_SSN, "value");
    console.log(strFetchSSN3.yellow);
    strCleanSSN3 = strFetchSSN3.replace(/-/g, '');
    console.log(strCleanSSN3.yellow);
    //===========================================================Fetching Third SSN Starts ================================================================================================
  })

  //Creating General Claim
  //Creating Reserve

  test('AssureClaims_GCCreation_Test_04', async t => {
    console.log("AssureClaims GeneralClaim Creation Test 04 Started".rainbow);
    await t.wait(10000)
    //==============================================================Login Into Application Starts Here======================================================================================================  
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //==============================================================Login Into Application Starts Here======================================================================================================   
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //====================================================================Claim Creation Started Here=========================================================================================================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
    //=====================================================================Claim Creation  completed ========================================================================================================= 
    //=========================================================================Reserve Creation Starts Here==================================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, "1000", data.ReserveStatus)
    //========================================================================Reserve Creation Ends Here===================================================================================================
  });

  // Create 1 transaction after providing the mandatory fields.
  // Select2 payess initially
  // Veirfy recently added paayee's name is disaplyed in 'Last Name' after save.
  // Verify, recently added payee's tax ID is displayed in 'Tax ID' field.
  // Verify click to edit tax ID opens the recent payee's tax detail
  // Save the transaction
  // Add another payee & save the transaction.
  // Veirfy recently added paayee's name is disaplyed in 'Last Name' after save.
  // Verify, recently added payee's tax ID is displayed in 'Tax ID' field.

  test('AssureClaims_PaymentCreationScenario1_Test_05', async t => {
    console.log("AssureClaims PaymentCreation For Scenario 05 Started".rainbow);
    await t.wait(10000)
    //======================================================Login Into Application Starts Here==========================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here===========================================================================
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
    //===========================================================Payment Creation Is Started Here========================================================================================================================================================================================================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strLastName1, data.TransactionType, "10");
    //===========================================================Payment Creation Is Completed Here========================================================================================================================================================================================================================================================================================================
    //=====================================================Verification Of Recently Added First Payee's tax ID is displayed in 'Tax ID' field And Edit Tax ID Opens The Recent Payee's Tax Detail Starts Here=======================================================================
    await t.scrollIntoView(Payment_POM.AssureClaimsApp_Payment_Tab_PayeeInformation)
    await t.scrollIntoView(Payment_POM.AssureClaimsApp_Payment_Tab_MailToInformation)
    strTaxID1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_TaxID, "value");
    strCleanTaxID1 = strTaxID1.replace(/-/g, '');
    console.log(strCleanTaxID1.yellow);
    await t.expect(strCleanSSN1).eql(strCleanTaxID1);
    console.log("Verify Tax ID1 In Transaction Screen is Succesful".yellow);
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, strLastName1, "Verify  strLastName1 In Transaction Screen");
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId, "Tax ID1 Button is Clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Cancle, "Click Cancle on EDIT TaxID Payment Creation Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, strLastName2, "Last Name 2 Text Box On Payment Creation Screen")
    await t.wait(3000);
    await t.pressKey('tab')
    //Sai's Code :RMA-97097 Starts Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
    //Sai's Code :RMA-97097 Starts Here
    //=====================================================Verification Of Recently added Payee's tax ID is displayed in 'Tax ID' field And Edit Tax ID Opens The Recent Payee's Tax Detail & Save Ends Here=======================================================================
    //=====================================================Verification Of Recently Added First Payee's tax ID is displayed in 'Tax ID' field And Edit Tax ID Opens The Recent Payee's Tax Detail Starts Here=======================================================================
    await t.scrollIntoView(Payment_POM.AssureClaimsApp_Payment_Tab_PayeeInformation)

    strTaxID2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_TaxID, "value");
    strCleanTaxID2 = strTaxID2.replace(/-/g, '');
    console.log(strCleanTaxID2.yellow);
    await t.expect(strCleanSSN2).eql(strCleanTaxID2);
    console.log("Verify Tax ID2 In Transaction Screen is Succesful".yellow);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, strLastName2, "Verify  strLastName2 In Transaction Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId, "Tax ID2 Button is Clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Cancle, "Click Cancle on EDIT TaxID Payment Creation Screen")
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, strLastName3, "Last Name 3 Text Box On Payment Creation Screen")
    await t.wait(3000);
    await t.pressKey('tab')
    //Sai's Code :RMA-97097 Starts Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
    //Sai's Code :RMA-97097 Starts Here
    //=====================================================Verification Of Recently Added First Payee's tax ID is displayed in 'Tax ID' field And Edit Tax ID Opens The Recent Payee's Tax Detail Ends Here=======================================================================
    //=====================================================Verification Of Recently Added First Payee's tax ID is displayed in 'Tax ID' field And Edit Tax ID Opens The Recent Payee's Tax Detail Starts Here=======================================================================
    await t.scrollIntoView(Payment_POM.AssureClaimsApp_Payment_Tab_PayeeInformation)

    strTaxID3 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_TaxID, "value");
    strCleanTaxID3 = strTaxID3.replace(/-/g, '');
    console.log(strCleanTaxID3.yellow);
    await t.expect(strCleanSSN3).eql(strCleanTaxID3);
    console.log("Verify Tax ID3 In Transaction Screen is Succesful".yellow);
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_LastName, strLastName3, "Verify  strLastName3 In Transaction Screen");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_TaxId, "Tax ID3 Button is Clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_Cancle, "Click Cancle on EDIT TaxID Payment Creation Screen")
    //Sai's Code :RMA-97097 Starts Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
    //Sai's Code :RMA-97097 Starts Here
    //=====================================================Verification Of Recently Added First Payee's tax ID is displayed in 'Tax ID' field And Edit Tax ID Opens The Recent Payee's Tax Detail Ends Here=======================================================================

  })
  
  //Sai's Code :RMA-97097 Starts Here
  //Delete Created First Entity(People) With Valid SSN
  
  test('AssureClaims_Delete_EntityPeopleOnMaintenanceScreen_Test_06', async t => {
    console.log("AssureClaims Delete Entity On Maintenance Screen Started".rainbow);
    //======================================================Login Into Application Starts Here===========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here===========================================================================
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', strLastName1, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //==========================================================First People Entity Delete Starts Here====================================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await t.wait(5000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Entity Creation Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen")
    //==========================================================First People Entity Delete Ends Here====================================================================================================================
  })
  //Delete Created Second Entity(People) With Valid SSN
  test('AssureClaims_Delete_EntityPeopleOnMaintenanceScreen_Test_07', async t => {
    console.log("AssureClaims Delete Entity On Maintenance Screen Started".rainbow);
    //======================================================Login Into Application Starts Here===========================================================================
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here===========================================================================
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', strLastName2, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //==========================================================Second People Entity Delete Starts Here====================================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await t.wait(5000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Entity Creation Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
    //==========================================================Second People Entity Delete Ends Here====================================================================================================================

  })
  //Delete Created Third Entity(People) With Valid SSN
  test('AssureClaims_Delete_EntityPeopleOnMaintenanceScreen_Test_08', async t => {
    console.log("AssureClaims Delete Entity On Maintenance Screen Started".rainbow);
    await t.wait(10000)
    //======================================================Login Into Application Starts Here============================================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log(`Login Into Application->Claims`)
    //======================================================Login Into Application Ends Here============================================================================  
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone', 'Entity', strLastName3, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //==========================================================Third People Entity Delete Starts Here====================================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await t.wait(5000)
    await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Entity Creation Screen", "", "");
    await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Entity Creation Screen");
    //==========================================================Third People Entity Delete Ends Here====================================================================================================================
  })
  //Sai's Code :RMA-97097 Starts Here
})
