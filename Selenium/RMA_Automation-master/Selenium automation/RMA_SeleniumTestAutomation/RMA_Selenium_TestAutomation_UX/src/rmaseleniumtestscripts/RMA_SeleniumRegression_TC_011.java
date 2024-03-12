package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_011
//Description    : Successful Add And Rename Module From SMS Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-08-02-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_011 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	public static String RenamedModuleName_TC_011;
	public static String DSNName_TC_011;
	
	@Test
	public void RMA_TC_011_Test() throws Exception,Error {
		
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_011_Add And Rename Module From SMS Page", "Successful Add And Rename Module From SMS Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String ModuleName;
			String  RiskMasterStatus;
			String SortMasterStatus;
			String UtilitiesStatus;
			String StandardReportStatus;
			String ExecutiveSummaryStatus;
			String EditedRiskMasterStatus;
			String EditedSortMasterStatus;
			String EditedUtilitiesStatus;
			String EditedStandardReportStatus;
			String EditedExecutiveSummaryStatus;
			//String RenamedModuleName;
			//Local Variable Declaration Completed
			
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_011";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite9_SMSScreen.xlsx"); //Excel WorkBook RMA_RegressionSuite9_SMSScreen Is Fetched To Retrieve Data
			RiskMasterStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 1, 0); // RiskMaster CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			SortMasterStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 1, 1); //SortMaster CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			UtilitiesStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 1, 2); // Utilities CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			StandardReportStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 1, 3); // Standard Report CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			ExecutiveSummaryStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 1, 4); // Executive Summary CheckBox Status Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			EditedRiskMasterStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 5, 0); //Edited RiskMaster CheckBox Status Fetched From DataSheet RMA_SeleniumRegression_TC_011
			EditedSortMasterStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 5, 1); //Edited SortMaster CheckBox Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			EditedUtilitiesStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 5, 2); //Edited Utilities CheckBox Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			EditedStandardReportStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 5, 3); //Edited Standard Report Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
			EditedExecutiveSummaryStatus=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_011", 5, 4); //Edited Executive Summary Is Fetched From DataSheet RMA_SeleniumRegression_TC_011
						
			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName_TC_011= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002
		
			ModuleName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Train_011_");// Generate Module Group Name 
			RenamedModuleName_TC_011=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "EditedTrain_011_");// Generate Name to Rename the Module Group 
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_011";
			//Variable Initialization Completed

			//==============================Steps To Add Module From SMS Page Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_AddModule(driver), "Add New Module Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.ModuleGroupNotSelected, true,"Security Management System Page", logval);
			RMA_Functionality_Utility.RMA_SMSModuleAddRenameDelete_Utility("Add", ModuleName, "NA", RiskMasterStatus,SortMasterStatus, UtilitiesStatus, StandardReportStatus, ExecutiveSummaryStatus, DSNName_TC_011, false, logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			//==============================Steps To Add Module From SMS Page Is Ended Here================================================================================================
			
			//==============================Steps To Rename Module From SMS Page Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_Rename(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModule_Btn_Rename(driver), "Rename Module Button On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.RenamedModuleGroupNotSelected, true,"Security Management System Page", logval);
			RMA_Functionality_Utility.RMA_SMSModuleAddRenameDelete_Utility("Rename", RenamedModuleName_TC_011, ModuleName,EditedRiskMasterStatus, EditedSortMasterStatus, EditedUtilitiesStatus, EditedStandardReportStatus, EditedExecutiveSummaryStatus, DSNName_TC_011, false, logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "RISKMASTER"),"Expand Image Of RISKMASTER Link From Module Access Permission On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, "Policy Tracking"),"Expand Image Of Policy Tracking Link From Module Access Permission On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "Clone Policy"), "Clone Policy CheckBox under Module Access Permissions On Security Management System Page", logval);
			//==============================Steps To Rename Module From SMS Page Is Ended Here================================================================================================
			
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

