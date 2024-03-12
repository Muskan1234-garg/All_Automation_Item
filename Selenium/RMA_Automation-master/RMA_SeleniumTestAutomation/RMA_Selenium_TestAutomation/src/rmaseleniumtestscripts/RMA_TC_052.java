package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumPOM.RMA_POM_Adjuster;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_052
//Description    : Hold Of Created Payments When Payment Limits Are Exceeded Is Validated
//Depends On TC  : TC_064, TC_051
//Revision       : 0.0 - KumudNaithani-02-01-2016
//=================================================================================================
public class RMA_TC_052 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	public static String StrClaimNumber_RMA_TC_052;
	public static String StrControlNumber_RMA_TC_052;
	public static String StrControlNumber_RMA_TC_01_052;
	static String StrScreenShotTCName;
	
@Test 
public void RMA_TC_052_Test () throws Exception, Error 
//Verify Payments Can Be Created And Is Going On Hold Because Of Exceeded Payment Limits
{
	try {
		parentlogger = reports.startTest("TC_052_Hold Of Created Payments On Payments Limits Exceed", "Hold Of Created Payments When Payment Limits Are Exceeded Is Validated");
		String StrAccept;
		String RMAApp_Login_Txt_UserName;
		String RMAApp_Login_Txt_Password;
		String StrErrorMessageExpected;
		String StrActualErrorMessage;
		String StrPrimaryWindowHandle;
		String StrClaimAdjustor_RMA_TC_052;
		String StrActualCheckStatus;
		String StrExpectedCheckStatus;
		String LoginUserNameActual;
		int AdjusterFrameid;
		String RMAApp_Payment_Lst_BankAccount;
		String RMAApp_Payment_Lst_PayeeType;
		String RMAApp_FundsSplitDetails_Lst_TransactionType;
		int RMAApp_FundsSplitDetails_Txt_Amount;
		String RMAApp_Payment_Txt_LastName;
		int RMAApp_FundsSplitDetails_Txt_Amount_1 ;
		String RMAApp_Payment_Txt_DistributionType;
		//Local Variable Declaration
		
		StrAccept = "Yes";
		StrScreenShotTCName = "TC_052";
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		loggerval3 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		testcall3 = false;
		
		StrClaimAdjustor_RMA_TC_052 = "ClaimAdjustor_RMA_TC_052";
		StrClaimAdjustor_RMA_TC_052 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4,StrClaimAdjustor_RMA_TC_052);
		StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval.";
		StrExpectedCheckStatus = "H Hold";
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_02_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 6); //UserName Fetched From DataSheet RMA_TC_052
		RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 7); //Password Fetched From DataSheet RMA_TC_052
		RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 0); //Bank Account Is Fetched From DataSheet RMA_TC_052
		RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 1); // Payee Type Is Fetched From DataSheet RMA_TC_052
		RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_TC_052
		RMAApp_FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_052", 1, 3); //Amount Is Fetched From DataSheet RMA_TC_052
		RMAApp_FundsSplitDetails_Txt_Amount_1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_052", 1, 5); //Amount For Second Payment Is Fetched From DataSheet RMA_TC_052
		RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 4); //LastName Is Fetched From DataSheet RMA_TC_052
		RMAApp_Payment_Txt_DistributionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 8); //Distribution Type Is Fetched From DataSheet RMA_TC_052

		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		//Application Is Logged Out
		
		//==============================================='LoginUser' Logging In Is Started==========================================================================================================================================================================================================================================================================
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName,0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password,0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
		// Application Is Logged In
	
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
		testcall1 = true;
		RMA_TC_002 dsnselection = new RMA_TC_002();
		dsnselection.RMAApp_DSNSelection();
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		// Data Source Is Selected 
		
		LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName Display", 0);
		// Correct User Is Logged In Verification Is Done
		//==============================================='LoginUser' Logging In Is Completed==========================================================================================================================================================================================================================================================================
		
		//===============================================General Claim Creation Is Started=========================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		driver.switchTo().parentFrame();
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New Claim");
		testcall2 = true;
		RMA_TC_004 generalClaim = new RMA_TC_004(); //General Claim Function Is Instantiated
		StrClaimNumber_RMA_TC_052 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber
		parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_052, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		// New Claim Is Created
		//===============================================General Claim Creation Is Completed=========================================================================================================================================================================================================================================================================
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim Expander On Left Hand Navigation Tree",0);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
		//Left Hand Navigation Tree Is Expanded
		
		WebElement E = RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Adjuster(driver);
		RMA_Navigation_Utility.RMA_ObjectRightClick(E, "Adjustor Link On Left Hand Navigation Tree" , 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AdjustorAddNew(driver), "Add New Link For Adjuster",0);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Page To Create New Adjustor Is Getting Loaded ");
		// Add New Adjustor Menu Option Is Selected
		
		AdjusterFrameid = RMA_GenericUsages_Utility.RMA_FrameNavigation("adjuster");
		driver.switchTo().frame(AdjusterFrameid);// A Switch To Adjuster Frame Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To Adjustor Frame Is Done");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver), "Adjuster LastName TextBox On Created General Claim's Adjuster Page", StrClaimAdjustor_RMA_TC_052,0); 
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_AddNew(driver), "Add New Button On General Claim's Adjuster Page",0);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To Main Adjustor Screen From Add New Adjustor Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(AdjusterFrameid); //A Switch To The Frame Containing Adjuster Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To Adjustor Frame Is Done After Navigating Back From Add New Adjustor Screen");
		// Adjustor Last Name Is Set
		
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_RiskMasterLogin(driver), "RiskMaster Login Button On General Claim's Adjuster Page",0);
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to System User window
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_SysUsersFirstName(driver), "Adjuster First Name TextBox On System Users Window On Adjuster Creation Page", "curradj",0); 
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Value Is Entered In First Name TextBox On System Users Window On Adjuster Creation Page");
		RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Tbl_SystemUsers(driver), "curradj", "WEBCHECKBOX",0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_SystemUsers_Ok(driver), "OK Button On System User Table On General Claim's Adjuster Page",0);
		//RMA Login For The Created Adjustor Is Selected
		
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added After Selecting The RMA Login For The Created Adjustor");
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To Main Adjustor Screen After Selecting The RMA Login For The Created Adjustor Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(AdjusterFrameid); //A Switch To The Frame Containing Adjuster Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To Adjustor Frame Is Done");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Img_Save(driver), "Save Image On General Claim's Adjuster Page",0);//Save On Adjuster is clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Newly Created Adjustor Is Getting Saved");
		//Adjuster addition is completed here		
	
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_FinancialReserves(driver), "Financial/Reserves Link On Left Hand Navigation Tree",0); //Created General Claim's Financial/Reserves Option Is Selected //Created General Claim's Financial/Reserves Option Is Selected
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Financial/Reserves Link On Left Hand Navigation Tree Is Clicked");
		int iteraor =  RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");
		driver.switchTo().frame(iteraor); //A Switch To The Frame Containing Financial/Reserves Control Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As A Switch To Financial/Reserves Frame Is Done");
		
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Create New Payment");
		testcall3 = true;
		StrControlNumber_RMA_TC_052 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_052, 2)+ " "+ "Is Done");
		loggerval3 = logger.toString();
		parentlogger.appendChild(logger);
		//New Payment Is Done
		
		StrActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrExpectedCheckStatus, StrActualCheckStatus, "Correct Check Status",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
		StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
		RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
		
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Of $2000 Going On Hold Verification", StrScreenShotTCName)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financial Image On Payment Creation Page",0);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, 0, "Wait Is Added As Back To Financials Image Is Clicked");
		
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_PaymentAddition_Utility To Create New Payment");
		testcall4 = true;
		StrControlNumber_RMA_TC_01_052 = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_1, RMAApp_Payment_Txt_LastName,RMAApp_Payment_Txt_DistributionType,1);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_TC_01_052, 2)+ " "+ "Is Done");
		loggerval4 = logger.toString();
		parentlogger.appendChild(logger);
		//New Payment Is Done
		
		StrActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrExpectedCheckStatus, StrActualCheckStatus, "Correct Check Status",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);
		StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");
		RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display",0);
		
		parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Of $2500 Going On Hold Verification", StrScreenShotTCName)));
	} catch (Exception|Error e) {
		
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
		
		if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		
		}
		else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $2000"  + " " +  "And Hence Payment Was Not Successful");
		parentlogger.appendChild(logger);
		}
		else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Creating Payment of $2500"  + " " +  "And Hence Payment Was Not Successful");
		parentlogger.appendChild(logger);
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
		}
				
	} catch (Exception |Error e) {
		
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	
	finally
	{
		reports.endTest(parentlogger);
		reports.flush();
	}
}
}
