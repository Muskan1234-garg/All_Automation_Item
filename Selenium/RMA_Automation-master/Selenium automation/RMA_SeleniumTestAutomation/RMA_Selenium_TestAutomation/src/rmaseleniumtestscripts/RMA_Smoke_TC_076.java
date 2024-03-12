package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_BankAccount;
import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_LOB;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_076_GC
//Description    : Successful Select Sub Bank Account From Funds window When Use Sub Bank Accounts Check box Is Selected In Utilities Is Validated
//Depends On TC  : RMA_Smoke_TC_075(General System Parameter Setting And SubBank Account Details)
//Revision       : 0.0 - RenuVerma-01-02-2017
//=================================================================================================

public class RMA_Smoke_TC_076 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_076_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_076_Select Sub Bank Account From Funds Window", "Successful Select Sub Bank Account From Funds window When Use Sub Bank Accounts Check box Is Selected In Utilities Is Validated ");
			parentlogger.assignAuthor("Renu Verma");

			String StrPrimaryWindowHandle;
			String StrClaimNaumberActual;
			String Payment_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			int FundsSplitDetails_Txt_Amount;
			String Payment_Txt_LastName;
			String Payment_Txt_DisType;
			String StrControlNumber;
			String CurrentFrameID;
	
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_076";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
			testcall3 = false;
			loggerval3 = "NotInitialized";
		
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
			Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_076", 1, 0); // Payee Type Is Fetched From DataSheet RMA_TC_076_GC
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_076", 1, 1); //Transaction Type Is Fetched From DataSheet RMA_TC_076_GC
			FundsSplitDetails_Txt_Amount= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_076", 1, 2); //Amount Is Fetched From DataSheet RMA_TC_076_GC
			Payment_Txt_DisType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_076", 1, 4); //Distribution Type Is Fetched From DataSheet RMA_TC_076_GC
			Payment_Txt_LastName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_076", 1, 3); //Last Name Is Fetched From DataSheet RMA_TC_076_GC
			
			//===========================================================Disabling Setting Of 'Use Reserve Work-sheet' On LOB Page If Enabled Is Started===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-LineOfBusinessParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Lst_LineOfBusiness(driver), "GC - General Claims", "Line Of Business Weblist", "Line Of Business Parameter Setup", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_CheckForInsufficientReserveFnd(driver), "uncheck", "Check for Insufficient Reserve Funds Checkbox", "Line Of Business Parameter Setup", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseReserveWorsheet(driver), "uncheck", "Use Reserve WorkSheet Checkbox", "Line Of Business Parameter Setup", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("LOBParameters", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On General System Parameter Setup Page. ", logval);
			//===========================================================Disabling Setting Of 'Use Reserve Work-sheet' On LOB Page If Enabled Is Ended===========================================================
		
			//===============================================Search Of The Claim Created In RMA_Smoke_TC_002 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_Home.RMAApp_Genereic_Txt_ClaimNum(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(StrClaimNumber_002, StrClaimNaumberActual , "Claim Number", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");		
			//===============================================Search Of The Claim Created In RMA_Smoke_TC_002 Is Completed=====================================================================================================
		
			/*===========================================================New Payment Creation Is Started Here=======================================================================================================================================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lbl_BankAccount(driver)));
			String BankType= RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lbl_BankAccount(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare("Sub Bank Account", BankType, "Bank Type Which Should Be Sub Bank Account", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Payment Creation Page",logval1);// Close Button Is Clicked On Payment Creation Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			parentlogger.log(LogStatus.INFO,"HTML","Following Function Is Called :: " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition", "RMA_PaymentAddition_Utility",0)+ " To Create New Payment");
			testcall1 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMA_Smoke_TC_075.StrEditedSubBankAccountName_075, Payment_Lst_PayeeType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, Payment_Txt_LastName, Payment_Txt_DisType, logval1);	
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Creation Against An Already Created Reserve", StrScreenShotTCName)));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Financial Reserve Page. ", logval);
			/*===========================================================New Payment Creation Is Completed Here=======================================================================================================================================================================================*/
		
			//	=======================================================Delete Sub Bank Account/Bank Account Created On RMA_Smoke_TC_075 Is Started Here================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(RMA_Smoke_TC_075.StrBankAccountNumber_075), " Bank Account Lookup Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_BankAccount.RMAApp_BankAccount_Img_SubAccounts(driver), "Sub Bank Account Image on Maintenance-->Bank Account Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Sub Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(RMA_Smoke_TC_075.StrEditedSubBankAccountNumber_075), " Sub Bank Account Lookup Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					
			parentlogger.log(LogStatus.INFO,"Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Sub Bank Account "+ color.RMA_ChangeColor_Utility(String.valueOf(RMA_Smoke_TC_075.StrEditedSubBankAccountNumber_075), 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Bank Account -->Sub Bank Account Page", logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Sub Bank Account Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(RMA_Smoke_TC_075.StrEditedSubBankAccountNumber_075), 2));
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance--> Bank Account--> Sub Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, String.valueOf(RMA_Smoke_TC_075.StrEditedSubBankAccountNumber_075)), String.valueOf(RMA_Smoke_TC_075.StrEditedSubBankAccountNumber_075)+" Link OnMaintenance--> Bank Account--> Sub Bank Account 'Lookup Result' Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Sub Bank Account", logval);
			parentlogger.log(LogStatus.INFO,"Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Bank Account "+ color.RMA_ChangeColor_Utility(String.valueOf(RMA_Smoke_TC_075.StrBankAccountNumber_075), 2));
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Bank Account Page", logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(RMA_Smoke_TC_075.StrBankAccountNumber_075), 2));
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameID);	
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance--> Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, String.valueOf(RMA_Smoke_TC_075.StrBankAccountNumber_075)), String.valueOf(RMA_Smoke_TC_075.StrBankAccountNumber_075)+" Link OnMaintenance--> Bank Account 'Lookup Result' Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//=======================================================Delete Sub Bank Account/Bank Account Created On RMA_Smoke_TC_075 Is Ended Here================================================
			
			//======================================================= Revert Setting Of Sub Bank Account On General System Parameter Page Is Started ================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Funds Settings", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(driver), "uncheck", "Use Sub Bank Accounts Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(driver), "uncheck", "Use Account Owner for Funds Checkbox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//======================================================= Revert Setting Of Sub Bank Account On General System Parameter Page Is Ended ================================================

				
		}catch(Exception|Error e)
		{
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PaymentAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
		}
	}		
}

