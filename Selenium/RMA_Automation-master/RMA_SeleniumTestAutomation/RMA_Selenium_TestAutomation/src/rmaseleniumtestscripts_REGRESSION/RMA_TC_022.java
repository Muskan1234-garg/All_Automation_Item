package rmaseleniumtestscripts_REGRESSION;

import java.text.SimpleDateFormat;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_SMS;
import rmaseleniumtestscripts.RMA_TC_002;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_022
//Description    : Successfully The Functionality Of Permission Expiration Of User Access Permissions Is Validated
//Depends On TC  : RMA_TC_021
//Revision       : 0.0 - RenuVerma-03-28-2017
//=================================================================================================

public class RMA_TC_022 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String LoginURL;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_TC_022_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_TC_022_ The Functionality Of Permission Expiration Of User Access Permissions", "Successfully The Functionality Of Permission Expiration Of User Access Permissions Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
		
			String PastExpDate;
			String TodayExpDate;
			String FutureExpDate;
			//Local Variable Declaration Completed
			
			PastExpDate=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -2, 0)));// Past Expiration Date		
			TodayExpDate=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility()));// Today Expiration Date
			FutureExpDate=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 2, 0)));// Future Expiration Date
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			StrScreenShotTCName = "RMA_TC_022";
			//Variable Initialization Completed		
					
			//==============================Steps To Set Past Permission Expiration Date On User Permission Access Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_021.DSNName_TC_021),"Expand Image Of "+RMA_TC_021.DSNName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021),RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_PermissionExpires(driver),"check","Permission Expires CheckBox","Security Management System Page",logval);
			// Past Expiration Date Entered
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_ExpirationDate(driver), "Expiration Date TextBox On Security Management System Page", PastExpDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Allow access in these time intervals"),"Allow Access In These Time Intervals Tab On Security Management System Page",logval);
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
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			LoginURL=driver.getCurrentUrl();//Get Current URL 
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
		//	RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Lbl_FailureText(driver),  "Login Failure Text Label on RMA Application Login Page", logval);
			//RMA_Verification_Utility.RMA_TextCompare("Your login has expired; please contact your system administrator.",RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelection_Lbl_ErrorText(driver).getAttribute("innerText"), "Login Failed Error Message Value", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver),  "Login User Name On Default View Page", logval);
			//==============================Steps To Verify That User Is Not Able To Login Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			driver.navigate().to(LoginURL); //Navigation To The RMA Application Login Page
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_UserName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_Password_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 ");
			testcall1 = true;
			RMA_TC_002 dsnselection1 = new RMA_TC_002();
			dsnselection1.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_021.Login_Txt_UserName_TC_021, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			driver.switchTo().parentFrame();
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
	
			//==============================Steps To Set Today Permission Expiration Date On User Permission Access Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_021.DSNName_TC_021),"Expand Image Of "+RMA_TC_021.DSNName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021),RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
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
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			LoginURL=driver.getCurrentUrl();//Get Current URL 
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver),  "Login User Name On Default View Page", logval);
			//==============================Steps To Verify That User Is Not Able To Login Is Ended Here================================================================================================
			
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			driver.navigate().to(LoginURL); //Navigation To The RMA Application Login Page
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_UserName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_Password_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 ");
			testcall2 = true;
			RMA_TC_002 dsnselection2 = new RMA_TC_002();
			dsnselection2.RMAApp_DSNSelection();
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_021.Login_Txt_UserName_TC_021, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			driver.switchTo().parentFrame();
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
	
			//==============================Steps To Set Future Permission Expiration Date On User Permission Access Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_021.DSNName_TC_021),"Expand Image Of "+RMA_TC_021.DSNName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021),RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
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
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			LoginURL=driver.getCurrentUrl();//Get Current URL 
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_021.UserFirstName_TC_021, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			//==============================Steps To Verify That User Is Able To Login Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			
			driver.navigate().to(LoginURL); //Navigation To The RMA Application Login Page
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_UserName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_Password_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 ");
			testcall4 = true;
			RMA_TC_002 dsnselection3 = new RMA_TC_002();
			dsnselection3.RMAApp_DSNSelection();
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_021.Login_Txt_UserName_TC_021, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
		
			//==============================Steps To Change password From SMS Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_021.DSNName_TC_021),"Expand Image Of "+RMA_TC_021.DSNName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021),RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_PermissionExpires(driver),"uncheck","Permission Expires CheckBox","Security Management System Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_Password(driver), "Password TextBox On  Security Management System Page ", RMA_TC_021.UserLastName_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Change password From SMS Page Is Ended Here================================================================================================
			
			//==============================Steps To Verify That User Is Able To Login With Changed Password Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.UserFirstName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.UserLastName_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_021.UserFirstName_TC_021, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			//==============================Steps To Verify That User Is Able To Login With Changed Password Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			
			driver.navigate().to(LoginURL); //Navigation To The RMA Application Login Page
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_UserName_TC_021, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMA_TC_021.Login_Txt_Password_TC_021, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 ");
			testcall4 = true;
			RMA_TC_002 dsnselection4 = new RMA_TC_002();
			dsnselection4.RMAApp_DSNSelection();
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_021.Login_Txt_UserName_TC_021, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================

			//==============================Steps To Delete Created User From SMS Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",0)+ " To Delete User On SMS Page");
			testcall3= true;					
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Delete", RMA_TC_021.UserFirstName_TC_021, RMA_TC_021.UserLastName_TC_021,RMA_TC_021.UserFirstName_TC_021+" "+RMA_TC_021.UserLastName_TC_021, "NA", "NA","NA", "NA", "NA", "NA","NA", "NA",false, logval1);	
			loggerval3= logger.toString();
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_TC_002" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_TC_002" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall3== true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSUserAddEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_TC_002" + " " +  "And Hence The Test Case Is A Fail");
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
				reports.endTest(parentlogger); 
				reports.flush();
		}
	}		
}

