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
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_012
//Description    : Successful Add, Edit And Delete User And Assign and Delete User from A DataSource, Verify that Company Name containing special characters is getting saved Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-07-31-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_012 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	@Test
	public void RMA_SeleniumRegression_TC_012_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_012_Add, Edit And Delete User And Assign and Delete User from A DataSource From SMS Page", "Successful Add, Edit And Delete User And Assign and Delete User from A DataSource From SMS Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String UserFirstName;
			String  UserLastName;
			String UserManager;
			String UserEmail;
			String AccessSMSStatus;
			String AccessUSPStatus;
			String DSNName;
			String ModuleName;
			String EditedUserFirstName;
			String EditedUserLastName;
			int EditedUserManager;
			String EditedAccessSMSStatus;
			String EditedAccessUSPStatus;	
			String Login_Txt_UserName;
			String Login_Txt_Password;
			String UserCompanyName;
			//Local Variable Declaration Completed

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_012";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite9_SMSScreen.xlsx"); //Excel WorkBook RMA_RegressionSuite9_SMSScreen Is Fetched To Retrieve Data
			UserManager = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 0); // User Manager Is Fetched From DataSheet RMA_SeleniumRegression_TC_012		
			UserEmail=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 1); // User Email Is Fetched From DataSheet RMA_SeleniumRegression_TC_012		
			AccessSMSStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 2); // Access SMS CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_012
			AccessUSPStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 3); // Access USP CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_012
			ModuleName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 4); // Module Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_012
			UserCompanyName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 1, 5); //Company Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_012		
			EditedUserManager = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_SeleniumRegression_TC_012", 5, 0); // Edited User Manager Is Fetched From DataSheet RMA_SeleniumRegression_TC_012
			EditedAccessSMSStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 5, 1); // Edited Access SMS CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_012
			EditedAccessUSPStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_012", 5, 2); // Edited Access USP CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_012			
			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002

			RMA_ExcelDataRetrieval_Utility ExcelData3 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			Login_Txt_Password = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001

			UserFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "UFN_");// Generate User first name
			UserLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "ULN_");// Generate User last name
			EditedUserFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EdUFN_");// Generate User first name to edit the user name
			EditedUserLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EdULN_");// Generate User last name to edit the user name
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			testcall5 = false;	
			loggerval5 = "NotInitialized";
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_012";
			//Variable Initialization Completed

			//==============================Steps To Add User From SMS Page Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",0)+ " To Add User On SMS Page");
			testcall1 = true;		
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Add", UserFirstName, UserLastName,UserFirstName+" "+UserLastName, UserManager, UserEmail, "USA", AccessSMSStatus, AccessUSPStatus, DSNName, ModuleName,"No", false, logval1);	
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);				
			//==============================Steps To Add User From SMS Page Is Ended Here================================================================================================

			//==============================Steps To Add Company Information For A User From SMS Page Is Started Here================================================================================================
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver)));
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver), "Edit", "Tool Tip Message On Edit Button", logval);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver),"Edit User Image From User Setting On Security Management System Page",logval);

			//Verify that Company Name containing special characters is getting saved properly while creating new user Is Started.
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Company(driver), "Company Name TextBox On  Security Management System Page ", UserCompanyName, logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, UserCompanyName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, UserCompanyName),"Expand Image Of "+UserCompanyName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName)));
			//Verify that Company Name containing special characters is getting saved properly while creating new user Is Ended.

			//Create a user associated with a company and verify that user must display under the company.
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName), UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver),"Edit User Image From User Setting On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Company(driver), "Company Name TextBox On  Security Management System Page ", "", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Txt_Email(driver), "Email TextBox On  Security Management System Page ", "", logval);

			//Started Verify that validation message should appear when click on any other user without saving the existing one. 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, "csc csc"),"csc csc Link From Left Navigation Menu Bar On Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Data has changed ,  do you want to navigate away?"), "'Data has changed ,  do you want to navigate away?' Mesage On Warning Model Popup On Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver), "Cancel Button On Model Popup Of The Security Management System Page", logval);

			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));			
			Thread.sleep(4000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"),"Expand Image Of Users Link From Left Navigation Menu Bar On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName), UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);

			//Verify that manager should not get deselect while Changing the email id of the user and same.
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName+" "+UserLastName),"Expand Image Of "+UserFirstName+" "+UserLastName+" Link From Left Navigation Menu Bar On Security Management System Page",logval);
			Thread.sleep(3000);
			RMA_Verification_Utility.RMA_VerifySelectedSingle_MultipleWebListData(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), UserManager, "Manager In Web List", logval);
			//==============================Steps To Add Company Information For A User From SMS Page Is Ended Here================================================================================================

			//==============================Steps To Edit User From SMS Page Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link From Left Navigation Menu Bar On Security Management System Page",logval);
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",1)+ " To Edit User On SMS Page");
			testcall2 = true;				
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Edit", EditedUserFirstName, EditedUserLastName, UserFirstName+" "+UserLastName,EditedUserManager, "NA", "NA",EditedAccessSMSStatus, EditedAccessUSPStatus, DSNName,"NA", "NA",false, logval1);	
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);	
			//==============================Steps To Edit User From SMS Page Is Ended Here================================================================================================

			//==============================Steps To Delete User From SMS Page Is Started Here================================================================================================
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SMSUserAddEditDelete", "RMA_SMSUserAddEditDelete_Utility",2)+ " To Delete User On SMS Page");
			testcall3 = true;					
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Delete", EditedUserFirstName, EditedUserLastName,EditedUserFirstName+" "+EditedUserLastName,"NA", "NA", "NA", "NA", "NA", "NA","NA","NA", false, logval1);	
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);	
			//==============================Steps To Delete User From SMS Page Is Ended Here================================================================================================

			//==============================Steps To Verify Deleted User Can Not Be Login Into RMA Application Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");

			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", UserLastName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", UserLastName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "*Incorrect Username or Password. Please try again"),  "Login Failure Text Label on RMA Application Login Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As UserName Field Is Again Enable To Write");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName, Login_Txt_Password, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);		//Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected

			//RMA_Verification_Utility.RMA_TextCompare(Login_Txt_UserName, RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText(), "Correct UserName Display", logval); //Login User is Verified
			//==============================Steps To Verify Deleted User Can Not Be Login Into RMA Application Is Ended Here================================================================================================


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
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSUserAddEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSUserAddEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SMSUserAddEditDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing TestCase" +" "+ "RMA_DataSource_Selection" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result)   //All The Information Associated With The Test Case Is Stored In Result Variable
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

