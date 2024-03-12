package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentParameterSetUp;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//=========================================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_077
//Description    : TC_077_Supervisor is able to Approve the Hold reason for which he has the authority in case of multiple hold reason
//Depends On TC  : TC_UserCreationSASuite3
//Revision       : 0.0 - ImteyazAhmad-02-22-2016 
//Modified By    : 0.1 - KumudNaithani-08-24-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible
//========================================================================================================================================================================================================================================================================================================================================================
//Note: Here: LoginUser Stands For User Containing CSC In Its Name, LoginMgr1 Stands For User Having A1 In Its Name And LoginMgr2 Stands For User Having A2 In Its Name, Users Are Arranged In Hierarchy CSC-->A1-->A2

public class RMA_TC_077 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	@Test 
	public void RMA_TC_077_Test () throws Exception, Error
	//Supervisor Is Able To Approve Transaction Of Multiple Hold Reasons
	{
		try {
			parentlogger = reports.startTest("TC_077_Supervisor Is Able To Approve Transaction Of Multiple Hold Reasons", "Supervisor Is Able To Approve The Hold Reason For which He/She Has The Authority In Case Of Multiple Hold Reasons");
			String StrAccept;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String StrLoginMgr1;
			String StrLoginMgr2;
			String LoginUserNameActual;
			String StrCheckStatusActual;
			String StrCheckStatusExpected;
			String StrPrimaryWindowHandle;
			String RMAApp_UserPrev_Lst_LOB;
			String StrConLoginUserFirstAndLastName;
			String StrConLoginMgr1FirstAndLastName;
			String RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_ResType;
			String RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_ResType;
			String StrClaimNumber_RMA_TC_077;
			String StrControlNumber_RMA_TC_077;
			String RMAApp_Payment_Lst_BankAccount;
			String RMAApp_Payment_Lst_PayeeType;
			String RMAApp_FundsSplitDetails_Lst_TransactionType;
			String RMAApp_Payment_Txt_LastName;
			String RMAApp_Payment_Txt_DistributionType;
			String StrActualCheckStatus;
			String StrActualErrorMessage;
			String StrErrorMessageExpected1;
			String StrErrorMessageExpected2;
			String ObjDescription;
			String StrHolReasonExpectedText1;
			String StrHolReasonExpectedText2;
			String StrCheckStatusExpected1;
			String StrScreenShotName;
			int RMAApp_FundsSplitDetails_Txt_Amount;
			int RMAApp_UserPrev_Txt_LoginUser_MaxPayAmt;
			int RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_MaxAmt;
			int RMAApp_UserPrev_Txt_LoginUserMgr1_PaymentLimits_MaxAmt;
			int RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_MaxAmt;
			int ActualRowCount;
			String StrErrorMessageExpected;
			int RowCount;
			String StrControlNumberExpected;
			//Local Variable Declaration Completed

			RMAApp_Login_Txt_UserName = RMA_TC_UserCreationSASuite3_Updated.StrUsercsc_TC_UserCreationSASuite3;
			RMAApp_Login_Txt_Password = RMA_TC_UserCreationSASuite3_Updated.StrUsercsc_TC_UserCreationSASuite3;// User Name And Password Are Same 
			StrLoginMgr1 = RMA_TC_UserCreationSASuite3_Updated.StrUsera1_TC_UserCreationSASuite3;
			StrLoginMgr2 = RMA_TC_UserCreationSASuite3_Updated.StrUsera2_TC_UserCreationSASuite3;		
			StrAccept = "Yes";
			StrCheckStatusExpected = "H Hold";
			StrCheckStatusExpected1 = "R Released";
			StrConLoginUserFirstAndLastName = "LoginUser, LoginUser";
			StrConLoginMgr1FirstAndLastName = "LoginMgr1, LoginMgr1"; 
			StrErrorMessageExpected1 = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval";
			StrErrorMessageExpected2 = "Payment has been set to Hold and requires supervisory approval because Exceeded Payment Detail Limit";
			StrHolReasonExpectedText1 = "Exceeded Payment Limit, Exceeded Payment Detail Limit";
			StrHolReasonExpectedText2 = "Exceeded Payment Limit";
			testcall1 = false;
			testcall2 = false;
			testcall3 = false;
			testcall4 = false;
			testcall5 = false;
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";
			loggerval5 = "NotInitialized";
			StrScreenShotTCName = "TC_077";	
			RowCount = 2;
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_03_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_03_SprVsrApprovalTestData Is Fetched To Retrieve Data
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 0); // LOB Type Is Fetched From DataSheet RMA_TC_077
			RMAApp_UserPrev_Txt_LoginUser_MaxPayAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_077", 1, 1);//Max Amount For Login User Is Fetched
			RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_077", 1, 2);//PayDetailsLimit's Max Amount For Login User Is Fetched
			RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_ResType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 3); // PayDetailsLimit's ResType For Login User Is Fetched
			RMAApp_UserPrev_Txt_LoginUserMgr1_PaymentLimits_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_077", 1, 4);//Payment Limit's Max Amount For LoginUserMgr1 Is Fetched
			RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_077", 1, 5);//PayDetailsLimit's Max Amount For LoginUserMgr1 Is Fetched
			RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_ResType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 6); // PayDetailsLimit's ResType For LoginUserMgr1 Is Fetched
			RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 7); //Bank Account Is Fetched From DataSheet RMA_TC_077
			RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 8); // Payee Type Is Fetched From DataSheet RMA_TC_077
			RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 9); //Transaction Type Is Fetched From DataSheet RMA_TC_077
			RMAApp_FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_077", 1, 10); //Amount Is Fetched From DataSheet RMA_TC_077
			RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 11); //LastName Is Fetched From DataSheet RMA_TC_077
			RMAApp_Payment_Txt_DistributionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 12); //Distribution Type Is Fetched From DataSheet RMA_TC_077
			//==============================================='LoginUser' Logging In Is Started====================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall3 = true;
			RMA_TC_002 dsnselection1 = new RMA_TC_002();
			dsnselection1.RMAApp_DSNSelection();
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "UserName", 0);
			// Correct User Is Logged In Verification Is Done			
			//==============================================='LoginUser' Logging In Is Completed====================================================================================================================================================================		
			//===============================================Limits Are Disabled In User Privileges Set Up Is Started============================================================================================================================================================================================================================================================================
			
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup", logval);

			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			logger.log(LogStatus.INFO, "User-Privileges SetUp Page Of RMA Application Is Opened");
			driver.manage().window().maximize();
			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Reserve Limits", "Reserver Limits Tab On User Privileges Setup Page", logval);
			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "uncheck", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "deselect", "Enable Reserve Limits CheckBox",logval);
			//Check Box For Reserve Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Print Check Limits", "Print Check Limits Tab On User Privileges Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(driver), "uncheck", "Enable Print Check Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Print Check Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(driver), "deselect", "Enable Print Check Limits CheckBox",logval);
			//Check Box For Print Check Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",logval);
			//Check Box For Payment Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(driver), "Pay Detail Limits Tab On RMA Application's User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "uncheck", "Enable Payment Detail Limits CheckBox",  "RMA Application's User Privileges SetUp Page's PayDetail Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "deselect", "Enable Payment Detail Limits CheckBox",logval);
			//Check Box For Pay Detail Limits Tab Is Unchecked 	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_ClaimLimits(driver), "Claim Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver), "uncheck", "Enable Claim Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Claim Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver), "deselect", "Enable Claim Limits CheckBox",logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_EventTypeLimits(driver), "Event Type Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "uncheck", "Enable Event Type Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Event Type Limits Tab",logval);//Enable Event Type Limits CheckBox On RMA Application User Privilege SetUp Page's Event Type Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "deselect", "Enable Event Type Limits CheckBox",logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Tab_PerClaimPayLimit(driver), "Per Claim Pay Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "uncheck", "Enable Per Claim Pay Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Pay Limits Tab",logval);
			//Enable Per Claim Pay Limits CheckBox On RMA Application User Privilege SetUp Page's Per Claim Pay Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "deselect", "Enable Per Claim Pay Limits CheckBox",logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits(driver), "Per Claim Incurred Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "uncheck", "Enable Per Claim Incurred Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Incurred Limits Tab",logval);
			//Enable Per Claim Incurred Limits CheckBox On RMA Application User Privilege SetUp Page's Per Claim Incurred Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "deselect", "Enable Per Claim Incurred Limits CheckBox",logval);
			//===============================================Limits Are Disabled In User Privileges Set Up Is Completed==========================================================================================================================================================================================================================================================================	
			//===============================================Users Are Provided Limits In User Privileges Set Up==================================================================================================================================================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab On RMA Application's User-Privileges SetUp Page",0); 		
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To" + " " + StrConLoginUserFirstAndLastName+" "+ "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text"+ " "+StrConLoginUserFirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For"+ " " + StrConLoginUserFirstAndLastName+" "+ " Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);			
			}
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Payment Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxPayAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's Payment Limits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Payment Limit Max Amount For" +" "+ StrConLoginUserFirstAndLastName+" " +" Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), StrConLoginUserFirstAndLastName, 3, String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxPayAmt), "Payment Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For LoginUser ", StrScreenShotTCName)));
						
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "check", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "uncheck", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
					
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "select", "Enable Payment Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(driver), "Pay Detail Limits Tab On RMA Application's User-Privileges SetUp Page", 0);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, 0, false, false, "Pay Details Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Pay Detail Limits To" + " " + StrConLoginUserFirstAndLastName+" "+ "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, 0, false, false, "Pay Detail Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetail_Rdb_PayDetailLimitsGridRadioButton(driver), "RadioButton Corresponding to Text"+ StrConLoginUserFirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Btn_Remove(driver), "Remove Button For Pay Detail Limits Grid Table", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Pay Detail Limits Max Amount For"+ " " + StrConLoginUserFirstAndLastName+" "+ " Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, ActualRowCount-1, true, false, "Pay Detail Limits Grid Table" , 0);				
			}
			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lst_ReserveType(driver), RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_ResType, "Reserve Type DropDown", "RISKMASTER User-Privileges SetUp Page's PayDetails Tab", 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Txt_MaxAmount(driver), "MaxAmount TextBox On PayDetail Limits", String.valueOf(RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_MaxAmt), 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Btn_Add(driver), "Add Button Under PayDetail Limits Tab On User Privileges Setup Page ", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As PayDetail Limits's Max Amount For"+" "+ StrConLoginUserFirstAndLastName+" "+" Is Added");
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), StrConLoginUserFirstAndLastName, 3, RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_ResType, 5, String.valueOf(RMAApp_UserPrev_Txt_LoginUser_PayDetailsLimit_MaxAmt), "Pay Detail Limit's Table On User Privileges setup Page ", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Pay Detail Limit Verification For LoginUser ", StrScreenShotTCName)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "check", "Enable Payment Detail Limits CheckBox",  "RMA Application's User Privileges SetUp Page's PayDetail Limits Tab",0);
			//Enable Payment Details Limits CheckBox On RMA Application User Privilege SetUp Page's Pay Detail Limits Tab Is Checked
			
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_RestrictUnspecifiedUsers(driver), "uncheck", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's PayDetail Limits Tab",0);
			//Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUp Page's Payment Details Limits Tab Is UnChecked
			
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "select", "Enable Payment Detail Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_RestrictUnspecifiedUsers(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			// User Privileges Setup Settings Are Completed Here For LoginUser
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab On RMA Application's User-Privileges SetUp Page",0); 
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To" + " " + StrConLoginMgr1FirstAndLastName+" "+ "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text"+ " "+StrConLoginMgr1FirstAndLastName , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For"+ " " + StrConLoginMgr1FirstAndLastName+" "+ " Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);				
			}
						
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Payment Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginUserMgr1_PaymentLimits_MaxAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's Payment Limits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Payment Limit Max Amount For"+ StrConLoginMgr1FirstAndLastName+" Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), StrConLoginMgr1FirstAndLastName, 3, String.valueOf(RMAApp_UserPrev_Txt_LoginUserMgr1_PaymentLimits_MaxAmt), "Payment Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For LoginUser ", StrScreenShotTCName)));

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(driver), "Pay Detail Limits Tab On RMA Application's User-Privileges SetUp Page", 0);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, 0, false, false, "Pay Details Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Pay Detail Limits To" + " " + StrConLoginMgr1FirstAndLastName+" "+ "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, 0, false, false, "Pay Detail Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetail_Rdb_PayDetailLimitsGridRadioButton(driver), "RadioButton Corresponding to Text"+ " "+StrConLoginMgr1FirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Btn_Remove(driver), "Remove Button For Pay Detail", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Pay Detail Limits Max Amount For"+ " " + StrConLoginMgr1FirstAndLastName+" "+ " Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, ActualRowCount-1, true, false, "Pay Detail Limits Grid Table" , 0);				
			}
			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lst_ReserveType(driver), RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_ResType, "Reserve Type DropDown", "RISKMASTER User-Privileges SetUp Page's PayDetails Tab", 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Txt_MaxAmount(driver), "MaxAmount TextBox On PayDetail Limits", String.valueOf(RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_MaxAmt), 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Btn_Add(driver), "Add Button Under PayDetail Limits Tab On User Privileges Setup Page ", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As PayDetail Limits's Max Amount For"+" "+ StrConLoginMgr1FirstAndLastName+" "+" Is Added");
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), StrConLoginMgr1FirstAndLastName, 3, RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_ResType, 5, String.valueOf(RMAApp_UserPrev_Txt_LoginUserMgr1_PayDetailsLimit_MaxAmt), "Pay Detail Limit's Table On User Privileges setup Page ", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Pay Detail Limit Verification For LoginUserMgr1 ", StrScreenShotTCName)));
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			// User Privileges Setup Settings Are Completed Here For LoginUserMgr1			
			//===============================================Users Are Provided Limits In User Privileges Set Up Is Completed==================================================================================================================================================================================================================================================================================
			//===============================================Enabling Of Required Payment Parameter Set Up Settings Is Started===================================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "check", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "check", "Payment Detail Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page		
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "check", "Supervisory Approval Check Box", "Payment Parameter Setup Page",0);      // Supervisory Approval CheckBox Is Checked On Payment Parameter Set Up Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "check", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Parameter Set Up Page Is Saved");
			//===============================================Enabling Of Required Payment Parameter Set Up Settings Is Started=======================================================================================================================================================================================================================================================================================
			//===============================================Verification That Only Required Payment Parameter Set Up Settings Are Enabled Is Started==================================================================================================================================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "select", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "select", "Payment Detail Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "select", "Notify Immediate Supervisor Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "select", "Supervisory Approval Check Box",0);
			//Payment Parameter Setup Setting Is Completed Here
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			//===============================================Verification That Only Required Payment Parameter Set Up Settings Are Enabled Is Completed==========================================================================================================================================================================================================================================================================
			//===============================================General Claim Creation Is Started===================================================================================================================================================================================================================================================================================================================================
						
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_077 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_077
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_077, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created	
			//===============================================General Claim Creation Is Completed========================================================================================================================================================================================================================================================================================================================================
			//===============================================Payment Creation Of Amount $60 (On Hold) Is Started================================================================================================================================================================================================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_RMA_TC_077), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_RMA_TC_077+" " +" On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_RMA_TC_077+" " +" On Left Navigation Tree");			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, "Financials"), "Financial/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As FinancialReserves Link on Left Navigation Tree Is Clicked");
			//Left Hand Navigation Tree Is Expanded And Financial/Reserves Link On Left Hand Navigation Tree Is Selected
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called To Create A Payment Of $60 :: RMA_PaymentAddition_Utility");		
			testcall2 = true;
			StrControlNumber_RMA_TC_077 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
			parentlogger.log(LogStatus.INFO, "New Payment Is Created With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_077, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//New Payment Is Done

			StrActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrActualCheckStatus, "Correct Check Status",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldTextCollection(driver, 1), "Payment On Hold Requires SuperVisory Approval For Exceeded Payment Limit",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldTextCollection(driver, 1), "innerHTML");
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected1, StrActualErrorMessage, "Correct Error Message Display",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldTextCollection(driver, 2), "Payment On Hold Requires SuperVisory Approval For Exceeded Payment Detail Limit",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldTextCollection(driver, 2), "innerHTML");
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected2, StrActualErrorMessage, "Correct Error Message Display",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Message Verification", StrScreenShotTCName)));
			//Two Warning Message - Payment Limit Exceed And Payment Detail Limit Exceed- Are Verified 				
			//===============================================Payment Creation Of Amount $60 (On Holld) Is Completed=================================================================================================================================================================================================================================================================================================
			//==============================================='LoginMgr1' Logging In Is Started==========================================================================================================================================================================================================================================================================================================
	
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out	
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", StrLoginMgr1,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", StrLoginMgr1,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall4 = true;
			RMA_TC_002 dsnselection2 = new RMA_TC_002();
			dsnselection2.RMAApp_DSNSelection();
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(StrLoginMgr1, LoginUserNameActual, "UserName", 0);			
			//==============================================='LoginMgr1' Logging In Is Completed==================================================================================================================================================================================================================================================================================================================
			//===============================================Hold Reason Verification And Payment Approval Is Started==================================================================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On Pending View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Tab On Supervisory Approval Page Is Clicked");
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page",  StrControlNumber_RMA_TC_077, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPaymentColumnSelector(driver), "Columns Selector For Payments UXGrid On Supervisory Approval Page", 0);
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant"), "Claimant Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date"), "Fund Date Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee"), "Payee Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount"), "Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount"), "Split Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type"), "Trans Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments"), "Comments Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By"), "Submitted By Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status"), "Claim Status Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Date Of Claim").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Date Of Claim")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Date Of Claim"), "Date Of Claim Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Current Adjuster").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Current Adjuster")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Current Adjuster"), "Current Adjuster Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			
			WebElement Element = RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_Type(driver, 1);
			if (Element == null)
			{
				logger.log(LogStatus.INFO,  "Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page");
			}
			
			else
			{
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type").isDisplayed())
			{
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type"), "Policy Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name"), "Policy Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Holder Name").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Holder Name")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Holder Name"), "Policy Holder Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			//Columns Are Unselected From My Pending Funds Transactions Grid
			
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_077, "Payments UXGrid In Supervisory Approval Page", StrHolReasonExpectedText1, 7, logval);
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image On Payment Approval Window On Supervisory Approval Page Is Clicked");
			
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver), "Payment Requires Supervisory Approval Message", logval);
			StrActualErrorMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver).getText();
			
			StrErrorMessageExpected = "Amount exceeds user's payment limit. It is submitted to User's manager for approval";
			StrControlNumberExpected = StrControlNumber_RMA_TC_077;
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrControlNumberExpected, StrActualErrorMessage, "Correct Control Number Display In Error Message",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Reasons Verification", StrScreenShotTCName)));
				
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				ObjDescription  = "Payment with Control Number" + " " + StrControlNumber_RMA_TC_077 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, ObjDescription);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_077, logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				//Payments Grid Is Filtered On The Basis Of The Provided Control Number
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_077, "Payment UXGrid On Supervisory Page", logval);
			}
			//Record With Provided Control Number Does Not Exists After Approval Is Verified 
			//Hold Reasons Verification For LoginMgr2 Is Started Below 
			//===============================================Hold Reason Verification And Payment Approval Is Completed==================================================================================================================================================================================================================================================================================================================				
			//==============================================='LoginMgr2' Logging In Is Started============================================================================================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out	
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", StrLoginMgr2,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", StrLoginMgr2,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall5 = true;
			dsnselection1.RMAApp_DSNSelection();
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			
			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(StrLoginMgr2, LoginUserNameActual, "UserName", 0);		
			//==============================================='LoginMgr2' Logging In Is Completed======================================================================================================================================================================================================================================================================================================================================== 
			//===============================================Hold Reason Verification And Payment Approval Is Started==================================================================================================================================================================================================================================================================================================================
			
			driver.switchTo().frame(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Tab On Supervisory Approval Page Is Clicked");
					
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page",  StrControlNumber_RMA_TC_077, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPaymentColumnSelector(driver), "Columns Selector For Payments Grid On Supervisory Approval Page", 0);
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant"), "Claimant Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date"), "Fund Date Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee"), "Payee Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount"), "Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount"), "Split Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type"), "Trans Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments"), "Comments Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By"), "Submitted By Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status"), "Claim Status Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Date Of Claim").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Date Of Claim")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Date Of Claim"), "Date Of Claim Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Current Adjuster").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Current Adjuster")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Current Adjuster"), "Current Adjuster Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			
			Element = RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_Type(driver, 1);
			if (Element == null)
			{
				logger.log(LogStatus.INFO,  "Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page");
			}
			
			else
			{
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type").isDisplayed())
			{
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type"), "Policy Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name"), "Policy Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Holder Name").isDisplayed())
			{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Holder Name")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Holder Name"), "Policy Holder Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
			}
			//Columns Are Unselected From My Pending Funds Transactions Grid
			
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_077, "Payments Grid In Supervisory Approval Page", StrHolReasonExpectedText2,7, logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "One Hold Reason Verification", StrScreenShotTCName)));

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image On Payment Approval Window On Supervisory Approval Page Is Clicked");
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				ObjDescription  = "Payment with Control Number" + " " + StrControlNumber_RMA_TC_077 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, ObjDescription);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_077, logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				//Payments Grid Is Filtered On The Basis Of The Provided Control Number
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_077, "Payment UXGrid On Supervisory Page", logval);
			}
			//Record With Provided Control Number Does Not Exists After Approval Is Verified 			
			//===============================================Hold Reason Verification And Payment Approval Is Started==================================================================================================================================================================================================================================================================================================================
			//================================================Payment Check Status Verification Is Started=========================================================================================================================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search-->Funds", "Control Number Text Box", StrControlNumber_RMA_TC_077, StrControlNumber_RMA_TC_077, "Transaction", "num", 2, logval);
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected1, StrCheckStatusActual, "Check Status", 0);
			//================================================Payment Check Status Verification Is Completed=========================================================================================================================================================================================================================================================================================================================================================================	
			//===============================================Enabled Payment Parameter Set Up Settings Revert Is Started==================================================================================================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits are exceeded CheckBox ", "Payment Parameter Setup Page",0);   // Check box "Payment Limits are exceeded" is unchecked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "uncheck", "Payment Detail Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is unChecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisor Approval CheckBox", "Payment Parameter Setup Page",0);  // Check box "Supervisor Approval" is unchecked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor CheckBox", "Payment Parameter Setup Page",0); //Check box "Enable Payment Approval Email " is unchecked on Payment Parameter Setup
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0);//Save Image Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);   
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box",0);
			//===============================================Enabled Payment Parameter Set Up Settings Revert Is Completed==================================================================================================================================================================================================================================================================================================================================================================
			//===============================================Provided User Privileges Limit Removal Is Started============================================================================================================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup",0);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();		
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page",0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab On RMA Application's User-Privileges SetUp Page",0); 
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text" + " " + StrConLoginUserFirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For User" + " " + StrConLoginUserFirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			StrScreenShotName = "Payment Limit Removed Corresponding To User "+" "+StrConLoginUserFirstAndLastName;
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, StrScreenShotName , StrScreenShotTCName)));
			//Payment Limits Provided To User With Name Containing CSC Are Removed		

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text" + " " + StrConLoginMgr1FirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For User" + StrConLoginMgr1FirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			StrScreenShotName = "Payment Limit Removed Corresponding To User "+" "+StrConLoginMgr1FirstAndLastName;
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,StrScreenShotName , StrScreenShotTCName)));
			//Payment Limits Provided To User With Name Containing A1 Are Removed

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",0);

			//Code To Remove Payment Limit For User -LoginUser And LoginMgr1- Is Completed Here

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(driver), "Pay Detail Limits Tab On RMA Application's User-Privileges SetUp Page", 0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, 0, false, false, "Payment Detail Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetail_Rdb_PayDetailLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginMgr1FirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Btn_Remove(driver), "Remove Button For Payment Detail Limit", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Detail Limit Max Amount For User" + StrConLoginMgr1FirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, ActualRowCount-1, true, false, "Payment Detail Limits Grid Table" , 0);
			StrScreenShotName = "Payment Detail Limit Removed Corresponding To User "+" "+StrConLoginMgr1FirstAndLastName;
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, StrScreenShotName, StrScreenShotTCName)));
			//Payment Detail Limits Provided To User With Name Containing A1 Are Removed

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, 0, false, false, "Payment Detail Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetail_Rdb_PayDetailLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginUserFirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Btn_Remove(driver), "Remove Button For Payment Detail Limit", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Detail Limit Max Amount For User" + StrConLoginUserFirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Tbl_PayDetailLimitTable(driver), 0, ActualRowCount-1, true, false, "Payment Detail Limits Grid Table" , 0);
			StrScreenShotName = "Payment Detail Limit Removed Corresponding To User "+" "+StrConLoginUserFirstAndLastName;
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, StrScreenShotName, StrScreenShotTCName)));

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Detail Limits Tab",0);
			//Enable Payment Detail Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "deselect", "Enable Payment Limits CheckBox On PayDetail Limit Tab",0);

			//Payment Detail Limits Provided To User With Name Containing csc Are Removed
			//===============================================Provided User Privileges Limit Removal Is Started============================================================================================================================================================================================================================================================================================================================================================================

			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);

		} catch (Exception|Error e) {

			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not Handled Exception And Print Log Of It
			ErrorMessageType = e.toString();
			if (ExceptionRecorded.contains("Command"))
			{
				ErrorMessage = ExceptionRecorded.split("Command");
				FinalErrorMessage = ErrorMessage[0];
			}
			else
			{
				FinalErrorMessage = ExceptionRecorded;
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: GeneralClaim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Functionality Utility :" +" "+ "RMA_PaymentAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			
			else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			
			else if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			throw (e);
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {

			String TestCaseName;

			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(parentlogger); 
			reports.flush();
		}		
	}
}

