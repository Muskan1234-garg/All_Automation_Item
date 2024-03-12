package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//===================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_006
//Description    : Functionality of Adjuster Creation Permission Setting For Worker's Comp. Claim On Security Management System Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-08-03-2017
//===================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_006 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	@Test	
	public void RMA_SeleniumRegression_TC_006_Test() throws Exception, Error
	{   
		try {	 	 
			String RMAApp_SMS_Lnk_DataSourceName;
			String RMAApp_SMS_Lnk_ModuleSecurityGroup;
			String RMAApp_SMS_Lnk_ModuleAccessPermission;
			String RMAApp_SMS_Lnk_ModuleAccessPermission_1;
			String RMAApp_SMS_Lnk_ModuleAccessPermission_2;
			String RMAApp_SMS_Lnk_ModuleAccessPermission_3;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String WorkersCompClaim_Txt_ClaimType;
			String WorkersCompClaim_Txt_Department;
			String WorkersCompClaim_Txt_Jurisdiction;
			String WorkersCompClaim_Txt_DateOfEvent;
			String WorkersCompClaim_Txt_TimeOfEvent;
			String WorkersCompClaim_Txt_DateOfClaim;
			String WorkersCompClaim_Txt_TimeOfClaim;
			int WorkersCompClaim_Txt_EmployeeNo;
			String WorkersCompClaim_Txt_ClaimInfoDept;
			//Local Variable Declaration Completed

			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_006_Adjuster Creation Permission Setting For Worker's Comp. Claim", "Functionality of Adjuster Creation Permission Setting For Worker's Comp. Claim On Security Management System Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_006";
			loggerval1 = "NotInitialized";
			testcall1 = false; 
			loggerval2 = "NotInitialized";
			testcall2 = false; 
			loggerval3 = "NotInitialized";
			testcall3 = false; 
			loggerval4 = "NotInitialized";
			testcall4 = false; 
			loggerval5 = "NotInitialized";
			testcall5 = false; 
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			RMAApp_SMS_Lnk_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002	
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
			WorkersCompClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			WorkersCompClaim_Txt_DateOfClaim = WorkersCompClaim_Txt_DateOfEvent;
			WorkersCompClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			WorkersCompClaim_Txt_TimeOfClaim=WorkersCompClaim_Txt_TimeOfEvent;
			WorkersCompClaim_Txt_EmployeeNo=111111111;//RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
			//Local Variable Initialization Completed Here
			RMA_ExcelDataRetrieval_Utility ExcelData_1 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite9_SMSScreen.xlsx"); //Excel WorkBook RMA_RegressionSuite9_SMSScreen Is Fetched To Retrieve Data 
			RMAApp_SMS_Lnk_ModuleSecurityGroup = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_006", 1, 0); //Module Security Group Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_006
			RMAApp_SMS_Lnk_ModuleAccessPermission = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_006", 1, 1); //Module Access Permission Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_006	
			RMAApp_SMS_Lnk_ModuleAccessPermission_1 = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_006", 1, 2); //Module Access Permission Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_006
			RMAApp_SMS_Lnk_ModuleAccessPermission_2 = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_006", 1, 3); //Module Access Permission Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_006
			RMAApp_SMS_Lnk_ModuleAccessPermission_3 = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_006", 1, 4); //Module Access Permission Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_006	
					
			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data
			WorkersCompClaim_Txt_ClaimType = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			WorkersCompClaim_Txt_Department = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			WorkersCompClaim_Txt_Jurisdiction = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 3); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			WorkersCompClaim_Txt_ClaimInfoDept = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 4); // Claim Info Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			//Fetch Of Data From Excel WorkBook Completed
			System.out.println(WorkersCompClaim_Txt_ClaimInfoDept);
			//=========================================================== Disabling Of New Adjuster Creation Permission For Worker's Comp. Claims In Security Management System Is Started Here===================================================================================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName),"Expand Image Of "+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			// Required Data Source Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link For Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup),color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+ " "+ "Module Security Group Link Of Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3) + " "+ "On Left Navigation Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			// Required Module Security Group Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_1)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_1),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission_1,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_2)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_2),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission_2,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			 RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_3), "uncheck", RMAApp_SMS_Lnk_ModuleAccessPermission_3+ " "+"Permission Checkbox For"+ " " +RMAApp_SMS_Lnk_ModuleAccessPermission_2 + " "+ "Of" + " "+"Workers Compensation Claim" , "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Revoke(driver),"Revoke Image On Module Access Permissions Block Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Required Module Access Permissions Are Set
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			
			driver.switchTo().window(StrRMAWindowHandle);
			
			//=========================================================== Disabling Of New Adjuster Creation Permission For Worker's Comp. Claims In Security Management System Is Ended Here===================================================================================================================================================================================================================================================================================================================================================

			//===========================================================Application LogOut And Re-Login Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMAApp_Login_Txt_UserName, RMAApp_Login_Txt_Password, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In		
			//===========================================================Application LogOut And Re-Login Is Completed Here===========================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================Data Source Selection Is Started Here====================================================================================================================================================================================================================================================================================================================================================================================================================== 
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMAApp_SMS_Lnk_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			//===========================================================Data Source Selection Is Completed Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 

			//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAUXWindowHandle = driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
			//==============================Steps To Navigate To RMA Claim System Completed Here===========================================================================================================================================================================================================================

			//===========================================================WorkerComp Creation Is Started Here===============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WorkersCompCorp", "RMA_WorkersCompCorpClaimCreation",0)+" To Create Worker Comp Claim");
			testcall3 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_WorkersCompCorpClaimCreation( WorkersCompClaim_Txt_ClaimType,"Open", WorkersCompClaim_Txt_EmployeeNo,  WorkersCompClaim_Txt_Department,  WorkersCompClaim_Txt_DateOfEvent,  WorkersCompClaim_Txt_TimeOfEvent,  WorkersCompClaim_Txt_DateOfClaim,  WorkersCompClaim_Txt_TimeOfClaim,  WorkersCompClaim_Txt_Jurisdiction, WorkersCompClaim_Txt_ClaimInfoDept, true,logval1);
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Workers Comp Claim Is Created With WorkerComp Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New WorkerComp Is Successfully Created
			//===========================================================WorkerComp Creation Is Completed Here==============================================================================================================================================================================================
			
			//============================================================Steps To Validate That New Adjustor Cannot Be Created Is Started Here===========================================================================================================================================================================================================================================================================================================================================================================================================
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Adjuster"),  "Add Image Button For Adjuster Corresponding To Claim/Event "+ StrClaimNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityViewAll(driver, "Adjuster"), "View All Image Button For Adjuster Corresponding To Claim/Event "+ StrClaimNumber,logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ViewAllPopup_AddNew(driver),  "Add New Image Button On View All Popup Of Adjuster", logval);
			//=========================================================== Steps To Validate That New Adjustor Cannot Be Created Is Completed Here==========================================================================================================================================================================================================================================================================================================================================================	 

			//=========================================================== Enabling Of New Adjuster Creation Permission For Worker's Comp. Claims In Security Management System Is Started Here===================================================================================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName),"Expand Image Of "+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			// Required Data Source Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link For Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup),color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+ " "+ "Module Security Group Link Of Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3) + " "+ "On Left Navigation Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			// Required Module Security Group Link Is Expanded

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_1)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_1),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission_1,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_2)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_2),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission_2,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			 RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, RMAApp_SMS_Lnk_ModuleAccessPermission_3), "check", RMAApp_SMS_Lnk_ModuleAccessPermission_3+ " "+ "Permission Checkbox For"+ " " +RMAApp_SMS_Lnk_ModuleAccessPermission_2 + " "+ "Of" + " "+ "Workers Compensation Claim" , "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Image On Module Access Permissions Block Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//Required Module Access Permissions Are Set

			driver.switchTo().window(StrRMAUXWindowHandle);
			//==============================Enabling Of New Adjuster Creation Permission For Worker's Comp. Claims In Security Management System Is Started Here===================================================================================================================================================================================================================================================================================================================================================

			//==============================Application LogOut And Re-Login Is Started Here================================================================================================
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			//Application Is Logged Out
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall4= true;
			RMA_Functionality_Utility.RMA_Application_Login(RMAApp_Login_Txt_UserName, RMAApp_Login_Txt_Password, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In
			//=============================Application LogOut And Re-Login Is Completed Here===========================================================================================================================================================================================================================================================================================================================================================================================================

			//=============================Data Source Selection Is Started Here====================================================================================================================================================================================================================================================================================================================================================================================================================== 
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMAApp_SMS_Lnk_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			//==============================Data Source Selection Is Completed Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 

			//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
			//==============================Steps To Navigate To RMA Claim System Ended Here===========================================================================================================================================================================================================================

			//==============================Search Created Claim Is Started Here=======================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim", "Search", StrClaimNumber, StrClaimNumber,DefaultFrameID, logval);
			//==============================Search Created Claim Is Completed Here=====================================================================================================================================================================================================================================================

			//==============================Steps To Validate That New Adjustor Cannot Be Created Is Started Here===========================================================================================================================================================================================================================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Adjuster"),  "Add Image Button For Adjuster Corresponding To Claim/Event "+ StrClaimNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityViewAll(driver, "Adjuster"), "View All Image Button For Adjuster Corresponding To Claim/Event "+ StrClaimNumber,logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ViewAllPopup_AddNew(driver),  "Add New Image Button On View All Popup Of Adjuster", logval);
			//==============================Steps To Validate That New Adjustor Cannot Be Created Is Completed Here==========================================================================================================================================================================================================================================================================================================================================================	 

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_DataSource_Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_WorkersCompCorpClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			else if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functionality" +" "+ "RMA_DataSource_Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
		} catch (Exception|Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			try {
				if(driver.getTitle().equalsIgnoreCase("Riskmaster Security")){
					RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
				}
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}