package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

/*================================================================================================
TestCaseId     : RMA_TC_049
Description    :Verify if"Restrict unspecified user" is checked then payment made by this user should go on hold as his limit is now $0
Depends On TC  : TC_048,TC_035
Revision       : 0.0 - ImteyazAhmad-01-29-2016
================================================================================================= */

public class RMA_TC_049 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;	
	static String StrScreenShotTCName;
	

	@Test
	public void RMA_TC_049_Test() throws Exception,Error
	{
		try
		{
			parentlogger = reports.startTest("TC_049_Payment Goes On Hold When Restrict Unspecified User ChecckBox Is Checked ","Verify If Restrict Unspecified Users CheckBox Is Checked Then Payment Made By This User Should Go On Hold As His Limit Is Now $0");

			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String LoginUserNameActual;
			String StrClaimNumber_049;
			String StrControlNum_049;
			String StrCheckStatusActual;
			String StrCheckStatusExpected;
			String StrActualErrorMessage;
			String StrErrorMessageExpected;
			String StrScreenShotTCName;
			int Resframeid;
			//Local Variable Declaration Completed

			String StrAccept = "Yes";
			StrScreenShotTCName = "TC_049";
			StrCheckStatusExpected = "H Hold";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_01_SprVsrApprovalTestData Is Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 0); //UserName Fetched From DataSheet RMA_TC_049
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 1); //Password Fetched From DataSheet RMA_TC_049
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
			StrClaimNumber_049 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_047
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Claim, After TC_004 Is Called ,Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_049, 2));
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
			StrControlNum_049 = PaymentAdd.PaymentAddition();// Control Number is fetched and stored in variable StrControlNum_047
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "Control Number,After TC_006 Is Called, Is Generated::"+ " " + color.RMA_ChangeColor_Utility(StrControlNum_049, 2));
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);//Check the existence of supervisory approval message
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");//Supervisor Approval message is saved in variable .
			StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval."; 
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Payment Hold Message", 0);//Compare Actual and Expected Message
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Message Verification", StrScreenShotTCName)));
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);

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
			
			throw (e);	
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result) throws Exception,Error //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {
			String TestCaseName;
			StrScreenShotTCName = "TC_049";

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
