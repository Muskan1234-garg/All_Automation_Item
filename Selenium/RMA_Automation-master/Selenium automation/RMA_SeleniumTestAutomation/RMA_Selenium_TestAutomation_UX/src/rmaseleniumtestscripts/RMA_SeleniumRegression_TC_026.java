package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_026
//Description    : Existence Of Person Involved Entity Option For Saved Carrier Workers Compensation Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-07-25-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_026 extends RMA_TC_BaseTest {

	@Test
	public void RMA_SeleniumRegression_TC_026_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_026_Existence Of Person Involved Entity Option For Saved Carrier Workers Compensation Claim", "Person Involved Entity Option Existence On Created Carrier Workers Compensation Claim's Right Hand Navigation Tree Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			String WorkersClaim_Txt_ClaimNumber;
			//Local Variable Declaration Completed Here

			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_026";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			WorkersClaim_Txt_ClaimNumber = "WCLT2017000683";
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//===========================================================Search Of Existing Workers Compensation Claim With Attached Policy Is Started Here===============================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", WorkersClaim_Txt_ClaimNumber, WorkersClaim_Txt_ClaimNumber,"claimwc",logval);
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//===========================================================Search Of Existing Workers Compensation Claim With Attached Policy Is Completed Here==============================================================================================================================================================================================

			//===========================================================Verification Of Person Involved Entity Option Existence On Created Carrier Workers Compensation Claim's Right Hand Navigation Tree Is Started Here==============================================================================================================================================================================================
			driver.switchTo().parentFrame();	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,"Persons Involved" ),"displayed","Person Involved Entity Option On Right Hand Carrier Workers Compensation Claim Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Entity Option Existence", "Person Involved Entity Option Existence For Workers Comp Claim")));
			//===========================================================Verification Of Person Involved Entity Option Existence On Created Carrier Workers Compensation Claim's Right Hand Navigation Tree Is Completed Here==============================================================================================================================================================================================

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
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

