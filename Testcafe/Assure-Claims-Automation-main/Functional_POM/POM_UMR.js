import { Selector, t} from 'testcafe';
class POM_UMR {
constructor(){
	
    this.AssureClaims_UMR_Btn_AddUMR = Selector('[aria-label="Add UMR"]');
    //POM For UMR Add Button On UMR Creation Page
	
    this.AssureClaims_UMR_Txt_Number = Selector('#umrnumber');
    //POM For UMR Number On UMR Creation Page
	
	this.AssureClaims_UMR_Txt_EffectiveDate = Selector('#umreffdate').nth(1);
    //POM for Effective Date On UMR Creation Page

    this.AssureClaims_UMR_Txt_ExpirationDate = Selector('#umrexpdate').nth(1);
    //POM for Expiration Date on UMR Creation Page
    
	this.AssureClaims_UMR_Txt_YearofAccount = Selector('#umryearofaccount');
    //POM For UMR YearofAccount On UMR Creation Page
    
	this.AssureClaims_UMR_Btn_LOB = Selector('#btn_umrlob').find('.glyphicon.glyphicon-option-horizontal')
    //POM For UMR LOB OpenLookup Button On UMR Creation Page
	
    this.AssureClaims_UMR_Lnk_SelectLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
     //POM For UMR LOB Select On UMR Creation Page
    
    this.AssureClaims_UMR_Btn_RiskCodes = Selector('#btn_umrriskcode').find('.glyphicon.glyphicon-option-horizontal');
    //POM For UMR RiskCode OpenLookup Button On UMR Creation Page
	
    this.AssureClaims_UMR_Lnk_SelectRiskCode = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For UMR RiskCode Select On UMR Creation Page
	
	 this.AssureClaims_UMR_Txt_AuthorityLimit = Selector('#umrauthlimit');
    //POM For UMR AuthorityLimit On UMR Creation Page
   


   
}
};
export default  POM_UMR;