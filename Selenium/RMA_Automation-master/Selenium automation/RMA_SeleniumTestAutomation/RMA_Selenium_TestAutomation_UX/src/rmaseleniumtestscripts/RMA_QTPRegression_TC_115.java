package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_115
//Description    : Claim Status Change To Closed When Transaction Type Is Set In Auto Close Options Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-12-15-2017
//===================================================================================================================================================================================================================================================================================================================================


public class RMA_QTPRegression_TC_115 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_115_Test() throws Exception,Error {

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
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_115";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_115_ Claim_Status_Change_To_Closed_Validation", "Claim Status Change To Closed When Transaction Type Is Set In Auto Close Options Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");


			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String GenClaimNumber;
			String StrControlNumber;
			String Payment_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String Payment_Txt_LastName;
			String Payment_Txt_DisType;
			String ReserveType;
			int FundsSplitDetails_Txt_Amount;
			String Payment_Txt_BankAccount;
			//Local Variable Declaration Completed Here

			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Completed 


			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite28_QTPRegression_010.xlsx"); //Excel WorkBook RMA_Suite_04_QTPRegression_03 IS Fetched To Retrieve Data			
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_115
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_115
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1,2 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_115
			//General claim Data Fetch From Excel WorkBook Is Completed Here

			Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1, 3); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_003
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1, 4); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_003
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_115", 1, 5); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_003
			Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1, 6); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_003
			Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1,7); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_003
			ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1, 8); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_003
			Payment_Txt_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_115", 1,9); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_115
			//Payment Data Fetched Is Completed Here


			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//===========================================================Steps To Do Settings In LOB Parameter Setup Page Is StarHere============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+" To Successfully Do Settings On "+ "Line Of Business Parameter Setup Page");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_115_Settings", logval1);
			parentlogger.log(LogStatus.INFO, "Line Of Business Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================================Steps To Do Settings In LOB Parameter Setup Page Is Completed Here===============================================================================================================================================================================================

			//==========================================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//==================================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall2 = true;
			GenClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(GenClaimNumber, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==================================================================Steps To Create General Claim Is Completed Here=======================================================================

			//================================================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//=================================================================Steps To Navigate To Payment Page Is Completed Here=========================================================================================================================================================================================================


			//==============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall3 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(Payment_Txt_BankAccount, Payment_Lst_PayeeType,ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, "RMA_QTPRegression_TC_115", "NA", logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================

			
			
			//==============================================================Steps To Navigate From Payment Screen To Claim Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, GenClaimNumber),"Claim Number Breadcrumb Present At Payment Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//===============================================================Steps To Navigate From Payment Screen To Claim Screen Is Completed Here===============================================================================================================================================================================================================================================
			
			RMA_Verification_Utility.RMA_PartialTextVerification("C Closed", RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver).getAttribute("value"), "Claim Status On General Claim page", logval);
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			
			//===========================================================Steps To Revert Settings In LOB Parameter Setup Page Is StarHere============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+" To Successfully Do Settings On "+ "Line Of Business Parameter Setup Page");
			testcall4 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_115_Settings_1", logval1);
			parentlogger.log(LogStatus.INFO, "Line Of Business Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================================Steps To Revert Settings In LOB Parameter Setup Page Is Completed Here===============================================================================================================================================================================================

			//==========================================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Do settings In LOB Parameter Setup Tab And Hence The Test Case Is A Fail");
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "To Create Payment On The Created Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4== true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Revret settings In LOB Parameter Setup Tab And Hence The Test Case Is A Fail");
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
