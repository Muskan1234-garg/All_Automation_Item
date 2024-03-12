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
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_014
//Description    : Successfully The Functionality Of Permission Expiration Of User Access Permissions Is Validated
//Depends On TC  : RMA_SeleniumRegression_TC_013
//Revision       : 0.0 - RenuVerma-03-28-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_014 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	
	static String LoginURL;
	
	@Test
	public void RMA_SeleniumRegression_TC_014_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_014_ The Functionality Of Permission Expiration Of User Access Permissions", "Successfully The Functionality Of Permission Expiration Of User Access Permissions Is Validated");
			parentlogger.assignAuthor("RenuVerma");
				
			String PastExpDate;
			String TodayExpDate;
			String FutureExpDate;
			//Local Variable Declaration Completed
			
			PastExpDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -2, 0,"MM/dd/yyyy");// Past Expiration Date		
			TodayExpDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");// Today Expiration Date
			FutureExpDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 2, 0,"MM/dd/yyyy");// Future Expiration Date
		
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			testcall5 = false;	
			loggerval5 = "NotInitialized";
			testcall6 = false;	
			loggerval6 = "NotInitialized";
			testcall7 = false;	
			loggerval7 = "NotInitialized";
			testcall8 = false;	
			loggerval8 = "NotInitialized";
			testcall9 = false;	
			loggerval9 = "NotInitialized";
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_014";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
				
			//Variable Initialization Completed		
					
			//==============================Steps To Set Past Permission Expiration Date On User Permission Access Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_013.DSNName_TC_013),"Expand Image Of "+RMA_SeleniumRegression_TC_013.DSNName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013),RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_PermissionExpires(driver),"check","Permission Expires CheckBox","Security Management System Page",logval);
			// Past Expiration Date Entered
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_ExpirationDate(driver), "Expiration Date TextBox On Security Management System Page", PastExpDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Allow access in these time intervals"),"Allow Access In These Time Intervals Tab On Security Management System Page",logval);
			Thread.sleep(2000);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Monday(driver),"check","Monday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Tuesday(driver),"check","Tuesday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Wednesday(driver),"check","Wednesday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Thursday(driver),"check","Thursday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Friday(driver),"check","Friday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Saturday(driver),"check","Saturday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Sunday(driver),"check","Sunday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Set Past Permission Expiration Date On User Permission Access Is Ended Here================================================================================================
					
			//==============================Steps To Verify That User Is Not Able To Login Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//RMA_Verification_Utility.RMA_TextCompare("Your login has expired; please contact your system administrator.",RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelection_Lbl_ErrorText(driver).getAttribute("innerText"), "Login Failed Error Message Value", logval);
			//==============================Steps To Verify That User Is Not Able To Login Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMA_SeleniumRegression_TC_013.Login_Txt_UserName_TC_013, RMA_SeleniumRegression_TC_013.Login_Txt_Password_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.Login_Txt_UserName_TC_013, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMA_SeleniumRegression_TC_013.DSNName_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.DSNName_TC_013, 2));
			loggerval2= logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
	
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
	
			//==============================Steps To Set Today Permission Expiration Date On User Permission Access Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_013.DSNName_TC_013),"Expand Image Of "+RMA_SeleniumRegression_TC_013.DSNName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013),RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_PermissionExpires(driver),"check","Permission Expires CheckBox","Security Management System Page",logval);
			// Today Expiration Date Entered
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_ExpirationDate(driver), "Expiration Date TextBox On Security Management System Page", TodayExpDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Set Today Permission Expiration Date On User Permission Access Is Ended Here================================================================================================
					
			//==============================Steps To Verify That User Is Not Able To Login Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//==============================Steps To Verify That User Is Not Able To Login Is Ended Here================================================================================================
			
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall3= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMA_SeleniumRegression_TC_013.Login_Txt_UserName_TC_013, RMA_SeleniumRegression_TC_013.Login_Txt_Password_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.Login_Txt_Password_TC_013, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMA_SeleniumRegression_TC_013.DSNName_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.DSNName_TC_013, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
	
			//==============================Steps To Set Future Permission Expiration Date On User Permission Access Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_013.DSNName_TC_013),"Expand Image Of "+RMA_SeleniumRegression_TC_013.DSNName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013),RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			// Future Expiration Date Entered
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_PermissionExpires(driver),"check","Permission Expires CheckBox","Security Management System Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_ExpirationDate(driver), "Expiration Date TextBox On Security Management System Page", FutureExpDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Set Future Permission Expiration Date On User Permission Access Is Ended Here================================================================================================
					
			//==============================Steps To Verify That User Is Able To Login Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			Thread.sleep(4000);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver)));
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_SeleniumRegression_TC_013.DSNName_TC_013, RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver).getText(), "Correct DSN Name",logval);
			//==============================Steps To Verify That User Is Able To Login Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall5= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMA_SeleniumRegression_TC_013.Login_Txt_UserName_TC_013, RMA_SeleniumRegression_TC_013.Login_Txt_Password_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.Login_Txt_UserName_TC_013, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMA_SeleniumRegression_TC_013.DSNName_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.DSNName_TC_013, 2));
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
		
			//==============================Steps To Change password From SMS Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_013.DSNName_TC_013),"Expand Image Of "+RMA_SeleniumRegression_TC_013.DSNName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013),RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_PermissionExpires(driver),"uncheck","Permission Expires CheckBox","Security Management System Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_Password(driver), "Password TextBox On  Security Management System Page ", RMA_SeleniumRegression_TC_013.UserLastName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Change password From SMS Page Is Ended Here================================================================================================
			
			//==============================Steps To Verify That User Is Able To Login With Changed Password Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_SeleniumRegression_TC_013.UserLastName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			Thread.sleep(4000);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver)));
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_SeleniumRegression_TC_013.DSNName_TC_013, RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver).getText(), "Correct DSN Name",logval);
			
			//==============================Steps To Verify That User Is Able To Login With Changed Password Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall7= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMA_SeleniumRegression_TC_013.Login_Txt_UserName_TC_013, RMA_SeleniumRegression_TC_013.Login_Txt_Password_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.Login_Txt_Password_TC_013, 2));
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall8 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMA_SeleniumRegression_TC_013.DSNName_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_013.DSNName_TC_013, 2));
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
		
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================

			//==============================Steps To Delete Created User From SMS Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",0)+ " To Delete User On SMS Page");
			testcall9= true;					
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Delete", RMA_SeleniumRegression_TC_013.UserFirstName_TC_013, RMA_SeleniumRegression_TC_013.UserLastName_TC_013,RMA_SeleniumRegression_TC_013.UserFirstName_TC_013+" "+RMA_SeleniumRegression_TC_013.UserLastName_TC_013, "NA", "NA","NA", "NA", "NA", "NA","NA", "NA",false, logval1);	
			loggerval9= logger.toString();
			parentlogger.appendChild(logger);	
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Delete Created User From SMS Page Is Ended Here================================================================================================
		
		
			
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
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall5== true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall6 == true) && (loggerval6.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall7 == true) && (loggerval7.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall8 == true) && (loggerval8.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall9== true) && (loggerval9.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSUserAddEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result)   //All The Information Associated With The Test Case Is Stored In Result Variable
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
				if(driver.getTitle().equalsIgnoreCase("Riskmaster Security")){
					RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
					}
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

