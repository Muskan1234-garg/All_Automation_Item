package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed
import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_030
//Description    : Setting Of Bank Account Owner To Effective Trigger And Dates Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-08-28-2017
//===================================================================================================================================================================================================================================================================================================================================


public class RMA_QTPRegression_TC_030 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_030_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		testcall4 = false;	
		loggerval4 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_030";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here


		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_030_Bank Account Owner Setting To Effective Trigger And Dates_Validation",  "Setting Of Bank Account Owner To Effective Trigger And Dates Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String StrPrimaryWindowHandle;
			String StrPrimaryWindowHandle_1;
			String BankAccountCreation_Txt_BankAccountName;
			String ListElements;
			String BankAccountCreation_Txt_EffectiveStartDate;
			String BankAccountCreation_Txt_EffectiveEndDate;
			String GenClaimNumber;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_DateOfEvent_1;
			String GenClaimCreation_Txt_DateOfClaim_1;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_ClaimType;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_ServiceCode;
			int BankAccountCreation_Txt_ZipCode;
			//Local Variable Declaration Completed Here

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AQRMABank_");
			BankAccountCreation_Txt_EffectiveStartDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,-25,-3,"MM/dd/yyyy");
			BankAccountCreation_Txt_EffectiveEndDate =  RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,+2,+1,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfEvent =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-20,-3,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_DateOfEvent_1 =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-1,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim_1 = 	GenClaimCreation_Txt_DateOfEvent_1;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			ListElements = "Current System Date;Event Date;Claim Date;none";
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_12_QTPRegression_05.xlsx"); //Excel WorkBook RMA_Suite_12_QTPRegression_05 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_030", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_030			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_030", 1,1 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_030
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_030", 1,2 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_030
			GenClaimCreation_Txt_ServiceCode = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_030", 1,3 ); //Service Code Is Fetched From DataSheet RMA_QTPRegression_TC_030
			//Data Fetch From Excel WorkBook Is Completed Here

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();


			//================================================================Steps To Do Settings In General System Parameter Setup Page Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite22GenSysParaSetupsettings","RMA_Suite22_Utility",0)+" To Successfully Do Settings On General System Parameter Setup Page");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite22_Utility("RMA_QTPRegression_TC_030_Check", logval1);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Do Settings In General System Parameter Setup Page Is Completed Here================================================================================================================================================================================================

			//==============================================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall2 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 1, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==================================================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//==================================================================Steps To Navigate To Account Owner Tab Is Started Here=======================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Account Owner"), "Account Owner Link Tab On Sub Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_RdBtn_All(driver), "All Radio Button On Account Link Tab On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), "Effective Date Trigger List On Account Link Tab On Bank Account Page", logval);
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), ListElements, "Effective Date Trigger List On Payments Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), "Event Date", "Effective Date Trigger List", "Bank Account Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_EffectiveStartDate(driver), "Effective Start Date On Account Owner Link Tab Of Bank Account Page", BankAccountCreation_Txt_EffectiveStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_EffectiveEndDate(driver), "Effective End Date On Account Owner Link Tab Of Bank Account Page", BankAccountCreation_Txt_EffectiveEndDate, logval);
			//RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			//==================================================================Steps To Navigate To Account Owner Tab  Is Completed Here=======================================================================================================================================================================

			//==================================================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==================================================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//==================================================================Steps To Create First General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall3 = true;
			GenClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(GenClaimNumber, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ServiceCode(driver), "Service Code Lookup Button On General Claim Page", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCreation_Txt_ServiceCode, "Service Code Lookup Window On General Claims Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As General Claim Page Needs To Get Loaded");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "General Claim Creation Page", logval);
			//==================================================================Steps To Create First General Claim Is Completed Here=======================================================================

			//================================================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//=================================================================Steps To Navigate To Payment Page Is Completed Here=========================================================================================================================================================================================================

			//==================================================================Steps To Negatively Verify Values In Bank Account List On Payments Page Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval); 
			RMA_NegativeVerification_Utility.RMA_NegVerifyMultipleDataInWebList(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, "Bank Account List On Payments Page", logval);
			//==================================================================Steps To Negatively Verify Values In Bank Account List On Payments Page Is Completed Here===========================================================================================================================================================================================================================================================================

			//===============================================================Steps To Close The Payment Window  Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bank Account Needs To Get Verified");
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Button On Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			driver.switchTo().parentFrame();
			//=================================================================Steps To Close The Payment Window  Is Started Here===========================================================================================================================================================================================================================================================================

			//==================================================================Steps To Search The Created General Claim And Change Dates Is Started Here ===============================================================================================================================================================			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", GenClaimNumber, GenClaimNumber,DefaultFrameID,logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent_1, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim_1, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "No", logval);
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values
			//=================================================================Steps To Search The Created General Claim And Change Dates Is Completed Here ===============================================================================================================================================================

			//================================================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//=================================================================Steps To Navigate To Payment Page Is Completed Here=========================================================================================================================================================================================================

			//================================================================Steps To Verify Values In Bank Account List On Payments Page Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval); 
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifySelectedSingle_MultipleWebListData(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, "Bank Account List On Payments Page", logval);
			//================================================================Steps To Verify Values In bank Account List On Payments Page Is Completed Here==================================================================================================================================================================================================================

			//==========================================Steps To Refresh The RMA Application Is Started Here=========================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//==========================================Steps To Refresh The RMA Application Is Completed Here=============================================================================================================================================================================================================

			//===============================================================Steps To Navigate To UI Screen And Lookup The Created Bank Account Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			StrPrimaryWindowHandle = driver.getWindowHandle();
			//Navigation To UI Screen Is Done

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			driver.manage().window().maximize();
			//Lookup Window Maximized

			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Window Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver,"Account Name"), "Account Link On Lookup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Data Window Needs To Get Loaded After Sorting The Account Nmae Column");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccountLookupdata_Tbl(driver), BankAccountCreation_Txt_BankAccountName, "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			//===============================================================Steps To Navigate To UI Screen And Lookup The Created Bank Account Is Completed Here================================================================================================================================================================================

			//===============================================================Steps To Navigate To Account Owner Tab Of Bank Account Page Is Started Here=======================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Account Owner"), "Account Owner Link Tab On Sub Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_RdBtn_All(driver), "All Radio Button On Account Link Tab On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), "Effective Date Trigger List On Account Link Tab On Bank Account Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), "Claim Date", "Effective Date Trigger List", "bank Account Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_EffectiveStartDate(driver), "Effective Start Date On Account Owner Link Tab Of Bank Account Page", BankAccountCreation_Txt_EffectiveStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_EffectiveEndDate(driver), "Effective End Date On Account Owner Link Tab Of Bank Account Page", BankAccountCreation_Txt_EffectiveEndDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "No", logval);
			//===============================================================Steps To Navigate To Account Owner Tab And Save Account Is Completed Here=======================================================================================================================================================================

			//================================================================Steps To Close The  Bank Account Window Is Started Here=================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bank Account Needs To Get Verified");
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			//================================================================Steps To Close The  Bank Account Window Is Started Here=================================================

			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//========================================Steps To Search The Created General Claim And Change Dates Is Started Here ===============================================================================================================================================================			
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Toolbar Needs To Be Loaded");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", GenClaimNumber, GenClaimNumber,DefaultFrameID,logval);			
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As General Claim Page Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent_1, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim_1, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "No", logval);
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values
			//========================================Steps To Search The Created General Claim And Change Dates Is Completed Here ===============================================================================================================================================================

			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================

			//=========================================Steps To Verify Values In Bank Account List On Payments Page Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval); 
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifySelectedSingle_MultipleWebListData(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, "Bank Account List On Payments Page", logval);
			//=========================================Steps To Verify Values In bank Account List On Payments Page Is Completed Here==================================================================================================================================================================================================================

			//==========================================Steps To Refresh The RMA Application Is Started Here=========================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//==========================================Steps To Refresh The RMA Application Is Completed Here=============================================================================================================================================================================================================

			//===========================================Steps To Search The Created General Claim And Change Dates Is Started Here ===============================================================================================================================================================			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", GenClaimNumber, GenClaimNumber,DefaultFrameID,logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "No", logval);
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values
			//===========================================Steps To Search The Created General Claim And Change Dates Is Completed Here ===============================================================================================================================================================

			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================


			//=========================================Steps To Negatively Verify Values In Bank Account List On Payments Page Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval); 
			RMA_NegativeVerification_Utility.RMA_NegVerifyMultipleDataInWebList(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, "Bank Account List On Payments Page", logval);
			//=========================================Steps To Negatively Verify Values In Bank Account List On Payments Page Is Completed Here===========================================================================================================================================================================================================================================================================

			//==========================================Steps To Refresh The RMA Application Is Started Here=========================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//==========================================Steps To Refresh The RMA Application Is Completed Here=============================================================================================================================================================================================================

			//=========================================Steps To Navigate To UI Screen And Lookup  The Created  Bank Account Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			StrPrimaryWindowHandle_1 = driver.getWindowHandle();
			//Navigation To UI Screen Is Done

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle_1, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			driver.manage().window().maximize();
			//Lookup Window Maximized

			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Window Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver,"Account Name"), "Account Link On Lookup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Data Window Needs To Get Loaded After Sorting The Account Nmae Column");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccountLookupdata_Tbl(driver), BankAccountCreation_Txt_BankAccountName, "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle_1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			//=========================================Steps To Navigate To UI Screen And Lookup  The Created  Bank Account Is Completed Here===============================================================================================================================================================


			//========================================Steps To Navigate To Account Owner Tab Of Bank Account Page Is Started Here=======================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Account Owner"), "Account Owner Link Tab On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_RdBtn_All(driver), "All Radio Button On Account Link Tab On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), "Effective Date Trigger List On Account Link Tab On Bank Account Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_EffectiveDateTrigger(driver), "none", "Effective Date Trigger List", "bank Account Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_EffectiveStartDate(driver), "Effective Start Date On Account Owner Link Tab Of Bank Account Page", "1", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_EffectiveEndDate(driver), "Effective End Date On Account Owner Link Tab Of Bank Account Page", "1", logval);
			//RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			//========================================Steps To Navigate To Account Owner Tab And Save Account Is Completed Here=======================================================================================================================================================================
			//========================================Steps To Navigate To UI Screen And Lookup  The Created  Bank Account Is Started Here==================================================================================================================================================================================================


			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//========================================Steps To Search The Created General Claim And Change Dates Is Started Here ===============================================================================================================================================================			
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", GenClaimNumber, GenClaimNumber,DefaultFrameID,logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent_1, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim_1, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "No", logval);
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values
			//=========================================Steps To Search The Created General Claim And Change Dates Is Completed Here ===============================================================================================================================================================


			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here============================================================================================================================================================================================================

			//=========================================Steps To Verify Values In Bank Account List On Payments Page Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval); 
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifySelectedSingle_MultipleWebListData(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, "Bank Account List On Payments Page", logval);
			//=========================================Steps To Verify Values In bank Account List On Payments Page Is Completed Here==================================================================================================================================================================================================================

			//==========================================Steps To Refresh The RMA Application Is Started Here=========================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//==========================================Steps To Refresh The RMA Application Is Completed Here=============================================================================================================================================================================================================

			//========================================Steps To Search The Created General Claim And Change Dates Is Started Here ===============================================================================================================================================================			
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", GenClaimNumber, GenClaimNumber,DefaultFrameID,logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfEvent, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCreation_Txt_DateOfClaim, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "No", logval);
			// Date Of Claim And Date Of Event Text Boxes Are Provided Values
			//=========================================Steps To Search The Created General Claim And Change Dates Is Completed Here ===============================================================================================================================================================

			//========================================Steps To Navigate To Payment Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Payment Page Is Completed Here================================================================================================

			//=========================================Steps To Verify Values In Bank Account List On Payments Page Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval); 
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifySelectedSingle_MultipleWebListData(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccountCreation_Txt_BankAccountName, "Bank Account List On Payments Page", logval);
			//=========================================Steps To Verify Values In bank Account List On Payments Page Is Completed Here==================================================================================================================================================================================================================

			//==========================================Steps To Refresh The RMA Application Is Started Here=========================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//==========================================Steps To Refresh The RMA Application Is Completed Here=============================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);

			//========================================Steps To Revert Settings In General System Parameter Setup Page Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite22GenSysParaSetupsettings","RMA_Suite22_Utility",0)+" To Successfully Do Settings On General System Parameter Setup Page");
			testcall4 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite22_Utility("RMA_QTPRegression_TC_030_UnCheck", logval1);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Revert Settings In General System Parameter Setup Page Is Completed Here================================================================================================================================================================================================
			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite22_Utility" + " " +  "To Do Settings In New General System Parameter Setup And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "To Create New Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New Corporate General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite22_Utility" + " " +  "To Revert Settings In New General System Parameter Setup To Validate An Error Scenario And Hence The Test Case Is A Fail");
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

