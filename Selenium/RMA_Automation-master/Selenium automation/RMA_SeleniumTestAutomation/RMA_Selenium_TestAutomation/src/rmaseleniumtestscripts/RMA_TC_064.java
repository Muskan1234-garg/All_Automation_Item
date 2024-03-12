package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Adjuster;
import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_064
//Description    : TC_064_Verify that  Payment Limits are working if applied only at group level and Current adjuster chain with Jump functionality is selected in Payment Parameter
//Revision       : 0.0 - ImteyazAhmad-02-02-2016 
//               : 0.1 - ImteyazAhmad-08-09-2016 
//=================================================================================================

public class RMA_TC_064 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_064_Test () throws Exception, Error
	{
		try {
			parentlogger = reports.startTest("TC_064_Payment Limit Is Set In User Privileges Setup For LOB And TopLevel Manager", "Verify That Payment Limits Are Working If Applied Only At Group Level And Current Adjuster Chain With Jump Functionality Is Selected In Payment Parameter");

			int RMAApp_UserPrev_Txt_LOBTopLvlAppGC_PaymentMaxAmt;			
			String StrPaymentMaxAmtActual;
			String StrTopLevelMgrNameActual;
			String StrTopLevelMgrNameExpected;
			String StrGCLOBMgrNameActual;
			String StrGCLOBMgrNameExpected;
			String StrSecondryWindowHandle;
			String StrThirdWindowHandle;
			//Local Variable Declaration

			StrScreenShotTCName = "TC_064";
			StrTopLevelMgrNameExpected = "user5, user5 (Login Name: user5)";
			StrGCLOBMgrNameExpected = "user4, user4 (Login Name: user4)";
			loggerval1 = "NotInitialized";
			testcall1 = false; 
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_02_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_UserPrev_Txt_LOBTopLvlAppGC_PaymentMaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_064", 1, 0); // RMAApp_UserPrev_Txt_LOBTopLvlAppGC_PaymentMaxAmt Is Fetched From DataSheet RMA_TC_064

			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Set Payment Limit In User Privilegs Setup At Group Level : RMA_TC_011 ");
			testcall1 = true;
			RMA_TC_011 userPrivileges = new RMA_TC_011();
			userPrivileges.RMA_TC_011_test();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);			

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrivilegesSetup_Btn_AdditionalSettings(driver)));
			StrSecondryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrivilegesSetup_Btn_AdditionalSettings(driver), "Additional Settings Button On User Privileges Setup Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As LOB Top Level Window Is Loaded");

			driver.switchTo().window(StrRMAWindowHandle);
			StrThirdWindowHandle = RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrSecondryWindowHandle, "No Required", "No Required", "No Required", "Line of Business Top Level Approval Window", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("General Claim", "Line of Business Top Level Approval Window", 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprGCTab_Btn_UserNameButton(driver), "UserName Button On Line of Business Top Level Approval Page For GC Tab", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As System User Window Is Loaded");
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrSecondryWindowHandle, StrThirdWindowHandle, "No Required", "No Required", "System User Window", logval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Tbl_SystemUsers(driver), "user4", "WEBCHECKBOX",0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_SystemUsers_Ok(driver), "OK Button On System User Table On System User Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added After Clicking OK On System User Page");
			driver.switchTo().window(StrThirdWindowHandle);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprGCTab_Txt_PaymentMax(driver), "Payment Max TextBox On Line of Business Top Level Approval Page For GC Tab", String.valueOf(RMAApp_UserPrev_Txt_LOBTopLvlAppGC_PaymentMaxAmt), 0);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Top Level", "Line of Business Top Level Approval Page", 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprTLTab_Btn_UserNameButton(driver), "UserName Button On Line of Business Top Level Approval Page For Top Level Tab", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As System User Window Is Loaded");
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrSecondryWindowHandle, StrThirdWindowHandle, "No Required", "No Required", "System User Window", logval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Tbl_SystemUsers(driver), "user5", "WEBCHECKBOX",0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_SystemUsers_Ok(driver), "OK Button On System User Table On System User Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added After Clicking OK On System User Page");
			driver.switchTo().window(StrThirdWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelAppr_Img_Save(driver), "Save Image On LOB Top Level Approval Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As LOB Top Level Approval Page Is Getting Saved");			
			StrTopLevelMgrNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprTLTab_Txt_UserName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrTopLevelMgrNameExpected, StrTopLevelMgrNameActual, "Top Level Manager Name", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "LOB Top Level Approval For GC Tab", StrScreenShotTCName)));
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("General Claim", "Line of Business Top Level Approval Window", 0);
			StrPaymentMaxAmtActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprGCTab_Txt_PaymentMax(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(String.valueOf(RMAApp_UserPrev_Txt_LOBTopLvlAppGC_PaymentMaxAmt), StrPaymentMaxAmtActual, "Payment Max Amount ", 0);
			StrGCLOBMgrNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprGCTab_Txt_UserName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrGCLOBMgrNameExpected, StrGCLOBMgrNameActual, "GC LOB Manager Name ", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "LOB Top Level Approval For GC Tab", StrScreenShotTCName)));
			driver.close();
			driver.switchTo().window(StrSecondryWindowHandle);
			driver.close();
			driver.switchTo().window(StrRMAWindowHandle);

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_011: GroupLevel Payment Limit SetUp" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			throw (e);
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {

			StrScreenShotTCName = "TC_064";
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
