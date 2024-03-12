package rmaseleniumPOM_UX;

public class RMA_Selenium_POM_VerificationMessage {
	public static String ExpMessage;
	public static int NumberOfPrimaryWindows = 3;
	public static int NumberOfSecondaryWindows = 4;

	//Message/Frame For GST Is Started Here
	public static String ABNGSTNumberMsg = "ABN/GST Number should be equal to number of digits as set in Utilities";
	public static String PayeeNotGSTRegisteredMsg = "Payee is not GST registered.";

	//Message/Frame For Generic External App Is Started Here
	public static String ExternalAppFrame = "externalapp";
	public static String RecordSaveSuccessfully="Record saved successfully.";
	public static String SaveSuccessfully="Saved Successfully";
	public static String NoRecords="No Records Available.";
	public static String SearchEventFrame = "sevent";
	public static String GenericSearchFrame = "blank";	
	public static String RecentClaimsFrame = "recentclaims";
	public static String SuperFundsProviderFrame = "externalapp";
	public static String SearchDiaryFrame = "blank";

	//Message/Frame For Attachment Screen Is Started Here
	public static String AttchmentFrame = "externalapp";
	public static String AttachmentDeleteConfirmation="Are you sure you want to delete?";
	public static String AttachmentFileUploadMsg="Uploaded Successfully.";
	public static String AttachmentFileUpdatedMsg="Updated Successfully.";
	public static String TransferFileUpdatedMsg="Tranfered Successfully.";
	public static String CopyFileUpdatedMsg="Copied Successfully.";
	public static String MoveFileUpdatedMsg="Moved Successfully.";
	public static String FolderNameValidation ="Please enter folder name to create";
	public static String FolderCreateMessage ="Folder Created Successfully.";
	public static String FolderExistMessage ="Folder already exists.";
	public static String FolderMoveErrorMessage="Please select files you would like to move.";
	public static String FolderDeleteMessage="Folder(s) has been deleted successfully.";
	public static String ExpandLogoutVerification = "You are DISCARDING and closing unsaved screens; including poups!";
	public static String EnhancedNotesSuccessfulSaveAsDraft = "Draft note saved successfully.";
	//Message/Frame For Attachment Screen Is Ended Here

	//Message/Frame For Claim Involvement Screen Is Started Here
	public static String ClaimInvolvement = "externalapp";
	//Message/Frame For Claim Involvement Screen Is Ended Here
	
	//Message/Frame for Catastrophe Screen Is Started
	public static String CatastropheMandatoryFieldMessage="Not all required fields contain the value. Please enter data in all mandatory fields.";
	public static String CatastropheNewRecordMessage="You are working on a new record and this functionality is available for existing records only. Please save the data and try again.";
	public static String CatastropheFrame = "catastrophe";
	//Message/Frame for Catastrophe Screen Is Ended

	//Message/Frame For Comments Notes Screen Is Started Here
	public static String CommentsFrame = "externalapp";
	public static String CommentSummaryFrame = "externalapp";
	//Message/Frame For Comment Notes Screen Is Ended Here

	//Message/Frame For Case Management Screen Is Started Here
	public static String SelectICD910CodeMessage = "Please select the ICD9 or ICD10 Primary Diagnosis.";
	public static String EmptyICD9PrimaryDiagnosisMessage = "Please select a valid ICD 9 code.";
	public static String EmptyICD10PrimaryDiagnosisMessage = "Please select a valid ICD 10 code.";
	public static String EmptyJobClassificationMessage = "Please select the Job Classification under Employment Info.";
	//Message/Frame For Case Management Screen Is Ended Here

	//Message/Frame For My Pending Transactions Screen Is Started Here
	public static String PendingTransactionFrame = "mypendingtransaction";
	//Message/Frame For My Pending Transactions Screen Is Completed Here

	//Message/Frame for PowerView Screen Is Started
	public static String PowerviewSave="Powerview updated successfully. ";
	public static String PowerViewFrame="powerview";
	public static String PowerViewDependentDeleteValidation="Last Name is a system required field can not be removed from the Powerview.";
	public static String PowerViewMandatoryFieldMessage="Not all required fields contain the value. Please enter data in all mandatory fields.";
	public static String PowerViewFrameUI="Utilities";
	public static String PowerViewErrorMessage="The page can not be found in the PowerView.";
    public static String GenSysParaSetupFrame1 = "systemparameter";
    public static String PaymntParaSetupFrame1 = "paymentparameter";
	//Message/Frame for PowerView Screen Is Ended

	//Message/Frame For State Maintenance Screen Is Started Here        
	public static String StateFrame ="state";
	public static String DisabilityPlanMgntFrame = "plan";
	public static String DisabilityPlanMgnSearchtFrame = "splan";
	//Message/Frame For State Maintenance Screen Is Ended Here

	//Message/Frame For SMS Screen Started Here
	public static String SMSFrame = "securitymgtsystem";
	//Message/Frame For SMS Screen Completed Here

	//Message/Frame For Mail Merge Screen Is Started Here
	public static String MailMergeFrame = "externalapp";
	//Message/Frame For Mail Merge Screen Is Completed Here

	//Message/Frame For Diary Screen Is Started Here
	public static String DiaryFrame = "externalapp";
	public static String DiaryListFrame = "diarylist";
	public static String DiarySearchFrame = "sdiary";
	public static String DiaryCompletionMessage = "Diary Completed Successfully.";
	public static String DiaryRoutedMessage = "Diary Routed Successfully.";
	public static String DiaryDeletionMessage = "Diary deleted successfully.";
	public static String DiaryPastDateRollMessage= "Invalid Date. Roll Date must be greater than Creation Date of diary which is";
	public static String DiaryVoidedMessage="Diary Voided successfully.";
	public static String DiarySuccessfulSave = "Saved Successfully";
	public static String PhysicianView = "No View Permission.";
	public static String PropertyView = "No View Permission.";
	public static String PhysicianCreatePermMessage = "No Create Permission";
	public static String DateValidation= "Please enter a valid date greater than or equal to 01/01/1900";
	public static String LicenseDateValidation = "License Issue Date should be less than License Expire Date";
	public static String PropertyMandatoryField="Not all required fields contain the value. Please enter data in all mandatory fields.";
	public static String WPAAutoDiarySetupFrame="WPAAutoDiary";
	public static String DiaryCalendarFrame = "diarycalendar";
	public static String ChangeStyleViewMessage = "Do you want to save this view?";
	public static String QueryDesignerFrame="QueryDesigner";
	//Message/Frame For Diary Screen Is Ended Here

	//Message/Frame For Enhanced Notes Screen Is Started Here
	public static String EnhancedNotesFrame = "externalapp";
	public static String EnahncedNotesDeleteConfirmation="Are you sure you want to delete?";
	public static String EnhancedNotesSuccessfulSave = "Note saved successfully";
	public static String EnhancedNotesSuccessfulDelete = "Note Deleted successfully";
	public static String SelectNoteForAttachMessage = "Please select a Note for attachment.";
	public static String EnhancedNotesEditNotesDraftPopUp = "*Note :- Same Note exist in draft also, You can select option to open note as main note or draft note.";
	public static String DeletePopupWindow = "Are you sure you want to delete?";
	//Message/Frame For Enhanced Notes Screen Is Ended Here

	//Message/Frame For Executive Summary Screen Is Started Here
	public static String ExecutiveSummary = "externalapp";
	//Message/Frame For Executive Summary Screen Is Ended Here

	//Message/Frame For Funds Screen Is Started Here
	public static String TransactionHistoryFrame = "externalapp";
	public static String NegativeNotallowedInScheduleCheckMessage = "The Check Total must be greater than 0.";
	public static String FinancialDetailHistoryFrame = "externalapp";
	public static String DuplicatePaymentVerification = "Above are listed possible duplicate payments. If you would like to save your payment please click Save button otherwise click Cancel and payment will not be saved";
	public static String DepositClearedMessage = "You are working on a new record and this functionality is available for existing records only. Please save the data and try again.";
	public static String ResetDateErrorMessage = "Check To Date should be greater than Check From Date.";
	public static String InvalidZipCodeMessage = "The ZipCode on this Bill is not valid for this Fee Schedule. Please change the ZipCode or the Fee Schedule";
	public static String NoCheckSelectMessage = "No check selected";
	public static String BillDeniedZipCodeMessage = "Bills Cannot be reviewed until a zip code is set on the current record. Please add the zip-code of the payee to the page and try again.";
	public static String TransactionFrame = "transaction";
	public static String VoidCheckMsg = "You are about to apply the same void reason to multiple checks";
	public static String VoidReasonMsg= "Please enter Void Check Reason";
	public static String ConfirmVoidMessageOntransaction="Are you sure you want to Void this transaction?";
	public static String OpenReserveStatusFinancialDetailHistory = "Open Reserve";
	public static String ReserveChangeStatusFinancialDetailHistory = "Reserve Change";
	public static String OpenStatusFinancialDetailHistory = "Open Payment";
	public static String ReleaseStatusFinancialDetailHistory = "Released Payment";
	public static String QueuedPaymentStatus = "Q - Queued Payment";
	public static String ReleasedPaymentStatus = "R - Released";
	public static String QueuedPaymentStatusDesc = "Queued Payment";
	public static String ReleaseStatusFirstAndFinalFinancialFinancialDetailHistory = "Released First & Final Payment";
	public static String HoldStatusFinancialDetailHistory = "Hold Payment";
	public static String HoldStatusFirstAndFinalFinancialDetailHistory = "Hold First & Final Payment";
	public static String PaymentDeniedFinancialDetailHistory="Reviewed But Denied Payment";
	public static String PaymentDeniedFirstAndFinalFinancialDetailHistory="Reviewed But Denied First & Final Payment";
	public static String PaymentOffsetFinancialDetailHistory="Offset Payment";
	public static String PaymentReleasedCheckStatusDesc="Released";
	public static String PaymentReleasedCheckStatus="R Released";
	public static String PaymentPrintedCheckStatus="P Printed";
	public static String ManualDistTypeStatus = "MAL Manual";
	public static String PaymentReleasedCheckStatusCode="R";
	public static String DefaultDistributionType = "RML Regular Mail";
	public static String PaymentHoldCheckStatus="H Hold";
	public static String ExceedPayDetailLimitsOnHold="Payment has been set to Hold and requires supervisory approval because Exceeded Payment Detail Limit .The amount assigned to the reserve type:";
	public static String PayDetailLimitExceedForSupervisoryManager="payment detail limit. It is submitted to";
	public static String PaymentDeniedCheckStatusDesc="Reviewed But Denied";
	public static String PaymentDeniedCheckStatus="RD Reviewed But Denied";
	public static String PaymentDeniedCheckStatusCode="RD";
	public static String PaymentSuccessfulSave="Saved Successfully.";
	public static String BalanceDatesValidationMessage = "Statement Begin Date should be less than or equal to Statement End Date";
	public static String PaymentOnHoldMessage = "A hold requiring supervisory approval has been placed on this payment because Exceeded Per Claim Payment Limit.";
	public static String PreventPaymentAboveLimitsMessage = "Per Claim Payment Limit Exceeds the Limit Amount";
	public static String PaymentDoNotSavePermission="You do not have permission to save a payment of this amount.";
	public static String PaymentDetailDoNotSavePermission="You do not have permission to save this payment.";
	public static String ExceedPerClaimIncurredLimitPaymentMsg = "Transaction cannot be made as Per Claim Incurred Limit is exceeded.";
	public static String ExceedPerClaimIncurredLimitPaymentUpdatedMsg = "A hold requiring supervisory approval has been placed on this payment because Exceeded Per Claim Incurred Limit and requires managerial approval.";
	public static String UnapprovedEntityMsg = "Payee Not Approved and requires managerial approval.";
	public static String TransactionHoldMessage = "Payment has been set to Hold because: A Transaction Type that requires supervisory approval has been chosen.";
	public static String PerClaimPayLimitExceededForSupervisoryManager="per claim pay limit. It is submitted to";
	public static String PerClaimPayAuthorityMessage = "You do not have authority to pay more than";
	public static String PaymentDoNotOffsetAsExceededIncurredLimit="You do not have Per Claim Incurred Limit sufficient to offset this payment.";	
	public static String PaymentOffsetSuccessfull="The offset process completed successfully.";
	public static String PaymentDoNotOffsetPermission="You are not allowed to offset payments.";
	public static String InsufficientReserveWithReserveLimitMsg="Reserve has been placed on hold for supervisory approval due to  Exceeded Reserve Limit. Payment";
	public static String FAFPaymnetWithInsufficientReserveWithReserveLimitMsg="has been put on hold. Payment/collection can not be made against the Reserve of hold Status.";	
	public static String PaymnetWithInsufficientReserveWithDonotNegativeReserveAdjustMsg="There are insufficient reserves for this payment.";	
	public static String ExecutiveSummaryConfigFrame = "execsummconfig";
	public static String ReadyToPrintPopUpMessage = "Are you sure want to mark this transaction as Ready To Print? Click ok to confirm, once saved changes cannot be reversed.";
	public static String AutoCheckInsufficientReserveWithReserveLimitMsg="Reserve has been placed on hold for supervisory approval due to  Exceeded Reserve Limit. Schedule Check can not be made against the Reserve of hold Status.";
	//Message/Frame For Funds Screen Is Ended Here

	//Message/Frame For PolicyDownload Screen Is Started Here
	public static String PolicyDownloadFrame = "externalapp";
	//Message/Frame For PolicyDownload Screen Is Ended Here

	//Message/Frame For Policy System Setup Screen Is Started Here
	public static String PolicySystemSetupFrame = "PolicySystemSetup";
	//Message/Frame For Policy System Setup Screen Is Ended Here

	//Message/Frame For Record Summary Screen Is Started Here
	public static String RecordSummaryFrame = "externalapp";
	//Message/Frame For Record Summary Screen Is Ended Here

	//Message/Frame For Withholding Screen Is Started Here
	public static String WithholdingFrame="externalapp";
	public static String WithholdingSuccessfulSave="Saved Successfully.";
	//Message/Frame For Withholding Screen Is Completed Here

	//Message/Frame For Search Screen Is Started Here
	public static String ClaimSearchFrame = "sclaim";
	public static String SearchFrame = "sclaim";
	public static String PersonInvolvedSearchFrame="blank";
	public static String PersonInvolvedSearchFrame_ERON="blank";
	public static String SearchEntityMaintFrame="entitymaint";
	//Message/Frame For Search Screen Is Ended Here

	//Message/Frame For Maintenance Screen Is Started Here
	public static String MaintenanceEntityFrame = "entities_";
	public static String MaintenanceTableMaintFrame ="tablemaintenance";
	public static String OrgHierarchyFrame = "orghierarchyentity";
	public static String OrgHierarchyRecordFrame = "orghierarchyentities_";
	public static String OrgHierarchyNewRecordFrame = "orghierarchyentities";
	public static String PrivilegeDeleteConfirmation="Are you sure you want to delete?";
	public static String VehicleYear = "Please Enter valid Vehicle Year. Vehicle Year Must be less than or equal to 2030 and greater than or equal to 1900";
	public static String BankingInformationDeleteConfirmation="Are you sure you want to delete?";
	public static String SearchEmployeeFrame="semployees";
	public static String VehicleView = "No View Permission";
	public static String SearchDisabilityPlanFrame="splan";
	public static String PrimaryAddressMessage="A Primary Address already exists.Do you want to mark this address as primary?";
	public static String PrimaryAddressErrorMessage="A Primary Address cannot be deleted. Please uncheck the Primary Address Flag to continue.";
	public static String SearchDriverFrame="sdrivers";
	public static String SearchEntityFrame="sentities";
	//Message/Frame For Maintenance Screen Is Ended Here

	//Message/Frame For Send Mail Screen Is Started Here
	public static String SendMailFrame="externalapp";
	public static String EmailSuccessfulSend="Email send successfully";
	//Message/Frame For Send Mail Screen Is Ended Here

	//Message/Frame for SMS Screen Is Started
	public static String ModuleGroupSave= "Module group saved successfully.";
	public static String ModuleGroupDelete= "Selected item deleted successfully.";
	public static String UserDelete= "Selected item deleted successfully.";
	public static String UserPermission= "User access permissons saved successfully.";
	public static String RenamedModuleGroupNotSelected="Please select a Module Group to rename.";
	public static String ModuleGroupGrant="Module access permission saved successfully.";
	public static String ModuleGroupNotSelected= "Please select Module Security Group node , any module security group or any datasource.";
	public static String ChangeModGroupAssociationMessage="Are you sure you want to change";
	public static String ValidDataBaseConnectionMessage="Database Connection Wizard has successfully connected to the specified database.The Database appears to be a valid RISKMASTER database.";
	public static String InCorrectActivationCodeMessage="You have entered an incorrect code.  Please verify you have entered the code correctly.  Please contact product support if you need assistance.";
	public static String UniqueDBNameValidationMessage=" already exist. Please change datasource name and try again.";
	public static String UnsavedModelPopupCloseWarningMessage="Close database connection wizard and lose any changes?";
	public static String SMSDeleteConfirmation="Are you sure you want to delete the selected item ?";
	public static String AutoCheckView = "No View Permission.Please contact your system Administrator to enable the permission in SMS under RISKMASTER--> Funds Management--> Automatic Checks";
	
	//Message/Frame for SMS Screen Is Ended

	//Message/Frame for Utilities Screen Is Started
	public static String UtilitiesFrame = "utilities";
	public static String FinancialKeySetupFrame = "FinancialKeySetup";
	public static String TimeExpenseRateTableFrame = "rate-tables";
	public static String TaskManagerScheduledTaskFrame="TMScheduledView";
	public static String TMJobsViewFrame="TMView";
	public static String SupplementalDatal="SupplementalData"; 
	public static String AdministrativeTrackingFrame = "AdministrativeTracking";
	public static String ControlRequestFrame = "ControlRequest";
	public static String CanvasImagesFrame = "CanvasImages";	
	//Message/Frame for Utilities Screen Is Ended

	//Message/Frame for Occurrence Parameter Set Up Screen Is Started
	public static String OccuParamSetupFrame = "OccurrenceParameterSetup";		
	//Message/Frame for Occurrence Parameter Set Up Screen Is Ended

	//Message/Frame for General System Parameter Set Up Screen Is Started
	public static String GenSysParaSetupFrame = "GeneralSystemParameterSetup";
	public static String EnahncedNotesEstimatedHoursMsg = "You can enter the value for estimated hours from 0 to 1000.";
	//Message/Frame for General System Parameter Set Up Screen Is Ended	

	//Message/Frame for Payment Parameter Set Up Screen Is Started
	public static String PaymntParaSetupFrame = "PaymentParameterSetup";
	//Message/Frame for Payment Parameter Set Up Screen Is Ended

	//Message/Frame for LOB Parameter Set Up Screen Is Started
	public static String LOBParameterFrame = "LOBParameters" ;
	//Message/Frame for LOB Parameter Set Up Screen Is Ended

	//Message/Frame for Combined Payment Screen Is Started
	public static String CombinedPaymentSetupFrame = "combinedpayment";
	public static String CustomNotiFrame ="custompaymentnotification";
	//Message/Frame for Combined Payment Screen Is Completed

	//Message/Frame For Time And Expense SetUp Screen Is Started
	public static String ClaimRateTableselectMessage = "Please select Claim rate table to proceed.";
	public static String MultipleVoidMessage = "Select one bill at a time to void";
	public static String MultipleGoToFundsTEReportMessage = "Select only one invoice at a time";
	public static String SelectInvoiceToBillMessage = "Please select bill to Bill It";
	public static String SelectInvoiceToVoidItMessage = "Please select  bill  to void";
	public static String SelectInvoiceForGoToFundsMessage = "Please select an Invoice.";
	public static String UnequalInvoiceAmountMessage = "Invoice Amounts Are not Equal to the sum of Invoice Amounts of Invoice Details.";
	public static String VoidTETransactionMessage = "Do you want to void this bill?";
	public static String TotalAmountCantBeZeroMessage = "Invalid without calculation of Total.";
	public static String NoTnEOnRecoveryReserveMessage = "Only collections are allowed on Recovery Reserves.";
	//Message/Frame For Time And Expense SetUp Screen Is Completed

	//Message/Frame for Reserve WorkSheet Screen Is Started
	public static String ReserveWorkSheetCustomizationFrame = "RSWCustomization" ;
	public static String ExistingPendingMessage = "You already have Reserve worksheet with";
	public static String ReserveWorksheetApprovedMessage = "Approved Successfully.";
	public static String RWSAlreadyApprovedMessage = "A Reserve Worksheet with the status Approved can not be approved.";
	public static String ApprovedCannotBeSubmitMessage = "A Reserve Worksheet with the status Approved can not be submitted."; 
	public static String PendingCannotBeRejectedMessage = "can only be rejected.";
	public static String ApprovedCannotBeRejectMessage = "A Reserve Worksheet with the status Approved can not be rejected.";
	public static String DeleteWorksheetMessage = "The record has been successfully deleted!";
	public static String RWSClosedClaimMessage = "ReserveWorksheet can not be created for Closed Claim";
	public static String WorksheetSubmittedMessage = "Submitted Successfully.";
	public static String WorkSheetAlreadySubmittedMessage = "A Reserve Worksheet has already been submitted";
	public static String PendAppWSCantClearMessage = "Cannot Clear Data when the Worksheet status is Pending Approval.";
	public static String PendAppWCantCreateNewMessage = "Please approve or delete it, before creating New worksheet.";
	public static String RejectedWCantCreateNewMessage = "Please approve or delete it, before creating New worksheet.";
	public static String WorksheetRejectMessage = "Rejected Successfully.";
	public static String RejectedWSCantSubmitted = "A Reserve Worksheet with the status Rejected can not be submitted.";
	public static String NewWSCantSubmitted = "A Reserve Worksheet with the status New can not be submitted.";
	public static String RejectedCantBeApprovedMessage = "A Reserve Worksheet with the status Rejected can not be approved.";
	public static String ApprovedRWSCannotBeClearMessage = "Cannot Clear Data when the Worksheet status is Approved.";
	public static String WorksheetSubmitToManagerMessage = "The worksheet is being sent to your supervisor for approval as Exceeded Reserve Limit.";
	public static String WorksheetSentForApprovalCantbeApprovedMessage = "You do not have the authority to approve this worksheet as Exceeded Reserve Limit";
	public static String WorksheetSentForApprovalCantbeRejectedMessage = "You do not have the authority to reject this worksheet.";
	public static String PendingWorksheetFrame = "mypendingreserveworksheet";
	public static String WithoutReasonRejectMessage = "Please select a Reject Reason Code.";
	public static String RWSExceededLimitMessage = "for approval as Exceeded Reserve Limit";
	public static String PreventSavingZeroAmountInRWSMessage = "No reserve amounts have been entered or reserves have not changed as compared to existing reserves for all reserve categories. This reserve worksheet cannot be saved.";
	public static String PreventApprovingZeroamountInRWSMessage = "No reserve amounts have been entered or reserves have not changed in this worksheet as compared to existing reserves for all reserve categories. This worksheet cannot be approved.";
	//Message/Frame for Reserve WorkSheet Screen Is Ended	

	//Message/Frame for Maintenance-->People Screen Is Started
	public static String MaintenancePeopleFrame = "People";
	//Message/Frame for Maintenance-->People Screen Is Completed

	//Message/Frame for Bank Account Screen Is Started
	public static String BankAccountFrame = "bankaccount" ;
	public static String BankAccountDepositClearedMsg = "Are you sure you wish to mark this deposit as cleared?";
	public static String BankAccountDepositVoidMsg = "Are you sure you wish to void this deposit?";
	//Message/Frame for Bank Account Screen Is Completed

	//Message/Frame for User Privileges Set Up Screen Is Started
	public static String UserPriviSetUpFrame = "userprivileges" ;
	public static String UsrPrvEnablePaymntLmtMsg = "Are you sure you wish to change the Enable Payment Limits Option?";
	//Message/Frame for User Privileges Set Up Screen Is Completed

	//Message/Frame for Queued Payment Is Started
	public static String QueuedPaymentExceedsUserLmtMsg = "The amount of this payment exceeds";
	public static String QueuedPaymentPayeeNotApprovedMsg1 = "Payment has been queued and requires supervisory approval because";  
	public static String QueuedPaymentPayeeNotApprovedMsg2 = "of this payment has not been approved and requires managerial approval.";
	//Message/Frame for Queued Payment Is Ended

	public static String ReserveTypeForLOBParameterSetup = "Please specify atleast one reserve type.";
	public static String CodeSelectioneForReserveOnLOBParameterSetup = "C Compensation is already configured for Incurred Balance Calculations.";
	public static String CodeSelectioneForIncurredOnLOBParameterSetup = "A Adjusting is already configured for Reserve Balance Calculations.";
	public static String CodeSelectionFrame ="Code Selection";
	//Reserve Incurred Option On Line Of Business Parameter Setup Page

	//Message/Frame For Claim Summary Summary Screen Is Started Here
	public static String ClaimReserveSummaryFrame = "externalapp";
	//Message/Frame For Claim Summary Screen Is Ended Here

	//Message/Frame For Print Screen Is Started Here
	public static String PrintCheckConfirmation = "There are payments to sub bank accounts with insufficient funds. Do you wish to print checks from the accounts that have sufficient funds?";
	public static String PrintSingleChecks = "externalapp";
	public static String EFTFilePrintMessage = "The EFT File has been successfully created.";
	public static String ChecksAndEOBReportsMsg = "The Following Check and EOB reports are attached with this check Batch:";
	public static String CheckPrintedVerificationMsg = "You have printed checks";
	public static String FundsPrintChecks = "printchecks";
	public static String FundsPrintCheckFrame = "printcheck" ;
	public static String ExceedPrintCheckLimitsOnHold="";
	public static String PrintCheckToFileConfirmationMsg = "Checks printed to the file successfully.";
	public static String CheckPrintedConfirmationMsg1 = "to record all of checks as having printed successfully.";
	public static String CheckPrintedConfirmationMsg2 ="if check printing did not print all checks correctly.";
	public static String PreCheckConfirmationMsg = "Do you wish to go ahead and mark all checks in this report as being eligible to print?";
	public static String PrintSingleCheckFrame = "externalapp";
	public static String InsufficientFundsMsg = "The following payments will not be printed due to insufficient funds.";
	public static String EFTFileMsg = "The EFT File has been successfully created.";
	public static String ChecksAndEOBReportsMsgForClonePrintCheck = "Checks and EOB reports are printed sucessfully.";
	//Message/Frame For Print Screen Is Ended Here

	//Message/Frame For Bank Account Deposit Screen Is Started Here
	public static String DepositFrame = "Deposit";
	//Message/Frame For Bank Account Deposit Screen Is Ended Here

	//Message/Frame For Claim Activity Log Screen Is Started Here
	public static String ClaimActivityLogFrame = "externalapp";
	//Message/Frame For Claim Activity Log Screen Is Ended Here

	//Message/Frame For Quick Summary Screen Is Started Here
	public static String quickSummaryFarme ="quickSummary";
	//Message/Frame For Quick Summary Screen Is Ended Here

	//Message/Frame For Maintenance Screen Is Started Here
	public static String EmployeeFrame = "employees";
	public static String MedicalStaffFrame = "staffs";
	public static String PatientFrame = "patients";
	public static String DriverFrame = "driver";
	public static String EntityFrame = "entities";
	public static String PhysicianFrame = "physicians";
	public static String PeopleFrame = "people";
	public static String VehicleFrame = "vehicles";
	public static String PolicyFrame = "policy";
	public static String PolicySearchFrame ="blank";
	public static String SearchStaffFrame="sstaff"; 
	public static String PropertyFrame="propertyunits";
	public static String AdminTrackingFrame="admintrackinglist";
	public static String LeaveManagementFrame="leaveplan";
	public static String UIEmployeeFrame="Maintenance";
	public static String LeavePlanMngeFrame="leaveplan";
	public static String PlanManagementFrame="plan";
	public static String AdminTrackNoInputFieldMessage = "Selected Admin tracking table does not have any input field.";
	//Message/Frame For Maintenance Screen Is Ended Here

	//Message/Frame For Claim Screen Is Started Here
	public static String GeneralClaimFrame = "claimgc";
	public static String WCClaimFrame = "claimwc";
	public static String PropertyClaimFrame = "claimpc";
	public static String VehicleClaimFrame = "claimva";
	public static String NonOccClaimFrame = "claimdi";
	public static String ClaimLimitOnCreateMessage="Configured User Limit prevents saving claims of type";
	public static String ClaimLimitOnAccessMessage="Configured User Limit prevents access to claims of type";
	public static String EventLimitOnCreateMessage="Configured User Limit prevents saving events of type";
	public static String EventLimitOnAccessMessage="Configured User Limit prevents access to events of type";

	//Message/Frame For Claim Screen Is Ended Here

	//Message/Frame For Property Claim Screen Is Started Here
	public static String PrportyIdSearchFrame = "blank";		
	//Message/Frame For Property Claim Screen Is Ended Here

	//Message/Frame For Payment Screen Is Started Here
	public static String FirstAndFinalPaymentMessage = "You are about to make a First & Final Transaction since no reserve is selected. Reserves will be created automatically. Do you want to continue?";
	public static String PaymntScreenClearedPaymntMsg = "Are you sure you want to Clear this check?";// A check once cleared can not be voided.";
	public static String CollAddDepositMsg = "Adding a Deposit Number will cause the system to automatically save the transaction with a status of Printed. Do you want to save the Deposit Number Now?";
	public static String ClaimScreenPaymntFrozenMsg = "Change in selection of Payment Frozen checkbox will save this claim. Do you want to save the changes?";
	public static String PaymntScreenPaymntFrozenMsg = "The claim has its payment frozen. No further payments may be made until it is unfrozen.";
	public static String ExpectedInsufficientReserveMessageOnCreatingpayment = "There are insufficient reserves for this payment.";
	public static String ExpectedCheckVoidMsg = "Are you sure you want to Void this transaction?";
	public static String AutoCloseTransTypeMsg = "The Transaction Type Auto Bodily Injury is set as 'Auto Close' type.";
	public static String CheckNumberStatusMessageForPrint ="Adding a Check Number will cause the system to automatically save the transaction with a check status of Printed. Do you want to save the Check Number Now?";
	public static String CheckLimitMessageWhilePrintTransaction ="Payment can not be set to printed because the amount exceeds the amount you are authorized to print.";
	public static String ExpectedWithholdingCheckClearedMsg = "Above listed payment is withholding transaction corresponding to this transaction. If you would like to clear this transaction associated withholding transaction will also be cleared,please click Save button to clear both transactions otherwise click Cancel,No transactions will be cleared.";
	public static String ExpectedWithholdingCheckVoidMsg = "Above listed payment is withholding transaction corresponding to this transaction. If you would like to void this transaction associated withholding transaction will also be voided,please click Save button to void both transactions otherwise click Cancel,No transactions will be voided.";
	public static String WithholdManualPrintSaveMessage = "Payment amount is going to be reduced due to withholding.";
	//Message/Frame For Payment Screen Is Ended Here

	//Message/Frame For Web Links Setup Screen Is Started Here
	public static String WebLinksSetup = "Web Links Setup";
	//Message/Frame For Web Links Setup Screen Is Ended Here


	//Message/Frame For Re-Create Check Screen Is Started Here
	public static String ReCreateCheckFrame = "Re-Create Check File";
	public static String ReCreateCheckFileMsg = "Checks Re-printed to the file successfully.";
	//Message/Frame For Re-Create Check Screen Is Ended Here

	//Message/Frame For Bulk Check Release Screen Is Started Here
	public static String BulkCheckReleaseFrame = "bulkcheckrelease";
	public static String BulkCheckReleaseMsg = "The following payments have been Released/Printed and the Reserves have been updated";
	public static String PaymentsProcessedMsg = "Payments processed successfully.";
	//Message/Frame For Bulk Check Release Screen Is Ended Here

	//Message/Frame For Mark Checks As Cleared Screen Is Started Here
	public static String MarkChecksAsClearedMsg = "Zero checks meet your selection criteria. There are no checks to display.";
	public static String MarkCheckAsClearedFrame = "MarkChecksCleared";
	//Message/Frame For Mark Checks As Cleared Screen Is Ended Here

	//Message/Frame For Reset Printed Check Screen Is Started Here
	public static String ResetPrintedCheckFrame = "resetchecks";
	//Message/Frame For Reset Printed Check Screen Is Ended Here

	//Message/Frame For Un Clear Check Screen Is Started Here
	public static String UnClearCheckFrame = "unclearchecks";
	//Message/Frame For Un Clear Check Screen Is Ended Here

	//Message/Frame For Void Checks Screen Is Started Here
	public static String VoidCheckFrame = "voidchecks";
	//Message/Frame For Void Checks Screen Is Ended Here

	//Message/Frame For Schedule Automatic Check Screen Is Started Here
	public static String ScheduleAutomaticCheck = "externalapp";
	//Message/Frame For Schedule Automatic Check Screen Is Ended Here

	//Message/Frame For Custom Payment Screen Is Started Here
	public static String CustomPaymentNotificationFrame = "CustomPaymentNotification";
	//Message/Frame For Custom Payment Screen Is Ended Here

	//Message/Frame for Maintenance-->Physician-->Contracts Screen Is Started
	public static String ContractRedToastMsg = "When choosing to apply discount to State WC Fee Schedule Type you must choose either a fee schedule or a state.";
	public static String DateOverlapMsg = "The period between the contract Start Date and End Date overlaps with the period from an existing contract for this entity.";
	//Message/Frame for Maintenance-->Physician-->Contracts Screen Is Completed

	//Message/Frame For Customization Settings Screen Is Started Here
	public static String NavigationTreeSettingsFrame = "Navigation Tree Settings";
	//Message/Frame For Customization Settings Screen Is Ended Here

	//Message/Frame For Reserve Screen Is Started Here
	public static String ReseAmntNotLessPaid= "The reserve amount can not be set Less than the paid amount.";
	public static String ExpectedErrorMessageOnSavingAZeroAmountReserve = "The Reserve amount should be greater than 0. Do you really want to modify this reserve to 0?";
	public static String ExpectedErrorMessageOnCreatedBackDatedReserve = "The Prevent Back Dating of Reserves Flag is True";
	public static String ExceedReserveLimitsOnHold = "This reserve has been sent for the Supervisor approval and is in the Hold status as Exceeded Reserve Limit";
	public static String ExceedPaymentLimitsOnHold = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";
	public static String ExceedPerClaimIncurredLimitsOnHold = "This reserve has been sent for the Supervisor approval and is in the Hold status as Exceeded Per Claim Incurred Limit";
	public static String ErrorMessageWhenIncurredLimitExceededSettingIsOFF = "You do not have permission to set the reserve of this amount as Per Claim Incurred Limit is exceeded.";
	public static String ErrorMessageWhenRerserveLimitExceededSettingIsOFF = "You do not have permission to set the reserve of this amount.";

	//Message/Frame For Reserve Screen Is Ended Here

	//Message/Frame For Supervisory Approval Screen Is Started Here
	public static String SupervisoryApprovalFrame= "trans";
	public static String ReserveLimitExceedForSupervisoryManager="reserve limit. It is submitted to User";
	public static String RejectReserveBySupervisoryManager="Reserve(s) rejected successfully.";
	public static String ApproveReserveBySupervisoryManager="Reserve(s) approved successfully.";
	public static String ApprovePaymentBySupervisoryManager= "Payment(s) approved successfully.";
	public static String RejectPaymentBySupervisoryManager="Payment(s) voided successfully.";
	public static String PaymentLimitExceedForSupervisoryManager = "payment limit. It is submitted to User";
	public static String PerClaimIncurredLimitExceedForSupervisoryManager="incurred limit. It is submitted to User";
	public static String PerClaimPayLimitExceedForSupervisoryManager = "per claim pay limit. It is submitted to User";
	public static String PayeeNotApprovedMsg = "Payee not approved";
	public static String ReserveAndPerClaimIncurredLimitExceedForSupervisoryManager = "reserve limit and incurred limit. It is submitted to User";

	//Message/Frame For Supervisory Approval Is Ended Here	

	// ========================New MK Varailble Started here==========================
	public  static String WorkLossSameRtrnToWorkDate = " Return To Work Date can not be the same for any two work loss periods (blank) is not acceptable.";
	public static String RestrictedSameFirstDayRestricted = " Last Restricted Date can not be the same for any two restriction periods (blank) is not acceptable.";
	public static String ExpectedNewCaseManagementBCT = "Case Management (New)";
	public static String ExpectedNewCaseManagerBCT = "Case Manager (New)";
	public static String ExpectedNewCaseManagerNoteExpectedBCT = "Case Manager Note (New)";
	public static String ExpectedNewVocationalRehabExpectedBCT = "Vocational Rehabilitation (New)";
	public static String ExpectedNewAccommodationBCT = "Accommodation (New)";
	public static String ExpectedNewTreatmentPlanBCT = "Treatment Plan / Utilization Review (New)";
	public static String ExpectedNewMedMngmntSavingsBCT = "Medical Management Savings (New)";
	public static String ExpectedNewMedicalCertificateBCT = "Medical Certificate (New)";
	public static String ExpectedNewWorkLossBCT = "Employee Involved Work Loss (New)";
	public static String ExpectedNewRestrictionBCT = "Employee Involved Restriction (New)";
	// ========================New MK Varailble Completed here==========================


	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Msg_Delete
	//Description  			: To Fetch Unique Message On The Basis Of Delete Message String On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static String RMAApp_Generic_Msg_Delete()
	{
		ExpMessage = null;
		ExpMessage = "Are you sure you want to delete?"; //Unique Delete Message On RMA Application Page Is Fetched
		return ExpMessage;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_Unsaved_Data_VerificationOnScreen
	//Description  			: To Fetch Unique Message On The Basis Of Unsaved Data Verification On Screen Message String On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	//============================================================================================
	public static String RMAApp_Unsaved_Data_VerificationOnScreen()
	{
		ExpMessage = null;
		ExpMessage = "Data has been changed. Are you sure want to move?";; //Unique Unsaved Data Verification On Screen Message On RMA Application Page Is Fetched
		return ExpMessage;
	}	


}
