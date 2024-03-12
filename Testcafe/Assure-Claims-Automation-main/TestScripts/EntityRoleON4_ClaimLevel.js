import { Selector, Role } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import Input_Utility from '../Functional_Utilities/Input_Utility';

import POM_Litigation from '../Functional_POM/POM_Litigation';
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Adjuster from '../Functional_POM/POM_Adjuster';
import POM_Search from '../Functional_POM/POM_Search'

const DataAutoreg_ERON = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Verify_Utility = new Verification_Utility();
const In_Utility = new Input_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Litigation_POM = new POM_Litigation();
const Adjuster_POM = new POM_Adjuster();
const Search_POM = new POM_Search();

var faker = require('faker');

var strSSN = faker.random.number({ min: 100000000, max: 999999999 }).toString();
var strEmployeeNumber = faker.random.number({ min: 1000, max: 9999 }).toString();
var DocketNumber = faker.random.number({ min: 1000000, max: 9999999 }).toString();
var strEmployeeLastname = "AutoEmp_" + faker.name.lastName();
var strAdjusterLastname = "AutoAdjuster_" + faker.name.lastName();
var strJudgeLastname = "AutoJudge_" + faker.name.lastName();
var strAttorneyLastname = "AutoAttorney_" + faker.name.lastName();

var StrClaimNumber;
var StrWCClaimNumber;

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-97688
//Description      : Verify Adjuster created from Entity Maintenance is available when trying to add it to the claim
//Verify Employee created from Entity Maintenance is available while creating WC Claim
//Verify Judges created from Entity Maintenance is available under Litigation.
//Verify Attorneys created from Entity Maintenance is available under Litigation.
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITE    : Entity role should be ON for that particular DSN
// Preffered Env.  : 194 Autoreg env. "RM231REG_ERON" DSN
//*********************************************************************************************************************************************

DataAutoreg_ERON.forEach(data => {
    const MaintenanceZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const ClaimZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`EntityRoleON4_ClaimLevel`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZone);
    });

    /*
    1)Entity Creation as adjuster
    1)Entity Creation as employee
    1)Entity Creation as judge
    1)Entity Creation as attorney
    */
    test('AssureClaims_EntityCreation_Test_01', async t => {

        await t.wait(2000)
        //===========================Logged in into MaintenanceZone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into MaintenanceZone, ended here==========================================================================================================================================================================================================

        //===========================Entity Creation as adjuster, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Adjusters", data.EntityType_Business, strAdjusterLastname, data.EntityCategory_Adjuster, "NA");
        //===========================Entity Creation as adjuster, ended here==========================================================================================================================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");

        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strEmployeeLastname, data.IdType, strSSN);
        //===========================Entity Creation, ended here============================================================================================================================================================================================================
        //===========================Create Employee over the created entity, started here=================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Employee", strEmployeeNumber, data.Department, "NA", "NA");
        //===========================Create Employee over the created entity, ended here===============================================================================================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");

        await t.wait(2000)
        //===========================Entity Creation as judge, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Judges", data.EntityType_Individual, strJudgeLastname, data.EntityCategory_Judge, "NA");
        //===========================Entity Creation as judge, ended here==========================================================================================================================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");

        await t.wait(2000)
        //===========================Entity Creation as attorney, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Attorneys", data.EntityType_Business, strAttorneyLastname, data.EntityCategory_Attorney, "NA");
        //===========================Entity Creation as attorney, ended here==========================================================================================================================================================================================================

    });

    /*
    1)Claim GC
    2)Add created adjuster
    3)Verify adjuster successfully added
    */
    test('AssureClaims_CreateClaimAddCreatedAdjuster_Test_02', async t => {

        //===========================Claim creation, started here==================================================================================================================================================================================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("assureclaims_gcclaimcreation function is called to create general claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("new general claim is created with claim number: ".green + StrClaimNumber);
        //===========================Claim creation, ended here==================================================================================================================================================================================================================

        //===========================Add created adjuster over claim, started here==================================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Adjuster_POM.AssureClaims_AddAdjuster, "Add Adjuster Button on Adjuster Page")
        await In_Utility.AssureClaims_SetValue_Utility(Adjuster_POM.AssureClaims_Adjuster_Txt_LastName, strAdjusterLastname, "Adjuster Last Name")
        await t.pressKey('tab')
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //===========================Add created adjuster over claim, ended here==================================================================================================================================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        await t.wait(3000)

        //===========================Verify adjuster existence, started here==================================================================================================================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Selector('[aria-label=" ' + strAdjusterLastname + '"]'), "Adjuster last name")
        //===========================Verify adjuster existence, ended here==================================================================================================================================================================================================================

    });

    /*
    1)Claim WC, add created employee
    */
    test('AssureClaims_CreateWCWithCreatedEmployee_Test_03', async t => {

        await t.wait(3000)
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        /*=========================================================== Worker Compensation Claim, add created employee, Creation Started Here========================================================================================================================================================================================================================================================================================================*/
        console.log("AssureClaims_WorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
        StrWCClaimNumber = await Function_Utility.AssureClaims_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.WCClaimType, strEmployeeNumber, data.WCJurisdiction)
        console.log("New Worker Compensation Claim is Created with Claim Number: ".green + StrWCClaimNumber);
        /*===========================================================Worker Compensation Claim Creation, add created employee, Completed Heree========================================================================================================================================================================================================================================================================================================*/
    });


    /*
    1)Search created claim
    2)Add litigation, add judge from litigation info, add attorney lastname from Attorney Information
    3)Verify litigation get saved successfully
    */
    test('AssureClaims_AddLitigationAndAddCreateJudgeAndAttorney_Test_04', async t => {

        //========================= Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //=========================Claim search ended here==================================================================================================================================

        //=========================Add litigation, verify get save sucessfully started here===================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_AddLitigation, "Add Litigation Button On Claim Page")
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_DocketNumber, DocketNumber, "Docket Number Textbox On Litigation Screen");

        //=========================Add created judge & Attorney,started here===================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_JudgeLastName, strJudgeLastname, "Judge lastname");
        await t.pressKey('tab')
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GerericTabs_Tab_Accordians.withExactText("Litigation Info"), "Litigation Info tab")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GerericTabs_Tab_Accordians.withExactText("Attorney Information"), "Attorney Information tab")
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_AttorneyLastName, strAttorneyLastname, "Judge lastname");
        //=========================Add created judge & Attorney, ended here===================================================================================================================

        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
        //=========================Add litigation, verify get save sucessfully ended here===================================================================================================================
    });

    /*
    1)Search claim by giving litigation attorney lastname as a parameter
    */
    test('AssureClaims_SearchClaimWithLitigationAttorneyLastname_Test_05', async t => {

        //========================= Claim search started here===================================================================================================================
        await t.wait(8000)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_LitAttorneyLastName, strAttorneyLastname, "Claim Number")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe1);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(StrClaimNumber), "ClaimNumber link")
        console.log("Search is Completed");
        await t.switchToMainWindow()
        await t.wait(4000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //=========================Claim search ended here==================================================================================================================================
    });

    /*
    1)Delete adjuster
    2)Delete judge
    3)Delete attorney
    4)Delete employee
    */
    test('AssureClaims_DeleteEntities_Test_06', async t => {

        await t.wait(10000)

        //===========================Logged in into MaintenanceZone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
        console.log("Login Into Application!!".green)
        await t.wait(15000);
        //===========================Logged in into MaintenanceZone, ended here==========================================================================================================================================================================================================

        //==============================================Delete created adjuster, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strAdjusterLastname, 1);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        //==============================================Delete created adjuster, ended Here=======================================================================================================================================================================================

        //==============================================Delete created judge, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strJudgeLastname, 1);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        //==============================================Delete created judge, ended Here=======================================================================================================================================================================================

        //==============================================Delete created attorney, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strAttorneyLastname, 1);
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(0), "Close Button on Left Hand Side Of Screen")
        //==============================================Delete created attorney, ended Here=======================================================================================================================================================================================

        //==============================================Delete created employee, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Employee", strEmployeeLastname, 1);
        //==============================================Delete created employee, ended Here=======================================================================================================================================================================================


    });
});




