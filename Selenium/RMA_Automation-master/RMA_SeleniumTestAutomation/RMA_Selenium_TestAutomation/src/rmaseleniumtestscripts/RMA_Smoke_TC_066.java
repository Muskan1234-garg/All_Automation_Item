package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_BankAccount;
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
//TestCaseID     : RMA_TC_066
//Description    : Successful Add,Edit And Delete Of New Bank Account On Funds -->Bank Account Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-17-2016 
//=================================================================================================

public class RMA_Smoke_TC_066 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_066_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_066_ Add, Edit Delete a Bank Account", " Successful Add,Edit And Delete Of New Bank Account On Funds -->Bank Account Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			int StrBankAccountNo;
			String StrBankAddr1;
			String  StrBankCity;
			String StrBankOwner;
			String CurrentFrameID;
			String StrPrimaryWindowHandle;
			String  StrAccountType;
			String StrBankState;
			String  StrAccountTypeChanged;
			String StrBankAccountNameChanged;
			String StrAccountName;
			int StrNextCheck;
			int StrEditedNextCheck;
			int StrZipCode;						
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_066";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2= false;	
			loggerval2= "NotInitialized";
			testcall3 = false;	
			loggerval3= "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData Is Fetched To Retrieve Data
			StrBankAddr1   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 0); // Address1 Type Is Fetched From DataSheet RMA_TC_066
			StrBankCity  =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 1); // BankCity Is Fetched From DataSheet RMA_TC_066
			StrBankState=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 2); // Bank State Is Fetched From DataSheet RMA_TC_066
			StrZipCode=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_066", 1, 3); // Zip Code Is Fetched From DataSheet RMA_TC_066
			StrAccountType=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 4); // Bank Account Type Is Fetched From DataSheet RMA_TC_066
			StrAccountName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 5); // Account Name Is Fetched From DataSheet RMA_TC_066
			StrNextCheck=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_066", 1, 6); // Next Check Is Fetched From DataSheet RMA_TC_066
			StrBankOwner=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 7); // Bank Owner Is Fetched From DataSheet RMA_TC_066
			StrEditedNextCheck=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_066", 1, 8); // Edited Next Check  Is Fetched From DataSheet RMA_TC_066
			StrAccountTypeChanged=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 9); // Edited Bank Account Type Is Fetched From DataSheet RMA_TC_066
			StrBankAccountNameChanged=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_066", 1, 10); // Edited Bank Account Name Is Fetched From DataSheet RMA_TC_066
		
			/*==============================================Add New Bank Account Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink( "BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" Is Called To Create A Bank Account ");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create",StrBankAddr1, StrBankCity, StrBankState, StrZipCode, StrAccountName, StrAccountType, StrNextCheck, StrBankOwner, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrBankAccountNo= Integer.parseInt(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_BankAccNo(driver).getAttribute("value"));
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Bank Account Is Added", StrScreenShotTCName)));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			/*================================================Add New Bank Account Is Completed Here=======================================*/

			/*=================================================Edit Bank Account Is Started Here================================*/
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Bank Account", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), String.valueOf(StrBankAccountNo), "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			parentlogger.log(LogStatus.INFO,"The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink( "BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" Is Called To Edit Created Bank Account ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Edit", "NA", "NA", "NA", 00, StrBankAccountNameChanged, StrAccountTypeChanged, StrEditedNextCheck, "NA", false, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Bank Account Is Edited", StrScreenShotTCName)));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			/*=================================================Edit  Bank Account Is Completed Here=============================================*/

			/*=================================================Deletion Of Bank Account Is Started Here================================================*/
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), String.valueOf(StrBankAccountNo), "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete A Bank Account : " +" "+ color.RMA_ChangeColor_Utility(String.valueOf(StrBankAccountNo), 3));
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Bank Account Page", logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(StrBankAccountNo), 3));
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);
			RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameID);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, String.valueOf(StrBankAccountNo)), StrBankAccountNo+" Link On Bank Account Lookup Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);		
			/*================================================Deletion Of New Bank Account Is Completed Here================================================*/

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

