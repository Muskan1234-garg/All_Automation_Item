package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PaymentParameterSetUp {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Lst_DupCriteriaSelect
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Allow Duplicate Payment Criteria List Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-07-10-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Lst_DupCriteriaSelect(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DupCriteria")); 
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentParameterOptions_Txt_Number_Of_Days
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Number Of Days Text Box On Payment Parameter Options  On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - Nidhijha-07-19-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PaymentParameterOptions_Txt_Number_Of_Days(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtHowMany']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowDuplicatePaymentChecking
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Allow Duplicate Payment Checkings CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowDuplicatePaymentChecking(WebDriver driver)
	{
		Element = driver.findElement(By.id("DupPayCheck")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentParameterOptions_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supervisor Approval Configuration Tab On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentParameterOptions_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("Button1")); //Unique Id Of Supervisor Approval Configuration Tab On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_QueuePaymentInsteadOFPlacingOnHold
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Queue Payments Instead Of Placing On Hold Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_QueuePaymentInsteadOFPlacingOnHold(WebDriver driver)
	{
		Element = driver.findElement(By.id("QueuePayment")); //Unique Id Of Queue Payments Instead Of Placing On Hold Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsOnCheckStub
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print EOB Detail On Check Stub Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsOnCheckStub(WebDriver driver)
	{
		Element = driver.findElement(By.id("PrintEOBStub")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PrintRollUpChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Roll Up Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-22-2017                                
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PrintRollUpChecks(WebDriver driver)
	{
		Element = driver.findElement(By.id("RollUpChecks")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Lst_PrintChecksToFile
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Checks To File Options List On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-22-2017                                
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Lst_PrintChecksToFile(WebDriver driver)
	{
		Element = driver.findElement(By.id("ddlPrintOptions")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsWithChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print EOBs With Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsWithChecks(WebDriver driver)
	{
		Element = driver.findElement(By.id("PrintEOBChecks")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PaymentParameterOptions_Txt_MaxNumOfAutoChecksperBatch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Max Number Of AutoChecks per Batch Text Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-04-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_PaymentParameterOptions_Txt_MaxNumOfAutoChecksperBatch(WebDriver driver)
	{
		Element = driver.findElement(By.id("MaxAutoChecksBatch")); //Unique Id Of Supervisor Approval Configuration Tab On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowPostDataChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Post Date Of Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowPostDataChecks(WebDriver driver)
	{
		Element = driver.findElement(By.id("AllowPostChecks")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Claim Pay Limits Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded(WebDriver driver)
	{
		Element = driver.findElement(By.id("PerClaimPayLimitsExceeded")); //Unique Id Of Per Claim Pay Limits Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_IncludeSuffixOnPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Include Suffix On Payments CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-24-2017                                 
	//============================================================================================
	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_IncludeSuffixOnPayments(WebDriver driver)
	{
		Element = driver.findElement(By.id("IncludeSuffix")); 
		return Element;
	}
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supervisor Approval Configuration Tab On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
	//	// ============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("LINKTABSSupervisorApproval")); //Unique Id Of Supervisor Approval Configuration Tab On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PayLimitExceed")); //Unique Id Of Payment Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_SpecTranTypeCodes
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Specific Transaction Type Codes Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_SpecTranTypeCodes(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("SpecTranTypeCodes")); //Unique Id Of Specific Transaction Type Codes Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Detail Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PayDetailLimitExceed")); //Unique Id Of Payment Detail Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayeeNotExist
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Does Not Exist In System Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PayeeNotExist(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PayNotExist")); //Unique Id Of Payee Does Not Exist In System Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Claim Pay Limits Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PerClaimPayLimitsExceeded")); //Unique Id Of Per Claim Pay Limits Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_QueuePayment
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Queue Payments Instead Of Placing On Hold Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_QueuePayment(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("QueuePayment")); //Unique Id Of Queue Payments Instead Of Placing On Hold Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SupervisoryApproval Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("SupervisoryApproval")); //Unique Id Of SupervisoryApproval Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApprove
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow The Group Of SuperVisor To Approve Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApprove(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("AccessGrpApprove")); //Unique Id Of Allow The Group Of SuperVisor To Approve Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Lst_TimeFrame
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time Frame List Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Lst_TimeFrame(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("TimeInterval")); //Unique Id Of Time Frame List Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Txt_DaysHrsApproval
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days/Hours For Approvals Of Checks On Hold Text Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Txt_DaysHrsApproval(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DaysApproval")); //Unique Id Of Days/Hours For Approvals Of Checks On Hold Text Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationValue
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days/Hours For Approvals Of Checks On Hold Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationValue(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("ZeroEscalationFunds")); //Unique Id Of Consider Zero As Valid Value For Escalation Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notify The Immediate Supervisor Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PmtNotfyImmSup")); //Unique Id Of Notify The Immediate Supervisor Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotify
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Diary Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotify(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DiaryToManager")); //Unique Id Of Disable Diary Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotify
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Email Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotify(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DisableEmailNotifyForPayment")); //Unique Id Of Disable Email Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Payment Approval Diary Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("EnableCRDiary")); //Unique Id Of Enable Payment Approval Diary Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Payment Approval Email Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("EnableCREmail")); //Unique Id Of Enable Payment Approval Email Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseSupAppSearch
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use SuperVisor Approval Search Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseSupAppSearch(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UseSupAppSearch")); //Unique Id Of Use SuperVisor Approval Search Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVisor_Chk_DisbDiaryNotUnapprovedEntity
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Diary Notification For Unapproved Entity Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotUnapprovedEntity(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DisableDiaryNotifyForUnapprovedEntity")); //Unique Id Of Disable Diary Notification For Unapproved Entity Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UseHoldReserve")); //Unique Id Of Reserve Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use SuperVisory Approval For Reserves Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UseSupAppReserves")); //Unique Id Of Use SuperVisory Approval For Reserves Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApproveReserve
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow The Group Of SuperVisor To Approve Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApproveReserve(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("AccessGrpApproveReserve")); //Unique Id Of Use SuperVisory Approval For Reserves Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_TimeFrameRsv
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time Frame List Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_TimeFrameRsv(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DDLTimeFrame")); //Unique Id Of Time Frame List Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DaysApprovalRsv
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days/Hours Approval Of Reserves Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DaysApprovalRsv(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DaysApprovalReserves")); //Unique Id Of Days/Hours Approval Of Reserves Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationRsv
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Consider Zero As Valid Value For Escalation Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationRsv(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("ZeroEscalationReserves")); //Unique Id Of Consider Zero As Valid Value For Escalation Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notify The Immediate SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("NotifySupReserves")); //Unique Id Of Consider Notify The Immediate SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseCurrAdjRsv
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Use Current Adjustor Supervisory Chain Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseCurrAdjRsv(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UseCurrAdjReserves")); //Unique Id Of Use Current Adjustor Supervisory Chain Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotifySuperVsr
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Email Notification To SuperVisor Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbEmailSprVsrRes(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DisableEmailNotifyForSuperVsr")); //Unique Id Of Disable Email Notification To SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbEmailSprVsr
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Diary Notification To SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbDiarySprVsrRes(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("DisableDiaryNotifyForSuperVsr")); //Unique Id Of Disable Diary Notification To SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Incurred Limits Are Exceeded Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UseHoldIncurredLimits")); //Unique Id Of Incurred Limits Are Exceeded Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Img_TransCodesSrchBtn
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Specific Transaction Type Codes Image Button On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Img_TransCodesSrchBtn(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("TransCodes_multicodebtn")); //Unique Id Of Specific Transaction Type Codes Image Button On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Lst_TransCodesList
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Specific Transaction Type Codes List Box On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Lst_TransCodesList(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("TransCodes_multicode")); //Unique Id Of Specific Transaction Type Codes List Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PaymentParaSetup_Img_Save
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PaymentParaSetup_Img_Save(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("Save")); //Unique Id Of Specific Transaction Type Codes List Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Current Adjuster Supervisor Chain On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - ImteyazAhmad-12-17-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UseSupChain")); //Unique Id Of Specific Use Current Adjuster Supervisor Chain Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Frm_PaymentParameterSetUp
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RMAApp_PmntSetUpSprVsr_Frm_PaymentParameterSetUp Frame On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-18-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUp_Frm_PaymentParameterSetUp(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse")); //Unique Id Of RMAApp_PmntSetUpSprVsr_Frm_PaymentParameterSetUp Frame On RMA Application Payment Parameter SetUp Page Is Fetched
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_LssCollecOnHold
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Put Collections From LSS On Hold CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - KumudNaithani-12-18-2015                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_LssCollecOnHold(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("LssCollectionOnHold")); //Unique Id Of Put Collections From LSS On Hold CheckBox On RMA Application Payment Parameter SetUp Page Is Fetched
	//		return Element;
	//	}
	//
	//
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsWithChecks
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print EOBs With Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsWithChecks(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PrintEOBChecks")); 
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsOnCheckStub
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print EOB Detail On Check Stub Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsOnCheckStub(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PrintEOBStub")); 
	//		return Element;
	//	}
	//
	//	//============================================================================================
	//	//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PrintPayeeEOB
	//	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Payee EOB Checks CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
	//	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//	//Revision				: 0.0 - ImteyazAhmad-06-21-2016                                 
	//	//============================================================================================
	//	public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PrintPayeeEOB(WebDriver driver)
	//	{
	//		Element = driver.findElement(By.id("PrintPayeeEOB")); 
	//		return Element;
	//	}
	//
}
