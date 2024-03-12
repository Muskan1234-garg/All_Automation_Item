package rma_appiumtestcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rma_appiumPOM.RMA_Appium_POM_Claims;
import rma_appiumPOM.RMA_Appium_POM_DefaultView;
import rma_appiumPOM.RMA_Appium_POM_NewNotes;
import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_Input_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
//RMA Package Import Completed
import rma_appiumutilities.RMA_ScreenCapture_Utility;
import rma_appiumutilities.RMA_Verification_Utility;


//================================================================================================
//TestCaseID     : RMA_TC_008
//Description    : Successful Note Attachment To A Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-01-13-2017
//=================================================================================================
public class RMA_TC_008 extends rma_appiumtestcases.BaseTest{	

@Test
public void NoteCreation() throws Exception,Error
{
	try {
		logger = reports.startTest("TC_008_Successful Note Creation", "Successful Note Creation To A Claim Is Validated");
		String RMAApp_Claims_Txt_ClaimSearch;
		String RMAApp_Claims_Lst_NoteType;
		String Description;
		//Local Variable Declaration Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationTestData.xlsx");  
		RMAApp_Claims_Txt_ClaimSearch = ExcelData.RMA_ExcelStringDataRead_Utility("TC_008", 1, 0); //Claim Number Is Fetched From DataSheet TC_008
		RMAApp_Claims_Lst_NoteType = ExcelData.RMA_ExcelStringDataRead_Utility("TC_008", 1, 1); //Note Type Is Fetched From DataSheet TC_008
		StrScreenShotTCName = "RMA_TC_008";
		//Variable Initialization Completed
		
		RMA_GenericUsages_Utility.RMA_HomeViewUtility(loggerval);
		//RMA Mobile Application Is Reloaded 
		
		//=========================================New Note Creation Attached To A Claim Is Started========================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(),"Claims Button On Default View Of RMA Mobile App",loggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Claims.RMAApp_Claims_TextBox_ClaimSearch(), "Search TextBox On Claims View Of RMA Mobile Application", RMAApp_Claims_Txt_ClaimSearch, loggerval);
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMAApp_Claims_Txt_ClaimSearch, "Claims Link On Claims View Of RMA Mobile Application", loggerval);
		// Claim To Which A Note Needs To Be Attached Is Searched 
	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Claims.RMAApp_Claims_Btn_Notes(),"Notes Button On Claims Page Of RMA Mobile Application",loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewNotes.RMAApp_Notes_Txt_Date(),"Date Button On New Note Dialog Of RMA Mobile Application",loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewNotes.RMAApp_Notes_Txt_Date(),"Date Button On New Note Dialog Of RMA Mobile Application",loggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewNotes.RMAApp_Notes_Btn_Set(),"Set Button On New Note Dialog's DateSelector Of RMA Mobile Application",loggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		Description =  RMA_GenericUsages_Utility.RMA_Random_StringGeneration_Utility(3, "Description_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_NewNotes.RMAApp_Notes_Txt_Description(), "Description TextBox On New Note Dialog Of RMA Mobile Application", Description, loggerval);
		//Description and Date For The Note Is Set
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Appium_POM_NewNotes.RMAApp_Notes_Lst_NoteType(), RMAApp_Claims_Lst_NoteType, "Note Type List Box", "New Note Dialog Of RMA Mobile Application", loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewNotes.RMAApp_Notes_Btn_Submit(),"Submit Button On New Note Dialog Of RMA Mobile Application",loggerval);
		//Note Type Is Set And Submit Button Is Clicked
		//=========================================New Note Creation Attached To A Claim Is Completed========================================================================================================================================================	
		//=========================================Created Note Verification Attached To A Claim Is Started========================================================================================================================================================
		
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_Claims.RMAApp_Claims_Msg_ToastMessage(5)));
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Claims.RMAApp_Claims_Msg_ToastMessage(5), "displayed", "Toast Message On Successful Notes Addition On Claims Page Of RMA Mobile Application",loggerval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful Note Creation Attached To A Claim", StrScreenShotTCName,loggerval)));
		//=========================================Created Note Verification Attached To A Claim Is Completed========================================================================================================================================================
		
	
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



	


