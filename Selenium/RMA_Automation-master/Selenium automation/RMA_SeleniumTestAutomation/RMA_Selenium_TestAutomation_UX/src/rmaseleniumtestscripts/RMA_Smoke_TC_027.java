package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed
//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_027
//Description    : Comment Summary Screen Functionality Verification For An Already Created Claim, Close Image Button Both On The Header And Main screen Of Comment Summary, Print Image Button Functionality Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-06-19-2017 
//======================================================================================================================================================================================================================================================================================
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

public class RMA_Smoke_TC_027 extends RMA_TC_BaseTest {
@Test
public void RMA_Smoke_TC_027_Test() throws Exception,Error {
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_027_Comment Summary Screen Verification", "Comment Summary Screen Functionality Verification For An Already Created Claim, Close Image Button Both On The Header And Main screen Of Comment Summary,Print Image Button Functionality Is Validated");
	parentlogger.assignAuthor("Kumud Naithani");
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "Smoke_TC_027";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed 
	
	//===========================================================Comment Summary Screen Verification Is Started Here================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CommentSummary", "RMA_CommentSummaryVerification_Utility",0)+" To Verify Comment Summary Screen Functionality For An Already Created Claim");
	testcall1 = true;
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_CommentSummary(driver), "Comment Summary Image Button On General Claim Creation Page",logval);
	RMA_Functionality_Utility.RMA_CommentSummaryVerification_Utility(StrClaimNumber, "Claim",RMA_Smoke_TC_024.CommentText, true,logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "Comment Summary Screen Verification For The Comment Text::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_024.CommentText, 2)+  " "+"Created For Claim"+ StrClaimNumber+ " "+ "Is Successful");
	parentlogger.appendChild(logger);
	//Comment Summary Screen Functionality Verification Is Done
	//=========================================================Comment Summary Screen Verification Is Completed Here================================================================================================================================================================================================================================================================

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
	 if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CommentSummaryVerification_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);
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
		 driver.switchTo().parentFrame();
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

