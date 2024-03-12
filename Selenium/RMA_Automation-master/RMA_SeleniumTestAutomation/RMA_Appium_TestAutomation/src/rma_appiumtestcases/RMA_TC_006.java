package rma_appiumtestcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rma_appiumPOM.RMA_Appium_POM_Claims;
import rma_appiumPOM.RMA_Appium_POM_DefaultView;
import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_Input_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_006
//Description    : Successful Mobile Screen Swipe For RMA Mobile Application Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-01-20-2017
//=================================================================================================
public class RMA_TC_006 extends rma_appiumtestcases.BaseTest{	

@Test
public void ScreenShotCapture() throws Exception,Error
{
	try {
		logger = reports.startTest("TC_006_Successful Mobile Screen Swipe", "Successful Mobile Screen Swipe For RMA Mobile Application Is Validated");
		String RMAApp_Claims_Txt_ClaimSearch;
		Dimension MobileScreenSize;
		int swipstart;
		int swipeend;
		int iterator;
		//Local Variable Declaration Completed
		
		StrScreenShotTCName = "RMA_TC_006";
		//Variable Initialization Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationTestData.xlsx");  
		RMAApp_Claims_Txt_ClaimSearch = ExcelData.RMA_ExcelStringDataRead_Utility("TC_006", 1, 0); //Claim Number Is Fetched From DataSheet TC_006
		RMA_GenericUsages_Utility.RMA_HomeViewUtility(loggerval);
		//RMA Mobile Application Is Reloaded 
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(),"Claims Button On Default View Of RMA Mobile App",loggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Claims.RMAApp_Claims_TextBox_ClaimSearch(), "Search TextBox On Claims View Of RMA Mobile Application", RMAApp_Claims_Txt_ClaimSearch, loggerval);
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMAApp_Claims_Txt_ClaimSearch, "Claims Link On Claims View Of RMA Mobile Application", loggerval);
		// Claim To Which A Note Needs To Be Attached Is Searched 
	
		//=========================================Validation Of Mobile Swipe Functionality For A Claim Is Completed========================================================================================================================================================
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Claims.RMAApp_Claims_Btn_Notes()));
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval); 
		MobileScreenSize = driver.manage().window().getSize(); //Screen Size Is Fetched In A Variable
	
		swipstart = (int) (MobileScreenSize.height * 0.5);
		swipeend = (int) (MobileScreenSize.height * 0.2); 
		 for (iterator = 0; iterator < 10; iterator++) {
			   driver.swipe(0, swipstart, 0, swipeend, 1000);
			    RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility((loggerval));
			   if (driver.findElementsByXPath(".//*[@id='accordion']/div[6]/div[1]/h4/span/a").size() > 0) {
			    	driver.findElementByXPath(".//*[@id='notes']").click();
			    	driver.findElementByXPath(".//*[@id='accordion']/div[6]/div[1]/h4/span/a").click();
			        break;
			    }
			        else
			        {
			        	 RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
			        }
			    }
	//=========================================Validation Of Mobile Swipe Functionality For A Claim Is Completed========================================================================================================================================================
	
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
		reports.endTest(parentlogger);
		reports.flush();
	}
}
}



	


