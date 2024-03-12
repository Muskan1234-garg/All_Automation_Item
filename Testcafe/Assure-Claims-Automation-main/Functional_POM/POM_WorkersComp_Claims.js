import {Selector,t} from 'testcafe';

class POM_WorkersComp_Claims{
    constructor(){
    
        //this.AssureClaims_WorkersComp_Claims_ClaimWCIframe = (Selector('[id^="claimwc"]'));
        this.AssureClaims_WorkersComp_Claims_Txt_DateOfEvent = (Selector('#ev_dateofevent').nth(1));
        //POM of Date of Event On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Txt_DateOfClaim = (Selector('#dateofclaim').nth(1));
         //POM of Date of Claim On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Txt_TimeOfEvent = (Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'));
         //POM of Time of Event On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Txt_TimeOfClaim = (Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'));
     //POM of Time of Claim On WC Claim Screen  

        this.AssureClaims_WorkersComp_Claims_Btn_ClaimStatus = (Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM of Claim Status Button On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM of Claim Status Value On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Btn_ClaimType = (Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Type Button On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Lnk_SelectClaimType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Type Value On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Btn_PolicyLOBLookup = (Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Policy LOB  Button On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Lnk_SelectPolicyLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM of Policy LOB  Value On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Txt_ClaimInfo_Dept = (Selector('#lookup_ev_depteid'));
        //POM of Department On WC Claim Screen
        
        //ANURAG'S CODE :RMA 85449
         this.AssureClaims_WorkersComp_EmployeeInfo_Tab_LastName=Selector("#emplastname")
        //POM for Employee last name

        this.AssureClaims_WorkersComp_Claims_RightChild_PI_Lookup=Selector("#associated-pi").find('[class="material-icons material-icons-right listMore dotIcon ng-binding"]')
        //POM for PI Lookup

        this.AssureClaims_WorkersComp_Claims_PILookup_Name_Txt=Selector('[class="ng-scope sortable"]').withText('Name').find('input')
        //POM for PI Lookup

        this.AssureClaims_WorkersComp_Claims_Btn_Jurisdiction= (Selector('#btn_filingstateid_openlookup'));
        //POM of Jurisdiction Button on WC Claim Screen

        this.AssureClaims_WorkersComp_Claims_Lnk_Jurisdiction = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
        //POM of Jurisdiction Type Value On WC Claim Screen

        this.AssureClaims_WorkersComp_Claims__Select_EmployeeNum = (Selector('[ng-model="lookupCtrl.entitydisplay"]'));
    
        this.AssureClaims_WorkersComp_Txt_Claimnumber = (Selector('#claimnumber'));

        this.AssureClaims_WorkersComp_Claims_Tab_Employeeinfo = (Selector('[role="button"]').find('span').withText('Employee Info').nth(1));

        
        this.AssureClaims_WorkersComp_Claims_Txt_ClaimActivity=Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000C"]').find('input')
        //POM for Claim Activity Text Box

        this.AssureClaims_WorkersComp_Btn_QuickSummary=Selector('[title="Expand"]');
        //POM for Expand button

        this.AssureClaims_WorkersComp_Txt_VerifyDetail=Selector('[ng-repeat="key in list.rowData"]')
        //POM for Verify Detail
        
        		//EDIT ANURAG CODE

        
        this.AssureClaims_WorkersComp_Claims_RightChild_Adjuster_Lookup=Selector("#associated-adjuster").find('[class="material-icons material-icons-right listMore dotIcon ng-binding"]')
        //POM for Adjuster Lookup

        this.AssureClaims_WorkersComp_Claims_AdjusterLookup_AdjusterType_Txt=Selector('[class="ng-scope sortable"]').withText('Adjuster Type').find('input')
        //POM for Adjuster Type
		
		this.AssureClaims_WorkersComp_Claims_AdjusterLookup_CreateDate_Txt=Selector('[class="ng-scope sortable"]').withText('Created Date').find('input')
        //POM for Adjuster Create Date

        //Avinash code
        this.AssureClaims_WorkersComp_Adjuster_Checkbox = (Selector('#currentadjflag'));
	//===========================================RMA-99791 (Mellisa Address Auto Complete and Address Verification) Code Starts========================================================================
        this.AssureClaims_WorkersComp_Txt_EmployeeSSN = Selector('#emptaxid');
        //POM for Employee SSN

        this.AssureClaims_WorkersComp_Txt_EmployeeAddress1 = Selector('#lookup_empaddr1');
        //POM for Employee Address1

        this.AssureClaims_WorkersComp_Claims_Tab_EventDetail = (Selector('[role="button"]').find('span').withText('Event Detail').nth(1));
        //POM for Navigating to Event detail tab

        this.AssureClaims_WorkersComp_Txt_EventDetail_LocationAddress1 = Selector('#lookup_ev_addr1');
        //POM for Event Detail Location Address1

        this.AssureClaims_WorkersComp_Claims_Tab_LitigationAddress1 = Selector('#lookup_judgeaddr1');
        // POM for Litigation Address1

        //===========================================RMA-99791 (Mellisa Address Auto Complete and Address Verification) Code Ends========================================================================

    }
};
    export default POM_WorkersComp_Claims;
