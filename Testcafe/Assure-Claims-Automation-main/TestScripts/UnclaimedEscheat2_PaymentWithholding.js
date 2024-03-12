import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import { ClientFunction } from 'testcafe';

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';

import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_ClearCheack from '../Functional_POM/POM_ClearCheack';
import POM_StopPay from '../Functional_POM/POM_StopPay';
import POM_FundsDormancy from '../Functional_POM/POM_FundsDormancy';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_Deductible from '../Functional_POM/POM_Deductible';

const Verify_Utility = new Verification_Utility();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Reserve_Utility = new POM_FinancialReserves();

const StopPay_POM = new POM_StopPay();
const Deductible_POM = new POM_Deductible();
const Verification_Msg = new POM_VerificationMessage();
const Payment_POM = new POM_PaymentsCollections();
const Home_POM = new POM_Home();
const FundsDormancy_POM = new POM_FundsDormancy();
const ClearCheack_POM = new POM_ClearCheack();


const DataSTG = require('../DataFiles/DataAutoRegDSN_1.json');

// Global Variable
var dTransactionDate;
var strEntity1;
var strEntity2;
var d;
var strClaimNumber;
var strControlNumber1;
var strControlNumber3;
var strSaveMessageVerification_WithHolding;
var dCheckDate;
let strControlNumber2;
let strControlNumber4;
//******************************************************************************************************************************//
//JIRA ID OF STORY :RMA-102192,RMA-94320,RMA-94578
//Description : Case #7: Unclaimed Parent Payment reduced to Backup Withholding will not impact the Child Payment 
//              Case #8: Unclaimed Child Payment reduced to Backup Withholding will not impact the Parent Payment
//AUTHOR : Yashaswi Mendhekar
//DEPENDANCY : yes (UnclaimedAndEscheatPaymentConfiguration.js)
//PRE-REQUISITE : utilities---->funds Dormancy---> add funds dormancy.
//Preferred Server: stg sql Env on DSN [RMACDR214_MAINDB_NEW]
//******************************************************************************************************************************//


DataSTG.forEach(data => {
    fixture`UnclaimedEscheat2_PaymentWithholding`.beforeEach(async t => {

        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });
    /*
    1. Login to the maintenance zone 
    2. Create 2 entity.Backup withholding for 2nd entity.
    3. Go to claim zone. Create claim. Add reserve transaction. ( Transaction date beyond unclaimed escheat days limit)
    4. Print check and verify UX msg.
    5. Verify Over Transaction History Screen that two transaction gets created.
    6. Click Parent control no link and navigate to the transaction page and change funds dormancy status as unclaimed
    7. Verify Unclaimed Parent Payment reduced to Backup Withholding will not impact the Child Payment
    */
    test('AssureClaims_UnclaimedAndEscheat_Test_01', async t => {

        // ============================================Logging into application starts here =========================================================
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log("Login Into Application!!-->Maintenance".bgCyan)
        await t.wait(4000)
        //  ======================================= Logged into application ==============================================================

        //===================================== Entity Creation started here ===================================================================================================================================
        strEntity1 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", data.EntityTypePolicyMCO, data.FundsDormancyCountry, data.FundsDormancyState);
        console.log("First  Entity is Created with Last Name: ".green + strEntity1);
        await t.switchToMainWindow()
        Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button clicked");
        await t.switchToMainWindow()
        strEntity2 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("People", data.EntityTypePolicyMCO, data.FundsDormancyCountry, data.FundsDormancyState);
        console.log("First Entity is Created with Last Name: ".green + strEntity2);
        console.log(`entity 1 : ${strEntity1}  entity2 : ${strEntity2}`)
        //===================================== Entity Creation completed here ==================================================================================================================================

        //=====================================  Backup withholding for 2nd entity starting here ==================================================================================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_BackupWithholding, "Backup Withholding button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_Withholding);
        await t.wait(5000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(StopPay_POM.AssureClaims_StopPay_Chk_EnableBackupWithholding, 'Check', "Enable Backup Withholding")
        await t.typeText(StopPay_POM.AssureClaims_StopPay_Txt_BackupWithholdingPercentage, data.BackupWithholdingPercentage)
        await In_Utility.AssureClaims_SetValue_Utility(StopPay_POM.AssureClaims_StopPay_Txt_Recipient, strEntity1, "Recipient entity entered");
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        //===========================  Backup withholding for 2nd entity Completed here ================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Reload, "Reload Button On Top Of The Screen")
        // ======================================= Switching to claim zone======================================================
        await t.wait(5000);
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims")
        console.log("Switched to the Claim zone".green)
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(5000);
        // ===================================== Switched to Claim Zone =================================================

        //==================================Corporate GC  Creation started here ========================================
        d = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, -1, -1, "MM/DD/YYYY")
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB);
        console.log("New Cooperate General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=====================================Corporate GC  Creation completed here ======================================
        //===============================================Reserve Creation starts Here====================================
        await t.wait(5000)
        console.log("AssureClaims_Reserve Creation Function is Called To Create Reserve".yellow);
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus);
        console.log("New Reserve is Created : ".green);
        //=============================================Reserve Creation ends Here ==========================================
        await t.wait(3000)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_dvbreadcrumbscroll, "Clicking on back after reserve creation")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(ClearCheack_POM.AssureClaims_ReserveCreation_gridwindow, "Clicking on grid button");
        await t.wait(3000)
        //===============================================Payment Creation starts Here ==================================================
        dTransactionDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
        strControlNumber1 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strEntity2, data.TransactionType, data.PaymentAmount);
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, dTransactionDate, "Transaction Date In Transaction Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
        //===============================================Payment Creation ends Here ========================================================

        // ====================================Print check Starts here ==============================================================
        dCheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Lnk_PrintCheck.withText("Print Check"), "Print Check Option From The List");
        await t.wait(3000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await In_Utility.AssureClaims_SetValue_Utility(FundsDormancy_POM.AssureClaims_PrintCheck_Txt_checkDate, dCheckDate, "Check Date in printcheck screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintSingleCheck, "Print check button in print single check window");
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon, "First tick after print single check button is clicked");
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange, "Second tick [Print check range window]after print single check button is clicked");
        //=======================Printing Check completed here========================================================

        //====================== Backup Withholding UI message verification started here=======================================================
        await t.wait(1000);
        strSaveMessageVerification_WithHolding = `Payment amount is going to be reduced due to withholding.`
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification_WithHolding, false, "Payment amount is going to be reduced due to withholding")
        await t.wait(5000);
        //============================== Backup Withholding UI message verification ended here============================================

        await t.switchToMainWindow();
        await t.wait(7000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await t.wait(6000)

        //=====================================Verify Over Transaction History Screen that two transaction gets created started here===================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber1, "Put control number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Btn_FilterSerach, "Search the control number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, " 1st Row exist ")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist.nth(1), "2nd Row exist ")
        // =====================================Verify Over Transaction History Screen that two transaction gets created completed here===================================================================================================================================

        // =====================================click on first control no link and navigate to the transaction page and changing funds dormancy status started here========================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Lnk_Transaction, " Click on Parent transaction link")
        await t.wait(1000);
        await t.switchToMainWindow();
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await t.wait(7000);
        await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('Unclaimed')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('Unclaimed');
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        // =====================================click on first control no link and navigate to the transaction page and changing funds dormancy status ends here========================================================================================

        //============= Backup Withholding UI message verification started here=======================================================

        await t.wait(1000);
        strSaveMessageVerification_WithHolding = `Payment amount is going to be reduced due to withholding.`
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification_WithHolding, true, "Payment amount is going to be reduced due to withholding")
        await t.wait(5000);
        //============================== Backup Withholding UI message verification ended here============================================
        // =====================================click on second control no. link and navigate to the transaction page starts here========================================================================================
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        strControlNumber2 = +strControlNumber1 + 1 + "";
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber2, "Put  control number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Btn_FilterSerach, "Search the control number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist ")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Lnk_Transaction, "Select row")
        await t.wait(1000);
        await t.switchToMainWindow();
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await t.wait(7000);
        await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus, "verify Funds Dormancy Status")
        // =====================================click on second control no. link and navigate to the transaction page  ends here========================================================================================

        // ============================================Verification of funds dormancy status Starts here ================================================================
        console.log('Verification Starts here'.bgCyan);
        await t.wait(5000);
        await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('-- Please Select --')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('-- Please Select --');
        console.log("-- Please Select --".yellow + 'is matched with '.green + "-- Please Select --".yellow + 'Hence verification successful'.green);
        //===================================verification funds dormancy status ends here ======================================================================

    });

    /*
    1. Go to claim zone. Search claim. Add transaction. ( Transaction date beyond unclaimed escheat days limit)
    2. Print check and verify UI msg.
    3. Verify Over Transaction History Screen that two transactions get created.
    4. Click child control no link and navigate to the transaction page and change funds dormancy status as unclaimed
    5. Verify Unclaimed Child Payment reduced to Backup Withholding will not impact the parent Payment
    */
    test('AssureClaims_UnclaimedAndEscheat_Test_02', async t => {

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
        strControlNumber3 = await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, strEntity2, data.TransactionType, data.PaymentAmount);
        // Selecting Transaction date as current minus 8
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_DateOfTransaction, dTransactionDate, "Transaction Date In Transaction Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
        //=====================================Payment Creation ends Here ===================================================================

        //=====================================Printing Check starts here====================================================================
        dCheckDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0, 0, -8, "MM/DD/YYYY")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Btn_Lookup, "look up button");
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_Claims_Lnk_PrintCheck.withText("Print Check"), "Print Check Option From The List");
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await In_Utility.AssureClaims_SetValue_Utility(FundsDormancy_POM.AssureClaims_PrintCheck_Txt_checkDate, dCheckDate, "Check Date in printcheck screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintSingleCheck, "Print check button in print single check window");
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon, "First tick after print single check button is clicked");
        await Nav_Utility.AssureClaims_ElementClick_Utility(StopPay_POM.AssureClaims_StopPay_Btn_PrintCheckRange, "Second tick [Print check range window]after print single check button is clicked");

        //=====================================Printing Check completed here==================================================================

        //============= Backup Withholding UI message verification started here=======================================================
        await t.wait(1000);
        strSaveMessageVerification_WithHolding = `Payment amount is going to be reduced due to withholding.`
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification_WithHolding, false, "Payment amount is going to be reduced due to withholding")
        await t.wait(7000);
        //============================== Backup Withholding UI message verification ended here============================================
        // ===============Go to transaction history screen and verification of control no starts here=============================
        await t.switchToMainWindow();
        await t.wait(7000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button");
        await t.wait(7000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await t.wait(7000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction history")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        strControlNumber4 = +strControlNumber3 + 1 + "";
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber4, "Put  control number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Btn_FilterSerach, "Search the control number")
        // ===============Go to transaction history screen and verification of control no ends here=============================

        // =====================================click on first control no link and navigate to the transaction page and changing funds dormancy status starts here=======================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Lnk_Transaction, "Select row")
        await t.wait(1000);
        await t.switchToMainWindow();
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(7000);
        await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('Unclaimed')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('Unclaimed');
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        // =====================================click on first control no link and navigate to the transaction page and changing funds dormancy status ends here========================================================================================

        //============= Backup Withholding UI message verification started here=======================================================
        await t.wait(1000);
        strSaveMessageVerification_WithHolding = `Payment amount is going to be reduced due to withholding.`
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(strSaveMessageVerification_WithHolding, true, "Payment amount is going to be reduced due to withholding")
        await t.wait(5000);
        //============================== Backup Withholding UI message verification ended here============================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_QueuedPayment_Btn_TransactionHistory, "Transaction history")
        await t.wait(7000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Externalapp_frame)
        await In_Utility.AssureClaims_SetValue_Utility(Reserve_Utility.AssureClaims_Payment_Txt_CntrlNumber, strControlNumber3, "Put restriction control number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Btn_FilterSerach, "Search the control number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Deductible_POM.AssureClaims_Claims_Row_SelectAndCheckRowExist, "Row exist ")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_Payment_Lnk_Transaction, "Select row")
        // =====================================click on second control no. link and navigate to the transaction page ends here========================================================================================

        // ============================================Verification for funds dormancy status Starts here ================================================================
        await t.wait(1000);
        await t.switchToMainWindow();
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(7000);
        console.log('Verification Starts here'.bgBlue);
        await t.wait(5000);
        await t.click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus).click(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withText('-- Please Select --')).expect(Payment_POM.AssureClaims_Claims_Lst_SelectDormancyStatus.find('option').withAttribute('selected').innerText).eql('-- Please Select --');
        console.log("-- Please Select --".yellow + 'is matched with '.green + "-- Please Select --".yellow + 'Hence verification successful'.green);

        //===================================verification for funds dormancy status ends here ======================================================================

        //===============================================Logout from Application Starts here============================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //===============================================Logout from Application ends here ============================================================
    });
});
