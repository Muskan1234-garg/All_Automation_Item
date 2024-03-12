import {Selector,t} from 'testcafe';

class POM_NonOcc_Claims{
    constructor(){
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

       





        //-----------NonOccPayment POM--------------------------------------//
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


    this.AssureClaims_NonOcc_Btn_FuturePyaments= Selector('[id^="Future Payments"]');
    //POM For FuturePayments

    //this.AssureClaims_NonOcc_Grid_PrintDate= Selector('[ng-repeat="x in FuturePaymentData.table.row"]').nth(5);

    this.AssureClaims_NonOcc_Grid_PrintDate= Selector('[ng-class="{clicked:rowClicked==x}"]').nth(1);
    //Pom for Select First Row Print date
   
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

    this.AssureClaims_NonOccPayments_Img_CalculatePayments=Selector('[id^="Calculate Payments"]');
//POM for Calculate Payments Button

this.AssureClaims_NonOccPaymentsCalPayment_Btn_Save = Selector('#pnlDefault').find('span');
//pom for save payment

this.AssureClaims_Generic_AssureclaimText = Selector('[class="header headerSub col-xs-12 col-md-12 col-sm-12"]')
//POM for RMAApp_Generic_RMAAppText

this.AssureClaims_btn_autocheck = Selector('#btnAutoChecks');
//POM for auto check btn 

this.AssureClaims_Disability_txt_checkdate = Selector('[class="ng-scope sortable"]').withText('Check Date').find('input');
        

    






























    }};
    export default POM_NonOcc_Claims;