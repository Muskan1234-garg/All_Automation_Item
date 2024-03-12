package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_042
//Description    : Verify Print Preview Functionality Working on Collection Screen Successfully
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009, RMA_Smoke_TC_014
//Revision       : 0.0 - RenuVerma-01-23-2017 
//=================================================================================================

public class RMA_Smoke_TC_042 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_042_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_042_Print Preview On Collection Screen", "Verify Print Preview Functionality Working on Collection Screen Successfully");
			parentlogger.assignAuthor("Renu Verma");
			
			String StrCtrlNumberActual;
			String RMAApp_Login_Txt_Password;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_042";
			testcall1 = false;	
			loggerval1 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
			
			//===============================================Search Of Control No. Created In Smoke_TC_014 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver)," Search-->Funds Criteria Page","Control Number Text Box",RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014,RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014,"fundsTransaction","num",2, logval);
			StrCtrlNumberActual = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014, StrCtrlNumberActual, "Control Number Value Verification", logval);
			//===============================================Search Of Control No. Created In Smoke_TC_014 Is Completed=====================================================================================================
		
			//===========================================================Steps To Do Print Preview On Collection Screen Is Started Here============================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PrintPreview", "RMA_PrintPreview_Utility",0)+" Is Called To Do Print Preview");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_PrintPreview_Utility(RMAApp_Login_Txt_Password ,"Open",String.valueOf(RMA_Smoke_TC_014.FundsSplitDetails_Txt_Amount_Smoke_TC_014), false, logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Print Preview Fuctionality On Collection Screen Done Successfully For Control No:"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_014.StrControlNumber_Smoke_TC_014, 3));
			parentlogger.appendChild(logger);
			//===========================================================Steps To Do Print Preview On Collection Screen Is Completed Here============================================================================================================================================================================================================================================================
			
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PrintPreview_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			try {
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
	}
