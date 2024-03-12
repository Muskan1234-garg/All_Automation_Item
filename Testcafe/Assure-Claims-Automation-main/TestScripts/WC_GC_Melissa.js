import { Role } from 'testcafe';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from "../Functional_POM/POM_VerificationMessage";

const DataIUT = require('../DataFiles/DataIUT.json');

const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();

//Global Variable Declaration
var StrWCClaimNumber;
let StrClaimNumber = ''
let AdjusterLastName1 = ''

//JIRA ID OF STORY : RMA-99719
//Description           : Melissa Address Autocomplete and Address Verification
//AUTHOR               : Chhavi Dave, Garima Singhal
//DEPENDANCY       : NO
//PRE-REQUISITES   : Prerequisite : Melissa Address auto complete and verification setting should be enable from Configuration manager. Details are as provided :
//Address Verification -
//Vendor Type : Melissa API
//Customer ID : 120152183
//Always Enable Address Verification URL : https://address.melissadata.net/V3/WEB/GlobalAddress/doGlobalAddress?id= 120152183&opt=DELIVERYLINES:ON&a1=<Address1>&loc=<City>&admarea=<State>&postal=<Zipcode>&ctry=<Country><Address2>
//Address Autocomplete -
//Vendor Type : Melissa API
//Enable Autocomplete : Enabled
//Minimum Length : 2 or 3
//Maximum Records in Search : 5
//Customer ID : 120152183
//EndPoint Type : ExpressFreeForm
//EndPoint Details : http://expressentry.melissadata.net/web/ExpressFreeForm?format=<FORMAT>&id=120152183&ff=<FF>&maxrecords=<MAXRECORDS>
//Preferred Server   : IUT SQL, IUT Oracle


DataIUT.forEach(data => {
  
    const ClaimZoneLogin = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );
    
    fixture`WC_GC_Melissa`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);   
    });

    /*
    1-Worker's Compensation claim created.
    2-Employee info added and Melissa Address Autocomplete and Address Verification is done.
    3-Location Address1 is added on Event tab and Melissa Address Autocomplete and Address Verification is done.
    4-New litigation record is added and Melissa Address Autocomplete and Address Verification is done.
    5-General claim is created.
    6-New adjuster record is added and Melissa Address Autocomplete and Address Verification is done.
    */

    test('AssureClaims_WorkerCompClaim_MelissaAddressVerification_Employee_Event_Litigation_Address1_Test_01', async t => {
    await t.wait(3000)
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    /*=========================================================== Worker Compensation Claim Creation Started Here========================================================================================================================================================================================================================================================================================================*/
    console.log("AssureClaims_WorkersCompClaimCreation Function is Called To Create Worker Compensation Claim".yellow);
    StrWCClaimNumber = await Function_Utility.AssureClaims_MelissaAddress_UpdateWorkersCompClaimCreation(d, d, data.Department, data.WCClaimStatus, data.WCPolicyLOB, data.WCClaimType, data.EmpolyeeNo, data.WCJurisdiction)
    console.log("Mellisa address verification testing completed");
    /*===========================================================Worker Compensation Claim Creation Completed Here========================================================================================================================================================================================================================================================================================================*/
});
  
    test('AssureClaims_GC_ClaimLevel_Adjuster_MelissaAddressVerification_Address1_Test_02', async t => {
    await t.wait(5000)
    var date = new Date();
    var d = (date.getMonth() + 1) + '/' + (date.getDate()) + '/' + date.getFullYear();
    /*=========================================================== GC claim creation started here========================================================================================================================================================================================================================================================================================================*/
    console.log("assureclaims_gcclaimcreation function is called to create general claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("new general claim is created with claim number: ".green + StrClaimNumber);
    /*=========================================================== GC claim creation Completed here========================================================================================================================================================================================================================================================================================================*/
    
    //=======================================================Adjuster creation on created claim started here====================================================      
    await t.wait (2000)
    AdjusterLastName1 = await Function_Utility.AssureClaims_ClaimEventEntityAddition_Utility("Adjuster Melissa Verification")
    await t.switchToMainWindow()
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe);
    await t.wait(3000)
    //======================================================Adjuster creation on created claim completed here==================================================
});
})

