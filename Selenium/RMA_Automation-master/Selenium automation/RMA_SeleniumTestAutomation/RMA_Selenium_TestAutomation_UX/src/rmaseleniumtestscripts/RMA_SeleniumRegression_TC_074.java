package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_EnhancedNotes;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Packages Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_074
//Description    : Create, Edit And Delete Of Enhanced Notes On A Newly Created NonOccupational Claim Is Validated
//Depends On TC  : none
//Revision       : 0.0 - ShrutiShruti-12-08-2017 
//======================================================================================================================================================================================================================================================================================


public class RMA_SeleniumRegression_TC_074 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_074_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_074_Create, Edit And Delete Of Enhanced Notes On A Newly Created NonOccupational Claim", "Create, Edit And Delete Of Enhanced Notes On A Newly Created NonOccupational Claim Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			//String NonOccupationalClaim_Txt_ClaimType;
			String NonOccupationalClaim_Txt_Department;
			String NonOccupationalClaim_Txt_Jurisdiction;
			String NonOccupationalClaim_Txt_DateOfEvent;
			String NonOccupationalClaim_Txt_TimeOfEvent;
			String NonOccupationalClaim_Txt_DateOfClaim;
			String NonOccupationalClaim_Txt_TimeOfClaim;
			String NonOccupationalClaim_Txt_PolicyLOB;
			String NonOccupationalClaim_Txt_ClaimStatus;
			String NonOccupationalClaim_Txt_PlanName;
			String EnhancedNotes;
			boolean Edit;
			//Local Variable Declaration Completed Here

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
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
			Edit=true;
			//Local Variable Initialization Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			//NonOccupationalClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_ClaimStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 1); // Claim Status Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			//NonOccupationalClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 3); // Employee Number Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 4); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_PolicyLOB=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 5); // Policy LOB Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_PlanName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 6); // PlanName Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			//Fetch Of Data From Excel WorkBook Completed*/
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(NonOccupationalClaim_Txt_EmployeeNo);
			//===========================================================NonOccupational Claim Creation Is Started Here========================================================================================================================================================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("NonOcc", "RMA_NonOccupationalClaimCreation",0)+" To Create NonOccupational Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_NonOccClaimCreation("Non OCC", NonOccupationalClaim_Txt_ClaimStatus, NonOccupationalClaim_Txt_DateOfEvent, NonOccupationalClaim_Txt_TimeOfEvent, NonOccupationalClaim_Txt_DateOfClaim, NonOccupationalClaim_Txt_TimeOfClaim, NonOccupationalClaim_Txt_Department, 12345,NonOccupationalClaim_Txt_Jurisdiction, NonOccupationalClaim_Txt_PolicyLOB, NonOccupationalClaim_Txt_PlanName,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New NonOccupational Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New NonOccupational Claim  Is Successfully Created
			//===========================================================NonOccupational Claim Creation Is Completed Here=============================================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================Steps To Create And Edit Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_EnhancedNotes(driver), "Enhanced Notes Image On Claim/Event :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create A Enhanced Note");
			testcall2 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber, "NotRequired",Edit,logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Enhanced Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2));
			parentlogger.appendChild(logger);
			// New Enhanced Notes Is Created And Edited
			//===========================================================Steps To Create And Edit Enhanced Notes Completed Here============================================================================================================================================================================================================================================================

			//===========================================================Steps To Delete Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",1)+" Is Called To Delete An Already Created Enhanced Note");
			testcall3 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "CF Confidential", "Not Required", EnhancedNotes, Edit,logval1);
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Existing Enhanced Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2)+ "Is Deleted");
			parentlogger.appendChild(logger);
			// Created Enhanced Notes Is Deleted
			//===========================================================Steps To Delete Enhanced Notes Completed Here============================================================================================================================================================================================================================================================		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Button On Enhanced Notes Page",logval);
		    //Enhanced Notes Screen Is Closed
		}
		catch(Exception|Error e)
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
					logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_NonOccClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
					parentlogger.appendChild(logger);
					reports.endTest(logger);	
				}
			 if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			 {
			 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit Enhanced Notes And Hence The Test Case Is A Fail");
			 parentlogger.appendChild(logger);
			 reports.endTest(logger);	
			 }
			 if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			 {
			 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Enhanced Notes And Hence The Test Case Is A Fail");
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
				 RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Error Condition Has Occured During Enhanced Notes Create, Edit And Delete And Enhanced Notes Screen Needs To Be Closed");
					 if (!(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver)== null)){
						RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Image Button On Enhanced Notes Page (Finally Block Step)", logval);		
					}
			 
			 } catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}

}
