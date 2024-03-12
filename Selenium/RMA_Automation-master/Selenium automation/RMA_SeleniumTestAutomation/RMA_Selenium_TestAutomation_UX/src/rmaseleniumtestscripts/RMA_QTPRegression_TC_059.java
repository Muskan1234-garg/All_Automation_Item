package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_059
//Description    : Bulk Release Of Checks From Funds Link Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-09-11-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_059 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_059_Test() throws Exception,Error {

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
		StrScreenShotTCName = "RMA_QTPRegression_TC_059";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{   
			parentlogger = reports.startTest("RMA_QTPRegression_TC_059_BulkRelease_Checks_Validation",  "Bulk Release Of Checks From Funds Link Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

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
			String FundsSplitDetails_Lst_ReserveType;
			String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_DisType;
			String ReserveCreation_Lst_Status;
			String ReserveCreation_Lst_ReserveType;
			String GenClaimCreation_Txt_ClaimType;
			String ControlNumber;
			String ControlNumber_1;
			String ExpectedCheckStatus;
			int FundsSplitDetails_Txt_Amount;
			int ReserveCreation_Txt_ReserveAmount;
			int BankAccountCreation_Txt_ZipCode;
			int CheckStockCreation_Txt_FontSize;
			String CheckStockCreation_Txt_FontStyle;
			String CheckStockCreation_Txt_StockName;
			//Local Variable Declaration Completed 

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			GenClaimCreation_Txt_DateOfEvent =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			ExpectedCheckStatus = "R Released";
			CheckStockCreation_Txt_StockName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Stock_");
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_21_QTPRegression_10.xlsx"); //Excel WorkBook RMA_Suite_21_QTPRegression_10 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_059			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1,1 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_059
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1,2 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_059
			GenClaimCreation_Txt_ServiceCode = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1,3 ); //Service Code Is Fetched From DataSheet RMA_QTPRegression_TC_059
			//General Claim Data Fetch From Excel WorkBook Is Completed Here

			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 4); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_059
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 5); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_059
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 6); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_059
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 7); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_059
			FundsSplitDetails_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 8); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_059
			FundsSplitDetails_Txt_Amount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_059", 1, 11);//Funds Split Details Amount Is Fetched From DataSheet RMA_QTPRegression_TC_059
			//Payment Data Fetch From Excel WorkBook Is Completed Here

			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 9); // Reserve Status Is Fetched From DataSheet RMA_QTPRegression_TC_059
			ReserveCreation_Lst_ReserveType =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 10); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_059			
			ReserveCreation_Txt_ReserveAmount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_059", 1, 12);//Reserve Amount Is Fetched From DataSheet RMA_QTPRegression_TC_059
			//Reserve Data Fetch From Excel WorkBook Is Completed Here

			CheckStockCreation_Txt_FontStyle = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_059", 1, 13);//Font Style Is Fetched From DataSheet RMA_QTPRegression_TC_033
			CheckStockCreation_Txt_FontSize = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_059", 1, 14);//Font Size Is Fetched From DataSheet RMA_QTPRegression_TC_033
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
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Check Stocks Page", logval);
			//===========================================Steps To Close The Bank Account Window Is Completed Here==========================================================================================================================================================================

			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//========================================Steps To Create Corporate General Claim Is Started Here===========================================================================================================================================================================================================================================================
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

			//========================================Steps To Create Reserve On The Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Reserve");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", GenClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Reserve On The Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Create Payment On Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
			testcall5 = true;
			ControlNumber = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(BankAccountCreation_Txt_BankAccountName, PaymentCreation_Lst_PayeeType,FundsSplitDetails_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType, 	FundsSplitDetails_Txt_Amount, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(ControlNumber, 2)+ " "+ "Is Done");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Payment On Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//=======================================Steps To Change The Check Status On Payment Page And Control Number Verification After Changing The Check Status Is Started Here=======================================================================================================================================================================================================
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "Check Status TextBox", "Q", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", logval);
			//Save Button Is Clicked To Save The Transaction
			ControlNumber_1 = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); 
			RMA_Verification_Utility.RMA_TextCompare(ControlNumber, ControlNumber_1, "Control Number After Changing The Check Status Is Verified", logval);
			//========================================Steps To Change The Check Status On Payment Page And Control Number Verification After Changing The Check Status Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Close The Payment Page Is Started Here============================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Button On Payment Page", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			//========================================Steps To Close The Payment Page Is Completed Here============================================================================================================================================================================================================================

			//========================================Steps To Navigate To UI Screen Is Started Here=========================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			//========================================Steps To Navigate To UI Screen Is Completed Here=========================================================================================================================================================================================================================

			//========================================Steps To Release Bulk Checks Through Navigation To Funds--->Bulk Check Release Page Is Started Here=================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BulkCheckRelease","RMA_Funds_BulkCheckRelease",0)+" To Successfully Bulk Release Checks");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_Funds_BulkCheckRelease(BankAccountCreation_Txt_BankAccountName,GenClaimNumber,logval1);
			parentlogger.log(LogStatus.INFO, "Bulk Check Is Released Successfully For Bank Account"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Release Bulk Checks Through Navigation To Funds--->Bulk Check Release Page Is Completed Here=================================================================================================================================================================================================================

			//===========================================Steps To Close The Bulk Check Release Page Is Started Here==========================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bulk Check Release Page Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bulk Check Release Page", logval);
			//===========================================Steps To Close The Bulk Check Release Page Is Completed Here==========================================================================================================================================================================

			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//=========================================Steps To Search The Created General Claim Is Started Here ===============================================================================================================================================================			
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", GenClaimNumber, GenClaimNumber,DefaultFrameID,logval);			
			//==========================================Steps To Search The Created General Claim Is Completed Here ===============================================================================================================================================================

			//=========================================Steps To Verify The Check Status Is Started Here ===============================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_TransactionHistory(driver), "Transaction History Button from Tool Bar On Financials/Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.TransactionHistoryFrame);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ControlNumber, "Control Number On Transaction History Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Payment Page Needs To Get Loaded");
			RMA_Verification_Utility.RMA_TextCompare(ExpectedCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"), "Check Status Value", logval);
			//=========================================Steps To Verify The Check Status Is Completed Here ===============================================================================================================================================================

			//========================================Steps To Close The Payment Page Is Started Here============================================================================================================================================================================================================================
			//RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Payment");
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Button On Payment Page", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			//========================================Steps To Close The Payment Page Is Completed Here============================================================================================================================================================================================================================

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
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create  New General Claim  And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create New Reserve And Hence The Test Case Is A Fail");
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Funds_BulkCheckRelease" + " " +  "To Bulk Release Checks And Hence The Test Case Is A Fail");
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




