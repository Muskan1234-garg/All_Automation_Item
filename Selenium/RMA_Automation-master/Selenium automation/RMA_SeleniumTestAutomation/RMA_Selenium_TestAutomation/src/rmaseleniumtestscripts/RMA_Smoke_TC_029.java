package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_ISO;
//RMA Package Import Completed

// Note: Following Check Box should be in "ON" State 
//================================================================================================
//TestCaseID     : RMA_Smoke_TC_029
//Description    : ISO Submit Functionality For A Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-08-025-2016 
//=================================================================================================
public class RMA_Smoke_TC_029 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_029_Test () throws Exception, Error 
//ISO Submit Functionality For A Claim Is Validated
{
	try {
		
		String StrPrimaryWindowHandle;
		String StrAccept;
		//Local Variable Declaration
		
		logger = reports.startTest("RMA_Smoke_TC_029_ISO Submit Functionality", "ISO Submit Functionality For A Claim Is Validated");
		
		testcall1 = false;			
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_029";
		StrAccept = "Yes";
		
		//===========================================================Steps To Open ISO Submit Page Started Here============================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, StrClaimNumber_002), "Claim Number" + " " + StrClaimNumber_002 + "Link In Left Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ISO(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ISO(driver), "ISO Image On Claims Page",logval1);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		
		//===========================================================Steps To Open ISO Submit Page Completed Here============================================================================================================================================================================================================================================================
		//===========================================================Steps To Check ISO Submit Functionality Started Here=====================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_ISO.RMAApp_ISO_Chk_SubmitToISO(driver), "check", "Submit To ISO Check Box", "RMA Application ISO Submission Page",logval1);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ISO.RMAApp_ISO_Img_Save(driver), "Save Image On RMA Application ISO Submission Page", logval1);
		RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility(StrAccept, "Complete", "The record has been updated successfully!", "Successful ISO Submit Verification", logval1);
		
		//===========================================================Steps To Check ISO Submit Functionality Started Here=========================================================================================================================================================================================================================================================
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
	
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
