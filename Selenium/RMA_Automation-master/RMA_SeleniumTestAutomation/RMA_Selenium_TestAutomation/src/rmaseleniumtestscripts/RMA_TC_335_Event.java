package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_335_Event
//Description    : Creation, Edit And Deletion Of Enhanced Notes For An Already Created Event 
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-02-24-2017
//=================================================================================================

public class RMA_TC_335_Event extends RMA_TC_BaseTest {	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName; 
		
@Test 
public void RMA_TC_335_Event_Test() throws Exception, Error
{
	String StrPrimaryWindowHandle;
	String ProgressNotes;
	boolean Edit;
	//Local Variable Declaration Completed
try
	{
	 parentlogger = reports.startTest("RMA_TC_335_Creation, Edit And Deletion Of Enhanced Notes For Event", "Creation, Edit And Deletion Of Enhanced Notes For An Already Created Event");
	 parentlogger.assignAuthor("Kumud Naithani");
     
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";
	 testcall3 = false;
	 loggerval3 = "NotInitialized";
	 StrScreenShotTCName = "RMA_TC_335_Event";
	 Edit = true;
	 //Variable Initialization Completed
	 
	 RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
	 RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Risk Master Application Is Getting Loaded");
	 
	 //===========================================================New Event Creation Is Started Here======================================================================================================================================================
	 parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("TC003_Event Creation", "RMA_TC_003",0)+" To Create New Event");
	 testcall1 = true;
	 RMA_TC_003 event = new RMA_TC_003();
	 StrClaimNumber_335 = event.EventCreation();  // Here Created Event Is Stored In StrClaimNumber_335 Variable As In Concerned Test Cases Enhanced Note Functionality Is Tested For Both Claim And Events And Majority Test Cases Are Of Claims
	 loggerval1 = logger.toString();
	 parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	 parentlogger.appendChild(logger);
 	//===========================================================New Event Creation Is Completed Here================================================================================================================================================================
	
	//===========================================================Steps To Create And Progress Notes Started Here============================================================================================================================================================================================================================================================
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image On Event :"+" "+StrClaimNumber_335, logval); // Claim/Event ID Is Same For All Line Of Business
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create A Progress Note");
	testcall2 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber_335, "NotRequired",Edit,logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "New Progress Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2));
	parentlogger.appendChild(logger);
	// New Progress Notes Is Created And Edited
	//===========================================================Steps To Create And Edit Progress Notes Completed Here============================================================================================================================================================================================================================================================

	//===========================================================Steps To Delete Progress Notes Started Here============================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",2)+" Is Called To Delete An Already Created Progress Note");
	testcall3 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "Not Required", "Not Required", ProgressNotes, Edit,logval1);
	loggerval3 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Existing Progress Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2)+ "Is Deleted");
	parentlogger.appendChild(logger);
	// Created Progress Notes Is Deleted
	driver.close();
	driver.switchTo().window(StrPrimaryWindowHandle);
	//===========================================================Steps To Delete Progress Notes Completed Here============================================================================================================================================================================================================================================================
	} catch (Exception|Error e)  {
				
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
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Child Test Case" +" "+ "RMA_TC_003" + " " +  "For Event Creation And Hence The Test Case Is A Fail");
	 parentlogger.appendChild(logger);
	 }
	 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
	 {
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit Enhanced Notes And Hence The Test Case Is A Fail");
	 parentlogger.appendChild(logger);
	 }
	 if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
	 {
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Enhanced Notes And Hence The Test Case Is A Fail");
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		try {
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Event"), "Expand Image Corresponding To General Claim Link" + " "+StrClaimNumber_335+ " " +"On Left Navigation Tree", logval);	
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
		}
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}