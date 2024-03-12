package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Physician;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_073
//Description    : Procedure can be added , edited and deleted from a patient Is Validated
//Depends On TC  : RMA_Smoke_TC_041_I
//Revision       : 0.0 - NidhiJha-15-01-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_073 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_073_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_073_ Procedure can be added , edited and deleted from a patient", "Procedure can be added , edited and deleted from a patient Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");


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
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_073";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			String StrPatientLastName;
			String Procedure_Creation_Txt_DateOfProcedure;
			String Procedure_Creation_Txt_DateOfProcedure_1;
			//Local Variable Declaration Completed Here
			
			Procedure_Creation_Txt_DateOfProcedure = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			Procedure_Creation_Txt_DateOfProcedure_1  =  RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,0,+1,"MM/dd/yyyy"); 
			//Local Variable Initialization Completed 
			
			//===========================================================New Patient Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Patient From Maintenance Screen");
			testcall1 = true;
			StrPatientLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Patient", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created With Patient LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			// New Patient From Maintenance Screen Is Successfully Created
			//============================================================New Patient Creation Is Completed Here================================================================================================================================================================================================================================================================
			 
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Patient Procedure")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Patient Procedure"), "Add Image Button For Patient Procedure For The Created Patient On Patient Maintenance Page",logval);

			//===========================================================New Patient Procedure Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PatientProcedureAdd", "RMA_PatientProcedureAddEditDeleteEntity_Utility",0)+" To Create New Procedure From Patient Screen");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_PatientProcedureAddEditDeleteEntity_Utility("Create", Procedure_Creation_Txt_DateOfProcedure, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Contract Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			//============================================================New Patient Procedure Creation Is Completed Here================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Patient Procedure Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Patient Procedure Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ViewAllPopup_AddNew(driver), "Add Icon On Patient Procedure Grid ", logval);
			//Add Button To Add New Education Is Clicked
			
			//===========================================================Second Patient Procedure Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PatientProcedureAdd", "RMA_PatientProcedureAddEditDeleteEntity_Utility",0)+" To Create New Procedure From Patient Screen");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PatientProcedureAddEditDeleteEntity_Utility("Create", Procedure_Creation_Txt_DateOfProcedure_1, logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Contract Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			//============================================================Second Patient Procedure Creation Is Completed Here================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Patient Procedure Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 2, "Patient Procedure Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(Procedure_Creation_Txt_DateOfProcedure_1, "Date Of Procedure Link On Patient Lookup Page", logval);
			
			//===========================================================Steps To Verify And Delete Created First Patient Procedure On Patient Procedure Page Is Started Here=======================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Delete Image Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_DeleteRecord(driver), "Delete Record Icon On Patient Procedure Page ", logval);
			RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("No", "Partial",RMA_Selenium_POM_VerificationMessage.PrivilegeDeleteConfirmation, "Delete Message On Deleting a Patient Procedure", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Patient Procedure Page Needs To Get Loaded");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PatientProcedureAdd", "RMA_PatientProcedureAddEditDeleteEntity_Utility",0)+" To delete the created Procedure From Patient Screen");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PatientProcedureAddEditDeleteEntity_Utility("Delete", Procedure_Creation_Txt_DateOfProcedure_1, logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Procedure Is deleted With Patient LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			//===========================================================Steps To Verify And Delete Created First Patient Procedure On Patient Procedure Page Is Ended Here=================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Patient Procedure")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Patient Procedure"), "Add Image Button For Patient Procedure For The Created Patient On Patient Maintenance Page",logval);

			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Patient Procedure Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Patient Procedure Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(Procedure_Creation_Txt_DateOfProcedure, "Date Of Procedure Link On Patient Lookup Page", logval);
			
			//===========================================================Steps To Verify And Delete Created Second Patient Procedure On Patient Procedure Page Is Started Here=======================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PatientProcedureAdd", "RMA_PatientProcedureAddEditDeleteEntity_Utility",0)+" To delete the created Procedure From Patient Screen");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_PatientProcedureAddEditDeleteEntity_Utility("Delete", Procedure_Creation_Txt_DateOfProcedure, logval1);
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Procedure Is deleted With Patient LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			//===========================================================Steps To Verify And Delete Created Second Patient Procedure On Patient Procedure Page Is Ended Here=================================================

			//===========================================================Steps To Verify And Delete Created Second Patient Procedure On Patient Procedure Page Is Started Here=======================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PatientProcedureAdd", "RMA_PatientProcedureAddEditDeleteEntity_Utility",0)+" To delete the created Procedure From Patient Screen");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_PatientProcedureAddEditDeleteEntity_Utility("Delete", Procedure_Creation_Txt_DateOfProcedure, logval1);
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Procedure Is deleted With Patient LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			//===========================================================Steps To Verify And Delete Created Second Patient Procedure On Patient Procedure Page Is Ended Here=================================================

			
			
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "To create a new patient And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PatientProcedureAddEditDeleteEntity_Utility" + " " +  "To create a new patient procedure on the created patient And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PatientProcedureAddEditDeleteEntity_Utility" + " " +  "To create second patient procedure on the created patient And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PatientProcedureAddEditDeleteEntity_Utility" + " " +  "To delete first created patient procedure on the created patient And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PatientProcedureAddEditDeleteEntity_Utility" + " " +  "To delete second created patient procedure on the created patient And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PatientProcedureAddEditDeleteEntity_Utility" + " " +  "To delete the created patient And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

