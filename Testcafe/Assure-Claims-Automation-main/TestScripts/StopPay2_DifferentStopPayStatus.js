import { Selector, Role } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";

import POM_Home from "../Functional_POM/POM_Home";
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_FinancialReserves from "../Functional_POM/POM_FinancialReserves";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();

const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const DataAutoReg = require("../DataFiles/DataAutoRegDSN_1.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-93528
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194Automation, DSN3 : RM202REG_Test3
// *******************************************************************************************************************************

DataAutoReg.forEach((data) => {
  const LoggedInUser = Role(
    data.URL,
    async (t) => {
      await t.maximizeWindow();
      console.log(
        "AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application"
          .yellow
      );
      await Function_Utility.AssureClaims_LoginIntoApplication_Utility(
        data.Username,
        data.Password,
        data.DSN,
        "Claims"
      );
      await t.wait(5000);
      console.log("Login Into Application!!".green);
    },
    { preserveUrl: true }
  );

  fixture`StopPay2_DifferentStopPayStatus`.beforeEach(async (t) => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  // 1. Requested
  let StrClaimNumber;
  test("AssureClaims_GCClaimCreation_StopPayRequestedStatus_Test_01", async (t) => {
    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
      "MM/DD/yyyy"
    );
    //=====================================Corporate GC  Creation started here===================================================================================================================================
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(
      d,
      d,
      data.ClaimStatus,
      data.GCClaimType,
      data.Department,
      data.GCPolicyLOB
    );
    console.log(
      "New Cooperate General Claim is Created with Claim Number: ".green +
        StrClaimNumber
    );
    //=====================================Corporate GC  Creation completed here===================================================================================================================================

    //=====================================Reserve Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_Reserve_Utility(
      data.ReserveType,
      data.AmountType,
      data.ReserveStatus
    );
    //=====================================Reserve Creation completed here===================================================================================================================================
    await t.wait(2000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "back after reserve creation"
    );
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(10000);
    //=====================================Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Payment Creation completed here===================================================================================================================================

    //=====================================Verify ---> Check Stop Pay Status --> whether the status is released or not===================================================================================================================================

    const actualValue =
      await Verify_Utility.AssureClaims_AttributeFetch_Utility(
        Payment_POM.AssureClaims_PaymentCollection_CheckStatus
      );
    const expectedValue = "R Released";
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
    //=====================================Verify ---> Check Stop Pay Status --> end of verification===================================================================================================================================

    //=====================================Printing Check started here===================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_Lookup,
      "look up button"
    );
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon,
      "First tick after print single check button is clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange,
      "Second tick [Print check range window]after print single check button is clicked"
    );
    //=====================================Printing Check completed here===================================================================================================================================

    //===================================== Setting Stop pay Status : Released and Stop Check Reason Code===================================================================================================================================

    await t.wait(15000);

    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(7000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele1 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Requested
    ).with({ visibilityCheck: true });
    await t.expect(ele1.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele1,
      "Stop Pay Status"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCode_OpenLookup,
      "Stop Check Reason Code Lookup"
    );
    const ele2 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCode.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele2.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele2,
      "Stop Check Reason Code"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting Stop Check Reason Code"
    );
    //===================================== Setting Stop pay Status and Stop Check Reason Code completed===================================================================================================================================

    //===================================== Verify ---> Check Balance and Paid amount [ O/P :Balance Deducted]---> Started===================================================================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back for verification in reserves"
    );
    await t.wait(3000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(3000);
    await In_Utility.AssureClaims_SetValue_Utility(
      Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve,
      data.ReserveType,
      "Enter Reserve Type"
    );
    let paid = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.Amount
    );
    let balance = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.AmountType - data.Amount
    );
    console.log(paid);
    console.log(balance);
    const ColHeader = ["Reserve Type", "Balance", "Paid"];
    const ColValue = [data.ReserveType, balance, paid];
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(
      data.ReserveType,
      "Stop Pay",
      ColHeader,
      ColValue
    );
    //===================================== Verify ---> Check Balance and Paid amount ---> Completed===================================================================================================================================
  });

  //2.Accepted
  let StrClaimNumber1;

  test("AssureClaims_GCClaimCreation_StopPayAcceptedStatus_Test_02", async (t) => {
    await t.wait(5000);
    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
      "MM/DD/yyyy"
    );
    //=====================================Corporate GC  Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_GeneralClaimCreation(
      d,
      d,
      data.ClaimStatus,
      data.GCClaimType,
      data.Department,
      data.GCPolicyLOB
    );
    console.log(
      "New Cooperate General Claim is Created with Claim Number: ".green +
        StrClaimNumber1
    );
    //=====================================Corporate GC  Creation completed here===================================================================================================================================
    //=====================================Reserve Creation started here===================================================================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(
      data.ReserveType,
      data.AmountType,
      data.ReserveStatus
    );
    //=====================================Reserve Creation completed here===================================================================================================================================

    
    await t.wait(2000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back after reserve creation"
    );
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(10000);
    //=====================================Payment Creation started here===================================================================================================================================
    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Payment Creation completed here===================================================================================================================================

    //=====================================Verify ---> Check Stop Pay Status --> whether the status is released or not===================================================================================================================================
    const actualValue =
      await Verify_Utility.AssureClaims_AttributeFetch_Utility(
        Payment_POM.AssureClaims_PaymentCollection_CheckStatus
      );
    const expectedValue = "R Released";
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
    //=====================================Verify ---> Check Stop Pay Status --> end of verification===================================================================================================================================
    //=====================================Printing Check started here===================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_Lookup,
      "look up button"
    );
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon,
      "First tick after print single check button is clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange,
      "Second tick [Print check range window]after print single check button is clicked"
    );
    //=====================================Printing Check completed here===================================================================================================================================
    //===================================== Setting Stop pay Status: Requested and Stop Check Reason Code===================================================================================================================================

    await t.wait(15000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(7000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele1 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Requested
    ).with({ visibilityCheck: true });
    await t.expect(ele1.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele1,
      "Stop Pay Status"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCode_OpenLookup,
      "Stop Check Reason Code Lookup"
    );
    const ele2 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCode.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele2.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele2,
      "Stop Check Reason Code"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting Stop Check Reason Code"
    );
    //===================================== Setting Stop pay Status : Requested and Stop Check Reason Code completed===================================================================================================================================

    //===================================== Setting Stop pay Status : Accepted ================================================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele3 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Accepted
    ).with({ visibilityCheck: true });
    await t.expect(ele3.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele3,
      "Stop Pay Status"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting accepted"
    );
    //===================================== End of Setting Stop pay Status : Accepted ================================================================================================================================================================

    //===================================== Verify ---> Check Balance and Paid amount [ O/P :Balance not Deducted] ---> Started===================================================================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back for verification in reserves"
    );

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await In_Utility.AssureClaims_SetValue_Utility(
      Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve,
      data.ReserveType,
      "Enter Reserve Type"
    );
    let paid = await Generic_Utility.AssureClaims_FormatANumber_Utility("0");
    let balance = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.AmountType
    );
    console.log(paid);
    console.log(balance);
    const ColHeader = ["Reserve Type", "Balance", "Paid"];
    const ColValue = [data.ReserveType, balance, paid];
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(
      data.ReserveType,
      "Stop Pay",
      ColHeader,
      ColValue
    );
    //===================================== Verify ---> Check Balance and Paid amount ---> Completed===================================================================================================================================
  });

  //3. Rejected

  let StrClaimNumber2;
  test("AssureClaims_GCClaimCreation_StopPayRejectedStatus_Test_03", async (t) => {
    await t.wait(5000);
    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
      "MM/DD/yyyy"
    );
    //=====================================Corporate GC  Creation started here===================================================================================================================================

    StrClaimNumber2 = await Function_Utility.AssureClaims_GeneralClaimCreation(
      d,
      d,
      data.ClaimStatus,
      data.GCClaimType,
      data.Department,
      data.GCPolicyLOB
    );
    console.log(
      "New Cooperate General Claim is Created with Claim Number: ".green +
        StrClaimNumber2
    );
    //=====================================Corporate GC  Creation completed here===================================================================================================================================
    //=====================================Reserve Creation started here===================================================================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(
      data.ReserveType,
      data.AmountType,
      data.ReserveStatus
    );
    //=====================================Reserve Creation completed here===================================================================================================================================
    await t.wait(2000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back after reserve creation"
    );
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(10000);
    //=====================================Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Payment Creation completed here===================================================================================================================================
    //=====================================Verify ---> Check Stop Pay Status --> whether the status is released or not===================================================================================================================================
    const actualValue =
      await Verify_Utility.AssureClaims_AttributeFetch_Utility(
        Payment_POM.AssureClaims_PaymentCollection_CheckStatus
      );
    const expectedValue = "R Released";
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
    //=====================================Verify ---> Check Stop Pay Status --> end of verification===================================================================================================================================

    //=====================================Printing Check started here===================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_Lookup,
      "look up button"
    );
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon,
      "First tick after print single check button is clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange,
      "Second tick [Print check range window]after print single check button is clicked"
    );
    await t.wait(15000);
    //=====================================Printing Check completed here===================================================================================================================================

    //===================================== Setting Stop pay Status : Requested and Stop Check Reason Code===================================================================================================================================

    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(7000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele1 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Requested
    ).with({ visibilityCheck: true });
    await t.expect(ele1.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele1,
      "Stop Pay Status"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCode_OpenLookup,
      "Stop Check Reason Code Lookup"
    );
    const ele2 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCode.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele2.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele2,
      "Stop Check Reason Code"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting Stop Check Reason Code"
    );
    //===================================== Setting Stop pay Status and Stop Check Reason Code completed===================================================================================================================================

    //===================================== Setting Stop pay Status : Rejected ================================================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele3 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Rejected
    ).with({ visibilityCheck: true });
    await t.expect(ele3.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele3,
      "Stop Pay Status"
    );
    //===================================== End of Setting Stop pay Status : Rejected ================================================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting rejected"
    );
    //===================================== Verify ---> Check Balance and Paid amount [ O/P :Balance Deducted] ---> Started===================================================================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back for verification in reserves"
    );
    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await In_Utility.AssureClaims_SetValue_Utility(
      Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve,
      data.ReserveType,
      "Enter Reserve Type"
    );
    let paid = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.Amount
    );
    let balance = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.AmountType - data.Amount
    );
    console.log(paid);
    console.log(balance);
    const ColHeader = ["Reserve Type", "Balance", "Paid"];
    const ColValue = [data.ReserveType, balance, paid];
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(
      data.ReserveType,
      "Stop Pay",
      ColHeader,
      ColValue
    );
    //===================================== Verify ---> Check Balance and Paid amount ---> Completed===================================================================================================================================
  });

  // 4. Undo/Released
  let StrClaimNumber3;

  test("AssureClaims_GCClaimCreation_StopPayUndoReleasedStatus_Test_04", async (t) => {
    await t.wait(5000);
    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
      "MM/DD/yyyy"
    );
    //=====================================Corporate GC  Creation started here===================================================================================================================================

    StrClaimNumber3 = await Function_Utility.AssureClaims_GeneralClaimCreation(
      d,
      d,
      data.ClaimStatus,
      data.GCClaimType,
      data.Department,
      data.GCPolicyLOB
    );
    console.log(
      "New Cooperate General Claim is Created with Claim Number: ".green +
        StrClaimNumber3
    );
    //=====================================Corporate GC  Creation completed here===================================================================================================================================
    //=====================================Reserve Creation started here===================================================================================================================================
    await Function_Utility.AssureClaims_Reserve_Utility(
      data.ReserveType,
      data.AmountType,
      data.ReserveStatus
    );
    //=====================================Reserve Creation completed here===================================================================================================================================
    await t.wait(2000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back after reserve creation"
    );
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(10000);
    //=====================================Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Payment Creation completed here===================================================================================================================================
    //=====================================Verify ---> Check Stop Pay Status --> whether the status is released or not===================================================================================================================================
    const actualValue =
      await Verify_Utility.AssureClaims_AttributeFetch_Utility(
        Payment_POM.AssureClaims_PaymentCollection_CheckStatus
      );
    const expectedValue = "R Released";
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
    //=====================================Verify ---> Check Stop Pay Status --> end of verification===================================================================================================================================
    //=====================================Printing Check started here===================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_Lookup,
      "look up button"
    );
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon,
      "First tick after print single check button is clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange,
      "Second tick [Print check range window]after print single check button is clicked"
    );
    await t.wait(15000);
    //=====================================Printing Check completed here===================================================================================================================================
    //===================================== Setting Stop pay Status and Stop Check Reason Code===================================================================================================================================
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(10000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele1 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Requested
    ).with({ visibilityCheck: true });
    await t.expect(ele1.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele1,
      "Stop Pay Status"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCode_OpenLookup,
      "Stop Check Reason Code Lookup"
    );
    const ele2 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCode.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele2.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele2,
      "Stop Check Reason Code"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting Stop Check Reason Code"
    );
    //===================================== Setting Stop pay Status and Stop Check Reason Code completed===================================================================================================================================

    //===================================== Setting Stop pay Status : Accepted ================================================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele3 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_Accepted
    ).with({ visibilityCheck: true });
    await t.expect(ele3.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele3,
      "Stop Pay Status"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting accepted"
    );
    //===================================== End of Setting Stop pay Status : Accepted ================================================================================================================================================================

    //===================================== Setting Stop pay Status : Undo/Released ================================================================================================================================================================

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup,
      "Stop Pay Status Lookup"
    );
    const ele4 = StopPay_POM.AssureClaims_StopPay_Lnk_StopPayStatus.withText(
      data.StopPay_UndoReleased
    ).with({ visibilityCheck: true });
    await t.expect(ele4.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele4,
      "Stop Pay Status"
    );
    // saving now
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      Home_POM.AssureClaims_Generic_Img_Save,
      "Saving after selecting Undo/Released"
    );
    //===================================== End of Setting Stop pay Status : Undo/Released ================================================================================================================================================================

    //===================================== Verify ---> Check Balance and Paid amount [ O/P :Balance Deducted] ---> Started===================================================================================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "Clicking on back for verification in reserves"
    );
    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await In_Utility.AssureClaims_SetValue_Utility(
      Reserve_Utility.AssureClaims_ReserveCreation_Txt_SearchReserve,
      data.ReserveType,
      "Enter Reserve Type"
    );
    let paid = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.Amount
    );
    let balance = await Generic_Utility.AssureClaims_FormatANumber_Utility(
      data.AmountType - data.Amount
    );
    console.log(paid);
    console.log(balance);
    const ColHeader = ["Reserve Type", "Balance", "Paid"];
    const ColValue = [data.ReserveType, balance, paid];
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(
      data.ReserveType,
      "Stop Pay",
      ColHeader,
      ColValue
    );
    //===================================== Verify ---> Check Balance and Paid amount ---> Started===================================================================================================================================

    //===================================== Logout ===================================================================================================================================

    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
  });
});
//RMA-92828 :-Story 1: Stop Pay from Transaction Screen itself
