package rmaseleniumtestscripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_005
//Description    : Successful Reserve Creation Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-27-2015 
//=================================================================================================
public class RMA_TC_005 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
@Parameters ("ReserveType")
public void ReserveCreation(String ReserveType) throws Exception, Error
{
	try {
		logger = reports.startTest("TC_005_Reserve Creation", "A New Reserve Is Created");
		int RMAApp_ReserveCreation_Txt_ReserveAmount;
		String RMAApp_ReserveCreation_Lst_Status;
		int IntReserveTable_RowsCount;
		int IntReserveTable_ColumnsCount;
		String IntReserveTable_CellText;
		String StrActual_ReserveTable_ReserveAmount;
		String StrExpected_ReserveTable_ReserveAmount;
		String StrActual_ReserveTable_ReserveStatus;
		String StrExpected_ReserveTable_ReserveStatus;
		//Local Variable Declaration
		
		StrExpected_ReserveTable_ReserveStatus = "Open";
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_005", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_TC_005
		RMAApp_ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_005", 1, 1); // Reserve Amount Is Fetched From DataSheet RMA_TC_005
			
		StrExpected_ReserveTable_ReserveAmount = "$"+RMAApp_ReserveCreation_Txt_ReserveAmount+ ".00";
		
		RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver).click();
		logger.log(LogStatus.INFO, "Created General Claim Is Expanded To Access The Menu Options");
			
		RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver).click(); //Created General Claim's Financial/Reserves Option Is Selected
		logger.log(LogStatus.INFO, "Created General Claim's Financial/Reserves Option Is Selected");
		
		int iteraor =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
		Thread.sleep(10000);
		driver.switchTo().frame(iteraor); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		Thread.sleep(15000);
		
		if (ReserveType.equalsIgnoreCase("M Medical"))
		{
			RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Lnk_M_Medical(driver).click(); //Medical Reserve Option Is Clicked
			Thread.sleep(5000);
			logger.log(LogStatus.INFO, "Created General Claim's Medical Reserve Option On Financial Reserves Page Is Clicked");
		}
		else if (ReserveType.equalsIgnoreCase("L Litigation"))
		{
			RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Lnk_L_Litigation(driver).click(); //Litigation Reserve Option Is Clicked
			Thread.sleep(5000);
			logger.log(LogStatus.INFO, "Created General Claim's Litigation Reserve Option On Financial Reserves Page Is Clicked");
		}
		else if (ReserveType.equalsIgnoreCase("E Expense"))
		{
			RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Lnk_E_Expense(driver).click(); //Expense Reserve Option Is Clicked
			Thread.sleep(5000);
			logger.log(LogStatus.INFO, "Created General Claim's Expense Reserve Option On Financial Reserves Page Is Clicked");
		}
		else if (ReserveType.equalsIgnoreCase("B BodilyInjury"))
		{
			RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Lnk_BI_Bodily_Injury(driver).click(); //BodilyInjury Reserve Option Is Clicked
			Thread.sleep(5000);
			logger.log(LogStatus.INFO, "Created General Claim's BodilyInjury Reserve Option On Financial Reserves Page Is Clicked");
		}
		else if (ReserveType.equalsIgnoreCase("I Indemnity"))
		{
			RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Lnk_I_Indemnity(driver).click(); //Indemnity Reserve Option Is Clicked
			Thread.sleep(5000);
			logger.log(LogStatus.INFO, "Created General Claim's Expense Reserve Option On Financial Reserves Page Is Clicked");
		}
		else if (ReserveType.equalsIgnoreCase("RC REC Recovery"))
		{
			RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Lnk_RC_REC_Recovery(driver).click(); //Recovery Reserve Option Is Clicked
			Thread.sleep(5000);
			logger.log(LogStatus.INFO, "Created General Claim's Expense Reserve Option On Financial Reserves Page Is Clicked");
		}
			
		RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver).clear();//Clears The Text Written In Reserve Amount Text Box On Reserve Creation Page
		Thread.sleep(2000);
		RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver).sendKeys(String.valueOf(RMAApp_ReserveCreation_Txt_ReserveAmount));  //Reserve Amount Is Provided In Reserve Amount Field
		logger.log(LogStatus.INFO, "Reserve Amount Provided In Reserve Amount Field On Reserve Creation Page Is"+ " " + "::" + " " + RMAApp_ReserveCreation_Txt_ReserveAmount );
			
		Select dropdown = new Select (RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver));
		dropdown.selectByVisibleText(RMAApp_ReserveCreation_Lst_Status); //Reserve Status Is Provided In Reserve Status Field On Reserve Creation Page
		logger.log(LogStatus.INFO, "Reserve Status Provided In Reserve Status Field On Reserve Creation Page Is"+ " " + "::" + " " + RMAApp_ReserveCreation_Lst_Status.toUpperCase() );
			
		RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Btn_Modify(driver).click(); //Modify Button Is Clicked On Reserve Creation Page
		Thread.sleep(5000);
		logger.log(LogStatus.INFO, "Modify Button Is Clicked On Reserve Creation Page");
		
		//RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_Reserve(driver), ReserveType, 4, StrExpected_ReserveTable_ReserveAmount, 5, StrExpected_ReserveTable_ReserveStatus, "ReserveGrid");
		List<WebElement> reservetable_rows = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_Reserve(driver).findElements(By.tagName("tr"));
		IntReserveTable_RowsCount = reservetable_rows.size();
		
		breakloop:
		for (int row=0; row<IntReserveTable_RowsCount; row++){
			List<WebElement> reservetable_rows_columns = reservetable_rows.get(row).findElements(By.tagName("td"));
			IntReserveTable_ColumnsCount = reservetable_rows_columns.size();
			 for (int column=0; column<IntReserveTable_ColumnsCount; column++){
				  IntReserveTable_CellText = reservetable_rows_columns.get(column).getText();
				   if (ReserveType.equalsIgnoreCase(IntReserveTable_CellText)){
					 StrActual_ReserveTable_ReserveAmount =  reservetable_rows_columns.get(4).getText();
					 StrActual_ReserveTable_ReserveStatus =  reservetable_rows_columns.get(5).getText();
					 Assert.assertEquals(StrActual_ReserveTable_ReserveAmount, StrExpected_ReserveTable_ReserveAmount);
					 logger.log(LogStatus.PASS, "Expected Reserve Amount::" + StrExpected_ReserveTable_ReserveAmount + "And Actual Reserve Amount::" + StrActual_ReserveTable_ReserveAmount + "Are The Same Hence Reserve Creation Is Successful" );
					 
					 Assert.assertEquals(StrActual_ReserveTable_ReserveStatus, StrExpected_ReserveTable_ReserveStatus);
					 logger.log(LogStatus.PASS, "Expected Reserve Status::" + StrExpected_ReserveTable_ReserveStatus + "And Actual Reserve Status::" + StrActual_ReserveTable_ReserveStatus + "Are The Same Hence Reserve Creation Is Successful" );
					 break breakloop;
				   }
				  }
			 }
		
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
		throw (e);
	}
}


@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{ 
	try {
		StrScreenShotTCName = "TC_005";
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
