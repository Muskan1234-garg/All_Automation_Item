package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_044
//Description    : Successfully Print Summary Verification on Collection Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009, RMA_Smoke_TC_014
//Revision       : 0.0 - RenuVerma-01-23-2016 
//=================================================================================================

public class RMA_Smoke_TC_044 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_044_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_044_Print Summary On Collection Screen", "Successfully Print Summary Verification on Collection Screen Is Validated");
			parentlogger.assignAuthor("Renu Verma");
			
			String StrCtrlNumberActual;
			String VerificationText;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_044";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
	
			//===============================================Search Of Control No. Created In Smoke_TC_014 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver)," Search-->Funds Criteria Page","Control Number Text Box",RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014,RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014,"fundsTransaction","num",2, logval);
			StrCtrlNumberActual = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014, StrCtrlNumberActual, "Control Number Value Verification", logval);
			//===============================================Search Of Control No. Created In Smoke_TC_014 Is Completed=====================================================================================================
		
			//===============================================Steps To Do Verification Of Print Summary On Payment Screen Is Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintSummary", "RMA_PrintSummary_Utility",0)+" Is Called To Do Print Summary");
			testcall1 = true;
			VerificationText="Collection;"+RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014+";"+String.valueOf(RMA_Smoke_TC_014.FundsSplitDetails_Txt_Amount_Smoke_TC_014);
			RMA_Functionality_Utility.RMA_PrintSummary_Utility(VerificationText, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Print Summary Verification On Collection Screen Done Successfully For Control No:"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014, 3));
			parentlogger.appendChild(logger);
			//================================================Steps To Do Verification Of Print Summary On Payment Screen Is Completed Here============================================================================================================================================================================================================================================================
			
		} catch (Exception|Error e) {
			
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
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PrintSummary_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
	}
