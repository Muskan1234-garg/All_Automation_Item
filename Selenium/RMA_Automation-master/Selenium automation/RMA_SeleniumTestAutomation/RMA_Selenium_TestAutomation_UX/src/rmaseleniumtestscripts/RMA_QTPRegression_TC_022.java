package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_022
//Description    : Clone Of Check Stocks Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-08-21-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_022 extends RMA_TC_BaseTest{
	@Test
	public void RMA_QTPRegression_TC_022_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_022";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_022_Check Stock Clone_Validation", "Check Stock Can Be Cloned Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String BankAccountCreation_Txt_BankAccountName;
			int BankAccountCreation_Txt_ZipCode;
			String CheckStockCreation_Txt_StockName;
			String CheckStockCreation_Txt_FontStyle;
			int CheckStockCreation_Txt_FontSize;
			//Local Variable Declaration Completed Here

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			CheckStockCreation_Txt_StockName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Stock_");
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_12_QTPRegression_05.xlsx"); //Excel WorkBook RMA_Suite_12_QTPRegression_05 IS Fetched To Retrieve Data
			CheckStockCreation_Txt_FontStyle = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_022", 1, 0);//Font Style Is Fetched From DataSheet RMA_QTPRegression_TC_022
			CheckStockCreation_Txt_FontSize = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_022", 1, 1);//Font Size Is Fetched From DataSheet RMA_QTPRegression_TC_022
			//Check Stock Data Fetch From Excel WorkBook Is Completed Here

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 1, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create Bank Account Is Completed Here ===============================================================================================================================================================================================================================================

			//==============================================================Steps To Create Check Stocks Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CheckStocks","RMA_CheckStocksCreation_Utility",0)+" To Successfully Create A Check Stock");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_CheckStocksCreation_Utility(CheckStockCreation_Txt_StockName, CheckStockCreation_Txt_FontStyle, CheckStockCreation_Txt_FontSize, logval1);
			parentlogger.log(LogStatus.INFO, "Check Stock Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CheckStockCreation_Txt_StockName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Create Check Stocks Is Completed Here=======================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_CheckStock(driver), "Check Stock Button On Bank Account Page", logval);

			//==============================================================Steps To Clone Check Stocks Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CloneCheckStocks","RMA_CheckStocksClone_Utility",0)+" To Successfully Clone A Check Stock");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_CheckStocksClone_Utility(BankAccountCreation_Txt_BankAccountName, logval1);
			parentlogger.log(LogStatus.INFO, "Check Stock Is Cloned Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CheckStockCreation_Txt_StockName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================================================Steps To Clone Check Stocks Is Started Here=======================================================================================================================================================================================================================

			//===========================================Steps To Close The Check Stock Page Is Started Here==========================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(rmaseleniumPOM.RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Un-Clear Checks Page", logval);
			//===========================================Steps To Close The Check Stock Page Is Completed Here==========================================================================================================================================================================

			//===========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//===========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "To Create New Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CheckStocksCreation_Utility" + " " +  "To Create Check Stock On The Created Bank Account And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CheckStocksClone_Utility" + " " +  "To Create Clone Of Created Check Stock On The Created bank Account And Hence The Test Case Is A Fail");
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
