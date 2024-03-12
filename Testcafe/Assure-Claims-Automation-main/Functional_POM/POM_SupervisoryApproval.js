import {Selector,t} from 'testcafe';

class POM_SupervisoryApproval{
    constructor(){

        this.AssureClaims_SupervisoryApproval_Tab_Reserve=Selector('#aReserveTab')
        //POM for reserve tab

        this.AssureClaims_SupervisoryApproval_Tab_Payment=Selector('#aPaymentTab')
        //POM for reserve tab

        this.AssureClaims_SupervisoryApproval_Chk_FirstRowSelection=Selector('[ng-click="selectButtonClick(row, $event)"]')
        //POM for select row

        this.AssureClaims_SupervisoryApproval_Btn_Approve=Selector('#resaApprove')
        //POM for Approve Button

        this.AssureClaims_SupervisoryApproval_Btn_Reject=Selector('#resaReject')
        //POM for Reject Button

        
        this.AssureClaims_SupervisoryApproval_Txt_ResRejectReason=Selector('#txtarRejResReason')
        //OOM for Reserve Reject Reason Text Box

        this.AssureClaims_SupervisoryApproval_Txt_ResApproveReason=Selector('#txtarReservesapprovalreason')
        //POM for Reserve approval reason

        this.AssureClaims_SupervisoryApproval_Btn_ApproveSaveComment=Selector('#btnSaveComment')
        //POM for Approve Button

        this.AssureClaims_SupervisoryApproval_Txt_NoRecordAvailable=Selector('[ng-show="gridVM.noRecords"]').find('p')
        //POM for text No Record Available

        
        //For payemnt approval

        this.AssureClaims_SupervisoryPaymentApproval_Btn_Approve=Selector('#payaApprove')
        //POM for Approve Button

        this.AssureClaims_SupervisoryPaymentApproval_Btn_Reject=Selector('#payaReject')
        //POM for Reject Button

        this.AssureClaims_SupervisoryPaymentApproval_Txt_PayApproveReason=Selector('#txtPaymentapprovalreason')
        //POM for Payment approval reason

        this.AssureClaims_SupervisoryPaymentApproval_Txt_PayRejectReason=Selector('#divRejectPaymen2').find('textarea')
        //POM for Payment Reject Reason Text Box
        
       //Muskan's Code: RMA-90881
      this.AssureClaims_SupervisoryApproval_Btn_QueuedPayment=Selector('#payqueuedicon')
      //POM for queued payemnt button

      this.AssureClaims_SupervisoryPaymentApproval_Btn_RejectReason=Selector('#txtPaymentTxt')
      //POM for Reject Button
        
        
        // Yashaswi's Code : RMA-104781
        this.AssureClaims_SupervisoryApproval_Btn_ReserveGroup = Selector('#resgropuicon').find('i')
         //   POM for Reserve Group Supervisory Approval Button
        
      //Muskan's Code : RMA-104784
      this.AssureClaims_SupervisoryApproval_Btn_PaymentGroup = Selector('#paygropuicon')
      //POM for group button

        
}};
export default POM_SupervisoryApproval;
