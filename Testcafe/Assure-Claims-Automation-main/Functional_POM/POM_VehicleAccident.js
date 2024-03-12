import {Selector,t} from 'testcafe';

class POM_VehicleAccident{
    constructor(){
        
        this.AssureClaims_VehicleAccidentClaim_Txt_DateOfEvent = (Selector('#ev_dateofevent').nth(1));
       //POM of Date of Event On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Txt_DateOfClaim = (Selector('#dateofclaim').nth(1));
         //POM of Date of Claim On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Txt_TimeOfEvent = (Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'));
         //POM of Time of Event On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Txt_TimeOfClaim = (Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'));
         //POM of Time of Claim On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Btn_ClaimStatus = (Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
         //POM of Claim Status Button On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM of Claim Status Value On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Btn_ClaimType = (Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Type Button On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Lnk_SelectClaimType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Type Value On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Btn_PolicyLOBLookup = (Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Policy LOB  Button On VehicleAccident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Lnk_SelectPolicyLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Policy LOB  Value On Vehicle Accident Claim Screen

        this.AssureClaims_VehicleAccidentClaim_Txt_ClaimInfo_Dept = (Selector('#lookup_ev_depteid'));
        //POM of Department On Vehicle Accident Claim Screen
        
    }};
    export default POM_VehicleAccident;