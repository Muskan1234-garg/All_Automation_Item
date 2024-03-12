package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_020
//Description    : Record Summary Displays Correct Details For A Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - AbhishekRai-10-27-2017 
//=================================================================================================

public class RMA_Smoke_TC_020 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_020_Test() throws Exception,Error {		
		
		try{
			parentlogger= reports.startTest("RMA_Smoke_TC_020_Record Summary Verification", "Record Summary Displays Correct Details For A Claim Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = "RMA_Smoke_TC_020";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
			
			//Region =====================================================Local Variable Declaration Started Here=====================================================================
			String StrEventNumber;
			String StrClaimType;
			String StrClaimStaus;
			String StrDateOfEvent;
			String StrTimeOfEvent;
			String StrDateOfClaim;
			String StrTimeOfClaim;		
			//EndRegion ==================================================Local Variable Declaration Completed Here=======================================================================================================
			
			//Region =====================================================Values From Claim Page Are Captured To Be Verified On Record Summary Page, Is Started Here=======================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			StrEventNumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EventNumber(driver), "value"); // Fetch Event Number Value
			StrClaimType = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "value"); // Fetch Claim Type Value
			StrClaimStaus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "value"); // Fetch Claim Status Value
			StrDateOfEvent = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "value"); // Fetch Date Of Event Value
			StrTimeOfEvent = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "value"); // Fetch Time Of Event Value
			StrDateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "value"); // Fetch Date Of Claim Value
			StrTimeOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "value"); // Fetch Time Of Claim Value
			//EndRegion ==================================================Values From Claim Page Are Captured To Be Verified On Record Summary Page, Is Completed Here=======================================================================================================
			
			//Region =====================================================Record Summary Content Verification Is Started Here=======================================================================================================
			driver.switchTo().parentFrame();
			RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver).click();
		Thread.sleep(8000);
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Img_RecordSummary(driver), "Record Summary Image On Claim :"+" "+StrClaimNumber, logval); // Id Is Same For All LOB			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Record Summary Page Is Getting Loaded");
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrEventNumber), "displayed", "Event Number On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrClaimNumber), "displayed", "Claim Number On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrClaimType), "displayed", "Claim Type On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrClaimStaus), "displayed", "Claim Status On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrDateOfEvent), "displayed", "Date Of Event On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrTimeOfEvent), "displayed", "Time Of Event On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrDateOfClaim), "displayed", "Date Of Claim On Record Summary page" , logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrTimeOfClaim), "displayed", "Time Of Event On Record Summary page" , logval);
				
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Record Summary Verification", StrScreenShotTCName)));
			//EndRegion ==================================================Record Summary Content Verification Is Completed Here=======================================================================================================
			
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
				if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(RMA_Selenium_POM_VerificationMessage.RecordSummaryFrame))
				{
					driver.switchTo().parentFrame();//switch to claim frame
				}				
				if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null)
				{
					RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Record Summary Screen", logval);// close Record Summary screen
				}
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

