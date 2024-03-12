import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import POM_DisabilityPlanManagement from '../Functional_POM/POM_DisabilityPlanManagement'
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_AutoAssignAdjuster from '../Functional_POM/POM_AutoAssignAdjuster';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';
import POM_People from '../Functional_POM/POM_People';
import POM_Search from '../Functional_POM/POM_Search';

const Maint_Utility = new Maintenance_Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Generic_Claims = new POM_Generic_Claims();
const DisabilityPlan_Utility = new POM_DisabilityPlanManagement();
const Verification_Msg = new POM_VerificationMessage();
const AutoAssignAdjuster_POM = new POM_AutoAssignAdjuster();
const ConfigMgr_POM = new POM_Config_Manager();
const People_POM = new POM_People();
const Verify_Utility = new Verification_Utility();
const Search_POM = new POM_Search();
const Home_POM = new POM_Home();

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

var strPlanName;
var strAdj1 = "AutoAdjWCNonOcc1";
var strAdj2 = "AutoAdjWCNonOcc2";
var strAdj3 = "AutoAdjWCNonOcc3";
var strTypeOfPerson = "Adjusters";

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-90835,RMA-93952, RMA-106953
//Description      : Create 3 adjusters & disability plan
                     //Check settings ("Prioritize adjusters handling existing claims (WC/Non occ only)")for Auto Assign Adjuster & create 2 adjuster record
                     //Create WC,NonOCC with same employee number verify first adjuster is getting attached
                     //Create WC,NonOCC with different employee number verify second adjuster is getting attached
                     //Uncheck setting ("Prioritize adjusters handling existing claims (WC/Non occ only)") , create one more adjuster record 
                     //Create WC with first employee number &  verify last updated adjuster is getting attached with setting off
                     //Create NonOcc with second employee number &  verify adjuster started attaching serially with setting off
                     //Revert settings
                     //Delete created adjuster
//AUTHOR           : Saikrishna, Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES   : 
//Preferred Server : AutoReg(DSN2)
// *******************************************************************************************************************************

//=======================================Function for create auto assign adjuster record over CM Starts Here=================================================================================================================
const createAdjusterRecord = async (strAdjusterLastname, strSelectAdjuster, strDepartment, strLOBFirst, strLOBSecond, strClaimTypeFirst, strClaimTypeSecond, strJurisdiction) => {

    await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Btn_AddAdjuster, "Add Adjuster")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(0), "adjuster arrow button")
    await In_Utility.AssureClaims_SetValue_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Txt_Lastname, strAdjusterLastname, "Last name textbox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Btn_SearchButton, "Search button")
    var anchorTagSelector = await Home_POM.AssureClaims_Generic_CustomTagSelector("a");
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strSelectAdjuster), "select adjuster")
    await t.wait(3000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(1), "department arrow button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strDepartment), "select department")
    await t.wait(1000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(2), "LOB arrow button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strLOBFirst), "select LOB")
    await t.wait(1000)
    if (strLOBSecond != "NA") {
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(2), "LOB arrow button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strLOBSecond), "select LOB")
    }
    await t.wait(1000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(3), "Claim Type arrow button")
    await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", strClaimTypeFirst)
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strClaimTypeFirst), "select claim type code")
    await t.wait(1000)
    if (strClaimTypeSecond != "NA") {
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(3), "Claim Type arrow button")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", strClaimTypeSecond)
        await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strClaimTypeSecond), "select claim type code")
    }

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(4), "Jurisdiction arrow button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strJurisdiction), "select jurisdition code")
    await t.wait(1000)

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_Save, "Save record")

}
//=======================================Function for create auto assign adjuster record over CM Ends Here=================================================================================================================


//=======================================Function for delete adjuster over maintenance Starts Here=================================================================================================================
const deleteAdjuster = async (strAdjusterLastname) => {

    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, strAdjusterLastname, "entity lastname")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.nth(0), "Entity LastName link")
    await t.switchToMainWindow();
    await t.wait(4000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleAfterSearchFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteRecord, "Delete entity");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK, "Ok button");
    await t.wait(5000)

}
//=======================================Function for delete adjuster over maintenance Ends Here=================================================================================================================


DataIUT.forEach(data => {
    const MaintenanceLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application-->Maintenance!!".green)
    }, { preserveUrl: true }
    );

    const ClaimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const CMLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );


    fixture`AutoAssignAdjuster2_WCNONOCC`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        await t.wait(3000)
    });


    /*
    1)Login into maintenance zone
    2)Create 3 adjusters ("AutoAdjWCNonOcc1", "AutoAdjWCNonOcc2", "AutoAdjWCNonOcc3")
    3)Create Disability Plan Management
    */
    test('AssureClaims_CreationOfAdjusterAndDisabilityPlanManagement_Test_01', async t => {

        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        //=======================================create first adjuster (AutoAdjWCNonOcc1) starts Here=================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
        await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, strAdj1, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, strTypeOfPerson, "Type Of Entity Drop Down On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //======================================create first adjuster (AutoAdjWCNonOcc1) ends Here=================================================================================================================

        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")

        //======================================create second adjuster (AutoAdjWCNonOcc2) starts Here=================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
        await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, strAdj2, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, strTypeOfPerson, "Type Of Entity Drop Down On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //======================================create second adjuster (AutoAdjWCNonOcc2) ends Here=================================================================================================================

        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")

        //======================================create third adjuster (AutoAdjWCNonOcc3) starts Here=================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
        await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, strAdj3, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, strTypeOfPerson, "Type Of Entity Drop Down On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //======================================create third adjuster (AutoAdjWCNonOcc3) ends Here=================================================================================================================

        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")

        //======================================create disability plan management starts Here=================================================================================================================
        console.log("AssureClaims_Maintenance_DisabilityPlanCreation_Utility Function is Called To Create Disability Management Plan".yellow);
        strPlanName = await Maint_Utility.AssureClaims_Maintenance_DisabilityPlanCreation_Utility(data.Insured, data.CountryAdjuster, data.PlanStatus, data.Premium, data.BankAccount, data.PayPeriodStartDate, data.PreferredPaymentSchedule, data.MonthlyPaymentType, data.PreferredPrintDate, data.PreferredMonthlyDay, data.PreferredDayOfWeekforPayments);
        console.log("New Disability Plan is Created with strPlanName: ".green + strPlanName);
        await t.wait(9000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Btn_AddPlan, "Add Plan Class");
        await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_HeaderPlanClass, "HeaderPlanClass")
        await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_ClassName, "Class_Test", "Class Name");
        await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Tab_EligibilityWaiting, "Eligibility/Waiting");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_EligibleForBenefitsPeriods, data.Period, "Bankaccount Text Box on Maintenance -> Disability Plan Management Page");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_EligibleForBenefitsFromDateHired, data.FromDateHiredOn, "DateHiredFrom");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_WaitingPeriodFromDisability, data.WaitingPeriodFromDisability, "Waiting Period From Disability");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_WaitDurationType, data.WaitDurationType, "Duration type");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_MaximumDurationOfDisabilityPeriod, data.MaximumDurationOfDisabilityPeriod, "MaximumDuration Of DisabilityPeriod");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_MaximumDurationOfDisabilityFrom, data.MaximumDurationOfDisabilityPeriodFrom, "MaximumDuration Of DisabilityPeriod From");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanClasses_Txt_DetermineWorkWeekDaysType, data.DaysType, "Days Type");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Plan Class Creation Screen");
        //======================================create disability plan management ends Here=================================================================================================================

    })


    /*
    1)Login into CM
    2)Select "Auto Assign Adjuster" as "Date/Time Assigned"
    3)Check setting "Prioritize adjusters handling existing claims (WC/Non occ only)"
    4)Create 2 adjuster record for WC, NonOCC ("AutoAdjWCNonOcc1", "AutoAdjWCNonOcc2")
    */
    test('AssureClaims_CreateAdjusterRecordOverCMAndCheckSetting_Test_02', async t => {


        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        //=================Select "Auto Assign Adjuster" as "Date/Time Assigned" & check Setting "Prioritize adjusters handling existing claims (WC/Non occ only)" Starts Here========================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lst_AutoAssignAdjusterDropdown, "Auto assign adjuster dropdown")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_SelectAutoAssignAdjusterValue.withText("Date/Time Assigned"), "select Date/Time Assigned")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_GSPConfigManagerIFrame)

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_PriortizeAdjusterHandling, "Check", " Prioritize adjusters handling existing claims (WC/Non occ only) check box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button click");

        await In_Utility.AssureClaims_SetValue_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Txt_SearchPage, "Auto Assign Adjuster")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_AutoAssignAdjusterPage, "auto assign adjuster page")
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AutoAssignAdjusterIframe)
        //=================Select "Auto Assign Adjuster" as "Date/Time Assigned" & check Setting "Prioritize adjusters handling existing claims (WC/Non occ only)" ends Here========================================================================================================

        
        //================================Create auto assign adjuster record for WC, NonOCC Starts Here========================================================================================================
        await createAdjusterRecord(strAdj1, "Adjusters", "D - Department", "Worker's Compensation",  "Non-Occupational Claims", "Lost Time", "Long Term Disability", "Alabama")
        await t.wait(5000)

        await createAdjusterRecord(strAdj2, "Adjusters", "D - Department", "Worker's Compensation", "Non-Occupational Claims", "Lost Time", "Long Term Disability", "Alabama")
        await t.wait(5000)
        //================================Create auto assign adjuster record for WC, NonOCC ends Here========================================================================================================

    })

    /*
    1)Login into Claim zone
    2)Create WC with first employee number(for example :- 123)
    3)Verify first adjuster record("AutoAdjWCNonOcc1") is attached 
    */
    test('AssureClaims_CreateWCVerifyFirstAdjusterIsAttached_Test_03', async t => {
       

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        
        //=========================================================== Worker Compensation Claim Creation Started Here===================================================================================================================================================================================
        console.log("AssureClaims_UpdateWorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        var StrWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.PrioritizeAdjusterWCClaimType, data.PrioritizeAdjusterEmployeeNumber, data.PrioritizeAdjusterJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + StrWCClaimNumber);
        //===========================================================Worker Compensation Claim Creation Completed Heree===========================================================================================================================================================================
        
        //============================================================Verification Auto Assign Adjuster Of Prioritize adjusters handling existing claims (WC/Non occ only) is Present  Here==============================================================================================================
        const AutoAssignAdjusterForWC = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj1).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjusterForWC.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //===============================Verification Auto Assign Adjuster Of Prioritize adjusters handling existing claims (WC/Non occ only) is Present  Here===============================================================================================================================================
   
    });

    /*
    1)Login into Claim zone
    2)Create NonOcc with first employee number(for example :- 123)
    3)Verify first adjuster record("AutoAdjWCNonOcc1") is attached 
    */
    test('AssureClaims_CreateNonOccVerifyFirstAdjusterIsAttached_Test_04', async t => {

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        
        //=========================================================== Non Occupational Claim Creation Started Here========================================================================================================================================================================================================================================================================================================
        console.log("AssureClaims_Non Occupational Claim Function is Called To Create Non Occupational Claim".yellow);
        var StrNonOccClaimNumber = await Function_Utility.AssureClaims_NonOccClaimCreation(d, d, data.NonOcc_ClaimStatus, data.PrioritizeAdjusterNONOCCClaimType, data.NonOcc_Department, data.NonOcc_PolicyLOB, data.PrioritizeAdjusterEmployeeNumber, data.PrioritizeAdjusterJurisdiction, strPlanName, data.ClassName, data.DateHired, data.MonthlyRate)
        console.log("New Non Occ Claim is Created with Claim Number: ".green + StrNonOccClaimNumber);
        //===========================================================Non Occupational Claim Creation Completed Heree========================================================================================================================================================================================================================================================================================================
        
        //============================================================Verification Auto Assign Adjuster is Present Starts Here============================================================================================================================================================================================================================================
        const AutoAssignAdjusterForWC = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj1).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjusterForWC.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //============================================================Verification Auto Assign Adjuster is Present Starts Here=======================================================================================================================================================================================================================================================
   
    });

    /*
    1)Login into Claim zone
    2)Create WC with second employee number(for example :- 111)
    3)Verify second adjuster record("AutoAdjWCNonOcc2") is attached 
    */
    test('AssureClaims_CreateWCVerifySecondAdjusterIsAttached_Test_05', async t => {
        
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
       
        //=========================================================== Worker Compensation Claim Creation Started Here===================================================================================================================================================================================
        console.log("AssureClaims_UpdateWorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        var StrWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.PrioritizeAdjusterWCClaimType, data.PrioritizeAdjusterEmployeeNumber1, data.PrioritizeAdjusterJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + StrWCClaimNumber);
        //===========================================================Worker Compensation Claim Creation Completed Heree===========================================================================================================================================================================
        
        //============================================================Verification Auto Assign Adjuster Of Prioritize adjusters handling existing claims (WC/Non occ only) is Present, starts  Here==============================================================================================================
        const AutoAssignAdjusterForWC = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj2).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjusterForWC.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //============================================================Verification Auto Assign Adjuster Of Prioritize adjusters handling existing claims (WC/Non occ only) is Present, ends  Here==============================================================================================================

    });

    /*
    1)Login into Claim zone
    2)Create NonOcc with second employee number(for example :- 111)
    3)Verify second adjuster record("AutoAdjWCNonOcc2") is attached 
    */
    test('AssureClaims_CreateNonOccVerifySecondAdjusterIsAttached_Test_06', async t => {

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        
        //=========================================================== Non Occupational Claim Creation Started Here========================================================================================================================================================================================================================================================================================================
        console.log("AssureClaims_Non Occupational Claim Function is Called To Create Non Occupational Claim".yellow);
        var StrNonOccClaimNumber = await Function_Utility.AssureClaims_NonOccClaimCreation(d, d, data.NonOcc_ClaimStatus, data.PrioritizeAdjusterNONOCCClaimType, data.NonOcc_Department, data.NonOcc_PolicyLOB, data.PrioritizeAdjusterEmployeeNumber1, data.PrioritizeAdjusterJurisdiction, strPlanName, data.ClassName, data.DateHired, data.MonthlyRate)
        console.log("New Non Occ Claim is Created with Claim Number: ".green + StrNonOccClaimNumber);
        //===========================================================Non Occupational Claim Creation Completed Heree========================================================================================================================================================================================================================================================================================================
       
        //============================================================Verification Auto Assign Adjuster is Present Starts Here============================================================================================================================================================================================================================================
        const AutoAssignAdjusterForWC = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj2).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjusterForWC.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //============================================================Verification Auto Assign Adjuster is Present Starts Here=======================================================================================================================================================================================================================================================
    
    });

    /*
    1)Login into CM
    2)UnCheck setting "Prioritize adjusters handling existing claims (WC/Non occ only)"
    3)Create 1 adjuster record ("AutoAdjWCNonOcc3")
    */
    test('AssureClaims_CreateAdjusterRecordOverCMAndUnCheckSetting_Test_07', async t => {


        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        //=================Select Uncheck Setting "Prioritize adjusters handling existing claims (WC/Non occ only)" Starts Here========================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Claim")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_PriortizeAdjusterHandling, "UnCheck", " Prioritize adjusters handling existing claims (WC/Non occ only) check box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        await t.wait(5000);
        //=================Select Uncheck Setting "Prioritize adjusters handling existing claims (WC/Non occ only)" ends Here========================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")

        //================================Create auto assign adjuster record for WC, NonOCC Starts Here========================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Txt_SearchPage, "Auto Assign Adjuster")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_AutoAssignAdjusterPage, "auto assign adjuster page")
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AutoAssignAdjusterIframe)
        await createAdjusterRecord(strAdj3, "Adjusters", "D - Department", "Worker's Compensation", "Non-Occupational Claims", "Lost Time", "Long Term Disability", "Alabama")
        await t.wait(5000)
        //================================Create auto assign adjuster record for WC, NonOCC ends Here========================================================================================================


    })


    /*
    1)Login into Claim zone
    2)Create WC with first employee number(for example :- 123)
    3)Verify with setting off last updated adjuster record i.e.("AutoAdjWCNonOcc3") is attached 
    */
    test('AssureClaims_CreateWCAndVerifyLastUpadatedAdjusterIsAttached_Test_08', async t => {
      
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
      
        //=========================================================== Worker Compensation Claim Creation Started Here===================================================================================================================================================================================
        console.log("AssureClaims_UpdateWorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        var StrWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.PrioritizeAdjusterWCClaimType, data.PrioritizeAdjusterEmployeeNumber, data.PrioritizeAdjusterJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + StrWCClaimNumber);
        //===========================================================Worker Compensation Claim Creation Completed Heree===========================================================================================================================================================================
        
        //============================================================Verification Auto Assign Adjuster Of Prioritize adjusters handling existing claims (WC/Non occ only) is Present, starts  Here==============================================================================================================
        const AutoAssignAdjusterForWC = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj3).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjusterForWC.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //============================================================Verification Auto Assign Adjuster Of Prioritize adjusters handling existing claims (WC/Non occ only) is Present, ends  Here==============================================================================================================
  
    });

    /*
    1)Login into Claim zone
    2)Create NonOcc with second employee number(for example :- 111)
    3)Verify with setting off adjuster record starts attaching serially i.e.("AutoAdjWCNonOcc1") is attached irrespective of employee number
    */
    test('AssureClaims_CreateNonOccAndVerifyAdjusterIsAttachedSeriallyIrrespectiveOfEmployeeNumber_Test_09', async t => {
       
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        
        //=========================================================== Non Occupational Claim Creation Started Here========================================================================================================================================================================================================================================================================================================
        console.log("AssureClaims_Non Occupational Claim Function is Called To Create Non Occupational Claim".yellow);
        var StrNonOccClaimNumber = await Function_Utility.AssureClaims_NonOccClaimCreation(d, d, data.NonOcc_ClaimStatus, data.PrioritizeAdjusterNONOCCClaimType, data.NonOcc_Department, data.NonOcc_PolicyLOB, data.PrioritizeAdjusterEmployeeNumber1, data.PrioritizeAdjusterJurisdiction, strPlanName, data.ClassName, data.DateHired, data.MonthlyRate)
        console.log("New Non Occ Claim is Created with Claim Number: ".green + StrNonOccClaimNumber);
        //===========================================================Non Occupational Claim Creation Completed Heree========================================================================================================================================================================================================================================================================================================
      
        //============================================================Verification Auto Assign Adjuster is Present Starts Here============================================================================================================================================================================================================================================
        const AutoAssignAdjusterForWC = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj1).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjusterForWC.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //============================================================Verification Auto Assign Adjuster is Present Starts Here=======================================================================================================================================================================================================================================================

    })

    /*
    1)Login into CM Zone
    2)Select "Auto Assign Adjuster" as "None"
    3)Uncheck setting "Prioritize adjusters handling existing claims (WC/Non occ only)"
    4)Delete 3 adjuster record 
    */
    test('AssureClaims_DeleteAdjusterRecordOverCMAndRevertSetting_Test_011', async t => {


        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        
        //=====================================================Delete created adjuster record Starts Here========================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Txt_SearchPage, "Auto Assign Adjuster")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_AutoAssignAdjusterPage, "auto assign adjuster page")
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AutoAssignAdjusterIframe)
        await t.wait(5000)
        const iCheckboxCount = await AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_AddedAdjustersCheckbox.count;

        console.log(iCheckboxCount + "  ******")
        for (let i = 0; i < iCheckboxCount; i++) {
            await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_AddedAdjustersCheckbox, "check box")
            await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Btn_DeleteAdjuster, "Delete Button")
            await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ConfirmDelete, "Cofirm delete button")
            //  await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_DeleteMessage, "deleted successfully")
        }
        const iCheckboxCount1 = await AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_AddedAdjustersCheckbox.count;
        console.log(iCheckboxCount1 + "  ******")

        if (iCheckboxCount1 === "0") {
            console.log("all records has been deleted successfully");
        }
        else {
            console.log("all records has not been deleted successfully")
        }
        //=====================================================Delete created adjuster record ends Here========================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")

        //=====================================================Revert auto assign adjuster setting  starts Here========================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lst_AutoAssignAdjusterDropdown, "Auto assign adjuster dropdown")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_SelectAutoAssignAdjusterValue.withText("None"), "select Date/Time Assigned")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_GSPConfigManagerIFrame)

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_PriortizeAdjusterHandling, "UnCheck", " Prioritize adjusters handling existing claims (WC/Non occ only) check box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        //=====================================================Revert auto assign adjuster setting  ends Here========================================================================================================


    })
    //=============================================================Utility General System Parameter Setting For Auto Assign Adjuster Ends Here=======================================================================================================

    /*
    1)Login into maintenace
    2)Delete created adjuster
    */
    test('AssureClaims_DeleteAdjusters_Test_012', async t => {

        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);
        await t.wait(20000)

        //==============================================Delete first adjuster record, started Here=======================================================================================================================================================================================
        await deleteAdjuster(strAdj1)
        await t.wait(3000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")
        //==============================================Delete first adjuster record, ended Here=======================================================================================================================================================================================

        //==============================================Delete second adjuster record, started Here=======================================================================================================================================================================================
        await deleteAdjuster(strAdj2)
        await t.wait(3000)
        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")
        //==============================================Delete second adjuster record, ended Here=======================================================================================================================================================================================


        //==============================================Delete third adjuster record, started Here=======================================================================================================================================================================================
        await deleteAdjuster(strAdj3)
        await t.wait(3000)
        //==============================================Delete third adjuster record, ended Here=======================================================================================================================================================================================
    });
})




