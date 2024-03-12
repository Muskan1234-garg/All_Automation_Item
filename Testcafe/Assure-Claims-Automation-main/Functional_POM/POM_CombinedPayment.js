import {Selector,t} from 'testcafe';
class POM_CombinedPayment {
    constructor(){
this.AssureClaims_CombinedPaySetUp_Lst_BankAccount = Selector('#bankaccount')
//POM for BankAccount Button On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_LastName = Selector('#lookup_rmalookupfinanciallastname2_lastName')
//POM for LastName Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_FirstName = Selector('#pye_firstname')
//POM for FirstName Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_Address1 = Selector('#pye_addr1')
//POM for Address1 Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_Address2 = Selector('#pye_addr2')
//POM for Address2 Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_Address3 = Selector('#pye_addr3')
//POM for Address3 Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_Address4 = Selector('#pye_addr4')
//POM for Address4 Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_City = Selector('#pye_city')
//POM for City Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_Zip = Selector('#pye_zipcode')
//POM for Zip Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_Country = Selector('#lookup_pye_countrycode')
//POM for Country Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_State = Selector('#lookup_pye_stateid')
//POM for State Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Tab_ScheduleSetup = (Selector('[role="button"]').find('span').withText('Schedule Setup'))
//POM for ScheduleSetup Tab Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUP_Btn_PayInterval = (Selector('#btn_payment_interval_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
//POM for PayInterval Look UP Button On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUP_Lnk_PayInterval = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM for PayInterval Link On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUP_Txt_StartingOn = (Selector('#startdate').nth(1));
//POM for StartingOn Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUP_Txt_NextScheduledDate = (Selector('#nxtschdate').nth(1));
//POM for NextScheduledDate Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUP_Txt_NextScheduledPrint = (Selector('#nxtschdprint').nth(1));
//POM for NextScheduledPrint Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUP_Txt_NextPrintOverride = (Selector('#nxtprintoverride').nth(1));
//POM for NextPrintOverride Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Chk_LastDayofMonthCheckBox = Selector('#lastdayofmonth')
//POM for LastDayofMonthCheckBox Text Box On Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Tab_StopPay = (Selector('[role="button"]').find('span').withText('Stop Payment'))
//POM for StopPay Tab Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Chk_StopCombinedPayCheckBox = Selector('#stopcombpay')
//POM for StopCombinedPayCheckBox Combined Payment Funds Screen

this.AssureClaims_CombinedPaySetUp_Txt_StopAsOf = (Selector('#stopdate').nth(1));
//POM for StopAsOf Text Box On Combined Payment Funds Screen


    }};
    export default POM_CombinedPayment;