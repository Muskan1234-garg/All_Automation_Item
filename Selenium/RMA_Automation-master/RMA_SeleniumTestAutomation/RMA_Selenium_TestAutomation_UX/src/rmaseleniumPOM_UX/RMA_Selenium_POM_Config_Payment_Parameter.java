package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Config_Payment_Parameter {
	public static WebElement Element = null;
	public static WebElement Element2 = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_Chk_Auto_Populate_Claim_Date_Reported
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-11-2020                                 
	// ================================================================================================================================================================================================
/*	public static WebElement RMAApp_Payment_Parameter_Section_Name(WebDriver driver , String text)
	{
		Element = null;
		try {
	//		Element = driver.findElement(By.xpath(".//*[@class='mat-tab-label-container']//ancestor::div[contains(text(),'"+text+"')]//Mat-icon[@role='img']")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
		
			//Element = driver.findElement(By.xpath(".//*[@class='mat-tab-label-container']//ancestor::div[@class='mat-tab-label-content' and contains(text(),'"+text+"')]")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
			
		
			Element = driver.findElement(By.xpath(".//*[@id='frmData']//descendant::div[@class='mat-tab-label-container']//descendant::div[@class='mat-tab-label-content' and contains(text(),'"+text+"')]")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	*/
	
	//=================================================================================================================================================================================================
		//FunctionName 			: RMAApp_Payment_Parameter_Sub_Section_Name
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Auto Populate Claim Date Reported Checkbox Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ParulSharma-08-11-2020                                 
		// ================================================================================================================================================================================================
	/*	public static WebElement RMAApp_Payment_Parameter_Sub_Section_Name(WebDriver driver , String text)
		{
			Element = null;
			try {
				Element = driver.findElement(By.xpath(".//*[@class='card-body list-card']//ul//ancestor::li//a[contains(text(),'"+text+"')]")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return Element;
		}
		*/

		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-07-2015    
		//Revision				: 1.0 - ParulSharma-08-11-2020   
		//============================================================================================
		public static WebElement RMAApp_Config_PmntSetUpSprVsr_Chk_PayLimitExceed(WebDriver driver)
		{
			Element = driver.findElement(By.id("payDetailLimitExceed-input")); //Unique Id Of Payment Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-07-2015                                 
		//Revision				: 1.0 - ParulSharma-08-11-2020   
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(WebDriver driver)
		{
			Element = driver.findElement(By.id("payLimitExceed-input")); //Unique Id Of Payment Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}

		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayeeNotExist
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Does Not Exist In System Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-07-2015 
		//Revision				: 1.0 - ParulSharma-08-11-2020   
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PayeeNotExist(WebDriver driver)
		{
			Element = driver.findElement(By.id("payNotExist-input")); //Unique Id Of Payee Does Not Exist In System Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Claim Pay Limits Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded(WebDriver driver)
		{
			Element = driver.findElement(By.id("perClaimPayLimitsExceeded-input")); //Unique Id Of Per Claim Pay Limits Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_QueuePayment
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Queue Payments Instead Of Placing On Hold Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_QueuePayment(WebDriver driver)
		{
			Element = driver.findElement(By.id("queuePayment-input")); //Unique Id Of Queue Payments Instead Of Placing On Hold Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SupervisoryApproval Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(WebDriver driver)
		{
			Element = driver.findElement(By.id("supervisoryApproval-input")); //Unique Id Of SupervisoryApproval Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApprove
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow The Group Of SuperVisor To Approve Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApprove(WebDriver driver)
		{
			Element = driver.findElement(By.id("accessGrpApprove-input")); //Unique Id Of Allow The Group Of SuperVisor To Approve Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Current Adjuster Supervisor Chain On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ImteyazAhmad-12-17-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster(WebDriver driver)
		{
			Element = driver.findElement(By.id("useCurrentAdjSupervisorChain-input")); //Unique Id Of Specific Use Current Adjuster Supervisor Chain Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Lst_TimeFrame
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time Frame List Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Lst_TimeFrame(WebDriver driver)
		{
			//Element = driver.findElement(By.id("TimeInterval")); //Unique Id Of Time Frame List Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			Element = driver.findElement(By.xpath(".//*[@class='mat-form-field-infix']//descendant::mat-select[@aria-labelledby='lbl_timeFrame']")); //Unique Id Of Time Frame List Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Txt_DaysHrsApproval
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days/Hours For Approvals Of Checks On Hold Text Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Txt_DaysHrsApproval(WebDriver driver)
		{
			Element = driver.findElement(By.name("cl_daysForApproval")); //Unique Id Of Days/Hours For Approvals Of Checks On Hold Text Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}

		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationValue
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days/Hours For Approvals Of Checks On Hold Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationValue(WebDriver driver)
		{
			Element = driver.findElement(By.id("zeroEscalationFunds-input")); //Unique Id Of Consider Zero As Valid Value For Escalation Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notify The Immediate Supervisor Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(WebDriver driver)
		{
			Element = driver.findElement(By.id("pmtNotifyImmSup-input")); //Unique Id Of Notify The Immediate Supervisor Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}

		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Payment Approval Diary Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(WebDriver driver)
		{
			Element = driver.findElement(By.id("enableCRDiary-input")); //Unique Id Of Enable Payment Approval Diary Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotify
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Diary Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotify(WebDriver driver)
		{
			Element = driver.findElement(By.id("diaryToManager-input")); //Unique Id Of Disable Diary Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotify
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Email Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotify(WebDriver driver)
		{
			Element = driver.findElement(By.id("disableEmailNotifyForPayment-input")); //Unique Id Of Disable Email Notification To SuperVisor Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Payment Approval Email Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(WebDriver driver)
		{
			Element = driver.findElement(By.id("enableCREmail-input")); //Unique Id Of Enable Payment Approval Email Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVisor_Chk_DisbDiaryNotUnapprovedEntity
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Diary Notification For Unapproved Entity Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotUnapprovedEntity(WebDriver driver)
		{
			Element = driver.findElement(By.id("disableDiaryNotifyForUnapprovedEntity-input")); //Unique Id Of Disable Diary Notification For Unapproved Entity Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(WebDriver driver)
		{
			Element = driver.findElement(By.id("useHoldReserve-input")); //Unique Id Of Reserve Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use SuperVisory Approval For Reserves Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(WebDriver driver)
		{
			Element = driver.findElement(By.id("useSupAppReserves-input")); //Unique Id Of Use SuperVisory Approval For Reserves Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationRsv
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Consider Zero As Valid Value For Escalation Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationRsv(WebDriver driver)
		{
			Element = driver.findElement(By.id("zeroEscalationReserves-input")); //Unique Id Of Consider Zero As Valid Value For Escalation Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Notify The Immediate SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(WebDriver driver)
		{
			Element = driver.findElement(By.id("notifySupReserves-input")); //Unique Id Of Consider Notify The Immediate SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_UseCurrAdjRsv
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Use Current Adjustor Supervisory Chain Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_UseCurrAdjRsv(WebDriver driver)
		{
			Element = driver.findElement(By.id("useCurrAdjReserves-input")); //Unique Id Of Use Current Adjustor Supervisory Chain Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}


		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Incurred Limits Are Exceeded Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(WebDriver driver)
		{
			Element = driver.findElement(By.id("useHoldIncurredLimits-input")); //Unique Id Of Incurred Limits Are Exceeded Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}

		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotifySuperVsr
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Email Notification To SuperVisor Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbEmailSprVsrRes(WebDriver driver)
		{
			Element = driver.findElement(By.id("disableEmailNotifyForSuperVsr-input")); //Unique Id Of Disable Email Notification To SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DisbEmailSprVsr
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disable Diary Notification To SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DisbDiarySprVsrRes(WebDriver driver)
		{
			Element = driver.findElement(By.id("disableDiaryNotifyForSuperVsr-input")); //Unique Id Of Disable Diary Notification To SuperVisor Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowDuplicatePaymentChecking
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Allow Duplicate Payment Checkings CheckBox On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ImteyazAhmad-06-21-2016
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowDuplicatePaymentChecking(WebDriver driver)
		{
			Element = driver.findElement(By.id("dupPayCheck-input")); 
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PaymentParSetup_Chk_EnableVoidReasonComment
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Enable Multiple Addresses For Entities CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ImteyazAhmad-06-21-2016
		//Revision				: 1.0 - ParulSharma-08-11-2020
		// ============================================================================================
		public static WebElement RMAApp_PaymentParSetup_Chk_EnableVoidReasonComment(WebDriver driver)
		{
			Element = driver.findElement(By.id("enableVoidReasonComment-input")); 
			return Element;
		}
		
		
		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApproveReserve
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow The Group Of SuperVisor To Approve Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApproveReserve(WebDriver driver)
		{
			Element = driver.findElement(By.id("accessGrpApprove-input")); //Unique Id Of Use SuperVisory Approval For Reserves Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseSubBankAccount
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Sub Bank Account CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ImteyazAhmad-06-21-2016
		//Revision				: 1.0 - ParulSharma-08-11-2020
		// ============================================================================================
		public static WebElement RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(WebDriver driver)
		{
			Element = driver.findElement(By.id("subBankAcc-input")); 
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Use Reserve Type To Filter Transaction Type CheckBox On RMA Application General System Parameter Setup Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ImteyazAhmad-06-21-2016
		//Revision				: 1.0 - ParulSharma-08-11-2020
		// ============================================================================================
		public static WebElement RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(WebDriver driver)
		{
			Element = driver.findElement(By.id("useResFilter-input")); 
			return Element;
		}

		
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Detail Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-07-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(WebDriver driver)
		{
			Element = driver.findElement(By.id("payDetailLimitExceed-input")); //Unique Id Of Payment Detail Limits Are Exceeded Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
		//	Element = driver.findElement(By.xpath(".//*[@id='payDetailLimitExceed-input']"));
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_TimeFrameRsv
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Time Frame List Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_TimeFrameRsv(WebDriver driver)
		{
			//Element = driver.findElement(By.id("DDLTimeFrame")); //Unique Id Of Time Frame List Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			Element = driver.findElement(By.xpath(".//*[@class='mat-form-field-infix']//descendant::mat-select[@aria-labelledby='lbl_timeFrameApproveRes']")); //Unique Id Of Time Frame List Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			
			
			return Element;
		}
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_DaysApprovalRsv
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Days/Hours Approval Of Reserves Check Box Under SuperVisory Approval For Reserves Section On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-08-2015
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_DaysApprovalRsv(WebDriver driver)
		{
			Element = driver.findElement(By.name("cl_daysToApproveReserves")); //Unique Id Of Days/Hours For Approvals Of Checks On Hold Text Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		//============================================================================================
		//FunctionName 			: RMAApp_PmntSetUpSprVsr_Chk_SpecTranTypeCodes
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Specific Transaction Type Codes Check Box On RMA Application Payment Parameter SetUp Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - KumudNaithani-12-07-2015   
		//Revision				: 1.0 - ParulSharma-08-11-2020
		//============================================================================================
		public static WebElement RMAApp_PmntSetUpSprVsr_Chk_SpecTranTypeCodes(WebDriver driver)
		{
			Element = driver.findElement(By.id("specTranTypeCodes-input")); //Unique Id Of Specific Transaction Type Codes Check Box On RMA Application Payment Parameter SetUp Page's SuperVisor Approval Configuration Tab Is Fetched
			return Element;
		}
		
		
		
}
