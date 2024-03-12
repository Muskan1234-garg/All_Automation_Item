package rmaseleniumutilties_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;

//Default Package Import Completed
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_Managers;
import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PolicyDownlod;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_TimeExpense;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Utilities_PolicySystemSetup;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
//RMA Package Import Completed

public class RMA_Utilities_Functionality_Utility extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static RMA_GenericUsages_Utility color = new RMA_GenericUsages_Utility();
	public static String ErrorTxtMessage;

	///====================================================================================================
	//FunctionName 		: RMA_PolicySystemSetup_Utility
	//Description  		: Enables the User Set The Policy System Setup
	//Input Parameter 	: PolicySystemType,  PolicySysName,MappingTablePrefix, CFWURL, CFWUserName,CFWUserName , CFWUserPassword, Version, ODBCDriver, ServerName,  DataBaseName, DB_UserName,  DB_Password, Intlogval
	//Revision			: 0.0 - RenuVerma-02-21-2019   
	//====================================================================================================
	public static void RMA_PolicySystemSetup_Utility(String PolicySystemType,String PolicySysName,String MappingTablePrefix,String CFWURL,String UseRMAUserfor_CFW,String CFWUserName ,String CFWUserPassword,String Version,String ODBCDriver,String ServerName, String DataBaseName,String DB_UserName, String DB_Password,int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO,"Enables the User To Setup The Policy ");

			}
			else
			{	
				logger = reports.startTest("<span id='PolicySystemSetup'> Add Policy Setup", "Enables the User To Setup The Policy");
			}
			StrRMAUtilitiesUXWindowHandle=driver.getWindowHandle();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-PolicySystemSetup", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PolicySystemSetupFrame);
			System.out.println(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID());
			Thread.sleep(5000);
			globalWait.until(ExpectedConditions.presenceOfElementLocated(By.id("PolicySystemGrid_gvData_ctl00")));
			Thread.sleep(5000);
			try {
				RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Tbl_PolicySetupTable(driver), MappingTablePrefix, 3, MappingTablePrefix, "Policy System Table Value Verification", Intlogval);
				Assert.fail("Policy System Setup Is already Existed with The Given Mapping Table Prefix");
			} catch (Exception e) {

				System.out.println("Failed to match hence continue testing");
				if (Intlogval ==0)
				{
					parentlogger.log(LogStatus.PASS, "Policy System Setup Is Started with The Given Mapping Table Prefix: "+color.RMA_ChangeColor_Utility(MappingTablePrefix,2));
				}
				else
				{
					logger.log(LogStatus.PASS, "Policy System Setup Is Started with The Given Mapping Table Prefix: "+color.RMA_ChangeColor_Utility(MappingTablePrefix,2));
				}
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_AddNew(driver)));
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_AddNew(driver), "Add New Button On Policy Setup Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Policy System Web Settings");
				String PolicySetupBrowser=driver.getWindowHandle();
				switch(PolicySystemType){
				case "POINT":
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySystemType(driver), "Policy System Type TextBox On Policy System Web Settings Page", PolicySystemType, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySysName(driver), "Policy System Name TextBox On Policy System Web Settings Page", PolicySysName, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_MappingTablePrefix(driver), "Mapping Table Prefix TextBox On Policy System Web Settings Page", MappingTablePrefix, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_CFWURL(driver), "CFW URL TextBox On Policy System Web Settings Page", CFWURL, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_CFWUserName(driver), "CFW User Name TextBox On Policy System Web Settings Page", CFWUserName, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_CFWUserPassword(driver), "CFW User Password TextBox On Policy System Web Settings Page", CFWUserPassword, Intlogval);
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Chk_UseRMAForCFW(driver), UseRMAUserfor_CFW, "Use RMA User for CFW CheckBox", "Policy System Web Settings Page", Intlogval);
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Lst_Version(driver), Version, "Version WebList","Policy System Web Settings Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Rdb_ClientFileFlag(driver, "ON"), "Client File Setting Radio Button On Policy System Web Settings Page", Intlogval);
					
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_AddDataDSN(driver), "Add Data DSN Button On Policy System Web Settings Page", Intlogval);
					// Page opened where Select the Driver for the Database that user want to connect to
					Thread.sleep(2000);
					RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAUtilitiesUXWindowHandle, PolicySetupBrowser, "NA", "NA", "NA", "Data Base Window", Intlogval);
					globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Rdb_DBDriver(driver, ODBCDriver)));
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Rdb_DBDriver(driver, "SQL Server"), "CheckBox Of The Driver for the Database on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Next(driver), "Next Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_ServerName(driver)));
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_ServerName(driver), "Server Name TextBox on Add New Data Source Popup Of The Policy System Web Settings Page", ServerName , Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_DatabaseName(driver), "Database Name TextBox on Add New Data Source Popup Of The Policy System Web Settings Page", DataBaseName , Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_LoginUserName(driver), "Login User Name TextBox on Add New Data Source Popup Of The Policy System Web Settings Page", DB_UserName , Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_LoginPassword(driver), "Login Password TextBox on Add New Data Source Popup Of The Policy System Web Settings Page",DB_Password , Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Next(driver), "Next Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					Thread.sleep(5000);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Next(driver), "Next Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					Thread.sleep(5000);
					RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Database Connection Wizard has successfully connected to the specified database.The Database appears to be a valid Policy system database."), "Database Connection Wizard has successfully connected to the specified database.The Database appears to be a valid Policy system database Message is appearing on Connection Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Finish(driver), "Finish Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					Thread.sleep(4000);
					RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
					
					driver.switchTo().window(PolicySetupBrowser);
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Chk_CopyDataDSN(driver), "check", "Copy Data DSN to Client DSN Check Box", "Policy System Web Settings Page", Intlogval);
					RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Chk_DefaultPolicy(driver), "check", "Default Policy Check Box", "Policy System Web Settings Page", Intlogval);					
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_Ok(driver), "Ok Button On Policy System Web Settings Page", Intlogval);
					break;
				case "INTEGRAL":
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySystemType(driver), "Policy System Type TextBox On Policy System Web Settings Page", PolicySystemType, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySysName(driver), "Policy System Name TextBox On Policy System Web Settings Page", PolicySysName, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_MappingTablePrefix(driver), "Mapping Table Prefix TextBox On Policy System Web Settings Page", MappingTablePrefix, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_WSSearchURL(driver), "WS Search URL TextBox On Policy System Web Settings Page", CFWURL, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_WSInquiryURL(driver), "WS Inquiry URL TextBox On Policy System Web Settings Page", CFWUserName, Intlogval);
					RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Lst_Version(driver), Version, "Version WebList","Policy System Web Settings Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_Ok(driver), "Ok Button On Policy System Web Settings Page", Intlogval);
					break;
				case "STAGING":
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySystemType(driver), "Policy System Type TextBox On Policy System Web Settings Page", PolicySystemType, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySysName(driver), "Policy System Name TextBox On Policy System Web Settings Page", PolicySysName, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_MappingTablePrefix(driver), "Mapping Table Prefix TextBox On Policy System Web Settings Page", MappingTablePrefix, Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_AddDataDSN(driver), "Add Data DSN Button On Policy System Web Settings Page", Intlogval);
					// Page opened where Select the Driver for the Database that user want to connect to
					Thread.sleep(2000);
					RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAUtilitiesUXWindowHandle, PolicySetupBrowser, "NA", "NA", "NA", "Data Base Window", Intlogval);
					globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Rdb_DBDriver(driver, ODBCDriver)));
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Rdb_DBDriver(driver, "SQL Server"), "CheckBox Of The Driver for the Database on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Next(driver), "Next Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_ServerName(driver)));

					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_ServerName(driver), "Server Name TextBox on Add New Data Source Popup Of The Policy System Web Settings Page", ServerName , Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_DatabaseName(driver), "Database Name TextBox on Add New Data Source Popup Of The Policy System Web Settings Page", DataBaseName , Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_LoginUserName(driver), "Login User Name TextBox on Add New Data Source Popup Of The Policy System Web Settings Page", DB_UserName , Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Txt_LoginPassword(driver), "Login Password TextBox on Add New Data Source Popup Of The Policy System Web Settings Page",DB_Password , Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Next(driver), "Next Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					Thread.sleep(5000);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Next(driver), "Next Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					Thread.sleep(5000);
					RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Database Connection Wizard has successfully connected to the specified database.The Database appears to be a valid Policy system database."), "Database Connection Wizard has successfully connected to the specified database.The Database appears to be a valid Policy system database Message is appearing on Connection Page", Intlogval);
					RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Img_Finish(driver), "Finish Button on Add New Data Source Popup Of The Policy System Web Settings Page", Intlogval);
					Thread.sleep(4000);
					RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
					driver.switchTo().window(PolicySetupBrowser);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_Ok(driver), "Ok Button On Policy System Web Settings Page", Intlogval);
					break;
				case "RMA INTERNAL":
					RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySystemType(driver), "Policy System Type TextBox On Policy System Web Settings Page", PolicySystemType, Intlogval);
					RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Txt_PolicySysName(driver), "Policy System Name TextBox On Policy System Web Settings Page", PolicySysName, Intlogval);
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolSysSetup_Btn_Ok(driver), "Ok Button On Policy System Web Settings Page", Intlogval);
					break;
				}
				driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PolicySystemSetupFrame);
				Thread.sleep(6000);
				RMA_Verification_Utility.RMA_VerifyRowDataForTwoColTablePartially(RMA_Selenium_POM_Utilities_PolicySystemSetup.RMAApp_PolAddNewDS_Tbl_PolicySetupTable(driver), PolicySystemType,MappingTablePrefix, PolicySysName,2,"Policy System Setup Table", logval);// Verify Policy LOB is available on  Financial Key Setup Table
			}
		} catch (Exception|Error e) {
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
			throw (e);
		}

	}
	//=============================================================================================================================================================================================
	//FunctionName 		: RMA_FinancialKeySetup_Utility
	//Description  		: Enables the User To Establish New Financial Key Set Up
	//Input Parameter 	: SelectLOB: List Value of Select Line Of Business, SelectPolicyLOB_ClaimType: List Value of Select Policy LOB, PolicyDetailOnTable: Policy Detail On Table, PolicyLOB logval 	 
	//Revision			: 0.0 - RenuVerma-01-13-2019    
	// ==================================================================================================================================================================================================
	public static void RMA_FinancialKeySetup_Utility(String SelectLOB, String SelectPolicyLOB_ClaimType, String PolicyDetailOnTable,String PolicyLOB,String Claimant, String ReserveType, String Reserve_SubType, String Policy_Unit_Coverage, String Loss_Disablity_Type,int logval) throws Exception, Error
	{
		String PrimaryWindowHandle;

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables the User To Establish New Financial Key Set Up ");
			}
			else
			{	
				logger = reports.startTest("<span id='FinancialKey'>Financial Key Setup</span>", "Enables the User To Establish New Financial Key Set Up");
			}
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-FinancialkeySetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.FinancialKeySetupFrame);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "FinancialKeySetup Window To Be Loaded");
			boolean ChkPolicyLOB=false;
			try {
				JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;	
				ChkPolicyLOB=(boolean)(jsExecutor.executeScript("return arguments[0].checked;", RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Rdb_FilterFinancial(driver, "Policy LOB"))) ;
			} catch (Exception e) {
			}
			PrimaryWindowHandle=driver.getWindowHandle();

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Img_New(driver),"New Image on Financial Key Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			if(ChkPolicyLOB==true){
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelLOB(driver), SelectLOB, "Select Line of Business List ", "Financial Key Setup Page", logval);
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelPolicyLOB(driver), SelectPolicyLOB_ClaimType, "Select Policy LOB List ", "Financial Key Setup Page", logval);
			}
			else{
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelLOB(driver), SelectLOB, "Select Line of Business List ", "Financial Key Setup Page", logval);
				RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelClaimType(driver), SelectPolicyLOB_ClaimType, "Select Policy LOB List ", "Financial Key Setup Page", logval);
			}
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_ReserveType(driver), ReserveType+"ed", "Reserve Type Checkbox On Financial Key Setup Page", logval);
			Thread.sleep(4000);
			if( SelectLOB.contains("GC")||SelectLOB.contains("General Claim")){				
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_Claimant(driver), Claimant, "Claimant Checkbox", "Financial Key Setup Page", logval);
				RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
			}
			else if( SelectLOB.contains("WC")){			
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_Claimant(driver), Claimant, "Claimant Checkbox On Financial Key Setup Page", logval);
			}

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_ResSubType(driver),Reserve_SubType, "Reserve-Sub Type Checkbox", "Financial Key Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_PolicyUnitCoverage(driver), Policy_Unit_Coverage, "Policy/Unit/Coverage Checkbox", "Financial Key Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_LossDisablityType(driver),Loss_Disablity_Type, "Loss/Disablity Type Checkbox", "Financial Key Setup Page", logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Financial Key Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.FinancialKeySetupFrame);
			Thread.sleep(10000);
			RMA_Verification_Utility.RMA_VerifyRowDataForTwoColTablePartially(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Tbl_FinancialKeyGrid(driver), PolicyDetailOnTable,"False", PolicyLOB,2,"Financial Key Setup Table", logval);// Verify Policy LOB is available on  Financial Key Setup Table
			if(logval == 0)
			{
				parentlogger.log(LogStatus.PASS, "Done Financial Key Setup Successfully");
			}
			else
			{
				logger.log(LogStatus.PASS, "Done Financial Key Setup Successfully");
			}

		} catch (Exception|Error e) {
			throw (e);
		}
	}
	///====================================================================================================
	//FunctionName 		:RMA_PolicyInterfaceCodeMapping_Utility
	//Description  		: Enables the User To Add Policy Interface Code Mapping
	//Input Parameter 	: PolicySystemName,  CodeType,RiskMasterCode,PolSysCode,Intlogval
	//Revision			: 0.0 - RenuVerma-02-11-2019   
	//====================================================================================================
	//Note: User Must Pass "NA" or 00 For Optional Parameter If Valid Value Is Not Present 
	public static void RMA_PolicyInterfaceCodeMapping_Utility(String PolicySystemName,String CodeType,String RiskMasterDesc,String RiskMastercode,String PolSysDesc,String PolSyscode,int Intlogval) throws Exception, Error
	{
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO,"Enables the User To Setup The Policy ");

			}
			else
			{	
				logger = reports.startTest("<span id='RMA_PolicyInterfaceCodeMapping_Utility'> Add Policy Interface Code Mapping Setup For "+ CodeType, "Enables the Policy Interface Code Mapping To Setup The Policy For "+CodeType);
			}
			globalWait.until(ExpectedConditions.presenceOfElementLocated(By.id("lstPolicySystem")));
			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_SelectPolicySystem(driver), PolicySystemName, "Select Policy System Weblist", "Policy Interface Code Mapping Page", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_SelectCodeType(driver), CodeType, "Select Code Type Weblist", "Policy Interface Code Mapping Page", Intlogval);
			//RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_RiskmasterCodes(driver), RiskMasterDesc+" -  "+RiskMastercode, "Riskmaster Codes Weblist", "Policy Interface Code Mapping Page", Intlogval);

			if(CodeType.equalsIgnoreCase("STATES")){
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_RiskmasterCodes(driver), RiskMasterDesc+" ("+RiskMastercode+")"+" -  "+RiskMastercode, "Riskmaster Codes Weblist", "Policy Interface Code Mapping Page", Intlogval);
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_PolSysInterfaceCodes(driver), PolSysDesc+" ("+PolSyscode+")"+" -  "+PolSyscode, "Policy System Interface Codes Weblist", "Policy Interface Code Mapping Page", Intlogval);
			}
			else{
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_RiskmasterCodes(driver), RiskMasterDesc+" -  "+RiskMastercode, "Riskmaster Codes Weblist", "Policy Interface Code Mapping Page", Intlogval);
				RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Lst_PolSysInterfaceCodes(driver), PolSysDesc+" -  "+PolSyscode, "Policy System Interface Codes Weblist", "Policy Interface Code Mapping Page", Intlogval);
			}			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Btn_AddSPolicybtn(driver), "Add Policy Code On Policy Interface Code Mapping Page", Intlogval);
			Thread.sleep(3000);
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping.RMAApp_PolInterfaceCode_Tbl_PolicyCodeMappingGrid(driver), RiskMastercode+" - "+RiskMasterDesc, 2, PolSyscode+" - "+PolSysDesc, "Policy Interface Code Mapping Table", Intlogval);

		} catch (Exception|Error e) {

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
			throw (e);
		}
	}
	//====================================================================================================
	//FunctionName 		: RMA_LossCodeMapping_Utility
	//Description  		: Enables The User Do Loss Code Mapping For given Coverage And LOB
	//Input Parameter 	: LstPolicySystemNames, PolicyLOB, Coverage, LossCode
	//Revision			: 0.0 - RenuVerma-02-25-2019                   
	// ====================================================================================================

	public static void RMA_LossCodeMapping_Utility(String LstPolicySystemNames, String PolicyLOB, String Coverage,String PolicyLossCode,String RMALossCode,int logval) throws Exception, Error
	{

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO,"User can do Loss Code Mapping ");
			}
			else
			{	
				logger = reports.startTest("<span id='RMA_LossCodeMapping_Utility'> Loss Code Mapping </span>", "User can do Loss Code Mapping ");
			}
			Thread.sleep(5000);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolicySystemNames(driver), LstPolicySystemNames, "Policy System Name List", "Loss Code Mapping Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolicyLOB(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolicyLOB(driver),PolicyLOB, "Policy LOB List", "Loss Code Mapping Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_CoverageType(driver)));
			RMA_Input_Utility.RMA_ElementWebListPartiallySelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_CoverageType(driver), Coverage, "Coverage Type List", "Loss Code Mapping Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolSystemLossCodes(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_PolSystemLossCodes(driver), PolicyLossCode, "RMA Policy Of Code List", "Loss Code Mapping Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_RMALossCode(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Lst_RMALossCode(driver), RMALossCode, "RMA Loss Of Code List", "Loss Code Mapping Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Add Mapping")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Add Mapping"), "'Add Mapping' Button On Loss Code Mapping Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Add Mapping")));
			Thread.sleep(1000);
			RMA_Verification_Utility.RMA_VerifyRowDataForTwoColTablePartially(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersLossCode_Tbl_LossCode(driver),LstPolicySystemNames,  PolicyLOB, Coverage, 4, "Loss Code Mapping Table", logval);

			if(logval == 0)
			{
				parentlogger.log(LogStatus.PASS, "Done Loss Code Mapping Successfully With Loss Code:" + " " + color.RMA_ChangeColor_Utility(RMALossCode,3));
			}
			else
			{
				logger.log(LogStatus.PASS, "Done Loss Code Mapping Successfully With Loss Code:" + " " + color.RMA_ChangeColor_Utility(RMALossCode,3));
			}


		} catch (Exception|Error e) {
			throw new Exception("Loss Code Mapping Is Not Done Due To Error: "+e.getMessage());
		}
	}
	//=================================================================================================================================
	//FunctionName 		: RMA_CodeRelationshipAddition_Utility
	//Description  		: Enables The User To Do Code Relationship
	//Input Parameter 	: LstRelationshipType, LstRelationshipSubType, ClaimType,LstAvailable
	//Revision			: 0.0 - RenuVerma-02-28-2019     
	// ==================================================================================================================================
	public static void RMA_CodeRelationshipAddition_Utility(String LstRelationshipType, String LstRelationshipSubType, String ClaimType,int logval) throws Exception, Error
	{

		try {

			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User can do code Relationship ");
			}
			else
			{	
				logger = reports.startTest("<span id='CodeRelationship'> Code Relationship  </span>", "User can do code Relationship ");
			}

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_RelationshipType(driver), LstRelationshipType, "Relationship Type List", "Code Relationships Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_RelationshipSubType(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_RelationshipSubType(driver),LstRelationshipSubType, "Relationship SubType List", "Code Relationships Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_ClaimType(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_ClaimType(driver), ClaimType, "Claim Type List", "Code Relationships Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Available(driver)));
			//RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Available(driver), LstAvailable, "Available List", "Code Relationships Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "btnAddSelected"), "'>' Button On Code Relationships Page", logval);				
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "btnAddAll"), "'>>' Button On Code Relationships Page", logval);
			//	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Related(driver)));
			//	RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersCodeRel_Lst_Related(driver), LstAvailable, "Related List", logval);
			//	RMA_Functionality_Utility.RMA_GenericSave_Utility("CodeRelationships", false, "NA", "Code Relationships Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Code Relationships Page", logval);// Save Button Is Clicked

			if(logval == 0)
			{
				parentlogger.log(LogStatus.PASS, "Code Relationship Done Successfully");
			}
			else
			{
				logger.log(LogStatus.PASS, "Code Relationship Done Successfully");
			}


		} catch (Exception|Error e) {
			if(logval == 0)
			{
				parentlogger.log(LogStatus.FAIL, "Code Relationship Is Not Done");
			}
			else
			{
				logger.log(LogStatus.FAIL, "Code Relationship Is Not Done");
			}

			throw new Exception ("Code Relationship Is Not Done"+e.getMessage());
		}
	}

	//========================================================================================================================================================================================================================================================================================
	//FunctionName 		: RMA_CarrierGCClaimCreationWithPointPolicy
	//Description  		: Enables The User To Create Carrier General Claim Successfully
	//Input Parameter 	: GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_ClaimStatus Of Type String,GenClaimCreation_Txt_Department GenClaimCreation_Txt_Department, PolicyLOB Of Type String ,PolicySystem Of Type String,PolicyLobLink Of Type String, Intlogval Of Type Integer
	//Revision			: 0.0 - NidhiJha-08-09-2017         
	//=========================================================================================================================================================================================================================================================================================
	public static String RMA_CarrierGCClaimCreationWithPointPolicy(String GenClaimCarrier_Txt_DateOfEvent,String GenClaimCarrier_Txt_DateOfClaim,String GenClaimCarrier_Txt_TimeOfClaim,String GenClaimCarrier_Txt_TimeOfEvent,String GenClaimCarrier_Txt_ClaimType,String GenClaimCarrier_Txt_ClaimStatus,String GenClaimCarrier_Txt_Department,String GenClaimCarrier_Txt_PolicyLOB ,String GenClaimCarrier_Lst_PolicySystem,String GenClaimCarrier_Lnk_PolicyLOB,String GenClaimCarrier_Txt_PolicyNumber, String GenClaimCarrier_Txt_PolicyUnitNumber,String MessageOnSaveVerification, int Intlogval)throws Exception, Error
	{
		try {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables The User To Create Carrier General Claim Successfully");
			}else{	
				logger = reports.startTest("<span id='CarrierGC'>Carrier General Claim Creation</span>","Enables The User To Create Carrier General Claim Successfully");
			}

			StrCarrierClaimNumber = null;
			//Global Variable Initialization Completed
			driver.switchTo().window(StrRMAUXWindowHandle);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-GeneralClaim", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc"); //A Switch To The Frame Containing General Claim Controls Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//General Claim Screen Is Opened

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On General Claim Creation Page", GenClaimCarrier_Txt_DateOfEvent, Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On General Claim Creation Page", GenClaimCarrier_Txt_DateOfClaim, Intlogval);	
			//Date Of Claim And Event Values Are Provided For The Carrier General Claim To Be Created

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On General Claim Creation Page",Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On General Claim Creation Page",GenClaimCarrier_Txt_TimeOfEvent,Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "Time OfEvent TextBox On General Claim Creation Page", GenClaimCarrier_Txt_TimeOfClaim,Intlogval);	
			//Time Of Claim And Event Values Are Provided For The Carrier General Claim To Be Created

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On General Claim Creation Page",Intlogval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(GenClaimCarrier_Txt_ClaimStatus, "Claim Status LookUp Window On General Claim Creation Page", Intlogval);
			//RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "Claim Status TextBox On General Claim Creation Page", GenClaimCarrier_Txt_ClaimStatus, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Value Is Provided To Claim Status Field Of General Claim Creation Screen");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//Value Is Entered In Claim Type and Claim Status Text Boxes

			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimType(driver), "Claim Type Look Up Image Button On General Claim Creation Page",Intlogval);
			//RMA_Navigation_Utility.RMA_WebPartialLinkSelect(GenClaimCarrier_Txt_ClaimType, "Claim Type LookUp Window On General Claim Creation Page", Intlogval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Claim Type Needs To Get Populated");

			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On General Claim Creation Page", Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver), "Claim Type TextBox On General Claim Creation Page", GenClaimCarrier_Txt_ClaimType, Intlogval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Claim Type Needs To Get Populated"); 
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//Claim Type And Claim Status Values Are Provided For The Carrier General Claim To Be Created


			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimInfo_Dept(driver), "Department TextBox On General Claim Creation Page", GenClaimCarrier_Txt_Department, Intlogval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Department Needs To Get Populated");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_PolicyLOB(driver), "Policy LOB TextBox On General Claim Page", GenClaimCarrier_Txt_PolicyLOB, Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy LOB Needs To Get Populated");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			//RMA_Navigation_Utility.RMA_ObjectClick(driver.findElement(By.id("btn_policyLOBCode")), "Policy lob lookup button", Intlogval);
			//RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCarrier_Txt_PolicyLOB, "APV link ", Intlogval);
			//code fix for policy lob  ends			
			//Policy LOB Button Is Clicked For The Carrier General Claim To Be Created		

			RMA_Navigation_Utility.RMA_ScrollIntoView(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Scroll to View Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Name Lookup Is Visible");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_PolicyNameLookup(driver), "Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Search Results Page For Policy Lob Is Loaded");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("externalapp");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver)));
			//RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Frame Is Getting Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), "Policy Name Lookup Image On General Claim Page ", Intlogval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Lst_PolicySystem(driver), GenClaimCarrier_Lst_PolicySystem, "Policy system Dropdown", "Policy Download Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As Policy Download Is Loaded");
			//Policy System Is Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Search.RMAApp_SearchCriteria_Btn_SubmitQuery(driver), "Search Image On Policy Download Page", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Grid Is Getting Loaded");

			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Policy Number"), "Policy Number Type Filter Text Box On Policy Download Screen", GenClaimCarrier_Txt_PolicyNumber,Intlogval);//Policy Number Is Entered In Policy Number Input Box On Policy NG Grid
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, Intlogval, "Wait Is Added As Policy Details Are Getting Loaded");
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCarrier_Lnk_PolicyLOB, "Policy Lob Link On Policy Download Page For Searched Policy", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Policy LOB");
			//Policy LOB Link Selected

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_Next(driver), "Next Image On Policy Download Popup", Intlogval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(Intlogval);

			if((RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tabs(driver,"Download Entities")) != null)
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Btn_DownloadEntitiesNextBtn(driver), "Next Button On Download Entities Tab On Policy Download Popup", Intlogval);
			if((RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Tabs(driver,"Download Drivers")) != null)
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Btn_DownloadDriversNextBtn(driver), "Next Button On Download Drivers Tab On Policy Download Popup", Intlogval);							

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_ChkBox_SelectUnit(driver, GenClaimCarrier_Txt_PolicyUnitNumber), "check", "Select Unit Check Box", "Unit Details Popup",Intlogval);   
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownLoad_Btn_Int_Cov_List(driver, GenClaimCarrier_Txt_PolicyUnitNumber), "Interest/Coverage List On Policy Download Popup", Intlogval); 

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PropertyModalDialog_Btn_Select(driver), "Save Button On Unit Details Popup", Intlogval);
			//All Coverages Corresponding To Unit Are Selected

			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Loaded After Selecting Record");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PolicyDownlod.RMAApp_PolicyDownload_Img_PolicyDownloadWC(driver), "Policy Download Image On Policy Download Page", Intlogval);
			//Policy Is Downloaded

			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, Intlogval, "Wait Is Added As General Claim Page Is Loaded");

			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Policy Download Page Needs To Get Closed And GC Claim Page Needs To Get Loaded");
			//RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", Intlogval);
			//Wait Is Added As Department Value Is Provided For The General Claim To Be Created
			if (MessageOnSaveVerification.equals("NA") )
			{
				RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", Intlogval);
			}else{
				RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", true, MessageOnSaveVerification, "General Claim Creation Page", Intlogval);
			}
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver)));
			StrCarrierClaimNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value");
			//Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Carrier General Claim", "Carrier General Claim Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful General Claim Policy Download", "Carrier General Claim Is Created Successfully")));
			}
		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier General Claim Creation Fail", "Carrier General Claim Is Not Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Carrier General Claim Creation Fail", "Carrier General Claim Is Not Created Successfully")));
			}
			throw (e);
		}

		return StrCarrierClaimNumber;
	}
	
	//=============================================================================================================================================================================================
	//FunctionName 		: RMA_EditFinancialKeySetup_Utility
	//Description  		: Enables the User To Edit The Established Financial Key Set Up
	//Input Parameter 	: SelectLOB: List Value of Select Line Of Business, SelectPolicyLOB_ClaimType: List Value of Select Policy LOB, PolicyDetailOnTable: Policy Detail On Table, PolicyLOB logval 	 
	//Revision			: 0.0 - NikitaThani-05-06-2019    
	// ==================================================================================================================================================================================================
	public static void RMA_EditFinancialKeySetup_Utility(String ClaimType, String PolicyDetailOnTable, String PolicyLOB,String Claimant,String ReserveType, String Reserve_SubType, String Policy_Unit_Coverage, String Loss_Disablity_Type, int Intlogval) throws Exception, Error
	{
		String PrimaryWindowHandle;
		String SelectLOB;
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables the User To Edit Established Financial Key Set Up");
			}
			else
			{	
				logger = reports.startTest("<span id='EditFinancialKey'>Edit Financial Key Setup</span>", "Enables the User To Edit Established Financial Key Set Up");
			}
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-FinancialkeySetup", Intlogval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.FinancialKeySetupFrame);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "FinancialKeySetup Window To Be Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Btn_FinancialKeyRadioButton(driver, ClaimType),"Radio Button On Financial Key Setup Page", Intlogval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Img_Edit(driver),"Edit Button On Financial Key Setup Page", Intlogval);	

			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3,StrRMAWindowHandle,StrRMAUtilitiesUXWindowHandle , "NA", "NA", "NA", "NA", Intlogval);
			Thread.sleep(3000);
			SelectLOB = RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Lst_SelLOB(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_ReserveType(driver), ReserveType+"ed", "Reserve Type Checkbox On Financial Key Setup Page", Intlogval);
			Thread.sleep(4000);

			if( SelectLOB.contains("GC")||SelectLOB.contains("General Claim")){				
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_Claimant(driver), Claimant, "Claimant Checkbox", "Financial Key Setup Page", Intlogval);
				RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
			}
			else if( SelectLOB.contains("WC")||SelectLOB.contains("Worker's Compensation")){			
				RMA_Verification_Utility.RMA_CheckedUncheckedStateVerification_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_Claimant(driver), Claimant, "Claimant Checkbox On Financial Key Setup Page", Intlogval);
			}

			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_ResSubType(driver),Reserve_SubType, "Reserve-Sub Type Checkbox", "Financial Key Setup Page", Intlogval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_PolicyUnitCoverage(driver), Policy_Unit_Coverage, "Policy/Unit/Coverage Checkbox", "Financial Key Setup Page", Intlogval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Chk_LossDisablityType(driver),Loss_Disablity_Type, "Loss/Disablity Type Checkbox", "Financial Key Setup Page", Intlogval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Financial Key Setup Page", Intlogval);
			RMA_GenericUsages_Utility.RMA_WaitForDriverToClose(driver);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.FinancialKeySetupFrame);
			Thread.sleep(10000);
			//RMA_Verification_Utility.RMA_VerifyRowDataForTwoColTablePartially(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Tbl_FinancialKeyGrid(driver), PolicyDetailOnTable,"False", PolicyLOB,2,"Financial Key Setup Table", Intlogval);// Verify Policy LOB is available on  Financial Key Setup Table

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Done Editing Of Financial Key Setup Successfully", "Done Editing Of Financial Key Setup Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Done Editing Of Financial Key Setup Successfully", "Done Editing Of Financial Key Setup Successfully")));
			}

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Editing Of Financial Key Setup Fail", "Editing Of Financial Key Setup Not Done Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Editing Of Financial Key Setup Fail", "Editing Of Financial Key Setup Not Done Successfully")));
			}
			throw (e);
		}
	}
	//=============================================================================================================================================================================================
	//FunctionName 		: RMA_TimeExpenseRateTableCreate_Utility
	//Description  		: Enables the User To Create A New Time And Expense Rate Table
	//Input Parameter 	: SelectLOB: List Value of Select Line Of Business, SelectPolicyLOB_ClaimType: List Value of Select Policy LOB, PolicyDetailOnTable: Policy Detail On Table, PolicyLOB logval 	 
	//Revision			: 0.0 - ShrutiShruti-07-17-2019    
	// ==================================================================================================================================================================================================
	public static String RMA_TimeExpenseRateTableCreate_Utility(String RateTable_Txt_Customer, String RateTable_Txt_EffectiveDate, String RateTable_Txt_ExpirationDate, String RateTable_Txt_TransType, String RateTable_Txt_Unit, int RateTable_Txt_Rate, int Intlogval) throws Exception, Error
	{
		String RateTableName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "RateTableName_");
		try {

			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, "Enables the User To Create New Rate Table Under Time And Expense Rate Table");
			}
			else
			{	
				logger = reports.startTest("<span id='CreateRateTable'>Create Time And Expense Rate Table</span>", "Enables the User To Create New Rate Table Under Time And Expense Rate Table");
			}
			String CurrentWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Time & Expense Rate Tables"), "Time & Expense Rate Tables Link On Utilities Screen", Intlogval);
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.TimeExpenseRateTableFrame);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, Intlogval, "Wait Is Added As Rate Table Screen Is Getting Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Btn_AddNew(driver), "Add New Button On Rate Table Creation Screen", Intlogval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait is Added As Table Creation Screen Is Getting Loaded");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Txt_RateTableName(driver), "Rate Table Name TextBox on Rate Table Creation Screen", RateTableName, Intlogval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Txt_Customer(driver), "Customer TextBox On Rate Table Creation Screen", RateTable_Txt_Customer, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Txt_EffectiveDate(driver), "Effective Date TextBox On Rate Table Creation Screen", RateTable_Txt_EffectiveDate, Intlogval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Txt_ExpirationDate(driver), "Expiration Date TextBxo On Rate Table Creation Screen", RateTable_Txt_ExpirationDate, Intlogval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Btn_AddDetail(driver), "Add Detail Image Button On Rate Table Creation Screen", Intlogval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Detail Items");
			
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Window Is Getting Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseDetailItem_Btn_TransType(driver), "Transaction Type Lookup Button On Detail Items Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Window Is Getting Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RateTable_Txt_TransType), RateTable_Txt_TransType+" Selected Transcation Type on Code Selection Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Detail Items");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseDetailItem_Btn_Unit(driver), "Unit Lookup Button On Detail Items Window", Intlogval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Code Selection");
			RMA_GenericUsages_Utility.RMA_StaticWait(5, Intlogval, "Wait Is Added As Window Is Getting Opened");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RateTable_Txt_Unit), RateTable_Txt_Unit+" Selected Unit On Code Selection window", Intlogval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Detail Items");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseDetailItem_Txt_Rate(driver), "Rate Textbox On Detail Items Window", String.valueOf(RateTable_Txt_Rate), Intlogval);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseDetailItem_Btn_SaveClose(driver), "Save And Close Button On Detail Items Window", Intlogval);
			driver.switchTo().window(CurrentWindowHandle);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.TimeExpenseRateTableFrame);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_TimeExpense.RMAApp_TimeExpenseRT_Btn_SaveRateTable(driver), "Save Rate Table Image Button On Rate Table Creation Screen", Intlogval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RateTableName)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RateTableName), RateTableName+": Created Rate Table On Time And Expense Rate Table Screen", Intlogval);
			if (Intlogval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rate Table Successfully Created", "Rate Table Successfully Created")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rate Table Successfully Created", "Rate Table Successfully Created")));
			}

		} catch (Exception|Error e) {
			if (Intlogval == 0)
			{	parentlogger.log(LogStatus.FAIL, "Creation Of Rate Table Failed due To Following Reason::"+e.getMessage());
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rate Table Creation Failed", "Creation Of Rate Table Is Not Completed Successfully")));
			}else{
				logger.log(LogStatus.FAIL, "Creation Of Rate Table Failed due To Following Reason::"+e.getMessage());
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Rate Table Creation Failed", "Creation Of Rate Table Is Not Completed Successfully")));
			}
			throw (e);
		}
		return RateTableName;
	}
}


