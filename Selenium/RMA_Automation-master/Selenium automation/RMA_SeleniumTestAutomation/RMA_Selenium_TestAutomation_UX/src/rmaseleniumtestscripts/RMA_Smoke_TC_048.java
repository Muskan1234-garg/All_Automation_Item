package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_048
//Description    : Print Preview Working On Collection Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-10-25-2017
//ModifiedBy     : 0.0-KumudNaithani--10-27-2017- Claim Creation, Web Page Refresh Steps Were Deleted, Variable Name Were Corrected From Payment Creation Type To Collection Creation
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_048 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Smoke_TC_048_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_048";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		//Global Variable Initialization Is Completed Here

		try{

			parentlogger = reports.startTest("RMA_Smoke_TC_048_Print_Preview_On_Collection_Screen_Validation","Print Preview Functionality On Collection Screen Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String GenClaimCreation_Txt_Department;
			String CollectionCreation_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String CollectionCreation_Txt_LastName;
			String CollectionCreation_Txt_DisType;
			String CollectionCreation_Txt_ReserveType;
			int FundsSplitDetails_Txt_Amount;
			String CollectionCreation_Lst_BankAccountName;
			Object[] ContentToBeVerified;
			String StrControlNumber;
			//Local Variable Declaration Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 IS Fetched To Retrieve Data 
			CollectionCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 3); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_040
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 4); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_040
			CollectionCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 5); //LastName Is Fetched From DataSheet RMA_Smoke_TC_040
			CollectionCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 6); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_040
			CollectionCreation_Txt_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 7); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_040
			FundsSplitDetails_Txt_Amount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_040", 1, 8);//Funds Split Details Amount Is Fetched From DataSheet RMA_Smoke_TC_040
			CollectionCreation_Lst_BankAccountName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1, 9);//Bank Account Name Is Fetched From DataSheet RMA_Smoke_TC_040
			//Payment Data Fetch From Excel WorkBook Is Completed Here

			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_040", 1,1 ); //Department Is Fetched From DataSheet RMA_Smoke_TC_040
			//Claim Department Is Fetched From Excel Sheet As Required For PDF Verification
			
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			//========================================Steps To Navigate To Financials/Reserves Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//========================================Steps To Navigate To Financials/Reserves Page Is Completed Here============================================================================================================================================================================================================

			//========================================Steps To Create Collection On Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ConditionalCollectionCorpAddition","RMA_ConditionalCollectionCorpAddition_Utility",0)+" Is Called To Create A Collection ");
			testcall2 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_CollectionCorpAddition_Utility(CollectionCreation_Lst_BankAccountName, CollectionCreation_Lst_PayeeType, CollectionCreation_Txt_ReserveType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount, CollectionCreation_Txt_LastName, CollectionCreation_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "New Collection With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Collection On Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Print Preview On The Created Collection Is Started Here===========================================================================================================================================================================================================================================================
			ContentToBeVerified=new Object[]{StrClaimNumber,GenClaimCreation_Txt_Department,CollectionCreation_Txt_LastName,"$" + FundsSplitDetails_Txt_Amount + ".00"};
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintPreview","RMA_PrintPreviewUtility",0)+" To Print Preview For The Created Payment");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PrintPreviewUtility("Payments","abk",ContentToBeVerified,logval1);
			parentlogger.log(LogStatus.INFO, "Print Preview For For Payment With Control NUmber:"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Print Preview On The Created Collection Is Completed Here===========================================================================================================================================================================================================================================================

								
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create  New General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CollectionCorpAddition_Utility" + " " +  "To Create Collection On Created General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}

			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PrintPreviewUtility" + " " +  "To Create Print Preview On Created Payment And Hence The Test Case Is A Fail");
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
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_CloseDownloadBarButton(), "Close Button On Chrome Download Bar", logval);// Close the Download Bar Of Chrome
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


