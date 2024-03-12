package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_075
//Description    : Payment For Persons Involved Using Sub Bank Account Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-10-09-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_075 extends RMA_TC_BaseTest {

	@Test
	public void RMA_QTPRegression_TC_075_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_075_Payment For Persons Involved Using Sub Bank Account", "Payment For Persons Involved Using Sub Bank Account Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_075";
			ErrorMessage = null;
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================

			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================				
			String PaymentCreation_Lst_BankAccount;
			String PaymentCreation_Lst_PayeeType;
			String ReserveCreation_Lst_ReserveType;
			String FundsSplitDetails_Lst_TransactionType;
			int FundsSplitDetails_Txt_Amount;			
			String PaymentCreation_Txt_DisType;
			String StrControlNumber;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
					
			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite19_QTPRegression_08.xlsx"); //Excel WorkBook RMA_Suite19_QTPRegression_08 IS Fetched To Retrieve Data 
			PaymentCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_075", 1, 0); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_075
			PaymentCreation_Lst_PayeeType =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_075", 1, 1); //Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_075
			ReserveCreation_Lst_ReserveType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_075", 1, 2); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_075
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_075", 1, 3); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_075
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_075", 1, 4); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_075			
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_075", 1, 5); //DisType Is Fetched From DataSheet RMA_QTPRegression_TC_075			
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			
			//Region =====================================================Steps To Add Payment For Created Claim Is Started Here==========================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentCorpAddition","RMA_PaymentCorpAddition_Utility",0)+" Is Called To Create A Payment ");
			testcall1 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_PaymentCorpAddition_Utility(PaymentCreation_Lst_BankAccount, PaymentCreation_Lst_PayeeType, ReserveCreation_Lst_ReserveType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, "NA", PaymentCreation_Txt_DisType, logval1);			
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);		
			//EndRegion ==================================================Steps To Add Payment For Created Claim Is Completed Here=======================================================================================================================================================================================
					
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

