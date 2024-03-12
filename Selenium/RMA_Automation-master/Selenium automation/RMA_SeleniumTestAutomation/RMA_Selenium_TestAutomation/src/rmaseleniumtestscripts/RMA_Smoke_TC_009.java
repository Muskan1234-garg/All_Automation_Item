package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//Default Package Import Completed
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_009
//Description    : Successful Reserve Creation Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-05-2016 
//=================================================================================================
public class RMA_Smoke_TC_009 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_009_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_009";
	
	
	try {
		parentlogger = reports.startTest("RMA_Smoke_TC_009_Reserve Creation", "New Reserve Creation For Created Claim Is Validated");
		int RMAApp_ReserveCreation_Txt_ReserveAmount;
		String RMAApp_ReserveCreation_Lst_ReserveType;
		String RMAApp_ReserveCreation_Lst_Status;
		String RMAApp_ReserveCreation_Lst_ExpStatus;
		int RMAApp_ReserveGrid_Cell_Balance;
		int RMAApp_ReserveGrid_Cell_Paid;
		int RMAApp_ReserveGrid_Cell_Incured;
		int RMAApp_ReserveGrid_Cell_Collection;
		
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveCreation_Lst_ExpStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 3); // Expected Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveGrid_Cell_Balance = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 4); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveGrid_Cell_Paid = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 5); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveGrid_Cell_Incured = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 6); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
		RMAApp_ReserveGrid_Cell_Collection = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 7); // Expected Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_009
		
		
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
		/*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveAdditionModified","RMA_ReserveAdditionModified_Utility",0)+" Is Called To Create A Reserve ");
		testcall1 = true;
		RMA_Functionality_Utility.RMA_ReserveAdditionModified_Utility(RMAApp_ReserveCreation_Txt_ReserveAmount, RMAApp_ReserveCreation_Lst_Status, RMAApp_ReserveCreation_Lst_ReserveType, "No", RMAApp_ReserveCreation_Lst_ExpStatus, RMAApp_ReserveGrid_Cell_Balance, RMAApp_ReserveGrid_Cell_Incured,  RMAApp_ReserveGrid_Cell_Paid,RMAApp_ReserveGrid_Cell_Collection, StrClaimNumber_002, logval1);
		parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(RMAApp_ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_ReserveCreation_Txt_ReserveAmount), 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Creation Of New Reserve Is Successful", StrScreenShotTCName)));
		/*===========================================================New Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/
	
	} catch (Exception|Error e) {
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
		
		if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ReserveAdditionModified_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
