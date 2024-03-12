package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

//import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Document_Event;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_001
//Description    : Successful Event Creation On Providing Mandatory Data, Existence Of All Event Screen Tabs With Data Entry In One Text Box Of Each And Edit Of Created Event Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-05-22-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_001 extends RMA_TC_BaseTest {

@Test
public void RMA_Smoke_TC_001_Test() throws Exception,Error {
	
	String EventCreation_Txt_DateOfEvent;
	String EventCreation_Txt_TimeReported;
	String EventCreation_Txt_TimeOfEvent;
	String EventCreation_Txt_DateReported;
	String EventCreation_Txt_EventStatus;
	String EventCreation_Txt_EventType;
	String EventCreation_Txt_Department;
	String StrEditedEventNumber;
	String EventCreation_Txt_TimeOfEventEdited;
	String EventCreation_Txt_TimeOfEventEdited_Final;
	//Local Variable Declaration	
		
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_001_Event Creation", "Successful Event Creation On Providing Mandatory Data, Existence Of All Event Screen Tabs With Data Entry In One Text Box Of Each And Edit Of Created Event Is Validated");
	parentlogger.assignAuthor("Kumud Naithani");
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "Smoke_TC_001";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
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
	EventCreation_Txt_TimeOfEventEdited = RMA_GenericUsages_Utility.RMA_PastFutureTimeInfo_Utility(-10);
	EventCreation_Txt_TimeOfEventEdited_Final = RMA_GenericUsages_Utility.RMA_TimeConversion_Utility(EventCreation_Txt_TimeOfEventEdited, "hh:mm");
   //Local Variable Initialization  Completed
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	EventCreation_Txt_EventType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 0); //TypeOfEvent Is Fetched From DataSheet RMA_TC_003
	EventCreation_Txt_EventStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 2); //Event Status Is Fetched From DataSheet RMA_TC_003
	EventCreation_Txt_Department= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 4); //Department Name Is Fetched From DataSheet RMA_TC_003
	//Fetch Of Data From Excel WorkBook Completed
	//===========================================================Event Creation Is Started Here===============================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EventCreation", "RMA_EventCreation",0)+" To Create Event");
	testcall1 = true;
	StrEventNumber = RMA_Functionality_Utility.RMA_EventCreation(EventCreation_Txt_DateOfEvent, EventCreation_Txt_TimeReported, EventCreation_Txt_TimeOfEvent,  EventCreation_Txt_DateReported, EventCreation_Txt_EventStatus, EventCreation_Txt_EventType, EventCreation_Txt_Department, logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrEventNumber, 2));
	parentlogger.appendChild(logger);
	// New Event Is Successfully Created
	//===========================================================Event Creation Is Completed Here==============================================================================================================================================================================================
	
	//===========================================================Verification That All Tabs Are Present For Event Creation Screen Started Here==============================================================================================================================================================================================
	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_EventInfo(driver), "Event Info Tab On Event Creation Page",logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_EventDetail(driver), "Event Detail Tab On Event Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_CountyOfInjury(driver), "County Text Box On Event Detail Tab Of Event Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "County_"),logval);		
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_ReportedInfo(driver), "Reported Info Tab On Event Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_ReporterLastName(driver), "Reported Last Name Text Box On Reported Info Tab Of Event Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Reporter_"),logval);		
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_FollowUp(driver), "Follow Up Tab On Event Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_Outcome(driver), "Outcome Text Box On Follow Up Tab Of Event Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Outcome_"),logval);		
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_QualityManagement(driver), "Quality Manaagment Tab On Event Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_CaseNumber(driver), "Case Number Text Box On Quality Management Tab Of Event Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Case_"),logval);		
	
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_Supplementals(driver), "Supplementals Tab On Event Creation Page",logval);
	RMA_Functionality_Utility.RMA_GenericSave_Utility("events", false, "NA", "Event Creation Page", logval);
	//===========================================================Verification That All Tabs Are Present For Event Creation Screen Completed Here==============================================================================================================================================================================================
	
	//==========================================================Edit Of Created Event Is Started Here==============================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Tab_EventInfo(driver), "Event Info Tab On Event Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On Event Creation Page", EventCreation_Txt_TimeOfEventEdited,logval);		
	RMA_Functionality_Utility.RMA_GenericSave_Utility("events", false, "NA", "Event Creation Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventNumber(driver)));
	EventCreation_Txt_TimeOfEventEdited = RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_TimeOfEvent(driver).getAttribute("value");
	if (EventCreation_Txt_TimeOfEventEdited.length()== 7)
	{
		EventCreation_Txt_TimeOfEventEdited = "0"+EventCreation_Txt_TimeOfEventEdited;
	}
	RMA_Verification_Utility.RMA_PartialTextVerification(EventCreation_Txt_TimeOfEventEdited_Final,EventCreation_Txt_TimeOfEventEdited , "Event Number After Edit",logval);
	StrEditedEventNumber = RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
	RMA_Verification_Utility.RMA_TextCompare(StrEditedEventNumber, StrEventNumber, "Event Number After Edit",logval);
	parentlogger.log(LogStatus.PASS, "Event Edit Is Successful And Event Number Value Remains Same As Before Edit That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEventNumber, 2));
	//==========================================================Edit Of Created Event Is Completed Here==============================================================================================================================================================================================

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
		 driver.switchTo().parentFrame();
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

