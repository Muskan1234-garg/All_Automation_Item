package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_002
//Description    : Diary Is Attached To Employee Maintenance With DairyNotes, Priority, Work Activity (Validated Too), Task Name (Validated Too), Estimated Hours Values, Required Tab Existence Is Verified, Cancel And Save Button Functionality Is Validated
//Depends On TC  : None
//Revision       : 0.0 - DebasmitaPati-02-13-2018
//======================================================================================================================================================================================================================================================================================
public class RMA_Reg_Maint_Employee_TC_002 extends RMA_TC_BaseTest {
		
	@Test
		public void RMA_Reg_Maint_Employee_TC_002_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_002_Attach Diary On Employee Maintenance Screen","Verify Successful Diary Creation For Employee, Diary Is Attached To Created Employee With DairyNotes, Priority, Work Activity (Validated Too), Task Name (Validated Too), Estimated Hours Values, Required Tab Existence Is Verified, Cancel And Save Button Functionality Is Validated");
			parentlogger.assignAuthor("Debasmita Pati");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_002";
			ErrorMessage = null;
			//Global Variable Initialization Completed 
			
			String StrEmployeeNumber;			
			String StrEmployeeLastName;
			String DiaryTaskName_SeleniumRegression_EmpAttachdiary;
			//Local Variable Declaration Completed Here
			
			//===========================================================New Employee With Mandatory Fields Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			//============================================================New Employee With Mandatory Fields Creation Is Completed Here======================================================================================================================================================================================================================================================================================
						
			//======================================================================New Diary Attached To Employee Maintenance Is Started===========================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following  Employee Maintenance Screen::"+" "+StrEmployeeLastName,logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DiaryCreateEdit", "RMA_AttachCreateEdit_Diary",0)+" To Attach A New Diary To Employee Maintenance");
			testcall2 = true;
			DiaryTaskName_SeleniumRegression_EmpAttachdiary = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA","CQE Complete Quick Entry","NA","NA", "NA", "Important","employee",logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_SeleniumRegression_EmpAttachdiary, 2)+" "+"For Employee Maintenance :"+" "+color.RMA_ChangeColor_Utility(StrEmployeeLastName,4));							
			parentlogger.appendChild(logger);
			//======================================================================New Diary Attached To Employee Maintenance Is Completed=======================================================================================================
										
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_AttachCreateEdit_Diary" + " " +  "And Hence The Test Case Is A Fail");
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

