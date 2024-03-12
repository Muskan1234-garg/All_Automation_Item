import { Selector, Role, ClientFunction } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";

import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_FinancialReserves from "../Functional_POM/POM_FinancialReserves";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";
import POM_Search from '../Functional_POM/POM_Search'
import POM_ControlRequest from "../Functional_POM/POM_ControlRequest"

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();

const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const Search_POM = new POM_Search();
const ControlRequest_POM = new POM_ControlRequest();

const DataAutoReg = require("../DataFiles/DataAutoRegDSN_3.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-96127
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : Utilities setting- General system parameter
General system parameter>Policy system interface setting is to be enabled
General system parameter >fund settings> Use Reserve Type to Filter Transaction Type is Off
*/
//Preferred Server : 194Automation, DSN1 : RM202REG_Test1
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

  fixture`ControlRequest2_CorporateGC`.beforeEach(async (t) => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  /* Steps performed by AssureClaims_GCClaimCreation_ControlRequest_Test_01 :
    1. GCClaimCreation
    2. Reserve Creation
    3. Payment Creation
    4. Print Check
    5. Control request in Utilities Zone
    6. Verifications mentioned in detail in Jira's Description
    7. End
*/

  let StrClaimNumber;
  test("AssureClaims_GCClaimCreation_ControlRequest_Test_01", async (t) => {

    let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
      "MM/DD/yyyy"
    );
    //=====================================Corporate GC  Creation started here===================================================================================================================================
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log(
      "New Cooperate General Claim is Created with Claim Number: ".green +
      StrClaimNumber
    );
    //=====================================Corporate GC  Creation completed here===================================================================================================================================

    //=====================================Reserve Creation started here===================================================================================================================================

    await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
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

    let StrControlNumber = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
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
    // //=====================================Printing Check completed here===================================================================================================================================
    // //=====================================Switching Zone to Utilities started===================================================================================================================================
    await t.wait(5000);
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Utilities");
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(5000);
    // //=====================================Switching Zone to Utilities completed===================================================================================================================================
    // //=====================================Control Request for the created claim started===================================================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe);
    await t.wait(4000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ControlRequest_POM.AssureClaims_Utility_Lnk_ControlRequest, "Control Request Link");
    await t.switchToMainWindow()
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Utilities_ControlRequestFrame);
    await In_Utility.AssureClaims_SetValue_Utility(ControlRequest_POM.AssureClaims_Utility_Txt_ControlNumber, StrControlNumber, "Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Btn_SearchControlNumber,
      "Search button is clicked"
    );
    const y = await ClientFunction(() => window.location.pathname)()
    await t.switchToWindow(f => f.url.pathname === y)
    await In_Utility.AssureClaims_SetValue_Utility(ControlRequest_POM.AssureClaims_Utility_Txt_CheckControlNumber, StrControlNumber, "Control Number")
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Btn_SubmitQuery,
      "Submit button is clicked"
    );
    const z = await ClientFunction(() => window.location.pathname)()
    await t.switchToWindow(f => f.url.pathname === z)
    console.log(z)
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Lnk_ControlNumber,
      "Control Number Link is clicked"
    );
    await t.wait(5000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Utilities_ControlRequestFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Chk_SourceFinancialKey,
      "Source Financial key"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Chk_DestinationFinancialKey,
      "Destination Financial key"
    );
    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Btn_DestinationTransactionTypeLookup,
      "Transaction Type Lookup"
    );
    const a = await ClientFunction(() => window.location.pathname)()
    await t.switchToWindow(f => f.url.pathname === a)

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Lnk_DestinationTransactionType.withText('Court Reporting Fees'),
      "Court Reporting Fees"
    );
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Utilities_ControlRequestFrame);

    await Nav_Utility.AssureClaims_ElementClick_Utility(
      ControlRequest_POM.AssureClaims_Utility_Btn_SaveControlRequest,
      "Save"
    );
    // //=====================================Control Request for the created claim completed===================================================================================================================================
    // //=====================================Switching to claim Zone Started===================================================================================================================================
    await t.wait(5000);
    await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
    await t.setNativeDialogHandler(() => true);
    await t.eval(() => location.reload(true));
    await t.wait(5000);
    // //=====================================Switching to claim Zone Ended===================================================================================================================================
    // //=====================================Searching of created claim started===================================================================================================================================



    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

    await t.switchToMainWindow()

    await t.wait(8000)

    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

    await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
    //========================================Verification of Old Financial key (transaction voided) Offsetting Funds (new truncation created and printed started )=======================================================================
    await t.wait(5000)
    let newControlNum1 = (+StrControlNumber + 1) + "";
    let newControlNum = "" + newControlNum1;
    for (let i = 0; i < StrControlNumber.length - newControlNum1.length; i++) {
      newControlNum = "0" + newControlNum;
    }
    const ColHeader1 = ["Check #", "Void Reason"]

    const ColValue1 = ["0", "Control Request Processed"]
    //========================================Verification of Old Financial key (transaction voided) Offsetting Funds (new truncation created and printed ended )=======================================================================
    //========================================Verification of New/Destination Financial key (change of transaction type which was requested) started=======================================================================

    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("0", "Transaction History Screen", ColHeader1, ColValue1)

    const ColHeader2 = ["Control #"]

    const ColValue2 = [newControlNum]

    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(newControlNum, "Transaction History Screen", ColHeader2, ColValue2)
    //========================================Verification of New/Destination Financial key (change of transaction type which was requested) completed=======================================================================
  });

});

