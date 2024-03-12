package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_SMS;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_086
//Description    : Successfully Added A New Data Source Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-27-2016
//=================================================================================================

public class RMA_Smoke_TC_086 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_086_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_086_Add A New Data Source", "Successfully Added A New Data Source Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			String Txt_ServerName;
			String Txt_DataBaseName;
			String Txt_LoginUserName;
			String Txt_LoginPassword;
			String Txt_UniqueDBConnName;
			String Txt_ActivationCode;
				
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_086";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			Txt_ServerName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 0); // Server Name Value Is Fetched From DataSheet RMA_TC_086
			Txt_DataBaseName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 1); // Database Name Value Is Fetched From DataSheet RMA_TC_086
			Txt_LoginUserName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 2); // Login UserName Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_086
			Txt_LoginPassword=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 3); // Login Password Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_086
			Txt_ActivationCode=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_086", 1, 4); // Activation Code Available Value In Step Heading 2 Is Fetched From DataSheet RMA_TC_086
			Txt_UniqueDBConnName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC86_TestDataBase _");
					
			//===========================================================Creation Of Data Source Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewDS(driver), "Add New Data Source Button On Security Management System Page", logval);
			
			// Page opened where Select the Driver for the Database that user want to connect to
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Rdb_DBDriver(driver, " SQL Server"), "CheckBox Of The Driver for the Database on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			
			// Next Page opened where user enters necessary data to connect to database
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ServerName(driver), "Server Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ServerName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_DatabaseName(driver), "Database Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_DataBaseName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginUserName(driver), "Login User Name TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_LoginUserName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_LoginPassword(driver), "Login Password TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_LoginPassword , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			
			//Database Connection Wizard will now try to connect and validate the database" message and click on next button
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step3Message(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Lbl_Step4Message(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_UniqueDBConnName(driver), "'Please enter unique name for this database connection:' TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_UniqueDBConnName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Txt_ActivationCode(driver), "'Enter the code provided by the product support to activate licenses:'  TextBox on Add New Data Source Popup Of The Security Management System Page", Txt_ActivationCode , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSAddNewDS_Btn_Next(driver), "Next Button on Add New Data Source Popup Of The Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Update Data Source");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_UniqueDBConnName), Txt_UniqueDBConnName+" Database Link Of Security Management System Page", logval);
			//===========================================================Creation Of Data Source Is Ended Here===========================================================
			
			//===========================================================Deletion Of Data Source Is Started Here===========================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_UniqueDBConnName), Txt_UniqueDBConnName + " Link From Left Menu Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Button Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver), "Cancel Button On Delete Popup Of The Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_UniqueDBConnName), Txt_UniqueDBConnName+" Database Link Of Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Button Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button On Delete Popup Of The Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait For Delete Data Source");
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "RISKMASTER SECURITY")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "RISKMASTER SECURITY"), "RISKMASTER SECURITY Expand Image From Left Menu Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"), "DataSources Expand Image From Left Menu Of Security Management System Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, Txt_UniqueDBConnName), Txt_UniqueDBConnName + " Link From Left Menu Of Security Management System Page", logval);
			//===========================================================Deletion Of Data Source Is Ended Here===========================================================
						
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

