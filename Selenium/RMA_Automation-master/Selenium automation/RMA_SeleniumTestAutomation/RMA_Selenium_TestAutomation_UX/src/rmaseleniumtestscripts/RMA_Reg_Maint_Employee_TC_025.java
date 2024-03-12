package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Default Packages Import complete
import org.openqa.selenium.support.ui.ExpectedConditions;

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PowerView;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_PowerView_UI;
// RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_025
//Description    : Verify That Same Fields Are Coming In PowerView Editor UX As In Old UI
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-03-13-2018 
//======================================================================================================================================================================================================================================================================================



public class RMA_Reg_Maint_Employee_TC_025 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_025_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_025_Verify Same Fields For Dependents In Both UI and UX", "Same Fields Are Coming In PowerView Editor UX As In Old UI Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_025";
			ErrorMessage = null;
			//Global Variables Declaration Completed here

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			//Local Variables Declared Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression IS Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_026", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_026
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_026", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_026
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_026", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_026
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_026", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_026
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_026", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_026			
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
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Claim Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification Done In PowerView(UX) Started Here=================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_Dependent(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_Dependent(driver), "Employee Dependent Label On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver)));
			
			List<WebElement> UX_row=driver.findElements(By.xpath(".//*[@class='control-label labelspan']/span[@class='ng-scope ng-binding']"));
			String[] UX_Value=new String[18];
			for(int i =0;i<UX_Value.length;i++)
			{
				UX_Value[i]=UX_row.get(i).getText();
			}
			//========================================================Verification Done In PowerView(UX) Completed Here============================================================================================================================================================================

			//===========================================================Claim Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claim(driver), "Claim Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, "NA", "NA", "NA", "NA", "NA", "Claim Window", logval);
			StrRMAUIWindowHandle = driver.getWindowHandle();
			driver.switchTo().frame(ParentFrame);
			//===========================================================Claim Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verification Done In PowerView(UI) Started Here=================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-PowerviewEditor", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lbl_PowerViewName(driver), "Power View Name Link On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Power View Editor Page Is Getting Opened");

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Lst_PageName(driver), "___Employee Dependent", "Employee Dependent Info Label", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_PowerView_UI.RMAApp_PowerView_Img_EditPage(driver), "Edit Button On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Employee Dependents Info Editor Page Is Getting Opened");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Last Name"), "Dependent's Last Name On Employee Dependent PowerView Editor Page", logval);
			for(int i=0;i<UX_Value.length;i++)
			{
				if(!UX_Value[i].equals("Dependent's Last Name"))
				{
					RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, UX_Value[i]), UX_Value[i]+" On Employee Dependent PowerView Editor Page", logval);
				}
			}
			driver.close();
			//========================================================Verification Done In PowerView(UI) Completed Here============================================================================================================================================================================

			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			
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
