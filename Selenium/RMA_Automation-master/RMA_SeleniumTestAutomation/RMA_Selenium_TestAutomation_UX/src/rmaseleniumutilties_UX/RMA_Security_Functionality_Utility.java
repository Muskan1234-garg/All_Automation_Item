package rmaseleniumutilties_UX;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
//RMA Package Import Completed
import rmaseleniumtestscripts.RMA_TC_001;
import rmaseleniumtestscripts.UtilityMenu;

public class RMA_Security_Functionality_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String ErrorTxtMessage;

	///====================================================================================================
	//FunctionName 		:RMA_SMSModuleAddRenameDelete_Utility
	//Description  		: Enables the User To Add/Rename/Delete A Module From SMS
	//Input Parameter 	: ModuleName,  RiskMasterStatus: check/uncheck, SortMasterStatus: check/uncheck, UtilitiesStatus: check/uncheck, StandardReportStatus: check/uncheck, ExecutiveSummaryStatus: check/uncheck,  DSNName,
	//			  			 	 		 AdditionalParameter: Few Parameter which May Compulsory In Future, logval 	 
	//									Pass "NA" or 00 for optional parameter	
	//Revision			: 0.0 - RenuVerma-07-04-2018   
	//====================================================================================================
	//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present
	public static void RMA_SMSModuleAddRenameDelete_Utility(String Case,String ModuleName, String LinkName, String RiskMasterStatus,String SortMasterStatus,String UtilitiesStatus,String StandardReportStatus,String ExecutiveSummaryStatus,String DSNName, boolean AdditionalParameter,int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO,"Enables the User To "+Case+" Module "+ModuleName+" On SMS Page ");
			}
			else
			{	
				logger = reports.startTest("<span id='SMSModuleAdd'>"+Case+" Module "+ModuleName+" On SMS</span>", "Enables the User To "+Case+" Module "+ModuleName+" On SMS Page ");
			}

			switch (Case){
			case "Add":		
				Thread.sleep(4000);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(20000);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				Thread.sleep(2000);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, "Module Security Groups"),"Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_AddModule(driver)));			
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_AddModule(driver), "Add New Module Button On Security Management System Page", Intlogval);
				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver)));		
				Thread.sleep(4000);
				//JavascriptExecutor executor = (JavascriptExecutor)driver;
				//executor.executeScript ("document.getElementById('txt_grpname').focus()");
				//executor.executeScript("arguments[0].setAttribute('value', '"+ModuleName+"')",RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver), "Please type name for new group TextBox under 'Enter New Group Name' Popup On Security Management System Page ", ModuleName, Intlogval);

				//RMA_Input_Utility.RMA_JavaScriptSetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver), "Please type name for new group TextBox under 'Enter New Group Name' Popup On Security Management System Page ", ModuleName, Intlogval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver),"Please type name for new group TextBox under 'Enter New Group Name' Popup On Security Management System Page ",Intlogval);
				//RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Txt_GroupName(driver), "Please type name for new group TextBox under 'Enter New Group Name' Popup On Security Management System Page ", ModuleName, Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_ModueGroupOK(driver), "Ok Button under 'Enter New Group Name' Popup On Security Management System Page ", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ModuleGroupSave, false,"Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, ModuleName), ModuleName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus, "RISKMASTER CheckBox", "Security Management System Page", Intlogval);
				//RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus, "SORTMASTER CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Configuration Manager"), UtilitiesStatus, "Configuration Manager CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus, "Utilities CheckBox", "Security Management System Page", Intlogval);
				//RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus, "Standard Reports CheckBox", "Security Management System Page", Intlogval);
				//RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus, "Executive Summary CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Button On Security Management System CheckBox", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				//globalWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.ModuleGroupGrant+"')]")));
				//globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.ModuleGroupGrant+"')]")));

				//RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ModuleGroupGrant, false,"Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus+"ed", "RISKMASTER CheckBox On Security Management System Page", Intlogval);
				//RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus+"ed", "SORTMASTER CheckBox On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus+"ed", "Utilities CheckBox On Security Management System Page", Intlogval);
				//RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus+"ed", "Standard Reports CheckBox On Security Management System Page", Intlogval);
				//RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus+"ed", "Executive Summary CheckBox On Security Management System Page", Intlogval);
				if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A New Module Is Added Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added Module On SMS Page", "AddModule")));
				}
				else
				{
					logger.log(LogStatus.PASS, "A New Module Is Added Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
					logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added Module On SMS Page", "AddModule")));
				}
				break;

			case "Rename":
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_Rename(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_Rename(driver),"Rename Module Group Image On Security Management System Page",Intlogval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleRename_Txt_GroupName(driver), "Enter new group name TextBox under 'Rename Module Group' Popup On  Security Management System Page ", ModuleName, Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleRename_Btn_Ok(driver), "Ok Button under 'Rename Module Group' Popup On  Security Management System Page ", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, ModuleName), ModuleName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus, "RISKMASTER CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus, "SORTMASTER CheckBox", "Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus, "Utilities CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus, "Standard Reports CheckBox", "Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus, "Executive Summary CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Button On Security Management System CheckBox", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ModuleGroupGrant, false,"Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "RISKMASTER"), RiskMasterStatus+"ed", "RISKMASTER CheckBox On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "SORTMASTER"), SortMasterStatus+"ed", "SORTMASTER CheckBox On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Utilities"), UtilitiesStatus+"ed", "Utilities CheckBox On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Standard Reports"), StandardReportStatus+"ed", "Standard Reports CheckBox On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Executive Summary"), ExecutiveSummaryStatus+"ed", "Executive Summary CheckBox On Security Management System Page", Intlogval);
				if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A Module Is  Renamed Successfully With Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rename Module On SMS Page", "RenameModule")));
				}
				else
				{
					logger.log(LogStatus.PASS, "A Module Is Renamed Successfully With Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
					logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rename Module On SMS Page", "RenameModule")));
				}
				break;

			case "Delete":
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",logval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver,"Module Security Groups")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				//System.out.println(ModuleName);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, ModuleName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, ModuleName),ModuleName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver)));
				Thread.sleep(2000);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver),"Delete Selected Item Image On Security Management System Page",Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button On Delete Popup Of The Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"), "Module Security Groups Expand Image From Left Navigation Menu Of Security Management System Page", Intlogval);
				Thread.sleep(2000);
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver,  ModuleName),  ModuleName + " Link From Left Menu Of Security Management System Page", Intlogval);
				Thread.sleep(2000);
				if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A Module Is Deleted Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted Module On SMS Page", "DeleteModule")));
				}
				else
				{
					logger.log(LogStatus.PASS, "A Module Is Deleted Successfully Having Module Name:" + " " + color.RMA_ChangeColor_Utility(ModuleName,3));
					logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted Module On SMS Page", "DeleteModule")));
				}
				break;
			default:
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By Module Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By Module Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,Case+" Module On SMS Fail", Case+" Module On SMS Is Not Done")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,Case+" Module On SMS Fail", Case+" Module On SMS Is Not Done")));
			}

			if (!(RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver)== null))
			{
				ErrorTxtMessage = RMA_Selenium_POM_Home.RMAApp_GenericToast_ErrorMsg(driver).getText();
				if (Intlogval ==0)
				{
					parentlogger.log(LogStatus.FAIL, "UnExpected Error Toast Message With Following Text Is Displayed" + " "+ color.RMA_ChangeColor_Utility(ErrorTxtMessage,1));
				}
				else
				{
					logger.log(LogStatus.FAIL, "UnExpected Error Toast Message With Following Text Is Displayed" + " " +color.RMA_ChangeColor_Utility(ErrorTxtMessage,1));
				}
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ErrorToastMsgClose(driver), "Close Button On Error Toast Message", Intlogval);// Save Button Is Clicked
			}
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle(StrSMSWindowTitle);
			driver.switchTo().window(StrRMAWindowHandle);
			throw (e);
		}
	}	
	//====================================================================================================
	//FunctionName 		:RMA_SMSUserAddEditDelete_Utility
	//Description  		: Enables the User To Add/Edit/Delete A User From SMS
	//Input Parameter 	: UserFirstName,  UserLastName,  LinkName: Which link needs to click, UserManager: Passed Manager Name Value Either by Index Or By String value,UserEmail, AccessSMSStatus: check/uncheck, AccessUSPStatus:check/uncheck, DSNName,
	//			  			 	 		 AdditionalParameter: Few Parameter which May Compulsory In Future, Intlogval 	 
	//									Pass "NA" or 00 for optional parameter	
	//Revision			: 0.0 - RenuVerma-07-04-2018                       
	//====================================================================================================
	//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present
	public static void RMA_SMSUserAddEditDelete_Utility(String Case,String UserFirstName, String UserLastName,String LinkName, Object UserManager,String UserEmail, String UserCountry,String AccessSMSStatus,String AccessUSPStatus,String DSNName,String ModuleName, String ChangeModGroupAsso, boolean AdditionalParameter,String Upwd, int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO,"Enables the User To "+Case+" User "+UserFirstName+" On SMS Page ");
			}
			else
			{	
				logger = reports.startTest("<span id='SMSUserAddEditDelete'>"+Case+" User "+UserFirstName+" On SMS</span>", "Enables the User To "+Case+" User "+UserFirstName+" On SMS Page ");
			}

			switch (Case){
			case "Add":                      
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewUser(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewUser(driver), "Add New User Button On _Security Management System_ Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_StaticWait(4, Intlogval, "Wait Is Added For First Name Box On Security Management System_ Page");
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_FirstName(driver), "First Name TextBox On  _Security Management System_ Page ", UserFirstName, Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_LastName(driver)));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_LastName(driver), "Last Name TextBox On  _Security Management System_ Page ", UserLastName, Intlogval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Country(driver), "Country TextBox On  _Security Management System_ Page ", UserCountry, Intlogval);
				if(UserManager.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), (int)UserManager, "Manager List", "Security Management System_ Page", Intlogval);
				}
				if(UserManager.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), UserManager.toString(), "Manager List", "Security Management System_ Page", Intlogval);
				}
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Email(driver), "Email TextBox On  _Security Management System_ Page ", UserEmail, Intlogval);               
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessSMS(driver), AccessSMSStatus, "Permit to access Security Management System CheckBox", "Security Management System_ Page", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessUSP(driver), AccessUSPStatus, "Permit to access User Privileges Setup CheckBox", "Security Management System_ Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Allowed/Assigned Data-Sources to Login"), "Allowed/Assigned Data-Sources to Login Tab On _Security Management System_ Page", Intlogval);
				Thread.sleep(2000);
				RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Rdo_DSNSelection(driver, DSNName), DSNName+" Radio Option Under Allowed/Assigned Data-Sources to Login Tab On _Security Management System_ Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On _Security Management System_ Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

				//New Enhancement Started Here
				Thread.sleep(2000);
				if(!RMA_Selenium_POM_SMS.RMAApp_SMSChangePassword_Txt_NewPassword(driver).equals(null)){// if password policy enabled
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSChangePassword_Txt_NewPassword(driver), "New Password TextBox On Change Password Popup On _Security Management System_ Page ", Upwd, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSChangePassword_Txt_ConPassword(driver), "Confirm Password TextBox On Change Password Popup On  _Security Management System_ Page ", Upwd, Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On _Security Management System_ Page", Intlogval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				}
				//New Enhancement Ended Here                         

				//RMA_Verification_Utility.RMA_VerifyUXMessage("User '"+UserFirstName +" "+ UserLastName+"' Saved Successfully.", false,"Security Management System_ Page", Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver)));
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver), ModuleName, "Assign User To Module Group WebList", "Assign User To Module Group Warning Popup On Security Management System_ Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Btn_GenericOK(driver), "Ok Image Of The Assign User To Module Group Warning Popup On _Security Management System_ Page", Intlogval);

				/*if(ChangeModGroupAsso.equalsIgnoreCase("Yes")){
                       RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On _Security Management System_ Page", Intlogval);
                       }*/          

				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit Image From User Access Permissions On Security Management System_ Page",Intlogval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_LoginName(driver), "Login Name TextBox On  _Security Management System_ Page ", UserFirstName, Intlogval);
				//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_Password(driver), "Password TextBox On  _Security Management System_ Page ", UserFirstName, Intlogval);
				Thread.sleep(2000);

				///Changes done for utiliy started
				try {
					if(!UtilityMenu.RMAUtilityurl.equals(null)){
						try {
							if(!RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver).equals(null)){
								RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On _Security Management System_ Page", Intlogval);
							}
						} catch (Exception e) {
							//System.out.println("No Message");
						}}
				} catch (Exception e) {

				}
				///Changes done for utiliy Ended
				Thread.sleep(3000);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On _Security Management System_ Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Msg_ToastMessage(driver,RMA_Selenium_POM_VerificationMessage.UserPermission), "User Access permission Saved Successfully  Message On _Security Management System_ Page", Intlogval);
				//globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.UserPermission+"')]")));
				//RMA_Verification_Utility.RMA_VerifyUXMessage("User '"+UserFirstName +" "+ UserLastName+"' Saved Successfully.", false,"Security Management System_ Page", Intlogval);
				if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A New User Is Added Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added User On SMS Page", "AddUser")));
				}
				else
				{
					logger.log(LogStatus.PASS, "A New User Is Added Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
					logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Added User On SMS Page", "AddUser")));
				}
				break;

			case "Edit":
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//Security Management System Page Is Refreshed To Restore The Default State

				//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				Thread.sleep(3000);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver),"Edit User Image From User Setting On Security Management System Page",Intlogval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_FirstName(driver), "First Name TextBox On  Security Management System Page ", UserFirstName, Intlogval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_LastName(driver), "Last Name TextBox On  Security Management System Page ", UserLastName, Intlogval);
				if(UserManager.getClass().getSimpleName().equalsIgnoreCase("Integer")){// If Manager List Selected Based On The Index Of The Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), (int)UserManager, "Manager List", "Security Management System Page", Intlogval);
				}
				if(UserManager.getClass().getSimpleName().equalsIgnoreCase("String")){// If Manager List Selected Based On String Value
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), UserManager.toString(), "Manager List", "Security Management System Page", Intlogval);
				}
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessSMS(driver), AccessSMSStatus, "Permit to access Security Management System CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Chk_AccessUSP(driver), AccessUSPStatus, "Permit to access User Privileges Setup CheckBox", "Security Management System Page", Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

				//Updated on 05042017 after build deployment Started
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Collapsed Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, DSNName),"Expand Image Of "+DSNName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"),"Expand Image Of Permission To Login Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);	
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);	
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUserPerm(driver),"Edit Image From User Access Permissions On Security Management System Page",Intlogval);
				//Updated on 05042017 after build deployment Ended

				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Lst_AgsndUserToModuleGroup(driver)));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_LoginName(driver), "Login Name TextBox On  Security Management System Page ", UserLastName, Intlogval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUserAccessPer_Txt_Password(driver), "Password TextBox On  Security Management System Page ", UserLastName, Intlogval);
				if(ChangeModGroupAsso.equalsIgnoreCase("Yes")){
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", Intlogval);
				}
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Msg_ToastMessage(driver,RMA_Selenium_POM_VerificationMessage.UserPermission), "User Access permission Saved Successfully Message On Security Management System Page", Intlogval);
				globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.UserPermission+"')]")));

				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName), UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				if(Intlogval == 0)	
				{
					parentlogger.log(LogStatus.PASS, "A User Is  Edited Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edited User On SMS Page", "EditUser")));
				}
				else
				{
					logger.log(LogStatus.PASS, "A User Is Edited Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
					logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edited User On SMS Page", "EditUser")));
				}
				break;

			case "Delete":
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				//Security Management System Page Is Refreshed To Restore The Default State

				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				// Users Link Is Expanded
				Thread.sleep(2000);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, LinkName),LinkName+" Link From Left Navigation Menu Bar On Security Management System Page",Intlogval);
				//String ToolTipMessageOnEdit=RMA_GenericUsages_Utility.RMA_GetToolTip_Info(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), Intlogval);
				//RMA_Verification_Utility.RMA_TextCompare("Delete Selected Item", ToolTipMessageOnEdit, "Tool Tip Message On Delete Button ", Intlogval);
				RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Selected Item", "Tool Tip Message On Delete Button", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver),"Delete Selected Item Image On Security Management System Page",Intlogval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver)));
				RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Are you sure you want to delete the selected item ?"), "Delete Message On Delete Model Popup", Intlogval);
				RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver) , "Delete Button On Delete Model Popup", Intlogval);
				RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver), "Cancel Button On Delete Model Popup", Intlogval);
				Thread.sleep(2000);
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button On Delete Popup Of The Security Management System Page", Intlogval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
				Thread.sleep(2000);
				//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Msg_ToastMessage(driver,RMA_Selenium_POM_VerificationMessage.UserDelete), "User Delete Successfully  Message On Security Management System Page", Intlogval);
				//Thread.sleep(2000);
				//globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.UserDelete+"')]")));

				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users")));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"), "Users Expand Image From Left Navigation Menu Of Security Management System Page", Intlogval);
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver,  LinkName),  LinkName + " Link From Left Menu Of Security Management System Page", Intlogval);

				if(Intlogval == 0)
				{
					parentlogger.log(LogStatus.PASS, "A User Is Deleted Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
					parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted User On SMS Page", "DeleteUser")));
				}
				else
				{
					logger.log(LogStatus.PASS, "A User Is Deleted Successfully Having User's First Name:" + " " + color.RMA_ChangeColor_Utility(UserFirstName,3));
					logger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Deleted User On SMS Page", "DeleteUser")));
				}
				break;
			default:
				if (Intlogval == 0)
				{
					parentlogger.log(LogStatus.ERROR, "Case Variable" + " "+Case+ " " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
				else
				{
					logger.log(LogStatus.ERROR, "Case Variable" + " "+ Case+" " + "Provided By User Is Not Having A Defined Case Code Logic And Hence Is An Invalid Input");	
				}
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,Case+" User On SMS Fail", Case+" User On SMS Is Not Done")));
			}else{	
				logger.log(LogStatus.FAIL, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver,Case+" User On SMS Fail", Case+" User On SMS Is Not Done")));
			}

			throw (e);
		}
	}	

}


