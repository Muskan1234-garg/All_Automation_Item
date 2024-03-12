
import { Selector, Role } from 'testcafe';
import { ClientFunction } from 'testcafe';
import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_GeneralClaimParameter from '../Functional_POM/POM_GeneralClaimParameter';
import POM_WCClaimParameters from '../Functional_POM/POM_WCClaimParameters';

const DataSTG = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Verify_Utility = new Verification_Utility();
const Payment_POM = new POM_PaymentsCollections();
const ConfigMgr_POM = new POM_Config_Manager();
const GCP_POM = new POM_GeneralClaimParameter();
const WCP_POM = new POM_WCClaimParameters();

var date = new Date();
var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();

//Global Variable Declaration
var strWCClaimNumber;
var strClaimNumber;;

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-95941,RMA-87951,RMA-106957
//Description : NONE
//AUTHOR : Sharma, Diksha,Saikrishna,Yashaswi Mendhekar
//DEPENDANCY : NONE
//PRE-REQUISITE : Check for Recovey Reserve Type Are Present in the Reserve Types & Check for EX Expense Payment & LOS Loss Payment,If not their create it in maintenance Zone  
//*********************************************************************************************************************************************


DataSTG.forEach(data => {
    fixture`ReserveRecovery2`.beforeEach(async t => {
        await t.wait(5000)
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
    });

    // From LOB Parameter Setting Calculate Collections in Reserve Balance Per Reserve (EXP Expense Payment) &
    // Calculate Collections in Reserve Balance Per Reserve (EX Expense Payment) - ON over GC
    // Calculate Collections in Incurred Balance Per Reserve (LOS Loss Payment)- ON over GC
    // Calculate Recovery Reserve To Total Claim Reserve Balance - ON over WC
    // Calculate Recovery Reserve To Total Claim Incurred Balance - ON over WC
    // Calculate Collections in Reserve Balance Per Reserve (EX Expense Payment) - ON over WC
    // Calculate Collections in Incurred Balance Per Reserve (LOS Loss Payment)- ON over WC

    test('AssureClaims_ReserveRecover_UtilitiesSettings_Test_01', async t => {

        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Workers' Compensation Claim Parameters", "wc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        //===============================================================Configuration Settings for WC claims================================================================================================================================================== 

        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_AddRecoveryReservetoTotalBalanceAmount, 'Check', "Check for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_AddRecoveryReservetoTotalIncurredAmount, 'Check', "check incurred collection")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculatCollectionsinReserveBalancePerReserve, 'Check', "Check for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculatCollectionsinIncurredBalancePerReserve, 'Check', "check incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WCP_POM.AssureClaimsApp_WCClaimParameters_Btn_ReserveTypesForReserveBalanceCalculationsLookUp, "LookUp Button Is Clicked")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "Expense Payment")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WCP_POM.AssureClaimsApp_WCClaimParameters_Txt_SelectSearchedFeild.withExactText("Expense Payment"), "Reserve Type Is Clicked")

        await Nav_Utility.AssureClaims_ElementClick_Utility(WCP_POM.AssureClaimsApp_WCClaimParameters_Btn_ReserveTypesForReserveBalanceCalculationsLookUp.nth(1), "LookUp Button Is Clicked")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "Loss Payment")
        await Nav_Utility.AssureClaims_ElementClick_Utility(WCP_POM.AssureClaimsApp_WCClaimParameters_Txt_SelectSearchedFeild.withExactText("Loss Payment"), "Reserve Type Is Clicked")

        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_Save, "Save button clicked")
        await t.wait(4000);
        // =========================================================Configuration Settings for GC claims======================================================================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_CalculatCollectionsinReserveBalancePerReserve, 'Check', "Check for recvery reserve for GC")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_CalculatCollectionsinIncurredBalancePerReserve, 'Check', "check incurred collection For Gc")
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaimsApp_GeneralClaimParameter_Btn_ReserveTypesForReserveBalanceCalculationsLookUp, "LookUp Button Is Clicked")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "Expense Payment")
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaimsApp_GeneralClaimParameter_Txt_SelectSearchedFeild.withExactText("Expense Payment"), "Reserve Type Is Clicked")
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaimsApp_GeneralClaimParameter_Btn_ReserveTypesForReserveBalanceCalculationsLookUp.nth(1), "LookUp Button Is Clicked")
        await t.wait(6000)
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", "Loss Payment")
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaimsApp_GeneralClaimParameter_Txt_SelectSearchedFeild.withExactText("Loss Payment"), "Reserve Type Is Clicked")
        await t.wait(6000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_Save, "Save button clicked")
        //   ===================================================Logout from Application starts here ===============================================================================================================
        await Function_Utility.AssureClaims_LogoutFromApplication_Config_Manager_Utility();
        console.log("Logout from Application!!")
        //   ===================================================Logout from Application ends here ===============================================================================================================

    });

    //  Create GC Claim
    //  Create Non-Recovery Reeserve of EX Expense Payment of $100
    //  Create Non-Recovery Reeserve of LOS Loss Payment of $100
    //  Create a collection on Expense Payment of $20
    //  Create a collection on Loss Payment of $20
    //  Verifiy on the reserve Grid,
    //  Verify for EX Expense Payment, Reserve Balance = $100 + Collection Amount ($20) = $120, Collection = $20 & Incurred $100
    //  Verify for Loss Payment, Reserve Balance = $100, Collection = $20 & Incurred = $100 - Collection Amount ($20) = $80

    test('AssureClaims_ReserveNonRecoveryOnGC_Test_02', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //===============================================================Claim Creation Started Here======================================================================================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=========================================================Claim Creation  completed====================================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_Reserve_Utility(data.EXP_ReserveType, "100", data.ReserveStatus)
        //=======================================================non recovery reserve created of Expense Type=====================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Function_Utility.AssureClaims_NReserve_Utility(data.Loss_ReserveType, "100", data.ReserveStatus)
        //==========================================================non-recovery reserve created of loss Type=============================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, "NA", data.TransactionType_Expense, "20")
        //============================================================== Collection is Created for Non recovery reserve type Expense Type===============================================================  
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, "NA", data.TransactionType_Loss, "20")
        // =============================================================Collection is Created for Non recovery reserve type Loss Type============================================================================
        //==============================================================verification on reserve listing Started Here =====================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);

        const Header8 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value8 = [data.EXP_ReserveType, "$120.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.EXP_ReserveType, "GCreserve listing", Header8, Value8)

        const Header7 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value7 = [data.Loss_ReserveType, "$100.00", "$80.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.Loss_ReserveType, "Wc.reserve listing", Header7, Value7)
        //================================================================verification on reserve listing Ended Here
    });

    // Create WC Claim
    // Create Non-Recovery Reeserve of EX Expense Payment of $100
    // Create Non-Recovery Reeserve of LOS Loss Payment of $100
    // Create Recovery Reeserve (RR) of $100
    // Create a collection on Expense Payment of $20
    // Create a collection on Loss Payment of $20
    // Create a collection on RR of $20
    // Verifiy on the reserve Grid,
    // Verify for EXP Expense Payment, Reserve Balance = $100 + Collection Amount ($20) = $120, Collection = $20 & Incurred $100
    // Verify for Loss Payment, Reserve Balance = $100, Collection = $20 & Incurred = $100 - Collection Amount ($20) = $80
    // Verify for RR, Reserve Balance = $100 -Collection($20) = $80, Collection = $20 & Incurred = $100
    test('AssureClaims_ReserveNonRecoveryOnWc_Test_03', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //=================================================================login to Claims Zone================================================================
        //================================================================Worker Compensation Claim Creation=======================================================
        await t.wait(3000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_WorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        strWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.WCClaimType, data.EmpolyeeNumber, data.WCJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + strWCClaimNumber);
        await t.wait(3000)
        await Function_Utility.AssureClaims_Reserve_Utility(data.Loss_ReserveType, "100", data.ReserveStatus)
        //====================================================non-recovery reserve created of Loss Type=================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await Function_Utility.AssureClaims_NReserve_Utility(data.EXP_ReserveType, "100", data.ReserveStatus)
        //===================================================================non-recovery reserve created of Expense Type=============================================================
        await Function_Utility.AssureClaims_NReserve_Utility(data.RecoveryReserveType, "100", data.ReserveStatus)
        //====================================================================non-recovery reserve created of Expense Type===================================================================================
        //========================================================================Collection for Recovery Reserve Type====================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.RecoveryTransactionType, "20")
        //=================================================================Collection for Expense Recovery Type==========================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_Expense, "20")
        //=====================================================================Collection for Loss Recovery Type================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_3, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_Loss, "20")
        await t.wait(6000)
        //======================================================================verification on reserve listing Started Here============================================================================================== 
        const Header9 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value9 = [data.EXP_ReserveType, "$120.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.EXP_ReserveType, "GCreserve listing", Header9, Value9)

        const Header10 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value10 = [data.Loss_ReserveType, "$100.00", "$80.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.Loss_ReserveType, "Wc.reserve listing", Header10, Value10)

        const Header11 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value11 = [data.RecoveryReserveType, "$80.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.RecoveryReserveType, "Wc.reserve listing", Header11, Value11)
        //==============================================================================verification on reserve listing Started Here============================================================================================================
    });

    //Revert Configuration Manager Setting

    test('AssureClaims_RevertReserveRecoverUtilitiesSettings_Test_04', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        await t.switchToMainWindow()
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Workers' Compensation Claim Parameters", "wc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        //=====================================================================Lob Settings for Wc claims================================================================================================================================== 
       
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_AddRecoveryReservetoTotalBalanceAmount, 'UnCheck', "Check for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_AddRecoveryReservetoTotalIncurredAmount, 'UnCheck', "check incurred collection")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculatCollectionsinReserveBalancePerReserve, 'UnCheck', "Check for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculatCollectionsinIncurredBalancePerReserve, 'UnCheck', "check incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_Save, "Save button clicked")
        await t.wait(4000);
        // =========================================================Lob Settings for Gc claims======================================================================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_CalculatCollectionsinReserveBalancePerReserve, 'UnCheck', "UnCheck for recovery reserve for GC")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_CalculatCollectionsinIncurredBalancePerReserve, 'UnCheck', "UnCheck incurred collection For Gc")
        await Nav_Utility.AssureClaims_ElementClick_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_Save, "Save button clicked")
    });

});
