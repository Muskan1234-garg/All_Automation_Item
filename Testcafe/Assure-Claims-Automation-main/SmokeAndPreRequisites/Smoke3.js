import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
const Function_Utility = new Functionality_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const DataIUT = require('../DataFiles/Smoke.json');


DataIUT.forEach((data) => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`Smoke3`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });

    test('AssureClaims_EntityCreation_Test_01', async t => {

        //===============================================Entity Maintenance Start Here=================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Entity".yellow);
        var LastName = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Entity", data.EntityType, "SSN", "");
        console.log("New Entity is Created with Last Name: ".green + LastName);
        //New Entity Is Created
        //=================================================Entity Maintenance End Here===============================================
    });


});








    


        




