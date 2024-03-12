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
//TestCaseID     : RMA_Smoke_TC_055
//Description    : Successful Collection Creation On The Created Carrier General claim Is Validated
//Depends On TC  : RMA_Smoke_TC_053
//Revision       : 0.0 - NidhiJha-10-31-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_055 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_055_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_055";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_055_Carrier Collection Creation", "Successful Carrier Collection Creation , Successful Collection Creation On The Created Carrier General claim Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String CarrierCollectionCreation_Lst_BankAccount;
			String CarrierCollectionCreation_Lst_PayeeType;
			String CarrierFundsSplitDetails_Lst_TransactionType;
			String StrControlNumber;
			String CarrierCollectionCreation_Lst_Policy;
			String CarrierCollectionCreation_Lst_Unit;
			String CarrierCollectionCreation_Lst_CoverageType;
			String CarrierCollectionCreation_Lst_Losstype;
			String ReserveCreation_Txt_ReserveType;
			int CarrierFundsSplitDetails_Txt_Amount;
			int IncurredAmount;
			int CarrierCollectionFundsSplitDetails_Txt_Amount;
			int ReserveCreation_Txt_ReserveAmount;
			int ReserveGridBalance;
			//Local Variable Declaration Completed Here


			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			CarrierCollectionCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierCollectionCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierFundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierCollectionFundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_055", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierCollectionCreation_Lst_Losstype = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 4); //Loss Type Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierCollectionCreation_Lst_CoverageType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 5); // Coverage Type Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierCollectionCreation_Lst_Policy = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 6); // Policy Is Fetched From DataSheet RMA_Smoke_TC_055
			CarrierCollectionCreation_Lst_Unit = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_055", 1, 7); // Unit Is Fetched From DataSheet RMA_Smoke_TC_055
			//Carrier Collection data Fetch Is Completed Here

			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_053", 1,0 ); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_ReserveType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_053", 1,2 ); //Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_053
			CarrierFundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_054", 1, 3); //Payment Amount Is Fetched From DataSheet RMA_Smoke_TC_054
			//Reserve And Payment Data Fetched Is Completed Here

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Grid Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Selection Of First Row In Reserve Grid", logval);
			//The Created Reserve Is Selected


			//=============================================================Steps To Add Collection For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall1 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_CarrierCollectionAddition_Utility(CarrierCollectionCreation_Lst_BankAccount, CarrierCollectionCreation_Lst_PayeeType, CarrierFundsSplitDetails_Lst_TransactionType,CarrierCollectionFundsSplitDetails_Txt_Amount,CarrierCollectionCreation_Lst_Policy,CarrierCollectionCreation_Lst_Unit,CarrierCollectionCreation_Lst_CoverageType,CarrierCollectionCreation_Lst_Losstype,logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Add Collection For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			ReserveGridBalance = ReserveCreation_Txt_ReserveAmount - CarrierFundsSplitDetails_Txt_Amount;
			IncurredAmount = CarrierCollectionFundsSplitDetails_Txt_Amount + CarrierFundsSplitDetails_Txt_Amount;
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);

			//Verification Of Values In NG Grid Is Started Here
			String []ExpectedColHeadersToBeVerified_1 = {"Balance","Paid","Collection","Incurred","Status"};                
			String []ExpectedValuesToBeVerified_1 = {"$" + ReserveGridBalance + ".00"  , "$" + String.valueOf(CarrierFundsSplitDetails_Txt_Amount)  + ".00",  "$" + CarrierCollectionFundsSplitDetails_Txt_Amount + ".00","$" + IncurredAmount  + ".00", "O - Open"};

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CarrierCollectionCorpAddition_Utility" + " To Create A Collection On The Created Carrier GC Claim Successfully" +  "And Hence The Test Case Is A Fail");
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

