package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//Default Package Import Completed
import org.testng.annotations.Test;

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentParameterSetUp;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_LOB;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_PreCheck
//Description    :Utilities Settings Are Being Enabled For Smoke Cases
//Depends On TC  : None
//Revision       : 0.00 - ImteyazAhmad-06-21-20116
//=================================================================================================

public class RMA_TC_PreCheck extends rmaseleniumtestscripts.RMA_TC_BaseTest{	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_PreCheck_Test() throws Exception,Error
	{
		try{
			String StrPrimaryWindowHandle;
			String StrRMAApp_LOB_Lst_LineOfBusiness;
			//Local Variable Declaration

			StrScreenShotTCName = "TC_Precheck";	

			logger = reports.startTest("TC_PreCheck", "Utilities Settings Are Being Enabled For Smoke Cases");
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			StrRMAApp_LOB_Lst_LineOfBusiness = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_PreCheck", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_PreCheck
			
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On System Settings Tab On General System Parameter Page Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("System Settings", "General System Parameter Setup Page", logval1);

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities(driver), "uncheck", "Enable Multiple Addresses for Entities Checkbox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseGeneralClaim(driver), "uncheck", "Use General Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePropertyClaim(driver), "uncheck", "Use Property Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseWorkersCompClaim(driver), "uncheck", "Use WorkersComp Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseNonOccupationalClaim(driver), "uncheck", "Use NonOccupational Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseVehicleAccidentClaim(driver), "uncheck", "Use Vehicle Accident Claim CheckBox", "General System Parameter Setup Page", logval1);

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseGeneralClaim(driver), "check", "Use General Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window", "USEMASTER", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As OK Button On Activation Code Window Is Clicked");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");	

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePropertyClaim(driver), "check", "Use Property Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window", "USEMASTER", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As OK Button On Activation Code Window Is Clicked");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");


			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseWorkersCompClaim(driver), "check", "Use WorkersComp Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window", "USEMASTER", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As OK Button On Activation Code Window Is Clicked");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseNonOccupationalClaim(driver), "check", "Use NonOccupational Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window", "USEMASTER", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As OK Button On Activation Code Window Is Clicked");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseVehicleAccidentClaim(driver), "check", "Use Vehicle Accident Claim CheckBox", "General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window", "USEMASTER", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As OK Button On Activation Code Window Is Clicked");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseMCMInterface(driver), "uncheck", "Use MCM Interface CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseCaseManagement(driver), "uncheck", "Use Case Management CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseQualityMangaForEvent(driver), "check", "Use Quality Management for Events CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DontDefultTimeFields(driver), "uncheck", "Don't Default Time Fields CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_EnableClaimActivityLog(driver), "check", "Use Activity Log CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseScriptEditor(driver), "uncheck", "Use Script Editor CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseBillReviewSystem(driver), "check", " Use Bill Review System CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseEntityPaymentApproval(driver), "uncheck", "Use Entity Payment Approval CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Txt_SMTPMailServer(driver), "SMTP Mail Server TextBox On General System Parameter Setup Page ", "relay.csc.com", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Img_Save(driver), "Save Image On General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As General System Parameter Setup Page Is Saved");

			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("General System Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities(driver), "deselect", "Enable Multiple Addresses For Entities CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseGeneralClaim(driver), "select", "Use General Claim CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePropertyClaim(driver), "select", "Use Property Claim CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseWorkersCompClaim(driver), "select", "Use Workers Comp CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseNonOccupationalClaim(driver), "select", "Use Non-Occupational Claim CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseVehicleAccidentClaim(driver), "select", "Use Vehicle Accident Claim CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseMCMInterface(driver), "deselect", "Use MCM Interface CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseCaseManagement(driver), "deselect", "Use Case Management CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseQualityMangaForEvent(driver), "select", "Use Quality Management for Events CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DontDefultTimeFields(driver), "deselect", "Don't Default Time Fields CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_EnableClaimActivityLog(driver), "select", "Use Activity Log CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseScriptEditor(driver), "deselect", "Use Script Editor CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseEntityPaymentApproval(driver), "deselect", "Use Entity Payment Approval CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseBillReviewSystem(driver), "select", "Use Bill Review System (BRS) CheckBox On General System Parameter Setup Page",logval1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On System Settings Tab On General System Parameter Page Is Completed +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Funds Settings Tab On General System Parameter Page Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Funds Settings", "General System Parameter Setup Page", logval1);

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(driver), "uncheck", "Use Account Owner For Funds CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(driver), "uncheck", "Use Sub Bank Account CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(driver), "uncheck", "Use Reserve Type To Filter Transaction Type CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AddPersonInvPayeeType(driver), "check", "Add Person Involved To Payee Type CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AddOrgHierPayeeType(driver), "check", "Add Org Heirarchy To Payee Type CheckBox", "General System Parameter Setup Page", logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Img_Save(driver), "Save Image On General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As General System Parameter Setup Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("General System Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Funds Settings", "General System Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(driver), "deselect", "Use Account Owner For Funds CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(driver), "deselect", "Use Sub Bank Account CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(driver), "deselect", "Use Reserve Type To Filter Transaction Type CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AddPersonInvPayeeType(driver), "select", "Add Person Involved To Payee Type CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AddOrgHierPayeeType(driver), "select", "Add Org Heirarchy To Payee Type CheckBox On General System Parameter Setup Page",logval1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Funds Settings Tab On General System Parameter Page Is Completed +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Employee Settings Tab On General System Parameter Page Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Employee Settings", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowEditWCEmployeeNum(driver), "check", "Allow Edit of WC Employee Numbers CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_IgnoreSSNChecking(driver), "check", "Ignore SSN Checking CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Img_Save(driver), "Save Image On General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As General System Parameter Setup Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("General System Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Employee Settings", "General System Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowEditWCEmployeeNum(driver), "select", "Allow Edit of WC Employee Numbers CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_IgnoreSSNChecking(driver), "select", "Ignore SSN Checking CheckBox On General System Parameter Setup Page",logval1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Employee Settings Tab On General System Parameter Page Is Completed +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Diaries / Text Fields Tab On General System Parameter Page Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Diaries / Text Fields", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AutoLaunchDiary(driver), "check", "Auto Launch Diary (Non-Powerview) CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "check", "Default Assigned To In Create Diary To Current User CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DeleteAllDiariesOnClaimClosed(driver), "check", "Delete All Diaries Related to Claim When Claim Is Closed CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Img_Save(driver), "Save Image On General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As General System Parameter Setup Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("General System Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Diaries / Text Fields", "General System Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AutoLaunchDiary(driver), "select", "Auto Launch Diary (Non-Powerview) CheckBox CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "select", "Default Assigned To In Create Diary To Current User CheckBox On General System Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DeleteAllDiariesOnClaimClosed(driver), "select", "Delete All Diaries Related to Claim When Claim Is Closed CheckBox On General System Parameter Setup Page",logval1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Diaries / Text Fields Tab On General System Parameter Page Is Completed +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Globalization Settings Tab On General System Parameter Page Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Globalization Settings", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseMultiCurrency(driver), "uncheck", "Use Multiple Currency CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Img_Save(driver), "Save Image On General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As General System Parameter Setup Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("General System Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Globalization Settings", "General System Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseMultiCurrency(driver), "deselect", "Use Multiple Currency CheckBox On General System Parameter Setup Page",logval1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Globalization Settings Tab On General System Parameter Page Is Completed +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Policy Interface Settings Tab On General System Parameter Page Is Started +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Policy Interface Settings", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "uncheck", "Use Policy System Interface CheckBox", "General System Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Img_Save(driver), "Save Image On General System Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As General System Parameter Setup Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("General System Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Policy Interface Settings", "General System Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "deselect", "Use Policy System Interface CheckBox On General System Parameter Setup Page",logval1);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1);	
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Policy Interface Settings Tab On General System Parameter Page Is Completed+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Check Options Setup Tab And Supervisor Appr Tab On Payment Paramenter Steup Page Are Started+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Check Options Setup", "Payment Parameter Setup Page", logval1);

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_AllowPostDataChecks(driver), "check", "Allow Post Date of Checks Checkbox", "Payment Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_AllowDuplicatePaymentChecking(driver), "uncheck", "Allow Duplicate Payment Checking Checkbox", "Payment Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsWithChecks(driver), "check", "Print EOBs With Checks Checkbox", "Payment Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsOnCheckStub(driver), "check", "Print EOB Detail On Check Stub Checkbox", "Payment Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PrintPayeeEOB(driver), "uncheck", "Print Payee EOB Checkbox", "Payment Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Supervisor Approval Configuration", "Payment Parameter Setup Page", logval1);

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "uncheck", "Payment Limits Are Exceeded Check Box", "Payment Parameter Setup Page",logval1);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "uncheck", "Payment Detail Limits Are Exceeded Check Box", "Payment Parameter Setup Page",logval1);   // Payment Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page		
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "uncheck", "Supervisory Approval Check Box", "Payment Parameter Setup Page",logval1);      // Supervisory Approval CheckBox Is Checked On Payment Parameter Set Up Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "uncheck", "Notify Immediate Supervisor Check Box", "Payment Parameter Setup",logval1); //Notify Immediate SuperVisor Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "uncheck", "Reserve Limits Are Exceeded Check Box", "Payment Parameter Setup Page",logval1);   // Reserve Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "uncheck", "Notify Immediate Supervisor Check Box For Reserves", "Payment Parameter Setup",logval1); //Notify Immediate SuperVisor Check Box For reserves Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "uncheck", "Supervisory Approval Check Box For Reserves", "Payment Parameter Setup",logval1); //Supervisory Approval CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "uncheck", "Incurred Limits Are Exceeded Check Box For Reserves", "Payment Parameter Setup",logval1); //Incurred Limits Are Exceeded CheckBox For Reserves Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded(driver), "uncheck", "Per Claim Pay Limits Are Exceeded Check Box", "Payment Parameter Setup Page",logval1);   // Per Claim Pay Limits Are Exceeded Check Box Is Checked on Payment Parameter Setup Page
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PaymentParaSetup_Img_Save(driver), "Save Image On Payment Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As Payment Parameter SetUp Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Payment Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PaymentParameterSetup");	

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_AllowPostDataChecks(driver), "select", "Allow Post Date Of Checks CheckBox On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_AllowDuplicatePaymentChecking(driver), "deselect", "Allow Duplicate Payment Checking CheckBox On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsWithChecks(driver), "select", "Print EOBs With Checks CheckBox On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PrintEOBsOnCheckStub(driver), "select", "Print EOB Detail On Check Stub CheckBox On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PrintPayeeEOB(driver), "deselect", "Print Payee EOB On Payment Parameter Setup Page",logval1);

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Supervisor Approval Configuration", "Payment Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayLimitExceed(driver), "deselect", "Payment Limits Are Exceeded Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PayDetailLimitExceed(driver), "deselect", "Payment Detail Limits Are Exceeded Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifyImmSupervisor(driver), "deselect", "Notify Immediate Supervisor Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_SupervisoryApproval(driver), "deselect", "Supervisory Approval Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_NotifySupRsv(driver), "deselect", "Notify Immediate SuperVisor For Reserves Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_UseSupAppRsv(driver), "deselect", "Use SuperVisory Approval For Reserves Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_RsvLimitExceed(driver), "deselect", "Reserve Limits Are Exceeded Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_IncLmtExceed(driver), "deselect", "Reserve Limits Are Exceeded Check Box On Payment Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_PerClaimPayLimitsExceeded(driver), "deselect", "Per Claim Pay Limits Are Exceeded Check Box On Payment Parameter Setup Page",logval1);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1);

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Check Options Setup Tab And Supervisor Appr Tab On Payment Paramenter Steup Page Are Completed+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Reserve Option Tab And Claim Option Tab On LOB Paramenter Steup Page Are Started+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-LineOfBusinessParameterSetup", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Lst_LineOfBusiness(driver), StrRMAApp_LOB_Lst_LineOfBusiness, "Line Of Business Dropdown", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Reserve Options", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseReserveWorsheet(driver), "uncheck", "Use Reserve WorkSheet CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_CheckForInsufficientReserveFnd(driver), "uncheck", "Check for Insufficient Reserve Funds CheckBox", "LOB Parameter Setup Page", logval1);

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_ReserveTypeLookup(driver), "ReserveTypeLookup Button On LOB Parameter Setup Page", logval1);
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Reserve Type Selection Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Bodily Injury", "Reserve Type Selection Window", logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_ReserveTypeLookup(driver), "ReserveTypeLookup Button On LOB Parameter Setup Page", logval1);
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Reserve Type Selection Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Expense", "Reserve Type Selection Window", logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_ReserveTypeLookup(driver), "ReserveTypeLookup Button On LOB Parameter Setup Page", logval1);
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Reserve Type Selection Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Indemnity", "Reserve Type Selection Window", logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");


			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_ReserveTypeLookup(driver), "ReserveTypeLookup Button On LOB Parameter Setup Page", logval1);
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Reserve Type Selection Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Litigation", "Reserve Type Selection Window", logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");


			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_ReserveTypeLookup(driver), "ReserveTypeLookup Button On LOB Parameter Setup Page", logval1);
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Reserve Type Selection Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Medical", "Reserve Type Selection Window", logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Claim Options", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_ClaimType(driver), "check", "Claim Type CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_Year(driver), "check", "Year CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_LOBIndicator(driver), "check", "LOB Indicator CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_AllowCheckForDuplicateClaims(driver), "uncheck", "Allow Check For Possible Duplicate Claims CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseEnhancedNotes(driver), "check", "Use Enhanced Notes CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseClaimComments(driver), "check", "Use Claim Comments CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseISOClaimSubmission(driver), "check", "Use ISO Claim Submission CheckBox", "LOB Parameter Setup Page", logval1);
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Rdb_ClaimYear(driver), "Claim Year RadioButton On LOB Parameter Setup Page", logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_Save(driver), "Save Image On LOB Parameter Setup Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As LOB Parameter Setup Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval1);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Payment Parameter Setup Page" , logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("LOBParameters");	
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Lst_LineOfBusiness(driver),StrRMAApp_LOB_Lst_LineOfBusiness, "Line Of Business Dropdown", "LOB Parameter Setup Page", logval1);

			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseReserveWorsheet(driver), "deselect", "Use Reserve Worksheet Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_CheckForInsufficientReserveFnd(driver), "deselect", "Check for Insufficient Reserve Funds Check Box On LOB Parameter Setup Page",logval1);

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Claim Options", "LOB Parameter Setup Page", logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_ClaimType(driver), "select", "Claim Type Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_Year(driver), "select", "Year Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_LOBIndicator(driver), "select", "LOB Indicator Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_AllowCheckForDuplicateClaims(driver), "deselect", "Allow Check For Possible Duplicate Claims Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseEnhancedNotes(driver), "select", "Use Enhanced Notes  Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseClaimComments(driver), "select", "Use Claim Comments Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseISOClaimSubmission(driver), "select", "Use ISO Claim Submission Check Box On LOB Parameter Setup Page",logval1);
			RMA_Verification_Utility.RMA_SelectDeselecStateVerification_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Rdb_ClaimYear(driver), "select", "Claim Year RadioButton On LOB Parameter Setup Page",logval1);
			
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Settings To Be Enabled On Reserve Option Tab And Claim Option Tab On LOB Paramenter Steup Page Are Completed+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		}catch(Exception|Error e){
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not handled Exception And Print Log Of It
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
			String TestCaseName;


			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval1);
			}
			reports.endTest(logger);	
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}
