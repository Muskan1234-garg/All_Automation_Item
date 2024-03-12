package rma_appiumtestcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rma_appiumPOM.RMA_Appium_POM_DefaultView;
import rma_appiumPOM.RMA_Appium_POM_Login_DSNSelect;
import rma_appiumPOM.RMA_Appium_POM_Security;
import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_Input_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
import rma_appiumutilities.RMA_ScreenCapture_Utility;
import rma_appiumutilities.RMA_Verification_Utility;
//RMA Package Import Completed

//==================================================================================================================================================
//TestCaseID     : RMA_TC_004
//Description    : Successful Login Password Change And Home Icon Button Functionality For RMA Mobile Application Is Verified
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-02-15-2017
//==================================================================================================================================================
//Note: Here "abk" User Which Is Logged In The Application In Smoke Test Suites Is Used To Login The RMA Application As Being A Common User Chances Of Test Case Failure Due To User Not Present, User Not Having Permission To Login etc. Are Less And Password Functionality Can Be Successfully Verified

public class RMA_TC_004 extends rma_appiumtestcases.BaseTest{	

@Test
public void RMA_TC_004_Test() throws Exception,Error
{
	try {
		parentlogger = reports.startTest("TC_004_Password Change And Home Icon Button Functionality Verification","Successful Login Password Change And Home Icon Button Functionality For RMA Mobile Application Is Verified");
		
		String	RMAApp_Security_Txt_CurrentPassword;
		String	RMAApp_Security_Txt_ConfirmAndNewPassword;
		String RMAApp_Login_Txt_Server;
		String RMAApp_Login_Txt_UserName;
		//Local Variable Declaration
		
		StrScreenShotTCName = "RMA_TC_004";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		//Variable Initialization Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMA_Suite_01_RMAMobileApplication.xlsx"); //Excel Workbook RMA_Suite_01_RMAMobileApplication Is Opened To Fetch Data
		RMAApp_Security_Txt_CurrentPassword = ExcelData.RMA_ExcelStringDataRead_Utility("TC_004", 1, 0); //Current Password Is Fetched From DataSheet TC_004
		RMAApp_Security_Txt_ConfirmAndNewPassword= ExcelData.RMA_ExcelStringDataRead_Utility("TC_004", 1, 1); //ConfirmPassword/New Password Is Fetched From DataSheet TC_004
		RMAApp_Login_Txt_Server = ExcelData.RMA_ExcelStringDataRead_Utility("TC_004", 1, 2); //Server Name Fetched From DataSheet TC_004
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("TC_004", 1, 3); //UserName Fetched From DataSheet TC_004
		
		RMA_GenericUsages_Utility.RMA_HomeViewUtility(prntloggerval);
		//RMA Mobile Application Default View Is Loaded Again
		
		/*===========================================================Home Icon Button Functionality Verification Is Started Here======================================================================================================================================================================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Tasks(), "Tasks Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_Home(), "Home Image Button On RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Events(), "displayed", "Events Button On Default View Of RMA Mobile App",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Events(), "Event Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_Home(), "Home Image Button On RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(), "displayed", "Claims Button On Default View Of RMA Mobile App",prntloggerval);
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(), "Claims Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_Home(), "Home Image Button On RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_PinnedItems(), "displayed", "Pinned Items Button On Default View Of RMA Mobile App",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_PinnedItems(), "Pinned Items Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_Home(), "Home Image Button On RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Tasks(), "displayed", "Tasks Button On Default View Of RMA Mobile App",prntloggerval);
		/*===========================================================Home Icon Button Functionality Verification Is Completed Here====================================================================================================================================================================================*/
	
		/*==========================================================Login User's Password Change Functionality Is Started Here==========================================================================================================================================================================================*/
		/*RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LeftNavTree(), "Left Hand Navigation Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Security(),"Security Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangePassword()));
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangePassword(),"Change Password Button On Security Screen Of RMA Mobile Application",prntloggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Security.RMAApp_Security_Txt_CurrentPassword(), "Current Password Text Box On Change Password View Of Security Screen", RMAApp_Security_Txt_CurrentPassword, prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Security.RMAApp_Security_Txt_NewPassword(), "New Password Text Box On Change Password View Of Security Screen", RMAApp_Security_Txt_ConfirmAndNewPassword, prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Security.RMAApp_Security_Txt_ConfirmPassword(), "Confirm Password Text Box On Change Password View Of Security Screen", RMAApp_Security_Txt_ConfirmAndNewPassword, prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangePassword_1(),"Change Password Button On Change Password View Of Security Screen",prntloggerval);
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful Login User Password Change", StrScreenShotTCName,prntloggerval)));
		/*===========================================================Login User's Password Change Functionality Is Completed Here===================================================================================================================================================================================================*/
		
		/*===========================================================RMA Mobile Application LogOut Is Started========================================================================================================================================================================================================================*/
		/*RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LeftNavTree(), "Left Hand Navigation Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LogOut(), "LogOut Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_ServerName()));
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_UserName(), "displayed", "UserName TextBox On RMA Mobile App Login Screen",prntloggerval);
		/*===========================================================RMA Mobile Application LogOut Is Completed=======================================================================================================================================================================================================================*/	
		
		/*===========================================================RMA Mobile Application LogIn After Change Of Password For Login User Is Started=======================================================================================================================================================================================================================*/	
		/*RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_ServerName(), "ServerName TextBox On RMA Mobile App Login Screen",RMAApp_Login_Txt_Server,prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_UserName(), "UserName TextBox On RMA Mobile App Login Screen",RMAApp_Login_Txt_UserName,prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_Password(), "Password TextBox On RMA Mobile App Login Screen",RMAApp_Security_Txt_ConfirmAndNewPassword,prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Btn_Submit(), "Submit Button On RMA Mobile App Login Screen",prntloggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(prntloggerval);
		//RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_SelectDSN(), "displayed", "Select DSN Button On DSN Selection Screen Of RMA Mobile Application",prntloggerval);
		
		try {
			if (RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_SelectDSN().isDisplayed())
			{
				parentlogger.log(LogStatus.PASS, "Password For Login User Is Successfully Changed To" + " "+ color.RMA_ChangeColor_Utility(RMAApp_Security_Txt_ConfirmAndNewPassword,2)+ " "+ "And User Is Able To Login With The Changed Password");
			}
		} catch (Exception|Error e) {
			parentlogger.log(LogStatus.FAIL, "Password For Login User Is Not Successfully Changed To" + " "+ color.RMA_ChangeColor_Utility(RMAApp_Security_Txt_ConfirmAndNewPassword,2)+ " "+ "And User Is Not Able To Login With The Changed Password");
			throw (e);
		}
		
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful RMA Mobile App Login After Password Change", StrScreenShotTCName,prntloggerval)));
		/*===========================================================RMA Mobile Application LogIn After Change Of Password For Login User Is Completed=======================================================================================================================================================================================================================*/	
	
		/*===========================================================RMA Mobile Application Data Source Selection Is Started Here==============================================================================================================================================================================================*/
		/*parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_Hyperlink("RMA_TC_002_RiskMaster DSN Selection", "RMA_TC_002",0)+" To Select DataSource For RMA Mobile Application");
		testcall1 = true;
		RMA_TC_002 MobileAppDSNSelection = new RMA_TC_002();
		MobileAppDSNSelection.RMAApp_DSNSelection();;
		loggerval1 = logger.toString();
		parentlogger.log(LogStatus.INFO, "Required DataSource Is Selected Successfully For RMA Mobile Application");
		parentlogger.appendChild(logger);
		// Data Source Selection For RMA Mobile Application Is Done
		/*===========================================================RMA Mobile Application Data Source Selection Is Completed Here====================================================================================================================================================================================*/
		
		/*==========================================================Login User's Password Change Functionality To Original Password Is Started Here============================================================================================================================================================================================================*/
		/*RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LeftNavTree(), "Left Hand Navigation Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Security(),"Security Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangePassword()));
		
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangePassword(),"Change Password Button On Security Screen Of RMA Mobile Application",prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Security.RMAApp_Security_Txt_CurrentPassword(), "Current Password Text Box On Change Password View Of Security Screen", RMAApp_Security_Txt_ConfirmAndNewPassword, prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Security.RMAApp_Security_Txt_NewPassword(), "New Password Text Box On Change Password View Of Security Screen", RMAApp_Security_Txt_CurrentPassword, prntloggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Security.RMAApp_Security_Txt_ConfirmPassword(), "Confirm Password Text Box On Change Password View Of Security Screen", RMAApp_Security_Txt_CurrentPassword, prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangePassword_1(),"Change Password Button On Change Password View Of Security Screen",prntloggerval);
		/*===========================================================Login User's Password Change Functionality To Original Password Is Completed Here===================================================================================================================================================================================================*/
	} catch (Exception e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Un-Handled Exception And Print Log Of It
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
		
		if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Child TestCase" +" "+ "RMA_TC_002_RiskMaster DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
		}
		
		StackTraceElement[] TraceElement = e.getStackTrace();
		for (StackTraceElement ObjectName : TraceElement)
		{
			if(ObjectName.toString().contains("rma_appiumPOM") || ObjectName.toString().contains("rma_appiumutilities") )
			{
				FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In Following Package :"+" "+ObjectName.toString(); 
				break;
			}
		}
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
{
try {
		
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,prntloggerval);
		}
		
	} catch (Exception |Error e) {

		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		driver.context(NativeContext); //Explicit Switch To Native View At End Of Each TC In Finally Block So That If Control Is Not In Native View It Switches To It, If Control Is Already In Native View Then It Will Remain There Without Any Error. Required To Restore Default Mobile App Conditions
		reports.endTest(parentlogger);
		reports.flush();
	}
}
}



	


