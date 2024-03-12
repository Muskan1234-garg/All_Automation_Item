package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Patient;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_043
//Description    : Create, Edit And Delete Of Patient From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-27-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_043 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_043_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_043_Create, Edit And Delete Of Patient From Maintenance Screen", " Create, Edit And Delete Of Patient From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_043";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
		
			String StrPatientLastName;
			//===========================================================New Patient Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Patient From Maintenance Screen");
			testcall1 = true;
			StrPatientLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Patient", "NA", "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created With Patient LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Patient From Maintenance Screen Is Successfully Created
			//============================================================New Patient Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//==========================================================Edit Of Created Patient Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Patient From Maintenance Screen");
			testcall2 = true;
			StrPatientLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Patient", "NA" ,CurrentFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Patient Is Successful, Edited Patient LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPatientLastName, 2));
			// New Patient From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Patient Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That All Tabs Are Present For Patient Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_Patient(driver, "up"), "Patient Tab On Patient Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_AdmissionInfo(driver), "AdmissionInfo Tab On Patient Creation Page",logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_MedicalRecordNumber(driver), "MedicalRecordNumber Text Box On AdmissionInfo Tab Of Patient Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)),logval);	
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_PatientFacilityInfo(driver), "Patient Facility Info Tab On Patient Creation Page",logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_PatientWeight(driver), "Patient Weight Text Box On Patient Facility Info Tab Of Patient Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10, 99)),logval);	
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_PhysicianDiagnosisInfo(driver), "PhysicianDiagnosisInfo Tab On Patient Creation Page",logval);	
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_DisabilityType(driver), "DisabilityType Text Box On PhysicianDiagnosisInfo Tab Of Patient Creation Page", "INJ",logval);	
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_NewbornInfo(driver), "NewbornInfo Tab On Patient Creation Page",logval);	
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Patient.RMAApp_MaintPatient_Txt_NoOfLiveBirths(driver), "Number Of LiveBirths Text Box On NewbornInfo Tab Of Patient Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10, 99)),logval);	
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_Addresses(driver), "Addresses Tab On Patient Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_EntityIDType(driver), "EntityID Type Tab On Patient Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_Supplementals(driver), "Supplemetals Tab On Patient Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Patient.RMAApp_Patient_Tab_Patient(driver, "down"), "Patient Tab On Patient Creation Page",logval);	
			//===========================================================Verification That All Tabs Are Present For Patient Screen Started Here=======================================================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created Patient Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Patient Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Patient Creation Page", true, logval);
			//==========================================================Delete Of Created Patient Is Completed Here==========================================================================================================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceEditEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

