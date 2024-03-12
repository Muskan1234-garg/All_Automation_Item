package rmaseleniumtestscripts;

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

//======================================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_075
//Description    : TC_075_Step And Jump Functionality Of Reserve/Payment Approval Is Validated
//Depends On TC  : TC_UserCreationSASuite3
//Revision       : 0.0 - KumudNaithani-02-18-2016 
//Modified By    : 0.1 - KumudNaithani-08-03-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible
//========================================================================================================================================================================================================================================================================================================================================================
//Note: Here: LoginUser Stands For User Containing CSC In Its Name, LoginMgr1 Stands For User Having A1 In Its Name And LoginMgr2 Stands For User Having A2 In Its Name, Users Are Arranged In Hierarchy CSC-->A1-->A2

public class RMA_TC_075 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test 
	public void RMA_TC_075_Test () throws Exception, Error 
	//Verify Payments Can Be Created And Is Going On Hold Because Of Exceeded Payment Limits
	{
		parentlogger = reports.startTest("TC_075_Step And Jump Functionality Of Reserve/Payment Approval", "Step And Jump Functionality Of Reserve/Payment Approval Is Validated");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String StrPrimaryWindowHandle;
			String RMAApp_UserPrev_Lst_LOB;
			int RMAApp_UserPrev_Txt_LoginUser_MaxResAmt;
			String RMAApp_UserPrev_Lst_ReserveType;
			int RMAApp_UserPrev_Txt_LoginUser_MaxAmt;
			int RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt;
			int RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt;
			String RMAApp_ReserveCreation_Lst_MedStatus;
			int RMAApp_ReserveCreation_Txt_MedReserveAmount;
			String RMAApp_ReserveCreation_Lnk_MedReserveType;
			String StrAccept;
			String StrExpErrMessage;
			String LoginUserNameActual;
			int RMAApp_ReserveCreation_Txt_ExpReserveAmount;
			int RMAApp_ReserveCreation_Txt_IndemReserveAmount;
			String RMAApp_ReserveCreation_Lst_ExpStatus;
			String RMAApp_ReserveCreation_Lst_IndemStatus;
			String RMAApp_ReserveCreation_Lnk_ExpReserveType;
			String RMAApp_ReserveCreation_Lnk_IndemReserveType;
			String RMAApp_Payment_Lst_BankAccount;
			String RMAApp_Payment_Lst_PayeeType;
			int RMAApp_FundsSplitDetails_Txt_Amount;
			int RMAApp_FundsSplitDetails_Txt_Amount_1;
			int RMAApp_FundsSplitDetails_Txt_Amount_2;
			String RMAApp_FundsSplitDetails_Lst_TransactionType;
			String RMAApp_Payment_Txt_LastName;
			String RMAApp_Payment_Txt_DistributionType;
			String StrActualErrorMessage;
			String StrErrorMessageExpected;
			String StrControlNumber_RMA_TC_075;
			String StrControlNumber_RMA_TC_01_075;
			String StrControlNumber_RMA_TC_02_075;
			String StrClaimNumber_RMA_TC_075;
			String Strlogstatement;
			String StrCheckStatusActual;
			String StrCheckStatusExpected;
			int ActualRowCount;
			String StrConLoginUserFirstAndLastName;
			String StrConLoginMgr1FirstAndLastName;
			int RowCount;
			//Local Variable Declaration

			StrScreenShotTCName = "TC_075";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";
			loggerval5 = "NotInitialized";
			loggerval6 = "NotInitialized";
			loggerval7 = "NotInitialized";
			loggerval8 = "NotInitialized";
			loggerval9 = "NotInitialized";
			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			testcall4 = false; 
			testcall5 = false;
			testcall6 = false;
			testcall7 = false; 
			testcall8 = false;
			testcall9 = false;
			StrAccept = "Yes";


			StrAccept = "Yes";
			StrCheckStatusExpected = "R Released";
			StrConLoginUserFirstAndLastName = "LoginUser, LoginUser";
			StrConLoginMgr1FirstAndLastName = "LoginMgr1, LoginMgr1"; 
			RowCount = 2;

			StrExpErrMessage = "Exceeded Reserve Limit";
			StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_03_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_03_SprVsrApprovalTestData Is Fetched To Retrieve Data
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_075
			RMAApp_UserPrev_Txt_LoginUser_MaxResAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 2); //Maximum Reserve Limit Amount For LoginUser Is Fetched From DataSheet RMA_TC_075
			RMAApp_UserPrev_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 3); //Reserve Type For LoginUser Is Fetched From DataSheet RMA_TC_075
			RMAApp_UserPrev_Txt_LoginUser_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 4); //Max Payment Limit Amount For LoginUser Is Fetched From DataSheet RMA_TC_075
			RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 6); //Maximum Reserve Limit For LoginMgr1 User Name Is Fetched From DataSheet RMA_TC_075
			RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 7); //Maximum Payment Limit For LoginMgr1 User Name Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Txt_MedReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 8); //Reserve Amount Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Lst_MedStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 9); //Reserve Status Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Lnk_MedReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 10); //Reserve Type Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Txt_IndemReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 13); //Reserve Amount Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Lst_IndemStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 14); //Reserve Status Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Lnk_IndemReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 15); //Reserve Type Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Txt_ExpReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 16); //Reserve Amount Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Lst_ExpStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 17); //Reserve Status Is Fetched From DataSheet RMA_TC_075
			RMAApp_ReserveCreation_Lnk_ExpReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 18); //Reserve Type Is Fetched From DataSheet RMA_TC_075
			RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 19); //Bank Account Is Fetched From DataSheet RMA_TC_075
			RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 20); // Payee Type Is Fetched From DataSheet RMA_TC_075
			RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 21); //Transaction Type Is Fetched From DataSheet RMA_TC_075
			RMAApp_FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 22); //Amount Is Fetched From DataSheet RMA_TC_075
			RMAApp_FundsSplitDetails_Txt_Amount_1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 24); //Amount For Second Payment Is Fetched From DataSheet RMA_TC_075
			RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 23); //LastName Is Fetched From DataSheet RMA_TC_075
			RMAApp_Payment_Txt_DistributionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 25); //Distribution Type Is Fetched From DataSheet RMA_TC_075
			RMAApp_FundsSplitDetails_Txt_Amount_2 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 26); //Amount For Second Payment Is Fetched From DataSheet RMA_TC_075
			//==============================================='LoginUser' Logging In Is Started=====================================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite3_Updated.StrUsercsc_TC_UserCreationSASuite3,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite3_Updated.StrUsercsc_TC_UserCreationSASuite3,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall1 = true;
			RMA_TC_002 dsnselection1 = new RMA_TC_002();
			dsnselection1.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare( RMA_TC_UserCreationSASuite3_Updated.StrUsercsc_TC_UserCreationSASuite3, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done
			//==============================================='LoginUser' Logging In Is Completed================================================================================================================================================================================================================================================================================================
			//===============================================Limits Are Disabled In User Privileges Set Up Is Started============================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();
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
			//===============================================Users Are Provided Limits In User Privileges Set Up Is Started==================================================================================================================================================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Reserve Limits", "User Privileges Set Up Page", 0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Lst_ReserveType(driver), RMAApp_UserPrev_Lst_ReserveType,"Reserve Type List Box","RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab",0);

			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Reserve Limits To" + " " +  StrConLoginUserFirstAndLastName+ " "+  "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginUserFirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Reserve Limit Max Amount For"+ " " +  StrConLoginUserFirstAndLastName+ "Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			}
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Txt_MaxAmount(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxResAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's ReserveLimits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Reserve Limit Max Amount For" + " " + StrConLoginUserFirstAndLastName+ " " + "Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginUserFirstAndLastName, 3, RMAApp_UserPrev_Lst_ReserveType, "Reserve Limits Grid Table",0);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginUserFirstAndLastName, 5, String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxResAmt), "Reserve Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Verification For User"+ " "+ StrConLoginUserFirstAndLastName, StrScreenShotTCName)));
			// Reserve Limit Is Added To User With Name Containing CSC Above

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Lst_ReserveType(driver), RMAApp_UserPrev_Lst_ReserveType,"Reserve Type List Box","RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab",0);
			
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Reserve Limits To" + " " + StrConLoginMgr1FirstAndLastName+ " "+  "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginMgr1FirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Reserve Limit Max Amount For"+ " " + StrConLoginMgr1FirstAndLastName+ "Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			}
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Txt_MaxAmount(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's ReserveLimits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Reserve Limit Max Amount For User" + " "+ StrConLoginMgr1FirstAndLastName+" "+ "Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginMgr1FirstAndLastName, 3, RMAApp_UserPrev_Lst_ReserveType, "Reserve Limits Grid Table",0);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginMgr1FirstAndLastName, 5, String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt), "Reserve Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Verification For User"+ " "+ StrConLoginMgr1FirstAndLastName, StrScreenShotTCName)));
			// Reserve Limit Is Added To User With Name Containing A1 Above

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "check", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",0);
			//Enable Reserve Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(driver), "uncheck", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",0);
			//Restrict Unspecified User CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab is Unchecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "select", "Enable Reserve Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			//Select/De-select State Of The Enable Reserve Limits CheckBox And Restrict Unspecified User CheckBox Is Verified

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limits Tab  On User-Privileges SetUp Page Is Clicked");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To" + " " + StrConLoginUserFirstAndLastName+" "+ "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginUserFirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For"+ " " + StrConLoginUserFirstAndLastName+" "+ " Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
				}
					
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Payment Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's Payment Limits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Payment Limit Max Amount For" + " " +  StrConLoginUserFirstAndLastName + " " + "Is Added");

			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), StrConLoginUserFirstAndLastName, 3, String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxAmt), "Payment Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For User" + " " +StrConLoginUserFirstAndLastName, StrScreenShotTCName)));
			// Payment Limit Is Added To User With Name Containing CSC Above

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver),  StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To" + " " + StrConLoginMgr1FirstAndLastName+" "+ "Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginMgr1FirstAndLastName, 0);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For"+ " " + StrConLoginMgr1FirstAndLastName+" "+ " Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
				}
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Payment Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's Payment Limits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Payment Limit Max Amount For User"+ " " + StrConLoginMgr1FirstAndLastName+ " "+" Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver),  StrConLoginMgr1FirstAndLastName, 3, String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt), "Payment Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For User"+ " " +StrConLoginMgr1FirstAndLastName , StrScreenShotTCName)));
			// Payment Limit Is Added To User With Name Containing A1 Above

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "check", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "uncheck", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Restrict Unspecified User CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab is UnChecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "select", "Enable Payment Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			//Select/De-select State Of The Enable Reserve Limits CheckBox And Restrict Unspecified User CheckBox Is Verified
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			
			//===============================================Users Are Provided Limits In User Privileges Set Up Completed==================================================================================================================================================================================================================================================================================
			//===============================================Enabling Of Required Payment Parameter Set Up Settings Is Started==========================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "check", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "check", "Supervisory Approval Check Box", "Payment Parameter Setup Page",0);      // Supervisory Approval CheckBox Is Checked On Payment Parameter Set Up Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "check", "Reserve Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Reserve Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "check", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "check", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box For reserves Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "check", "Supervisory Approval Check Box For Reserves", "Payment Parameter Setup",0); //Supervisory Approval CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Parameter Set Up Page Is Saved");
			//===============================================Enabling Of Required Payment Parameter Set Up Settings Is Completed===========================================================================================================================================================================================================================================================================================
			//===============================================Verification That Only Required Payment Parameter Set Up Settings Are Enabled Is Started==========================================================================================================================================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "select", "Notify Immediate Supervisor Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "select", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "select", "Reserve Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "select", "Notify Immediate SuperVisor For Reserves Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "select", "Supervisory Approval Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "select", "Use SuperVisory Approval For Reserves Check Box",0);
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			//===============================================Verification That Only Required Payment Parameter Set Up Settings Are Enabled Is Completed==========================================================================================================================================================================================================================================================================
			//===============================================General Claim Creation Is Started========================================================================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
			testcall2 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_075 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_075
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_075, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created
			//===============================================General Claim Creation Is Completed=============================================================================================================================================================================================================================================================================================================================================
			//===============================================Medical Reserve Creation Of Amount $100 (On Hold) Is Started=============================================================================================================================================================================================================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_RMA_TC_075), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_RMA_TC_075+" " +" On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_RMA_TC_075+" " +" On Left Navigation Tree");			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, "Financials"), "Financial/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As FinancialReserves Link on Left Navigation Tree Is Clicked");
			//Left Hand Navigation Tree Is Expanded And Financial/Reserves Link On Left Hand Navigation Tree Is Selected

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Medical Reserve");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_MedReserveAmount, RMAApp_ReserveCreation_Lst_MedStatus, 1, RMAApp_ReserveCreation_Lnk_MedReserveType, "Yes", StrExpErrMessage, "Hold", "Complete", "Added Medical Reserve Going On Hold Error Message");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			//Medical Reserve Of Amount $100 Is Created And Its Going On Hold Is Verified
			//===============================================Medical Reserve Creation Of Amount $100 (On Hold) Is Completed=============================================================================================================================================================================================================================================================================================================================================
			//===============================================Expense Reserve Creation Of Amount $150 (On Hold) Is Started=============================================================================================================================================================================================================================================================================================================================================
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Expense Reserve");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_ExpReserveAmount, RMAApp_ReserveCreation_Lst_ExpStatus, 1, RMAApp_ReserveCreation_Lnk_ExpReserveType, "Yes", StrExpErrMessage, "Hold", "Complete", "Added Expense Reserve Going On Hold Error Message");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			//Expense Reserve Of Amount $150 Is Created And Its Going On Hold Is Verified
			//===============================================Expense Reserve Creation Of Amount $150 (On Hold) Is Completed=============================================================================================================================================================================================================================================================================================================================================			
			//===============================================Indemnity Reserve Creation Of Amount $50 (On Hold) Is Started=============================================================================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Indemnity Reserve");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_IndemReserveAmount, RMAApp_ReserveCreation_Lst_IndemStatus, 1, RMAApp_ReserveCreation_Lnk_IndemReserveType, "No", StrExpErrMessage, "Open", "Not Required", "Not Required");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//Indemnity Reserve Of Amount $50 (On Hold) Is Created 
			//===============================================Indemnity Reserve Creation Of Amount $50 (On Hold) Is Completed=============================================================================================================================================================================================================================================================================================================================================			
			//===============================================Payment Creation Of Amount $10 Is Started=====================================================================================================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Add Payment Of $10");
			testcall6 = true;
			StrControlNumber_RMA_TC_075 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount, RMAApp_Payment_Txt_LastName, RMAApp_Payment_Txt_DistributionType, 1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_075, 2)+ " "+ "Is Done");
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//Payment Of Amount $10 Is Created
			//===============================================Payment Creation Of Amount $10 Is Completed========================================================================================================================================================================================================================================================================================================================================================================		
			//===============================================Payment Creation Of Amount $25 (On Hold) Is Started===============================================================================================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financial Image On Payment Creation Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, 0, "Wait Is Added As Back To Financials Image Is Clicked");

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Add Payment Of $25");
			testcall7 = true;
			StrControlNumber_RMA_TC_01_075 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_1, RMAApp_Payment_Txt_LastName, RMAApp_Payment_Txt_DistributionType, 1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_01_075, 2)+ " "+ "Is Done");
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			//Payment Of Amount $25 Is Created

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			//Payment Of Amount $25 Going On Hold Is Verified		
			//===============================================Payment Creation Of Amount $25 (On Hold) Is Completed===========================================================================================================================================================================================================================================================================================================================================================
			//===============================================Payment Creation Of Amount $30 (On Hold) Is Started===========================================================================================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financial Image On Payment Creation Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, 0, "Wait Is Added As Back To Financials Image Is Clicked");

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Add Payment Of $30");
			testcall8 = true;
			StrControlNumber_RMA_TC_02_075 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_2, RMAApp_Payment_Txt_LastName, RMAApp_Payment_Txt_DistributionType, 1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_02_075, 2)+ " "+ "Is Done");
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			//Payment Of Amount $30 Is Created

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			//Payment Of Amount $30 Going On Hold Is Verified
			//===============================================Payment Creation Of Amount $30 (On Hold) Is Completed===========================================================================================================================================================================================================================================================================================================================================================		
			//==============================================='LoginMgr1' Logging In Is Started================================================================================================================================================================================================================================================================================================================================================================================
		
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite3_Updated.StrUsera1_TC_UserCreationSASuite3,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite3_Updated.StrUsera1_TC_UserCreationSASuite3,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall9 = true;
			dsnselection1.RMAApp_DSNSelection();
			loggerval9 = logger.toString();
			parentlogger.appendChild(logger);

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite3_Updated.StrUsera1_TC_UserCreationSASuite3, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done
			//==============================================='LoginMgr1' Logging In Is Completed===================================================================================================================================================================================================================================================================================================================================================================================
			//===============================================Created Payment Processing Is Started ===================================================================================================================================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Tab On Supervisory Approval Page Is Clicked");
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_01_075, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			
			Strlogstatement  = "Record With Control Number" + " " + StrControlNumber_RMA_TC_01_075 + " " + "In PaymentUXGrid On Supervisory Approval Page";		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image Is Clicked On The Supervisory Payment Approval Page");
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment with Control Number" + " " + StrControlNumber_RMA_TC_01_075 + " " + "Does Not Exist In payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_01_075, logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				//Payments Grid Is Filtered On The Basis Of The Provided Control Number
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_01_075, "Payment UXGrid On Supervisory Page", logval);
			}
		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_02_075, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			
			Strlogstatement  = "Record With Control Number" + " " + StrControlNumber_RMA_TC_02_075 + " " + "In PaymentUXGrid On Supervisory Approval Page";		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntReject(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntReject(driver), "Reject Image On The Supervisory Approval Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image On Payment Reject Window On Supervisory Approval Page Is Clicked");
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment with Control Number" + " " + StrControlNumber_RMA_TC_02_075 + " " + "Does Not Exist In payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_02_075, logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				//Payments Grid Is Filtered On The Basis Of The Provided Control Number
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_02_075, "Payment UXGrid On Supervisory Page", logval);
			}			
			//===============================================Created Payment Processing Is Completed ==========================================================================================================================================================================================================================================================================================================================================================================================================
			//===============================================Verification Of The Approved Transaction Status Is Started ===================================================================================================================================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search_Funds", "Check Control Number Text Box", StrControlNumber_RMA_TC_01_075, StrControlNumber_RMA_TC_01_075, "Transaction", "num", 2, logval);
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);
			//Approved Transaction's Check Status Is Released Is Verified
			driver.switchTo().parentFrame();	
			//===============================================Verification Of The Approved Transaction Status Is Completed ===================================================================================================================================================================================================================================================================================================================================================================================	
			//===============================================Created Reserve Processing Is Started =========================================================================================================================================================================================================================================================================================================================================================================================================
			
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Tab On Supervisory Approval Page Is Clicked");
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_075, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			//Reserve Grid Is Filtered On The Basis Of The Provided Claim Number
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Medical", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			//Reserve Grid Is Filtered On The Basis Of The Provided Reserve Type
			
			Strlogstatement  = "Medical Reserve For Claim Number" + " " + StrClaimNumber_RMA_TC_075 + " " + "In Reserve Approval UX Grid On Supervisory Approval Page";
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark(driver), "Reserve Type Selection Tick Mark Arrow On Reserve Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image Is Clicked On The Supervisory Reserve Approval Page");
								
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Medical Reserve Of Amount $120 With Claim Number" + " " + StrClaimNumber_RMA_TC_075 + " " + "Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_075, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Medical", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_075, "Reserve UXGrid On Supervisory Page", logval);
			}
				
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_075, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			//Reserve Grid Is Filtered On The Basis Of The Provided Claim Number
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			//Reserve Grid Is Filtered On The Basis Of The Provided Reserve Type
			
			Strlogstatement  = "Expense Reserve For Claim Number" + " " + StrClaimNumber_RMA_TC_075 + " " + "In Reserve Approval UX Grid On Supervisory Approval Page";
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark(driver), "Reserve Type Selection Tick Mark Arrow On Reserve Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResReject(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResReject(driver), "Reject Image On The Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_RsvRejectReason(driver), "Reserve Reject Reason TextBox On Reserve Tab  On Supervisory Approval Page", "Entry Error", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Reserve Reject Window On The Supervisory Approval Page", logval);
			//Expense Reserve Is Rejected

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Expense Reserve Of Amount $150 With Claim Number" + " " + StrClaimNumber_RMA_TC_075 + " " + "Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_075, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_075, "Reserve UXGrid On Supervisory Page", logval);
			}
			//===============================================Created Reserve Processing Is Completed ===================================================================================================================================================================================================================================================================================================================================================================================
			//===============================================Enabled Payment Parameter Set Up Settings Revert Is Started==================================================================================================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
					
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisory Approval Check Box", "Payment Parameter Setup Page",0);      // Supervisory Approval CheckBox Is Checked On Payment Parameter Set Up Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "uncheck", "Reserve Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Reserve Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "uncheck", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box For reserves Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "uncheck", "Supervisory Approval Check Box For Reserves", "Payment Parameter Setup",0); //Supervisory Approval CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0);//Save Image Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "deselect", "Reserve Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "deselect", "Notify Immediate SuperVisor For Reserves Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "deselect", "Use SuperVisory Approval For Reserves Check Box",0);
			//===============================================Enabled Payment Parameter Set Up Settings Revert Is Completed=================================================================================================================================================================================================================================================================================================================================================================================
			//===============================================Provided User Privileges Limit Removal Is Started=============================================================================================================================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup",0);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();
			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginUserFirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Reserve Limit Max Amount For"+ " " + StrConLoginUserFirstAndLastName+ " " + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Removal Verification For User"+ " " +StrConLoginUserFirstAndLastName , StrScreenShotTCName)));
			//Reserve Limits Provided To User With Name Containing CSC Are Removed

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + RMA_TC_UserCreationSASuite3_Updated.StrUsera1_TC_UserCreationSASuite3, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Reserve Limit Max Amount For"+ " " + StrConLoginMgr1FirstAndLastName+ "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Removal Verification For User"+ " " +StrConLoginMgr1FirstAndLastName , StrScreenShotTCName)));
			//Reserve Limits Provided To User With Name Containing A1 Are Removed

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "uncheck", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "deselect", "Enable Reserve Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(driver), "deselect", "Restrict Unspecified Users CheckBox",0);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text" + " " + StrConLoginUserFirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For User" + " " + StrConLoginUserFirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Removal Verification For User"+ " " +StrConLoginUserFirstAndLastName , StrScreenShotTCName)));
			//Payment Limits Provided To User With Name Containing CSC Are Removed

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text" + " " + RMA_TC_UserCreationSASuite3_Updated.StrUsera1_TC_UserCreationSASuite3, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For User" + StrConLoginMgr1FirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Removal Verification For User"+ " " +StrConLoginMgr1FirstAndLastName , StrScreenShotTCName)));
			//Payment Limits Provided To User With Name Containing A1 Are Removed

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",0);
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			//===============================================Provided User Privileges Limit Removal Is Completed============================================================================================================================================================================================================================================================================================================================================================================================

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

			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}


			else if  ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);

			}
			else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Medical reserve Of $120"  + " " +  "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);
			}
			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Expense Reserve Of $150"  + " " +  "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);
			}

			else if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Indemnity Reserve Of $50" +" "+ "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);

			}
			else if ((testcall6 == true) && (loggerval6.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $10"  + " " +  "And Hence Payment Was Not Successful");
				parentlogger.appendChild(logger);
			}
			else if ((testcall7 == true) && (loggerval7.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $25"  + " " +  "And Hence Payment Was Not Successful");
				parentlogger.appendChild(logger);
			}
			else if ((testcall8 == true) && (loggerval8.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $30"  + " " +  "And Hence Payment Was Not Successful");
				parentlogger.appendChild(logger);
			}
			
			else if ((testcall9 == true) && (loggerval9.equalsIgnoreCase("NotInitialized")))
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

