package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_054
//Description    : Successful Payment Creation On The Created Carrier General claim Is Validated
//Depends On TC  : RMA_Smoke_TC_053
//Revision       : 0.0 - NidhiJha-10-31-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_054 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_054_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_054";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_054_Carrier Payment Creation", "Successful Carrier Payment Creation , Successful Payment Creation On The Created Carrier General claim Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String CarrierPaymentCreation_Lst_BankAccount;
			String CarrierPaymentCreation_Lst_PayeeType;
			String CarrierFundsSplitDetails_Lst_TransactionType;
			int CarrierFundsSplitDetails_Txt_Amount;
			String StrControlNumber;
			String CarrierPaymentCreation_Lst_Policy;
			String CarrierPaymentCreation_Lst_Unit;
			String CarrierPaymentCreation_Lst_CoverageType;
			String CarrierPaymentCreation_Lst_Losstype;
			int ReserveCreation_Txt_ReserveAmount;
			int ReserveGridBalance;
			String ReserveCreation_Txt_ReserveType;
			//Local Variable Declaration Completed Here


			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			CarrierPaymentCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierPaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierFundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierFundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_054", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierPaymentCreation_Lst_Losstype = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 4); //Loss Type Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierPaymentCreation_Lst_CoverageType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 5); // Coverage Type Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierPaymentCreation_Lst_Policy = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 6); // Policy Is Fetched From DataSheet RMA_Smoke_TC_054
			CarrierPaymentCreation_Lst_Unit = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_054", 1, 7); // Unit Is Fetched From DataSheet RMA_Smoke_TC_054

			ReserveCreation_Txt_ReserveAmount =ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_053", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_053", 1, 2); //Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_053
			//Payment Data Fetched Is Completed Here

			ReserveGridBalance = ReserveCreation_Txt_ReserveAmount - CarrierFundsSplitDetails_Txt_Amount;
			//Local Variable Initialization Completed Here

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Grid Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Selection Of First Row In Reserve Grid", logval);
			//The Created Reserve Is Selected


			//=============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CarrierPaymentAddition","RMA_CarrierPaymentCorpAddition_Utility",0)+" To Create New Carrier Payment");
			testcall1 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_CarrierPaymentAddition_Utility(CarrierPaymentCreation_Lst_BankAccount, CarrierPaymentCreation_Lst_PayeeType, CarrierFundsSplitDetails_Lst_TransactionType,CarrierFundsSplitDetails_Txt_Amount,CarrierPaymentCreation_Lst_Policy,CarrierPaymentCreation_Lst_Unit,CarrierPaymentCreation_Lst_CoverageType,CarrierPaymentCreation_Lst_Losstype,logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================


			//Verification Of Values In Reserve NG Grid Is Started Here
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			String []ExpectedColHeadersToBeVerified_1 = {"Balance","Paid","Incurred","Status"};                
			String []ExpectedValuesToBeVerified_1 = {"$" + ReserveGridBalance + ".00"  , "$" + String.valueOf(CarrierFundsSplitDetails_Txt_Amount)  + ".00", "$" + ReserveCreation_Txt_ReserveAmount  + ".00", "O - Open"};

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table", logval);
			RMA_GenericUsages_Utility.RMA_CheckVerificationNGGridColumnHeader(ExpectedColHeadersToBeVerified_1, "Reserve", logval);                
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Txt_ReserveType, "Reserve UX Grid",ExpectedColHeadersToBeVerified_1, ExpectedValuesToBeVerified_1, logval);
			//Verification Of Values In NG Grid Is Completed Here

		}
		catch(Exception|Error e)
		{
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
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CarrierPaymentCorpAddition_Utility" + " To Create A Payment On The Created Carrier GC Claim Successfully" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
			try {
				driver.switchTo().parentFrame();
				//Thread.sleep(5000);
				// RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On Event Creation Page", logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

