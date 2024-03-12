package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_018
//Description    : Claim History Works Correctly On Defendant Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-07-04-2017 
//=================================================================================================
public class RMA_Smoke_TC_018 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	@Test 
	public void RMA_Smoke_TC_018_Test () throws Exception, Error 
	//Claim History Works Correctly On Defendant Screen Is Validated
	{
		StrScreenShotTCName = "Smoke_TC_018";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		loggerval1 = "NotInitialized";
		testcall1 = false; 
		//Global Variable Initialization Completed Here
		try {

			String DefCreation_RMA_Smoke_TC_018;
			String StrClaimType;
			String StrClaimStatus;
			String StrDateOfClaim;
			//Local Variable Declaration

			parentlogger = reports.startTest("RMA_Smoke_TC_018_Correct Working Of Claim History For Created Defendant", "Claim History Works Correctly On Defendant Screen Is Validated.");
			parentlogger.assignAuthor("Renu Verma");

			//============================================Values From Claim Page Are Captured To Be Verified On Claim History Page, Is Started ================================================================================================================================*
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			StrEventNumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EventNumber(driver), "value"); // Fetch Event Number Value
			StrClaimType = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "value"); // Fetch Claim Type Value
			StrClaimStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "value"); // Fetch Claim Status Value
			StrDateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "value"); // Fetch Date Of Claim Value
			//============================================Values From Claim Page Are Captured To Be Verified On Claim History Page, Is Completed ============================================================================================================================*

			//===========================================================Defendant Creation Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Defendant");
			testcall1 = true;
			DefCreation_RMA_Smoke_TC_018 = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Defendant", StrClaimNumber, "NA", "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Defandent Is Created With Defentdant LastName::"+ " " + color.RMA_ChangeColor_Utility(DefCreation_RMA_Smoke_TC_018, 3));
			parentlogger.appendChild(logger);
			//===========================================================Defendant Creation Is Completed Here================================================================================================================================================================================================================================================================

			//============================================Claimant Involvement History Content Verification Is Started========================================================================================================================================================================*
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Btn_ClaimantHistory(driver), "Claimant History Image On Defendant Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Claim History"), "Header Of Claim History  On Claim History Popup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ClaimInvolvement);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Tbl_ClaimantHistory(driver), StrClaimNumber, 1, StrDateOfClaim, "Claimant Involvement History Table On Claimant History Page", logval);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Tbl_ClaimantHistory(driver), StrClaimNumber, 3, StrClaimType, "Claimant Involvement History Table On Claimant History Page", logval);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Tbl_ClaimantHistory(driver), StrClaimNumber, 4, StrClaimStatus, "Claimant Involvement History Table On Claimant History Page", logval);
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Record Summary Verification", StrScreenShotTCName)));
			driver.switchTo().parentFrame();//switch to claim frame
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelUXDialog_Img_Close(driver), "Close button Claimant Involvement History Screen", logval);// close attachment screen
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//================================================Claimant Involvement History Verification Is Completed==============================================================================================================================================================*

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

			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
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
			// In case of Failure Close The Claim Involvement History Page 
			if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(RMA_Selenium_POM_VerificationMessage.ClaimInvolvement))
			{
				driver.switchTo().parentFrame();//switch to claim frame
				if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null)
				{
					RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Claimant Involvement History Screen", logval);// close Claimant Involvement History screen
				}
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
}
