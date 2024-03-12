package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_052
//Description    : Successful Coverage Can Be Added, Edited And Deleted To Policy Is Validated
//Depends On TC  : RMA_Smoke_TC_051
//Revision       : 0.0 - RenuVerma-09-30-2016 
//=================================================================================================
public class RMA_Smoke_TC_052 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_Smoke_TC_052_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3= "NotInitialized";
		testcall4 = false;	
		loggerval4= "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_052";

		try {
			parentlogger = reports.startTest("Smoke_TC_052_Add, Edit And Delete Coverage From Policy", "Successful Coverage Can Be Added, Edited And Deleted To Policy Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			String PolicyTracking_CoverageType1;
			String PolicyTracking_CoverageType2;
			int PolicyTracking_PolicyLimit1;
			int PolicyTracking_PolicyLimit2;
			String PolicyTracking_CoverageType3;// Added Coverage for Worker's Comp Claim Case
			int PolicyTracking_PolicyLimit3;
			String PolicyTracking_EditedCoverage;
			int PolicyTracking_EditedPolicyLimit;
			String StrPrimaryWindowHandle;
			//Local Variable Declaration

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData IS Fetched To Retrieve Data 
			PolicyTracking_CoverageType1=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 0); // First Value In Type Of Coverage Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_PolicyLimit1=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_052", 1, 1); // First Value In Policy Limit Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_CoverageType2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 2); // Second Value In Type Of Coverage Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_PolicyLimit2=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_052", 1, 3); // Second Value In Policy Limit Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_CoverageType3=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 1, 4); // Third Value In Type Of Coverage Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_PolicyLimit3=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_052", 1, 5); // Third Value In Policy Limit Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_EditedCoverage=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_052", 5, 0); // Edited Value In Type Of Coverage Is Fetched From DataSheet RMA_TC_052
			PolicyTracking_EditedPolicyLimit=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_052", 5, 1); // Edited Value In Policy Limit Is Fetched From DataSheet RMA_TC_052

			//-------------------------------------------------------------------------Add First Policy Coverage Started Here-------------------------------------------------------------------------------------------------------------
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolicyCoverage", "RMA_PolicyCoverage_Utility",0) +" Is Called Add First Policy Coverage");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_PolicyCoverage_Utility(PolicyTracking_CoverageType1, PolicyTracking_PolicyLimit1,false, logval1);
			parentlogger.log(LogStatus.INFO, "First Policy Coverage Is Added Successfully With Coverage Type::"+ " " + color.RMA_ChangeColor_Utility(PolicyTracking_CoverageType1, 3));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Policy Coverage Page", logval);
			//---------------------------------------------------------------------------Add First Policy Coverage Ended Here-------------------------------------------------------------------------------------------------------------

			//---------------------------------------------------------------------------Add Second Policy Coverage Started Here-------------------------------------------------------------------------------------------------------------
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Img_PolicyCoverage(driver)));
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolicyCoverage", "RMA_PolicyCoverage_Utility",1) +" Is Called Second First Policy Coverage");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_PolicyCoverage_Utility(PolicyTracking_CoverageType2, PolicyTracking_PolicyLimit2,false, logval1);
			parentlogger.log(LogStatus.INFO, "First Policy Coverage Is Added Successfully With Coverage Type::"+ " " + color.RMA_ChangeColor_Utility(PolicyTracking_CoverageType2, 3));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Policy Coverage Page", logval);
			//-------------------------------------------------------------------------------- Add Second Policy Coverage Ended Here-------------------------------------------------------------------------------------------------------------	

			//--------------------------------------------------------------------------------Add Third Policy Coverage Started Here-------------------------------------------------------------------------------------------------------------
			// Added Coverage for Worker's Comp Claim Cases
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Img_PolicyCoverage(driver)));
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolicyCoverage", "RMA_PolicyCoverage_Utility",2) +" Is Called Add First Policy Coverage");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PolicyCoverage_Utility(PolicyTracking_CoverageType3, PolicyTracking_PolicyLimit3,false, logval1);
			parentlogger.log(LogStatus.INFO, "First Policy Coverage Is Added Successfully With Coverage Type::"+ " " + color.RMA_ChangeColor_Utility(PolicyTracking_CoverageType3, 3));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//------------------------------------------------------------------------------Add Third Policy Coverage Ended Here-------------------------------------------------------------------------------------------------------------


			/*===============================================Verify Lookup Table Of Policy In Policy Coverage Is Started Here================================*/
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Coverage Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), String.valueOf(PolicyTracking_PolicyLimit1),0,String.valueOf(PolicyTracking_PolicyLimit1), 1,PolicyTracking_CoverageType1 ,  "Lookup Result Table", logval);
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), String.valueOf(PolicyTracking_PolicyLimit2),0,String.valueOf(PolicyTracking_PolicyLimit2), 1,PolicyTracking_CoverageType2 ,  "Lookup Result Table", logval);
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), String.valueOf(PolicyTracking_PolicyLimit3),0,String.valueOf(PolicyTracking_PolicyLimit3), 1,PolicyTracking_CoverageType3 ,  "Lookup Result Table", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Lookup Table Values Are Getting Verified", StrScreenShotTCName)));
			RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(PolicyTracking_PolicyLimit1) , "Policy Coverage Lookup Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
			globalWait.until(ExpectedConditions.attributeContains(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Txt_CovType(driver),"value" ,PolicyTracking_CoverageType1) );
			/*===============================================Verify Lookup Table Of Policy In Policy Coverage Is Ended Here================================*/

			/*===============================================Editing Of Policy Coverage In Policy Tracking Is Started Here================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Btn_CovType(driver), "Coverage Type Button On Policy Covergae Page", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebLinkSelect(PolicyTracking_EditedCoverage,  " Policy Status On Policy Coverage Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Txt_PolicyLimit(driver), "Policy Limit on Policy Coverage Page", String.valueOf(PolicyTracking_EditedPolicyLimit), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Policy Coverage Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false,"NA",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Coverage Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 2, 4, true, false, "Lookup Result Table", logval);
			RMA_Verification_Utility.RMA_TableVerifyText_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), String.valueOf(PolicyTracking_EditedPolicyLimit),0,String.valueOf(PolicyTracking_EditedPolicyLimit), 1,PolicyTracking_EditedCoverage ,  "Lookup Result", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
			/*=================================================Editing Of Policy Coverage In Policy Tracking Is Completed Here=============================================*/

			/*=================================================Deletion Of  Policy  Coverage In Policy Tracking Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0) +" Is Called To Delete A Policy Coverage :" +" "+ color.RMA_ChangeColor_Utility(PolicyTracking_EditedCoverage, 3));
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy Coverage In Policy Tracking Page" , logval1);
			parentlogger.log(LogStatus.INFO, "Policy Coverage Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(PolicyTracking_EditedCoverage, 3));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Coverage Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 2, 3, true, false, "Lookup Result Table", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			/*==================================================Deletion Of Policy  Coverage In Policy Tracking Is Ended Here================================================*/

		} catch (Exception|Error e) {
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Un-Handled Exception And Print Log Of It
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
			if ((testcall1== true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PolicyCoverage_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall2== true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PolicyCoverage_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall3== true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if ((testcall2== true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PolicyCoverage_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
