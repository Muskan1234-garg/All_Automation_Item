package rmaseleniumtestscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_013
//Description    : Successful Set User To Add Up In Selected Time Intervals Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-08-05-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_013 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	public static String UserFirstName_TC_013;
	public static String UserLastName_TC_013;
	public static String DSNName_TC_013;
	public static String Login_Txt_UserName_TC_013;
	public static String Login_Txt_Password_TC_013;

	@Test
	public void RMA_SeleniumRegression_TC_013_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_013_Set User To Add Up In Selected Time Intervals", "Successful Set User To Add Up In Selected Time Intervals Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String UserManager;
			String UserEmail;
			String AccessSMSStatus;
			String AccessUSPStatus;
			String ModuleName;
			String LoginURL;
			//Local Variable Declaration Completed

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_013";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite9_SMSScreen.xlsx"); //Excel WorkBook RMA_RegressionSuite9_SMSScreen Is Fetched To Retrieve Data
			UserManager = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 0); // User Manager Is Fetched From DataSheet RMA_SeleniumRegression_TC_013
			UserEmail=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 1); // User Email Is Fetched From DataSheet RMA_SeleniumRegression_TC_013
			AccessSMSStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 2); // Access SMS CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_013
			AccessUSPStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 3); // Access USP CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_013
			ModuleName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 4); // Module Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_013

			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName_TC_013= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002

			RMA_ExcelDataRetrieval_Utility ExcelData3 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			Login_Txt_UserName_TC_013 = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			Login_Txt_Password_TC_013 = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001

			UserFirstName_TC_013=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(6, "UFN_");// Generate User first name
			UserLastName_TC_013=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(6, "ULN_");// Generate User last name
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
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_013";
			//Variable Initialization Completed

			//==============================Steps To Add User From SMS Page Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",0)+ " To Add User On SMS Page");
			testcall1 = true;		
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Add", UserFirstName_TC_013, UserLastName_TC_013,UserFirstName_TC_013+" "+UserLastName_TC_013, UserManager, UserEmail, "USA",AccessSMSStatus, AccessUSPStatus, DSNName_TC_013, ModuleName, "No",false, logval1);	
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Add User From SMS Page Is Ended Here================================================================================================

			//==============================Steps To Check All Time Intervals Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName_TC_013),"Expand Image Of "+DSNName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName_TC_013+" "+UserLastName_TC_013),UserFirstName_TC_013+" "+UserLastName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
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
		
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Check All Time Intervals Is Ended Here================================================================================================

			//==============================Steps To Verify User Is Able To Login When All Time Intervals Selected Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserFirstName_TC_013, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserFirstName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			//Application Is Logged In

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, UserFirstName_TC_013), "Correct UserName Display", logval);
			//==============================Steps To Verify User Is Able To Login When All Time Intervals Selected Is Ended Here================================================================================================

			//==============================Steps To Un-check All Time Intervals Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName_TC_013)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName_TC_013),"Expand Image Of "+DSNName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName_TC_013+" "+UserLastName_TC_013),UserFirstName_TC_013+" "+UserLastName_TC_013+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Allow access in these time intervals"),"Allow Access In These Time Intervals Tab On Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Monday(driver),"uncheck","Monday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Tuesday(driver),"uncheck","Tuesday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Wednesday(driver),"uncheck","Wednesday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Thursday(driver),"uncheck","Thursday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Friday(driver),"uncheck","Friday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Saturday(driver),"uncheck","Saturday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_Sunday(driver),"uncheck","Sunday CheckBox","Security Management System Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Un-check All Time Intervals Is Ended Here================================================================================================

			//==============================Steps To Verify User Is Not Able To Login When None Time Intervals Selected Is Started Here================================================================================================

		    RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
		    
			LoginURL=driver.getCurrentUrl();//Get Current URL 
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserFirstName_TC_013, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserFirstName_TC_013, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Cmb_DataSourceName(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "*Error Getting Session"),"Login Failed Error Message Value", logval);
			driver.close();
			//==============================Steps To Verify User Is Not Able To Login When None Time Intervals Selected Is Ended Here================================================================================================

			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================

			if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
			{
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				capabilities.setCapability("requireWindowFocus", true);
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\RMASeleniumWebDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(capabilities); // Driver Instance Creation		
			}	
			else if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\RMASeleniumWebDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}	

			driver.navigate().to(LoginURL); //Navigation To The RMA Application Login Page
			driver.manage().window().maximize(); //Maximizing The RMA Application Login Page
			globalWait = new WebDriverWait(driver, 10);
			StrRMAWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall2= true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName_TC_013, Login_Txt_UserName_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName_TC_013, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNName_TC_013, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNName_TC_013, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
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

