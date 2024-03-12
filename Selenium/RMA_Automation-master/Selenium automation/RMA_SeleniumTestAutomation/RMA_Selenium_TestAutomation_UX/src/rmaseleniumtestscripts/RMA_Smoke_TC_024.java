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
//TestCaseID     : RMA_Smoke_TC_024
//Description    : Successful Comment Creation For An Already Created Claim, Close And Cancel Image Button Function On Comments Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-06-16-2017 
//======================================================================================================================================================================================================================================================================================
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

public class RMA_Smoke_TC_024 extends RMA_TC_BaseTest {
	public static String CommentText;
@Test
public void RMA_Smoke_TC_024_Test() throws Exception,Error {
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_024_Comment Creation", "Successful Comment Creation For An Already Created Claim, Close And Cancel Image Button Function On Comments Screen Is Validated");
	parentlogger.assignAuthor("Kumud Naithani");
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "Smoke_TC_024";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed 
	
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
	//===========================================================Comment Creation And Verification Is Started Here================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CommentAdd", "RMA_CommentAddition_Utility",0)+" To Create New Comments For An Already Created Claim"+ " "+ StrClaimNumber);
	testcall1 = true;
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Comments(driver), "Comments Image Button On General Claim Creation Page",logval1);
	CommentText= RMA_Functionality_Utility.RMA_CommentAddition_Utility(StrClaimNumber, "Claim",true,logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "Follwing Comments Are Created With Text::"+ " " + color.RMA_ChangeColor_Utility(CommentText, 2)+ " "+ "For Claim" + " " +StrClaimNumber);
	parentlogger.appendChild(logger);
	// New Comment Is Successfully Created
	//=========================================================Comment Creation And Verification Is Completed Here================================================================================================================================================================================================================================================================

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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CommentCreation_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

