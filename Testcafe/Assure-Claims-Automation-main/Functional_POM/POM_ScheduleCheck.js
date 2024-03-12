import { Selector, t} from 'testcafe';
class POM_ScheduleCheck{
constructor(){
   

    this.AssureClaims_BreadCrumbReserve = Selector('#dvbreadcrumbscroll').find('i').withText('reply');
    //POM for BreadCrumbReserve on ScheduleCheck

    this.AssureClaims_SelectCreartedReserved = Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]');
     //POM for SelectCreartedReserved on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Btn_ScheduleCheck = Selector('#ScheduleCheck').find('[class^="material-icons mdi mdi-timetable"]');
    //POM for ScheduleCheck Button on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Txt_NumberOfPayments = Selector('#totalpayments');
    //POM for NumberOfPayments Button on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Btn_PayIntervalLookup = Selector('#btn_payment_interval_openlookup').find('i');
    //POM for PayIntervalLookup Button on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Lnk_PayInterval = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM of PayInterval Value On  ScheduleCheck

    this.AssureClaims_ScheduleCheck_Lst_BankAccount = Selector('#bankaccount');
    //POM for BankAccount Dropdown On ScheduleCheck

    this.AssureClaims_ScheduleCheck_Select_BankAccount = Selector('#bankaccount').find('option');
    //POM of BankAccoun Value On ScheduleCheck
    
    this.AssureClaims_ScheduleCheck_Btn_DistributionTypeLookup = (Selector('#btn_distributiontype_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM for DistributionTypeLookup Button on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Lnk_DistributionType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM for DistributionType Value on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Lst_PayeeType = Selector('#cbopayeetype');
    //POM for PayeeType List on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Select_PayeeType = Selector('#cbopayeetype').find('option');
    //POM for Select PayeeType on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Txt_LastName = Selector('#lookup_rmalookupfinanciallastname2_lastName');
    //POM for LastName on ScheduleCheck

    this.AssureClaims_ScheduleCheck_Tab_DetailedInformation = Selector('[role="button"]').find('span').withText('Detailed Information');
    //POM for DetailedInformation Tab on ScheduleCheck Screen

    this.AssureClaims_ScheduleCheck_Btn_AddNew = Selector('#cruduiGridAddBtn').nth(1);
    //POM for AddNew Button on ScheduleCheck Screen
    this.AssureClaims_ScheduleCheck_Btn_TransactionTypeLookup = Selector('#transTypeCode')
    //POM for TransactionTypeLookup Button on ScheduleCheck Screen

    this.AssureClaims_ScheduleCheck_Select_Lnk_TransactionType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM for TransactionType Select on ScheduleCheck Screen

    this.AssureClaims_ScheduleCheck_Txt_TransactionAmount = Selector('#amount').nth(1);
    //POM for Type TransactionAmount on ScheduleCheck Screen

    this.AssureClaims_ScheduleCheck_TransactionSave = Selector('#Save').find('i').withText('save');
    //POM for Transaction Save on ScheduleCheck Screen

    this.AssureClaims_ScheduleCheck_Tab_ScheduleCheck = Selector('[role="button"]').find('span').withText('Scheduled Checks');
    //POM for ScheduleCheck Tab on ScheduleCheck Screen

    this.AssureClaims_ScheduleCheck_Save = Selector('#Save').find('i').withText('save');
    //POM for Save on ScheduleCheck Screen
   
   // Tushar's code : RMA-94178

    this.AssureClaims_ScheduleCheck_Tab_ThirdPartyPayees = Selector('[role="button"]').find('span').withText('Third Party Payees');
    //POM for Third Party Tab on ScheduleCheck Screen

    this.AssureClaims_ThirdParty_Btn_AddNew = Selector('#cruduiGridAddBtn');
    //POM for AddNew Button on ScheduleCheck Screen

    this.AssureClaims_ThirdParty_Tab_Transaction = Selector('[role="button"]').find('span').withText('Transaction');
    //POM for Transaction on Third Party Tab

    this.AssureClaims_ThirdParty_Btn_DeductAgainstPayee = Selector('#deductAgainstPayeeFlag');
    //POM for Deduct Against Payee Checkbox
}
};
export default  POM_ScheduleCheck;
