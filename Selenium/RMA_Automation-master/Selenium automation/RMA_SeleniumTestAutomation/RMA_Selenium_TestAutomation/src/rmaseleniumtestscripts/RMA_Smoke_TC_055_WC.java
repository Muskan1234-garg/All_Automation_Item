package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_PolicyDownload;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_055_WC
//Description    : Successful Attach a Policy to a Workers Comp Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_051, RMA_Smoke_TC_052
//Revision       : 0.0 - RenuVerma-11-18-2016
//=================================================================================================

public class RMA_Smoke_TC_055_WC extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
		
	@Test
	public void RMA_Smoke_TC_055_WC_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_055_Attach Internal Policy  On Workers Comp Claim.", "Successful Attach a Policy to a Workers Comp Claim Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			String RMAApp_WorkersCompClaim_Txt_ClaimType;
			int RMAApp_WorkersCompClaim_Txt_EmployeeNo;
			String RMAApp_WorkersCompClaim_Txt_Department;
			int RMAApp_WorkersCompClaim_Txt_DateOfEvent;
			int RMAApp_WorkersCompClaim_Txt_TimeOfEvent;
			int RMAApp_WorkersCompClaim_Txt_DateOfClaim;
			int RMAApp_WorkersCompClaim_Txt_TimeOfClaim;
			String RMAApp_WorkersCompClaim_Txt_Jurisdiction;
			String StrClaimNumber_Smoke_055;
			String strPrimaryWindowHandle;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_055_WC";
			testcall1 = false;
			loggerval1 = "NotInitialized";
				
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			RMAApp_WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_055_WC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_055_WC
			RMAApp_WorkersCompClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_055_WC", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_055_WC
			RMAApp_WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_055_WC", 1, 2); // Department Is Fetched From DataSheet RMA_TC_055_WC
			RMAApp_WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_055_WC", 1, 3); // Jurisdiction Is Fetched From DataSheet RMA_TC_055_WC
			
			RMAApp_WorkersCompClaim_Txt_DateOfEvent=Integer.parseInt(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());//Current Date of Claim Is Fetched
			RMAApp_WorkersCompClaim_Txt_DateOfClaim=Integer.parseInt(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());//Current Date of Event Is Fetched
			RMAApp_WorkersCompClaim_Txt_TimeOfEvent=Integer.parseInt(RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility());//Current Time Of Claim Is Fetched
			RMAApp_WorkersCompClaim_Txt_TimeOfClaim=Integer.parseInt(RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility());// Current Time Of Event Is Fetched
			
			/*===========================================================Attached Internal Policy On Worker Comp Policy Is Started Here================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WCACOFF", "RMA_WorkersCompClaimCreation", 0) +" Is Called To Create A Workers Comp Claim Policy");
			testcall1 = true;
			StrClaimNumber_Smoke_055=RMA_Functionality_Utility.RMA_WorkersCompClaimCreation(RMAApp_WorkersCompClaim_Txt_ClaimType, RMAApp_WorkersCompClaim_Txt_EmployeeNo, RMAApp_WorkersCompClaim_Txt_Department, RMAApp_WorkersCompClaim_Txt_DateOfEvent, RMAApp_WorkersCompClaim_Txt_TimeOfEvent, RMAApp_WorkersCompClaim_Txt_DateOfClaim, RMAApp_WorkersCompClaim_Txt_TimeOfClaim, RMAApp_WorkersCompClaim_Txt_Jurisdiction, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_Smoke_055);
			strPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_PrimaryPolicy(driver), "Click on Primary Policy Button", logval);// Policy download button click
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051)));
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, "Worker Comp. Claim-->Primary Policy Selection Page", logval);
			driver.switchTo().window(strPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_Smoke_055);
			globalWait.until(ExpectedConditions.attributeContains(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Txt_PrimaryPolicy(driver),"value", RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051));
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_Smoke_055, false, "NA", "Worker Comp. Claim Page", logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Txt_PrimaryPolicy(driver).getAttribute("value"), "Policy Name", logval);
			parentlogger.log(LogStatus.INFO, "New Worker Comp. Claim Is Created With Claim Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_Smoke_055, 2)+ " And Policy Number:: "+color.RMA_ChangeColor_Utility(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051, 3));
		/*===========================================================Attached Internal Policy On Worker Comp Policy Is Completed Here================================================*/
			
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_WorkersCompClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

