package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_EnhancedNotes;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Packages Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_094
//Description    : Create,Edit And Delete Of Enhanced Notes On Injury/Illness Page
//Depends On TC  : RMA_SeleniumRegression_TC_058
//Revision       : 0.0 - ShrutiShruti-01-02-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_094 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_094_Test() throws Exception,Error{
		try{
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			StrScreenShotTCName = "SeleniumRegression_TC_094";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed Here
			
			String InjuryCreation_Txt_DateOfFileClosing;
			String InjuryCreation_Txt_DisabilityDate;
			String EnhancedNotes;
			boolean Edit;
			String Injury;
			String StrOtherPersonLastName;
			//Local Variables Declaration Completed Here
			
			InjuryCreation_Txt_DateOfFileClosing=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			InjuryCreation_Txt_DisabilityDate=InjuryCreation_Txt_DateOfFileClosing;
			Edit=true;
			//Local Variables Initialization Completed Here
			
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_094_Create, Edit and Delete of Enhanced Notes On Injury/Illness Page", "Create, Edit and Delete of Enhanced Notes On Injury/illness Page Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			//===========================================================New OtherPerson Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New OtherPerson As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall1 = true;
			StrOtherPersonLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("OtherPerson", StrClaimNumber,logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New OtherPerson Is Created With OtherPerson Last Name"+ " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New OtherPerson As Person Involved Is Successfully Created
			//============================================================New OtherPerson Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================

			//============================================================New Injury/Illness Creation Started Here================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_InjuryIllness(driver), "Injury/Illness Image Button from Tool Bar On Created Person Involved Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("InjuryIllnessCreateEditDelete", "RMA_InjuryIllnessCreateEditDelete_Utility",0)+" Is Called To Create A Injury/Illness");
			testcall2 = true;
			Injury=RMA_Functionality_Utility.RMA_InjuryIllnessCreateEditDelete_Utility("Caught Between", "Injuries","AB", StrOtherPersonLastName, InjuryCreation_Txt_DateOfFileClosing, InjuryCreation_Txt_DisabilityDate, logval);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Injury/Illness ,Exists With Header::"+ " " + color.RMA_ChangeColor_Utility("Injury/Illness "+Injury, 2));
			parentlogger.appendChild(logger);
			// New Injury/Illness Is Created
			//=============================================================New Injury/Illness Creation Completed Here=============================================================================================================================================================================================================================================================================
		
			//===========================================================Steps To Create And Edit Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_EnhancedNotes(driver), "Enhanced Notes Image On Claim/Event :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create A Enhanced Note");
			testcall3 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential",StrClaimNumber, "NotRequired",Edit,logval1);
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Enhanced Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2));
			parentlogger.appendChild(logger);
			// New Enhanced Notes Is Created And Edited
			//===========================================================Steps To Create And Edit Enhanced Notes Completed Here============================================================================================================================================================================================================================================================

			//===========================================================Steps To Delete Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",1)+" Is Called To Delete An Already Created Enhanced Note");
			testcall4 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "CF Confidential", "Not Required", EnhancedNotes, Edit,logval1);
			loggerval4 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Existing Enhanced Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2)+ "Is Deleted");
			parentlogger.appendChild(logger);
			// Created Enhanced Notes Is Deleted
			//===========================================================Steps To Delete Enhanced Notes Completed Here============================================================================================================================================================================================================================================================		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Button On Enhanced Notes Page",logval);
			//Enhanced Notes Screen Is Closed
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrOtherPersonLastName),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);

			//==========================================================Delete Of Created OtherPerson Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("OtherPerson Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("OtherPerson Creation Page", true, logval);
			//==========================================================Delete Of Created OtherPerson Is Completed Here==========================================================================================================================================================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_InjuryIllnessCreateEditDelete_Utility" + " " +  "To Create And Edit Enhanced Notes And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Enhanced Notes And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Enhanced Notes And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Error Condition Has Occured During Enhanced Notes Create, Edit And Delete And Enhanced Notes Screen Needs To Be Closed");
				if (!(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver)== null))
				{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Image Button On Enhanced Notes Page (Finally Block Step)", logval);		
				}
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}

}
