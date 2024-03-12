package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
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
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
// RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_090
//Description    : Verify The Validation Message For License Number And License Type Is Displayed As Read Only After Making License Number Field Required And License Type Field Read Only In Employee Maintenance Powerview
//Depends On TC  : None
//Revision       : 0.0 - dpati-02-23-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_090 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_090_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_090_Verify Employee MAintenance Screen Is Displayed", "Validation Message For License Number And License Type Is Displayed As Read Only Is Validated After Making License Number Field Required And License Type Field Read Only In Employee Maintenance Powerview");
			parentlogger.assignAuthor("Debasmita Pati");

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
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_090";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variables Declaration Completed here

			String Login_Txt_UserName;
			String Login_Txt_Password;
			String Login_Txt_UserName_1;
			String Login_Txt_Password_1;
			String DSNSelect_Lst_DataSourceName;
			int EmployeeNumber;			
			String EmployeeLastName;
			//Local Variables Are Declared Here
			
			EmployeeNumber = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1000000, 9999999);
			EmployeeLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpLastName_");
			//Local Variables Initialization Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression IS Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_089", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_089
			Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_089", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_089
			Login_Txt_UserName_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_089", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Employee_TC_089
			Login_Txt_Password_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_089", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Employee_TC_089
			DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_089", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_089			
			//Data Fetch From Excel WorkBook Is Completed

			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "Username TextBox On RMA Application Login Page", Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver),"Password TextBox On RMA_Application Login Page", Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RMA Application Login Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
            
			//===========================================================Utilities Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA","NA", "Navigation To RMA Maintenance Screen", logval);	
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Utilities Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//============================================================Steps To Change Power View Starts Here===================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Employee"), "PowerView Link On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Power View Editor Page Is Opened");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Chk_Entity(driver, "Employee Maintenance"), "check", "Employee Maintenance CheckBox", "Power View Editor Page", logval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Employee Maintenance"), "Employee Maintenance Link On Power View Editor Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Employee Maintenance Power View Editor Page Is Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Tab_EmployeeInfo(driver), "Employee Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_LicenseNumber(driver), "License Number Field On Employee Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_RequiredField(driver), "Make License Number As Required Field On Employment Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_LicenseType(driver), "License Type Field On Employee Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_ReadOnlyField(driver), "Make License Type As Read Only Field On Employment Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//==============================================================Steps To Change PoweView Ends Here===================================================================================================================================================

			//=========================================================== Employee Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.EmployeeFrame);
			//Employee Creation Page Is Opened
			//=========================================================== Employee Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Verifying License Type Is Read Only Field On Employee Screen==========================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmployeeInfo(driver), "Employee Info Tab On Maintenance-->Employee Page", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_Employee.RMAApp_EmployeeInfo_Txt_LicenseType(driver), "disable", "License Type Field On Employee Info Tab On -->Employee Maintenance Page ", logval);
			//============================================================Verification Completed===================================================================================================================================================================
			
			//=========================================================== Steps To Enter Data In Mandatory Fields On Employee Maintenance Screen Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_EmployeeNumber(driver), "Employee Number TextBox On Maintenance-->Employee Page", String.valueOf(EmployeeNumber), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "Employee Last Name TextBox On Maintenance-->Employee Page", EmployeeLastName, logval);
			//Employee Number, Last Name Values Are Provided For Employee To Be Created
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_EmploymentInfo(driver), "Employment Info Tab On Maintenance-->Employee Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Department(driver), "Employee Department TextBox On Maintenance-->Employee Page", "ST", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Provided To Department TextBox On Maintenance-->Employee Page Page");
			//Department Value Is Provided

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Addresses(driver), "Addresses Tab On Employee Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Btn_AddNewAddress(driver), "New Address Image Button On Employee Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Addresses Screen Is Loaded After Clicking Add New Address Buttton On Employee Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_AddrType(driver), "Address Type TextBox On Addresses Tab On Employee Creation Page", "HADDR", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr1(driver), "Address1 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr2(driver), "Address2 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr3(driver), "Address3 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_Addr4(driver), "Address4 TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_City(driver), "City TextBox On Addresses Tab On Employee Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_"), logval);
			// Data Is Entered In Address1,Address2,Address3,Address4,City Fields On Address Tab

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_State(driver), "State Code Look Up Button On Addresses Tab On Employee Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Alberta", "State Link On State Selection Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As State Is Selected On Addresses Tab On Employee Creation Page");
			// Data Is Entered In State Field Of Address Tab

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_County(driver), "County TextBox On Addresses Tab On Employee Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Txt_ZipCode(driver), "Zip/Postal Code TextBox On Addresses Tab On Employee Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10000,99999)), logval);
			// Data Is Entered In County & ZipCode Field Of Address Tab

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_MaintEmployee_Btn_Country(driver), "Country Code Look Up Button On Addresses Tab On Employee Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Great Britain", "Country Link On Country Selection Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Country Is Selected On Addresses Tab On Employee Creation Page");
			// Data Is Entered In Country Field Of Address Tab

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Addresses Tab On Employee Creation Page", logval);// Save Button Is Clicked
			//Newly Created Address Is Saved

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Employee.RMAApp_Employee_Tab_Employee(driver), "Employee Tab On Maintenance-->Employee Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_SocialSecurityNumber(driver), "Social Security Number TextBox On Maintenance-->Employee Page",String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11, 99))+"-"+String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999)), logval);
			//Social Security Number Is Provided On Employee Creation Page
			//=========================================================== Steps To Enter Data In Mandatory Fields On Employee Maintenance Screen Is Ends Here================================================================================================================================================================================================================================================================
			
			//===========================================================Verifying License Number Is Required Field On Employee Page==========================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Employee Creation Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Msg_ToastMessage(driver, "Not all required fields contain the value. Please enter data in all mandatory fields." ), "Not all required fields contain the value. Please enter data in all mandatory fields."+ " Message On " + "Maintenance-->Employee Page", logval);
			parentlogger.log(LogStatus.INFO, color.RMA_ChangeColor_Utility("Not all required fields contain the value. Please enter data in all mandatory fields.", 2)+ " Validation Message Is Verified Successfully");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Validation Messaage Verified Successfully", "Validation Messaage Verified Successfully")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Error Toast Close Button On "+ "Maintenance-->Employee Page", logval);
			Thread.sleep(3000);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Employee.RMAApp_EmployeeInfo_Txt_LicenseNo(driver), "License Number TextBox On Maintenance-->Employee Page",String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999)), logval);
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "Saved Successfully",  "Maintenance-->Employee Page", logval);
			parentlogger.log(LogStatus.PASS, color.RMA_ChangeColor_Utility("Data Entered in License Number Field And Employee Screen Saved Successfully", 2)+ "License Number Is A Required Field Verified Successfully");
			//============================================================Verification Completed===================================================================================================================================================================
			//===========================================================Utilities Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			//===========================================================Utilities Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//============================================================Steps To Revert The Change In Power View Starts Here===================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_LicenseNumber(driver), "License Number Field On Employee Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_RequiredField(driver), "Make License Number As Required Field On Employment Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PowerView.RMAApp_EmployeePowerview_Lbl_LicenseType(driver), "License Type Field On Employee Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_ToggleBtn_ReadOnlyField(driver), "Make License Type As Read Only Field On Employment Info Tab On -->Employee PowerView Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//==============================================================Steps To Revert The Change In Power View Ends Here===================================================================================================================================================

			driver.close();
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName_1, Login_Txt_Password_1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================Steps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

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
