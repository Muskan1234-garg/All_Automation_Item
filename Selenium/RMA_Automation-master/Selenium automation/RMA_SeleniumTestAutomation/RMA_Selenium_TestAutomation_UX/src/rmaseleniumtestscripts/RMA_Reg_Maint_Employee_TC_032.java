package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import complete

import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumPOM.RMA_Selenium_POM_PowerView_UI;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
// RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_032
//Description    : Verify That ToolTip Is Changed When Changed Via Old Power View By Enabling UX Setting Of Violation Page
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-03-07-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_032 extends RMA_TC_BaseTest{
	public static String StrRMAUIWindowHandle;
	@Test
	public void RMA_Reg_Maint_Employee_TC_032_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_032_Verify ToolTip Changed Via UI PowerView For Violations", "ToolTip Is Changed When Changed Via Old Power View By Enabling UX Setting Of Violation Page Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;
			loggerval3 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_032";
			ErrorMessage = null;
			//Global Variables Declaration Completed here

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			String StrToolTip;
			String StrEmployeeNumber;
			String StrEmployeeLastName;
			//Local Variables Declared Here
			
			StrToolTip=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "ToolTip_");
			//Local Variables Are Initialized Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression IS Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_040", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_040
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_040", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_040
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_040", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_040
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_040", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_040
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_040", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_040			
			//Date Is Retrieved From DataSheet
			
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Logout from User "ABK"

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "Username TextBox On RMA Application Login Page", Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver),"Password TextBox On RMA_Application Login Page", Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RMA Application Login Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Login By User "AUTO_1"

			//===========================================================Claim Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claim(driver), "Claim Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAUIWindowHandle = driver.getWindowHandle();
			driver.switchTo().frame(ParentFrame);
			//===========================================================Claim Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Steps To Made Changes In UI PowerView Started Here==================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-PowerviewEditor", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lbl_PowerViewName(driver), "Power View Name Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_PageName(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_PageName(driver), "___Employee Violation Info", "Employee Violation Info Label", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Img_EditPage(driver), "Edit Button On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_ToolBarFields(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_ToolBarFields(driver), "Save", "Save Label", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Img_EditToolBarField(driver), "Edit Image Button On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, "NA", "NA", "NA", "Na", "Na", "Lookup Window On Power View Editor Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Txt_Caption(driver), "Caption TextBox On Power View Editor Page", StrToolTip, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Btn_CaptionOK(driver), "Ok Button On Power View Editor Page", logval);
			driver.switchTo().window(StrRMAUIWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Chk_UpdateUX(driver), "check", "Update UX CheckBox", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Btn_SavePageChanges(driver),"Save Changes Button On Power View Editor Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Btn_SavePowerView(driver), "Save Changes Button On Power View Editor Page", logval);
			//========================================================Steps To Made Changes In UI PowerView completed Here===========================================================================================================================================================================
			
			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, "NA", "NA", "NA", "NA", "NA", "Maintenance Navigation Window From DashBoard", logval);
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

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
			
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Violations ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Violations"), "Add Entity Button For Violations On Employee Creation Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_Employee.RMAApp_Employee_Img_Save(driver), StrToolTip, "ToolTip Of Save Image Button On Violations Creation Page", logval);
			//Verification Done After Making Changes In PowerView Via UI
			
			//Steps For Verification In UI Page Started Here
			driver.switchTo().window(StrRMAUIWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Maintenance-Employee", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.UIEmployeeFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image Button On Maintenance-->Employee Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, "NA", "NA", "NA", "NA", "NA", "Lookup Window On Maintenance-->Employee Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Lookup Window Is Getting Opened");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("233809090", "Employee Number Select From Lookup Window", logval);
			driver.switchTo().window(StrRMAUIWindowHandle);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Maintenance");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Maintenance.RMAApp_Employee_Btn_Violations(driver), "Violations Image Button On Maintenance-->Employee Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			rmaseleniumutilties.RMA_Navigation_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_Maintenance.RMAApp_Violation_Btn_Save(driver), StrToolTip, "ToolTip Of Save Image Button On Violation Creation Page", logval);
			//Verification Done In UI Page After Changes Made In PowerView Via UI
			
			//Steps To Revert Changes Done In PowerView Started Here
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			driver.switchTo().frame(ParentFrame);
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-PowerviewEditor", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lbl_PowerViewName(driver), "Power View Name Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_PageName(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_PageName(driver), "___Employee Violation Info", "Employee Violation Info Label", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Img_EditPage(driver), "Edit Button On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_ToolBarFields(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_ToolBarFields(driver), StrToolTip, "ToolTip Label", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Img_EditToolBarField(driver), "Edit Image Button On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, "NA", "NA", "NA", "Na", "Na", "Lookup Window On Power View Editor Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Txt_Caption(driver), "Caption TextBox On Power View Editor Page", "Save", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Btn_CaptionOK(driver), "Ok Button On Power View Editor Page", logval);
			driver.switchTo().window(StrRMAUIWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Chk_UpdateUX(driver), "check", "Update UX CheckBox", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Btn_SavePageChanges(driver),"Save Changes Button On Power View Editor Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Btn_SavePowerView(driver), "Save Changes Button On Power View Editor Page", logval);
			driver.close();
			//Steps To Revert Changes Done In PowerView Completed Here
						
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Logout From Current User

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
