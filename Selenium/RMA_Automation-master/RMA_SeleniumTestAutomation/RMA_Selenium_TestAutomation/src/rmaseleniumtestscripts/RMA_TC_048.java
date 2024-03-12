package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_048
//Description    : TC_048_Verify "Restrict unspecified user" can be selected in User Privileges setup
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-01-28-2016
//Modified By    : 0.1 - KumudNaithani-08-24-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible
//===============================================================================================================================================================================================================================================================

public class RMA_TC_048 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_048_Test () throws Exception, Error

	{
		try {
			logger = reports.startTest("TC_048_Restrict Unspecified Users CheckBox Is Selected", "Verify Restrict Unspecified Users Can Be Selected In User Privileges Setup");

			String RMAApp_UserPrev_Lst_LOB;			
			String StrPrimaryWindowHandle;
			String StrAccept;
			//Local Variable Declaration

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_048", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_045
			StrAccept = "Yes";

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup", logval1);

			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			logger.log(LogStatus.INFO, "User-Privileges SetUp Page Of RMA Application Is Opened");
			driver.manage().window().maximize();
			//User-Privileges SetUp Page Of RMA Application Is Opened

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab On RMA Application's User-Privileges SetUp Page",1); 
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limits Tab On RMA Application's User-Privileges SetUp Page Is Clicked");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "check", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",1);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "check", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",1);
			//Restrict Unspecified Users CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "select", "Enable Payment Limits CheckBox",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "select", "Restrict Unspecified Users CheckBox",1);
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			
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
			throw (e);
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {

			StrScreenShotTCName = "TC_048";
			String TestCaseName;
			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
			}
			
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(logger); 
			reports.flush();
		}
	}
}

