package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
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
//TestCaseID     : RMA_TC_057
//Description    : Transaction Created In RMA_TC_052 Is Listed In Current Adjuster's List And On Approval Goes To His Manager Is Validated
//Depends On TC  : TC_064, TC_051, TC_052
//Revision       : 0.0 - KumudNaithani-02-04-2016
//Revision       : 0.0 - ImteyazAhmad-08-11-2016
//=================================================================================================

public class RMA_TC_057 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_057_Test () throws Exception, Error
	//Verify That Transaction Created In RMA_TC_052 Is Listed In Current Adjuster's List And On Approval Goes To His Manager
	{
		try {
			parentlogger = reports.startTest("TC_057_Transaction Is Listed In Current Adjuster's List", "Transaction Created In RMA_TC_052 Is Listed In Current Adjustor's List And On Approval Goes To His Manager Is Validated");
			String StrAccept;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String AttachedRecord;
			String AttachedRecord1;
			String TaskNameVal;
			String TaskName;
			String ParentRecord;
			String TaskNameVal1;
			String StrActualErrorMessage;
			String StrErrorMessageExpected;
			String StrControlNumberExpected;
			String StrLoginUserNameActual;
			//Local Variable Declaration

			StrAccept = "Yes";
			StrScreenShotTCName = "TC_057";
			AttachedRecord = "FUNDS:"+" "+RMA_TC_052.StrControlNumber_RMA_TC_052;
			//AttachedRecord = "FUNDS:"+" "+"0000181";
			AttachedRecord1 = "FUNDS:"+" "+RMA_TC_052.StrControlNumber_RMA_TC_01_052;
			//AttachedRecord1 = "FUNDS:"+" "+"0000181";
			TaskName = "Check On Hold";
			TaskNameVal = "Payments:"+" "+ RMA_TC_052.StrControlNumber_RMA_TC_052;
			//TaskNameVal = "Payments:"+" "+ "0000181";
			TaskNameVal1 = "Payments:"+" "+ RMA_TC_052.StrControlNumber_RMA_TC_01_052;
			//TaskNameVal1 = "Payments:"+" "+ "0000181";
			ParentRecord = "Claim:"+RMA_TC_052.StrClaimNumber_RMA_TC_052;
			//ParentRecord = "Claim:"+"GCBI2015000101";
			loggerval1 = "NotInitialized";
			testcall1 = false;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_02_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_057", 1, 0); //UserName Fetched From DataSheet RMA_TC_057
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_057", 1, 1); //Password Fetched From DataSheet RMA_TC_057
			//RMA_ExcelDataRetrieval_Utility ExcelTestData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			//String StrControlNumber_RMA_TC_013 = ExcelTestData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 10, 0); //Payment Control Number Is Fetched From Data Sheet RMA_TC_006
			//String StrClaimNumber_RMA_TC_013 = ExcelTestData.RMA_ExcelStringDataRead_Utility("RMA_TC_004", 10, 1); //Claim Number Is Fetched From Data Sheet RMA_TC_004

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select The DataSource");
			testcall1 = true;
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//Data Source Is Selected 

			StrLoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, StrLoginUserNameActual, "Correct UserName Display", 0);
			//Correct User Is Logged In Verification Is Done

			//===============================================Existence Of Payment Created In TC_052 In Diaries Page Validation Is Started========================================================================================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_DiaryRecordsCheck_Utility(AttachedRecord, 1, 7, 0, TaskName,  TaskNameVal, ParentRecord, "Not Required", "Not Required", false, logval);
			//RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiarieszDiaryListDiaryListDiary ListUI/Diaries/Diary ListFalse"); 
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_GridColumnSelector(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_GridColumnSelector(driver), "Column Selector For Diary List UX Grid On Diary List Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_ColumnSelectorRestore(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_ColumnSelectorRestore(driver), "Restore Icon Of Column Selector Table For Diary List UX Grid On Diary List Page", logval);
			
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_DiaryRecordsCheck_Utility(AttachedRecord1, 1, 7, 0, TaskName,  TaskNameVal1, ParentRecord, "Not Required", "Not Required", false, logval);
			driver.switchTo().parentFrame(); // A Switch To The Web Frame Containing Menu Options Is Made
			//Values In The Diaries Table Displayed In The Default RMA Application Page Are Verified
			//===============================================Existence Of Payment Created In TC_052 In Diaries Page Validation Is Completed=======================================================================================================================================================================================================================================================================================================================================================
			
			
			//==============================================Payment Created In TC_052 Approval Is Started==========================================================================================================================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_052.StrControlNumber_RMA_TC_052, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_TC_052.StrControlNumber_RMA_TC_052, "Payment UXGrid On Supervisory Approval", "$2,000.00", 7, logval);
//			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 4), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", logval);
//			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 4), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", RMA_TC_052.StrControlNumber_RMA_TC_052, logval);
//			//RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 4), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", "0000179", logval);
//			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver), "Payment Requires Supervisory Approval Message", logval);
			StrActualErrorMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver).getText();

			StrErrorMessageExpected = "Amount exceeds user's payment limit. It is submitted to User's manager for approval";
			StrControlNumberExpected = RMA_TC_052.StrControlNumber_RMA_TC_052;
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrControlNumberExpected, StrActualErrorMessage, "Correct Control Number Display In Error Message",0);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Error Message On Payment $2000 Approval By CurrAdj Verification", StrScreenShotTCName)));

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_052.StrControlNumber_RMA_TC_01_052, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_TC_052.StrControlNumber_RMA_TC_01_052, "Payment UXGrid On Supervisory Approval", "$2,500.00", 7, logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver), "Payment Requires Supervisory Approval Message", logval);
			StrActualErrorMessage = RMA_Selenium_POM_Home.RMAApp_Generic_ToastMessage(driver).getText();
			StrErrorMessageExpected = "Amount exceeds user's payment limit. It is submitted to User's manager for approval";
			StrControlNumberExpected = RMA_TC_052.StrControlNumber_RMA_TC_01_052;
			RMA_Verification_Utility.RMA_PartialTextVerification(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrControlNumberExpected, StrActualErrorMessage, "Correct Control Number Display In Error Message",0);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Error Message On Payment $2500 Approval By CurrAdj Verification", StrScreenShotTCName)));
			//==============================================Payment Created In TC_052 Approval Is Completed==========================================================================================================================================================================================================================================================================================================================================================================================

		
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
