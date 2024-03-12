import {Selector} from 'testcafe';

class POM_Litigation{
    constructor(){
        this.AssureClaims_Litigation_Txt_DocketNumber = Selector('#docketnumber');
        //POM For Litigation DocketNumber On Litigation Creation Page

         this.AssureClaims_Litigation_Txt_SuitDate = Selector('#suitdate').nth(1);
        //POM For Suit Date On Litigation Creation Page

         this.AssureClaims_Litigation_Txt_CourtDate = Selector('#courtdate').nth(1);
        //POM For Court  Date On Litigation Creation Page

         this.AssureClaims_Litigation_Btn_VenueState = (Selector('#btn_venuestateid_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM For Venue State Lookup Button  On Litigation Creation Page

        this.AssureClaims_Litigation_Lnk_SelectVenueState = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
        //POM For Venue State Hyperlink On Clicking Venue State Lookup Button On Litigation Creation Page

        this.AssureClaims_Litigation_Btn_LitigationType = Selector('#btn_littypecode_openlookup');
        //POM For Litigation Type Lookup Button  On Litigation Creation Page

        this.AssureClaims_Litigation_Lnk_LitigationType = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
        //POM For LitigationType Hyperlink On Clicking LitigationType Lookup Button On Litigation Creation Page
        
        this.AssureClaims_Litigation_Btn_LitigationStatus = Selector('#btn_litstatuscode_openlookup');
        //POM For Litigation Status Lookup Button  On Litigation Creation Page

        this.AssureClaims_Litigation_Lnk_LitigationStatus = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
        //POM For Litigation Status Hyperlink On Clicking Litigation Status Lookup Button On Litigation Creation Page

        this.AssureClaims_Litigation_Tab_LitigationInfo = Selector('[class="accordion-toggle"]').find('span').withText('Litigation Info');
        //POM For Litigation info Tab

         this.AssureClaims_Litigation_Tab_AttorneyInformation = Selector('[class="accordion-toggle"]').find('span').withText('Attorney Information');
        //POM For Attorney Information Tab

        this.AssureClaims_Litigation_Tab_MatterInfo = Selector('[class="accordion-toggle"]').find('span').withText('Matter Info');
        //POM For Matter Info Tab

        this.AssureClaims_Litigation_Tab_Supplementals = Selector('[class="accordion-toggle"]').find('span').withText('Supplementals');
        //POM For Supplementals Tab

        this.AssureClaims_Litigation_Btn_AddLitigation = Selector('[aria-label="Add Litigation"]');
        //POM For LitigationType Hyperlink On Clicking LitigationType Lookup Button On Litigation Creation Page
               
        this.AssureClaims_Litigation_Txt_ZipCode = Selector('#litattzipcode');
        //POM For ZipCode Text Box On Litigation Creation Page

        this.AssureClaims_Litigation_Txt_MatterInfoFirstName = Selector('#claimantfirstname');
        //POM For First Name TextBox  On Litigation Creation Page
        
         //ANURAG'S CODE:RMA-82420
        this.AssureClaims_Litigation_Txt_CourtName = Selector('#courtname');
        //POM For Litigation Court Name On Litigation Creation Page

        this.AssureClaims_Litigation_Txt_County = Selector('#lookup_county');
        //POM For County field On Litigation Creation Page

        this.AssureClaims_Litigation_Txt_MatterName = Selector('#mattername');
        //POM For Matter Name On Matter Info Tab
        
         this.AssureClaims_Litigation_Txt_AttorneyLasttName = Selector('#lookup_litattlastname');
        //POM For Litigation AttorneyLastName  On Litigation Creation Page

        //==============================================================Rma-99791 Melissa Address Auto Complete and Address Verification Code Starts===========================================
        this.AssureClaims_WorkersComp_Txt_LitigationAddress1 = Selector('#lookup_judgeaddr1');
        // POM for Litigation Address1
    
        this.AssureClaims_WorkersComp_Txt_AttorneyAddress1 = Selector('#lookup_litattaddr1');
        // POM for Litigation Attorney Address1
       //==============================================================Rma-99791 Melissa Address Auto Complete and Address Verification Code Ends===========================================
        
        //Muskan's Code : RMA-97688
        this.AssureClaims_Litigation_Btn_AddPersonInv = Selector('[aria-label=" Persons Inv."]')
        //POM for Person involved button
      
        this.AssureClaims_Litigation_Txt_JudgeLastName=Selector('#lookup_judgelastname')
        //POM for judge lastname textbox

        this.AssureClaims_Litigation_Txt_AttorneyLastName=Selector('#lookup_litattlastname')
        //POM for attorney lastname textbox

    }
};export default POM_Litigation;
