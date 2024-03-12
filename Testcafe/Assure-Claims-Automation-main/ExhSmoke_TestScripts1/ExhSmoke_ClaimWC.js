import { Role } from 'testcafe';
import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_StopPay from "../Functional_POM/POM_StopPay";
const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
const Function_Utility = new Functionality_Utility_Sec_Exh();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Payment_POM = new POM_PaymentsCollections();
const StopPay_POM = new POM_StopPay();
const Verification_Msg = new POM_VerificationMessage();
//Global Variable Declaration
var StrWCClaimNumber;
//***********************************************************************************
//JIRA ID OF STORY : RMA-97883
//Description      : ExhSmoke_ClaimWC
//AUTHOR           : Saikrishan,Maddula
//DEPENDANCY       : No
// PRE-REQUISITES  : No
//Preferred Server : IUTSQL
//***********************************************************************************

DataIUT.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.wait(3000)
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  var d;

  fixture`ExhSmoke_ClaimWC.js`.beforeEach(async t => {
    await t.wait(3000)
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });
  //====================================================================Worker Compensation Claim Creation Started Here=============================================================
  test('AssureClaims_WorkerCompensationClaim_Test_01', async t => {
    await t.wait(3000)
    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    console.log("AssureClaims_WorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
    StrWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.WCClaimType, data.EmpolyeeNo, data.WCJurisdiction)
    console.log("New Worker Compensation Claim is Created with Claim Number: ".green + StrWCClaimNumber);
  });
  //===========================================================Worker Compensation Claim Creation Completed Heree=======================================================================================================================================================================================================
  //===========================================================Reserve Creation On Worker Compensation Claim Started Here======================================================================================================================================================================================
  test('AssureClaims_Reserve_Creation_Test_02', async t => {
    //==============================================Search the created WC claim Starts Here========================================================================
    await t.wait(3000)
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrWCClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    //==============================================Search the created WC claim Ends Here========================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame)
    //===========================================================Reserve Creation On Worker Compensation Claim Started Here=====================================================================================================================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
    //===========================================================Reserve Creation On Worker Compensation Claim Completed Here===================================================================================================================================================================================
  });
  //===========================================================Reserve Creation On Worker Compensation Claim Completed Here======================================================================================================================================================================================
  //===========================================================Payment Creation & print Check Creation From Transaction On Worker Compensation Claim Starts Here======================================================================================================================================================================================
  test('AssureClaims_AddPayment_Creation_Test_03', async t => {
    //==============================================Search the created WC claim Starts Here========================================================================
    await t.wait(3000)
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrWCClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //==============================================Search the created WC claim Ends Here========================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame)
    /*===========================================================Payment Creation On Worker Compensation Claim Started Here========================================================================================================================================================================================================================================================================================================*/
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.TransactionAmount)
    /*===========================================================Payment Creation On Worker Compensation Claim Completed Here========================================================================================================================================================================================================================================================================================================*/
    // ===========================================Print check Starts here ==============================================================
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Lnk_PrintCheck.withText("Print Check"),
      "Print Check Option From The List"
    );
    await t.wait(10000);

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_PrintSingleCheck,
      "Print check button in print single check window"
    );
    await t.wait(10000);

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon,
      "First tick after print single check button is clicked"
    );
    await t.wait(10000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange,
      "Second tick [Print check range window]after print single check button is clicked"
    );
    await t.wait(10000);
    //=====================================Printing Check completed here==================================================================

  });
  //===========================================================================Payment Creation & print Check Creation From Transaction On Worker Compensation Claim Starts Here===============================================================================================
  //===========================================================Collection Creation On Worker Compensation Claim Started Here======================================================================================================================================================================================================================
  test('AssureClaims_AddCollection_Test_04', async t => {
    //==============================================Search the created WC claim Starts Here======================================================================
    await t.wait(3000)
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrWCClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //==============================================Search the created WC claim Ends Here======================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame)
    /*===========================================================Collection Creation On Worker Compensation Claim Started Here========================================================================================================================================================================================================================================================================================================*/

    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, "NA", data.TransactionType, data.TransactionAmount)
    // Collection is Created
    /*===========================================================Collection Creation On Worker Compensation Claim Completed Here========================================================================================================================================================================================================================================================================================================*/
  });
  //=======================================================Collection Creation On Worker Compensation Claim Completed Here========================================================================================
  //=======================================================New Schedule Check Creation On Worker Compensation Claim Started Here===================================================================================
  test('AssureClaims_Schdule_Check_Test_05', async t => {
    //==============================================Search the created WC claim Starts Here======================================================================
    await t.wait(3000)
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrWCClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    //==============================================Search the created WC claim Ends Here======================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame)
    /*===========================================================New Schedule Check Creation On Worker Compensation Claim Started Here========================================================================================================================================================================================================================================================================================================*/
    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
    await Function_Utility.AssureClaims_ScheduleCheck_Creation(data.NumberOfPayments, data.PayInterval, data.BankAccount, data.DistributionType, data.AutoCheckPayeeType, data.LastName, data.AutoCheckTransactionType, data.TransactionAmount)
    // Schedule Check is Created 
    /*===========================================================New Schedule Check Creation On Worker Compensation Claim Completed Here========================================================================================================================================================================================================================================================================================================*/
  });
  //=========================================================New Schedule Check Creation On Worker Compensation Claim Completed Here================================================================================================================================================================================================================================================
  //=========================================================Logout On Worker Compensation Claim Starts Here================================================================================================================================================================================================================================================
  test('AssureClaims_LogOut_Test_06', async t => {

    await t.wait(3000)
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
    console.log("Logout from Application!!")

  });
  //=========================================================Logout On Worker Compensation Claim Completed Here================================================================================================================================================================================================================================================


});
