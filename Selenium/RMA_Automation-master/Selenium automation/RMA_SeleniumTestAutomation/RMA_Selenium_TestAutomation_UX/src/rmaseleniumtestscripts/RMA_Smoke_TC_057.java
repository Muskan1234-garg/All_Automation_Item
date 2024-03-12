package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_057
//Description    : Successful Creation Of Auto Check Of 5 Split Through Financial Reserves Schedule Check Button on Carrier Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_053
//Revision       : 0.0 - NidhiJha-11-06-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_057 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_057_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_057";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_057_AutoCheckOnCarrierClaimCreation", "Successful AutoCheck On Carrier Claim Creation , Successful Creation Of Auto Check Of 5 Split Through Financial Reserves Schedule Check Button on Carrier Claim Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String strautocontrolNumber;
			String ScheduleCheckCreation_Lst_BankAccount;
			String ScheduleCheckCreation_Lst_PayeeType;
			String ScheduleCheckCreation_Lst_TransactionType;
			int  ScheduleCheckCreation_Txt_Amount;
			int ScheduleCheckCreation_Txt_NoOfPayments;
			//Local Variable Declaration Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			ScheduleCheckCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_057", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_057
			ScheduleCheckCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_057", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_057
			ScheduleCheckCreation_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_057", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_057
			ScheduleCheckCreation_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_057", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_057
			ScheduleCheckCreation_Txt_NoOfPayments = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_057", 1, 4); //Amount Is Fetched From DataSheet RMA_Smoke_TC_057
			//Schedule Check Data Fetch Is Done

								
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Grid Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Selection Of First Row In Reserve Grid", logval);
			//The Created Reserve Is Selected


			//=============================================================Steps To Create Auto Check On The Created Carrier General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ScheduleCheckOnCarrierGCClaim","RMA_CarrierScheduleCheckCreation",0)+" To Create Schedule Check On Carrier GC Claim");
			testcall1 = true;
			strautocontrolNumber = RMA_Functionality_Utility.RMA_CarrierScheduleCheckCreation(ScheduleCheckCreation_Txt_NoOfPayments, ScheduleCheckCreation_Lst_BankAccount, ScheduleCheckCreation_Lst_PayeeType,ScheduleCheckCreation_Lst_TransactionType,ScheduleCheckCreation_Txt_Amount,logval1);
			parentlogger.log(LogStatus.INFO, "Auto Check With Control Number::"+ " " + color.RMA_ChangeColor_Utility(strautocontrolNumber, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Create Auto Check On The Created Carrier General Claim Is Ended Here===================================================================================================================================================================================================================


		}
		catch(Exception|Error e)
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
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CarrierScheduleCheckCreation" + " To Create Auto Check Of 5 Split Through Financial Reserves Schedule Check Button on Carrier Claim Successfully" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
			try {
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

