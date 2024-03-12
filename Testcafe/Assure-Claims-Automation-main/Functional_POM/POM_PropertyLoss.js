import {Selector,t} from 'testcafe';

class POM_PropertyLoss{
    constructor(){
    this.AssureClaims_PropertyLoss_Btn_AddPropertyLoss = Selector('[aria-label="Add Property"]');
        //POM For Quotation Add Button

       this.AssureClaims_PropertyLoss_Tab_PropertyLossInfo = (Selector('[role="button"]').find('span').withText('Property Loss Information'))
        //POM of PropertyInfo On Property Claim Screen

        this.AssureClaims_PropertyLoss_Btn_PropertyId = Selector('#btn_pi_propertyid').find('i');
        //POM of Property Id Look Up Button On Property Claim Screen

        this.AssureClaims_PropertyLoss_Txt_SearchPropertyId = Selector('[name="Property ID"]');
        //POM of Property ID Text Box On Property Lookup

        this.AssureClaims_SearchCriteria_Btn_SubmitQuery = ('#submitquery');
        //POM of SubmitQuery On Property Search Window

        this.AssureClaims_PropertyLoss_Lnk_PropertyId = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM OF Property Id Link On Property Selection Window      

        this.AssureClaims_PropertyLoss_Btn_StolenPropertyType = (Selector('#btn_plstolenproperty').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Stolen Property Type Lookup Button On Property Claim Screen

        this.AssureClaims_PropertyLoss_Lnk_SelectStolenPropertyType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Stolen Property Type Link On Property Claim Screen

        this.AssureClaims_PropertyLoss_Btn_TypeOfProperty = (Selector('#btn_pltypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Type Of Property Lookup Button On Property Claim Screen

        this.AssureClaims_PropertyLoss_Lnk_SelectTypeOfProperty = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Type Of Property Link On Property Claim Screen

        this.AssureClaims_PropertyLoss_Btn_PropertyInvolved = (Selector('#btn_plinvolvedlist').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Property Involved Lookup Button On Property Claim Screen

        this.AssureClaims_PropertyLoss_Lnk_SelectPropertyInvolved = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Property Involved Link On Property Claim Screen

        this.AssureClaims_PropertyLoss_Txt_EstimatedDamage = (Selector('#plEstDamage').nth(1));
        //POM of Estimated Damage Text Box On Property Claim Screen

    }};
    export default POM_PropertyLoss;