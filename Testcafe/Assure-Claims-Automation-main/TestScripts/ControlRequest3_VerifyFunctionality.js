import { Selector, Role, ClientFunction } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';

import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_FinancialReserves from "../Functional_POM/POM_FinancialReserves";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";
import POM_ControlRequest from "../Functional_POM/POM_ControlRequest"
import POM_Deductible from '../Functional_POM/POM_Deductible';
import POM_Home from '../Functional_POM/POM_Home';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Reserve_Utility = new POM_FinancialReserves();
const Deductible_POM = new POM_Deductible();
const GenSysPar_POM = new POM_GeneralSystemParameter();
const Home_POM = new POM_Home();

const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const ControlRequest_POM = new POM_ControlRequest();

const DataAutoReg = require("../DataFiles/DataAutoRegDSN_3.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-96128
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
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

    fixture`ControlRequest3_VerifyFunctionality`.beforeEach(async (t) => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    /* Steps performed by AssureClaims_GCClaimCreation_ControlRequest_Test_01 :
      1. Utility Settings
      2. GCClaimCreation
      3. Reserve Creation
      4. Payment Creation
      5. Print Check
      6. Control request in Utilities Zone
      7. Verifications mentioned in detail in Jira's Description
      8. End
  */



    let StrClaimNumber;
    test("AssureClaims_GCClaimCreation_ControlRequest_Test_01", async (t) => {

        // =================================== Switching to Utilities zone started==================================================================
        await t.wait(5000);
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Utilities");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(5000);
        // =================================== Switching to Utilities zone Completed==================================================================
        // =================================== Navigating to General System Parameters Page started===================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe);
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaimsApp_Lnk_GenSysParaSetup.withText('General System Parameter Setup'), "Click on Genreal System Parameter Link")
        await t.wait(8000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GeneralSystemParameterSetupIframe);
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Utility_Tab_PolicyInterfaceSetting, "Policy Interface Setting");
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Deductible_POM.AssureClaims_Utility_Chk_PolicySystemInterface, "UnCheck", "Policy System Interface");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Click on Utilities Save Button")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaimsApp_GenSysParaSetup_Tab_FundsSettings, "Click on FundsSettings Button")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Deductible_POM.AssureClaims_Utility_Chk_UseReserveTypeToFilterTransactionType, "Check", "Use Reserve Type To Filter Transaction Type");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Click on Utilities Save Button")
        // =================================== Navigating to General System Parameters Page completed===================================================
        // =================================== Switching to Claims zone started==================================================================
        await t.wait(5000);
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(5000);
        // =================================== Switching to Claims zone Completed==================================================================

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
        // //=====================================Utility Settings for Control Request for the created claim started===================================================================================================================================
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
        // //=====================================Utility Settings for Control Request for the created claim completed===================================================================================================================================
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

    /* Steps performed by AssureClaims_CarrierGCClaimCreation_ControlRequest_Test_02 :
      1. Utility Settings
      2. CarrierGCClaimCreation
      3. Reserve Creation
      4. Payment Creation
      5. Print Check
      6. Control request in Utilities Zone
      7. Verifications mentioned in detail in Jira's Description
      8. End
  */
    test("AssureClaims_CarrierGCClaimCreation_ControlRequest_Test_02", async (t) => {
        // =================================== Switching to Utilities zone started==================================================================
        await t.wait(5000);
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Utilities");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(5000);
        // =================================== Switching to Utilities zone Completed==================================================================
        // =================================== Navigating to General System Parameters Page started===================================================
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe);
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(GenSysPar_POM.AssureClaimsApp_Lnk_GenSysParaSetup.withText('General System Parameter Setup'), "Click on Genreal System Parameter Link")
        await t.wait(8000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GeneralSystemParameterSetupIframe);
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Deductible_POM.AssureClaims_Utility_Tab_PolicyInterfaceSetting, "Policy Interface Setting");
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Deductible_POM.AssureClaims_Utility_Chk_PolicySystemInterface, "Check", "Policy System Interface");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Click on Utilities Save Button")
        // =================================== Navigating to General System Parameters Page completed===================================================
        await t.wait(5000);
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(5000);
        // =================================== Switching to Claims zone Completed==================================================================
        // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_UtilitiesIframe);
        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
            "MM/DD/yyyy"
        );
        //=====================================Corporate GC  Creation started here===================================================================================================================================
        StrClaimNumber = await Function_Utility.AssureClaims_CarrierGCClaimCreation(d, d, data.GCCarrierClaimType_ProfessionalLiability, data.ClaimStatus, data.Department, data.GCPolicyLOB, data.PolicySystem, data.PolicyName_test10)
        console.log(
            "New Cooperate General Claim is Created with Claim Number: ".green +
            StrClaimNumber
        );
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //=====================================Reserve Creation started here===================================================================================================================================

        await Function_Utility.AssureClaims_UpdatedCarrierReserveAddition_Utility(1, 1, 1, data.ReserveType, data.AmountType, data.ReserveStatus)
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
        // //=====================================Utility Settings for Control Request for the created claim started===================================================================================================================================
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
        // //=====================================Utility Settings for Control Request for the created claim completed===================================================================================================================================
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
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Transaction_Btn_TransactionHistory, "Transaction history")
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

