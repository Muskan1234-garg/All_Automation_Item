package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
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

/*================================================================================================
TestCaseId     : RMA_TC_050
Description    : Verify if"Restrict unspecified user" is checked then he should NOT be able to approve payment of any amount
Depends On TC  : TC_048
Revision       : 0.0 - ImteyazAhmad-02-01-2016
================================================================================================= */

public class RMA_TC_050_c extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;	
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_050_Test() throws Exception,Error
	{
		try
		{
			parentlogger = reports.startTest("TC_050_Payment Can Not Be Approved When Restrict Unspecified Users CheckBox Is Checked","Verify If Restrict Unspecified Users Is Checked Then He Should NOT Be Able To Approve Payment Of Any Amount.");

			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String LoginUserNameActual;
			String StrClaimNumber_050;
			String StrControlNum_050;
			String StrCheckStatusActual;
			String StrCheckStatusExpected;
			String StrActualErrorMessage;
			String StrErrorMessageExpected;
			String RMAApp_Login_Txt_UserName1;
			String RMAApp_Login_Txt_Password1;
			String LoginUserNameActual1;
			String StrPrimaryWindowHandle;
			String RMAApp_UserPrev_Lst_LOB;
			String RMAApp_UserPrev_Lst_LoginUser;
			int Resframeid;
			int ActualRowCount;
			//Local Variable Declaration Completed

			String StrAccept = "Yes";
			StrScreenShotTCName = "TC_050";
			StrCheckStatusExpected = "H Hold";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";

			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			testcall4 = false;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_01_SprVsrApprovalTestData Is Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 0); //UserName Fetched From DataSheet RMA_TC_050
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 1); //Password Fetched From DataSheet RMA_TC_050
			RMAApp_Login_Txt_UserName1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 2); //UserName Fetched From DataSheet RMA_TC_050
			RMAApp_Login_Txt_Password1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 3); //Password Fetched From DataSheet RMA_TC_050
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 4); //Line Of Business Name Is Fetched From DataSheet RMA_TC_050
			RMAApp_UserPrev_Lst_LoginUser = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 5); // RMAApp_UserPrev_Lst_LoginUser Name Is Fetched From DataSheet RMA_TC_050
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "DSN Selection Page is loaded");
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select A DSN :: RMA_TC_002 ");
			testcall1 = true;
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			// Data Source Is Selected 
			parentlogger.appendChild(logger);
			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "UserName", 0);
			//General Claim Function Is Instantiated
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A General Claim :: RMA_TC_004");
			testcall2 = true;
			RMA_TC_004 generalClaim = new RMA_TC_004(); 
			StrClaimNumber_050 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_047
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Claim, After TC_004 Is Called ,Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_050, 2));
			parentlogger.appendChild(logger);
			// New Claim Is Created	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "General Claim Expander", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5,0,"Wait Is Added As General Claim Expander Image Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver), "Financial Reserve Link on Left Navigation",0);// Financial Reserve is clicked		
			RMA_GenericUsages_Utility.RMA_StaticWait(4,0,"Wait Is Added As Financial Reserve Page Is Loaded");
			Resframeid = RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");	
			driver.switchTo().frame(Resframeid);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As  Switch To Financial Reserve Frame  Is Done");

			//PaymentAddition Function is instantiated 
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A Payment :: RMA_TC_006 ");
			testcall3 = true;
			RMA_TC_006 PaymentAdd = new RMA_TC_006();
			StrControlNum_050 = PaymentAdd.PaymentAddition();// Control Number is fetched and stored in variable StrControlNum_047
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "Control Number,After TC_006 Is Called, Is Generated::"+ " " + color.RMA_ChangeColor_Utility(StrControlNum_050, 2));
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);//Check the existence of supervisory approval message
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");//Supervisor Approval message is saved in variable .
			StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval."; 
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Payment Hold Message", 0);//Compare Actual and Expected Message
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Message Verification1", StrScreenShotTCName)));
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame(); //Swicth to Default Web Page is Done
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName1, 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password1, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "DSN Selection Page is loaded");
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select A DSN :: RMA_TC_002 ");
			testcall4 = true;
			dsnselection.RMAApp_DSNSelection();
			loggerval4 = logger.toString();
			// Data Source Is Selected 
			parentlogger.appendChild(logger);
			LoginUserNameActual1 = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName1, LoginUserNameActual1, "UserName", 0);			
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait is Added as Search Page is Loaded");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Search"));//A Switch To The Frame Containing Search Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As  Switch To Search Frame Is Done ");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Check Control Number Text Box On Search_Funds", StrControlNum_050, 0);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Funds Page", 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait is Added As Search Criteria Funds Page is Loaded");
			driver.switchTo().parentFrame();//
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As Switch To Search Criteria Funds Frame is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrControlNum_050, "Search Criteria Funds Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait is Added As Transaction Page is Loaded");
			driver.switchTo().parentFrame();//
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Transaction"));//A Switch To The Frame Containing Transaction Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As Switch To Transaction Frame Is Done ");
			StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_CheckStatusLookUp(driver), "CheckStatus Lookup Button On Transaction Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As CheckStatus Lookup Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Released", "CheckStatus Lookup Window" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait is Added As CheckStatus Selection Is Done");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As Switch To Current Window Is Done");
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Transaction"));//A Switch To The Frame Containing Transaction Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As Switch To Transaction Frame Is Done ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Image On Transaction Page",0);// Save Image Is Clicked On Transaction Page
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As Transaction Page Is Getting Saved");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);//Check the existence of supervisory approval message
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");//Supervisor Approval message is saved in variable .
			StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval."; 
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Payment Hold Message", 0);//Compare Actual and Expected Message
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Message Verification2", StrScreenShotTCName)));
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);			

			/*Settings are being reverted 	*/	
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 10), "Utilities Menu Option", 0); //Utilities is clicked 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 10,3), "Utilities-->System Parameter Setup Menu Option", 0);  //System Parameter Setup is clicked 
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Payment Parameter Set Up Option Is Not Visible");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 10,3,4), "Payment Parameter Setup Menu Option", 0);// Payment Parameter Setup is clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Payment Parameter Setup Page Is Loaded");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("ParameterSetupPayment")); //Switched to Payment Parameter Frame
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Payment Parameter Setup's Frame Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "Supervisor Approval Configuration Tab On Payment Parameter Setup Page", 0); //Supervisor Approval Configuration tab is clicked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits are exceeded CheckBox ", "Payment Parameter Setup Page",0);   // Checkbox "Payment Limits are exceeded" is checked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisor Approval CheckBox", "Payment Parameter Setup Page",0);  // Checkbox "Supervisor Approval" is checked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(driver), "uncheck", "Enable Payment Approval Diary CheckBox ", "Payment Parameter Setup Page",0); //Checkbox "Enable Payment Approval Diary " is checked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(driver), "uncheck", "Enable Payment Approval Email CheckBox", "Payment Parameter Setup Page",0); //Checkbox "Enable Payment Approval Email " is checked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor CheckBox", "Payment Parameter Setup Page",0); //Checkbox "Enable Payment Approval Email " is unchecked on Payment Parameter Setup
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image on Payment Parameter Setup Page", 0); //Save image is clicked 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Payment Parameter Setup Page is Saved");

			//Verify Settings are Reverted
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(driver), "deselect", "Enable Payment Approval Diary Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(driver), "deselect", "Enable Payment Approval Email Check Box",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box",0); 
			//Code to Revert Payment Parameter Setup settings is completed	
			
			//Below code is to revert user privileges settings
			
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8), "Security Menu Option On RMA Application Default View Page",0); //Security Menu Option Is Selected
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8,5), "Security-->User Privileges SetUp Menu Option On RMA Application Default View Page",0); //User Privileges Set Up Menu Option Is Selected
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added AsUser-Privileges SetUp  Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();
			parentlogger.log(LogStatus.INFO, "User-Privileges SetUp Page Of RMA Application Is Opened");
			//User-Privileges SetUp Page Of RMA Application Is Opened
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab On RMA Application's User-Privileges SetUp Page",0); 
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), RMAApp_UserPrev_Lst_LoginUser,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",0);
			ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 0);
			//Row Count Fetched For user4			
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text user4", 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp2 Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Limit Verification For User4", StrScreenShotTCName)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",0);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",0);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "deselect", "Restrict Unspecified Users CheckBox",0);
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			
		}catch(Exception|Error e)

		{	
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
			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);

			}
			else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_006: Payment Addition" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}	

			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
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
			StrScreenShotTCName = "TC_050_c";

			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);

			}

		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );

		}
		
		finally
		{
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
}
