package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_020
//Description    : RMA_Smoke_TC_020_Verify Record Summary Displays Correct Details For A Claim.
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-07-21-2016 
//=================================================================================================

public class RMA_Smoke_TC_020 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_Smoke_TC_020_Test() throws Exception,Error {

		try{
			logger = reports.startTest("RMA_Smoke_TC_020_Record Summary Verification", "Verify Record Summary Displays Correct Details For A Claim");
			logger.assignAuthor("Imteyaz Ahmad");

			String StrPrimaryWindowHandle;
			String StrEventNumber;
			String StrClaimType;
			String StrDepartment;
			String StrClaimStaus;
			String StrDateOfEvent;
			String StrTimeOfEvent;
			String StrDateOfClaim;
			String StrTimeOfClaim;

			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_020";
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrClaimNumber_002, "Left Navigation Tree", logval1);// Claim Link Is Clicked To Load Claim Page
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			
			//********************************************Values From Claim Page Are Captured To Be Verified On Record Summary Page, Is Started ***********************************************
			StrEventNumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_EventNumber(driver), "value"); // Id Is Same For All LOB
			StrClaimType = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimType(driver), "value"); // Id Is Same For All LOB
			StrDepartment = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "value"); // Id Is Same For All LOB
			StrClaimStaus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimStatus(driver), "value"); // Id Is Same For All LOB
			StrDateOfEvent = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfEvent(driver), "value"); // Id Is Same For All LOB
			StrTimeOfEvent = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfEvent(driver), "value"); // Id Is Same For All LOB
			StrDateOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfClaim(driver), "value"); // Id Is Same For All LOB
			StrTimeOfClaim = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfClaim(driver), "value"); // Id Is Same For All LOB
			//********************************************Values From Claim Page Are Captured To Be Verified On Record Summary Page, Is Completed ***********************************************
			
			//******************************************************Record Summary Content Verification Is Started*********************************************************************
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Img_RecordSummary(driver), "Record Summary Image On Claim :"+" "+StrClaimNumber_002, logval1); // Id Is Same For All LOB
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			driver.manage().window().maximize();
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Event Number", 2, StrEventNumber, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Claim Number", 2, StrClaimNumber_002, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Claim Type", 2, StrClaimType, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Department", 2, StrDepartment, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Claim Status", 2, StrClaimStaus, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Date Of Event", 2, StrDateOfEvent, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Time Of Event", 2, StrTimeOfEvent, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Date Of Claim", 2, StrDateOfClaim, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Tbl_RecordSummaryTable(driver), "Time Of Claim", 2, StrTimeOfClaim, "Record Summary Table For Claim :"+" "+StrClaimNumber_002, logval1);
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Record Summary Verification", StrScreenShotTCName)));
			driver.close();	
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			//******************************************************Record Summary Content Verification Is Completed*********************************************************************
			
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval1);
			}

		} catch (Exception|Error e) {

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

