package rmaseleniumtestscripts;

import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_006
//Description    : Successful Payment Creation Is Validated
//Depends On TC  : TC_004, TC_005 (If Payment Needs To Be Created After Reserve Creation)
//Revision       : 0.0 - KumudNaithani-10-27-2015 
//=================================================================================================
public class RMA_TC_006 extends rmaseleniumtestscripts.RMA_TC_BaseTest{	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrControlNumber_RMA_TC_006;
	static String StrScreenShotTCName;
@Test
public String PaymentAddition() throws Exception, Error
{
	try {
		logger = reports.startTest("TC_006_Payment Addition", "User Makes A New  Payment");
		String RMAApp_Payment_Lst_BankAccount;
		String RMAApp_Payment_Lst_PayeeType;
		String RMAApp_FundsSplitDetails_Lst_TransactionType;
		int RMAApp_FundsSplitDetails_Txt_Amount;
		String StrPrimaryWindowHandle;
		String RMAApp_Payment_Txt_LastName;
		String StrSecPrimaryWindowHandle;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 1, 0); //Bank Account Is Fetched From DataSheet RMA_TC_006
		RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 1, 1); // Payee Type Is Fetched From DataSheet RMA_TC_006
		RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_TC_006
		RMAApp_FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_006", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_006
		RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 1, 4); //LastName Is Fetched From DataSheet RMA_TC_006

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added Payment Addition Page Is Loaded");
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), RMAApp_Payment_Lst_BankAccount, "Bank Account Drop Down List", "Payment Creation Page",1);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_PayeeType(driver), RMAApp_Payment_Lst_PayeeType, "Payee Type Drop Down List", "Payment Creation Page",1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", RMAApp_Payment_Txt_LastName,1);
		
		StrSecPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Last Name Is Done
		RMA_Selenium_POM_PaymentsCollections.RMAApp_LastName_Lst_LastNameSelection(driver).sendKeys(Keys.ARROW_DOWN); //Intended Last Name Is Selected From LastName Selector On Last Name Selection Window On Payment Creation Page
		RMAApp_Payment_Txt_LastName = color.RMA_ChangeColor_Utility(RMAApp_Payment_Txt_LastName, 3);
		logger.log(LogStatus.INFO, "Intended Last Name Selected From LastName Selector On Last Name Selection Window On Payment Creation Page Is" + " " + "::" + " "  + RMAApp_Payment_Txt_LastName.toUpperCase());
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_LastName_Btn_ChooseHighLighted(driver), "Choose Highlighted Button On Last Name Selection Window On Payment Creation Page",1);
		
		driver.switchTo().window(StrSecPrimaryWindowHandle); //A Switch To The Parent Window Is Done
		Thread.sleep(5000);
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		int Resframeid = RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");	
		driver.switchTo().frame(Resframeid);
		
		//driver.switchTo().frame(2); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		Thread.sleep(15000);
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",1);
		Thread.sleep(5000);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_AddNewPayment(driver), "Add Payment Button On Reserve Creation Page",1);
		Thread.sleep(5000);
		
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Fund Splits Details Is Done
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown On Funds Details Window On Payment Creation Page", RMAApp_FundsSplitDetails_Lst_TransactionType,1);	
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(RMAApp_FundsSplitDetails_Txt_Amount),1);	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Btn_OK(driver), "OK Button On Funds Details Window On Payment Creation Page",1);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
		
		driver.switchTo().window(StrPrimaryWindowHandle);
		Thread.sleep(10000);
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		Thread.sleep(5000);
		//driver.switchTo().frame(2); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		Resframeid = RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");	
		driver.switchTo().frame(Resframeid);
		Thread.sleep(5000);
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Button On Payment Creation Page",1);// Save Button Is Clicked On Payment Creation Page
		Thread.sleep(5000);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",1);// Transaction Tab On Payment Creation Page Is Clicked
		StrControlNumber_RMA_TC_006 = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
		
		String StrlogControlNumber_RMA_TC_006 = color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_006, 2);
		logger.log(LogStatus.PASS, "Payment Is Suceessfully Done And The Generated Control Number Is" + " " + "_"+ " " + StrlogControlNumber_RMA_TC_006);

		RMA_ExcelDataRetrieval_Utility.WriteDataToExcel(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx","RMA_TC_006", 10, 0, StrControlNumber_RMA_TC_006);  //Control Number Is Written In RMA_TC_006 Excel Sheet
		logger.log(LogStatus.INFO, "Generated ControlNumber:" + " " + StrlogControlNumber_RMA_TC_006 + " " + "Is Also Written In The Corresponding Excel Data Sheet RMA_TC_006");
		return StrControlNumber_RMA_TC_006;
		
	} catch (Exception|Error e) {
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
public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
{ 
	try {
		StrScreenShotTCName = "TC_006";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	}
}
