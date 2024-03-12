package rmaseleniumtestscripts;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed
import rmaseleniumPOM.RMA_Selenium_POM_Document_Event;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_003
//Description    : Successful Event Creation Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-13-2015 
//=================================================================================================
public class RMA_TC_003 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrEventNumber_RMA_TC_003;
	static String StrScreenShotTCName;
@Test 
public String EventCreation() throws Exception, Error 
{
	try {
		logger = reports.startTest("<span id='TC003Event Creation'>TC_003_Event Creation</span>", "A New Event Is Created And The Created Event's Event Number Is Stored In A Global Variable");
			
		String RMAApp_EventCreation_Txt_EventType;
		String RMAApp_EventCreation_Txt_DepteId;
		int RMAApp_EventCreation_Txt_TimeOfEvent;
		String RMAApp_EventCreation_Txt_EventStatus;
		int RMAApp_EventCreation_Txt_DateReported;
		int RMAApp_EventCreation_Txt_TimeReported;
		int RMAApp_EventCreation_Txt_DateOfEvent; 
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_EventCreation_Txt_EventType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 0); //TypeOfEvent Is Fetched From DataSheet RMA_TC_003
		RMAApp_EventCreation_Txt_DepteId = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 6); //Dept Id Is Fetched From DataSheet RMA_TC_003
		RMAApp_EventCreation_Txt_EventStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 3); //Event Status Is Fetched From DataSheet RMA_TC_003
		RMAApp_EventCreation_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 2); //TimeOfEvent Is Fetched From DataSheet RMA_TC_003
		RMAApp_EventCreation_Txt_DateReported = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 4); //DateOfReporting Is Fetched From DataSheet RMA_TC_003
		RMAApp_EventCreation_Txt_TimeReported = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 5); //TimeOfReporting Is Fetched From DataSheet RMA_TC_003
		RMAApp_EventCreation_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 1); //DateOfEvent Is Fetched From DataSheet RMA_TC_003

		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-Event", logval1);
		System.out.println("Clicked Menu");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Event"); //A Switch To The Frame Containing Event Creation Controls IS Done
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventType(driver), "Event Type TextBox On Event Creation Page",logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventType(driver), "Event Type TextBox On Event Creation Page", RMAApp_EventCreation_Txt_EventType,logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(7, logval1, "Wait Is Added As Event Type Value Is Set In Event Type TextBox On Event Creation Page");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On Event Creation Page", String.valueOf(RMAApp_EventCreation_Txt_TimeOfEvent),logval1);	
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DateReported(driver), "DateReported TextBox On Event Creation Page", String.valueOf(RMAApp_EventCreation_Txt_DateReported),logval1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventStatus(driver), "EventStatus TextBox On Event Creation Page",logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventStatus(driver), "EventStatus TextBox On Event Creation Page", RMAApp_EventCreation_Txt_EventStatus,logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Event Status Value Is Set In Event Status TextBox On Event Creation Page");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_TimeReported(driver), "TimeReported TextBox On Event Creation Page", String.valueOf(RMAApp_EventCreation_Txt_TimeReported),logval1);	
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DateOfEvent(driver), "DateOfEvent TextBox On Event Creation Page", String.valueOf(RMAApp_EventCreation_Txt_DateOfEvent),logval1);		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DepteId(driver), " DeptId TextBox On Event Creation Page",logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DepteId(driver), " DeptId TextBox On Event Creation Page", RMAApp_EventCreation_Txt_DepteId,logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Department ID Value Is Set In Department ID TextBox On Event Creation Page");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Event Creation Page",logval1);		
		
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval1);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Event Creation Page" , logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Event");
		
		StrEventNumber_RMA_TC_003 = RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EvntNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
		logger.log(LogStatus.PASS, "Event Creation Is Successful And Valid Event Number Is Generated That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEventNumber_RMA_TC_003, 2));
		
		RMA_ExcelDataRetrieval_Utility.WriteDataToExcel(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx","RMA_TC_003", 10, 0, StrEventNumber_RMA_TC_003);
		logger.log(LogStatus.INFO, "Generated Event Number:" + " " + color.RMA_ChangeColor_Utility(StrEventNumber_RMA_TC_003, 2) + " " + "Is Also Written In The Corresponding Excel Data Sheet RMA_TC_003");
		
		return StrEventNumber_RMA_TC_003;
		
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
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		StrScreenShotTCName = "TC_003";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}
