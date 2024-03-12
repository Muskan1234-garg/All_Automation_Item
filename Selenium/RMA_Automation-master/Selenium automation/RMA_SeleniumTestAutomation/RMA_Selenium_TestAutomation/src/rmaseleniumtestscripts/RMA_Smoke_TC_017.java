package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Claimant;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_017
//Description    : Claim History Works Correctly On Claimant Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-18-2016 
//=================================================================================================
public class RMA_Smoke_TC_017 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_017_Test () throws Exception, Error 
//Claim History Works Correctly On Claimant Screen Is Validated
{
	try {
		
		String StrClaimant_RMA_Smoke_TC_017;
		String StrClaimType;
		String StrClaimStatus;
		String StrPrimaryWindowHandle;
		String DateOfClaim;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_017_Correct Working Of Claim History", "Claim History Works Correctly On Claimant Screen Is Validated.");
		parentlogger.assignAuthor("Kumud Naithani");
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		StrScreenShotTCName = "Smoke_TC_017";
		
		
		//===========================================================Fetching Of Values From Claim Screen Is Started Here============================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, StrClaimNumber_002), "Claim Name Link In Left Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		StrClaimType = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimType(driver), "value");
		StrClaimStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimStatus(driver), "value");
		DateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfClaim(driver), "value");
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
		RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);		
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_002+" " +" On Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Claim Link" +" " +StrClaimNumber_002+" " +" On Left Navigation Tree Is Clicked ");
		//===========================================================Fetching Of Values From Claim Screen Is Completed Here============================================================================================================================================================================================================================================================
		//===========================================================New Claimant Creation Is Started Here============================================================================================================================================================================================================================================================================
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Claimant ");
		testcall1 = true;
		StrClaimant_RMA_Smoke_TC_017 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Claimant", "Claimant (0)", StrClaimNumber_002, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
		parentlogger.log(LogStatus.INFO, "New Claimant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant_RMA_Smoke_TC_017, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		//===========================================================New Claimant Creation Is Completed Here================================================================================================================================================================================================================================================================================
		
		//===========================================================Claimant History Verification Is Started Here==============================================================================================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Btn_ClaimantHistory(driver), "Claimant History Image On Claimant Page",logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Tbl_ClaimantHistory(driver), StrClaimNumber_002, 4,StrClaimStatus , 3, StrClaimType, "Claimant Involvement History Table On Claimant Involvement History Page", logval);
		RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Tbl_ClaimantHistory(driver), StrClaimNumber_002, 1, DateOfClaim, "Claimant Involvement History Table On Claimant Involvement History Page", logval);
		driver.close();
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Claimant");
		//===========================================================Claimant History Verification Is Completed Here================================================================================================================================================================================================================================================================================
	//		//===========================================================Deletion Of Existing Claimant Is Started Here================================================*/
//
//		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete An Claimant : " +" "+ color.RMA_ChangeColor_Utility(StrClaimant_RMA_Smoke_TC_017, 2));
//		testcall2 = true;
//		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Claimant Page", logval1);
//		parentlogger.log(LogStatus.INFO, "Claimant Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant_RMA_Smoke_TC_017, 2));
//		loggerval2 = logger.toString();
//		parentlogger.appendChild(logger);
//		//===========================================================Deletion Of Existing Claimant Is Completed Here================================================*/

		
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		
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
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}
