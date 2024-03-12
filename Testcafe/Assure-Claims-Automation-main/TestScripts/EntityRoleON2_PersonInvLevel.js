import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Employee from '../Functional_POM/POM_Employee';
import POM_Entity from '../Functional_POM/POM_Entity'
import POM_Home from '../Functional_POM/POM_Home';
import POM_Search from '../Functional_POM/POM_Search';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Litigation from '../Functional_POM/POM_Litigation';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';


const DataAutoreg_ERON = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Entity_POM = new POM_Entity();
const Home_POM = new POM_Home();
const Search_POM = new POM_Search();
const Employee_POM = new POM_Employee();
const Litigation_POM = new POM_Litigation();
const Generic_Claims = new POM_Generic_Claims();
var faker = require('faker');


var strEmployeeLastname = "AutoEmp_" + faker.name.lastName();
var strPhysicianLastname = "AutoPhysician_" + faker.name.lastName();
var strDriverLastname = "AutoDriver_" + faker.name.lastName();
var strMedStaffLastname = "AutoMedStaff_" + faker.name.lastName();
var strPatientLastname = "AutoPatient_" + faker.name.lastName();
var strWitnessLastname = "AutoWitness_" + faker.name.lastName();

var strSSN = faker.random.number({ min: 100000000, max: 999999999 }).toString();
var strEmployeeNumber = faker.random.number({ min: 1000, max: 9999 }).toString();
var strPhysicianNumber = faker.random.number({ min: 1000, max: 9999 }).toString();
var strMedicalStaffNumber = faker.random.number({ min: 1000, max: 9999 }).toString();
var strDocketNumber = faker.random.number({ min: 1000000, max: 9999999 }).toString();
var StrEventNumber;
var StrClaimNumber;
var StrCarrierClaimNumber;

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-97293
//Description      : Verify Employee created from Entity Maintenance is available under Event Level Person Involved.
//Verify Physician created from Entity Maintenance is available under Event Level Person Involved.
//Verify Driver created from Entity Maintenance is available under Litigation Level Person Involved.
//Verify Medical Staff created from Entity Maintenance is available Litigation Level under Person Involved.
//Verify Patient created from Entity Maintenance is available under Policy Level Person Involved.
//Verify Witness created from Entity Maintenance is available under Policy Level Person Involved
//Verify Driver created from Entity Maintenance is available under Policy Level Person Involved
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

    const ClaimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`EntityRoleON2_PersonInvLevel`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
    });

    /*
    1)Entity created as Employee
    2)Entity created as Physician
    3)Entity created as Driver
    4)Entity created as MedStaff
    5)Entity created as Patient
    6)Entity created as Witness
    */
    test('AssureClaims_EntitiesCreation_Test_01', async t => {

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
        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strPhysicianLastname, "NA", "NA");
        //===========================Entity Creation, ended here==========================================================================================================================================================================================================
        //===========================Create Physician over the created entity, started here============================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Physician", strPhysicianNumber, "NA", "NA", "NA");
        //===========================Create Physician over the created entity, ended here============================================================================================================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");


        await t.wait(2000)
        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strDriverLastname, "NA", "NA");
        //===========================Entity Creation, ended here==========================================================================================================================================================================================================
        //===========================Create Driver over the created entity, started here============================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Driver", "NA", "NA", "NA", "NA");
        //===========================Create Driver over the created entity, ended here============================================================================================================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");


        await t.wait(2000)
        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strMedStaffLastname, "NA", "NA");
        //===========================Entity Creation, ended here==========================================================================================================================================================================================================
        //===========================Create MedicalStaff over the created entity, started here============================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Medical Staff", strMedicalStaffNumber, "NA", "NA", "NA");
        //===========================Create MedicalStaff over the created entity, ended here============================================================================================================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");


        await t.wait(2000)
        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strPatientLastname, "NA", "NA");
        //===========================Entity Creation, ended here==========================================================================================================================================================================================================
        //===========================Create Patient over the created entity, started here============================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Patient", data.MaritalStatus_Single, "NA", "NA", "NA");
        //===========================Create Patient over the created entity, ended here============================================================================================================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_DefaultView_Img_Close, "Close button");

        await t.wait(2000)
        //===========================Entity Creation as witness, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Witness", data.EntityType_Individual, strWitnessLastname, data.EntityCategory_Witness, "NA");
        //===========================Entity Creation as witness, ended here==========================================================================================================================================================================================================

    });

    /*
    1)Event creation
    2)Add person involved as employee over event
    3)Verify employee is attached over event
    4)Add person involved as physician over event
    */
    test('AssureClaims_AddEmployeeAndPhysicianOverEvent_Test_02', async t => {

         await t.wait(10000)
        //===========================Logged in into claimzone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into claimzone, ended here==========================================================================================================================================================================================================
        //===========================Event creation, started here==========================================================================================================================================================================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_EventCreation Function is Called To Create Event".yellow);
        StrEventNumber = await Function_Utility.AssureClaims_EventCreation(d, d, data.EventStatus, data.EventType, data.Department)
        console.log("New Event  is Created with Event Number: ".green + StrEventNumber);
        //===========================Event creation,ended here==========================================================================================================================================================================================================

        //===========================Add employee as PI over event, started here==========================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Add person involved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_PersonInv_Btn_SearchEmployee, "Search employee")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strEmployeeLastname, "Employee lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EventIFrame);
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI Employee Creation Screen");
        //===========================Add employee as PI over event, ended here==========================================================================================================================================================================================================

        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back button");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_EventFrame);
        await t.wait(3000)

        //===========================Verify employee is added as PI over event, started here==========================================================================================================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_RightChild_Lnk_AddedChild.withText('PI Employee ( ' + strEmployeeLastname + ')'), "Verify added employee")
        //===========================Verify employee is added as PI over event, ended here==========================================================================================================================================================================================================

        //===========================Add physiscian as PI over event, started here==========================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Add person involved")
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_PersonInv_Btn_SearchPhysician.find('i'), "Search physician")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strPhysicianLastname, "Physician lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EventIFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI Physician Creation Screen");
        //===========================Add physiscian as PI over event, ended here==========================================================================================================================================================================================================
    });

    /*
    1)Claim creation
    2)Add Litigation over claim
    3)Add person involved as driver over Litigation
    */
    test('AssureClaims_AddDriverOverClaim_Test_03', async t => {


        await t.wait(10000)
        //===========================Logged in into claimzone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into claimzone, ended here==========================================================================================================================================================================================================

        //===========================Claim creation, started here==================================================================================================================================================================================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("assureclaims_gcclaimcreation function is called to create general claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("new general claim is created with claim number: ".green + StrClaimNumber);
        //===========================Claim creation, ended here==================================================================================================================================================================================================================

        //===========================Add litigation, started here==================================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Litigation_POM.AssureClaims_Litigation_Btn_AddLitigation, "Add Litigation Button On Claim Page")
        await In_Utility.AssureClaims_SetValue_Utility(Litigation_POM.AssureClaims_Litigation_Txt_DocketNumber, strDocketNumber, "Docket Number Textbox On Litigation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Litigation creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Litigation Creation Screen");
        //===========================Add Litigation, ended here==================================================================================================================================================================================================================

        //===========================Add driver as PI over claim, started here==================================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Add person involved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_PersonInv_Btn_SearchDriver.find('i'), "Search driver")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strDriverLastname, "Driver lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI Driver Creation Screen");
        //===========================Add driver as PI over claim, ended here==================================================================================================================================================================================================================

    });

    /*
    1)Search created claim in test 3
    2)Verify added litigation record is there
    3)Verify added driver record is there 
    4)Add person involved as medical staff over claim
    */
    test('AssureClaims_AddMedicalStaffOverClaim_Test_04', async t => {


        await t.wait(10000)
        //===========================Logged in into claimzone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into claimzone, ended here==========================================================================================================================================================================================================

        //========================= Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //=========================Claim search ended here==================================================================================================================================

        //=========================Verify added litigation record is there, started Here=================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_RightChild_Lnk_AddedChild.withText(strDocketNumber), "Verify added litigation record")
        //=========================Verify added litigation record is there, Ended Here====================================================================================================

        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_RightChild_Lnk_AddedChild.withText(strDocketNumber), "Litigation record link")

        //=========================Verify added driver record is there, started Here======================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_RightChild_Lnk_AddedChild.withText('PI Driver ( ' + strDriverLastname + ')'), "Verify added driver")
        //=========================Verify added driver record is there, Ended Here=========================================================================================================

        //=========================Add medical staff as PI, started Here====================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Add person involved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_PersonInv_Btn_SearchMedStaff.find('i'), "Search MedStaff")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strMedStaffLastname, "MedStaff lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI MedStaff Creation Screen");
        //=========================Add medical staff as PI, Ended Here=======================================================================================================================
    });

    /*
    1)Carrier Claim Creation
    2)Add person involved as driver over carrier policy
    */
    test('AssureClaims_AddDriverOverCarrierClaimPolicy_Test_05', async t => {

        await t.wait(10000)
        //===========================Logged in into claimzone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into claimzone, ended here==========================================================================================================================================================================================================

        //=====================================Carrier Claim Creation started here===================================================================================================================================
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_CarrierGCClaimCreation Function is Called To Create Carrier Claim".yellow);
        StrCarrierClaimNumber = await Function_Utility.AssureClaims_CarrierGCClaimCreation_SelectSecondUnit(d, d, data.GCCarrierClaimType, data.ClaimStatus, data.Department, data.GCPolicyLOB, data.PolicySystem, data.PolicyName_test10)
        console.log("New Carrier General Claim is Created with Claim Number: ".green + StrClaimNumber);
        //=====================================Carrier Claim Creation completed here===================================================================================================================================

        //*************************************Carrier Claim Creation for Different Policy "APV200999991", started here *********************************************************************************************************
        // await Nav_Utility.AssureClaims_MenuOptionClick_Utility("New:General Claim");
        // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
        // await t.wait(6000);
        // await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfEvent, d, "Date Of Event")
        // await t.wait(1000);
        // await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_DateOfClaim, d, "Date Of Claim")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfEvent, "Time Of Event")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_TimeOfClaim, "Time Of Claim")

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimType, "Claim Type Lookup")
        // const ele_CarrierClaimType = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimType.withExactText(data.GCCarrierClaimType).with({ visibilityCheck: true })
        // await t.expect(ele_CarrierClaimType.exists).ok('', { timeout: 20000 })
        // await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierClaimType, "Claim Type Option")


        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_ClaimStatus, "Claim Status Lookup")
        // const ele_CarrierStatus = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectClaimStatus.withText(data.ClaimStatus).with({ visibilityCheck: true })
        // await t.expect(ele_CarrierStatus.exists).ok('', { timeout: 20000 })
        // await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierStatus, "Claim Status Option")

        // await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept, data.Department, "Department")
        // await t.pressKey('tab')

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyLOBLookup, "Policy LOB Lookup")
        // const ele_CarrierPolicyLOB = Generic_Claims.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB.withExactText(data.GCCarrierPolicyLOB).with({ visibilityCheck: true })
        // await t.expect(ele_CarrierPolicyLOB.exists).ok('', { timeout: 20000 })
        // await Nav_Utility.AssureClaims_ElementClick_Utility(ele_CarrierPolicyLOB, "Policy LOB Option")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        // await t.wait(4000);
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyNameLookup, "Policy Name Lookup")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyLookup, "Policy System List")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicyName.withExactText(data.PolicySystem), "Select Policy System List")
        // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SubPolicyDownloadIframe)
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_SubmitQuery, "Submit Query Button")
        // await t.wait(5000);
        // await In_Utility.AssureClaims_SetValue_Utility(Generic_Claims.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName, data.PolicyName_APV, "PolicyName TextBox")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Lnk_InternalPolicyName.withText(data.PolicyName_APV), "Policy Name")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyPreview, "Right Click On Policy Preview")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Interest List'), "Open Interest List tab")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_InterestListClaimant, "Check Claimant")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_List.withText('Unit List'), "Open Unit List tab")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_UnitList1, "Check Unit List")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Chk_PolicyProperty1, "Check Policy Property List")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_InternalPolicySave, "Save Internal Policy")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_PolicyDownload, "Download Policy")
        // await t.wait(8000)
        // await t.switchToMainWindow();
        // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)

        // await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On General Claim creation Screen");
        // await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");

        // //Policy Attached To the Claim
        // StrCarrierClaimNumber =await Verify_Utility.AssureClaims_AttributeFetch_Utility(Generic_Claims.AssureClaims_GenericClaim_Txt_ClaimNumber, "value");
        // console.log((StrCarrierClaimNumber))
        //*************************************Carrier Claim Creation for Different Policy "APV200999991", ended here *********************************************************************************************************

        //===========================Add driver as PI over carrier policy, started here==================================================================================================================================================================================================================
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_ClaimCreation_Btn_PolicyPopUp, "Policy popup button")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Person Involved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_PersonInv_Btn_SearchDriver.find('i'), "Search driver")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strDriverLastname, "Driver lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI Driver Creation Screen");
        //===========================Add driver as PI over carrier policy, ended here==================================================================================================================================================================================================================
    });

    /*
    1)Search Created Carrier Claim in tes 5
    2)Add person involved as witness over carrier policy
    */
    test('AssureClaims_AddWitnessOverCarrierClaimPolicy_Test_06', async t => {

        await t.wait(10000)
        //===========================Logged in into claimzone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(8000);
        //===========================Logged in into claimzone, ended here==========================================================================================================================================================================================================

        //==============================================Search the created carrier claim, Started Here============================================================================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrCarrierClaimNumber, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //==============================================Search the created carrier claim, Ended Here=======================================================================================================================================================================================

        //===========================Add witness as PI over carrier policy, started here==================================================================================================================================================================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_ClaimCreation_Btn_PolicyPopUp, "Policy popup button")
        await t.wait(5000)
        
        //===========================Verify driver is added as PI over policy, started here==========================================================================================================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_RightChild_Lnk_AddedChild.withText('PI Driver ( ' + strDriverLastname + ')'), "Verify added driver")
        //===========================Verify driver is added as PI over policy, ended here==========================================================================================================================================================================================================
       
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Person Involved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_PersonInv_Btn_SearchWitness.find('i'), "Search witness")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strWitnessLastname, "Wintess lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI Witness Creation Screen");
        //===========================Add witness as PI over carrier policy, ended here==================================================================================================================================================================================================================
    });

    /**************Blocked due to -->RMA-100770******************************************
    1)Search Created Carrier Claim in tes 5
    2)Add person involved as patient over carrier policy
    test('AssureClaims_AddPatientOverCarrierClaimPolicy_Test_07', async t => {

         await t.wait(10000)
        //===========================Logged in into claimzone, started here==========================================================================================================================================================================================================
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        console.log("Login Into Application!!".green)
        await t.wait(2000);
        //===========================Logged in into claimzone, ended here==========================================================================================================================================================================================================
       
        //==============================================Search the created carrier claim, started Here=========================================================================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrCarrierClaimNumber, "NA");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        //==============================================Search the created carrier claim, Ended Here========================================================================

        //===========================Verify driver is added as PI over policy, started here==========================================================================================================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_RightChild_Lnk_AddedChild.withText('PI Witness ( ' + strWitnessLastname + ')'), "Verify added driver")
        //===========================Verify driver is added as PI over policy, ended here==========================================================================================================================================================================================================

        //===========================Add patient as PI over carrier policy, started here==================================================================================================================================================================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_ClaimCreation_Btn_PolicyPopUp, "Policy popup button")
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved, "Person Involved")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_PersonInv_Btn_SearchPatient.find('i'), "Search patient")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EntityIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strPatientLastname, "Patient lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_EntitySearch_Lnk_EntityLnk, "EnityName link")
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe0);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save button")
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "PI Patient Creation Screen");
        //===========================Add patient as PI over carrier policy, started here==================================================================================================================================================================================================================
   
    });
    /**************Blocked due to -->RMA-100770  ***********************************/

    /*
    1)Delete driver
    2)Delete employee
    3)Delete medicalstaff
    4)Delete patient
    5)Delete physician
    6)Delete witness
    */
    test('AssureClaims_DeleteEntities_Test_08', async t => {

        await t.wait(20000)
        //==============================================Delete created driver, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Driver", strDriverLastname, 1);
        //==============================================Delete created driver, Ended Here=======================================================================================================================================================================================

        //==============================================Delete created employee, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Employee", strEmployeeLastname, 1);
        //==============================================Delete created employee, ended Here=======================================================================================================================================================================================
        
        //==============================================Delete created medical staff, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Medical Staff", strMedStaffLastname, 1);
        //==============================================Delete created medical staff, ended Here=======================================================================================================================================================================================
        
        //==============================================Delete created patient, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Patient", strPatientLastname, 1);
        //==============================================Delete created patient, ended Here=======================================================================================================================================================================================
       
        //==============================================Delete created physician, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Physician", strPhysicianLastname, 1);
        //==============================================Delete created physician, ended Here=======================================================================================================================================================================================
        
        //==============================================Delete created witness, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strWitnessLastname, 1);
        //==============================================Delete created witness, ended Here=======================================================================================================================================================================================

    });

});
