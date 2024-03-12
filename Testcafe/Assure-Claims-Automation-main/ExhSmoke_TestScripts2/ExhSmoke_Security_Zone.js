import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
const Function_Utility = new Functionality_Utility_Sec_Exh();
var faker = require('faker');

//***********************************************************************************
//JIRA ID OF STORY : RMA-97883
//Description      : ExhSmoke_Security_Zone
//AUTHOR           : Saikrishan,Maddula
//DEPENDANCY       : No
// PRE-REQUISITES  : No
//Preferred Server : IUTSQL
//***********************************************************************************

var UserLastName="Usr_"+""+faker.name.lastName();
    var UserFirstName="Usr_"+""+faker.name.firstName();

DataIUT.forEach(data => {
    fixture`ExhSmoke_Security`.beforeEach(async t => {
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()    
    });
    //Login In To Security Zone
    test('AssureClaims_UserCreation_Test_01', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Security')
        console.log("Login Into Application!!".green)
    //==================================================================User Creation Starts Here====================================================================================================================
      console.log("AssureClaims_SMSUserAddEditDelete_Utility Function is Called To Create User"); 
       await Function_Utility.AssureClaims_SMSUserAddEditDelete_Utility('Add',UserLastName,UserFirstName,'NA',data.DSN,'Administrator')
       console.log("User Created :"+UserFirstName) 
       //==================================================================User Creation Ends Here====================================================================================================================     
});
//Login Into ClaimsZone with User Created In SMS
test('AssureClaims_Login_Into_ClaimsZone_with_User_Created_In_SMS_Test_02', async t=>{
    await t.wait(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(UserFirstName,'abkabk1',data.DSN,'Claims')
    console.log(`Login Into Application with ${UserFirstName}`)
    await t.wait(10000)
})

});
