package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_068_TC
//Description    : Successful Add And Edit Physician From Maintenance
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-21-2016 
//=================================================================================================

public class RMA_Smoke_TC_068 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String StrEditedPhysicianLastName_068;
	
	@Test
	public void RMA_Smoke_TC_068_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_068_ Create And Edit Physician From Maintenance Page", " Successful Add And Edit Of Physician From Maintenance Page");
			parentlogger.assignAuthor("RenuVerma");
			
			int PhysicianLstNum;
			String StrPhysicianLastName_Actual;
			String PhysicianLstName;
			int PhysicianEmgCont;
			String PhysicianDOB;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "RMA_Smoke_TC_068";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData Is Fetched To Retrieve Data
			PhysicianEmgCont   =   ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_068", 1, 0); // Physician Emergency Contact Is Fetched From DataSheet RMA_TC
			PhysicianDOB=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 0, -40);
			
			/*================================================== Steps to Add New Physician Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			PhysicianLstName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Physician_");
			PhysicianLstNum = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111, 999999);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Physician Page",PhysicianLstName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PhysicianNum(driver), "Physician Number TextBox On Maintenance-->Physician Page",String.valueOf(PhysicianLstNum), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EmergencyContact(driver), "Emergency Contact Number TextBox On  Maintenance-->Physician Page", String.valueOf(PhysicianEmgCont), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Physician Info"), "Physician Info Link Tab On  Maintenance-->Physician Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Birthdate(driver), "Birth Date TextBox On  Maintenance-->Physician Page", PhysicianDOB, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("Physician", false, "NA", " Maintenance-->Physician Page", logval);
			StrPhysicianLastName_Actual = RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_LastName(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(PhysicianLstName, StrPhysicianLastName_Actual , "Physician Last Name Value",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Staff Info"), "Staff Info Link Tab On  Maintenance-->Physician Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Education"), "Education Link Tab On  Maintenance-->Physician Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Entity ID Type"), "Entity ID Type Link Tab On  Maintenance-->Physician Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On  Maintenance-->Physician Page", logval);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician Name::"+ " " + color.RMA_ChangeColor_Utility(PhysicianLstName, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Physician Is Created Successfully", StrScreenShotTCName)));
			/*====================================================Steps to Add New Physician Is Completed Here=======================================*/

			//===============================================Steps To Edit The Physician Added As Persons Involved Started ======================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityEdit", "RMA_MaintenanceEntityEdit_Utility",0)+" Is Called To Edit Physician ");
			testcall1 = true;
			StrEditedPhysicianLastName_068 = RMA_Functionality_Utility.RMA_MaintenanceEntityEdit_Utility("Physician", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Physician Is Edited Successfully With Physician Name::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPhysicianLastName_068, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Physician Last Name", StrScreenShotTCName)));
			//===============================================Steps To Edit The Physician Is Completed =================================================================================================================================================
		
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintenanceEntityEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
			if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
			{ FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); break; }
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
			reports.endTest(parentlogger); 
			reports.flush();
			
		}
	}		
}

