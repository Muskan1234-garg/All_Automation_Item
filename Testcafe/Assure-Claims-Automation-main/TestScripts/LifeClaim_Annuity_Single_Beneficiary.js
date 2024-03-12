import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';

import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Life_Claims from '../Functional_POM/POM_Life_Claims';
import { Console } from 'console';


const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();

const Home_POM = new POM_Home();
const Life_Claims = new POM_Life_Claims();

var faker = require('faker');
const DataIUT = require('../DataFiles/DataIUTLife.json');

var StrLifeClaimNumber;
var firstname;
var lastname;
var Annuity_Flag;
var d;

//Global Variable Declaration

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109548
//Description      : Automating Life Claim script for including coverage with Annuity amount for single beneficiary.
//AUTHOR           : Parul Sharma
//DEPENDANCY       : None
/* PRE-REQUISITES  : None
*/
//Preferred Server : Any
// *******************************************************************************************************************************


DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`Smoke_LifeClaim1`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

   /* Steps performed by AssureClaims_LCCreation_Test_01 :
        1. Login to Claims Zone
        2. Create new Life claim and download policy
        3. Save it
    */
  test('AssureClaims_LCCreation_Test_01', async t => {
  d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
  
  //======LifeClaim Creation Started Here=====================
    console.log("AssureClaims_LifeClaimCreation Function is Called To Create Claim".yellow);
    StrLifeClaimNumber = await Function_Utility.AssureClaims_LifeClaimCreation(d, d, data.ClaimStatus, data.LCClaimType, data.Department, data.LCPolicyLOB , data.LCMannerOfDeath ,data.LCCauseOfDeath , data.EstateProbated , data.DeceasedMaritalStatus , data.SpouseLiving ,data.PolicySystem,data.LifePolicyName)
    console.log("New Life Claim is Created with Claim Number: ".green + StrLifeClaimNumber);
    //======LifeClaim Creation Completed Here=====================
        
  });

/* Steps performed by AssureClaims_IncludeCoverage_test_02 :
        1. Open Policy screen
        2. Update record in Product Type field whose parent is  annuity
        3. Include coverage for this policy by clicking on include coverage button
        4. Select the coverage and include it
        5. update amounts for the given coverage in 2nd grid
    */
 test('AssureClaims_IncludeCoverage_test_02', async t => {
    Annuity_Flag ="True" 
    await t.wait(15000)
    //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    /*==========================================================Including Coverage On Created LC Claim Started Here========================================================================================================================================================================================================================================================================================================*/
    console.log("Including Coverage On Created LC Claim Started".yellow); 
    //======================================================Parul's Code :RMA-104824 For Adding Value In Annuity Field And Adding Amount In Coverage Details Screen started here===================================================================================================================
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_Btn_PolicyOpen,"Policy Open Button Is Clicked")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Btn_ProductType,"Policy Product Type Lookup Button Is Clicked");
    await t.wait(5000)
    const ele1 = Life_Claims.AssureClaims_LifeClaim_Lnk_SelectClaimStatus.withText(data.PolicyProductTypeCode).with({ visibilityCheck: true })
    await t.expect(ele1.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(ele1, "Policy Product Type Option")
  
    await t.pressKey('tab')
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Txt_ProductType,"Policy Product Type Field Is Clicked");
    await t.wait(5000)
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Life_Claims.AssureClaims_Policy_Txt_ProductType,data.Policy_Product_Type_Short_Code+" "+data.PolicyProductTypeCode, "Product Type Field value On Policy Screen");

    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Life Claim creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Life Claim Creation Screen");
    await t.wait(5000)
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Btn_CoveragesDetails,"Coverages Details Button Is Clicked")
    console.log("Covergaes Details Screen Is Opened")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(Life_Claims.AssureClaims_Policy_CoverageDetails_Chk_Coverage,"Check","Coverage Checkbox")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_CoverageDetails_Confirmpopup_Btn_Ok,"Ok Button On Confirm Popup")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Policy_Coverage_Edit_Button,"Edit Button Is Clicked")
    await Function_Utility.AssureClaims_IncludeCoverageInPolicy(Annuity_Flag,data.AnnuityDateOfDeath, data.AnnuityAsOfDate,data.DODValue,data.AsOfValue);
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Coverages Details Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Policy Tracking Screen")
    console.log("Including Coverage On Created LC Claim Completed".yellow);   
    //======================================================Parul's Code :RMA-104824 For Adding Value In Annuity Field And Adding Amount In Coverage Details Screen Completed here===================================================================================================================  
    //Coverages Added
   /*==========================================================Including Coverage On Created LC Claim Completed Here========================================================================================================================================================================================================================================================================================================*/

  });
  /* Steps performed by AssureClaims_PersonInvolved_Test_03 :
        1. open Add new person involved screen
        2. Add new entity of type beneficiary
    */
  test('AssureClaims_PersonInvolved_Test_03', async t => {

    await t.wait(15000)
     //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    //await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_ErrorToastMsgClose,"Close button On Error Toaster Is Clicked")
    //==========================================================Adding Party As PI On Created LC Claim Started Here========================================================================================================================================================================================================================================================================================================
    
    console.log("AssureClaims_PersonInvolvedAddNewEntity_Utility Function is Called To Create Party As PI On Created LC Claim".yellow); 
    await Function_Utility.AssureClaims_PersonInvolvedAddNewEntity_Utility("Party", "NA", "NA","NA");
    console.log("Party is added as Person Involved on Created Claim ".green);
    firstname= await Verify_Utility.AssureClaims_AttributeFetch_Utility(Life_Claims.AssureClaims_PIParty_Txt_FirstName,"FirstName Value")
    lastname=await Verify_Utility.AssureClaims_AttributeFetch_Utility(Life_Claims.AssureClaims_PIParty_Txt_LastName,"LastName Value")
    console.log("FirstName Is fetched".firstname+lastname)
    
    //Party as PI On Life Claim
   //==========================================================Adding Party As PI On Created LC Claim Completed Here========================================================================================================================================================================================================================================================================================================
});
/* Steps performed by AssureClaims_AddDesignation_test_04 :
        1. open designee screen
        2. add new record of designee
    */
  test('AssureClaims_AddDesignation_test_04', async t => {
    await t.wait(5000)
     //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Btn_Designations,"Designations Button Is Clicked")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Life_Claims.AssureClaims_Designation_Btn_AddDesignee,"Add Designee Button Is Present")
    await Verify_Utility.AssureClaims_ElementExist_Utility(Life_Claims.AssureClaims_Designation_Btn_DeleteDesignee,"Delete Designee Button Is Present")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_PartiesInvolved,firstname+" "+lastname+" - Beneficiary","Party Involved On Designee Screen")
    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Life_Claims.AssureClaims_Lst_Policy,data.LifePolicyName,"Policies On Designee Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Btn_AddDesignee,"Designee Added Successfully")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Txt_Designee_AmountPercent,"Amount Field Clicked Successfully") 
    await In_Utility.AssureClaims_SetValue_Utility(Life_Claims.AssureClaims_Designation_Txt_Designee_AmountPercent,"100","Amount Field on Designee Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaims_Designation_Btn_Designee_RowSave,"Save Button Is Clicked Successfully") 
    
  });
});