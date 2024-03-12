import { Selector, Role } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import Maintenance_Functionality_Utility from "../Functional_Utilities/Maintenance_Functionality_Utility"
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";
import POM_Home from "../Functional_POM/POM_Home";



const Payment_POM = new POM_PaymentsCollections();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Reserve_Utility = new POM_FinancialReserves();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Home_POM = new POM_Home();



const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const DataAutoReg = require("../DataFiles/DataAutoRegDSN_1.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-92830
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

  fixture`StopPay3_MiscllaneousPayment`.beforeEach(async (t) => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  let entity1;
  let entity2;
  let StrControlNumber;
  let StrClaimNumber;

  test("AssureClaims_BackupWitholdingOnSecondEntity_Test_01", async (t) => {
    //===================================== Login into Maintenance zone ===================================================================================================================================

    await t.wait(5000);
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(5000);
    //===================================== Entity Creation started here ===================================================================================================================================
    entity1 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
    await t.switchToMainWindow()
    Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button clicked");
    await t.switchToMainWindow()
    entity2 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
    console.log(`entity 1 : ${entity1}  entity2 : ${entity2}`)
    //===================================== Entity Creation completed here ===================================================================================================================================
    //=====================================  Backup withholding for 2nd entity starting here ===================================================================================================================================

    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_BackupWithholding, "Backup Withholding button");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_Withholding);
    await t.wait(5000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(StopPay_POM.AssureClaims_StopPay_Chk_EnableBackupWithholding, 'Check', "Enable Backup Withholding")
    await t.typeText(StopPay_POM.AssureClaims_StopPay_Txt_BackupWithholdingPercentage, data.BackupWithholdingPercentage)

    await In_Utility.AssureClaims_SetValue_Utility(StopPay_POM.AssureClaims_StopPay_Txt_Recipient, entity1, "Recipient entity entered");
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");

    //=====================================  Backup withholding for 2nd entity starting here ===================================================================================================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
    //=====================================  Switching back to claims zone ===================================================================================================================================
    await t.wait(10000)
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(10000);

    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Closing Diary")

    await t.wait(2000);
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
    //=====================================Payment Creation for entity2 started here===================================================================================================================================

    StrControlNumber = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
      data.BankAccount,
      data.PayeeType,
      entity2,
      data.TransactionType,
      data.Amount
    );
    //=====================================Payment Creation for entity2 completed here===================================================================================================================================
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
    //===================================== Backup Withholding UI message verification started here===================================================================================================================================

    await t.wait(1000);
    var SaveMessageVerification_WithHolding = `Payment amount is going to be reduced due to withholding.`
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(SaveMessageVerification_WithHolding, false, "Payment amount is going to be reduced due to withholding")

    await t.wait(5000);
    //===================================== Backup Withholding UI message verification ended here===================================================================================================================================

    await t.switchToMainWindow();
    Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button clicked");
  });


  test("AssureClaims_StopPayCheckForSecondEntity_Test_02", async (t) => {
    //===================================== Stop Pay for Second entity Started here===================================================================================================================================

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
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName,
      entity2,
      "Search Parent"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName.nextSibling(),
      "search clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
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
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName,
      entity2,
      "Search Second Entity"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName.nextSibling(),
      "search clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
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
    //===================================== Stop Pay for second entity ended here===================================================================================================================================
    //===================================== Stop Pay Verification for second entity started here===================================================================================================================================

    await t.wait(4000)
    await t.switchToMainWindow()


    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
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

    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber, "Control Number 1")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claim_Lnk_ControlNumber.withText(StrControlNumber), "Click link")
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
    //===================================== Stop Pay Verification for second entity ended here===================================================================================================================================

  });

  test("AssureClaims_StopPayCheckForFirstEntity_Test_03", async (t) => {
    //===================================== Stop Pay for First entity Started here===================================================================================================================================

    await t.wait(10000);
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
    await t.wait(2000);
    await In_Utility.AssureClaims_SetValue_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName,
      entity1,
      "Search Entity1"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName.nextSibling(),
      "search clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
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
    await t.wait(2000);
    await In_Utility.AssureClaims_SetValue_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName,
      entity1,
      "Search Parent"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Txt_SearchPayeeName.nextSibling(),
      "search clicked"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_SelectCompleteGrid,
      "Selecting all Transactions"
    );
    await t.wait(4000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_AcceptStopPay,
      "Accept Stop pay"
    );
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      StopPay_POM.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup,
      "StopCheckReasonCodeOpenLookup"
    );
    await t.wait(3000)
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
    //===================================== Stop Pay for first entity Ended here===================================================================================================================================

    await t.wait(4000)
    //===================================== Stop Pay Verification for first entity started here===================================================================================================================================
    await t.switchToMainWindow()
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await t.wait(3000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

    await t.wait(4000);

    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    console.log("Clicked on reserve");
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicked on grid button");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Clicked on Transaction history");
    console.log("Clicked on transaction history");

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_Withholding);
    await t.wait(10000);
    let StrControlNumber2 = +StrControlNumber + 1 + "";
    await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number 2")

    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claim_Lnk_ControlNumber.withText(StrControlNumber2), "Click link")
    await t.wait(4000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await t.wait(4000);
    //===================================== Stop Pay CheckBox Verification started here===================================================================================================================================
    await Verify_Utility.AssureClaims_ElementExist_Utility(StopPay_POM.AssureClaims_Claims_Btn_StopPay, "StopPay Button Exists");
    const ele1 = StopPay_POM.AssureClaims_Claims_Btn_StopPay.with({ visibilityCheck: true })
    await t.expect(ele1.checked).ok();
    console.log("StopPay CheckBox is already Checked".green);

    //===================================== Stop Pay CheckBox Verification ended here===================================================================================================================================
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
    //===================================== Stop Pay Verification for first entity ended here===================================================================================================================================
  })
  
})
