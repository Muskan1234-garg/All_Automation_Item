package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_095
//Description    : To Mark A Collection As Printed Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-08-25-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_095 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_095_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_095";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID=null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_095_Mark A Collection As Printed", "To Mark A Collection As Printed Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String Collection_Lst_PayeeType;
			String Collection_Txt_BankAccount;
			String FundsSplitDetails_Lst_TransactionType;
			String ReserveCreation_Lst_ReserveType;
			String Collection_Txt_DisType;
			String Collection_Txt_LastName;
			int FundsSplitDetails_Txt_Amount;
			String StrControlNumber;
			Object[] ContentToBeVerified;
			String StrClaimNumber;
			//Local Variable Declaration Is Completed Here

	     	GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Is Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite05_QTPRegression_11.xlsx"); //Excel WorkBook RMA_Suite05_QTPRegression_11 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_095
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_095
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1,2 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_095
			//Claim Data Fetch From Excel WorkBook Is Completed Here
			
			Collection_Txt_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 3); // Bank account Is Fetched From DataSheet RMA_QTPRegression_TC_095
			Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 4); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_095
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 5); //Transaction Type For Medical Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_095
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_095", 1, 6); //Medical Amount Is Fetched From DataSheet RMA_QTPRegression_TC_095
			Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 7); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_095
			Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 8); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_095
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_095", 1, 9); // Medical Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_095
			//Payment Data Fetch From Excel WorkBook Is Completed Here
				
		
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			RMA_Functionality_Utility.RMA_Suite04_Utility("RMA_QTPRegression_TC_067", logval);//General System Parameter & Payment Parameter Is Done
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			
			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create General Claim Is Completed Here=======================================================================
			
			//==============================================================Steps To Add Collection For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CollectionAddition","RMA_CollectionCorpAddition_Utility",0)+" To Create New Collection");
			testcall2 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_CollectionCorpAddition_Utility(Collection_Txt_BankAccount, Collection_Lst_PayeeType,ReserveCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Collection_Txt_LastName, Collection_Txt_DisType,logval1);
			parentlogger.log(LogStatus.INFO, "New Collection With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==============================================================Steps To Add Collection For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Print Preview The Created Collection Is Started Here===========================================================================================================================================================================================================================================================
			//ContentToBeVerified=new Object[]{StrClaimNumber,Collection_Txt_LastName};
			ContentToBeVerified=new Object[]{StrClaimNumber,GenClaimCreation_Txt_Department,Collection_Txt_LastName};
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintPreview","RMA_PrintPreviewUtility",0)+" To Print Preview For The Created Payment");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PrintPreviewUtility("Payments","abk",ContentToBeVerified,logval1);
			parentlogger.log(LogStatus.INFO, "Print Preview For Payment With Control NUmber:"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Print Preview The Created Collection Is Completed Here===========================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Print The Created Collection By Entering Deposit Number Is Started Here===========================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_CollectionFlag(driver), "checked", "Collection Check Box", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Deposit(driver), "Deposit Text Box On Collection Creation Page", "89898",logval);
			RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial", RMA_Selenium_POM_VerificationMessage.CollAddDepositMsg, "Confirmation Message Of Saving Deposit Number", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Deposit Number Is Entered On the Collection Page ");
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Printing Of Collection By Entering Deposit Number", "Successful Printing Of Collection")));
			//==============================================================Steps To Print The Created Collection By Entering Deposit Number Is Completed Here===========================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Clear Collection Is Started Here=========================================================================================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Chk_Cleared(driver), "enable", "Cleared Check Box", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Chk_Cleared(driver), "check", "Cleared Check Box", "Transaction Page", logval);
			RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "Partial", RMA_Selenium_POM_VerificationMessage.PaymntScreenClearedPaymntMsg, "Confirm Message on Cleared Payment", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Ok Is Clicked On Print Single Cleared Payment Confirmation Page");
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Chk_Cleared(driver), "checked", "Cleared Check Box", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Chk_Cleared(driver), "disable", "Cleared Check Box", logval);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Clearing Of Collection", "Marking Collection As Cleared")));
			//==============================================================Steps To Clear Collection Is Completed Here=========================================================================================================================================================================================================================================================================
			
		
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_CollectionCorpAddition_Utility " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_PrintPreviewUtility " +  "And Hence The Test Case Is A Fail");
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


