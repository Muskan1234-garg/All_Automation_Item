package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_031
//Description    : Edit Of Reserve Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-09-14-2016 
//=================================================================================================
public class RMA_Smoke_TC_031 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_Smoke_TC_031_Test() throws Exception, Error
	{	
		parentlogger = reports.startTest("RMA_Smoke_TC_031_Reserve Editing", "Edit Of Reserve Is Validated");
		parentlogger.assignAuthor("Imteyaz Ahmad");
		try 
		{

			int RMAApp_ReserveCreation_Txt_ReserveAmount;
			String RMAApp_ReserveCreation_Lst_ReserveType;
			String RMAApp_ReserveCreation_Lst_Status;
			String RMAApp_ReserveCreation_Lst_ExpStatus;
			int RMAApp_ReserveGrid_Cell_Balance;
			int RMAApp_ReserveGrid_Cell_Paid;
			int RMAApp_ReserveGrid_Cell_Incured;
			int RMAApp_ReserveGrid_Cell_Collection;
			int RMAApp_ReserveCreation_Txt_ReserveAmountEdited;
			String StrExpected_ReserveTable_BalanceAmount;		
			//Local Variable Declaration

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_031", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_031", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveCreation_Lst_ExpStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_031", 1, 3); // Expected Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveGrid_Cell_Balance = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 4); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveGrid_Cell_Paid = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 5); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveGrid_Cell_Incured = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 6); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveGrid_Cell_Collection = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 7); // Expected Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_031
			RMAApp_ReserveCreation_Txt_ReserveAmountEdited = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 8); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_031

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			StrScreenShotTCName = "Smoke_TC_031";

			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");

			/*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO,"The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveAdditionModified", "RMA_ReserveAdditionModified_Utility",0)+" Is Called To Create A Reserve ");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_ReserveAdditionModified_Utility(RMAApp_ReserveCreation_Txt_ReserveAmount, RMAApp_ReserveCreation_Lst_Status, RMAApp_ReserveCreation_Lst_ReserveType, "No", RMAApp_ReserveCreation_Lst_ExpStatus, RMAApp_ReserveGrid_Cell_Balance, RMAApp_ReserveGrid_Cell_Incured,  RMAApp_ReserveGrid_Cell_Paid,RMAApp_ReserveGrid_Cell_Collection, StrClaimNumber_002, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(RMAApp_ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_ReserveCreation_Txt_ReserveAmount), 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Creation Of New Reserve Is Successful", StrScreenShotTCName)));
			/*===========================================================New Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/

			/*======================================================================Edit Of Reserve Is Started==============================================================================*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, 3, "span"), "Financial Reserve Row On Reserve Table", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_EditReserve(driver), "Edit Reserve Image On Financial Reserve Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Edit Reserve Image On Financial Reserves Page Is Clicked");
			driver.switchTo().frame(0); //A switch To The Frame Containing Add New Reserve Window Controls Is Done		
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", String.valueOf(RMAApp_ReserveCreation_Txt_ReserveAmountEdited),logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Is Clicked On Add New Reserve Window On Financial Reserves Page",logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Reserve Creation Page Is Clicked");
			driver.switchTo().defaultContent();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");

			if (StrClaimNumber_002.contains("WC") ||StrClaimNumber_002.contains("DI"))
				
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridSortClmNames(driver,12)), "uncheck", "Column Names In Column Selection List", "Reserves NG Grid Table",logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridSortClmNames(driver, 2)), "uncheck", "Column Names In Column Selection List", "Reserves NG Grid Table",logval);
			}
			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridSortClmNames(driver,11)), "uncheck", "Column Names In Column Selection List", "Reserves NG Grid Table",logval);
				
			}
			
			WebElement filtertext = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridHeader(driver, 3);
			RMA_Input_Utility.RMA_SetValue_Utility(filtertext, "Reserve Type Filter Text Box On Reserve Table", RMAApp_ReserveCreation_Lst_ReserveType,logval);
			//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			StrExpected_ReserveTable_BalanceAmount = "$"+RMAApp_ReserveCreation_Txt_ReserveAmountEdited+ ".00";
			WebElement ActualBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, 4, "span");
			RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(StrExpected_ReserveTable_BalanceAmount, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualBalAmt, logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edit Of Reserve Is Successful", StrScreenShotTCName)));
			//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done		

			/*======================================================================Edit Of Reserve Is Completed==============================================================================*/

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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
