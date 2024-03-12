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
//TestCaseID     : RMA_TC_081
//Description    : TC_081_ Hold Handling In Case Of Reserve Limit With Notify Immediate Manager Setting Applied Is Validated
//Depends On TC  : TC_UserCreationSASuite4_Updated 
//Revision       : 0.0 - KumudNaithani-04-06-2016 
//Revision       : 0.1 - ImteyazAhmad-08-22-2016 
//=================================================================================================

public class RMA_TC_081 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test 
	public void RMA_TC_081_Test () throws Exception, Error 
	//Verify Hold Handling In Case Of Reserve Limit With Notify Immediate Manager Setting Applied
	{
		parentlogger = reports.startTest("TC_081_Hold Handling For Reserve Limit With Notify Immediate Manager Setting", "Hold Handling In Case Of Reserve Limit With Notify Immediate Manager Setting Applied Is Validated");
		parentlogger.assignAuthor("Kumud Naithani");
		try {

			String RMAApp_UserPrev_Lst_LOB;
			int RMAApp_UserPrev_Txt_LoginUser_MaxResAmt;
			String RMAApp_UserPrev_Lst_ReserveType;
			int RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt;
			String StrAccept;
			String StrExpErrMessage;
			String LoginUserNameActual;
			int RMAApp_ReserveCreation_Txt_ExpReserveAmount;
			int RMAApp_ReserveCreation_Txt_IndemReserveAmount;
			int RMAApp_ReserveCreation_Txt_Exp_01_ReserveAmount;
			String RMAApp_ReserveCreation_Lst_ExpStatus;
			String RMAApp_ReserveCreation_Lst_Exp_01_Status;
			String RMAApp_ReserveCreation_Lst_IndemStatus;
			String RMAApp_ReserveCreation_Lnk_ExpReserveType;
			String RMAApp_ReserveCreation_Lnk_IndemReserveType;
			String RMAApp_ReserveCreation_Lnk_Exp_01_ReserveType;
			String StrClaimNumber_RMA_TC_081;
			String Strlogstatement;
			String Strlogstatement_01;
			int ActualRowCount;
			String StrConLoginUserFirstAndLastName;
			String StrConLoginMgr1FirstAndLastName;
			String StrClaimNumber_RMA_TC_081_01;
			String StrActualErrorMessage;
			String StrErrorMessageExpected;
			//String StrErrorMessageExpected_01;
			int RowCount;

			//Local Variable Declaration

			StrScreenShotTCName = "TC_081";
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
			testcall6 = false;
			StrAccept = "Yes";
			RowCount = 2;

			StrConLoginUserFirstAndLastName = "LoginUser, LoginUser";
			StrConLoginMgr1FirstAndLastName = "LoginMgr1, LoginMgr1"; 
			StrExpErrMessage = "Exceeded Reserve Limit";
			//StrErrorMessageExpected_01 = "Exceed Reserve Limit";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_04_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_04_SprVsrApprovalTestData Is Fetched To Retrieve Data
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_081
			RMAApp_UserPrev_Txt_LoginUser_MaxResAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_081", 1, 1); //Maximum Reserve Limit Amount For LoginUser Is Fetched From DataSheet RMA_TC_081
			RMAApp_UserPrev_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 2); //Reserve Type For LoginUser Is Fetched From DataSheet RMA_TC_081
			RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_081", 1, 3); //Maximum Reserve Limit For LoginMgr1 User Name Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Txt_Exp_01_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_081", 1, 4); //Reserve Amount Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Lst_Exp_01_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 5); //Reserve Status Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Lnk_Exp_01_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 6); //Reserve Type Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Txt_IndemReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_081", 1, 7); //Reserve Amount Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Lst_IndemStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 8); //Reserve Status Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Lnk_IndemReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 9); //Reserve Type Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Txt_ExpReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_081", 1, 10); //Reserve Amount Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Lst_ExpStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 11); //Reserve Status Is Fetched From DataSheet RMA_TC_081
			RMAApp_ReserveCreation_Lnk_ExpReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 12); //Reserve Type Is Fetched From DataSheet RMA_TC_081

			/*---------------------------Logging In The Application With User loginuser Is Started------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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

			/*---------------------------Logging In The Application With User-loginuser- Is Completed--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Assignment Of Reserve Limits To Users - loginuser And loginmgr1- Is Started---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_Navigation_Utility.RMA_MDIMenuClick("Security;User Privileges Setup", logval);

			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page",0);

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
			//Check Box For Claim Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_EventTypeLimits(driver), "Event Type Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "uncheck", "Enable Event Type Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Event Type Limits Tab",logval);//Enable Event Type Limits CheckBox On RMA Application User Privilege SetUp Page's Event Type Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "deselect", "Enable Event Type Limits CheckBox",logval);
			//Check Box ForEvent Type Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Tab_PerClaimPayLimit(driver), "Per Claim Pay Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "uncheck", "Enable Per Claim Pay Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Pay Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "deselect", "Enable Per Claim Pay Limits CheckBox",logval);
			//Check Box For Per Claim Pay Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits(driver), "Per Claim Incurred Limits Tab On User-Privileges SetUp Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "uncheck", "Enable Per Claim Incurred Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Incurred Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "deselect", "Enable Per Claim Incurred Limits CheckBox",logval);
			//Check Box For Per ClaimIncurred Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Reserve Limits", "Reserver Limits Tab On User Privileges Setup Page", 0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);

			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , logval) > RowCount))
			{
				parentlogger.log(LogStatus.INFO, "Already Assigned Reserve Limits To loginuser Is Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , logval);
				//Row Count Fetched For loginuser

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User loginuser", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Reserve Limit Max Amount For User loginuser"+"Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			}

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Lst_ReserveType(driver), RMAApp_UserPrev_Lst_ReserveType,"Reserve Type List Box","RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab",0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Txt_MaxAmount(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxResAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's ReserveLimits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Reserve Limit Max Amount For" + " " + StrConLoginUserFirstAndLastName+ " " + "Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginUserFirstAndLastName, 3, RMAApp_UserPrev_Lst_ReserveType, "Reserve Limits Grid Table",0);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginUserFirstAndLastName, 5, String.valueOf(RMAApp_UserPrev_Txt_LoginUser_MaxResAmt), "Reserve Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Verification For User"+ " "+ StrConLoginUserFirstAndLastName, StrScreenShotTCName)));
			// Reserve Limit Is Added To User loginuser

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);

			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , logval) > RowCount))
			{
				parentlogger.log(LogStatus.INFO, "Already Assigned Reserve Limits To loginuser Is Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , logval);
				//Row Count Fetched For loginuser

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User loginuser", logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Reserve Limit Max Amount For User loginuser"+"Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			}

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Lst_ReserveType(driver), RMAApp_UserPrev_Lst_ReserveType,"Reserve Type List Box","RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab",0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Txt_MaxAmount(driver), "Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Reserve Limits Tab", String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt),0);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Add(driver), "Add Button On RMA Application's User-Privileges SetUp Page's ReserveLimits Tab",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Reserve Limit Max Amount For User" + " "+ StrConLoginMgr1FirstAndLastName+ "Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginMgr1FirstAndLastName, 3, RMAApp_UserPrev_Lst_ReserveType, "Reserve Limits Grid Table",0);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), StrConLoginMgr1FirstAndLastName, 5, String.valueOf(RMAApp_UserPrev_Txt_LoginMgr1User_MaxResAmt), "Reserve Limits Grid Table",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Verification For User"+ " "+ StrConLoginMgr1FirstAndLastName, StrScreenShotTCName)));
			// Reserve Limit Is Added To User loginmgr1 Above

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "check", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",0);
			//Enable Reserve Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Enable Reserve Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(driver), "uncheck", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",0);
			//Restrict Unspecified User CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab is Unchecked
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Unchecked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "select", "Enable Reserve Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			//Select/De-select State Of The Enable Reserve Limits CheckBox And Restrict Unspecified User CheckBox Is Verified		
			driver.close();
			driver.switchTo().window(StrRMAWindowHandle);

			/*---------------------------Assignment Of Reserve Limits To Users -loginuser And loginmgr1- Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Started---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_MDIMenuClick("Utilities;System Parameters;Payment Parameter Setup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "uncheck", "Payment Detail Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Payment Limits Are Exceeded Check Box Is Unchecked on Payment Parameter Setup Page		
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisory Approval Check Box", "Payment Parameter Setup Page",0);      // Supervisory Approval CheckBox Is Unchecked On Payment Parameter Set Up Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "uncheck", "Incurred Limits Are Exceeded Check Box For Reserves", "Payment Parameter Setup",0); //Incurred Limits Are Exceeded CheckBox For Reserves Check Box Is Unchecked on Payment Parameter Setup Page		
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "check", "Reserve Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Reserve Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "uncheck", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup Page",0); //Notify Immediate SuperVisor Check Box For reserves Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "check", "Supervisory Approval Check Box For Reserves", "Payment Parameter Setup Page",0); //Supervisory Approval CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0);//Save image is clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "deselect", "Payment Detail Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "deselect", "Incurred Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "select", "Reserve Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "deselect", "Notify Immediate SuperVisor For Reserves Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "select", "Use SuperVisory Approval For Reserves Check Box",0);
			//Required SuperVisory Approval Settings Are Saved In Payment Parameter Set Up Page
			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Completed---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			/*---------------------------General Claim Creation Is Started --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_081 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_081
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_081, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			/*---------------------------General Claim Creation Is Completed -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Expense Reserve Of $250 And Its Going On Hold Verification Is Started ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim Expander On Left Hand Navigation Tree",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver), "Financial/Reserves Link On Left Hand Navigation Tree",0); //Created General Claim's Financial/Reserves Option Is Selected //Created General Claim's Financial/Reserves Option Is Selected
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Financial/Reserves Link On Left Hand Navigation Tree Is Selected");
			//Left Hand Navigation Tree Is Expanded And Financial/Reserves Link On Left Hand Navigation Tree Is Selected

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Expense Reserve Of Amount $250");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_Exp_01_ReserveAmount, RMAApp_ReserveCreation_Lst_ExpStatus, 1, RMAApp_ReserveCreation_Lnk_ExpReserveType, "Yes", StrExpErrMessage, "Hold", "Complete", "Added Expense Reserve Going On Hold Error Message");
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			//Expense Reserve Is Created And Its Going On Hold Is Verified


			/*---------------------------Creation Of Expense Reserve Of $250 And Its Going On Hold Verification Is Completed --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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

			/*-------------------------- User loginmgr1 Is Successfully Logged In The Application  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Expense Reserve Created By User loginmgr1 Is Started, Is Not Displayed To User loginmgr1 -------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Expense Reserve Of Amount $250 With Claim Number" + " " + StrClaimNumber_RMA_TC_081 + " " + "Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of Expense Reserve For Claim" + " " + StrClaimNumber_RMA_TC_081 + " " + "Of Amount $250 For A1 User Verification", StrScreenShotTCName)));
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_081, "Reserve UXGrid On Supervisory Page", logval);
			}
			
			/*-------------------------- Verification That Expense Reserve Created By User loginuser Is Not Displayed To User loginmgr1 Is Completed ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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
			/*-------------------------- Verification That Expense Reserve Created By User loginuser Is Displayed To User loginmgr2 Is Started --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(StrClaimNumber_RMA_TC_081, "ReserveUX Grid On Supervisory Approval Page", "E Expense", 3, "$250.00", 4, logval);
			
			/*-------------------------- Verification That Expense Reserve Created By User loginuser Is Visible To User loginmgr2 Is Completed ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Expense Reserve Of Amount $250 With Claim Number" + " " + StrClaimNumber_RMA_TC_081 + " " + "Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of Expense Reserve For Claim" + " " + StrClaimNumber_RMA_TC_081 + " " + "Of Amount $250 For A3 User Verification", StrScreenShotTCName)));
			}
			else
				
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_081, "Reserve UXGrid On Supervisory Page", logval);
			}

			/*-------------------------- Verification That Expense Reserve Created By User loginuser Is Not Displayed To User user4 Is Completed ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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
			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Started-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "check", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup Page",0); //Notify Immediate SuperVisor Check Box For reserves Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0);//Save image is clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "select", "Notify Immediate SuperVisor For Reserves Check Box",0);
			//Required SuperVisory Approval Settings Are Saved In Payment Parameter Set Up Page

			/*---------------------------Selection Of Required Settings In Payment Parameter SetUp Page Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------General Claim Creation Is Started ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
			testcall3 = true;
			RMA_TC_004 generalclaim_01 = new RMA_TC_004();
			StrClaimNumber_RMA_TC_081_01 = generalclaim_01.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_081_01
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_081_01, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			/*---------------------------General Claim Creation Is Completed --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Indemnity Reserve Of $233 And Its Going On Hold Verification Is Started ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim Expander On Left Hand Navigation Tree",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver), "Financial/Reserves Link On Left Hand Navigation Tree",0); //Created General Claim's Financial/Reserves Option Is Selected //Created General Claim's Financial/Reserves Option Is Selected
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Financial/Reserves Link On Left Hand Navigation Tree Is Selected");
			//Left Hand Navigation Tree Is Expanded And Financial/Reserves Link On Left Hand Navigation Tree Is Selected

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Indemnity Reserve Of Amount $233");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_IndemReserveAmount, RMAApp_ReserveCreation_Lst_IndemStatus, 1, RMAApp_ReserveCreation_Lnk_IndemReserveType, "Yes", StrExpErrMessage, "Hold", "Complete", "Added Expense Reserve Going On Hold Error Message");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			//Indemnity Reserve Is Created And Its Going On Hold Is Verified

			/*---------------------------Creation Of Indemnity Reserve Of $233 And Its Going On Hold Verification  Is Completed-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*---------------------------Creation Of Expense Reserve Of $222 And Its Going On Hold Verification Is Started-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ReserveAddition_Utility To Add Expense Reserve Of Amount $222");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_ReserveAddition_Utility(RMAApp_ReserveCreation_Txt_ExpReserveAmount, RMAApp_ReserveCreation_Lst_Exp_01_Status, 1, RMAApp_ReserveCreation_Lnk_Exp_01_ReserveType, "Yes", StrExpErrMessage, "Hold", "Complete", "Added Expense Reserve Going On Hold Error Message");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			//Expense Reserve Is Created And Its Going On Hold Is Verified

			/*---------------------------Creation Of Expense Reserve Of $222 And Its Going On Hold Verification Is Completed------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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
			/*-------------------------- Verification That Expense And Indemnity Reserve Created By User loginuser Is Not Displayed To User loginmgr2 Is Started -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Expense Reserve Of Amount $222 With Claim Number" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of Expense Reserve For Claim" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "Of Amount $222 For A2 User Verification", StrScreenShotTCName)));
				Strlogstatement_01  = "Indemnity Reserve Of Amount $233 With Claim Number" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement_01);
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of Indemnity Reserve For Claim" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "Of Amount $233 For A2 User Verification", StrScreenShotTCName)));

			}
			else
			{
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081_01, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "Reserve UXGrid On Supervisory Page", logval);
				
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Indemnity", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "Reserve UXGrid On Supervisory Page", logval);
			
			}

			/*-------------------------- Verification That Expense And Indemnity Reserve Created By User loginuser Is Not Displayed To User loginmgr2 Is Completed -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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
			testcall12 = true;
			RMA_TC_002 dsnselection6 = new RMA_TC_002();
			dsnselection6.RMAApp_DSNSelection();
			loggerval12 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera1_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User loginmgr1 Is Successfully Logged In And User loginmgr2 Is Logged Out ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Indemnity Reserve Created By User loginuser Is Displayed To User loginmgr1 And Can Be Approved Is Started -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081_01, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Indemnity", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			Strlogstatement  = "Indemnity Reserve Of Amount $233 With Claim Number" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "In Reserve UXGrid On Supervisory Approval Page";
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "ReserveUX Grid On Supervisory Approval Page", "I Indemnity", 3, "$233.00", 4, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark(driver), "Claim Number Selection Tick Mark Arrow On Reserve Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResApprove(driver), "Approve Image On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver), "Reserve Requires Supervisory Approval Message", logval);
			StrActualErrorMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver).getText();
			StrErrorMessageExpected = "Reserve Type: Indemnity, Amount exceeds user's reserve limit";
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Partial Error Message Display",0);
			//RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected_01, StrActualErrorMessage, "Correct Partial Error Message Display",0);
			StrErrorMessageExpected = StrClaimNumber_RMA_TC_081_01;
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Indemnity Reserve Of Amount $233 With Claim Number" + " " + StrClaimNumber_RMA_TC_081_01 + " " + " Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of Indemnity Reserve For Claim" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "Of Amount $233 For A2 User Verification", StrScreenShotTCName)));

			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081_01, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Indemnity", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "Reserve UXGrid On Supervisory Page", logval);
			}

			
			/*-------------------------- Verification That Indemnity Reserve Created By User loginuser Is Displayed To User loginmgr1 And Can Be Approved Is Completed -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Expense Reserve Created By User loginuser  Is Displayed To User loginmgr1 And Can Be Rejected Is Started ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081_01, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "ReserveUX Grid On Supervisory Approval Page", "E Expense", 3, "$222.00", 4, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXRsvPymntGridFilterRowSelectorMark(driver), "Claim Number Selection Tick Mark Arrow On Reserve Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResReject(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_ResReject(driver), "Reject Image On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Lst_RsvRejectReason(driver), 2, "Reserve Reject Reason List", "Supervisory Approval Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_ReserveNoRecordsAvailable(driver).isDisplayed() )
			{
				Strlogstatement  = "Expense Reserve Of Amount $222 With Claim Number" + " " + StrClaimNumber_RMA_TC_081_01 + " " + " Does Not Exist In Reserve UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.INFO, Strlogstatement);
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of Expense Reserve For Claim" + " " + StrClaimNumber_RMA_TC_081_01 + " " + "Of Amount $222 For A2 User Verification", StrScreenShotTCName)));

			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081_01, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Expense", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "Reserve UXGrid On Supervisory Page", logval);
			}

			/*-------------------------- Verification That Expense Reserve Created By User loginuser Is Displayed To User loginmgr1 And Can Be Rejected Is Completed ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
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
			RMA_TC_002 dsnselection7 = new RMA_TC_002();
			dsnselection7.RMAApp_DSNSelection();
			loggerval13 = logger.toString();
			parentlogger.appendChild(logger);
			// Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_UserCreationSASuite4_Updated.StrUsera2_TC_UserCreationSASuite4, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done

			/*-------------------------- User loginmgr2 Is Successfully Logged In The Application  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Verification That Indemnity Reserve Created By User loginuser Is Displayed To User loginmgr2 Is Started----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Reserve(driver), "Reserve Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Reserve View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 1), "Claim Number Filter TextBox On Reserve Tab  On Supervisory Approval Page", StrClaimNumber_RMA_TC_081_01, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Claim Number Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 3), "Reserve Type Filter TextBox On Reserve Tab  On Supervisory Approval Page", "Indemnity", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Reserve Type Value Is Set In Filter TextBox In Reserve Tab On Supervisory Approval Page");
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(StrClaimNumber_RMA_TC_081_01, "ReserveUX Grid On Supervisory Approval Page", "I Indemnity", 3, "$233.00", 4, logval);
			//Indemnity Reserve Of Amount $233 Exists Is Verified

			/*-------------------------- Verification That Indemnity Reserve Created By User loginuser Is Displayed To User loginmgr2 Is Completed----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Revert Of Settings Applied On Payment Parameter Set Up Page Is Started-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "uncheck", "Reserve Limits Are Exceeded Check Box", "Payment Parameter Setup Page",0);   // Reserve Limits Are Exceeded Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "uncheck", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup",0); //Notify Immediate SuperVisor Check Box For reserves Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "uncheck", "Supervisory Approval Check Box For Reserves", "Payment Parameter Setup",0); //Supervisory Approval CheckBox For Reserves Check Box Is Unchecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Set Up Page",0);//Save Image Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "deselect", "Reserve Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "deselect", "Notify Immediate SuperVisor For Reserves Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "deselect", "Use SuperVisory Approval For Reserves Check Box",0);
			driver.switchTo().parentFrame();
			/*-------------------------- Revert Of Settings Applied On Payment Parameter Set Up Page Is Completed-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			/*-------------------------- Removal Of Reserve Limits Applied To User -loginuser And loginmgr1 Is Started-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			
			RMA_Navigation_Utility.RMA_MDIMenuClick("Security;User Privileges Setup", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginUserFirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginUserFirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Reserve Limit Max Amount For"+ " " + StrConLoginUserFirstAndLastName+ " " + "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Reserve Limit Removal For User" + " " +StrConLoginUserFirstAndLastName + "Is Verified");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Removal Verification For User"+ " " +StrConLoginUserFirstAndLastName , StrScreenShotTCName)));
			//Reserve Limits Provided To User With Name Containing CSC Are Removed

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), StrConLoginMgr1FirstAndLastName,"User/Group List Box","RISKMASTER User-Privileges SetUp Page",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, 0, false, false, "Reserve Limits Grid Table" , 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevResLimit_Rdb_ReserveLimitsGridRadioButton(driver), "RadioButton Corresponding to User"+ " " + StrConLoginMgr1FirstAndLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Btn_Remove(driver), "Remove Button For Reserve Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Reserve Limit Max Amount For"+ " " + StrConLoginMgr1FirstAndLastName+ "Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Tbl_ReserveLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Reserve Limits Grid Table" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Reserve Limit Removal For User" + " " +StrConLoginMgr1FirstAndLastName + "Is Verified");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Limit Removal Verification For User"+ " " +StrConLoginMgr1FirstAndLastName , StrScreenShotTCName)));
			//Reserve Limits Provided To User With Name Containing A1 Are Removed

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "uncheck", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Enable Reserve Limits CheckBox On RMA Application User Privilege SetUp Page's Reserve Limits Tab Is Checked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "deselect", "Enable Reserve Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_RestUnspcfdUsers(driver), "deselect", "Restrict Unspecified Users CheckBox",0);

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Expense reserve Of $250"  + " " +  "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);
			}
			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Indemnity Reserve Of $233"  + " " +  "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);
			}

			else if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Expense Reserve Of $222" +" "+ "And Hence Reserve Creation Was Not Successful");
				parentlogger.appendChild(logger);

			}
			else if ((testcall9 == true) && (loggerval9.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall7 == true) && (loggerval7.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall6 == true) && (loggerval6.equalsIgnoreCase("NotInitialized")))
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

