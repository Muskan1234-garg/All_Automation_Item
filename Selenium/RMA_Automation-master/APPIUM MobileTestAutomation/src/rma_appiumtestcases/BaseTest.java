package rma_appiumtestcases;

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
//Default Package Import Completed

import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_ScreenCapture_Utility;
import rma_appiumutilities.RMA_AppiumEssentials_Utility;
//RMA Package Import Completed

public class BaseTest {
	public static String RMAApp_OSName;
	public static String RMAApp_AutomationName;
	public static String RMAApp_PlatformName;
	public static int RMAApp_PlatformVersion;
	public static String RMAApp_APKFileName;
	public static String RMAApp_DeviceName;
	public static DesiredCapabilities capabilities;
	public static AndroidDriver<?> driver;
	public static WebDriverWait globalWait;
	public static String RMAApp_SuiteName;
	public static String dtmCurrentDateInfo;
	public static String dtmCurrentTimeInfo;
	public static String ExceptionRecorded;
	public static String []ErrorMessage;
	public static String FinalErrorMessage;
	public static String ErrorMessageType;
	public static int IntRowNumber;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static ExtentTest parentlogger;
	public static int prntloggerval = 0;
	public static int loggerval = 1;
	public static String StrScreenShotTCName;
	public static String NativeContext;
	public static boolean testcall1;
	public static boolean testcall2;
	public static boolean testcall3;
	public static boolean testcall4;
	public static String loggerval1;
	public static String loggerval2;
	public static String loggerval3;
	public static String loggerval4;
	public static RMA_GenericUsages_Utility color;
	
	//public static AppiumDriverLocalService appiumService;
	
	@BeforeSuite
	@Parameters({"ExecutedSuiteName"})
	public void InitialSetUp(String ExecutedSuiteName)throws Exception,Error{
	try {
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMAAppiumAutomationUtilities.xlsx"); //Excel WorkBook RMAAppiumAutomationUtilities IS Fetched To Retrieve Data 
		RMAApp_OSName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 0); //OSName Fetched From DataSheet RMA_Utilities
		RMAApp_AutomationName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 1); //AutomationName Fetched From DataSheet RMA_Utilities
		RMAApp_PlatformName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 2); //PlatformName Fetched From DataSheet RMA_Utilities
		RMAApp_PlatformVersion= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Utilities", 1, 3); //PlatformVersion Fetched From DataSheet RMA_Utilities
		RMAApp_DeviceName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 5); //DeviceName Fetched From DataSheet RMA_Utilities
		RMAApp_APKFileName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 4); //.apk File Name Fetched From DataSheet RMA_Utilities
		//RMAApp_SuiteName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Utilities", 1, 6); //RMAApp_SuiteName Fetched From DataSheet RMA_Utilities
		RMAApp_SuiteName = ExecutedSuiteName;
		//Required Dynamic Parameters Are Fetched From Excel File
		
		IntRowNumber =1;
		StrScreenShotTCName = "RMA MobileApp Test Suite SetUp";
		dtmCurrentDateInfo = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility(); //Current Date Is Fetched
		dtmCurrentTimeInfo = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility(); //Current Time Is Fetched
		RMA_ScreenCapture_Utility.RMA_ATURecorderStart(RMAApp_SuiteName, dtmCurrentDateInfo, dtmCurrentTimeInfo); //Following Function Instantiates The ATU Recorder
		
		reports = RMA_ExtentReports_Utility.RMA_ExtentReportsInstance_Utility(IntRowNumber); //Extent Reports Are Instantiated
		reports.addSystemInfo("Mobile_PlatformName", RMAApp_PlatformName);
		reports.addSystemInfo("Mobile_PlatformVersion", String.valueOf(RMAApp_PlatformVersion));
		reports.addSystemInfo("Mobile_DeviceName", RMAApp_DeviceName);
		logger = reports.startTest("RMA Mobile App Test Suite SetUp Initialized");
		
		capabilities=new DesiredCapabilities();
		//Below Code Instantiates Android Driver In Case Mobile/Emulator OS Is Android
		if (RMAApp_OSName.equalsIgnoreCase("Android"))
		{
		RMA_AppiumEssentials_Utility.RMA_AppiumStop_Utility();//Appium Service Is Stopped If Already Running
		RMA_AppiumEssentials_Utility.RMA_AppiumStart_Utility();//Appium Service Is Started
		
		
		capabilities.setCapability("automationName", RMAApp_AutomationName); //Automation Engine To Use "Appium" or "Selendroid"
		capabilities.setCapability("platformName", RMAApp_PlatformName); //Mobile OS Platform to Use
		capabilities.setCapability("platformVersion",RMAApp_PlatformVersion); //Mobile OS version
		capabilities.setCapability("deviceName",RMAApp_DeviceName); //Kind Of Mobile Device Or Emulator To Use
		capabilities.setCapability("app",System.getProperty("user.dir")+"\\RMAAppiumAPKFiles\\"+RMAApp_APKFileName); //Path Of The .apk File Of The Mobile Application Under Test
		capabilities.setCapability("newCommandTimeout",30);
		capabilities.setCapability("noReset", false);
		
		driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); //New Instance Of AndroidDriver Class Is Instantiated
		logger.log(LogStatus.INFO, "Appium Server Is Started");
		NativeContext = driver.getContext();
		}
		else if (RMAApp_OSName.equalsIgnoreCase("iOS"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		globalWait = new WebDriverWait(driver, 10);
		color = new RMA_GenericUsages_Utility();
		logger.log(LogStatus.INFO, "RMA Mobile Application Is Launched And Execution Of Test Suite:" + " " + RMAApp_SuiteName.toUpperCase() + " " + "Is Started");
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful RMA Mobile Application Launch", StrScreenShotTCName,loggerval)));
		
		
	} catch (Exception|Error e) {
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
				FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In Following Package:"+" "+ObjectName.toString(); 
				break;
			}
		}
		logger.log(LogStatus.FATAL, "Following Error Occurred In The Before Suite Block Of Suite" + " "+ RMAApp_SuiteName.toUpperCase()+ " "+ FinalErrorMessage );
	}
	finally
	{
		reports.endTest(logger);
	}
	} 
	
	
	@AfterSuite
	public void ExitSetUp() throws Exception,Error{
	try{
		
		logger = reports.startTest("RMA Mobile App Test Suite SetUp Cleaned");
		StrScreenShotTCName = "RMA MobileApp Test Suite SetUp Cleaned";
		driver.context(NativeContext);
	
		if (RMAApp_OSName.equalsIgnoreCase("Android"))
		{
			//RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
		}
		
		else if (RMAApp_OSName.equalsIgnoreCase("iOS")){
			
		}
		logger.log(LogStatus.INFO, "Execution Of Test Suite:" + " " + RMAApp_SuiteName.toUpperCase() + " " + "Is Completed");
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful RMA Mobile App Test Suite Exit", StrScreenShotTCName,loggerval)));
		
	} catch (Exception|Error e) {
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
		logger.log(LogStatus.FATAL, "Following Error Occurred In The After Suite Block Of Suite" + " "+ RMAApp_SuiteName.toUpperCase()+ " "+ FinalErrorMessage );
	}
	finally
	{
		reports.endTest(logger);
		reports.flush();
		reports.close();
		//driver.closeApp();
		//driver.quit();
		RMA_AppiumEssentials_Utility.RMA_AppiumStop_Utility(); //Appium Service Is Stopped
		RMA_ScreenCapture_Utility.RMA_ATURecorderStop();
		
	}
	} 
}
	
	
