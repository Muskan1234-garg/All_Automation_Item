package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed


//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_014
//Description    : Successful Collection Addition On Corporate Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009,RMA_Smoke_TC_011,RMA_Smoke_TC_011GridVerification
//Revision       : 0.0 - RenuVerma-06-20-2017 
//=================================================================================================
public class RMA_Smoke_TC_014 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	
	public static String StrControlNumber_Smoke_TC_014;
	//Global Variable Declaration Completed Here
	
@Test 
public void RMA_Smoke_TC_014_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "RMA_Smoke_TC_014";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed Here
	
	try {
		parentlogger = reports.startTest("RMA_Smoke_TC_014_Collection Creation On Corporate Claim", "Successful Collection Addition On Corporate Claim Is Validated");
		parentlogger.assignAuthor("Renu Verma");
		String Collection_Lst_BankAccount;
		String Collection_Lst_PayeeType;
		String FundsSplitDetails_Lst_TransactionType;
		String Collection_Txt_LastName;
		String Collection_Txt_DisType;
		int FundsSplitDetails_Txt_AmountForCollection;
		String ReserveType;
		//Local Variable Declaration Completed Here
				
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		Collection_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_014
		Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_014
		FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_014
		FundsSplitDetails_Txt_AmountForCollection= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_014", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
		Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_014
		Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_014
		ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
		//Local Variable Initialization Completed Here	
		
		/*===========================================================Creation Of Collection Is Started Here=====================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//Thread.sleep(2000);
		//driver.switchTo().parentFrame();	
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);
		//RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
		//RMA_Input_Utility.RMA_JavaScriptSetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
		//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Financial Reserve Row On Reserve Table", logval);
		parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AddNewCollection","RMA_CollectionCorpAddition_Utility",0)+" Is Called To Create A Collection");
		testcall1 = true;
		StrControlNumber_Smoke_TC_014 = RMA_Functionality_Utility.RMA_CollectionCorpAddition_Utility(Collection_Lst_BankAccount, Collection_Lst_PayeeType, ReserveType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_AmountForCollection, Collection_Txt_LastName, Collection_Txt_DisType, logval1);
		parentlogger.log(LogStatus.INFO, "A Collection Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_Smoke_TC_014, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Creation Of Collection Is Completed Here ===================================================================================================================================================*/
			
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_CollectionCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}
