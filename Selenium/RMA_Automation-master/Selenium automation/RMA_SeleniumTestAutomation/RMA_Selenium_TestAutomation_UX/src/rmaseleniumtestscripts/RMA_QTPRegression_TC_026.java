package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Claimant;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_026
//Description    : Successful Payment Creation When Multiple Payees (Other People And Entities) Are Associated Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-08-09-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_026 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_026_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_026";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_026_ Successful Payment Creation In Case Of Multiple Payees", "Successful Payment Creation When Multiple Payees (Other People And Entities) Are Associated Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");
			
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String PaymentCreation_Txt_BankAccount;
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String ReserveCreation_Lst_ReserveType;
			String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_DisType;
			int FundsSplitDetails_Txt_Amount;
			String StrControlNumber;
	    	String ClmntCreation_Txt_LastName;
	    	String ClmntCreation_Txt_FirstName;
	    	String ClmntCreation_Txt_SocSecNo;
	    	String StrClaimNumber;
	    	String PayeeList_Claimant;
	     	String PayeeList_Other;
			//Local Variable Declaration Is Completed Here
			
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Is Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite11_QTPRegression_04.xlsx"); //Excel WorkBook RMA_Suite_11_QTPRegression_04 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 7); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_026
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1,8 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_026
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1,9 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_026
			//Claim Data Fetch From Excel WorkBook Is Completed Here
		 
			PaymentCreation_Txt_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 0); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_026
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 1); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_026
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 2); //Transaction Type For Medical Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_026
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_026", 1, 3); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_026
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 4); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_026
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_026
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_026", 1, 6); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_026
			//Payment Data Fetch From Excel WorkBook Is Completed Here
												
			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here========================================================================================================================================================================================================================================================
			//=============================================================Steps To Create Claimant Is Started Here================================================================================================================================================================================================================================================================
            parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Claimant");
            testcall2 = true;
            ClmntCreation_Txt_LastName = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Claimant", StrClaimNumber, "Great Britain", "NA",logval1);
            parentlogger.log(LogStatus.INFO, "New Claimant Is Created With Claimant LastName::"+ " " + color.RMA_ChangeColor_Utility(ClmntCreation_Txt_LastName, 2));
            loggerval2 = logger.toString();
            parentlogger.appendChild(logger);
            ClmntCreation_Txt_FirstName = RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_FirstName(driver).getAttribute("value");
            ClmntCreation_Txt_SocSecNo = RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_SocSecNo(driver).getAttribute("value");
            //==============================================================Steps To Create Claimant Is Completed Here================================================================================================================================================================================================================================================================
        	//==============================================================Steps To Navigate From Claimant Screen To Claim Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//===============================================================Steps To Navigate From Claimant Screen To Claim Screen Is Completed Here===============================================================================================================================================================================================================================================
			//===============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ConditionalPaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment With Multiple Payees");
			testcall3 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(PaymentCreation_Txt_BankAccount, PaymentCreation_Lst_PayeeType,ReserveCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, ClmntCreation_Txt_LastName, PaymentCreation_Txt_DisType, "MultiplePayees_QTP_TC_026" ,"NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			PayeeList_Claimant = ClmntCreation_Txt_LastName+"|"+ClmntCreation_Txt_FirstName+"|"+ClmntCreation_Txt_SocSecNo;
			PayeeList_Other = PaymentCreation_Txt_LastName+"||";
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,PayeeList_Other), "displayed", "Other Payee On Payee List Box", logval);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,PayeeList_Claimant), "displayed", "Claimant On Payee List Box", logval);
			//==============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_ClaimEventEntityAddition_Utility " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_ConditionalPaymentCorpAddition_Utility" +  "And Hence The Test Case Is A Fail");
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

