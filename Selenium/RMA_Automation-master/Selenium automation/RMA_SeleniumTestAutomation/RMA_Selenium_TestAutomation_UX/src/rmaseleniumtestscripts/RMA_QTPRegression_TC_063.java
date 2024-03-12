package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_063
//Description    : Un-Clearance Of Checks From Funds Link Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-09-07-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_063 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_063_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		testcall4 = false;	
		loggerval4 = "NotInitialized";
		testcall5 = false;	
		loggerval5 = "NotInitialized";
		testcall6 = false;	
		loggerval6 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_063";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{   
			String GenClaimCreation_Txt_ClaimType;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimNumber;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_TimeOfEvent;
			String BankAccountCreation_Txt_BankAccountName;
			String GenClaimCreation_Txt_ServiceCode;
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_DisType;
			String FundsSplitDetails_Lst_ReserveType;
			String CheckStockCreation_Txt_StockName;
			String CheckStockCreation_Txt_FontStyle;
			String strcontrolnumber;
			int CheckStockCreation_Txt_FontSize;
			int FundsSplitDetails_Txt_Amount;
			int BankAccountCreation_Txt_ZipCode;
			String ExpectedCheckStatus;
			//Local Variable Declaration Completed 

			parentlogger = reports.startTest("RMA_QTPRegression_TC_063_Unclearance_Of_Checks_Validation", "Unclearance Of Checks From Funds Link Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			GenClaimCreation_Txt_DateOfEvent =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			CheckStockCreation_Txt_StockName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Stock_");
			ExpectedCheckStatus = "P Printed";
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_21_QTPRegression_10.xlsx"); //Excel WorkBook RMA_Suite_21_QTPRegression_10 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_063			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1,1 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_063
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1,2 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_063
			GenClaimCreation_Txt_ServiceCode = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1,3 ); //Service Code Is Fetched From DataSheet RMA_QTPRegression_TC_063
			//General Claim Data Fetch From Excel WorkBook Is Completed Here
			
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 4); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_063
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 5); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_063
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 6); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_063
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 7); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_063
			FundsSplitDetails_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 8); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_063
			FundsSplitDetails_Txt_Amount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_063", 1, 9);//Funds Split Details Amount Is Fetched From DataSheet RMA_QTPRegression_TC_063
			//Payment Data Fetch From Excel WorkBook Is Completed Here
			
			CheckStockCreation_Txt_FontStyle = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_063", 1, 10);//Font Style Is Fetched From DataSheet RMA_QTPRegression_TC_063
			CheckStockCreation_Txt_FontSize = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_063", 1, 11);//Font Size Is Fetched From DataSheet RMA_QTPRegression_TC_063
			//Check Stock Data Fetch From Excel WorkBook Is Completed Here

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 2, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//=========================================Steps To Create Check Stocks Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CheckStocks","RMA_CheckStocksCreation_Utility",0)+" To Successfully Create A Check Stock");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_CheckStocksCreation_Utility(CheckStockCreation_Txt_StockName, CheckStockCreation_Txt_FontStyle,CheckStockCreation_Txt_FontSize, logval1);
			parentlogger.log(LogStatus.INFO, "Check Stock Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CheckStockCreation_Txt_StockName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//==========================================Steps To Create Check Stocks Is Completed Here==========================================================================================================================================================================================================================

			//===========================================Steps To Close The Bank Account Window Is Started Here==========================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bank Account Page Needs To Get Loaded After Clicking On Back To Bank Accounts Button While Creating Check Stocks");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			//===========================================Steps To Close The Bank Account Window Is Completed Here==========================================================================================================================================================================

			//===========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//===========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//===========================================Steps To Create Corporate General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall3 = true;
			GenClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(GenClaimNumber, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ServiceCode(driver), "Service Code Lookup Button On General Claim Page", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCreation_Txt_ServiceCode, "Service Code Lookup Window On General Claims Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As General Claim Page Needs To Get Loaded");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "General Claim Creation Page", logval);
			//========================================Steps To Create Corporate General Claim Is Completed Here=======================================================================================================================================================================================================================================================

			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================

			//========================================Steps To Create Payment On Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
			testcall4 = true;
			strcontrolnumber = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(BankAccountCreation_Txt_BankAccountName, PaymentCreation_Lst_PayeeType,FundsSplitDetails_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType, 	FundsSplitDetails_Txt_Amount, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(strcontrolnumber, 2)+ " "+ "Is Done");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//========================================Steps To Create Payment On Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Print Checks Is Started Here=========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintChecks","RMA_PrintChecks_Utility",0)+" To Successfully Print Checks");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_PrintChecks_Utility("Payments Page","NA","NA",null,"NA", logval1);
			parentlogger.log(LogStatus.INFO, "Check Is Printed Successfully For Bank Account"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Print Checks Is Completed Here=========================================================================================================================================================================================================================

			//=======================================Steps To Verify The Status After Printing Check Is Started Here=======================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_TextCompare(ExpectedCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"), "Status Of Payment After Printing Check", logval);
			//=======================================Steps To Verify The Status After Printing Check Is Completed Here=======================================================================================================================================================================================================

			//========================================Steps To Tick Mark The Cleared CheckBox On Payments Page Is Started Here=========================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_Cleared(driver), "Cleared Checkbox On Payments Page", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Payment Page Needs To Get Loaded After Checking The cleared CheckBox");
			//========================================Steps To Tick Mark The Cleared CheckBox On Payments Page Is Completed Here=========================================================================================================================================================================================================================

			//========================================Steps To Navigate To UI Screen Is Started Here=========================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			//========================================Steps To Navigate To UI Screen Is Completed Here=========================================================================================================================================================================================================================

			//========================================Steps To Un Clear The Checks By Navigating To Funds--->Un-Clear Checks Page Is Started Here=================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UnClearChecks","RMA_Funds_UnClearChecks",0)+" To Successfully Un Clear The Check");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_Funds_UnClearChecks(BankAccountCreation_Txt_BankAccountName,logval1);
			parentlogger.log(LogStatus.INFO, "Check Is Marked As UnCleared Successfully For Bank Account"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Un Clear The Checks By Navigating To Funds--->Un-Clear Checks Page Is Completed Here=================================================================================================================================================================================================================

			//===========================================Steps To Close The Funds--->Un-Clear Checks Page Is Started Here==========================================================================================================================================================================
			//RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Message Needs To Get Verified");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Un-Clear Checks Page", logval);
			//===========================================Steps To Close The Funds--->Un-Clear Checks Page Is Completed Here==========================================================================================================================================================================

			//===========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//===========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

		}
		catch (Exception|Error e) {

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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "To Create A New Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CheckStocksCreation_Utility" + " " +  "To Create Check Stocks And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create  New General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "To Create Payment On Created General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PrintChecks_Utility" + " " +  "To Print Checks And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Funds_UnClearChecks" + " " +  "To UnClear Checks And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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

		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}

		finally
		{
			try {

				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame(); 

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

