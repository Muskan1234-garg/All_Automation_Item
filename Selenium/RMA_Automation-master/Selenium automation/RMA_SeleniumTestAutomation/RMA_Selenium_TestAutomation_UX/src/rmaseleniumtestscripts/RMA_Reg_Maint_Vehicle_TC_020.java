package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_020
//Description    : Create New Vehicle SMS Permission Is Validated
//Depends On TC  : None
//Revision       : 0.0 - JannathHussain-02-28-2018 
//======================================================================================================================================================================================================================================================================================
public class RMA_Reg_Maint_Vehicle_TC_020 extends rmaseleniumtestscripts.RMA_TC_BaseTest  {
	@Test	
	public void RMA_SeleniumRegression_TC_020_Test() throws Exception, Error
	{   
		try {	 	 
			String RMAApp_SMS_Lnk_DataSourceName;
			String RMAApp_SMS_Lnk_ModuleSecurityGroup;
			String RMAApp_SMS_Lnk_ModuleAccessPermission;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			//Local Variable Declaration Completed

			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_TC_020_Create Vehicle Permission Setting Validation", "Functionality of Create Vehicle Setting On Security Management System Is Validated");
			parentlogger.assignAuthor("Jannath Hussain");
			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_TC_020";
			loggerval1 = "NotInitialized";
			testcall1 = false; 
			loggerval2 = "NotInitialized";
			testcall2 = false; 
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite01_Maint_Vehicle_Module.xlsx"); //Excel WorkBook RMA_Suite01_Maint_Vehicle_Module Is Fetched To Retrieve Data 
			RMAApp_SMS_Lnk_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_020", 4, 0); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_020
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_020", 1, 1); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_020
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_020", 1, 2); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_020
        	RMAApp_SMS_Lnk_ModuleSecurityGroup = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_020", 1, 3); //Module Security Group Name Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_020
			RMAApp_SMS_Lnk_ModuleAccessPermission = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_020", 1, 4); //Module Access Permission Name Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_020	
			//Data Fetch From Excel WorkBook Is Completed
			
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName),"Expand Image Of "+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			//Required Data Source Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link For Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup),color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+ " "+ "Module Security Group Link Of Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3) + " "+ "On Left Navigation Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Required Module Security Group Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "Vehicle Maintenance"),"Expand Image Of Policy Tracking Link From Module Access Permission On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Loader Gets Disappeared");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_SMS_Create(driver, "Create New"),"Click On Create From Module Access Permission On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Revoke(driver),"Revoke Image On Module Access Permissions Block Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			
			//=============================================Application LogOut And Re-Login Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added To Switch To Main Window");
			RMA_Functionality_Utility.RMA_Application_Logout(logval);

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMAApp_Login_Txt_UserName, RMAApp_Login_Txt_Password, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);	
			//=============================================Application LogOut And Re-Login Is Completed Here===========================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================Data Source Selection Is Started Here====================================================================================================================================================================================================================================================================================================================================================================================================================== 
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMAApp_SMS_Lnk_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Data Source Selection Is Completed Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 
		
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();

			//===========================================================Verification Of Save Button For Create New Vehicle Is Started Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Vehicle", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame );
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Switch To Maintenance-Vehicle Frame");
            rmaseleniumutilties_UX.RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Create Vehicle Is Not Possible Because Save Image On Vehicle Screen", logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//===========================================================Verification Of Save Button For Create New Vehicle Is Completed Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 

			//===========================================================Revert Create Permission Is Started Here========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName),"Expand Image Of "+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			// Required Data Source Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link For Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup),color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+ " "+ "Module Security Group Link Of Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3) + " "+ "On Left Navigation Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			// Required Module Security Group Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "Vehicle Maintenance"),"Expand Image Of Policy Tracking Link From Module Access Permission On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Loader Gets Disappeared");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_SMS_Create(driver, "Create New"),"Click On Create From Module Access Permission On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Image On Module Access Permissions Block Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//===========================================================Revert Create Permission Is Completed Here==============================================================================================================================================================================================================================================================================================================================================================================================================================================================

		} catch (Exception|Error e) {

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

			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_DataSource_Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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
				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

