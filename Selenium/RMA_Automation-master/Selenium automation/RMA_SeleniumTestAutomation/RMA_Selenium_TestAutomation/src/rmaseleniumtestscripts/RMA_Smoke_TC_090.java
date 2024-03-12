package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_090
//Description    : Successful Payment And Copy Of Payment Transaction Against An Already Created Reserve For Created Carrier Claim With Attached Internal Policy Is Validated 
//Depends On TC  : RMA_TC_Smoke_087_GC/WC,RMA_TC_Smoke_088_GCWC, RMA_TC_Smoke_089
//Revision       : 0.0 - RenuVerma-01-05-2017 
//=================================================================================================
public class RMA_Smoke_TC_090 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_090_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_090";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_090_Payment And Copy Of Payment Transaction For Created Carrier Claim With Attached Internal Policy ", "Successful Payment And Copy Of Payment Transaction Against An Already Created Reserve For Created Carrier Claim With Attached Internal Policy Is Validated ");
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
		String StrControlNumber_RMA_TC_090;
		String CopiedControlNo;
		WebElement ActualBalAmtAfterCopied;
		String ExpBalAmtAfterCopied;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_03 Is Fetched To Retrieve Data 
		Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 0); //Bank Account Is Fetched From DataSheet RMA_TC_090
		Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 1); // Payee Type Is Fetched From DataSheet RMA_TC_090
		FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_TC_090
		FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_090", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_090
		Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_TC_090
		PaymentGrid_Cell_Balance =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 6); //Reserve Grid Payment Balance Amount Is Fetched From DataSheet RMA_TC_090
		PaymentGrid_Cell_Paid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 7); // Reserve Grid Payment Paid Amount Is Fetched From DataSheet RMA_TC_090
		PaymentGrid_Cell_Incured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 8); // Reserve Grid Payment Incurred Amount Is Fetched From DataSheet RMA_TC_090
		PaymentGrid_Cell_Collection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 1, 9); // Reserve Grid Payment Collection Amount Is Fetched From DataSheet RMA_TC_090
		ExpBalAmtAfterCopied=	ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_090", 5, 0); //Reserve Grid Payment Balance Amount After Copy Transaction Is Fetched From DataSheet RMA_TC_090
		/*===========================================================New Payment Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type"), "Financial Reserve Row On Reserve Table", logval);
		parentlogger.log(LogStatus.INFO,"Following Function Is Called :: " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentACON", "RMA_PaymentAddition_Utility_ACON",0)+ " To Create New Payment");
		testcall1 = true;
		StrControlNumber_RMA_TC_090 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility_ACON("NO",Payment_Lst_BankAccount, Payment_Lst_PayeeType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, "NA", Payment_Txt_DisType,"NA","NA","NA","NA","NA",PaymentGrid_Cell_Balance,PaymentGrid_Cell_Incured,PaymentGrid_Cell_Paid,PaymentGrid_Cell_Collection,false, logval1);	
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_090, 2)+ " "+ "Is Done");
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Creation Against An Already Created Reserve", StrScreenShotTCName)));
		/*===========================================================New Payment Creation Is Completed Here=======================================================================================================================================================================================*/
		
		/*===========================================================Copy Transaction Of Existing Payment Is Started Here=======================================================================================================================================================================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type"), "Financial Reserve Row On Reserve Table", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_FinancialDetailHistory(driver), "Financial Detail History Image On Financial Reserve Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, StrControlNumber_RMA_TC_090)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, StrControlNumber_RMA_TC_090), StrControlNumber_RMA_TC_090+" Link On Financial Detail History Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_CopyTransaction(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_CopyTransaction(driver), "Copy Transaction Image On Payment Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Button On Payment Page",logval);// Save Button Is Clicked On Payment Page
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
		CopiedControlNo = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver),"Back To Financial Image", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Policy Name")), "uncheck", "Policy Name In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Unit")), "uncheck", "Unit In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Coverage Type")), "uncheck", "Coverage Type In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Loss Type")), "uncheck", "Loss Type In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		ActualBalAmtAfterCopied = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance" );
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ExpBalAmtAfterCopied, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmtAfterCopied, logval);
		//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done
		logger.log(LogStatus.INFO, "Copied Payment Saved With ControlNumber:" + " " + color.RMA_ChangeColor_Utility(CopiedControlNo, 2) );
		/*===========================================================Copy Transaction Of Existing Payment Is Ended Here=======================================================================================================================================================================================*/
	
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
