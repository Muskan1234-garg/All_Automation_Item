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
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed


//================================================================================================
//TestCaseID     : RMA_TC_069
//Description    : Hold Transaction Created In RMA_TC_066 Is Not Listed In Login Adjuster List Is Validated
//Dependent On TC: TC_064, TC_065, TC_066
//Revision       : 0.0 - ImteyazAhmad-02-05-2016 
//=================================================================================================

public class RMA_TC_069 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_069_Test () throws Exception, Error

	{
		try {
			parentlogger = reports.startTest("TC_069_Hold Transaction Not Listed In Current Adjuster's List", "Hold Transaction Created In RMA_TC_066 Is Not Listed In Current Adjuster's List Is Validated");
			String StrAccept;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String LoginUserNameActual;
			String Strlogstatement;
			//Local Variable Declaration

			StrAccept = "Yes";
			loggerval1 = "NotInitialized";
			testcall1 = false;
			StrScreenShotTCName = "TC_069";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_02_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_069", 1, 0); //UserName Fetched From DataSheet RMA_TC_069
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_069", 1, 1); //Password Fetched From DataSheet RMA_TC_069
			//RMA_ExcelDataRetrieval_Utility ExcelTestData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			//String StrControlNumber_RMA_TC_013 = ExcelTestData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 10, 0); //Payment Control Number Is Fetched From Data Sheet RMA_TC_006

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
			testcall1 = true;
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//Data Source Is Selected 

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done
			//===============================================Non Existence Of Payment Created In TC_066 In SuperVisory Approval Page Validation Is Started==========================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Payments View Is Loaded");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{				
				Strlogstatement  = "Record With Control Number" + " " + RMA_TC_066.StrControlNumber_RMA_TC_066_01 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.PASS, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $2500 Not Listed For Curradj Verification", StrScreenShotTCName)));
				Strlogstatement  = "Record With Control Number" + " " + RMA_TC_066.StrControlNumber_RMA_TC_066 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				parentlogger.log(LogStatus.PASS, Strlogstatement);
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment $2000 Not Listed For Curradj Verification", StrScreenShotTCName)));
				
			}

			else
			{
		
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_066.StrControlNumber_RMA_TC_066_01, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(RMA_TC_066.StrControlNumber_RMA_TC_066_01, "Payment UXGrid On Supervisory Approval Page", logval);
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_066.StrControlNumber_RMA_TC_066, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(RMA_TC_066.StrControlNumber_RMA_TC_066, "Payment UXGrid On Supervisory Approval Page", logval);
			}
			//===============================================Non Existence Of Payment Created In TC_066 In SuperVisory Approval Page Validation Is Completed=========================================================================================================================================================================================================================================================================

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
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
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
