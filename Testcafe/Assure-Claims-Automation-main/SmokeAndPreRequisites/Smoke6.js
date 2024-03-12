import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Home from '../Functional_POM/POM_Home';


const DataAutoreg_ERON = require('../DataFiles/DataAutoRegDSN_EntityRoleON.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Home_POM = new POM_Home();

var faker = require('faker');


var strEmployeeLastname = "AutoEmp_" + faker.name.lastName();
var strSSN = faker.random.number({ min: 100000000, max: 999999999 }).toString();
var strEmployeeNumber = faker.random.number({ min: 1000, max: 9999 }).toString();



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

    fixture`Smoke6`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZone);
    });

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
    });


    test('AssureClaims_DeleteEntities_Test_02', async t => {

        await t.wait(10000)

        //==============================================Delete created employee, started Here=======================================================================================================================================================================================
        await Maint_Utility.AssureClaims_SearchEntity_Utility("Employee", strEmployeeLastname, 1);
        //==============================================Delete created employee, ended Here=======================================================================================================================================================================================
        

    });

});
