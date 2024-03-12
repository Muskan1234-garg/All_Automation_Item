package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PowerView;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed


//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_023
//Description    : Verify That User Is Able To Add/Delete Fields In PowerViewEditor For Employee Screen and User Is Able To Save New Employee
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-03-14-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_023 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_023_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_023_Add/Remove Field On Employee Then Saving The Record", "User Is Able To Add/Delete Fields In PowerViewEditor For Employee Screen and User Is Able To Save New Employee Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_023";
			ErrorMessage = null;
			//Global Variable Initialization Completed 

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			String StrEmployeeNumber;
			String StrEmployeeLastName;
			//Local Variables are Declared Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_023", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_023
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_023", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_023
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_023", 1, 2); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_023
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_023", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_023
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_023", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_023			
			//Data Fetch From Excel WorkBook Is Completed

			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);	
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Application Is Logged Out From User "abk"

			//==============================================================Steps To Login With Different User Started Here===========================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName TextBox On RiskMaster Application Login Page",Login_Txt_UserName,logval); //Enter UserName In UserName TextBox Of RMA Application Login Page	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password TextBox On RiskMaster Application Login Page",Login_Txt_Password,logval); //Enter Password In Password TextBox Of RMA Application Login Page	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RiskMaster Application Login Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//==============================================================Steps To Login With Different User Completed Here===========================================================================================================================================================================================================================
			
			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Verification Of Fields On Employee Screen Started Here=================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Initials(driver), "Initials TextBox On Employee Creation Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_AlsoKnownAs(driver), "Also Known As TextBox On Employee Creation Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Chk_FreezePayment(driver),"Freeze Payment CheckBox On employee Creation Page", logval);
			//===========================================================Verification Of Fields On Employee Screen Completed Here===================================================================================================
			
			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3,StrRMAWindowHandle , StrRMAMaintUXWindowHandle, "NA", "NA", "NA", "Utilities Screen", logval);
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Changes Done in PowerView Editor Started Here=================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance"), "Employee Maintenance Label On PowerView Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_FieldDelete(driver, "Initials")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_FieldDelete(driver, "Initials"),"Initials Field Remove Button On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_FieldDelete(driver, "Also Known As"), "Also Known As Field Remove Button On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_FieldDelete(driver, "Freeze Payments"),"Freeze Payments Field Remove button On Powerview Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save image Button On Powerview Editor Page", logval);
			//==========================================================Changes Done In PowerView Editor Completed Here====================================================================================================================================================================
			
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			
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
			
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Initials(driver), "Initials Textbox On Employee Creation Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_AlsoKnownAs(driver), "Also Known as Textbox On Employee Creation Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Chk_FreezePayment(driver), "Freeze Payments CheckBox On Employee Creation Page", logval);
			driver.close();
			//Verification Completed For The Changes In PowerView Editor
			
			//===================================================Steps To Revert Changes Done in PowerView Editor Started Here===================================================================================================================================
			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance"), "Employee Maintenance Label On PowerView Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDown_ControlPalette(driver), "Control Palette DropDown On PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Tab_ControlPalette(driver,"Employee" ), "Employee Tab On Control Palette On PowerView Editor Page", logval);
			WebElement To=driver.findElement(By.xpath(".//*[@class='ng-scope ng-binding' and contains(text(),'Birth')]//ancestor::div[6]"));
			WebElement To_1=driver.findElement(By.xpath(".//*[@class='ng-scope ng-binding' and contains(text(),'Expiration')]//ancestor::div[6]"));
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ControlPaletteField(driver, "Initials"), To, "Initials Field", "Employee Tab Field Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ControlPaletteField(driver, "Also Known As"), To, "Also Known As Field", "employee Tab Field Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ControlPaletteField(driver, "Freeze Payments"), To_1, "Freeze Payments Field", "Employee Tab Field Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On PowerView Editor Page", logval);
			//=====================================================Steps To Revert Changes Done in PowerView Editor Completed Here=================================================================================================================================
		
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Logout form Current User
			
			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName_1, Login_Txt_Password_1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName_1, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================SSteps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNSelect_Lst_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNSelect_Lst_DataSourceName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Label From Dashboard", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			//==============================Steps To Select Required DataSource And Navigate To DashBaord Completed Here===========================================================================================================================================================================================================================
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
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
