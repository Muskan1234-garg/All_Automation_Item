import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Entity from '../Functional_POM/POM_Entity';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Search from '../Functional_POM/POM_Search';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';

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
var faker = require('faker');

var strEntityName = "AutoEmp_" + faker.name.lastName();
var strSSN = faker.random.number({ min: 100000000, max: 999999999 }).toString();
var strEmployeeNumber = faker.random.number({ min: 1000, max: 9999 }).toString();

//*********************************************************************************************************************************************
//JIRA ID OF STORY : RMA-102184
//Description      : To Delete role assigned to entity for Entity role ON,Assigning role to the Entity,Searching the Entity
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

    fixture`EntityRoleON6_DeleteRole`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
    });

    /*
    1)Entity created as Employee
    */
    test('AssureClaims_CreateEntityAsEmployee_Test_01', async t => {

        //===========================Entity Creation, started here==========================================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Entity", data.EntityType_Individual, strEntityName, data.IdType, strSSN);
        //===========================Entity Creation, ended here============================================================================================================================================================================================================
       
        //===========================Create Employee over the created entity, started here=================================================================================================================================================================================
        await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_ERON_Utility("Employee", strEmployeeNumber, data.Department, "NA", "NA");
        //===========================Create Employee over the created entity, ended here===============================================================================================================================================================================

    });

    /*
    1) Search Created Entity
    */
    test('AssureClaims_SearchCreatedEntity_Test_02', async t => {

        await t.wait(5000);
        //==============================================Search created entity, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strEntityName, 0);
        //==============================================Search created entity, ended Here=======================================================================================================================================================================================
    });

    /*
    1) Search Employee & delete it 
    */
    test('AssureClaims_SearchAndDeleteEmployee_Test_03', async t => {

        await t.wait(5000);

        //==============================================Search & Delete created employee, started Here=======================================================================================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Employee");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EmployessIframe);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EmployeeNumber, strEmployeeNumber, "Employee Number");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery");
        await t.wait(3000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_SearchResult_EmployeeIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.nth(0), "employee link");
        await t.switchToMainWindow();
        await t.wait(4000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Entity_POM.AsssureClaims_EntityCreation_Btn_EmployeeInfo, "Employee info");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteRecord, "Delete employee");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteOK, "Ok button");
        await t.wait(5000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureCliams_MaintenanceERON_EnityIframe);
        //==============================================Search & Delete created employee, ended Here=======================================================================================================================================================================================
    });

    /*
    1) Search Employee, Verify 'No Records Available.'
    */
    test('AssureClaims_SearchEmployee_VerifyNoRecordAval_Test_04', async t => {

        await t.wait(10000);

        //===========================Search Employee, verify it has been deleted ,started here==================================================================================================================================================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Employee");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EmployessIframe);
        await t.wait(3000);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EmployeeNumber, strEmployeeNumber, "employee number");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery");
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_SearchResult_EmployeeIframe);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Home_POM.AssureClaims_Generic_Txt_VerifyNoRecordsAvalText.withText("No Records Available."),"No records available text");
 
        //===========================Search Employee, verify it has been deleted,ended here==================================================================================================================================================================================================================
    });

    /*
    1) Search & Delete Entity
    */
    test('AssureClaims_SearchAndDeleteEntity_Test_05', async t => {

        await t.wait(5000);

        //==============================================Delete created entity, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Entity", strEntityName, 1);
        //==============================================Delete created entity, ended Here=======================================================================================================================================================================================
    });

    /*
    1) Search entity, Verify 'No Records Available.'
    */
    test('AssureClaims_SearchEntity_VerifyNoRecordAval_Test_06', async t => {

        await t.wait(10000);

        //===========================Search entity, verify it has been deleted ,started here==================================================================================================================================================================================================================
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
        await t.wait(3000);
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, strEntityName, "entity lastname");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery");
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Home_POM.AssureClaims_Generic_Txt_VerifyNoRecordsAvalText.withText("No Records Available."),"No records available text");
        await t.wait(3000);
        //===========================Search entity, verify it has been deleted ,ended here==================================================================================================================================================================================================================
    });
});



