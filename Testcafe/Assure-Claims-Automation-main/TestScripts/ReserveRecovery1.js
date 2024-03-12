import { Selector, Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_VCParameter from '../Functional_POM/POM_VCParameters';
import POM_WCClaimParameters from '../Functional_POM/POM_WCClaimParameters';
import POM_PCParameter from '../Functional_POM/POM_PropertyClaimParameters';
import POM_GeneralClaimParameter from '../Functional_POM/POM_GeneralClaimParameter';

const DataSTG = require('../DataFiles/DataAutoRegDSN_2.json');

const GCP_POM = new POM_GeneralClaimParameter();
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const VCP_POM = new POM_VCParameter();
const WCP_POM = new POM_WCClaimParameters();
const PCP_POM = new POM_PCParameter();
const Payment_POM = new POM_PaymentsCollections();
const ConfigMgr_POM = new POM_Config_Manager();

var date = new Date();
var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();

//Global Variable Declaration
var strWCClaimNumber;
var strClaimNumber;

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-95941,RMA-87950,RMA-106957
//Description : NONE
//AUTHOR : Sharma, Diksha,Saikrishna,Yashaswi Mendhekar
//DEPENDANCY : NONE
//PRE-REQUISITE : Check for Recovey Reserve Type Are Present in the Reserve Types & Check for EX Expense Payment & LOS Loss Payment,If not their create it in maintenance Zone  
//*********************************************************************************************************************************************

DataSTG.forEach(data => {
    fixture`ReserveRecovery1`.beforeEach(async t => {
        await t.wait(5000)
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
    });

    // From Configuration Manager Setting
    // Calculate Collections in Reserve Balance - ON over WC
    // Calculate Collections in Incurred Balance - Off over WC
    // Calculate Collections in Incurred Balance - ON over PC
    // Calculate Collections in Reserve Balance - Off over PC
    // Calculate Recovery Reserve To Total Claim Reserve Balance - ON over GC
    // Calculate Recovery Reserve To Total Claim Incurred Balance - Off over GC
    // Calculate Recovery Reserve To Total Claim Incurred Balance - ON over VA
    // Calculate Recovery Reserve To Total Claim Reserve Balance - Off over VA


    test('AssureClaims_ReserveRecover_ConfigurationSettings_Test_01', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!".green)
        //=============================================================Configuration ManagerSettings for WC claims======================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Workers' Compensation Claim Parameters", "wc", "Reserve", "Collections/Recoveries")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculateCollectioninReserveBalance, 'Check', "Check for Recovery Reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculateCollectioninIncurredBalance, 'Uncheck', "Uncheck incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //=============================================================Configuration ManagerSettings for PC claims======================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Property Claim Parameters", "pc", "Reserve", "Collections/Recoveries")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PCP_POM.AssureClaims_PCClaimsParamerter_Btn_CalculateCollectioninReserveBalance, 'Uncheck', "UnCheck for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PCP_POM.AssureClaims_PCClaimsParamerter_Btn_CalculateCollectioninIncurredBalance, 'Check', "check incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //=============================================================Configuration ManagerSettings for GC claims======================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalBalanceAmount, 'Check', "Check for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalIncurredAmount, 'Uncheck', "uncheck incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //=============================================================Configuration Manager Settings for VC claims======================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Vehicle Accident Claim Parameters", "va", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(VCP_POM.AssureClaims_VAClaimsParamerter_Btn_AddRecoveryReservetoTotalBalanceAmount, 'Uncheck', "UnCheck for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(VCP_POM.AssureClaims_VAClaimsParamerter_Btn_AddRecoveryReservetoTotalIncurredAmount, 'Check', "Check incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")


      
    });

    // Create WC Claim
    // Create Recovery Reeserve (RR) of $100
    // Create Non-Recovery Rreserve (NRR) of $100
    // Create a collectoin on RR of $20
    // Create a collectoin on NRR of $20
    // Verifiy on the reserve Grid,
    // Verify for RR, Reserve Balance = $100 - Collection Amount ($20) = $80, Collection = $20 & Incurred $100
    // Verify for NRR, Reserve Balance = $100 + Collection Amount ($20) = $120, Collection = $20 & Incurred $100

    test('AssureClaims_WCReserveRecovery_Test_02', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //=============================================================login to  Claims Zone=========================================================================================================
        await t.wait(3000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_WorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        //===========================================================Worker Compensation Claim Creation====================================================================================================================
        strWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.WCClaimType, data.EmpolyeeNumber, data.WCJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + strWCClaimNumber);
        await t.wait(3000)
        await Function_Utility.AssureClaims_Reserve_Utility(data.RecoveryReserveType, "100", data.ReserveStatus)
        //==============================================================recovery reserve created===============================================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_WorkerCompensation_ClaimWCIFrame);
        await Function_Utility.AssureClaims_NReserve_Utility(data.NR_ReserveType, "100", data.ReserveStatus)
        //===============================================================non-recovery reserve created===============================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.RecoveryTransactionType, "20")
        // ================================================================Collection is Created for recovery reserve type=============================================================================================================== 
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_NR, "20")
        //================================================================== Collection is Created for Non recovery reserve type ========================================================================================================
        await t.wait(7000);
        //===================================================================verification on reserve listing Started Here============================================================================================================ 
        const Header1 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value1 = [data.RecoveryReserveType, "$80.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.RecoveryReserveType, "Wc.reserve listing", Header1, Value1)
        await t.wait(7000);
        const Header2 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value2 = [data.NR_ReserveType, "$120.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.NR_ReserveType, "Wcreserve listing", Header2, Value2)
        //====================================================================verification on reserve listing Ended Here=================================================================================================================
    });

    // Create PC Claim
    // Create Recovery Reeserve (RR) of $100
    // Create Non-Recovery Rreserve (NRR) of $100
    // Create a collectoin on RR of $20
    // Create a collectoin on NRR of $20
    // Verifiy on the reserve Grid,
    // Verify for RR, Reserve Balance = $100 - Collection Amount ($20) = $80, Collection = $20 & Incurred $100
    // Verify for NRR, Reserve Balance = $100, Collection = $20 & Incurred = $100 - Collection Amount ($20) = $80

    test('AssureClaims_ReserveRecoveryOnPC_Test_03', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //=======================================================================Property Claim Creation===========================================================================================================
        console.log("AssureClaims_PropertyClaimCreation Function is Called To Create Property Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_PropertyClaimCreation(d, d, data.ClaimStatus, data.PCClaimType, data.Department, data.PCPolicyLOB, data.PropertyId)
        console.log("New Property Claim is Created with Claim Number: ".green + strClaimNumber);
        await t.wait(3000)
        await Function_Utility.AssureClaims_Reserve_Utility(data.RecoveryReserveType, "100", data.ReserveStatus)
        //==================================================================recovery reserve created==============================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe);
        await Function_Utility.AssureClaims_NReserve_Utility(data.NR_ReserveType, "100", data.ReserveStatus)
        //=================================================================non-recovery reserve created============================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.RecoveryTransactionType, "20")
        //================================================================== Collection is Created for Non recovery reserve type ==================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_NR, "20")
        await t.wait(3000)
        // ===================================================================Collection is Created for  recovery reserve type======================================================================================== 
        //===================================================================verification on reserve listing Stareted Here================================================================================================ 
        const Header3 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value3 = [data.RecoveryReserveType, "$80.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.RecoveryReserveType, "Wc.reserve listing", Header3, Value3)
        await t.wait(7000);
        const Header4 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value4 = [data.NR_ReserveType, "$100.00", "$80.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.NR_ReserveType, "Wcreserve listing", Header4, Value4)
        //=======================================================================verification on reserve listing Ended Here===========================================================================================
    });

    // Create VA Claim
    // Create Recovery Reeserve (RR) of $100
    // Create Non-Recovery Rreserve (NRR) of $100
    // Create a collection on RR of $20
    // Create a collection on NRR of $20
    // Verifiy on the reserve Grid,
    // Verify for RR, Reserve Balance = $100 - Collection Amount ($20) = $80, Collection = $20 & Incurred $100
    // Verify for NRR, Reserve Balance = $100, Collection = $20 & Incurred = $100
    // Verify Total Balance = Balance of NRR($100) - Balance of RR ($80) = $20, Total Paid = $0, Total Collection = $40 & Total Incurred = Incurred of NRR ($100) - Incurred of RR ($100) = $0
    test('AssureClaims_ReserveRecoveryOnVC_Test_04', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        console.log("AssureClaims_VehicleAccidentClaimCreation Function is Called To Create Vehicle Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_VehicleAccidentClaimCreation(d, d, data.ClaimStatus, data.VAClaimType, data.Department, data.VAPolicyLOB)
        console.log("New Vehicle Claim is Created with Claim Number: ".green + strClaimNumber);
        //================================================================================Vehicle Claim Created==============================================================================================================
        //recovery reserve created
        await Function_Utility.AssureClaims_Reserve_Utility(data.RecoveryReserveType, "100", data.ReserveStatus)
        //===============================================================================recovery reserve created======================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await Function_Utility.AssureClaims_NReserve_Utility(data.NR_ReserveType, "100", data.ReserveStatus)
        //=================================================================================non-recovery reserve created====================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.RecoveryTransactionType, "20")
        //============================================================================== Collection is Created for  recovery reserve type======================================================================================= 
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_NR, "20")
        //=============================================================================== Collection is Created for Non recovery reserve type =================================================================================================
        await t.wait(3000)
        //================================================================================verification on reserve listing Started Here========================================================================================================== 
        const Header5 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value5 = [data.RecoveryReserveType, "$80.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.RecoveryReserveType, "Wc.reserve listing", Header5, Value5)
        await t.wait(7000);
        const Header6 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value6 = [data.NR_ReserveType, "$100.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.NR_ReserveType, "Wcreserve listing", Header6, Value6)
        //===============================================================================verification on reserve listing Started Here===============================================================================================================
    });

    // Create GC Claim
    // Create Recovery Reeserve (RR) of $100
    // Create Non-Recovery Rreserve (NRR) of $100
    // Create a collection on RR of $20
    // Create a collection on NRR of $20
    // Verifiy on the reserve Grid,
    // Verify for RR, Reserve Balance = $100 - Collection Amount ($20) = $80, Collection = $20 & Incurred $100
    // Verify for NRR, Reserve Balance = $100, Collection = $20 & Incurred = $100
    test('AssureClaims_ReserveRecoveryOnGC_Test_05', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //=============================================================== Gc Claim Creation Started Here==========================================================================================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //==============================================================Claim Creation  completed========================================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_Reserve_Utility(data.RecoveryReserveType, "100", data.ReserveStatus)
        //==================================================================recovery reserve created=========================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await Function_Utility.AssureClaims_NReserve_Utility(data.NR_ReserveType, "100", data.ReserveStatus)
        //========================================================================non-recovery reserve created==================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.RecoveryTransactionType, "20")
        //========================================================================== Collection is Created for  recovery reserve type================================================================================================ 
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_NR, "20")
        //======================================================================= Collection is Created for Non recovery reserve type============================================================================================= 
        await t.wait(3000)
        //==========================================================================verification on reserve listing Started Here=========================================================================================== 
        const Header7 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value7 = [data.RecoveryReserveType, "$80.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.RecoveryReserveType, "Wc.reserve listing", Header7, Value7)
        await t.wait(7000);
        const Header8 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value8 = [data.NR_ReserveType, "$100.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.NR_ReserveType, "Wcreserve listing", Header8, Value8)
        //=============================================================================verification on reserve listing Ended Here==============================================================================================================
    });

    // From Configuration Manager Parameter Setting
    // Calculate Recovery Reserve To Total Claim Incurred Balance - ON over GC
    // Calculate Recovery Reserve To Total Claim Reserve Balance - ON over GC
    // 2. Create GC Claim
    // 3. Create Recovery Reeserve (RR) of $100
    // 4. Create Non-Recovery Rreserve (NRR) of $100
    // 5. Create a collection on RR of $20
    // 6. Create a collection on NRR of $20
    // 7. Verifiy on the reserve Grid,
    // 7.1. Verify for RR, Reserve Balance = $100 - Collection Amount ($20) = $80, Collection = $20 & Incurred $100
    // 7.2 Verify for NRR, Reserve Balance = $100, Collection = $20 & Incurred = $100
    // 7.3 Verify Total Balance = Balance of NRR($100) + Balance of RR ($80) = $180, Total Paid = $0, TOtal Collection = $40 & Total Incurred = Incurred of NRR ($100) - Incurred of RR ($100) = $0
    
    test('AssureClaims_ReserveRecoveryOnGC_Test_06', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalBalanceAmount, 'Check', "Check for recovery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalIncurredAmount, 'Check', "Check incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Claims");
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //=================================================================================Claim Creation Started Here======================================================================================
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //==================================================================================Claim Creation  completed======================================================================================
        await t.wait(3000)
        await Function_Utility.AssureClaims_Reserve_Utility(data.RecoveryReserveType, "100", data.ReserveStatus)
        //=================================================================================recovery reserve created=====================================================================================================================
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.dvbreadcrumbscroll, "Breadcrumbs Clicked")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Function_Utility.AssureClaims_NReserve_Utility(data.NR_ReserveType, "100", data.ReserveStatus)
        //==========================================================================non-recovery reserve created=======================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow_2, "Grid Window")
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.RecoveryTransactionType, "20")
        // ===========================================================================Collection is Created for Non recovery reserve type ===================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window 2 selected");
        await Function_Utility.AssureClaims_NCollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType_NR, "20")
        // =======================================================================Collection is Created for Non  recovery reserve type========================================================================================================= 
        await t.wait(3000)
        //=========================================================================verification on reserve listing Started Here================================================================================================================ 
        const Header9 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value9 = [data.NR_ReserveType, "$100.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.NR_ReserveType, "GCreserve listing", Header9, Value9)
        await t.wait(7000);
        const Header10 = ["Reserve Type", "Balance", "Incurred", "Collection"]
        const Value10 = [data.RecoveryReserveType, "$80.00", "$100.00", "$20.00"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(data.RecoveryReserveType, "Wcreserve listing", Header10, Value10)
        //==============================================================================verification on reserve listing Ended Here===============================================================================================================

    });

    //Revert Setting testcase
    test('AssureClaims_ReserveRecover_RevertUtilitiesSettings_Test_07', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!".green)
        //=============================================================Configuration Manager Settings for Wc claims======================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Workers' Compensation Claim Parameters", "wc", "Reserve", "Collections/Recoveries")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(WCP_POM.AssureClaims_WCClaimParameters_Btn_CalculateCollectioninReserveBalance, 'UnCheck', "UnCheck for recvery reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        // ===================================================================Configuration Manager Settings for Pc claims====================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Property Claim Parameters", "pc", "Reserve", "Collections/Recoveries")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PCP_POM.AssureClaims_PCClaimsParamerter_Btn_CalculateCollectioninReserveBalance, 'Uncheck', "UnCheck for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(PCP_POM.AssureClaims_PCClaimsParamerter_Btn_CalculateCollectioninIncurredBalance, 'Uncheck', "Uncheck incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //=============================================================Configuration Manager Settings for Gc claims======================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalBalanceAmount, 'UnCheck', "UnCheck for recvery reserve")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(GCP_POM.AssureClaims_GeneralClaimParameter_Btn_AddRecoveryReservetoTotalIncurredAmount, 'Uncheck', "Uncheck incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //=====================================================================Configuration Manager Settings for VC claims===============================================================================================================
        await t.wait(5000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button clicked")
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Vehicle Accident Claim Parameters", "va", "Reserve", "Collections/Recoveries")
        await t.wait(5000);
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(VCP_POM.AssureClaims_VAClaimsParamerter_Btn_AddRecoveryReservetoTotalIncurredAmount, 'UnCheck', "uncheck incurred collection")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        
    });


});
