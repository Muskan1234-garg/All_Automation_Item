package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_042
//Description    : Existence Of Person Involved Entity Option For Saved NonOccupational Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-07-25-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_042 extends RMA_TC_BaseTest {

	@Test
	public void RMA_SeleniumRegression_TC_042_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_042_Existence Of Person Involved Entity Option For Saved NonOccupational Claim", "Person Involved Entity Option Existence On Created NonOccupational Claim's Right Hand Navigation Tree Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			String NonOccupationalClaim_Txt_ClaimType;
			String NonOccupationalClaim_Txt_Department;
			String NonOccupationalClaim_Txt_Jurisdiction;
			String NonOccupationalClaim_Txt_DateOfEvent;
			String NonOccupationalClaim_Txt_TimeOfEvent;
			String NonOccupationalClaim_Txt_DateOfClaim;
			String NonOccupationalClaim_Txt_TimeOfClaim;
			int NonOccupationalClaim_Txt_EmployeeNo;
			String NonOccupationalClaim_Txt_PolicyLOB;
			String NonOccupationalClaim_Txt_ClaimStatus;
			String NonOccupationalClaim_Txt_PlanName;
			//Local Variable Declaration Completed Here

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_042";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			NonOccupationalClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			NonOccupationalClaim_Txt_DateOfClaim = NonOccupationalClaim_Txt_DateOfEvent;
			NonOccupationalClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			NonOccupationalClaim_Txt_TimeOfClaim=NonOccupationalClaim_Txt_TimeOfEvent;
			//Local Variable Initialization Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			NonOccupationalClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_ClaimStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 1); // Claim Status Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 3); // Employee Number Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 4); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_PolicyLOB=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 5); // Policy LOB Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_PlanName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 6); // PlanName Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			//Fetch Of Data From Excel WorkBook Completed*/
			
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(NonOccupationalClaim_Txt_EmployeeNo);
			//===========================================================NonOccupational Claim Creation Is Started Here========================================================================================================================================================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("NonOcc", "RMA_NonOccupationalClaimCreation",0)+" To Create NonOccupational Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_NonOccClaimCreation( NonOccupationalClaim_Txt_ClaimType, NonOccupationalClaim_Txt_ClaimStatus, NonOccupationalClaim_Txt_DateOfEvent, NonOccupationalClaim_Txt_TimeOfEvent, NonOccupationalClaim_Txt_DateOfClaim, NonOccupationalClaim_Txt_TimeOfClaim, NonOccupationalClaim_Txt_Department, NonOccupationalClaim_Txt_EmployeeNo,NonOccupationalClaim_Txt_Jurisdiction, NonOccupationalClaim_Txt_PolicyLOB, NonOccupationalClaim_Txt_PlanName,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New NonOccupational Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New NonOccupational Claim  Is Successfully Created
			//===========================================================NonOccupational Claim Creation Is Completed Here=============================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================Verification Of Person Involved Entity Option Existence On Created NonOccupational Claim's Right Hand Navigation Tree Is Started Here======================================================================================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,"Persons Involved" ),"displayed","Person Involved Entity Option On Right Hand NonOccupational Claim Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Entity Option Existence", "Person Involved Entity Option Existence For NonOccupational Claim")));
			//===========================================================Verification Of Person Involved Entity Option Existence On Created NonOccupational Claim's Right Hand Navigation Tree Is Completed Here=======================================================================================================================================================================================================================================================================================================================================================

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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_NonOccupationalClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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

