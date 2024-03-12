import {Selector,t} from 'testcafe';

class POM_BankAccount{
constructor(){
  
    this.AssureClaims_BankAccount_Txt_BankName=Selector('#lookup_banklastname');
    //POM for BankName BankAccount page
    
    this.AssureClaims_BankAccount_Txt_Adderss1=Selector('#bankaddr1');
    //POM for Address1 BankAccount page

    this.AssureClaims_BankAccount_Txt_BankCity=Selector('#bankcity');
    //POM for BankCity BankAccount page

    this.AssureClaims_BankAccount_Btn_BankCountry=(Selector('#btn_bankcountry_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM for BankCountry BankAccount page

    this.AssureClaims_BankAccount_Lnk_SelectBankCountry=(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
    //POM for select BankCountry BankAccount page

    this.AssureClaims_BankAccount_Btn_BankState=(Selector('#btn_bankstateid_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM for BankState BankAccount page

    this.AssureClaims_BankAccount_Lnk_SelectBankState=(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
    //POM for select bankstate on bankaccount page

    this.AssureClaims_BankAccount_Txt_BankZipCode=Selector('#bankzipcode');
    //POM for ZipCode BankAccount page

    this.AssureClaims_BankAccount_Txt_AccountName=Selector('#accountname');
    //POM for AccountName BankAccount Name page

    this.AssureClaims_BankAccount_Txt_BankAccNo=Selector('#accountnumber')
    //POM for Account Number BankAccount page  

    this.AssureClaims_BankAccount_Btn_AccountType=(Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
    //POM for AccountType BankAccount page

    this.AssureClaims_BankAccount_Lnk_SelectAccountType=(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
    //POM for Select AccountType BankAccount page

    this.AssureClaims_BankAccount_Txt_NextCheckNumber=Selector('#nextchecknumber');
    //POM for NextCheck BankAccount page

    this.AssureClaims_BankAccount_Txt_Address2=Selector('#bankaddr2');
    //POM for Address2 BankAccount page


    this.AssureClaims_BankAccount_Btn_CheckStocks = Selector('[id="Check Stocks"]').find('[class="material-icons mdi mdi-checkerboard"]');
    //POM for CheckStocks Button BankAccount page
	
	this.AssureClaims_BankAccount_Txt_CheckStocksStockName = Selector('#txt_lm');
    //POM for Account# Text On CheckStocks BankAccount page
	
	this.AssureClaims_BankAccount_Lst_CheckStocksFontName = Selector('[name="fontname"]');
    //POM for FontName List CheckStocks BankAccount page
	
	this.AssureClaims_BankAccount_Lst_CheckStocksFontSize = Selector('[aria-label="Font Size:"]');
    //POM for FontSize List On CheckStocks BankAccount page
	
	
	this.AssureClaims_BankAccount_Tab_CheckStocksAlignmentOptions = Selector('[aria-label="Alignment Options"]');
    //POM for Alignment Options Tab On CheckStocks BankAccount page
	
// 	this.AssureClaims_BankAccount_Tab_CheckStocksRefreshDefaults = Selector('#Div1').find('.material-icons.material-icons-clr.ng-scope');
	this.AssureClaims_BankAccount_Tab_CheckStocksRefreshDefaults = Selector('#btn_RestoreDefault');
    //POM for Refresh Defaults Button On CheckStocks BankAccount page
    
    this.AssureClaims_BankAccount_Btn_CheckStocksOk = Selector('#btnRoll').find('i').withText('done');
    //POM For click Ok Botton on Payment 

	this.AssureClaims_BankAccount_Tab_CheckStocksAdvancedOptions = Selector('[aria-label="Advanced Options"]');
    //POM for Advanced Options Tab On CheckStocks BankAccount page
	
	
	this.AssureClaims_BankAccount_Chk_CheckStocksPrintClaimNo_OnCheck = Selector('[aria-label="Print Claim No. on Check:"]');
    //POM for Print ClaimNo On Check Check BOX On CheckStocks BankAccount page
	
	this.AssureClaims_BankAccount_Chk_CheckStocksPrintControlOnCheckStub = Selector('[name="prntCtlOnStub"]');
    //POM for Print Control # on Check Stub Check BOX On CheckStocks BankAccount page

    this.AssureClaims_BankAccount_Btn_CheckStocks_Save = Selector('#btn_save');
    //POM for Save Button On Every Pages ThroughOut Application
	
	//Sai's Code : RMA-87954
	//--------------------------------SubBank Account-----------------------------------------------------------

    this.AssureClaims_BankAccount_SubBankAccount_Btn_AddSubBankAccount = Selector('[aria-label="Add Sub Accounts"]');
   //POM for AddSubBankAccount On BankAccount page

   this.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountName = Selector('#subaccountname');
   //POM for SubBankAccountName On SubBankAccount in  BankAccount page

   this.AssureClaims_BankAccount_SubBankAccount_Txt_SubAccountNumber = Selector('#subaccountnumber');
   //POM for SubBankAccountNumber On SubBankAccount in  BankAccount page

   this.AssureClaims_BankAccount_SubBankAccount_Lst_CheckStock = Selector('#checkstock');
   //POM for Checkstock On SubBankAccount in  BankAccount page

   this.AssureClaims_BankAccount_SubBankAccount_Btn_AccountBalance = Selector('[id="Account Balance"]').find('[class="material-icons mdi mdi-wallet-membership "]');
   //POM for AccountBalance Button BankAccount page

 //--------------------------------Deposit-----------------------------------------------------------
 this.AssureClaims_BankAccount_Deposit_Btn_AddDeposit = Selector('[aria-label="Add Deposit"]');
   //POM for AddDeposit On BankAccount page

   this.AssureClaims_BankAccount_Deposit_Txt_DateOfTransaction = (Selector('#transdate').nth(1));
   //POM of Date Of Transaction On Deposit in BankAccount page

   this.AssureClaims_BankAccount_Deposit_Txt_BankORSubBankAccount = (Selector('#subbankaccount'));
   //POM of BankORSubBankAccount On Deposit in BankAccount page

   this.AssureClaims_BankAccount_Deposit_Txt_Amount = (Selector('[label="Amount"]'));
   //POM of BankORSubBankAccount On Deposit in BankAccount page

   this.AssureClaims_BankAccount_Btn_AccountBalance = Selector('[aria-label="Account Balance"]').find('i');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_DepositTransit = Selector('[name="Rmacurrencycontrol2"]');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_ReleasedPayments = Selector('[name="Rmacurrencycontrol11"]').nth(0);
   //POM For click Ok Botton on Payment 
  
   this.AssureClaims_BankAccount_Txt_OutStandingChecks = Selector('[name="Rmacurrencycontrol3"]');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_ClearedChecks = Selector('[name="Rmacurrencycontrol12"]');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_StatementFromDate = Selector('[id="txt_begindate"]').nth(1);
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_StatementToDate = Selector('[id="txt_endDate"]').nth(1);
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_StatementFromDateDisAbled = Selector('[id="txt_bd"]');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_StatementToDateDisabled = Selector('[id="txt_ed"]');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Btn_SearchOnAccountBalance = Selector('[aria-label="search"]').find('i');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Txt_PriorBalance = Selector('[name="Rmacurrencycontrol13"]');
   //POM For click Ok Botton on Payment  

   this.AssureClaims_BankAccount_Txt_BrginDateOnSearch = Selector('#modal-body').find('table').find('thead').find('tr').nth(1).find('td').nth(0)
  


//-------------------------------------------Balance Statement---------------------------------------------------
this.AssureClaims_BankAccount_Btn_Balance = Selector('#Balance').find('i');
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Balance_StatementBeginDate = Selector('#start_txtDate').nth(1);
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Balance_StatementEndDate = Selector('#end_txtDate').nth(1);
   //POM For click Ok Botton on Payment 

   this.AssureClaims_BankAccount_Balance_StatementBalance = (Selector('#Rmacurrencycontrol1').nth(1));
   //POM of BankORSubBankAccount On Deposit in BankAccount page

   this.AssureClaims_BankAccount_Balance_Save = (Selector('[aria-label="Save & Close"]').find('i'));

   this.AssureClaims_BankAccount_Txt_BalancePerBankStatement = Selector('[name="Rmacurrencycontrol1"]');
   //POM For click Ok Botton on Payment 
	
	   this.AssureClaims_BankAccount_Txt_ReconciliationVerification = Selector('#acbal').find('table').find('tbody').find('tr').find('td').child('span')
   this.AssureClaims_BankAccount_Txt_ReconciliationVerification1 = Selector('[class="Reconheader"]').parent('#acbal').find('span')
	
	//=============================================Story2===============================================
   this.AssureClaims_BankAccount_Txt_BrginDateOnSearch = Selector('#modal-body').find('table').find('thead').find('tr').nth(1).find('td').nth(0)
  
   this.AssureClaims_BankAccount_Chk_ClearCheckBox = Selector('#clearedflag').nth(0)

   this.AssureClaims_BankAccount_Txt_DepositONDate = Selector('[id="voidcleardate"]').nth(1);

   this.AssureClaims_BankAccount_Lst_DepositTransactionType = Selector('[id="deposittype"]')

   this.AssureClaims_BankAccount_Txt_ReconciliationTotalDeposits = Selector('[name="Rmacurrencycontrol5"]');

   this.AssureClaims_BankAccount_Txt_ReconciliationTotalChecks = Selector('[name="Rmacurrencycontrol7"]');

   this.AssureClaims_BankAccount_Txt_ReconciliationTotalAdjustments = Selector('[name="Rmacurrencycontrol9"]');

   this.AssureClaims_BankAccount_Txt_ReconciledItems = Selector('[name="Rmacurrencycontrol14"]');

   this.AssureClaims_BankAccount_Txt_SubTotal = Selector('[name="Rmacurrencycontrol4"]');
  
   this.AssureClaims_BankAccount_Txt_BalancePerBooks = Selector('[name="Rmacurrencycontrol6"]');
  
   this.AssureClaims_BankAccount_Txt_OutOfBalance = Selector('[name="Rmacurrencycontrol8"]');

   this.AssureClaims_BankAccount_Txt_ClearChecks = Selector('#acbal').find('table').find('tbody').find('tr').nth(7).find('td').nth(3);
  
   this.AssureClaims_BankAccount_Txt_Deposit = Selector('#acbal').find('table').find('tbody').find('tr').nth(3).find('td').nth(3);

   this.AssureClaims_BankAccount_Txt_Payments = Selector('#acbal').find('table').find('tbody').find('tr').nth(4).find('td').nth(3);
  
   //this.AssureClaims_BankAccount_Txt_OutStandingChecks = Selector('#acbal').find('table').find('tbody').find('tr').nth(6).find('td').nth(3);
  
   this.AssureClaims_BankAccount_Txt_Checks_ReconciliationTotalDeposits = Selector('#acbal').find('table').find('tbody').find('tr').nth(8).find('td').nth(3);
  
   this.AssureClaims_BankAccount_Txt_Checks_ReconciliationTotalChecks = Selector('#acbal').find('table').find('tbody').find('tr').nth(9).find('td').nth(3);
  
   this.AssureClaims_BankAccount_Txt_Checks_ReconciliationTotalAdjustments = Selector('#acbal').find('table').find('tbody').find('tr').nth(10).find('td').nth(3);
   this.AssureClaims_BankAccount_Btn_LookUP = Selector('[aria-label="Lookup"]').find('i');
   this.AssureClaims_BankAccount_Btn_AddNew = Selector('[name="addicon"]').find('i');
   this.AssureClaims_BankAccount_Btn_ClearMultipleDeposits = Selector('#btnClearMultDeposits').find('i');
   this.AssureClaims_Funds_Select_gridwindow = (Selector('#chkAll'))
   this.AssureClaims_BankAccount_Btn_Clear = Selector('[aria-label="clear"]').find('i');
   this.AssureClaims_BankAccount_Btn_Cancle = Selector('[aria-label="Cancel"]').find('i');
   this.AssureClaims_BankAccount_Txt_EnterToSearch =Selector('[ng-model="search"]');

   this.AssureClaims_BankAccount_Txt_VerifyControlNumberInClearMultipleDeposit = Selector('[class="code-table-container ng-scope"]').find('span').nth(1);

   this.AssureClaims_BankAccount_Chk_VoidCheckBox = Selector('#voidflag')
   this.AssureClaims_BankAccount_Btn_CloseINAccountBalance = Selector('[aria-label="Close"]').find('i');

   this.AssureClaims_BankAccount_Btn_ViewAll = Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('more_horiz');
        
   this.AssureClaimsApp_BankAccount_Txt_ControlNumber= Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Ctl Number').parent('[role="columnheader"]').find('input')

   this.AssureClaims_BankAccount_Lnk_AccountName=(Selector('[class="ngCellText ui-grid-cell-contents ng-scope"]').find('span'))
   this.AssureClaims_BankAccount_Btn_Close=Selector('[class="modal-header modal-header-bg ng-scope panel-heading"]').find('span').withText('...')
	
	   this.AssureClaims_BankAccount_Txt_InsufficientPayments = Selector('[name="Rmacurrencycontrol11"]').nth(1);
	
   //Sai's Code : RMA-96706

       this.AssureClaims_BankAccount_BankAccount_Txt_BankAccountNumber = Selector('#accountnumber');
       //POM for BankAccountNumber On SubBankAccount in  BankAccount page

      this.AssureClaims_BankAccount_Txt_Checks_OutStandingChecks = Selector('#acbal').find('table').find('tbody').find('tr').nth(6).find('td').nth(3);
      //POM for outstanding check On BankAccount page
	
      this.AssureClaims_SearchSubBankAccount_Lnk_BankAccount = Selector('[class="list-group"]').find('span')
     // POM for Sub Bank Account links	

}};
export default POM_BankAccount;
