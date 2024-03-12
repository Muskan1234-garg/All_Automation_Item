package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_056
//Description    : Successful First And Final Payment Creation On The Created Carrier General claim Is Validated
//Depends On TC  : RMA_Smoke_TC_053
//Revision       : 0.0 - NidhiJha-10-31-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_056 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_056_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_056";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed


		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_056_First And Final Payment Creation", "Successful First And Final Payment Creation , Successful First And Final Creation On The Created Carrier General claim Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String StrControlNumber;
			String FinalPaymentCreation_Lst_BankAccount;
			String FinalPaymentCreation_Lst_PayeeType;
			String FinalFundsSplitDetails_Lst_TransactionType;
			String FinalPaymentCreation_Lst_Losstype;
			String FinalPaymentCreation_Lst_CoverageType;
			String FinalPaymentCreation_Lst_Policy;
			String FinalPaymentCreation_Lst_DetailedTrackingClaimant;
			String FinalPaymentCreation_Txt_LastName;
			String FinalPaymentCreation_Lst_Unit;
			int FinalFundsSplitDetails_Txt_Amount;
			//Local Variable Declaration Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			FinalPaymentCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalFundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalFundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_056", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Lst_Losstype = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 4); //Loss Type Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Lst_CoverageType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 5); // Coverage Type Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Lst_Policy = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 6); // Policy Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Lst_Unit = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 7); // Unit Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 8); // Coverage Type Is Fetched From DataSheet RMA_Smoke_TC_056
			FinalPaymentCreation_Lst_DetailedTrackingClaimant = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_056", 1, 9); // Coverage Type Is Fetched From DataSheet RMA_Smoke_TC_056
			//Final Payment Data Fetch Is Done
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			
			//=============================================================Steps To Add Payment For Created General Claim Is Started Here===========================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("FirstFinalPaymentAddition","RMA_FirstFinalPaymentCorpAddition_Utility",0)+" To Create First And Final Payment");
			testcall1 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_FirstFinalPaymentCorpAddition_Utility(FinalPaymentCreation_Lst_BankAccount, FinalPaymentCreation_Lst_PayeeType, FinalFundsSplitDetails_Lst_TransactionType,FinalFundsSplitDetails_Txt_Amount,FinalPaymentCreation_Lst_Policy,FinalPaymentCreation_Lst_Unit,FinalPaymentCreation_Lst_CoverageType,FinalPaymentCreation_Lst_Losstype,FinalPaymentCreation_Lst_DetailedTrackingClaimant,FinalPaymentCreation_Txt_LastName,logval1);
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Add Payment For Created General Claim Is Completed Here=========================================================================================================================================================================================================================================================================


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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_FirstFinalPaymentCorpAddition_Utility" + " To Create A First And Final Payment On The Created Carrier GC Claim Successfully" +  "And Hence The Test Case Is A Fail");
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
				//Thread.sleep(5000);
				// RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On Event Creation Page", logval);
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

