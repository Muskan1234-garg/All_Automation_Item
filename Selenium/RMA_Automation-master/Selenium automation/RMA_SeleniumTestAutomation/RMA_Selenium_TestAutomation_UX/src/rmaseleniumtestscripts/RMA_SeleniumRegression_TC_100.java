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
//TestCaseID     : RMA_SeleniumRegression_TC_100
//Description    : Create,Edit And Delete Of Enhanced Notes On Case Management On Injury/Illness(Case Managers For Policy) Page
//Depends On TC  : RMA_SeleniumRegression_TC_059
//Revision       : 0.0 - ShrutiShruti-03-01-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_100 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_100_Test() throws Exception,Error{
		parentlogger = reports.startTest("RMA_SeleniumRegression_TC_100_Create,Edit And Delete Of Enhanced Notes On Case Management On Injury/Illness(Case Manager) Page", "Create,Edit And Delete Of Enhanced Notes On Case Management On Injury/Illness Page Is Validated");
		parentlogger.assignAuthor("Shruti Shruti");
		try{
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			testcall5 = false;	
			loggerval5 = "NotInitialized";
			testcall6 = false;	
			loggerval6 = "NotInitialized";
			testcall7 = false;	
			loggerval7 = "NotInitialized";
			testcall8 = false;	
			loggerval8 = "NotInitialized";
			testcall9 = false;	
			loggerval9 = "NotInitialized";
			testcall10 = false;	
			loggerval10 = "NotInitialized";
			testcall11 = false;	
			loggerval11 = "NotInitialized";
			testcall12 = false;	
			loggerval12 = "NotInitialized";
			testcall13 = false;	
			loggerval13 = "NotInitialized";
			testcall14 = false;	
			loggerval14 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_100";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variables Are Initialized Here
			
			String StrDriverLastName;
			String Injury;
			String InjuryCreation_Txt_DateOfFileClosing;
			String InjuryCreation_Txt_DisabilityDate;
			String CaseMgnt;
			String CaseManagementCreation_Txt_HospitalFromDate;
			String CaseManagementCreation_Txt_HospitalToDate;
			String EnhancedNotes;
			boolean Edit;
			String StrDemandOffer;
			String VocatRehab;
			String VocRehabCreation_Txt_StartDate;
			String VocRehabCreation_Txt_EndDate;
			String StrCaseManager;
			String StrAccomm;
			//Local Variables Are Declared Here
			
			InjuryCreation_Txt_DateOfFileClosing=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			InjuryCreation_Txt_DisabilityDate=InjuryCreation_Txt_DateOfFileClosing;
			CaseManagementCreation_Txt_HospitalFromDate=InjuryCreation_Txt_DateOfFileClosing;
			CaseManagementCreation_Txt_HospitalToDate=CaseManagementCreation_Txt_HospitalFromDate;
			VocRehabCreation_Txt_StartDate=CaseManagementCreation_Txt_HospitalToDate;
			VocRehabCreation_Txt_EndDate=VocRehabCreation_Txt_StartDate;
			Edit=true;
			//Local Variables Are Initialized Here
			
			//===========================================================New Driver Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New Driver As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall1 = true;
			StrDriverLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("Driver", StrClaimNumber,logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Driver Is Created With Driver Last Name"+ " "+color.RMA_ChangeColor_Utility(StrDriverLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Driver As Person Involved Is Successfully Created
			//============================================================New Driver Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//============================================================New Injury/Illness Creation Started Here================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_InjuryIllness(driver), "Injury/Illness Image Button from Tool Bar On Created Person Involved Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("InjuryIllnessCreateEditDelete", "RMA_InjuryIllnessCreateEditDelete_Utility",0)+" Is Called To Create A Injury/Illness");
			testcall2 = true;
			Injury=RMA_Functionality_Utility.RMA_InjuryIllnessCreateEditDelete_Utility("Caught Between", "Injuries","AB", StrDriverLastName, InjuryCreation_Txt_DateOfFileClosing, InjuryCreation_Txt_DisabilityDate, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Injury/Illness ,Exists With Header::"+ " " + color.RMA_ChangeColor_Utility("Injury/Illness "+Injury, 2));
			parentlogger.appendChild(logger);
			// New Injury/Illness Is Created
			//=============================================================New Injury/Illness Creation Completed Here=============================================================================================================================================================================================================================================================================
		
			//===========================================================New DemandOffer Creation Is Started Here=====================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create DemandOffer");
			testcall3 = true;
			StrDemandOffer=RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("DemandOffer", StrClaimNumber, "Administrative", "ADM Administrative",logval1);
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New DemandOffer Is Created With Date::"+ " " + color.RMA_ChangeColor_Utility(StrDemandOffer, 2));
			parentlogger.appendChild(logger);
			//===========================================================New DemandOffer Creation Is Completed Here====================================================================================================================================================================================*/
			
			//===========================================================Delete Of Created DemandOffer Started Here=========================================================================================================================================================================================*/
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("DemandOffer Creation Page", false,logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("DemandOffer Creation Page", true, logval);
			//===========================================================Delete Of Created DemandOffer Completed Here=======================================================================================================================================================================================*/
			
			//=============================================================New Case Management Creation Started Here==================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Unit_Img_CaseManagement(driver), "Case Management Image Button On Injury/Illness Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CaseManagementCreateEditDelete", "RMA_CaseManagementCreateEditDelete_Utility",0)+" Is Called To Create A Case Management");
			testcall6 = true;
			CaseMgnt=RMA_Functionality_Utility.RMA_CaseManagementCreateEditDelete_Utility("Illness", "Lungs-Dust", CaseManagementCreation_Txt_HospitalFromDate, CaseManagementCreation_Txt_HospitalToDate, logval1);
			loggerval6 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Case Management ,Exists With Disability type::"+ " " + color.RMA_ChangeColor_Utility(CaseMgnt, 2));
			parentlogger.appendChild(logger);
			//==============================================================New Case Management Creation Completed Here==============================================================================================================================================================================================================================================
		
			//===========================================================Steps To Create And Edit Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_EnhancedNotes(driver), "Enhanced Notes Image On Claim/Event :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility",0)+" Is Called To Create A Enhanced Note");
			testcall7 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility("Create/Edit", "Confidential", "CF Confidential",StrEventNumber,"Enhanced Notes", "NotRequired",Edit,logval1);
			loggerval7 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Enhanced Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2));
			parentlogger.appendChild(logger);
			// New Enhanced Notes Is Created And Edited
			//===========================================================Steps To Create And Edit Enhanced Notes Completed Here============================================================================================================================================================================================================================================================

			//===========================================================Steps To Delete Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",1)+" Is Called To Delete An Already Created Enhanced Note");
			testcall8 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "CF Confidential", "Not Required", EnhancedNotes, Edit,logval1);
			loggerval8 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Existing Enhanced Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2)+ "Is Deleted");
			parentlogger.appendChild(logger);
			// Created Enhanced Notes Is Deleted
			//===========================================================Steps To Delete Enhanced Notes Completed Here============================================================================================================================================================================================================================================================		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Button On Enhanced Notes Page",logval);
			//Enhanced Notes Screen Is Closed	
										
			//==========================================================Steps To Create Case Managers Started Here=============================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Case Managers");
			testcall9 = true;
			StrCaseManager=RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Case Managers", StrClaimNumber, "ASD", "Restricted to Work",logval1);
			loggerval9 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Case Manager Is Created With Name::"+ " " + color.RMA_ChangeColor_Utility(StrCaseManager, 2));
			parentlogger.appendChild(logger);
			//=========================================================Steps To Create Case Managers Completed Here=========================================================================================================================================
						
			//===========================================================Steps To Create And Edit Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_EnhancedNotes(driver), "Enhanced Notes Image On Claim/Event :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility",0)+" Is Called To Create A Enhanced Note");
			testcall10 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility("Create/Edit", "Confidential", "CF Confidential",StrEventNumber,"Enhanced Notes", "NotRequired",Edit,logval1);
			loggerval10 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Enhanced Notes ,Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2));
			parentlogger.appendChild(logger);
			// New Enhanced Notes Is Created And Edited
			//===========================================================Steps To Create And Edit Enhanced Notes Completed Here============================================================================================================================================================================================================================================================

			//===========================================================Steps To Delete Enhanced Notes Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",1)+" Is Called To Delete An Already Created Enhanced Note");
			testcall11 = true;
			EnhancedNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "CF Confidential", "Not Required", EnhancedNotes, Edit,logval1);
			loggerval11 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Existing Enhanced Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(EnhancedNotes, 2)+ "Is Deleted");
			parentlogger.appendChild(logger);
			// Created Enhanced Notes Is Deleted
			//===========================================================Steps To Delete Enhanced Notes Completed Here============================================================================================================================================================================================================================================================		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_EnhancedNotes.RMAApp_EnhancedNotes_Btn_Close(driver), "Close Button On Enhanced Notes Page",logval);
			//Enhanced Notes Screen Is Closed
			
			//=========================================================Steps To Delete Created Case Manager Started Here==============================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Case Managers Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Case Managers Creation Page", true, logval);
			//=========================================================Steps To Delete Created Case Manager Completed Here=======================================================================================================================================
			
			//==============================================================Steps To Create Accommodations Started Here======================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Accommodations");
			testcall12 = true;
			StrAccomm=RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Accommodation", StrClaimNumber, "Different Job", "Anesthetist",logval1);
			loggerval12 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Accomodations Is Created With Position::"+ " " + color.RMA_ChangeColor_Utility(StrAccomm, 2));
			parentlogger.appendChild(logger);
			//===============================================================Steps To Create Accommodations Completed Here====================================================================================================================================
			
			//=========================================================Steps To Delete Created Accommodations Started Here==============================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Accommodation Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Accommodation Creation Page", true, logval);
			//=========================================================Steps To Delete Created Accommodations Completed Here=======================================================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver,StrDriverLastName),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			
			//=========================================================Steps To Delete Created Driver Started Here==============================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Driver Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Driver Creation Page", true, logval);
			//=========================================================Steps To Delete Created Driver Completed Here=======================================================================================================================================
						
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
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_InjuryIllnessCreateEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CaseManagementCreateEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall7 == true && loggerval7.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall8 == true && loggerval8.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall9 == true && loggerval9.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall10 == true && loggerval10.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall11 == true && loggerval11.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall12 == true && loggerval12.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall13 == true && loggerval13.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EnhancedNotesCreateEditDelete_SubEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall14 == true && loggerval14.equalsIgnoreCase("NotInitialized"))				
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
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver,StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}

}
