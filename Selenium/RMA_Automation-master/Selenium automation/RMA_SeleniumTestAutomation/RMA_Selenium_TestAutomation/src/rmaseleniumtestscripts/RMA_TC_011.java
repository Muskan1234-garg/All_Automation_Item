package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
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
//TestCaseID     : RMA_TC_011
//Description    : Verify that  Payment Limits Can Be Set At Group Level In User Privileges Setup
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-12-17-2015 
//Modified By    : 0.1 - KumudNaithani-08-03-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible
//=================================================================================================
public class RMA_TC_011 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_011_test () throws Exception, Error 
	//Verify that  Payment Limits Can Be Set At Group Level In User Privileges Setup
	{
		try {
			logger = reports.startTest("TC_011_GroupLevel Payment Limit SetUp", "Payment Limits Set At GroupLevel In User Privileges SetUp Are Validated");

			String RMAApp_UserPrev_Lst_LOB;
			String RMAApp_UserPrev_Lst_CurrAdjGrp;
			String RMAApp_UserPrev_Lst_CurrAdjMgrGrp1;
			String RMAApp_UserPrev_Lst_CurrAdjMgrGrp2;
			String RMAApp_UserPrev_Lst_LoginMgrGrp1;
			String RMAApp_UserPrev_Lst_LoginMgrGrp2;
			String RMAApp_UserPrev_Lst_LoginUsrGrp;
			int RMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt;
			int RMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt;
			int RMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt;
			int RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt;
			int RMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt;
			int RMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt;
			String StrRMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt;
			String StrRMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt;
			String StrRMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt;
			String StrRMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt;
			String StrRMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt;
			String StrRMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt;
			String StrPrimaryWindowHandle;
			String StrAccept;
			String ObjectName;
			int ActualRowCount;
			int RowCount;
			//Local Variable Declaration

			StrAccept = "Yes";
			RowCount = 2;
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_CurrAdjGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 1); // RMAApp_UserPrev_Lst_CurrAdjGrp Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_CurrAdjMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 2); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp1 Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_CurrAdjMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 3); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp2 Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_LoginUsrGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 6); // RMAApp_UserPrev_Lst_LoginUsrGrp Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_LoginMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 4); // RMAApp_UserPrev_Lst_LoginMgrGrp1 Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_LoginMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_011", 1, 5); // RMAApp_UserPrev_Lst_LoginMgrGrp2 Name Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_011", 1, 7); // RMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_011", 1, 8); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_011", 1, 9); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_011", 1, 12); // RMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_011", 1, 10); // RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt Is Fetched From DataSheet RMA_TC_011
			RMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_011", 1, 11); // RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt Is Fetched From DataSheet RMA_TC_011

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup", logval1);

			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			logger.log(LogStatus.INFO, "User-Privileges SetUp Page Of RMA Application Is Opened");
			driver.manage().window().maximize();

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page",logval1);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Reserve Limits", "Reserver Limits Tab On User Privileges Setup Page", logval1);
			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "uncheck", "Enable Reserve Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Reserve Limits Tab",logval1);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevReserve_Chk_EnableReserveLimits(driver), "deselect", "Enable Reserve Limits CheckBox",logval1);
			//Check Box For Reserve Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Print Check Limits", "Print Check Limits Tab On User Privileges Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(driver), "uncheck", "Enable Print Check Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Print Check Limits Tab",logval1);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPrintCheckLimits_Chk_EnablePrintCheckLimits(driver), "deselect", "Enable Print Check Limits CheckBox",logval1);
			//Check Box For Print Check Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "uncheck", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",logval1);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "deselect", "Enable Payment Limits CheckBox",logval1);
			//Check Box For Payment Limits Tab Is Unchecked 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_Lnk_PayDetailLimits(driver), "Pay Detail Limits Tab On RMA Application's User-Privileges SetUp Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "uncheck", "Enable Payment Detail Limits CheckBox",  "RMA Application's User Privileges SetUp Page's PayDetail Limits Tab",logval1);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPayDetailLimit_chk_EnablePaymentDetailLimits(driver), "deselect", "Enable Payment Detail Limits CheckBox",logval1);
			//Check Box For Pay Detail Limits Tab Is Unchecked 	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_ClaimLimits(driver), "Claim Limits Tab On User-Privileges SetUp Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver), "uncheck", "Enable Claim Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Claim Limits Tab",logval1);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbClaimLimits(driver), "deselect", "Enable Claim Limits CheckBox",logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPer_Tab_EventTypeLimits(driver), "Event Type Limits Tab On User-Privileges SetUp Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "uncheck", "Enable Event Type Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Event Type Limits Tab",logval1);//Enable Event Type Limits CheckBox On RMA Application User Privilege SetUp Page's Event Type Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevEventTypeLimit_Chk_EnbEventTypeLimits(driver), "deselect", "Enable Event Type Limits CheckBox",logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Tab_PerClaimPayLimit(driver), "Per Claim Pay Limits Tab On User-Privileges SetUp Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "uncheck", "Enable Per Claim Pay Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Pay Limits Tab",logval1);
			//Enable Per Claim Pay Limits CheckBox On RMA Application User Privilege SetUp Page's Per Claim Pay Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClaimPayLimit_Chk_EnablePerClaimPayLimits(driver), "deselect", "Enable Per Claim Pay Limits CheckBox",logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Tab_PerClaimIncLimits(driver), "Per Claim Incurred Limits Tab On User-Privileges SetUp Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver)));
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "uncheck", "Enable Per Claim Incurred Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Per Claim Incurred Limits Tab",logval1);
			//Enable Per Claim Incurred Limits CheckBox On RMA Application User Privilege SetUp Page's Per Claim Incurred Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPerClmIncLmts_Chk_EnbPerClmIncurredLmts(driver), "deselect", "Enable Per Claim Incurred Limits CheckBox",logval1);

			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Payment Limits Tab", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User-Privileges SetUp Page Is Clicked");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Rdb_Groups(driver)));
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Rdb_Groups(driver).click(); //Groups Radio Button On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked
			ObjectName = color.RMA_ChangeColor_Utility("Groups Radio Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To CurrAdj Group Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
				//Row Count Fetched For CurrAdj Group
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjGroup", 1);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
				// Payment Limit Removed For CurrAdj Group
			}
			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt));
			StrRMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt = color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt), 3);
			ObjectName = color.RMA_ChangeColor_Utility("Max Amount TextBox", 4);
			logger.log(LogStatus.INFO, "Amount Selected In" + " " + ObjectName + " " +  "For CurrAdjGrp Group's Payment Limit Is" + " " + StrRMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt);

			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Add Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");

			RMA_GenericUsages_Utility.RMA_StaticWait(4, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), RMAApp_UserPrev_Lst_CurrAdjGrp, 3, String.valueOf(RMAApp_UserPrev_Lst_CurrAdjGrp_MaxAmt), "Payment Limits Grid Table",1);
			// Payment Limit Is Added To "CurrAdjGrp" Group Is Added Above


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To CurrAdjMgrGrp1 Group Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
				//Row Count Fetched For CurrAdjMgrGrp1 Group
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjMgr1Group1", 1);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp1 Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
				// Payment Limit Removed For CurrAdjMgrGrp1 Group
			}
			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt));
			StrRMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt = color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt), 3);
			ObjectName = color.RMA_ChangeColor_Utility("Max Amount TextBox", 4);
			logger.log(LogStatus.INFO, "Amount Selected In" + " " + ObjectName + " " +  "For CurrAdjMgrGrp1 Group's Payment Limit Is" + " " + StrRMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt);

			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Add Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");	

			RMA_GenericUsages_Utility.RMA_StaticWait(4, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjMgrGrp1 Is Removed");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp1, 3, String.valueOf(RMAApp_UserPrev_Lst_CurrAdjMgrGrp1_MaxAmt), "Payment Limits Grid Table",1);
			// Payment Limit Is Added To "CurrAdjMgrGrp1" Group

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To CurrAdjMgrGrp2 Group Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
				//Row Count Fetched For CurrAdjMgrGrp2 Group
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjMgr2Group2", 1);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjMgrGrp2 Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
				// Payment Limit Removed For CurrAdjMgrGrp2 Group
			}
			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt));
			StrRMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt = color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt), 3);
			ObjectName = color.RMA_ChangeColor_Utility("Max Amount TextBox", 4);
			logger.log(LogStatus.INFO, "Amount Selected In" + " " + ObjectName + " " +  "For CurrAdjMgrGrp2 Group's Payment Limit Is" + " " + StrRMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt );

			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Add Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");	

			RMA_GenericUsages_Utility.RMA_StaticWait(4, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjMgrGrp2 Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp2, 3, String.valueOf(RMAApp_UserPrev_Lst_CurrAdjMgrGrp2_MaxAmt), "Payment Limits Grid Table",1);
			// Payment Limit Is Added To "CurrAdjMgrGrp2" Group


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginUsrGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To LoginUsrGrp Group Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
				//Row Count Fetched For "LoginUsrGrp" Group
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginUserGroup", 1);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Max Amount For LoginUsrGrp Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
				//Payment Limit Removed For "LoginUsrGrp" Group
			}
			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt));
			StrRMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt = color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt), 3);
			ObjectName = color.RMA_ChangeColor_Utility("Max Amount TextBox", 4);
			logger.log(LogStatus.INFO, "Amount Selected In" + " " + ObjectName + " " +  "For LoginUsrGrp Group's Payment Limit Is" + " " + StrRMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt );

			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Add Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");	

			RMA_GenericUsages_Utility.RMA_StaticWait(4, 1, "Wait Is Added As Payment Limit Max Amount For LoginUsrGrp Is Removed");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), RMAApp_UserPrev_Lst_LoginUsrGrp, 3, String.valueOf(RMAApp_UserPrev_Lst_LoginUsrGrp_MaxAmt), "Payment Limits Grid Table",1);
			// Payment Limit Is Added To "LoginUsrGrp" Group


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To LoginMgrGrp1 Group Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
				//Row Count Fetched For LoginMgrGrp1 Group
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr1Group1", 1);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp1 Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
				// Payment Limit Removed For LoginMgrGrp1 Group
			}
			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt));
			StrRMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt = color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt), 3);
			ObjectName = color.RMA_ChangeColor_Utility("Max Amount TextBox", 4);
			logger.log(LogStatus.INFO, "Amount Selected In" + " " + ObjectName + " " +  "For LoginMgrGrp1 Group's Payment Limit Is" + " " + StrRMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt);

			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Add Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");	

			RMA_GenericUsages_Utility.RMA_StaticWait(4, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp1 Is Added");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), RMAApp_UserPrev_Lst_LoginMgrGrp1, 3, String.valueOf(RMAApp_UserPrev_Lst_LoginMgrGrp1_MaxAmt), "Payment Limits Grid Table",1);
			// Payment Limit Is Added To "LoginMgrGrp1" Group


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			if ((RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1) > RowCount))
			{
				logger.log(LogStatus.INFO, "Already Assigned Payment Limits To LoginMgrGrp2 Group Are Removed Before Assigning New Limits");
				ActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
				//Row Count Fetched For LoginMgrGrp2 Group
				
				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr2Group2", 1);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp2 Is Removed");
				RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, ActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
				//Payment Limit Removed For LoginMgrGrp2 Group
			}
			
			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Txt_MaxAmt(driver).sendKeys(String.valueOf(RMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt));
			StrRMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt = color.RMA_ChangeColor_Utility(String.valueOf(RMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt), 3);
			ObjectName = color.RMA_ChangeColor_Utility("Max Amount TextBox", 4);
			logger.log(LogStatus.INFO, "Amount Selected In" + " " + ObjectName + " " +  "For LoginMgrGrp2 Group's Payment Limit Is" + " " + StrRMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt);

			RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Add(driver).click();
			ObjectName = color.RMA_ChangeColor_Utility("Add Button", 4);
			logger.log(LogStatus.INFO, ObjectName + " " + "On RMA Application's User Privileges Set Up Page's Payment Limits Tab Is Clicked");	

			RMA_GenericUsages_Utility.RMA_StaticWait(4, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp2 Is Removed");
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), RMAApp_UserPrev_Lst_LoginMgrGrp2, 3, String.valueOf(RMAApp_UserPrev_Lst_LoginMgrGrp2_MaxAmt), "Payment Limits Grid Table",1);
			// Payment Limit Is Added To "LoginMgrGrp2" Group


			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "check", "Enable Payment Limits CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",1);
			//Enable Payment Limits CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab Is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_RstUnspecifiedUsr(driver), "check", "Restrict Unspecified Users CheckBox",  "RMA Application's User Privileges SetUp Page's Payment Limits Tab",1);
			//Restrict Unspecified User CheckBox On RMA Application User Privilege SetUp Page's Payment Limits Tab is Checked
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "select", "Enable Payment Limits CheckBox",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Chk_EnbPymntLmt(driver), "select", "Restrict Unspecified Users CheckBox",1);

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
			String StrScreenShotTCName;
			StrScreenShotTCName = "TC_011";
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
