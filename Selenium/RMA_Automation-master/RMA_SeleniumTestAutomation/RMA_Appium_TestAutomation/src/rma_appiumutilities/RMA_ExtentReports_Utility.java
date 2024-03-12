package rma_appiumutilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
//Default Package Import Completed

public class RMA_ExtentReports_Utility extends rma_appiumtestcases.BaseTest 
//============================================================================================
//FunctionName 		: RMA_ExtentReportsInstance_Utility
//Description  		: To Generate Test Case Execution Report Using Extent Report Reporting FrameWork And Store It In Desired Path
//Input Parameter 	: IntRowNumber Of The Type Integer
//Revision			: 0.0 - KumudNaithani-01-03-2017                                 
//============================================================================================
{
	public static ATUTestRecorder recorder;
	public static ExtentReports extent;
	public static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static ExtentReports RMA_ExtentReportsInstance_Utility(int IntRowNumber) throws Exception, Error
	{
		try {
			String RMAApp_ExtentReportsLocation;
			String dtmCurrentTimeInfo;
			String dtmCurrentDateInfo;

			dtmCurrentDateInfo = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			dtmCurrentTimeInfo = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationUtilities.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_ExtentReportsLocation = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities",IntRowNumber,8) +  RMAApp_OSName + "_"+ RMAApp_SuiteName + "_"+ dtmCurrentDateInfo + "_" + dtmCurrentTimeInfo +  ".html"; //ExtentReport Location Fetched From DataSheet RMA_Utilities
			RMAApp_ExtentReportsLocation = System.getProperty("user.dir")+RMAApp_ExtentReportsLocation;
			extent = new ExtentReports (RMAApp_ExtentReportsLocation, true);
			//extent.config().documentTitle(RMAApp_ExtentReportsTitle).reportName(RMAApp_ExtentReportsName).reportHeadline(RMAApp_ExtentReportsHeadLine);
		} catch (Exception|Error e) {
			//throw (e);
		}
		return extent;	
	}

//============================================================================================
//FunctionName 		: RMA_ExtentFailureReport
//Description  		: To Write Failure Step Logs In The Generated Suite Extent Report
//Input Parameter 	: String FinalErrorMessage Stores The Error Message, String TestCaseName Stores The Name Of The Test Case Function, StrScreenShotTCName Stores The Name Of The TestCase
//Revision			: 0.0 - KumudNaithani-01-03-2017                                  
//============================================================================================
public static void RMA_ExtentFailureReport(String FinalErrorMessage, String TestCaseName, String StrScreenShotTCName,int logval)throws Exception, Error
{
	try {
		//RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(logval);
		driver.context(NativeContext);
		if (logval ==0){
			parentlogger.log(LogStatus.FAIL,"HTML", "Following Error Occurred  :::  <span style='color:red'>" + FinalErrorMessage+ "</script></span>" +"While Executing Test Case" +" "+ StrScreenShotTCName + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility( TestCaseName, StrScreenShotTCName, logval)));
		}
		else
		{
			logger.log(LogStatus.FAIL,"HTML", "Following Error Occurred  :::  <span style='color:red'>" + FinalErrorMessage+ "</script></span>" +"While Executing Test Case" +" "+ StrScreenShotTCName + " " +  "And Hence The Test Case Is A Fail");
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(TestCaseName, StrScreenShotTCName, logval)));
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
		
	}

}
}
