package rmaseleniumtestscripts;

import org.openqa.selenium.By;
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
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_017
//Description    : Claim History Works Correctly On Claimant Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-07-04-2017 
//=================================================================================================
public class RMA_Smoke_TC_017 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	
@Test 
public void RMA_Smoke_TC_017_Test () throws Exception, Error 
//Claim History Works Correctly On Claimant Screen Is Validated
{
	
	StrScreenShotTCName = "Smoke_TC_017";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	loggerval1 = "NotInitialized";
	testcall1 = false; 
	//Global Variable Initialization Completed Here
	
	try {
		
		String StrClaimant_RMA_Smoke_TC_017;
		String StrClaimType;
		String StrClaimStatus;
		String StrDateOfClaim;
		String ExpectedColHeadersToBeVerified[];
		String ExpectedValuesToBeVerified[];	
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_017_Correct Working Of Claim History For Claimant", "Claim History Works Correctly On Claimant Screen Is Validated.");
		parentlogger.assignAuthor("Renu Verma");
		
		//===========================================Values From Claim Page Are Captured To Be Verified On Claim History Page, Is Started ================================================================================================================================*
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		StrEventNumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EventNumber(driver), "value"); // Fetch Event Number Value
		StrClaimType = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "value"); // Fetch Claim Type Value
		StrClaimStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "value"); // Fetch Claim Status Value
		StrDateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "value"); // Fetch Date Of Claim Value
		 ExpectedColHeadersToBeVerified=new String [] {"Claim Date","Claim Type","Claim Status"};	
		ExpectedValuesToBeVerified=new String [] {StrDateOfClaim, StrClaimType,StrClaimStatus};
		//===========================================Values From Claim Page Are Captured To Be Verified On Claim History Page, Is Completed ============================================================================================================================*
		
		//===========================================Claimant Creation Is Started Here================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Claimant");
		testcall1 = true;
		StrClaimant_RMA_Smoke_TC_017 = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Claimant", StrClaimNumber, "Great Britain", "NA",logval1);
		loggerval1 = logger.toString();
		parentlogger.log(LogStatus.INFO, "New Claimant Is Created With Claimant LastName::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant_RMA_Smoke_TC_017, 3));
		parentlogger.appendChild(logger);
		//===========================================Claimant Creation Is Completed Here================================================================================================================================================================================================================================================================
		
		//============================================Claim Involvement History Content Verification Is Started========================================================================================================================================================================*
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Btn_ClaimantHistory(driver), "Claimant History Image On Claimant Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Claim History"), "Header Of Claim History On Claim History Popup", logval);
		RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(StrClaimNumber, "Claim Involvement History UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified,logval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Claim History Verification", StrScreenShotTCName)));
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelUXDialog_Img_Close(driver), "Close button Claim Involvement History Screen", logval);// close attachment screen
		
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
		
		//============================================Claim Involvement History Content Verification Is Completed==============================================================================================================================================================*
			
		
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
		if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null)
		{
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Claim Involvement History Screen", logval);// Close Claim Involvement History Screen For Created Claimant
		}
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
		RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
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
