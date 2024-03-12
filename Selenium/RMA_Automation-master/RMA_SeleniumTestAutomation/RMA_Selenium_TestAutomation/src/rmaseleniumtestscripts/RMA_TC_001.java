package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_001
//Description    : Successful Login To The Application Is Verified
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-01-2015
//=================================================================================================
public class RMA_TC_001 extends rmaseleniumtestscripts.RMA_TC_BaseTest{	
static String ExceptionRecorded;
static String []ErrorMessage;
static String FinalErrorMessage;
static String ErrorMessageType;
static String StrScreenShotTCName;

@Test
public void RMAApp_login() throws Exception,Error
{
try{
	
	logger = reports.startTest("TC_001_RiskMaster Title Verification", "Application Is Logged And Title Is Verfied");
	String RMAApp_Login_Txt_UserName;
	String RMAApp_Login_Txt_Password;
	String StrRMAApplicationExpectedTitle;
	String StrRMAApplicationActualTitle;
	//Local Variable Declaration

	StrRMAApplicationExpectedTitle = "RISKMASTER Database and View Selection";		
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
	RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
				
	logger.log(LogStatus.INFO, "Rismaster Application URL Is Provided And Application Is Started");
	RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver).sendKeys(RMAApp_Login_Txt_UserName); //Enter UserName In UserName TextBox Of RMA Application Login Page	
	RMAApp_Login_Txt_UserName = color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName, 3);
	String ObjectName = color.RMA_ChangeColor_Utility("UserName TextBox", 4);
	logger.log(LogStatus.INFO, "UserName Provided In" + " " + ObjectName + " " +"On RMA Application Login Page Is" + " "+ "::" + " " +  RMAApp_Login_Txt_UserName.toUpperCase());		
	
	RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver).sendKeys(RMAApp_Login_Txt_Password); //Enter PassWord In PassWord TextBox Of RMA Application Login Page
	RMAApp_Login_Txt_Password = color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_Password, 3);
    ObjectName = color.RMA_ChangeColor_Utility("Password TextBox", 4);
	logger.log(LogStatus.INFO, "Password Provided In" + " " + ObjectName + " " + "On RMA Application Login Page Is" + " " + "::"+ " "+  RMAApp_Login_Txt_Password);// Changes done by Renu As password is case sensitive
				
	RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver).click(); // Click On The Login Button On RMA Application Login Page
	ObjectName = color.RMA_ChangeColor_Utility("Login Button", 4);
	logger.log(LogStatus.INFO, ObjectName + " " + "Is Clicked On RMA Application Login Page");
	
	Thread.sleep(5000);
	StrRMAApplicationActualTitle =  driver.getTitle();  //Derive The Title Of The RMA Application Login Page
	RMA_Verification_Utility.RMA_TextCompare(StrRMAApplicationExpectedTitle, StrRMAApplicationActualTitle, "RiskMaster Title",1);
	
	
	}catch(Exception|Error e){
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not handled Exception And Print Log Of It
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
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		String TestCaseName;
		StrScreenShotTCName = "TC_001";
		
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);	
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}
