import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Entity from '../Functional_POM/POM_Entity'
import POM_Home from '../Functional_POM/POM_Home';
import POM_Search from '../Functional_POM/POM_Search';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';


const DataSTG_ORA = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

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
var faker = require('faker');


var strEntityLastname="Auto_"+faker.name.lastName();
var strMedicalStaffNumber=faker.random.number({min:1000,max:9999}).toString();
var strEditedMedicalStaffNumber=faker.random.number({min:1000,max:9999}).toString();

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-99702
//Description      : 1)Verify only Entity option is visible & no options are visible for People Maintenance, Employee, Physician, Driver, Patient, Med Staff under Maintenance Menu
//2)Create entity. 3)Verify that 'Banking information' 'Contracts' 'exposure information 'and 'Jurisdictional License' should display on saving the entity on the right panel.
//4)Verify that Driver info, Employee info, medical staff, Physician info, Patient info is visible on the toolbar button
//5)Verify entity search is retrieving correct record 
//6)Create, edit , delete medical staff & entity 
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITE    : Entity role should be ON for that particular DSN
// Preffered Env.  : 194 Autoreg env. "RM231REG_ERON" DSN
//*********************************************************************************************************************************************

DataSTG_ORA.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`EntityRoleON1_MaintenanceLevel`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    /*
    1)Verify SubMenu->Driver,Employee,MedStaff,Physician,Patient,People are not visible under maintenance 
    2)Verify Entity option is visible under maintenance
    3)Verify on entity creation page, only two entity type "Business" & "Individual" visible
    */
    test('AssureClaims_VerifySubMenuOptionsVisiblity_EntityRoleON_Test_01', async t => {


        //=====Verify SubMenu->Driver,Employee,MedStaff,Physician,Patient,People are not visible under maintenance & Entity option is visible under maintenance started here=======================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_MaintenanceLnk,"Maintenance menu");
        await t.wait(3000)
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_DriverLnk,"Driver Link")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_EntityLnk,"Entity Lnk")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_EmployeeLnk,"Employee Link")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_MedStaffLnk,"Medical Staff Link")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_PhysicianLnk,"Physician Link")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_PatientLnk,"Patient Link")
        await Verify_Utility.AssureClaims_ElementNotExist_Utility(Entity_POM.AssureClaims_Maintenance_Lnk_PeopleLnk,"People Lnk")
        await t.wait(3000)
        //=====Verify SubMenu->Driver,Employee,MedStaff,Physician,Patient,People are not visible under maintenance & Entity option is visible under maintenance ended here=======================================================================

        //============================Verify on entity creation page, only two entity type "Business" & "Individual" visible, started here===================================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_Maintenence_Lst_EntityType,"Entity Type")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_Maintenence_Lst_EntityType.find('option').withAttribute('label',data.EntityType_Business),"Business Entity Type")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_Maintenence_Lst_EntityType.find('option').withAttribute('label',data.EntityType_Individual),"Individual Entity Type")
        //===========================Verify on entity creation page, only two entity type "Business" & "Individual" visible, ended here===================================================================================================================================
    });

    /*
    1)Entity Creation
    2)After entity creation check visiblity of right hand child-->Banking Information,Jurisdiction License,Exposure Information
    3)After entity creation check visiblity of driver,employee,medstaff,patient,physician tabs
    */
    test('AssureClaims_EnityCreation_Test_02', async t => {
        
        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual,strEntityLastname,"NA","NA");
        //===========================Entity Creation, ended here===================================================================================================================================

        //===========================After entity creation check visiblity of right hand child, started here===================================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Lnk_RightHandChild.withText('Banking Information '),"Banking Information")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Lnk_RightHandChild.withText('Jurisdiction License '),"Jurisdiction License")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Lnk_RightHandChild.withText('Exposure Information '),"Exposure Information")
        //===========================After entity creation check visiblity of right hand child, ended here===================================================================================================================================
   
        //===========================After entity creation check visiblity of driver,employee,medstaff,patient,physician tabs, started here===================================================================================================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_DriverInfo,"Driver Info Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_EmployeeInfo,"Employee Info Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_MedStaffInfo,"Med Staff Info Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_PatientInfo,"Patient Info Button")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_PhysicianInfo,"Physician Info Button")
        //===========================After entity creation check visiblity of driver,employee,medstaff,patient,physician tabs, ended here===================================================================================================================================
 
    });

    /*
    1)Search created entity
    2)Create, edit Medical Staff, on that entity
    */
    test('AssureClaims_MedicalSatffCreation_Test_03', async t => {
        
        //===========================Search created entity, started here===================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity",strEntityLastname,0);
        //===========================Search created entity, ended here===================================================================================================================================

        //===========================Medical Staff creation, started here===================================================================================================================================
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_MedStaffInfo,"Medical staff info")
        // await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AsssureClaims_MedStaffCreation_Txt_StaffNumber,strMedicalStaffNumber,strMedicalStaffNumber +" : Medical staff number")
        // await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save button");
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Medical Staff", strMedicalStaffNumber,"NA","NA","NA");
        //===========================Edit Medical Staff number, started here===================================================================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AsssureClaims_MedStaffCreation_Txt_StaffNumber,strEditedMedicalStaffNumber,strEditedMedicalStaffNumber +": Edited Medical staff number")
        //===========================Edit Medical Staff number, ended here===================================================================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save button");
        //===========================Medical Staff creation, ended here===================================================================================================================================

 
    });

    /*
    1)Search Created Entity
    2)Delete created medical staff
    3)Delete created Entity
    */
    test('AssureClaims_DeleteCreatedEntityAndMedicalStaff_Test_04', async t => {
        
        //===========================Search Created Medical Staff,and delete it started here===================================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Medical Staff");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_MedicalStaffIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_MedicalStaffSearch_Txt_StaffNumber, strEditedMedicalStaffNumber, strEditedMedicalStaffNumber+" : medicalstaff number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_SearchResult_MedicalStaffIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(strEntityLastname), "medical staff link")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_MedStaffInfo,"Medical staff info")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteRecord,"Delete medical staff")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK,"Delete ok button")
        //===========================Search Created Medical Satff,and delete it ended here===================================================================================================================================
        
        //===========================Delete created entity, started here===================================================================================================================================
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe);
        await t.wait(4000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteRecord,"Delete entity")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK,"Delete ok button")
        //===========================Delete created entity, ended here===================================================================================================================================
 
    });

    /*
    1)Search deleted medstaff and verify record is not there
    */
    test('AssureClaims_SearchDeletedMedicalStaff_Test_05', async t => {
        
        //===========================Search deleted Medical Staff,and Verify "No records available text" started here===================================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Medical Staff");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_MedicalStaffIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_MedicalStaffSearch_Txt_StaffNumber, strEditedMedicalStaffNumber, strEditedMedicalStaffNumber+"  : medicalstaff number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_SearchResult_MedicalStaffIframe);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Home_POM.AssureClaims_Generic_Txt_VerifyNoRecordsAvalText.withText("No Records Available."),"No records available text")
        //===========================Search deleted Medical Staff,and Verify "No records available text" ended here===================================================================================================================================
        
    });

    /*
    1)Search deleted entity and verify record is not there
    */
    test('AssureClaims_SearchDeletedEntity_Test_06', async t => {
        
        //===========================Search deleted entity,and Verify "No records available text" started here===================================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, strEntityLastname, "entity lastname")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Home_POM.AssureClaims_Generic_Txt_VerifyNoRecordsAvalText.withText("No Records Available."),"No records available text")
        //===========================Search deleted Entity,and Verify "No records available text" ended here===================================================================================================================================
 
    });

});
