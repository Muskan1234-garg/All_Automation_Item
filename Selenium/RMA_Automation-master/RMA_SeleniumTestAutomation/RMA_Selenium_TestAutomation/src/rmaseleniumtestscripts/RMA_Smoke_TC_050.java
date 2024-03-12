package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_050
//Description    : Successful First and Final Payment Creation On Carrier Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_045_GC/RMA_Smoke_TC_045_WC, RMA_Smoke_TC_046
//Revision       : 0.0 - RenuVerma-09-21-2016 
//=================================================================================================
public class RMA_Smoke_TC_050 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrControlNumber_RMA_Smoke_TC_050;

@Test 
public void RMA_Smoke_TC_050_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_050";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_050_First and Final Payment Creation On Carrier Claim", "Successful First and Final Payment Creation On Carrier Claim Is Validated");
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
		String Payment_Grid_Cell_Policy;
		String PaymentGrid_Cell_Unit;
		String PaymentGrid_Cell_Coverage;
		String PaymentGrid_Cell_Loss;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_03 Is Fetched To Retrieve Data 
		Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_050
		Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_050
		FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_050
		FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_050", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_050
		Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_TC_050
		PaymentGrid_Cell_Balance =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 6); //Reserve Grid Balance Amount Is Fetched From DataSheet RMA_TC_050
		PaymentGrid_Cell_Paid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 7); // Reserve Grid Paid Amount Status Is Fetched From DataSheet RMA_TC_050
		PaymentGrid_Cell_Incured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 8); // Reserve Grid Incurred Amount Type Is Fetched From DataSheet RMA_TC_050
		PaymentGrid_Cell_Collection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_050", 1, 9); // ReserveGrid Collection Amount Is Fetched From DataSheet RMA_TC_050
		 		
		Payment_Grid_Cell_Policy=RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue(driver, "Policy Name" ).getText();
		PaymentGrid_Cell_Unit=RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue(driver, "Unit" ).getText();
		PaymentGrid_Cell_Coverage=RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue(driver, "Coverage Type" ).getText();
		PaymentGrid_Cell_Loss=RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue(driver, "Loss Type" ).getText();
		/*===========================================================New Payment Creation Is Started Here=======================================================================================================================================================================================*/
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Click Close Btn On Transacion Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
		parentlogger.log(LogStatus.INFO,"Following Function Is Called :: " + RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentACON", "RMA_PaymentAddition_Utility_ACON",0) + " To Create New Payment");
		testcall1 = true;
		if(RMA_Smoke_TC_046.ClaimType_046.contains("General Claim")){
			StrControlNumber_RMA_Smoke_TC_050 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility_ACON("Yes", Payment_Lst_BankAccount, Payment_Lst_PayeeType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, "NA", Payment_Txt_DisType, Payment_Grid_Cell_Policy,PaymentGrid_Cell_Unit,PaymentGrid_Cell_Coverage,"NA",PaymentGrid_Cell_Loss,PaymentGrid_Cell_Balance,PaymentGrid_Cell_Incured,PaymentGrid_Cell_Paid,PaymentGrid_Cell_Collection,false,logval1);
		}
		else if(RMA_Smoke_TC_046.ClaimType_046.contains("Worker")){
			StrControlNumber_RMA_Smoke_TC_050 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility_ACON("Yes", Payment_Lst_BankAccount, Payment_Lst_PayeeType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, "NA", Payment_Txt_DisType, Payment_Grid_Cell_Policy,PaymentGrid_Cell_Unit,PaymentGrid_Cell_Coverage,"TestDC",PaymentGrid_Cell_Loss,PaymentGrid_Cell_Balance,PaymentGrid_Cell_Incured,PaymentGrid_Cell_Paid,PaymentGrid_Cell_Collection,false,logval1);
		}
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_050, 2)+ " "+ "Is Done");
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successfully First and Final Payment Creation", StrScreenShotTCName)));
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
