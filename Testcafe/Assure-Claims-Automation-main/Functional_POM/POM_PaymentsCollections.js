import { Selector, t } from 'testcafe';
class POM_PaymentsCollections {
  constructor() {

    this.dvbreadcrumbscroll = Selector('#dvbreadcrumbscroll').find('i').withText('reply')
    //POM for BreadCrumb 

    //this.ClaimGcIframe=(Selector('[id^="claimgc"]'))

    this.gridwindow = (Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
    //POM for GridWindow

    this.AssureClaims_Payment_Btn_MakePayment = (Selector('#MakePayment').find('[class^="commonIcomoon material-icons-clr icon-payment icon"]'))
    //POM for MakePayment Button

    this.AssureClaims_Payment_Btn_AddCollection = (Selector('#AddCollection'))
    //POM for AddCollection Button

    this.AssureClaims_Payment_Lst_BankAccount = (Selector('#bankaccount'))
    //POM for BankAccount On Transaction Page

    this.AssureClaims_PaymentCollection_Lst_PayeePayorType = (Selector('#cbopayeetype'))
    //POM for PayeePayor Type On Transaction Screen

    this.AssureClaims_PaymentCollection_Txt_LastName = (Selector('#lookup_rmalookupfinanciallastname2_lastName'))
    //POM for LastName 

    this.AssureClaims_PaymentCollection_Tab_TransactionDetail = (Selector('[role="button"]').find('span').withText('Transaction Detail'))
    //POM for To Select TransactionDeatil Accordion on Transaction Screen

    this.AssureClaims_PaymentCollection_Btn_AddNewFunds = (Selector('#cruduiGridAddBtn'))
    //POM for AddNewFund/Split Button

    this.AssureClaims_FundsSplitDetails_Lst_ReserveType = (Selector('#cmbReserveTypeFt'))
    //POM for Reserve Type

    this.AssureClaims_FundsSplitDetails_Lst_TransactionType = (Selector('#cmbTransactionType'))
    //POM for TransactionType

    this.AssureClaims_FundsSplitDetails_Txt_Amount = (Selector('#amount').nth(1))
    //POM for Amount

    this.AssureClaims_Payment_FundsSplitDetails_Btn_Save = (Selector('#Save').find('i').withText('save'))
    //POM for Saving The SplitAmount

    this.AssureClaims_PaymentCollection_Tab_Transaction = (Selector('[role="button"]').find('span').withText('Transaction'))
    //POM for Selecting Transaction Accordian On Transaction Page

    this.AssureClaims_ReserveCreation_Btn_Reserve_History = Selector('#PaymentHistory').find('i').withText('history')
    //POM for Transaction history btn

    //this.AssureClaims_Payment_FinalTransaction_Save= (Selector('#Save').find('i').withText('save'))

    this.AssureClaims_FundsSplitDetails_Lst_FundUnit = Selector("#cmbUnit");
    //POM for fund split Unit

    this.AssureClaims_FundsSplitDetails_Lst_FundCoverageType = Selector("#cmbCoverageType");
    //POM for fund Coverage Type

    this.AssureClaims_FundsSplitDetails_Lst_FundLossType = Selector("#cmbCoverageLossType");
    //POM for fund Loss Type  

    this.AssureClaims_Payment_Lst_DetailedTrackingClaimant = Selector('#cboclaimant')
    //POM for Detailed Tracking Claimant

    this.AssureClaims_FundsSplitDetails_Lst_FundPolicy = Selector("#cmbPolicy");
    //POM for fund split Policy

    this.AssureClaims_Payment_Txt_ControlNumber = Selector('#ctlnumber')
    //POM for Control Number

    this.AssureClaims_PaymentCollection_Txt_CheckNumber = Selector('#checknumber');
    //POM For Text CheckNumber on Payment 

    this.AssureClaims_PaymentCollection_CheckStatus = Selector('#lookup_checkstatuscode');
    //POM For Text Check Status on Payment 

    this.AssureClaims_PaymentCollection_Btn_Ok = Selector('#btnRoll').find('i').withText('done');
    //POM For click Ok Botton on Payment 

    this.AssureClaims_PaymentCollection_Chk_Cleared = Selector('#clearedflag')
    //POM For Cleared CheckBox on Payment Creation Page

    this.AssureClaims_PaymentCollection_Btn_Reserve_History = Selector('#PaymentHistory').find('i').withText('history')
    //POM for Add Reserve Button on Financial Reserve History Page

    this.AssureClaims_PaymentCollection_Lnk_ControlNumber = Selector('[class="ngCellText ui-grid-cell-contents md-mini md-primary ng-scope"]').find('span')
    //POM for ControlNumber Link on Financial Reserve History Page

    this.AssureClaims_PaymentCollection_Txt_ControlNumber = Selector('#ctlnumber');
    //POM Of Control Number  Field on General Claim Screen

    this.AssureClaims_PaymentCollection_Chk_voidCheck = Selector('#voidflag')
    //POM For Void CheckBox on Payment

    this.AssureClaims_PaymentCollection_Chk_FinalPayment = Selector('#finalpaymentflag')
    //POM For FinalPayment CheckBox on Payment

    this.AssureClaims_PaymentCollection_Chk_SupplementalTransaction = Selector('#isSupplementalPay')
    //POM For Supplemental Transaction CheckBox on Payment

    this.AssureClaims_PaymentCollection_Chk_CombinedPayment = Selector('#combinedpayflag')
    //POM For CombinedPayment CheckBox on Payment

    this.AssureClaims_PaymentCollection_ClaimNumber_Lookup = (Selector('#lookup_claimnumber'));
    //POM for Claim Number Selection

    this.AssureClaims_Payment_Lst_DetailTrackingClaimant = Selector('#cboclaimant');
    // POM for Detail Tracking Claimant Selection

    this.AssureClaims_Payment_Txt_CntrlNumber = Selector('#controlNumber')
    //POM for Control number textbox on Transaction Histroy Screen

    this.AssureClaims_Payment_Btn_FilterSerach = Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000D"]').find('[ng-click="grid.appScope.toggleFiltering()"]')
    //POM for Control number Search button on Transaction Histroy Screen

    this.AssureClaims_PaymentCollection_Btn_Reserve_Detailed_History = Selector('#FinancialDetailHistory').find('i')
    //POM for Add Reserve Button on Financial Reserve History Page

    //Sai's Code : RMA-87954

    this.AssureClaims_PaymentCollection_Chk_Collection = Selector('#collectionflag')
    //POM For Collection CheckBox on Payment

    this.AssureClaims_PaymentCollection_Txt_DateOfTransaction = (Selector('#transdate').nth(1));
    //POM of Date of Event On General Claim Screen

    this.AssureClaims_PaymentCollection_Txt_CheckDate = (Selector('#checkdate').nth(1));
    //POM of Date of Event On General Claim Screen

    //EDIT RMA-87941

    this.AssureClaims_Funds_Btn_ClaimNumber = Selector('#btn_claimnumber')
    //POM for claim Number Look Up

    this.gridwindow_3 = (Selector('[class="ui-grid-cell-contents"]').nth(3).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
    //POM for GridWindow3

    this.gridwindow_2 = (Selector('[class="ui-grid-cell-contents"]').nth(2).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
    //POM for GridWindow2


    //Sai's Code:RMA-88771
    this.AssureClaims_PaymentCollection_Btn_PrintCheck = (Selector('[id="Print Check"]').find('i'))

    this.AssureClaims_PaymentCollection_Line_PrintCheckVerification = (Selector('[id="modal-desc"]'))

    //Sai's Code :RMA-90827
    this.AssureClaims_PaymentCollection_Btn_TaxId = (Selector('#spnEdit_pye_taxid'))

    this.AssureClaims_PaymentCollection_Btn_Edit_TaxId = (Selector('#TaxId'))

    this.AssureClaims_PaymentCollection_Btn_Cancle = (Selector('#Cancel').find('i'))

    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_PaymentCollection_Btn_PayToTheOrderOfLookUP = (Selector('[aria-label="Generate Pay to the Order Of"]').find('span'))
    this.AssureClaims_PaymentCollection_Lst_PayeePhraseLocationFirst = (Selector('[id="payeeLocation+0"]'))
    this.AssureClaims_PaymentCollection_Lst_PayeePhraseLocationSecond = (Selector('[id="payeeLocation+1"]'))
    this.AssureClaims_PaymentCollection_Lst_payeePhraseFirst = (Selector('[id="payeePhrase+0"]'))
    this.AssureClaims_PaymentCollection_Lst_payeePhraseSecond = (Selector('[id="payeePhrase+1"]'))
    //Sai's Code :RMA-97097 Ends Here(22.4)
    this.AssureClaims_PaymentCollection_Btn_Preview = (Selector('[aria-label="preview"]').find('i'))
    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_PaymentCollection_CompareTxt_GeneratePayToTheOrderOf = (Selector('[id="MemoDiv"]').find('div').nth(0).find('div').nth(2).withText('and Kemper and Transaction Payee'))
    this.AssureClaims_PaymentCollection_Btn_PayToTheOrderOfEdit = (Selector('[id="paytotheorder"]').find('div').find('span').find('button').nth(0).find('i'))
    this.AssureClaims_PaymentCollection_Txt_PayToTheOrderOfContent = (Selector('[ng-model="addedComment"]'))
    //Sai's Code :RMA-97097 Ends Here(22.4)
    this.AssureClaims_PaymentCollection_CompareTxt_Generate_Pay_To_The_Order_Of1 = Selector('[ng-bind="vm.previewText"]').withExactText('Allow Edit Of Pay To The Order Of').parent('div').find('[type="checkbox"]');
    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_PaymentCollection_Txt_MailToLastName = (Selector('[aria-label="Mail To Last Name"]'))
    //Sai's Code :RMA-97097 Ends Here(22.4)
    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_PaymentCollection_Btn_OkForPayToTheOrderOf = Selector('#usericon').find('i').withText('done');
    //Sai's Code :RMA-97097 Ends Here(22.4)
    this.AssureClaims_PaymentCollection_Txt_TaxID = (Selector('#pye_taxid'))

    this.AssureClaims_PaymentCollection_CompareText_TaxIDAlertBoxMessage = (Selector('[id="modal-desc"]'))

    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_PaymentCollection_Btn_LoadEntity = (Selector('#spnEntity_pye_taxid'))
    //Sai's Code :RMA-97097 Ends Here(22.4)
    this.AssureClaims_Search_Entity_Label_MenuOption = (Selector('[id="menu_SearchRoot"]').find('a').withText('Entity'))

    this.AssureClaims_Search_Txt_EntityLastName = (Selector('[name="Last Name"]'))

    this.AssureClaims_Search_Lnk_LastName = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');

    this.AssureClaims_Search_Btn_SubmitQuery = Selector('#submitquery').find('i');

    this.AssureClaims_PaymentCollection_Btn_Add_LastName = (Selector('[class="btn clickablebtn btn-primary"]').nth(1).find('i'))

    this.AssureClaims_PaymentCollection_Btn_EntitySelection = (Selector('[aria-label="People"]'))

    this.AssureClaims_PaymentCollection_Txt_FirstNameInTransactionScreen = (Selector('#pye_firstname'))
    //POM for LastName 
    //Sai's Code :RMA-97097 Starts Here(22.4)
    this.AssureClaims_PaymentCollection_Txt_PayToTheOrderOf = (Selector('[aria-label="Pay To The Order Of"]'))
    //Sai's Code :RMA-97097 Ends Here(22.4)

    this.AssureClaims_PaymentCollection_Txt_Address1InTransactionScreen = (Selector('[aria-label="Address 1"]'))

    this.AssureClaims_PaymentCollection_Txt_CityInTransactionScreen = (Selector('#pye_city'))

    this.AssureClaims_PaymentCollection_Txt_ZipCodeInTransactionScreen = (Selector('#pye_zipcode'))

    //RMA-90825-----------------------------------------------------------------------------------------------------
    this.AssureClaims_QueuedPayment_statusLookup = Selector('#btn_checkstatuscode_openlookup');
    //POM for Check Status Look up button

    this.AssureClaims_QueuedPayment_SelectStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
    //POM for Select Check status

    this.AssureClaims_QueuedPayment_Checkbox_Void = Selector('#voidflag');
    //POM for Void CheckBox

    this.AssureClaims_QueuedPayment_Btn_Edit = Selector('#Edit');
    //POM for edit button on transaction split

    this.AssureClaims_QueuedPayment_Btn_TransactionHistory = Selector('[id^="Go To Transaction History"]')
    //POM for transaction history button 

    this.AssureClaims_Transaction_Btn_TransactionHistory = Selector('#div_PaymentHistory')
    //POM for transaction history button

    this.AssureClaims_QueuedPayment_Btn_Close = Selector('#Close')
    //POM for close button

    this.AssureClaims_QueuedPayment_Btn_done = Selector('#btnRoll').find('i');
    //FromToDate confirm btn

    //Sai's Code RMA-91580
    this.AssureClaims_PaymentCollection_Lnk_AutoCheckDate = Selector('[class="ngCellText ui-grid-cell-contents md-mini md-primary ng-scope"]').find('span')
    //POM for AutoCheckDate Link on Financial Reserve History Page

    this.AssureClaims_PaymentCollection_Btn_AutoCheck_On_TransactionHistory_Screen = (Selector('#btnAutoChecks').find('i').withExactText('schedule'))

    this.AssureClaims_PaymentCollection_Btn_TaxId1 = (Selector('#btnEdit_pye_taxid').find('span'))

    //Sai's Code : RMA-90823
    this.AssureClaims_Payment_Btn_More = Selector('[aria-label="more"]').find('i')
    //POM for More ToolBar Button on Transaction  Screen

    this.AssureClaims_Payment_Btn_Copy_Transaction = Selector('[aria-label="Copy Transaction"]')
    //POM for More ToolBar Button on Transaction  Screen

    this.AssureClaims_ScheduleCheck_Txt_DistributionType = Selector('[aria-label="Distribution Type"]');
    //POM for DistributionType Value on Payment

    this.AssureClaims_PaymentCollection_Btn_EditFundsSplit = (Selector('#Edit'))
    //POM for AddNewFund/Split Button

    this.AssureClaims_FundsSplitDetailsScreen_Btn_Close = Selector('#Close').find('i')
    //POM for close button

    this.AssureClaims_Payment_Btn_CopyTransactionForReleasedCollection = Selector('[aria-label="Copy Transaction"]').find('i')
    //POM for More ToolBar Button on orphan Transaction For Released Collecton Screen only

    this.AssureClaims_Payment_Lst_VoidReasonCode = Selector('#voidcodereason')
    //POM for Void Reason code in Transaction Screen

    //Yashaswi's Code : RMA-94578
    this.AssureClaims_Claims_Lst_SelectDormancyStatus = Selector('#cbodormancystatus')
    // POM for Dormancy status Lst_SelectStatus

    //Muskan's Code : RMA-94580
    this.AssureClaims_PrintCheck_Txt_CheckDateOverTransactionScreen = Selector('#checkdate')
    // POM for Check date over transaction Screen

    this.AssureClaimsApp_PrintCheck_Btn_PrintButton = Selector('#btnPrePrint').find('i');
    //POM for Print button over print check screen

    this.AssureClaimsApp_PrintCheckBatch_Btn_PrintButton = Selector('#aprintIcon').find('i');
    //POM for Print button over print check Batch tab 

    this.AssureClaimsApp_PrintCheck_Btn_Okbutton = Selector('#btnRoll')
    //POM for ok button over print check screen

    this.AssureClaims_PrintCheck_Lst_DistributionType = Selector('#dllprepredistributionType');
    //POM for distribution type over Print check screen

    this.AssureClaims_PrintCheck_Lst_SelectCheck = Selector('#ddlpreChecksType');
    //POM for distribution type over Print check screen

    this.AssureClaims_PrintCheck_Btn_CheckSelection = Selector('#btn_CheckSelection');
    //POM for Check Selection over Print check screen

    this.AssureClaims_SelectChecksToPrint_txt_ClaimNumber = Selector('[class="ng-scope sortable"]').withText('Claim Number').find('input');
    //POM for claim number textbox over Select Checks To Print screen

    this.AssureClaims_SelectChecksToPrint_Btn_OkButton = Selector('#btnSaveComment');
    //POM for ok button over Print check screen

    this.AssureClaimsApp_Payment_Btn_DistributionTypeLookup = Selector('#btn_distributiontype_openlookup')
    //POM for distribution type lookup

    this.AssureClaimsApp_Payment_Btn_SelectDistributionType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM of Claim Status Value On General Claim Screen

    this.AssureClaimsApp_PrintCheck_Txt_FromDate = Selector("#txt_prefromdate")
    //POM for from date over Print Check Screen

    this.AssureClaims_PrintCheck_Txt_CheckDate = Selector('#checkdate')
    //POM for Check date over transaction Screen

    this.AssureClaimsApp_PrintCheck_Tab_PrintCheckBatch = Selector('[role="tablist"]').find('li').find('a').withText('Print Check Batch')
    //POM for print check batch tab over print check screen

    this.AssureClaims_PrintCheckBatch_Lst_BankAccount = Selector('#ddlprintBankAccount');
    //POM for distribution type over Print check screen

    this.AssureClaims_PrintCheckBatch_Lst_DistributionType = Selector('#dllprintpredistributionType');
    //POM for distribution type over Print check screen

    this.AssureClaims_PrintCheckBatch_Txt_CheckDate = Selector('#txtprintCheckDate');
    //POM for distribution type over Print check screen

    this.AssureClaims_ChecksAndEOBReports_Btn_OkButton = Selector("#Div6").find('i')
    //POM for ok button over Checks And EOB Reports screen

    this.AssureClaims_PrintedCheckRange_Btn_OkButton = Selector("#Div13").find('span').withText('check')
    //POM for ok button over Printed check range screen

    //Sai's code : RMA-95941

    this.AssureClaims_FundsSplitDetails_FromDate = (Selector('#fromDate').nth(1));
    //POM of Date of Event On General Claim Screen

    this.AssureClaims_FundsSplitDetails_ToDate = (Selector('#toDate').nth(1));
    //POM of Date of Event On General Claim Screen

    // Sai's code: RMA-97883
    this.AssureClaims_PrintCheck_Lst_BankAccount = Selector('#ddlpreBankAcc');
    //POM for  BankAccount over Print check screen
    
    // Tushar's Code : RMA-99202
    this.AssureClaims_PaymentCollection_Txt_ClaimantLastName = (Selector('#lookup_rmalookupfinanciallastname3_lastName'))
    //POM for Claimant LastName 
    
    // Yashawi's code : RMA-103461
    this.AssureClaims_PaymentCollection_Btn_AddLastName = (Selector('[class="btn clickablebtn btn-primary"]'))
    //POM for Add LastName button
    this.AssureClaims_SelectChecksToPrint_txt_ControlNumber = Selector('[class="ng-scope sortable"]').withText('Control Number').find('input');
    //POM for Control number textbox over Select Checks To Print screen

     // Yashaswi's Code : RMA-108972
    this.AssureClaimsApp_Payment_Tab_PayeeInformation = Selector('[aria-label="Payee Information"]')
    // POM For Payee Information tab over payment screen

    this.AssureClaimsApp_Payment_Tab_MailToInformation = Selector('[aria-label="Mail to information"]')
    // POM For Mail to information tab over payment screen

    //Sukanya's code: RMA-109588
    this.AssureClaimsApp_ClaimScheduler_Btn_TransactionSplitEdit = Selector('#Edit')
    // POM for Editing the Transaction Split Details tab for Non-BRS

    this.AssureClaimsApp_ClaimScheduler_Btn_TransactionSave = Selector('#Save')
    // POM for Editing the Transaction Split Details tab for clicking the save button

  }
}

export default POM_PaymentsCollections;
