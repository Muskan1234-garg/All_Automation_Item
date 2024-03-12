import { Selector, Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PowerView_New from '../Functional_POM/POM_PowerView';
import POM_Okta from '../Functional_POM/POM_Okta'
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';

const Home_POM = new POM_Home();
const DataIUT = require('../DataFiles/DataIUT.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const PowerView_POM = new POM_PowerView_New();
const Okta_POM = new POM_Okta();
const Generic_Claims = new POM_Generic_Claims();
const fs = require('fs');

var faker = require('faker');
var StrClaimNumber;
var d;

//*************************************************************************************************************************************************************
//JIRA ID OF STORY : RMA-109530
//Description      : Verification Of Okta Login Via GC Claim Screen Incase User Is Logged In DXC Assure Claims Server With Assure Claims Credential 
//AUTHOR 		       : 0.0 Parul Sharma 03/10/2024
//DEPENDANCY 	     : Need to Run Analytics_Dashboard ,Analytics_DashBoard_GC_Configuration Test cases before running this.
//PRE-REQUISITES   : None
//Preferred Server : IUT OR STAGING or Regression (DataAutoRegDSN_3)
//Revision         : 
// *************************************************************************************************************************************************************


DataIUT.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`Analytics_DashBoard_Claimscreen_Okta_verification`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });
  /* Steps performed by Analytics_DashBoard_Claimscreen_Okta_verification_01 code :
            1. Login Into Application with User In Power View
            2. Select DSN
            3. Create GC Claim
            4. Verify Analytics Claims Dashboard Button Is Present On Claims Screen
            5. Click on Claims Dashboard Button
            6. Enter OKTA Credentials and Submit
                */
  test('Analytics_DashBoard_Claimscreen_Okta_verification_01', async t => {

    d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    //======Claim Creation Started Here=====================
    console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
    StrClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(d, d, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
    console.log("New General Claim is Created with Claim Number: ".green + StrClaimNumber);
    //Claim Creation  completed      
    // Code For Opening Claims Dashboard Started Here
    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Btn_AnalyticsClaimsDashboard, "Analytics Claims Dashboard Button Is Clicked");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Generic_Claims.AssureClaims_GenericClaim_Analytics_Frame_AnalyticsDashboardLabel.withText("Claims Dashboard"), "Analytics Claims Dashboard Frame Is Clicked");
    await t.wait(2000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaims_Analytics_Dashboard_Iframe);
    await In_Utility.AssureClaims_SetValue_Utility(Okta_POM.AssureClaims_Okta_Txt_UserNameTextBox, data.OktaUserName, "Okta Login Box");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Okta_POM.AssureClaims_Okta_Btn_Next, "Next Button");

    await In_Utility.AssureClaims_SetValueForUserAndPassword_Utility(Okta_POM.AssureClaims_Okta_Txt_PasswordTextBox, data.OktaPassword, "Okta Password Box");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Okta_POM.AssureClaims_Okta_Btn_SignIn, "Sign in Button");

    await t.wait(1000)
    // Code For Opening Claims Dashboard Completed Here
  });


});
