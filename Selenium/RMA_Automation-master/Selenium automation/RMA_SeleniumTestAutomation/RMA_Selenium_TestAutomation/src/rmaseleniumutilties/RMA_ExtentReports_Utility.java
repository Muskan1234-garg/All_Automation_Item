package rmaseleniumutilties;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import atu.testrecorder.ATUTestRecorder;
//Default Package Import Completed

public class RMA_ExtentReports_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest
//============================================================================================
//FunctionName 		: RMA_ExtentReportsInstance_Utility
//Description  		: To Generate Test Case Execution Report Using Extent Report Reporting FrameWork And Store It In Desired Path
//Input Parameter 	: IntRowNumber Of The Type Integer
//Revision			: 0.0 - KumudNaithani-10-16-2015          
//Modify By		: 0.1 -RenuVerma-02-03-2017 //As Suite Name given by XML Files through Parameterization
//============================================================================================
{
	public static ATUTestRecorder recorder;
	static ExtentReports extent;
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static ExtentReports RMA_ExtentReportsInstance_Utility(int IntRowNumber) throws Exception, Error
	{
		//ExtentReports extent;
		try {
			String RMAApp_ExtentReportsLocation;
			String RMAApp_ExtentReportsTitle;
			String RMAApp_ExtentReportsName;
			String RMAApp_ExtentReportsHeadLine;
			//String RMAApp_ExtentReportsHtmlName;
			String dtmCurrentTimeInfo;
			String dtmCurrentDateInfo;

			dtmCurrentDateInfo = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			dtmCurrentTimeInfo = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationUtilities.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			//RMAApp_ExtentReportsHtmlName = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber,5); //ExtentReportHTMLName Fetched From DataSheet RMA_Utilities//Changes done by Renu As Suite Name given by XML FIles

			RMAApp_ExtentReportsLocation = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber,1) +  RMAApp_BrowserName + "_"+ RMAApp_ExtentReportsHtmlName + "_"+ dtmCurrentDateInfo + "_" + dtmCurrentTimeInfo +  ".html"; //ExtentReport Location Fetched From DataSheet RMA_Utilities
			RMAApp_ExtentReportsLocation = System.getProperty("user.dir")+RMAApp_ExtentReportsLocation;
			RMAApp_ExtentReportsTitle = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber, 2); //ExtentReport Title Fetched From DataSheet RMA_Utilities
			RMAApp_ExtentReportsName = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber, 3); //ExtentReport Name Fetched From DataSheet RMA_Utilities
			//RMAApp_ExtentReportsHeadLine = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber, 4); //ExtentReport HeadLine Fetched From DataSheet RMA_Utilities
			//RMAApp_ExtentReportsHtmlName = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber, 5); //ExtentReportHTMLName Fetched From DataSheet RMA_Utilities
			RMAApp_ExtentReportsHeadLine =RMAApp_ExtentReportsHtmlName; //Changes done by Renu As Suite Name given by XML FIles
			
			extent = new ExtentReports (RMAApp_ExtentReportsLocation, true);
			extent.config().documentTitle(RMAApp_ExtentReportsTitle).reportName(RMAApp_ExtentReportsName).reportHeadline(RMAApp_ExtentReportsHeadLine);
		} catch (Exception|Error e) {
			throw (e);
		}
		return extent;	
	}

	//============================================================================================
	//FunctionName 		: RMA_ExtentFailureReport
	//Description  		: To Write Failure Step Logs In The Generated Suite Extent Report
	//Input Parameter 	: String FinalErrorMessage Stores The Error Message, String TestCaseName Stores The Name Of The Test Case Function, StrScreenShotTCName Stores The Name Of The TestCase
	//Revision			: 0.0 - KumudNaithani-10-16-2015                                 
	//============================================================================================
	public static void RMA_ExtentFailureReport(String FinalErrorMessage, String TestCaseName, String StrScreenShotTCName,int logval)throws Exception, Error
	{
		try {

			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,"HTML", "Following Error Occurred  :::  <span style='color:red'>" + FinalErrorMessage+ "</script></span>" +"While Executing Test Case" +" "+ StrScreenShotTCName + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, TestCaseName, StrScreenShotTCName)));
			}
			else
			{
				logger.log(LogStatus.FAIL,"HTML", "Following Error Occurred  :::  <span style='color:red'>" + FinalErrorMessage+ "</script></span>" +"While Executing Test Case" +" "+ StrScreenShotTCName + " " +  "And Hence The Test Case Is A Fail");
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, TestCaseName, StrScreenShotTCName)));
			}



		} catch (Exception|Error e) {
			if (logval ==0){
				parentlogger.log(LogStatus.FAIL,"Error Occurred While Logging Failure Report Due To Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Error Occurred While Logging Failure Report Due To Reason" + " " + color.RMA_ChangeColor_Utility(e.getMessage(), 1));
			}
			throw (e);
		}
		finally
		{
			RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
		}
	
	}

	//============================================================================================
	//FunctionName 		: RMA_ATURecorder
	//Description  		: Enables Video Capture For The Test/Test Suite Under Execution
	//Input Parameter 	: String RMAApp_ExtentReportsHtmlName Stores The Suite Name, String dtmCurrentDateInfo, dtmCurrentTimeInfo  Stores The Current Date And Time Info
	//Revision			: 0.0 - KumudNaithani-03-12-2015                                 
	//============================================================================================
	public static void RMA_ATURecorderStart(String RMAApp_ExtentReportsHtmlName, String dtmCurrentDateInfo, String dtmCurrentTimeInfo) throws Exception, Error
	{
		try {
			recorder = new ATUTestRecorder(System.getProperty("user.dir")+"\\RMASeleniumTestEvidence\\RMASeleniumVideoCapture", "TestVideo_"+ RMAApp_ExtentReportsHtmlName + "_" +dtmCurrentDateInfo + "_"+dtmCurrentTimeInfo , false);
			recorder.start(); //Recording Is Started
		} catch (Exception|Error e) {
			throw (e);
		}

	}

	//============================================================================================
	//FunctionName 		: RMA_ATURecorder
	//Description  		: Stops Video Capture For The Test/Test Suite Under Execution
	//Input Parameter 	: None
	//Revision			: 0.0 - KumudNaithani-03-12-2015                                 
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
