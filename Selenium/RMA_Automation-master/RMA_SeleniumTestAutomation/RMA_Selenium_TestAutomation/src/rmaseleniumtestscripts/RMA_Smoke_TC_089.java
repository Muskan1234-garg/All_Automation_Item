package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_089
//Description    : Successful Add And Edit Of Reserve On General Claim With Attached Internal Policy For Carrier Client Is Validated
//Depends On TC  :  RMA_TC_Smoke_087_GC/WC,RMA_TC_Smoke_088_GC/WC
//Revision       : 0.0 - RenuVerma-01-07-2017 
//=================================================================================================
public class RMA_Smoke_TC_089 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String ReserveCreation_Lst_ReserveType;
	static String RMAApp_ReserveCreation_Lbl_HeaderCaption_089;

	@Test 
	public void RMA_Smoke_TC_089_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_089";	

		try {
			parentlogger = reports.startTest("Smoke_TC_089_Add And Edit Of Reserve On General Claim With Attached Internal Policy ", "Successful Add And Edit Of Reserve On General Claim With Attached Internal Policy For Carrier Client Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			int ReserveCreation_Txt_ReserveAmount;
			int ReserveEdited_Txt_ReserveAmount;
			String ReserveCreation_Lst_Status;
			String ReserveCreation_Lst_ExpStatus;
			String ReserveGrid_Cell_Balance;
			String ReserveGrid_Cell_Paid;
			String ReserveGrid_Cell_Incured;
			String ReserveGrid_Cell_Collection;
			String ReserveCreation_DateEntered;
			String ReserveGrid_Cell_EditedBalance;
			String ReserveGrid_Cell_EditedPaid;
			String ReserveGrid_Cell_EditedIncured;
			String ReserveGrid_Cell_EditedCollection ;
			WebElement ActualEditedBalAmt;

			//Local Variable Declaration

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13Suite_03 IS Fetched To Retrieve Data 
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_089", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_TC_089
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_TC_089
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_TC_089
			ReserveCreation_Lst_ExpStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 3); // Expected Reserve Status Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_Balance = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 4); //Reserve Grid Balance Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_Paid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 5); // Reserve Grid Paid Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_Incured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 6); // Reserve Grid Incurred Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_Collection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 1, 7); // Reserve grid Collection Amount Is Fetched From DataSheet RMA_TC_089
			ReserveEdited_Txt_ReserveAmount=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_089", 5, 0); //Edited Reserve Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_EditedBalance=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 5, 1); //Reserve Grid Edited Balance Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_EditedPaid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 5, 2); // Reserve Grid Paid Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_EditedIncured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 5, 3); // Reserve Grid Incurred Amount Is Fetched From DataSheet RMA_TC_089
			ReserveGrid_Cell_EditedCollection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_089", 5, 4); // Reserve grid Collection Amount Is Fetched From DataSheet RMA_TC_089
			
			ReserveCreation_DateEntered=new SimpleDateFormat("MM/dd/yyyy").format(new Date());// Reserve Creation Date Is Fetched Current Date 

			/*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			RMAApp_ReserveCreation_Lbl_HeaderCaption_089=RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lbl_HeaderCaption(driver).getText();
			// Here the header value is being fetched to know the claim type
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveAddOnInternalPol", "RMA_ReserveAddOnInternalPol_Utility_ACON",0)+" Is Called To Create A Reserve ");
			testcall1 = true;		
			if(RMAApp_ReserveCreation_Lbl_HeaderCaption_089.contains("General Claim")){
				RMA_Functionality_Utility.RMA_ReserveAddOnInternalPol_Utility_ACON(RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC, RMA_Smoke_TC_087_GC.StrUnitName_Smoke_TC_087_GC, RMA_Smoke_TC_087_GC.CoverageType_Smoke_TC_087_GC, "NA",RMA_Smoke_TC_087_GC.LstRMALossCode_Smoke_TC_087_GC, ReserveCreation_Lst_ReserveType, ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status,ReserveCreation_DateEntered ,ReserveCreation_Lst_ExpStatus,ReserveGrid_Cell_Balance,ReserveGrid_Cell_Incured,ReserveGrid_Cell_Paid,ReserveGrid_Cell_Collection,false,logval1);
			}
			else if(RMAApp_ReserveCreation_Lbl_HeaderCaption_089.contains("Worker")){
				RMA_Functionality_Utility.RMA_ReserveAddOnInternalPol_Utility_ACON(RMA_Smoke_TC_087_WC.StrPolicyName_Smoke_TC_087_WC, RMA_Smoke_TC_087_WC.StrUnitName_Smoke_TC_087_WC, RMA_Smoke_TC_087_WC.CoverageType_Smoke_TC_087_WC, "TestDC",RMA_Smoke_TC_087_WC.LstRMALossCode_Smoke_TC_087_WC, ReserveCreation_Lst_ReserveType, ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status,ReserveCreation_DateEntered ,ReserveCreation_Lst_ExpStatus,ReserveGrid_Cell_Balance,ReserveGrid_Cell_Incured,ReserveGrid_Cell_Paid,ReserveGrid_Cell_Collection,false,logval1);
			}	
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 3) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Creation Of New Reserve Is Successful", StrScreenShotTCName)));
			/*===========================================================New Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/

			/*===========================================================Edit Created Reserve Is Started Here========================================================================================================================================================================================================================================================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type"), "Financial Reserve Row On Reserve Table", logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_EditReserve(driver),"Reserve Edit Image On Reserve Financial Page",logval);
			driver.switchTo().frame(0); //A switch To The Frame Containing Add New Reserve Window Controls Is Done
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver)));	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Edit Existing Reserve Page", String.valueOf(ReserveEdited_Txt_ReserveAmount),logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Is Clicked On Add New Reserve Window On Financial Reserves Page",logval);	
			//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);// This is not used because Reserve frame is not having any ids
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Reserve Creation Page Is Clicked");
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			driver.switchTo().parentFrame();
			if (RMAApp_BrowserName.equalsIgnoreCase("IE"))
			{
				driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			}

			if (RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
			{
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			}
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Claimant")), "uncheck", "Claimant Column In Column Selection List", "Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Reserve Sub Type")), "uncheck", "Reserve Sub Type Column In Column Selection List", "Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Policy Name")), "uncheck", "Policy Name In Column Selection List", "Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Unit")), "uncheck", "Unit In Column Selection List", "Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Coverage Type")), "uncheck", "Coverage Type In Column Selection List", "Reserves NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility((RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(driver, "Loss Type")), "uncheck", "Loss Type In Column Selection List", "Reserves NG Grid Table",logval);
							
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(driver), "Column Header of Reserves NG Grid Table",logval);

			ActualEditedBalAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Balance");
			RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveGrid_Cell_EditedBalance, "Reserve Balance Amount On Reserves NG Grid On Financial Reserves Page", ActualEditedBalAmt, logval);
			//Verification Of Correct Reserve Balance Amount Being Displayed On Reserves NG Grid Is Done
			
			WebElement ActualPaidAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Paid");
			RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveGrid_Cell_EditedPaid, "Reserve Paid Amount On Reserves NG Grid On Financial Reserves Page", ActualPaidAmt, logval);
			//Verification Of Correct Reserve Paid Amount Being Displayed On Reserves NG Grid Is Done

			WebElement ActualCollecAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Collection");
			RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveGrid_Cell_EditedCollection, "Reserve Collection Amount On Reserves NG Grid On Financial Reserves Page", ActualCollecAmt, logval);
			//Verification Of Correct Reserve Collection Amount Being Displayed On Reserves NG Grid Is Done

			WebElement ActualIncAmt = RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Incurred");
			RMA_Verification_Utility.RMA_FilterNGGridVerify_Utility(ReserveGrid_Cell_EditedIncured, "Reserve Incurred Amount On Reserves NG Grid On Financial Reserves Page", ActualIncAmt, logval);
			//Verification Of Correct Reserve Incurred Amount Being Displayed On Reserves NG Grid Is Done

			parentlogger.log(LogStatus.INFO, "Edited Existing Reserve Is With Reserve Amount::" + " " + color.RMA_ChangeColor_Utility(ReserveGrid_Cell_EditedBalance, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edited Existing Reserve Is Successful", StrScreenShotTCName)));
			/*===========================================================Edit Created Reserve Is Completed Here====================================================================================================================================================================================================================================================================================================*/

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ReserveAddOnInternalPol_Utility_ACON" + " " +  "And Hence The Test Case Is A Fail");
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
