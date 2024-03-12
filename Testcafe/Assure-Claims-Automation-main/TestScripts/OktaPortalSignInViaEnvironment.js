import { Selector, Role } from 'testcafe';
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from '../Functional_Utilities/Input_Utility'
import POM_Login from '../Functional_POM/POM_Login';
import POM_Okta from '../Functional_POM/POM_Okta';
import { enable } from 'colors';

const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const POM_LoginPOM = new POM_Login();
const Okta_POM = new POM_Okta();
const DataIUT = require("../DataFiles/DataPlatform.json");


DataIUT.forEach(data => {

    fixture`OktaPortalSignInViaEnvironment`.beforeEach(async t => {
    });

    /* Steps for AssureClaims_SSO_Login_Test_01
        1. Hit the Okta Enabled Assure Claims URL and click OKTA
        2. Redirected to Okta Login Page
        3. Enter credentials for Okta Login Page
        4. Navigate to Okta Portal, should open Okta Dasboard directly
        5. Verification of Logged in username in Okta Dashboard
    */

    test('AssureClaims_SSO_Login_Test_01', async t => {

        //================================================= Navigation to Okta Enabled Assure Claims URL Started =========================================================
        await t.navigateTo(data.URL);
        await t.maximizeWindow()
        //================================================== Navigation to Okta Enabled Assure Claims URL ended  =========================================================
        //================================================== Redirected to Okta Login Page ===============================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Authentication_Btn_Okta, "Okta Option");
        await t.wait(5000)
        await In_Utility.AssureClaims_SetValue_Utility(Okta_POM.AssureClaims_Okta_Txt_UserNameTextBox, data.Username_Okta, "Okta Login Box");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Okta_POM.AssureClaims_Okta_Btn_Next, "Next Button");
        await In_Utility.AssureClaims_SetValueForUserAndPassword_Utility(Okta_POM.AssureClaims_Okta_Txt_PasswordTextBox, data.Password_Okta, "Okta Password Box");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Okta_POM.AssureClaims_Okta_Btn_SignIn, "Sign in Button");
        await t.wait(5000)
        //================================================= Navigate to Okta Portal started ===============================================================================
        await t.navigateTo(data.URL_Okta);
        await t.wait(5000)
        //====================================================== Navigate to Okta Portal ended ============================================================================
        //=============================================== verification for Logged in Username in Okta Dashboard started ===================================================
        await Verify_Utility.AssureClaims_ElementExist_Utility(Okta_POM.AssureClaims_OktaDasboard_Txt_LoggedInUser.withText(data.Username_Okta), "Okta logged in username")
        //=============================================== verification for Logged in Username in Okta Dashboard ended =====================================================

    });






});
