package rma_appiumutilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;

//import java.io.File;

//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;

//
//import javax.imageio.ImageIO;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import atu.testrecorder.ATUTestRecorder;
//Default Package Import Completed

public class RMA_ScreenCapture_Utility extends rma_appiumtestcases.BaseTest{
	public static ATUTestRecorder recorder;
	public static String DestinationPath; //Destination Path Has been Declared As Global Variable TO Cater Any Future Addition In The Utility

	//============================================================================================
	//FunctionName 		: RMA_ScreenShotCaptureOnFailure_Utility
	//Description  		: To Take Application ScreenShot On Failure And Store It In Desired Path
	//Input Parameter 	: Instance Of The WebDriver Class 'Driver', Name Of The ScreenShot 'ScreenShotName', 'StrScreenShotTCName' Test Case Name To Which Screenshot Belongs
	//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
	// ============================================================================================
	
	public static String RMA_ScreenShotCapture_Utility(String ScreenShotName, String StrScreenShotTCName, int logval) throws Exception, Error
	{	
	//Following Function If Not Used In The After Method Annotation Can Help User To Just Catch The ScreenShot Of The Executed Step And Can Be Used For DeBugging Or Judging Application State
		String RMAApp_FailureScreenShotLocation;
		String dtmCurrentDateInfo;
		String dtmCurrentTimeInfo;
		//Local Variable Declaration

		driver.context(NativeContext); 
		dtmCurrentDateInfo = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
		dtmCurrentTimeInfo = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();

		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationUtilities.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_FailureScreenShotLocation = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 7); //Screenshot Location Fetched From DataSheet RMA_Utilities
		//RMAApp_FailureScreenShotLocation = System.getProperty("user.dir")+RMAApp_FailureScreenShotLocation;
		try {
						TakesScreenshot ScreenShotCapture = (TakesScreenshot)driver;
						File FileSource = ScreenShotCapture.getScreenshotAs(OutputType.FILE);
						DestinationPath =RMAApp_FailureScreenShotLocation + StrScreenShotTCName + "_" + ScreenShotName + "_"  + dtmCurrentDateInfo+ "_"+ dtmCurrentTimeInfo + ".jpg";
						File DestinationLocation = new File (DestinationPath);
						FileUtils.copyFile(FileSource, DestinationLocation);

		} catch (Exception|Error e) 
		{
			System.out.println("Exception Occurred While Taking ScreenShot On Failure" + e.getMessage()); //Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
			throw(e);
		}
		return DestinationPath;
	}
		
		
//============================================================================================
//FunctionName 		: RMA_ATURecorder
//Description  		: Enables Video Capture For The Test/Test Suite Under Execution
//Input Parameter 	: String RMAApp_ExtentReportsHtmlName Stores The Suite Name, String dtmCurrentDateInfo, dtmCurrentTimeInfo  Stores The Current Date And Time Info
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
public static void RMA_ATURecorderStart(String RMAApp_SuiteName, String dtmCurrentDateInfo, String dtmCurrentTimeInfo) throws Exception, Error
	{
		try {
			recorder = new ATUTestRecorder(System.getProperty("user.dir")+"\\RMAAppiumTestEvidence\\RMAAppiumVideoCapture", RMAApp_SuiteName + "_" +dtmCurrentDateInfo + "_"+dtmCurrentTimeInfo , false);
			recorder.start(); //Recording Is Started
		} catch (Exception|Error e) {
			throw (e);
		}

	}

//============================================================================================
//FunctionName 		: RMA_ATURecorder
//Description  		: Stops Video Capture For The Test/Test Suite Under Execution
//Input Parameter 	: None
//Revision			: 0.0 - KumudNaithani-01-03-2017                                
//============================================================================================
public static void RMA_ATURecorderStop() throws Exception, Error
{
	try {
		recorder.stop(); //Recording Is Stopped
			} catch (Exception|Error e) {
				throw (e);
			}

		}
}
