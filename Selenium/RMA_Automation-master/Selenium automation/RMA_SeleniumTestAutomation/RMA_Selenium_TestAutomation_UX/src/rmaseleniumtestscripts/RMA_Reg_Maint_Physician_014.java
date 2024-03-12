package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import complete

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Physician;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PowerView;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
// RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     :  RMA_Reg_Maint_Physician_014
//Description    : Verify That User Is Able To Make Any Field As Required and Validation Message Is Displayed In UX PowerView On Physician Screen
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-03-22-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Physician_014 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Physician_014_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest(" RMA_Reg_Maint_Physician_014_Verify That Field Becomes Required By Flag On PV For Physician Page", "User Is Able To Make Any Field As Required and Validation Message Is Displayed In UX PowerView On Physician Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");

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
			StrScreenShotTCName = "RMA_Reg_Maint_Physician_014";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variables Declaration Completed here

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			String EntityLastVal;
			String EntityFirstVal;
			//Local Variables Are Declared Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite03_Maint_Physician_Regression.xlsx"); //Excel WorkBook RMA_Suite03_Maint_Physician_Regression IS Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Physician_TC_015", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Physician_TC_015
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Physician_TC_015", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Physician_TC_015
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Physician_TC_015", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Physician_TC_015
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Physician_TC_015", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Physician_TC_015
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Physician_TC_015", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Physician_TC_015			
			//Date Is Retrieved From DataSheet
				
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Logout from User "ABK"

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "Username TextBox On RMA Application Login Page", Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver),"Password TextBox On RMA_Application Login Page", Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RMA Application Login Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Login By User "AUTO_1"

			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
			//===========================================================Physician Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PhysicianFrame);
			//Physician Creation Page Is Opened
		
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_MiddleName(driver),"Middle Name Textbox On Physician Creation Page", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_MiddleName(driver), "enable", "Middle Name Textbox On Physician Creation Page", logval);
			//Verification That Middle Name Text Box  Is Enabled Is Done
			//===========================================================Physician Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
		
			//===========================================================Utilities Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAMaintUXWindowHandle, "NA", "NA","NA", "Navigation To RMA Utilities Screen", logval);	
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Utilities Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Changes Made In Power View Editor Is Started Here=================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Power View Editor Page Is Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.xpath(".//*[@class='checkboxValue rowPointer ng-binding' and contains(text(),'Physician Maintenance') and @id='label-17']")), "Physician Maintenance Label On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Physician Maintenance Page Is Getting Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_FieldDelete(driver, "First Name"), "First Name Field Label On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_RequiredField(driver), "Required Toggle Button On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_FieldDelete(driver, "Middle Name"), "Middle Name Field Label On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_ReadOnlyField(driver), "Read Only Toggle Button On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver),"Save Image Button On Power View Editor Page", logval);
			//Middle Name Field Is Made Read Only & First Name Field Is Made Mandatory
			//==========================================================Changes Made In Power View Editor Is Completed Here============================================================================================================================================================================================
			
			//===========================================================Physician Creation  Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PhysicianFrame);
			//Physician Creation Page Is Opened

			EntityLastVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PhysLastName_");
			EntityFirstVal = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PhysFirstName_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Physician Page", EntityLastVal, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_PhysicianNumber(driver), "Physician Number TextBox On Maintenance-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100, 999)), logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician. RMAApp_Physician_Txt_MedStaffNumber(driver), "MedStaffNumber TextBox On Maintenance-->Physician Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000, 9999)), logval);	
			//Last Name, Physician Number And MedStaffNumber Values Are Provided For Physician To Be Created
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_MiddleName(driver), "disable", "Middle Name TextBox On Physician Creation Page", logval);
			//Verification Of Middle Name Field As Read Only Is Done Here
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Physician Creation Page", logval);
			//=========================================================Physician Creation  Is Completed Here======================================================================================================
		
			//=========================================================Verification Started On Physician Page===================================================================================================================================================================
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.PowerViewMandatoryFieldMessage, true, "Physician Creation Page", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Validation Message Popped Successfully", "Validation Message On Physician")));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Txt_FirstName(driver), "First Name TextBox On Maintenance-->Physician Page", EntityFirstVal, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Privileges Creation Page", logval);
			//=========================================================Verification Completed On Physician Page===================================================================================================================================================================
			driver.close();
		
			//Steps To Revert Changes Done In PowerView Started Here
			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On PowerView Page", logval);
			driver.switchTo().frame(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Power View Editor Page Is Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.xpath(".//*[@class='checkboxValue rowPointer ng-binding' and contains(text(),'Physician Maintenance') and @id='label-17']")), "Physician Maintenance Label On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Physician Maintenance Page Is Getting Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_FieldDelete(driver, "First Name"), "First Name Field Label On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_RequiredField(driver), "Required Toggle Button On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_FieldDelete(driver, "Middle Name"), "Middle Name Field Label On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_ReadOnlyField(driver), "Read Only Toggle Button On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver),"Save Image Button On Power View Editor Page", logval);
			//Steps To Revert changes in PowerView Completed Here
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Logout From Current User

			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName_1, Login_Txt_Password_1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName_1, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================SSteps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNSelect_Lst_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNSelect_Lst_DataSourceName, 2));
			loggerval4 = logger.toString();
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EmployeeDependentsAddEditDeleteEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
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
