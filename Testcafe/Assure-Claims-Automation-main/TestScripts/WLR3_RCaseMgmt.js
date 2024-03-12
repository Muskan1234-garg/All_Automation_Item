import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';

import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_Home from '../Functional_POM/POM_Home';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_WorkLossRestriction from '../Functional_POM/POM_WorkLossRestriction';
import POM_CaseManagement from '../Functional_POM/POM_CaseManagement';
import POM_GeneralSystemParameter from '../Functional_POM/POM_GeneralSystemParameter';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';


// const DataIUT = require('../DataFiles/DataIUT.json');
// const DataIUT = require('../DataFiles/DataAutoReg.json');
const DataIUT = require('../DataFiles/DataAutoRegDSN_1.json')

const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();
const WorkLoss_POM = new POM_WorkLossRestriction();
const CaseMgt_POM = new POM_CaseManagement();
const GenSysPara_POM = new POM_GeneralSystemParameter();
const ConfigMgr_POM = new POM_Config_Manager();


//global variables
var d;
var Restrictiondate;
var StrWCClaimNumber;
var StrControlNumber1;
var StrControlNumber2;
var CaseMgnt;

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-87829, RMA-87942, RMA-96007
//Description : NONE
//AUTHOR : Muskan garg
//DEPENDANCY : Depandant on WorklossRestriction.js
//PRE-REQUISITE : turn on Case managment from utility
//utility --->GSP--->funds setting --->turn on Create Work Loss and Restriction Records From Funds From/To Dates:
//*********************************************************************************************************************************************

DataIUT.forEach(data => {
    const CalimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ConfigurationManagerLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );


    fixture`WLR3_RCaseMgmt`.beforeEach(async t => {

    });

    test('AssureClaims_WorkLoss/RestrictionFromTodate_TC_001', async t => {
        await t.setNativeDialogHandler(() => true).useRole(CalimZoneLogin);

        await t.wait(3000)
        /*=========================================================== Worker Compensation Claim Creation Started Here========================================================================================================================================================================================================================================================================================================*/
        await t.wait(3000)
        d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_WorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        StrWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.WCClaimType, data.EmployeeNo, data.WCJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + StrWCClaimNumber);
        /*===========================================================Worker Compensation Claim Creation Completed Here========================================================================================================================================================================================================================================================================================================*/

        /*==========================================================Case Management Creation Started Here========================================================================================================================================================================================================================================================================================================*/
        console.log("AssureClaims_CaseManagementCreateEditDelete_Utility Function is Called To Create Case Management On Worker Compensation Claim".yellow);
        CaseMgnt = await Function_Utility.AssureClaims_CaseManagementCreateEditDelete_Utility("Illness", "Dermatitis", d, d);
        console.log("Case Management is Created with Type: ".green + CaseMgnt);
        /*===========================================================Case Management Creation Completed Here========================================================================================================================================================================================================================================================================================================*/

        await t.switchToMainWindow();
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);

        /*=========================================================== Worker Compensation reserve creation started =================================================================================================================================================================================================================================================================================================================== */
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.Amount, data.ReserveStatus);
        /*=========================================================== Worker Compensation reserve creation end =================================================================================================================================================================================================================================================================================================================== */

        await t.switchToMainWindow();
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await t.wait(2000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")

        Restrictiondate = await Generic_Utility.AssureClaims_MinusOneDay_Utility(d);

        /*=========================================================== Worker Compensation Payment with insert From & To Date functionality started ================================================================================================================================================================================================================================================================================== */

        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await t.wait(5000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeTypeClaimant), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.RestrictionTransType), "Transaction Type Value On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, data.PaymentAmount, "Transaction Amount On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_FromDate, Restrictiondate, "insert from date");
        await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_ToDate, Restrictiondate, "insert To date");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await t.wait(2000);
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Payment Creation Screen");
        StrControlNumber1 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        /*=========================================================== Worker Compensation Payment with insert From & To Date functionality started ================================================================================================================================================================================================================================================================================== */

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_AddCaseManagement, "Add CaseManagement on WC Page")

        /*=========================================================== Verify that AWL record is created on Case Management Screen ================================================================================================================================================================================================================================================================================== */
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_Tab_CaseMgtRtW, "Tab Case Mgt/RTW ")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_Btn_Restriction, "Restriction Button")
        const ColHeader1 = ["First Day Restricted", "Last Day Restricted"]
        const ColValue1 = [Restrictiondate, Restrictiondate]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(Restrictiondate, "Restricted Days List", ColHeader1, ColValue1)
        await Verify_Utility.AssureClaims_ElementExist_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_VerifyText.withText('Total Items: 1'), "Only 1 record Exist")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_Btn_Close, "Close Button")
        /*=========================================================== Verify that AWL record is created on Case Management Screen ================================================================================================================================================================================================================================================================================== */

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);

        /*=========================================================== Verify that AWL record is visible on Employee Screen at Event Level ================================================================================================================================================================================================================================================================================== */
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_WC_Lnk_OpenAddedPersonInvolved, "PI Link")
        await t.wait(10000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EventIFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_EventScreen_Btn_Restriction, "Restriction on Event Screen")
        const ColHeader2 = ["First Day Restricted", "Last Day Restricted"]
        const ColValue2 = [Restrictiondate, Restrictiondate]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(Restrictiondate, "Restricted Days List", ColHeader2, ColValue2)
        await Verify_Utility.AssureClaims_ElementExist_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_VerifyText.withText('Total Items: 1'), "Only 1 record Exist")
        /*=========================================================== Verify that AWL record is visible on Employee Screen at Event Level ================================================================================================================================================================================================================================================================================== */
    })

    test('AssureClaims_CheckDuplicacyWorkLoss/RestrictionFromTodate_TC_002', async t => {
        await t.setNativeDialogHandler(() => true).useRole(CalimZoneLogin);

        await t.wait(10000)
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrWCClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window");

        /*=========================================================== Worker Compensation Payment with Same insert From & To Date functionality started->To Verify Duplicacy  ================================================================================================================================================================================================================================================================================== */
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_MakePayment, "Make Payment Button On Payment Creation Screen")
        await t.wait(2000)
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Payment_POM.AssureClaims_Payment_Lst_BankAccount, data.BankAccount, "Bank Account On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType, "Payee Payor Type List On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Lst_PayeePayorType.find('option').withText(data.PayeeTypeClaimant), "Payee Payor Type Value On Payment Creation Screen")
        await t.wait(3000)
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_TransactionDetail, "Transaction Detail Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Btn_AddNewFunds, "Add New Funds Button On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType, "Transaction Type List On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Lst_TransactionType.find('option').withText(data.RestrictionTransType), "Transaction Type Value On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_FundsSplitDetails_Txt_Amount, data.PaymentAmount, "Transaction Amount On Funds Split Detail Screen")
        await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_FromDate, Restrictiondate, "insert from date");
        await In_Utility.AssureClaims_SetValue_Utility(WorkLoss_POM.AssureClaims_FromToDate_Btn_ToDate, Restrictiondate, "insert To date");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_FundsSplitDetails_Btn_Save, "Save Button On Funds Split Detail Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_PaymentCollection_Tab_Transaction, "Transaction Tab On Payment Creation Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Payment Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.DuplicateRestrictionMsg, true, "A Restriction record already exists with in this time frame.")
        StrControlNumber2 = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber, "value");
        /*=========================================================== Worker Compensation Payment with Same insert From & To Date functionality started--> To Verify Duplicacy ================================================================================================================================================================================================================================================================================== */

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);

        /*===========================================================  Transaction History -> Verify 2nd payment is also displayed ================================================================================================================================================================================================================================================================================== */
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_ReserveCreation_Btn_Reserve_History, "Transaction History Button")
        await t.wait(2000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_TransactionHistory_ClaimGCIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber1, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader3 = ["Type"]
        const ColValue3 = ["Payment"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Payment", "Transaction History", ColHeader3, ColValue3)

        await In_Utility.AssureClaims_SetValue_Utility(Payment_POM.AssureClaims_Payment_Txt_CntrlNumber, StrControlNumber2, "Control Number 1")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.AssureClaims_Payment_Btn_FilterSerach, "Search button")
        const ColHeader4 = ["Type"]
        const ColValue4 = ["Payment"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("Payment", "Transaction History", ColHeader4, ColValue4)
        /*===========================================================  Transaction History -> Verify 2nd payment is also displayed ================================================================================================================================================================================================================================================================================== */

    })

    test('AssureClaims_VerifyDuplicateRecordIsNotONCaseMgmtScreen_TC_003', async t => {
        await t.setNativeDialogHandler(() => true).useRole(CalimZoneLogin);

        await t.wait(10000)
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrWCClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);


        /*===========================================================  Verify that duplicate AWL record is  NOT created  on Case Management Screen ================================================================================================================================================================================================================================================================================== */
        await Nav_Utility.AssureClaims_ElementClick_Utility(CaseMgt_POM.AssureClaims_CaseManagement_Btn_AddCaseManagement, "Add CaseManagement on WC Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_Tab_CaseMgtRtW, "Tab Case Mgt/RTW ")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_Btn_Restriction, "Restriction Button")
        const ColHeader5 = ["First Day Restricted", "Last Day Restricted"]
        const ColValue5 = [Restrictiondate, Restrictiondate]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(Restrictiondate, "Restricted Days List", ColHeader5, ColValue5)
        await Verify_Utility.AssureClaims_ElementExist_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_VerifyText.withText('Total Items: 1'), "Only 1 record Exist")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WorkLoss_POM.AssureClaims_CaseMgmt_Btn_Close, "Close Button")
        /*===========================================================  Verify that duplicate AWL record is  NOT created  on Case Management Screen ================================================================================================================================================================================================================================================================================== */

    })

    // Turn off Case Management in Configuration Manager
    test('AssureClaims_ConfigurationManager_CaseManagment_OFF_Test_04', async t => {

        //==============================================================Login Into Application with User started==================================================================
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationManagerLogin);
        //=============================================================Login Into Application with User ended=========================================================================
        
        //====================================================General System Parameters in Configuration manager started================================================
        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Claims Module", "Case Management")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GenSysPara_POM.AssureClaims_ConfigManager_Chk_UseCaseManagement,"UnCheck","Use case management")  
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================General System Parameters in Configuration manager ended================================================

    });

});


