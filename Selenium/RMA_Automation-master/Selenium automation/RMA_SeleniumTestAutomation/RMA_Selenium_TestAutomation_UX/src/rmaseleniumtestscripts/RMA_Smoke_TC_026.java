package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_026
//Description    : Quick Summary Contents For A Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-28-2016 
//=================================================================================================
public class RMA_Smoke_TC_026 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_026_Test () throws Exception, Error 
//Quick Summary Contents For A Claim Is Validated
{
	try {
		
		String StrEventNumber;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_026_Quick Summary Verification", "Quick Summary Contents For A Claim Is Validated");
		StrScreenShotTCName = "Smoke_TC_026";
		//===========================================================Fetching Of Values From Claim Screen Is Started Here============================================================================================================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
		StrEventNumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EventDetail(driver), "value");
		//StrClaimStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver), "value");
		//DateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "value");
		//===========================================================Fetching Of Values From Claim Screen Is Completed Here=====================================================================================================================================================================================================================================================================
		//===========================================================Defendant History Verification Is Started Here==============================================================================================================================================================================================================================================================================
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_QuickSummary(driver), "Quick Summary Image On Claims Page",logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("EventExplorerTree");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrEventNumber, "Quick Summary Window" , logval1);
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("EventExplorerData");
		//RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_QuickSummary.RMAApp_QuickSummary_Tbl_QuickSummary(driver), StrClaimNumber, 1,StrClaimStatus , 2, DateOfClaim, "Quick Summary Table Quick Summary Page", logval1);
		//===========================================================Defendant History Verification Is Completed Here================================================================================================================================================================================================================================================================================
		
		
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
		
	} catch (Exception |Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	
	finally
	{
		driver.switchTo().parentFrame();
		reports.endTest(logger); 
		reports.flush();
	}
}
}
