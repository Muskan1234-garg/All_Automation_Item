package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_049
//Description    : RMA_Smoke_TC_049_Successful Schedule Check Creation On Carrier Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_045_GC/RMA_Smoke_TC_045_WC, RMA_Smoke_TC_046,RMA_Smoke_TC_047,RMA_Smoke_TC_048
//Revision       : 0.0 - RenuVerma-09-23-2016 
//=================================================================================================

public class RMA_Smoke_TC_049 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_Smoke_TC_049_Test() throws Exception,Error {
	
		try{
			parentlogger = reports.startTest("Smoke_TC_049_Schedule Check Creation On Carrier Claim", "Successful Schedule Check Creation On Carrier Claim Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String ScheduleCheck_Txt_PayInterval;
			int ScheduleCheck_Txt_NumberOfPayment;
			String ScheduleCheck_Lst_BankAccount;
			String ScheduleCheck_Lst_PayeeType;
			String ScheduleCheck_Txt_DisType;
			String PaymentDetails_Lst_TransactionType;
			int PaymentDetails_Txt_Amount;
			String StrAutoControlNumber_Smoke_049;
			Calendar FinalScheduleCheck_FinalPayment ;
			String FinalScheduleCheck_FinalPayment_Date;

			testcall1 = false;			
			loggerval1 = "NotInitialized";
			StrScreenShotTCName = "RMA_Smoke_TC_049";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_03 Is Fetched To Retrieve Data
			ScheduleCheck_Txt_PayInterval = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 0); // PayInterval Is Fetched From DataSheet RMA_TC_049
			ScheduleCheck_Txt_NumberOfPayment = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_049", 1, 1);//NumberOfPayment Is Fetched From DataSheet RMA_TC_049
			ScheduleCheck_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 2); // BankAccount Is Fetched From DataSheet RMA_TC_049
			ScheduleCheck_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 3); // PayeeType Is Fetched From DataSheet RMA_TC_049
			ScheduleCheck_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 4); // DistributionType Is Fetched From DataSheet RMA_TC_049
			PaymentDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_049", 1, 5); // TransactionType Is Fetched From DataSheet RMA_TC_049
			PaymentDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_049", 1, 6);//Amount Is Fetched From DataSheet RMA_Smoke_TC_049
			FinalScheduleCheck_FinalPayment = Calendar.getInstance();
			FinalScheduleCheck_FinalPayment.setTime(new Date()); // Now use today date.
			FinalScheduleCheck_FinalPayment.add(Calendar.MONTH, 4);
			FinalScheduleCheck_FinalPayment_Date = new SimpleDateFormat("MM/dd/yyyy").format(FinalScheduleCheck_FinalPayment.getTime());
							
			//ScheduleCheck Creation Method Is Called
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Tbl_ReserveNGGrid(driver, "Reserve Type"), "Financial Reserve Row On Reserve Table", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ScheduleCheck","RMA_ScheduleCheckCreation",0)+" Is Called To Create Schedule Check Of 5 Split");
			driver.switchTo().parentFrame();
			testcall1 = true;
			StrAutoControlNumber_Smoke_049 = RMA_Functionality_Utility.RMA_ScheduleCheckCreation(ScheduleCheck_Txt_PayInterval, ScheduleCheck_Txt_NumberOfPayment, ScheduleCheck_Lst_BankAccount, ScheduleCheck_Lst_PayeeType, ScheduleCheck_Txt_DisType, PaymentDetails_Lst_TransactionType, PaymentDetails_Txt_Amount,"NA",false,logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "ScheduleCheck Of 5 Split Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrAutoControlNumber_Smoke_049, 2)+" Is Done");
			String FinalScheduleCheck_FinalPayment_Date_Actual = RMA_POM_ScheduleCheck.RMAApp_ScheduleCheck_Txt_FinalPayment(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(FinalScheduleCheck_FinalPayment_Date, FinalScheduleCheck_FinalPayment_Date_Actual, "Final Payment Date On Schedule Check Screen", logval);		
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

