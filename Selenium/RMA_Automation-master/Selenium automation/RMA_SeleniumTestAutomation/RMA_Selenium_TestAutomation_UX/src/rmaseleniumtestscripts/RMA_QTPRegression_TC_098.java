package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_CustomPayNotification;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_098
//Description    : Verification Of View Custom Payment Notification
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-12-18-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_098 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_098_Test() throws Exception, Error
	{
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_098";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_098_View Custom Payment Notification", "Verification Of View Custom Payment Notification");
			parentlogger.assignAuthor("Anubhuti Vyas");
		
			String NumberOfChecks;
			Object[] ContentToBeVerified;
			//Local Variable Declaration Is Completed Here

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			//========================================Steps To Navigate To Custom Payment Notification Page Is Started Here===========================================================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Funds-CustomPaymentNotification", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Custom Payment Notification Page Is Getting Loaded ");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.CustomPaymentNotificationFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_CustomPayNotification.RMAApp_FundsCustomPayNotification_Rdb_ShowPaymntsDueBy(driver), "Show Payments Due By Radio Button On Custom Payment Notification Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_CustomPayNotification.RMAApp_FundsCustomPayNotification_Rdb_EndOfMonth(driver), "End Of Month Radio Button On Custom Payment Notification Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_CustomPayNotification.RMAApp_FundsCustomPayNotification_Btn_Refresh(driver), "Refresh Button On Custom Payment Notification Page ", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Custom Payment Notification Page Is Refreshed");
			NumberOfChecks = RMA_Selenium_POM_Funds_CustomPayNotification.RMAApp_FundsCustomPayNotification_Lbl_NumberOfChecks(driver).getText(); //No. Of Checks Is Stored In Variable NumberOfChecks
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_CustomPayNotification.RMAApp_FundsCustomPayNotification_Btn_Print(driver), "Print Button On Custom Payment Notification Page ", logval);
			ContentToBeVerified=new Object[]{NumberOfChecks,"Checks that need to be printed"};
			RMA_Verification_Utility.PDFReaderContentVerification_Utility("NA", ContentToBeVerified, logval);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Verification Of View Custom Payment Notification", "View Custom Payment Notification")));
			//========================================Steps To Navigate To Custom Payment Notification Page Is Completed Here===========================================================================================================================================================================================================
			
			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here=========================================================================================================================================================================================================== }
			
		} catch (Exception|Error e) {
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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

			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
		} catch (Exception|Error e) {	
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}	
		finally
		{
			try {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}


