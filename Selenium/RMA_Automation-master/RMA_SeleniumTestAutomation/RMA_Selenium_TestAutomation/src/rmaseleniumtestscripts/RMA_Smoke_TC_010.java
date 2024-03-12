package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_ScheduleCheck;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_010
//Description    : RMA_Smoke_TC_010_Create Auto Check of 5 split through Financial Reserve Schedule Check
//Depends On TC  : RMA_Smoke_TC_002_(Any LOB), RMA_Smoke_TC_009
//Revision       : 0.0 - ImteyazAhmad-07-08-2016 
//=================================================================================================

public class RMA_Smoke_TC_010 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_Smoke_TC_010_Test() throws Exception,Error {
		

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_010_Schedule Check Creation", "Verify User Can Create Schedule Check Of 5 Split Successfully Through Financial Reserve");
			parentlogger.assignAuthor("Imteyaz Ahmad");
			
			String RMAApp_ScheduleCheck_Txt_PayInterval;
			int RMAApp_ScheduleCheck_Txt_NumberOfPayment;
			String RMAApp_ScheduleCheck_Lst_BankAccount;
			String RMAApp_ScheduleCheck_Lst_PayeeType;
			String RMAApp_ScheduleCheck_Txt_DisType;
			String RMAApp_PaymentDetails_Lst_TransactionType;
			int RMAApp_PaymentDetails_Txt_Amount;
			String RMAApp_PayeeLastName;
			String StrAutoControlNumber_Smoke_010;

			testcall1 = false;			
			loggerval1 = "NotInitialized";
			StrScreenShotTCName = "RMA_Smoke_TC_010";

			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
			RMAApp_ScheduleCheck_Txt_PayInterval = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_010", 1, 0); // PayInterval Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_ScheduleCheck_Txt_NumberOfPayment = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_010", 1, 1);//NumberOfPayment Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_ScheduleCheck_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_010", 1, 2); // BankAccount Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_ScheduleCheck_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_010", 1, 3); // PayeeType Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_ScheduleCheck_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_010", 1, 4); // DistributionType Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_PaymentDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_010", 1, 5); // TransactionType Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_PaymentDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_010", 1, 6);//Amount Is Fetched From DataSheet RMA_Smoke_TC_010
			RMAApp_PayeeLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Payee_TC_010");
			
			//ScheduleCheck Creation Method Is Called
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ScheduleCheck" ,"RMA_ScheduleCheckCreation",0)+" Is Called To Create Schedule Check Of 5 Split");
			testcall1 = true;
			StrAutoControlNumber_Smoke_010 = RMA_Functionality_Utility.RMA_ScheduleCheckCreation(RMAApp_ScheduleCheck_Txt_PayInterval, RMAApp_ScheduleCheck_Txt_NumberOfPayment, RMAApp_ScheduleCheck_Lst_BankAccount, RMAApp_ScheduleCheck_Lst_PayeeType, RMAApp_ScheduleCheck_Txt_DisType, RMAApp_PaymentDetails_Lst_TransactionType, RMAApp_PaymentDetails_Txt_Amount, RMAApp_PayeeLastName,false,logval1);
			parentlogger.log(LogStatus.INFO, "ScheduleCheck Of 5 Split Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrAutoControlNumber_Smoke_010, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Schedule Check Creation Is Successfull", StrScreenShotTCName)));
			//Schedule Check Creation Is Over
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Img_BackToFinancials(driver), "Back To Financials Image On ScheduleCheck Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver)));
		
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

			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))

				if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
				{
					logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_ScheduleCheckCreation" + " " +  "And Hence The Test Case Is A Fail");
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

