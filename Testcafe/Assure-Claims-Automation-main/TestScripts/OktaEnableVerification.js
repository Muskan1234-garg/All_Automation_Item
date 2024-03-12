import { Selector, Role } from 'testcafe';
import Verification_Utility from "../Functional_Utilities/Verification_Utility";
import Navigation_Utility from "../Functional_Utilities/Navigation_Utility";
import Input_Utility from '../Functional_Utilities/Input_Utility'
import Functionality_Utility from "../Functional_Utilities/Functionality_Utility";
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_Login from '../Functional_POM/POM_Login';
import POM_SMS from '../Functional_POM/POM_SMS';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';


import { enable } from 'colors';

const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const Function_Utility = new Functionality_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const POM_LoginPOM = new POM_Login();
const SMS_POM = new POM_SMS();


const DataIUT = require("../DataFiles/DataPlatform.json");
// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109411 
/* Description : 1.If Okta is enabled Login with Assure claims else enable it and do the same
                 2.Assure claims authentication
                 3.Go to security
                 4.Verify rkotak@csc.com user is available.
                 5.Open Authentication Provider Setting
                 6.Select SSO- Single sign on
                 7.Verify : 
                    a. Enabled checkbox 
                    b. Enable Internal Authentication 
                    c. IDP Display Name: Okta

                 */

//AUTHOR           : Tushar Bachchan
//DEPENDANCY       : No
//PRE-REQUISITES   : None
//Preferred Server : Platform, DSN : AssureClaims
// *******************************************************************************************************************************
var strNameTobeVerified = "rkotak rkotak";
var strUserNameTobeVerified = "rkotak@csc.com";

DataIUT.forEach(data => {

    fixture`OktaEnableVerification`.beforeEach(async t => {
    });

    /* Steps for AssureClaims_SSO_EnableOkta_Test_01
        1.Login into Assure claims 
        2.Check Assure Claims Authentication checkbox is present or not
        3. If present -> Move Forward to next test else enable it and move forward
    */

    test('AssureClaims_SSO_EnableOkta_Test_01', async t => {

        //================================================= Navigation to Okta Enabled Assure Claims URL Started =========================================================
        await t.navigateTo(data.URL);
        await t.maximizeWindow()
        //================================================== Navigation to Okta Enabled Assure Claims URL ended  =========================================================
        //================================================== Redirected to Okta Login Page ===============================================================================
        await t.wait(5000)
        let strAssureClaimsChkVisible = await (POM_LoginPOM.AssureClaims_Authentication_Lnk_AssureClaimsAuthentication).exists
        if(!strAssureClaimsChkVisible) {
            console.log("Okta not Enabled hence Enabling Okta");
            await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security');
            await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
            await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Setting, "Setting")
            await t.wait(5000)
            await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Lnk_SingleSignOnProviders, "Single Sign On Providers")
            // Check Enable Checkbox
            await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(SMS_POM.AssureClaims_SMS_Chk_EnableSSO, 'Check', "Enable SSO Checkbox");
            console.log("Okta enabled");

        }
        else{
            console.log("Okta already enabled")
        }
        
    });

    /* Steps for AssureClaims_SSO_Login_Test_02
            1.Login with Assure claims 
            2.Assure claims authentication
            3.Go to security
            4.Verify rkotak@csc.com user is available.
            5.Open Authentication Provider Setting
            6.Select SSO- Single sign on
            7.Verify :
                a. Enabled checkbox 
                b. Enable Internal Authentication 
                c. IDP Display Name: Okta
        */

    test('AssureClaims_SSO_VerifyUsername_Test_02', async t => {

        //================================================= Navigation to Okta Enabled Assure Claims URL Started =========================================================
        await t.navigateTo(data.URL);
        await t.maximizeWindow()
        //================================================== Navigation to Okta Enabled Assure Claims URL ended  =========================================================
        //================================================== Redirected to Okta Login Page ===============================================================================
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(POM_LoginPOM.AssureClaims_Authentication_Lnk_AssureClaimsAuthentication, "AssureClaims Authentication Option");
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Security')

        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Refresh, "Refresh Button on Security Management System Screen")
        await t.wait(8000)

        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_DataSources, "Expand Icon For Datasources On SMS Screen");
        var DSNExpand = Selector('[id="' + data.DSN + '"]').parent('li').find('[class="tree-branch-head c-iCollapsed"]');
        await Nav_Utility.AssureClaims_ElementClick_Utility(DSNExpand, "Expand Icon For DSN On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Expand_PermissionToLogin, "Expand Icon Permission to Login On SMS Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Label_Options.withText(strNameTobeVerified), "Last Name to be verified on SMS Screen");
        
        
        //=============================================== verification for Logged in Username in Okta Dashboard started ===================================================
        const elementWithId = Selector(id => { return document.getElementById(id); });
        // await Verify_Utility.AssureClaims_ElementExist_Utility(elementWithId(strNameTobeVerified), "Required Username")
        await Nav_Utility.AssureClaims_ElementClick_Utility(elementWithId(strNameTobeVerified), "Required Username")
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Selector('[aria-label="Login Name"]') ,strUserNameTobeVerified, "username")

        //=============================================== verification for Logged in Username in Okta Dashboard ended =====================================================
        // click on setting
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Btn_Setting, "Setting")
        
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMS_Lnk_SingleSignOnProviders, "Single Sign On Providers")
        //======================================Verification of checked Enable Checkbox started====================================================
        await Verify_Utility.AssureClaims_CheckedUncheckedStateVerification_Utility(SMS_POM.AssureClaims_SMS_Chk_EnableSSO, 'Checked', "Enable SSO Checkbox");
        //======================================Verification of checked Enable Checkbox ended====================================================
        //======================================Verification of checked Enable Internal Authentication Checkbox started====================================================
        await Verify_Utility.AssureClaims_CheckedUncheckedStateVerification_Utility(SMS_POM.AssureClaims_SMS_Chk_EnableInternalAuth, 'Checked', "Enable Internal Authentication Checkbox");
        //======================================Verification of checked Enable Internal Authentication Checkbox ended====================================================

        //===============================Verification of okta in grid started==========================================================
        await In_Utility.AssureClaims_SetValue_Utility(SMS_POM.AssureClaims_SMS_Txt_IDPDisplayName, "okta", "Okta")
        const Header1 = ["IDP Display Name"]
        const Val1 = ["okta"]
        await Verify_Utility.AssureClaims_VerifyUXGrid_Utility("okta", "Authentication Provider setting grid", Header1, Val1)  
        //===============================Verification of okta in grid ended==========================================================
        
    });


});
