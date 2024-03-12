import { Selector, t} from 'testcafe';
class POM_StopPay{
constructor(){
   // Tushar's code : RMA-92828 
   this.AssureClaims_StopPay_Btn_PrintSingleCheck = (Selector("#apscprint"))
   //POM for Print Check button on print check screen

   this.AssureClaims_StopPay_Btn_CheckBatchMsgInfoSaveIcon = (Selector("#chcekBatchMsgInfoSaveIcon"))
   //POM for Ok button to print the check

   this.AssureClaims_StopPay_Btn_PrintCheckRange = (Selector("#I1"))
   //POM for ok button on print check range screen
   
   this.AssureClaims_StopPay_Btn_StopPayStatusCode_OpenLookup= (Selector("#btn_stoppaystatuscode_openlookup"))
   // POM for lookup button of stop pay status
   
   this.AssureClaims_StopPay_Lnk_StopPayStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
   // POM for stop pay status links

   this.AssureClaims_StopPay_Btn_StopCheckReasonCode_OpenLookup = Selector('#btn_stoppaycodereason_openlookup')
   // POM for lookup button of stop pay status

   this.AssureClaims_StopPay_Lnk_StopCheckReasonCode = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
   // POM for stop pay reason code links

   this.AssureClaims_Claims_Lnk_PrintCheck=Selector('[role="menuitem"]')    
   //POM for printcheck button    

   this.AssureClaims_Claims_Btn_OkToPrintCheck=Selector('[class="btnpdd"]').find('i')   
   //POM for ok button to print check

   this.AssureClaims_Claims_Btn_Lookup=Selector('[class="dropdown"]')
   //POM for look up button    

   this.AssureClaims_Claims_Lnk_PrintCheck=Selector('[role="menuitem"]')    
   //POM for printcheck button

   // end of Tushar's code
   // yashaswi's code : RMA-92828 
   this.AssureClaims_Claims_Chk_ReadyToPrint=Selector("#readytoprint")
   // POM for Ready to print Button
   
   this.AssureClaims_Claims_Btn_OkToReadyToPrintConfirmation=Selector("#Button1").find('i')
   //POM for ok button for Ready to print Confirmation
   
   this.AssureClaims_Claims_Btn_StopPay= Selector("#stoppayflag")
   //POM for StopPay Button
   
    // Yashaswi's and Tushar's Code : RMA-92829
   this.AssureClaims_Claims_Lst_bankaccountname= Selector("#idbankaccountname")
   // POM for selecting Bank Account name from funds

   this.AssureClaims_Claims_Lst_stoppaystatus= Selector("#idstoppaystatus")
   // POM for Stop Pay Status from funds

   this.AssureClaims_Claims_Btn_StopPaySearch = Selector("#searchicon")
   // POM for Stop Pay Search

   this.AssureClaims_Claims_Btn_RequestStopPay = Selector("#gavelicon")
   // POM for Stop Pay Button(Stop Bulk Pay)

   this.AssureClaims_StopPay_Btn_StopCheckReasonCodeOpenLookup = Selector("#btn_idstopcheckreasoncode_openlookup");
   // POM for Stop Check Reason Code Lookup
   
   this.AssureClaims_StopPay_Lnk_StopCheckReasonCodeOpenLookup = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
   //POM for Select stoppay reason code
   
   this.AssureClaims_StopPay_Btn_SelectCompleteGrid = Selector('[ng-click="headerButtonClick($event)"]')
   //POM for select complete grid button

   this.AssureClaims_StopPay_Txt_ClaimNumberSubjectSearch = Selector("#subjectsearch");
   //POM for Search box

   this.AssureClaims_StopPay_Txt_StopPayReasonCodeSave = Selector("#btnSaveComment");
   // POM for Save

   this.AssureClaims_StopPay_Txt_StopPayReload = Selector('[aria-label="Reload"]').withText("replay");
   //POM for reload button

   this.AssureClaims_StopPay_Btn_AcceptStopPay = Selector("#doneicon");
   // POM for Accepted button

   this.AssureClaims_StopPay_Btn_RejectStopPay = Selector("#cancelicon");
   // POM for Rejected button
   
   this.AssureClaims_StopPay_Btn_GridButtonRow= Selector('[ng-click="selectButtonClick(row, $event)"]')
   //POM for select single row button
   
   this.AssureClaims_Claims_Btn_UndoReleaseStopPay = Selector("#undoicon");
   // POM for undo/released button
   
     // Tushar's Code -->RMA-92830
   
   
       this.AssureClaims_PayeeDetails_Txt_LastName = Selector('#lookup_lastName');
      //POM for Last Name Textbox On schedule check Third part Payee

      this.AssureClaims_Claims_Chk_deductAgainstPayeeFlag = Selector('#deductAgainstPayeeFlag');
      //   POM for Deduct Against Payee Flag

      this.AssureClaims_StopPay_Txt_TransactionAmount = Selector('#amountthirdparty');
      // POM for Third Party Transaction Amount
   
         this.AssureClaims_Claims_Txt_PayeeSearch = Selector('#name');
      // POM for Payess search in transaction History screen
      
      this.AssureClaims_Claim_Lnk_ControlNumber = Selector('[class="a_bold ng-binding"]')
      // POM for Control Number Link

      this.AssureClaims_StopPay_Btn_BackupWithholding = Selector('#Withholding').find('i');
       // POM for Backup Withholding Button

       this.AssureClaims_StopPay_Chk_EnableBackupWithholding = Selector('#chkEnableWithholding');
       // POM for Backup Withholding 
       
       this.AssureClaims_StopPay_Txt_BackupWithholdingPercentage = Selector('#txtPercentage');
       // POM for Backup Withholding Percentage
       
       this.AssureClaims_StopPay_Txt_Recipient = Selector('#lookup_luRecipient');
       // POM for Backup Withholding Recipient
       
       this.AssureClaims_StopPay_Txt_SearchPayeeName = Selector('#categorysearch');
       // POM for Search Payee Name on Stop pay Check Screen

      this.AssureClaims_StopPay_Txt_StopPayStatusCode = Selector('#lookup_stoppaystatuscode');
      // POM for Stop Pay Status Code on Transaction Screen
   
}
};
export default  POM_StopPay;
