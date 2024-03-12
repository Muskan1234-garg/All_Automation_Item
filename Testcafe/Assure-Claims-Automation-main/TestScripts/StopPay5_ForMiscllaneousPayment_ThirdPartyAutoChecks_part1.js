import { Selector, Role, ClientFunction } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_ScheduleCheck from '../Functional_POM/POM_ScheduleCheck';



import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_StopPay from "../Functional_POM/POM_StopPay";
import POM_Home from '../Functional_POM/POM_Home';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();

const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const StopPay_POM = new POM_StopPay();
const Generic_Claims = new POM_Generic_Claims();
const ScheduleCheck_POM = new POM_ScheduleCheck();


const DataAutoReg = require("../DataFiles/DataAutoRegDSN_1.json");

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-94178, RMA-99408
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

    fixture`StopPay5_ForMiscllaneousPayment_ThirdPartyAutoChecks_part1`.beforeEach(async (t) => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    /* Steps performed by AssureClaims_StopPay_AutoCheckThirdParty_Test_01 :
      1. GCClaimCreation
      2. GCClaim Ststus Change
      3. Reserve Creation
      4. New Third Party Schedule Check Creation
      5. Print Check
      6. End
  */



    let StrClaimNumber;
    test("AssureClaims_StopPay_AutoCheckThirdParty_Test_01", async (t) => {
        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
            "MM/DD/yyyy"
        );
        // //=====================================Corporate GC  Creation started here===================================================================================================================================
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        //=======================================Changing Claim Status of Created Claim Starts here==============================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText("Finalized").with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Claim Status Option")
        //=======================================Changing Claim Status of Created Claim ends here==============================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        console.log(
            "New Cooperate General Claim is Created with Claim Number: ".green +
            StrClaimNumber
        );
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //=====================================Reserve Creation started here===================================================================================================================================


        await t.wait(5000);
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
        /*===========================================================New Third Party Schedule Check Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
        await Function_Utility.AssureClaims_ScheduleCheck_Creation(data.NumberOfPayments, data.PayInterval, data.BankAccount, data.DistributionType, data.AutoCheckPayeeType, data.LastName, data.AutoCheckTransactionType, data.AutoCheckAmount)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Tab_ThirdPartyPayees, "Go To Third Party Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ThirdParty_Btn_AddNew, "Third Party Add New")
        await In_Utility.AssureClaims_SetValue_Utility(StopPay_POM.AssureClaims_PayeeDetails_Txt_LastName, "Jones", "ThirdPartyLastName")
        await t.wait(3000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(ScheduleCheck_POM.AssureClaims_ThirdParty_Btn_DeductAgainstPayee, "Check", "Deduct Against Payee");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ThirdParty_Tab_Transaction, "Go To Third Party's Transaction Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Btn_TransactionTypeLookup, "TransactionType Lookup")

        const ele_TransType = ScheduleCheck_POM.AssureClaims_ScheduleCheck_Select_Lnk_TransactionType.withText(data.AutoCheckTransactionType).with({ visibilityCheck: true })
        await t.expect(ele_TransType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_TransType, "TransactionType Option")
        await In_Utility.AssureClaims_SetValue_Utility(StopPay_POM.AssureClaims_StopPay_Txt_TransactionAmount, data.PaymentBalance, "ThirdParty Amount")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Third Party Transaction Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ScheduleCheck_POM.AssureClaims_ScheduleCheck_Tab_ScheduleCheck, "GoTo ScheduleCheck Tab")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On ScheduleCheck creation Screen");

    /*===========================================================New Third Party Schedule Check Creation Is Completed Here========================================================================================================================================================================================================================================================================================================*/ 
        await t.wait(2000);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after schedule check creation"
        );
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );
        await t.switchToMainWindow();
                //=====================================Funds:Print Checks Started===================================================================================================================================

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Print Checks")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_printCheckIframe);
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_BankAccount, data.BankAccount, "Select Bank Account")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_SelectCheck, data.Checks, "Select Check")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PrintCheck_Btn_CheckSelection, "button for check selection")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, StrClaimNumber, "Claim Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_SelectAllGrid, "select grid")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_Btn_OkButton, "ok button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Btn_PrintButton, "print button")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Btn_Okbutton, "ok button")
        //=====================================Funds:Print Checks continued in part 2 file===================================================================================================================================

    });
});





