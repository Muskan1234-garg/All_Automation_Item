import {Selector,t} from 'testcafe';
class POM_ClearCheck {
    constructor(){
        this.AssureClaims_SelectFinancialReserve =Selector('#Financials\\/Reserves').find('.commonIcomoon.icomoon-safe.icon-safe')
        //POM for Financial Reserves Button on Claim Page

        this.AssureClaims_ReserveCreation_Btn_AddReserve =Selector('#AddReserve').find('i').withText('add')
        //POM for Add Reserve Button on Financial Reserve Page

        this.AssureClaims_ReserveCreation_Lst_ReserveType =Selector('#cmbReserveType')
        //POM for Reserve Type Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_Txt_ReserveAmount =(Selector('#txtAmount').nth(1))
        //POM for Reserve Amount On Reserve Page

        this.AssureClaims_ReserveCreation_Lst_Status=Selector('#cmbStatusAdd')
        //POM for Reserve Status Dropdown On Reserve Page

        this.AssureClaims_ReserveCreation_dvbreadcrumbscroll = Selector('#dvbreadcrumbscroll').find('i').withText('reply')
        //POM for dvbreadcrumbscroll BackButton On Reserve Creation Page
        
        //this.AssureClaims_ReserveCreation_dvbreadcrumbscroll = Selector('#dvbreadcrumbscroll').find('i').withText('clear')

        this.AssureClaims_ReserveCreation_gridwindow = (Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        //POM for gridwindow Button On Reserve Creation Page
        this.AssureClaims_Payment_Btn_MakePayment = (Selector('#MakePayment').find('[class^="commonIcomoon material-icons-clr icon-payment icon"]'))
       //POM for MakePayment Button On Reserve Creation Page

        this.AssureClaims_Payment_Lst_BankAccount = (Selector ('#bankaccount').find('option'))
        //POM for BankAccount List On Payment Creation Page

        this.AssureClaims_PaymentCollection_Lst_PayeePayorType = (Selector('#cbopayeetype'))
         //POM for PayeePayorType List On Payment Creation Page

        this.AssureClaims_PaymentCollection_Txt_LastName = (Selector('#lookup_rmalookupfinanciallastname2_lastName'))
         //POM for LastName Text BOX On Payment Creation Page
        
        this.AssureClaims_PaymentCollection_Tab_TransactionDetail = (Selector('[role="button"]').find('span').withText('Transaction Detail'))
         //POM for TransactionDetail Tab On Payment Creation Page

        this.AssureClaims_PaymentCollection_Btn_AddNewFunds = (Selector('#cruduiGridAddBtn'))
        //POM for AddNewFunds Button On Payment Creation Page
       
        this.AssureClaims_FundsSplitDetails_Lst_ReserveType = (Selector('#cmbReserveTypeFt').find('option'))
        //POM for ReserveType List On Payment Creation Page
       
        this.AssureClaims_FundsSplitDetails_Lst_TransactionType = (Selector('#cmbTransactionType'))
        //POM for TransactionType List On Payment Creation Page

        this.AssureClaims_FundsSplitDetails_Txt_Amount = (Selector('#amount').nth(1))
         //POM for Amount Text On Payment Creation Page

        this.AssureClaims_Payment_FundsSplitDetails_Btn_Save = (Selector('#Save').find('i').withText('save'))
        //POM for MakePayment Button On Payment Creation Page
       
        this.AssureClaims_PaymentCollection_Tab_Transaction = (Selector('[role="button"]').find('span').withText('Transaction'))
         //POM for Transaction Tab On Payment Creation Page

        this.AssureClaims_PaymentScreen_Txt_CheckNumber = Selector('#checknumber');
        //POM For Text CheckNumber on Payment Creation Page
    
        this.AssureClaims_click_Ok_Btn = Selector('#btnRoll').find('i').withText('done');
        //POM For click_Ok Botton on Payment Creation Page

 //this.AssureClaims_Cleared_CheckBox = Selector('#clearedflag')


        this.AssureClaims_ReserveCreation_dvbreadcrumbscroll = Selector('#dvbreadcrumbscroll').find('i').withText('reply')
        //POM For dvbreadcrumbscroll BackButton On Reserve Creation Page
        
        this.AssureClaims_ReserveCreation_gridwindow = (Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        //POM For gridwindow Button On Reserve Creation Page

        this.AssureClaims_ReserveCreation_Add_New_Collections = (Selector('#AddCollection').find('i').withText('collections'))
        //POM For Add New Collections On Reserve Creation Page

        this.AssureClaims_Collection_Txt_Deposit_Number = Selector('#checknumber');
        //POM For Deposit Number Text on Payment Creation Page

        this.AssureClaims_Funds_Txt_CheckNumber = Selector('#checknumber');
        //POM For CheckNumber Text on Transaction Screen Funds Page

        this.AssureClaims_Funds_Check_From_Date_Calender = Selector('[aria-label="Check From Date:"]').find('i')
        //POM For Check From Date Calender on ClearCheck Screen Funds Page
        this.AssureClaims_Funds_Check_From_Date_picker = Selector('[class="uib-day text-center ng-scope"]').find('span').withText('31')
        //POM For Check From Date picker on ClearCheck Screen Funds Page
        //this.AssureClaims_Mark_ClearCheck_Txt_Check_From_Date = (Selector('#txtcheckdatefrom').nth(1));

        this.AssureClaims_Funds_Check_Filter_By_Bank_Account = Selector('#ddlBankAcc')
        //POM For Check Filter By Bank Account on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_IncludeCollections_CheckBox = Selector('#chkusecollections')
        //POM For IncludeCollections CheckBox on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_Checks_Not_Attached_to_Claims_CheckBox = Selector('#chknotattached')
        //POM For Checks Not Attached to Claims CheckBox on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_MarkCleared = Selector('#MarkClear') 
        //POM For MarkCleared Button on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_Btn_Refresh = Selector('#RefreshGrid')
        //POM For Refresh Button on ClearCheck Screen Funds Page

        this.AssureClaims_Funds_gridwindows = (Selector('[class="ui-grid-cell-contents"]').nth(0).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        //POM For gridwindows on ClearCheck Screen Funds Page
        
         this.AssureClaims_Cleared_CheckBox = Selector('#clearedflag')
        // clear flag checkbox 
    }
};
export default POM_ClearCheck;
