package rmaseleniumtestscripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_BaseTest
//Description    : Successful Suite Configuration Is Verified
//Revision       : 0.0 - KumudNaithani-10-30-2015
//=================================================================================================
public class RMA_TC_BaseTest {
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static ExtentTest parentlogger;
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	public static RMA_GenericUsages_Utility color;
	public static String RMAApp_ExtentReportsHtmlName;
	public static String loggerval2;
	public static String loggerval1;
	public static String loggerval3;
	public static String loggerval4;
	public static String loggerval5;
	public static String loggerval6;
	public static String loggerval7;
	public static String loggerval8;
	public static String loggerval9;
	public static String loggerval10;
	public static String loggerval11;
	public static String loggerval12;
	public static String loggerval13;
	public static String loggerval14;
	public static String loggerval15;
	public static String loggerval16;
	public static Boolean testcall1; 
	public static Boolean testcall2; 
	public static Boolean testcall3;
	public static Boolean testcall4;
	public static Boolean testcall5;
	public static Boolean testcall6;
	public static Boolean testcall7;
	public static Boolean testcall8;
	public static Boolean testcall9;
	public static Boolean testcall10;
	public static Boolean testcall11;
	public static Boolean testcall12;
	public static Boolean testcall13;
	public static Boolean testcall14;
	public static Boolean testcall15;
	public static Boolean testcall16;
	public static String StrClaimNumber_002;
	public static String StrClaimNumber_335;
	public static String StrPolicyName_335;
	public static String StrDriverLastName;
	public static WebDriverWait globalWait;
	public static int DSRow;
	public static String RMAApp_BrowserName; 
	public static int logval = 0;
	public static int logval1 = 1;
	public static String ParentFrame = "cphMainBody_uwtPortal_frame0"; 
	public static String StrRMAWindowHandle;
	public static String StrClaimNumber_292;
	public static String PhysicalPath = System.getProperty("user.dir")+"\\RMATestInputFile\\UploadTestFile\\RightClick.txt";
	public static String FileSize = "0.0393 MB";
	
	@BeforeSuite
	@Parameters({"DataSourceRow","ExecutedSuiteName"})// To Initialize the Row of the DataSourceName value come from the XML sheet
	public void SetUp(int DataSourceRow, String ExecutedSuiteName)
	{
		try {
			int IntRowNumber;
			String dtmCurrentDateInfo;
			String dtmCurrentTimeInfo;
			//Local Variable Declaration
			
			IntRowNumber = 1;
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationUtilities.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			//RMAApp_ExtentReportsHtmlName = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber,5); //Test Suite Name Is Fetched From The Excel Sheet RMA_Utilities
			RMAApp_ExtentReportsHtmlName = ExecutedSuiteName;
			RMAApp_BrowserName = ExcelData.RMA_ExcelDataRead_Utility(0,IntRowNumber,6); //Browser Name Is Fetched From The Excel Sheet RMA_Utilities
		
			if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
			{
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				capabilities.setCapability("requireWindowFocus", true);
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\RMASeleniumWebDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(); // Driver Instance Creation			
			}
	
			else if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\RMASeleniumWebDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}			
			reports = RMA_ExtentReports_Utility.RMA_ExtentReportsInstance_Utility(IntRowNumber); //Extent Reports Are Instantiated
			dtmCurrentDateInfo = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility(); //Current Date Is Fetched
			dtmCurrentTimeInfo = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility(); //Current Time Is Fetched
			RMA_ExtentReports_Utility.RMA_ATURecorderStart(RMAApp_ExtentReportsHtmlName, dtmCurrentDateInfo, dtmCurrentTimeInfo); //Following Function Instantiates The ATU Recorder
			
			DSRow=DataSourceRow;// put value into the global variable
			
			color = new RMA_GenericUsages_Utility();			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit Wait Added For The Page To Load Successfully
			logger = reports.startTest("RMA Application Test Suite SetUp");		
			//driver.navigate().to("https://cscappche811v.asiapac.globalcsc.net/RiskmasterUI/UI/Home/Login.aspx/"); //Navigation To The RMA Application Login Page
			driver.navigate().to("https://ec2-52-41-122-195.us-west-2.compute.amazonaws.com/RiskmasterUI/UI/Home/Login.aspx"); //Navigation To The RMA Application Login Page
			logger.log(LogStatus.INFO, "RMA Application Is Launched");
		
			driver.manage().window().maximize(); //Maximizing The RMA Application Login Page
			globalWait = new WebDriverWait(driver, 10);
			StrRMAWindowHandle = driver.getWindowHandle();
			System.out.println("Base Handle is :" +StrRMAWindowHandle);
			logger.log(LogStatus.INFO, "RMA Application Window Is Maximized And Execution Of Test Suite:" + " " + RMAApp_ExtentReportsHtmlName.toUpperCase() + " " + "Is Started");
			reports.endTest(logger);
			

		} catch (Exception|Error e) {
			String StrScreenShotTCName = "RMA_TC_BaseTest_BeforeSuite";
			String TestCaseName;
			TestCaseName = "RMA_SetUp_BeforeSuite";
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
			System.out.println("Following Error Occurred In BeforeSuite Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			try {
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
			} catch (Exception|Error e1) {
				System.out.println("Error Occurred While Logging The Extent Report For The Before Suite Code Block And The Error Thrown Back Is:" +" " +" " +e.getMessage() );
			}
			reports.endTest(logger);

		}
	}

	@AfterSuite
	public void ExitSetUp()
	{
		try {
			logger = reports.startTest("RMA Application Test Suite ExitSetUp");
			RMA_ExtentReports_Utility.RMA_ATURecorderStop(); //Stops The Video Capture For The Test/Test Suite In Execution
			logger.log(LogStatus.INFO, "Execution Of Suite::" + " " + RMAApp_ExtentReportsHtmlName + " " +  "Is Completed");
			logger.log(LogStatus.INFO, "Video Recording Is Stopped, Driver Is Closed And Suite Execution Extent Report For Test Suite::" + " " + RMAApp_ExtentReportsHtmlName + " " + "Is Written");
			reports.endTest(logger);
			reports.flush();
			reports.close();
			Set<String> strWindowHandles = driver.getWindowHandles();
			Iterator<String>windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
			while (windowiterator.hasNext())
			{
				String ChildWindow = windowiterator.next();
				System.out.println(ChildWindow);
				driver.switchTo().window(ChildWindow);
				driver.close();
			}
			driver.quit();

		} catch (Exception|Error e) {
			String StrScreenShotTCName = "RMA_TC_BaseTest_AfterSuite";
			String TestCaseName;
			TestCaseName = "RMA_SetUp_AfterSuite";
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
			System.out.println("Following Error Occurred In AfterSuite Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			try {
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
			} catch (Exception|Error e1) {
				System.out.println("Error Occurred While Logging The Extent Report For The After Suite Code Block And The Error Thrown Back Is:" +" " +" " +e.getMessage() );
			}
			reports.endTest(logger);

		}

	}
}