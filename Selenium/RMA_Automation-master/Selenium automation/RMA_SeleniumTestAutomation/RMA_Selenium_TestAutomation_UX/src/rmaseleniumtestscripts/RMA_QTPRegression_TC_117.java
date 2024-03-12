package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_117
//Description    : Verification Of Making Combined Payment For Print Check To File Options: 'TO FILE ONLY'
//Depends On TC  : RMA_QTPRegression_TC_052_I
//Revision       : 0.0 - AnubhutiVyas-12-22-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_117 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_0117_Test() throws Exception, Error
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
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_117";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID=null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_117_Make A Combined Payment For Print Check To File Options: 'TO FILE ONLY'", "Verification Of Making Combined Payment For Print Check To File Options: 'TO FILE ONLY'");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String PaymentCreation_Lst_ReserveType;
			String PaymentCreation_Txt_DisType;
			String ExpCheckStatus;
			int FundsSplitDetails_Txt_Amount;
			String StrControlNumber_1;
			String StrControlNumber_2;
			String StrControlNumber_3;
			Object[] ContentToBeVerified;
			String StrClaimNumber;
			//Local Variable Declaration Is Completed Here

			ExpCheckStatus = "R Released";
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Is Completed Here
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite26_QTPRegression_13.xlsx"); //Excel WorkBook RMA_Suite26_QTPRegression_13.xlsx IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1, 7); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_117
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1,8 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_117
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1,9); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_117
			//Claim Data Fetch From Excel WorkBook Is Completed Here
			
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1, 1); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_117
			FundsSplitDetails_Lst_TransactionType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1,2); //Transaction Type For Medical Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_117
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_117", 1, 3); //Medical Amount Is Fetched From DataSheet RMA_QTPRegression_TC_117
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_117
			PaymentCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_117", 1, 6); // Medical Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_117
			//Payment Data Fetch From Excel WorkBook Is Completed Here
					
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			//============================================================General System Parameter & Payment Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UISettings","RMA_Suite06_Utility",0)+"General System Parameter And Payment Parameter Settings Are Done");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Suite06_Utility("RMA_QTPRegression_TC_117", logval1);//General System Parameter & Payment Parameter Settings Are Done
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX(); 
			//============================================================General System Parameter & Payment Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================
			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall2 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================
			//==============================================================Steps To Add First Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall3 = true;
			StrControlNumber_1 = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(RMA_QTPRegression_TC_052_I.BankAccount_Txt_AccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, RMA_QTPRegression_TC_052_I.CombinedPayee_Txt_LastName, PaymentCreation_Txt_DisType,"MultipleSplits_QTP_Suite07","NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_1, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_CombinedPayFlag(driver), "checked", "Combined Payment Check Box On Payment Creation Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr1, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address1(driver).getAttribute("value"),"Address 1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr2, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address2(driver).getAttribute("value"),"Address 2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr3, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address3(driver).getAttribute("value"),"Address 3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr4, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address4(driver).getAttribute("value"),"Address 4 Value", logval);
			//==============================================================Steps To Add First Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
		
			//==============================================================Steps To Add Second Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall4 = true;
			StrControlNumber_2 = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(RMA_QTPRegression_TC_052_I.BankAccount_Txt_AccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, RMA_QTPRegression_TC_052_I.CombinedPayee_Txt_LastName, PaymentCreation_Txt_DisType,"MultipleSplits_QTP_Suite07","NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_2, 2)+ " "+ "Is Done");
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_CombinedPayFlag(driver), "checked", "Combined Payment Check Box On Payment Creation Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr1, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address1(driver).getAttribute("value"),"Address 1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr2, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address2(driver).getAttribute("value"),"Address 2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr3, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address3(driver).getAttribute("value"),"Address 3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr4, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address4(driver).getAttribute("value"),"Address 4 Value", logval);
			//==============================================================Steps To Add Second Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Add Third Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall5 = true;
			StrControlNumber_3 = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(RMA_QTPRegression_TC_052_I.BankAccount_Txt_AccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, RMA_QTPRegression_TC_052_I.CombinedPayee_Txt_LastName, PaymentCreation_Txt_DisType,"MultipleSplits_QTP_Suite07","NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_3, 2)+ " "+ "Is Done");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_CombinedPayFlag(driver), "checked", "Combined Payment Check Box On Payment Creation Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr1, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address1(driver).getAttribute("value"),"Address 1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr2, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address2(driver).getAttribute("value"),"Address 2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr3, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address3(driver).getAttribute("value"),"Address 3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_QTPRegression_TC_052_I.EntityAddress_Txt_Addr4, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address4(driver).getAttribute("value"),"Address 4 Value", logval);
			//==============================================================Steps To Add Third Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			//==============================================================Steps To Print Payments Started Here=========================================================================================================================================================================================================================================================================
			ContentToBeVerified=new Object[]{StrClaimNumber,StrControlNumber_1,StrControlNumber_2,StrControlNumber_3,RMA_QTPRegression_TC_052_I.BankAccount_Txt_AccountName, RMA_QTPRegression_TC_052_I.CombinedPayee_Txt_LastName};
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintChecks","RMA_Suite07_PrintCheckUtility",0)+" To Print The Checks");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_Suite07_PrintCheckUtility("RMA_QTPRegression_TC_052",RMA_QTPRegression_TC_052_I.BankAccount_Txt_AccountName,PaymentCreation_Txt_DisType,ContentToBeVerified, logval1);//Print Checks Utility
			parentlogger.log(LogStatus.INFO, "Checks Are Printed To File Successfully");
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Print Payments Completed Here=========================================================================================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Suite06_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenClaimCorpCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function For Making First Payment" +" "+ "" + "RMA_ConditionalPaymentCorpAddition_Utility " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4== true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function For Making Second Payment" +" "+ "" + "RMA_ConditionalPaymentCorpAddition_Utility " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5== true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function For Making Third Payment" +" "+ "" + "RMA_ConditionalPaymentCorpAddition_Utility " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6== true && loggerval6.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function For Printing Checks To File Only" +" "+ "" + "RMA_Suite07_PrintCheckUtility " +  "And Hence The Test Case Is A Fail");
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


