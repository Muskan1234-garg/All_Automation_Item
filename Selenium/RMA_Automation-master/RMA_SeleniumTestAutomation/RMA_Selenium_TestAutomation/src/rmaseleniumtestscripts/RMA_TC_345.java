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
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//=======================================================================================================================================================
//TestCaseID     : RMA_TC_345
//Description    : Creation, Edit And Deletion Of Enhanced Notes For An Employee (Person Involved Added To Litigation) Associated With A Claim
//Depends On TC  : RMA_TC_335,339
//Revision       : 0.0 - KumudNaithani-03-03-2017
//==============================================================================================================================================================
public class RMA_TC_345 extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
@Test	
public void RMA_TC_345_Test() throws Exception, Error
{   
	try {	 	 
	 String StrEmployeeNumber;
	 String StrPrimaryWindowHandle;
 	 String ProgressNotes;
 	 boolean Edit;
	 //Local Variable Declaration Completed
	 
	 parentlogger = reports.startTest("RMA_TC_345_Creation, Edit And Deletion Of Enhanced Notes For A Litigation Employee (Person Involved)", "Creation, Edit And Deletion Of Enhanced Notes For An Employee (Person Involved Added To Litgation) Associated With A Claim");
	 parentlogger.assignAuthor("Kumud Naithani");
			
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";	
	 testcall3 = false;
	 loggerval3 = "NotInitialized";	
	 StrScreenShotTCName = "RMA_TC_345";
	 Edit = true;
	 //Variable Initialization Completed
     
	//===========================================================New Employee (Person Involved Added To Litigation) Creation Associated With Claim Is Started Here=====================================================================================================================================================================================================================================================================================================================================
	 RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_339.StrLitDocketNumber+")"), "Persons Involded Link Present Under Litigation Tree", logval);
	 parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To add A New Employee As Person Involved To Litigation"+ " "+ color.RMA_ChangeColor_Utility(RMA_TC_339.StrLitDocketNumber,2));
	 testcall1 = true;
	 StrEmployeeNumber = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Employee", logval1);
	 parentlogger.log(LogStatus.INFO, "New Employee With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2) + " "+"Is Added Successfully As Person Involved To Litigation::" + color.RMA_ChangeColor_Utility(RMA_TC_339.StrLitDocketNumber,2) + " " +"Associated To Claim Number::" + color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	 loggerval1 = logger.toString();
	 parentlogger.appendChild(logger);
	 parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Employee Addition As Person Involved To Litigation", StrScreenShotTCName)));
	//=========================================================== New Employee (Person Involved Added To Litigation) Creation Associated With Claim Is Completed Here=======================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Create And Edit Progress Notes Started Here==================================================================================================================================================================================================================================================================================================================================================
    StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image For Employee"+ " "+ color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "Person Involved Added To Litigation"+ " "+ color.RMA_ChangeColor_Utility(RMA_TC_339.StrLitDocketNumber,2)+  " "+ "Associated With Claim:"+" "+color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2), logval); // Claim ID Is Same For All Line Of Business
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create And Edit Progress Note");
	testcall2 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber_335, "NotRequired", Edit, logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "New Progress Notes Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2));
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " For New Employee (Person Involved Added To Litigation) Creation Associated With A Claim And Hence The Test Case Is A Fail");
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
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Right Side Of Litigation- Employee Page",logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Litigation- Employee Page Is Closed");
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}		
}