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
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_002
//Description    : Successful DSN Selection Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-01-04-2017
//=================================================================================================
public class RMA_TC_002 extends rma_appiumtestcases.BaseTest{	

@Test
public void RMAApp_DSNSelection() throws Exception,Error
{
	try {
		logger = reports.startTest("<span id='RMA_TC_002_RiskMaster DSN Selection'>RMA_TC_002_RiskMaster DSN Selection</span>", "Required DSN Is Selected Successfully For RMA Mobile Application");
		String RMAApp_SelectDSN_Lst_DsnName;
		//Local Variable Declaration Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationTestData.xlsx");  //Excel Workbook RMAAppiumAutomationTestData Is Opened To Fetch Data
		RMAApp_SelectDSN_Lst_DsnName = ExcelData.RMA_ExcelStringDataRead_Utility("TC_002", 1, 0); //Server Name Fetched From DataSheet TC_002
		//Data Fetched From Excel Data Sheet TC_002
		
		StrScreenShotTCName = "RMA_TC_002";
		//Variable Initialization Completed
	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Btn_SelectDSN(), "Select DSN Button On RMA Mobile App DSN Selection Scrren",loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Login_DSNSelect.RMAApp_DSNSelect_Lst_SelectDSN(RMAApp_SelectDSN_Lst_DsnName), "To Select Following DataSource" + " " +color.RMA_ChangeColor_Utility(RMAApp_SelectDSN_Lst_DsnName,2)+ " "+ "DSN Selection List Box On RMA Mobile App DSN Selection Screen",loggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Tasks()));
		
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Events(), "displayed", "Events Button On Default View Of RMA Mobile App",loggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(), "displayed", "Claims Button On Default View Of RMA Mobile App",loggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_PinnedItems(), "displayed", "Pinned Items Button On Default View Of RMA Mobile App",loggerval);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Txt_PinnedItemsHere(), "displayed", "Your Pinned Items Will Show Here Text On Default View Of RMA Mobile App",loggerval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful DSN Selection", StrScreenShotTCName,loggerval)));
		
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



	


