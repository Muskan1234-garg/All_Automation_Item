package rmaseleniumtestscripts_REGRESSION;

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
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_023
//Description    : Successfully User Can Give Module Access Permissions Of A Group in SMS Is Validated
//Depends On TC  : RMA_TC_019
//Revision       : 0.0 - RenuVerma-03-17-2017
//=================================================================================================

public class RMA_TC_023 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_TC_023_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_TC_023_ Module Access Permissions Of A Group in SMS", "Successfully User Can Give Module Access Permissions Of A Group in SMS Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String UserManager;
			String UserEmail;
			String AccessSMSStatus;
			String AccessUSPStatus;
			String UserFirstName;
			String ModuleName;
			String UserLastName;
			String Login_Txt_UserName;
			String Login_Txt_Password;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite9_SMSScreen.xlsx"); //Excel WorkBook RMA_RegressionSuite9_SMSScreen Is Fetched To Retrieve Data
			UserManager = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_023", 1, 0); // User Manager Is Fetched From DataSheet RMA_TC_023
			UserEmail=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_023", 1, 1); // User Email Is Fetched From DataSheet RMA_TC_023
			AccessSMSStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_023", 1, 2); // Access SMS CheckBox Status Is Fetched From DataSheet RMA_TC_023
			AccessUSPStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_023", 1, 3); // Access USP CheckBox Status Is Fetched From DataSheet RMA_TC_023
			ModuleName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_023", 1, 4); // Module Name Is Fetched From DataSheet RMA_TC_023
			
			RMA_ExcelDataRetrieval_Utility ExcelData3 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			Login_Txt_Password = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
			
			UserFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(6, "UFN_");// Generate User first name
			UserLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(6, "ULN_");// Generate User last name
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			StrScreenShotTCName = "RMA_TC_023";
			//Variable Initialization Completed
			
			//==============================Steps To Assign Module From SMS Page Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",0)+ " To Add User On SMS Page");
			testcall1 = true;		
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Add", UserFirstName, UserLastName,UserFirstName+" "+UserLastName, UserManager, UserEmail,"USA", AccessSMSStatus, AccessUSPStatus, RMA_TC_019.DSNName_TC_019, RMA_TC_019.RenamedModuleName_TC_019,"No", false, logval1);	
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Assign Module From SMS Page Is Ended Here================================================================================================
			
			//==============================Steps To UnCheck Module Access Permission Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_019.DSNName_TC_019),"Expand Image Of "+RMA_TC_019.DSNName_TC_019+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups  Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_TC_019.RenamedModuleName_TC_019),RMA_TC_019.RenamedModuleName_TC_019+"Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), "uncheck", "Utilities CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "RISKMASTER"),"Expand Image Of RISKMASTER Link From Module Access Permission On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Diary"),"uncheck", "Diary CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Search"), "uncheck", "Search CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),"Save Image From Module Access Permission On Security Management System Page",logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName_TC_023+" "+UserLastName_TC_023),UserFirstName_TC_023+" "+UserLastName_TC_023+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To UnCheck Module Access Permission Is Ended Here================================================================================================
			
			//==============================Steps To Verify User Is Not Able To View Menu Of Unchecked Permission Settings Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//Application Is Logged In
				
			RMA_Verification_Utility.RMA_TextCompare(UserFirstName, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Diaries"), "Diaries MDI Menu Link On RMA Application", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Search"), "Search MDI Menu Link On RMA Application", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Utilities"), "Utilities MDI Menu Link On RMA Application", logval);
			//==============================Steps To Verify User Is Not Able To View Menu Of Unchecked Permission Settings Is Ended Here================================================================================================
			
			//==============================Steps To Check Module Access Permission Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);		
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_019.DSNName_TC_019),"Expand Image Of "+RMA_TC_019.DSNName_TC_019+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups  Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMA_TC_019.RenamedModuleName_TC_019),RMA_TC_019.RenamedModuleName_TC_019+"Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), "check", "Utilities CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "RISKMASTER"),"Expand Image Of RISKMASTER Link From Module Access Permission On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Diary"),"check", "Diary CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Search"), "check", "Search CheckBox", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Image From Module Access Permission On Security Management System Page",logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName_TC_023+" "+UserLastName_TC_023),UserFirstName_TC_023+" "+UserLastName_TC_023+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Check Module Access Permission Is Ended Here================================================================================================
			
			//==============================Steps To Verify User Is Able To View Menu Of Checked Permission Option Settings Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//Application Is Logged In
						
			RMA_Verification_Utility.RMA_TextCompare(UserFirstName, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Diaries"), "Diaries MDI Menu Link On RMA Application", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Search"), "Search MDI Menu Link On RMA Application", logval);
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Utilities"), "Search MDI Menu Link On RMA Application", logval);
			//Above line will get enable after fixing the JIRA issue RMA-37201 			
			//==============================Steps To Verify User Is Able To View Menu Of Checked Permission Option Settings Is Ended Here================================================================================================
		
			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
		
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 ");
			testcall2= true;
			RMA_TC_002 dsnselection1 = new RMA_TC_002();
			dsnselection1.RMAApp_DSNSelection();
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			RMA_Verification_Utility.RMA_TextCompare(Login_Txt_UserName, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
			
			//==============================Steps To Delete Module From SMS Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();	
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "SMSModuleAddRenameDelete",0)+ " To Delete Cretaed Module Under RMA_TC_019");
			testcall3 = true;		
			RMA_Functionality_Utility.RMA_SMSModuleAddRenameDelete_Utility("Delete", RMA_TC_019.RenamedModuleName_TC_019, RMA_TC_019.RenamedModuleName_TC_019,"NA", "NA", "NA", "NA", "NA",RMA_TC_019.DSNName_TC_019, false, logval1);	
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);	
			//==============================Steps To Delete Module From SMS Page Is Ended Here================================================================================================
			
			//==============================Steps To Re-attach The User With Another Module Group Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMA_TC_019.DSNName_TC_019),"Expand Image Of "+RMA_TC_019.DSNName_TC_019+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver), ModuleName, "Assign User To Module Group WebList", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			//==============================Steps To Re-attach The User With Another Module Group Is Ended Here================================================================================================
		
			//==============================Steps To Delete User From SMS Page Is Started Here================================================================================================
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",1)+ " To Delete User On SMS Page");
			testcall4 = true;		
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Delete", UserFirstName, UserLastName,UserFirstName+" "+UserLastName, "NA","NA", "NA", "NA", "NA", "NA","NA","NA", false, logval1);	
			loggerval4= logger.toString();
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_TC_002" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSModuleAddRenameDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

