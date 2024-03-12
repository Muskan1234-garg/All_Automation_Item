import { Selector, Role } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const Deductible_POM = new POM_Deductible();

const DataAutoReg = require("../DataFiles/DataAutoRegDSN_2.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-92829, RMA-99202
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan, Yashaswi Mendekar
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194Automation, DSN2 : RM202REG_Test2
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

  fixture`StopPay1_Bulk`.beforeEach(async (t) => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  let StrClaimNumber;
  test("AssureClaims_GCClaimCreation_StopPayBulkStatus_Requested_Accepted_Undo/Released_Test_01", async (t) => {
    await t.wait(3000);
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
    await t.wait(3000);
    //=====================================First Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================First Payment Creation completed here===================================================================================================================================

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
    await t.wait(5000);

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

    await t.wait(5000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(7000);

    await t.wait(2000);
    await t.switchToMainWindow();
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "back after reserve creation"
    );
    await t.wait(10000);

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(3000);
    //=====================================Second Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Second Payment Creation completed here===================================================================================================================================

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
    await t.wait(3000);

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
    await t.wait(5000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(4000);
    await t.switchToMainWindow();

    //===================================== Stop Pay Checks Started from Funds Screen===================================================================================================================================

    await Nav_Utility.AssureClaims_MenuOptionClick_Utility(
      "Funds:Stop Pay Checks"
    );
    await t.wait(10000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );
    await t.wait(7000);
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_RequestStopPay,
      "Request Stop pay"
    );
    //===================================== Verify -> Error message on not selecting any Check Started===================================================================================================================================

    var SaveMessageVerification0 = `Please select at least one check for processing.`;
    console.log(SaveMessageVerification0);
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
      SaveMessageVerification0,
      true,
      "Verification Done"
    );
    await t.wait(2000);

    //===================================== Verify -> Error message on not selecting any Check Completed===================================================================================================================================

    //===================================== Stop Pay Status : Requested Started===================================================================================================================================

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
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_RequestStopPay,
      "Request Stop pay"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "StopCheckReasonCodeOpenLookup"
    );
    const ele1 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCodeOpenLookup.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele1.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele1,
      "Stop Check Reason Code Option"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReasonCodeSave,
      "Save Check Reason Code Option"
    );
    //=====================================RMA-99202 : Verification : Checks Exist in grid or Not Started===================================================================================================================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );
    await t.wait(3000);
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_bankaccountname,
      data.BankAccount,
      "Bank Account selected"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_StopPaySearch,
      "Stop pay Search"
    );
    await t.wait(5000);
    Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available.")
    if (!(await StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1).exists)) {
      console.log('Inside no records availaible block')
      await Verify_Utility.AssureClaims_ElementExist_Utility(
        Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available."),
        "No Records availaible hence no records exist"
      );
    } else {
     console.log('Inside records and grid availaible block')
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
      await Verify_Utility.AssureClaims_ElementNotExist_Utility(
        StopPay_POM.AssureClaims_StopPay_Btn_GridButtonRow,
        "No Transactions Exists"
      ); 
    }

    //=====================================RMA-99202 : Verification : Checks Exist in grid or Not Ended===================================================================================================================================
    //===================================== Stop Pay Status : Requested Completed===================================================================================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_AcceptStopPay,
      "Accept Stop pay"
    );
    await t.wait(4000);
    //===================================== Verify -> Error message on not selecting any Check started===================================================================================================================================
    var SaveMessageVerification0 = `Please select at least one check for processing.`;
    console.log(SaveMessageVerification0);
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
      SaveMessageVerification0,
      true,
      "Verification for no check selected is completed Successfully"
    );
    //===================================== Verify -> Error message on not selecting any Check Completed===================================================================================================================================

    //===================================== Accept Stop Pay Started===================================================================================================================================

    await t.wait(3000);
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
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
    );
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_AcceptStopPay,
      "Accept Stop pay"
    );

    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "StopCheckReasonCodeOpenLookup"
    );
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
      "Stop Check Save Reason Code Option"
    );

    //=====================================RMA-99202 : Verification : Checks Exist in grid or Not Started===================================================================================================================================
    await t.wait(3000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

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
    await t.wait(5000);
    if (!(await StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1).exists)) {
      console.log('Inside no records availaible block')
      await Verify_Utility.AssureClaims_ElementExist_Utility(
        Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available."),
        "No Records availaible hence no records exist"
      );
    } else {
      console.log('Inside records and grid availaible block')
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
      await Verify_Utility.AssureClaims_ElementNotExist_Utility(
        StopPay_POM.AssureClaims_StopPay_Btn_GridButtonRow,
        "No Transactions Exists"
      );
    }

    //=====================================RMA-99202 : Verification : Checks Exist in grid or Not Completed===================================================================================================================================
    //========================================= Accept Stop Pay ends here===================================================================================================================================
    //========================================= Undo/Release Stop Pay starts here===================================================================================================================================

    await t.wait(4000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

    await t.wait(5000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_bankaccountname,
      data.BankAccount,
      "Bank Account selected"
    );
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_stoppaystatus,
      data.StopPay_Accepted,
      "Stop Pay Status selected"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_StopPaySearch,
      "Stop pay Search"
    );
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_UndoReleaseStopPay,
      "Undo Stop pay"
    );
    await t.wait(2000);
    //===================================== Verify -> Error message on not selecting any Check started===================================================================================================================================
    console.log(SaveMessageVerification0);
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
      SaveMessageVerification0,
      true,
      "Verification Done"
    );
    //===================================== Verify -> Error message on not selecting any Check Completed===================================================================================================================================

    await t.wait(5000);
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
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Complete grid selected"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_UndoReleaseStopPay,
      "Undo/Release Stop pay"
    );
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "StopCheckReasonCodeOpenLookup"
    );
    const ele5 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCodeOpenLookup.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele5.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele5,
      "Stop Check Reason Code Option"
    );

    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReasonCodeSave,
      "Stop Check Save Reason Code Option"
    );

    //========================================= Undo/Release Stop Pay ends here===================================================================================================================================

    // =======================================================RMA-99202 : Verification -> Checks Exist in grid or Not Completed=========================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

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
      data.StopPay_Accepted,
      "Stop Pay Status selected"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_StopPaySearch,
      "Stop pay Search"
    );
    await t.wait(5000);
    if (!(await StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1).exists)) {
      console.log('Inside no records availaible block')
      await Verify_Utility.AssureClaims_ElementExist_Utility(
        Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available."),
        "No Records availaible hence no records exist"
      );
    } else {
      console.log('Inside records and grid availaible block')
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
      await Verify_Utility.AssureClaims_ElementNotExist_Utility(
        StopPay_POM.AssureClaims_StopPay_Btn_GridButtonRow,
        "No Transactions Exists"
      );
    }
    // =======================================================RMA-99202 : Verification -> Checks Exist in grid or Not ,Completed=========================================
  });

  test("AssureClaims_GCClaimCreation_StopPayBulkRejectedStatus_Test_02", async (t) => {
    await t.wait(3000);
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
    await t.wait(7000);
    //=====================================Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Payment Creation completed here===================================================================================================================================

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
    await t.wait(7000);

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
    await t.wait(8000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(5000);

    await t.wait(2000);
    await t.switchToMainWindow();
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
      "back after reserve creation"
    );
    await t.wait(7000);

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(5000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
      "grid button"
    );
    await t.wait(7000);
    //=====================================Second Payment Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      data.LastName,
      data.TransactionType,
      data.Amount
    );
    //=====================================Second Payment Creation completed here===================================================================================================================================

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
    await t.wait(5000);

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
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
    );
    await t.wait(7000);
    //=====================================Printing Check ended here===================================================================================================================================
    //==============================================Funds Screen: Stop Pay Checks===============================================================================
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility(
      "Funds:Stop Pay Checks"
    );
    await t.wait(8000);
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );

    await t.wait(9000);
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
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_RequestStopPay,
      "Request Stop pay"
    );
    await t.wait(5000);
    //===================================== Verify -> Error message on not selecting any Check started===================================================================================================================================

    var SaveMessageVerification0 = `Please select at least one check for processing.`;
    console.log(SaveMessageVerification0);
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
      SaveMessageVerification0,
      true,
      "Verification Done"
    );
    //===================================== Verify ends -> Error message on not selecting any Check ended===================================================================================================================================
    await t.wait(5000);

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
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_RequestStopPay,
      "Request Stop pay"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "Stop Check Reason Code Open Lookup"
    );
    const ele1 =
      StopPay_POM.AssureClaims_StopPay_Lnk_StopCheckReasonCodeOpenLookup.withText(
        data.StopPay_StopCheckReasonCode
      ).with({ visibilityCheck: true });
    await t.expect(ele1.exists).ok("", { timeout: 20000 });
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ele1,
      "Stop Check Reason Code Option"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReasonCodeSave,
      "Stop Check Save Reason Code Option"
    );
    // =======================================================RMA-99202 : Verification -> Checks Exist in grid or Not Started=========================================

    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
      );
      await t.wait(3000);
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(
      StopPay_POM.AssureClaims_Claims_Lst_bankaccountname,
      data.BankAccount,
      "Bank Account selected"
      );
      await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_Claims_Btn_StopPaySearch,
      "Stop pay Search"
      );
      await t.wait(5000);
      if(!(await StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1).exists)){
      console.log('Inside no records availaible block')
      await Verify_Utility.AssureClaims_ElementExist_Utility(
        Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available."),
        "No Records availaible hence no records exist"
        );
  }else{
    console.log('Inside records and grid availaible block')
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
      await Verify_Utility.AssureClaims_ElementNotExist_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_GridButtonRow,
      "No Transactions Exists"
      );
    }


    // =======================================================RMA-99202 : Verification -> Checks Exist in grid or Not ended=========================================



    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(
      Verification_Msg.AssureClaims_Generic_StopPayChecks
    );
    await t.wait(3000);
    // ==================================================Stop Pay Status as Rejected Starts Here=============================================================================================
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

    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_RejectStopPay,
      "Reject Stop pay"
    );
    await t.wait(5000);
    //===================================== Verify -> Error message on not selecting any Check started===================================================================================================================================
    var SaveMessageVerification0 = `Please select at least one check for processing.`;
    console.log(SaveMessageVerification0);
    await t.wait(3000);
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(
      SaveMessageVerification0,
      true,
      "Verification Done"
    );
    //===================================== Verify Ends-> Error message on not selecting any Check started===================================================================================================================================
    await t.wait(2000);
    await In_Utility.AssureClaims_SetValue_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1),
      StrClaimNumber,
      "Search claim no."
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(
        1
      ).nextSibling(),
      "search clicked"
    );

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
    );
    await t.wait(3000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_RejectStopPay,
      "Reject Stop pay"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "Stop Check Reason Code Open Lookup"
    );
    await t.wait(2000);
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
      "Stop Check Save Reason Code Option"
    );

    // =======================================================RMA-99202 : Verification -> Checks Exist in grid or Not Started=========================================
    await t.wait(3000);
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_StopPayReload,
      "Reload"
    );

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
    await t.wait(5000);
    if (!(await StopPay_POM.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch.nth(1).exists)) {
      console.log('Inside no records availaible block')
      await Verify_Utility.AssureClaims_ElementExist_Utility(
        Deductible_POM.AssureClaims_Claims_Txt_NoRecordAvailable.withText("No Records Available."),
        "No Records availaible hence no records exist"
      );
    } else {
      console.log('Inside records and grid availaible block')
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
      await Verify_Utility.AssureClaims_ElementNotExist_Utility(
        StopPay_POM.AssureClaims_StopPay_Btn_GridButtonRow,
        "No Transactions Exists"
      );
    }
    // =======================================================RMA-99202 : Verification -> Checks Exist in grid or Not ,Completed=========================================

    //========================================= Logout from the application===================================================================================================================================
    await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
  });

});
