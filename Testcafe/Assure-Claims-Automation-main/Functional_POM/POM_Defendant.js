import { Selector, t} from 'testcafe';
class POM_Defendant {
constructor(){
    this.AssureClaims_Defendant_Btn_AddDefendant = Selector('[aria-label="Add Defendant"]');
    //POM For Defendant Add Button On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_LastName = Selector('#lookup_deflastname');
    //POM For Defendant LastName On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_FirstName = Selector('#deffirstname');
     //POM For Defendant FirstName On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_MiddleName = Selector('#defmiddlename');
     //POM For Defendant MiddleName On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_Address1 = Selector('#lookup_defaddr1');
     //POM For Defendant Address1 On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_Address2 = Selector('#defaddr2');
    //POM For Defendant Address2 On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_Address3 = Selector('#defaddr3');
    //POM For Defendant Address3 On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_Zip = Selector('#defzipcode');
    //POM For Defendant Zip On Defendant Creation Page
    this.AssureClaims_Defendant_Btn_Country = Selector('#btn_defcountrycode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
    //POM For Defendant Country OpenLookup Button On Defendant Creation Page
    this.AssureClaims_Defendant_Lnk_SelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Defendant Country Select On Defendant Creation Page
    this.AssureClaims_Defendant_Btn_State = Selector('#btn_defstateid_openlookup').find('.glyphicon.glyphicon-option-horizontal')
   //POM For Defendant State OpenLookup Button On Defendant Creation Page
    this.AssureClaims_Defendant_Lnk_SelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Defendant Country Select On Defendant Creation Page
    this.AssureClaims_Defendant_Txt_City = Selector('#defcity');
    //POM For Defendant City On Defendant Creation Page
    this.AssureClaims_Defendant_Btn_Save = (Selector('#Save').find('i').withText('save'));
    //POM For Defendant Save Button On Defendant Creation Page

    this.AssureClaims_Defendant_Tab_ClaimDefendantInfo=(Selector('[role="button"]').find('span').withText('Defendant Info'))
    //POM for Selecting Claim Defendant Information Accordian On Defendant Screen

    this.AssureClaims_Defendant_Tab_ClaimDefendantAttorney=(Selector('[role="button"]').find('span').withText('Defendant Attorney'))
    //POM for Selecting Claim Defendant Attorney Accordian On Defendant Screen

    this.AssureClaims_Defendant_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
    //POM for Selecting Supplementals Accordian On Defendant Screen
    
    this.AssureClaims_Defendant_Txt_AttorneyMiddleName = Selector('#defattmiddlename');
    //POM For Attorney Middle Name Text Box On Defendant Creation Page
    
        this.AssureClaims_Defendant_Txt_AttorneyLastName = Selector('#lookup_defattlastname');
    //POM For Defendant AttorneyLastName On Defendant Creation Page
}
};
export default  POM_Defendant;
