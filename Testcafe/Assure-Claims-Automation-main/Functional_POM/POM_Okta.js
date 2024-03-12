import {Selector} from 'testcafe';

class POM_Okta{
    constructor(){
        
        this.AssureClaims_Okta_Txt_UserNameTextBox = Selector("#idp-discovery-username");
        // POM for Okta Username Textbox

        this.AssureClaims_Okta_Txt_PasswordTextBox = Selector("#okta-signin-password");
        // POM for Okta Username Textbox

        this.AssureClaims_Okta_Btn_Next = Selector("#idp-discovery-submit");
        // POM for Submit button
        
        this.AssureClaims_Okta_Btn_SignIn = Selector("#okta-signin-submit");
        // POM for sign in button

        this.AssureClaims_OktaDasboard_Txt_LoggedInUser = Selector('[aria-label="open dropdown menu"]').find('div');
        // POM for Value of Logged In User in Okta Dashboard

    }
};export default POM_Okta;
