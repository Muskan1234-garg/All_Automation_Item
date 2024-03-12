package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_049
//Description    : Verify Claim Activity Log Working Is Validated
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - AbhishekRai-10-25-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_049 extends RMA_TC_BaseTest {

@Test
public void RMA_Smoke_TC_049_Test() throws Exception,Error {
	
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_049_Claim Activity Log Screen Validation", "Claim Activity Screen Is Successfully Validated");
	parentlogger.assignAuthor("Abhishek Rai");
	
	//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
	StrScreenShotTCName = "RMA_Smoke_TC_049";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID= null;
	//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
	
	//Region =====================================================Steps To Open Claim Activity Log Page Started Here============================================================================================================================================================================================================================================================
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
	RMA_Functionality_Utility.RMA_ListOptionClick_Utility("Claim-Claim Activity Log", logval);
	//EndRegion ==================================================Steps To Open Claim Activity Log Page Completed Here============================================================================================================================================================================================================================================================

	//Region =====================================================Steps To Verify Claim Activity Log Is Started Here=================================================================================================			
	String []ExpectedColHeadersToBeVerified = {"User ","Description"};		
	String []ExpectedValuesToBeVerified = {"Amit Kumar(abk)",StrClaimNumber};
	
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ClaimActivityLogFrame);
	RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility("Amit Kumar(abk)" , "Claim Claim Activity Log UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, logval);
	RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility("Created Claim:"+ StrClaimNumber +" - " , "Claim Claim Activity Log UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, logval);	
	//EndRegion ==================================================Steps To Verify Claim Activity Log Is Completed Here=======================================================================================
	
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_CloseClaimActivityLog(driver), "Close Button On Claim Activity Log Popup On  Workers' Comp Claim Creation Page",logval);
	
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
		 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

