package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_011
//Description    : Successful Payment Creation Against An Already Created Reserve Is Validated
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009
//Revision       : 0.0 - KumudNaithani-07-06-2016 
//Modify By	:0.1 - RenuVerma-01-24-2017 Change FundsSplitDetails_Txt_Amount_Smoke_TC_011 as global for print check verification on RMA_Smoke_TC_042  	
//=================================================================================================
public class RMA_Smoke_TC_011 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrControlNumber_RMA_Smoke_TC_011;// Make funds split variable as Global for Verification in Print check value
	public static int FundsSplitDetails_Txt_Amount_Smoke_TC_011;
	
@Test 
public void RMA_Smoke_TC_011_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_011";
	
	try {
		parentlogger = reports.startTest("RMA_Smoke_TC_011_Payment Creation", "Successful Payment Creation Against An Already Created Reserve Is Validated");
		String RMAApp_Payment_Lst_BankAccount;
		String RMAApp_Payment_Lst_PayeeType;
		String RMAApp_FundsSplitDetails_Lst_TransactionType;
		String RMAApp_Payment_Txt_LastName;
		String RMAApp_Payment_Txt_DisType;
		String ExpCheckStatus;
		String ActualCheckStatus;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_011
		FundsSplitDetails_Txt_Amount_Smoke_TC_011 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_011", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_011
		ExpCheckStatus = "R Released";
		
		/*===========================================================New Payment Creation Is Started Here=======================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
		testcall1 = true;
		StrControlNumber_RMA_Smoke_TC_011 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, 		FundsSplitDetails_Txt_Amount_Smoke_TC_011, RMAApp_Payment_Txt_LastName, RMAApp_Payment_Txt_DisType, logval1);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_011, 2)+ " "+ "Is Done");
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================New Payment Creation Is Completed Here=======================================================================================================================================================================================*/
		
		ActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, ActualCheckStatus,"Check Status Value", logval);
	
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
