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
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//===================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_009
//Description    : Successful User Can Open And Edit Datasource Under Datasources Link Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-05-24-2017
//===================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_009 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	@Test	
	public void RMA_SeleniumRegression_TC_009_Test() throws Exception, Error
	{   
		try {	 	 
			String RMAApp_SMS_Lnk_DataSourceName;
			//Local Variable Declaration Completed

			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_009_Clicking Edit Datasource Button, Screen Gets Open And Editable", "Successful User Can Open And Edit Datasource Under Datasources Link Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_009";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			RMAApp_SMS_Lnk_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002	
			//Data Fetch From Excel Data Sheet Is Completed

			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Opened

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_DataSourceName), color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
			// Required Data Source Link Is Expanded

			//=============================================Steps To Verify That By Default The Datasource Screen Opened Should Not be Editable Is Started Here===========================================================================================================================================================================
			RMA_Verification_Utility.RMA_ReadOnlyWriteStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_SystemLoginName(driver),"readonly", "System Login Name TextBox On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ReadOnlyWriteStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_SystemPassword(driver),"readonly", "System Password Name TextBox On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_PathDataSource(driver),"disable", "Path/Data Source TextBox On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Chk_ModAcceSecEnabled(driver),"disable", "Module Access Security Enabled CheckBox On the Data-Source Of Security Management System Page ", logval);
			//=============================================Steps To Verify That By Default The Datasource Screen Opened Should Not be Editable Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Verify That Edit button Should Present On The Corresponding Data-source Screen Is Started Here===========================================================================================================================================================================
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit DataSource Button Present On the Data-Source Of Security Management System Page ", logval);
			//=============================================Steps To Verify That Edit button Should Present On The Corresponding Data-source Screen Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Verify That Mouse Hover On Edit Button Tool Tip Should Present Is Started Here===========================================================================================================================================================================
			RMA_Verification_Utility.RMA_ToolTip_Verification(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit", "Tool Tip Message On Edit Button", logval);
			//=============================================Steps To Verify That Mouse Hover On Edit Button Tool Tip Should Present Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Verify That On Clicking Edit Button,"Datasource" Screen Should Gets Open Is Started Here===========================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit DataSource Button On the Data-Source Of Security Management System Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility( RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "you select Datasource Item."), "Opened Datasource screen Heading On the Data-Source Of Security Management System Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Btn_Edit(driver), "Edit DataSource Button On the Data-Source Of Security Management System Page", logval);
			//=============================================Steps To Verify That On Clicking Edit Button,"Datasource" Screen Should Gets Open Is Ended Here===========================================================================================================================================================================

			//=============================================Steps To Verify That After Clicking Edit Button The Screens Gets Editable Is Started Here===========================================================================================================================================================================
			RMA_Verification_Utility.RMA_ReadOnlyWriteStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_SystemLoginName(driver),"write", "System Login Name TextBox On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_ReadOnlyWriteStateVerification_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_SystemPassword(driver),"write", "System Password Name TextBox On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Txt_PathDataSource(driver),"enable", "Path/Data Source TextBox On the Data-Source Of Security Management System Page", logval);
			RMA_Verification_Utility.RMA_EnbDisbStateVerify_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSDS_Chk_ModAcceSecEnabled(driver),"enable", "Module Access Security Enabled CheckBox On the Data-Source Of Security Management System Page ", logval);
			//=============================================Steps To Verify That After Clicking Edit Button The Screens Gets Editable Is Ended Here===========================================================================================================================================================================

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