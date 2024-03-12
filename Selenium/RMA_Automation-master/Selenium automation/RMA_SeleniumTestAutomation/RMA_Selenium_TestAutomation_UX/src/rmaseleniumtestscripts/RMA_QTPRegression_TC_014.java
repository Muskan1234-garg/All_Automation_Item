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
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_014
//Description    : '14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number' Duplicate Payment Criteria Is Validated 
//Revision       : 0.0 - NidhiJha-08-01-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_014 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_014_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_014";
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
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{ 
			parentlogger = reports.startTest("RMA_QTPRegression_TC_014_Duplicate_Payment_Criteria_14_Validation", "'14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number' Duplicate Payment Criteria Is Validated ");
			parentlogger.assignAuthor("Nidhi Jha");

			String ExpCheckStatus;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String ClaimNumber;
			String StrControlNumber;
			String Payment_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String Payment_Txt_LastName;
			String Payment_Txt_DisType;
			String ReserveType;
			String StrControlNumber_1;
			String Payment_Txt_BankAccount;
			int FundsSplitDetails_Txt_Amount;
			String ClmntCreation_Txt_LastName;
			//Local Variable Declaration Completed Here


			ExpCheckStatus = "R Released";
			Payment_Txt_BankAccount = "Bank for Duplicacy";
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_03_QTPRegression_02.xlsx"); //Excel WorkBook RMA_Suite_03_QTPRegression_02 IS Fetched To Retrieve Data 
			Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1, 0); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_014
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1, 1); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_014
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_014", 1, 2); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_014
			Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1, 3); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_014
			Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1, 4); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_014
			ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1, 5); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_014
			//Payment Data Fetched Is Completed Here

			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1, 6); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_014
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1,7 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_014
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_014", 1,8 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_014
			//General Claim Fetch From Excel WorkBook Is Completed Here


			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//============================================================Steps To Select Duplicate Payment Criteria Is Started Here===========================================================================================================================================================================================================================================================================
			rmaseleniumutilties_UX.RMA_Functionality_Utility.DuplicatePaymentCriteria_Utility("14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number", logval);
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//============================================================Steps To Select Duplicate Payment Criteria Is Completed Here=============================================================================================================================================================== 

			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			ClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(ClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================

			//===========================================================Steps To Create Claimant Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Claimant");
			testcall2 = true;
			ClmntCreation_Txt_LastName = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Claimant", ClaimNumber, "Great Britain", "NA",logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Claimant Is Created With Claimant LastName::"+ " " + color.RMA_ChangeColor_Utility(ClmntCreation_Txt_LastName, 2));
			parentlogger.appendChild(logger);
			//===========================================================Steps To Create Claimant Is Completed Here================================================================================================================================================================================================================================================================

			//==============================================================Steps To Navigate From Claimant Screen To Financial/Reserve Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Claim"),"Claim Breadcrumb From Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Claimant Screen To Financial/Reserve Screen Is Completed Here=========================================================================================================================================

			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================

			//=============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall3 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(Payment_Txt_BankAccount, Payment_Lst_PayeeType,ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, "14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number_FirstPayment","NA", logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval); 
			//=============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Completed Here===============================================================================================================================================================================================================================================

			//==============================================================Steps To Add Second Payment For Created General Claim Is Started Here====================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UnsuccessfulPaymentAddition","RMA_UnsuccessfulPaymentCorpAddition_Utility",1)+" To Create Second Payment");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_UnsuccessfulPaymentCorpAddition_Utility(Payment_Txt_BankAccount, Payment_Lst_PayeeType,ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, "14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number_Second/ThirdPayment", logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Add Second Payment For Created General Claim Is Completed Here====================================================================================================================================================================================================================================================================

			//==============================================================Steps To Verify Display Of Verification Message,Claim Number,Control Number And Funds Split Amount Of First Payment On Duplicate Payment Criteria Window Is Started Here==========================================================================================================================================================================================
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.DuplicatePaymentVerification), "displayed", "Duplicate Payment Criteria Message", logval);
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindow_Tbl(driver), StrControlNumber, 6, "$" + String.valueOf(FundsSplitDetails_Txt_Amount)+ ".00", 8, ClaimNumber, "Duplicate Payment Criteria Table", logval1);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Duplicate Payment Criteria Message Window Verification", "Duplicate Payment Criteria Message Window Verification Is Successfull")));
			//==============================================================Steps To Verify Display Of Verification Message,Claim Number,Control Number And Funds Split Amount Of First Payment On Duplicate Payment Criteria Window Is Completed Here===================================================================================================================================================================
			//==============================================================Steps To Save Duplicate Payment Is Started Here==========================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericUXWindow_Btn_Save(driver), "Save Image On Duplicate Payments Page", logval);// Save Button Is Clicked
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save Button Is Clicked On Duplicate Payment Window");
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			StrControlNumber_1 = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber_1
			//==============================================================Steps To Save Duplicate Payment Is Completed Here==================================================================================================================================================================================================================================================================================

			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
			//RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Completed Here============================================================================================================================================================================

			//==============================================================Steps To Create Third Payment On General Claim Is Started Here====================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UnsuccessfulPaymentAddition","RMA_UnsuccessfulPaymentCorpAddition_Utility",1)+" To Create Third Payment");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_UnsuccessfulPaymentCorpAddition_Utility(Payment_Txt_BankAccount, Payment_Lst_PayeeType,ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, "14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number_Second/ThirdPayment", logval1);
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create Third Payment On General Claim Is Completed Here====================================================================================================================================================================================================================================================================

			//==============================================================Steps To Verify Display Of Verification Message,Claim Number,Control Number And Funds Split Amount On Duplicate Payment Criteria Window For First And Second Payment Is Started Here============================================================================================================================================================
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.DuplicatePaymentVerification), "displayed", "Duplicate Payment Criteria Message", logval);
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindow_Tbl(driver), StrControlNumber, 6, "$" + String.valueOf(FundsSplitDetails_Txt_Amount)+ ".00", 8, ClaimNumber, "Duplicate Payment Criteria Table", logval1);
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindow_Tbl(driver), StrControlNumber_1, 6, "$" + String.valueOf(FundsSplitDetails_Txt_Amount)+ ".00", 8, ClaimNumber, "Duplicate Payment Criteria Table", logval1);	
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Duplicate Payment Criteria Message Window Verification_1", "Duplicate Payment Criteria Message Window Verification Is Successfull_1")));
			//==============================================================Steps To Verify Display Of Verification Message,Claim Number,Control Number And Funds Split Amount On Duplicate Payment Criteria Window For Window For First And Second Payment Is Completed Here==========================================================================================================================================================

			//==============================================================Steps To Cancel Duplicate Payment Is Started Here====================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericUXWindow_Btn_Cancel(driver), "Cancel Image On Duplicate Payments Page", logval);// Cancel Button Is Clicked
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); // Wait For UX Page Load Bar To Disappear
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Cancel Button Is Clicked On Duplicate Payment Window");
			
			//==============================================================Steps To Cancel Duplicate Payment Is Completed Here====================================================================================================================================================================================================================================================================================

			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Payment Screen To Financial/Reserve Screen Is Completed Here============================================================================================================================================================================

			//==============================================================Steps To Create Fourth Payment On General Claim Is Started Here========================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UnsuccessfulPaymentAddition","RMA_UnsuccessfulPaymentCorpAddition_Utility",1)+" To Create Second Payment");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_UnsuccessfulPaymentCorpAddition_Utility(Payment_Txt_BankAccount, Payment_Lst_PayeeType,ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, "14 - Current Claim with same Claimant SSN, Amount, From - To Date Range, and Invoice Number_FourthPayment", logval1);
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create Fourth Payment On General Claim Is Completed Here========================================================================================================================================================================

			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.DuplicatePaymentVerification), "Duplicate Payment Criteria Message", logval);

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create Successful New General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "To Create Successful New Claimant To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ConditionalPaymentCorpAddition_Utility" + " " +  "To Create New Payment To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_UnsuccessfulPaymentCorpAddition_Utility" + " " +  "To Create New Unsuccessful Payment To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_UnsuccessfulPaymentCorpAddition_Utility" + " " +  "To Create New Unsuccessful Payment To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_UnsuccessfulPaymentCorpAddition_Utility" + " " +  "To Create New Unsuccessful Payment To Validate An Error Scenario And Hence The Test Case Is A Fail");
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

