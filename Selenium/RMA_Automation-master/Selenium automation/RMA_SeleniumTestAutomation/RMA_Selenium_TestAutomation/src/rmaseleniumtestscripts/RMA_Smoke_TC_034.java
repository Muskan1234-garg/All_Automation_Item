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

//===============================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_034
//Description    : RMA_Smoke_TC_034_Verify That Enhanced Notes Can Be Created,Edited And Deleted Successfully From Claim Page
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-26-2016 
//				 : 0.1 - KumudNaithani-04-07-2017 Changes Done To Reflect Changes In RMA_EnhancedNotesCreateEditDelete_Utility Function Wherein Edit Is Not A Separate Case But Condition Taken Care Inside Create Case
//=================================================================================================================================================================================================================

public class RMA_Smoke_TC_034 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_034_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_034_Enhanced Notes Create, Edit And Delete", "Verify That Enhanced Notes Can Be Created,Edited And Deleted Successfully From Claim Page");
			parentlogger.assignAuthor("Kumud Naithani");
			
			String StrPrimaryWindowHandle;
			String ProgressNotes;
			boolean Edit;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_034";
			testcall1 = false;	
			testcall2 = false;
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			Edit = true;
			//Variable Initialization Completed

			//===========================================================Steps To Create And Edit Progress Notes Started Here============================================================================================================================================================================================================================================================
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image On Event :"+" "+StrClaimNumber_002, logval); // Claim/Event ID Is Same For All Line Of Business
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create A Progress Note");
			testcall1 = true;
			ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber_002, "NotRequired",Edit,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Progress Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2));
			parentlogger.appendChild(logger);
			// New Progress Notes Is Created And Edited
			//===========================================================Steps To Create And Edit Progress Notes Completed Here============================================================================================================================================================================================================================================================

			//===========================================================Steps To Delete Progress Notes Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",2)+" Is Called To Delete An Already Created Progress Note");
			testcall2 = true;
			ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "Not Required", "Not Required", ProgressNotes, Edit,logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Existing Progress Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2)+ "Is Deleted");
			parentlogger.appendChild(logger);
			// Created Progress Notes Is Deleted
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			//===========================================================Steps To Delete Progress Notes Completed Here============================================================================================================================================================================================================================================================		
		
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
			
			 if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			 {
			 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit Enhanced Notes And Hence The Test Case Is A Fail");
			 parentlogger.appendChild(logger);
			 }
			 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
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
			
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
	}
