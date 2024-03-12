package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//===================================================================================================================================================================================================================================
//TestCaseID     : SeleniumRegression_TC_008
//Description    : State/Presence Of Various UI Controls On Security Management System Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-08-04-2017
//===================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_008 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	
	@Test	
	public void SeleniumRegression_TC_008_Test() throws Exception, Error
	{   
		try {	 	 
			parentlogger = reports.startTest("SeleniumRegression_TC_008_UI Controls On Security Management System Page Are Validated", "State/Presence Of Various UI Controls On Security Management System Page Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_008";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			
			String AddNewUser= "Add New User";
			String RefreshCancel ="Refresh And Cancel";
			String DeleteSelectedItem = "Delete Selected Item";
			String AddNewDataSource = "Add New Data Source";
			String SetEmailOptions = "Set E-mail Options";
			String AddNewModuleGroup = "Add New Module Group";
			String RenameModuleGroup = "Rename Module Group";
			String AuthenticationProviderSettings = "Authentication Provider Settings";
			String MultiLanguagDateFormat = "MultiLanguage Date Format";
			StrScreenShotTCName = "SeleniumRegression_TC_008";
			//Variable Declaration Completed

			//=========================================================== Save, Refresh, Grant Revoke Image Buttons Not Present On Security Management System Page Is Started Here===================================================================================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Image Button On Security Management System Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Revoke(driver),"Revoke Image Button On Security Management System Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),"Save Image Button On Security Management System Page", logval);

			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_RefreshCancelPositionVerify(driver), RefreshCancel, "Refresh And Cancel Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewUserPositionVerify(driver), AddNewUser, "Add New User Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_DeleteSelectedItemPositionVerify(driver), DeleteSelectedItem, "Delete Selected Item Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewDataSourcePositionVerify(driver), AddNewDataSource, "Add New Data Source Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_SetEmailOptionsPositionVerify(driver), SetEmailOptions, "Set E-mail Options Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AddNewModuleGroupPositionVerify(driver), AddNewModuleGroup, "Add New Module Group Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_RenameModuleGroupPositionVerify(driver), RenameModuleGroup, "Rename Module Group Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_AuthenticationProviderSettingsPositionVerify(driver), AuthenticationProviderSettings, "Authentication Provider Settings Image Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_MultiLangDateFormatPositionVerify(driver), MultiLanguagDateFormat, "MultiLanguage Date Format Image Button On Security Management System Page", logval);
			//===========================================================Save, Refresh, Grant Revoke Image Buttons Not Present On Security Management System Page Is Completed Here==================================================================================================================================================================================================================================================================================================================================================


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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval1);
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