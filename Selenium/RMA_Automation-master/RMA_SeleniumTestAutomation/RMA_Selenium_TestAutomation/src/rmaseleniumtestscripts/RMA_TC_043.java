package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
//RMA Package Import Completed


//===========================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_043
//Description    : Hold Of Created Payments When Payment Limits Are Exceeded Is Validated
//Depends On TC  : TC_042, TC_035
//Revision       : 0.0 - KumudNaithani-01-22-2016
//Modified By    : 0.1 - KumudNaithani-08-03-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching
//===========================================================================================================================================================================================================================================================================================================
public class RMA_TC_043 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	public static String StrClaimNumber_RMA_TC_043;
	public static String StrScreenShotTCName;
	
@Test 
public void RMA_TC_043_Test () throws Exception, Error 
//Verify Payments Can Be Created And Is Going On Hold Because Of Exceeded Payment Limits
{
	try {
		parentlogger = reports.startTest("TC_043_Hold Of Created Payments On Payments Limits Exceed", "Hold Of Created Payments When Payment Limits Are Exceeded Is Validated");
		String StrAccept;
		String RMAApp_Login_Txt_UserName;
		String RMAApp_Login_Txt_Password;
		String RMAApp_Payment_Lst_BankAccount;
		String RMAApp_Payment_Lst_PayeeType;
		String RMAApp_FundsSplitDetails_Lst_TransactionType;
		int RMAApp_FundsSplitDetails_Txt_Amount;
		String RMAApp_Payment_Txt_LastName;
		int RMAApp_FundsSplitDetails_Txt_Amount_1 ;
		String StrErrorMessageExpected;
		String StrActualErrorMessage;
		String StrActualCheckStatus;
		String StrExpectedCheckStatus;
		String LoginUserNameActual;
		String StrControlNumberExpected;
		String RMAApp_Login_Txt_Password_1;
		String RMAApp_Login_Txt_UserName_2;
		String RMAApp_Login_Txt_Password_2;
		String StrCheckStatusActual;
		String StrCheckStatusExpected;
		String RMAApp_Payment_Txt_DistributionType;
		String StrPrimaryWindowHandle;
		String StrControlNumber_RMA_TC_043;
		String StrControlNumber_RMA_TC_01_043;
		String ObjDescription;
		int ActualRowCount;
		String RMAApp_Login_Txt_UserName_1,RMAApp_UserPrev_Lst_LoginMgr1, RMAApp_UserPrev_Lst_LoginMgr2, RMAApp_UserPrev_Lst_LoginUser, RMAApp_UserPrev_Lst_LoginMgrGrp2, RMAApp_UserPrev_Lst_LOB,RMAApp_UserPrev_Lst_LoginMgrGrp1, RMAApp_UserPrev_Lst_LoginUsrGrp;

		//Local Variable Declaration
		
		StrAccept = "Yes";
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		loggerval3 = "NotInitialized";
		loggerval4 = "NotInitialized";
		loggerval5 = "NotInitialized";
		loggerval6 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		testcall3 = false;
		testcall4 = false; 
		testcall5 = false;
		testcall6 = false;
		
		StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";
		StrExpectedCheckStatus = "R Released";
		StrCheckStatusExpected = "R Released";
		StrScreenShotTCName = "TC_043";
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 6); //UserName Fetched From DataSheet RMA_TC_043
		RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 7); //Password Fetched From DataSheet RMA_TC_043
		RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 0); //Bank Account Is Fetched From DataSheet RMA_TC_043
		RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 1); // Payee Type Is Fetched From DataSheet RMA_TC_043
		RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_TC_043
		RMAApp_FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_043", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_043
		RMAApp_FundsSplitDetails_Txt_Amount_1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_043", 1, 5); //Amount For Second Payment Is Fetched From DataSheet RMA_TC_043
		RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 4); //LastName Is Fetched From DataSheet RMA_TC_043
		RMAApp_Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 8); //UserName Fetched From DataSheet RMA_TC_043
		RMAApp_Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 9); //Password Fetched From DataSheet RMA_TC_043
		RMAApp_Payment_Txt_DistributionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 10); //Distribution Type Is Fetched From DataSheet RMA_TC_043
		RMAApp_Login_Txt_UserName_2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 11); //UserName Fetched From DataSheet RMA_TC_043
		RMAApp_Login_Txt_Password_2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 11); //Password Fetched From DataSheet RMA_TC_043
        RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 19); //Line Of Business Name Is Fetched From DataSheet RMA_TC_043
		RMAApp_UserPrev_Lst_LoginUsrGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 18); // RMAApp_UserPrev_Lst_LoginUsrGrp Name Is Fetched From DataSheet RMA_TC_043
		RMAApp_UserPrev_Lst_LoginMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 16); // RMAApp_UserPrev_Lst_LoginMgrGrp1 Name Is Fetched From DataSheet RMA_TC_043
		RMAApp_UserPrev_Lst_LoginMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 17); // RMAApp_UserPrev_Lst_LoginMgrGrp2 Name Is Fetched From DataSheet RMA_TC_043
		RMAApp_UserPrev_Lst_LoginUser = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 13); // RMAApp_UserPrev_Lst_LoginUser Name Is Fetched From DataSheet RMA_TC_043
		RMAApp_UserPrev_Lst_LoginMgr1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 14); // RMAApp_UserPrev_Lst_LoginMgr1 Name Is Fetched From DataSheet RMA_TC_043
		RMAApp_UserPrev_Lst_LoginMgr2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_043", 1, 15); // RMAApp_UserPrev_Lst_LoginMgr2 Name Is Fetched From DataSheet RMA_TC_043
		
		//==============================================='LoginUser' Logging In Is Started==========================================================================================================================================================================================================================================================================
	    RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		//Application Is Logged Out
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName_2,0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password_2,0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
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
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName_2, LoginUserNameActual, "Correct UserName Display", 0);
		// Correct User Is Logged In Verification Is Done
		//==============================================='LoginUser' Logging In Is Completed==========================================================================================================================================================================================================================================================================
		
		//===============================================General Claim Creation Is Started=========================================================================================================================================================================================================================================================================	
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
		testcall1 = true;
		RMA_TC_004 generalClaim = new RMA_TC_004(); //General Claim Function Is Instantiated
		StrClaimNumber_RMA_TC_043 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber
		parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_043, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		// New Claim Is Created
		
		//===============================================General Claim Creation Is Completed=========================================================================================================================================================================================================================================================================	
		
		//===============================================Creation Of Two New Payments Is Started=========================================================================================================================================================================================================================================================================	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_RMA_TC_043), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_RMA_TC_043+" " +" On Left Navigation Tree", logval);
		parentlogger.log(LogStatus.INFO, "Created General Claim Is Expanded To Access The Menu Options");
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, "Financials"), "Financial/Reserves Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As FinancialReserves Link on Left Navigation Tree Is Clicked");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials");
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Create New Payment");
		
		testcall2 = true;
		StrControlNumber_RMA_TC_043 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_043, 2)+ " "+ "Is Done");
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		//New Payment Is Done
		
		StrActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrExpectedCheckStatus, StrActualCheckStatus, "Correct Check Status",0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financial Image On Payment Creation Page",0);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, 0, "Wait Is Added As Back To Financials Image Is Clicked");
		
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Create New Payment");
		testcall3 = true;
		StrControlNumber_RMA_TC_01_043 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_1, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_01_043, 2)+ " "+ "Is Done");
		loggerval3 = logger.toString();
		parentlogger.appendChild(logger);
		
		StrExpectedCheckStatus = "H Hold";
		StrActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrExpectedCheckStatus, StrActualCheckStatus, "Correct Check Status",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
		StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
		RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Going On Hold Verification", StrScreenShotTCName)));
		//===============================================Creation Of Two New Payments Is Completed=========================================================================================================================================================================================================================================================================	
		
		//==============================================='LoginMgr1' Logging In Is Started==========================================================================================================================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		//Application Is Logged Out
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
		// Application Is Logged In
		
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select The DataSource");
		testcall4 = true;
		RMA_TC_002 dsnselection_2 = new RMA_TC_002();
		dsnselection_2.RMAApp_DSNSelection();
		loggerval4 = logger.toString();
		parentlogger.appendChild(logger);
		//Data Source Is Selected
		
		LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName Display", 0);
		// Correct User Is Logged In Verification Is Done
		
		//==============================================='LoginMgr1' Logging In Is Completed===================================================================================================================================================================================================================================================================================================================================================================================================
		
		//==============================================Payment Created In TC_043 Approval Is Completed=======================================================================================================================================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); // A Switch To The Web Frame Containing Menu Options Is Made
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added  Payments View Is Loaded");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_01_043, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image Is Clicked On Payment Approval Window On Supervisory Approval Page");
		
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver)));
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver), "Payment Requires Supervisory Approval Message", logval);
		StrActualErrorMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver).getText();
		
		StrErrorMessageExpected = "Amount exceeds user's payment limit. It is submitted to User's manager for approval";
		StrControlNumberExpected = StrControlNumber_RMA_TC_01_043;
		RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
		RMA_Verification_Utility.RMA_PartialTextVerification(StrControlNumberExpected, StrActualErrorMessage, "Correct Control Number Display In Error Message",0);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Error Verification On Login Mgr1 Approval Of Payment", StrScreenShotTCName)));
		//==============================================Payment Created In TC_043 Approval Is Completed=======================================================================================================================================================================================================================================================================================================================================================================================
	
		//==============================================='LoginMgr2' Logging In Is Started==========================================================================================================================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		//Application Is Logged Out
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName_1, 0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password_1, 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
		// Application Is Logged In
		
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select The DataSource");
		testcall5 = true;
		RMA_TC_002 dsnselection_1 = new RMA_TC_002();
		dsnselection_1.RMAApp_DSNSelection();
		loggerval5 = logger.toString();
		parentlogger.appendChild(logger);
		//Data Source Is Selected
		
		LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName_1, LoginUserNameActual, "Correct UserName Display", 0);
		//Correct User Is Logged In Verification Is Done
		
		//==============================================='LoginMgr2' Logging In Is Completed==========================================================================================================================================================================================================================================================================
		
		//==============================================Payment Created In TC_043 Approval Is Completed=======================================================================================================================================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0"); // A Switch To The Web Frame Containing Menu Options Is Made
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
				
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added  Payments View Is Loaded");
				
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_01_043, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image Is Clicked On Payment Approval Window On Supervisory Approval Page");
		
		ObjDescription = "Control Number :" +" " + StrControlNumber_RMA_TC_01_043 +" " +"In Payment Approval Table On Approve Transactions Page";
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
		{
			ObjDescription  = "Payment with Control Number" + " " + StrControlNumber_RMA_TC_01_043 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
			parentlogger.log(LogStatus.INFO, ObjDescription);
		}
		else
		{
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", StrControlNumber_RMA_TC_01_043, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(StrControlNumber_RMA_TC_01_043, "Payment UXGrid On Supervisory Page", logval);
		}
		//==============================================Payment Created In TC_043 Approval Is Completed=======================================================================================================================================================================================================================================================================================================================================================================================
		
		//===============================================Verification Of The Approved Transaction Status Is Started ===================================================================================================================================================================================================================================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
		RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search_Funds", "Check Control Number Text Box", StrControlNumber_RMA_TC_01_043, StrControlNumber_RMA_TC_01_043, "Transaction", "num", 2, logval);
		StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);
		//Approved Transaction's Check Status Is Released Is Verified

		driver.switchTo().parentFrame();
		//===============================================Verification Of The Approved Transaction Status Is Completed ===================================================================================================================================================================================================================================================================================================================================================================================
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8), "Security Menu Option", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8,5), "Security-->User Privileges SetUp Menu Option", 0);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
		driver.manage().window().maximize();
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 0);
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), RMAApp_UserPrev_Lst_LoginUser,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
		//Row Count Fetched For LoginUser User
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginUser User", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For LoginUser User Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
		// Payment Limit Removed For LoginUser User
		
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), RMAApp_UserPrev_Lst_LoginMgr1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
		//Row Count Fetched For LoginMgr1 User
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr1 User", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For LoginMgr1 User Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
		// Payment Limit Removed For LoginMgr1 User
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), RMAApp_UserPrev_Lst_LoginMgr2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
		//Row Count Fetched For LoginMgr2 User
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr2 User", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For LoginMgr2 User Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
		// Payment Limit Removed For LoginMgr2 User
		
		RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Rdb_Groups(driver), "Group Radio Button On User-Privileges SetUp Page", 0);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
		//Row Count Fetched For LoginMgrGrp1 Group
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr1Group1", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp1 Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
		// Payment Limit Removed For LoginMgrGrp1 Group
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
		//Row Count Fetched For LoginMgrGrp2 Group
		
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr2Group2", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp2 Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
		//Payment Limit Removed For LoginMgrGrp2 Group
		
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginUsrGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
		//Row Count Fetched For LoginMgr Group
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginUserGroup", 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Limit Max Amount For LoginUsrGrp Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
		//Payment Limit Removed For LoginMgrGrp2 Group
		
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
		//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",0);
		driver.close();
		driver.switchTo().window(StrPrimaryWindowHandle);		
	} catch (Exception |Error e) {
		
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		
		else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $45"  + " " +  "And Hence Payment Was Not Successful");
		parentlogger.appendChild(logger);
		}
		
		else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $85"  + " " +  "And Hence Payment Was Not Successful");
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
		
		else if ((testcall6 == true) && (loggerval6.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		
		throw (e);
	}	
}

@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
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
		reports.endTest(logger); 
		reports.flush();
	}
}
}
