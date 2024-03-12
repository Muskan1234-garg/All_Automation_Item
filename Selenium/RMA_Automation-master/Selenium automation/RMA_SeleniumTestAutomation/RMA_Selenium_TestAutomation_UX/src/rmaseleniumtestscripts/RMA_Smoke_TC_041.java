package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_041
//Description    : Create, Edit And Delete Of Employee From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-27-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_041 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_041_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_041_Create, Edit And Delete Of Employee From Maintenance Screen", " Create, Edit And Delete Of Employee From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_041";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			String StrEmployeeNumber;
			String StrEmployeeLastName;
			
			//===========================================================New Employee Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Employee From Maintenance Screen Is Successfully Created
			//============================================================New Employee Creation Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That All Tabs Are Present For Employee Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmployeeInfo(driver), "Employee Info Tab On Employee Creation Page",logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_NumberOfViolations(driver), "NumberOfViolations Text Box On Employee Info Tab Of Employee Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "LocAddr1_"),logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Addresses(driver), "Addresses Tab On Employee Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EntityIDType(driver), "EntityID Type Tab On Employee Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Supplementals(driver), "Supplemetals Tab On Employee Creation Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
			//===========================================================Verification That All Tabs Are Present For Employee Screen Completed Here=======================================================================================================================================================================================================================================================
			
			//==========================================================Edit Of Created Employee Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Employee From Maintenance Screen");
			testcall2 = true;
			StrEmployeeLastName = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Employee", "NA" ,CurrentFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeNumber =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "value");
			parentlogger.log(LogStatus.PASS, "Edit Of Following Employee Is Successful, Edited Employee Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			//==========================================================Edit Of Created Employee Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created Employee Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Employee Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Employee Creation Page", true, logval);
			//==========================================================Delete Of Created Employee Is Completed Here==========================================================================================================================================================================================================================================================================================

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

