package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_PolicyDownlod;
import rmaseleniumPOM_UX.RMA_Selenium_POM_EnhancedNotes;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Packages Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_099
//Description    : Create,Edit And Delete Of Enhanced Notes On Policy On Carrier GC Page
//Depends On TC  : RMA_SeleniumRegression_TC_059
//Revision       : 0.0 - ShrutiShruti-03-01-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_099 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_099_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_099_Create,Edit And Delete Of Enhanced Notes On Policy For Carrier GC Page", "Create,Edit And Delete Of Enhanced Notes On Policy For Carrier GC Page Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_099";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variables Are Initialized Here
			
			String EnhancedNotes;
			boolean Edit;
			//Local Variables Declared Here
			
			Edit=true;
			//Local Variables Initialized Here
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Weblink_PolicyOnCarrierGC(driver), "Policy Number WebLink Below Policy Option On General Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Policy Is Loaded");
			
			//===========================================================Steps To Create And Edit Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_EnhancedNotes(driver), "Enhanced Notes Image On Claim/Event :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility",0)+" Is Called To Create A Enhanced Note");
			testcall1 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility("Create/Edit", "Confidential", "CF Confidential","POLICY","Policy Enhanced Notes", "NotRequired",Edit,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Enhanced Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2));
			parentlogger.appendChild(logger);
			// New Enhanced Notes Is Created And Edited
			//===========================================================Steps To Create And Edit Enhanced Notes Completed Here============================================================================================================================================================================================================================================================

			//===========================================================Steps To Delete Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",1)+" Is Called To Delete An Already Created Enhanced Note");
			testcall2 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "CF Confidential", "Not Required", EnhancedNotes, Edit,logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Existing Enhanced Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2)+ "Is Deleted");
			parentlogger.appendChild(logger);
			// Created Enhanced Notes Is Deleted
			//===========================================================Steps To Delete Enhanced Notes Completed Here============================================================================================================================================================================================================================================================		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Button On Enhanced Notes Page",logval);
			//Enhanced Notes Screen Is Closed
		}
		catch(Exception|Error e)
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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


