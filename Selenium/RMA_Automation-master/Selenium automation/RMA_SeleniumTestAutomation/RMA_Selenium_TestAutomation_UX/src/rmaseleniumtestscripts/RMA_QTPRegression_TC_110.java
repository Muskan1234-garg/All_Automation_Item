package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_110
//Description    : Verify The Setting "Set Reserve Balance To Zero" Is Not In Effect For The Recovery Reserve Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-10-20-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_110 extends RMA_TC_BaseTest {	
	
	public static String StrControlNumber_QTPRegression_TC_110;
	
	@Test
	public void RMA_QTPRegression_TC_110_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_110_Verify The Setting 'Set Reserve Balance To Zero' Is Not In Effect For The Recovery Reserve", "Verify The Setting 'Set Reserve Balance To Zero' Is Not In Effect For The Recovery Reserve Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");		
			
			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_110";
			testcall1 = false;	
			loggerval1 = "NotInitialized";	
			testcall2 = false;	
			loggerval2 = "NotInitialized";	
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;		
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
						
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================						
			String LineOfBussinessParameterSetup_Lst_LOBType;	
			String ReserveCreation_Lst_ReserveType;	
			String ReserveCreation_Lst_ReserveType_1;
			String ReserveCreation_Lst_ReserveStatus;
			int ReserveCreation_Txt_ReserveAmount;
			int ReserveCreation_Txt_ReserveAmount_1;
			String PaymentCreation_Lst_BankAccount;
			String PaymentCreation_Lst_PayeeType;							
			String FundsSplitDetails_Lst_TransactionType;	
			String FundsSplitDetails_Lst_TransactionType_1;
			String PaymentCreation_Txt_DisType;		
			int FundsSplitDetails_Txt_Amount;	
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
			
			//Region =====================================================Variable Initialization Started Here===========================================================================================================
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//EndRegion ==================================================Variable Initialization Completed Here=============================================================================================================
						
			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite18_QTPRegression_10.xlsx"); //Excel WorkBook RMA_Suite18_QTPRegression_10 IS Fetched To Retrieve Data			
			LineOfBussinessParameterSetup_Lst_LOBType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 0); //LOB Type Is Fetched From DataSheet RMA_QTPRegression_TC_110
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 1); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_110
			GenClaimCreation_Txt_ClaimStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 2); // Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_110
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 3); // Department Is Fetched From DataSheet RMA_QTPRegression_TC_110						
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 4); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_110
			ReserveCreation_Lst_ReserveStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 5); //Reserve Status Is Fetched From DataSheet RMA_QTPRegression_TC_110
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_110", 1, 6); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_110
			ReserveCreation_Lst_ReserveType_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 7); //Reserve Type_1 Is Fetched From DataSheet RMA_QTPRegression_TC_110
			ReserveCreation_Txt_ReserveAmount_1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_110", 1, 8); //Amount_1 Is Fetched From DataSheet RMA_QTPRegression_TC_110			
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 9); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_110									
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 10); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_110									
			PaymentCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 11); //BankAccount Is Fetched From DataSheet RMA_QTPRegression_TC_110
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 12); //Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_110
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_110", 1, 13); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_110
			FundsSplitDetails_Lst_TransactionType_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_110", 1, 14); //Transaction Type_1 Is Fetched From DataSheet RMA_QTPRegression_TC_110
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================
					
			//Region =====================================================Steps To Select General System Parameter And Reserve Options Settings Is Started Here=============================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();			
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite21_Check_Utility(StrScreenShotTCName,LineOfBussinessParameterSetup_Lst_LOBType, logval);			
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();	
			//EndRegion ==================================================Steps To Select General System Parameter And Reserve Options Settings Is Completed Here=============================================================
				
			//Region =====================================================General Claim Creation Is Started Here=======================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation", "RMA_GenClaimCorpCreation",0)+" To Create GeneralClaim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim,GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New General Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion ==================================================General Claim Creation Is Completed Here=====================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Create Reserve For Created General Claim Is Started Here==========================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			
			//Region =====================================================Steps To Create REC Recovery Reserve  Is Started Here=================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Medical Reserve ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_ReserveStatus, ReserveCreation_Lst_ReserveType, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Medical Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount),2) + " " + "And Claim Number::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(StrClaimNumber), 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//EndRegion ==================================================Steps To Create REC Recovery Reserve Creation Is Completed Here=======================================================================================

			//Region =====================================================Steps To Create Expense Reserve  Is Started Here===================================================================================================			
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Expense Reserve ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount_1, ReserveCreation_Lst_ReserveStatus, ReserveCreation_Lst_ReserveType_1, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Expense Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_1, 2) + " " + "And Amount::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount_1),2) + " " + "And Claim Number::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(StrClaimNumber), 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//EndRegion ==================================================Steps To Create Expense Reserve Is Completed Here=======================================================================================
			
			//EndRegion ==================================================Steps To Create Reserve For Created General Claim Is Completed Here==========================================================================================================
						
			//Region =====================================================Steps To Add Collection For Created Claim Is Started Here==========================================================================================================
			if (logval1 == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Collection");	
			}
			else
			{
				logger = reports.startTest("<span id='AddNewCollection'>Add New Collection</span> ", "User Makes A New Collection");
			}
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CollectionCorpAddition","RMA_CollectionCorpAddition_Utility",0)+" Is Called To Create A Collection ");
			testcall3 = true;		
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();			

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_AddCollection(driver), "Add Collection Image On Financial Reserve Page",logval1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), PaymentCreation_Lst_BankAccount, "Bank Account Drop Down List", "Collection Creation Page",logval1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PaymentCreation_Lst_PayeeType, "Payee Type Drop Down List", "Collection Creation Page",logval1);

			Thread.sleep(8000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_LastName(driver), "Last Name Look Up Image Button On Payment Creation Page",logval1);				
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval1);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Added For Org Hierarchy Last Name Window");
			driver.switchTo().frame(0);
			driver.findElement(By.id("orgpanel"));			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_List_OrgLevel(driver), "Department", "Org Hierarchy Level DropDown List on Org Hierarchy Window Popup" , "Funds Details Model Popup On Collection Creation Page",logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_Lnk_LastName(driver),"Last Name LookUp Window On Payment Creation Page",logval1);
			Thread.sleep(8000);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On Collection Creation Page",logval1);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PaymentCreation_Txt_DisType, "Distribution Type Link On Distribution Selection Window", logval1);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Collection Creation Page",logval1);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Payment Button On Collection Creation Page",logval1);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveCreation_Lst_ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Collection Creation Page", logval1);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Collection Creation Page", String.valueOf(FundsSplitDetails_Txt_Amount),logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Collection Creation Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Transaction Type Is Clickable In Collection Page");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), FundsSplitDetails_Lst_TransactionType, "Transaction Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Collection Creation Page",logval1);// OK Button Is Clicked  On Funds Details Window On Collection Creation Page
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval1);
			// Collection Is Added And Funds Split Details View Is Closed
			
			//Region =====================================================Steps To Add Second Funds (Expense) Is Started Here===========================================================================================================================================================================================================================================================================					
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Collection Button On Collection Creation Page",logval1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveCreation_Lst_ReserveType_1, "Resreve Type DropDown List" , "Funds Details Window On Collection Creation Page",logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Collection Creation Page", logval1);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Collection Creation Page", String.valueOf(FundsSplitDetails_Txt_Amount),logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Window On Collection Creation Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Transaction Type Is Clickable In Collection Page");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), FundsSplitDetails_Lst_TransactionType_1, "Transaction Type DropDown List" , "Funds Details Window On Collection Creation Page",logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Collection Creation Page",logval1);// OK Button Is Clicked  On Funds Details Window On Collection Creation Page
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval1);
			//EndRegion ==================================================Steps To Add Second Funds (Expense) Is Completed Here===========================================================================================================================================================================================================================================================================


			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Collection Creation Page", logval1);
			//Save Button Is Clicked To Save The Collection

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Collection Creation Page",logval1);// Transaction Tab On Transaction Page Is Clicked
			StrControlNumber_QTPRegression_TC_110 = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_QTPRegression_TC_110, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);	
			if (logval1 == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Collection Creation", "New Collection Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Collection Creation", "New Collection Is Created Successfully")));
			}
			//EndRegion ==================================================Steps To Add Collection For Created Claim Is Completed Here=======================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 		
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On General Claim Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Closed", "Claim Status LookUp Window On General Claim Creation Page", logval);
			Thread.sleep(8000);
						
			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			
			//Region =====================================================Steps To Verify REC Recovery Reserve Amount, Status Is Started Here=================================================================================================	
			String []ExpectedColHeadersToBeVerified={"Balance","Paid","Collection","Incurred","Status"};		
			String []ExpectedValuesToBeVerified={"$0.00", "$0.00", "$"+FundsSplitDetails_Txt_Amount+ ".00", "$"+FundsSplitDetails_Txt_Amount+ ".00", "C - Closed"};
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table", logval);
			RMA_GenericUsages_Utility.RMA_CheckVerificationNGGridColumnHeader(ExpectedColHeadersToBeVerified, "Reserve", logval);			
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Lst_ReserveType, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, logval);
			//EndRegion ==================================================Steps To Verify REC Recovery Reserve Amount, Status Is Started Here=======================================================================================
			
			//Region =====================================================Steps To Verify Expense Reserve Amount, Status Is Started Here=================================================================================================
			String []ExpectedColHeadersToBeVerified_1 = {"Balance","Paid","Collection","Incurred","Status"};		
			String []ExpectedValuesToBeVerified_1 = {"$0.00", "$0.00", "$"+FundsSplitDetails_Txt_Amount+ ".00", "$0.00", "C - Closed"};
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table", logval);
			RMA_GenericUsages_Utility.RMA_CheckVerificationNGGridColumnHeader(ExpectedColHeadersToBeVerified_1, "Reserve", logval);			
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Lst_ReserveType_1, "Reserve UX Grid",ExpectedColHeadersToBeVerified_1, ExpectedValuesToBeVerified_1, logval);
			//EndRegion ==================================================Steps To Verify Expense Reserve Amount, Status Is Started Here=======================================================================================
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_GenClaimCorpCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}	
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim And Hence The Test Case Is A Fail");
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
