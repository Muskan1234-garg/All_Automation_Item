package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_100
//Description    : System checks for insufficient reserves when checkbox 'Do Not Allow Negative Reserve Adjustments' is checked and payment/auto check is not saved Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-12-21-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_100 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_100_Test() throws Exception,Error {

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
		StrScreenShotTCName = "RMA_QTPRegression_TC_100";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here



		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_100_ System_checks_for_insufficient_reserves_Validation", "System checks for insufficient reserves when checkbox 'Do Not Allow Negative Reserve Adjustments' is checked and payment/auto check is not saved Is Validated ");
			parentlogger.assignAuthor("Nidhi Jha");

			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String GenClaimNumber;
			String ReserveCreation_Lst_Status;
			String ReserveCreation_Lst_ReserveType;
			int ReserveCreation_Txt_ReserveAmount;
			String Payment_Lst_BankAccount;
			String Payment_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String Payment_Txt_LastName;
			String Payment_Txt_DisType;
			String FundsSplitDetails_Lst_ReserveType;
			int FundsSplitDetails_Txt_Amount;
			String ScheduleCheckCreation_Lst_BankAccount;
			String ScheduleCheckCreation_Lst_PayeeType;
			String ScheduleCheckCreation_Lst_TransactionType;
			int  ScheduleCheckCreation_Txt_Amount;
			String ScheduleCheckCreation_Txt_Lstname;
			//Local Variable Declaration Completed Here

			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite28_QTPRegression_010.xlsx"); //Excel WorkBook RMA_Suite28_QTPRegression_010 IS Fetched To Retrieve Data			
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_100
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1,2 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_100
			//General claim Data Fetch From Excel WorkBook Is Completed Here

			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 3); //Status Is Fetched From DataSheet RMA_QTPRegression_TC_100
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 4); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			ReserveCreation_Txt_ReserveAmount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_100", 1, 5);// Amount Is Fetched From DataSheet RMA_QTPRegression_TC_100
			//Reserve Data Fetch From Excel WorkBook Is Completed Here

			Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 6); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_100
			Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 7); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 8); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_100", 1, 9); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_100
			Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 10); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_100
			Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 11); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			FundsSplitDetails_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 12); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			//Payment Data Fetch From Excel WorkBook Is Completed Here

			ScheduleCheckCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 13); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_100
			ScheduleCheckCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 14); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			ScheduleCheckCreation_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 15); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_100
			ScheduleCheckCreation_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_100", 1, 16); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_100
			ScheduleCheckCreation_Txt_Lstname = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_100", 1, 17); //Last name Is Fetched From DataSheet RMA_QTPRegression_TC_100
			//Schedule Check Data Fetch Is Done

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//=========================================Steps To Do Line Of Business Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+"General System Parameter Settings Are Done");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_100_Check", logval1);
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Do Line Of Business Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================


			//==========================================Steps To Navigate To UX Screen Is Started Here=================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================Steps To Navigate To UX screen Is Ended Here=================================================================================================================================================================================================================================


			//========================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall2 = true;
			GenClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(GenClaimNumber, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==========================================Steps To Create General Claim Is Completed Here=======================================================================

			//========================================Steps To Navigate To FinancialsReserves Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Financials/Reserves Page Needs To Get Loaded");
			//========================================Steps To Navigate To FinancialsReserves Page Is Completed Here============================================================================================================================================================================================================

			//========================================Steps To Create Reserve On The Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Reserve");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", GenClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Reserve On The Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//=============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAdditionSuite28","RMA_PaymentCorpAddition_Utility_Suite28",0)+" To Create New Payment");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility_Suite28(Payment_Lst_BankAccount, Payment_Lst_PayeeType,FundsSplitDetails_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, "RMA_QTPRegression_TC_100", logval1);
			parentlogger.log(LogStatus.INFO, "New Payment Is Created::");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Grid Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Selection Of First Row In Reserve Grid", logval);
			//The Created Reserve Is Selected

			//=============================================================Steps To Create Auto Check On The Created Carrier General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UnsuccessfulScheduleCheck","RMA_UnsuccessfulScheduleCheckCreation",0)+" To Create Unsuccessful Schedule Check On Carrier GC Claim");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_UnsuccessfulScheduleCheckCreation(ScheduleCheckCreation_Lst_BankAccount, ScheduleCheckCreation_Lst_PayeeType,ScheduleCheckCreation_Lst_TransactionType,ScheduleCheckCreation_Txt_Amount,ScheduleCheckCreation_Txt_Lstname,logval1);
			parentlogger.log(LogStatus.INFO, "Auto Check Is Done");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Create Auto Check On The Created Carrier General Claim Is Ended Here===================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);

			//=========================================Steps To Do Line Of Business Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+"General System Parameter Settings Are Done");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_100_unCheck", logval1);
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Do Line Of Business Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================

			//===========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

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

			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Do settings On LOB Parameter Page And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim  And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create Reserve On The Created Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PaymentCorpAddition_Utility_Suite28" + " " +  "To Create Unsuccessful Payment And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_UnsuccessfulScheduleCheckCreation" + " " +  "To Create An Unsuccessful Schedule Check On The Created Reserve And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Revert Settings On LOB Parameter Page And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}


			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_UnsuccessfulReserveCorpAddition_Utility" + " " +  "To Again Create An Unsuccessful Reserve On The Created Claim And Hence The Test Case Is A Fail");
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


