package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//=======================================================================================================================================================
//TestCaseID     : RMA_TC_376
//Description    : Creation, Edit And Deletion Of Enhanced Notes For Case Management System (Injury) Associated With A Claim
//Depends On TC  : RMA_TC_335
//Revision       : 0.0 - KumudNaithani-03-20-2017
//==============================================================================================================================================================
public class RMA_TC_376 extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
@Test	
public void RMA_TC_376_Test() throws Exception, Error
{   
	try {	 	 
	 String StrPrimaryWindowHandle;
 	 String ProgressNotes;
 	 boolean Edit;
 	 String StrCaseManagementIllnessType;
	 //Local Variable Declaration Completed
	 
	 parentlogger = reports.startTest("RMA_TC_376_Creation, Edit And Deletion Of Enhanced Notes For Case Management System (Injury) For Created Claim", "Creation, Edit And Deletion Of Enhanced Notes For Case Management System (Injury) Associated With A Claim");
	 parentlogger.assignAuthor("Kumud Naithani");
			
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";	
	 testcall3 = false;
	 loggerval3 = "NotInitialized";	
	 StrScreenShotTCName = "RMA_TC_376";
	 Edit = true;
	 //Variable Initialization Completed
     
	//===========================================================New Case Management System (Injury) Creation Associated With Claim Is Started Here=====================================================================================================================================================================================================================================================================================================================================
	 parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "Claim Entity Addition",0)+ " "+ "Is Called To Add Case Management System For Following Injury" + " " + RMA_TC_374.StrInjuryType_374+" "+"Added To Claim" + " "+color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	 testcall1 = true;
	 StrCaseManagementIllnessType = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Case Management System", "Case Management List (0)", StrClaimNumber_335, "Not Required", "ILL", "4", "Not Required", "Not Required", "Not Required", "4 Poison", logval1);
	 parentlogger.log(LogStatus.INFO, "New Case Management System Is Added Successfully With Illness Type::"+ " " + color.RMA_ChangeColor_Utility(StrCaseManagementIllnessType, 2) + " " +"To Claim Number::" + color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	 loggerval1 = logger.toString();
	 parentlogger.appendChild(logger);
	 parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Case Management System Creation", StrScreenShotTCName)));
	//=========================================================== New Case Management System Creation (Injury) Associated With Claim Is Completed Here=======================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Create And Edit Progress Notes Started Here==================================================================================================================================================================================================================================================================================================================================================
	StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image For Case Management System With Illness Type"+ " "+ color.RMA_ChangeColor_Utility(StrCaseManagementIllnessType, 2)+ " "+ "For Following Injury" + " " + RMA_TC_374.StrInjuryType_374+" "+"Added To Claim" + " "+color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2),logval1); // Claim ID Is Same For All Line Of Business
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create And Edit Progress Note");
	testcall2 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber_335, "NotRequired", Edit, logval1);
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
	//===========================================================Steps To Delete Progress Notes Completed Here===============================================================================================================================================================================================================================================================================================================================================================
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " For New Case Management System (Injury) Creation Associated With A Claim And Hence The Test Case Is A Fail");
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
				 String RMAApp_Login_Txt_UserName;
				 driver.switchTo().parentFrame();
				 RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
				 RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
				 RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMAApp_Login_Txt_UserName), "Expand Image Corresponding To Case Management System Link On Left Navigation Tree", logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}		
}