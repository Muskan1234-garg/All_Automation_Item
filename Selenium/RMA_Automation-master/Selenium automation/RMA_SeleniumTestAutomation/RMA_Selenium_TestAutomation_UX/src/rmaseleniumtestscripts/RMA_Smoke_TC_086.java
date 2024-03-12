package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_086
//Description    : Successfully Added, Edited, Deleted A Data Source Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-09-13-2017
//=================================================================================================

public class RMA_Smoke_TC_086 extends RMA_TC_BaseTest {
	
	@Test
	public void RMA_Smoke_TC_086_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "Smoke_TC_086";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed 
		
		try{
			parentlogger = reports.startTest("Smoke_TC_086_Add, Edit And Delete A Data Source", "Successfully Added, Edited, Deleted A Data Source Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			String Txt_ServerName;
			String Txt_DataBaseName;
			String Txt_LoginUserName;
			String Txt_LoginPassword;
			String Txt_UniqueDBConnName;
			String Txt_ActivationCode;
			String Txt_IncorrectLoginPassword;
			String Txt_IncorrectActivationCode;
			String Txt_EditedUniqueDBConnName;
			String DSNName;
				
			//Local Variable Declaration Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			Txt_ServerName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 0); // Server Name Value Is Fetched From DataSheet RMA_TC_086
			Txt_DataBaseName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 1); // Database Name Value Is Fetched From DataSheet RMA_TC_086
			Txt_LoginUserName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 2); // Login UserName Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_086
			Txt_LoginPassword=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 3); // Login Password Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_086
			Txt_ActivationCode=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 4); // Activation Code Available Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_086
			Txt_UniqueDBConnName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC86_TestDataBase _");
			Txt_EditedUniqueDBConnName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC86_EditedTestDataBase _");
			Txt_IncorrectLoginPassword=	Txt_LoginPassword+"ABC";	
			Txt_IncorrectActivationCode=Txt_ActivationCode+"Code";
			
			RMA_ExcelDataRetrieval_Utility ExcelData1 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName= ExcelData1.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002
		
			//===========================================================Creation Of Data Source Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewDS(driver), "Add New Data Source Button On Security Management System Page", logval);
			
			// Page opened where Select the Driver for the Database that user want to connect to
			Thread.sleep(2000);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, "SQL Server")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, "SQL Server"), "CheckBox Of The Driver for the Database on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver)));
		
			//Verify back button is present at the bottom of the window and user can navigate to he previous page using the button is started
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Back(driver), "Back Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, "SQL Server")));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, "SQL Server"), "SQL Server Radio on Add New Data Source Popup Of The Security Management System Page", logval);
			//Verify back button is present at the bottom of the window and user can navigate to he previous page using the button is ended
				
			// Verify that in case of any connection issue appropriate message gets displayed Is Started.
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver), "Server Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ServerName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_DatabaseName(driver), "Database Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_DataBaseName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginUserName(driver), "Login User Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_LoginUserName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginPassword(driver), "Login Password TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_IncorrectLoginPassword , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			Thread.sleep(4000);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Login failed for user "), "Validation Error Message", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Back(driver), "Back Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Back(driver), "Back Button on Add New Data Source Popup Of The Security Management System Page", logval);
			// Verify that in case of any connection issue appropriate message gets displayed Is Ended.
			
			//Verify that database password is not visible in clear text
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver)));
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginPassword(driver).getAttribute("type"),"password", "Database Password is in 'Password' Type", logval);
			
			
			// Next Page opened where user enters necessary data to connect to database Is Started
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver), "Server Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ServerName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_DatabaseName(driver), "Database Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_DataBaseName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginUserName(driver), "Login User Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_LoginUserName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginPassword(driver), "Login Password TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_LoginPassword , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			// Next Page opened where user enters necessary data to connect to database Is Ended
			
			//Database Connection Wizard will now try to connect and validate the database" message and click on next button
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step3Message(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step4Message(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Selenium_POM_VerificationMessage.ValidDataBaseConnectionMessage), "Validation Message For Successfull Connection", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(driver),"'Please enter unique name for this database connection:' TextBox on Add New Data Source Popup Of The Security Management System Page" , Txt_UniqueDBConnName , logval);
			
			//Verify if the security code is incorrect a message saying " You have entered an incorrect code. Please verify you have entered the code correctly. Please contact product support if you need assistance." gets displayed
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ActivationCode(driver), "'Enter the code provided by the product support to activate licenses:'  TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_IncorrectActivationCode , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.InCorrectActivationCodeMessage, true, "Error Message For Incorrect Activation Code On Add New Data Source Popup Of The Security Management System Page", logval);
			
			//Verify that a data-source does not add with existing name Is Started
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(driver), "'Please enter unique name for this database connection:' TextBox on Add New Data Source Popup Of The Security Management System Page", DSNName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ActivationCode(driver), "'Enter the code provided by the product support to activate licenses:'  TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ActivationCode , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage("DataSource name "+DSNName+RMA_Selenium_POM_VerificationMessage.UniqueDBNameValidationMessage, true, "Error Message For Already Existed DB Name On Add New Data Source Popup Of The Security Management System Page", logval);
			//Verify that a data-source does not add with existing name Is Ended
			
			//Verify that user is able to either navigate to previous page or close the window directly from the security code error page Is Started .
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Back(driver), "Back Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step4Message(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			//Verify that user is able to either navigate to previous page or close the window directly from the security code error page Is Ended .
			
			//Verify  when user clicks on the close button at the top of window   a popup message should be displayed asking " close database connection wizard and lose any changes? Is Started"
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("No", "Partial", RMA_Selenium_POM_VerificationMessage.UnsavedModelPopupCloseWarningMessage, "Waring Message To Close Unsaved DB connection On Add New Data Source Popup Of The Security Management System Page", logval);
			//Verify  when user clicks on the close button at the top of window   a popup message should be displayed asking " close database connection wizard and lose any changes? Is Ended"
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(driver), "'Please enter unique name for this database connection:' TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_UniqueDBConnName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ActivationCode(driver), "'Enter the code provided by the product support to activate licenses:'  TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ActivationCode , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added For Update Data Source Connection");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_UniqueDBConnName), Txt_UniqueDBConnName+" Database Link Of Security Management System Page", logval);
			//===========================================================Creation Of Data Source Is Ended Here===========================================================
			
			//===========================================================Editing Of Existing Data Source Is Started Here===========================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_UniqueDBConnName), Txt_UniqueDBConnName + " Link From Left Menu Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Verify the fields are non-editable until the user clicks on edit button
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_SystemLoginName(driver).getAttribute("readonly"),"true", "System Login Name Field Is Not editable", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_SystemPassword(driver).getAttribute("readonly"),"true", "System Password Field Is Not editable", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_PathDataSource(driver).getAttribute("disabled"),"true", "Path/Data Source Field Is Not editable", logval);
			Thread.sleep(2000);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit Button Data Source Tab Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_EditDataSource(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_EditDataSource(driver), "Edit Datasource Button Data Source Tab Of The Security Management System Page", logval);
			Thread.sleep(2000);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, "SQL Server")));
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, "SQL Server"), "CheckBox Of The Driver for the Database on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step3Message(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step4Message(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(driver), "'Please enter unique name for this database connection:' TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_EditedUniqueDBConnName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ActivationCode(driver), "'Enter the code provided by the product support to activate licenses:'  TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ActivationCode , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added For Update Data Source Connection");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_EditedUniqueDBConnName), Txt_EditedUniqueDBConnName+" Database Link Of Security Management System Page", logval);
		
			//===========================================================Editing Of Existing Data Source Is Ended Here===========================================================
		
			
			//===========================================================Deletion Of Data Source Is Started Here===========================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_EditedUniqueDBConnName), Txt_EditedUniqueDBConnName + " Link From Left Menu Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Button Of Security Management System Page", logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver),RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver),RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver) ,RMA_Selenium_POM_VerificationMessage.SMSDeleteConfirmation,"SMS Page", false, logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_EditedUniqueDBConnName), Txt_EditedUniqueDBConnName+" Database Link Of Security Management System Page", logval);
			Thread.sleep(3000);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Button Of Security Management System Page", logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver),RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver),RMA_Selenium_POM_Home.RMAApp_Generic_ModalDialog(driver) ,RMA_Selenium_POM_VerificationMessage.SMSDeleteConfirmation,"SMS Page", true, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "RISKMASTER SECURITY"), "RISKMASTER SECURITY Expand Image From Left Menu Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"), "DataSources Expand Image From Left Menu Of Security Management System Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_EditedUniqueDBConnName), Txt_EditedUniqueDBConnName + " Link From Left Menu Of Security Management System Page", logval);		
			//===========================================================Deletion Of Data Source Is Ended Here=================================================================================================================================================================================
						
		}catch(Exception|Error e)
		{
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
				RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
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


