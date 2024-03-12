package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_040
//Description    : Print Preview Working On Payment Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-10-25-2017
//===================================================================================================================================================================================================================================================================================================================================


public class RMA_Smoke_TC_040 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Smoke_TC_040_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_040";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{

			parentlogger = reports.startTest("RMA_Smoke_TC_040_Print_Preview_On_Payment_Screen_Validation","Print Preview Working On Payment Screen Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String GenClaimCreation_Txt_ClaimType;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_TimeOfEvent;
			String strcontrolnumber;
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_DisType;
			String PaymentCreation_Txt_ReserveType;
			int FundsSplitDetails_Txt_Amount;
			String PaymentCreation_Lst_BankAccountName;
			Object[] ContentToBeVerified;
			String ExpectedCheckStatus;
			String ExpectedCheckStatusAfterPrint;
			//Local Variable Declaration Completed 

			StrClaimNumber = null;
			GenClaimCreation_Txt_DateOfEvent =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			ExpectedCheckStatus = "R Released";
			ExpectedCheckStatusAfterPrint = "P Printed";
			//Local Variable Initialization Completed 


			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01.xlsx IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 0); //Claim Type Is Fetched From DataSheet RMA_Smoke_TC_040			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1,1 ); //Department Is Fetched From DataSheet RMA_Smoke_TC_040
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1,2 ); //Claim Status Is Fetched From DataSheet RMA_Smoke_TC_040
			//General Claim Data Fetch From Excel WorkBook Is Completed Here

			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 3); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_040
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 4); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_040
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 5); //LastName Is Fetched From DataSheet RMA_Smoke_TC_040
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 6); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_040
			PaymentCreation_Txt_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 7); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_040
			FundsSplitDetails_Txt_Amount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_040", 1, 8);//Funds Split Details Amount Is Fetched From DataSheet RMA_Smoke_TC_040
			PaymentCreation_Lst_BankAccountName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 9);//Bank Account Name Is Fetched From DataSheet RMA_Smoke_TC_040
			//Payment Data Fetch From Excel WorkBook Is Completed Here

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

			//========================================Steps To Create Corporate General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//========================================Steps To Create Corporate General Claim Is Completed Here=======================================================================================================================================================================================================================================================


			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================

			//========================================Steps To Create Payment On Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
			testcall2 = true;
			strcontrolnumber = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Lst_BankAccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Txt_ReserveType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(strcontrolnumber, 2)+ " "+ "Is Done");
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Payment On Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Print Preview On The Created Payment Is Started Here===========================================================================================================================================================================================================================================================
			ContentToBeVerified=new Object[]{StrClaimNumber,GenClaimCreation_Txt_Department,PaymentCreation_Txt_LastName,"$" + FundsSplitDetails_Txt_Amount + ".00"};
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintPreview","RMA_PrintPreviewUtility",0)+" To Print Preview For The Created Payment");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PrintPreviewUtility("Payments","abk",ContentToBeVerified,logval1);
			parentlogger.log(LogStatus.INFO, "Print Preview For Payment With Control NUmber:"+ " " + color.RMA_ChangeColor_Utility(strcontrolnumber, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Print Preview On The Created Payment Is Completed Here===========================================================================================================================================================================================================================================================

			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_TextCompare(ExpectedCheckStatus,  RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"), "Status Of Payment After Printing Check", logval);
			//Check Status Is Verified Here
			//========================================Steps To Print Checks Is Started Here=========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintChecks","RMA_PrintChecks_Utility",0)+" To Successfully Print Checks");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PrintChecks_Utility("Payments Page","NA","NA",null,"NA", logval1);
			parentlogger.log(LogStatus.INFO, "Check Is Printed Successfully For Bank Account"+ " " + color.RMA_ChangeColor_Utility(PaymentCreation_Lst_BankAccountName, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Print Checks Is Completed Here=========================================================================================================================================================================================================================

			//=======================================Steps To Verify The Status After Printing Check Is Started Here=======================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_TextCompare(ExpectedCheckStatusAfterPrint,  RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"), "Status Of Payment After Printing Check", logval);
			//=======================================Steps To Verify The Status After Printing Check Is Completed Here=======================================================================================================================================================================================================



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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create  New General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "To Create Payment On Created General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PrintPreviewUtility" + " " +  "To Create Print Preview On Created Payment And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PrintChecks_Utility" + " " +  "To Print Checks On Created Payment And Hence The Test Case Is A Fail");
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
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_CloseDownloadBarButton(), "Close Button On Chrome Download Bar", logval);// Close the Download Bar Of Chrome
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

