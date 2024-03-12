import {Selector,t} from 'testcafe';
class POM_Tokens {
constructor(){

this.AssureClaims_Utility_Lnk_Tokens = (Selector('[title="Tokens"]').find('span').withText('Tokens'))
//POM for Link Tokens On Utilities

this.AssureClaims_Tokens_Lnk_Audience = Selector('[class="ng-binding"]').withText('Audience')
//POM for Audience Link on Tokens Screen

this.AssureClaims_Tokens_Lnk_Token = Selector('[class="ng-binding"]').withText('Token')
//POM for Token Link on Tokens Screen

this.AssureClaims_Tokens_Btn_AddNew = Selector('[id="btnCreate"]') 
//POM for Add New Button On Tokens

this.AssureClaims_Tokens_Btn_Delete = Selector('[id="btn_del"]') 
//POM for Delete Button On Tokens

this.AssureClaims_Audience_Txt_Name = Selector('#name') 
//POM for Name Text Box On Audience Screen

this.AssureClaims_Audience_Txt_Origin = Selector('[id="origin"]') 
//POM for Origin Text Box On Audience Screen

this.AssureClaims_Audience_Chk_ForDataCollection = Selector('#RmDataCollection')
//POM for For Assure Claims DataCollection CheckBox On Audience Screen

this.AssureClaims_Audience_Chk_Lifetime = Selector('#infinite')
//POM for Lifetime Checbox on Audience Screen

this.AssureClaims_Audience_Txt_Days = Selector('#days') 
//POM for Days Text Box On Audience Screen

this.AssureClaims_Audience_Txt_Hours = Selector('#hours') 
//POM for Hours Text Box On Audience Screen

this.AssureClaims_Audience_Txt_Minutes = Selector('#minutes') 
//POM for Minutes Text Box On Audience Screen

this.AssureClaims_Audience_Chk_Active = Selector('#active') 
//POM for Active Text Box On Audience Screen

this.AssureClaims_Audience_Btn_Save = Selector('[id="btn_Save"]')
//POM for Save Button On Audience Screen

this.AssureClaims_Audience_Txt_AudienceNameOnGrid = Selector('[class="ui-grid-cell-contents ng-binding ng-scope"]');
//POM for Audience Name Text On Audience Grid

}
}
export default POM_Tokens;