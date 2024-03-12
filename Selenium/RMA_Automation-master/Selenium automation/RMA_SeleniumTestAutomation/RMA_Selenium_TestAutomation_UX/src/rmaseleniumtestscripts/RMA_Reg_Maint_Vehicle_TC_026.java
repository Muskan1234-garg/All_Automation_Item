package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Inspections;
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
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_026
//Description    : Verify Child Menu Accident Is Working As Per Changes In PowerView On Vehicle Creation Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NikitaThani-03-07-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Vehicle_TC_026 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Reg_Maint_Vehicle_PowerView_TC_026_Test() throws Exception, Error
	{ 
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_PowerView_TC_026_Verify Accident Is Working As Per Changes In PV On Vehicle Screen", "Verify Child Menu Accident Is Working As Per Changes In PowerView Editor Vehicle Screen Is Validated");
			parentlogger.assignAuthor("Nikita Thani");

			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_PowerView_TC_026";
			loggerval1 = "NotInitialized";
			testcall1 = false; 
			loggerval2 = "NotInitialized";
			testcall2 = false; 
			loggerval3 = "NotInitialized";
			testcall3 = false; 
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed

			String RMAApp_SMS_Lst_DataSourceName;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String RMAApp_Login_Txt_UserName1;
			String RMAApp_Login_Txt_Password1;
			String StrToolTip;
			//Local Variables Declaration Completed

			StrToolTip=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "ToolTip_");
			//Local Variables Are Initialized Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite01_Maint_Vehicle_Module.xlsx"); //Excel WorkBook RMA_Suite01_Maint_Vehicle_Module IS Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_026", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_18
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_026", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_18
			RMAApp_Login_Txt_UserName1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_026", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_18
			RMAApp_Login_Txt_Password1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_026", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_18
			RMAApp_SMS_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_026", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_18			
			//Data Fetch From Excel WorkBook Is Completed

			//===========================================================Application LogOut And Re-Login Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "Username TextBox On RMA Application Login Page", RMAApp_Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver),"Password TextBox On RMA_Application Login Page", RMAApp_Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RMA Application Login Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//===========================================================Application LogOut And Re-Login Ends Here================================================================================================
			
			//===========================================================Utilities Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();	
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Utilities Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//============================================================Steps To Change Power View Starts Here===================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Vehicle"), "PowerView Link On Power View Editor Page", logval1);
			globalWait.until(ExpectedConditions.visibilityOf((RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Vehicle Accident Claims"))));			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Vehicle Accident Claims"), "Vehicle Accident Claims Label On Power View Editor Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver), "ToolBar Dropdown On Power View Editor Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_DropDownField(driver, "Save"), "ToolBar Dropdown On Power View Editor Page", logval1);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Txt_Caption(driver), "Caption TextBox On RMA Power View Editor Page",StrToolTip,logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//==============================================================Steps To Change PoweView Ends Here===================================================================================================================================================

			//===========================================================Claims Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUtilitiesUXWindowHandle, "NA", "NA", "NA", "Navigation To RMA Claims Screen", logval);	
            StrRMAUXWindowHandle = driver.getWindowHandle();
			//===========================================================Claims Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
			
            RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-VehicleAccident", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimva");	
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_Inspections.RMAApp_Inspection_Img_Save(driver),StrToolTip, "Save Image Tooltip", logval);
			
			driver.close();

			//============================================Steps To Revert Changes Done In PowerView Started Here=================================================================================================================
			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Vehicle"), "PowerView Link On Power View Editor Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf((RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Vehicle Accident Claims"))));			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Vehicle Accident Claims"), "Vehicle Accident Claims Label On Power View Editor Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver), "ToolBar Dropdown On Power View Editor Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_DropDownField(driver, StrToolTip), "ToolBar Dropdown On Power View Editor Page", logval1);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Txt_Caption(driver), "Caption TextBox On RMA Power View Editor Page","Save",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//============================================Steps To Revert Changes Done In PowerView Completed Here=================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Application Is Logged Out

			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Application_Login(RMAApp_Login_Txt_UserName1, RMAApp_Login_Txt_Password1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName1, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================SSteps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMAApp_SMS_Lst_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMAApp_SMS_Lst_DataSourceName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Label From Dashboard", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			//==============================Steps To Select Required DataSource And Navigate To DashBaord Completed Here===========================================================================================================================================================================================================================
		
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