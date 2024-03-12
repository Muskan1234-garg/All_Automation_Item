package rma_appiumtestcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
import rma_appiumutilities.RMA_ScreenCapture_Utility;
import rma_appiumutilities.RMA_Verification_Utility;
import rma_appiumPOM.RMA_Appium_POM_DefaultView;
import rma_appiumPOM.RMA_Appium_POM_Login_DSNSelect;
import rma_appiumPOM.RMA_Appium_POM_Security;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_003
//Description    : Successful Login, DSN Selection, Default UI, Database Change And Logout Of RMA Mobile Application Is Verified
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-02-13-2017
//=================================================================================================
//Note: Here "abk" User Which Is Logged In The Application In Smoke Test Suites Is Used To Login The RMA Application As Being A Common User Chances Of Test Case Failure Due To User Not Present, User Not Having Permission To Login Are Less

public class RMA_TC_003 extends rma_appiumtestcases.BaseTest{	

@Test
public void RMA_TC_003_Test() throws Exception,Error
{
	try {
		parentlogger = reports.startTest("TC_003_Login, DSN Selection, Default UI, Database, Change, Logout Verification","Successful Login, DSN Selection, Default UI, DatabaseChange And Logout Of RMA Mobile Application Is Verified");
		
		String ActualLoginUserName;
		String RMAApp_DefaultView_Lbl_UserName;
		String RMAApp_SelectDSN_Lst_DsnName;
		//Local Variable Declaration
		
		testcall1 = false;	
		testcall2 = false;
		testcall3 = false;
		testcall4 = false;
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		loggerval3 = "NotInitialized";
		loggerval4 = "NotInitialized";
		StrScreenShotTCName = "RMA_TC_003";
		//Variable Initialization Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMA_Suite_01_RMAMobileApplication.xlsx"); //Excel Workbook RMA_Suite_01_RMAMobileApplication Is Opened To Fetch Data
		RMAApp_DefaultView_Lbl_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("TC_003", 1, 0); //ExpectedLoginUserName Is Fetched From DataSheet TC_003
		RMAApp_SelectDSN_Lst_DsnName= ExcelData.RMA_ExcelStringDataRead_Utility("TC_003", 1, 1); //DataSourceName To Be Selected When Application Is Logged In Again After Logout Is Fetched From DataSheet TC_003
		
		/*===========================================================RMA Mobile Application LogOut Is Started================================================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LeftNavTree(), "Left Hand Navigation Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LogOut(), "LogOut Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_ServerName()));
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_UserName(), "displayed", "UserName TextBox On RMA Mobile App Login Screen",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_Password(), "displayed", "Password TextBox On RMA Mobile App Login Screen",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Btn_Submit(), "displayed", "Submit Button On RMA Mobile App Login Screen",prntloggerval);
		/*===========================================================RMA Mobile Application LogOut Is Completed===============================================================================================================================================================================================================*/	
		
		/*===========================================================Login To RMA Mobile Application Is Started Here=========================================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_Hyperlink("RMA_TC_001_RiskMaster Mobile App Login", "RMA_TC_001",0)+" To Login RMA Mobile Application");
		testcall1 = true;
		RMA_TC_001 MobileAppLogin = new RMA_TC_001();
		MobileAppLogin.RMAApp_login();
		loggerval1 = logger.toString();
		parentlogger.log(LogStatus.INFO, "RMA Mobile Application Is Successfully Logged In");
		parentlogger.appendChild(logger);
		// RMA Mobile Application Is Logged In
		/*===========================================================Login To RMA Mobile Application Is Completed Here========================================================================================================================================================================================================*/
		
		/*===========================================================RMA Mobile Application Data Source Selection Is Started Here==============================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_Hyperlink("RMA_TC_002_RiskMaster DSN Selection", "RMA_TC_002",0)+" To Select DataSource For RMA Mobile Application");
		testcall2 = true;
		RMA_TC_002 MobileAppDSNSelection = new RMA_TC_002();
		MobileAppDSNSelection.RMAApp_DSNSelection();;
		loggerval2 = logger.toString();
		parentlogger.log(LogStatus.INFO, "Required DataSource Is Selected Successfully For RMA Mobile Application");
		parentlogger.appendChild(logger);
		// Data Source Selection For RMA Mobile Application Is Done
		/*===========================================================RMA Mobile Application Data Source Selection Is Completed Here====================================================================================================================================================================================*/
		
		/*===========================================================Verification Of Options Displayed On Selecting Top Left Side Image Icon On RMA Mobile Application Is Started Here====================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LeftNavTree(), "Left Hand Navigation Button On RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Lbl_UserName(), "displayed", "UserName Label On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		ActualLoginUserName = RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Lbl_UserName().getText();
		RMA_Verification_Utility.RMA_PartialTextVerification(RMAApp_DefaultView_Lbl_UserName, ActualLoginUserName, "LoginUserName", prntloggerval);
		
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Img_CSC(), "displayed", "CSC Image Header On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Img_RiskMaster(), "displayed", "RiskMaster Image Header On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_SyncApp(), "displayed", "Sync App Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_ReloadApp(), "displayed", "Reload App Image On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Security(), "displayed", "Security Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Feedback(), "displayed", "Feedback Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_About(), "displayed", "About Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LogOut(), "displayed", "LogOut Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Verification Of Options Displayed On Selecting Top Left Side Image Icon", StrScreenShotTCName,prntloggerval)));
		/*===========================================================Verification Of Options Displayed On Selecting Top Left Side Image Icon On RMA Mobile Application Is Completed Here==========================================================================================================================================*/
		
		/*===========================================================RMA Mobile Application LogOut Is Started================================================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LogOut(), "LogOut Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_ServerName()));
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_UserName(), "displayed", "UserName TextBox On RMA Mobile App Login Screen",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_Password(), "displayed", "Password TextBox On RMA Mobile App Login Screen",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Btn_Submit(), "displayed", "Submit Button On RMA Mobile App Login Screen",prntloggerval);
		/*===========================================================RMA Mobile Application LogOut Is Completed===============================================================================================================================================================================================================*/	
		
		/*===========================================================Login To RMA Mobile Application Is Started Here==========================================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_Hyperlink("RMA_TC_001_RiskMaster Mobile App Login", "RMA_TC_001",1)+" To Login RMA Mobile Application");
		testcall3 = true;
		MobileAppLogin.RMAApp_login();
		loggerval3 = logger.toString();
		parentlogger.log(LogStatus.INFO, "RMA Mobile Application Is Successfully Logged In");
		parentlogger.appendChild(logger);
		// RMA Mobile Application Is Logged In
		/*===========================================================Login To RMA Mobile Application Is Completed Here===========================================================================================================================================================================================================*/
		
		/*===========================================================RMA Mobile Application Data Source Selection Is Started Here==================================================================================================================================================================================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_SelectDSN(), "Select DSN Button On RMA Mobile App DSN Selection Scrren",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Lst_SelectDSN(RMAApp_SelectDSN_Lst_DsnName), "To Select Following DataSource" + " " +color.RMA_ChangeColor_Utility(RMAApp_SelectDSN_Lst_DsnName,2)+ " "+ "DSN Selection List Box On RMA Mobile App DSN Selection Screen",prntloggerval);
		
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Tasks()));
		// Data Source Selection For RMA Mobile Application Is Done
		
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Events(), "displayed", "Events Button On Default View Of RMA Mobile App",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(), "displayed", "Claims Button On Default View Of RMA Mobile App",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_PinnedItems(), "displayed", "Pinned Items Button On Default View Of RMA Mobile App",prntloggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Txt_PinnedItemsHere(), "displayed", "Your Pinned Items Will Show Here Text On Default View Of RMA Mobile App",prntloggerval);
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful DSN Selection", StrScreenShotTCName,prntloggerval)));
		/*===========================================================RMA Mobile Application Data Source Selection Is Completed Here===========================================================================================================================================================================================================*/
	
		/*===========================================================DataBase Change From Security-->Change Database Option Is Started Here==================================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_LeftNavTree(), "Left Hand Navigation Button On RMA Mobile App Default View",prntloggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Security(),"Security Image Button On Left Hand Navigation Tree Of RMA Mobile App Default View",prntloggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangeDSN()));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Security.RMAApp_Security_Btn_ChangeDSN(),"ChangeDSN Button On Security Screen Of RMA Mobile Application",prntloggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(prntloggerval);
		/*===========================================================RMA Mobile Application Data Source Selection Is Started Here==============================================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_Hyperlink("RMA_TC_002_RiskMaster DSN Selection", "RMA_TC_002",0)+" To Select DataSource For RMA Mobile Application");
		testcall4 = true;
		MobileAppDSNSelection.RMAApp_DSNSelection();;
		loggerval4 = logger.toString();
		parentlogger.log(LogStatus.INFO, "Required DataSource Is Selected Successfully For RMA Mobile Application");
		parentlogger.appendChild(logger);
		// Data Source Selection For RMA Mobile Application Is Done
		/*===========================================================RMA Mobile Application Data Source Selection Is Completed Here===============================================================================================================================================================================================================*/
		/*===========================================================DataBase Change From Security-->Change Database Option Is Completed Here====================================================================================================================================================================================================*/
	
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Child TestCase" +" "+ "RMA_TC_001_RiskMaster Mobile App Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
		}
		
		if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Child TestCase" +" "+ "RMA_TC_002_RiskMaster DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
		}
		
		if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Child TestCase" +" "+ "RMA_TC_001_RiskMaster Mobile App Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
		}
		
		if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
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



	


