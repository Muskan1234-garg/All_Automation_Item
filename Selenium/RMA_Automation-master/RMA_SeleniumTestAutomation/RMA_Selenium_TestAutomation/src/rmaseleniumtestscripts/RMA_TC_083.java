package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed


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

//================================================================================================
//TestCaseID     : RMA_TC_083
//Description    : TC_083_ Hold Handling In Case Of Payment Limit With Notify Immediate Manager Setting Applied Is Validated
//Depends On TC  : TC_UserCreationSASuite4_Updated
//Revision       : 0.0 - KumudNaithani-04-13-2016 
//Revision       : 0.1 - ImteyazAhmad-08-25-2016 
//=================================================================================================

public class RMA_TC_083 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test 
	public void RMA_TC_083_Test () throws Exception, Error 
	//Verify Hold Handling In Case Of Payment Limit With Notify Immediate Manager Setting Applied
	{
		parentlogger = reports.startTest("TC_083_Hold Handling For Payment Limit With Notify Immediate Manager Setting", "Hold Handling In Case Of Payment Limit With Notify Immediate Manager Setting Applied Is Validated");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String  RMAApp_UserPrev_Lst_LOB,StrAccept,LoginUserNameActual,RMAApp_ReserveCreation_Lst_Med_Status,RMAApp_ReserveCreation_Lnk_Med_ReserveType,StrClaimNumber_RMA_TC_083,Strlogstatement;
			int RowCount,RMAApp_UserPrev_Txt_LoginUser_MaxAmt,  RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt,RMAApp_ReserveCreation_Txt_Med_ReserveAmount,ActualRowCount,RMAApp_FundsSplitDetails_Txt_Amount,RMAApp_FundsSplitDetails_Txt_Amount_2,RMAApp_FundsSplitDetails_Txt_Amount_1;
			
			String StrConLoginUserFirstAndLastName,StrConLoginMgr1FirstAndLastName,StrClaimNumber_RMA_TC_083_01,StrErrorMessageExpected,StrControlNumber_RMA_TC_083,RMAApp_Payment_Lst_BankAccount,RMAApp_Payment_Lst_PayeeType;
			String RMAApp_FundsSplitDetails_Lst_TransactionType,RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,StrControlNumber_RMA_TC_083_01,StrControlNumber_RMA_TC_083_02,StrActualErrorMessage;
			//Local Variable Declaration

			StrScreenShotTCName = "TC_083";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";
			loggerval5 = "NotInitialized";
			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			testcall4 = false; 
			testcall5 = false;
			StrAccept = "Yes";
			RowCount = 2;


			StrConLoginUserFirstAndLastName = "LoginUser, LoginUser";
			StrConLoginMgr1FirstAndLastName = "LoginMgr1, LoginMgr1"; 
			StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_04_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_04_SprVsrApprovalTestData Is Fetched To Retrieve Data
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_083
			RMAApp_UserPrev_Txt_LoginUser_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_083", 1, 1); //Maximum Reserve Limit Amount For LoginUser Is Fetched From DataSheet RMA_TC_083
			RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_083", 1, 2); //Maximum Reserve Limit For LoginMgr1 User Name Is Fetched From DataSheet RMA_TC_083
			RMAApp_ReserveCreation_Txt_Med_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_083", 1, 3); //Reserve Amount Is Fetched From DataSheet RMA_TC_083
			RMAApp_ReserveCreation_Lst_Med_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 4); //Reserve Status Is Fetched From DataSheet RMA_TC_083
			RMAApp_ReserveCreation_Lnk_Med_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 5); //Reserve Type Is Fetched From DataSheet RMA_TC_083
			RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 6); //Reserve Status Is Fetched From DataSheet RMA_TC_083
			RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 7); //Reserve Type Is Fetched From DataSheet RMA_TC_083
			RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 8); //Reserve Type Is Fetched From DataSheet RMA_TC_083
			RMAApp_FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_083", 1, 9); //Reserve Amount Is Fetched From DataSheet RMA_TC_083
			RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 10); //Reserve Status Is Fetched From DataSheet RMA_TC_083
			RMAApp_FundsSplitDetails_Txt_Amount_1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_083", 1, 11); //Reserve Amount Is Fetched From DataSheet RMA_TC_083
			RMAApp_Payment_Txt_DistributionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_083", 1, 12); //Reserve Type Is Fetched From DataSheet RMA_TC_083
			RMAApp_FundsSplitDetails_Txt_Amount_2 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_083", 1, 13); //Reserve Amount Is Fetched From DataSheet RMA_TC_083

			/*---------------------------Logging In The Application With Credentials Of User Containing CSC In Its Name Is Started------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsercsc_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsercsc_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall6 = true;
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare( RMA_TC_UserCreationSASuite4_Updated.StrUsercsc_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*---------------------------Logging In The Application With Credentials Of User Containing CSC In Its Name Is Completed--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Assignment Of Payment Limits To Users Containing CSC And A1 In Their Names Is Started---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_MDIMenuClick("Security;User Privileges Setup", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page",0);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Reserve Limits", "Reserver Limits Tab On User Privileges Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Reserve Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "uncheck", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Reserve Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is UnChecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "deselect", "Enable Reserve Limits CheckBox",logval);
			//Check Box For Reserve Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Print Check Limits", "Print Check Limits Tab On User Privileges Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Print Check Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(driver), "uncheck", "Enable Print Check Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Print Check Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Print Check Limits CheckBox On RMA Application User Privilege SetUp Page's Printc Check Limits Tab Is UnChecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(driver), "deselect", "Enable Print Check Limits CheckBox",logval);
			//Check Box For Print Check Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Payment Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",logval);
			//Check Box For Payment Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(driver), "Pay Detail Limits Tab On RMA Application's User-Privileges SetUp Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As PayDetail Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "uncheck", "Enable Payment Detail Limits CheckBox",  "RMA Application's User Privileges SetUp Page's PayDetail Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Payment Detail Limits CheckBox On RMA Application User Privilege SetUp Page's PayDetail Limits Tab Is UnChecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "deselect", "Enable Payment Detail Limits CheckBox",logval);
			//Check Box For Pay Detail Limits Tab Is Unchecked 	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_ClaimLimits(driver), "Claim Limits Tab On User-Privileges SetUp Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Claim Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver), "uncheck", "Enable Claim Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Claim Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Claim Limits CheckBox On RMA Application User Privilege SetUp Page's Claim Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver), "deselect", "Enable Claim Limits CheckBox",logval);
			//Check Box For Claim Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_EventTypeLimits(driver), "Event Type Limits Tab On User-Privileges SetUp Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Event Type Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "uncheck", "Enable Event Type Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Event Type Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Event Type Limits CheckBox On RMA Application User Privilege SetUp Page's Event Type Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "deselect", "Enable Event Type Limits CheckBox",logval);
			//Check Box For Event Type Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Tab_PerClaimPayLimit(driver), "Per Claim Pay Limits Tab On User-Privileges SetUp Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Per Claim Pay Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "uncheck", "Enable Per Claim Pay Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Pay Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Per Claim Pay Limits CheckBox On RMA Application User Privilege SetUp Page's Per Claim Pay Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "deselect", "Enable Per Claim Pay Limits CheckBox",logval);
			//Check Box For Per Claim Pay Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits(driver), "Per Claim Incurred Limits Tab On User-Privileges SetUp Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Per Claim Incurred Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "uncheck", "Enable Per Claim Incurred Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Incurred Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Enable Per Claim Incurred Limits CheckBox On RMA Application User Privilege SetUp Page's Per Claim Incurred Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "deselect", "Enable Per Claim Incurred Limits CheckBox",logval);
			//Check Box For Per Claim Incurred Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);

			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , logval) > RowCount))
			{
				parentlogger.log(LogStatus.INFO, "Already Assigned Payment Limits To User loginuser Is Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , logval);
				//Row Count Fetched For User loginuser

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text loginuser", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Payment Limit Max Amount For User loginuser Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , logval);
				// Payment Limit Removed For User loginuser
			}

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Payment Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's Payment Limits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Payment Limit Max Amount For" + " " +  StrConLoginUserFirstAndLastName + " " + "Is Added");

			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), StrConLoginUserFirstAndLastName, 3, String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxAmt), "Payment Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For User" + " " +StrConLoginUserFirstAndLastName, StrScreenShotTCName)));
			// Payment Limit Is Added To User loginuser Above

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver),  StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);

			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , logval) > RowCount))
			{
				parentlogger.log(LogStatus.INFO, "Already Assigned Payment Limits To User loginuser Is Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , logval);
				//Row Count Fetched For User loginmgr1

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text loginmgr1", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Payment Limit Max Amount For User loginmgr1 Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , logval);
				// Payment Limit Removed For User loginmgr1
			}

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Payment Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's Payment Limits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Payment Limit Max Amount For User"+ " " + StrConLoginMgr1FirstAndLastName+ " "+" Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver),  StrConLoginMgr1FirstAndLastName, 3, String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxAmt), "Payment Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For User"+ " " +StrConLoginMgr1FirstAndLastName , StrScreenShotTCName)));
			// Payment Limit Is Added To User With Name Containing A1 Above

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "check", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "uncheck", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Restrict Unspecified User CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab is UnChecked
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Unchecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "select", "Enable Payment Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			//Select/De-select State Of The Enable Payment Limits CheckBox And Restrict Unspecified User CheckBox Is Verified

			driver.close();
			driver.switchTo().window(StrRMAWindowHandle);

			/*---------------------------Assignment Of Payment Limits To User Containing CSC And A1 In Their Names Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Started---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;Payment Parameter Setup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "uncheck", "Payment Detail Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Details Limits Are Exceeded Check Box Is Unchecked on Payment Parameter Setup Page				
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "uncheck", "Reserve Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Reserve Limits Are Exceeded Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "uncheck", "Incurred Limits Are Exceeded Check Box For Reserves", "Payment Parameter Setup Page",0); //Incurred Limits Are Exceeded CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "uncheck", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup Page",0); //Notify Immediate SuperVisor Check Box For reserves Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "uncheck", "Supervisory Approval Check Box For Reserves", "Payment Parameter Setup",0); //Supervisory Approval CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "check", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup Page",0); //Notify Immediate SuperVisor Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "check", "Supervisory Approval Check Box", "Payment Parameter Setup Page",0); //Supervisory Approval CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0); //Save image is clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "deselect", "Payment Detail Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "deselect", "Reserve Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "deselect", "Incurred Limits Are Exceeded Check Box For Reserves",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "deselect", "Notify Immediate SuperVisor For Reserves Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "deselect", "Use SuperVisory Approval For Reserves Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "select", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate SuperVisor Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "select", "Use SuperVisory Approval",0);
			//Required SuperVisory Approval Settings Are Saved In Payment Parameter Set Up Page

			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Completed---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------General Claim Creation Is Started --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_083 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_083
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_083, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			/*---------------------------General Claim Creation Is Completed -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Medical Reserve Of $100 And Its Going On Hold Verification Is Started ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim Expander On Left Hand Navigation Tree",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver), "Financial/Reserves Link On Left Hand Navigation Tree",0); //Created General Claim's Financial/Reserves Option Is Selected //Created General Claim's Financial/Reserves Option Is Selected
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Financial/Reserves Link On Left Hand Navigation Tree Is Selected");
			//Left Hand Navigation Tree Is Expanded And Financial/Reserves Link On Left Hand Navigation Tree Is Selected

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Expense Reserve");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_Med_ReserveAmount, RMAApp_ReserveCreation_Lst_Med_Status, 1, RMAApp_ReserveCreation_Lnk_Med_ReserveType, "No", "Not Required", "Open", "Not Required", "Not Required");
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//Medical Reserve Is Created And Its Going On Hold Is Verified

			/*---------------------------Creation Of Medical Reserve Of $100 And Its Going On Hold Verification Is Completed --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Payment Of $60 On The Created Reserves Is Started ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Add Payment Of $60");
			testcall6 = true;
			StrControlNumber_RMA_TC_083 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount, RMAApp_Payment_Txt_LastName, RMAApp_Payment_Txt_DistributionType, 1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_083, 2)+ " "+ "Is Done");
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//Payment Of Amount $60 Is Created

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Going On Hold Verification", StrScreenShotTCName)));

			/*---------------------------Creation Of Payment Of $60 On The Created Reserve Is Completed--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------User loginuser Is Logged Out And User loginmgr1 Is Logged In  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall7 = true;
			RMA_TC_002 dsnselection1 = new RMA_TC_002();
			dsnselection1.RMAApp_DSNSelection();
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User With Name Staring With A1 Is Successfully Logged In The Application  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Payment Of $60 Created By User loginuser Is Not Displayed To User loginmgr1 Is Started -------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment Of Amount $60 With Control Number" + " " + StrControlNumber_RMA_TC_083 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $60 Not Listed For LoginMgr1 Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_083, "Payment UXGrid On Supervisory Approval Page", logval);

			}

			/*-------------------------- Verification That Payment Of $60 Created By loginuser Is Not Displayed To User loginmgr1 Is Completed ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------User loginmgr1 Is Logged Out And User loginmgr2 Is Logged In  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall8 = true;
			RMA_TC_002 dsnselection2 = new RMA_TC_002();
			dsnselection2.RMAApp_DSNSelection();
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User loginmgr2 Is Successfully Logged In The Application  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Payment Of $60 loginuser Is Displayed To User loginmgr2 Is Started--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_083, "Payment UXGrid On Supervisory Approval", "$60.00", 6, logval);

			/*-------------------------- Verification That Payment Of $60 Created By User loginuser Is Displayed To User loginmgr2 Is Completed----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------User loginmgr2 Is Logged Out And User user4 Is Logged In  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera3_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera3_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall9 = true;
			RMA_TC_002 dsnselection3 = new RMA_TC_002();
			dsnselection3.RMAApp_DSNSelection();
			loggerval9 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera3_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User user4 Is Successfully Logged In The Application  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Payment Of $60 Created By User loginuser Is Not Displayed To User user4 Is Started -------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment Of Amount $60 With Control Number" + " " + StrControlNumber_RMA_TC_083 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $60 Not Listed For LoginMgr1 Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_083, "Payment UXGrid On Supervisory Approval Page", logval);
				//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			}

			/*-------------------------- Verification That Payment Of $60 Created By User loginuser Is Not Displayed To User user4 Is Completed ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/  
			/*---------------------------User user4 Is Logged Out And User loginuser Is Logged In  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsercsc_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsercsc_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall10 = true;
			RMA_TC_002 dsnselection4 = new RMA_TC_002();
			dsnselection4.RMAApp_DSNSelection();
			loggerval10 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare( RMA_TC_UserCreationSASuite4_Updated.StrUsercsc_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*---------------------------Logging In The Application With Credentials Of User Containing CSC In Its Name Is Completed--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Started---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;Payment Parameter Setup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "check", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup Page",0); //Notify Immediate SuperVisor Check Box For reserves Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0); //Save image is clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "select", "Notify Immediate SuperVisor Check Box",0);
			//Required SuperVisory Approval Settings Are Saved In Payment Parameter Set Up Page

			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------General Claim Creation Is Started ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
			testcall3 = true;
			RMA_TC_004 generalclaim_01 = new RMA_TC_004();
			StrClaimNumber_RMA_TC_083_01 = generalclaim_01.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_083_01
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_083_01, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			/*---------------------------General Claim Creation Is Completed --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Payment of $61 And Its Going On Hold Verification Is Started ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim Expander On Left Hand Navigation Tree",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver), "Financial/Reserves Link On Left Hand Navigation Tree",0); //Created General Claim's Financial/Reserves Option Is Selected //Created General Claim's Financial/Reserves Option Is Selected
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Financial/Reserves Link On Left Hand Navigation Tree Is Selected");
			//Left Hand Navigation Tree Is Expanded And Financial/Reserves Link On Left Hand Navigation Tree Is Selected

			int iteraor =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
			driver.switchTo().frame(iteraor); //A Switch To The Frame Containing Financial/Reserves Control Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As A Switch To Financial/Reserves Frame Is Done");
			//Switch To Financial Reserves Frame Is Done
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Create New Payment");

			testcall4 = true;
			StrControlNumber_RMA_TC_083_01 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_1, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_083_01, 2)+ " "+ "Is Done");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//New Payment Is Done

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Going On Hold Verification", StrScreenShotTCName)));

			/*---------------------------Creation Of Payment of $61 And Its Going On Hold Verification Is Completed-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Payment of $62 And Its Going On Hold Verification Is Started-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financial Image On Payment Creation Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, 0, "Wait Is Added As Back To Financials Image Is Clicked");

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Create New Payment");
			testcall5 = true;
			StrControlNumber_RMA_TC_083_02 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_2, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_083_02, 2)+ " "+ "Is Done");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Going On Hold Verification", StrScreenShotTCName)));

			/*---------------------------Creation Of Payment of $62 And Its Going On Hold Verification Is Completed------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------User loginuser Is Logged Out And User loginmgr2 Is Logged In  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall11 = true;
			RMA_TC_002 dsnselection5 = new RMA_TC_002();
			dsnselection5.RMAApp_DSNSelection();
			loggerval11 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User loginuser Is Successfully Out And User loginmgr2 Is Successfully Logged In The Application  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Payment Of $61 Created By User loginuser Is Not Displayed To User loginmgr2 Is Started --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment Of Amount $61 With Control Number" + " " + StrControlNumber_RMA_TC_083_01 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $60 Not Listed For LoginMgr2 Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_01, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_083_01, "Payment UXGrid On Supervisory Approval Page", logval);
			}

			/*-------------------------- Verification That Payment Of $61 Created By User loginuser Is Not Displayed To User loginmgr2 Is Completed  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			/*-------------------------- Verification That Payment Of $62 Created By User loginuser Is Not Displayed To User loginmgr2 In Its Name Is Started  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment Of Amount $62 With Control Number" + " " + StrControlNumber_RMA_TC_083_02 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $62 Not Listed For LoginMgr2 Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_02, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_083_02, "Payment UXGrid On Supervisory Approval Page", logval);
			}

			/*-------------------------- Verification That Payment Of $62 Created By User loginuser Is Not Displayed To User loginmgr2 Is Completed----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			/*---------------------------User loginmgr2 Is Logged Out And User loginmgr1 Is Logged In  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall12= true;
			RMA_TC_002 dsnselection6 = new RMA_TC_002();
			dsnselection6.RMAApp_DSNSelection();
			loggerval12 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User loginmgr1 Is Successfully Logged In And User loginmgr2 Is Logged Out ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Payment Of $61 Created By User loginuser Is Displayed To User loginmgr1 And Can Be Approved Is Started-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_01, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_083_01, "Payment UXGrid On Supervisory Approval", "$61.00", 6, logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver), "Payment Requires Supervisory Approval Message", logval);
			StrActualErrorMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver).getText();
			StrErrorMessageExpected = "Amount exceeds user's payment limit. It is submitted to User's manager for approval";
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrControlNumber_RMA_TC_083_01, StrActualErrorMessage, "Correct Control Number Display In Error Message",0);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Warning Message On Payment $61 Approval By loginmgr1 Verification", StrScreenShotTCName)));

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment Of Amount $61 With Control Number" + " " + StrControlNumber_RMA_TC_083_01 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $61 Not Listed After Rejection For LoginMgr1 Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_01, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_083_01, "Payment UXGrid On Supervisory Approval Page", logval);
			}
		
			/*-------------------------- Verification That Payment Of $61 Created By User loginuser Is Displayed To User loginmgr1 And Is Approved Is Completed--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Payment Of $62 Created By User loginuser Is Displayed To User loginmgr1 And Can Be Rejected Is Started---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_02, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_083_02, "Payment UXGrid On Supervisory Approval", "$62.00", 6, logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntReject(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntReject(driver), "Reject Image On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			//RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Lst_RsvRejectReason(driver), 2, "Payment Reject Reason List", "Supervisory Approval Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Add As Save Image On Supervisory Approval Page Is Clicked");
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");
			
			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Payment Of Amount $62 With Control Number" + " " + StrControlNumber_RMA_TC_083_02 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $62 Not Listed After Rejection For LoginMgr1 Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_02, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_083_02, "Payment UXGrid On Supervisory Approval Page", logval);
			}
		
			/*-------------------------- Verification That Payment Of $62 Created By User loginuser Is Displayed To User loginmgr1 And Can Be Rejected Is Completed----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------User loginmgr1 Is Logged Out And User loginmgr2 Is Logged In  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			// Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
			testcall13 = true;
			RMA_TC_002 dsnselection8 = new RMA_TC_002();
			dsnselection8.RMAApp_DSNSelection();
			loggerval13 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User loginmgr2 Is Successfully Logged In The Application  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*--------------------------  Verification That Payment Of $61 Created By User loginuser Is Displayed To User loginmgr2 Is Started----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/


			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_083_01, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_083_01, "Payment UXGrid On Supervisory Approval", "$61.00", 6, logval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPaymentColumnSelector(driver), "Columns Selector For Pending Payments Grid On Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant"), "Claimant Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date"), "Fund Date Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee"), "Payee Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount"), "Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount"), "Split Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type"), "Trans Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments"), "Comments Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By"), "Submitted By Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status"), "Claim Status Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business"), "Line Of Business Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Reserve Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Reserve Type"), "Reserve Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Service Dates")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Service Dates"), "Service Dates Column Selector Button For Pending Payments Grid On Supervisory Approval Page", logval);
			//Columns Are Unselected From My Pending Funds Transactions Grid

			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(StrControlNumber_RMA_TC_083_01, "Payment UXGrid On Supervisory Approval", RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4, 8, logval);

			/*-------------------------- Verification That Payment Of $61 Created By User Containing CSC In Its Name Is Displayed To User Containing A2 In Its Name Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Revert Of Settings Applied On Payment Parameter Set Up Page Is Started-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;Payment Parameter Setup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisory Approval Check Box", "Payment Parameter Setup",0); //Supervisory Approval CheckBox For Reserves Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0); //Save Image Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate SuperVisor Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Use SuperVisory Approval",0);
			//Required SuperVisory Approval Settings Are Saved In Payment Parameter Set Up Page
			driver.switchTo().parentFrame();
			/*-------------------------- Revert Of Settings Applied On Payment Parameter Set Up Page Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Removal Of Payment Limits Applied To User Containing CSC And A1 In Its Name Is Started-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			
			RMA_Navigation_Utility.RMA_MDIMenuClick("Security;User Privileges Setup", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text" + " " + StrConLoginUserFirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Payment Limit Max Amount For User" + " " + StrConLoginUserFirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Removal For User" + " " +StrConLoginUserFirstAndLastName + "Is Verified");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Removal Verification For User"+ " " +StrConLoginUserFirstAndLastName , StrScreenShotTCName)));
			//Payment Limits Provided To User With Name Containing CSC Are Removed

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text" + " " + RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Payment Limit Max Amount For User" + StrConLoginMgr1FirstAndLastName + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Removal For User" + " " +StrConLoginMgr1FirstAndLastName + "Is Verified");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Removal Verification For User"+ " " +StrConLoginMgr1FirstAndLastName , StrScreenShotTCName)));
			//Payment Limits Provided To User With Name Containing A1 Are Removed

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",0);

			/*-------------------------- Removal Of Reserve Limits Applied To User Containing CSC And A1 In Its Name Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			driver.close();
			driver.switchTo().window(StrRMAWindowHandle);

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Medical Reserve Of $1500"  + " " +  "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);
			}
			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Indemnity Reserve Of $2000"  + " " +  "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);
			}

			else if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Expense Reserve Of $1500" +" "+ "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);

			}

			else if ((testcall6 == true) && (loggerval6.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall7 == true) && (loggerval7.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall9 == true) && (loggerval9.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall8 == true) && (loggerval8.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall10 == true) && (loggerval10.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall11 == true) && (loggerval11.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall12 == true) && (loggerval12.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall13 == true) && (loggerval13.equalsIgnoreCase("NotInitialized")))
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

