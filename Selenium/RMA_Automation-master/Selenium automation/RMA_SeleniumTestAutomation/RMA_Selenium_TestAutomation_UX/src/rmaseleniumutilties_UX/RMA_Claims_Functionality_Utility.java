package rmaseleniumutilties_UX;

import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_CombinedPayment;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
//RMA Package Import Completed

public class RMA_Claims_Functionality_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String ReturnValue;

	//==================================================================================================================================================================================
	//FunctionName 		: RMA_BankAccount_AddEdit_Utility
	//Description  		: Enables The User To Add Bank Account
	//Input Parameter 	: BankAddr1, BankCity, BankState, ZipCode, AccountName, AccountType, NextCheck, BankOwner,
	//			  		: Case Variable To Indicate User Action (Create and Edit BankAccount), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
	//Revision			: 0.0 - RenuVerma-10-17-2016          
	//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info  
	//					: 0.2 - AbhishekRai-02-27-2018 Bank Account Creation On UX Screen   
	// ====================================================================================================================================================================================
	//Note: User Must Pass "NA" or 00 For Optional Parameter If No Valid Value Is Present
	public static String RMA_BankAccount_AddEdit_Utility(String Case, String BankAddr1,String BankCity,String BankState, int ZipCode,int BankAccountNo, String AccountName, String AccountType, int NextCheck, String BankOwner, boolean AdditionalParameter,String BankAddr2,int logval) throws Exception, Error
	{
		String BankName;
		ReturnValue=null;
		//Variable Declaration
		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User can "+Case+" Bank Account");
			}
			else
			{	
				logger = reports.startTest("<span id='BankAccount'>Bank Account Addition </span>", "User can "+Case+" Bank Account");
			}
			switch (Case){
			case "Create":
			{
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);						

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);	
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); // Wait For UX Page Load Bar To Disappear					
				BankName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "ABank_");

				CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bank Name Value Is Provided");
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver)));
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver), "Bank Name TextBox On Bank Account Page", BankName, logval);
				globalWait.until(ExpectedConditions.attributeToBe(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver),"value",BankName));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_Adderss1(driver), "Bank Address 1 TextBox On Bank Account Page", BankAddr1, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankCity(driver), "Bank City TextBox On Bank Account Page", BankCity, logval);		
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankState(driver), "Bank State TextBox On Bank Account Page", BankState, logval);		
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Entered In Bank State TextBox On Bank Account Page");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankZipCode(driver), "Bank Zip Code TextBox On Bank Account Page", String.valueOf(ZipCode), logval);		
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver), "Bank Account No TextBox On Bank Account Page", String.valueOf(BankAccountNo), logval);		
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver), "Account Name TextBox On Bank Account Page", AccountName, logval);		
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountType(driver), "Account Type TextBox On Bank Account Page", AccountType, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Entered In Account Type TextBox On Bank Account Page");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver), "Next Check Number TextBox On Bank Account Page", String.valueOf(NextCheck), logval);					
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Bank Account Creation Page", logval);
				RMA_Verification_Utility.RMA_TextCompare(AccountName, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
				ReturnValue=RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value");
				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Created Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				else
				{
					logger.log(LogStatus.PASS, "Created Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				break;
			}
			case "Edit":
			{
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);					
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountType(driver), "Account Type TextBox On Bank Account Page", AccountType, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver), "Next Check Number TextBox On Bank Account Page", String.valueOf(NextCheck), logval);	
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Bank Account Creation Page", logval);
				RMA_Verification_Utility.RMA_TextCompare(AccountName, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
				RMA_Verification_Utility.RMA_TextCompare(String.valueOf(NextCheck), RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver).getAttribute("value") , "Check Number", logval);
				ReturnValue=RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver).getAttribute("value");
				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Edited Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				else
				{
					logger.log(LogStatus.PASS, "Edited Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				break;
			}
			default:
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CheckStocksCreation_Utility
	//Description  		: Enables The User To Create Check Stocks
	//Input Parameter 	: Driver Of The Type WebDriver, Stockname, FontName Of Type String, FontSize Of Type Integer.
	//Revision			: 0.0-NidhiJha-09-06-2017
	//Revision			: 0.1-AnubhutiVyas-04-04-2018 Check Stock is now move to UX Screen
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_CheckStocksCreation_Utility(String Stockname,String FontName, int FontSize ,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A Check Stock");
			}else{	
				logger = reports.startTest("<span id='CheckStocks'>Check Stocks Creation</span>", "User Creates A Check Stock");
			}

			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_CheckStock(driver), "Check Stock Button On Bank Account Page", logval);			
			//driver.switchTo().parentFrame();
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("checkstock");
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Check Stock Frame Needs To Be Loaded");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_CheckStocksStockName(driver), "Stock Name Text Box On Check Stocks Page", Stockname, logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_CheckStocksFontName(driver), FontName, "Font Name ListBox", "Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is added As Font Name Needs To Get Populated");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_CheckStocksFontSize(driver), FontSize, "Font Size ListBox", "Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As Font Size Needs To Get Populated");
			RMA_Functionality_Utility.RMA_GenericSave_Utility("checkstock", false, "NA", "Check Stock Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Check Stocks Page", logval);// Save Button Is Clicked
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Check Stocks Creation", "New Check Stock Is Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Check Stocks Creation", "New Check Stock Creation Is Created")));
			}
		}
		catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Check Stocks Creation Fail", "Check Stocks Is Not Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Check Stocks Creation Fail", "Check Stocks Is Not Created")));
			}

			throw (e);
		}
		finally
		{				
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			
		}
	}

	//==================================================================================================================================================================================
	//FunctionName 		: RMA_CombinedPayee_Add_Utility
	//Description  		: Enables The User To Add Combined Payee
	//Input Parameter 	: BankAccount:Bank Account Of Type String Enables The User To Provide Bank Account Name For Combined Payee Creation
	//                    PayInterval : PayInterval Of Type String Enables The User To Provide Pay Interval For Combined Payee Creation
	//Revision			: 0.0 - AnubhutiVyas-08-14-2017
	//Revision			: 0.1 - AnubhutiVyas-04-04-2018 Combine Payee is move to UX screen   
	// ====================================================================================================================================================================================
	public static String RMA_CombinedPayee_Add_Utility(String BankAccount,String CombinedPayment_Txt_LastName, String PayInterval,int logval) throws Exception, Error
	{
		String CombinedPaySetUp_Txt_StartDate;
		String CombinedPaySetUp_Txt_NxtSchdDate;
		String CombinedPaySetUp_Txt_NxtSchdPrint;
		//Local Variable Declaration

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Combined Payee Setup Is Created");
			}
			else
			{	
				logger = reports.startTest("<span id='CombinedPayee'>Combined Payee Addition</span>", "Combined Payee Setup Is Created");
			}

			CombinedPaySetUp_Txt_StartDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			CombinedPaySetUp_Txt_NxtSchdDate = 	RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,-1,0,"MM/dd/yyyy");;
			CombinedPaySetUp_Txt_NxtSchdPrint =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,-1,0,"MM/dd/yyyy");
			//Local Variable Initialization Is Completed

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-CombinedPayment", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("combinedpayment");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added Combined Frame Needs To Be Loaded");
						
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Lst_BankAccount(driver), BankAccount, "Bank Account List Box", "Bank Account On Combined Payment Page",logval);
			//Combined Payment Screen Is Opened And Bank Account Is Selected
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_LastName(driver), "Last Name TextBox On Combined Payment Page", CombinedPayment_Txt_LastName, logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added Last Name Needs To Be Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_CombinedPayment.RMAApp_CombinePayment_Tab_ScheduleSetup(driver), "Schedule Setup Tab On Combined Payment Setup Page",logval);			
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_PayInterval(driver), "Pay Interval Text Box On Combined Payment  Page", PayInterval, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Value Is Entered In Pay Interval Text Box");
			//Value Is Entered In Pay Interval Text Box

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_Startdate(driver), "Starting On Date TextBox On Combined Payment Setup Page",logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_Startdate(driver), "Starting On Date TextBox On Combined Payment Setup Page", CombinedPaySetUp_Txt_StartDate, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchDate(driver), "Next Scheduled Date TextBox On Combined Payment Setup Page",logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchDate(driver), "Next Scheduled Date TextBox On Combined Payment Setup Page", CombinedPaySetUp_Txt_NxtSchdDate, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchdPrint(driver), "Next Schedule Print Date TextBox On Combined Payment Setup Page",logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchdPrint(driver), "Next Schedule Print Date TextBox On Combined Payment Setup Page", CombinedPaySetUp_Txt_NxtSchdPrint, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtPrintOverride(driver), "Next Print Override Date TextBox On Combined Payment Setup Page",logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.CombinedPaymentSetupFrame, false, "NA", "Combined Payment SetUp Page", logval);// Save Button Is Clicked

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Combined Payee Creation", "New Combined Payee Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Combined Payee Creation", "New Combined Payee Is Created Successfully")));
			}
		} catch (Exception|Error e) 
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "General Claim Creation Fail", "New General Claim Is Not Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "General Claim Creation Fail", "New General Claim Is Not Created")));
			}
			throw (e);
		}
		return CombinedPayment_Txt_LastName;
	}

}
