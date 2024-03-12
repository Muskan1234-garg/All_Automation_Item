import { Selector, Role, ClientFunction } from "testcafe";
import { createTestCafe } from "testcafe";
import Colors from "colors";

import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from "../Functional_Utilities/Input_Utility";
import GenericUsages_Utility from "../Functional_Utilities/GenericUsages_Utility";
import POM_PaymentsCollections from "../Functional_POM/POM_PaymentsCollections";
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";
import POM_ClearCheack from "../Functional_POM/POM_ClearCheack";
import POM_Home from '../Functional_POM/POM_Home';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_PaymentParameterSetUp from '../Functional_POM/POM_PaymentParameterSetUp';

const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const ClearCheack_POM = new POM_ClearCheack();
const ConfigMgr_POM = new POM_Config_Manager();
const PayParaSetUp_POM = new POM_PaymentParameterSetUp();

const DataAutoReg = require("../DataFiles/DataAutoRegDSN_1.json");
const fs = require('fs');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-94178, RMA-99202, RMA-102196
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
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

    fixture`StopPay5_ForMiscllaneousPayment_RolledUPChecks_part1`.beforeEach(async (t) => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    /* Steps performed by AssureClaims_StopPay_RollUpChecks_ConfigManager_Settings_Test_01 :
     1. Login into Configuration Manager zone
     2. Payment parameters -> check tab -> roll-up section -> Roll up Check for The Same Payee
      
  */

    let StrClaimNumber;

    test("AssureClaims_StopPay_RollUpChecks_Test_01", async (t) => {

        //=============================================================Login Into Application with User started=========================================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigManagerLogin);
        await t.wait(10000)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Payment Parameter SetUp in Configuration manager started================================================
        
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Check", "Roll Up")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PayParaSetUp_POM.AssureClaims_PaymentParameters_Chk_rollUpChecks, "Check", "Use Entity Payment Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        
        //====================================================Payment Parameter SetUp in Configuration manager ended================================================
        console.log("Logout from Application!!")
    });

    /* Steps performed by AssureClaims_StopPay_RollUpChecks_Test_02 :
 1. GCClaimCreation
 2. GC Claim status change
 3. Claimant Creation
 4. Reserve Creation
 5. Creation of two Payments
 5. Exporting variables
 6. Funds -> Print Checks : For the created payments
 
*/

    test("AssureClaims_StopPay_RollUpChecks_Test_02", async (t) => {

        await t.wait(5000);

        let d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility(
            "MM/DD/yyyy"
        );
        //=====================================Corporate GC  Creation started here===================================================================================================================================
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        //=====================================Corporate GC  Creation completed here===================================================================================================================================

        //===============================================Claimant Creation started Here==============================================================================================

        let ClaimentLastName = await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Claimant", data.Country, data.State, "NA")
        console.log(`Claimant is Created on Carrier Claims with last name : ${ClaimentLastName}`);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after claiment creation"
        );
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );

        //===============================================Claimant Creation Completeed Here==============================================================================================

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
        //=====================================First Payment Creation started here===================================================================================================================================

        let StrControlNumber1 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
            data.BankAccount,
            data.PayeeTypeClaimant,
            ClaimentLastName,
            data.TransactionType,
            data.Amount
        );

        //=====================================First Payment Creation completed here===================================================================================================================================
        await t.wait(2000);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll,
            "back after payment creation"
        );
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(
            Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe
        );
        await Nav_Utility.AssureClaims_ElementClick_Utility(
            ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow,
            "grid button"
        );
        await t.wait(5000);
        //=====================================Second Payment Creation started here===================================================================================================================================

        let StrControlNumber2 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(
            data.BankAccount,
            data.PayeeTypeClaimant,
            ClaimentLastName,
            data.TransactionType,
            data.Amount
        );
        //=====================================RMA-99202 : Exporting variables started here===================================================================================================================================
        fs.writeFile('StopPay5_ForMiscllaneousPayment_RolledUPChecks_ExportedVariables.js', 'export var StrClaimNumber = ' + "'" + StrClaimNumber + "';\n" + 'export var ClaimentLastName = ' + "'" + ClaimentLastName + "';\n" + "\n" + 'export var StrControlNumber1 = ' + "'" + StrControlNumber1 + "';\n" + 'export var StrControlNumber2 = ' + "'" + StrControlNumber2 + "';\n" + "module.exports.StrClaimNumber=StrClaimNumber;\nmodule.exports.ClaimentLastName=ClaimentLastName;\nmodule.exports.StrControlNumber1=StrControlNumber1;\nmodule.exports.StrControlNumber2=StrControlNumber2;", (err) => console.log("Users copied"))
        //=====================================RMA-99202 : Exporting variables ended here===================================================================================================================================
        //=====================================Second Payment Creation completed here===================================================================================================================================
        //=====================================Funds:Print Checks Started===================================================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Funds:Print Checks")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_printCheckIframe);
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_BankAccount, data.BankAccount, "Select Bank Account")
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_PrintCheck_Lst_SelectCheck, data.Checks, "Select Check")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PrintCheck_Btn_CheckSelection, "button for check selection")
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_txt_ClaimNumber, StrClaimNumber, "Claim Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_SelectAllGrid, "select grid")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_SelectChecksToPrint_Btn_OkButton, "ok button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Btn_PrintButton, "print button")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaimsApp_PrintCheck_Btn_Okbutton, "ok button")

        //=====================================Funds:Print Checks continued in StopPayForMiscllaneousPayment_RolledUPChecks_part2 file===================================================================================================================================
    });
});





