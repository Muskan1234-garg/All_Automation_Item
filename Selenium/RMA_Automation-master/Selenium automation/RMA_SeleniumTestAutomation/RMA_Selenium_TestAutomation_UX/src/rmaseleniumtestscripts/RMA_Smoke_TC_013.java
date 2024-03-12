package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed


//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_013
//Description    : Transaction History Displays All The Transactions Are Validated
//Depends On TC  : RMA_Smoke_TC_002,RMA_Smoke_TC_009, RMA_Smoke_TC_011, RMA_Smoke_TC_014
//Revision       : 0.0 - RenuVerma-07-06-2017 
//=================================================================================================
public class RMA_Smoke_TC_013 extends rmaseleniumtestscripts.RMA_TC_BaseTest{

	@Test 
	public void RMA_Smoke_TC_013_Test() throws Exception, Error
	{
		StrScreenShotTCName = "RMA_Smoke_TC_013";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed Here
		try {
			parentlogger = reports.startTest("RMA_Smoke_TC_013_Correct Values In Transaction History", "Transaction History Displays All The Transactions Related Data Is Validated");	
			parentlogger.assignAuthor("Renu Verma");

			String ReserveType;
			int FundsSplitDetails_Txt_AmountForPayment;
			String Payment_FundsSplitDetails_Lst_TransactionType;
			String Payment_Txt_LastName;
			String Payment_Txt_DisType;
			String Collection_FundsSplitDetails_Lst_TransactionType;
			String Collection_Txt_LastName;
			String Collection_Txt_DisType;
			int FundsSplitDetails_Txt_AmountForCollection;
			String []ExpectedColHeadersForPayHisToBeVerified;
			String []ExpectedValuesForPayToBeVerified;
			String []ExpectedColHeadersForCollHisToBeVerified;
			String []ExpectedValuesForCollToBeVerified;

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data 
			
			ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
			
			FundsSplitDetails_Txt_AmountForPayment = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_011", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_011
			Payment_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_011
			Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_011
			Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_011
			ExpectedColHeadersForPayHisToBeVerified=new String[]{"Split Amount","Payee","Type","Transaction Type","Distribution Type", "Reserve Type"};		// Column Header Name For NG Grid Verification 
			ExpectedValuesForPayToBeVerified=new String[]{ "$"+FundsSplitDetails_Txt_AmountForPayment+ ".00", Payment_Txt_LastName,"Payment",Payment_FundsSplitDetails_Lst_TransactionType, Payment_Txt_DisType,ReserveType};	// Column Value For NG Grid Verification
			
			FundsSplitDetails_Txt_AmountForCollection= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_014", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
			Collection_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_014
			Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_014
			Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_014
			ExpectedColHeadersForCollHisToBeVerified=new String[]{"Split Amount","Payee","Type","Transaction Type","Distribution Type", "Reserve Type"};		// Column Header Name For NG Grid Verification 
			ExpectedValuesForCollToBeVerified=new String[]{ "$"+FundsSplitDetails_Txt_AmountForCollection+ ".00", Collection_Txt_LastName,"Collection",Collection_FundsSplitDetails_Lst_TransactionType, Collection_Txt_DisType,ReserveType};	// Column Value For NG Grid Verification

			//===========================Steps Navigate Transaction History Screen Is Started Here===================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Img_TransactionHistory(driver), "Transaction History Image On Payments Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ClaimInvolvement);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid		
			//===========================Steps Navigate Transaction History Screen Is Completed Here===================================================================================================================================================================================================================================

			//===========================Steps To Verify Payment Values In Transaction History NG Grid Is Started===========================================================================================================================================================================================================
			if(RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011!=null)
				RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011, "Transcation History UX Grid",ExpectedColHeadersForPayHisToBeVerified, ExpectedValuesForPayToBeVerified,logval);
			else if(RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011==null)
				parentlogger.log(LogStatus.INFO, "Payment History Is Not Available on Transction History UX Grid ");
			//===========================Steps To Verify Payment Values In Transaction History NG Grid Is Completed=========================================================================================================================================================================================================

			//===========================Steps To Verify Collection Values In Transaction History NG Grid Is Started===========================================================================================================================================================================================================
			if(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014!=null)
				RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014, "Transcation History UX Grid",ExpectedColHeadersForCollHisToBeVerified, ExpectedValuesForCollToBeVerified,logval);
			else if(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014==null)
				parentlogger.log(LogStatus.INFO, "Collection History Is Not Available on Transction History UX Grid ");
			//===========================Steps To Verify Collection Values In Transaction History NG Grid Is Completed=========================================================================================================================================================================================================

		} catch (Exception|Error e) {
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Un-Handled Exception And Print Log Of It
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
				/*driver.switchTo().parentFrame();
				Thread.sleep(5000);
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);*/
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_CancelCloseButton(driver), "Close Image Button On Transaction History Page", logval);
				
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
				Thread.sleep(3000);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
