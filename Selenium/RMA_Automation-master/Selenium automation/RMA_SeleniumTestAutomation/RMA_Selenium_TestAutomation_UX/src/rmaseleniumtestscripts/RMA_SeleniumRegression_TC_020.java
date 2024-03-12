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
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_020
//Description    : Existence Of Person Involved Entity Option For Saved Event Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-07-22-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_020 extends RMA_TC_BaseTest {

@Test
public void RMA_SeleniumRegression_TC_020_Test() throws Exception,Error {
	
	String EventCreation_Txt_DateOfEvent;
	String EventCreation_Txt_TimeReported;
	String EventCreation_Txt_TimeOfEvent;
	String EventCreation_Txt_DateReported;
	String EventCreation_Txt_EventStatus;
	String EventCreation_Txt_EventType;
	String EventCreation_Txt_Department;
	//Local Variable Declaration	
		
	try{
	parentlogger = reports.startTest("RMA_SeleniumRegression_TC_020_Existence Of Person Involved Entity Option For Saved Event", "Person Involved Entity Option Existence On Created Event's Right Hand Navigation Tree Is Validated");
	parentlogger.assignAuthor("Kumud Naithani");
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "RMA_SeleniumRegression_TC_020";
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
   //Local Variable Initialization  Completed
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	EventCreation_Txt_EventType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 0); //TypeOfEvent Is Fetched From DataSheet RMA_TC_003
	EventCreation_Txt_EventStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 2); //Event Status Is Fetched From DataSheet RMA_TC_003
	EventCreation_Txt_Department= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 4); //Department Name Is Fetched From DataSheet RMA_TC_003
	//Fetch Of Data From Excel WorkBook Completed
	
	driver.switchTo().parentFrame();
	//===========================================================Event Creation Is Started Here======================================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EventCreation", "RMA_EventCreation",0)+" To Create Event");
	testcall1 = true;
	StrClaimNumber = RMA_Functionality_Utility.RMA_EventCreation(EventCreation_Txt_DateOfEvent, EventCreation_Txt_TimeReported, EventCreation_Txt_TimeOfEvent,  EventCreation_Txt_DateReported, EventCreation_Txt_EventStatus, EventCreation_Txt_EventType, EventCreation_Txt_Department, logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrEventNumber, 2));
	parentlogger.appendChild(logger);
	DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	// New Event Is Successfully Created
	//===========================================================Event Creation Is Completed Here=======================================================================================================================================================================================================================================================================================
	
	//===========================================================Verification Of Person Involved Entity Option Existence On Created Event's Right Hand Navigation Tree Is Started Here==============================================================================================================================================================================================
	RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,"Persons Involved" ), "Person Involved Entity Option On Right Hand Event Tree", logval);
	parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Entity Option Existence", "Person Involved Option Existence On Event Right Hand Tree")));
	//===========================================================Verification Of Person Involved Entity Option Existence On Created Event's Right Hand Navigation Tree Is Completed Here==============================================================================================================================================================================================


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
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

