import {Selector,t} from 'testcafe';

class POM_Property_Claims{
    constructor(){
        // this.AssureClaims_PropertyClaim_DocumentMenubar = (Selector('#menuBar').find('a').withText('Document').nth(0));


       // this.AssureClaims_PropertyClaim_SelectGC = (Selector('#menu_DocumentRoot').find('a').withText('Property Claim'));


        //this.AssureClaims_PropertyClaim_ClaimGCIframe = (Selector('[id^="claimgc"]'));
        this.AssureClaims_PropertyClaim_Txt_DateOfEvent = (Selector('#ev_dateofevent').nth(1));
        //POM of Date of Event On Property Claim Screen

        this.AssureClaims_PropertyClaim_Txt_DateOfClaim = (Selector('#dateofclaim').nth(1));
         //POM of Date of Claim On Property Claim Screen

        this.AssureClaims_PropertyClaim_Txt_TimeOfEvent = (Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'));
         //POM of Time of Event On Property Claim Screen

        this.AssureClaims_PropertyClaim_Txt_TimeOfClaim = (Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'));
     //POM of Time of Claim On Property Claim Screen  

        this.AssureClaims_PropertyClaim_Btn_ClaimStatus = (Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM of Claim Status Button On Property Claim Screen

        this.AssureClaims_PropertyClaim_Lnk_SelectClaimStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM of Claim Status Value On Property Claim Screen

        this.AssureClaims_PropertyClaim_Btn_ClaimType = (Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Type Button On Property Claim Screen

        this.AssureClaims_PropertyClaim_Lnk_SelectClaimType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Type Value On Property Claim Screen

        this.AssureClaims_PropertyClaim_Btn_PolicyLOBLookup = (Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Policy LOB  Button On Property Claim Screen

        this.AssureClaims_PropertyClaim_Lnk_SelectPolicyLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM of Policy LOB  Value On Property Claim Screen

        this.AssureClaims_PropertyClaim_Txt_ClaimInfo_Dept = (Selector('#lookup_ev_depteid'));
        //POM of Department On Property Claim Screen

        this.AssureClaims_PropertyClaim_Tab_PropertyInfo = (Selector('[role="button"]').find('span').withText('Property Info'))
        //POM of PropertyInfo On Property Claim Screen

        this.AssureClaims_PropertyClaim_Btn_PropertyId = Selector('#btn_pi_propertyid').find('i');
        //POM of Property Id Look Up Button On Property Claim Screen

        this.AssureClaims_PropertyClaim_Txt_SearchPropertyId = Selector('[name="Property ID"]');
        //POM of Property ID Text Box On Property Lookup

        this.AssureClaims_SearchCriteria_Btn_SubmitQuery = ('#submitquery');
        //POM of SubmitQuery On Property Search Window

        this.PropertyClaimCreation_Txt_PropertyId = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM OF Property Id Link On Property Selection Window
        
        //Sai's Code : RMA-92773
         this.AssureClaims_PropertyClaim_Tab_ClaimInfo = (Selector('[role="button"]').find('span').withText('Claim Info'))
        //POM of Claim Info On Property Claim Screen

    
    }};
    export default POM_Property_Claims;
