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
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_021
//Description    : Master Bank Account Can Be Set To A Bank Account Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-08-18-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_021 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_021_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_021";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_021_Master Bank Account_Validation", "Master Bank Account Can Be Set To A Bank Account Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			int BankAccountCreation_Txt_ZipCode;
			int ExpectedNextCheckNumber;
			String NextCheckNumber;
			String BankAccountCreation_Txt_BankAccountName;
			String MasterBankAccount;
			String StrPrimaryWindowHandle_1;
			String StrPrimaryWindowHandle_2;
			//Local Variable Declaration Completed Here

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AS_RMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_12_QTPRegression_05.xlsx"); //Excel WorkBook RMA_Suite_12_QTPRegression_05 IS Fetched To Retrieve Data
			MasterBankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_021", 1, 1); //Master Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_021			
			ExpectedNextCheckNumber =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_021", 1,2); //Expected Next Check Number Is Fetched From DataSheet RMA_QTPRegression_TC_021
			//Master Bank Account Data Fetch From Excel WorkBook Is Completed Here


			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//========================================Steps To Do Settings In General System Parameter Setup Page Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite22GenSysParaSetupsettings","RMA_Suite22_Utility",0)+" To Successfully Do Settings On General System Parameter Setup Page");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite22_Utility("RMA_QTPRegression_TC_021_Check", logval1);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Do Settings In General System Parameter Setup Page Is Completed Here================================================================================================================================================================================================

			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall2 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 1, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//========================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//========================================Steps To Verify Bank Account Name ,Master Account List,Next Check Number Is Started Here============================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_TextCompare(BankAccountCreation_Txt_BankAccountName, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_AccountName(driver).getAttribute("value") , "Account Name", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_MasterBankAcc(driver), "Master Acct List On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Next Check Number Needs To Get Updated After Selecting The Master Bank Account");
			RMA_Verification_Utility.RMA_TextCompare(String.valueOf(ExpectedNextCheckNumber), RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver).getAttribute("value"), "Next Check Text Box On Bank Account Page", logval);
			//========================================Steps To Verify AccountName ,Master Account List,NextCheckNumber Is Completed Here============================================================================================================================================================================================================

			//========================================Steps To Fetch Next Check Number From Created Master Bank Account Is Started Here===================================================================================================================================================================================================
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_MasterBankAcc(driver), MasterBankAccount, "Master Acct List", "Bank Account Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			NextCheckNumber = RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver).getAttribute("value");
			StrPrimaryWindowHandle_1 = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "Check Stcok Page ", logval);// Save Button Is Clicked
			//========================================Steps To Fetch Next Check Number From Created Master Bank Account Is Completed Here===================================================================================================================================================================================================

			//========================================Steps To Lookup The Master Account Is Started Here==============================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle_1, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			driver.manage().window().maximize();
			//Lookup Window Maximized

			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Window Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccountLookupdata_Tbl(driver), MasterBankAccount, "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle_1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			StrPrimaryWindowHandle_2 = driver.getWindowHandle();
			//=========================================Steps To Lookup The Master Account Is Completed Here==============================================================================================================================================================================================================================================

			//=========================================Steps To Verify Master Bank Account List Is Not present And Verify Value Of Next Check Number Is Started Here==============================================================================================================================================================================================================================================
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Lst_MasterBankAcc(driver), "Master Acct List On Bank Account Page", logval);
			RMA_Verification_Utility.RMA_TextCompare(NextCheckNumber, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver).getAttribute("value"), "Next Check Text Box On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On "+ "saving ", logval);// Save Button Is Clicked
			//========================================Steps To Verify Master Bank Account List Is Not present And Verify Value Of Next Check Number Is Completed Here==============================================================================================================================================================================================================================================

			//=========================================Steps To Lookup The Bank Account Is Started Here==============================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle_2, "NA", "NA", "Navigation TO Lookup Data On Bank Account Page", logval);
			driver.manage().window().maximize();
			//Lookup Window Maximized

			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Window Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver,"Account Name"), "Account Link On Lookup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(10, logval, "Wait Is Added As Lookup Data Window Needs To Get Loaded After Sorting The Account Nmae Column");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccountLookupdata_Tbl(driver), BankAccountCreation_Txt_BankAccountName, "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle_2);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			//=========================================Steps To Lookup The Bank  Account Is Completed Here==============================================================================================================================================================================================================================================

			//========================================Steps To Verify Value Of Next Check Number Is Started Here===========================================================================================================================================================================================================
			RMA_Verification_Utility.RMA_TextCompare(NextCheckNumber, RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Txt_NextCheckNumber(driver).getAttribute("value"), "Next Check Text Box On Bank Account Page", logval);
			//=========================================Steps To Verify Value Of Next Check Number Is Completed Here===========================================================================================================================================================================================================

			//========================================Steps To Revert Settings In General System Parameter Setup Page Is Started Here================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite22GenSysParaSetupsettings","RMA_Suite22_Utility",0)+" To Successfully Revert Settings On General System Parameter Setup Page");
			testcall3 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite22_Utility("RMA_QTPRegression_TC_021_UnCheck", logval1);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Revert Settings In General System Parameter Setup Page Is Completed Here================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite22_Utility" + " " +  "To Do Parameter Settings For Suite22 And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "To Create A New Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite22_Utility" + " " +  "To Revert Parameter Settings For Suite22 And Hence The Test Case Is A Fail");
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
