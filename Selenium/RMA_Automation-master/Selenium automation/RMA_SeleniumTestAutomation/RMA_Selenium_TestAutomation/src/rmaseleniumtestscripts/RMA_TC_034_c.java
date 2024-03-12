package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentParameterSetUp;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//==============================================================================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_034
//Description    : TC_034_Verify user is able to approve the transaction and diary is sent to the user who created this transaction
//Depends On TC  : TC_011, TC_028, TC_029 & TC_033
//Revision       : 0.0 - ImteyazAhmad-01-20-2016 
//Modified By    : 0.1 - KumudNaithani-08-09-2016
//				 : Modified To Include Change Related To UX Screen Change, Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching, Description Correction
//==================================================================================================================================================================================================================================================================================================================================================================================

public class RMA_TC_034_c extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_TC_034_Test () throws Exception, Error

{
	try {
		parentlogger = reports.startTest("TC_034_Email And Diary Received By User Who Created Hold Transaction ", "Verify user is able to approve the transaction and diary/email is sent to the user who created this transaction");
		String StrAccept;
		String RMAApp_Login_Txt_UserName;
		String RMAApp_Login_Txt_Password;
		String AttachedRecord;
		String TaskName;
		String ParentRecord;
		String TaskNameVal;		
		String LoginUserNameActual;
		String StrCheckStatusActual;
		String StrCheckStatusExpected;
		//Local Variable Declaration Completed
		
		StrAccept = "Yes";
		AttachedRecord = "FUNDS:"+" "+RMA_TC_029.StrControlNum_029;
		TaskName = "Check Approved";
		TaskNameVal = "Payments:"+" "+ RMA_TC_029.StrControlNum_029;
		ParentRecord = "Claim:"+RMA_TC_029.StrClaimNumber_029;
		StrCheckStatusExpected = "R Released";
		testcall1 = false;
		loggerval1 = "NotInitialized";
		
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_034", 1, 0); //UserName Fetched From DataSheet RMA_TC_034
		RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_034", 1, 1); //Password Fetched From DataSheet RMA_TC_034
		
		
		//==============================================='LoginUser' Logging In Is Started========================================================================================================================================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Button On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		//Application Is Logged Out
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
		//Application Is Logged In
		
		parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select DSN :: RMA_TC_002 ");
		testcall1 = true;
		RMA_TC_002 dsnselection = new RMA_TC_002();
		dsnselection.RMAApp_DSNSelection();
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		//DSN Is Selected 
		
		LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "LoggedIn UserName", 0); //Login User is Verified
		//==============================================='LoginUser' Logging In Is Completed========================================================================================================================================================================================================================================================================================================================================================================================
		
		//===============================================Existence Of Payment (Created In TC_029) Approval Diary In Diaries Page Validation Is Started======================================================================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiarieszDiaryListDiaryListDiary ListUI/Diaries/Diary ListFalse"); 
		RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page", "Check Approved", "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
		driver.switchTo().parentFrame();
		RMA_Functionality_Utility.RMA_DiaryRecordsCheck_Utility(AttachedRecord, 1, 7, 0, TaskName,  TaskNameVal, ParentRecord, "Not Required", "Not Required", false, logval);
		//Values In The Diaries Table Displayed In The Default RMA Application Page Are Verified
		
		//================================================Existence Of Payment (Created In TC_029) Approval Diary In Diaries Page Validation Is Completed=======================================================================================================================================================================================================================================================================================================================
		//================================================Payment Check Status Verification Is Started=========================================================================================================================================================================================================================================================================================================================================================================
		
		driver.switchTo().parentFrame();
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
		RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search_Funds", "Check Control Number Text Box", RMA_TC_029.StrControlNum_029, RMA_TC_029.StrControlNum_029, "Transaction", "num", 2, logval);
		StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);
		//================================================Payment Check Status Verification Is Completed=========================================================================================================================================================================================================================================================================================================================================================================	
		
		//===============================================Disabling Of Required Payment Parameter Set Up Settings (Enabled In TC_028) Is Started=======================================================================================================================================================================================================================================================================================================================================
		
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits are exceeded CheckBox ", "Payment Parameter Setup Page",0);   // Check box "Payment Limits are exceeded" is checked on Payment Parameter Setup
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisor Approval CheckBox", "Payment Parameter Setup Page",0);  // Check box "Supervisor Approval" is checked on Payment Parameter Setup
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster(driver), "uncheck", "Use Current Adjuster Supervisory Chain CheckBox", "Payment Parameter Setup Page",0); //Check box "Use Current Adjuster Chain " is checked on Payment Parameter Setup
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(driver), "uncheck", "Enable Payment Approval Diary CheckBox ", "Payment Parameter Setup Page",0); //Check box "Enable Payment Approval Diary " is checked on Payment Parameter Setup
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(driver), "uncheck", "Enable Payment Approval Email CheckBox", "Payment Parameter Setup Page",0); //Check box "Enable Payment Approval Email " is checked on Payment Parameter Setup
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor CheckBox", "Payment Parameter Setup Page",0); //Check box "Enable Payment Approval Email " is unchecked on Payment Parameter Setup
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0); //Save image is clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Payment Parameter Set Up Page Is Saved");
		//===============================================Disabling Of Required Payment Parameter Set Up Settings (Enabled In TC_028) Is Completed=======================================================================================================================================================================================================================================================================================================================================
		
		//===============================================Verification That Required Payment Parameter Set Up Settings Are Disabled Is Started========================================================================================================================================================================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",0);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",0);
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box",0);
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster(driver), "deselect", "Use Current Adjuster SuperVisory Chain Check Box",0);
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(driver), "deselect", "Enable Payment Approval Diary Check Box",0);
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(driver), "deselect", "Enable Payment Approval Email Check Box",0);
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box",0);
		//===============================================Verification That Required Payment Parameter Set Up Settings Are Disabled Is Completed===================================================================================================================================================================================================================================================================================================================================================================
				
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
		if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
		}
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		StrScreenShotTCName = "TC_034_c";
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

				