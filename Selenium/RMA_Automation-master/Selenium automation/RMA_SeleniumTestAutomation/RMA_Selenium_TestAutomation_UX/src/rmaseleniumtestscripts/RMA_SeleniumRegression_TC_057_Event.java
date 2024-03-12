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
//TestCaseID     : RMA_SeleniumRegression_TC_057
//Description    : Create, Edit and Delete of Enhanced Notes For A Newly Created Event Is Validated
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-12-08-2017
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_057_Event extends RMA_TC_BaseTest {

@Test
public void RMA_SeleniumRegression_TC_057_Test() throws Exception,Error {
	
	String EventCreation_Txt_DateOfEvent;
	String EventCreation_Txt_TimeReported;
	String EventCreation_Txt_TimeOfEvent;
	String EventCreation_Txt_DateReported;
	String EventCreation_Txt_EventStatus;
	String EventCreation_Txt_EventType;
	String EventCreation_Txt_Department;
	String EnhancedNotes;
	boolean Edit;	
	//Local Variable Declaration	
		
	try{
	parentlogger = reports.startTest("RMA_SeleniumRegression_TC_057_Create, Edit And Delete Of Enhanced Notes_Event", "Create, Edit and Delete of Enhanced Notes For A Newly Created Event Is Validated");
	parentlogger.assignAuthor("Shruti Shruti");
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "RMA_SeleniumRegression_TC_057";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	testcall3 = false;	
	loggerval3 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed
	
	EventCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
	EventCreation_Txt_DateReported = EventCreation_Txt_DateOfEvent;
	EventCreation_Txt_TimeOfEvent = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
	EventCreation_Txt_TimeReported = EventCreation_Txt_TimeOfEvent;
	Edit=true;
   //Local Variable Initialization  Completed
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	EventCreation_Txt_EventType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 0); //TypeOfEvent Is Fetched From DataSheet RMA_TC_003
	EventCreation_Txt_EventStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 2); //Event Status Is Fetched From DataSheet RMA_TC_003
	EventCreation_Txt_Department= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 4); //Department Name Is Fetched From DataSheet RMA_TC_003
	//Fetch Of Data From Excel WorkBook Completed
	
	RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
	//===========================================================Event Creation Is Started Here==============================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EventCreation", "RMA_EventCreation",0)+" To Create Event");
	testcall1 = true;
	StrClaimNumber = RMA_Functionality_Utility.RMA_EventCreation(EventCreation_Txt_DateOfEvent, EventCreation_Txt_TimeReported, EventCreation_Txt_TimeOfEvent,  EventCreation_Txt_DateReported, EventCreation_Txt_EventStatus, EventCreation_Txt_EventType, EventCreation_Txt_Department, logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrEventNumber, 2));
	parentlogger.appendChild(logger);
	DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	// New Event Is Successfully Created
	//===========================================================Event Creation Is Completed Here==============================================================================================================================================================================================
	
	//===========================================================Steps To Create And Edit Enhanced Notes Started Here============================================================================================================================================================================================================================================================
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_EnhancedNotes(driver), "Enhanced Notes Image On Claim/Event :"+" "+StrClaimNumber, logval);
	Thread.sleep(5000);
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create A Enhanced Note");
	testcall2 = true;
	EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Action Plan", "AP Action Plan", StrClaimNumber, "NotRequired",Edit,logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "New Enhanced Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2));
	parentlogger.appendChild(logger);
	// New Enhanced Notes Is Created And Edited
	//===========================================================Steps To Create And Edit Enhanced Notes Completed Here============================================================================================================================================================================================================================================================

	//===========================================================Steps To Delete Enhanced Notes Started Here============================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",1)+" Is Called To Delete An Already Created Enhanced Note");
	testcall3 = true;
	EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "AP Action Plan", "Not Required", EnhancedNotes, Edit,logval1);
	loggerval3 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Existing Enhanced Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2)+ "Is Deleted");
	parentlogger.appendChild(logger);
	// Created Enhanced Notes Is Deleted
	//===========================================================Steps To Delete Enhanced Notes Completed Here============================================================================================================================================================================================================================================================		
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Button On Enhanced Notes Page",logval);
    //Enhanced Notes Screen Is Closed
	
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EventCreation" + " " +  "And Hence The Test Case Is A Fail");
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

