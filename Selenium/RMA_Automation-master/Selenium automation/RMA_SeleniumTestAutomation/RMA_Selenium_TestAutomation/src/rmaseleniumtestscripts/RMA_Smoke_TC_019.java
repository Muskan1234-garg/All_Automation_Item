package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import java.util.Set;
//import java.io.*;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed


//================================================================================================
//TestCaseID     : RMA_TC_019
//Description    : TC_019_Verify That Executive Summary Displays Correct Claim Details
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-25-2016 
//=================================================================================================

public class RMA_Smoke_TC_019 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_TC_019_Test() throws Exception,Error {

		try{
			logger = reports.startTest("RMA_Smoke_TC_019_Executive Summary Details Verification", "Verify That Executive Summary Displays Correct Claim Details");
			logger.assignAuthor("Kumud Naithani");
			
			String StrPrimaryWindowHandle;
			String StrExecContents;
			int intWindowCount;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_019";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			//===========================================================Steps To Verify Executive Summary Details Started Here============================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, StrClaimNumber_002), "Claim Name Link In Left Navigation Tree", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ExecSummary(driver), "Execution Summary Image On Claim Page", logval1);
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			driver.manage().window().maximize();
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As Executive Summary Window Is Getting Maximized And Loaded");
			
			Set<String> strWindowHandles = driver.getWindowHandles(); 
			intWindowCount = strWindowHandles.size();
			
			if (intWindowCount == 2)
			{
			   logger.log(LogStatus.PASS, "Executive Summary Page Is Opened Successfully");
			}
			
			else
			{
				
				logger.log(LogStatus.FAIL, "Executive Summary Page Is Not Opened Successfully");
			}
			
			if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
			{
			StrExecContents =   RMA_GenericUsages_Utility.RMA_WebPageCopyPaste_Utility(logval1);
	        RMA_Verification_Utility.RMA_PartialTextVerification("Executive Summary",StrExecContents,"Executive Summary Value Verification", logval1);
	        RMA_Verification_Utility.RMA_PartialTextVerification(StrClaimNumber_002,StrExecContents,"Executive Summary Value Verification", logval1);
	        RMA_Verification_Utility.RMA_PartialTextVerification("Note:",StrExecContents,"Executive Summary Value Verification", logval1);
	        RMA_Verification_Utility.RMA_PartialTextVerification("Confidential Data - rmA",StrExecContents,"Executive Summary Value Verification", logval1);
			}
	        
	        driver.close();
	        driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0");
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
