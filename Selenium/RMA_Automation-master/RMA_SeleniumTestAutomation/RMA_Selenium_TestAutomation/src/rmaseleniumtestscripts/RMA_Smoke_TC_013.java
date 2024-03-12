package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_TransactionHistory;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed


//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_013
//Description    : Transaction History Displays All The Transactions Are Validated
//Depends On TC  : RMA_Smoke_TC_002,RMA_Smoke_TC_009, RMA_Smoke_TC_011, RMA_Smoke_TC_012
//Revision       : 0.0 - KumudNaithani-07-15-2016 
//Modify By	:0.1 - RenuVerma-02-02-2017 // Modify As Reserve Grid Value is Modify when runs with full suite as value reserve grid value is 
//=================================================================================================
public class RMA_Smoke_TC_013 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_013_Test() throws Exception, Error
{
	String SplitAmount;
	String TransactionType;
	String StrStatus;
	int RMAApp_ReserveGrid_Cell_Balance;
	int RMAApp_ReserveGrid_Cell_Paid;
	int RMAApp_ReserveGrid_Cell_Incured;
	int RMAApp_ReserveGrid_Cell_Collection;
	String StrExpected_ReserveTable_BalanceAmount;
	String StrExpected_ReserveTable_PaidAmount;
	String StrExpected_ReserveTable_CollectionAmount;
	String StrExpected_ReserveTable_IncurredAmount;
	String RMAApp_ReserveCreation_Lst_ReserveType;
	//int Expected_ReserveTable_TotalPaidAmount;
	//int Expected_ReserveTable_TotalCollectionAmount;
	//int Expected_ReserveTable_TotalBalanceAmount;
	
	try {
		
		SplitAmount = "$150.00";
		TransactionType = "Payment";
		StrStatus = "Printed";
		StrScreenShotTCName = "Smoke_TC_013";
		parentlogger = reports.startTest("RMA_Smoke_TC_013_Correct Values In Transaction History", "Transaction History Displays All The Transactions Related Data Is Validated");	
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_ReserveGrid_Cell_Balance = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_013", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_013
		RMAApp_ReserveGrid_Cell_Paid = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_013", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_013
		RMAApp_ReserveGrid_Cell_Incured = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_013", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_013
		RMAApp_ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_013", 1, 3); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_013
		RMAApp_ReserveGrid_Cell_Collection = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_013", 1, 4); // Expected Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_013
		
		// Default value of RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_32 and RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_36 is '0' when both test-cases are not executed
		//Expected_ReserveTable_TotalPaidAmount=RMAApp_ReserveGrid_Cell_Paid+RMA_Smoke_TC_032.RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_32;// Paid is added in value RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_32 in case its runs with full suite as value reserve grid value is edited while running suite RMA_Smoke_TC_032 and RMA_Smoke_TC_036
		//Expected_ReserveTable_TotalCollectionAmount=RMAApp_ReserveGrid_Cell_Collection+RMA_Smoke_TC_036.RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_36;
		//Expected_ReserveTable_TotalBalanceAmount=RMAApp_ReserveGrid_Cell_Balance-RMA_Smoke_TC_032.RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_32;
		
		StrExpected_ReserveTable_BalanceAmount = "$"+RMAApp_ReserveGrid_Cell_Balance+ ".00";
		StrExpected_ReserveTable_CollectionAmount = "$"+RMAApp_ReserveGrid_Cell_Collection+ ".00";
		StrExpected_ReserveTable_PaidAmount = "$"+RMAApp_ReserveGrid_Cell_Paid+ ".00";
		StrExpected_ReserveTable_IncurredAmount = "$"+RMAApp_ReserveGrid_Cell_Incured+ ".00";
		
		//===========================Steps To Verify The Values In Reserve NG Grid Started Here===================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
		driver.switchTo().window(StrRMAWindowHandle);
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("fundsTransaction");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financials Image On Payments Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Back To Financials Image On Payments Page Is Clicked ");
		
		if (RMA_Smoke_TC_002_GC.StrClaimNumber_002.contains("WC") ||RMA_Smoke_TC_002_GC.StrClaimNumber_002.contains("DI") )
				
		{
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridSortClmNames(driver, 2)), "uncheck", "Column Names In Column Selection List", "Reserves NG Grid Table",logval);	
		}
		
		WebElement filtertext = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridHeader(driver, 3);
		RMA_Input_Utility.RMA_SetValue_Utility(filtertext, "Reserve Type Filter Text Box On Reserve Table", RMAApp_ReserveCreation_Lst_ReserveType,logval);
	    //Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
		
		WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, 4, "span");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_BalanceAmount, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
		//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done
		
		WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, 5, "span");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_PaidAmount, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
		//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done
		
		WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, 6, "span");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_CollectionAmount, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
		//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done
		
		WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, 7, "span");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_IncurredAmount, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
		//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done
		//===========================Steps To Verify The Values In Reserve NG Grid Completed Here===================================================================================================================================================================================================================================
		
		//===========================Steps To Verify The Values Present In Transaction History Table Are Started===========================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_TransactionHistory(driver), "Transaction History Image On Payments Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Transaction History Image On Payments Page Is Clicked");
		RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_TransactionHistory.RMAApp_TransHistory_Tbl_TransactionHistory(driver), RMA_Smoke_TC_011.StrControlNumber_RMA_Smoke_TC_011, 1, SplitAmount, 4, TransactionType, "Transaction History Table On Transaction History Page", logval);
		RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_TransactionHistory.RMAApp_TransHistory_Tbl_TransactionHistory(driver), RMA_Smoke_TC_011.StrControlNumber_RMA_Smoke_TC_011, 8, StrStatus, "Transaction History Table On Transaction History Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_TransactionHistory.RMAApp_TransHistory_Btn_BackToFinanacials(driver), "Back To Financials Button On Transaction History Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Back To Financials Button On Transaction History Page Is Clicked");
		//===========================Steps To Verify The Values Present In Transaction History Table Are Completed=========================================================================================================================================================================================================
		
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
