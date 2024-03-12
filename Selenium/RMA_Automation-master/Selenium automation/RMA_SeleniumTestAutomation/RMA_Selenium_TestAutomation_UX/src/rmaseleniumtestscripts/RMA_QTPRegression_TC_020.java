package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
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
//TestCaseID     : RMA_QTPRegression_TC_020
//Description    : Sub Account Deposit Balances Can Be Checked While Making Checks Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-08-16-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_020 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_020_Test() throws Exception,Error {
		try{

			String BankAccountCreation_Txt_BankAccountName;
			String SubBankAccountName;
			String DepositCreation_Txt_TransactionDate;
			String ClaimNumber;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			int ReserveCreation_Txt_ReserveAmount;
			String ReserveCreation_Lst_Status;
			String ReserveCreation_Lst_ReserveType;
			String StrControlNumber;
			String ExpCheckStatus;
			String PaymentCreation_Lst_PayeeType;
			String PaymentCreation_Txt_LastName ;
			String FundsSplitDetails_Lst_TransactionType;
			int DepositCreation_Txt_TransactionAmount;
			int FundsSplitDetails_Txt_Amount;
			String PaymentCreation_Txt_DisType;
			Object[] ContentToBeVerified;
			int BankAccountCreation_Txt_ZipCode;
			String CheckStockCreation_Txt_StockName;
			String CheckStockCreation_Txt_FontStyle;
			int CheckStockCreation_Txt_FontSize;
			String GenClaimCreation_Txt_ServiceCode;
			//Local Variable Declaration Completed Here


			parentlogger = reports.startTest("RMA_QTPRegression_TC_020_Sub Account Deposit Balances Validation",  "Sub Account Deposit Balances Can Be Checked While Making Checks Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_020";
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
			loggerval5 = "NotInitialized";	
			testcall5 = false;
			loggerval5 = "NotInitialized";	
			testcall6 = false;
			loggerval6 = "NotInitialized";	
			testcall7 = false;
			loggerval7 = "NotInitialized";
			testcall8 = false;
			loggerval8 = "NotInitialized";
			testcall9 = false;
			loggerval9 = "NotInitialized";
			testcall10 = false;
			loggerval10 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;	
			ExpCheckStatus = "R Released";

			DepositCreation_Txt_TransactionDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-8,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-2,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			BankAccountCreation_Txt_BankAccountName =RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			CheckStockCreation_Txt_StockName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Stock_");
			ContentToBeVerified=new Object[]{RMA_Selenium_POM_VerificationMessage.InsufficientFundsMsg};
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_12_QTPRegression_05.xlsx"); 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_020
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_020
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,2 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_020
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,3 );//Reserve Status Is Fetched From DataSheet RMA_QTPRegression_TC_020
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,4 );//Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_020
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,5 );//Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_020
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,6 );//Last Name  Is Fetched From DataSheet RMA_QTPRegression_TC_020
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,7 );//Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_020
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,8 );//Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_020
			DepositCreation_Txt_TransactionAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_020", 1, 9);//Transaction Amount Is Fetched From DataSheet RMA_QTPRegression_TC_020
			FundsSplitDetails_Txt_Amount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_020", 1, 10);//Funds Split Details Amount Is Fetched From DataSheet RMA_QTPRegression_TC_020
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_020", 1, 11);//Funds Split Details Amount Is Fetched From DataSheet RMA_QTPRegression_TC_020

			CheckStockCreation_Txt_FontStyle = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1, 12);//Font Style Is Fetched From DataSheet RMA_QTPRegression_TC_020
			CheckStockCreation_Txt_FontSize = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_020", 1, 13);//Font Size Is Fetched From DataSheet RMA_QTPRegression_TC_020
			GenClaimCreation_Txt_ServiceCode = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_020", 1,14 ); //Service Code Is Fetched From DataSheet RMA_QTPRegression_TC_020
			//Check Stock Data Fetch From Excel WorkBook Is Completed Here


			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//======================================Steps To Do Settings In General System Parameter Setup Page Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite22GenSysParaSetupsettings","RMA_Suite22_Utility",0)+" To Successfully Do Settings On General System Parameter Setup Page");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite22_Utility("RMA_QTPRegression_TC_020_Check", logval1);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=======================================Steps To Do Settings In General System Parameter Setup Page Is Completed Here================================================================================================================================================================================================

			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall2 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","TestAdd1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 1, "Anodizing", true,"TestAdd2 ", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Bank Account Is Completed Here ===============================================================================================================================================================================================================================================

			//========================================Steps To Create Sub Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SubBankAccount","RMA_SubBankAccount_AddEdit_Utility",0)+" To Successfully Create A Sub Bank Account");
			testcall3 = true;
			SubBankAccountName = rmaseleniumutilties.RMA_Functionality_Utility.RMA_SubBankAccount_AddEdit_Utility("Create", 0, 0, "Anodizing", "All", true, logval1);    
			parentlogger.log(LogStatus.INFO, "Sub Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(SubBankAccountName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Sub Bank Account Is Completed Here ===============================================================================================================================================================================================================================================

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_BackToBankAccount(driver), "Back To Bank Accounts Image", logval);

			//=========================================Steps To Create Deposit Is Started Here=================================================================================================================================================================================================================================================
		    parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Deposit","RMA_DepositCreation_Utility",0)+" To Successfully Create A Deposit");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_DepositCreation_Utility(SubBankAccountName, DepositCreation_Txt_TransactionDate, DepositCreation_Txt_TransactionAmount,true, logval1);
			parentlogger.log(LogStatus.INFO, "Deposit Is Created Successfully");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create Deposit Is Completed Here=======================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
		    RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_BackToBankAccount(driver), "Back To Bank Accounts Image", logval);

			//==============================================================Steps To Create Check Stocks Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CheckStocks","RMA_CheckStocksCreation_Utility",0)+" To Successfully Create A Check Stock");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_CheckStocksCreation_Utility(CheckStockCreation_Txt_StockName, CheckStockCreation_Txt_FontStyle, CheckStockCreation_Txt_FontSize, logval1);
			parentlogger.log(LogStatus.INFO, "Check Stock Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CheckStockCreation_Txt_StockName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create Check Stocks Is Completed Here=======================================================================================================================================================================================================================

			//==============================================================Steps To Navigate To Sub Bank Account Page And Select Check Stock Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_SubAccounts(driver), "Sub Bank Account Image on Maintenance-->Bank Account Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_CheckStock(driver), CheckStockCreation_Txt_StockName, "Check Stock Dropdown", "Sub Bank Account Page", logval);
			//RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Sub Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Sub bank Account page", logval);// Save Button Is Clicked
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_BackToBankAccount(driver), "Back To Bank Accounts Image", logval);
			//==============================================================Steps To Navigate To Sub Bank Account Page And Select Check Stock Is Started Here================================================================================================

			//===========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//===========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall6 = true;
			ClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(ClaimNumber, 2));
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As Service Code Lookup Buton Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ServiceCode(driver), "Service Code Lookup Button On General Claim Page", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCreation_Txt_ServiceCode, "Service Code Lookup Window On General Claims Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As General Claim Page Needs To Get Loaded");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "General Claim Creation Page", logval);
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================

			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================

			//===========================================================Steps To Create Medical Reserve Is Started Here========================================================================================================================================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Reserve ");
			testcall7 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", ClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Steps To Create Medical Reserve Is Completed Here====================================================================================================================================================================================================================================================================================================*/ 

			//=============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall8 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(SubBankAccountName, PaymentCreation_Lst_PayeeType,ReserveCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, "NA","NA", logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval); 
			//=============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			//=============================================================Steps To Print Checks Is Started Here=========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintChecks","RMA_PrintChecks_Utility",0)+" To Successfully Print Checks");
			testcall9 = true;
			RMA_Functionality_Utility.RMA_PrintChecks_Utility("Funds-PrintChecks",BankAccountCreation_Txt_BankAccountName,"NA",ContentToBeVerified, "RMA_QTPRegression_TC_020",logval1);
			parentlogger.log(LogStatus.INFO, "Check Is Printed Successfully For Bank Account"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval9 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Print Checks Is Completed Here========================================================================================================================================================================================================================================================

						
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);

			//========================================Steps To Revert Settings In General System Parameter Setup Page Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite22GenSysParaSetupsettings","RMA_Suite22_Utility",0)+" To Successfully Revert Settings On General System Parameter Setup Page");
			testcall10 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite22_Utility("RMA_QTPRegression_TC_020_UnCheck", logval);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval10 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Revert Settings In General System Parameter Setup Page Is Completed Here================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite22_Utility" + " " +  "To Do Settings In New General System Parameter Setup To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "To Create New Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_SubBankAccount_AddEdit_Utility" + " " +  "To Create New Sub Bank Account  And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_DepositCreation_Utility" + " " +  "To Create Deposit And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CheckStocksCreation_Utility" + " " +  "To Create New Check Stock And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New Corporate General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall7 == true && loggerval7.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create New Reserve On General Claim  And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall8 == true && loggerval8.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ConditionalPaymentCorpAddition_Utility" + " " +  "To Create New Payment On General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall9 == true && loggerval9.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PrintChecks_Utility" + " " +  "To Print Checks And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall10 == true && loggerval10.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite22_Utility" + " " +  "To Revert Settings In New General System Parameter Setup To Validate An Error Scenario And Hence The Test Case Is A Fail");
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
				if (RMA_Selenium_POM_VerificationMessage.NumberOfPrimaryWindows==4)
				{
					RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
				}
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
