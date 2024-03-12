import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';


const DataSTG = require('../DataFiles/Smoke.json');
const Function_Utility = new Functionality_Utility();



var faker = require('faker');

var SrLastName = "Sr_" + "" + faker.name.lastName();
var SrFirstName = "Sr_" + "" + faker.name.firstName();

DataSTG.forEach(data => {
    fixture`Smoke4`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });


    test('AssureClaims_UserCreationAndSetPaymentLimit_Test_01', async t => {


        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)

        //===================================================================User Creation Started Here==============================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", SrLastName, SrFirstName, "NA", "NA", data.DSN, data.ModuleName)
        //===================================================================User Creation Completed Here==============================================================================================


    });


    test('AssureClaims_LoginWithCreatedUser_Test_02', async t => {

        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(SrFirstName, 'abkabk1', data.DSN, 'Claims')
        console.log(`Login Into Application with ${SrFirstName}`)
        //Login Into Application with User

        await t.wait(10000)

        await Function_Utility.AssureClaims_LogoutFromApplication_Utility();
        console.log("Logout from Application!!")
        //Logout from Application
    });


    test('AssureClaims_UserDeletion_Test_03', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(30000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(10000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==========================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Deletion of Manager User started====================================================================================
        await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Delete", "NA", "NA", "NA", SrFirstName + " " + SrLastName, data.DSN, data.ModuleName)
        //==============================================================Deletion of Manager User ended===================================================================================
    });

});


