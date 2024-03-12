package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Document_Event;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed


//================================================================================================
//TestCaseID     : RMA_Smoke_TC_001
//Description    : RMA_Smoke_TC_001_Verify Event Is Created By Providing Data In All Mandatory Fields
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-06-27-2016 
//Revision       : 0.1 - RenuVerma-03-09-2017: Modify as Make variable StrEventNumber_RMA_Smoke_TC_001 as global to use in other testcase
//=================================================================================================

public class RMA_Smoke_TC_001 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrEventNumber_RMA_Smoke_TC_001;
	

	@Test
	public void RMA_Smoke_TC_001_Test() throws Exception,Error {
		
		int RMAApp_EventCreation_Txt_DateOfEvent;
		
		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_001_Event Creation", "Verify Event Is Created By Providing Data In All Mandatory Fields");
			parentlogger.assignAuthor("Kumud Naithani");
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_EventCreation_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_001", 1, 0); //DateOfEvent Is Fetched From DataSheet RMA_Smoke_TC_001
			
			String EventNumber_RMA_Smoke_TC_001;

			StrScreenShotTCName = "Smoke_TC_001";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Risk Master Application Is Getting Loaded");
			/*===========================================================Creation Of Event Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("TC003Event Creation", "RMA_TC_003",0)+" To Create Event");
			testcall1 = true;
			RMA_TC_003 event = new RMA_TC_003();
			EventNumber_RMA_Smoke_TC_001 = event.EventCreation();
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(EventNumber_RMA_Smoke_TC_001, 2));
			parentlogger.appendChild(logger);
			// New Event Is Created
			/*===========================================================Creation Of Event Is Completed Here================================================*/
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Link Tab On Event Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Reported Info"), "Reported Info Link Tab On Event Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Follow Up"), "Follow Up Link Tab On Event Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Quality Management"), "Quality Management Link Tab On Event Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On Event Page", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Event Info", "EventCreationPage", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DateOfEvent(driver), "DateOfEvent TextBox On Event Creation Page", String.valueOf(RMAApp_EventCreation_Txt_DateOfEvent),logval);		
			Thread.sleep(4000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button Is Clicked On Event Creation Page",logval);		
			
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Event Creation Page" , logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Event");
			
			StrEventNumber_RMA_Smoke_TC_001 = RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EvntNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
			logger.log(LogStatus.PASS, "Event Creation Is Successful And Valid Event Number Is Generated That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEventNumber_RMA_Smoke_TC_001, 2));
		
		
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase " +" "+ "RMA_TC_003" + " " +  "And Hence The Test Case Is A Fail");
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
			

		} catch (Exception|Error e) {
			
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

