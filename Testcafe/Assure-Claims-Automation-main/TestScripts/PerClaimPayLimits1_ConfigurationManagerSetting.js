import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const ConfigMgr_POM = new POM_Config_Manager();


// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-99680
//Description      : Check Jira
//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : 194 Automation Regression, DSN : DataAutoRegDSN_2
// *******************************************************************************************************************************

var faker = require('faker');
const fs = require('fs')
const path = require('path')
//Global Variable Declaration
var SrLastName = "Sr_" + "" + faker.name.lastName();
var SrFirstName = "Sr_" + "" + faker.name.firstName();
var MidLastName = "Mid_" + "" + faker.name.lastName();
var MidFirstName = "Mid_" + "" + faker.name.firstName();
var manager;
var groundUser;
var sManagerFirstName = SrFirstName;
var sManagerLastName = SrLastName;
var sGroundUserFirstName = MidFirstName;
var sGroundUserLastName = MidLastName;


DataIUT.forEach(data => {
    fixture`PerPayClaimLimits1_ConfigurationManagerSetting`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
    });
    /* Steps performed by UserCreation_Test_01 :
       1. Login Into Application with User
       2. Creation of Manager User
       3. Creation of Ground User
       4. Exporting manager and ground user
       5. End
       */
      test('UserCreation_Test_01', async t => {
        //==============================================================Login Into Application with User started==================================================================

        await t.wait(10000)
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
        //==============================================================Login Into Application with User ended==================================================================

        console.log("AssureClaims_SMSSuperUserAddEditDelete_Utility Function is Called To Create User".yellow);
        //==============================================================Creation of Manager User started==================================================================
        manager = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", SrLastName, SrFirstName, "NA", "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Manager User ended==================================================================
        //==============================================================Creation of Ground User started==================================================================

        groundUser = await Function_Utility.AssureClaims_SMSSuperUserAddEditDelete_Utility("Add", MidLastName, MidFirstName, SrFirstName + " " + SrLastName, "NA", data.DSN, data.ModuleName_Administrator)
        //==============================================================Creation of Ground User ended==================================================================
        //==============================================================Exporting manager and groundUser started==================================================================
        const usersFilePath = path.join(__dirname, 'PerPayclaimUsers.js');

        try {
          fs.writeFileSync(usersFilePath, `
          export var manager = "${manager}";
          export var groundUser = "${groundUser}";
          export var sManagerFirstName = "${SrFirstName}";
          export var sManagerLastName = "${SrLastName}";
          export var sGroundUserFirstName = "${MidFirstName}";
          export var sGroundUserLastName = "${MidLastName}";
          
          module.exports.manager = manager;
          module.exports.groundUser = groundUser;
          module.exports.sManagerFirstName = sManagerFirstName;
          module.exports.sManagerLastName = sManagerLastName;
          module.exports.sGroundUserFirstName = sGroundUserFirstName;
          module.exports.sGroundUserLastName = sGroundUserLastName;
          `);
          
            console.log('Users.js created in the same directory as the script.');
          } catch (err) {
            console.error(err);
          }
	 //==============================================================Exporting manager and groundUser ended==================================================================
    });

    /* Steps performed by LoginWithUser_UtilitySettingUserPrivilegeSetting_Test_02 :
        1. Login Into Application with User
        2. Payment Parameter SetUp in Configuration manager page
        3. Checked Use Supervisory Approval
        4. Checked Per Claim Pay Limits Are Exceeded
        5. End
    */
    test('LoginWithUser_ConfigurationManagerUserPrivilegeSetting_Test_02', async t => {
        
        //==============================================================Login Into Application with User started==================================================================
        await t.wait(10000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(manager, 'abkabk1', data.DSN, 'Configuration Manager')
        console.log(`Login Into Application with ${manager}`)
        //=============================================================Login Into Application with User ended=========================================================================
        //====================================================Payment Parameter SetUp in Configuration manager started================================================
        
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Payment", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_UseSupervisoryApproval, "Check", "Supervisory Approval")
        await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(ConfigMgr_POM.AssureClaims_ConfigManager_Chk_PerClaimPayLimitsExceeded, "Check", "Per Claim Pay Limits Exceeded Approval")
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        //====================================================Payment Parameter SetUp in Configuration manager ended================================================
    });
});



	
