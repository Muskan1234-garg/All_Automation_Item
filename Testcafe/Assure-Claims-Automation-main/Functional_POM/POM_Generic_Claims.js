import {Selector,t} from 'testcafe';

class POM_Generic_Claims{
    constructor(){
        
        this.AssureClaims_GenericClaim_Txt_DateOfEvent = (Selector('#ev_dateofevent').nth(1));
       //POM of Date of Event On General Claim Screen

        this.AssureClaims_GenericClaim_Txt_DateOfClaim = (Selector('#dateofclaim').nth(1));
         //POM of Date of Claim On General Claim Screen

        this.AssureClaims_GenericClaim_Txt_TimeOfEvent = (Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'));
         //POM of Time of Event On General Claim Screen

        this.AssureClaims_GenericClaim_Txt_TimeOfClaim = (Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'));
         //POM of Time of Claim On General Claim Screen

        this.AssureClaims_GenericClaim_Btn_ClaimStatus = (Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
         //POM of Claim Status Button On General Claim Screen

        this.AssureClaims_GenericClaim_Lnk_SelectClaimStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM of Claim Status Value On General Claim Screen

        this.AssureClaims_GenericClaim_Btn_ClaimType = (Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Claim Type Button On General Claim Screen

        this.AssureClaims_GenericClaim_Lnk_SelectClaimType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Claim Type Value On General Claim Screen

        this.AssureClaims_GenericClaim_Btn_PolicyLOBLookup = (Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Policy LOB  Button On General Claim Screen

        this.AssureClaims_GenericClaim_Lnk_SelectPolicyLOB = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Policy LOB  Value On General Claim Screen

        this.AssureClaims_GenericClaim_Txt_ClaimInfo_Dept = (Selector('#lookup_ev_depteid'));
        //POM of Department On General Claim Screen

        this.AssureClaims_GenericClaim_Txt_ClaimNumber = Selector('#claimnumber');
        //POM Of Claim Number Field on General Claim Screen

        this.AssureClaims_GenericClaim_Txt_LocationAddress_1 = Selector('#ev_addr1');
        //POM Of LocationAddress_1 Field on Event Detail Tab Of General Claim Screen

        this.AssureClaims_GenericClaim_Txt_ReportNumber = Selector('#reportnumber');
        //POM Of Report Number Field on Loss Information Tab Of General Claim Screen

        this.AssureClaims_GenericClaim_Txt_AccordRemarks = Selector('#remarks');
        //POM Of Accord Remarks Field on Acord Tab Of General Claim Screen
        
        this.AssureClaims_GenericClaim_Tab_ClaimInfo=(Selector('[role="button"]').find('span').withText('Claim Info'))
        //POM for Selecting Claim Info Accordian On General Claim Screen

        this.AssureClaims_GenericClaim_Tab_EventDetail=(Selector('[role="button"]').find('span').withText('Event Detail'))
        //POM for Selecting Event Detail Accordian On General Claim Screen

        this.AssureClaims_GenericClaim_Tab_LossInformation=(Selector('[role="button"]').find('span').withText('Loss Information'))
        //POM for Selecting Loss Information Accordian On General Claim Screen

        this.AssureClaims_GenericClaim_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
        //POM for Selecting Supplementals Accordian On General Claim Screen

        this.AssureClaims_GenericClaim_Tab_ACORD=(Selector('[role="button"]').find('span').withText('ACORD'))
        //POM for Selecting ACORD Accordian On General Claim Screen

        this.AssureClaims_GenericClaim_Chk_PaymentFrozen=Selector('#paymntfrozenflag');
        //POM for Selecting ACORD Accordian On General Claim Screen

        this.AssureClaims_GenericClaim_Btn_PolicyNameLookup=(Selector('[name="multipolicyidPSDownloadbtn"]').find('.glyphicon.glyphicon-search'))
        //POM for lookup button for PolicyName

        this.AssureClaims_GenericClaim_Btn_InternalPolicyLookup=(Selector('#sel12\\ '))
        //POM for Search button for PolicyNameOpen 



        this.AssureClaims_GenericClaim_Btn_InternalPolicyName=(Selector('#sel12\\ ').find('option'))
        //POM for Select PolicyName

        this.AssureClaims_GenericClaim_Btn_SubmitQuery=Selector('#submitquery')
        //POM for SubmitQuery button On General Claim Screen
     
        this.AssureClaims_GenericClaim_Lnk_InternalPolicyName=(Selector('#docrefresh').find('a'))
        //POM for selecting policy name from submitquery

        this.AssureClaims_GenericClaim_Btn_PolicyPreview=Selector('#Button1')
        //POM for Policy Preview

        this.AssureClaims_GenericClaim_Btn_PolicyInsuredName= Selector('[class="ui-grid-viewport ng-isolate-scope"]').find('div').find('div').find('div').nth(4).find('[class="ui-grid-cell-contents ng-binding ng-scope ui-grid-cell-focus"]')
        //POM for Policy InsuredName

        this.AssureClaims_GenericClaim_Btn_List=(Selector('#exTab1').find('a'))
        //POM for Interest List

        this.AssureClaims_GenericClaim_Chk_InterestListClaimant=(Selector('#tab_default_2').find('.ng-pristine.ng-untouched.ng-valid.ng-empty').nth(1))
        //POM for CheckBox Claimant
       
        this.AssureClaims_GenericClaim_Chk_UnitList=(Selector('#tab_default_3').find('div').nth(2).find('div').find('table').find('tbody').find('tr').find('td').find('input'))
        //POM for Unit List CheckBox
    
        this.AssureClaims_GenericClaim_Chk_PolicyProperty1=(Selector('#tab_default_1').nth(1).find('div').nth(2).find('div').find('table').find('tbody').nth(2).find('tr').find('td').find('input'))
        //POM for Property CheckBox 
        this.AssureClaims_GenericClaim_Chk_PolicyProperty2=(Selector('#tab_default_1').nth(1).find('div').nth(2).find('div').find('table').find('tbody').nth(1).find('tr').find('td').find('input'))
        //POM for Property CheckBo
        this.AssureClaims_GenericClaim_Chk_PolicyProperty= Selector('[ng-checked="coverage.check"]').parent('[class="ng-scope"]').nth(2).find('input')
        this.AssureClaims_GenericClaim_Btn_InternalPolicySave=(Selector('#btnselect').find('i'))
        //POM for Internal Policy Save
	    
	//================================Muskan's Code : RMA-97293 ended here=========================================================================================================================
        this.AssureClaims_GenericClaim_Chk_PolicyProperty1 = Selector('[ng-checked="coverage.check"]').parent('[class="ng-scope"]').nth(1).find('input')
        //POM for select first property checkbox
        //================================Muskan's Code : RMA-97293 ended here=========================================================================================================================

        this.AssureClaims_GenericClaim_Btn_PolicyDownload=(Selector('#A1').find('i'))
        //POM for Policy Download

        this.AssureClaims_GenericClaim_Txt_ClaimType = Selector('#lookup_claimtypecode')
        //POM for Cliamtype

        this.AssureClaims_GenericClaim_Btn_RecordSummary = Selector('[class="commonIcomoon icon-brankic icon-profile"]');
        //pom for record summary btn

        this.AssureClaims_GenericClaim_Btn_Cross = Selector('[ng-click="cancel()"]').find('i');
        //POM for Cross btn

        this.AssureClaims_GenericClaim_Btn_ExecutiveSummary = Selector('[class="commonIcomoon icon-brankic icon-coins"]');
        //POM for ExecutiveSummary

        this.AssureClaims_GenericClaim_Txt_PrintClaimVerify = Selector('[id^="44"]');
        //POM for verify claim
        this.AssureClaims_NonOccClaim_Txt_DisabilityStartDate = Selector('#disfromdate');
        //POM  Disabilitystartdate Value On NonOcc
 
         this.AssureClaims_NonOccClaim_Search_PlanName = Selector('#planname').find('i');
         //POM for PlanName on NonOcc Claim
 
         this.AssureClaims_NonOccClaim_Txt_EmployeeNo = Selector('#lookup_empemployeenumber');
         //POM For Non Occ Emp
 
         this.AssureClaims_NonOccClaim_Btn_Jurisdiction= (Selector('#btn_jurisdiction_openlookup'));
        //POM For Non Occ  Jurisdiction
 
         this.AssureClaims_NonOccClaim_Txt_PlanNamescreen = Selector('[aria-label="Filter for column"]').nth(1);
         //POM For Non Occ PlanName Search
         
         this.AssureClaims_NonOccClaim_Lnk_GridPlanName = Selector('[ng-enter="grid.appScope.columnClick(row.entity)"]');
        //POM For Non Occ Grid Link PlanName
 
         this.AssureClaims_NonOccClaim_Lnk_Jurisdiction = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
         //POM For Non Occ Lnk Jurisdiction
 
         this.AssureClaims_NonOccClaim_Txt_ClaimNumber = Selector('#claimnumber');
         //POM For Non Occ Txt ClaimNumber
 
         this.AssureClaims_NonOccClaims_Txt_ClassName= Selector('#classname');
         //POM For Non Occ ClassName
 
         this.AssureClaims_NonOccClaim_Tab_ClaimInfo = (Selector('[role="button"]').find('span').withText('Claim Info'));
         //POM For Non Occ ClaimInfo Tab
 
         this.AssureClaims_NonOccClaim_Tab_EmploymentInfo = (Selector('[role="button"]').find('span').withText('Employment Info'));
         //POM For Non Occ EmploymentInfo Tab
 
         this.AssureClaims_NonOccClaim_Txt_DateHired =Selector('#empdatehired');
         //POM For Non Occ DateHired Txt
 
         this.AssureClaims_NonOccClaim_Txt_EmpMonthlyRate = Selector('#empmonthlyrate');
         //POM For Non Occ MothlyRate Employment Txt

         this.AssureClaims_NonOccClaim_Chk_Sunday =Selector('#empworksunflag')
         //POM For Non ChkSunday

        this.AssureClaims_NonOccClaim_Chk_Monday =Selector('#empworkmonflag')
        //POM For Non ChkMonday
        
        this.AssureClaims_NonOccClaim_Chk_Tuesday =Selector('#empworktueflag')
        //POM For Non ChkTuesday

        this.AssureClaims_NonOccClaim_Chk_Wednesday =Selector('#empworkwedflag')
        //POM For Non ChkWednesday

        this.AssureClaims_NonOccClaim_Chk_Thursday =Selector('#empworkthuflag')
        //POM For Non ChkThursday

        this.AssureClaims_NonOccClaim_Chk_Friday =Selector('#empworkfriflag')
        //POM For Non ChkFriday

        this.AssureClaims_NonOccClaim_Chk_Saturday =Selector('#empworksatflag')
        //POM For Non ChkSaturday

        this.AssureClaims_Btn_NonOccPayment=(Selector('[role="menuitem"]').withText('Non-Occ Payments'));
        //POM For Non_Occ Menuitem from Toolbar

        
        this.AssureClaims_Lst_NonOcc= (Selector('[class="dropdown"]'))
        //POM For NonOcc_Payment List
        
         this.AssureClaims_NonOcc_Payments_EligibilityDate =Selector('#lblvalue_eligDate')
         //POM For NonOcc_Payment EligibilityDate on NonOcc pay screen

         this.AssureClaims_tab_NonOccPayment_ClaimInfo=(Selector('[role="button"]').find('span').withText('Claim Info'));
         //POM For NonOcc_Payment tab claim info

         this.AssureClaims_tab_NonOccPayment_Payments_Calculator=(Selector('[role="button"]').find('span').withText('Payments Calculator'));
         //POM For NonOcc_Payment tab paymnet calculator

         this.AssureClaims_Lst_NonOccPayment_ReserveType = Selector('#cmbReserveTypeFt')
         //POM For NonOcc_Payment reserve type on payment calcuator tab

         this.AssureClaims_Lst_NonOccPayment_TransactioneType = Selector('#cmbTransactionType')
         //POM For NonOcc_Payment reserve type on payment calcuator tab

         this.AssureClaims_Txt_NonOcc_MonthlyBenefit=Selector('#weeklybenefit');
         //POM For NonOcc_Payment monthly benefit on claim info tab

         this.AssureClaims_Txt_NonOccPayment_BenefitStartDate=Selector('[ng-enter="datechange(field,id,datetitle,$event);"]')
         //POM For NonOcc_Payment Benefit start date on benefit calculator tab

         this.AssureClaims_NonOccPayments_Txt_BenefitsThrough=Selector('#benthroughdate').nth(1);
        //POM For NonOcc_Payment Benefit through date on benefit calculator tab

         this.AssureClaims_tab_NonOccPayment_Benefit_Period =(Selector('[role="button"]').find('span').withText('Benefit Period'));
        //POM For NonOcc_Payment  benefit calculator tab
         
         this.AssureClaims_NonOccPayments_Txt_PaymentBeginnings=Selector('[ng-enter="datechange(field,id,datetitle,$event);"]');
         //POM For NonOcc_Payment PaymentBeginnings date 

         this.AssureClaims_NonOccPayments_Txt_PaymentThrough=Selector('#paymentsthroughdate').nth(1)
        //POM For NonOcc_Payment PaymentThrough


        this.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName1 = (Selector('[class="ng-scope sortable"]').withText('Policy Name').find('input'));
        
       this.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Policy Name').parent('[role="columnheader"]').find('input')
    
    
       this.AssureClaims_Generic_Claim_Lnk_Claimant = Selector('[id="associated-claimant"]').find('span')
       //POM for Link Claimant On Maint=>Policy Tracking Screen
       
       this.AssureClaims_GenericClaim_txt_PolicyLOBLookup = Selector("#lookup_policyLOBCode")
       //POM for policy textbox 
	   
	   
     //-----------------------------Policy verificatiom--------------------------------------

     this.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName1 = (Selector('[class="ng-scope sortable"]').withText('Policy Name').find('input'));
        //POM for Text PolicyNmae On Maint=>Policy Tracking Screen

     this.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Policy Name').parent('[role="columnheader"]').find('input')
   //POM for Text PolicyNmae On Maint=>Policy Tracking Screen

     this.AssureClaimsApp_GenericClaim_ClkTxt_InsuredName= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Insured Name').parent('[role="columnheader"]').find('input')
 //POM for Text PolicyNmae On Maint=>Policy Tracking Screen
 
     this.AssureClaims_Generic_Claim_Lnk_Claimant = Selector('[id="associated-claimant"]').find('span')
     //POM for Link Claimant On Maint=>Policy Tracking Screen
     
     this.AssureClaims_Generic_Claim_Lnk_Claimant = Selector('[id="associated-claimant"]').find('span')
     //POM for Link Claimant On General Claim  Screen

     this.AssureClaims_Generic_Claim_Lnk_Policy = Selector('[id="associated-policy"]').find('span')
     //POM for Link Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_PolicyName = Selector('#policyname')
     //POM for Verify PolicyName in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_UnitNumber = Selector('#unitno')
     //POM for Verify UnitNumber in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_PropertyID  = Selector('#pin')
     //POM for Verify UnitNumber in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_CoverageType  = Selector('#lookup_coveragetypecode')
     //POM for Verify Coverage Type in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_SIRDeductible  = Selector('[label="SIR/Deductible"]')
     //POM for Verify SIRDeductible Type in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_ClassCode  = Selector('[id="cvgClassCode"]')
     //POM for Verify ClassCode Type in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_PolicySystemName  = Selector('[id="policysystemname"]')
     //POM for Verify Policy System Name Type in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Verify_Policy_MasterCompany  = Selector('[id="mastercompany"]')
     //POM for Verify Master Company  in Policy On General Claim Screen


     this.AssureClaims_Generic_Claim_Verify_Policy_PolicySymbol = Selector('#policysymbol')
     //POM for Verify PolicySymbol in Policy On General Claim Screen

     this.AssureClaims_Generic_Claim_Lnk_Persons_Involved_Node_Available = Selector('[id="associated-personinvolvedlist"]').find('span')
     //POM for Link Persons_Involved_Node_Available in policy On General Claim  Screen

     this.AssureClaims_Generic_Claim_Lnk_PolicyUnits = Selector('[id="associated-policyunitlist"]').find('span')
     //POM for Link Policy Units in policy On General Claim  Screen

     this.AssureClaims_Generic_Claim_Lnk_ClaimPolicyCoverage = Selector('[id="associated-policycoverage"]').find('span')
     //POM for Link Policy Units in policy On General Claim  Screen
     
     this.AssureClaims_Generic_Claim_Txt_PolicyNumber= Selector('[id="multipolicyid"]').find('span').nth(1)
     //POM for Policy number policy On General Claim  Screen
     
     this.AssureClaims_Generic_Claim_Txt_PolicyNumberEdit = Selector('[name="policyNumber"]')
     //POM for Policy number edit in policy On General Claim  Screen

     this.AssureClaims_Generic_Claim_Txt_PolicySymbolEdit = Selector('[id="usr3"]')
     //POM for Link Coverage in policy On General Claim  Screen

     this.AssureClaims_Generic_Claim_Txt_PolicyNameEdit = Selector('[id="usr4"]')
     //POM for Link Coverage in policy On General Claim  Screen
     
//-----------NonOccPayment--------------------------------------//
    this.AssureClaims_NonOcc_Btn_FuturePyaments= Selector('[id^="Future Payments"]');
    //POM For FuturePayments
    //this.AssureClaims_NonOcc_Grid_PrintDate= Selector('[ng-repeat="x in FuturePaymentData.table.row"]').nth(5);
    this.AssureClaims_NonOcc_Grid_PrintDate= Selector('[ng-class="{clicked:rowClicked==x}"]').nth(1);
   
    //this.AssureClaims_NonOcc_ProcessManualPayments = Selector('[ng-hide="!FuturePaymentData.table.paymentbatch"]');
    this.AssureClaims_NonOcc_ProcessManualPayments = Selector('[class="material-icons mdi mdi-script"]');
    //POM For FProcess Manual Payment

    this.AssureClaims_NonOcc_CalPay= Selector('[class="material-icons mdi mdi-calculator"]')
    //Pom for calculate payment

    this.AssureClaims_NonOcc_Save= Selector('[class="material-icons material-icons-clr"]').withText('save');
    //POM FORsave calpay

    this.AssureClaims_NonOcc_ArrowForward= Selector('[class="material-icons material-icons-clr"]').withText('arrow_forward');
    //pom for continue button

    this.AssureClaims_NonOccFuturePay_Close_Button = Selector('[class="lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn"]');
    //POM for close button

    this.AssureClaims_NonOccManualPayment_checkNumber= Selector('#txtCheckNumber');
    //POm for checkNum txt

    this.AssureClaims_NonOccManaualPayment_Image=Selector('[class="material-icons material-icons-clr"]').withText('receipt');
    //pom for manual process image

    this.AssureClaims_ManualPayment_PrintConfirmPopUp= Selector('[class="material-icons material-icons-clr"]').withText('done');
    //Pom for popup print

    this.AssureClaims_NonOccPay_lnk_Breadcrumb=Selector('[ng-click="main.breadChange(breadc, $index);"]').withText('Non-occupational');
    //pom for breadcrumb non occ claim link

    this.AssureClaims_NonOccFinancial_TransactionHistory =Selector('[class="material-icons material-icons-clr cursor"]').withText('history');
    //pom for ftransaction history

    this.AssureClaims_SystemUsers_Btn_FilterSearch= Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000F"]').find('[ng-click="grid.appScope.toggleFiltering()"]');
   //pom for search on transaction history

    this.AssureClaims_NonOccPayment_txt_TransactionCheck = Selector('#transNumber');
    //pom for transaction number on transaction history screen
	    
    //RMA -85451 : Anurag claim made   
     this.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName1 = (Selector('[class="ng-scope sortable"]').withText('Policy Name').find('input'));
        
       this.AssureClaimsApp_GenericClaim_ClkTxt_PolicyName= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Policy Name').parent('[role="columnheader"]').find('input')
    
    
       this.AssureClaims_Generic_Claim_Lnk_Claimant = Selector('[id="associated-claimant"]').find('span')
       //POM for Link Claimant On Maint=>Policy Tracking Screen
       
       this.AssureClaims_GenericClaim_txt_PolicyLOBLookup = Selector("#lookup_policyLOBCode")
       //POM for policy textbox 

       this.AssureClaims_GenericClaim_Txt_ClaimDateRptd = (Selector('#clm_datereported').nth(1));
       //POM of Claim Date Reported On General Claim Screen

       this.AssureClaimsApp_GenericClaim_Policy_Coverage_Lst = Selector('[ng-checked="coverage.check"]').parent('[class="ng-scope"]').find('tr').child('td');
       //POM for policy coverage list

       this.AssureClaims_GenericClaim_Txt_SelectClaimType = Selector("#lookup_policyLOBCode");
       //POM for policy LOB code lookup textbox
	    
	
    //ANURAG'S CODE :RMA-82420
        
    this.AssureClaims_GenericClaim_Btn_Jurisdiction = (Selector('#btn_filingstateidtext_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM For Jurisdiction Lookup Button  

    this.AssureClaims_GenericClaim_Lnk_Jurisdiction = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
    //POM For Jurisdiction Hyperlink On Clicking Lookup Button

    this.AssureClaims_GenericClaim_Txt_JurisdictionCounty = Selector('#lookup_juriscounty');
    //POM For County field On 
    //END
	    
	     //Oshi's Code
	   
	   //START
	   
	    this.AssureClaims_Event_Detail_Tab_General_claim = Selector('[role="button"]').find('span').withText('Event Detail');
        //POM for Event Details tab
		
		this.AssureClaims_Claim_Info_Tab_General_claim = Selector('[role="button"]').find('span').withText('Claim Info');
        //POM for Claim Info Details tab
		
	   this.AssureClaims_Location_Address_1=Selector('#ev_addr1');
       //POM for Location Address 1 Textbox
		
		 this.AssureClaims_Location_Address_2=Selector('#ev_addr2')
        // //POM for Location Address 2 Textbox
		
		 this.AssureClaims_Location_Address_3=Selector('#ev_addr3')
        // //POM for Location Address 3 Textbox
		
		 this.AssureClaims_Location_Address_4=Selector('#ev_addr4')
        // //POM for Location Address 4 Textbox
		
		this.AssureClaims_GenericClaim_Txt_Eventtab_Country = (Selector('#lookup_ev_countrycode'));
        //POM of Country On  Event tab General Claim Screen
		
		
		this.AssureClaims_GenericClaim_Txt_Eventtab_State = (Selector('#lookup_ev_stateid'));
		//POM of State On  Event tab General Claim Screen
		
		 
		 this.AssureClaims_Eventtab_city=Selector('#ev_city')
        // //POM for Event tab city Textbox
		
		this.AssureClaims_Eventtab_zipcode=Selector('#ev_zipcode')
        // //POM for Event tab zipcode Textbox
		
	//END
	    
	    //Sai's Code : RMA-92773
	    
    this.AssureClaims_GenericClaim_Lnk_AutoAssignAdjuster = (Selector('[id="associated-adjuster"]').find('div').find('div').nth(1).find('ul').find('li').find('span'));
    //POM of AutoAssignAdjuster link On General Claim Screen

    this.AssureClaims_GenericClaim_Btn_JurisdictionLookup = (Selector('#btn_filingstateidtext_openlookup'));
    //POM For GeneralClaim  Jurisdiction
	
     //Muskan's Code : RMA-95414	
    this.AssureClaims_GenericClaim_Chk_UnitList1=(Selector('#tab_default_3').find('div').nth(2).find('div').find('table').find('tbody').nth(1).find('tr').find('td').find('input'))
    //POM for Unit List CheckBox 2 - Tushar's POM

    // Tushar's Code : RMA-110277
    this.AssureClaims_GenericClaim_Lnk_NewTab = Selector('[aria-label="New"]');
    //POM for Selector of "New" Tab on claims screen

// Parul's Code : RMA-109530    

this.AssureClaims_GenericClaim_Btn_AnalyticsClaimsDashboard = Selector('[aria-label="Maximize Claims Dashboard"]');
//pom for AnalyticsDashboard On Claim Screen

this.AssureClaims_GenericClaim_Analytics_Frame_AnalyticsDashboardLabel = Selector('#modal-header');
//pom for AnalyticsDashboard On Claim Screen

this.AssureClaims_GenericClaim_Analytics_Frame_AnalyticsDashboard_Title = Selector('[title="Adjuster Load"]');
//Pom for AnalyticsDashboard Widget Title On Claim Screen

        
        

    
    
    }};
    export default POM_Generic_Claims;
