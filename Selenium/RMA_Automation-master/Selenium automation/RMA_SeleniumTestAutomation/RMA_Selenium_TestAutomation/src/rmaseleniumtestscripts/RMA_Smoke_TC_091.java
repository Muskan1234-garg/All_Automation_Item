package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_091
//Description    : Successful Collection Against An Already Created Reserve For Created Carrier Claim With Attached Internal Policy Is Validated 
//Depends On TC  : RMA_Smoke_TC_087_GC/WC, RMA_Smoke_TC_088_GC/WC,RMA_Smoke_TC_089, RMA_Smoke_TC_090
//Revision       : 0.0 - RenuVerma-01-07-2017 
//=================================================================================================
public class RMA_Smoke_TC_091 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_091_Test() throws Exception, Error
{
	try {
		parentlogger = reports.startTest("Smoke_TC_091_Collection Creation For Carrier Claim With Attached Internal  Policy", "Successful Collection Against An Already Created Reserve For Created Carrier Claim With Attached Internal Policy Is Validated");
		parentlogger.assignAuthor("Renu Verma");
		
		String Collection_Lst_BankAccount;
		String Collection_Lst_PayeeType;
		String FundsSplitDetails_Lst_TransactionType;
		int FundsSplitDetails_Txt_Amount;
		String Collection_Txt_LastName;
		String Collection_Txt_DisType;
		String CollectionGrid_Cell_Balance;
		String CollectionGrid_Cell_Paid;
		String CollectionGrid_Cell_Incured;
		String CollectionGrid_Cell_Collection;		
		String StrControlNumber;
		//Local Variable Declaration
		
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "RMA_Smoke_TC_091";
				
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_03.xlsx Is Fetched To Retrieve Data 
		Collection_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 0); //Bank Account Is Fetched From DataSheet RMA_TC_091
		Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 1); // Payee Type Is Fetched From DataSheet RMA_TC_091
		FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_TC_091
		FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_091", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_091
		Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 4); //LastName Is Fetched From DataSheet RMA_TC_091
		Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_TC_091
		CollectionGrid_Cell_Balance =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 6); //Reserve Grid Collection Balance Amount Is Fetched From DataSheet RMA_TC_091
		CollectionGrid_Cell_Paid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 7); // Reserve Grid Collection Paid Amount Is Fetched From DataSheet RMA_TC_091
		CollectionGrid_Cell_Incured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 8); // Reserve Grid Collection Incurred Amount Is Fetched From DataSheet RMA_TC_091
		CollectionGrid_Cell_Collection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_091", 1, 9); // Reserve Grid Collection Amount Is Fetched From DataSheet RMA_TC_091
			
		/*===========================================================Creation Of Collection Is Started Here================================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type"), "Financial Reserve Row On Reserve Table", logval);
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AddCollection", "RMA_AddNewCollection_Utility",0)+" Is Called To Create A Collection");
		testcall1 = true;
		StrControlNumber = RMA_Functionality_Utility.RMA_AddNewCollection_Utility(Collection_Lst_BankAccount, Collection_Lst_PayeeType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, Collection_Txt_LastName, Collection_Txt_DisType, logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);			
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver),"Back To Financial Image", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver)));		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Policy Name")), "uncheck", "Policy Name In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Unit")), "uncheck", "Unit In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Coverage Type")), "uncheck", "Coverage Type In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Loss Type")), "uncheck", "Loss Type In Column Selection List", "Reserves NG Grid Table",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", RMA_Smoke_TC_089.ReserveCreation_Lst_ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
		
		WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance" );
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(CollectionGrid_Cell_Balance, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
		//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done
		
		WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Paid");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(CollectionGrid_Cell_Paid, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
		//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done
		
		WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Collection");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(CollectionGrid_Cell_Collection, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
		//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done
		
		WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Incurred");
		RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(CollectionGrid_Cell_Incured, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
		//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done
		
		parentlogger.log(LogStatus.INFO, "A Collection Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+" Is Done");
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Collection Is Created Successfully", StrScreenShotTCName)));
		/*===========================================================Creation Of Collection Is Completed ================================================*/
		
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
		
		if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_AddNewCollection_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
