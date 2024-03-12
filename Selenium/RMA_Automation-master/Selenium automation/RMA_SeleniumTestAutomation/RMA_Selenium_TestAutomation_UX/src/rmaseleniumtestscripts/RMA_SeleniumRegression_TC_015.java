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
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_015
//Description    : Successfully User Can Give Module Access Permissions Of A Group in SMS Is Validated
//Depends On TC  : RMA_SeleniumRegression_TC_011
//Revision       : 0.0 - RenuVerma-08-18-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_015 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	String Login_Txt_UserName;
	String Login_Txt_Password;
	String DSNName;

	@Test
	public void RMA_SeleniumRegression_TC_015_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_015_ Module Access Permissions Of A Group in SMS", "Successfully User Can Give Module Access Permissions Of A Group in SMS Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String UserManager;
			String UserEmail;
			String AccessSMSStatus;
			String AccessUSPStatus;
			String UserFirstName;
			String ModuleName;
			String UserLastName;
			//Local Variable Declaration Completed

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite9_SMSScreen.xlsx"); //Excel WorkBook RMA_RegressionSuite9_SMSScreen Is Fetched To Retrieve Data
			UserManager = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_015", 1, 0); // User Manager Is Fetched From DataSheet RMA_SeleniumRegression_TC_015
			UserEmail=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_015", 1, 1); // User Email Is Fetched From DataSheet RMA_SeleniumRegression_TC_015
			AccessSMSStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_015", 1, 2); // Access SMS CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_015
			AccessUSPStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_015", 1, 3); // Access USP CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_015
			ModuleName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_015", 1, 4); // Module Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_015

			RMA_ExcelDataRetrieval_Utility ExcelData3 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			Login_Txt_Password = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001

			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002

			UserFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(7, "UFN_");// Generate User first name
			UserLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(7, "ULN_");// Generate User last name

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_015";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
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
			//Variable Initialization Completed

			//==============================Steps To Assign Module From SMS Page Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",0)+ " To Add User On SMS Page");
			testcall1 = true;		
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Add", UserFirstName, UserLastName,UserFirstName+" "+UserLastName, UserManager, UserEmail,"USA", AccessSMSStatus, AccessUSPStatus, RMA_SeleniumRegression_TC_011.DSNName_TC_011, RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011,"No", false, logval1);	
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			//==============================Steps To Assign Module From SMS Page Is Ended Here================================================================================================

			//==============================Steps To UnCheck Module Access Permission Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_011.DSNName_TC_011),"Expand Image Of "+RMA_SeleniumRegression_TC_011.DSNName_TC_011+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups  Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011),RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011+"Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), "uncheck", "Utilities CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "RISKMASTER"),"Expand Image Of RISKMASTER Link From Module Access Permission On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Diary"),"uncheck", "Diary CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Search"), "uncheck", "Search CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),"Save Image From Module Access Permission On Security Management System Page",logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName_TC_023+" "+UserLastName_TC_023),UserFirstName_TC_023+" "+UserLastName_TC_023+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			//==============================Steps To UnCheck Module Access Permission Is Ended Here================================================================================================

			//==============================Steps To Login With Created User Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//Application Is Logged In

			Thread.sleep(4000);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver)));
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_SeleniumRegression_TC_011.DSNName_TC_011, RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver).getText(), "Correct DSN Name",logval);
			//==============================Steps To Login With Created User Is Ended Here================================================================================================

			//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
			//==============================Steps To Navigate To RMA Claim System Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Verify User Is Not Able To View Menu Of Unchecked Permission Settings Is Started Here=====================================================================================================================================================================================================================================================================================================================================================================
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Diaries"), "Diaries MDI Menu Link On RMA Application", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Search"), "Search MDI Menu Link On RMA Application", logval);
			//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Utilities"), "Utilities MDI Menu Link On RMA Application", logval);
			//==============================Steps To Verify User Is Not Able To View Menu Of Unchecked Permission Settings Is Ended Here================================================================================================

			//==============================Steps To Check Module Access Permission Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_011.DSNName_TC_011),"Expand Image Of "+RMA_SeleniumRegression_TC_011.DSNName_TC_011+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups  Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011),RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011+"Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), "check", "Utilities CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "RISKMASTER"),"Expand Image Of RISKMASTER Link From Module Access Permission On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Diary"),"check", "Diary CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Search"), "check", "Search CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Image From Module Access Permission On Security Management System Page",logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName_TC_023+" "+UserLastName_TC_023),UserFirstName_TC_023+" "+UserLastName_TC_023+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			//==============================Steps To Check Module Access Permission Is Ended Here================================================================================================

			//==============================Steps To Login With Created User Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//Application Is Logged In

			Thread.sleep(4000);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver)));
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_SeleniumRegression_TC_011.DSNName_TC_011, RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_DataSource(driver).getText(), "Correct DSN Name",logval);
			//==============================Steps To Login With Created User Is Ended Here================================================================================================

			//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
			//==============================Steps To Navigate To RMA Claim System Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Verify User Is Not Able To View Menu Of checked Permission Settings Is Started Here=====================================================================================================================================================================================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Diaries"), "Diaries MDI Menu Link On RMA Application", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Search"), "Search MDI Menu Link On RMA Application", logval);
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Utilities"), "Utilities MDI Menu Link On RMA Application", logval);
			//Above line will get enable after fixing the JIRA issue RMA-37201 	
			//==============================Steps To Verify User Is Not Able To View Menu Of checked Permission Settings Is Ended Here================================================================================================

			//==============================Steps To Change Module From User Access Permission Option To Verify PopUp Message Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit Image From User Access Permissions On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver), "Training", "Assign User To Module Group WebList", "Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.ChangeModGroupAssociationMessage), "Popup Message to check Another Module Selection", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			//==============================Steps To Change Module From User Access Permission Option To Verify PopUp Message Is Ended Here================================================================================================

			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out

			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall2= true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName, Login_Txt_Password, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected

			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================

			//==============================Steps To Delete Module From SMS Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "SMSModuleAddRenameDelete",0)+ " To Delete Cretaed Module Under RMA_SeleniumRegression_TC_011");
			testcall4= true;		
			RMA_Functionality_Utility.RMA_SMSModuleAddRenameDelete_Utility("Delete", RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011, RMA_SeleniumRegression_TC_011.RenamedModuleName_TC_011,"NA", "NA", "NA", "NA", "NA",RMA_SeleniumRegression_TC_011.DSNName_TC_011, false, logval1);	
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);	
			//==============================Steps To Delete Module From SMS Page Is Ended Here================================================================================================

			//==============================Steps To Re-attach The User With Another Module Group Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_SeleniumRegression_TC_011.DSNName_TC_011),"Expand Image Of "+RMA_SeleniumRegression_TC_011.DSNName_TC_011+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver), ModuleName, "Assign User To Module Group WebList", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			//==============================Steps To Re-attach The User With Another Module Group Is Ended Here================================================================================================

			//==============================Steps To Delete User From SMS Page Is Started Here================================================================================================
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",1)+ " To Delete User On SMS Page");
			testcall5 = true;		
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Delete", UserFirstName, UserLastName,UserFirstName+" "+UserLastName, "NA","NA", "NA", "NA", "NA", "NA","NA","NA", false, logval1);	
			loggerval5= logger.toString();
			parentlogger.appendChild(logger);	
			//==============================Steps To Delete User From SMS Page Is Ended Here================================================================================================


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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSUserAddEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSModuleAddRenameDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
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
				parentlogger.log(LogStatus.INFO, "Finally Block Is Executed");
				//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
				//Application Is Logged Out
				RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
				RMA_Functionality_Utility.RMA_Application_Logout(logval);
				//Application Is Logged Out

				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
				parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
				RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName, Login_Txt_Password, logval);
				parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName, 2));
				//Application Is Logged In

				parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
				RMA_Functionality_Utility.RMA_DataSourceSelection(DSNName, logval);
				parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNName, 2));
				//DSN Is Selected

				//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================

				//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
				RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
				StrRMAUXWindowHandle = driver.getWindowHandle();
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
				//==============================Steps To Navigate To RMA Claim System Completed Here===========================================================================================================================================================================================================================


			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

