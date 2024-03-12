package rmaseleniumtestscripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_SupplementalField;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed


//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_019
//Description    : Verify That Error Must Be Displayed If Required Supplemental Field Is Not Present On The Employee
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-03-16-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_019 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_019_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_019_Validation If Supplementals Field Is Not Present On Employee Screen", "Error Must Be Displayed If Required Supplemental Field Is Not Present On The Employee Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_019";
			ErrorMessage = null;
			//Global Variable Initialization Completed 

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			String SupplementalWindowHandle;
			String UserPrompt_Txt;
			String SystemFieldName_Txt;
			String StrEmployeeLastName;
			int SocSecNumber;
			int EmployeeNumber;
			//Local Variables are Declared Here
			
			UserPrompt_Txt=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Field ");
			SystemFieldName_Txt=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(10, "");
			StrEmployeeLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "EmployeeLastName_");
			SocSecNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			EmployeeNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111, 999999);
			//Local Variables Are Initialized Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_020", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_020
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_020", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_020
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_020", 1, 2); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_020
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_020", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_020
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_020", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_020	
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

			//===========================================================Claim Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claim(driver), "Claim Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAUIWindowHandle = driver.getWindowHandle();
			driver.switchTo().frame(ParentFrame);
			//===========================================================Claim Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Steps To Add Supplemental Field In UI Supplemental SetUp Started Here==================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-SupplementalSetup-SupplementalFieldData", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Chk_SupplementalField(driver, "Employee Supplemental|EMP_SUPP"), "Employee Supplemental Radio Button on Supplemental Field Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Btn_SupplementalFieldEdit(driver), "Supplemental Edit Button On Supplemental Field Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, "NA", "NA", "NA", "NA", "NA", "Employee Supplemental Window", logval);			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Btn_SupplementalNewFieldAdd(driver), "Add New Field Image Button On Employee Supplement Window", logval);
			SupplementalWindowHandle=driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, "NA", "NA", "NA", "NA", "NA", "Add New Supplementals Field Window", logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Lst_FieldSelect(driver), "Date", "Field Type Select List", "Add New Field Window", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Txt_UserPrompt(driver), "User Prompt TextBox On Add New Field Window", UserPrompt_Txt, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Txt_SystemFieldName(driver), "System Field Name TextBox On Add New Field Window", SystemFieldName_Txt, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Chk_Required(driver), "check", "Required Flag On Add New Field Window", "Add New Field Window", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Img_SaveAddField(driver), "Save Image Button On Add New Field Window ", logval);
			driver.switchTo().window(SupplementalWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Img_SaveSupplemental(driver), "Save Image Button On Employee Supplemental Window", logval);
			driver.close();
			driver.switchTo().window(StrRMAUIWindowHandle);
			//============================================================steps To Add Supplemental Field In UI Supplemental Setup Completed Here===================================================================================================================================================================================
			
			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, "NA", "NA", "NA", "NA","NA", "Navigation To RMA Maintenance Screen", logval);
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Steps To Verify Changes Done in PowerView Started Here=============================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Last Name TextBox On Employee Creation Page", StrEmployeeLastName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "Employee Number TextBox On Employee Creation Page", String.valueOf(EmployeeNumber), logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmploymentInfo(driver), "Employment Info Tab On employee Creation Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Department(driver), "Department TextBox On Employee Creation Page", "ST", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Addresses(driver), "Addresses Tab On Employee Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_AddNewAddress(driver), "New Address Image Button On Employee Creation Page",logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Country(driver)));
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Country(driver), "Country TextBox On Employee Creation Page", "GB", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Employee Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Employee Creation Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Employee Creation Page", String.valueOf(SocSecNumber), logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Employee Creation Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage("Missing value for required supplemental field: "+UserPrompt_Txt, true, "Error Message On Employee Creation Page", logval);
			//========================================================Steps To Verify Changes Done in PowerView Completed Here=========================================================================================================================================
			
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Validation Messages Over Employee", "Successful Validation Message")));
			
			//=============================================================Steps To Revert Changes Started Here================================================================================================================================================================================================
			driver.switchTo().window(StrRMAUIWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			driver.switchTo().frame(ParentFrame);
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-UIAdmins-SupplementalSetup-SupplementalFieldData", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrameUI);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Chk_SupplementalField(driver, "Employee Supplemental|EMP_SUPP"), "Employee Supplemental Radio Button on Supplemental Field Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Btn_SupplementalFieldEdit(driver), "Supplemental Edit Button On Supplemental Field Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, "NA", "NA", "NA", "NA", "NA", "Employee Supplemental Window", logval);
			
			List<WebElement> Radio=driver.findElements(By.xpath(".//*[@id='GridView1']/tbody/tr/td/input"));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(Radio.get(Radio.size()-1), "Radio Button", logval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Btn_EditFieldOnLastWindow(driver), "Edit Field Image Button On Employee Supplement Window", logval);
			SupplementalWindowHandle=driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(5, "NA", "NA", "NA", "NA", "NA", "Add New Supplementals Field Window", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Chk_Required(driver), "uncheck", "Required Flag On Add New Field Window", "Add New Field Window", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Chk_DeleteField(driver), "check", "Deleted Flag On Add New Field Window", "Add New Field Window", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Img_SaveAddField(driver), "Save Image Button On Add New Field Window ", logval);
			driver.switchTo().window(SupplementalWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalField.RMAApp_SupplementalFieldSetup_Img_SaveSupplemental(driver), "Save Image Button On Employee Dependent Supplemental Window", logval);
			driver.close();
			driver.switchTo().window(StrRMAUIWindowHandle);
			driver.close();
			//=========================================================Steps To Revert Changes Completed Here==============================================================================================================================================================================================================================

			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
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
