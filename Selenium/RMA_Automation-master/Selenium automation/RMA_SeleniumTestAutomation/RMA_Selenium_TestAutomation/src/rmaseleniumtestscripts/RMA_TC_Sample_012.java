package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_001
//Description    : Reserve Limits Set Up In User Privileges Is Validated
//Revision       : 0.0 - KumudNaithani-12-05-2015
//=================================================================================================
public class RMA_TC_Sample_012 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
@Test 
public void UserPrevileges_ReserveLimits() throws Exception, Error 
{
	logger = reports.startTest("TC_012_UserPrevileges_PerClaimIncurredLimits", "Per Claim Incurred Limits Criteria Is Changed In User Previleges SetUp And Corresponding Verification Is Done");
	
	String RMAApp_UserPrevileges_ReserveLimits_Lst_LOB;
	String RMAApp_UserPrev_Lst_UserGroup;
	String StrAccept;
	int RMAApp_UserPrev_Txt_MaxAmount;
	//Local Variable Declaration
	
	StrAccept = "Yes";
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	RMAApp_UserPrevileges_ReserveLimits_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_012", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_011
	RMAApp_UserPrev_Lst_UserGroup = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_012", 1, 1);
	RMAApp_UserPrev_Txt_MaxAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_012", 1, 2);
	
	String StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Primary Window Is Fetched
	driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8).click(); //Security Menu Option Is Selected
	logger.log(LogStatus.INFO, "Security Menu Option Is Clicked On RISKMASTER Default View Page");

	RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8, 5).click(); //User Privileges Set Up Menu Option Is Selected
	logger.log(LogStatus.INFO, "Security-->User Privileges SetUp Option Is Clicked On RISKMASTER Default View Page");
	
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page
	logger.log(LogStatus.INFO, "User-Privileges SetUp Page Is Opened");
	
	RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits(driver).click();
	logger.log(LogStatus.INFO, "Per Claim Incurred Limits Criteria Tab On User-Privileges SetUp Page Is Clicked");
	
	Thread.sleep(2000);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrevileges_ReserveLimits_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Per Claim Incurred Limits Criteria Tab",1);
	RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), RMAApp_UserPrev_Lst_UserGroup,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Per Claim Incurred Limits Criteria Tab",1);
	
	RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Txt_MaxAmount(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Txt_MaxAmount));
	logger.log(LogStatus.INFO, "Required Amount Selected In Max Amount TextBox On RISKMASTER User-Privileges SetUp Page's Per Claim Incurred Limits Criteria Tab Is" + " "+ "::" + " " +  RMAApp_UserPrev_Txt_MaxAmount);
	Thread.sleep(2000);
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver),"check", "EnableReserveLimits CheckBox", "RISKMASTER User-Privileges SetUp Page's Per Claim Incurred Limits Criteria Tab",1 );
	
	Thread.sleep(5000);
	RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept);
	Thread.sleep(5000);
	
	RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Btn_Add(driver).click();
	logger.log(LogStatus.INFO, "Add Button On RISKMASTER User-Privileges SetUp Page's Per Claim Incurred Limits Criteria Tab Is Clicked");

	driver.switchTo().window(StrPrimaryWindowHandle); //Switch To The Window Which Contains User Previleges Set Up Page
	Thread.sleep(2000);
		
}

@AfterMethod
public void RMA_FailureReport(ITestResult result) throws Exception,Error //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		String StrScreenShotTCName;
		String TestCaseName;
		StrScreenShotTCName = "RMA_TC_012";
		
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);
	} catch (Exception|Error e) {
		throw (e);
	}
}
}
