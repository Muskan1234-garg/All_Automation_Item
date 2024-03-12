import { Selector, t} from 'testcafe';
class POM_Claimant {
constructor(){
    this.AssureClaims_Claimant_Btn_AddClaimant = Selector('[aria-label="Add Claimant"]');
    //POM For Claimant Add Button On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_LastName = Selector('#lookup_clmntlastname');
    //POM For Claimant LastName On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_FirstName = Selector('#clmntfirstname');
    //POM For Claimant FirstName On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_MiddleName = Selector('#clmntmiddlename');
    //POM For Claimant MiddleName On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_Address1 = Selector('#lookup_clmntaddr1');
    //POM For Claimant Address1 On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_Address2 = Selector('#clmntaddr2');
    //POM For Claimant Address2 On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_Address3 = Selector('#clmntaddr3');
    //POM For Claimant Address3 On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_SocSecNo = Selector('#clmnttaxid');
    //POM For Claimant SSNNumber On Claimant Creation Page
    this.AssureClaims_Claimant_Btn_Country = Selector('#btn_clmntcountrycode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
    //POM For Claimant Country OpenLookup Button On Claimant Creation Page
    this.AssureClaims_Claimant_Lnk_SelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Claimant Country Select On Claimant Creation Page
    this.AssureClaims_Claimant_Btn_State = Selector('#btn_clmntstateid_openlookup').find('.glyphicon.glyphicon-option-horizontal')
    //POM For Claimant State OpenLookup Button On Claimant Creation Page
    this.AssureClaims_Claimant_Lnk_SelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
     //POM For Claimant State Select On Claimant Creation Page
    this.AssureClaims_Claimant_Txt_City = Selector('#clmntcity');
     //POM For Claimant City On Claimant Creation Page
    this.AssureClaims_Claimant_Btn_Save = (Selector('#Save').find('i').withText('save'));
     //POM For Claimant Save Button On Claimant Creation Page

     this.AssureClaims_Claimant_Tab_ClaimantInfo=(Selector('[role="button"]').find('span').withText('Claimant Info'))
     //POM for Selecting Claimant Info Accordian On Claimant Screen

     this.AssureClaims_Claimant_Tab_ClaimantAttorney=(Selector('[role="button"]').find('span').withText('Claimant Attorney'))
     //POM for Selecting Claimant Attorney Accordian On Claimant Screen

     this.AssureClaims_Claimant_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
     //POM for Selecting Supplementals Accordian On Claimant Screen
   
     //    yashaswi's code RMA:96161
    
     this.AssureClaimsApp_Txt_ClaimantState=Selector('#lookup_clmntstateid');
     //POM for state text box on claimant screen
     
     this.AssureClaimsApp_Txt_ClaimantCountry = Selector('#lookup_clmntcountrycode')
     //POM for country text box on claimant screen
    
}
};
export default  POM_Claimant;
