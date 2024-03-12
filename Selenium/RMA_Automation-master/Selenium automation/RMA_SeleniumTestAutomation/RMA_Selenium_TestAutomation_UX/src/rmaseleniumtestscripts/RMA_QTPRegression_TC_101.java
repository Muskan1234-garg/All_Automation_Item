package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
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
//TestCaseID     : RMA_QTPRegression_TC_101
//Description    : When checkbox 'Prevent modifying reserves less than paid' is checked , user cannot edit a reserve amount to amount less than paid amount from General System Parameter Setup Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-12-22-2017
//===================================================================================================================================================================================================================================================================================================================================


public class RMA_QTPRegression_TC_101 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_101_Test() throws Exception,Error {

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
		StrScreenShotTCName = "RMA_QTPRegression_TC_101";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here



		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_101_User_Cannot_Edit_A_Reserve_Amount_Validation", "Verify when checkbox 'Prevent modifying reserves less than paid' is checked , user cannot edit a reserve amount to amount less than paid amount from General System Parameter Setup");
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
			int ReserveCreation_Txt_ReserveAmount_1;
			//Local Variable Declaration Completed Here
			
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite28_QTPRegression_010.xlsx"); //Excel WorkBook RMA_Suite28_QTPRegression_010 IS Fetched To Retrieve Data			
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_101
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_101
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1,2 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_101
			//General claim Data Fetch From Excel WorkBook Is Completed Here
			
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 3); //Status Is Fetched From DataSheet RMA_QTPRegression_TC_101
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 4); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_101
			ReserveCreation_Txt_ReserveAmount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_101", 1, 5);// Amount Is Fetched From DataSheet RMA_QTPRegression_TC_101
			ReserveCreation_Txt_ReserveAmount_1 =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_101", 1, 13);// Amount Is Fetched From DataSheet RMA_QTPRegression_TC_101
			//Reserve Data Fetch From Excel WorkBook Is Completed Here
			
			Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 6); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_101
			Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 7); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_101
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 8); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_101
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_101", 1, 9); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_101
			Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 10); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_101
			Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 11); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_101
			FundsSplitDetails_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_101", 1, 12); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_101
			//Payment Data Fetch From Excel WorkBook Is Completed Here
			
			//========================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			GenClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(GenClaimNumber, 2));
			loggerval1 = logger.toString();
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
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", GenClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Reserve On The Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================
	
			//=========================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(Payment_Lst_BankAccount, Payment_Lst_PayeeType, FundsSplitDetails_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment Is Created::");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//==========================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			
			//=========================================Steps To Do General System Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+"General System Parameter Settings Are Done");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_101_Check", logval1);
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Do General System Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================

			
			//==========================================Steps To Navigate To UX Screen Is Started Here=================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================Steps To Navigate To UX screen Is Ended Here=================================================================================================================================================================================================================================

			//==============================================Steps To Select Reserve Row On Financials/Reserves page Is Started Here================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "First Row Selection On Financials/Reserves Page", logval);
			//==============================================Steps To Select Reserve Row On Financials/Reserves page Is Ended Here================================================================================================================================================================

			//========================================Steps To Create Unsuccessful Reserve On The Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_EditReserve(driver), "Edit Reserve Image On Financial/Reserves Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", String.valueOf(ReserveCreation_Txt_ReserveAmount_1), logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.id("dateentered")), "Reserve Date Field On Add New Reserve Window On Financial Reserves Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Amount Is Converted In USD On Reserve Creation Page");
			
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, RMA_Selenium_POM_VerificationMessage.ReseAmntNotLessPaid, "Reserve Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Close Button On Error Toast Message", logval);// Save Button Is Clicked
			driver.switchTo().parentFrame();	
			
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//========================================Steps To Create  Unsuccessful Reserve On The Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================
		
			
            RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			
			//=========================================Steps To Do General System Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+"General System Parameter Settings Are Done");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_101_unCheck", logval1);
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Do General System Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================

			//============================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//============================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim  And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create Reserve On The Created Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "To Create Unsuccessful Payment And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Do settings On General System Parameter Page And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);		
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Revert Settings On General System Parameter Page And Hence The Test Case Is A Fail");
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


