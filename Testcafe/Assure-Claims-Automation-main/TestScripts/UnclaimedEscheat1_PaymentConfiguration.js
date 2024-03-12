import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import { ClientFunction } from 'testcafe';

import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_ClearCheack from '../Functional_POM/POM_ClearCheack';
import POM_StopPay from '../Functional_POM/POM_StopPay';
import POM_FundsDormancy from '../Functional_POM/POM_FundsDormancy';
import POM_Claimant from '../Functional_POM/POM_Claimant';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';

const Verify_Utility = new Verification_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const StopPay_POM = new POM_StopPay();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const FundsDormancy_POM = new POM_FundsDormancy();
const Claimant_POM = new POM_Claimant();
const ClearCheack_POM = new POM_ClearCheack();


const DataAutoReg = require('../DataFiles/DataAutoRegDSN_1.json');

//******************************************************************************************************************************//
//JIRA ID OF STORY : 	RMA-102192, RMA-94320,RMA-94578,RMA-94579
//Description : 1.Case #1: Verify the fields on Funds Dormancy Set up screen, 
//Case #2: Verify if payment is under Unclaimed Payment is not done if it is under Fund's Dormancy Set up
//AUTHOR : Yashaswi Mendhekar
//DEPENDANCY : NONE
//PRE-REQUISITE : NONE
//Preferred Server: NONE
//******************************************************************************************************************************//

// Global Variable
var strLastName;
var strClaimNumber;


DataAutoReg.forEach(data => {
  fixture`UnclaimedEscheat1_PaymentConfiguration`.beforeEach(async t => {
    await t.wait(4000)
    await t.navigateTo(data.URL)
    await t.maximizeWindow()
  });

  /*
 1) Login to configuration Manager--> Payment parameter --> Funds dormancy setup. 
 2) Add Jurisdiction unclaimed days and Escheats days. 
 */
  test('AssureClaims_UnclaimedAndEscheat_Test_01', async t => {

    await t.setNativeDialogHandler(() => true);
    // ============================================Logging into application starts here =========================================================
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
    await t.wait(4000)
    //  ============================================================ Logged into application ==============================================================

    // ==============================================Configuration Manager Setting --->Payment Parameter-->Add funds dormancy status============================================================
    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Funds Dormancy Setup", "Funds Dormancy Setup")

    let gridValues =await  Selector('[class="d-inline-block ng-star-inserted"]')
    let bJurisdiction = false;

    let iterations = await gridValues.count;
    for (let i = 0; i < iterations; i++) {
      let strVal = await gridValues.nth(i).innerText;
      console.log(strVal+" ***************************")
      if (strVal === "Alabama") {
        bJurisdiction = true;
      }
    }


    if (!bJurisdiction) {
      await Nav_Utility.AssureClaims_ElementClick_Utility(FundsDormancy_POM.AssureClaims_FundsDormancyUtilities_Btn_AddNew, "Add new button clicked")
      await Nav_Utility.AssureClaims_ElementClick_Utility(FundsDormancy_POM.AssureClaims_FundsDormancyUtilities_Btn_Jurisdiction, "jurisdiction Clicked")
      await Nav_Utility.AssureClaims_ElementClick_Utility(FundsDormancy_POM.AssureClaims_FundsDormancyUtilities_Lnk_SelectJurisdiction.withText(data.FundsDormancyState), "Select Jurisdiction")
      await t.pressKey('tab')
      await t.wait(5000)
      await In_Utility.AssureClaims_SetValue_Utility(FundsDormancy_POM.AssureClaims_FundsDormancyUtilities_Txt_UnclaimedDays, data.UnclaimedDays, "Unclaimed days")
      await t.wait(5000);
      await In_Utility.AssureClaims_SetValue_Utility(FundsDormancy_POM.AssureClaims_FundsDormancyUtilities_Txt_EsCheatsDays, data.Escheatdays, 'Escheatday filled')
      await t.wait(5000);
      await Nav_Utility.AssureClaims_ElementClick_Utility(FundsDormancy_POM.AssureClaims_FundsDormancyUtilities_Btn_Save, "ok button");
      await t.wait(3000)
    }

    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    console.log("Logout from Application!!")
    //===============================================Logout from Application ============================================================  
  });

  /*
  1) Create entity as people.
  2) Create claim 
  3) Add claimant (people entity created above)
  4) Add reserve and transaction and transaction date within unclaimed and print check.
  5) Verify in transaction can't be marked as unclaimed.
  */
  test('AssureClaims_UnclaimedAndEscheat_Test_02', async t => {

    // ============================================Logging into application starts here =========================================================
    await t.wait(5000);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
    console.log("Login Into Application!!".green)
    await t.wait(4000)
    //  ======================================= Logged into application ==============================================================

    //  =======================================Entity Creation(Claimant) Starts here =========================================================
    console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
    strLastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", data.EntityTypePolicyMCO, data.FundsDormancyCountry, data.FundsDormancyState);
    console.log("First Entity is Created with Last Name: ".green + strLastName);

    // =========================================Entity Creation Claimant ends here=======================================================================================================

    // ======================================= Switching to claim zone=========================================================================================
    await t.wait(5000);

    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(5000);

    // ===================================== Switched to Claim Zone ======================================================================

    //==================================Corporate GC  Creation started here ==============================================================
    var d = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, -1, -1, "MM/DD/YYYY")
    strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
    console.log("New Cooperate General Claim is Created with Claim Number: ".green + strClaimNumber);
    //=====================================Corporate GC  Creation completed here =========================================================

    // /================================= Adding Right child Claimant starts here ============================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Claimant_POM.AssureClaims_Claimant_Btn_AddClaimant, "Click Add claimant")
    await In_Utility.AssureClaims_SetValue_Utility(Claimant_POM.AssureClaims_Claimant_Txt_LastName, strLastName, "strLastName entered")
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Claimant creation Screen");
    await t.wait(3000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);

    // /================================= Adding Right child Claimant ends here ============================================================


    //===============================================Reserve Creation starts Here========================================================
    await t.wait(5000)
    console.log("AssureClaims_Reserve Creation Function is Called To Create Reserve".yellow);
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.AmountType, data.ReserveStatus);
    console.log("New Reserve is Created : ".green);
    //=============================================Reserve Creation ends Here =========================================================
    await t.wait(3000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");
    await t.wait(3000)
    //===============================================Payment Creation starts Here ==================================================
    // Transaction date should be the current date
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strLastName, data.TransactionType, data.PaymentAmount);

    //===============================================Payment Creation ends Here ========================================================

    // ===========================================Print check Starts here ==============================================================
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Lnk_PrintCheck.withText("Print Check"), "Print Check Option From The List");
    await t.wait(15000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await t.wait(15000);

    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintSingleCheck, "Print check button in print single check window");
    await t.wait(15000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon, "First tick after print single check button is clicked");
    await t.wait(15000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange, "Second tick [Print check range window]after print single check button is clicked");

    //=====================================Printing Check completed here==================================================================

    await t.wait(1000);
    await t.switchToMainWindow();
    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    await t.wait(7000);
    // ============================================Verification Starts here ================================================================

    console.log('Verification Starts here');

    await t.wait(5000);
    await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('-- Please Select --')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('-- Please Select --');
    console.log("-- Please Select --".yellow + 'is matched with '.green + "-- Please Select --".yellow + 'Hence verification successful'.green);

    //===================================verification ends here ======================================================================

  });

  /*
 1) Create one more transaction and transaction date beyond unclaimed and escheat days.
 2) Print the check. 
 3) Verify transaction can be marked as unclaimed and escheat.
  */
  test('AssureClaims_FundsDormancy_Test_03', async t => {

    var TransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
    // ============================================Logging into application starts here =========================================================
    await t.wait(5000);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    console.log("Login Into Application!!-->Claims".green)
    await t.wait(2000)
    //  ======================================= Logged into application ==============================================================

    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', strClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");
    await t.wait(5000)
    //  ============================================Payment starts here =================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strLastName, data.TransactionType, data.PaymentAmount);
    // Selecting Transaction date as current minus 8
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, TransactionDate, "Transaction Date In Transaction Screen");

    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
    //=====================================Payment Creation ends Here ===================================================================

    //=====================================Printing Check starts here====================================================================
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
    await t.wait(12000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Lnk_PrintCheck.withText("Print Check"), "Print Check Option From The List");
    await t.wait(35000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    await t.wait(15000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintSingleCheck, "Print check button in print single check window");
    await t.wait(15000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon, "First tick after print single check button is clicked");
    await t.wait(15000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange, "Second tick [Print check range window]after print single check button is clicked");
    await t.wait(5000);

    //=====================================Printing Check completed here==================================================================
    await t.switchToMainWindow();
    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
    console.log('Verification Starts here');
    await t.wait(5000);
    // =============================Verification for Funds Dormancys Status as Unclaimed And Escheat Started here=========================
    await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('Unclaimed')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('Unclaimed');
    console.log("Unclaimed".yellow + 'is matched with '.green + "Unclaimed".yellow + 'Hence verification successful'.green);
    console.log("Funds Dormancy Status matched".green)

    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await t.wait(5000);
    await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('Escheat')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('Escheat');
    console.log("Escheat".yellow + 'is matched with '.green + "Escheat".yellow + 'Hence verification successful'.green);
    console.log("Funds Dormancy Status matched".green)

    // =============================Verification for Funds Dormancys Status as Unclaimed And Escheat Started here=========================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")
    //===============================================Logout from Application ============================================================


  });
});

