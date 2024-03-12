import {Selector,t} from 'testcafe';

class POM_DisabilityPlanManagement{
constructor(){

    this.AssureClaims_DisabilityPlanManagement_Txt_PlanNumber = Selector('#plannumber');
    //POM for Diability PlanNumber

    this.AssureClaims_DisabilityPlanManagement_Txt_PlanName = Selector('#planname');
    //POM for Diability PlanName

    this.AssureClaims_DisabilityPlanManagement_Txt_PlanDescription = Selector('#plandesc');
    //POM for Diability PlanDesc

    this.AssureClaims_DisabilityPlanManagement_Btn_PlanStatus = Selector('#btn_planstatuscode_openlookup');
    //POM for Diability PlanStatusCode

    this.AssureClaims_DisabilityPlanManagement_Lnk_PlanStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM for Diability PlanStatus

    this.AssureClaims_DisabilityPlanManagement_Txt_EffectiveDate = Selector('#effectivedate');
    //POM for Diability PlanEffectiveDate

    this.AssureClaims_DisabilityPlanManagement_Txt_ExpirationDate = Selector('#expirationdate');
    //POM for Diability PlanExpirationDate

    this.AssureClaims_DisabilityPlanManagement_Txt_Country = Selector('#lookup_countrycode');
    //POM for Diability CountryCode

    this.AssureClaims_DisabilityPlanManagement_Btn_Country = Selector('#lookup_countrycode');
    //POM for Diability Country

    this.AssureClaims_DisabilityPlanManagement_Txt_Insured = Selector('#lookup_insuredlist');
    //POM for Diability Insured

    this.AssureClaims_DisabilityPlanManagement_Btn_Insured = Selector('#plannumber');
    //POM for Diability Insured
    

    this.AssureClaims_DisabilityPlanManagement_Txt_Premium = Selector('#premium');
    //POM for Diability Premium

    this.AssureClaims_DisabilityPlanManagement_Lst_BankAccount = Selector('#bankaccount');
    //POM for Diability BankAccount

    this.AssureClaims_DisabilityPlanManagement_Txt_PayPeriodStartDate = Selector('#startofpayperiod');
    //POM for Diability PayPeriodStartDate

    this.AssureClaims_DisabilityPlanManagement_Txt_IssueDate = Selector('#issuedate');
//POM for Disability IssueDtae

    this.AssureClaims_DisabilityPlanManagement_Txt_ReviewDate = Selector('#reviewdate');
//POM for Disability Review Date

    this.AssureClaims_DisabilityPlanManagement_Txt_RenewalDate = Selector('#renewaldate');
//POM for Disability  Renew Date

    this.AssureClaims_DisabilityPlanManagement_Txt_CancelDate = Selector('#canceldate');
//POM for Disability CancelDate

    this.AssureClaims_DisabilityPlanManagement_CheckBox_CheckPrintsBeforeEndOfPayPeriod  = Selector('#printbeforepayendflag');
//POM for Disability CheckPrintsBeforeEndOfPayPeriod

    this.AssureClaims_DisabilityPlanManagement_Lst_PreferredPaymentSchedule = Selector('#prefpayschedcode');
//POM for Disability referredPaymentSchedule

    this.AssureClaims_DisabilityPlanManagement_Lst_PreferredDayOfWeekForPayments  = Selector('#prefpaydaycode');
//POM for Diability PreferredDayOfWeekForPayments

    this.AssureClaims_DisabilityPlanManagement_Lst_MonthlyPaymentType = Selector('#typeofmonthlypay');
//POM for Diability MonthlyPaymentType

    this.AssureClaims_DisabilityPlanManagement_Lst_PreferredMonthlyDay  = Selector('#prefDayOfMCode');
//POM for Disability PreferredMonthlyDay

    this.AssureClaims_DisabilityPlanManagement_Lst_PreferredPrintDate  = Selector('#prefDayOfMCode');
//POM for Disability PreferredPrintDate

    this.AssureClaims_DisabilityPlanManagement_Lookup_Txt_PlanNum = Selector('#plannumber');
//POM for Disability LookupPlanNumber

     this.AssureClaims_DisabilityPlanClasses_Btn_AddPlan = Selector('[class="material-icons material-icons-right addIconRight listAdd ng-binding ng-scope"]');
//POM for Disability AddPlan

    this.AssureClaims_DisabilityPlanClasses_HeaderPlanClass = Selector('[class="col-md-10 col-xs-12 col-sm-12 headerTitlePosition ellipsis"]');
//POM for Disability HeaderPlanClass

    this.AssureClaims_DisabilityPlanClasses_Txt_ClassName= Selector('#classname');
  //POM for Disability  ClassName

  this.AssureClaims_DisabilityPlanClasses_Tab_EligibilityWaiting = (Selector('[role="button"]').find('span').withText('Eligibility/Waiting Period'));
//POM for Disability EligibilityWaiting

  this.AssureClaims_DisabilityPlanClasses_Txt_EligibleForBenefitsPeriods= Selector('#eligdurtype');
//POM for Disability EligibleForBenefitsPeriods

  this.AssureClaims_DisabilityPlanClasses_Txt_EligibleForBenefitsFromDateHired = Selector('#eligstart');
//POM for Disability EligibleForBenefitsFromDateHired

  this.AssureClaims_DisabilityPlanClasses_Txt_WaitingPeriodFromDisability = Selector('#waitcal');
//POM for Disability WaitingPeriodFromDisability

  this.AssureClaims_DisabilityPlanClasses_Txt_WaitDurationType= Selector('#waitdurtype');
//POM for Disability WaitDurationType

  this.AssureClaims_DisabilityPlanClasses_Txt_MaximumDurationOfDisabilityPeriod= Selector('#maxdurdurtype');
//POM for Disability MaximumDurationOfDisabilityPeriod

  this.AssureClaims_DisabilityPlanClasses_Txt_MaximumDurationOfDisabilityFrom= Selector('#maxdurstart');
//POM for Disability MaximumDurationOfDisabilityFrom 

  this.AssureClaims_DisabilityPlanClasses_Txt_DetermineWorkWeekDaysType= (Selector('#workweek'));
//POM for Disability DetermineWorkWeekDaysType

this.AssureClaims_DisabilityPlanClasses_Tab_Benefit_Calculation = (Selector('[role="button"]').find('span').withText('Benefit Calculation'));
//POM For Benefit Calcuation tab on plan class

this.AssureClaims_DisabilityPlanClasses_Txt_MonthlyWage_PerAmount = Selector("#peramt");
//POM For Montlywage tab on plan class

this.AssureClaims_DisabilityPlanManagement_PrintPreferredDate=Selector('#prefdate')
//POM for Preferred Print Date

this.AssureClaims_DisabilityPlanClasses_Txt_Quantity_Benefits=Selector('#eligben')
//POM for Quantity Eligibale for Benefits

this.AssureClaims_DisabilityPlanClasses_Txt_Quantity_Waitperiod=Selector('#waitperiod')
//pom for waiting period from Disability quantity

this.AssureClaims_DisabilityPlanClasses_Txt_Quantity_Durability=Selector('#maxdur')
//pom for Maximum Duration Of Disability quantity


this.AssureClaims_NonOccPayments_Img_CalculatePayments=Selector('[id^="Calculate Payments"]');
//POM for Calculate Payments Button

this.AssureClaims_NonOccPaymentsCalPayment_Btn_Save = Selector('#pnlDefault').find('span');
//pom for save payment

this.AssureClaims_Generic_AssureclaimText = Selector('[class="header headerSub col-xs-12 col-md-12 col-sm-12"]')
//POM for RMAApp_Generic_RMAAppText

this.AssureClaims_btn_autocheck = Selector('#btnAutoChecks');
//POM for auto check btn 

this.AssureClaims_Disability_txt_checkdate = Selector('[class="ng-scope sortable"]').withText('Check Date').find('input');




    






}
};
export default  POM_DisabilityPlanManagement;
