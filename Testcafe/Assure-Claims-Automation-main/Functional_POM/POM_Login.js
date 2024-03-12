import {Selector,t} from 'testcafe';

class POM_Login{
    constructor(){
        this.AssureClaims_Login_LoginUserNameTextbox = Selector('#username');
        this.AssureClaims_Login_LoginPasswordTextbox = Selector('#login-password');
        this.AssureClaims_Login_DSNComboBoxSelect = Selector('[ng-model="dsnSelected"]');
        this.AssureClaims_Login_DSNSelection = Selector('[role="option"]').find('span');
        this.AssureClaims_Login_ZoneComboBoxSelect = Selector('[ng-model="zoneSelected"]');
        this.AssureClaims_Login_ZoneSelection = Selector('[role="option"]').find('a');
        this.AssureClaims_Login_ContinueButtonOnLogin = Selector('#loginbox').find('button').withText('Continue');
        this.AssureClaims_Login_RecentViewedIcon = Selector('[uib-tooltip="Recently Viewed"]');
        this.AssureClaims_LogOut_LogoutBtnOptions = Selector('#morebtn').find('i').withText('more_vert');
        this.AssureClaims_LogOut_LogoutBtn = Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout');
        this.AssureClaims_LogOut_LogoutOkBtn = Selector('#btnRoll').find('i').withText('done');
        
        // Parul's Code : RMA-107123
        this.AssureClaims_Login_Landingpage_DSNComboBoxSelect = Selector('[role="trigger"]');
        //POM for DSN ComboBox on Landing Page
        
        this.AssureClaims_Login_Landingpage_DSNSelection = Selector('[role="listbox"]').find('span');
        //POM for DSN ComboBoxList on Landing Page
        
        this.AssureClaims_Login_Landingpage_ZoneSelectionCard = Selector('[class="content childComponents"]').find('span');
        //POM for Zone Card on Landing Page
        
        // Tushar's Code : RMA-109420
        
        this.AssureClaims_Authentication_Btn_Okta = Selector('[aria-label="okta"]');
        // POM for Okta button in Authentication Page

        this.AssureClaims_Authentication_Lnk_AssureClaimsAuthentication = Selector('[aria-label="Assure Claims Authentication"]');
        // POM for Assure Claims Authentication button in Authentication Page

        this.AssureClaims_Login_PowerViewComboBoxSelect = Selector('[class="mat-select-trigger ng-tns-c21-1"]');
        //POM for Power View ComboBox on Landing Page
    }
};
export default POM_Login;
