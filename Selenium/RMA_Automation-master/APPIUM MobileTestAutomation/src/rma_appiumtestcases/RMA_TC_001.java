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
import rma_appiumutilities.RMA_Input_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
import rma_appiumutilities.RMA_Verification_Utility;
import rma_appiumPOM.RMA_Appium_POM_Login_DSNSelect;
import rma_appiumutilities.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_001
//Description    : Successful Login To The RMA Mobile Application Is Verified
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-01-04-2017
//=================================================================================================
public class RMA_TC_001 extends rma_appiumtestcases.BaseTest{	

@Test
public void RMAApp_login() throws Exception,Error
{
	try {
		logger = reports.startTest("<span id='RMA_TC_001_RiskMaster Mobile App Login'>RMA_TC_001_RiskMaster Mobile App Login</span>", "RiskMaster Mobile Application Is Logged In Successfully");
		String RMAApp_Login_Txt_Server;
		String RMAApp_Login_Txt_UserName;
		String RMAApp_Login_Txt_Password;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationTestData.xlsx"); //Excel Workbook RMAAppiumAutomationTestData Is Opened To Fetch Data
		RMAApp_Login_Txt_Server = ExcelData.RMA_ExcelStringDataRead_Utility("TC_001", 1, 0); //Server Name Fetched From DataSheet TC_001
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("TC_001", 1, 1); //UserName Fetched From DataSheet TC_001
		RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("TC_001", 1, 2); //Password Fetched From DataSheet TC_001
		//Data Fetched From Excel Data Sheet TC_001
		
		StrScreenShotTCName = "RMA_TC_001";
		//Variable Initialization Completed
		
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_ServerName(), "ServerName TextBox On RMA Mobile App Login Screen",RMAApp_Login_Txt_Server,loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_UserName(), "UserName TextBox On RMA Mobile App Login Screen",RMAApp_Login_Txt_UserName,loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Txt_Password(), "Password TextBox On RMA Mobile App Login Screen",RMAApp_Login_Txt_Password,loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_Login_Btn_Submit(), "Submit Button On RMA Mobile App Login Screen",loggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_Home()));
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_SelectDSN(), "displayed", "Select DSN Button On DSN Selection Screen Of RMA Mobile Application",loggerval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful RMA Mobile App Login", StrScreenShotTCName,loggerval)));
		
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,loggerval);
		}
		
	} catch (Exception |Error e) {

		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		driver.context(NativeContext); //Explicit Switch To Native View At End Of Each TC In Finally Block So That If Control Is Not In Native View It Switches To It, If Control Is Already In Native View Then It Will Remain There Without Any Error. Required To Restore Default Mobile App Conditions
		reports.endTest(logger);
		reports.flush();
	}
}
}



	


