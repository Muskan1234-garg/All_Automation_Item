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
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_092
//Description    : Setting Record Deposits In Bank Account Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-12-06-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_092 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_092_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_092";	
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_092_Deposit_Validation",  "Setting Record Deposits In Bank Account Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");

			String StrPrimaryWindowHandle;
			String BankAccountCreation_Txt_BankAccountName;
			String DepositCreation_Txt_TransactionDate;
			String DepositCreation_Txt_ControlNumber;
			int DepositCreation_Txt_TransactionAmount;
			int BankAccountCreation_Txt_ZipCode;
			String BankAccountCreation_Txt_AccountNumber;
			//Local Variable Declaration Is Completed Here

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			DepositCreation_Txt_TransactionDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,0,"MM/dd/yyyy");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite05_QTPRegression_11.xlsx"); //Excel WorkBook RMA_Suite05_QTPRegression_11 IS Fetched To Retrieve Data 
			DepositCreation_Txt_TransactionAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_092",1,0);//Transaction Amount Is Fetched From DataSheet RMA_QTPRegression_TC_092
			//Deposit Creation Data Fetch From Excel WorkBook Is Completed Here
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			RMA_Functionality_Utility.RMA_Suite04_Utility("RMA_QTPRegression_TC_092", logval);//General System Parameter Setting Is Done
		
			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 2, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			BankAccountCreation_Txt_AccountNumber= RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver).getAttribute("value");
			//========================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//=========================================Steps To Create Deposit Through Navigation To Funds---> Deposit Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Deposit","RMA_DepositCreation_Utility",0)+" To Successfully Create A Deposit");
			testcall2 = true;
			DepositCreation_Txt_ControlNumber = RMA_Functionality_Utility.RMA_DepositCreation_Utility(BankAccountCreation_Txt_BankAccountName, DepositCreation_Txt_TransactionDate, DepositCreation_Txt_TransactionAmount, true, logval1);
			parentlogger.log(LogStatus.INFO, "Deposit Is Created Successfully With Control Number"+ " " + color.RMA_ChangeColor_Utility(DepositCreation_Txt_ControlNumber, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID =RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==========================================Steps To Create Deposit Through Navigation To Funds---> Deposit Is Completed Here================================================================================================================================================================================
			
			//========================================Steps To Close The Bank Account Window Is Started Here==========================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			//=========================================Steps To Close The Bank Account Window Is Completed Here==========================================================================================================================================================================

			//==========================================Steps To  Verify Deposit Control Number Through Navigation To Funds---> Bank Account Is Started Here=======================================================================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, String.valueOf(BankAccountCreation_Txt_AccountNumber)), "Account Link On Lookup Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_Deposit(driver), "Deposit Image On Funds Page", logval);
			RMA_Verification_Utility.RMA_TextCompare(DepositCreation_Txt_ControlNumber, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_ControlNumber(driver).getAttribute("value"), "Control Number On Deposit Page", logval);
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Verification Of Record Deposits", "Successful Setting Of Record Deposits")));
			//===========================================Steps To Create Verify Deposit Control Number Through Navigation To Funds---> Bank Account Is Completed Here=======================================================================================================================================================================================================================

			//========================================Steps To Close The Deposit Window Is Started Here==========================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Deposit Page", logval);
			//=========================================Steps To Close The Deposit Window Is Completed Here==========================================================================================================================================================================
			
			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here=========================================================================================================================================================================================================== 
			
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
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))	
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_DepositCreation_Utility" + " " +  "To Create Deposit On Bank Account And Hence The Test Case Is A Fail");
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

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}
