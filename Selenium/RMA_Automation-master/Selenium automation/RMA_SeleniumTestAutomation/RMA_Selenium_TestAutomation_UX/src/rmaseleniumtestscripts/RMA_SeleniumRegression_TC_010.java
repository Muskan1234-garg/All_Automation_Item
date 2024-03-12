package rmaseleniumtestscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_LicenseSupportURL;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//===================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_010
//Description    : Successful Verify the functionality of 'Update License Info' of Datasource screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-08-04-2017
//===================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_010 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String RMAApp_SMS_Lnk_DataSourceName;
	static String SecWindowHandle;
	static String SupportWindowHandle;
	static String LincenseCode;
	static int WorkStationCount;
	static String SupportURl;

	@Test	
	public void RMA_SeleniumRegression_TC_010_Test() throws Exception, Error
	{   
		try {	 	 

			int BranchCount;
			int NumOfWorkStationOnSupportURL;	
			int WorkStationCountUpdated;
			//Local Variable Declaration Completed
			
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_010";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;

			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_010_ Set, Update And Check 'Update License Info' Function On SMS", "Successful Verify the functionality of 'Update License Info' of Datasource screen Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			NumOfWorkStationOnSupportURL=0;
			SupportURl="http://rmintranet.fsg.amer.csc.com/rmsupport/default.aspx";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			RMAApp_SMS_Lnk_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002	
			//Data Fetch From Excel Data Sheet Is Completed

			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			SecWindowHandle=driver.getWindowHandle();
			//Security Management System Page Is Opened

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName), color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Permission To Login"), color.RMA_ChangeColor_Utility("Permission To Login",3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			BranchCount=RMA_Selenium_POM_SMS.RMAApp_SMS_List_LinkBranchCount(driver, "Permission To Login").size();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName), color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			// Required Data Source Link Is Expanded

			//=============================================Steps To Verify That Warning Message Existence/non-existence on Data-source Screen On The Basis Of Workstation And User Count For Particular DSN Is Started Here===========================================================================================================================================================================
						
			WorkStationCount=Integer.parseInt(((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", RMA_Selenium_POM_SMS.RMAApp_SMSDS_Lbl_WorkstationsCount(driver)).toString());		
			if(WorkStationCount==-1){
				//if workstation count is -1 then no warning message should display.
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "User License count exceeded.Please contact Riskmaster Support Desk."), "Exceed User License Limit Warning Message On the Data-Source Of Security Management System Page", logval);
				NumOfWorkStationOnSupportURL=BranchCount-1; // set WorkStationCount less than user count to check warning message existence

			}
			else if(WorkStationCount<BranchCount)
			{
				//If named user count is greater than assigned workstations count then warning message should display.
				RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "User License count exceeded.Please contact Riskmaster Support Desk."), "Exceed User License Limit Warning Message On the Data-Source Of Security Management System Page", logval);
				NumOfWorkStationOnSupportURL=BranchCount+1; // set WorkStationCount less than user count to check no warning message appeared
			}
			else if(WorkStationCount>=BranchCount){
				//If named user count is less than assigned workstations count then no warning message should display.
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "User License count exceeded.Please contact Riskmaster Support Desk."), "Exceed User License Limit Warning Message On the Data-Source Of Security Management System Page", logval);
				NumOfWorkStationOnSupportURL=BranchCount-1;// set WorkStationCount less than user count to check warning message existance
			}
			//=============================================Steps To Verify That Warning Message Existence/nonexistence on Data-source Screen On The Basis Of Workstation And User Count For Particular DSN Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Generate License Key On The Basis Of Required WorkStation Count Is Started Here===========================================================================================================================================================================
			driver.navigate().to(SupportURl); //Navigation To The RMA Application Login Page
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_DSN(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_DSN(driver), "Data Source Name TextBox On Support URL", RMAApp_SMS_Lnk_DataSourceName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_NumOfWorkstation(driver), "Number Of Workstation TextBox On Support URL", String.valueOf(NumOfWorkStationOnSupportURL), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Btn_GenLicenseCode(driver), "Generate License Code Button On Support URL", logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Generation of code On Support URL");
			LincenseCode=RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Label_LicenseCode(driver).getText();
			driver.close();
			//=============================================Steps To Generate License Key On The Basis Of Required WorkStation Count Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Verify That Warning Message Existence/non-existence on Data-source Screen On The Basis Of Workstation And User Count For Particular DSN Is Started Here===========================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName), color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			// Required Data Source Link Is Expanded
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit DataSource Button On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_UpdateLicense(driver), "Update License Info Button On the Data-Source Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Btn_UpdateCode(driver), "Save Button On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModelPopup_Btn_Cancel(driver), "Cancel Button On the Data-Source Of Security Management System Page", logval);
			RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver).click();

			//Due to long LincenseCode need  to call ActionSendKeys two times for and send half substring 
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver),"Lincense Code TextBox On the Data-Source Of Security Management System Page",LincenseCode.substring(0,LincenseCode.length()/2-1), logval);
			//RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver),"Lincense Code TextBox On the Data-Source Of Security Management System Page",LincenseCode.substring(LincenseCode.length()/2-1), logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility("Lincense Code TextBox On the Data-Source Of Security Management System Page", LincenseCode.substring(0,LincenseCode.length()/2-1),logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility("Lincense Code TextBox On the Data-Source Of Security Management System Page", LincenseCode.substring(LincenseCode.length()/2-1),logval);	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Btn_UpdateCode(driver), "Update License Info Button On the Data-Source Of Security Management System Page", logval);

			//Verify count against Workstations field.
			WorkStationCountUpdated=Integer.parseInt(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Lbl_WorkstationsCount(driver).getText());
			if(WorkStationCountUpdated>BranchCount)
			{
				//If named user count is greater than assigned workstations count then warning message should display.
				RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "User License count exceeded.Please contact Riskmaster Support Desk."), "Exceed User License Limit Warning Message On the Data-Source Of Security Management System Page", logval);

			}
			else{
				//If named user count is less than assigned workstations count then no warning message should display.
				RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "User License count exceeded.Please contact Riskmaster Support Desk."), "Exceed User License Limit Warning Message On the Data-Source Of Security Management System Page", logval);
			}
			//=============================================Steps To Verify That Warning Message Existence/non-existence on Data-source Screen On The Basis Of Default Workstation And User Count For Particular DSN Is Started Here===========================================================================================================================================================================

			//=============================================Steps To Generate License Key When WorkStation Count Is -1 Is Started Here===========================================================================================================================================================================
			driver.navigate().to(SupportURl); //Navigation To The RMA Application Login Page
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_DSN(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_DSN(driver), "Data Source Name TextBox On Support URL", RMAApp_SMS_Lnk_DataSourceName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_NumOfWorkstation(driver), "Number Of Workstation TextBox On Support URL", String.valueOf(-1), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Btn_GenLicenseCode(driver), "Generate License Code Button On Support URL", logval); 
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Generation of code On Support URL");
			LincenseCode=RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Label_LicenseCode(driver).getText();
			driver.close();
			//=============================================Steps To Generate License Key When WorkStation Count Is -1  Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Verify That Warning Message Existence on Data-source Screen On The Basis Of Default Workstation And User Count For Particular DSN Is Started Here===========================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName), color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			// Required Data Source Link Is Expanded
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit DataSource Button On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_UpdateLicense(driver), "Update License Info Button On the Data-Source Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver)));
			RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver).click();
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

			//Due to long LincenseCode need  to call ActionSendKeys two times for and send half substring 
			RMA_Input_Utility.RMA_ActionSetValue_Utility("Lincense Code TextBox On the Data-Source Of Security Management System Page",LincenseCode.substring(0,LincenseCode.length()/2-1), logval);
			RMA_Input_Utility.RMA_ActionSetValue_Utility("Lincense Code TextBox On the Data-Source Of Security Management System Page", LincenseCode.substring(LincenseCode.length()/2-1),logval);	

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Btn_UpdateCode(driver), "Update License Info Button On the Data-Source Of Security Management System Page", logval);

			//Verify count against Workstations field.
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			WorkStationCount=Integer.parseInt(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Lbl_WorkstationsCount(driver).getText());
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "User License count exceeded.Please contact Riskmaster Support Desk."), "Exceed User License Limit Warning Message On the Data-Source Of Security Management System Page", logval);
			//=============================================Steps To Verify That Warning Message Existence on Data-source Screen On The Basis Of Default Workstation And User Count For Particular DSN Is Ended Here===========================================================================================================================================================================


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
				//=============================================Steps To Set Default Initial Workstation And User Count For Particular DSN Is Started Here===========================================================================================================================================================================
				parentlogger.log(LogStatus.INFO,"Finally Block is Executed");
				if(driver.getTitle().equalsIgnoreCase("Riskmaster Security")){					
					driver.navigate().to(SupportURl); //Navigation To The RMA Application Login Page
				}
				
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_DSN(driver)));
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_DSN(driver), "Data Source Name TextBox On Support URL", RMAApp_SMS_Lnk_DataSourceName, logval);
				RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Txt_NumOfWorkstation(driver), "Number Of Workstation TextBox On Support URL", String.valueOf(WorkStationCount), logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Btn_GenLicenseCode(driver), "Generate License Code Button On Support URL", logval); 
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Generation of code On Support URL");
				LincenseCode=RMA_Selenium_POM_LicenseSupportURL.RMAApp_LicSupportURL_Label_LicenseCode(driver).getText();
				driver.close();

				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName)));
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName), color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
				// Required Data Source Link Is Expanded
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit DataSource Button On the Data-Source Of Security Management System Page", logval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_UpdateLicense(driver), "Update License Info Button On the Data-Source Of Security Management System Page", logval);
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver)));
				RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Txt_LicenseCode(driver).click();
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);

				//Due to long LincenseCode need  to call ActionSendKeys two times for and send half substring 
				RMA_Input_Utility.RMA_ActionSetValue_Utility("Lincense Code TextBox On the Data-Source Of Security Management System Page",LincenseCode.substring(0,LincenseCode.length()/2-1), logval);
				RMA_Input_Utility.RMA_ActionSetValue_Utility("Lincense Code TextBox On the Data-Source Of Security Management System Page",LincenseCode.substring(LincenseCode.length()/2-1), logval);	

				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUpdLic_Btn_UpdateCode(driver), "Update License Info Button On the Data-Source Of Security Management System Page", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
				//Verify count against Workstations field.
				RMA_Verification_Utility.RMA_TextCompare(String.valueOf(WorkStationCount),String.valueOf(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Lbl_WorkstationsCount(driver).getText()), "Worksation Count Intial Value", logval);
				driver.close();
				//=============================================Steps To Set Default Initial Workstation And User Count For Particular DSN Is Ended Here===========================================================================================================================================================================
				driver.switchTo().window(StrRMAWindowHandle);
			} catch (Exception|Error e) {
				driver.switchTo().window(StrRMAWindowHandle);
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}