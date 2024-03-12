package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentParameterSetUp;
import rmaseleniumPOM.RMA_Selenium_POM_UserPrivilegesSetUp;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_074_C
//Description    : Payment Parameter Set Up And User Privileges Payment Limit Assignment Clean Up Is Validated
//Depends On TC  : TC_064 & TC_065
//Revision       : 0.0 - KumudNaithani/ImteyazAhmad-16-02-2016
//Revision       : 0.1 - ImteyazAhmad-08-17-2016
//=================================================================================================
public class RMA_TC_074_C extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;



	@Test 
	public void RMA_TC_074_C_Test () throws Exception, Error 
	//Verify That Payment Parameter Set Up And User Privileges Payment Limit Assignment Is Cleaned Up
	{
		try {
			logger = reports.startTest("TC_074_C_Payment Parameter SetUp And User Privileges Payment Limit Assignment Clean Up", "Payment Parameter Set Up And User Privileges Payment Limit Assignment Clean Up Is Validated");

			String RMAApp_UserPrev_Lst_LOB;
			int IntActualRowCount;
			String RMAApp_UserPrev_Lst_LoginUsrGrp;
			String RMAApp_UserPrev_Lst_LoginMgrGrp1;
			String RMAApp_UserPrev_Lst_LoginMgrGrp2;
			String RMAApp_UserPrev_Lst_CurrAdjGrp;
			String RMAApp_UserPrev_Lst_CurrAdjMgrGrp1;
			String RMAApp_UserPrev_Lst_CurrAdjMgrGrp2;
			String StrSecondryWindowHandle;
			//Local Variable Declaration

			StrScreenShotTCName = "TC_074_C";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_02_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_074_C
			RMAApp_UserPrev_Lst_CurrAdjGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 1); // RMAApp_UserPrev_Lst_CurrAdjGrp Name Is Fetched From DataSheet RMA_TC_074_C
			RMAApp_UserPrev_Lst_CurrAdjMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 2); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp1 Name Is Fetched From DataSheet RMA_TC_074_C
			RMAApp_UserPrev_Lst_CurrAdjMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 3); // RMAApp_UserPrev_Lst_CurrAdjMgrGrp2 Name Is Fetched From DataSheet RMA_TC_074_C
			RMAApp_UserPrev_Lst_LoginUsrGrp = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 4); // RMAApp_UserPrev_Lst_LoginUsrGrp Name Is Fetched From DataSheet RMA_TC_074_C
			RMAApp_UserPrev_Lst_LoginMgrGrp1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 5); // RMAApp_UserPrev_Lst_LoginMgrGrp1 Name Is Fetched From DataSheet RMA_TC_074_C
			RMAApp_UserPrev_Lst_LoginMgrGrp2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074_C", 1, 6); // RMAApp_UserPrev_Lst_LoginMgrGrp2 Name Is Fetched From DataSheet RMA_TC_074_C

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Steps To Revert Payment Parameter Setup Settings Are Started Here++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(1);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("UtilitieszPaymentParameterSetupPaymentParameterSetupPayment Parameter SetupUI/Utilities/Manager/Payment Parameter SetupFalse");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",1);   // Payment Limits Are Exceeded Check Box Is UnChecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisory Approval Check Box", "Payment Parameter Setup Page",1);      // Supervisory Approval CheckBox Is UnChecked On Payment Parameter Set Up Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster(driver), "uncheck", "Use Current Adjuster SuperVisory Chain Check Box", "Payment Parameter Setup Page",1); //Use Current Adjuster SuperVisory Chain Check Box Is UnChecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(driver), "uncheck", "Enable Payment Approval Diary Check Box", "Payment Parameter Setup Page",1); //Enable Payment Approval Diary Check Box Is UnChecked On Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(driver), "uncheck", "Enable Payment Approval Email Check Box", "Payment Parameter Setup",1); //Enable Payment Approval Email Check Box Is UnChecked On Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",1); //Immediate SuperVisor Check Box Is UnChecked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Newly Selected Settings On SuperVisor Approval Configuration Tab On Payment Parameter SetUp Page Are Saved");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Tab_SupervisorApproval(driver), "SuperVisor Approval Configuration Tab On Payment Parameter Set Up Page",1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver)));
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseCurrentAdjuster(driver), "deselect", "Use Current Adjuster SuperVisory Chain Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtDiary(driver), "deselect", "Enable Payment Approval Diary Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_EnbPmtEmail(driver), "deselect", "Enable Payment Approval Email Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box",1);


			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "deselect", "Pay Detail Limits Are Exceeded Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayeeNotExist(driver), "deselect", "Payee DoesNot Exist In System Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded(driver), "deselect", "Per Claim Pay Limits Exceeded Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_QueuePayment(driver), "deselect", "Queue Payments Instead Of Placing On Hold Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApprove(driver), "deselect", "Allow The Group Of SuperVisor To Approve Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationValue(driver), "deselect", "Consider Zero As Valid Value For Escalation Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotify(driver), "deselect", "Disable Diary Notification To SuperVisor Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_DisbEmailNotify(driver), "deselect", "Disable Email Notification To SuperVisor Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppSearch(driver), "deselect", "Use SuperVisor Approval Search Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "deselect", "Reserve Limits Are Exceeded Check Box",1);

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "deselect", "Use SuperVisory Approval For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_AllowGrpSupervisorToApproveReserve(driver), "deselect", "Allow The Group Of SuperVisor To Approve For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_ZeroEscalationRsv(driver), "deselect", "Consider Zero As Valid Value For Escalation For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "deselect", "Notify Immediate SuperVisor For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseCurrAdjRsv(driver), "deselect", "Use Current Adjustor SuperVisory Chain For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_DisbEmailSprVsrRes(driver), "deselect", "Disable Email Notification To SuperVisor For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_DisbDiaryNotUnapprovedEntity(driver), "deselect", "Disable Diary Notification For Unapproved Entity Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_DisbDiarySprVsrRes(driver), "deselect", "Disable Email Notification To SuperVisor For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_LssCollecOnHold(driver), "deselect", "Put Collections From LSS On Hold CheckBox Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "deselect", "Incurred Limits Exceeded For Reserves Check Box",1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SpecTranTypeCodes(driver), "deselect", "Specific Transaction Type Codes Check Box",1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Steps To Revert Payment Parameter Setup Settings Are Completed ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-UserPrivilegesSetup", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains User Privileges Set Up Page Is Done
			driver.manage().window().maximize();

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tab_PymntLimit(driver), "Payment Limits Tab  On User-Privileges SetUp Page", 1);

			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Rdb_Groups(driver), "Group Radio Button On User-Privileges SetUp Page", 1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			IntActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
			//Row Count Fetched For CurrAdj Group

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjGroup", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, IntActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For CurrAdjGrp Is Verified");
			// Payment Limit Removed For CurrAdj Group


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			IntActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
			//Row Count Fetched For CurrAdjMgrGrp1 Group

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjMgr1Group1", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp1 Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, IntActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For CurrAdjGrp1 Is Verified");
			// Payment Limit Removed For CurrAdjMgrGrp1 Group

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_CurrAdjMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			IntActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
			//Row Count Fetched For CurrAdjMgrGrp2 Group


			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text CurrAdjMgr2Group2", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For CurrAdjGrp2 Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, IntActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For CurrAdjGrp2 Is Verified");
			// Payment Limit Removed For CurrAdjMgrGrp2 Group


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp1,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			IntActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
			//Row Count Fetched For LoginMgrGrp1 Group

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr1Group1", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp1 Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, IntActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For LoginMgrGrp1 Is Verified");
			// Payment Limit Removed For LoginMgrGrp1 Group

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginMgrGrp2,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			IntActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
			//Row Count Fetched For LoginMgrGrp2 Group


			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginMgr2Group2", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For LoginMgrGrp2 Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, IntActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For LoginMgrGrp2 Is Verified");
			//Payment Limit Removed For LoginMgrGrp2 Group


			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_Group(driver), RMAApp_UserPrev_Lst_LoginUsrGrp,"User/Group List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",1);
			IntActualRowCount = RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, 0, false, false, "Payment Limits Grid Table" , 1);
			//Row Count Fetched For LoginMgr Group

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "RadioButton Corresponding to Text LoginUserGroup", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For LoginUsrGrp Is Removed");
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Tbl_PaymentLimitsGrid(driver), 0, IntActualRowCount-1, true, false, "Payment Limits Grid Table" , 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 1, "Wait Is Added As Payment Limit Removal For LoginMgrGrp Is Verified");
			//Payment Limit Removed For LoginMgrGrp2 Group
			StrSecondryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrivilegesSetup_Btn_AdditionalSettings(driver), "Additional Settings Button On User Privileges Setup Page", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As LOB Top Level Window Is Loaded");

			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrSecondryWindowHandle, "No Required", "No Required", "No Required", "Line of Business Top Level Approval Window", logval1);
			//RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Line of Business Top Level Appr");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("General Claim", "Line of Business Top Level Approval Window", 1);

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprGCTab_Txt_PaymentMax(driver), "Payment Max TextBox On Line of Business Top Level Approval Page For GC Tab", "", 1);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprGCTab_Txt_UserName(driver), "User TextBox On Line of Business Top Level Approval Page For GC Tab", "", 1);

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Top Level", "Line of Business Top Level Approval Page", 1);

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelApprTLTab_Txt_UserName(driver), "User Name TextBox On  Top Level Approval Page For Top Level Tab", "", 1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrLobTopLevelAppr_Img_Save(driver), "Save Image On LOB Top Level Approval Page", 1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As LOB Top Level Approval Page Is Getting Saved");			
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
