import { Selector, Role, ClientFunction } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import POM_Enhanced_Notes from '../Functional_POM/POM_Enhanced_Notes';
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_FinancialReserves from "../Functional_POM/POM_FinancialReserves";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";
import POM_Home from '../Functional_POM/POM_Home';
import { StrClaimNumber, StrControlNumber2 } from './StopPay5_ForMiscllaneousPayment_RolledUPChecks_ExportedVariables'
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();
const Home_POM = new POM_Home();
const Enhanced_Note = new POM_Enhanced_Notes();
const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();

const DataAutoReg = require("../DataFiles/DataAutoRegDSN_1.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-94178, RMA-99202, RMA-102196
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : Run StopPay5_ForMiscllaneousPayment_RolledUPChecks_part1.js first
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
// *******************************************************************************************************************************

DataAutoReg.forEach((data) => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  const ConfigManagerLogin = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    await t.wait(5000)
    console.log("Login Into Configuration Manager Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`StopPay5_ForMiscllaneousPayment_RolledUPChecks_part2`.beforeEach(async (t) => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  /* Steps performed by AssureClaims_StopPay_RollUpChecks_Test_01 :
    1. Funds->Print Checks-->Print check Batch
    2. Search That Claim using Claim Status
    3. Stop Pay for First Payment Performed
*/
  test("AssureClaims_StopPay_RollUpChecks_Test_01", async (t) => {

    //========================================Funds->Print Checks-->Print check Batch,print the check started here==============================================================================================================
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Print Checks")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_printCheckIframe);
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Tab_PrintCheckBatch, "Print Check Batch")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheckBatch_Lst_BankAccount, data.BankAccount, "Select Bank Account")
    await t.wait(10000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheckBatch_Btn_PrintButton, "Print button")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ChecksAndEOBReports_Btn_OkButton, "Ok button on Checks And EOB Reports screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PrintedCheckRange_Btn_OkButton, "Ok button on Printed check range screen");
    //========================================Funds->Print Checks-->Print check Batch,print the check completed here==============================================================================================================

    // //========================================Claim Search started here==============================================================================================================
    await t.wait(5000)
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Closing Print Screen")
    await t.wait(2000)
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //========================================Claim Search completed here==============================================================================================================
    //===================================== Stop Pay for First Payment Started here===================================================================================================================================

    await t.wait(5000);
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility(
      "Funds:Stop Pay Checks"
    );
    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );
    await t.wait(5000);
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_bankaccountname,
      data.BankAccount,
      "Bank Account selected"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_StopPaySearch,
      "Stop pay Search"
    );
    await t.wait(4000);
    await In_Utility.AssureClaims_SetValue_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1),
      StrClaimNumber,
      "Search claim no."
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(
        1
      ).nextSibling(),
      "search clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Enhanced_Note.AssureClaims_Enhanced_Notes_Btn_SelectGrid,
      "Selecting first Transaction"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_RequestStopPay,
      "Request Stop pay"
    );
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "StopCheckReasonCodeOpenLookup"
    );
    await t.wait(3000)
    const ele2 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCodeOpenLookup.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele2.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele2,
      "Stop Check Reason Code Option"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReasonCodeSave,
      "Save"
    );
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );
    await t.wait(7000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );
    await t.wait(3000);

    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_bankaccountname,
      data.BankAccount,
      "Bank Account selected"
    );
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_stoppaystatus,
      data.StopPay_Requested,
      "Stop Pay Status selected"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_StopPaySearch,
      "Stop pay Search"
    );
    await t.wait(4000);
    await In_Utility.AssureClaims_SetValue_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1),
      StrClaimNumber,
      "Search claim no."
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(
        1
      ).nextSibling(),
      "search clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Enhanced_Note.AssureClaims_Enhanced_Notes_Btn_SelectGrid,
      "Selecting first Transaction"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_AcceptStopPay,
      "Accept Stop pay"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "StopCheckReasonCodeOpenLookup"
    );
    await t.wait(2000)
    const ele3 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCodeOpenLookup.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele3.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele3,
      "Stop Check Reason Code Option"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReasonCodeSave,
      "Save"
    );
    //===================================== Stop Pay for first Transaction ended here===================================================================================================================================

  });

  /* Steps performed by AssureClaims_StopPay_RollUpChecks_Test_02 :
    1. Stop Pay Verification for second Transaction performed
*/

  test("AssureClaims_StopPay_RollUpChecks_Test_02", async (t) => {

    //===================================== Stop Pay Verification for second Transaction started here===================================================================================================================================

    await t.wait(4000)

    //======================================================Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Claim search started completed here=========================================================================================================

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

    await t.wait(5000);

    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    console.log("Clicked on reserve");
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicked on grid button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Clicked on Transaction history");
    console.log("Clicked on transaction history");

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_Withholding);
    await t.wait(10000);

    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number 2")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claim_Lnk_ControlNumber.withText(StrControlNumber2), "Click link")
    await t.wait(5000);

    //===================================== Stop Pay Checkbox Verification started here===================================================================================================================================

    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await t.wait(2000);
    await Verify_Utility.AssureClaims_ElementExist_Utility(StopPay_POM.AssureClaims_Claims_Btn_StopPay, "StopPay Button Exists");
    const ele1 = StopPay_POM.AssureClaims_Claims_Btn_StopPay.with({ visibilityCheck: true })
    await t.expect(ele1.checked).ok();
    console.log("StopPay CheckBox is already Checked".green);

    //===================================== Stop Pay Checkbox Verification ended here===================================================================================================================================
    //===================================== Stop Pay Value Accepted Verification started here===================================================================================================================================
    await t.wait(2000)
    const actualValue = await Verify_Utility.AssureClaims_AttributeFetch_Utility(StopPay_POM.AssureClaims_StopPay_Txt_StopPayStatusCode);

    const expectedValue = "A Accepted";
    if (expectedValue === actualValue) {
      console.log(
        expectedValue.green +
        "is matched with".yellow +
        " " +
        actualValue.green +
        "Hence verification successful".green
      );
    } else {
      console.log(
        expectedValue.red +
        "is matched with".red +
        " " +
        actualValue.red +
        "Hence verification is not successful".red
      );
    }
    //===================================== Stop Pay Value Accepted Verification ended here===================================================================================================================================
    //===================================== Stop Pay Verification for second Transaction ended here===================================================================================================================================

  });

  /* Steps performed by RevertSettings_Test_03 :
      1. Revert Settings made in Configuration Manager
  */
  test('AssureClaims_StopPay_RevertConfigManagerSetting_Test_03', async t => {
    //=============================================================Login Into Configuration manager with User started=========================================================================
    await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
    await t.wait(10000)
    //=============================================================Login Into Configuration manager with User ended=========================================================================

    //====================================================Payment Parameter SetUp in Configuration manager started================================================

    await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Check", "Roll Up")
    await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_rollUpChecks, "UnCheck", "Use Entity Payment Approval")
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
    //====================================================Payment Parameter SetUp in Configuration manager ended================================================

    await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
    console.log("Logout from Application!!")

  });


});





