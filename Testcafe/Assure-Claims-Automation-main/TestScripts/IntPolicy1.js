import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Home from '../Functional_POM/POM_Home';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_FinancialReserves from '../Functional_POM/POM_FinancialReserves';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_PolicyTracking from '../Functional_POM/POM_PolicyTracking';
import POM_LobParameters from '../Functional_POM/POM_LobParameters';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const Maint_Utility = new Maintenance_Functionality_Utility();
const ConfigMgr_POM = new POM_Config_Manager();
const PolicyTracking = new POM_PolicyTracking();
const Payment_POM = new POM_PaymentsCollections();
const Reserve_Utility = new POM_FinancialReserves();
const DataIUT = require('../DataFiles/DataAutoRegDSN_3.json');
const Home_POM = new POM_Home();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Lobpar_POM = new POM_LobParameters();

var faker = require('faker');

var PolicyName;
var StrClaimNumber;
var LastName1
var LastName2

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-85404,RMA-102193
//Description : NONE
//AUTHOR : Maddula, Sai krishna, Yashaswi Mendhekar
//DEPENDANCY : No
//PRE-REQUISITE : While Running make sure that in in policy tracking coverage type & in gc claimtype parent code should be same
//Preferred Server : Auto Regression Env, DSN2
//*********************************************************************************************************************************************

DataIUT.forEach(data => {
    fixture`IntPolicy1`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });
    
    //Turning Off Configuration Manager Setting For Policy Tracking From General Claim Parameter--> Third Party Module Started Here
    test('AssureClaims_PolicyTracking_utilities_settings_Test01', async t => {

        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        console.log("Login Into Application!!--> Configuration Manager ".bgCyan)
        await t.wait(4000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Third Party Module", "Policy Management")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Lobpar_POM.AssureClaimsApp_LOBParameter_Chk_UsePolicyManagementSystem,'UnCheck', "Unchecked Enable Multiple Addresses for Entities")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")    
    })
    //Turning Off Configuration Manager Setting For Policy Tracking From General Claim Parameter--> Third Party Module Ended Here

    //Creating Entity As Entity Type As Policy MCO For Adding Policy MCO In Last TestCases Started Here  
    test('Entity Creation From Maintenance_Test_02', async t => {

        console.log("Entity Creation From Maintenance_Test_02 Started".rainbow);
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application->Maintenance!!".green)

        //===============================================Entity Maintenance Start Here=================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
        LastName1 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityTypePolicyMCO, "SSN", "");
        console.log("First Entity is Created with Last Name: ".green + LastName1);
        //New Entity Is Created
        //=================================================Entity Maintenance End Here===============================================

    });
    //Creating Entity As Entity Type As Policy MCO For Adding Policy MCO In Last TestCases Ended Here

    //Creating Another Entity As Entity Type As Policy MCO For Adding Policy MCO In Last TestCases Started Here
    test('Entity Creation From Maintenance_Test_03', async t => {

        console.log("Entity Creation From Maintenance_Test_03 Started".rainbow);
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application->Maintenance!!".green)

        //===============================================Entity Maintenance Start Here=================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
        LastName2 = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityTypePolicyMCO, "SSN", "");
        console.log("Second Entity is Created with Last Name: ".green + LastName2);
        //==================================================New Entity Is Created========================================================
        //=================================================Entity Maintenance End Here===============================================

    });
    //Creating Another Entity As Entity Type As Policy MCO For Adding Policy MCO In Last TestCases Ended Here

    //Creating Policy Tracking(Internal Policy) From Maintenance Started Here
    test('PolicyTracking Creation From Maintenance_Test_04', async t => {

        console.log("PolicyTracking Creation From Maintenance_Test_04 Started".rainbow);
        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application->Maintenance!!".green)
        PolicyName = await Maint_Utility.AssureClaims_PolicyTrackingCreation(data.Premium, data.InternalPolicyStatus, data.InternalPolicyLOB, data.InternalInsurer, data.InternalInsured, data.InternalInsured1, data.InternalCoverageType, data.InternalPolicyLimit, data.InternalPolicyMco);
        console.log("New Internal Policy is Created with Policy Name: ".green + PolicyName);

    });
    //Creating Policy Tracking(Internal Policy) From Maintenance Ended Here

    //Attaching Internal Policy To General Claim Creation Started Here
    test('GeneralClaim with Internal Policy Attach Creation Test_05', async t => {

        console.log("GeneralClaim Creation_Test_05 Started".rainbow);
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log(`Login Into Application->Claims`)
        //Login Into Application with User  
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create GeneralClaim".yellow);
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.InternalGCClaimType, data.Department, data.GCPolicyLOB);
        console.log("New ClaimNumber is Created with ID: ".green + StrClaimNumber);
        //==========================================New GeneralClaim Is Created====================================================
        //==============================================Attaching Policy To the Claim=============================================
        await t.wait(4000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup clicked")
        await t.wait(6000);
        await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_PolicyTracking_Txt_PolicyName, PolicyName, "Address1 TextBox")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_GenericClaim_Lnk_PolicyName.withText(PolicyName), "PolicyName link clicked")
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On PolicyTracking creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
    });
    //Attaching Internal Policy To General Claim Creation Ended Here

    //Reserve creation For Attaching Internal Policy To General Claim Creation Started Here
    test('Reserve  Creation On Attached Internal Policy Test_06', async t => {

        console.log("Reserve Creation_Test_06 Started".rainbow);
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log(`Login Into Application->Claims`)
        //Login Into Application with User 

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        //Claim with Attached internal Policy is Searched
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(3000)
        //--------------------------------Reserve Creation------------------------------------------------
        console.log("AssureClaims_Reserve_Utility Function is Called To Create Reserve ".yellow);
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
        console.log("New Reserve is Created");
        //==========================New Reserve Is Created==================================================
    });
    //Reserve creation For Attaching Internal Policy To General Claim Creation Ended Here

    //Payment creation For Attaching Internal Policy To General Claim Creation Started Here
    test('Payment  Creation On Attached Internal Policy Test_07', async t => {

        console.log("Payment Creation_Test_07 Started".rainbow);
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log(`Login Into Application->Claims`)
        //Login Into Application with User 

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        //Claim with Attached internal Policy is Searched
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
        //---------------------------------------------Payment Creation------------------------------------------------------
        console.log("AssureClaims_PaymentCorpAddition_Utility Function is Called To Create Payment ".yellow);
        await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.PaymentAmount)
        console.log("New Combined Payment is Created");
    });
    //Payment creation For Attaching Internal Policy To General Claim Creation Ended Here

    //Collection creation For Attaching Internal Policy To General Claim Creation Started Here
    test('Collection Creation Attached Internal Policy Test_08', async t => {

        console.log("Collection Creation_Test_08 Started".rainbow);
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        console.log(`Login Into Application->Claims`)
        //Login Into Application with User 

        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        //Claim with Attached internal Policy is Searched
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Reserve_Utility.AssureClaims_SelectFinancialReserve, "Click On Financial Reserve")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
        //---------------------------------------------Collection Creation------------------------------------------------------
        console.log("AssureClaims_CollectionCorpAddition_Utility Function is Called To Create Reserve ".yellow);
        await Function_Utility.AssureClaims_CollectionCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, "NA", data.TransactionType, data.PaymentAmount)
        console.log("New Payment is Created");
        //New Collection Is Created
    });
    //Collection creation For Attaching Internal Policy To General Claim Creation Ended Here

    //Searching Internal Policy For Adding Policy MCO Started Here
    test('Search Policy From Maintenance Test_09', async t => {

        console.log("Search Policy From Maintenance Test_09 Started".rainbow);
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        console.log(`Login Into Application->Maintenance`)
        //Login Into Application with User 

        await Maint_Utility.AssureClaims_SearchClaim(PolicyName)
        //Search Is Complete
        await t.wait(8000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "First Close Button on Left Hand Side Of Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "First Close Button on Left Hand Side Of Screen")
        // await t.switchToMainWindow();
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_AddBtn_PolicyMCO, "Add Policy MCO Button on PolicyTracking Page")
        //Searching for Policy Mco From POlicy MCO field in policy tracking screen Start's Here
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_PolicyTracking_Btn_Policy_MCO_Search, "Policy MCO Look Up Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_PolicyTracking_Txt_SearchPolicyMCO_LastName, LastName2, "LastName Text Box On Policy MCO Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_SubmitQuery, "Search Image On Policy MCO Search Window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_PolicyTracking_Txt_PropertyId.withText(data.PolicyMCO), "LastName Link On Policy MCO Selection Window")
        await t.wait(2000);
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
        await t.wait(5000)
        //Searching for Policy Mco From POlicy MCO field in policy tracking screen End's Here
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On PolicyTracking creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
        await t.switchToMainWindow();
        await t.wait(2000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back btn pressed");
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_AddBtn_PolicyMCO, "Add Policy MCO Button on PolicyTracking Page")
        //Searching for Policy Mco From POlicy MCO field in policy tracking screen Start's Here
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_PolicyTracking_Btn_Policy_MCO_Search, "Policy MCO Look Up Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_PolicyTracking_Txt_SearchPolicyMCO_LastName, LastName2, "LastName Text Box On Policy MCO Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_SubmitQuery, "Search Image On Policy MCO Search Window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_PolicyTracking_Txt_PropertyId.withText(data.PolicyMCO), "LastName Link On Policy MCO Selection Window")
        await t.wait(2000);
        await t.switchToMainWindow();
        await t.wait(3000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
        await t.wait(5000)
        //Searching for Policy Mco From POlicy MCO field in policy tracking screen End's Here
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On PolicyTracking creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
        //--------------------Editing Second Policy MCO---------------------------------------------------------------------------------
        await t
            .doubleClick(PolicyTracking.AssureClaims_Policy_Txt_PolicyMCO)
        await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyMCO, LastName1, "PolicyMCO")
        await t.pressKey('tab');
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On PolicyTracking creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
        //--------------------------------------------Delete of Second Policy Mco------------------------------------------------------
        await Function_Utility.AssureClaims_GenericDelete_Utility("False", "PolicyMCO Creation Screen", "", "");
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "PolicyMCO Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "PolicyMCO Creation Screen");
        //Created Policy MCO Entity Is Deleted Here
        await t.switchToMainWindow();
        await t.wait(3000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Lnk_PolicyCoverage.withText(data.InternalCoverageType), " Policy Coverage Link on PolicyTracking Page")
        //--------------------------------------------Delete of Policy Coverage------------------------------------------------------
        await Function_Utility.AssureClaims_GenericDelete_Utility("False", "PolicyCoverage Creation Screen", "", "");
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "PolicyCoverage Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "PolicyCoverage Creation Screen");
        //Created Policy Coverage Entity Is Deleted Here
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
        await t.wait(5000)
        //--------------------------------------------Delete of Internal Policy------------------------------------------------------
        await Function_Utility.AssureClaims_GenericDelete_Utility("False", "Policy Creation Screen", "", "");
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Policy Creation Screen", "", "");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_RecordDeleteMessage, false, "Policy Creation Screen");
        //Created Policy Entity Is Deleted Here

    });
})
