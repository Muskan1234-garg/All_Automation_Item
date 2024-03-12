package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_BankAccount;
import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_075
//Description    : RMA_Smoke_TC_075_Successfully Create and Edit A Sub Bank Account
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-09-14-2016
//=================================================================================================

public class RMA_Smoke_TC_075 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static 	int StrEditedSubBankAccountNumber_075;
	static 	int StrBankAccountNumber_075;
	static String StrEditedSubBankAccountName_075;
	
	@Test
	public void RMA_Smoke_TC_075_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_075_Create And Edit A Sub Bank Account", "Successfully Create And Edit A Sub Bank Account ");
			parentlogger.assignAuthor("Renu Verma");

			String StrBankAccountName;
			String StrBankAddr1;
			String  StrBankCity;
			int StrZipCode;
			String  StrAccountType;
			String StrBankState;
			String StrAccountName;
			int StrNextCheck;
			String StrBankOwner;
			String CurrentFrameID;
			String StrPrimaryWindowHandle;
			String StrSubAccountName;
			int StrSubBankAccountNumber;
			int StrSubBankAccountMinBal;
			int StrSubBankAccountTargetBal;
			String StrSubBankAccountOwner;
			String StrSubBankAccountLOB;
				
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_075";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
			testcall3 = false;
			loggerval3 = "NotInitialized";
		
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData.xlsx Is Fetched To Retrieve Data
			StrBankAddr1   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 0); // Address1 Type Is Fetched From DataSheet RMA_TC_075
			StrBankCity  =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 1); // BankCity Is Fetched From DataSheet RMA_TC_075
			StrBankState=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 2); // Bank State Is Fetched From DataSheet RMA_TC_075
			StrZipCode=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 3); //Zip Code Is Fetched From DataSheet RMA_TC_075
			StrAccountType=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 4); // Bank Account Type Is Fetched From DataSheet RMA_TC_075
			StrAccountName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 5); // Account Name Is Fetched From DataSheet RMA_TC_075
			StrNextCheck=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 1, 6); // Next Check Is Fetched From DataSheet RMA_TC_075
			StrBankOwner=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 1, 7); // Bank Owner Is Fetched From DataSheet RMA_TC_075
		
			StrSubBankAccountMinBal=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 5, 0); //Minimum Bal Is Fetched From DataSheet RMA_Smoke_TC_075
			StrSubBankAccountTargetBal=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_075", 5, 1); // Target Bal Is Fetched From DataSheet RMA_Smoke_TC_075
			StrSubBankAccountOwner=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 5, 2); // Sub Bank Account Owner Is Fetched From DataSheet RMA_Smoke_TC_075
			StrSubBankAccountLOB=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_075", 5, 3); // Sub Bank Account LOB Is Fetched From DataSheet RMA_Smoke_TC_075
			
			//======================================================= Enable Setting Of Sub Bank Account On General System Parameter Page Is Started ================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Funds Settings", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(driver), "check", "Use Sub Bank Accounts Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(driver), "check", "Use Account Owner for Funds Checkbox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//======================================================= Enable Setting Of Sub Bank Account On General System Parameter Page Is Ended ================================================
			
			/*=======================================================Creation Of Sub Bank Account On Any Existing Bank Account Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO,"The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount", "RMA_BankAccount_Addition_Utility",0)+ " Is Called To Create An Bank Account ");
			testcall1 = true;
			StrBankAccountName = RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create",StrBankAddr1, StrBankCity, StrBankState, StrZipCode, StrAccountName, StrAccountType, StrNextCheck, StrBankOwner, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Bank Account Is Created Successfully With Bank Account Name::"+ " " + color.RMA_ChangeColor_Utility(StrBankAccountName, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Bank Account Is Added", StrScreenShotTCName)));
			StrBankAccountNumber_075=Integer.parseInt(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver).getAttribute("value"));
			parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SubBankAccount", "RMA_SubBankAccount_AddEdit_Utility",0)+ " Is Called To Create A SubBank Account ");
			testcall2 = true;
			StrSubAccountName = RMA_Functionality_Utility.RMA_SubBankAccount_AddEdit_Utility("Create", StrSubBankAccountMinBal, StrSubBankAccountTargetBal, StrSubBankAccountOwner, StrSubBankAccountLOB, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			StrSubBankAccountNumber=Integer.parseInt(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountNumber(driver).getAttribute("value"));
			parentlogger.log(LogStatus.INFO, "New SubBank Account Is Created Successfully With Sub Account Name::"+ " " + color.RMA_ChangeColor_Utility(StrSubAccountName, 3));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			/*=======================================================Creation Of Sub Bank Account On Any Existing Bank Account Is Ended Here================================================*/
			
			/*=======================================================Edit Sub Bank Account On Any Existing Bank Account Is Started Here================================================*/
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			CurrentFrameID="Bank Account";
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(StrBankAccountNumber_075), " Bank Account Lookup Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_BankAccount.RMAApp_BankAccount_Img_SubAccounts(driver), "Sub Bank Account Image on Maintenance-->Bank Account Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Sub Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(StrSubBankAccountNumber), " Sub Bank Account Lookup Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SubBankAccount", "RMA_SubBankAccount_AddEdit_Utility",0)+ " Is Called To Edit A SubBank Account ");
			testcall3 = true;
			StrEditedSubBankAccountName_075 = RMA_Functionality_Utility.RMA_SubBankAccount_AddEdit_Utility("Edit", 00, 00, "NA", "NA", false, logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			StrEditedSubBankAccountNumber_075=Integer.parseInt(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_SubAccountNumber(driver).getAttribute("value"));
			parentlogger.log(LogStatus.INFO, "SubBank Account Is Edited Successfully With Sub Account Name::"+ " " + color.RMA_ChangeColor_Utility(StrEditedSubBankAccountName_075, 3));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			/*=======================================================Edit Sub Bank Account On Any Existing Bank Account Is Ended Here================================================*/
			
				
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_BankAccount_Addition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_SubBankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_SubBankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

