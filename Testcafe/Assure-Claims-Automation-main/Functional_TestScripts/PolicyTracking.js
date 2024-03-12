import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';

import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Life_Claims from '../Functional_POM/POM_Life_Claims';
import POM_PolicyTracking from '../Functional_POM/POM_PolicyTracking';

const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();

const Home_POM = new POM_Home();
const Life_Claims = new POM_Life_Claims();
const Pol_Track = new POM_PolicyTracking();

var faker = require('faker');
const DataIUT = require('../DataFiles/DataIUT_Clt2_LC.json');

var StrLifeClaimNumber;

//Global Variable Declaration
// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109556
//Description      : Automating Life Claim script for including Policy coverage.
//AUTHOR           : Kiran Nandurkar
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

  fixture`PolicyTracking`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });

  /*
  Creating Claim
  */

  test('AssureClaims_LCCreation_Test_01', async t => {
    var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //======LifeClaim Creation Started Here=====================
    console.log("AssureClaims_LifeClaimCreation Function is Called To Create Claim".yellow);
    StrLifeClaimNumber = await Function_Utility.AssureClaims_LifeClaimCreation(d, d, data.ClaimStatus, data.LCClaimType, data.Department, data.LCPolicyLOB, data.LCMannerOfDeath, data.LCCauseOfDeath, data.EstateProbated, data.DeceasedMaritalStatus, data.SpouseLiving, data.PolicySystem, data.LifePolicyName)
    console.log("New Life Claim is Created with Claim Number: ".green + StrLifeClaimNumber);
    //======LifeClaim Creation Completed Here=====================

  });

 /*
  1.Create a Life Claim and download a Policy.
  2.Navigate to the Policy Tracking Screen.
  3.Select the Insured Unit and Navigate to the Insured Unit Screen.
  4.Select any coverage and navigate to the Coverage Screen.
  5.View the Coverage screen and verify all the fields of a Life Coverage
   */
  test('AssureClaims_CoverageScreen_test_02', async t => {
    await t.wait(5000)
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber , "NA");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    /*==========================================================Including Coverage On Created LC Claim Started Here========================================================================================================================================================================================================================================================================================================*/
    console.log("Navigating to Coverage Details Screen On downloaded Policy Started".yellow); 
    await Nav_Utility.AssureClaims_ElementClick_Utility(Life_Claims.AssureClaim_Btn_PolicyOpen,"Policy Open Button Is Clicked")
    await t.wait(5000)
    await t.pressKey('tab')
    await t.wait(5000)
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(Pol_Track.AssureClaims_ViewAll_PolicyUnits,"View All Policy Units is clicked");
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Pol_Track.AssureClaims_UnitDesc_Link, "Policy Units link is clicked");
    await t.wait(2000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(Pol_Track.AssureClaims_CovType_Link, "Coverage Type link is clicked");
    await t.wait(2000)
    console.log("Policy Coverage Screen Is Opened")
    await t.wait(5000)
    await t.switchToMainWindow();
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Coverages Information Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On People Maintenance Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back Button On Policy Tracking Screen")
    console.log("Navigating to Coverage Details Screen On downloaded Policy Completed".yellow);   
   /*==========================================================Including Coverage On Created LC Claim Completed Here========================================================================================================================================================================================================================================================================================================*/
  });

  /*
  1.Deleting Claim
   */
  test('DeleteClaim_Test_03', async t => {
    await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrLifeClaimNumber, "NA");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
    /*===========================================================Claim Delete Is Started Here========================================================================================================================================================================================================================================================================================================*/
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_DeleteRecord, "Delete claim")
    /*===========================================================Claim Delete Is Completed Here========================================================================================================================================================================================================================================================================================================*/
  });

});