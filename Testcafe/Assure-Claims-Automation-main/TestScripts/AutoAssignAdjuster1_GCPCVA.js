import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Property_Claims from '../Functional_POM/POM_Property_Claims';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_VehicleAccident_Claims from '../Functional_POM/POM_VehicleAccident';
import POM_AutoAssignAdjuster from '../Functional_POM/POM_AutoAssignAdjuster';
import POM_People from '../Functional_POM/POM_People';
import POM_Search from '../Functional_POM/POM_Search';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Claims = new POM_Generic_Claims();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Vehicle_Accident = new POM_VehicleAccident_Claims();
const Property_Claims = new POM_Property_Claims();
const AutoAssignAdjuster_POM = new POM_AutoAssignAdjuster();
const Home_POM = new POM_Home();
const ConfigMgr_POM = new POM_Config_Manager();
const People_POM = new POM_People();
const Search_POM = new POM_Search();

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-92773,	RMA-106953
//Description      : Create 3 adjusters
                     //Check settings for Auto Assign Adjuster
                     //Create GC & verify auto assign adjuster is attached
                     //Mismatch jurisdiction & claim type verify record is not geeting attached 
                     //Perform same steps for PC,VC
                     //Revert settings
                     //Delete created adjuster
//AUTHOR           : Sai krishna Maddula, Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES   : None
//Preferred Server : AutoReg(DSN2)
// *******************************************************************************************************************************


//============================================================================Global Variable Declaration Starts Here=================================================================================================================
var strClaimNumber;
var strAdj1 = "AutoAdj_GC";
var strAdj2 = "AutoAdj_PC";
var strAdj3 = "AutoAdj_VC";
var strTypeOfPerson = "Adjusters";
//============================================================================Global Variable Declaration Ends Here=================================================================================================================

//=======================================Function for create auto assign adjuster record over CM Starts Here=================================================================================================================
const createAdjusterRecord = async (strAdjusterLastname, strSelectAdjuster, strDepartment, strLOBFirst, strLOBSecond, strClaimTypeFirst, strClaimTypeSecond, strJurisdiction) => {

    await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Btn_AddAdjuster, "Add Adjuster")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(0), "adjuster arrow button")
    await In_Utility.AssureClaims_SetValue_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Txt_Lastname, strAdjusterLastname, "Last name textbox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Btn_SearchButton, "Search button")
    var anchorTagSelector = await Home_POM.AssureClaims_Generic_CustomTagSelector("a");
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strSelectAdjuster), "select adjuster")

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(1), "department arrow button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strDepartment), "select department")

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(2), "LOB arrow button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strLOBFirst), "select LOB")

    if (strLOBSecond != "NA") {
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(2), "LOB arrow button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strLOBSecond), "select LOB")
    }

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(3), "Claim Type arrow button")
    await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", strClaimTypeFirst)
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strClaimTypeFirst), "select claim type code")

    if (strClaimTypeSecond != "NA") {
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(3), "Claim Type arrow button")
        await Function_Utility.AssureClaims_FilterByColumnNameOverConfigManager_Utility("Description", strClaimTypeSecond)
        await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strClaimTypeSecond), "select claim type code")
    }

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_ArrowBtn.nth(4), "Jurisdiction arrow button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(anchorTagSelector.withExactText(strJurisdiction), "select jurisdition code")

    await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaimsApp_GenericBtn_Btn_Save, "Save record")

}
//=======================================Function for create auto assign adjuster record over CM ends Here=================================================================================================================

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
//=======================================Function for delete adjuster over maintenance ends Here=================================================================================================================

DataIUT.forEach(data => {

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

    const MaintenanceLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application-->Maintenance!!".green)
    }, { preserveUrl: true }
    );

    fixture`AutoAssignAdjuster1_GCPCVA`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        await t.wait(3000)
    });

    /*
    1)Login into maintenance zone
    2)Create 3 adjusters(AutoAdj_GC, AutoAdj_PC, AutoAdj_VC)
    */
    test('AssureClaims_AdjusterCreation_Test_01', async t => {

        await t.setNativeDialogHandler(() => true).useRole(MaintenanceLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        //================================Create adjuster "AutoAdj_GC" Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
        await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, strAdj1, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, strTypeOfPerson, "Type Of Entity Drop Down On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //================================Create adjuster "AutoAdj_GC" ends Here========================================================================================================

        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")

        //================================Create adjuster "AutoAdj_PC" Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
        await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, strAdj2, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, strTypeOfPerson, "Type Of Entity Drop Down On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //================================Create adjuster "AutoAdj_PC" ends Here========================================================================================================

        await t.switchToMainWindow()
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close left window")

        //================================Create adjuster "AutoAdj_VC" Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
        await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, strAdj3, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, strTypeOfPerson, "Type Of Entity Drop Down On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        //================================Create adjuster "AutoAdj_VC" ends Here========================================================================================================

    })

    /*
    1)Login into CM
    2)Select "Auto Assign Adjuster" as "Date/Time Assigned"
    3)Uncheck setting "Prioritize adjusters handling existing claims (WC/Non occ only)"
    4)Create 3 adjuster record for GC, PC VC ("AutoAdj_GC", "AutoAdj_PC", "AutoAdj_VC")
    */
    test('AssureClaims_CreateAdjusterRecordOverCMAndCheckSetting_Test_02', async t => {


        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        //=================Select "Auto Assign Adjuster" as "Date/Time Assigned" & Uncheck Setting "Prioritize adjusters handling existing claims (WC/Non occ only)" Starts Here========================================================================================================
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "System", "Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lst_AutoAssignAdjusterDropdown, "Auto assign adjuster dropdown")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_SelectAutoAssignAdjusterValue.withText("Date/Time Assigned"), "select Date/Time Assigned")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_ReloadButtton, "reload button")
        await t.wait(5000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_GSPConfigManagerIFrame)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Chk_PriortizeAdjusterHandling, "UnCheck", " Prioritize adjusters handling existing claims (WC/Non occ only) check box")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_Save, "Save")
        //================Select "Auto Assign Adjuster" as "Date/Time Assigned" & Uncheck Setting "Prioritize adjusters handling existing claims (WC/Non occ only)" ends Here========================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu button click");

        await In_Utility.AssureClaims_SetValue_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Txt_SearchPage, "Auto Assign Adjuster")
        await Nav_Utility.AssureClaims_ElementClick_Utility(AutoAssignAdjuster_POM.AssureClaimsApp_AutoAssignAdjuster_Lnk_AutoAssignAdjusterPage, "auto assign adjuster page")
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssureClaims_AutoAssignAdjusterIframe)

        //================================Create auto assign adjuster record for GC,PC ,VC Starts Here========================================================================================================
        await createAdjusterRecord(strAdj1, "Adjusters", "D - Department", "General Claims", "NA", "Director & Officers", "NA", "California")
        await t.wait(5000)

        await createAdjusterRecord(strAdj2, "Adjusters", "D - Department", "Property Claims", "NA", "Property Damage", "NA", "California")
        await t.wait(5000)

        await createAdjusterRecord(strAdj3, "Adjusters", "D - Department", "Vehicle Accident Claims", "NA", "Auto Property Damage", "NA", "California")
        await t.wait(5000)
        //================================Create auto assign adjuster record for GC,PC,VC ends Here========================================================================================================

    })

    /*
    1)Login into Claim zone
    2)Create GC
    3)Verify AutoAssignAdjuster("AutoAdj_GC") is Attached
    */
    test('AssureClaims_GCCreation_AutoAssignAdjusterMatchesDepartmentClaimTypeJurisdiction_Test_03', async t => {
      
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");

        //================================Claim Creation Start's Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele2 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterGCClaimType).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withText(data.GCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdiction, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //==============================================================Claim Creation End's Here========================================================================================================
     
        //=============================================================Verification Of AutoAssignAdjuster Starts Here====================================================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj1).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //==============================================================Ends Verification Of AutoAssignAdjuster Starts Here=============================================================================================
      
       //==============================================================Fetching ClaimNumber Starts Here=============================================================================================
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //=============================================================Fetching ClaimNumber Ends Here =============================================================================================     
    });

    /*
    1)Login into claim zone
    2)Create GC with mismatch jurisdiction
    3)Verify AutoAssignAdjuster is not Attached
    */
    test('AssureClaims_GCCreation_AutoAssignAdjusterNotExistDueToMismatchJurisdiction_Test_04', async t => {
      
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
      
        //===================================================================================Claim Creation Starts Here================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele2 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterGCClaimType).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withText(data.GCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdictionMismatch, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdictionMismatch).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //===================================================================================Claim Creation Ends Here================================================================================
        
        //=================================================================Starts Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType=======================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj1).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).notOk('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //===================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType================================================================
        
        //====================================================================================Fetching Claim NUmber Starts Here=============================================================================================      
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //========================================================================================Fetching Claim NUmber Ends Here=====================================================================================      
    });

    
    /*
    1)Login into claim zone
    2)Create GC with mismatch claim type
    3)Verify AutoAssignAdjuster is not Attached
    */
    test('AssureClaims_GCCreation_AutoAssignAdjusterNotExistDueToMismatchClaimType_Test_05', async t => {
        
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
       
        //===================================================================================Claim Creation Starts Here=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele1 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele2 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterGCClaimTypeMismatch).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele2, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele3 = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withText(data.GCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele3, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdictionMismatch, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdictionMismatch).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //===================================================================================Claim Creation Ends Here=============================================================================================
        
        //========================================================================Starts Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType===================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj1).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).notOk('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //=========================================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType==========================================================
        
        //=========================================================================Fetching Claim NUmber Starts Here========================================================================================================      
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        //==========================================================================Fetching Claim NUmber Starts Here====================================================================================      
    });

    /*
    1)Login into claim zone
    2)Create PC
    3)Verify AutoAssignAdjuster("AutoAdj_PC") is Attached
    */
    test('AssureClaims_PCCreation_AutoAssignAdjusterMatchesDepartmentClaimTypeJurisdiction_Test_06', async t => {
       
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
      
        //=====================================================================================Claim Creation Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Property Claim")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_PCStatus = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_PCStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_PCType = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterPCClaimType).with({ visibilityCheck: true })
        await t.expect(ele_PCType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const elePCPolicyLOB = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectPolicyLOB.withText(data.PCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(elePCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(elePCPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_PropertyInfo, "Property Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PropertyId, "Property Id Look Up Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_SearchPropertyId, data.PropertyId, "Property ID Text Box On Property Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_SearchCriteria_Btn_SubmitQuery, "Search Image On Property Search Window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.PropertyClaimCreation_Txt_PropertyId.withText(data.PropertyId), "Property Id Link On Property Selection Window")
        await t.wait(2000);
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_ClaimInfo, "Claim Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdiction, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //=====================================================================================Claim Creation Ends Here========================================================================================================
       
        //===============================================================================Starts Verification Of AutoAssignAdjuster Is Present=======================================================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj2).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //===========================================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType======================================================================
        
        //===============================================================================Fetching Claim NUmber Starts Here==========================================================================================     
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New Property Claim is Created with Claim Number: ".green + strClaimNumber);
        //==================================================================================Fetching Claim NUmber Ends Here====================================================================================================     
    })

    /*
    1)Login into claim zone
    2)Create PC with mismatch jurisdiction
    3)Verify AutoAssignAdjuster is not Attached
    */
    test('AssureClaims_PCCreation_AutoAssignAdjusterNotExistDueToMismatchJurisdiction_Test_07', async t => {
      
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        
        //====================================================================================Claim Creation Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Property Claim")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_PCStatus = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_PCStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_PCType = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterPCClaimType).with({ visibilityCheck: true })
        await t.expect(ele_PCType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const elePCPolicyLOB = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectPolicyLOB.withText(data.PCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(elePCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(elePCPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_PropertyInfo, "Property Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PropertyId, "Property Id Look Up Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_SearchPropertyId, data.PropertyId, "Property ID Text Box On Property Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_SearchCriteria_Btn_SubmitQuery, "Search Image On Property Search Window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.PropertyClaimCreation_Txt_PropertyId.withText(data.PropertyId), "Property Id Link On Property Selection Window")
        await t.wait(2000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_ClaimInfo, "Claim Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdictionMismatch, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdictionMismatch).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //====================================================================================Claim Creation Ends Here====================================================================================================================================
       
        //================================================================================Starts Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType=================================================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj2).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).notOk('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //=============================================================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType=====================================================================
        
        //========================================================================================Fetching Claim NUmber Starts Here===============================================================================================     
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New Proprty Claim is Created with Claim Number: ".green + strClaimNumber);
        //==============================================================================================Fetching Claim NUmber Ends Here====================================================================================================     

    })

    /*
    1)Login into claim zone
    2)Create PC with mismatch claim type
    3)Verify AutoAssignAdjuster is not Attached
    */
    test('AssureClaims_PCCreation_AutoAssignAdjusterNotExistDueToMismatchClaimType_Test_08', async t => {
       
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        
        //=================================================================================Claim Creation Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Property Claim")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_PCStatus = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_PCStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_PCType = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterPCClaimTypeMismatch).with({ visibilityCheck: true })
        await t.expect(ele_PCType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_PCType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const elePCPolicyLOB = Property_Claims.AssureClaims_PropertyClaim_Lnk_SelectPolicyLOB.withText(data.PCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(elePCPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(elePCPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_PropertyInfo, "Property Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Btn_PropertyId, "Property Id Look Up Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_PrportyIdSearchFrame);
        await In_Utility.AssureClaims_SetValue_Utility(Property_Claims.AssureClaims_PropertyClaim_Txt_SearchPropertyId, data.PropertyId, "Property ID Text Box On Property Lookup")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_SearchCriteria_Btn_SubmitQuery, "Search Image On Property Search Window")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.PropertyClaimCreation_Txt_PropertyId.withText(data.PropertyId), "Property Id Link On Property Selection Window")
        await t.wait(2000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_PropertyClaim_ClaimPCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Property_Claims.AssureClaims_PropertyClaim_Tab_ClaimInfo, "Claim Info Tab On Property Claim Creation Page")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdictionMismatch, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdictionMismatch).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //=================================================================================Claim Creation Starts Here========================================================================================================
      
        //====================================================================Starts Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType=============================================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj2).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).notOk('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //========================================================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType========================================================================================
       
        //====================================================================================================Fetching Claim NUmber Starts Here====================================================================================================== 
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New Property Claim is Created with Claim Number: ".green + strClaimNumber);
        //====================================================================================================Fetching Claim NUmber Ends Here====================================================================================================== 

    })

    /*
    1)Login into claim zone
    2)Create VC 
    3)Verify AutoAssignAdjuster("AutoAdj_VC") is Attached
    */
    test('AssureClaims_VCCreation_AutoAssignAdjusterMatchesDepartmentClaimTypeJurisdiction_Test_09', async t => {

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");

        //======================================================================================Claim Creation Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Vehicle Accident");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_VehClaimStatus = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_VehClaimType = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterVAClaimType).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_VehPolicyLOB = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectPolicyLOB.withText(data.AutoAssignAdjusterVAPolicylOB).with({ visibilityCheck: true })
        await t.expect(ele_VehPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdiction, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdiction).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //======================================================================================Claim Creation Ends Here========================================================================================================
        
        //=================================================================================Starts Verification Of AutoAssignAdjuster Is  Present==================================================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj3).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).ok('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //===================================================================================Ends Verification Of AutoAssignAdjuster Is  Present================================================================================= 
        
        //====================================================================================Fetching Claim NUmber Starts Here======================================================================================  
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New Vehicle Accident Claim is Created with Claim Number: ".green + strClaimNumber);
        //=======================================================================================Fetching Claim NUmber Ends Here=======================================================================================  

    })

    /*
    1)Login into claim zone
    2)Create VC with mismatch jurisdiction
    3)Verify AutoAssignAdjuster is not Attached
    */
    test('AssureClaims_VCCreation_AutoAssignAdjusterNotExistDueToMismatchJurisdiction_Test_010', async t => {


        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");

        //============================================================================================Claim Creation Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Vehicle Accident");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_VehClaimStatus = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_VehClaimType = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterVAClaimType).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_VehPolicyLOB = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectPolicyLOB.withText(data.AutoAssignAdjusterVAPolicylOB).with({ visibilityCheck: true })
        await t.expect(ele_VehPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdictionMismatch, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdictionMismatch).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //============================================================================================Claim Creation Ends Here========================================================================================================
        
        //============================================================================Starts Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of Jurisdiction===========================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj3).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).notOk('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //==========================================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of Jurisdiction===================================================================
        
        //===================================================================================================Fetching Claim NUmber Starts Here===================================================================================   
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New Vehicle Accident Claim is Created with Claim Number: ".green + strClaimNumber);
        //==============================================================================================Fetching Claim NUmber Ends Here=========================================================================================================   

    })

    /*
    1)Login into claim zone
    2)Create VC with mismatch claim type
    3)Verify AutoAssignAdjuster is not Attached
    */
    test('AssureClaims_VCCreation_AutoAssignAdjusterDueToMismatchClaimType_Test_011', async t => {

        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");

        //====================================================================================Claim Creation Starts Here========================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:Vehicle Accident");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await t.wait(4000)
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfEvent, d, "Date Of Event")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_DateOfClaim, d, "Date Of Claim")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfEvent, "Time Of Event")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_TimeOfClaim, "Time Of Claim")
        await In_Utility.AssureClaims_SetValue_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimStatus, "Claim Status Lookup")
        const ele_VehClaimStatus = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimStatus.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimStatus, "Claim Status Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_ClaimType, "Claim Type Lookup")
        const ele_VehClaimType = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimType.withText(data.AutoAssignAdjusterVAClaimTypeMismatch).with({ visibilityCheck: true })
        await t.expect(ele_VehClaimType.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehClaimType, "Claim Type Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        const ele_VehPolicyLOB = Vehicle_Accident.AssureClaims_VehicleAccidentClaim_Lnk_SelectPolicyLOB.withText(data.AutoAssignAdjusterVAPolicylOB).with({ visibilityCheck: true })
        await t.expect(ele_VehPolicyLOB.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele_VehPolicyLOB, "Policy LOB Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_JurisdictionLookup, "Jurisdiction Lookup")
        await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup, data.AutoAssignAdjusterJurisdictionMismatch, "Description Search Textbox On Employee Creation Page");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup, "Description Search Icon On Employee Creation Screen");
        const ele4_NonOcc_Jurisdiction = Generic_Claims.AssureClaims_NonOccClaim_Lnk_Jurisdiction.withText(data.AutoAssignAdjusterJurisdictionMismatch).with({ visibilityCheck: true })
        await t.expect(ele4_NonOcc_Jurisdiction.exists).ok('', { timeout: 20000 })
        await Nav_Utility.AssureClaims_ElementClick_Utility(ele4_NonOcc_Jurisdiction, "Jurisdiction Option")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //======================================================================================Claim Creation Ends Here========================================================================================================
        
        //=========================================================================Starts Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType========================================================================
        const AutoAssignAdjuster = Generic_Claims.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster.withText(strAdj3).with({ visibilityCheck: true })
        await t.expect(AutoAssignAdjuster.exists).notOk('', { timeout: 20000 })
        console.log("Verification Of Auto Assign Adjuster Added After Saving Claim Is Successful".green)
        //=============================================================================Ends Verification Of AutoAssignAdjuster Is Not Present Due to mismatch Of ClaimType=======================================================================
        
        //==================================================================================================Fetching Claim NUmber Starts Here===================================================================================================================    
        strClaimNumber = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        console.log("New Vehicle Accident Claim is Created with Claim Number: ".green + strClaimNumber);
        //==================================================================================================Fetching Claim NUmber Ends Here===================================================================================================================    

    })


    /*
    1)Login into CM zone
    2)Delete 3 adjuster record for GC, PC VC 
    3)Select "Auto Assign Adjuster" as "None"
    4)Uncheck setting "Prioritize adjusters handling existing claims (WC/Non occ only)"
    */
    test('AssureClaims_DeleteAdjusterRecordOverCMAndRevertSetting_Test_012', async t => {


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

        //=====================================================Revert auto assign adjuster setting  starts Here========================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Btn_MenuBtn, "Menu Button")
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
        //=====================================================Revert auto assign adjuster setting ends Here========================================================================================================

    })


    /*
    1)Login into maintenance zone
    2)Delete created adjuster
    */
    test('AssureClaims_DeleteAdjusters_Test_013', async t => {

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
