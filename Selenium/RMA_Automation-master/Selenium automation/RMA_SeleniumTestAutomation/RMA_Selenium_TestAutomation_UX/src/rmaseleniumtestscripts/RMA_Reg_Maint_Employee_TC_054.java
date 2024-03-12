package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Imported here

import rmaseleniumPOM_UX.RMA_Selenium_POM_Dependents;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Packages Imported here

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_054
//Description    : Verification Of Dependent Feature Of Employee Maintenance
//Depends On TC  : None
//Revision       : 0.0 - SheikhFaiza-02-14-2018 
//======================================================================================================================================================================================================================================================================================


public class RMA_Reg_Maint_Employee_TC_054 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Reg_Maint_Employee_TC_054_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_054_Creating Dependent From Employee Maintenance Screen", " Create, Edit And Delete Of Dependent From Employee Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Faiza Sheikh");
            testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_054";
			ErrorMessage = null;
			DefaultFrameID= null;
			//Global Variable Initialization Completed 

			String StrEmployeeNumber;
			String StrEmployeeLastName;
			String StrFirstName;
			String StrLastName;
			String Dependent_Creation_Txt_FirstName;
			String Dependent_Creation_Txt_City;
			String Dependent_Creation_Txt_State;
			String Dependent_Creation_Txt_Country;
			long Dependent_Creation_Txt_SSN;
			String DiaryTaskName;
			String ActivityList;
			//Local Variable Declaration Completed Here
			
		
			Dependent_Creation_Txt_FirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "DependentFirstName_");
			Dependent_Creation_Txt_SSN=RMA_GenericUsages_Utility.RMA_RandomLongGeneration_Utility(111111111, 999999999);
			//Local Variable Initialization Completed 
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression.xlsx Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_054", 1, 0); // Activity List Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_054
			Dependent_Creation_Txt_City = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_054", 1, 1); // Dependent City Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_054
			Dependent_Creation_Txt_State = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_054", 1, 2); // Dependent State Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_054
			Dependent_Creation_Txt_Country=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_054", 1, 3); // Dependent Country Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_054
			//Data Retrieval from DataSheet Completed
			
			
			//===========================================================New Employee Creation Is Started Here=============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			parentlogger.appendChild(logger);
			// New Employee From Maintenance Screen Is Successfully Created
			//============================================================New Employee Creation Is Completed Here=============================================================================================================================================================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Dependent")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Dependent"), "Add Image Button For Dependent For The Created Employee On Maintenance Page",logval);

			//===========================================================New Dependent Creation Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EmployeeDependentsAdd", "RMA_EmployeeDependentsAddEditDeleteEntity_Utility",0)+" To Create New Dependent from Employee Maintenance Screen");
			testcall2 = true;
			StrLastName= RMA_Maintenance_Functionality_Utility.RMA_EmployeeDependentsAddEditDeleteEntity_Utility("Create",Dependent_Creation_Txt_FirstName, Dependent_Creation_Txt_City,Dependent_Creation_Txt_State,Dependent_Creation_Txt_Country,Dependent_Creation_Txt_SSN, logval1);
			parentlogger.log(LogStatus.INFO, "New Dependent Is Created With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrLastName, 2));
			loggerval2 = logger.toString();
			StrFirstName=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_FirstName(driver), "value");
			parentlogger.appendChild(logger);
			//============================================================New Dependent Creation Is Completed Here==================================================================================================================================================================
			
			//============================================================Lookup Verification Is Started Here==================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Img_Lookup(driver), "Add Image Button  For Lookup on Employee Dependent Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrLastName, "Lookup Window on Dependent creation page", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(Dependent_Creation_Txt_FirstName,StrFirstName , "First Name on Dependent Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//============================================================Lookup Verification Is Completed Here==================================================================================================================================================================
			
			//============================================================Record Summary Verification Is Started Here==================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_RecordSummary(driver), "Add Image Button  For Record Summary on Employee Dependent Page",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Dependents.RMAApp_RecordSummary_Txt_Data(driver, StrFirstName),  "Data on Record Summary", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_RecordSummary_Btn_Close(driver), "Add Image Button  For closing Record Summary on Employee Dependent Page",logval);
			//============================================================Record Summary Verification Is Completed Here==================================================================================
			
			DefaultFrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();			
			//===========================================================New Diary Creation On Newly Created Dependent Is Started Here=====================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following Dependent Screen::"+" "+StrEmployeeLastName,logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DependentDiaryAdd", "RMA_AttachCreateEdit_Diary",0)+" To Attach a Diary On Dependent e Maintenance Screen");
			testcall3 = true;
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA",ActivityList,"NA","NA", "NA", "Important","Dependent",logval1);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"On Employee :"+" "+color.RMA_ChangeColor_Utility(StrEmployeeLastName,4));							
			loggerval3 = logger.toString();
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.appendChild(logger);
			//============================================================New Diary Creation On Newly Created Dependent Is Completed Here==================================================================================================================================================================
			
			//===========================================================Steps To Verify Delete Functionality of Dependent on Employee Maintenance Screen Is Started Here===========================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EmployeeDependentsAdd", "RMA_EmployeeDependentsAddEditDeleteEntity_Utility",0)+" To Delete Created Dependent From Employee Maintenance Screen");
			testcall4= true;
			RMA_Maintenance_Functionality_Utility.RMA_EmployeeDependentsAddEditDeleteEntity_Utility("Delete",Dependent_Creation_Txt_FirstName, Dependent_Creation_Txt_City,Dependent_Creation_Txt_State,Dependent_Creation_Txt_Country,Dependent_Creation_Txt_SSN,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Dependent Is Deleted With Dependent Description ::"+ " " + color.RMA_ChangeColor_Utility(StrFirstName, 2));
			//===========================================================Steps To Verify Delete Functionality of Dependent on Employee Maintenance Screen Is Completed Here=============================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EmployeeDependentsAddEditDeleteEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_AttachCreateEdit_Diary" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EmployeeDependentsAddEditDeleteEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			}
			
			catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}	

}
