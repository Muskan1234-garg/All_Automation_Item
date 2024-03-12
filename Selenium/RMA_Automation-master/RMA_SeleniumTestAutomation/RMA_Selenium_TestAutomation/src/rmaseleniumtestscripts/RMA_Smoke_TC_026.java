package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_QuickSummary;
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
		String StrClaimStatus;
		String StrPrimaryWindowHandle;
		String DateOfClaim;
		//Local Variable Declaration
		
		logger = reports.startTest("RMA_Smoke_TC_026_Quick Summary Verification", "Quick Summary Contents For A Claim Is Validated");
		
		StrScreenShotTCName = "Smoke_TC_026";
		//===========================================================Fetching Of Values From Claim Screen Is Started Here============================================================================================================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, StrClaimNumber_002), "Claim Name Link In Left Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		StrEventNumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_EventNumber(driver), "value");
		StrClaimStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimStatus(driver), "value");
		DateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfClaim(driver), "value");
		//===========================================================Fetching Of Values From Claim Screen Is Completed Here=====================================================================================================================================================================================================================================================================
		//===========================================================Defendant History Verification Is Started Here==============================================================================================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_QuickSummary(driver), "Quick Summary Image On Claims Page",logval1);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("EventExplorerTree");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrEventNumber, "Quick Summary Window" , logval1);
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("EventExplorerData");
		RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_QuickSummary.RMAApp_QuickSummary_Tbl_QuickSummary(driver), StrClaimNumber_002, 1,StrClaimStatus , 2, DateOfClaim, "Quick Summary Table Quick Summary Page", logval1);
		driver.close();
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval1);
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
