import {Selector,t} from 'testcafe';
class POM_Arbitration {
    constructor(){
        this.AddArbitration = Selector('[aria-label="Add Arbitration"]');
        //POM for Add Arbitration Button on Claim Page

        this.AssureClaims_Arbitration_Txt_Type = Selector('#btn_arbtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
        //POM for Arbitration Type Lookup Button  on Arbitration Page

        this.AssureClaims_Arbitration_Lnk_SelectType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM for Arbitration Type Lookup Value on Arbitration Page

        this.AssureClaims_Arbitration_Txt_ClaimNumber = Selector('#arbclaimnum');
        //POM for Claim Number Field on Arbitration Page

        this.AssureClaims_Arbitration_Tab_ArbitrationInfo=(Selector('[role="button"]').find('span').withText('Arbitration Info'))
        //POM for Selecting Arbitration Info Accordian On Arbitration Screen

        this.AssureClaims_Arbitration_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
        //POM for Selecting Supplementals Accordian On Arbitration Screen
        
        this.AssureClaims_Arbitration_Txt_ArbitrationParty = Selector('#lookup_arbpartycode')
        //Pom for selecting the arbitaryparty
        
        
    }
};
export default POM_Arbitration