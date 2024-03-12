package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Entity;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_124
//Description    : Verification Of EFT Payments When Check Box For Roll Up Payment To The Same Payee Is Checked	
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-01-25-2018
//Pre-Requisite	 : Bank With Bank Name "EFT"; BankRoutingNo = 878787878; Account# = '87878'; 'BankAccountName = "EFTAC"; EFT Account Check Box : ON Should Exist.
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_124 extends RMA_TC_BaseTest
{
	public static String BankAccountName;
	public static String Entity_Txt_Name;
	public static String EntityAddress_Txt_Addr1;
	public static String EntityAddress_Txt_Addr2;
	public static String EntityAddress_Txt_Addr3;
	public static String EntityAddress_Txt_Addr4;
	
	@Test  
	public void RMA_QTPRegression_TC_124_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		testcall4 = false;	
		loggerval4 = "NotInitialized";
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
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_124";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_124_EFT Payments Roll Up To The Same Payee", "Verification Of EFT Payments When Check Box For Roll Up Payment To The Same Payee Is Checked");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String BankName;
			int BankRoutingNo;
			String EntityAddress_Txt_City;
			int    EntityAddress_Txt_ZipCode;
			String EntityAddress_Txt_County;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;
			String ExpCheckStatus;
			String FrameID;
			int FundsSplitDetails_Txt_Amount;
			String StrControlNumber_1;
			String StrControlNumber_2;
			String StrControlNumber_3;
			String StrControlNumber_4;
			String StrControlNumber_5;
			String StrClaimNumber;
			String PaymentCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String PaymentCreation_Lst_ReserveType;
			String PaymentCreation_Txt_DisType;
			Object[] ContentToBeVerified;
			String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_BankAccount;
			//Local Variable Declaration Is Completed Here

			BankName = "EFT";
			BankRoutingNo = 878787878;
			BankAccountName = "EFTAC";
			ExpCheckStatus = "R Released";
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Is Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite26_QTPRegression_13.xlsx"); //Excel WorkBook RMA_Suite26_QTPRegression_13.xlsx IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1, 3); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_124
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1,4 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_124
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1,5); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_124
			//Claim Data Fetch From Excel WorkBook Is Completed Here
			
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1, 6); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_124
			FundsSplitDetails_Lst_TransactionType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1,7); //Transaction Type For Medical Reserve Payment Is Fetched From DataSheet RMA_QTPRegression_TC_124
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_124", 1, 8); //Medical Amount Is Fetched From DataSheet RMA_QTPRegression_TC_124
			PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1, 9); //LastName Is Fetched From DataSheet RMA_QTPRegression_TC_124
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1, 10); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_124
			PaymentCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1, 11); // Medical Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_124
			PaymentCreation_Txt_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_124", 1, 12); // Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_124
			//Payment Data Fetch From Excel WorkBook Is Completed Here
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			//============================================================General System Parameter & Payment Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UISettings","RMA_Suite06_Utility",0)+"General System Parameter And Payment Parameter Settings Are Done");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Suite06_Utility("RMA_QTPRegression_TC_124", logval1);//General System Parameter & Payment Parameter Settings Are Done
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//============================================================General System Parameter & Payment Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================

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
			testcall3 = true;
			Entity_Txt_Name = RMA_Maintenance_Functionality_Utility.RMA_EntityAddition_Utility("Hospital","HADDR",EntityAddress_Txt_Addr1,EntityAddress_Txt_Addr2,EntityAddress_Txt_Addr3,EntityAddress_Txt_Addr4,EntityAddress_Txt_City,"AL",EntityAddress_Txt_County,"USA",EntityAddress_Txt_ZipCode,logval1);
			parentlogger.log(LogStatus.INFO, "Entity Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(Entity_Txt_Name, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			FrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=========================================Maintenance-->Entity Set Up Is Completed Here=================================================================================================================================================================================================================================================
			
			//=========================================Steps To Create Banking Information Setup Is Started Here==============================================================================================================================================================================================================================================
			
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Banking Information")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Banking Information"), "Add Image Button For Banking Information For The Created Entity On Entity Maintenance Page",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Add Banking Information Button Is Clicked ");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_BankingInfoSetup_Txt_BankName(driver), "Bank Name TextBox On Entity->Banking Information Setup Page", BankName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_BankingInfoSetup_Txt_AccountNo(driver), "Account Number TextBox OnEntity->Banking Information Setup Page", BankAccountName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Entity.RMAApp_Entity_BankingInfoSetup_Btn_BankingStatus(driver), "Banking Status TextBox On Entity->Banking Information Setup Page",logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Active", "Banking Status LookUp Window On Entity Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Entered In Banking Status TextBox On Entity->Banking Information Setup Page");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Entity.RMAApp_Entity_BankingInfoSetup_Txt_TransitNo(driver), "Bank Transit/Routing No TextBox On Entity->Banking Information Setup Page",String.valueOf(BankRoutingNo), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Entity.RMAApp_Entity_BankingInfoSetup_Btn_AccountType(driver), "Account Type On Entity->Banking Information Setup Page",logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Savings Account", "Banking Account Type LookUp Window On Entity Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Value Is Entered In Banking Account Type TextBox On Entity->Banking Information Setup Page");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA", " Banking Information Setup Page", logval);
			parentlogger.log(LogStatus.INFO, "Banking Information Is Created Successfully");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Banking Information Is Created Successfully", "Successful Banking Information Creation")));
			driver.close();
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			//=========================================Steps To Create Banking Information Setup Is Completed Here===============================================================================================================================================================================================================================================
	
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			
			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall4 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================
			
			//==============================================================Steps To Add First Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall5 = true;
			StrControlNumber_1 = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(BankAccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Entity_Txt_Name, "NA","EFT","NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_1, 2)+ " "+ "Is Done");
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr1, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address1(driver).getAttribute("value"),"Address 1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr2, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address2(driver).getAttribute("value"),"Address 2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr3, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address3(driver).getAttribute("value"),"Address 3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr4, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address4(driver).getAttribute("value"),"Address 4 Value", logval);
			//==============================================================Steps To Add First Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Add Second Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall6 = true;
			StrControlNumber_2 = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(BankAccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Entity_Txt_Name, "NA","EFT","NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_2, 2)+ " "+ "Is Done");
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr1, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address1(driver).getAttribute("value"),"Address 1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr2, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address2(driver).getAttribute("value"),"Address 2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr3, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address3(driver).getAttribute("value"),"Address 3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr4, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address4(driver).getAttribute("value"),"Address 4 Value", logval);
			//==============================================================Steps To Add Second Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Add Third Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_ConditionalPaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall7 = true;
			StrControlNumber_3 = RMA_Functionality_Utility.RMA_ConditionalPaymentCorpAddition_Utility(BankAccountName, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, Entity_Txt_Name, "NA","EFT","NA",logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_3, 2)+ " "+ "Is Done");
			loggerval7 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr1, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address1(driver).getAttribute("value"),"Address 1 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr2, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address2(driver).getAttribute("value"),"Address 2 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr3, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address3(driver).getAttribute("value"),"Address 3 Value", logval);
			RMA_Verification_Utility.RMA_TextCompare(EntityAddress_Txt_Addr4, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_Address4(driver).getAttribute("value"),"Address 4 Value", logval);
			//==============================================================Steps To Add Third Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Add Fourth Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall8 = true;
			StrControlNumber_4 = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Txt_BankAccount, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType,logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_4, 2)+ " "+ "Is Done");
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			//==============================================================Steps To Add Fourth Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//==============================================================Steps To Add Fifth Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number Breadcrumb Present At Claimant Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentCorpAddition_Utility",0)+" To Create New Payment");
			testcall9 = true;
			StrControlNumber_5 = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Txt_BankAccount, PaymentCreation_Lst_PayeeType,PaymentCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType,FundsSplitDetails_Txt_Amount, PaymentCreation_Txt_LastName, PaymentCreation_Txt_DisType,logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_5, 2)+ " "+ "Is Done");
			loggerval9 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver).getAttribute("value"),"Check Status Value", logval);
			//==============================================================Steps To Add Fifth Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================
		
			//==============================================================Steps To Print Payments Started Here=========================================================================================================================================================================================================================================================================
			
			ContentToBeVerified=new Object[]{StrClaimNumber,StrControlNumber_1,StrControlNumber_2,StrControlNumber_3,BankAccountName, Entity_Txt_Name};
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintChecks","RMA_Suite07_PrintCheckUtility",0)+" To Print The Checks");
			testcall10 = true;
			RMA_Functionality_Utility.RMA_Suite07_PrintCheckUtility("RMA_QTPRegression_TC_124",BankAccountName,"EFT",ContentToBeVerified, logval1);//Print Checks Utility
			parentlogger.log(LogStatus.INFO, "The EFT File has been successfully created.");
			loggerval10 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Print Payments Completed Here=========================================================================================================================================================================================================================================================================

		}catch (Exception|Error e) {
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
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_EntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenClaimCorpCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ConditionalPaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall6 == true) && (loggerval6.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ConditionalPaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall7 == true) && (loggerval7.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ConditionalPaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall8 == true) && (loggerval8.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall9 == true) && (loggerval9.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall10 == true) && (loggerval10.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Suite07_PrintCheckUtility" + " " +  "And Hence The Test Case Is A Fail");
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
