package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_049
//Description    : LOB Parameter Settings 'Do Nothing' To View Reserve Balances For Reserves When Closed Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-08-03-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_049 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_049_Test() throws Exception, Error
	{
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
		testcall7 = false;	
		loggerval7 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_049";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID=null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_049_LOB Parameter Settings 'Do Nothing' On Corporate Claim", "LOB Parameter Settings 'Do Nothing' To View Reserve Balances For Reserves When Closed Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");
			
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String PaymentCreation_Txt_BankAccount;
			int ReserveCreation_Txt_ReserveAmount;
			String ReserveCreation_Lst_ReserveType_Medical;
			String ReserveCreation_Lst_ReserveType_Expense;
			String ReserveCreation_Lst_ReserveType_Litigation;
			String ReserveCreation_Lst_Status;	
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType_Medical;
			String FundsSplitDetails_Lst_TransactionType_Expense;
			String FundsSplitDetails_Lst_TransactionType_Litigation;
			String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_DisType;
			String ExpCheckStatus;
			int FundsSplitDetails_Txt_Amount_Medical;
			int FundsSplitDetails_Txt_Amount_Expense;
			int FundsSplitDetails_Txt_Amount_Litigation;
			String StrControlNumber_Payment_Medical;
			String StrControlNumber_Payment_Expense;
			String StrControlNumber_Payment_Litigation;	
			String StrClaimNumber;
			int ExpBalanceAmountAfterPaymentOnGrid_Medical;
			int ExpBalanceAmountAfterPaymentOnGrid_Expense;
			int ExpBalanceAmountAfterPaymentOnGrid_Litigation;
			//Local Variable Declaration Is Completed Here
			
			ExpCheckStatus = "R Released";
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Is Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite17_QTPRegression_07.xlsx"); //Excel WorkBook RMA_Suite17_QTPRegression_07.xlsx IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 16); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_049
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1,17 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_049
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1,18); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_049
			//Claim Data Fetch From Excel WorkBook Is Completed Here
		 
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_049", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_QTPRegression_TC_049
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_QTPRegression_TC_049
			ReserveCreation_Lst_ReserveType_Medical = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 2); // Medical Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_049
			ReserveCreation_Lst_ReserveType_Expense = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 3); // Expense Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_049
			ReserveCreation_Lst_ReserveType_Litigation = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 4); // Litigation Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_049
			//Reserve Data Fetch From Excel WorkBook Is Completed Here
			
			PaymentCreation_Txt_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 5); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_049
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 6); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_049
			FundsSplitDetails_Lst_TransactionType_Medical = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 7); //Transaction Type For Medical Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_049
			FundsSplitDetails_Lst_TransactionType_Expense = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1,12 ); //Transaction Type For Expense Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_049
			FundsSplitDetails_Lst_TransactionType_Litigation = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049",1,13 ); //Transaction Type For Litigation Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_049
			FundsSplitDetails_Txt_Amount_Medical = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_049", 1, 8); //Medical Amount Is Fetched From DataSheet RMA_QTPRegression_TC_049
			FundsSplitDetails_Txt_Amount_Expense = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_049", 1,14 ); //Expense Amount Is Fetched From DataSheet RMA_QTPRegression_TC_049
			FundsSplitDetails_Txt_Amount_Litigation = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_049", 1,15 ); //Litigation Amount Is Fetched From DataSheet RMA_QTPRegression_TC_049
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 9); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_049
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_049", 1, 10); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_049
			//Payment Data Fetch From Excel WorkBook Is Completed Here
									
			ExpBalanceAmountAfterPaymentOnGrid_Medical=ReserveCreation_Txt_ReserveAmount-FundsSplitDetails_Txt_Amount_Medical;// Balance Amount of Medical Reserve After Payment On NG Grid				
			ExpBalanceAmountAfterPaymentOnGrid_Expense=ReserveCreation_Txt_ReserveAmount-FundsSplitDetails_Txt_Amount_Expense;// Balance Amount of Expense Reserve After Payment On NG Grid
			ExpBalanceAmountAfterPaymentOnGrid_Litigation=ReserveCreation_Txt_ReserveAmount-FundsSplitDetails_Txt_Amount_Litigation;// Balance Amount of Litigation Reserve After Payment On NG Grid
			ExpBalanceAmountAfterPaymentOnGrid_Litigation =-(ExpBalanceAmountAfterPaymentOnGrid_Litigation);
			
			String []ExpectedColHeadersToBeVerified={"Balance","Paid","Collection","Incurred","Status"};		
			String []ExpectedValuesToBeVerified_Medical={"$"+ExpBalanceAmountAfterPaymentOnGrid_Medical+".00", "$"+FundsSplitDetails_Txt_Amount_Medical+".00", "$0.00", "$"+ReserveCreation_Txt_ReserveAmount+".00", "O - Open"};
			String []ExpectedValuesToBeVerified_Expense={"$"+ExpBalanceAmountAfterPaymentOnGrid_Expense+".00", "$"+FundsSplitDetails_Txt_Amount_Expense+".00", "$0.00", "$"+ReserveCreation_Txt_ReserveAmount+".00", "O - Open"};
			String []ExpectedValuesToBeVerified_Litigation={"($"+ExpBalanceAmountAfterPaymentOnGrid_Litigation+".00)", "$"+FundsSplitDetails_Txt_Amount_Litigation+".00", "$0.00", "$"+FundsSplitDetails_Txt_Amount_Litigation+".00", "O - Open"};
		
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			RMA_Functionality_Utility.RMA_Suite24_Utility("RMA_QTPRegression_TC_049", logval);//General System Parameter & LOB Parameter Setting Is Done
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
						
			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================
			//=============================================================Medical Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button From Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create Medical Reserve ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType_Medical, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_Medical, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Expense Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create Expense Reserve ");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType_Expense, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_Expense, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Expense Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/
			//===========================================================Litigation Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create Litigation Reserve ");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType_Litigation, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_Litigation, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Litigation Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================
			//==============================================================Steps To Select Medical Reserve Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveCreation_Lst_ReserveType_Medical,logval);//Medical Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Added on Reserve Type Input Box On Reserves NG Grid ");
			//==============================================================Steps To Select Medical Reserve Is Completed Here===========================================================================================================================================================================================================================================================================
			//=============================================================Steps To Add Payment on Medical Reserve For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Financial Reserve Row On Reserve Table", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment On Medical Reserve");
			testcall5 = true;
			StrControlNumber_Payment_Medical = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Txt_BankAccount, PaymentCreation_Lst_PayeeType,"NA", FundsSplitDetails_Lst_TransactionType_Medical,FundsSplitDetails_Txt_Amount_Medical, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_Payment_Medical, 2)+ " "+ "Is Done For Reserve "+ color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_Medical, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			//==============================================================Steps To Add Payment on Medical Reserve For Created General Claim Is Completed Here=======================================================================================================================================================================================
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Completed Here===============================================================================================================================================================================================================================================
			//==============================================================Steps To Select Expense Reserve Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Added on Restore State Button In Column Selection Header On Reserves NG Grid Table ");
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveCreation_Lst_ReserveType_Expense,logval);//Expense Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Added on Reserve Type Filter Text Box On Reserve Table ");
			//Expense Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			//==============================================================Steps To Select Expense Reserve Is Completed Here===========================================================================================================================================================================================================================================================================
			//==============================================================Steps To Add Payment on Expense Reserve For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Financial Reserve Row On Reserve Table", logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
			testcall6 = true;
			StrControlNumber_Payment_Expense = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Txt_BankAccount, PaymentCreation_Lst_PayeeType,"NA", FundsSplitDetails_Lst_TransactionType_Expense, 	FundsSplitDetails_Txt_Amount_Expense, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_Payment_Expense, 2)+ " "+ "Is Done For Reserve "+ color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_Expense, 2));
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			//===========================================================Steps To Add Payment on Expense Reserve For Created General Claim Is Completed Here===============================================================================================================================================================================================================================================
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Completed Here===========================================================================================================================================================================================================================================================================
			//==============================================================Steps To Select Litigation Reserve Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Added On Restore State Button In Column Selection Header On Reserves NG Grid Table ");
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveCreation_Lst_ReserveType_Litigation,logval);//Litigation Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Added On Reserve Type Filter Text Box On Reserve Table ");
			//Litigation Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			//==============================================================Steps To Select Litigation Reserve Is Completed Here===========================================================================================================================================================================================================================================================================
			//==============================================================Steps To Add Payment on Litigation Reserve For Created General Claim Is Started Here=============================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Financial Reserve Row On Reserve Table", logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
			testcall7 = true;
			StrControlNumber_Payment_Litigation = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Txt_BankAccount, PaymentCreation_Lst_PayeeType,"NA", FundsSplitDetails_Lst_TransactionType_Litigation, 	FundsSplitDetails_Txt_Amount_Litigation, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_Payment_Litigation, 2)+ " "+ "Is Done For Reserve "+ color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_Litigation, 2));
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			//=============================================================Steps To Add Payment on Litigation Reserve For Created General Claim Is Completed Here===========================================================================================================================================================================================================================================
			//================================================================= Claim Status Change To Close Is Started Here=================================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On General Claim Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Closed", "Claim Status LookUp Window On General Claim Creation Page", logval);
			//Value Is Entered In Claim Status Text Box
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added On Claim Status LookUp Window On General Claim Creation Page ");
			RMA_Functionality_Utility.RMA_GenericSave_Utility("DefaultFrameID", false, "NA", "General Claim Creation Page", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification("C Closed",RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver).getAttribute("value") , "Closed Claim  Status",logval);
			//================================================================= Claim Status Change To Close Is Completed Here============================================================================================================================================================================================================================================================================
			//================================================================= Verification Of Balance Amount On The Reserve Grid Is Started Here===============================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Name of The Medical Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Lst_ReserveType_Medical, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified_Medical, logval);
			//Verification Of Correct Medical Reserve Creation Is Being Displayed On Reserves NG Grid Is Done
			
			//Name of The Expense Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Lst_ReserveType_Expense, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified_Expense, logval);
			//Verification Of Correct Expense Reserve Creation Is Being Displayed On Reserves NG Grid Is Done
			
			//Name of The Litigation Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Lst_ReserveType_Litigation, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified_Litigation, logval);
			//Verification Of Correct Litigation Reserve Creation Is Being Displayed On Reserves NG Grid Is Done
			//================================================================= Verification Of Balance Amount On The Reserve Grid Is Completed Here===============================================================================================================================================================
		
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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenClaimCorpCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_ReserveCorpAddition_Utility for Medical Reserve" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_ReserveCorpAddition_Utility for Expense Reserve" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4== true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_ReserveCorpAddition_Utility for Litigation Reserve" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentCorpAddition_Utility for Medical Reserve" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentCorpAddition_Utility for Expense Reserve" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall7 == true && loggerval7.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentCorpAddition_Utility for Litigation Reserve" + " " +  "And Hence The Test Case Is A Fail");
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
		} catch (Exception|Error e) {	
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

