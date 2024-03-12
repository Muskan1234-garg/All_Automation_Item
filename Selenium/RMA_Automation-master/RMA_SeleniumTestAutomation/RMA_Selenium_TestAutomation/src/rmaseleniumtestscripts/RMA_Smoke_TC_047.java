package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_047
//Description    : Successful Payment Against An Already Created Reserve For Carrier Claim Is Validated 
//Depends On TC  : RMA_TC_Smoke_045_GC/RMA_TC_Smoke_045_WC, RMA_TC_Smoke_046
//Revision       : 0.0 - RenuVerma-09-21-2016 
//=================================================================================================
public class RMA_Smoke_TC_047 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_047_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_047";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_047_Payment Creation On Carrier Claim", "Successful Payment Against An Already Created Reserve For Carrier Claim Is Validated ");
		parentlogger.assignAuthor("Renu Verma");
		
		String Payment_Lst_BankAccount;
		String Payment_Lst_PayeeType;
		String FundsSplitDetails_Lst_TransactionType;
		int FundsSplitDetails_Txt_Amount;
		String Payment_Txt_DisType;
		String PaymentGrid_Cell_Balance;
		String PaymentGrid_Cell_Paid;
		String PaymentGrid_Cell_Incured;
		String PaymentGrid_Cell_Collection;
		String StrControlNumber_RMA_TC_047;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_03 Is Fetched To Retrieve Data 
		Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 0); //Bank Account Is Fetched From DataSheet RMA_TC_047
		Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 1); // Payee Type Is Fetched From DataSheet RMA_TC_047
		FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_TC_047
		FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_047", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_047
		Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_TC_047
		PaymentGrid_Cell_Balance =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 6); //Reserve Grid Payment Balance Amount Is Fetched From DataSheet RMA_TC_047
		PaymentGrid_Cell_Paid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 7); // Reserve Grid Payment Paid Amount Is Fetched From DataSheet RMA_TC_047
		PaymentGrid_Cell_Incured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 8); // Reserve Grid Payment Incurred Amount Is Fetched From DataSheet RMA_TC_047
		PaymentGrid_Cell_Collection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 9); // Reserve Grid Payment Collection Amount Is Fetched From DataSheet RMA_TC_047
			
		/*===========================================================New Payment Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type"), "Financial Reserve Row On Reserve Table", logval);
		parentlogger.log(LogStatus.INFO,"Following Function Is Called :: " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentACON", "RMA_PaymentAddition_Utility_ACON",0)+ " To Create New Payment");
		testcall1 = true;
		StrControlNumber_RMA_TC_047 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility_ACON("NO",Payment_Lst_BankAccount, Payment_Lst_PayeeType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, "NA", Payment_Txt_DisType,"NA","NA","NA","NA","NA",PaymentGrid_Cell_Balance,PaymentGrid_Cell_Incured,PaymentGrid_Cell_Paid,PaymentGrid_Cell_Collection,false, logval1);	
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_047, 2)+ " "+ "Is Done");
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Creation Against An Already Created Reserve", StrScreenShotTCName)));
		/*===========================================================New Payment Creation Is Completed Here=======================================================================================================================================================================================*/
				
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentAddition_Utility_ACON" + " " +  "And Hence The Test Case Is A Fail");
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
