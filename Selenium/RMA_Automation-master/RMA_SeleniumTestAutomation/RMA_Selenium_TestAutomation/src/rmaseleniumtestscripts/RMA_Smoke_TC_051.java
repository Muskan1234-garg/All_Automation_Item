package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_051
//Description    : Successful Policy Creation On Policy Tracking Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-09-30-2016 
//=================================================================================================
public class RMA_Smoke_TC_051 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrPolicyName_RMA_Smoke_TC_051;
	public static String StrPolicyNum_RMA_Smoke_TC_051;
	public static Date PolicyTracking_EffDate_Smoke_TC_051;

@Test 
public void RMA_Smoke_TC_051_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_051";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_051_Policy Creation On Policy Tracking", "Successful Policy Creation On Policy Tracking Is Validated");
		parentlogger.assignAuthor("Renu Verma");
	
		String PolicyTracking_Status;
		Date PolicyTracking_ExpDate;
		String PolicyTracking_PriPolicyState;
		String PolicyTracking_CMCState;
		String PolicyTracking_InsurerLName;
		String PolicyTracking_Insured;
		int PolicyTracking_Premium;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData IS Fetched To Retrieve Data 
		PolicyTracking_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 0); //Policy Status Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_PriPolicyState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 1); //Primary Policy State Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_CMCState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 2); //CMC State Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_InsurerLName =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 3); //Insurer Last Name Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_Insured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 4); // Insured Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_Premium = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_051", 1, 5); // Premium Is Fetched From DataSheet RMA_TC_051	
		PolicyTracking_EffDate_Smoke_TC_051=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());
		PolicyTracking_ExpDate=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(4,10,2));
		
		/*===========================================================New Policy Creation On Policy Tracking Is Started Here=======================================================================================================================================================================================*/
		//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolTrack", "RMA_PolicyTracking_Utility",0)+ " To Create New PolicyTracking");
		testcall1 = true;		
		StrPolicyName_RMA_Smoke_TC_051= RMA_Functionality_Utility.RMA_PolicyTracking_Utility(PolicyTracking_Status,PolicyTracking_EffDate_Smoke_TC_051 ,PolicyTracking_ExpDate,PolicyTracking_Premium, PolicyTracking_PriPolicyState, PolicyTracking_CMCState, PolicyTracking_InsurerLName, PolicyTracking_Insured, "NA","NA","NA",false, logval1);	
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		StrPolicyNum_RMA_Smoke_TC_051=RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver).getAttribute("value");
		parentlogger.log(LogStatus.INFO, "New PolicyTracking With Policy Name::"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName_RMA_Smoke_TC_051, 3)+ " "+ "Is Created");		
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Policy Creation On Policy Tracking Page", StrScreenShotTCName)));
		/*===========================================================New Policy Creation On Policy Tracking Is Completed Here=======================================================================================================================================================================================*/
			
		
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
		
		if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PolicyTracking_Utility" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		StackTraceElement[] TraceElement = e.getStackTrace();
		for (StackTraceElement ObjectName : TraceElement)
		{
			if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
			{
				FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
				break;
			}
		}
		
		throw (e);
	}
}


@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{ 
	try {
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
		}
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	
	finally
	{
		driver.switchTo().parentFrame();
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
