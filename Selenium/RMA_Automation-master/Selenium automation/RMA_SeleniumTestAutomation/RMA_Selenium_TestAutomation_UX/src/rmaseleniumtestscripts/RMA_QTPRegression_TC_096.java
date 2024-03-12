package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_096
//Description    : Bank Account Reconciliation Validation
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-12-19-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_096 extends RMA_TC_BaseTest
{
	public static String BankAccountCreation_Txt_AccountNumber;
	public static String Balance_Txt_StatementBeginDate;
	public static String Balance_Txt_StatementEndDate;
	
	@Test
	public void RMA_QTPRegression_TC_096_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_096";	
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		Balance_Txt_StatementBeginDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-7,0,"MM/dd/yyyy");
		Balance_Txt_StatementEndDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
		//Global Variable Initialization Is Completed Here

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_096_Bank Account Reconciliation",  "Bank Account Reconciliation Validation");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String StrPrimaryWindowHandle;
			String BankAccountCreation_Txt_BankAccountName;
			int BalanceCreation_Txt_BalanceAmount;
			int BankAccountCreation_Txt_ZipCode;
			//Local Variable Declaration Is Completed Here

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite05_QTPRegression_11.xlsx"); //Excel WorkBook RMA_Suite05_QTPRegression_11 IS Fetched To Retrieve Data 
			BalanceCreation_Txt_BalanceAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_094",1,0);//Balance Amount Is Fetched From DataSheet RMA_QTPRegression_TC_094
			//Balance Creation Data Fetch From Excel WorkBook Is Completed Here
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
	
			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 2, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			BankAccountCreation_Txt_AccountNumber= RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver).getAttribute("value");
			StrPrimaryWindowHandle = driver.getWindowHandle();
			//========================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//=========================================Steps To Create Balance Through Navigation To Funds---> Balance Is Started Here=======================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_Balance(driver), "Balance Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added For Balance Window To Open On Bank Account Page");
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Balance Window On Bank Account Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Balance_Txt_StatementBeginDate(driver), "Statement Begin Date On Balance Page", Balance_Txt_StatementBeginDate, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Balance_Txt_StatementEndDate(driver), "Statement End Date On Balance Page", Balance_Txt_StatementEndDate, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Balance_Txt_StatementBalance(driver), "Statement Balance On Balance Page", String.valueOf(BalanceCreation_Txt_BalanceAmount), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Balance_Btn_SaveClose(driver), "Save & Close Button On Balance Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Save And Close Button Is Clicked On Balance Window");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Creation Of Balances", "Successful Balance Creation")));
			//==========================================Steps To Create Balance Through Navigation To Funds---> Balance Is Completed Here================================================================================================================================================================================
			
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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "To Create A New Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
			} 
			catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}
