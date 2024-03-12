package rmaseleniumutilties_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_CombinedPayment;
import rmaseleniumPOM_UX.RMA_Selenium_POM_DisabilityPlanManagement;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Document_Event;
import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_BulkCheckRelease;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_MarkChecksAsCleared;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_PrintChecks;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_ReCreateCheckFile;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_ResetPrintedCheck;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_UnClearChecks;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Funds_VoidingChecks;
import rmaseleniumPOM_UX.RMA_Selenium_POM_GST;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_InsufficientReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OccurrenceParameterSetUp;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OrgHierarchy;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PlanClass;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PolicyDownlod;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PrintChecks;
import rmaseleniumPOM_UX.RMA_Selenium_POM_ReserveWorksheet;
import rmaseleniumPOM_UX.RMA_Selenium_POM_ScheduleCheck;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SupplementalsField;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Withholding;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
//RMA Package Import Completed

public class RMA_Claims_Functionality_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String ReturnValue;
	public static String ReserveTypeValueFromWeblist;
	public static String TransactionTypeValueFromWeblist;
	public static String[] ReserveTypeValueFromWeblistA;
	public static String[] TransactionTypeValueFromWeblistA;
	public static String HyperLinkValueFromWeblist;

	//======================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CarrierHealthClaimCreationWithStagingPolicy
	//Description  		: Enables Users To Create Health Claim For Carrier Client With Staging Policy
	//Input Parameter 	: Input Parameters Are :ClaimType, Claim Status, Department, DateOfEvent, TimeofEvent, DateOfClaim, TimeOfClaim, Policy LOB, Policy System Name, Policy Number, Intlogval 
	//Revision			: 0.0 - DebasmitaPati-06-11-2018 
	//======================================================================================================================================================================================================================================================================================================================================
	public static String RMA_CarrierHealthClaimCreationWithStagingPolicy(String HealthClaimCreation_Txt_ClaimType, String HealthClaimCreation_Txt_ClaimStatus, String HealthClaimCreation_Txt_Department,String HealthClaimCreation_Txt_PolicyLOB, String HealthClaimCreation_Txt_DateOfEvent, String HealthClaimCreation_Txt_TimeOfEvent, String HealthClaimCreation_Txt_DateOfClaim, String HealthClaimCreation_Txt_TimeOfClaim, String HealthClaimCreation_Lst_PolicySystem, String HealthClaimCreation_Txt_PolicyNumber,String HealthClaimCreation_Lnk_PolicyLOB,String HealthClaimCreation_Txt_PolicyUnitNumber, String HealthClaimCreation_Txt_PolicyUnitCoverage, int Intlogval) throws Exception,Error
	{
		String StrHealthClaimNumber; 
		//Variable Declaration Completed Here

		StrHealthClaimNumber=null;
		//Variable Initialization Completed Here
		try
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables The User To Create Carrier Health Claim Successfully");
			}else{	
				logger = reports.startTest("<span id='CarrierHC'>Carrier Health Claim Creation</span>", "Enables The User To Create Carrier Health Claim Successfully");
			}
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-HealthClaim", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimhc");	
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver)));


			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_PolicyLOB(driver), "Policy LOB TextBox On Health Claim Page", HealthClaimCreation_Txt_PolicyLOB, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Policy LOB TextBox On Health Claim Creation Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On Health Creation Page",  HealthClaimCreation_Txt_Department, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Health Claim Creation Page");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On Health Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(HealthClaimCreation_Txt_ClaimType, "Claim Type LookUp Window On Health Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On WC Claim Creation Page", HealthClaimCreation_Txt_ClaimType, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Type Is Selected In Health Claim Creation Page");	
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Health Claim Creation Page", HealthClaimCreation_Txt_DateOfEvent, Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Health Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Health Claim Creation Page", HealthClaimCreation_Txt_DateOfClaim, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Health Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Health Claim Creation Page",HealthClaimCreation_Txt_TimeOfClaim, Intlogval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Health Claim Creation Page", HealthClaimCreation_Txt_TimeOfEvent, Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_Jurisdiction(driver), "Claim Jurisdiction Look Up Image Button On Health Claim Creation Page",Intlogval);
			//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(HealthClaimCreation_Txt_Jurisdiction, "Jurisdiction LookUp Window On Health Claim Creation Page", Intlogval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Jurisdiction Is Selected In Health Claim Creation Page");

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Scroll to View Policy Name Lookup Image On Health Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Name Lookup Is Visible");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Policy Name Lookup Image On Health Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Search Results Page For Policy Lob Is Loaded");
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver)));	
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), "Policy Name Lookup Image On Health Claim Page ", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), HealthClaimCreation_Lst_PolicySystem, "Policy system Dropdown", "Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Is Loaded");
			//Policy System Is Selected
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			//RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_PolicyNumber(driver), "Policy Number Text Box On Policy Download Window", HealthClaimCreation_Txt_PolicyNumber, Intlogval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_SearchCriteria_Btn_SubmitQuery(driver), "Search Image On Policy Download Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Grid Is Getting Loaded");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Policy Number"), "Policy Number Type Filter Text Box On Policy Download Screen", HealthClaimCreation_Txt_PolicyNumber,Intlogval);//Policy Number Is Entered In Policy Number Input Box On Policy NG Grid
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Details Are Getting Loaded");
			RMA_Navigation_Utility.RMA_WebLinkSelect(HealthClaimCreation_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Policy LOB");
			//Policy LOB Link Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_Next(driver), "Next Image On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_SelectSpecifiedPositionWTObjectsByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable(driver), "Insured", "WEBCHECKBOX",1, Intlogval);
			//Claimant Check-Box Is checked

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_UnitList(driver), "Unit List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tbl_UnitListTable(driver), String.valueOf(HealthClaimCreation_Txt_PolicyUnitNumber), "WEBCHECKBOX", Intlogval);

			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable(driver), HealthClaimCreation_Txt_PolicyUnitCoverage, "WEBCHECKBOX", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Btn_Select(driver), "Select Button On Property Popup", Intlogval);
			//Record Is Selected

			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Record");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_PolicyDownload(driver), "Policy Download Image On Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Downloaded Successfully");
			//Policy Is Downloaded

			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Carrier WC Claim Page Is Loaded");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On Health Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Open", "Claim Status LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "Claim Status TextBox On Health Claim Creation Page", HealthClaimCreation_Txt_ClaimStatus, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Status Is Selected In Health Claim Creation Page");

			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimhc", false, "NA", "Carrier Health Claim Creation Page", Intlogval);
			StrHealthClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Health Claim Number Is Fetched In The Variable StrHealthClaimNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Health Claim Creation", "Carrier Health Claim Creation Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Health Claim Creation", "Carrier Health Claim Creation Not Successfull")));
			}
		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Health Claim Creation Fail", "Carrier Health Claim Creation Not Successfull")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Health Claim Creation Fail", "Carrier Health Claim Creation Not Successfull")));
			}
			throw (e);
		}		
		return StrHealthClaimNumber;		
	}

	//======================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WorkersCompCarrierClaimCreationWithStagingPolicy
	//Description  		: Enables Users To Create Worker's Compensation Claim For Carrier Client With Staging Policy System
	//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, DateOfEvent, TimeofEvent, DateOfClaim, TimeOfClaim, Jurisdiction, Intlogval, boolean ExstEmp Needs To Be True Only When User Wants To Create 
	//Revision			: 0.0 - DebasmitaPati-06-12-2018 
	//======================================================================================================================================================================================================================================================================================================================================
	public static String RMA_WorkersCompCarrierClaimCreationWithStagingPolicy(String CarrierWCClaimCreation_Txt_ClaimType, String CarrierWCClaimCreation_Txt_ClaimStatus, int CarrierWCClaimCreation_Txt_EmployeeNumber, String CarrierWCClaimCreation_Txt_Department,String CarrierWCClaimCreation_Txt_PolicyLOB, String CarrierWCClaimCreation_Txt_DateOfEvent, String CarrierWCClaimCreation_Txt_TimeOfEvent, String CarrierWCClaimCreation_Txt_DateOfClaim, String CarrierWCClaimCreation_Txt_TimeOfClaim, String CarrierWCClaimCreation_Txt_Jurisdiction, boolean ExstEmp, String WCClaimCreation_Lst_PolicySystem, int carrierWCClaimCreation_Txt_PolicyNumber,String CarrierWCClaimCreation_Lnk_PolicyLOB,int CarrierWCClaimCreation_Txt_PolicyUnitNumber, String CarrierWCClaimCreation_Txt_PolicyUnitCoverage, int Intlogval) throws Exception,Error
	{
		String StrWorkersCompClaimNumber; 
		String EmpLstName;
		long EmpSocSecNo;
		//Variable Declaration Completed Here

		StrWorkersCompClaimNumber=null;
		EmpLstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Emp_");
		EmpSocSecNo=RMA_GenericUsages_Utility.RMA_RandomLongGeneration_Utility(111111111, 999999999);
		//Variable Initialization Completed Here
		try
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Worker's Comp Claim Creation");
			}else{	
				logger = reports.startTest("<span id='WorkersCompCorp'>Worker's Comp Claim Creation</span>", "Worker's Comp Claim Is Created");
			}
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-WorkersComp.", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimwc");	
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver)));


			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_PolicyLOB(driver), "Policy LOB TextBox On WC Claim Page", CarrierWCClaimCreation_Txt_PolicyLOB, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Policy LOB TextBox On Workers Compensation Claim Creation Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On Workers Compensation Creation Page",  CarrierWCClaimCreation_Txt_Department, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Workers Compensation Claim Creation Page");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierWCClaimCreation_Txt_ClaimType, "Claim Type LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On WC Claim Creation Page", CarrierWCClaimCreation_Txt_ClaimType, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Type Is Selected In Workers Compensation Claim Creation Page");	
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Workers' Comp Claim Creation Page", CarrierWCClaimCreation_Txt_DateOfEvent, Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers' Comp Claim Creation Page", CarrierWCClaimCreation_Txt_DateOfClaim, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers' Comp Claim Creation Page",CarrierWCClaimCreation_Txt_TimeOfClaim, Intlogval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Workers' Comp Claim Creation Page", CarrierWCClaimCreation_Txt_TimeOfEvent, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_Jurisdiction(driver), "Claim Jurisdiction Look Up Image Button On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierWCClaimCreation_Txt_Jurisdiction, "Jurisdiction LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Jurisdiction Is Selected In Workers Compensation Claim Creation Page");

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Scroll to View Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Name Lookup Is Visible");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Search Results Page For Policy Lob Is Loaded");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver)));					
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), "Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), WCClaimCreation_Lst_PolicySystem, "Policy system Dropdown", "Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Is Loaded");
			//Policy System Is Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_SearchCriteria_Btn_SubmitQuery(driver), "Search Image On Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Grid Is Getting Loaded");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Policy Number"), "Policy Number Type Filter Text Box On Policy Download Screen", String.valueOf(carrierWCClaimCreation_Txt_PolicyNumber),logval);//Policy Number Is Entered In Policy Number Input Box On Policy NG Grid
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Details Are Getting Loaded");
			RMA_Navigation_Utility.RMA_WebLinkSelect(CarrierWCClaimCreation_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Policy LOB");
			//Policy LOB Link Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_Next(driver), "Next Image On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_SelectSpecifiedPositionWTObjectsByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable(driver), "Insured", "WEBCHECKBOX",1, Intlogval);
			//Claimant Check-Box Is checked

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_UnitList(driver), "Unit List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tbl_UnitListTable(driver), String.valueOf(CarrierWCClaimCreation_Txt_PolicyUnitNumber), "WEBCHECKBOX", Intlogval);

			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable(driver), CarrierWCClaimCreation_Txt_PolicyUnitCoverage, "WEBCHECKBOX", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Btn_Select(driver), "Select Button On Property Popup", Intlogval);
			//Record Is Selected

			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Record");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_PolicyDownload(driver), "Policy Download Image On Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Downloaded Successfully");
			//Policy Is Downloaded

			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Carrier WC Claim Page Is Loaded");

			if(ExstEmp==true)
			{
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", String.valueOf(CarrierWCClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Employee Is Selected In Workers Compensation Claim Creation Page");
			}

			else{
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", String.valueOf(CarrierWCClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeInfo(driver), "Employee Info Tab On Worker Comp Claim Creation Page",Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_LastName(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", EmpLstName, Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_SocSecNo(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", String.valueOf(EmpSocSecNo), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers' Comp Claim Creation Page",logval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EmployeeInfoDepartment(driver), "Department Employee TextBox On Workers' Comp Claim Creation Page",CarrierWCClaimCreation_Txt_Department, Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Employee Info Tab On Workers Compensation Claim Creation Page");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Workers Comp Claim Creation Page", Intlogval);
			}

			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On Workers' Comp Claim Creation Page",Intlogval);
			//RMA_Navigation_Utility.RMA_WebLinkSelect("Open", "Claim Status LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "Claim Status TextBox On WC Claim Creation Page", CarrierWCClaimCreation_Txt_ClaimStatus, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Status Is Selected In Workers Compensation Claim Creation Page");

			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimwc", false, "NA", "Workers Comp Page", Intlogval);
			StrWorkersCompClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation", "Carrier WC Claim Creation Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation", "Carrier WC Claim Creation Not Successfull")));
			}
		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation Fail", "Carrier WC Claim Creation Not Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation Fail", "Carrier WC Claim Creation Not Successfull")));
			}
			throw (e);
		}		
		return StrWorkersCompClaimNumber;		
	}

	//======================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_WorkersCompCarrierClaimCreation
	//Description  		: Enables Users To Create Worker's Compensation Claim For Carrier Client
	//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, DateOfEvent, TimeofEvent, DateOfClaim, TimeOfClaim, Jurisdiction, Intlogval, boolean ExstEmp Needs To Be True Only When User Wants To Create 
	//Revision			: 0.0 - AbhishekRai-04-09-2018 
	//======================================================================================================================================================================================================================================================================================================================================
	public static String RMA_WorkersCompCarrierClaimCreation(String CarrierWCClaimCreation_Txt_ClaimType, String CarrierWCClaimCreation_Txt_ClaimStatus, int CarrierWCClaimCreation_Txt_EmployeeNumber, String CarrierWCClaimCreation_Txt_Department,String CarrierWCClaimCreation_Txt_PolicyLOB, String CarrierWCClaimCreation_Txt_DateOfEvent, String CarrierWCClaimCreation_Txt_TimeOfEvent, String CarrierWCClaimCreation_Txt_DateOfClaim, String CarrierWCClaimCreation_Txt_TimeOfClaim, String CarrierWCClaimCreation_Txt_Jurisdiction, boolean ExstEmp, String WCClaimCreation_Lst_PolicySystem, String carrierWCClaimCreation_Txt_PolicyNumber,String CarrierWCClaimCreation_Lnk_PolicyLOB, int Intlogval) throws Exception,Error
	{
		String StrWorkersCompClaimNumber; 
		String EmpLstName;
		long EmpSocSecNo;
		//Variable Declaration Completed Here

		StrWorkersCompClaimNumber=null;
		EmpLstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Emp_");
		EmpSocSecNo=RMA_GenericUsages_Utility.RMA_RandomLongGeneration_Utility(111111111, 999999999);
		//Variable Initialization Completed Here
		try
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Worker's Comp Claim Creation");
			}else{	
				logger = reports.startTest("<span id='WorkersCompCorp'>Worker's Comp Claim Creation</span>", "Worker's Comp Claim Is Created");
			}
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-WorkersComp.", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimwc");	
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver)));

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On Workers Compensation Creation Page",  CarrierWCClaimCreation_Txt_Department, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Workers Compensation Claim Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On Workers' Comp Claim Creation Page",Intlogval);
			Thread.sleep(7000);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventIndicatorLookupSearch(driver, "Description"), "Description TextBox On Lookup Window", CarrierWCClaimCreation_Txt_ClaimType, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_EventIndicatorLookupSearch(driver, "Description"), "Serach Button On Lookup Window", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);	
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierWCClaimCreation_Txt_ClaimType, "Claim Type LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On WC Claim Creation Page", CarrierWCClaimCreation_Txt_ClaimType, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Type Is Selected In Workers Compensation Claim Creation Page");	

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_PolicyLOB(driver), "Policy LOB TextBox On WC Claim Page", CarrierWCClaimCreation_Txt_PolicyLOB, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Policy LOB TextBox On Workers Compensation Claim Creation Page");

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Workers' Comp Claim Creation Page", CarrierWCClaimCreation_Txt_DateOfEvent, Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers' Comp Claim Creation Page", CarrierWCClaimCreation_Txt_DateOfClaim, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers' Comp Claim Creation Page",CarrierWCClaimCreation_Txt_TimeOfClaim, Intlogval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Workers' Comp Claim Creation Page", CarrierWCClaimCreation_Txt_TimeOfEvent, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_Jurisdiction(driver), "Claim Jurisdiction Look Up Image Button On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierWCClaimCreation_Txt_Jurisdiction, "Jurisdiction LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Jurisdiction Is Selected In Workers Compensation Claim Creation Page");

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Scroll to View Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Name Lookup Is Visible");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Search Results Page For Policy Lob Is Loaded");
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver)));					
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), "Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), WCClaimCreation_Lst_PolicySystem, "Policy system Dropdown", "Policy Download Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Is Loaded");
			//Policy System Is Selected
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Frame Gets Loaded"); 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_SearchCriteria_Btn_SubmitQuery(driver), "Search Image On Policy Download Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Grid Is Getting Loaded");

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Policy Number"), "Policy Number Type Filter Text Box On Policy Download Screen", carrierWCClaimCreation_Txt_PolicyNumber,logval);//Policy Number Is Entered In Policy Number Input Box On Policy NG Grid
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Details Are Getting Loaded");
			//RMA_Navigation_Utility.RMA_WebLinkSelect(CarrierWCClaimCreation_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(CarrierWCClaimCreation_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Policy LOB");
			//Policy LOB Link Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_Next(driver), "Next Image On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Chk_Int_Cov_List(driver),"check", "Interest Coverage List", "Policy Download Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestCoverageList(driver), "Interest/Coverage List Tab On Policy Download Popup", Intlogval);
			//RMA_Navigation_Utility.RMA_SelectSpecifiedPositionWTObjectsByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable(driver), "Insured", "WEBCHECKBOX",1, Intlogval);
			//Claimant Check-Box Is checked

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Chk_Int_Cov_List(driver),"check", "Interest Coverage List", "Policy Download Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Chk_CoverageDetails(driver), "Coverage Details Checkbox On Policy Download Popup", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_UnitList(driver), "Unit List Tab On Policy Download Popup", Intlogval);
			//RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tbl_UnitListTable(driver), "NEW YORK", "WEBCHECKBOX", Intlogval);

			//RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable(driver), "000000", "WEBCHECKBOX", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Btn_Select(driver), "Select Button On Property Popup", Intlogval);
			//Record Is Selected

			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Record");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_PolicyDownloadWC(driver), "Policy Download Image On Policy Download Page", Intlogval);
			//Policy Is Downloaded

			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolDownloadModalDialog_Btn_Ok(driver), "Ok Button On Modal Popup To Add Claimant As Insured", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Carrier WC Claim Page Is Loaded");

			if(ExstEmp==true)
			{
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", String.valueOf(CarrierWCClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Employee Is Selected In Workers Compensation Claim Creation Page");
			}

			else{
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", String.valueOf(CarrierWCClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeInfo(driver), "Employee Info Tab On Worker Comp Claim Creation Page",Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_LastName(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", EmpLstName, Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_SocSecNo(driver), "Employee Number TextBox Criteria On Workers' Comp Claim Creation Page", String.valueOf(EmpSocSecNo), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers' Comp Claim Creation Page",logval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EmployeeInfoDepartment(driver), "Department Employee TextBox On Workers' Comp Claim Creation Page",CarrierWCClaimCreation_Txt_Department, Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Employee Info Tab On Workers Compensation Claim Creation Page");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Workers Comp Claim Creation Page", Intlogval);
			}

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On Workers' Comp Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Open", "Claim Status LookUp Window On Workers' Comp Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "Claim Status TextBox On WC Claim Creation Page", CarrierWCClaimCreation_Txt_ClaimStatus, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Status Is Selected In Workers Compensation Claim Creation Page");

			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimwc", false, "NA", "Workers Comp Page", Intlogval);
			StrWorkersCompClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation", "Carrier WC Claim Creation Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation", "Carrier WC Claim Creation Not Successfull")));
			}
		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation Fail", "Carrier WC Claim Creation Not Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier WC Claim Creation Fail", "Carrier WC Claim Creation Not Successfull")));
			}
			throw (e);
		}		
		return StrWorkersCompClaimNumber;		
	}

	//==================================================================================================================================================================================
	//FunctionName 		: RMA_BankAccount_AddEdit_Utility
	//Description  		: Enables The User To Add Bank Account
	//Input Parameter 	: BankAddr1, BankCity, BankState, ZipCode, AccountName, AccountType, NextCheck, BankOwner,
	//			  		: Case Variable To Indicate User Action (Create and Edit BankAccount), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
	//Revision			: 0.0 - RenuVerma-10-17-2016          
	//					: 0.1 - RenuVerma-03-16-2017 Changed Parent Logger Statement as Info  
	//					: 0.2 - AbhishekRai-02-27-2018 Bank Account Creation On UX Screen   
	// ====================================================================================================================================================================================
	//Note: User Must Pass "NA" or 00 For Optional Parameter If No Valid Value Is Present
	public static String RMA_BankAccount_AddEdit_Utility(String Case, String BankAddr1,String BankCity,String BankState, int ZipCode,int BankAccountNo, String AccountName, String AccountType, int NextCheck, String BankOwner, boolean AdditionalParameter,String BankAddr2,int logval) throws Exception, Error
	{
		String BankName;
		ReturnValue=null;
		//Variable Declaration
		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User can "+Case+" Bank Account");
			}
			else
			{	
				logger = reports.startTest("<span id='BankAccount'>Bank Account Addition </span>", "User can "+Case+" Bank Account");
			}
			switch (Case){
			case "Create":
			{
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);						

				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);	
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); // Wait For UX Page Load Bar To Disappear					
				BankName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "ABank_");

				CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bank Name Value Is Provided");
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver)));
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver), "Bank Name TextBox On Bank Account Page", BankName, logval);
				globalWait.until(ExpectedConditions.attributeToBe(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver),"value",BankName));
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_Adderss1(driver), "Bank Address 1 TextBox On Bank Account Page", BankAddr1, logval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankCity(driver), "Bank City TextBox On Bank Account Page", BankCity, logval);		
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankState(driver), "Bank State TextBox On Bank Account Page", BankState, logval);		
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Entered In Bank State TextBox On Bank Account Page");
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankZipCode(driver), "Bank Zip Code TextBox On Bank Account Page", String.valueOf(ZipCode), logval);		
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver), "Bank Account No TextBox On Bank Account Page", String.valueOf(BankAccountNo), logval);		
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver), "Account Name TextBox On Bank Account Page", AccountName, logval);		
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountType(driver), "Account Type TextBox On Bank Account Page", AccountType, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Value Is Entered In Account Type TextBox On Bank Account Page");
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver), "Next Check Number TextBox On Bank Account Page", String.valueOf(NextCheck), logval);					
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Bank Account Creation Page", logval);
				RMA_Verification_Utility.RMA_TextCompare(AccountName, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
				ReturnValue=RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value");
				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Created Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				else
				{
					logger.log(LogStatus.PASS, "Created Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				break;
			}
			case "Edit":
			{
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);					
				RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
				CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountType(driver), "Account Type TextBox On Bank Account Page", AccountType, logval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver), "Next Check Number TextBox On Bank Account Page", String.valueOf(NextCheck), logval);	
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Bank Account Creation Page", logval);
				RMA_Verification_Utility.RMA_TextCompare(AccountName, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
				RMA_Verification_Utility.RMA_TextCompare(String.valueOf(NextCheck), RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver).getAttribute("value") , "Check Number", logval);
				ReturnValue=RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankName(driver).getAttribute("value");
				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Edited Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				else
				{
					logger.log(LogStatus.PASS, "Edited Bank Account Successfully With Bank Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				break;
			}
			default:
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CheckStocksCreation_Utility
	//Description  		: Enables The User To Create Check Stocks
	//Input Parameter 	: Driver Of The Type WebDriver, Stockname, FontName Of Type String, FontSize Of Type Integer.
	//Revision			: 0.0-NidhiJha-09-06-2017
	//Revision			: 0.1-AnubhutiVyas-04-04-2018 Check Stock is now move to UX Screen
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_CheckStocksCreation_Utility(String Stockname,String FontName, int FontSize ,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A Check Stock");
			}else{	
				logger = reports.startTest("<span id='CheckStocks'>Check Stocks Creation</span>", "User Creates A Check Stock");
			}

			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_CheckStock(driver), "Check Stock Button On Bank Account Page", logval);			
			//driver.switchTo().parentFrame();
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("checkstock");
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Check Stock Frame Needs To Be Loaded");
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_CheckStocksStockName(driver), "Stock Name Text Box On Check Stocks Page", Stockname, logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_CheckStocksFontName(driver), FontName, "Font Name ListBox", "Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is added As Font Name Needs To Get Populated");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_CheckStocksFontSize(driver), FontSize, "Font Size ListBox", "Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As Font Size Needs To Get Populated");
			RMA_Functionality_Utility.RMA_GenericSave_Utility("checkstock", false, "NA", "Check Stock Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is To Load Check Stock");	

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Alignment Options"), "Alignment Options Tab On Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Alignment Options Tab  Needs To Be Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_ChkStock_Restore(driver), "Restore Default Options From Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added Load Screen After Restore");
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_ChkStock_OKbtn(driver), "Ok Button From Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Load Screen After Click On Ok");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Advanced Options"), "Advanced Options Tab On Check Stocks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Advanced Options Tab  Needs To Be Loaded");	
			//RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_CheckStock_Chk_PrintClaimNoOnCheck(driver), "Print Claim Number On check Check Box On Check Stocks Page", logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Check Print Claim Number On check Check Box");
			//RMA_Navigation_Utility.RMA_ScrollIntoView(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_CheckNumber_chk(driver), "Check Number From Check Stocks Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_CheckNumber_chk(driver), "Check Number From Check Stocks Page", logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Check Check Number Check Box");
			RMA_Navigation_Utility.RMA_ScrollIntoView(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_CheckStock_Chk_PrintControlNoOnCheckStub(driver), "Print Control No On CheckStub Check Box From Check Stocks Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_CheckStock_Chk_PrintControlNoOnCheckStub(driver), "Print Control No On CheckStub Check Box From Check Stocks Page", logval);			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_CheckStock_Chk_PrintControlNoOnCheckStub(driver), "check", "Print Control No On CheckStub Check Box", "Check Stocks Page", logval);		
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Check PrintControlNoOnCheckStub Check Box");

			RMA_Functionality_Utility.RMA_GenericSave_Utility("checkstock", false, "NA", "Check Stock Page", logval);			
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is To Load Check Stock");	

			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Check Stocks Page", logval);// Save Button Is Clicked

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Check Stocks Creation", "New Check Stock Is Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Check Stocks Creation", "New Check Stock Creation Is Created")));
			}
		}
		catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Check Stocks Creation Fail", "Check Stocks Is Not Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Check Stocks Creation Fail", "Check Stocks Is Not Created")));
			}

			throw (e);
		}
		finally
		{				
			//RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

		}
	}
	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CheckStocksClone_Utility
	//Description  		: Enables The User To Create Check Stocks
	//Input Parameter 	: Driver Of The Type WebDriver, Stockname, FontName Of Type String, FontSize Of Type Integer.
	//Revision			: 0.0-Jannathussain-05-02-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static String RMA_CheckStocksClone_UtilityUX(String BankAccountCreation_Txt_BankAccountName,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Clones A Check Stock");
			}else{	
				logger = reports.startTest("<span id='CloneCheckStocks'>Check Stocks Clone</span>", "User Clones A Check Stock");
			}

			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//Global Variable Initialization Is Completed Here

			String CloneStockName;

			//==============================================================Steps To Clone Check Stocks Is Started Here=======================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Btn_CheckStocksCloneUX(driver), "Clone Button On Check Stocks Page", logval);

			//RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Check Stocks Clone");
			//Hussain
			//RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			Thread.sleep(4000);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Btn_CheckStocksCloneCreate(driver), "Create Button On Check Stocks Clone Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Btn_CheckStocksCloneCreateUX(driver), "Create Button On Check Stocks Clone Page", logval);

			//driver.switchTo().window(StrPrimaryWindowHandle);
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			//Hussain
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
			CloneStockName = RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_CheckStocksStockName(driver).getAttribute("value");
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_Save(driver), "Save Image On Check Stocks Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", logval);
			//==============================================================Steps To Clone Check Stocks Is Completed Here=======================================================================================================================================================================================================================

			//==============================================================Steps To Verify Stock Name After Cloning Is Started Here===========================================================================================================
			RMA_Verification_Utility.RMA_TextCompare(CloneStockName, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_CheckStocksStockName(driver).getAttribute("value"), "Stock Name On Check Stocks Page", logval);
			//==============================================================Steps To Verify Stock Name After Cloning Is Completed Here===========================================================================================================
			Thread.sleep(4000);

			return CloneStockName;
		}

		catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Check Stocks Creation Fail", "Check Stocks Is Not Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Check Stocks Creation Fail", "Check Stocks Is Not Created")));
			}

			throw (e);

		}
	}
	//==================================================================================================================================================================================
	//FunctionName 		: RMA_CombinedPayee_Add_Utility
	//Description  		: Enables The User To Add Combined Payee
	//Input Parameter 	: BankAccount:Bank Account Of Type String Enables The User To Provide Bank Account Name For Combined Payee Creation
	//                    PayInterval : PayInterval Of Type String Enables The User To Provide Pay Interval For Combined Payee Creation
	//Revision			: 0.0 - AnubhutiVyas-08-14-2017
	//Revision			: 0.1 - AnubhutiVyas-04-04-2018 Combine Payee is move to UX screen   
	// ====================================================================================================================================================================================
	public static String RMA_CombinedPayee_Add_Utility(String BankAccount,String CombinedPayment_Txt_LastName, String PayInterval,int logval) throws Exception, Error
	{
		String CombinedPaySetUp_Txt_StartDate;
		String CombinedPaySetUp_Txt_NxtSchdDate;
		String CombinedPaySetUp_Txt_NxtSchdPrint;
		//Local Variable Declaration

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Combined Payee Setup Is Created");
			}
			else
			{	
				logger = reports.startTest("<span id='CombinedPayee'>Combined Payee Addition</span>", "Combined Payee Setup Is Created");
			}

			CombinedPaySetUp_Txt_StartDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			CombinedPaySetUp_Txt_NxtSchdDate = 	RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,-1,0,"MM/dd/yyyy");;
			CombinedPaySetUp_Txt_NxtSchdPrint =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,-1,0,"MM/dd/yyyy");
			//Local Variable Initialization Is Completed

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-CombinedPayment", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("combinedpayment");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added Combined Frame Needs To Be Loaded");

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Lst_BankAccount(driver), BankAccount, "Bank Account List Box", "Bank Account On Combined Payment Page",logval);
			//Combined Payment Screen Is Opened And Bank Account Is Selected
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_LastName(driver), "Last Name TextBox On Combined Payment Page", CombinedPayment_Txt_LastName, logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added Last Name Needs To Be Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_CombinedPayment.RMAApp_CombinePayment_Tab_ScheduleSetup(driver), "Schedule Setup Tab On Combined Payment Setup Page",logval);			
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_PayInterval(driver), "Pay Interval Text Box On Combined Payment  Page", PayInterval, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Btn_PayInterval(driver), "Pay Interval Text Box On Combined Payment  Page", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Month","Pay Interval Link",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Value Is Entered In Pay Interval Text Box");
			//Value Is Entered In Pay Interval Text Box

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_Startdate(driver), "Starting On Date TextBox On Combined Payment Setup Page",logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_Startdate(driver), "Starting On Date TextBox On Combined Payment Setup Page", CombinedPaySetUp_Txt_StartDate, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchDate(driver), "Next Scheduled Date TextBox On Combined Payment Setup Page",logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchDate(driver), "Next Scheduled Date TextBox On Combined Payment Setup Page", CombinedPaySetUp_Txt_NxtSchdDate, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchdPrint(driver), "Next Schedule Print Date TextBox On Combined Payment Setup Page",logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtSchdPrint(driver), "Next Schedule Print Date TextBox On Combined Payment Setup Page", CombinedPaySetUp_Txt_NxtSchdPrint, logval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_NxtPrintOverride(driver), "Next Print Override Date TextBox On Combined Payment Setup Page",logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.CombinedPaymentSetupFrame, false, "NA", "Combined Payment SetUp Page", logval);// Save Button Is Clicked

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Combined Payee Creation", "New Combined Payee Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Combined Payee Creation", "New Combined Payee Is Created Successfully")));
			}
		} catch (Exception|Error e) 
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "General Claim Creation Fail", "New General Claim Is Not Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "General Claim Creation Fail", "New General Claim Is Not Created")));
			}
			throw (e);
		}
		return CombinedPayment_Txt_LastName;
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_BulkCheckRelease
	//Description  		: Enables The User To Release Bulk Check 
	//Input Parameter 	: BankAccountName Of Type String ,logval Of Type Integer	
	//Revision			: 0.1-AbhishekRai-05-09-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_BulkCheckRelease(String BankAccountName ,String GenClaimNumber ,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Releases Bulk Check");
			}else{	
				logger = reports.startTest("<span id='BulkCheckRelease'>Successful Release Of Bulk Check</span>", "User Releases Bulk Check");
			}				
			//Local Variable Declaration Completed 				
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BulkCheckRelease", logval);				
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("bulkcheckrelease");				
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Frame Is Getting Loaded");				
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Txt_AccountName(driver), "Bank Account Name TextBox On RMA Application Funds--->Bulk Check Release Page", BankAccountName, logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Txt_ClaimNumber(driver), "Claim Number TextBox On RMA Application Funds--->Bulk Check Release Page", GenClaimNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Btn_Search(driver), "Search Button On Bulk Check Release Page",logval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Btn_SelectAll(driver), "Select All Button On Bulk Check Release Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Btn_Process(driver), "Process Button On Bulk Check Release Page",logval);				
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Txt_Msg(driver, RMA_Selenium_POM_VerificationMessage.PaymentsProcessedMsg), "displayed", "Message", logval);
			//Payments Processed Successfully

			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckRelease_Txt_Msg(driver, RMA_Selenium_POM_VerificationMessage.BulkCheckReleaseMsg), "displayed", "Message", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckReleaseProcessPayments_Btn_Close(driver), "Close Button On Process Payments Window",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_BulkCheckRelease.RMAApp_FundsBulkCheckReleaseProcessPayments_Btn_Close(driver), "Close Button On Payment Search Result Window",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
			//Bulk Check Release Done Successfully
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Bulk Release Of Checks", "Bulk Release Of Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Bulk Release Of Checks", "Bulk Release Of Checks Is Done Successfully")));
			}
		}
		catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Bulk Release Of Checks Fail", "Bulk Release Of Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Bulk Release Of Checks Fail", "Bulk Release Of Checks Is UnSuccessful")));
			}

			throw (e);
		}

		finally
		{				
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame				
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Button On Bulk Check Release Page", logval);

		}
	}
	//====================================================================================================================================================================================================================================================================================================
	//FunctionName          : RMA_Funds_MarkChecksAsCleared
	//Description           : Enables The To User Mark The Created Checks As Cleared
	//Input Parameter       : BankAccountName Of Type String ,logval Of Type Integer
	//Revision              : 0.0-AbhishekRai-05-09-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_MarkChecksAsCleared(String BankAccountName ,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Marks Checks As Cleared");
			}else{     
				logger = reports.startTest("<span id='MarkChecksAsCleared'>Mark Checks As Cleared</span>", "User Marks Checks As Cleared");
			}

			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//Global Variable Initialization Is Completed Here
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-MarkChecksasCleared", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("clearchecks");
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_MarkChecksAsCleared.RMAApp_FundsMarkChecks_Lst_Bankaccount(driver), BankAccountName, "Bank Account List", "Funds--->Mark Checks As Cleared  Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_MarkChecksAsCleared.RMAApp_FundsMarkChecks_Btn_Refresh(driver), "Refresh Button On Funds--->Mark Checks As Cleared  Page", logval);                                              
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_MarkChecksAsCleared.RMAApp_FundsMarkChecks_Btn_SelectAll(driver), "Select All Button On Funds--->Mark Checks As Cleared  Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_MarkChecksAsCleared.RMAApp_FundsMarkChecks_Btn_MarkCleared(driver), "Mark Cleared Button On Funds--->Mark Checks As Cleared  Page", logval);

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Marking Of Checks As Cleared", "Checks Marked As Cleared")));
			}else{     
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Marking Of Checks As Cleared", "Checks Marked As Cleared")));
			}
		}

		catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Marking Of Checks As Cleared Fail", "Checks Are Not Cleared")));
			}else{     
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Marking Of Checks As Cleared Fail", "Checks Are Not Cleared")));
			}

			throw (e);
		}
		finally
		{
			driver.switchTo().parentFrame(); // Navigate To Parent Frame 
		}

	}

	//================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_DepositCreation_Utility
	//Description  		: Enables The User To Create Deposit
	//Input Parameter 	:  BankORSubBankAccountName, TransactionDate Of Type String, TransactionAmount Of Type Integer, Logval of Integer Type
	//Revision			: 0.0-ShrutiShruti-05-15-2018
	//================================================================================================================================================================================================================================================================================================================================================================

	public static String RMA_DepositCreation_Utility(String BankORSubBankAccountName,String TransactionDate, int TransactionAmount ,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A Deposit");
			}else{	
				logger = reports.startTest("<span id='Deposit'>Deposit Creation</span>", "User Creates A Deposit");
			}
			CurrentFrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_Deposit_Lst_SubBankAccount(driver), BankORSubBankAccountName, "Bank/Sub bank Account List", "Deposit Creation Page", logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_Deposit_Txt_Amount(driver),"Amount TextBox On Deposit Creation Page", String.valueOf(TransactionAmount), logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_Deposit_Txt_TransactionDate(driver), "Transaction Date TextBox On Deposit Creation Page", TransactionDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_ControlNumber(driver), "Control Number TextBox On Deposit Creation Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Deposit Page", logval);
			ReturnValue = RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_ControlNumber(driver).getAttribute("value");

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Deposit Creation", "Deposit Is Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Deposit Creation", "Deposit Is Created")));
			}

			return ReturnValue;
		}
		catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deposit Creation Fail", "Deposit Is Not Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deposit Creation Fail", "Deposit Is Not Created")));
			}

			throw (e);
		}
	}
	//==================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_SubBankAccount_AddEdit_UtilityUX
	//Description  		: Enables The User To Add Sub Bank Account
	//Input Parameter 	: StrSubBankAccountMinBal, StrSubBankAccountTargetBal, StrSubBankAccountOwner, String StrSubBankAccountLOB,
	//		  			  Case Variable To Indicate User Action (Create and Edit SubbankAccount), AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 						
	//Revision			: 0.0 - Jannathhussain-05-07-2018          

	// ================================================================================================================================================================================================================================================================
	// Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present

	public static String RMA_SubBankAccount_AddEdit_UtilityUX(String Case, int StrSubBankAccountMinBal, int StrSubBankAccountTargetBal, String StrSubBankAccountOwner, String StrSubBankAccountLOB, boolean AdditionalParameter,int logval) throws Exception, Error
	{
		String StrSubAccountName;
		int StrSubBankAccountNumber;
		String StrEditedSubAccountName;
		int StrEditedSubBankAccountNumber;
		ReturnValue=null;
		//Variable Declaration

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User can "+Case+" Sub Bank Account");
			}
			else
			{	
				logger = reports.startTest("<span id='SubBankAccount'>"+Case+" Sub Bank Account Utility </span>", "User can "+Case+" Sub Bank Account");
			}
			switch (Case){
			case "Create":
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_SubAccounts(driver), "Add New Button From Bank Account Page", logval);
				StrSubAccountName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "SubBank_");
				StrSubBankAccountNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Load Departments");

				//RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountMinBalance(driver), "Minimum Balance Field On Sub Bank Account Page", logval);
				String MinBalance=String.valueOf(StrSubBankAccountMinBal);
				String TargtBalance=String.valueOf(StrSubBankAccountTargetBal);


				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver),"Sub Account Name TextBox On Sub Bank Account Page",StrSubAccountName , logval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountNumber(driver),"Sub Account Number TextBox On Sub Bank Account Page",String.valueOf(StrSubBankAccountNumber) , logval);

				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Load Departments");
				Actions actions = new Actions(driver);
				actions.moveToElement(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountMinBalance(driver));
				actions.click();
				actions.sendKeys(MinBalance);
				actions.build().perform();
				//RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountMinBalance(driver).clear();
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Load Departments");
				//RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountMinBalance(driver).sendKeys(MinBalance);
				//RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountMinBalance(driver),"Sub Account Minimum Balance TextBox On Sub Bank Account Page",String.valueOf(StrSubBankAccountMinBal) , logval);
				actions.moveToElement(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountTargetBal(driver));
				actions.click();
				actions.sendKeys(TargtBalance);
				actions.build().perform();

				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Load Departments");
				//RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountTargetBal(driver).clear();
				//RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Load Departments");
				//RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountTargetBal(driver).sendKeys(TargtBalance);
				//RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountTargetBal(driver),"Sub Account Target Balance TextBox On Sub Bank Account Page",String.valueOf(StrSubBankAccountTargetBal) , logval);

				//commented as per JIRA RMA-71937 
				/*RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Tab_AccountOwner(driver), "Account Owner Link Tab On Bank Account Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Load Departments");
				//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_Owner(driver), "Account Owner Field On Bank Account Page", logval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_Owner1(driver), "Account Owner TextBox On Bank Account Page",StrSubBankAccountOwner , logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Load Departments");
				 */
				//RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.partialLinkText(StrSubBankAccountOwner)), "ST-Street Department Link On Org Hierarchy Page", logval);
				RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.BankAccountFrame, false, "NA", "Bank Account Creation Page", logval);
				Thread.sleep(5000);
				//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), " Save Image On Sub Bank Account Page", logval);
				RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
				RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
				RMA_Verification_Utility.RMA_TextCompare(StrSubAccountName, RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value") , "Account Name", logval);
				ReturnValue=RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value");
				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Created Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				else
				{
					logger.log(LogStatus.PASS,  "Created Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				break;
			}
			case "Edit":
			{
				StrEditedSubAccountName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedSubBank_");
				StrEditedSubBankAccountNumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver),"Sub Account Name TextBox On Sub Bank Account Page",StrEditedSubAccountName , logval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountNumber(driver),"Sub Account Number TextBox On Sub Bank Account Page",String.valueOf(StrEditedSubBankAccountNumber) , logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), " Maintenance-->Bank Account-->Sub Bank Account Page", logval);
				RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
				RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
				RMA_Verification_Utility.RMA_TextCompare(StrEditedSubAccountName, RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value") , "Account Name", logval);
				ReturnValue=RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountName(driver).getAttribute("value");

				if(logval == 0)
				{
					parentlogger.log(LogStatus.PASS, "Edited Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}
				else
				{
					logger.log(LogStatus.PASS, "Edited Sub Bank Account Successfully With Sub Account Name:" + " " + color.RMA_ChangeColor_Utility(ReturnValue,3));
				}break;
			}
			default:
			{
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			throw (e);
		}
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_ReCreateCheckFile
	//Description  		: Enables The User To Re-Create Checks
	//Input Parameter 	: BankAccountName Of Type String ,CheckBatchNumber,logval Of Type Integer
	//Revision			: 0.0-AbhishekRai-05-22-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_ReCreateCheckFile(String BankAccountName ,String CheckBatchNumber,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Re-Creates Checks");
			}else{	
				logger = reports.startTest("<span id='ReCreateChecks'>Successful Recreation Of Checks</span>", "User Re-Creates Checks");
			}

			//Local Variable Declaration Completed 

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-ReCreateCheckFile", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("recreatecheck");
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Frame Is Getting Loaded");				
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_ReCreateCheckFile.RMAApp_ReCreateCheckFile_Lst_Bankaccount(driver), BankAccountName, "Bank Account List", "Funds--->Re Create Check File Page", logval);
			//Bank Account Is Selected From The List

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Funds_ReCreateCheckFile.RMAApp_ReCreateCheckFile_Txt_CheckBatch(driver), "Check Batch Text Box On Re Create Check File Page", String.valueOf(CheckBatchNumber), logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_ReCreateCheckFile.RMAApp_ReCreateCheckFile_Btn_Reprint(driver), "Reprint Button On Re Create Check File page", logval);
			//Check Is Reprinted

			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_Selenium_POM_VerificationMessage.ReCreateCheckFileMsg, RMA_Selenium_POM_Funds_ReCreateCheckFile.RMAApp_ReCreateCheckFileMsg_Txt_Msg(driver).getText(), "Message On Reprint Window", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_ReCreateCheckFile.RMAApp_ReCreateCheckFileMsg_Btn_Ok(driver), "Ok Button On Reprint Window", logval);
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Re-Creation Of Checks", "Re-Creation Of Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Re-Creation Of Checks", "Re-Creation Of Checks Is Done Successfully")));
			}
		}
		catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Re-Creation Of Checks Fail", "Re-Creation Of Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Re-Creation Of Checks Fail", "Re-Creation Of Checks Is UnSuccessful")));
			}

			throw (e);
		}

	}
	//====================================================================================================
	//FunctionName 		: RMA_FinalPayment_Utility
	//Description  		: Enables The User To Add Final Payment 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
	//Revision			: 0.0-Jannathhussain-22-05-2018
	// ====================================================================================================
	public static String RMA_FinalPayment_Utility(String BankAccnt,String PayeeType, String ReserveType, Object TransType, int Amount, String LastName, String DisType, int Intlogval) throws Exception, Error
	{
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Payment ");
			}else{	
				logger = reports.startTest("<span id='PaymentAddition'>TC_Payment Addition</span>", "User Makes A New Payment");
			}	

			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Screen Is Getting Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinalPayment_Flag(driver), "Final Payment Check Box On Transaction Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);

			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			//Hussain



			//Hussain
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			if((!ReserveType.equals("NA")) & (!ReserveType.equals("WC"))  ){
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(Intlogval);
			// Payment Is Added And Funds Split Details View Is Closed
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);
			//Save Button Is Clicked To Save The Transaction

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",Intlogval);// Transaction Tab On Payment Creation Page Is Clicked
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation", "New Payment Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation", "New Payment Is Created Successfully")));
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition Fail", "Payment Is Not Added")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition Fail", "Payment Is Not Added")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
	}
	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_ReleasePrintedCheck
	//Description  		: Enables The User To Release The Printed Check
	//Input Parameter 	: BankAccountName,GenClaimNumber, strcontrolnumber Of Type String ,Logval Of Type Integer
	//Revision			: 0.0-AbhishekRai-05-22-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_ReleasePrintedCheck(String BankAccountName ,String GenClaimNumber,String strcontrolnumber,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Resets The Printed Check");
			}else{	
				logger = reports.startTest("<span id='ResetPrintedCheck'>Reset Printed Check</span>", "User Resets Printed Checks");
			}

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-ResetPrintedCheck", logval);				
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("resetchecks");
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_ResetPrintedCheck.RMAApp_FundsResetPrintedCheck_Lst_Bankaccount(driver), BankAccountName, "Bank Account List", "Funds--->Reset Printed Check Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_ResetPrintedCheck.RMAApp_FundsResetPrintedCheck_Btn_Refresh(driver), "Refresh Button On Funds--->Reset Printed Check Page", logval);
			//Funds- Reset Printed Check Page Is Loaded And Refresh Button Is Clicked

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_ResetPrintedCheck.RMAApp_FundsResetPrintedCheck_Btn_SelectAll(driver), "Select All Button On Funds--->Reset Printed Check Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_ResetPrintedCheck.RMAApp_FundsResetPrintedCheck_Btn_MarkAsReleased(driver), "Mark As Released Button On Funds--->Reset Printed Check Page", logval);
			//Selected Checks Are Marked As Released

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Release Of Printed Checks", "Release Of Printed Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Release Of Printed Checks", "Release Of Printed Checks Is Done Successfully")));
			}

		}
		catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Release Of Printed Checks Fail", "Release Of Printed Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Release Of Printed Checks Fail", "Release Of Printed Checks Is UnSuccessful")));
			}

			throw (e);
		}
		finally
		{
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame  
		}
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_UnClearChecks
	//Description  		: Enables The User To UnClear Checks
	//Input Parameter 	: BankAccountName Of Type String, logval Of Type Integer
	//Revision			: 0.0-ShrutiShruti-05-29-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_UnClearChecks(String BankAccountName,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Un-Clears Checks");
			}else{	
				logger = reports.startTest("<span id='UnClearingChecks'>Successful Un-Clears Of Checks</span>", "User Un-Clears Checks");
			}

			//Local Variable Declaration Completed 

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-UnclearCheck", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("unclearchecks");
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Frame Is Getting Loaded");				
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_UnClearChecks.RMAApp_FundsUnClearChecks_Lst_Bankaccount(driver), BankAccountName, "Bank Account List", "Funds--->Re Create Check File Page", logval);
			//Bank Account Is Selected From The List

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_UnClearChecks.RMAApp_FundsUnClearChecks_Btn_Refresh(driver), "Refresh Button On Un-Clear Checks Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_UnClearChecks.RMAApp_FundsUnClearChecks_Btn_SelectAll(driver), "Select all Row Marker Checkbox On Un-clear Check File page", logval);
			//Check Is Reprinted

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_UnClearChecks.RMAApp_FundsUnClearChecks_Btn_MarkUncleared(driver), "Mark unCleared Button On Un-Clear Checks Window", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Un-Clear Of Checks", "Un-Clear Of Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Un-Clear Of Checks", "Un-Clear Of Checks Is Done Successfully")));
			}
		}
		catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Un-Clear Of Checks Fail", "Un-Clear Of Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Un-Clear Of Checks Fail", "Un-Clear Of Checks Is UnSuccessful")));
			}

			throw (e);
		}

	}	

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_VoidChecks
	//Description  		: Enables The User To Void Checks
	//Input Parameter 	: BankAccountName Of Type String, logval Of Type Integer
	//Revision			: 0.0-ShrutiShruti-05-29-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_VoidChecks(String BankAccountName,int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Void Checks");
			}else{	
				logger = reports.startTest("<span id='VoidsChecks'>Successful Voiding Of Checks</span>", "User Voids Checks");
			}

			//Local Variable Declaration Completed 

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-VoidCheck", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("voidchecks");
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Frame Is Getting Loaded");				
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_VoidingChecks.RMAApp_FundsVoidChecks_Lst_Bankaccount(driver), BankAccountName, "Bank Account List", "Funds--->Re Create Check File Page", logval);
			//Bank Account Is Selected From The List

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_VoidingChecks.RMAApp_FundsVoidChecks_Btn_Refresh(driver), "Refresh Button On Un-Clear Checks Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_VoidingChecks.RMAApp_FundsVoidChecks_Btn_SelectAll(driver), "Select all Row Marker Checkbox On Un-clear Check File page", logval);
			//Check Is Reprinted

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_VoidingChecks.RMAApp_FundsVoidChecks_Btn_VoidChecks(driver), "Mark unCleared Button On Un-Clear Checks Window", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Voiding Of Checks", "Voiding Of Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Voiding Of Checks", "Voiding Of Checks Is Done Successfully")));
			}
		}
		catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Voiding Of Checks Fail", "Voiding Of Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Voiding Of Checks Fail", "Voiding Of Checks Is UnSuccessful")));
			}

			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddWithholdingToEntity_Utility
	//Description  		: Enables The User To Add Withholding To The Entity 
	//Input Parameter 	: Withholding_Creation_Chk_Flag, Withholding_Creation_Txt_Percentage,Withholding_Creation_Txt_Recipient, VoucherPayment_Chk_Flag, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - DebasmitaPati-05-22-2018
	//==========================================================================================================================================================================================================================================
	public static void RMA_AddWithholdingToEntity_Utility(String Withholding_Creation_Chk_Flag, String Withholding_Creation_Txt_Percentage,String Withholding_Creation_Txt_Recipient,String VoucherPayment_Chk_Flag, int Intlogval) throws Exception, Error
	{
		try {
			String StrMsg;
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A New WithHolding From the Entity Screen");
			}else{	
				logger = reports.startTest("<span id='WithHoldingAdd'>Withholding Addition</span>", "User Creates A New WithHolding On The Created Entity");
			}
			String DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Employee_Img_WithHolding(driver), "Withholding Image Button On Employee Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.WithholdingFrame);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_CheckBox_EnableWithholding(driver), Withholding_Creation_Chk_Flag, "Enable Backup Withholding Chechbox", "On Withholding Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Percentage(driver),"Percentage TextBox On WithHolding Creation Page", Withholding_Creation_Txt_Percentage, Intlogval);

			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Recipient(driver), "Recipient TextBox On WithHolding Creation Page", Withholding_Creation_Txt_Recipient, Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Recipient(driver), "Recipient TextBox On WithHolding Creation Page", Withholding_Creation_Txt_Recipient, Intlogval);
			Thread.sleep(2000);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Lst_Recipientdropdownmenu(driver), "Select Recipient From Recipient List On Withholding Page", Intlogval);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_CheckBox_VoucherPayment(driver), VoucherPayment_Chk_Flag, "Voucher Payment Checkbox", "Withholding Creation Page", Intlogval);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Withholding Page", logval);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

			StrMsg=RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave;
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave), "Withholding Save Toast Message", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave, false, "Withholding Save Toast Message", Intlogval);
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")));
			//Withholding_Creation_Txt_Percentage=RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Withholding.RMAApp_Withholding_Txt_Percentage(driver), "value");
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Withholding Creation", "New Withholding Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Withholding Creation", "New Withholding Is Created Successfully")));
			}
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Withholding Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_CancelCloseButton(driver), "Close Image Button On Withholding Page", logval);

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Withholding Addition Fail", "Withholding Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Withholding Addition Fail", "Withholding Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}

	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_PrintChecks
	//Description  		: Enables The User To Print Checks
	//Input Parameter 	: BankAccountName Of Type String, logval Of Type Integer
	//Revision			: 0.0-ShrutiShruti-06-08-2018
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_PrintChecks(String BankAccountName,String DisType,String CheckType, String ControlNumber,Object[] ContentToBeVerified,String CheckStockName, int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Prints Checks");
			}else{	
				logger = reports.startTest("<span id='PrintChecks'>Successful Printing Of Checks</span>", "User Prints Checks");
			}

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-PrintChecks", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("printchecks");
			RMA_GenericUsages_Utility.RMA_StaticWait(40, logval, "Wait Is Added As Print Checks Frame Is Getting Loaded");				
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_BankAccount(driver), BankAccountName, "Bank Account List", "Funds--->Print Checks Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Bank Account Is Selected From The List

			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_DistributionType(driver), DisType, "Distribution Type List", "Funds-->Print Check Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Chk_FromDate(driver), "check", "From Date CheckBox ", "Funds-->PrintCheck Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Chk_CombinedPayment(driver), "check", "Include Combined Payment CheckBox ", "Funds-->Print Checks Page", logval);

			if(CheckType.equalsIgnoreCase("Select Checks"))
			{
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_Checks(driver), CheckType, "Check ListBox", "Funds-->Print Check Page", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Btn_SelectChecks(driver), "Select Checks Button On Funds-->Print Checks Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Screen Is Loaded");

				List<WebElement> Radio=driver.findElements(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']"));
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(Radio.get(1), "Control Number TextBox On Grid Window", ControlNumber, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Record Is Getting Loaded");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Chk_SelectCheck(driver), "Select Check to Print Check Box On Grid Window", logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Btn_OKPrint(driver), "Ok Button On Grid Window", logval);
			}

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Img_Print(driver), "Print Image Button On Precheck Register Tab On Print Checks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Print Checks PDF Is Loaded");
			RMA_Verification_Utility.PDFReaderContentVerification_Utility("NA", ContentToBeVerified, "Yes", logval);
			//PDF Contents Are Verified
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Screen Is Switched");
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,RMA_Selenium_POM_VerificationMessage.PreCheckConfirmationMsg), "displayed", "Precheck Register Alert Message", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintChecks.RMAApp_PrintChecks_Btn_PrintCheckOk(driver), "Ok Button On Print Checks Alert Message", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Ok Is Clicked On Pre Check Confirmation Page");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Print Check Batch"), "Print Check Batch Tab", logval);
			//RMA_Navigation_Utility.RMA_WebLinkSelect("Print Check Batch", "Print Check Batch Tab",logval);
			//Print Check Batch Tab Is Selected
			if(CheckStockName!=null)
			{
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_CheckStock(driver), CheckStockName, "Check Stock List", "Funds-->Print Check Page", logval);
			}
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Img_PrintCheck(driver), "Print Image Button On Print Check Batch Tab On Print Checks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(20, logval, "Wait Is Added As Checks And EOB Reports Popup Needs To Get Loaded");
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_Selenium_POM_VerificationMessage.ChecksAndEOBReportsMsg, RMA_Selenium_POM_PaymentsCollections.RMAApp_PrintSingleCheck_Txt_ChecksAndEOBReportsMsg(driver).getText(), "Checks And EOB Reports Message On Checks And EOB Reports Popup", logval);
			//Verification Of Checks And EOB Reports Message Is Done Here

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PaymentChecksAndEOBReports_Btn_Ok(driver), "Ok(Tick Mark Image Button) Button On Checks And EOB Reports Popup", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Print Check Message Popup Needs To Get Loaded");
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_Selenium_POM_VerificationMessage.CheckPrintedVerificationMsg, RMA_Selenium_POM_PaymentsCollections.RMAApp_PrintSingleCheck_Txt_CheckPrintedVerificationMsg(driver).getText(), "Check Printed Verification Msg On Printed Checks Popup", logval);
			//Verification Is Done To Check The Message Which Appears Before Successful Print Of The Check Is Done As An Information

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_Payment_Txt_PrintSingleCheckMsgOk(driver), "Ok(Tick Mark Image Button) Button On Print Check Message Popup", logval);
			//Print Checks Are Given Permission To Print

			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Checks Are Printed");			

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Printing Of Checks", "Printing Of Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Printing Of Checks", "Printing Of Checks Is Done Successfully")));
			}
		}
		catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Printing Of Checks Fail", "Printing Of Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Printing Of Checks Fail", "Printing Of Checks Is UnSuccessful")));
			}

			throw (e);
		}
	}	
	//====================================================================================================
	//FunctionName 		: RMA_Funds_TransactionCreation_Utility
	//Description  		: Enables The User To Add Transaction Through Funds Link 
	//Input Parameter 	:  BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
	//Revision			: 0.0-ShrutiShruti-06-08-2018
	// ====================================================================================================
	public static String RMA_Funds_TransactionCreation_Utility(String BankAccnt,String PayeeType, Object TransType, int Amount, String LastName, String DisType, int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Payment As A Transaction ");
			}else{	
				logger = reports.startTest("<span id='PaymentAddition'>TC_Payment Addition</span>", "User Makes A New Payment As A Transaction");
			}	

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Transaction Creation Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Transaction Creation Page",logval);

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Transaction Creation Page", LastName,logval);

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Transaction Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Distribution Type Is Selected In Transaction Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Transaction Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Transaction Creation Page",logval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Transaction Creation Page", logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Transaction Creation Page", String.valueOf(Amount),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_TransactionTypeTrans(driver), "Transaction Type DropDown List On Funds Details Model Popup On Transaction Creation Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Transaction Type Is Clickable In Transaction Creation Page");
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",logval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",logval);
			}
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Transaction Creation Page",logval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			// Payment Is Added And Funds Split Details View Is Closed
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Funds Split Popup Is getting Disappered");

			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Transaction Creation Page", logval);
			//Save Button Is Clicked To Save The Transaction

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Transaction Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Transaction Creation", "New Transaction Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Transaction Creation", "New Transaction Is Created Successfully")));
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Transaction Addition Fail", "Transaction Is Not Added")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Transaction Addition Fail", "Transaction Is Not Added")));
			}
			throw (e);
		}
	}
	//===================================================================================================================================================================================================================
	//FunctionName 		: RMA_ReserveCorpAdditionWithSaveMessageVerification_Utility
	//Description  		: Enables The User To Add Reserve with Message verification functionality 
	//Input Parameter 	: Driver Of The Type Driver; Status,ReserveType,StrHold,claimNumber Of The Type String; ReserveAmount,Intlogval, SaveMessageVerification: Message to be verified on the time of save
	//Revision			: 0.0 - RenuVerma-08-01-2018
	//Revision			: 0.0 - MishalKantawala-05-20-2022
	//======================================================================================================================================================================================================================
	public static String RMA_ReserveCorpAdditionWithWithoutSaveMessageVerification_Utility(int ReserveAmount, String Status,Object ReserveType, String StrHold, String ClaimNumber, String SaveMessageVerification, boolean AdditionalParameter, int Intlogval ) throws Exception, Error
	{	ReturnValue=null;
	CurrentFrameID=null;
	String []ExpectedValuesToBeVerified;
	try {
		if (Intlogval == 0)
		{
			parentlogger.log(LogStatus.INFO, "A New Reserve Is Created Of Amount "+ReserveAmount+" On Claim "+ClaimNumber);
		}else{	
			logger = reports.startTest("<span id='ReserveCorpAdditionSaveMessage'>Reserve Creation </span>", "A New Reserve Creation Of Amount $"+ReserveAmount+" And Reserve Type: "+ReserveType+" On Claim "+ClaimNumber);
		}				
		//String Code;// for cloud environment			
		String []ExpectedColHeadersToBeVerified={"Balance","Paid","Collection","Incurred","Status"};		
		if(StrHold.equalsIgnoreCase("Yes"))
		{
			ExpectedValuesToBeVerified=new String[]{"$"+ReserveAmount+ ".00", "$0.00", "$0.00", "$"+ReserveAmount+ ".00", "H - Hold"};}
		else{
			ExpectedValuesToBeVerified=new String[]{"$"+ReserveAmount+ ".00", "$0.00", "$0.00", "$"+ReserveAmount+ ".00", Status};}

		//Code="property";// for cloud environment			

		
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Btn_AddReserve(driver), "Add New Reserve Button On Financial Reserves Page",Intlogval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

		if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver), ReserveType, "Reserve Type List Box", "Add New Reserve Window On Financial Reserves Page",Intlogval);
		}
		if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver), ReserveType, "Reserve Type List Box", "Add New Reserve Window On Financial Reserves Page",Intlogval);
		}

		Thread.sleep(2000);
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", Intlogval);
		Thread.sleep(2000);
		RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver).sendKeys(Keys.BACK_SPACE);
		RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver),"Reserve Amount Field On Add New Reserve Window On Financial Reserves Page", String.valueOf(ReserveAmount) ,Intlogval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.id("dateentered")), "Reserve Date Field On Add New Reserve Window On Financial Reserves Page", Intlogval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Reserve Amount Is Converted In USD On Reserve Creation Page");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver), "Reserve Creation List On Financial Reserves Page", Intlogval);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver), Status,"Status List Box","Add New Reserve Window On Financial Reserves Page",Intlogval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		RMA_Input_Utility.RMA_ActionSendKeys_Utility(driver.findElement(By.id("dateentered")), "Date Entered Field On Add New Reserve Window On Financial Reserves Page", RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy"),Intlogval);
		if(!SaveMessageVerification.equalsIgnoreCase("NA")){
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, SaveMessageVerification, "Reserve Creation Page", Intlogval);
		}
		else{
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Reserve Creation Page", Intlogval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver), "disable", "Reserve Type On Financial Reserves Page", Intlogval);	
		}	

		if(!SaveMessageVerification.contains("You do not have permission") )
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Reserve Creation", "New Reserve Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Reserve Creation", "New Reserve Is Created Successfully")));
			}
			//Reserve Creation Is Completed Here

			ReturnValue=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver)).getFirstSelectedOption().getText();
			//ReturnValue= RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_ReserveType(driver).getAttribute("label");

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
		//	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"button clicked ",logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table", Intlogval);
		//	RMA_GenericUsages_Utility.RMA_CheckVerificationNGGridColumnHeader(ExpectedColHeadersToBeVerified, "Reserve", Intlogval);
			//RMA_Input_Utility.RMA_JavaScriptSetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveType,Intlogval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
		//	RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReturnValue, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, Intlogval);

			//Verification Of Correct Reserve Creation Is Being Displayed On Reserves NG Grid Is Done
		}
		return ReturnValue;
	} catch (Exception|Error e) {
		if (Intlogval == 0)
		{
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Addition Fail", "Reserve Is Not Added")));
		}else{	
			logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Addition Fail", "Reserve Is Not Added")));
		}
		throw (e);
	}
	finally{
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
		RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
	}
	}

	//====================================================================================================
	//FunctionName 		: RMA_PaymentCorpAdditionWithSaveMessageVerification_Utility
	//Description  		: Enables The User To Add Payment with Message verification functionality 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer, SaveMessageVerification: Message to be verified on the time of save	 
	//Revision			: 0.0-RenuVerma-08-01-2018
	// ====================================================================================================
	public static String RMA_PaymentCorpAdditionWithSaveMessageVerification_Utility(String BankAccnt,String PayeeType, Object ReserveType, Object TransType, int Amount, String LastName, String DisType, String Strclaimnumber,String VerificationMessage, boolean AdditionalParameter, int Intlogval) throws Exception, Error
	{
		ReserveTypeValueFromWeblist=null;
		TransactionTypeValueFromWeblist=null;
		ReturnValue=null;
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Payment Addition Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}else{	
				logger = reports.startTest("<span id='PaymentAdditionSaveMessage'>Payment Addition</span> Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber, "User Makes A New Payment Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}	

			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			//Thread.sleep(5000);
			RMA_GenericUsages_Utility.RMA_StaticWait(15, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);

			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			if((!ReserveType.equals("NA")) & (!ReserveType.equals("WC"))  ){

				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType.toString(), "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
			}
			ReserveTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
			Thread.sleep(1000);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			// Select Transaction Type from WebList Based on Provided value in Function
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			TransactionTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			// Payment Is Added And Funds Split Details View Is Closed

			if(!VerificationMessage.equalsIgnoreCase("NA")){
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, VerificationMessage, "Payment Creation Page", Intlogval);
				//Save Button Is Clicked To Save The Transaction
			}
			else{
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);
				//Save Button Is Clicked To Save The Transaction
			}	
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval); // Wait For UX Page Load Bar To Disappear                        
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",Intlogval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation", "New Payment Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation", "New Payment Is Created Successfully")));
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition Fail", "Payment Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition Fail", "Payment Is Not Added")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
	}

	//====================================================================================================
	//FunctionName 		: RMA_FinancialDetailHistoryClickControlLinkAndGridVerification
	//Description  		: Enables The User To Click On Financial Detail History Image and Able To do Click Control Link And GridVerification As Per User's Input Choice
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer, SaveMessageVerification: Message to be verified on the time of save	 
	//Revision			: 0.0-RenuVerma-08-01-2018
	//Modified By		: 0.0-DebasmitaPati-04-12-2019
	// ====================================================================================================
	public static void RMA_FinancialDetailHistoryClickControlLinkAndGridVerification(String Case,String []ExpectedColHeadersToBeVerified,Object []ExpectedValuesToBeVerified, String ReserveType, String ControlNo, boolean AdditionalParameter, int Intlogval) throws Exception, Error
	{
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, Case+" On Financial Details History Page Using Control No "+ControlNo);
			}else{	
				logger = reports.startTest("<span id='RMA_FinancialDetailHistory'>"+Case+"</span> On Financial Details History Page Using Control No "+ControlNo, "User Can Do "+Case+ "On Financial Details History Page Using Control No "+ControlNo);
			}	
			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//System.out.println("RMA_FinancialDetailHistoryClickControlLinkAndGridVerification"+CurrentFrameID);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);	
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_FinancialDetailHistory(driver), "Financial Detail History Image on Financial Reserves Page", Intlogval);
			Thread.sleep(2000);			
			//Thread.sleep(5000);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.FinancialDetailHistoryFrame);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);	
			Thread.sleep(2000);		
			switch (Case){
			case "Grid Verification":// To Verify Grid Only
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Control #")));
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Control #"), "Control # Filter Text Box On Financial Detail History Grid", ControlNo,Intlogval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
				//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid		
				RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Grid Is Getting Reloaded");
				RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ControlNo, "Financial Detail History Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified,Intlogval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Finanacial Detail History Page", Intlogval);
				break;
			case "Control Link Click":// Want to Click Control No Link
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, ControlNo), "Control #:"+ ControlNo+" Link On Finanacial Detail History Page", Intlogval);
				driver.switchTo().parentFrame();
				break;
			case "Grid Verification And Control Link Click":// Want to Verify Grid and Then Click Control No Link
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Control #"), "Control # Filter Text Box On Financial Detail History Grid", ControlNo,Intlogval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
				//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid	
				RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Grid Is Getting Reloaded");
				RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ControlNo, "Financial Detail History Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified,Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, ControlNo),  "Control #:"+ ControlNo+" Link On Finanacial Detail History Page", Intlogval);
				driver.switchTo().parentFrame();
				break;
			case "Open Reserve Verification On Grid":// To Verify Grid Only
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Reserve Type")));
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Financial Detail History Grid", ReserveType,Intlogval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On FDH NG Grid
				//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid		
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Grid Is Getting Reloaded");
				RMA_Verification_Utility.RMA_VerifyUXGridOnTwoColValues_Utility(ReserveType,RMA_Selenium_POM_VerificationMessage.OpenReserveStatusFinancialDetailHistory, "Financial Detail History Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified,Intlogval);				
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Finanacial Detail History Page", Intlogval);
				break;
			case "Reserve Change Verification On Grid":// To Verify Grid Only
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Reserve Type")));
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Grid_FinancialDetailHistory_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Financial Detail History Grid", ReserveType,Intlogval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On FDH NG Grid
				//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid		
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Grid Is Getting Reloaded");
				RMA_Verification_Utility.RMA_VerifyUXGridOnTwoColValues_Utility(ReserveType,RMA_Selenium_POM_VerificationMessage.ReserveChangeStatusFinancialDetailHistory, "Financial Detail History Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified,Intlogval);
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Finanacial Detail History Page", Intlogval);
				break;

			default:		
				if (logval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}

			}
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		} catch (Exception|Error e) {
			System.out.println("Catch Financial Detail History");
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition Fail", "Payment Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition Fail", "Payment Is Not Added")));
			}
			if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equals(RMA_Selenium_POM_VerificationMessage.FinancialDetailHistoryFrame)){
				System.out.println("If Financial Detail History");
				driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Finanacial Detail History Page", Intlogval);}
			else
				System.out.println("Else Financial Detail History");
			driver.switchTo().parentFrame();//Claim frame
			driver.switchTo().parentFrame();//No Frame
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);
			throw (e);
		}
	}
	//======================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_NonOccCarrierClaimCreationWithStagingPolicy
	//Description  		: Enables Users To Create Non Occupational Claim For Carrier Client With Staging Policy System
	//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, DateOfEvent, TimeofEvent, DateOfClaim, TimeOfClaim, Jurisdiction, PlanName, Intlogval, boolean ExstEmp Needs To Be True Only When User Wants To Create 
	//Revision			: 0.0 - DebasmitaPati-07-04-2018 
	//======================================================================================================================================================================================================================================================================================================================================
	public static String RMA_NonOccCarrierClaimCreationWithStagingPolicy(String CarrierNonOccClaimCreation_Txt_ClaimType, String CarrierNonOccClaimCreation_Txt_ClaimStatus, int CarrierNonOccClaimCreation_Txt_EmployeeNumber, String CarrierNonOccClaimCreation_Txt_Department,String CarrierNonOccClaimCreation_Txt_PolicyLOB, String CarrierNonOccClaimCreation_Txt_DateOfEvent, String CarrierNonOccClaimCreation_Txt_TimeOfEvent, String CarrierNonOccClaimCreation_Txt_DateOfClaim, String CarrierNonOccClaimCreation_Txt_TimeOfClaim, String CarrierNonOccClaimCreation_Txt_Jurisdiction, boolean ExstEmp, String NonOccClaimCreation_Lst_PolicySystem, int carrierNonOccClaimCreation_Txt_PolicyNumber,String CarrierNonOccClaimCreation_Lnk_PolicyLOB,int CarrierNonOccClaimCreation_Txt_PolicyUnitNumber, String CarrierNonOccClaimCreation_Txt_PolicyUnitCoverage, String PlanName, int Intlogval) throws Exception,Error
	{
		String StrNonOccClaimNumber; 
		String EmpLstName;
		long EmpSocSecNo;
		//Variable Declaration Completed Here

		StrNonOccClaimNumber=null;
		EmpLstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Emp_");
		EmpSocSecNo=RMA_GenericUsages_Utility.RMA_RandomLongGeneration_Utility(111111111, 999999999);
		//Variable Initialization Completed Here
		try
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Non Occupational Claim Creation");
			}else{	
				logger = reports.startTest("<span id='NonOccupational'>Non Occupational Claim Creation</span>", "Non Occupational Claim Is Created");
			}

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-Non-occupational", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimdi");	
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierNonOccClaimCreation_Txt_ClaimType, "Claim Type LookUp Window On Non Occ Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_ClaimType, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Type Is Selected In Non Occ Claim Creation Page");	
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_PolicyLOB(driver), "Policy LOB TextBox On Non Occ Claim Page", CarrierNonOccClaimCreation_Txt_PolicyLOB, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Policy LOB TextBox On Non Occ Claim Creation Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On Non Occ Claim Creation Page",  CarrierNonOccClaimCreation_Txt_Department, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Non Occ Claim Creation Page");
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_DateOfEvent, Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Non Occ Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_DateOfClaim, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Non Occ Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Non Occ Claim Creation Page",CarrierNonOccClaimCreation_Txt_TimeOfClaim, Intlogval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_TimeOfEvent, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_NonOcc_Btn_Jursdiction(driver), "Claim Jurisdiction Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierNonOccClaimCreation_Txt_Jurisdiction, "Jurisdiction LookUp Window On Non Occ Claim Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Jurisdiction Is Selected In Non Occ Claim Creation Page");

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Scroll to View Policy Name Lookup Image On Non Occ Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Name Lookup Is Visible");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Policy Name Lookup Image On Non Occ Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Search Results Page For Policy Lob Is Loaded");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver)));					
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), "Policy Name Lookup Image On Non Occ Claim Page ", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), NonOccClaimCreation_Lst_PolicySystem, "Policy system Dropdown", "Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Is Loaded");
			//Policy System Is Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_SearchCriteria_Btn_SubmitQuery(driver), "Search Image On Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Grid Is Getting Loaded");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Policy Number"), "Policy Number Type Filter Text Box On Policy Download Screen", String.valueOf(carrierNonOccClaimCreation_Txt_PolicyNumber),logval);//Policy Number Is Entered In Policy Number Input Box On Policy NG Grid
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Details Are Getting Loaded");
			RMA_Navigation_Utility.RMA_WebLinkSelect(CarrierNonOccClaimCreation_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Policy LOB");
			//Policy LOB Link Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_Next(driver), "Next Image On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_SelectSpecifiedPositionWTObjectsByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable(driver), "Insured", "WEBCHECKBOX",1, Intlogval);
			//Claimant Check-Box Is checked

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_UnitList(driver), "Unit List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tbl_UnitListTable(driver), String.valueOf(CarrierNonOccClaimCreation_Txt_PolicyUnitNumber), "WEBCHECKBOX", Intlogval);

			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable(driver), CarrierNonOccClaimCreation_Txt_PolicyUnitCoverage, "WEBCHECKBOX", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Btn_Select(driver), "Select Button On Property Popup", Intlogval);
			//Record Is Selected

			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Record");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_PolicyDownload(driver), "Policy Download Image On Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Downloaded Successfully");
			//Policy Is Downloaded

			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Carrier Non Occ Claim Page Is Loaded");

			if(ExstEmp==true)
			{
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", String.valueOf(CarrierNonOccClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Employee Is Selected In Non Occ Claim Creation Page");
			}

			else{
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", String.valueOf(CarrierNonOccClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeInfo(driver), "Employee Info Tab On Non Occ Claim Creation Page",Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_LastName(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", EmpLstName, Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_SocSecNo(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", String.valueOf(EmpSocSecNo), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Non Occ Claim Creation Page",logval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EmployeeInfoDepartment(driver), "Department Employee TextBox On Non Occ Claim Creation Page",CarrierNonOccClaimCreation_Txt_Department, Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Employee Info Tab On Non Occ Claim Creation Page");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Non Occ Claim Creation Page", Intlogval);
			}

			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			//RMA_Navigation_Utility.RMA_WebLinkSelect("Open", "Claim Status LookUp Window On StrNonOccClaimNumber Creation Page", Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "Claim Status TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_ClaimStatus, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Status Is Selected In Non Occ Claim Creation Page");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PlanNameSearch(driver), "Plan Name Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Txt_UXGrid_FilterTextBox(driver, "Plan Name"), "PlanName TextBox On Disability Plan Management Lookup Page", PlanName, Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PlanName, "PlanName LookUp Window On Non Occ Claim Creation Page", Intlogval);
			Thread.sleep(5000);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DisabilityStartDate(driver), "Disability Start Date TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_DateOfEvent, Intlogval);	
			Thread.sleep(5000);

			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimdi", false, "NA", "Non Occ Claim Page", Intlogval);
			StrNonOccClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrNonOccClaimNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation", "Carrier Non Occ Claim Creation Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation", "Carrier Non Occ Claim Creation Not Successfull")));
			}
		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation Fail", "Carrier Non Occ Claim Creation Not Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation Fail", "Carrier Non Occ Claim Creation Not Successfull")));
			}
			throw (e);
		}		
		return StrNonOccClaimNumber;		
	}

	//======================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_NonOccCarrierClaimCreation
	//Description  		: Enables Users To Create Non Occupational Claim For Carrier Client
	//Input Parameter 	: Input Parameters Are :ClaimType, EmployeeNumber, Department, DateOfEvent, TimeofEvent, DateOfClaim, TimeOfClaim, Jurisdiction, Intlogval, boolean ExstEmp Needs To Be True Only When User Wants To Create 
	//Revision			: 0.0 - DebasmitaPati-07-05-2018 
	//======================================================================================================================================================================================================================================================================================================================================
	public static String RMA_NonOccCarrierClaimCreation(String CarrierNonOccClaimCreation_Txt_ClaimType, String CarrierNonOccClaimCreation_Txt_ClaimStatus, int CarrierNonOccClaimCreation_Txt_EmployeeNumber, String CarrierNonOccClaimCreation_Txt_Department,String CarrierNonOccClaimCreation_Txt_PolicyLOB, String CarrierNonOccClaimCreation_Txt_DateOfEvent, String CarrierNonOccClaimCreation_Txt_TimeOfEvent, String CarrierNonOccClaimCreation_Txt_DateOfClaim, String CarrierNonOccClaimCreation_Txt_TimeOfClaim, String CarrierNonOccClaimCreation_Txt_Jurisdiction, boolean ExstEmp, String NonOccClaimCreation_Lst_PolicySystem, String carrierNonOccClaimCreation_Txt_PolicyNumber,String CarrierNonOccClaimCreation_Lnk_PolicyLOB, String PlanName, int Intlogval) throws Exception,Error
	{
		String StrNonOccClaimNumber; 
		String EmpLstName;
		long EmpSocSecNo;
		//Variable Declaration Completed Here

		StrNonOccClaimNumber=null;
		EmpLstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Emp_");
		EmpSocSecNo=RMA_GenericUsages_Utility.RMA_RandomLongGeneration_Utility(111111111, 999999999);
		//Variable Initialization Completed Here
		try
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Non Occupational Claim Creation");
			}else{	
				logger = reports.startTest("<span id='NonOccupational'>Non Occupational Claim Creation</span>", "Non Occupational Claim Is Created");
			}

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-Non-occupational", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimdi");	
			RMA_GenericUsages_Utility.RMA_StaticWait(20, logval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver)));

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On Non Occ Claim Creation Page",  CarrierNonOccClaimCreation_Txt_Department, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Non Occ Claim Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierNonOccClaimCreation_Txt_ClaimType, "Claim Type LookUp Window On Non Occ Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_ClaimType, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Type Is Selected In Non Occ Claim Creation Page");	
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_PolicyLOB(driver), "Policy LOB TextBox On Non Occ Claim Page", CarrierNonOccClaimCreation_Txt_PolicyLOB, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Policy LOB TextBox On Non Occ Claim Creation Page");
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_DateOfEvent, Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Non Occ Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_DateOfClaim, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Non Occ Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Non Occ Claim Creation Page",CarrierNonOccClaimCreation_Txt_TimeOfClaim, Intlogval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_TimeOfEvent, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_NonOcc_Btn_Jursdiction(driver), "Claim Jurisdiction Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Jurisdiction Lookup Page Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(CarrierNonOccClaimCreation_Txt_Jurisdiction, "Jurisdiction LookUp Window On Non Occ Claim Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Jurisdiction Is Selected In Non Occ Claim Creation Page");

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Scroll to View Policy Name Lookup Image On Non Occ Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Name Lookup Is Visible");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Policy Name Lookup Image On Non Occ Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Search Results Page For Policy Lob Is Loaded");
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver)));	

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), "Policy Name Lookup Image On Non Occ Claim Page ", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), NonOccClaimCreation_Lst_PolicySystem, "Policy system Dropdown", "Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Is Loaded");
			//Policy System Is Selected
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			//RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_PolicyNumber(driver), "Policy Number Text Box On Policy Download Window", carrierNonOccClaimCreation_Txt_PolicyNumber, Intlogval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_SearchCriteria_Btn_SubmitQuery(driver), "Search Image On Policy Download Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Grid Is Getting Loaded");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Policy Number"), "Policy Number Type Filter Text Box On Policy Download Screen", carrierNonOccClaimCreation_Txt_PolicyNumber,Intlogval);//Policy Number Is Entered In Policy Number Input Box On Policy NG Grid
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Details Are Getting Loaded");
			RMA_Navigation_Utility.RMA_WebLinkSelect(CarrierNonOccClaimCreation_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Policy LOB");
			//Policy LOB Link Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_Next(driver), "Next Image On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Chk_Int_Cov_List(driver),"check", "Interest Coverage List", "Policy Download Page", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestCoverageList(driver), "Interest/Coverage List Tab On Policy Download Popup", Intlogval);
			//RMA_Navigation_Utility.RMA_SelectSpecifiedPositionWTObjectsByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable(driver), "Insured", "WEBCHECKBOX",1, Intlogval);
			//Claimant Check-Box Is checked

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Chk_Int_Cov_List(driver),"check", "Interest Coverage List", "Policy Download Page", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_InterestList(driver), "Interest List Tab On Policy Download Popup", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Chk_CoverageDetails(driver), "Coverage Details Checkbox On Policy Download Popup", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Txt_UnitList(driver), "Unit List Tab On Policy Download Popup", Intlogval);
			//RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tbl_UnitListTable(driver), "NEW YORK", "WEBCHECKBOX", Intlogval);

			//RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable(driver), "000000", "WEBCHECKBOX", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Btn_Select(driver), "Select Button On Property Popup", Intlogval);
			//Record Is Selected

			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Record");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_PolicyDownloadWC(driver), "Policy Download Image On Policy Download Page", Intlogval);
			//Policy Is Downloaded

			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolDownloadModalDialog_Btn_Ok(driver), "Ok Button On Modal Popup To Add Claimant As Insured", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Carrier Non Occ Claim Page Is Loaded");

			if(ExstEmp==true)
			{
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", String.valueOf(CarrierNonOccClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Employee Is Selected In Non Occ Claim Creation Page");
			}
			else{
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_EmpolyeeNum(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", String.valueOf(CarrierNonOccClaimCreation_Txt_EmployeeNumber), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeInfo(driver), "Employee Info Tab On Non Occ Claim Creation Page",Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_LastName(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", EmpLstName, Intlogval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_SocSecNo(driver), "Employee Number TextBox Criteria On Non Occ Claim Creation Page", String.valueOf(EmpSocSecNo), Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Non Occ Claim Creation Page",Intlogval);
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EmployeeInfoDepartment(driver), "Department Employee TextBox On Non Occ Claim Creation Page",CarrierNonOccClaimCreation_Txt_Department, Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Department TextBox On Employee Info Tab On Non Occ Claim Creation Page");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Non Occ Claim Creation Page", Intlogval);
			}

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("Open", "Claim Status LookUp Window On StrNonOccClaimNumber Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "Claim Status TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_ClaimStatus, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Claim Status Is Selected In Non Occ Claim Creation Page");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PlanNameSearch(driver), "Plan Name Look Up Image Button On Non Occ Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Txt_UXGrid_FilterTextBox(driver, "Plan Name"), "PlanName TextBox On Disability Plan Management Lookup Page", PlanName, Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PlanName, "PlanName LookUp Window On Non Occ Claim Creation Page", Intlogval);
			Thread.sleep(8000);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DisabilityStartDate(driver), "Disability Start Date TextBox On Non Occ Claim Creation Page", CarrierNonOccClaimCreation_Txt_DateOfEvent, Intlogval);	
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_FileNumber(driver), "File Number Text Box On Non Occ Claim Page", Intlogval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimdi", false, "NA", "Non Occ Claim Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is added As Claim Is Getting Saved");
			StrNonOccClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrNonOccClaimNumber

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation", "Carrier Non Occ Claim Creation Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation", "Carrier Non Occ Claim Creation Not Successfull")));
			}
		}catch(Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation Fail", "Carrier Non Occ Claim Creation Not Successfull")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Non Occ Claim Creation Fail", "Carrier Non Occ Claim Creation Not Successfull")));
			}
			throw (e);
		}		
		return StrNonOccClaimNumber;		
	}

	//==================================================================================================================================================================================
	//FunctionName 		: RMA_Maintenance_DisabilityPlanCreation_Utility
	//Description  		: Enables The User To Create A Disability Plan From Maintenance
	//Input Parameter 	: 
	//Revision			: 0.0 - DebasmitaPati-07-16-2018 
	// ====================================================================================================================================================================================
	public static String RMA_Maintenance_DisabilityPlanCreation_Utility(String Insured,String Country, String PlanStatus,String Premium ,String BankAccount, String PayPeriodStartDate, String IssueDate, String ReviewDate, String RenewalDate, String CancelDate, String PrintsBeforeEndOfPayPeriod_Chk_Flag, String PreferredPaymentSchedule, String MonthlyPaymentType, String PreferredPrintDate, String PreferredMonthlyDay, String PreferredDayOfWeekforPayments, int logval) throws Exception, Error
	{
		String Planname;
		String StrPlanname;
		String StrPlandescription;
		int StrPlannumber;
		String StrPlanEffectiveDate;
		String StrPlanExpirationDate;
		StrPlanEffectiveDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,-1,"MM/dd/yyyy");
		StrPlanExpirationDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,+1,"MM/dd/yyyy");
		//Local Variable Declaration

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Creates A Disability Plan From the Maintenance");
			}
			else
			{	
				logger = reports.startTest("<span id='DisabilityPlan'>Disability Plan Creation</span>", "Disability Plan Is Created");
			}
			StrPlanname=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Plan_");
			StrPlandescription=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PlanDesc_");
			StrPlannumber=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999);
			RMA_GenericUsages_Utility.RMA_StaticWait(15, logval, "Wait Is Added Window Is Getting Loaded");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-DisabilityPlanManagement", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("plan");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(15, logval, "Wait Is Added As Frame Is Getting Loaded");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PlanNumber(driver)));
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PlanNumber(driver), "Plan Number Text Box on Maintenance -> Disability Plan Management Page", String.valueOf(StrPlannumber), logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Value Is Given In Fields On Disability Plan Management Page");
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PlanName(driver), "Plan Name Text Box on Maintenance -> Disability Plan Management Page", StrPlanname, logval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PlanDescription(driver), "Plan Description Text Box on Maintenance -> Disability Plan Management Page", StrPlandescription, logval);			

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_Insured(driver), "Insured TextBox On Maintenance -> Disability Plan Management Page",  Insured, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Provided To Insured TextBox On Maintenance -> Disability Plan Management Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_Country(driver), "Country TextBox On Maintenance -> Disability Plan Management Page",  Country, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Value Is Provided To Country TextBox On Maintenance -> Disability Plan Management Page");
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PlanStatus(driver), "Plan Status TextBox On Maintenance -> Disability Plan Management Page", PlanStatus, logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Plan Status Is Selected On Maintenance -> Disability Plan Management Page");
			//commented as tab out is not working and also changed the Datasheet for the same

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Btn_PlanStatus(driver), "Plan Status TextBox On Maintenance -> Disability Plan Management Page", logval);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_WebLinkSelect(PlanStatus,"Plan Status TextBox On Maintenance -> Disability Plan Management Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Plan Status Is Selected On Maintenance -> Disability Plan Management Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_Premium(driver), "Premium TextBox On Maintenance -> Disability Plan Management Page" ,logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_Premium(driver), "Premium TextBox On Maintenance -> Disability Plan Management Page", Premium, logval);

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_BankAccount(driver), BankAccount, "Bank Account Drop Down List", "Maintenance -> Disability Plan Management Page",logval);		


			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PayPeriodStartDate(driver), "Pay Period Start Date Text Box on Maintenance -> Disability Plan Management Page" ,logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PayPeriodStartDate(driver), "Pay Period Start Date Text Box On Maintenance -> Disability Plan Management Page", PayPeriodStartDate, logval);

			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_EffectiveDate(driver), "Effective Date Text Box on Maintenance -> Disability Plan Management Page", StrPlanEffectiveDate, logval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_ExpirationDate(driver), "Expiration Date Text Box on Maintenance -> Disability Plan Management Page", StrPlanExpirationDate, logval);


			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_IssueDate(driver), "Issue Date Text Box On Maintenance -> Disability Plan Management Page", IssueDate, logval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_ReviewDate(driver), "Review Date Text Box On Maintenance -> Disability Plan Management Page", ReviewDate, logval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_RenewalDate(driver), "Renewal Date Text Box On Maintenance -> Disability Plan Management Page", RenewalDate, logval);

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_CheckBox_CheckPrintsBeforeEndOfPayPeriod(driver), PrintsBeforeEndOfPayPeriod_Chk_Flag, "Check Prints Before End Of Pay Period Checkbox", "Maintenance -> Disability Plan Management Page", logval);

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_PreferredPaymentSchedule(driver), PreferredPaymentSchedule, "Preferred Payment Schedule Drop Down List", "Maintenance -> Disability Plan Management Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			if("PW - Week".equals(PreferredPaymentSchedule.trim()) || "PB - Bi-Weekly".equals(PreferredPaymentSchedule.trim()) ){
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_PreferredDayOfWeekForPayments(driver), PreferredDayOfWeekforPayments, "Preferred Day Of Week for Payments DropDown List" , "Maintenance -> Disability Plan Management Page", logval);
			}
			else if("PM - Month".equals(PreferredPaymentSchedule.trim())){
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_MonthlyPaymentType(driver), MonthlyPaymentType, "Monthly Payment Type Drop Down List", "Maintenance -> Disability Plan Management Page",logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Value Is Given In Fields On Disability Plan Management Page");

				if("WDY - Day Based".equals(MonthlyPaymentType.trim())){
					RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_PreferredDayOfWeekForPayments(driver), PreferredDayOfWeekforPayments, "Preferred Day Of Week for Payments DropDown List" , "Maintenance -> Disability Plan Management Page", logval);
					RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Value Is Given In Fields On Disability Plan Management Page");
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_PreferredMonthlyDay(driver), PreferredMonthlyDay, "Preferred Monthly Day DropDown List" , "Maintenance -> Disability Plan Management Page", logval);
				}
				else{
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Lst_PreferredPrintDate(driver), PreferredPrintDate, "Preferred Print Date DropDown List" , "Maintenance -> Disability Plan Management Page", logval);
				}
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Value Is Given In Fields On Disability Plan Management Page");
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_CancelDate(driver), "Cancel Date Text Box On Maintenance -> Disability Plan Management Page", CancelDate, logval);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Disability Plan Management Page", logval);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.SaveSuccessfully), "Disability Plan Managemnet Save Toast Message", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "Disability Plan Managemnet Save Toast Message", logval);

			Planname=RMA_Selenium_POM_DisabilityPlanManagement.RMAApp_DisabilityPlanManagement_Txt_PlanName(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(StrPlanname, Planname, "Disability Plan Name", logval);
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Disability Plan Creation", "Disability Plan Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Disability Plan Creation", "Disability Plan Is Created Successfully")));
			}
		} catch (Exception|Error e) 
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Disability Plan Creation Fail", "New Disability Plan Is Not Created")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Disability Plan Creation Fail", "New Disability Plan Is Not Created")));
			}
			throw (e);
		}
		return Planname;
	}
	//==================================================================================================================================================================================
	//FunctionName 		: RMA_AddPlanClassToDisabilityPlan_Utility
	//Description  		: Enables The User To Add Plan Class To A Disability Plan
	//Input Parameter 	: 
	//Revision			: 0.0 - DebasmitaPati-08-09-2018 
	// ====================================================================================================================================================================================
	public static String RMA_AddPlanClassToDisabilityPlan_Utility(String QuantityBenefits,String PeriodBenefits, String FromDateBenefits,String QuantityWaiting ,String PeriodWaiting, String WaitDurationWaiting, String QuantityDisability, String PeriodDisability, String FromDisability, String DaysType, String PAYG_SuperFund, String PAYGWithholding, String SFSSWithholding, String HELP_Withholding, int logval) throws Exception, Error
	{

		String ClassName;
		String StrClassName;
		//Local Variable Declaration

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Plan Class Is Added To A Disability Plan");
			}
			else
			{	
				logger = reports.startTest("<span id='AddPlanClass'>Plan Class Creation</span>", "Plan Class Is Added To A Disability Plan ");
			}
			StrClassName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "ClassName_");

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Plan Classes")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Plan Classes"), "Add New Button For Plan Classes On Disability Plan Management Creation Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Class Creation Page Is Getting Opened");

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_ClassName(driver), "Class Name TextBox On Class Creation Page", StrClassName, logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_ClassDescription(driver), "Class Description TextBox On Class Creation Page", StrClassName, logval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Tab_EligibilityWaitingPeriod(driver), "Eligibility/Waiting Period Tab On Class Creation Page", logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_EligibleForBenefitsQuantity(driver), "Eligible for Benefits Quantity TextBox On Class Creation Page", String.valueOf(QuantityBenefits), logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_EligibleForBenefitsPeriod(driver), PeriodBenefits, "Eligible For Benefits Period TextBox", "Class Creation Page", logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_EligibleForBenefitsFromDateHiredOn(driver), FromDateBenefits, "Eligible For Benefits From Date Hired On TextBox", "Class Creation Page", logval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_WaitingPeriodFromDisabilityQuantity(driver), "Waiting Period For Disability Quantity TextBox On Class Creation Page", String.valueOf(QuantityWaiting), logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_WaitingPeriodFromDisabilityPeriod(driver), PeriodWaiting, "Waiting Period For Disability Period TextBox", "Class Creation Page", logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_WaitingPeriodFromDisabilityWaitDurationType(driver), WaitDurationWaiting, "Waiting Period For Disability Wait Duration Type TextBox", "Class Creation Page", logval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_MaximumDurationOfDisabilityQuantity(driver), "Maximum Duration Of Disability Quantity TextBox On Class Creation Page", String.valueOf(QuantityDisability), logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_MaximumDurationOfDisabilityPeriod(driver), PeriodDisability, "Maximum Period Of Disability Period TextBox", "Class Creation Page", logval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_MaximumDurationOfDisabilityFrom(driver), FromDisability, "Maximum Period Of Disability Disability From TextBox", "Class Creation Page", logval);

			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_DetermineWorkWeekDaysType(driver), DaysType, "Days Type List", "Class Creation Page", logval);

			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Value Is Given In Fields On Class Creation Page");
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Class Creation Page", logval);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Plan Class Is Saved");

			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave), "Class Creation Save Toast Message", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave, false, "Class Creation Save Toast Message", logval);
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.WithholdingSuccessfulSave+"')]")));

			ClassName=RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_ClassName(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(StrClassName, ClassName, "Plan Class Name", logval);


			if(PAYG_SuperFund.contains("Yes"))
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Tab_EligibilityWaitingPeriod(driver),"Eligibility/Waiting Period Tab On Class Creation Page", logval);			
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Tab_BenefitCalculation(driver),"Benefit Calculation Period Tab On Class Creation Page", logval);			
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_TaxablePortion(driver),"Taxable Portion TextBox On Plan Class Screen", logval);
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_TaxablePortion(driver),"Taxable Portion TextBox On Plan Class Screen" , "0", logval);
				if(PAYGWithholding.contains("Yes"))
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_PAYGWithholding(driver), "check", "PAYG Witholding CheckBox","Plan Class Page", logval);
				else
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_PAYGWithholding(driver), "uncheck", "PAYG Witholding CheckBox","Plan Class Page", logval);
				if(SFSSWithholding.contains("Yes"))
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_SFSSWithholding(driver), "check", "SFSS Witholding CheckBox","Plan Class Page", logval);
				else
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_SFSSWithholding(driver), "uncheck", "SFSS Witholding CheckBox","Plan Class Page", logval);
				if(HELP_Withholding.contains("Yes"))
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_HELP_SSL_TSLWithholding(driver), "check", "HELP_SSL_TSL Witholding CheckBox","Plan Class Page", logval);
				else
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_HELP_SSL_TSLWithholding(driver), "uncheck", "HELP_SSL_TSL Witholding CheckBox","Plan Class Page", logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Chk_SuperannuationGuaranteeContribution(driver), "check","Superannuation Guarantee Contribution CheckBox","Plan Class Page", logval);
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_BankAccount(driver),PAYG_BankAccount,"Bank Account TextBox","Plan Class Page", logval);
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Lst_TransactionType(driver),OffsetMapping_Txt_OtherOffset1TransType,"Bank Account TextBox","Plan Class Page", logval);
				RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Class Creation Page", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Plan Class Is Saved");
			}
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Plan Class Creation", "Plan Class Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Plan Class Creation", "Plan Class Is Created Successfully")));
			}
		} catch (Exception|Error e) 
		{
			if (logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Plan Class Creation Fail", "New Plan Class Is Not Created")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Plan Class Creation Fail", "New Plan Class Is Not Created")));
			}
			throw (e);
		}
		return ClassName;
	}

	//=====================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CarrierPaymentAddition_Utility
	//Description  		: Enables The User To Add Carrier Payment 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
	//Revision			: 0.0-RenuVerma-09-11-2018
	// =====================================================================================================================================================================================================================================================================================================================================================================================
	public static String RMA_CarrierPaymentAdditionWithSaveMessageverification_Utility(boolean FirstAndFinalPayment,String BankAccnt,String PayeeType,Object ReserveType, Object TransType, int Amount, String LastName, String DisType, Object PolicyName,Object DetailTrackClaimnt,String VerificationMessage,int Intlogval) throws Exception, Error
	{
		TransactionTypeValueFromWeblist=null;
		ReserveTypeValueFromWeblist=null;
		ReturnValue=null;
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Carrier Payment ");
			}else{	
				logger = reports.startTest("<span id='CarrierPaymentAdditionWithSaveMessage'>Payment Addition</span> Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " , "User Makes A New Payment Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim ");
			}	


			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			String HeaderValue=RMA_Selenium_POM_Home.RMAApp_Generic_Lbl_Header(driver).getAttribute("innerText");
			//System.out.println(HeaderValue);
			//System.out.println(RMA_Selenium_POM_Home.RMAApp_Generic_Lbl_Header(driver).getText());
			//Local Variable Declaration Is Done
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			if (FirstAndFinalPayment)
			{
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "InComplete", RMA_Selenium_POM_VerificationMessage.FirstAndFinalPaymentMessage, "First And Final Payment Verification Message", Intlogval);
				//First And Final Payment Message Is Verified
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			}
			else{
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver)));
			}
			//First And Final Payment Message Is Verified
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Bank Account Is Clickable");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			//Bank Account Selected

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);
			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");
			if(DetailTrackClaimnt.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_DetailedTrackingClaimant(driver),(int)DetailTrackClaimnt, "Detailed Tracking Claimant List", "Payment Creation Page", Intlogval);// Select Policy
			}
			if(DetailTrackClaimnt.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_DetailedTrackingClaimant(driver),DetailTrackClaimnt.toString(), "Detailed Tracking Claimant List", "Payment Creation Page", Intlogval);// Select Policy
			}

			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Transaction Detail Tab");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);

			//Add New Button Is Clicked And Funds Split Details View Is Opened
			if (FirstAndFinalPayment){
				if(PolicyName.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_Policy(driver),(int)PolicyName, "Policy List", "Funds Split Page", Intlogval);// Select Policy

				}
				if(PolicyName.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_Policy(driver),PolicyName.toString(), "Policy  List", "Funds Split Page", Intlogval);// Select Policy
				}
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//User Passed Nothing in Unit, Coverage and Loss Type in Case of External Policy Carrier Claim, It Select Value Automatically 
				// Loop To Select Unit Value From Which Corresponding Coverage Value Can Be Selected
				outerloop1:
					for(int i=1; ;i++)
					{
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_Unit(driver), i,  "Unit List", "Funds Split Page", Intlogval);// Select Unit Value One by One
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						for(;;)
						{							
							Select Cov = new Select (RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_CoverageType(driver));// Check Coverage Field has Value Or Not.

							//Cov.selectByIndex(j);
							if(Cov.getOptions().size()==1)// If Coverage Field does Not Have Any Value
								break;// Break From Inner loop And Select Another Unit Value.
							else if(Cov.getOptions().size()>1)// If Coverage Field Have Any Value
								break outerloop1;// Break From Outer Loop Too 
						}
					}
				// Loop To Select Coverage Value From Which Corresponding LossType Value Can Be Selected
				outerloop2:	
					for(int j=1; ;j++)
					{
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_CoverageType(driver), j,  "Coverage List", "Funds Split Page", Intlogval);// Select Coverage Value One by One
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						for(;;)
						{	
							if(HeaderValue.contains("General Claim")){ // If Claim Type is General Claim	
								Select Loss = new Select (RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_LossType(driver));
								if(Loss.getOptions().size()==1)// If Loss Type Field does Not Have Any Value
									break; //Break From Inner loop And Select Another Coverage Value.
								else if(Loss.getOptions().size()>1){// If Loss Type Field Have Any Value
									RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_LossType(driver), 1,  "Loss Type  List", "Funds Split Page", Intlogval);// Select MYCODE In Loss Type
									RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
									break outerloop2; // Break From Outer Loop Too 
								}
							}
							else if(HeaderValue.contains("Worker")){	// If Claim Type is Workers' Comp Claim			
								Select DisabilityCat = new Select (RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_List_DisabilityCategory(driver));
								if(DisabilityCat.getOptions().size()==1)// If Loss Type Field does Not Have Any Value
									break; //Break From Inner loop And Select Another Coverage Value.
								else if(DisabilityCat.getOptions().size()!=1){// If Claim Type is General Claim	
									RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_List_DisabilityCategory(driver),1, "Disability Category", "Add New Reserve Page",Intlogval);// Select Coverage Value One by One
									RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
									RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_List_DisabilityLossType(driver),1, "Disability Loss Type","Add New Reserve Page",Intlogval);// Select MYCODE In Loss Type
									RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
									break outerloop2; // Break From Outer Loop Too 
								}
							}
						}
					}
			}
			if(!ReserveType.equals("NA")){

				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType.toString(), "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
			}
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			ReserveTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
			Thread.sleep(1000);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			// Select Transaction Type from WebList Based on Provided value in Function
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			TransactionTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			// Payment Is Added And Funds Split Details View Is Closed
			if(VerificationMessage.equals("NA")){
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);				
			}
			else {
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, VerificationMessage, "Payment Creation Page", Intlogval);
			}//Save Button Is Clicked To Save The Transaction

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",Intlogval);// Transaction Tab On Payment Creation Page Is Clicked
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber


			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Carrier Payment Creation", "New Carrier Payment Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Carrier Payment Creation", "New Carrier  Payment Is Created Successfully")));
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Payment Addition Fail", "Carrier Payment Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Payment Addition Fail", "Carrier Payment Is Not Added")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
		/*finally
			{
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			}*/
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddTableDrivenBenefitsInDisabilityPlanClass_Utility
	//Description  		: Enables The User To Add Table Driven Benefits In A Disability Plan Class 
	//Input Parameter 	: WagesFrom, WagesTo,Benefits, Supplement, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - DebasmitaPati-10-29-2018
	//==========================================================================================================================================================================================================================================
	public static void RMA_AddTableDrivenBenefitsInDisabilityPlanClass_Utility(int WagesFrom, int WagesTo,int Benefits,int Supplement, int Intlogval) throws Exception, Error
	{
		try {
			String StrMsg;
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Adds Table Driven Benefits In Disability Plan Class");
			}else{	
				logger = reports.startTest("<span id='AddTableDrivenBenefits'>Table Driven Benefits Addition</span>", "User Adds Table Driven Benefits In Disability Plan Class");
			}
			DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();


			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Img_TableDrivenBenefits(driver), "Table Driven Benefits Button On Class Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Frame Is Getting Loaded");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Btn_AddNewCrudGrid(driver), "Add New Button On Table Driven Benefits Window On Class Creation Page", Intlogval);			
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver)));

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_WagesFrom(driver), "Wages From Text Box On Add Table Driven Benefits Window On Class Creation Page", String.valueOf(WagesFrom), Intlogval);

			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_WagesTo(driver), "Wages To Text Box On Add Table Driven Benefits Window On Class Creation Page", String.valueOf(WagesTo), Intlogval);

			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Benefits(driver), "Benefits Text Box On Add Table Driven Benefits Window On Class Creation Page", String.valueOf(Benefits), Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Benefits(driver), "Benefits Text Box On Add Table Driven Benefits Window On Class Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Benefits(driver), "Benefits Text Box On Add Table Driven Benefits Window On Class Creation Page", String.valueOf(Benefits), Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Value Is Entered");

			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Supplement(driver), "Supplement Text Box On Add Table Driven Benefits Window On Class Creation Page", String.valueOf(Supplement), Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Supplement(driver), "Supplement Text Box On Add Table Driven Benefits Window On Class Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Supplement(driver), "Supplement Text Box On Add Table Driven Benefits Window On Class Creation Page", String.valueOf(Supplement), Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Value Is Entered");

			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PlanClass.RMAApp_PlanClass_Txt_Benefits(driver), "Benefits Text Box On Add Table Driven Benefits Window On Class Creation Page", Intlogval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button On Add Table Driven Benefits Window On Class Creation Page", Intlogval);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

			StrMsg=RMA_Selenium_POM_VerificationMessage.RecordSaveSuccessfully;
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.RecordSaveSuccessfully), "Table Driven Benefits Save Toast Message", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.RecordSaveSuccessfully, false, "Table Driven Benefits Save Toast Message", Intlogval);
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+StrMsg+"')]")));

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Table Driven Benefits Data Saved Successfully", "Table Driven Benefits")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Table Driven Benefits Data Saved Successfully", "Table Driven Benefits")));
			}
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Table Driven Benefits Window On Class Creation Page", Intlogval);

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Table Driven Benefits Addition Fail", "Table Driven Benefits Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Table Driven Benefits Addition Fail", "Table Driven Benefits Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}
	//====================================================================================================
	//FunctionName 		: RMA_PaymentCorpAdditionWithInsufficientReserve_Utility
	//Description  		: Enables The User To Add Payment with Insufficient Reserve functionality 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer, SaveMessageVerification: Message to be verified on the time of save	 
	//Revision			: 0.0-DebasmitaPati-08-01-2018
	// ====================================================================================================
	public static String RMA_PaymentCorpAdditionWithInsufficientReserve_Utility(String Case, String SubCase, String BankAccnt,String PayeeType, Object ReserveType, Object TransType, int Amount, String LastName, String DisType, String Strclaimnumber, boolean FirstAndFinalPayment, int Intlogval) throws Exception, Error
	{
		ReserveTypeValueFromWeblist=null;
		TransactionTypeValueFromWeblist=null;
		ReturnValue=null;
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Payment With Insufficient Reserve Creation With Payment Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}else{	
				logger = reports.startTest("<span id='PaymentAdditionWithInsufficientReserve'>Payment Addition With Insufficient Reserve</span> Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber, "User Makes A New Payment With Insufficient Reserve Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}	

			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			Thread.sleep(3000);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);

			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			if((!ReserveType.equals("NA")) & (!ReserveType.equals("WC"))  ){

				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType.toString(), "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
			}
			ReserveTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
			Thread.sleep(1000);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			// Select Transaction Type from WebList Based on Provided value in Function
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			TransactionTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			// Payment Is Added And Funds Split Details View Is Closed

			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);
			//Save Button Is Clicked To Save The Transaction

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame); //Navigate To Insufficient Reserve frame
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");

			//	for(int i=0;i<Case.length;i++){
			//		switch (Case[i]){
			switch (Case){
			case "Payment Without Any Limit"://Add Payment Without Any Limit Set In The User Privileges Setup	
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Screen", Intlogval);
					ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					break;
				case "Only Continue"://Continue To Save Payment
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;				
			case "Payment With Per Claim Incurred Limit"://Add Payment With Per Claim Incurred Limit Set In The User Privileges Setup	
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber						
					}
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber						
					}
					break;
				case "Only Continue"://Continue To Save Payment
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					}
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;	
			case "Payment With Reserve Limit"://Add Payment With Reserve Limit Set In The User Privileges Setup	
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.InsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.InsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);
					break;
				case "Only Continue"://Continue To Save Payment
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.FAFPaymnetWithInsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					}
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;	
			default:		
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}			
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve", "Payment With Insufficient Reserve Verified Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve", "Payment With Insufficient Reserve Verified Successfully")));
			}	
			try {
				if(!ReturnValue.equals(null)){
					ReturnValue=ReturnValue;
				}
			} catch (Exception e) {
				ReturnValue="0";			
			}	
			return ReturnValue;
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve Fail", "Payment With Insufficient Reserve Verification Failed")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve Fail", "Payment With Insufficient Reserve Verification Failed")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
		finally
		{
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);			
		}
	}

	//=====================================================================================================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CarrierPaymentAdditionWithInsufficientReserve_Utility
	//Description  		: Enables The User To Add Carrier Payment With Insufficient Reserve Functionality
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
	//Revision			: 0.0-DebasmitaPati-02-21-2019
	// =====================================================================================================================================================================================================================================================================================================================================================================================
	public static String RMA_CarrierPaymentAdditionWithInsufficientReserve_Utility(String Case, String SubCase,boolean FirstAndFinalPayment,String BankAccnt,String PayeeType,Object ReserveType, Object TransType, int Amount, String LastName, String DisType, Object PolicyName,Object DetailTrackClaimnt,String VerificationMessage,int Intlogval) throws Exception, Error
	{
		TransactionTypeValueFromWeblist=null;
		ReserveTypeValueFromWeblist=null;
		ReturnValue=null;
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Carrier Payment ");
			}else{	
				logger = reports.startTest("<span id='CarrierPaymentAdditionWithSaveMessage'>Payment Addition</span> Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " , "User Makes A New Payment Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim ");
			}	
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			String HeaderValue=RMA_Selenium_POM_Home.RMAApp_Generic_Lbl_Header(driver).getAttribute("innerText");
			//System.out.println(HeaderValue);
			//System.out.println(RMA_Selenium_POM_Home.RMAApp_Generic_Lbl_Header(driver).getText());
			//Local Variable Declaration Is Done
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			if (FirstAndFinalPayment)
			{
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("Yes", "InComplete", RMA_Selenium_POM_VerificationMessage.FirstAndFinalPaymentMessage, "First And Final Payment Verification Message", Intlogval);
				//First And Final Payment Message Is Verified
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			}
			else{
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver)));
			}
			//First And Final Payment Message Is Verified
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			//Bank Account Selected

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);
			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");
			if(DetailTrackClaimnt.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_DetailedTrackingClaimant(driver),(int)DetailTrackClaimnt, "Detailed Tracking Claimant List", "Payment Creation Page", Intlogval);// Select Policy
			}
			if(DetailTrackClaimnt.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_DetailedTrackingClaimant(driver),DetailTrackClaimnt.toString(), "Detailed Tracking Claimant List", "Payment Creation Page", Intlogval);// Select Policy
			}

			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Transaction Detail Tab");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);

			//Add New Button Is Clicked And Funds Split Details View Is Opened
			if (FirstAndFinalPayment){
				if(PolicyName.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_Policy(driver),(int)PolicyName, "Policy List", "Funds Split Page", Intlogval);// Select Policy

				}
				if(PolicyName.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_Policy(driver),PolicyName.toString(), "Policy  List", "Funds Split Page", Intlogval);// Select Policy
				}
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//User Passed Nothing in Unit, Coverage and Loss Type in Case of External Policy Carrier Claim, It Select Value Automatically 
				// Loop To Select Unit Value From Which Corresponding Coverage Value Can Be Selected
				outerloop1:
					for(int i=1; ;i++)
					{
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_Unit(driver), i,  "Unit List", "Funds Split Page", Intlogval);// Select Unit Value One by One
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						for(;;)
						{							
							Select Cov = new Select (RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_CoverageType(driver));// Check Coverage Field has Value Or Not.

							//Cov.selectByIndex(j);
							if(Cov.getOptions().size()==1)// If Coverage Field does Not Have Any Value
								break;// Break From Inner loop And Select Another Unit Value.
							else if(Cov.getOptions().size()>1)// If Coverage Field Have Any Value
								break outerloop1;// Break From Outer Loop Too 
						}
					}
				// Loop To Select Coverage Value From Which Corresponding LossType Value Can Be Selected
				outerloop2:	
					for(int j=1; ;j++)
					{
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_CoverageType(driver), j,  "Coverage List", "Funds Split Page", Intlogval);// Select Coverage Value One by One
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						for(;;)
						{	
							if(HeaderValue.contains("General Claim")){ // If Claim Type is General Claim	
								Select Loss = new Select (RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_LossType(driver));
								if(Loss.getOptions().size()==1)// If Loss Type Field does Not Have Any Value
									break; //Break From Inner loop And Select Another Coverage Value.
								else if(Loss.getOptions().size()>1){// If Loss Type Field Have Any Value
									RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_LossType(driver), 1,  "Loss Type  List", "Funds Split Page", Intlogval);// Select MYCODE In Loss Type
									RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
									break outerloop2; // Break From Outer Loop Too 
								}
							}
							else if(HeaderValue.contains("Worker")){	// If Claim Type is Workers' Comp Claim			
								Select DisabilityCat = new Select (RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_List_DisabilityCategory(driver));
								if(DisabilityCat.getOptions().size()==1)// If Loss Type Field does Not Have Any Value
									break; //Break From Inner loop And Select Another Coverage Value.
								else if(DisabilityCat.getOptions().size()!=1){// If Claim Type is General Claim	
									RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_List_DisabilityCategory(driver),1, "Disability Category", "Add New Reserve Page",Intlogval);// Select Coverage Value One by One
									RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
									RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_List_DisabilityLossType(driver),1, "Disability Loss Type","Add New Reserve Page",Intlogval);// Select MYCODE In Loss Type
									RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
									break outerloop2; // Break From Outer Loop Too 
								}
							}
						}
					}
			}
			if(!ReserveType.equals("NA")){

				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType.toString(), "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
			}
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			ReserveTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
			Thread.sleep(1000);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			// Select Transaction Type from WebList Based on Provided value in Function
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
			}
			TransactionTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			// Payment Is Added And Funds Split Details View Is Closed

			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);
			//Save Button Is Clicked To Save The Transaction

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame); //Navigate To Insufficient Reserve frame
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");

			switch (Case){
			case "Payment Without Any Limit"://Add Payment Without Any Limit Set In The User Privileges Setup	
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					break;
				case "Only Continue"://Continue To Save Payment
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;				
			case "Payment With Per Claim Incurred Limit"://Add Payment With Per Claim Incurred Limit Set In The User Privileges Setup	
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber						
					}
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber						
					}
					break;
				case "Only Continue"://Continue To Save Payment
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					}
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;	
			case "Payment With Reserve Limit"://Add Payment With Reserve Limit Set In The User Privileges Setup	
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.InsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.InsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);
					break;
				case "Only Continue"://Continue To Save Payment
					if(FirstAndFinalPayment){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.FAFPaymnetWithInsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);						
					}
					else{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
						driver.switchTo().parentFrame();
						RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
						ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
					}
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;	
			default:		
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}			
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve", "Payment With Insufficient Reserve Verified Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve", "Payment With Insufficient Reserve Verified Successfully")));
			}	
			try {
				if(!ReturnValue.equals(null)){
					ReturnValue=ReturnValue;
				}
			} catch (Exception e) {
				ReturnValue="0";			
			}	
			return ReturnValue;
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Payment Addition Fail", "Carrier Payment Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier Payment Addition Fail", "Carrier Payment Is Not Added")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
		finally
		{
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddTableDrivenBenefitsInDisabilityPlanClass_Utility
	//Description  		: Enables The User To Add Table Driven Benefits In A Disability Plan Class 
	//Input Parameter 	: WagesFrom, WagesTo,Benefits, Supplement, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - ShrutiShruti-10-29-2018
	//==========================================================================================================================================================================================================================================
	public static void RMA_CorpReserveWorksheetAddition_Utility(int NumberOfData, String[] Reservetype,int Amount,String ReserveReason, String AssignedAdjuster,boolean IsAdjuster, boolean IsComment,int Intlogval) throws Exception, Error
	{
		try {
			String StrMsg;
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Created New Reserve WorkSheet");
			}else{	
				logger = reports.startTest("<span id='AddReserveWorksheet'>Reserve WorkSheet Creation</span>", "User Created New Reserve WorkSheet");
			}
			DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

			int ActualSizeData = Reservetype.length;
			if(NumberOfData==ActualSizeData)
			{
				String ReserveTransSet;
				for(int i=0;i<ActualSizeData;i++)
				{
					ReserveTransSet = Reservetype[i];
					String[] ReserveTransSetArray = ReserveTransSet.split(":");
					int SetSize = ReserveTransSetArray.length;
					if(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetTabClose(driver, ReserveTransSetArray[0].toUpperCase())==(null))
					{
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetTabOpen(driver, ReserveTransSetArray[0].toUpperCase()),color.RMA_ChangeColor_Utility(ReserveTransSetArray[0], 3)+": Reserve Tab On Reserve Worksheet Creation Screen", Intlogval);
					}
					for(int j=1;j<SetSize;j++)
					{
						RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveAmount(driver, ReserveTransSetArray[j]), "New Reserve Amount Textbox For "+color.RMA_ChangeColor_Utility(ReserveTransSetArray[j], 3)+" On Reserve Worksheet Creation Page", Intlogval);
						RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveAmount(driver, ReserveTransSetArray[j]),"New Reserve Amount Textbox For "+color.RMA_ChangeColor_Utility(ReserveTransSetArray[j], 3)+" On Reserve Worksheet Creation Page", String.valueOf(Amount), Intlogval);
					}
					List<WebElement> ReasonLookups=driver.findElements(By.xpath(".//*[contains(@id,'_ReserveWorksheetReason')]/p/span/button"));
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(ReasonLookups.get(i), "Reason Lookup Button On Reserve Worksheet Creation Screen", Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Reason Lookup Window Is Getting Opened");
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReserveReason, "Reserve Reason lookup Window", Intlogval);
					if(IsAdjuster)
					{	
						List<WebElement> AdjusterLookups=driver.findElements(By.xpath(".//*[contains(@id,'_ReserveWorksheetAdjuster')]/div/p/span/button"));
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(AdjusterLookups.get(i), "Assigned Adjuster Lookup Image Button On Reserve Worksheet Creation Screen", Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Adjuster Lookup Is Getting Opened");
						RMA_Navigation_Utility.RMA_WebPartialLinkSelect(AssignedAdjuster, "Assigned Adjuster Lookup Window", Intlogval);
					}
					if(IsComment)
					{	
						List<WebElement> CommentLookups=driver.findElements(By.xpath(".//*[contains(@id,'_Comments')]/div/span/button"));
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(CommentLookups.get(i), "Comment Button On Reserve Worksheet Creation Page", Intlogval);
						RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetCommentsTextbox(driver), "Comments Textbox On Reserve Worksheet Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Comment_"), Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetCommentsOk(driver), "OK Button on comments Popup on reserve Worksheet Creation Page", Intlogval);
					}
				}
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_SaveReserveWorkSheet(driver), "Save Reserve Worksheet Image Button On Reserve Worksheet Creation Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "Save Reserve Worksheet Message", Intlogval);		
			}
			else
				parentlogger.log(LogStatus.FAIL, "Data Size Do not Match");
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Created Successfully", "Reserve Worksheet Addition")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Created Successfully", "Reserve Worksheet Addition")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Creation Fail", "Reserve Worksheet Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Creation Fail", "Reserve Worksheet Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CarrierReserveWorksheetAddition_Utility
	//Description  		: Enables The User To Save a Reserve WorkSheet On A Carrier Claim 
	//Input Parameter 	: NumberOfData, Reservetype,Amount,Policy,Unit,CoverageType,LossType,ReserveSubType,AssignedAdjuster,IsAdjuster,IsComment,Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - NikitaThani-04-23-2019
	//==========================================================================================================================================================================================================================================
	public static void RMA_CarrierReserveWorksheetAddition_Utility(int NumberOfData, String[] Reservetype,int Amount,String Policy , String Unit,String CoverageType,String LossType, String[] ReserveSubType ,String AdditionalParam, String ReserveReason,String AssignedAdjuster, boolean IsAdjuster,boolean IsComment, int Intlogval) throws Exception, Error
	{
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Created New Reserve WorkSheet On Carrier Claim");
			}else{	
				logger = reports.startTest("<span id='AddReserveWorksheet'>Reserve WorkSheet Creation</span>", "User Created New Reserve WorkSheet On Carrier Claim");
			}
			DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

			int ActualSizeData = Reservetype.length;
			System.out.println("Actual Size in Dataset:"+ActualSizeData);
			if(NumberOfData==ActualSizeData)
			{
				String ReserveTransSet;
				for(int i=0;i<ActualSizeData;i++)
				{
					ReserveTransSet = Reservetype[i];
					String ReserveType =Reservetype[i].substring(0,Reservetype[i].indexOf(":"));
					System.out.println(ReserveType);
					String[] ReserveTransSetArray = ReserveTransSet.split(":");
					int SetSize = ReserveTransSetArray.length;
					System.out.println("Set size:"+SetSize);
					System.out.println("Reserve:"+ReserveTransSetArray[0].toUpperCase());

					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_CreateReserveWorkSheet(driver),"Create New Reserve Worksheet Button On Reserve WorkSheet Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

					if(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpPolicy(driver)!=null)
					{
						RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpPolicy(driver), Policy,  "Policy List", "Reserve Set Up Screen", Intlogval);
					}
					else
					{
						parentlogger.log(LogStatus.INFO,"Policy List Not Present On Screen");
					}

					if(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpUnit(driver)!=null)
					{
						RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpUnit(driver), Unit,  "Unit List", "Funds Split Page", Intlogval);					}
					else
					{
						parentlogger.log(LogStatus.INFO,"Unit List Not Present On Screen");
					}

					if(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpCoverageType(driver)!=null)
					{
						RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpCoverageType(driver), CoverageType,  "Coverage Type List", "Funds Split Page", Intlogval);	
					}else
					{
						parentlogger.log(LogStatus.INFO,"Coverage Type List Not Present On Screen");
					}

					if(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpLossType(driver)!=null || RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityCategory(driver)!=null)
					{
						if (AdditionalParam == "GC")
						{	
							RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpLossType(driver), LossType, "Loss Type List Box", "Loss Type List On Reserves Page",Intlogval);

						}
						if (AdditionalParam == "WC")
						{	
							RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityCategory(driver), "DisCat", "Disability Category List Box", "Disability Category List On Reserves Page",Intlogval);
							RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpDisabilityLossType(driver), LossType, "Disability Loss Type List Box", "Disability Loss Type List On Reserves Page",Intlogval);
						}
					}else
					{
						parentlogger.log(LogStatus.INFO,"disability or Loss Type List Not Present On Screen");
					}

					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveType(driver), ReserveType, "Reserve Sub Type List Box", "Add New Reserve Sub Type Window On Financial Reserves Page",Intlogval);

					if(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveSubType(driver)!=null)
					{
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Lst_ReserveSetUpReserveSubType(driver), ReserveSubType[i], "Reserve Sub Type List Box", "Add New Reserve Sub Type Window On Financial Reserves Page",Intlogval);
					}
					else
					{
						parentlogger.log(LogStatus.INFO,"Reserve Sub Type Not Present On Screen");
					}

					Thread.sleep(5000);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_SaveReserve(driver), "Save Reserve Button On Rserve WorkSheet Page", Intlogval);
					for(int j=1;j<SetSize;j++)
					{
						RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Txt_TransactionNewReserveAmount(driver, ReserveTransSetArray[j]),"New Reserve Amount Textbox For "+color.RMA_ChangeColor_Utility(ReserveTransSetArray[j], 3)+" On Reserve Worksheet Creation Page", String.valueOf(Amount), Intlogval);
					}
					List<WebElement> ReasonLookups=driver.findElements(By.xpath(".//*[contains(@id,'_ReserveWorksheetReason')]/p/span/button"));
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(ReasonLookups.get(0), "Reason Lookup Button On Reserve Worksheet Creation Screen", Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Reason Lookup Window Is Getting Opened");
					RMA_Navigation_Utility.RMA_WebPartialLinkSelect(ReserveReason, "Reserve Reason lookup Window", Intlogval);
					if(IsAdjuster)
					{	
						List<WebElement> AdjusterLookups=driver.findElements(By.xpath(".//*[contains(@id,'_ReserveWorksheetAdjuster')]/div/p/span/button"));
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(AdjusterLookups.get(0), "Assigned Adjuster Lookup Image Button On Reserve Worksheet Creation Screen", Intlogval);
						RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Adjuster Lookup Is Getting Opened");
						RMA_Navigation_Utility.RMA_WebPartialLinkSelect(AssignedAdjuster, "Assigned Adjuster Lookup Window", Intlogval);
					}
					if(IsComment)
					{	
						List<WebElement> CommentLookups=driver.findElements(By.xpath(".//*[contains(@id,'_Comments')]/div/span/button"));
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(CommentLookups.get(0), "Comment Button On Reserve Worksheet Creation Page", Intlogval);
						RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Txt_ReserveWorkSheetCommentsTextbox(driver), "Comments Textbox On Reserve Worksheet Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Comment_"), Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_ReserveWorkSheetCommentsOk(driver), "OK Button on comments Popup on reserve Worksheet Creation Page", Intlogval);
					}
				}
				RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval,"Wait Is Added as Reserve WorkSheet Values Are Entered");
				RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_SaveReserveWorkSheet(driver), "Save Reserve Worksheet Image Button On Reserve Worksheet Creation Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ReserveWorksheet.RMAApp_ReserveWorkSheet_Btn_SaveReserveWorkSheet(driver), "Save Reserve Worksheet Image Button On Reserve Worksheet Creation Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "Save Reserve Worksheet Message", Intlogval);		
			}
			else
				parentlogger.log(LogStatus.FAIL, "Data Size Do not Match");
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Created Successfully", "Reserve Worksheet Addition")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Created Successfully", "Reserve Worksheet Addition")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Creation Fail", "Reserve Worksheet Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Reserve Worksheet Creation Fail", "Reserve Worksheet Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddEventConfigurations_Utility
	//Description  		: Enables The User To Add Event Configurations In Occurrence Parameters SetUp
	//Input Parameter 	: FallCategory, MedicationCategory, FallIndicator, MedicationIndicator, EquipmentCategory, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - ShrutiShruti-05-22-2019
	//==========================================================================================================================================================================================================================================
	public static void RMA_AddEventConfigurations_Utility(String FallCategory, String MedicationCategory, String FallIndicator, String MedicationIndicator,String EquipmentCategory, int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Setup Event Configurations In Occurrence Parameters Setup");
			}else{	
				logger = reports.startTest("<span id='EventConfigurationSetup'>Event Configurations Setup</span>", "User Setup New Event Configurations");
			}
			String CurrentWindowHandle = driver.getWindowHandle();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.UtilitiesFrame);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Occurrence Parameter Setup")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Occurrence Parameter Setup"), "Occurrence Parameter Setup Link On Utilities Screen", Intlogval);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OccuParamSetupFrame);
			//globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Tab_EventConfig(driver)));
			Thread.sleep(10000);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Tab_EventConfig(driver), "Event Configurations Tab On Occurrence Parameters Setup Screen", Intlogval);

			String[] Values = {FallCategory, MedicationCategory, FallIndicator, MedicationIndicator, EquipmentCategory};
			for(int i=0; i<5;i++)
			{
				if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, Values[i])!=null)
				{
					RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Lst_Values(driver, Values[i]), Values[i], "Selected Category/Indicator List", "Occurence Parameters Setup Screen", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_FallEventCatDelete(driver), "Fall Event Category Delete Button On Occurence Parameters Setup Screen", Intlogval);		
				}
				if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, Values[i])!=null)
				{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_MedEventCatDelete(driver), "Medication Event Category Delete Button On Occurence Parameters Setup Screen", Intlogval);		
				}
				if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, Values[i])!=null)
				{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_SentinelEventIndDelete(driver), "Sentinel Event Indicators Delete Button On Occurence Parameters Setup Screen", Intlogval);		
				}
				if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, Values[i])!=null)
				{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_EquipEventCatDelete(driver), "Equipement Event Category Delete Button On Occurence Parameters Setup Screen", Intlogval);		
				}
			}
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_Save(driver), "Save Image Button On Occurrence Parameters Setup Screen", Intlogval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Tab_EventConfig(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Tab_EventConfig(driver), "Event Configurations Tab On Occurrence Parameters Setup Screen", Intlogval);
			if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, FallCategory)==null)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_FallEventCatLookUp(driver), "Fall Event Category Lookup Button", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, FallCategory), "Fall Category Link On Code Selection Window", Intlogval);
				driver.switchTo().window(CurrentWindowHandle);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OccuParamSetupFrame);
			}
			else
				parentlogger.log(LogStatus.INFO, "Fall Category Already Exists");
			if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, MedicationCategory)==null)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_MedEventCatLookUp(driver), "Medication Event Category Lookup Button", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
				//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(MedicationCategory, "", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, MedicationCategory), "Medication Category Link On Code Selection Window", Intlogval);
				driver.switchTo().window(CurrentWindowHandle);
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OccuParamSetupFrame);
			}
			else
				parentlogger.log(LogStatus.INFO, "Medication Category Already Exists");
			if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, FallIndicator)==null)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_SentinelEventIndLookUp(driver), "Sentinel Event Indicator Lookup Button", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
				//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(FallIndicator, "Medication Category Link On Code Selection Window", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, FallIndicator), "Fall Indicator Link on Code Selection Window", Intlogval);
				driver.switchTo().window(CurrentWindowHandle);
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OccuParamSetupFrame);
			}
			else
				parentlogger.log(LogStatus.INFO, "Fall Indicator Already Exists");
			if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, MedicationIndicator)==null)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_SentinelEventIndLookUp(driver), "Sentinel Event Indicator Lookup Button", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
				//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(MedicationIndicator, "Medication Category Link On Code Selection Window", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, MedicationIndicator), "Medication Indicator link On code Selection Window", Intlogval);
				driver.switchTo().window(CurrentWindowHandle);
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OccuParamSetupFrame);
			}
			else
				parentlogger.log(LogStatus.INFO, "Medication Indicator Already Exists");
			if(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, EquipmentCategory)==null)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_EquipEventCatLookUp(driver), "Equipement Event Category Lookup Button", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
				//	RMA_Navigation_Utility.RMA_WebPartialLinkSelect(EquipmentCategory, "Medication Category Link On Code Selection Window", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, EquipmentCategory), "Equipment Category Link on Code Selection Window", Intlogval);
				driver.switchTo().window(CurrentWindowHandle);
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.OccuParamSetupFrame);
			}	
			else
				parentlogger.log(LogStatus.INFO, "Equipment Category Already Exists");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Btn_Save(driver), "Save Image Button On Occurrence Parameters Setup Screen", Intlogval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Tab_EventConfig(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OccurrenceParameterSetUp.RMAApp_OccParamSetup_Tab_EventConfig(driver), "Event Configurations Tab On Occurrence Parameters Setup Screen", Intlogval);
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Configurations Setup Successfully", "Event Configurations Completion")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Configurations Setup Successfully", "Event Configurations Completion")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Configurations Completion Fail", "Event Configurations Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Configurations Completion Fail", "Event Configurations Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddFallInfoOnEvent_Utility
	//Description  		: Enables The User To Add Fall Info On Event 
	//Input Parameter 	: FallCategory, MedicationCategory, FallIndicator, MedicationIndicator, EquipmentCategory, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - ShrutiShruti-05-23-2019
	//==========================================================================================================================================================================================================================================
	public static void RMA_AddFallInfoOnEvent_Utility(String FallInfo_Txt_ConditionPrior, String FallInfor_Txt_SideRail, String FallInfo_Txt_Restraints, String FallInfo_Txt_BedPosition, String FallInfo_Txt_CallLightWithinRange, int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Add Fall Information");
			}else{	
				logger = reports.startTest("<span id='FallInfoAddition'>Fall Information Addition</span>", "User Adds Fall Information");
			}
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Document_Event.RMAApp_EventFallInfo_Btn_CondPrior(driver)));
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventFallInfo_Txt_CondPrior(driver), "Condition Prior TextBox On Fall Information Screen", FallInfo_Txt_ConditionPrior, Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventFallInfo_Txt_SideRailPos(driver), "Side Rail Position TextBox On Fall Information Creation Page", FallInfor_Txt_SideRail, Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventFallInfo_Txt_Restraints(driver), "Restraints TextBox On Fall Information Creation Screen", FallInfo_Txt_Restraints, Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventFallInfo_Txt_BedPosition(driver), "Bed Position TextBox On Fall Information Creation Screen", FallInfo_Txt_BedPosition, Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventFallInfo_Txt_CallLightWithinRange(driver), "Call Light Within Range TextBox On Fall information Creation Screen", FallInfo_Txt_CallLightWithinRange, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Fall Information Creation Screen", Intlogval);	
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "Fall Information Creation Screen", Intlogval);
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Fall Info Creation Successfully", "Fall Info Addition Completion")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Fall Info Creation Successfully", "Fall Info Addition Completion")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Fall Info Addition Fail", "Event Fall Info Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Fall Info Addition Fail", "Event Fall Info Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}

	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddMedWatchOnEvent_Utility
	//Description  		: Enables The User To Add Fall Info On Event 
	//Input Parameter 	: FallCategory, MedicationCategory, FallIndicator, MedicationIndicator, EquipmentCategory, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - ShrutiShruti-05-23-2019
	//==========================================================================================================================================================================================================================================
	public static void RMA_AddMedWatchOnEvent_Utility(String MedWatch_Txt_RepLastName, String MedWatch_Txt_State, String MedWatch_Txt_Country, String AdditionalParameters, int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Add MED Watch Information");
			}else{	
				logger = reports.startTest("<span id='MEDWatchAddition'>MED Watch Information Addition</span>", "User Adds MED Watch");
			}
			String Add1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Addr1_");
			String Add2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Addr2_");
			String Add3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Addr3_");
			String Add4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Addr4_");
			String City = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "City_");

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Btn_ReportersLastName(driver)));
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_ReportersLastName(driver), "Reporter's Last Name Textbox On MED Watch Creation Screen", MedWatch_Txt_RepLastName, Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_Address1(driver), "Address 1 Textbox On MED Watch Creation Screen", Add1, Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_Address2(driver), "Address 2 Textbox On MED Watch Creation Screen", Add2, Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_Address3(driver), "Address 3 Textbox On MED Watch Creation Screen", Add3, Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_Address4(driver), "Address 4 Textbox On MED Watch Creation Screen", Add4, Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_City(driver), "City Textbox On MED Watch Creation Screen", City, Intlogval);

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_Country(driver), "Country Textbox On MED Watch Creation Screen", MedWatch_Txt_Country, Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventMedWatch_Txt_State(driver), "State Textbox On MED Watch Creation Screen", MedWatch_Txt_State, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On MED Watch Creation Screen", Intlogval);		
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "MED Watch Creation Screen", Intlogval);
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event MED Watch Creation Successfully", "Fall MED Watch Completion")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event MED Watch Creation Successfully", "MED Watch Addition Completion")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event MED Watch Addition Fail", "Event MED Watch Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event MED Watch Addition Fail", "Event MED Watch Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}

	//======================================================================================================================================================================================================================================================
	//FunctionName             : RMA_SupplementalField_WithGroupAssociation_Utility
	//Description              : Enables The User To Create Supplemental Field Which Are Different from General Field On Screen
	//Input Parameter   	   : Suppl_Chk_ScreenName, Suppl_Creation_Txt_FieldType, Suppl_Creation_Txt_UserPrompt, ReqParam, MultiGroupAssociation, GroupAsso_Txt_SourceField,GroupAsso_Lnk_CodesEntities1, GroupAsso_Lnk_CodesEntities2 and Intlogval
	//Revision                 : 0.0 - DebasmitaPati -05-08-2019   
	// ==========================================================================================================================================================================================================================================================
	public static String RMA_SupplementalField_WithGroupAssociation_Utility(String Suppl_Chk_ScreenName,String Suppl_Txt_FieldType, String Suppl_Txt_UserPrompt,String Suppl_Required_Flag, String AdditionalParam,boolean MultiGroupAssociation,String GroupAsso_Txt_SourceField, String GroupAsso_Lnk_CodesEntities1, String GroupAsso_Lnk_CodesEntities2,int Intlogval) throws Exception, Error
	{   HyperLinkValueFromWeblist=null;
	String SystemName;	
	SystemName = (RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "")).toLowerCase(); //Auto generated string in lower case
	Suppl_Txt_UserPrompt = Suppl_Txt_UserPrompt+" "+SystemName;
	if(GroupAsso_Txt_SourceField.equalsIgnoreCase("Entity Table") || GroupAsso_Txt_SourceField.equalsIgnoreCase("Org Hierarchy")){
		GroupAsso_Lnk_CodesEntities1 = GroupAsso_Lnk_CodesEntities1.toUpperCase();
		GroupAsso_Lnk_CodesEntities2 = GroupAsso_Lnk_CodesEntities2.toUpperCase();
	}
	try{
		String CurrentWindowHandle;
		if (Intlogval == 0)
		{
			parentlogger.log(LogStatus.INFO, "User Creates Supplemental Field Type"+Suppl_Txt_FieldType+" With Group Associated Field "+GroupAsso_Txt_SourceField+" On Given Screen"+Suppl_Chk_ScreenName);
		}else{ 
			logger = reports.startTest("<span id='SupplementalFieldCreationWithGroupAssociation'>Supplemental Field Addition With Group Association Utility</span>", "User Creates Supplemental Field"+Suppl_Txt_FieldType+" With Group Associated Field "+GroupAsso_Txt_SourceField+" On "+Suppl_Chk_ScreenName+" Screen");
		}

		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.UtilitiesFrame);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Supplemental Field Data")));

		CurrentWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Supplemental Field Data"), "Supplemental Field Data Link Text On Utilities Screen", Intlogval);
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("SupplementalData");
		Thread.sleep(4000);
		globalWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='selectrdo']")));
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Chk_SupplementalField(driver, Suppl_Chk_ScreenName)));
		Thread.sleep(2000);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Chk_SupplementalField(driver, Suppl_Chk_ScreenName), "Supplemental Radio Button On Supplemental Setup Screen", Intlogval);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_SupplementalFieldEdit(driver), "Edit Supplemental Image Button On Supplemental Setup Screen", Intlogval);
		//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_SupplementalNewFieldAdd(driver)));
		RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Supplemental Window Is Loaded");
		RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Supplemental");

		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_SupplementalNewFieldAdd(driver), "Add New Supplemental Field Image Button On Supplemental Creation Window", Intlogval);
		//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Txt_UserPrompt(driver)));
		RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Add Field Window Is Loaded");
		RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Field");

		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Lst_FieldSelect(driver), Suppl_Txt_FieldType, "Field type List On Add New Field Window", "Supplemental Field Creation Page", Intlogval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Txt_UserPrompt(driver), "User Prompt TextBox On Add New Field Window On Supplemental Field Creation Screen", Suppl_Txt_UserPrompt, Intlogval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Txt_SystemFieldName(driver), "System Field  Name TextBox On Add New Field Window On Supplemental Field Creation Screen", SystemName, Intlogval);

		if(Suppl_Required_Flag.equals("Yes"))
		{
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Chk_Required(driver), "check", "Required Flag CheckBox On Add New Field Window", "Supplemental Field Creation Screen", Intlogval);
		}

		switch(Suppl_Txt_FieldType)
		{
		case "Grid":
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_ModifyGrid(driver), "Modify Grid Image Button On Add New Field Window On Supplemental Creation Screen", Intlogval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Grid Property");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_AddColumn(driver), "Add Column Image Button On Grid Property Window On Supplemetal Creation Screen", Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Txt_ColName(driver), "Column Name TextBox On Grid Property Window On Supplemental Creation Screen", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "ColName_"), Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_AddColOk(driver), "Ok Image Button On Grid Property Window On Supplemental Creation Screen", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_ColCancel(driver), "Close/Cancel Image Button On Grid Property Window On Supplemental Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Add Field Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Field");
			break;
		case "Supplemental History Grid":
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_ModifyGrid(driver), "Modify Grid Image Button On Add New Field Window On Supplemental Creation Screen", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Supplemental History Grid Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Supplemental History Grid");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Lst_SupplFieldList(driver), GroupAsso_Lnk_CodesEntities1, "Supplemental Field List", "Supplemental History Grid Window On Supplemental Field Creation Screen", Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, AdditionalParameter), "Field Name To Be Added In Grid On Supplemental History Grid Window On Supplemental Creation Screen", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_AddColumn(driver), "Add Image Button On Supplemental History grid Window On Supplemental Creation Screen", Intlogval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Column Value Is Getting Selected");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_ColCancel(driver), "Close Image Button On Supplemental History Grid Window On Supplemental Creation Screen", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Add Field Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Field");
			break;
		case "String":
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Txt_FieldSize(driver), "Field Size TextBox On Add Field Window On Supplemental Creation Screen","10", Intlogval);
			break;
		case "Entity":
		case "Multi-Entity":
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Lst_HyperLink(driver), "Banks", "Entity File List Box On Add Field Window", "Supplemental Creation Screen", Intlogval);
			break;	
		case "Hyperlink":
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Lst_HyperLink(driver), 0, "Hyper Link List Box On Add Field Window", "Supplemental Creation Screen", Intlogval);
			HyperLinkValueFromWeblist=new Select(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Lst_HyperLink(driver)).getFirstSelectedOption().getText();
			break;
		case "User Lookup":
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalField_Lst_UserGroups(driver), AdditionalParam, "User/Groups List Box On Add Field Window", "Supplemental Creation Screen", Intlogval);
			if(AdditionalParam.equalsIgnoreCase("Groups"))
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalField_Chk_MultiSelect(driver), "check", "MultiSelect CheckBox On Add New Field Window", "Supplemental Field Creation Screen", Intlogval);				
			break;
		default:
			break;
		}

		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_Lst_SourceField(driver), GroupAsso_Txt_SourceField, "Source Field List On Group Association Tab", "Supplemental Field Creation Page", Intlogval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
		if(!GroupAsso_Txt_SourceField.equals("Department")){	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_Btn_CodesLookup(driver), "Codes/Entities Lookup Button On Group Association Tab Supplemental Field Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Code Selection Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
			if(MultiGroupAssociation){
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_ChkBox_SelectCode(driver, GroupAsso_Lnk_CodesEntities1), "check", "Select CheckBox Against Given Code Description "+GroupAsso_Lnk_CodesEntities1+" On Code Selection Window", "Supplemental Field Creation Screen", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_ChkBox_SelectCode(driver, GroupAsso_Lnk_CodesEntities2), "check", "Select CheckBox Against Given Code Description "+GroupAsso_Lnk_CodesEntities2+" On Code Selection Window", "Supplemental Field Creation Screen", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_Btn_CodeSelectionOK(driver), "OK Button On Code Selection Window", Intlogval);
			}else{
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_ChkBox_SelectCode(driver, GroupAsso_Lnk_CodesEntities1), "check", "Select CheckBox Against Given Code Description "+GroupAsso_Lnk_CodesEntities1+" On Code Selection Window", "Supplemental Field Creation Screen", Intlogval);							
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_Btn_CodeSelectionOK(driver), "OK Button On Code Selection Window", Intlogval);					
			}				
		}else{
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_Btn_EntitiesLookup(driver), "Codes/Entities Lookup Button On Group Association Tab Supplemental Field Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Org Hierarchy Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Org Hierarchy");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Lst_SearchSpecificLevel(driver), "Department", "Search Specific Level", " On Org Hierarchy Selection Window On Supplemental Field Creation Screen", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Btn_ListView(driver), "List View Button On Org Hierarchy Selection Window On Supplemental Field Creation Screen", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, GroupAsso_Lnk_CodesEntities1), "Select Link Against Given Code Description "+GroupAsso_Lnk_CodesEntities1+" On Org Hierarchy Selection Window On Supplemental Field Creation Screen", Intlogval);

			if(MultiGroupAssociation){
				RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Add Field Window Is Loaded");
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Field");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalGroupAsso_Btn_EntitiesLookup(driver), "Codes/Entities Lookup Button On Group Association Tab Supplemental Field Creation Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Org Hierarchy Window Is Loaded");
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Org Hierarchy");
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Lst_SearchSpecificLevel(driver), "Department", "Search Specific Level", " On Org Hierarchy Selection Window On Supplemental Field Creation Screen", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_OrgHierarchy.RMAApp_OrgHierarchy_Btn_ListView(driver), "List View Button On Org Hierarchy Selection Window On Supplemental Field Creation Screen", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, GroupAsso_Lnk_CodesEntities2), "Select Link Against Given Code Description "+GroupAsso_Lnk_CodesEntities2+" On Org Hierarchy Selection Window On Supplemental Field Creation Screen", Intlogval);					
			}
		}			
		RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Add Field Window Is Loaded");
		RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Field");

		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Img_SaveAddField(driver), "Save Image Button On Add New Field Window", Intlogval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Supplemental Window Is Loaded");
		RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Supplemental");
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Img_SaveSupplemental(driver), "Save image Button On Supplemental Creation Window", Intlogval);
		//globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SupplementalsField.RMAApp_SupplementalFieldSetup_Btn_SupplementalNewFieldAdd(driver)));
		//RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, Suppl_Txt_UserPrompt), "Newly Created Field"+Suppl_Txt_UserPrompt+" In The Table", Intlogval);
		RMA_Navigation_Utility.RMA_ScrollBottomOfPage(Intlogval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, Suppl_Txt_UserPrompt),color.RMA_ChangeColor_Utility(Suppl_Txt_UserPrompt+": ", 2)+ "Newly Created Field In The Table", Intlogval);
		driver.close();
		driver.switchTo().window(CurrentWindowHandle);

		return SystemName;
	}
	catch (Exception | Error e){
		if (Intlogval == 0)
		{
			parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "RMA_SupplementalField_Addition_Utility Supplemental Field Creation", "Supplemental Field Cannot Be Created")));
			parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility("Supplemental Field Cannot Be Created",1));
		}
		else{ 
			logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "RMA_SupplementalField_Addition_Utility Supplemental Field Creation", "Supplemental Field Cannot Be Created")));
			logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility( "Supplemental Field Cannot Be Created",1));
		}
		throw (e);
	}
	}

	//======================================================================================================================================================================================================================================================
	//FunctionName             : RMA_GSTDetailsUpdateAndVerify_OnTransactionScreen_Utility
	//Description              : Enables The User To Update And Verify GST Details On Transaction Screen
	//Input Parameter   	   : ControlDesc, SettlementPaymentChk, GSTInclusiveAmount, GSTRate, GSTExclusiveAmount, GSTAmount,ITCEntitlement, ITCAmount,ExcessonInsurance, AdjustmentAmount and Intlogval
	//Revision                 : 0.0 - DebasmitaPati -08-12-2019   
	// ==========================================================================================================================================================================================================================================================
	public static void RMA_GSTDetailsUpdateAndVerify_OnTransactionScreen_Utility(String ControlDesc,String SettlementPaymentChk, String GSTInclusiveAmount,String GSTRate, String GSTExclusiveAmount,String GSTAmount,String ITCEntitlement,String ITCAmount, String ExcessonInsurance,String AdjustmentAmount, int Intlogval) throws Exception, Error
	{  
		try{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Updates GST Details");
			}else{	
				logger = reports.startTest("<span id='GSTDetailsUpdateAndVerify'>Successfull GST Details Update</span>", "User Updates GST Details");
			}			
			switch(ControlDesc)
			{
			case "Payments":				
			case "Auto Checks":
			case "Auto Check Third Party Payee":	
				if(ControlDesc.equalsIgnoreCase("Auto Check Third Party Payee")){
					globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_ThirdPartyPayees(driver)));				
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_ThirdPartyPayees(driver), "Expand Third Party Payees Tab On Schedule Check Page", Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(2, Intlogval, "Wait Is Added As Third Party Payees Tab Is Clicked");
					//Third Party Payees Tab Is Loaded
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Img_EditThirdPartyPayment(driver), "Edit Third Party Payment Button On Schedule Check Page",Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);	
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_ThirdPartyTransaction(driver), "Transaction Tab On Schedule Check Third Party Payment",Intlogval);// Transaction Tab On Schedule Check Third Party Payee Page Is Clicked
					RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_GST.RMAApp_GST_Chk_SettlementPayment(driver), "Settlement Payment Check Box On Schedule Check Third Party Payment Page", Intlogval);					
				}
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Chk_SettlementPayment(driver), "Settlement Payment Check Box", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Chk_SettlementPayment(driver), SettlementPaymentChk, "Settlement Payment", "Transaction Screen", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);		
				RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Settlement Payment Check Box Is Checked");


				RMA_Verification_Utility.RMA_PartialTextVerification("GST Applicable", RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTStatus(driver), "value"), "Default Value In GST Status Text Box On Transaction Screen", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_GST.RMAApp_GST_Tab_GSTDetails(driver), "GST Details Tab On Transaction Screen", Intlogval);

				RMA_Verification_Utility.RMA_TextCompare("$"+GSTInclusiveAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTInclusiveAmount(driver), "value"), "GST Inclusive Amount On GST Details Tab", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare(GSTRate, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTRate(driver), "value"), "GST Rate On GST Details Tab", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare("$"+GSTAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTAmount(driver), "value"), "GST Amount On GST Details Tab", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare("$"+GSTExclusiveAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTExclusiveAmount(driver), "value"), "GST Exclusive Amount On GST Details Tab", Intlogval);

				if(SettlementPaymentChk.equalsIgnoreCase("check")){
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCEntitlementPayee(driver), "ITC Entitlement (Payee) On GST Details Tab", Intlogval);
					RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCEntitlementPayee(driver), "ITC Entitlement (Payee)", ITCEntitlement, Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As Payee's ITC Amount Is Calculated And Displayed");
					RMA_Verification_Utility.RMA_TextCompare("$"+ITCAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCAmountPayee(driver), "value"), "Payee's ITC Amount On GST Details Tab", Intlogval);	

					if(!ExcessonInsurance.equalsIgnoreCase("NA")){
						//When there is a value in Excess on Insurance field
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ExcessonInsurance(driver), "Excess on Insurance On GST Details Tab", Intlogval);
						RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ExcessonInsurance(driver), "Excess on Insurance", ExcessonInsurance, Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);							
					}							
					if(!AdjustmentAmount.equalsIgnoreCase("NA")){
						RMA_Verification_Utility.RMA_TextCompare(AdjustmentAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_DecreasingAdjustmentAmount(driver), "value"), "Decreasing Adjustment Amount On GST Details Tab", Intlogval);	
					}					
				}
				else{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCEntitlement(driver), "ITC Entitlement (Payor/Insurer) On GST Details Tab", Intlogval);
					//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCEntitlement(driver), "ITC Entitlement (Payor/Insurer)", ITCEntitlement, Intlogval);
					RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCEntitlement(driver), "ITC Entitlement (Payor/Insurer)", ITCEntitlement, Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added As ITC Amount (Payor/Insurer) Is Calculated And Displayed");
					RMA_Verification_Utility.RMA_TextCompare("$"+ITCAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_ITCAmount(driver), "value"), "ITC Amount (Payor/Insurer) On GST Details Tab", Intlogval);							
				}							
				break;
			case "Collections":
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Chk_SettlementPayment(driver), "Settlement Payment Check Box On Transaction Screen", Intlogval);
				RMA_Verification_Utility.RMA_PartialTextVerification("GST Applicable", RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTStatus(driver), "value"), "Default Value In GST Status Text Box On Transaction Screen", Intlogval);

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_GST.RMAApp_GST_Tab_GSTDetails(driver), "GST Details Tab On Transaction Screen", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare("$"+GSTInclusiveAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTInclusiveAmount(driver), "value"), "GST Inclusive Amount On GST Details Tab", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare(GSTRate, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTRate(driver), "value"), "GST Rate On GST Details Tab", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare("$"+GSTAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTAmount(driver), "value"), "GST Amount On GST Details Tab", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare("$"+GSTExclusiveAmount, RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_GSTExclusiveAmount(driver), "value"), "GST Exclusive Amount On GST Details Tab", Intlogval);

				if(!AdjustmentAmount.equalsIgnoreCase("NA"))
				{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_GST.RMAApp_GST_Txt_IncreasingAdjustmentAmount(driver), "Increasing Adjustment Amount On GST Details Tab", Intlogval);
					RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_GST.RMAApp_GST_Txt_IncreasingAdjustmentAmount(driver), "Increasing Adjustment Amount", AdjustmentAmount, Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(2, Intlogval, "Wait Is Added As Increasing Adjustment Amount Is Set");		
				}				
				break;
			default:
				break;
			}		

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "GST Details Updated Successfully", "GST Details Update")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "GST Details Updated Successfully", "GST Details Update")));
			}			
			//Save Transaction screen
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button On Transaction Screen", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Transaction Record Is Saved");

			if(ControlDesc.equalsIgnoreCase("Auto Check Third Party Payee")){
				//Save Main Transaction screen
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Button On Transaction Screen", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Transaction Record Is Saved");}

		}
		catch (Exception | Error e){
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "RMA_GSTDetailsUpdate_OnTransactionScreen_Utility For GST Update", "GST Details Cannot Be Updated")));
				parentlogger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility("GST Details Cannot Be Updated",1));
			}
			else{ 
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "RMA_GSTDetailsUpdate_OnTransactionScreen_Utility For GST Update", "GST Details Cannot Be Updated")));
				logger.log(LogStatus.FAIL,  color.RMA_ChangeColor_Utility( "GST Details Cannot Be Updated",1));
			}
			throw (e);
		}
	}

	//====================================================================================================
	//FunctionName 		: RMA_CollectionCorpAdditionWithSaveMessageVerification_Utility
	//Description  		: Enables The User To Add Payment with Message verification functionality 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer, SaveMessageVerification: Message to be verified on the time of save	 
	//Revision			: 0.0-ShrutiShruti-11-06-2019
	// ====================================================================================================
	public static String RMA_CollectionCorpAdditionWithSaveMessageVerification_Utility(String BankAccnt,String PayeeType, Object ReserveType, Object TransType, int Amount, String LastName, String DisType, String Strclaimnumber,String VerificationMessage, boolean AdditionalParameter, int Intlogval) throws Exception, Error
	{
		ReserveTypeValueFromWeblist=null;
		TransactionTypeValueFromWeblist=null;
		ReturnValue=null;
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Collection Addition Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}else{	
				logger = reports.startTest("<span id='CollectionAdditionSaveMessage'>Collection Addition</span> Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber, "User Makes A New Collection Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}	

			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_AddCollection(driver), "Add Collection Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			Thread.sleep(5000);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Collection Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Collection Creation Page",Intlogval);

			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Collection Creation Page", LastName,Intlogval);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Collection Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Collection Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Collection Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Collection Creation Page",Intlogval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			if((!ReserveType.equals("NA")) & (!ReserveType.equals("WC"))  ){

				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",Intlogval);
				}
				if(ReserveType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType.toString(), "Reserve Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",Intlogval);
				}
			}
			ReserveTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Collection Creation Page", Intlogval);
			Thread.sleep(1000);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Collection Creation Page", String.valueOf(Amount),Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Collection Creation Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			// Select Transaction Type from WebList Based on Provided value in Function
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",Intlogval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",Intlogval);
			}
			TransactionTypeValueFromWeblist=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Collection Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			// Payment Is Added And Funds Split Details View Is Closed

			if(!VerificationMessage.equalsIgnoreCase("NA")){
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, VerificationMessage, "Collection Creation Page", Intlogval);
				//Save Button Is Clicked To Save The Transaction
			}
			else{
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Collection Creation Page", Intlogval);
				//Save Button Is Clicked To Save The Transaction
			}	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Collection Creation Page",Intlogval);// Transaction Tab On Payment Creation Page Is Clicked
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Collection Creation", "New Collection Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Collection Creation", "New Collection Is Created Successfully")));
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Collection Addition Fail", "Collection Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Collection Addition Fail", "Collection Is Not Added")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
	}

	//===========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_ScheduleCheckCreationWithInsufficientReserve
	//Description  		: Enables Users To Create Schedule Check With Insufficient Reserve
	//Input Parameter 	: Input Parameters Are :NumberOfPayment, BankAccount, PayeeType, TransactionType, Amount, logval 
	//Revision			: 0.0-DebasmitaPati-11-11-2019
	//======================================================================================================================================================================================================================================================
	public static String RMA_ScheduleCheckCreationWithInsufficientReserve(String Case, String SubCase, String PayInterval, int NumberOfPayment, String BankAccount, String PayeeType, String PayeeName, String TransactionType,int Amount, int Intlogval) throws Exception,Error
	{		

		CurrentFrameID=null;
		ReturnValue=null;
		//Global Variable Initialization Is Completed Here

		try
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO,"Schedule Check Is Created On Claim");
			}
			else
			{	
				logger = reports.startTest("<span id='ScheduleCheckOnClaim'>ScheduleCheck Creation On Claim</span>","Schedule Check Is Created On Carrier GC Claim");
			}

			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_FinancialReserve_Img_ScheduleCheck(driver), "ScheduleCheck Image On Financial Reserve Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is As ScheduleCheck Page Is Loaded");
			//Schedule Check Page Is Loaded

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_NumberOfPayments(driver), "# Of Payments Text Box On ScheduleCheck Page", String.valueOf(NumberOfPayment), logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_PayInterval(driver), "Pay Interval Text Box On Schedule Check  Page", PayInterval, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Value Is Entered In Pay Interval Text Box");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Btn_PayIntervalLookUp(driver), "PayInterval LookUp Button On ScheduleCheck Page", Intlogval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is As Pay Interval Window Is Loaded");
			//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PayInterval, "Code Selection Window", Intlogval);

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "Control Number Textbox On Schedule Check Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(12, Intlogval, "Wait Is Added As Number Of Payments Will Get Reflected In The Detail Information Tab");
			//Number Of Payments Is Set

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Lst_BankAccount(driver), BankAccount, "BankAccount", "Schedule Check Page", Intlogval); 
			//Bank Account Is Selected 

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Lst_PayeeType(driver), PayeeType, "PayeeType", "Schedule Check Page", Intlogval);
			//Payee Type Is Selected
			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Schedule Check Page",PayeeName,Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(2, Intlogval, "Wait Is Added As Value Is Entered In Last Name Box");
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			}
			//	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_ScheduleCheck(driver), "Collapse Scheduled Checks Tab On Schedule Check Page", Intlogval);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_DetailedInformation(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Tab_DetailedInformation(driver), "Expand Detailed Information Tab On Schedule Check Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, Intlogval, "Wait Is Added As Detailed Information Tab Is Clicked");
			//Detailed Information Tab Is Loaded

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Img_PaymentGridNew(driver), "New Image For Transaction On Schecule Check Page", Intlogval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Img_PaymentGridNew(driver), "New Image For Transaction On Schecule Check Page", Intlogval);
			/*RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Lst_TransType(driver), "Transaction Type TextBox On Payment Detail Window", TransactionType,Intlogval);	
						RMA_GenericUsages_Utility.RMA_StaticWait(7, Intlogval, "Wait Is Added As Transaction Type Is Set");*/

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Btn_TransType(driver), "Transaction Type Button On Schedule Check Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Transaction Type Is Set");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(driver.findElement(By.xpath(".//*[@class='ui-grid-cell-contents ng-scope']/span")), "Transaction Type On Lookup Window", logval);
			//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(TransactionType, "Transaction Type Link ", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Transaction Type Is Set");

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On  Payment Detail Window", logval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On  Payment Detail Window", String.valueOf(Amount),logval);	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Payment Detail Entry Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Payment Detail Is Saved");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
			switch (Case){

			case "Payment With Do Not Allow Negative Reserve Adjust"://Add Payment Without Any Limit Set In The User Privileges Setup	

				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, RMA_Selenium_POM_VerificationMessage.PaymnetWithInsufficientReserveWithDonotNegativeReserveAdjustMsg, "Schedule Check Page", Intlogval);				
				break;				
			case "Payment Without Any Limit"://Add Payment Without Any Limit Set In The User Privileges Setup	

				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Schedule Check Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame); //Navigate To Insufficient Reserve frame
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");
					break;
				case "Only Continue"://Continue To Save Payment
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;				
			case "Payment With Per Claim Incurred Limit"://Add Payment With Per Claim Incurred Limit Set In The User Privileges Setup	

				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Schedule Check Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame); //Navigate To Insufficient Reserve frame
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");					
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ExceedPerClaimIncurredLimitPaymentMsg, true, "Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");						
					break;
				case "Only Continue"://Continue To Save Payment
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;	
			case "Payment With Reserve Limit"://Add Payment With Reserve Limit Set In The User Privileges Setup	

				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Schedule Check Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame); //Navigate To Insufficient Reserve frame
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				switch (SubCase){
				case "Set Reserve And Continue"://To Set Reserve	
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.AutoCheckInsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);
					break;
				case "Add Reserve And Continue"://To Add Reserve 
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.AutoCheckInsufficientReserveWithReserveLimitMsg, true, "Transaction Screen", Intlogval);
					break;
				case "Only Continue"://Continue To Save Payment
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					ReturnValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_ControlNumber(driver), "value");
					break;
				default:		
					if (Intlogval == 0)
					{
						parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
					else
					{
						logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
					}
				}
				break;	
			default:		
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}

			if(NumberOfPayment == 5)
			{
				RMA_Verification_Utility.RMA_TextCompare(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_FirstPayment(driver).getAttribute("value"), "Fisrt Payment Date TextBox On Schedule Check Page", Intlogval);
				RMA_Verification_Utility.RMA_TextCompare(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+4,0,0,"MM/dd/yyyy"), RMA_Selenium_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_FinalPayment(driver).getAttribute("value"), "Final Payment Date TextBox On Schedule Check Page", Intlogval);
			}

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Schedule Check With Insufficient Reserve", "Schedule Check With Insufficient Reserve Verified Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Schedule Check With Insufficient Reserve", "Schedule Check With Insufficient Reserve Verified Successfully")));
			}	
			try {
				if(!ReturnValue.equals(null)){
					ReturnValue=ReturnValue;
				}
			} catch (Exception e) {
				ReturnValue=null;			
			}	
			return ReturnValue;
		}
		catch (Exception|Error e)
		{
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Schedule Check With Insufficient Reserve Fail", "Schedule Check With Insufficient Reserve Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Schedule Check With Insufficient Reserve Fail", "Schedule Check With Insufficient Reserve Is UnSuccessful")));
			}

			throw (e);
		}			
	}	


	//====================================================================================================
	//FunctionName 		: RMA_PaymentCorpAdditionWithMultipleSplits_Utility
	//Description  		: Enables The User To Add Payment with Message verification functionality 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer, SaveMessageVerification: Message to be verified on the time of save	 
	//Revision			: 0.0-RenuVerma-08-01-2018
	// ====================================================================================================
	public static String RMA_PaymentCorpAdditionWithMultipleSplits_Utility(boolean FinalPayment, int NumberOfSplits, String BankAccnt,String PayeeType, Object[] ReserveType, Object[] TransType, int Amount, String LastName, String DisType, String Strclaimnumber,String VerificationMessage, int Intlogval) throws Exception, Error
	{
		ReserveTypeValueFromWeblistA = new String[NumberOfSplits];
		TransactionTypeValueFromWeblistA = new String[NumberOfSplits];
		ReturnValue=null;
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Payment Addition With Multiple Splits On Claim " +Strclaimnumber);
			}else{	
				logger = reports.startTest("<span id='PaymentAdditionWithMultipleSplits'>Payment Addition</span> With Multiple Splits On Claim " +Strclaimnumber, "User Makes A New Payment With Multiple Splits On Claim " +Strclaimnumber);
			}	

			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			//Thread.sleep(5000);
			RMA_GenericUsages_Utility.RMA_StaticWait(15, Intlogval, "Wait Added For Distribution Selection Window");
			if (FinalPayment)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinalPayment_Flag(driver), "Final Payment Check Box On Transaction Page",Intlogval);				
			}
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);

			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);

			for(int i=0;i<NumberOfSplits;i++)
			{				
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);
				//Add New Button Is Clicked And Funds Split Details View Is Opened
				if((!ReserveType[i].equals("NA")) & (!ReserveType[i].equals("WC"))  ){
					if(ReserveType[i].getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType[i], "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
					}
					if(ReserveType[i].getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType[i].toString(), "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
					}
				}
				ReserveTypeValueFromWeblistA[i] = new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();
				//System.out.println(ReserveTypeValueFromWeblistA[i]);	

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
				Thread.sleep(1000);
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

				// Select Transaction Type from WebList Based on Provided value in Function
				if(TransType[i].getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType[i], "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				if(TransType[i].getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType[i].toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				TransactionTypeValueFromWeblistA[i]=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();
				//System.out.println(TransactionTypeValueFromWeblistA[i]);			

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			}
			if(!VerificationMessage.equalsIgnoreCase("NA")){
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, true, VerificationMessage, "Payment Creation Page", Intlogval);
				//Save Button Is Clicked To Save The Transaction
			}
			else{
				RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);
				//Save Button Is Clicked To Save The Transaction
			}	
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval); // Wait For UX Page Load Bar To Disappear                        
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",Intlogval);// Transaction Tab On Payment Creation Page Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation With Multiple Splits", "New Payment Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation With Multiple Splits", "New Payment Is Created Successfully")));
			}
			try {
				if(!ReturnValue.equals(null)){
					ReturnValue=ReturnValue;
				}
			} catch (Exception e) {
				ReturnValue="0";
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.INFO,  color.RMA_ChangeColor_Utility("Payment With Multiple Splits Cannot Be Created Due To Insufficient Reserve",1));
				}else{	
					logger.log(LogStatus.INFO, color.RMA_ChangeColor_Utility("Payment With Multiple Splits Cannot Be Created Due To Insufficient Reserve",1));
				}
			}	
			return ReturnValue;

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition With Multiple Splits Fail", "Payment Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment Addition With Multiple Splits Fail", "Payment Is Not Added")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
	}

	//====================================================================================================
	//FunctionName 		: RMA_PaymentCorpAdditionWithInsufficientReserveForMultipleSplits_Utility
	//Description  		: Enables The User To Add Payment with Insufficient Reserve functionality 
	//Input Parameter 	: Driver Of The Type Driver, BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer, SaveMessageVerification: Message to be verified on the time of save	 
	//Revision			: 0.0-DebasmitaPati-08-01-2018
	// ====================================================================================================
	public static String RMA_PaymentCorpAdditionWithInsufficientReserveForMultipleSplits_Utility(boolean FirstAndFinalPayment,boolean FinalPayment, int NumberOfSplits,String Case, String[] SubCase, String BankAccnt,String PayeeType, Object[] ReserveType, Object[] TransType, int Amount, String LastName, String DisType, String Strclaimnumber, String VerificationMessage, int Intlogval) throws Exception, Error
	{
		ReserveTypeValueFromWeblistA = new String[NumberOfSplits];
		TransactionTypeValueFromWeblistA = new String[NumberOfSplits];
		//SubCase = new String[SubCase.length];
		ReturnValue=null;
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Payment With Insufficient Reserve Creation With Payment Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}else{	
				logger = reports.startTest("<span id='PaymentAdditionWithInsufficientReserveForMultipleSplits'>Payment Addition With Insufficient Reserve</span> Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber, "User Makes A New Payment With Insufficient Reserve Of Amount:"+Amount+ " and Reserve Type:"+ReserveType+" On Claim " +Strclaimnumber);
			}	

			//String StrSecPrimaryWindowHandle;
			//Local Variable Declaration
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

			//globalWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver))));
			Thread.sleep(3000);
			if (FinalPayment)
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinalPayment_Flag(driver), "Final Payment Check Box On Transaction Page",Intlogval);				
			}
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Payment Creation Page",Intlogval);

			if(!"C-Claimant".equals(PayeeType.trim())){
				RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Payment Creation Page", LastName,Intlogval);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",Intlogval);
			for(int i=0;i<NumberOfSplits;i++)
			{				
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",Intlogval);
				//Add New Button Is Clicked And Funds Split Details View Is Opened
				if((!ReserveType[i].equals("NA")) & (!ReserveType[i].equals("WC"))  ){
					if(ReserveType[i].getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), (int)ReserveType[i], "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
					}
					if(ReserveType[i].getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
						RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveType[i].toString(), "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
					}
				}
				ReserveTypeValueFromWeblistA[i] = new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver)).getFirstSelectedOption().getText();
				System.out.println(ReserveTypeValueFromWeblistA[i]);	

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", Intlogval);
				Thread.sleep(1000);
				RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(Amount),Intlogval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");

				// Select Transaction Type from WebList Based on Provided value in Function
				if(TransType[i].getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType[i], "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				if(TransType[i].getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType[i].toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",Intlogval);
				}
				TransactionTypeValueFromWeblistA[i]=new Select(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver)).getFirstSelectedOption().getText();
				System.out.println(TransactionTypeValueFromWeblistA[i]);			

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",Intlogval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			}
			// Payment Is Added And Funds Split Details View Is Closed

			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", Intlogval);
			//Save Button Is Clicked To Save The Transaction

			switch (Case){
			case "Payment Without Any Limit"://Add Payment Without Any Limit Set In The User Privileges Setup	
				for(int j=0;j<SubCase.length;j++)
				{
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ExternalAppFrame); //Navigate To Insufficient Reserve frame
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
					switch (SubCase[j]){				
					case "Set Reserve And Continue"://To Set Reserve	
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_SetReserve(driver), "Set Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						break;
					case "Add Reserve And Continue"://To Add Reserve 
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_AddReserve(driver), "Add Reserve Button On Insufficient Reserves Page", Intlogval);
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						break;
					case "Only Continue"://Continue To Save Payment
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_InsufficientReserves.RMAApp_InsufficientReserves_Btn_Continue(driver), "Continue Button On Insufficient Reserves Page", Intlogval);
						RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
						break;

					default:		
						if (Intlogval == 0)
						{
							parentlogger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+ " " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
						}
						else
						{
							logger.log(LogStatus.ERROR, "State Variable" + " "+SubCase+" " + "Provided By User Is Not Having A Defined SubCase Code Logic And Hence Is An Invalid Input");	
						}
					}
					RMA_GenericUsages_Utility.RMA_StaticWait(2, Intlogval, "Wait Is Added As Payment Is Getting Loaded");
					driver.switchTo().parentFrame();
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
					//RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
				}					
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",Intlogval);// Transaction Tab On Payment Creation Page Is Clicked
				RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");
				ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
				break;				
			case "Payment With Per Claim Incurred Limit"://Add Payment With Per Claim Incurred Limit Set In The User Privileges Setup	

				break;	
			case "Payment With Reserve Limit"://Add Payment With Reserve Limit Set In The User Privileges Setup	

				break;	
			default:		
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "State Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "State Variable" + " "+Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}			
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve", "Payment With Insufficient Reserve Verified Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve", "Payment With Insufficient Reserve Verified Successfully")));
			}	
			try {
				if(!ReturnValue.equals(null)){
					ReturnValue=ReturnValue;
				}
			} catch (Exception e) {
				ReturnValue="0";			
			}	
			return ReturnValue;
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve Fail", "Payment With Insufficient Reserve Verification Failed")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment With Insufficient Reserve Fail", "Payment With Insufficient Reserve Verification Failed")));
			}
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			throw (e);
		}
		finally
		{
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",Intlogval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);			
		}
	}

	//====================================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_Funds_PrintChecks_VerifyPDF
	//Description  		: Enables The User To Print Checks
	//Input Parameter 	: BankAccountName Of Type String, logval Of Type Integer
	//Revision			: 0.0-DebasmitaPati-06-15-2020
	// ====================================================================================================================================================================================================================================================================================================
	public static void RMA_Funds_PrintChecks_VerifyPDF(String BankAccountName,String DisType,String CheckType, String ControlNumber,String PDFPassword, Object[] PreCheckContentToBeVerified, Object[] PrintBatchContentToBeVerified, String CheckStockName, String Additionalparameter, int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Prints Checks");
			}else{	
				logger = reports.startTest("<span id='PrintChecksVerifyPDF'>Successful Printing Of Checks</span>", "User Prints Checks");
			}

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-PrintChecks", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("printchecks");
			RMA_GenericUsages_Utility.RMA_StaticWait(50, logval, "Wait Is Added As Print Checks Frame Is Getting Loaded");				
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_BankAccount(driver), BankAccountName, "Bank Account List", "Funds--->Print Checks Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Bank Account Is Selected From The List

			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_DistributionType(driver), DisType, "Distribution Type List", "Funds-->Print Check Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Chk_FromDate(driver), "check", "From Date CheckBox ", "Funds-->PrintCheck Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Chk_CombinedPayment(driver), "check", "Include Combined Payment CheckBox ", "Funds-->Print Checks Page", logval);

			if(CheckType.equalsIgnoreCase("Select Checks"))
			{
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_Checks(driver), CheckType, "Check ListBox", "Funds-->Print Check Page", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Btn_SelectChecks(driver), "Select Checks Button On Funds-->Print Checks Page", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Screen Is Loaded");

				List<WebElement> Radio=driver.findElements(By.xpath(".//*[@class='ui-grid-filter-input ui-grid-filter-input-0']"));
				RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(Radio.get(1), "Control Number TextBox On Grid Window", ControlNumber, logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Record Is Getting Loaded");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Chk_SelectCheck(driver), "Select Check to Print Check Box On Grid Window", logval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Btn_OKPrint(driver), "Ok Button On Grid Window", logval);
			}

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Img_Print(driver), "Print Image Button On Precheck Register Tab On Print Checks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Print Checks PDF Is Loaded");
			RMA_Verification_Utility.PDFReaderContentVerification_Utility("NA", PreCheckContentToBeVerified, "Yes", logval);
			//Pre Check Register PDF Contents Are Verified

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Screen Is Switched");
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,RMA_Selenium_POM_VerificationMessage.PreCheckConfirmationMsg), "displayed", "Precheck Register Alert Message", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintChecks.RMAApp_PrintChecks_Btn_PrintCheckOk(driver), "Ok Button On Print Checks Alert Message", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Ok Is Clicked On Pre Check Confirmation Page");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Print Check Batch"), "Print Check Batch Tab", logval);
			//Print Check Batch Tab Is Selected
			if(CheckStockName!="NA")
			{
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Lst_CheckStock(driver), CheckStockName, "Check Stock List", "Funds-->Print Check Page", logval);
			}
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PrintChecks_Img_PrintCheck(driver), "Print Image Button On Print Check Batch Tab On Print Checks Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(20, logval, "Wait Is Added As Checks And EOB Reports Popup Needs To Get Loaded");
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_Selenium_POM_VerificationMessage.ChecksAndEOBReportsMsg, RMA_Selenium_POM_PaymentsCollections.RMAApp_PrintSingleCheck_Txt_ChecksAndEOBReportsMsg(driver).getText(), "Checks And EOB Reports Message On Checks And EOB Reports Popup", logval);
			//Verification Of Checks And EOB Reports Message Is Done Here
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "CHECKS"), "CHECKS Link On Checks And EOB Reports Popup", logval);
			RMA_Verification_Utility.PDFReaderContentVerification_Utility(PDFPassword, PrintBatchContentToBeVerified, "Yes", logval);
			//Print Check Batch PDF Contents Are Verified	

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Screen Is Switched");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_PaymentChecksAndEOBReports_Btn_Ok(driver), "Ok(Tick Mark Image Button) Button On Checks And EOB Reports Popup", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Print Check Message Popup Needs To Get Loaded");
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_Selenium_POM_VerificationMessage.CheckPrintedVerificationMsg, RMA_Selenium_POM_PaymentsCollections.RMAApp_PrintSingleCheck_Txt_CheckPrintedVerificationMsg(driver).getText(), "Check Printed Verification Msg On Printed Checks Popup", logval);
			//Verification Is Done To Check The Message Which Appears Before Successful Print Of The Check Is Done As An Information

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_PrintChecks.RMAApp_Payment_Txt_PrintSingleCheckMsgOk(driver), "Ok(Tick Mark Image Button) Button On Print Check Message Popup", logval);
			//Print Checks Are Given Permission To Print

			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Checks Are Printed");			

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Printing Of Checks", "Printing Of Checks Is Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Printing Of Checks", "Printing Of Checks Is Done Successfully")));
			}
		}
		catch (Exception|Error e) {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Printing Of Checks Fail", "Printing Of Checks Is UnSuccessful")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Printing Of Checks Fail", "Printing Of Checks Is UnSuccessful")));
			}

			throw (e);
		}
	}	

	//====================================================================================================
	//FunctionName 		: RMA_Funds_TransactionCreationWithReadyToPrint_Utility
	//Description  		: Enables The User To Add Transaction With Ready To Print Functionality 
	//Input Parameter 	:  BnkAccnt, PayeeType, TransType, Amount, LastName Of The Type String, Amount Of The Type Integer	 
	//Revision			: 0.0-ShrutiShruti-10-12-2020
	// ====================================================================================================
	public static String RMA_Funds_TransactionCreationWithReadyToPrint_Utility(String BankAccnt,String PayeeType, Object TransType, int Amount, String LastName, String DisType, int logval) throws Exception, Error
	{
		try {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Payment As A Transaction ");
			}else{	
				logger = reports.startTest("<span id='PaymentAdditionWithReadyToPrint'>TC_Payment Addition</span>", "User Makes A New Payment As A Transaction");
			}	

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), BankAccnt, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Transaction Creation Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PayeeType, "Payee Type Drop Down List", "Transaction Creation Page",logval);

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Txt_LastName(driver), "Last Name Text Box On Transaction Creation Page", LastName,logval);

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Transaction Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(DisType, "Distribution Type Link On Distribution Selection Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Distribution Type Is Selected In Transaction Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Transaction Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Transaction Creation Page",logval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Transaction Creation Page", logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Transaction Creation Page", String.valueOf(Amount),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_TransactionTypeTrans(driver), "Transaction Type DropDown List On Funds Details Model Popup On Transaction Creation Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Transaction Type Is Clickable In Transaction Creation Page");

			if(TransType.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), (int)TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",logval);
			}
			if(TransType.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType.toString(), "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",logval);
			}

			//RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), TransType, "Transaction Type DropDown List" , "Funds Details Model Popup On Transaction Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Transaction Creation Page",logval);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			//RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			// Payment Is Added And Funds Split Details View Is Closed
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Funds Split Popup Is getting Disappered");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Transaction Screen", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.ReadyToPrintPopUpMessage), "Ready To Print Message On Payment Screen", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Transaction_Btn_ReadyToPrintOK(driver), "Ready To Print OK Button On Payment Creation Screen", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Save Button Is Clicked To Save The Transaction

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Transaction Creation Page",logval);// Transaction Tab On Payment Creation Page Is Clicked
			ReturnValue = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Transaction Creation", "New Transaction Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Transaction Creation", "New Transaction Is Created Successfully")));
			}
			return ReturnValue;

		} catch (Exception|Error e) {
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Transaction Addition Fail", "Transaction Is Not Added")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Transaction Addition Fail", "Transaction Is Not Added")));
			}
			throw (e);
		}
	}
	
	//========================================================================================================================================================================================================================================
	//FunctionName 		: RMA_AddSentinelOnEvent_Utility
	//Description  		: Enables The User To Add Sentinel Info On Event 
	//Input Parameter 	: FallCategory, MedicationCategory, FallIndicator, MedicationIndicator, EquipmentCategory, Intlogval Is The Integer Value Of The Logger Statement Variable "logger" Or "ParentLogger"
	//Revision			: 0.0 - MishalKantawala-10-22-2020
	//==========================================================================================================================================================================================================================================
	public static void RMA_SentinelOnEvent_Utility(String SentinelInfo_Txt_SummaryOfIncident, String SentinelInfo_Txt_ConsequenceOfEvent, String SentinelInfo_Txt_ChangedDuringEvent, String SentinelInfo_Txt_PreventedTheIncident, int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Add Sentnel Information");
			}else{	
				logger = reports.startTest("<span id='SentinelinfoAddition'>Sentinel Information Addition</span>", "User Adds Sentinel Information");
			}
			Thread.sleep(5000);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_SummaryOfIncident(driver)));
			Thread.sleep(5000);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_SummaryOfIncident(driver), "Summary Of Event Image Button On Event's Sentinel Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_NotesEditor(driver), "Providing value to Relavent History", SentinelInfo_Txt_SummaryOfIncident, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_EditorOk(driver), "Ok button Clicked", Intlogval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_ConsequenceOfEvent(driver), "Consequence Of Event Image Button On Event's Sentinel Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_NotesEditor(driver), "Providing value to Consequence Of Event",SentinelInfo_Txt_ConsequenceOfEvent, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_EditorOk(driver), "Ok button Clicked", Intlogval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_ChangedDuringEvent(driver), "Changed During Event Image Button On Event's Sentinel Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_NotesEditor(driver), "Providing value to Changed During Event", SentinelInfo_Txt_ChangedDuringEvent, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_EditorOk(driver), "Ok button Clicked", Intlogval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_PreventedTheIncident(driver), "Prevented The Incident Image Button On Event's Sentinel Creation Page", Intlogval);
			RMA_Input_Utility.RMA_ActionSetValueAndTabOut_Utility(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_NotesEditor(driver), "Providing value to Prevented The Incident", SentinelInfo_Txt_PreventedTheIncident, Intlogval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_EditorOk(driver), "Ok button Clicked", Intlogval);
		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Sentinel Information Creation Screen", Intlogval);	
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.SaveSuccessfully, false, "Sentinel Information Creation Screen", Intlogval);

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Sentinel Info Creation Successfully", "Sentinel Info Addition Completion")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Sentinel Info Creation Successfully", "Sentinel Info Addition Completion")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Sentinel Info Addition Fail", "Event Sentinel Info Is Not Added")));
			}else{	
				logger.log(LogStatus.FAIL,"Following Error Occurred In Catch Block::"+"<span style='color:red'>"  + e.getMessage()+ "</script></span>");
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Event Sentinel Info Addition Fail", "Event Sentinel Info Is Not Added")));
			}
			driver.switchTo().parentFrame();
			throw (e);
		}
	}
}
