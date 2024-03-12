import { Selector, t } from 'testcafe';

class POM_PaymentParameterSetUp {
    constructor() {

        this.AssureClaims_Lnk_PaymentParameterSetUp = Selector('#all-services-itemec2').find('a')
        //POM for Payment Parameter Set Up

        this.AssureClaims_PmntSetUpSprVsr_Tab_SupervisorApproval = Selector('#LINKTABSSupervisorApproval')
        //POM for tab Supervisor Approval Configuration

        this.AssureClaims_PmntSetUpSprVsr_Chk_RsvLimitExceed = Selector('#UseHoldReserve')
        //POM for check box reserve limit exceed

        this.AssureClaims_PmntSetUpSprVsr_Chk_UseSupAppRsv = Selector('#UseSupAppReserves')
        //POM for check box Supervisory Approval For Reserves

        this.AssureClaims_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApproveReserve = Selector('#AccessGrpApproveReserve')
        //POM for check box Allow the group of supervisor to approve

        this.AssureClaims_PmntSetUpSprVsr_Chk_UseCurrAdjRsv = Selector('#UseCurrAdjReserves')
        //POM for Use Current Adjuster Supervisory Chain

        this.AssureClaims_PmntSetUpSprVsr_Chk_TimeFrameRsv = Selector('#DDLTimeFrame')
        //POM for Time Frame

        this.AssureClaims_PmntSetUpSprVsr_Chk_DaysApprovalRsv = Selector('#DaysApprovalReserves')
        //POM for Days/Hours For Approval Of Reserves

        this.AssureClaims_PmntSetUpSprVsr_Chk_ZeroEscalationRsv = Selector('#ZeroEscalationReserves')
        //POM for check box Consider 0 as Valid value for Escalation

        this.AssureClaims_PmntSetUpSprVsr_Chk_NotifySupRsv = Selector('#NotifySupReserves')
        //POM for check box Notify The Immediate Supervisor

        this.AssureClaims_PmntSetUpSprVsr_Chk_DisbEmailSprVsrRes = Selector('#DisableEmailNotifyForSuperVsr')
        //POM for check box Disable Email Notification To Supervisor

        this.AssureClaims_PmntSetUpSprVsr_Chk_DisbDiarySprVsrRes = Selector('#DisableDiaryNotifyForSuperVsr')
        //POM for check box Disable Diary Notification To Supervisor

        this.AssureClaims_PmntSetUpSprVsr_Chk_IncLmtExceed = Selector('#UseHoldIncurredLimits')
        //POM for check box 

        this.AssureClaims_PmntSetUpSprVsr_Chk_PayLimitExceed = Selector('#PayLimitExceed')
        //POM for Payment Limits Are Exceeded

        this.AssureClaims_PmntSetUpSprVsr_Chk_PayDetailLimitExceed = Selector('#PayDetailLimitExceed')
        //POM for Payment Detail Limits Are Exceeded

        this.AssureClaims_PmntSetUpSprVsr_Chk_PayeeNotExist = Selector('#PayNotExist')
        //POM for Payee does Not Exist in System

        this.AssureClaims_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded = Selector('#PerClaimPayLimitsExceeded')
        //POM for Per Claim Pay Limits Exceeded

        this.AssureClaims_PmntSetUpSprVsr_Chk_QueuePayment = Selector('#QueuePayment')
        //POM for Queue Payments Instead Of Placing On Hold

        this.AssureClaims_PmntSetUpSprVsr_Chk_SupervisoryApproval = Selector('#SupervisoryApproval')
        //POM for Supervisory Approval

        this.AssureClaims_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApprove = Selector('#AccessGrpApprove')
        //POM for Allow the group of supervisor to approve

        this.AssureClaims_PmntSetUpSprVsr_Chk_UseCurrentAdjuster = Selector('#UseSupChain')
        //POM for Use Current Adjuster Supervisory Chain

        this.AssureClaims_PmntSetUpSprVsr_Lst_TimeFrame = Selector('#TimeInterval')
        //POM FOR Time Frame

        this.AssureClaims_PmntSetUpSprVsr_Txt_DaysHrsApproval = Selector('#DaysApproval')
        //POM for Days/Hours For Approval Of Checks On Hold

        this.AssureClaims_PmntSetUpSprVsr_Chk_ZeroEscalationValue = Selector('#ZeroEscalationFunds')
        //POM for Consider 0 as Valid value for Escalation

        this.AssureClaims_PmntSetUpSprVsr_Chk_NotifyImmSupervisor = Selector('#PmtNotfyImmSup')
        //POM for Notify The Immediate Supervisor

        this.AssureClaims_PmntSetUpSprVsr_Chk_EnbPmtDiary = Selector('#EnableCRDiary')
        //POM for Enable Payment Approval Diary

        this.AssureClaims_PmntSetUpSprVsr_Chk_DisbDiaryNotify = Selector('#DiaryToManager')
        //POM for Disable Diary Notification To Supervisor

        this.AssureClaims_PmntSetUpSprVsr_Chk_DisbEmailNotify = Selector('#DisableEmailNotifyForPayment')
        //POM for Disable Email Notification To Supervisor

        this.AssureClaims_PmntSetUpSprVsr_Chk_EnbPmtEmail = Selector('#EnableCREmail')
        //POM for Enable Payment Approval Email

        this.AssureClaims_PmntSetUpSprVsr_Chk_PerClaimPolicyPayLimitsExceeded = Selector('#chkPerClaimPerPolicyPayLimitsExceeded')
        //POM for Per Claim Per Policy Pay Limits Exceeded

        this.AssureClaims_PmntSetUpSprVsr_Chk_PerClaimCoveragePayLimitsExceeded = Selector('#chkPerClaimerCoveragePayLimitsExceeded')
        //POM for Per Claim Per Coverage Pay Limits Exceeded

        this.AssureClaims_PmntSetUpSprVsr_Chk_DisbDiaryNotUnapprovedEntity = Selector('#DisableDiaryNotifyForUnapprovedEntity')
        //POM for Disable Diary Notification for Unapproved Entity

        //QUEUED PAYMENT RMA-90825
        this.AssureClaims_PmntSetUpSprVsr_Chk_QueuedPayment = Selector('#QueuePayment');
        //POM for queued payment check box

        //Muskan's Code : RMA-94580
        this.AssureClaims_PmntSetUp_Chk_RollupCheckforTheSamePayee = Selector('#RollUpChecks')
        //POM for Roll Up Checks to the same payee check box

        //Muskan's Code : RMA-98974=======================================================================
        this.AssureClaims_PaymentParameters_Chk_PaymentLimitExceed=Selector('#payLimitExceed-input')
        //POM for Check box Payment limits are exceeded over configuration manager screen

        this.AssureClaims_PaymentParameters_Chk_QueuePaymentsInsteadOfHold=Selector('#queuePayment-input')
        //POM for Check box Queue Payments instead of Hold over configuration manager screen

        this.AssureClaims_PaymentParameters_Chk_PaymentUseSupervisoryApproval =Selector('#supervisoryApproval-input')
        //POM for Check box Use Supervisory Approval over configuration manager screen

        this.AssureClaims_PaymentParameters_Chk_UseEntityPaymentApproval =Selector('#useEntityApproval-input')
        //POM for Check box Use Entity Payment Approval over configuration manager screen

         this.AssureClaims_PmntSetUpSprVsr_Chk_CheckVoidReason = Selector('#EnableVoidReasonComment')
        //POM for Payee does Not Exist in System

        //Muskan's Code : RMA-98985=======================================================================
        this.AssureClaims_PaymentParameters_Chk_CheckVoidReason = Selector('#enableVoidReasonComment-input')
        //POM for Check box Check Void Reason over configuration manager screen
        
        // Tushar's code : RMA-102196
 
         this.AssureClaims_PaymentParameters_Chk_rollUpChecks = Selector('#rollUpChecks-input')
         //POM for Roll Up Checks checkbox over configuration manager screen
        
         //Muskan's Code : RMA-102180
        this.AssureClaims_PaymentParameters_Chk_ReserveLimitsAreExceeded=Selector('#useHoldReserve-input')
        //POM for check box Reserve Limits Are Exceeded over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_ReserveUseSupervisoryApproval =Selector('#useSupAppReserves-input')
        //POM for Check box Use Supervisory Approval for reserve over configuration manager screen

        this.AssureClaims_PaymentParameters_Chk_ReserveAllowGroupOfSupervisorToApprove=Selector('#accessGroupApproveReserve-input')
        //POM for check box Allow Group of Supervisor to Approve over Payment parameter setup
        
        this.AssureClaims_PaymentParameters_Lst_ReserveTimeFrame=Selector('#timeFrameApproveRes')
        //POM for time frame dropdown over Payment parameter setup

        this.AssureClaims_PaymentParameters_Lst_ReserveSelectTimeFrame=Selector('#timeFrameApproveRes-panel')
        //POM for select time frame over Payment parameter setup

        this.AssureClaims_PaymentParameters_Txt_ReserveDaysHoursForApproval=Selector('#daysToApproveReserves')
        //POM for Days/Hours For Approval text box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_ReserveZeroAsValidValueForEscalation=Selector('#zeroEscalationReserves-input')
        //POM for 0 as Valid value for Escalation check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_ReserveNotifyTheImmediateSupervisor=Selector('#notifySupReserves-input')
        //POM for 0 as Notify The Immediate Supervisor check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_ReserveUseCurrentAdjusterChain=Selector('#useCurrAdjReserves-input')
        //POM for Use Current Adjuster Chain check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_IncurredLimitsAreExceeded=Selector('#useHoldIncurredLimits-input')
        //POM for Incurred Limits are exceeded check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_ReserveDisableEmailToSupervisor=Selector('#disableEmailNotifyForSuperVsr-input')
        //POM for Disable Email To Supervisor check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_ReserveDisableDiaryToSupervisor=Selector('#disableDiaryNotifyForSuperVsr-input')
        //POM for Disable Diary To Supervisor check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentUseCurrentAdjusterChain=Selector('#useCurrentAdjSupervisorChain-input')
        //POM for Use Current Adjuster Chain check box over Payment parameter setup
        
        this.AssureClaims_PaymentParameters_Chk_PaymentAllowGroupOfSupervisorToApprove=Selector('#accessGrpApprove-input')
        //POM for Allow Group of Supervisor to Approve check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentNotifyTheImmediateSupervisor=Selector('#pmtNotifyImmSup-input')
        //POM for Allow Group of Supervisor to Approve check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Txt_PaymentDaysHoursForApproval=Selector('#daysForApproval')
        //POM for Days/Hours For Approval Text box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Lst_PaymentTimeFrame=Selector('#timeFrame')
        //POM for Time Frame Lst over Payment parameter setup

        this.AssureClaims_PaymentParameters_Lst_PaymentSelectTimeFrame=Selector('#timeFrame-panel')
        //POM for Time Frame Lst over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentZeroAsValidValueForEscalation=Selector('#zeroEscalationFunds-input')
        //POM for 0 as Valid value for Escalation check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentCheckLimitsForManualPayments=Selector('#checkUserLimit-input')
        //POM for Check Limits for Manual Payments check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PerClaimPayLimitsExceeded=Selector('#perClaimPayLimitsExceeded-input')
        //POM for Per Claim Pay Limits Exceeded check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PerClaimPerPolicyPayLimitsExceeded=Selector('#perClaimPerPolicyPayLimitsExceeded-input')
        //POM for Per Claim Per Policy Pay Limits Exceeded check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PerClaimPerCoveragePayLimitsExceeded=Selector('#perClaimPerCoveragePayLimitsExceeded-input')
        //POM for Per Claim Per Coverage Pay Limits Exceeded check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PerFinancialKeyPayLimitsExceeded=Selector('#perReserveMaximumPayLimitsExceeded-input')
        //POM for Per Financial Key Pay Limits Exceeded check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentDetailLimitsAreExceeded=Selector('#payDetailLimitExceed-input')
        //POM for Payment Detail Limits Are Exceeded check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PayeeDoesNotExistInSystem=Selector('#payNotExist-input')
        //POM for Check box Payee does Not Exist in System over configuration manager screen

        this.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryToSupervisor=Selector('#diaryToManager-input')
        //POM for Disable Diary To Supervisor check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentDisableEmailToSupervisor=Selector('#disableEmailNotifyForPayment-input')
        //POM for Disable Email To Supervisor check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalDiary=Selector('#enableCRDiary-input')
        //POM for Enable Payment Approval Diary check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentEnablePaymentApprovalEmail=Selector('#enableCREmail-input')
        //POM for Enable Payment Approval Email check box over Payment parameter setup

        this.AssureClaims_PaymentParameters_Chk_PaymentDisableDiaryNotificationForUnapprovedEntity=Selector('#disableDiaryNotifyForUnapprovedEntity-input')
        //POM for Disable Diary Notification for Unapproved Entitycheck box over Payment parameter setup

         this.AssureClaims_PaymentParameters_Chk_NotifyImmediateSupervisor = Selector('#pmtNotifyImmSup-input')
         //POM for Notify Immediate Supervisor over configuration manager screen

        //Muskan's Code : RMA-101853
        this.AssureClaims_PaymentParameters_Chk_CreateWorkLossAndRestrictionRecordsFromFundsFromToDates =Selector('#autoCrtWrkLossRest-input')
        //POM for Create Work Loss and Restriction Records From Funds From/To Dates check box

        this.AssureClaimsApp_PaymentParameters_Chk_UseFNOLReserve = Selector('#fnolReserve-input')
        // POM for use FNOL Reserve CheckBox
        
         this.AssureClaimsApp_PaymentParameters_Chk_PrintEOBStub = Selector('#printEOBStub-input')
        //  POM for Print EOB Stub
        
         this.AssureClaimsApp_PaymentParameters_Chk_PrintEOBChecks = Selector('#printEOBChecks-input')
         //  POM for Print EOB Checks
  
         this.AssureClaimsApp_PaymentParameters_Btn_ConfirmDelee = Selector('#confirm-dialog-confirmbtn')
         
        this.AssureClaimsApp_PaymentParameters_Btn_Add = Selector('[aria-label="Add"]')
        //  POM to Add Record

        this.AssureClaimsApp_PaymentParameters_Txt_DistributionType = Selector('#ctrl_distributionType')
        //  POM to select Distribution Type

        this.AssureClaimsApp_PaymentParameters_Txt_PrintCheckToFileOption = Selector("#ctrl_printOption")
        //  POM to select Print Check To File Option

        this.AssureClaimsApp_PaymentParameters_Btn_SelectGridRow = Selector('#crudCellGrid')
        // POM for select grid and row button
        
        this.AssureClaimsApp_PaymentParameters_Btn_DeleteGridRow = Selector('[aria-label="Delete Grid Row"]')
        //  POM to Delete Grid Row
        
        this.AssureClaimsApp_PaymentParameters_Chk_AllowPostChecks = Selector('#allowPostChecks-input')
        //  POM for allow post check 

        this.AssureClaims_PaymentParameters_Chk_IncludePrefixOnPayments = Selector('#includePrefix-input')
        // POM for checkbox Include prefix on payment

        this.AssureClaims_PaymentParameters_Chk_IncludeSuffixOnPayments = Selector('#includeSuffix-input')
          // POM for checkbox Include suffix on payment
         
    }
};
export default POM_PaymentParameterSetUp;
