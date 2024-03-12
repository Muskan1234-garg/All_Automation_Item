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
//TestCaseID     : RMA_SeleniumRegression_TC_075
//Description    : Create, Edit and Delete of Attachments For A Newly Created Event Is Validated
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-12-15-2017
//======================================================================================================================================================================================================================================================================================


public class RMA_SeleniumRegression_TC_075 extends RMA_TC_BaseTest{

	@Test
	public void RMA_SeleniumRegression_TC_075_Test() throws Exception,Error {
		
		String EventCreation_Txt_DateOfEvent;
		String EventCreation_Txt_TimeReported;
		String EventCreation_Txt_TimeOfEvent;
		String EventCreation_Txt_DateReported;
		String EventCreation_Txt_EventStatus;
		String EventCreation_Txt_EventType;
		String EventCreation_Txt_Department;
		String FileName;
		String FileSize;
		//Local Variable Declaration	
			
		try{
		parentlogger = reports.startTest("RMA_SeleniumRegression_TC_075_Create, Edit And Delete Of Attachments_Event", "Create, Edit and Delete of Attachments For A Newly Created Event Is Validated");
		parentlogger.assignAuthor("Shruti Shruti");
		
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_SeleniumRegression_TC_075";
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
		FileName="RightClick.txt";
		FileSize = "0.0393 MB";
		//Local Variable Initialization Completed Here	
	 
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
	
		//***************************************************Add, Edit  Of Document Is Started*********************************************************************************************************************************************************************************************************************************
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Claim :"+" "+StrClaimNumber, logval);
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Claim :"+" "+StrClaimNumber);
		testcall1 = true;
		RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", FileName, FileSize, false, logval1);
		loggerval1 = logger.toString();
		parentlogger.log(LogStatus.INFO,  "Document Is Attached And Edited Successfully On Claim :"+" "+StrClaimNumber);
		parentlogger.appendChild(logger);
		//***************************************************Add, Edit Of Document Is Completed*********************************************************************************************************************************************************************************************************************************

		//***************************************************Attachment delete functionality on CLAIM screen is started here *********************************************************************************************************************************************************************************************************	
		parentlogger.log(LogStatus.INFO, "Following Function Is Called ::" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",1)+" Is Called To  Delete Attached Document On Claim :"+" "+StrClaimNumber);
		testcall2 = true;
		RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", FileName, FileSize, false, logval1);
		parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Claim :"+" "+StrClaimNumber);
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		 driver.switchTo().parentFrame();// switch to claim frame
	     RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button Attchement Screen", logval);// close attachment screen
		//***************************************************Attachment delete functionality on CLAIM screen is finished here *********************************************************************************************************************************************************************************************************	

		
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit Attachments And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 reports.endTest(logger);	
		 }
		 if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Attachments And Hence The Test Case Is A Fail");
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
			 /*if (!(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver)== null)){
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Image Button On Attachments Page (Finally Block Step)", logval);		
				}*/
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
