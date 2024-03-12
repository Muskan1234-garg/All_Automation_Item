package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_044
//Description    : Successfully Display A Diary Based On Criteria On Diary List Page Is Validated
//Depends On TC  :  RMA_SeleniumRegression_TC_043: As Verify Diaries On basis on Due Date and Task Name Which Is Created
//Revision       : 0.0 - RenuVerma-09-05-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_044 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	@Test
	public void RMA_SeleniumRegression_TC_044_Test() throws Exception,Error {
		
		StrScreenShotTCName = "RMA_SeleniumRegression_TC_044";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_044_ Display A Diary Based On Criteria On Diary List Page", "Successfully Display A Diary Based On Criteria On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

		
			//==============================Steps To Display A Diary Based On Criteria On Diary List Page Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+"RMA Page"+ " ", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
		//	RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			Thread.sleep(2000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Print(driver), "Print Diary Image On Diary List Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate(driver)));
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate(driver), "Open Diaries by Due Date Radio Option Of Print Diary Popup On Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Txt_FromDate(driver), "From Date Of Print Diary Popup  On Diary List Page", RMA_SeleniumRegression_TC_043.FutureRollDate_TC_043,logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Txt_ToDate(driver), "To Date Of Print Diary Popup On Diary List Page", RMA_SeleniumRegression_TC_043.FutureRollDate_TC_043,logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Chk_FilterbyTaskDescription(driver), "check", "Filter by Task Description CheckBox Of Print Diary Popup", "Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Txt_TaskDescription(driver), "Task Description Of Print Diary Popup On Diary List Page", RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043,logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Img_Print(driver), "Print Image Of Print Diary Popup On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.PDFReaderContentVerification_Utility("NA", new String []{RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043,RMA_SeleniumRegression_TC_043.FutureRollDate_TC_043},logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043, 3)+" Is Appeared On The PDF, Hence Diary Displayed Successfully On Criteria. ");
		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Of Print Diary Popup On Diary List Page", logval);
			//==============================Steps To Display A Diary Based On Criteria On Diary List Page Is Ended Here================================================================================================

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
	public void RMA_FailureReport(ITestResult result) throws Exception, Error   //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

