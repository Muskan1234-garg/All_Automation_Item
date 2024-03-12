package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_MedicalStaff;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_042
//Description    : Create, Edit And Delete Of MedicalStaff From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-27-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_042 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_042_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_042_Create, Edit And Delete Of MedicalStaff From Maintenance Screen", " Create, Edit And Delete Of MedicalStaff From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_042";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
		
			String StrMedicalStaffLastName;
		
			//===========================================================New MedicalStaff Creation Is Started Here===================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New MedicalStaff From Maintenance Screen");
			testcall1 = true;
			StrMedicalStaffLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("MedicalStaff", "NA", "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New MedicalStaff Is Created With MedicalStaff LastName::"+ " " + color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New MedicalStaff From Maintenance Screen Is Successfully Created
			//============================================================New MedicalStaff Creation Is Completed Here===============================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That All Tabs Are Present For MedicalStaff Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_Staff(driver), "Staff Tab On MedicalStaff Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_StaffInfo(driver), "StaffInfo Tab On MedicalStaff Creation Page",logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_AlsoKnownAs(driver), "AlsoKnownAs Text Box On StaffInfo Tab Of MedicalStaff Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "KnownAs_"),logval);	
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_FacilityInfo(driver), "Facility Info Tab On MedicalStaff Creation Page",logval);	
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Txt_StaffStatus(driver), "StaffStatus Text Box On Facility Info Tab Of MedicalStaff Creation Page", "PV",logval);	
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_Addresses(driver), "Addresses Tab On MedicalStaff Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_EntityIDType(driver), "EntityID Type Tab On MedicalStaff Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_Supplementals(driver), "Supplemetals Tab On MedicalStaff Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_MedicalStaff.RMAApp_MedicalStaff_Tab_Staff(driver), "Staff Tab On MedicalStaff Creation Page",logval);	
			//===========================================================Verification That All Tabs Are Present For MedicalStaff Screen Started Here=======================================================================================================================================================================================================================================================
			
			//==========================================================Edit Of Created MedicalStaff Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created MedicalStaff From Maintenance Screen");
			testcall2 = true;
			StrMedicalStaffLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("MedicalStaff", "NA" ,CurrentFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following MedicalStaff Is Successful, Edited MedicalStaff LastName  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2));
			// New MedicalStaff From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created MedicalStaff Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created MedicalStaff Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("MedicalStaff Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("MedicalStaff Creation Page", true, logval);
			//==========================================================Delete Of Created MedicalStaff Is Completed Here==========================================================================================================================================================================================================================================================================================

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

