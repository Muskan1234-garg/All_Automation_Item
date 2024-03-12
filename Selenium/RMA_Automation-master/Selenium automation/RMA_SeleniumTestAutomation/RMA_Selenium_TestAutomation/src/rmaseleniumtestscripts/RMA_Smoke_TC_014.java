package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_014
//Description    : Successful Collection Addition Is Validated
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009
//Revision       : 0.0 - ImteyazAhmad-07-15-2016 
//=================================================================================================
public class RMA_Smoke_TC_014 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrControlNumber_Smoke_TC_014;
	public static int FundsSplitDetails_Txt_Amount_Smoke_TC_014;

@Test 
public void RMA_Smoke_TC_014_Test() throws Exception, Error
{
	try {
		parentlogger = reports.startTest("RMA_Smoke_TC_014_Collection Creation", "Successful Collection Addition Is Validated");
		String RMAApp_Collection_Lst_BankAccount;
		String RMAApp_Collection_Lst_PayeeType;
		String RMAApp_FundsSplitDetails_Lst_TransactionType;
		String RMAApp_Collection_Txt_LastName;
		String RMAApp_Collection_Txt_DisType;
		String ExpCheckStatus;
		String ActualCheckStatus;
		String CurrentFrameID;
		//Local Variable Declaration
		
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "RMA_Smoke_TC_014";
				
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Collection_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_014
		RMAApp_Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_014
		RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_014
		FundsSplitDetails_Txt_Amount_Smoke_TC_014= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_014", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
		RMAApp_Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_014
		RMAApp_Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_014
		
		
		
		/*===========================================================Creation Of Collection Is Started Here================================================*/
		ExpCheckStatus = "R Released";
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On" + " "+"Transaction Screen"+ " ", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
		parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AddCollection","RMA_AddNewCollection_Utility",0)+" Is Called To Create A Collection");
		testcall1 = true;
		StrControlNumber_Smoke_TC_014 = RMA_Functionality_Utility.RMA_AddNewCollection_Utility(RMAApp_Collection_Lst_BankAccount, RMAApp_Collection_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_Amount_Smoke_TC_014, RMAApp_Collection_Txt_LastName, RMAApp_Collection_Txt_DisType, logval1);
		parentlogger.log(LogStatus.INFO, "A Collection Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_Smoke_TC_014, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Creation Of Collection Is Completed ================================================*/
		
		ActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, ActualCheckStatus,"Check Status Value", logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_BackToFinancials(driver), "Back To Financial Image On Transaction Page",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Back To Financials Image Is Clicked");
	
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_AddNewCollection_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		driver.switchTo().parentFrame();
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
