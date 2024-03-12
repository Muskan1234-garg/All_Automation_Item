import { Selector, t} from 'testcafe';
class POM_Syndicate {
constructor(){
	
    this.AssureClaims_Syndicate_Btn_AddSyndicate = Selector('[aria-label="Add Syndicate/Insurer"]');
    //POM For Syndicate Add Button On Syndicate Creation Page
	
    this.AssureClaims_Syndicate_Txt_Number = Selector('#synnumber');
    //POM For Syndicate Number On Syndicate Creation Page
    
	this.AssureClaims_Syndicate_Txt_Name = Selector('#lookup_synlastname');
    //POM For Syndicate Name On Syndicate Creation Page
    
    this.AssureClaims_Syndicate_Txt_Address1 = Selector('#synaddr1');
    //POM For Syndicate Address1 On Syndicate Creation Page
    
	this.AssureClaims_Syndicate_Txt_Address2 = Selector('#synaddr2');
    //POM For Syndicate Address2 On Syndicate Creation Page
    
	this.AssureClaims_Syndicate_Txt_Address3 = Selector('#synaddr3');
    //POM For Syndicate Address3 On Syndicate Creation Page
	
	this.AssureClaims_Syndicate_Txt_City = Selector('#syncity');
     //POM For Syndicate City On Syndicate Creation Page
	
	this.AssureClaims_Syndicate_Btn_State = Selector('#btn_synstateid_openlookup').find('.glyphicon.glyphicon-option-horizontal')
    //POM For Syndicate State OpenLookup Button On Syndicate Creation Page
	
    this.AssureClaims_Syndicate_Lnk_SelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
     //POM For Syndicate State Select On Syndicate Creation Page
	 
    this.AssureClaims_Syndicate_Btn_Country = Selector('#btn_syncountrycode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
    //POM For Syndicate Country OpenLookup Button On Syndicate Creation Page
	
    this.AssureClaims_Syndicate_Lnk_SelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM For Syndicate Country Select On Syndicate Creation Page
   
}
};
export default POM_Syndicate;