package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_ClaimActivityLog;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

// Note: Following CheckBox "Enable Activity Log" Should Be In "ON" State In Utilities-->System Parameters-->General System Parameter SetUp-->System Settings Tab-->General Parameters Header
//================================================================================================
//TestCaseID     : RMA_Smoke_TC_030
//Description    : Enable Activity Log Functionality For A Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-08-025-2016 
//=================================================================================================
public class RMA_Smoke_TC_030 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_030_Test () throws Exception, Error 
//Enable Activity Log Functionality For A Claim Is Validated
{
	try {
		
		String StrPrimaryWindowHandle;
		String ActivityDesc;
		String ActivityNameExp;
		String ActivityNameAct;
		String ActivityUserExp;
		String ActivityUserAct;
		//Local Variable Declaration
		
		logger = reports.startTest("RMA_Smoke_TC_030_Claim Activity Log Verification", "Enable Activity Log Functionality For A Claim Is Validated");
		
		testcall1 = false;			
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_030";
		ActivityNameExp = "Claim Updates";
		ActivityUserExp = "Amit Kumar";

		//===========================================================Steps To Open Claim Activity Log Page Started Here============================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, StrClaimNumber_002), "Claim Number" + " " + StrClaimNumber_002 + "Link In Left Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ClaimActLog(driver), "Claim Activity Log Image On Claims Page",logval1);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		
		//===========================================================Steps To Open ISO Submit Page Completed Here============================================================================================================================================================================================================================================================
		//===========================================================Steps To Check ISO Submit Functionality Started Here=====================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_ClaimActivityLog.RMAApp_ClmActLog_Txt_ClmActLogFilter(driver, 4), "Description NG Grid Filter TextBoxe On RMA Application Claim Activity Log Page", "Created",logval1); 
		
		ActivityDesc = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ClaimActivityLog.RMAApp_ClmActLog_Grd_ClmActLog(driver, 4), "innerHTML");
		RMA_Verification_Utility.RMA_PartialTextVerification(StrClaimNumber_002, ActivityDesc, "Claim Activity Log Description Verification", logval1);
		
		ActivityNameAct = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ClaimActivityLog.RMAApp_ClmActLog_Grd_ClmActLog(driver, 3), "innerHTML");
		RMA_Verification_Utility.RMA_PartialTextVerification(ActivityNameExp, ActivityNameAct, "Claim Activity Log Activity Name Verification", logval1);
		
		ActivityUserAct = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ClaimActivityLog.RMAApp_ClmActLog_Grd_ClmActLog(driver, 2), "innerHTML");
		RMA_Verification_Utility.RMA_PartialTextVerification(ActivityUserExp, ActivityUserAct, "Claim Activity Log User Verification", logval1);
		//===========================================================Steps To Check ISO Submit Functionality Started Here=========================================================================================================================================================================================================================================================
		driver.close();
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
