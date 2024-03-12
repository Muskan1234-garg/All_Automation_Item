package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_002
//Description    : Successful DSN Selection Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-06-2015 
//=================================================================================================
public class RMA_TC_002 extends rmaseleniumtestscripts.RMA_TC_BaseTest
{
static String ExceptionRecorded;
static String []ErrorMessage;
static String FinalErrorMessage;
static String ErrorMessageType;
static String StrScreenShotTCName;

@Test
public void RMAApp_DSNSelection() throws Exception, Error
{
	try {
		logger = reports.startTest("TC_002_RiskMaster DSN Selection", "Required DSN Is Selected And DataSource Label On the Default View Page Is Verified");
		String RMAApp_DSNSelect_Lst_DataSourceName;
		String StrDataSourceLabelActual;
		//Local Variable Declaration
				
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver), RMAApp_DSNSelect_Lst_DataSourceName, "Data Source Name List Box", "RISKMASTER Database and View Selection Page",1); //Sleep Statement Is Introduced To Handle The Delay That IE Browser Takes To Click On Continue Button Though Implicit Wait Is There But Sleep Introduction Makes The UI Movement More Clear		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Btn_Continue(driver), "Continue Button On RISKMASTER Database and View Selection Page",1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Continue Button Is Clicked And RMA Application Default View Page Is Loaded");
		StrDataSourceLabelActual = RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Lbl_DataSource(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_DSNSelect_Lst_DataSourceName, StrDataSourceLabelActual, "Correct DSN Selection",1);
		
	} catch (Exception |Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not Handled Exception And Print Log Of It
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
		StrScreenShotTCName = "TC_002";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);
	} catch (Exception |Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}
