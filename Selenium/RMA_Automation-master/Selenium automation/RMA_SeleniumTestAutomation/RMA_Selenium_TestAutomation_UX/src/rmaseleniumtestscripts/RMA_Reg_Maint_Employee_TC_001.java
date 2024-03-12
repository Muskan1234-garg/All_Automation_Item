package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_001
//Description    : Create, Edit And Delete Of Employee From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - DebasmitaPati-02-19-2018
//======================================================================================================================================================================================================================================================================================
public class RMA_Reg_Maint_Employee_TC_001 extends RMA_TC_BaseTest {
		
	@Test
		public void RMA_Reg_Maint_Employee_TC_001_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_001_Create, Edit And Delete Of Employee From Maintenance Screen", " Create, Edit And Delete Of Employee From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Debasmita Pati");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_001";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			String StrEmployeeNumber;			
			String StrEmployeeLastName;
			String EntityVal;
			String EntityVal1;
			String EntityVal2;
			String EntLName;
			String EntFName;
			String EntMName;
			//Local Variable Declaration Completed
			
			EntityVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedEmpLastName_");
			EntityVal1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedEmpFirstName_");
			EntityVal2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedEmpMidName_");
			//Local Variable Initialization Completed
			
			driver.switchTo().window(StrRMAUXWindowHandle);
			driver.close();
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			//===========================================================New Employee With Mandatory Fields Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			//============================================================New Employee With Mandatory Fields Creation Is Completed Here======================================================================================================================================================================================================================================================================================
		
			//============================================================Edit Of Created Employee Is Started  Here=====================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Verification Of Edit Of Created Employee Is Started From Here");
			//Updated Employee Last Name, First Name And Middle Name
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Employee Last Name TextBox On Maintenance-->Employee Page", EntityVal, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_FirstName(driver), "Employee First Name TextBox On Maintenance-->Employee Page", EntityVal1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_MiddleName(driver), "Employee Middle Name TextBox On Maintenance-->Employee Page", EntityVal2, logval);
			
		    //Save Edited Employee 
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Maintenance-->Employee Page", logval);
			
			//Verification Of Last Name, First Name And Middle Name
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
			EntLName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(EntityVal, EntLName, "Employee LastName Value", logval);
			EntFName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_FirstName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(EntityVal1, EntFName, "Employee FirstName Value", logval);
			EntMName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_MiddleName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(EntityVal2, EntMName, "Employee MiddleName Value", logval);
			parentlogger.log(LogStatus.PASS, "Employee Edited Successfully With Employee Last Name"+ " " + color.RMA_ChangeColor_Utility(EntLName, 2)+" "+ ", Employee First Name"+" "+color.RMA_ChangeColor_Utility(EntFName, 2)+" "+ "And Employee Middle Name"+ " "+color.RMA_ChangeColor_Utility(EntMName, 2));
			parentlogger.log(LogStatus.PASS, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Employee Edited Successfully", "Successful Employee Edit With Last Name, First Name And Middle Name"+ " "+ EntLName+" "+EntFName+" "+EntMName)));
			//============================================================Edit Of Created Employee Is Completed  Here=====================================================================================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created Employee Is Started Here=========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Verification Of Delete Of Created Employee Is Started From Here");
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Employee Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Employee Creation Page", true, logval);
			//==========================================================Delete Of Created Employee Is Completed Here========================================================================================================================================================================================================================================================================================
				
			//======================================================Search The Deleted employee To Verify Its Existence In The System Started Here==========================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Navigation_Utility.RMA_MenuOptionClick("Search;Employee", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchEmployeeFrame);//new POM added in RMA_Selenium_POM_VerificationMessage
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_EmployeeSearch_Txt_EmployeeNumber(driver), "Employee Number TextBox On -->Search Employee Page", StrEmployeeNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Employee.RMAApp_EmployeeSearch_Btn_SubmitQuery(driver), "Submit Button On-->Search Employee Page", logval); 
			RMA_Verification_Utility.RMA_ElementExist_Utility(driver.findElement(By.xpath(".//*[contains(text(),'No Records available')]")), "No Records available Message Verified On --> Employee Search Result Page", logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Capture the Search Result");
			parentlogger.log(LogStatus.PASS, "Deleted Employee Record with Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+" Is Verified Successfully");
			parentlogger.log(LogStatus.PASS, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted Employee Record Is Verified Successfully", "Deleted Employee Record Is Verified Successfully")));
			//======================================================Search The Deleted employee To Verify Its Existence In The System Completed Here========================================================================================================================================================================================================================================================
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

