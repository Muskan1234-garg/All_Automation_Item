package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_044
//Description    : TC_044_User Privilege Settings are Reverted
//Revision       : 0.0 - ImteyazAhmad/KumudNaithani-01-21-2016 
//=================================================================================================

public class RMA_TC_044_C extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


@Test 
public void RMA_TC_044_Test () throws Exception, Error
{
	try {
		logger = reports.startTest("TC_044 User Payment Limit Setting Clean Up", "User Payment Limit Setting In User Preivileges Set Up Page Clean Up Is Validated");
        String StrAccept;
        String StrPrimaryWindowHandle;
		String RMAApp_UserPrev_Lst_LOB;
		String RMAApp_UserPrev_Lst_CurrAdjGrp;
		String RMAApp_UserPrev_Lst_CurrAdjMgrGrp1;
		String RMAApp_UserPrev_Lst_CurrAdjMgrGrp2;
		String RMAApp_UserPrev_Lst_LoginMgrGrp1;
		String RMAApp_UserPrev_Lst_LoginMgrGrp2;
		String RMAApp_UserPrev_Lst_LoginUsrGrp;
		
		int ActualRowCount;
		//Local Variable Declaration Completed

		StrAccept = "Yes";
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data
        RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_044
		RMAApp_UserPrev_Lst_CurrAdjGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 1); // RMAApp_UserPrev_Lst_CurrAdjGrp Name Is Fetched From DataSheet RMA_TC_044
		RMAApp_UserPrev_Lst_CurrAdjMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 2); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp1 Name Is Fetched From DataSheet RMA_TC_044
		RMAApp_UserPrev_Lst_CurrAdjMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 3); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp2 Name Is Fetched From DataSheet RMA_TC_044
		RMAApp_UserPrev_Lst_LoginUsrGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 4); // RMAApp_UserPrev_Lst_LoginUsrGrp Name Is Fetched From DataSheet RMA_TC_044
		RMAApp_UserPrev_Lst_LoginMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 5); // RMAApp_UserPrev_Lst_LoginMgrGrp1 Name Is Fetched From DataSheet RMA_TC_044
		RMAApp_UserPrev_Lst_LoginMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_044", 1, 6); // RMAApp_UserPrev_Lst_LoginMgrGrp2 Name Is Fetched From DataSheet RMA_TC_044
		
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(1);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8), "Security Menu Option", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 8,5), "Security-->User Privileges SetUp Menu Option", 1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
		driver.manage().window().maximize();
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 1);
		
		RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Rdb_Groups(driver), "Group Radio Button On User-Privileges SetUp Page", 1);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
		//Row Count Fetched For CurrAdj Group
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjGroup", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For CurrAdjGrp Is Verified");
		// Payment Limit Removed For CurrAdj Group
		
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
		//Row Count Fetched For CurrAdjMgrGrp1 Group
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjMgr1Group1", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp1 Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For CurrAdjGrp1 Is Verified");
		// Payment Limit Removed For CurrAdjMgrGrp1 Group
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
		//Row Count Fetched For CurrAdjMgrGrp2 Group
		
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjMgr2Group2", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp2 Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For CurrAdjGrp2 Is Verified");
		// Payment Limit Removed For CurrAdjMgrGrp2 Group
		
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
		//Row Count Fetched For LoginMgrGrp1 Group
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr1Group1", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp1 Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For LoginMgrGrp1 Is Verified");
		// Payment Limit Removed For LoginMgrGrp1 Group
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
		//Row Count Fetched For LoginMgrGrp2 Group
		
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr2Group2", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp2 Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For LoginMgrGrp2 Is Verified");
		//Payment Limit Removed For LoginMgrGrp2 Group
		
		
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginUsrGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
		ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
		//Row Count Fetched For LoginMgr Group
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginUserGroup", 1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For LoginUsrGrp Is Removed");
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For LoginMgrGrp Is Verified");
		//Payment Limit Removed For LoginMgrGrp2 Group
		
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",1);
		//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is UnChecked");
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",1);
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
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		StrScreenShotTCName = "TC_044_C";
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

				