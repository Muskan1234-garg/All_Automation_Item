package rma_appiumtestcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidKeyCode;
//Default Package Import Completed

import rma_appiumPOM.RMA_Appium_POM_AttachPicture;
import rma_appiumPOM.RMA_Appium_POM_Claims;
import rma_appiumPOM.RMA_Appium_POM_DefaultView;
import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_Input_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
import rma_appiumutilities.RMA_ScreenCapture_Utility;
import rma_appiumutilities.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_007
//Description    : Successful ScreenShotCapture For A Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-01-16-2017
//=================================================================================================
public class RMA_TC_007 extends rma_appiumtestcases.BaseTest{	

@Test
public void ScreenShotCapture() throws Exception,Error
{
	try {
		logger = reports.startTest("TC_007_Successful ScreenShotCapture", "Successful ScreenShotCapture For A Claim Is Validated");
		String RMAApp_Claims_Txt_ClaimSearch;
		String Title;
		String Notes;
		String Subject;
		//Local Variable Declaration Completed
		
		StrScreenShotTCName = "RMA_TC_007";
		//Variable Initialization Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationTestData.xlsx");  
		RMAApp_Claims_Txt_ClaimSearch = ExcelData.RMA_ExcelStringDataRead_Utility("TC_007", 1, 0); //Claim Number Is Fetched From DataSheet TC_007
		RMA_GenericUsages_Utility.RMA_HomeViewUtility(loggerval);
		//RMA Mobile Application Is Reloaded 
		
		//=========================================ScreenShotCapture Attached To A Claim Is Started========================================================================================================================================================
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Claims(),"Claims Button On Default View Of RMA Mobile App",loggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_Claims.RMAApp_Claims_TextBox_ClaimSearch(), "Search TextBox On Claims View Of RMA Mobile Application", RMAApp_Claims_Txt_ClaimSearch, loggerval);
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMAApp_Claims_Txt_ClaimSearch, "Claims Link On Claims View Of RMA Mobile Application", loggerval);
		// Claim To Which A Note Needs To Be Attached Is Searched 
	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Claims.RMAApp_Claims_Btn_Camera(),"Camera Button On Claims Page Of RMA Mobile Application",loggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Appium_POM_Claims.RMAApp_Claims_Btn_CameraCancel()));
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_Claims.RMAApp_Claims_Btn_CameraDone(), "displayed", "Done Button Of Camera Screen On Claims Page Of RMA Mobile Application",loggerval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful Screenshot Capture Attached To A Claim", StrScreenShotTCName,loggerval)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_Claims.RMAApp_Claims_Btn_CameraDone(),"Done Button Of Camera Screen On Claims Page Of RMA Mobile Application",loggerval);
		
		//=========================================ScreenShotCapture Attached To A Claim Is Completed========================================================================================================================================================
		//=========================================Attaching Picture To A Claim Is Started====================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		Title =  RMA_GenericUsages_Utility.RMA_Random_StringGeneration_Utility(3, "Title_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_TextBox_Title(), "Title TextBox On Attach Picture Window Of RMA Mobile Application",Title,loggerval);
		Notes =  RMA_GenericUsages_Utility.RMA_Random_StringGeneration_Utility(3, "Notes_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_TextBox_Notes(), "Notes TextBox On Attach Picture Window Of RMA Mobile Application",Notes,loggerval);
		Subject =  RMA_GenericUsages_Utility.RMA_Random_StringGeneration_Utility(3, "Subject_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_TextBox_Subject(), "Subject TextBox On Attach Picture Window Of RMA Mobile Application",Subject,loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_Lbl_AttachPicture(),"Attach Picture Label On Attach Picture Window Of RMA Mobile Application",loggerval);
		//driver.findElementByXPath(".//*[@id='myCamera']/div/div/div[1]").click();
		RMA_GenericUsages_Utility.RMA_StaticWait(5, loggerval, "Upload Button Is Visible On The Screen");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_Btn_Upload(),"Upload Button On Attach Picture Window Of RMA Mobile Application",loggerval);
		
		//=========================================Attaching Picture To A Claim Is Completed==========================================================================================================================================================================
		//=========================================Verification That Picture Is Attached To A Claim Is Started========================================================================================================================================================
		
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_TstMsg_UploadedSuccessfully()));
		RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Appium_POM_AttachPicture.RMAApp_AttachPicture_TstMsg_UploadedSuccessfully(), "displayed", "Successful Image Upload Toast Message On Claims Page Of RMA Mobile Application",loggerval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful Image Attachment On Claims Page Of RMA Mobile Application", StrScreenShotTCName,loggerval)));
		//=========================================Verification That Picture Is Attached To A Claim Is Completed========================================================================================================================================================
	
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



	


