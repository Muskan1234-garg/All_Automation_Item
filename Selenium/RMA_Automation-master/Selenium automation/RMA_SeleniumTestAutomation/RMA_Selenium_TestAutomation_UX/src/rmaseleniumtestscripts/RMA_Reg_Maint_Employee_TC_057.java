package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PowerView;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed


//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_057
//Description    : Verification of Changes On Adding/Removing Fields On Employee Maintenance From Powerview
//Depends On TC  : None
//Revision       : 0.0 - SheikhFaiza-02-23-2018 
//======================================================================================================================================================================================================================================================================================


public class RMA_Reg_Maint_Employee_TC_057 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Reg_Maint_Employee_TC_057_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_057_Verification of Changes On Adding/Removing Fields On Employee Maintenance From Powerview", " Verification of Changes On Adding/Removing Fields On Employee Maintenance From Powerview Is Validated");
			parentlogger.assignAuthor("Faiza Sheikh");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_057";
			ErrorMessage = null;
			//Global Variable Initialization Completed 

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_057", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_057
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_057", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_057
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_057", 2, 0); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_057
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_057", 2, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_057
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_057", DSRow, 2); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_057			
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

			//===========================================================Employee Maintenance Screen Navigation Is Started Here=================================================================================================================================================================================================================================
			//driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAMaintUXWindowHandle=driver.getWindowHandle();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
			//===========================================================Employee Maintenance Screen Navigation Is Completed Here===========================================================================================================================================================================================================================

			//==============================================================Steps To Navigate To Utilities Started Here===========================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA", "NA", "Navigation To RMA Utilities Screen", logval);
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			// globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
			//==============================================================Steps To Navigate To Utilities Completed Here==================================================================================================================================================================================

			//==============================================================Steps To Remove Employee Maintenance Field In PowerView Page Starts Here=========================================================================================================================================================================================== 
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Sample"), " Sample Link on Powerview Editor Page", logval); 
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance"), " Employee Maintenance Link On Powerview Editor Page", logval); 
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_FieldDelete(driver, "Address 1")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_FieldDelete(driver, "Address 1"), " Address 1 Field Is Removed On Powerview Editor Page", logval); 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Button On Power View Page", logval);
			//==============================================================Steps To Remove Employee Maintenance Field In PowerView Page Completed Here=========================================================================================================================================================================================== 

			//===========================================================Steps To Verify Changes On Maintenance Screen Is Started Here=================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Employee Maintenannce Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr1(driver), "Address 1 field on Employee Maintenance Page", logval);
			driver.close();
			//===========================================================Steps To Verify Changes On Maintenance Screen Is Completed Here===========================================================================================================================================================================================================================

			//Steps To Revert Changes Made In PowerView Started Here
			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Sample"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance"), " Employee Maintenance Link On Powerview Editor Page", logval); 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDown_ControlPalette(driver), "Control Palette DropDown On PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Tab_ControlPalette(driver, "Employee"), "Employee Tab Under Control Palette Drop Down On Power View Editor Page", logval);
			WebElement To=driver.findElement(By.xpath(".//*[@class='ng-scope ng-binding' and contains(text(),'Address 2')]//ancestor::div[6]"));
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ControlPaletteField(driver, "Address 1"), To, "Address 1 Field", "Dependents Field Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//Steps To Revert Changes Done In Power VIew Completed Here

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Logout From Current User

			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName_1, Login_Txt_Password_1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName_1, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================SSteps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNSelect_Lst_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNSelect_Lst_DataSourceName, 2));
			loggerval2 = logger.toString();
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
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
