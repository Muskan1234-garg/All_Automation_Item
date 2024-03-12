package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_EnhancedNotes;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_059
//Description    : Create, Edit And Delete Of Enhanced Notes On A Newly Created Vehicle's Claim Is Validated
//Depends On TC  : none
//Revision       : 0.0 - ShrutiShruti-12-08-2017 
//======================================================================================================================================================================================================================================================================================


public class RMA_SeleniumRegression_TC_059 extends RMA_TC_BaseTest {
	@Test
	public void RMA_SeleniumRegression_TC_059_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_059_Create, Edit And Delete Of Enhanced Notes_Vehicle's Claim", "Create, Edit And Delete Of Enhanced Notes On A Newly Created Vehicle's Claim Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			String VehicleClaimCreation_Txt_ClaimType;
			String VehicleClaimCreation_Txt_DateOfEvent;
			String VehicleClaimCreation_Txt_TimeOfEvent;
			String VehicleClaimCreation_Txt_DateOfClaim;
			String  VehicleClaimCreation_Txt_TimeOfClaim;
			String VehicleClaimCreation_Txt_Department;
			String EnhancedNotes;
			boolean Edit;
			//Local Variable Declaration
			
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
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_059";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			VehicleClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			VehicleClaimCreation_Txt_DateOfClaim = VehicleClaimCreation_Txt_DateOfEvent;
			VehicleClaimCreation_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			VehicleClaimCreation_Txt_TimeOfClaim=VehicleClaimCreation_Txt_TimeOfEvent;
			Edit=true;
			//Local Variable Initialization Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
			VehicleClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_VC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_VC
			VehicleClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_VC", 1, 1); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_VC
			//Data Fetch From Excel WorkBook Is Completed Here	
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//=========================================Steps To Create Vehicle Compensation Claim Creation Is Started Here===============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("VehicleCorp", "RMA_VehicleCorpClaimCreation",0)+" To Create New Vehicle Compensation Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_VehicleCorpClaimCreation( VehicleClaimCreation_Txt_ClaimType,"Open", VehicleClaimCreation_Txt_DateOfEvent,  VehicleClaimCreation_Txt_TimeOfEvent,  VehicleClaimCreation_Txt_DateOfClaim,  VehicleClaimCreation_Txt_TimeOfClaim, VehicleClaimCreation_Txt_Department, logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Vehicle Claim Is Created With Vehicle Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Vehicle Compensation Claim Is Successfully Created
			//=========================================Steps To Create Vehicle Compensation Claim Creation Is Completed Here===============================================================================================================================================================================================
			
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
					logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_VehiclaCorpClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Image Button On Enhanced Notes Page (Finally Block Step)", logval);		
						}
				 //driver.switchTo().parentFrame();
				 //Thread.sleep(5000);
				//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image Button On Event Creation Page", logval);
				 //RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			 
			 } catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}

}
