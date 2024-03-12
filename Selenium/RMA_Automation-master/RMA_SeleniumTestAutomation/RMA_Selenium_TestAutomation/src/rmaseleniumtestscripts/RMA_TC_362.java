package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//==================================================================================================================================================================
//TestCaseID     : RMA_TC_362
//Description    : Successful Creation, Edit And Deletion Of Enhanced Notes For Created Policy (Maintenance Policy Tracking Page) Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-03-13-2017
//=====================================================================================================================================================================

public class RMA_TC_362 extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
@Test	
public void RMA_TC_362_Test() throws Exception, Error
{   
	try {
	 String StrPrimaryWindowHandle;
 	 String ProgressNotes;
 	 String StrPolicyName;
 	 String StrPolicyNumber;
 	 String PolicyTracking_Status;
 	 Date PolicyTracking_ExpDate;
 	 String PolicyTracking_PriPolicyState;
 	 String PolicyTracking_CMCState;
 	 String PolicyTracking_InsurerLName;
 	 String PolicyTracking_Insured;
 	 int PolicyTracking_Premium;
	 Date PolicyTracking_EffDate;
	 boolean Edit;
	 //Local Variable Declaration Completed
	 
	 parentlogger = reports.startTest("RMA_TC_362_Creation, Edit And Deletion Of Enhanced Notes For Created Policy (Maintenance Policy Tracking Page) ", "Successful Creation, Edit And Deletion Of Enhanced Notes For Created Policy (Maintenance Policy Tracking Page)  Is Validated");
	 parentlogger.assignAuthor("Kumud Naithani");
			
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";	
	 testcall3 = false;
	 loggerval3 = "NotInitialized";	
	 StrScreenShotTCName = "RMA_TC_362";
	 Edit = true;
	 //Variable Initialization Completed
	 
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData IS Fetched To Retrieve Data 
	PolicyTracking_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 0); //Policy Status Is Fetched From DataSheet RMA_TC_051
	PolicyTracking_PriPolicyState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 1); //Primary Policy State Is Fetched From DataSheet RMA_TC_051
	PolicyTracking_CMCState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 2); //CMC State Is Fetched From DataSheet RMA_TC_051
	PolicyTracking_InsurerLName =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 3); //Insurer Last Name Is Fetched From DataSheet RMA_TC_051
	PolicyTracking_Insured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 4); // Insured Is Fetched From DataSheet RMA_TC_051
	PolicyTracking_Premium = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_051", 1, 5); // Premium Is Fetched From DataSheet RMA_TC_051	
	PolicyTracking_EffDate =new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());
	PolicyTracking_ExpDate=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(4,10,2));
	 
	RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
	//===========================================================Creation Of New Policy (Maintenance Policy Tracking Page) Is Started Here=====================================================================================================================================================================================================================================================================================================================================
	
	parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolTrack", "RMA_PolicyTracking_Utility",0)+ " To Create New Policy");
	testcall1 = true;		
	StrPolicyName= RMA_Functionality_Utility.RMA_PolicyTracking_Utility(PolicyTracking_Status,PolicyTracking_EffDate ,PolicyTracking_ExpDate,PolicyTracking_Premium, PolicyTracking_PriPolicyState, PolicyTracking_CMCState, PolicyTracking_InsurerLName, PolicyTracking_Insured, "NA","NA","NA",false, logval1);	
	loggerval1 = logger.toString();
	parentlogger.appendChild(logger);
	StrPolicyNumber =RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver).getAttribute("value");
	parentlogger.log(LogStatus.INFO, "New Policy With Policy Name::"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName, 2) +"And Policy Number" + color.RMA_ChangeColor_Utility(StrPolicyNumber, 2) + "Is Created");		
	parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Policy Creation On Policy Tracking Page", StrScreenShotTCName)));
	//=========================================================== Creation Of New Policy (Maintenance Policy Tracking Page) Is Completed Here=======================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Create And Edit Progress Notes Started Here==================================================================================================================================================================================================================================================================================================================================================
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image For Created Policy (Maintenance Policy Tracking Page) With Name:"+ " "+ color.RMA_ChangeColor_Utility(StrPolicyName, 2), logval);
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create And Edit Progress Note");
	testcall2 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrPolicyName, "NotRequired", Edit, logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Progress Notes Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2));
	parentlogger.appendChild(logger);
	// New Progress Notes Is Created And Edited	
	//===========================================================Steps To Create And Edit Progress Notes Completed Here===================================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Delete Progress Notes Started Here=====================================================================================================================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",2)+" Is Called To Delete An Already Created Progress Note");
	testcall3 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "Not Required", "Not Required", ProgressNotes, Edit, logval1);
	loggerval3 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Existing Progress Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2)+ "Is Deleted");
	parentlogger.appendChild(logger);
	// Created Progress Notes Is Deleted
	driver.close();
	driver.switchTo().window(StrPrimaryWindowHandle);
	//===========================================================Steps To Delete Progress Notes Completed Here=====================================================================================================================================================================================================================================================================================================================================================================
	
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
		 if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PolicyTracking_Utility" + " " +  "To Create New Policy (Maintenance Policy Tracking Page) And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit An Enhanced Notes And Hence The Test Case Is A Fail");
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
public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}		
}