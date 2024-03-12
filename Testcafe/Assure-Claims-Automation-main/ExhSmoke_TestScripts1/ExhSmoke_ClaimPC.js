import { Selector, Role } from 'testcafe';

import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
const Function_Utility = new Functionality_Utility_Sec_Exh();


var StrClaimNumber;

//***********************************************************************************
//JIRA ID OF STORY : RMA-97883
//Description      : ExhSmoke_ClaimPC
//AUTHOR           : Saikrishan,Maddula
//DEPENDANCY       : No
// PRE-REQUISITES  : Check For Property ID Created or not
//Preferred Server : IUTSQL
//***********************************************************************************

DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`ExhSmoke_ClaimPC `.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });
 //=====================================================Property Claim Creation Started Here====================================================================
    test('AssureClaims_Property_Claim_Test_01', async t => {
        var date = new Date();
        var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
        console.log("AssureClaims_PropertyClaimCreation Function is Called To Create Property Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_PropertyClaimCreation(d, d, data.ClaimStatus, data.PCClaimType, data.Department, data.PCPolicyLOB, data.PropertyId)
        console.log("New Property Claim is Created with Claim Number: ".green + StrClaimNumber);
    });
//=====================================================Property Claim Creation Completed Here====================================================================
});


