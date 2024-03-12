package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import complete

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_059
//Description    : Verification Of Data Being Entered In All The Fields ON Employee Maintenance Page Is Getting Saved Without Any Error
//Revision       : 0.0 - SheikhFaiza-03-14-2018 
//======================================================================================================================================================================================================================================================================================


public class RMA_Reg_Maint_Employee_TC_058 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Reg_Maint_Employee_TC_058_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_058_ Verification Of Data Being Entered In All The Fields ON Employee Maintenance Page Is Getting Saved Without Any Error", "  Verification Of Data Being Entered In All The Fields ON Employee Maintenance Page Is Getting Saved Without Any Error Is Validated");
			parentlogger.assignAuthor("Faiza Sheikh");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_058";
			ErrorMessage = null;
			//Global Variable Initialization Completed 

			String StrEmployeeNumber;
			String StrEmployeeLastName;
			String EmpMaint_Creation_Txt_FirstName;
			String EmpMaint_Creation_Txt_MiddleName;
			String EmpMaint_Creation_Txt_ExpirationDate;
			String EmpMaint_Creation_Txt_AlsoKnownAs;
			String EmpMaint_Creation_Txt_Title;
			String EmpMaint_Creation_Txt_Dob;
			String EmpMaint_Creation_Txt_Sex;
			String EmpMaint_Creation_Txt_MaritalStatus;
			String EmpMaint_Creation_Txt_PayType;
			int EmpMaint_Creation_Txt_HoursPerWeek;
			String EmpMaint_Creation_Txt_LicenseNumber;
		
			//Local Variable Declaration Completed Here

			EmpMaint_Creation_Txt_ExpirationDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			EmpMaint_Creation_Txt_Dob= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			//EmpMaint_Creation_Txt_FirstName= RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "FirstName_");
			//Local Variable Initialization Completed 
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Maint_Employee_Regression.xlsx Is Fetched To Retrieve Data
			EmpMaint_Creation_Txt_FirstName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 0); // First Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_MiddleName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 1); // Middle Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_AlsoKnownAs = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 2); // Also Known As Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_Title = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 3); // Title Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_Sex = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 4); // Sex Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_MaritalStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 5); // Marital Status Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_PayType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1, 6); // Pay Type Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_HoursPerWeek = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1,7); // Hours Per Week Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			EmpMaint_Creation_Txt_LicenseNumber = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_058", 1,8); // License Number Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_059
			//Data Retrieval from DataSheet Completed
			
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, "NA", "NA", "NA", "NA", "NA", "Maintenance Navigation Window From DashBoard", logval);
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================New Employee Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			// New Employee From Maintenance Screen Is Successfully Created
			//============================================================New Employee Creation Is Completed Here============================================================================================================================================================================================================================================================================
			
			//===========================================================Employee Tab Remaining Field Filling Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_FirstName(driver), "First Name TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_FirstName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_MiddleName(driver), "Middle Name TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_MiddleName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_ExpirationDate(driver), "Expiration Date TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_ExpirationDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_AlsoKnownAs(driver), "Also Known As TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_AlsoKnownAs, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Dob(driver), "Date Of Birth TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_Dob, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Title(driver), "Title TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_Title, logval); 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_Sex(driver), "Employee Sex Lookup Image Button On Maintenance Employee Creation Page", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EmpMaint_Creation_Txt_Sex, "Employee Sex Lookup Window On Maintenance Employee Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_MaritalStatus(driver), "Employee Marital Status Lookup Image Button On Maintenance Employee Creation Page", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EmpMaint_Creation_Txt_MaritalStatus, "Employee Marital Status Lookup Window On Maintenance Employee Creation Page", logval);
			//===========================================================Employee Tab Remaining Field Filling Is Completed Here============================================================================================================================================================================================================================================================================
			
			//===========================================================Employment Info Tab Field Filling Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmploymentInfo(driver), "Employment Info Tab On Maintenance-->Employee Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_PayType(driver), "Employee Pay Type Lookup Image Button On Maintenance Employee Creation Page", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EmpMaint_Creation_Txt_PayType, "Employee Pay Type Lookup Window On Maintenance Employee Creation Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_HoursPerWeek(driver), "Hours Per Week TextBox On Maintenance-->Employee Page", String.valueOf(EmpMaint_Creation_Txt_HoursPerWeek), logval); 
			//===========================================================Employment Info Tab Field Filling Is Completed Here============================================================================================================================================================================================================================================================================
			
			//===========================================================Employee Info Tab Field Filling Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmployeeInfo(driver), "Employment Info Tab On Maintenance-->Employee Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LicenseNumber(driver), "License Number TextBox On Maintenance-->Employee Page", EmpMaint_Creation_Txt_LicenseNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmployeeInfo(driver), "Employment Info Tab On Maintenance-->Employee Page", logval);
			//===========================================================Employee Info Tab Field Filling Is Completed Here============================================================================================================================================================================================================================================================================
			driver.close();
			driver.switchTo().window(StrRMAUXWindowHandle);
			
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

