package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Default Packages Import complete

import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
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
import rmaseleniumutilties_UX.RMA_Verification_Utility;
// RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_030
//Description    : Verify That Sequence Of ToolBar Buttons Are Getting Changed Via UX Power View On Dependents Page
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-03-07-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_030 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_030_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_030_Verify Sequence Of ToolBar Button Is Changed According To The User For Dependents", "User Changes The Sequence Of ToolBar Buttons Then The Same Is Updated In UX On Dependents Page Is Validated");
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
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_030";
			ErrorMessage = null;
			//Global Variables Declaration Completed here

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			String StrEmployeeNumber;
			String StrEmployeeLastName;
			int Flag=0;
			String Option=null;
			String StrExpected=null;
			int FlagVerify=0;
			String OptionVerify=null;
			String StrExpectedVerify=null;
			//Local Variables Declared Here

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

			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
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
			//============================================================New Employee Creation Is Completed Here======================================================================================================================================================================================================================================================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Dependents")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Dependents"), "Add Image Button For Dependent For The Created Employee On Maintenance Page",logval);

			//Function TO Verify Sequence Of ToolBar Buttons Started Here================================================================================
			String [] expected={"Save","Delete Record","Diary","Record Summary","Lookup"};
			List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@ng-style='{color: $root.dynamicThemeNew}']//ancestor::a"));

			if(expected.length!=UX_row.size()){
				System.out.println("fail");				
			}

			for(int i=0;i<expected.length;i++){
				Option=UX_row.get(i).getAttribute("uib-tooltip");
				if(Option.equals(expected[i])){}
				else
				{
					Flag++;
					StrExpected=expected[i];
					break;
				}
			}
			if(Flag!=0)
			{
				parentlogger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(StrExpected, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(Option, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility("ToolBar Buttons", 4) + " " + "ToolTip Verification Is UnSuccessful" );
			}
			else{
				parentlogger.log(LogStatus.PASS, "Expected ToolTip And Actual ToolTip Of All Elements Are Same And Hence Sequence Verification Is Successful For All Elements");
			}
			//Function To Verify Sequence Of ToolBar Buttons Completed Here===================================================================================

			//===========================================================Utilities Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA","NA", "Navigation To RMA Maintenance Screen", logval);	
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Utilities Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Changes Made In Power View Editor Are Started Here=================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_Dependent(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_Dependent(driver), "Employee Dependent Label On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver),"ToolBar DropDown Menu On Power View Editor Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_ToolBarField(driver, "Save"), RMA_Selenium_POM_PowerView.RMAApp_PowerView_Area_ToolBarField(driver), "Save Field", "ToolBar DropDown Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//==========================================================Changes Made In Power View Editor Are Completed Here==========================================================================================================================================================================

			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Violation Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);

			//Function To Verify Sequence Of ToolBar Buttons Started Here=====================================================================================
			String [] expectedVerify={"Delete Record","Save","Diary","Record Summary","Lookup"};
			List<WebElement> UX_rowVerify = driver.findElements(By.xpath(".//*[@ng-style='{color: $root.dynamicThemeNew}']//ancestor::a"));

			if(expectedVerify.length!=UX_rowVerify.size()){
				System.out.println("fail");				
			}

			for(int i=0;i<expectedVerify.length;i++){
				OptionVerify=UX_rowVerify.get(i).getAttribute("uib-tooltip");
				if(OptionVerify.equals(expectedVerify[i])){}
				else
				{
					FlagVerify++;
					StrExpectedVerify=expectedVerify[i];
					break;
				}
			}
			if(FlagVerify!=0)
			{
				parentlogger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(StrExpectedVerify, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(OptionVerify, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility("ToolBar Buttons", 4) + " " + "ToolTip Verification Is UnSuccessful" );
			}
			else{
				parentlogger.log(LogStatus.PASS, "Expected ToolTip And Actual ToolTip Of All Elements Are Same And Hence Sequence Verification Is Successful For All Elements");
			}
			//Function TO Verify Sequence Of ToolBar Buttons Completed Here===============================================================================
			driver.close();
			//Verification Is Done After MAking Changes In Power View Editor
			
			//Steps To Revert Changes Made In PowerView Started Here
			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Automation_PV"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_Dependent(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_Dependent(driver), "Employee Dependent Label On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver),"ToolBar DropDown Menu On Power View Editor Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_ToolBarField(driver, "Delete Record"), RMA_Selenium_POM_PowerView.RMAApp_PowerView_Area_ToolBarField(driver), "Delete Record Field", "ToolBar DropDown Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//Steps To Revert Changes Made In PowerView Completed Here
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
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
