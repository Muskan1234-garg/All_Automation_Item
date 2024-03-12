package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_AttachCreateDiary;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_033
//Description    : Diary Is Attached To Created Payment With DairyNotes, Priority, Work Activity (Validated Too), Task Name (Validated Too), Estimated Hours Values, Required Tab Existence Is Verified, Cancel And Save Button Functionality Is Validated
//Depends On TC  : RMA_Smoke_TC_002,RMA_Smoke_TC_009,RMA_Smoke_TC_011
//Revision       : 0.0 - RenuVerma-06-23-2017
//======================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_033 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_033_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "Smoke_TC_033";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Declaration
		
		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_033_ Verify Successful Diary Creation For Payment", " Verify Successful Diary Creation From ToolBar Of Payment");
			parentlogger.assignAuthor("Renu Verma");
			
			String DiaryTaskName;
		    //Local Variable Declaration Completed
			
			//======================================================================New Diary Attached To Claim Creation Is Started========================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following  Payment Screen::"+" "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011,logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DiaryCreateEdit", "RMA_AttachCreateEdit_Diary",0)+" To Attach A New Diary To Payment");
			testcall1 = true;
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA","CQE Complete Quick Entry","NA","NA", "NA", "Important",RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011.substring(5, 7),logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"For Payment :"+" "+color.RMA_ChangeColor_Utility(RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011,4));							
			parentlogger.appendChild(logger);
			//======================================================================New Diary Attached To Claim Creation Is Completed========================================================================================================================================
			
			//======================================================================Cancel Button Functionality For Attach Diary Screen Validation  Is Started========================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following  Payment Screen:"+" "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011, logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_Cancel(driver), "Cancel Button On Attach Diary Page", logval);
			//======================================================================Cancel Button Functionality For Attach Diary Screen Validation  Is Completed========================================================================================================================================
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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			 {
			 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Attach Diary On Payment And Hence The Test Case Is A Fail");
			 parentlogger.appendChild(logger);
			 reports.endTest(logger);
			 }
			throw (e);
		}
	}		

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)   //All The Information Associated With The Test Case Is Stored In Result Variable
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
