package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_097
//Description    : Verification Of Account Balance Information 
//Depends On TC  : RMA_QTPRegression_TC_096
//Revision       : 0.0 - AnubhutiVyas-12-19-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_097 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_097_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_097";	
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		//Global Variable Initialization Is Completed Here

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_097_View_Account_Balance_Information",  "Verification Of Account Balance Information");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String StrPrimaryWindowHandle;
			String StrWindowHandle;
			int BalanceCreation_Txt_BalanceAmount;
			//Local Variable Declaration Is Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite05_QTPRegression_11.xlsx"); //Excel WorkBook RMA_Suite05_QTPRegression_11 IS Fetched To Retrieve Data 
			BalanceCreation_Txt_BalanceAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_094",1,0);//Balance Amount Is Fetched From DataSheet RMA_QTPRegression_TC_094
			//Balance Creation Data Fetch From Excel WorkBook Is Completed Here
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			
			//==========================================Steps To Navigate To Funds---> Bank Account Is Started Here=======================================================================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, String.valueOf(RMA_QTPRegression_TC_096.BankAccountCreation_Txt_AccountNumber)), "Account Link On Lookup Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			//==========================================Steps To Navigate To Funds---> Bank Account Is Completed Here=======================================================================================================================================================================================================================
			//==========================================Steps To Navigate To Bank Account --> Account Balance Information Is Started Here=======================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_AccountBalance(driver), "Account Balance Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Account Balance On Bank Account Page", logval);
			StrWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_AccBalance_Btn_LoadPriorStatementDate(driver), "Load Prior Statement Date Image On Account Balance Information Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(5, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, StrWindowHandle, "NA", "Navigation TO Select Prior Statements Date On Account Balance Information Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, RMA_QTPRegression_TC_096.Balance_Txt_StatementBeginDate), "Begin Date Link On Lookup Page", logval);
			driver.switchTo().window(StrWindowHandle);
			RMA_Verification_Utility.RMA_TextCompare("$"+BalanceCreation_Txt_BalanceAmount+".00", RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_AccBalance_Txt_BalPerBankStatement(driver).getAttribute("value"), "Balance Per Bank Statement On Account Balance Information Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_AccBalance_Btn_Close(driver), "Close Button On Account Balance Information Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Verification Of Account Balance Information", "Successful Verification Of Account Balance Information")));
			//==========================================Steps To Navigate To Bank Account --> Account Balance Information Is Completed Here=======================================================================================================================================================================================================================
			
			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here=========================================================================================================================================================================================================== }

		
		}

		catch (Exception|Error e) {

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

		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}

		finally
		{
			try {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}
