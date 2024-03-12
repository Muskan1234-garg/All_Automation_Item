package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_Claims_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_028
//Description    : Verification Of Combined Payment Functionality In Case Of Multiple Payees 
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-08-14-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_028 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_028_Test() throws Exception, Error
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
		StrScreenShotTCName = "RMA_QTPRegression_TC_028";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID=null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_028_ Combined Payment Functionality In Case Of Multiple Payees", "Verification Of Combined Payment Functionality In Case Of Multiple Payees");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String CombinedPayee_Txt_LastName;
			String BankAccount_Txt_AccountName;
			String ClmntCreation_Txt_LastName;
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String ReserveCreation_Lst_ReserveType;
			String PaymentCreation_Txt_DisType;
			int FundsSplitDetails_Txt_Amount;
			String StrControlNumber;
			String StrClaimNumber;
			String BankAccountCreation_Txt_BankAccountAddr1;			
			String BankAccountCreation_Txt_BankAccountStateId;
			String BankAccountCreation_Txt_BankAccountCity;
			int BankAccountCreation_Txt_BankAccountChkNumber;
			int BankAccountCreation_Txt_BankAccountNo;
			String BankAccountCreation_Txt_BankAccountType;
			String BankAccountCreation_Txt_BankAccountName;
			int BankAccountCreation_Txt_ZipCode;
			String EntityAddress_Txt_Addr1;
			String EntityAddress_Txt_Addr2;
			String EntityAddress_Txt_Addr3;
			String EntityAddress_Txt_Addr4;
			String EntityAddress_Txt_City;
			int EntityAddress_Txt_ZipCode;
			String Entity_Txt_Name;
			String EntityAddress_Txt_County;
			//Local Variable Declaration Is Completed Here
			
			BankAccountCreation_Txt_BankAccountAddr1 = "1200 barclay towers";			
			BankAccountCreation_Txt_BankAccountStateId = "NJ";
			BankAccountCreation_Txt_BankAccountCity = "Mount Laurel";
			BankAccountCreation_Txt_BankAccountType = "SA";			
			BankAccountCreation_Txt_BankAccountChkNumber =95641;
			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AQRMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);	
			BankAccountCreation_Txt_BankAccountNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
	
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Is Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite11_QTPRegression_04.xlsx"); //Excel WorkBook RMA_Suite_11_QTPRegression_04 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1, 7); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_028
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1,8 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_028
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1,9 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_028
			//Claim Data Fetch From Excel WorkBook Is Completed Here

			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1, 1); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_028
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1, 2); //Transaction Type For Medical Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_028
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_028", 1, 3); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_028
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_028
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_028", 1, 6); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_028
			//Payment Data Fetch From Excel WorkBook Is Completed Here

			/*
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);

			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABankAccount_"); //Bank Account Name Is Created
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			BankAccount_Txt_AccountName = rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","texas","delhi","SD",201301876,BankAccountName, "s", 1, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccount_Txt_AccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			//========================================Steps To Create Bank Account Is Completed Here ===============================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();

			//========================================Maintenance-->Entity Set Up Is Started Here=================================================================================================================================================================================================================================================
			EntityAddress_Txt_Addr1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_");
			EntityAddress_Txt_Addr2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_");	
			EntityAddress_Txt_Addr3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_");	
			EntityAddress_Txt_Addr4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_");	
 			EntityAddress_Txt_City = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_");
 			EntityAddress_Txt_County = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_");
			EntityAddress_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100000000,999999999);

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddition","RMA_EntityAddition_Utility",0)+" To Successfully Create An Entity From Maintenance Screen");
			testcall2 = true;
			Entity_Txt_Name = RMA_Maintenance_Functionality_Utility.RMA_EntityAddition_Utility("Hospital","HADDR",EntityAddress_Txt_Addr1,EntityAddress_Txt_Addr2,EntityAddress_Txt_Addr3,EntityAddress_Txt_Addr4,EntityAddress_Txt_City,"AL",EntityAddress_Txt_County,"USA",EntityAddress_Txt_ZipCode,logval1);
			parentlogger.log(LogStatus.INFO, "Entity Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(Entity_Txt_Name, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			driver.close();
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			//=========================================Maintenance-->Entity Set Up Is Completed Here=================================================================================================================================================================================================================================================

			//========================================Steps To Create Combined Payee Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CombinedPayee","RMA_CombinedPayment_Add_Utility",0)+" To Successfully Create A Combined Payment");
			testcall3 = true;
			CombinedPayee_Txt_LastName = RMA_Functionality_Utility.RMA_CombinedPayee_Add_Utility(BankAccount_Txt_AccountName,Entity_Txt_Name,"PM",logval1);
			parentlogger.log(LogStatus.INFO, "Combined Payee Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CombinedPayee_Txt_LastName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Create Combined Payee Is Completed Here===============================================================================================================================================================================================================================================
			 */
			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AccountName_"); //Bank Account Name Is Created
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			//BankAccount_Txt_AccountName = RMA_Claims_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","texas","delhi","SD",201301876,BankAccountName, "s", 1, "Anodizing", true,"Adddr2", logval1);
			BankAccount_Txt_AccountName = RMA_Claims_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create",BankAccountCreation_Txt_BankAccountAddr1,BankAccountCreation_Txt_BankAccountCity,BankAccountCreation_Txt_BankAccountStateId,BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountNo,BankAccountCreation_Txt_BankAccountName, BankAccountCreation_Txt_BankAccountType, BankAccountCreation_Txt_BankAccountChkNumber, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccount_Txt_AccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);

			//========================================Steps To Create Bank Account Is Completed Here ===============================================================================================================================================================================================================================================
			//========================================Maintenance-->Entity Set Up Is Started Here=================================================================================================================================================================================================================================================
			EntityAddress_Txt_Addr1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_");
			EntityAddress_Txt_Addr2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_");	
			EntityAddress_Txt_Addr3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_");	
			EntityAddress_Txt_Addr4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_");	
 			EntityAddress_Txt_City = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_");
 			EntityAddress_Txt_County = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_");
			EntityAddress_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100000000,999999999);
	
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddition","RMA_EntityAddition_Utility",0)+" To Successfully Create An Entity From Maintenance Screen");
			testcall2 = true;
			Entity_Txt_Name = RMA_Maintenance_Functionality_Utility.RMA_EntityAddition_Utility("Hospital","HADDR",EntityAddress_Txt_Addr1,EntityAddress_Txt_Addr2,EntityAddress_Txt_Addr3,EntityAddress_Txt_Addr4,EntityAddress_Txt_City,"AL",EntityAddress_Txt_County,"ATR",EntityAddress_Txt_ZipCode,logval1);
			parentlogger.log(LogStatus.INFO, "Entity Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(Entity_Txt_Name, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			driver.close();
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//=========================================Maintenance-->Entity Set Up Is Completed Here=================================================================================================================================================================================================================================================
			//=========================================Steps To Create Combined Payee Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CombinedPayee","RMA_CombinedPayment_Add_Utility",0)+" To Successfully Create A Combined Payee");
			testcall3 = true;
			CombinedPayee_Txt_LastName = RMA_Claims_Functionality_Utility.RMA_CombinedPayee_Add_Utility(BankAccount_Txt_AccountName,Entity_Txt_Name,"PB",logval1);
			parentlogger.log(LogStatus.INFO, "Combined Payee Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CombinedPayee_Txt_LastName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Create Combined Payee Is Completed Here===============================================================================================================================================================================================================================================
		
			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall4 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================
			//===========================================================Steps To Create Claimant Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Claimant");
			testcall5 = true;
			ClmntCreation_Txt_LastName = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Claimant", StrClaimNumber, "Great Britain", "NA",logval1);
			loggerval5 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Claimant Is Created With Claimant LastName::"+ " " + color.RMA_ChangeColor_Utility(ClmntCreation_Txt_LastName, 2));
			parentlogger.appendChild(logger);
			//===========================================================Steps To Create Claimant Is Completed Here================================================================================================================================================================================================================================================================
			//==============================================================Steps To Navigate From Claimant Screen To Claim Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Claimant Screen To Claim Screen Is Completed Here===============================================================================================================================================================================================================================================
			//==============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ConditionalPaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall6 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(BankAccount_Txt_AccountName, PaymentCreation_Lst_PayeeType,ReserveCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, CombinedPayee_Txt_LastName, PaymentCreation_Txt_DisType, "CombinedPayees_QTP_TC_028",ClmntCreation_Txt_LastName,logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_EntityAddition_Utility" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_CombinedPayment_Add_Utility" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4== true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_GenClaimCorpCreation" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5== true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "" + "RMA_ClaimEventEntityAddition_Utility" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6== true && loggerval6.equalsIgnoreCase("NotInitialized"))								
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


