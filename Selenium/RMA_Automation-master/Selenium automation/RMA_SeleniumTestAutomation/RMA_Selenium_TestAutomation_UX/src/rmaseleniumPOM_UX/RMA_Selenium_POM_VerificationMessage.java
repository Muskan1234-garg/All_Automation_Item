package rmaseleniumPOM_UX;

public class RMA_Selenium_POM_VerificationMessage {
	public static String ExpMessage;
	public static int NumberOfPrimaryWindows = 3;
	public static int NumberOfSecondaryWindows = 4;

	//Message/Frame For Attachment Screen Is Started Here
	public static String AttchmentFrame = "externalapp";
	public static String AttachmentDeleteConfirmation="Are you sure you want to delete?";
	public static String AttachmentFileUploadMsg="Uploaded Successfully.";
	public static String AttachmentFileUpdatedMsg="Updated Successfully.";
	//Message/Frame For Attachment Screen Is Ended Here

	//Message/Frame For Claim Involvement Screen Is Started Here
	public static String ClaimInvolvement = "externalapp";
	//Message/Frame For Claim Involvement Screen Is Ended Here

	//Message/Frame For Comments Notes Screen Is Started Here
	public static String CommentsFrame = "externalapp";
	public static String CommentSummaryFrame = "externalapp";
	//Message/Frame For Comment Notes Screen Is Ended Here

	//Message/Frame for PowerView Screen Is Started
	public static String PowerviewSave="Powerview updated successfully. ";
	public static String PowerViewFrame="powerview";
	public static String PowerViewDependentDeleteValidation="Last Name is a system required field can not be removed from the Powerview.";
	public static String PowerViewMandatoryFieldMessage="Not all required fields contain the value. Please enter data in all mandatory fields.";
	public static String PowerViewFrameUI="Utilities";
	//Message/Frame for PowerView Screen Is Ended

	//Message/Frame For Diary Screen Is Started Here
	public static String DiaryFrame = "externalapp";
	public static String DiaryListFrame = "diarylist";
	public static String DiaryCompletionMessage = "Diary Completed Successfully.";
	public static String DiaryRoutedMessage = "Diary Routed Successfully.";
	public static String DiaryDeletionMessage = "Diary deleted successfully.";
	public static String DiaryPastDateRollMessage= "Invalid Date. Roll Date must be greater than Creation Date of diary which is";
	public static String DiaryVoidedMessage="Diary Voided successfully.";
	public static String DiarySuccessfulSave = "Saved Successfully";
	//Message/Frame For Diary Screen Is Ended Here

	//Message/Frame For Enhanced Notes Screen Is Started Here
	public static String EnhancedNotesFrame = "externalapp";
	public static String EnahncedNotesDeleteConfirmation="Are you sure you want to delete?";
	public static String EnhancedNotesSuccessfulSave = "Note saved successfully";
	public static String EnhancedNotesSuccessfulDelete = "Note Deleted successfully";
	//Message/Frame For Enhanced Notes Screen Is Ended Here

	//Message/Frame For Executive Summary Screen Is Started Here
	public static String ExecutiveSummary = "externalapp";
	//Message/Frame For Executive Summary Screen Is Ended Here

	//Message/Frame For Funds Screen Is Started Here
	public static String TransactionHistoryFrame = "externalapp";
	public static String DuplicatePaymentVerification = "Above are listed possible duplicate payments. If you would like to save your payment please click Save button otherwise click Cancel and payment will not be saved";
	//Message/Frame For Funds Screen Is Ended Here

	//Message/Frame For PolicyDownload Screen Is Started Here
	public static String PolicyDownloadFrame = "externalapp";
	//Message/Frame For PolicyDownload Screen Is Ended Here

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
	public static String PersonInvolvedSearchFrame="externalapp";
	//Message/Frame For Search Screen Is Ended Here

	//Message/Frame For Maintenance Screen Is Started Here
	public static String MaintenanceEntityFrame = "Entity";
	public static String OrgHierarchyFrame = "orghierarchyentity";
	public static String OrgHierarchyRecordFrame = "orghierarchyentities_2";
	public static String OrgHierarchyNewRecordFrame = "orghierarchyentities";
	public static String PrivilegeDeleteConfirmation="Are you sure you want to delete?";
	public static String VehicleYear = "Please Enter valid Vehicle Year. Vehicle Year Must be less than or equal to 2028 and greater than or equal to 1900";
	public static String BankingInformationDeleteConfirmation="Are you sure you want to delete?";
	public static String SearchEmployeeFrame="semployees";
	public static String VehicleView = "(No View Permission).";
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
	//Message/Frame for SMS Screen Is Ended

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
	//Message/Frame for Combined Payment Screen Is Completed

	//Message/Frame for Maintenance-->People Screen Is Started
	public static String MaintenancePeopleFrame = "People";
	//Message/Frame for Maintenance-->People Screen Is Completed

	//Message/Frame for Bank Account Screen Is Started
	public static String BankAccountFrame = "bankaccount" ;
	public static String BankAccountDepositClearedMsg = "Are you sure you wish to mark this deposit as cleared?";
	public static String BankAccountDepositVoidMsg = "Are you sure you wish to void this deposit?";
	//Message/Frame for Bank Account Screen Is Completed

	//Message/Frame for User Privileges Set Up Screen Is Started
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
	public static String ChecksAndEOBReportsMsg = "The Following Check and EOB reports are attached with this check Batch:";
	public static String CheckPrintedVerificationMsg = "You have printed checks";
	public static String FundsPrintChecks = "printchecks";
	public static String FundsPrintCheckFrame = "printcheck" ;
	public static String PrintCheckToFileConfirmationMsg = "Checks printed to the file successfully.";
	public static String CheckPrintedConfirmationMsg1 = "to record all of checks as having printed successfully.";
	public static String CheckPrintedConfirmationMsg2 ="if check printing did not print all checks correctly.";
	public static String PreCheckConfirmationMsg = "Do you wish to go ahead and mark all checks in this report as being eligible to print?";
	public static String PrintSingleCheckFrame = "externalapp";
	public static String InsufficientFundsMsg = "The following payments will not be printed due to insufficient funds.";
	public static String EFTFileMsg = "The EFT File has been successfully created.";
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
	public static String PropertyFrame="propertyunits";
	public static String AdminTrackingFrame="admintrackinglist";
	public static String LeaveManagementFrame="Leave Plan Management";
	public static String UIEmployeeFrame="Maintenance";
	//Message/Frame For Maintenance Screen Is Ended Here

	//Message/Frame For Claim Screen Is Started Here
	public static String GeneralClaimFrame = "claimgc";
	public static String WCClaimFrame = "claimwc";
	public static String PropertyClaimFrame = "claimpc";	
	//Message/Frame For Claim Screen Is Ended Here

	//Message/Frame For Property Claim Screen Is Started Here
	public static String PrportyIdSearchFrame = "blank";		
	//Message/Frame For Property Claim Screen Is Ended Here

	//Message/Frame For Payment Screen Is Started Here
	public static String FirstAndFinalPaymentMessage = "You are about to make a First & Final Transaction since no reserve is selected. Reserves will be created automatically. Do you want to continue?";
	public static String PaymntScreenClearedPaymntMsg = "Are you sure you want to Clear this check? A check once cleared can not be voided.";
	public static String CollAddDepositMsg = "Adding a Deposit Number will cause the system to automatically save the transaction with a status of Printed. Do you want to save the Deposit Number Now?";
	public static String ClaimScreenPaymntFrozenMsg = "Change in selection of Payment Frozen checkbox will save this claim. Do you want to save the changes?";
	public static String PaymntScreenPaymntFrozenMsg = "The claim has its payment frozen. No further payments may be made until it is unfrozen.";
	public static String ExpectedInsufficientReserveMessageOnCreatingpayment = "There are insufficient reserves for this payment.";
	public static String ExpectedCheckVoidMsg = "Are you sure you want to Void this transaction?";
	public static String AutoCloseTransTypeMsg = "The Transaction Type Auto Bodily Injury is set as 'Auto Close' type.";
	//Message/Frame For Payment Screen Is Ended Here

	//Message/Frame For Web Links Setup Screen Is Started Here
	public static String WebLinksSetup = "Web Links Setup";
	//Message/Frame For Web Links Setup Screen Is Ended Here


	//Message/Frame For Re-Create Check Screen Is Started Here
	public static String ReCreateCheckFrame = "Re-Create Check File";
	public static String ReCreateCheckFileMsg = "Re-printed to the file successfully.";
	//Message/Frame For Re-Create Check Screen Is Ended Here

	//Message/Frame For Bulk Check Release Screen Is Started Here
	public static String BulkCheckReleaseFrame = "Bulk Check Release";
	public static String BulkCheckReleaseMsg = "The following payments have been Released/Printed and the Reserves have been updated";
	public static String PaymentsProcessedMsg = "Payments processed successfully.";
	//Message/Frame For Bulk Check Release Screen Is Ended Here

	//Message/Frame For Mark Checks As Cleared Screen Is Started Here
	public static String MarkChecksAsClearedMsg = "Zero checks meet your selection criteria. There are no checks to display.";
	public static String MarkCheckAsClearedFrame = "MarkChecksCleared";
	//Message/Frame For Mark Checks As Cleared Screen Is Ended Here

	//Message/Frame For Reset Printed Check Screen Is Started Here
	public static String ResetPrintedCheckFrame = "Reset Printed Check";
	//Message/Frame For Reset Printed Check Screen Is Ended Here

	//Message/Frame For Un Clear Check Screen Is Started Here
	public static String UnClearCheckFrame = "Un-Clear Checks";
	//Message/Frame For Un Clear Check Screen Is Ended Here

	//Message/Frame For Void Checks Screen Is Started Here
	public static String VoidCheckFrame = "Void Checks";
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
	//Message/Frame For Reserve Screen Is Ended Here

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
