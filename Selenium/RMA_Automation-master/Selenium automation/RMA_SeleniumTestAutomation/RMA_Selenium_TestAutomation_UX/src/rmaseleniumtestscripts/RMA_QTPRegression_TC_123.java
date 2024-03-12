package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_CombinedPayment;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_123
//Description    : Stop The Combined Payment For A Payee Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-01-25-2018
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_123 extends RMA_TC_BaseTest
{
	
	@Test  
	public void RMA_QTPRegression_TC_123_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		testcall4 = false;	
		loggerval4 = "NotInitialized";
		testcall5 = false;	
		loggerval5 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_123";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		//Global Variable Initialization Is Completed Here
		
		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_123_Stop The Combined Payment", "Stop The Combined Payment For A Payee Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");
			
			String BankAccountName;
			String CheckStockCreation_Txt_StockName;
			String CheckStockCreation_Txt_FontStyle;
			int CheckStockCreation_Txt_FontSize;
			String Entity_Txt_Name;
			String BankAccount_Txt_AccountName;
			String CombinedPayee_Txt_LastName;
			String EntityAddress_Txt_Addr1;
			String EntityAddress_Txt_Addr2;
			String EntityAddress_Txt_Addr3;
			String EntityAddress_Txt_Addr4;
			String EntityAddress_Txt_City;
			int    EntityAddress_Txt_ZipCode;
			String EntityAddress_Txt_County;
			String CombinedPayStopPaymnt_Txt_StopAsOf;
			//Local Variable Declaration Is Completed Here
								
			CombinedPayStopPaymnt_Txt_StopAsOf = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,0,0,"MM/dd/yyyy");
			//Local Variable Initialization Is Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite26_QTPRegression_13.xlsx"); //Excel WorkBook RMA_Suite26_QTPRegression_13.xlsx IS Fetched To Retrieve Data 
			CheckStockCreation_Txt_StockName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_123", 1, 0); //Stock Name Is Fetched From DataSheet RMA_QTPRegression_TC_123
			CheckStockCreation_Txt_FontStyle =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_123", 1,1 ); //Font Style Is Fetched From DataSheet RMA_QTPRegression_TC_123
			CheckStockCreation_Txt_FontSize = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_123", 1,2 ); //Font Size Is Fetched From DataSheet RMA_QTPRegression_TC_123
			//Check Stock Data Fetch From Excel WorkBook Is Completed Here
					
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			//============================================================General System Parameter & Payment Parameter Settings Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("UISettings","RMA_Suite07_Utility",0)+"General System Parameter And Payment Parameter Settings Are Done");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Suite07_Utility("RMA_QTPRegression_TC_052_I", logval1);//General System Parameter & Payment Parameter Settings Are Done
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//============================================================General System Parameter & Payment Parameter Settings Is Completed Here===========================================================================================================================================================================================================================================================
			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AccountName_"); //Bank Account Name Is Created
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall2 = true;
			BankAccount_Txt_AccountName = rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","texas","delhi","SD",201301876,BankAccountName, "s", 1, "Anodizing", true,"Adddr2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccount_Txt_AccountName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Bank Account Is Completed Here ===============================================================================================================================================================================================================================================
			//========================================Steps To Create Check Stocks Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CheckStocks","RMA_CheckStocksCreation_Utility",0)+" To Successfully Create A Check Stock");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_CheckStocksCreation_Utility(CheckStockCreation_Txt_StockName, CheckStockCreation_Txt_FontStyle,CheckStockCreation_Txt_FontSize, logval1);
			parentlogger.log(LogStatus.INFO, "Check Stock Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CheckStockCreation_Txt_StockName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Check Stocks Is Completed Here==========================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			
			//========================================Maintenance-->Entity Set Up Is Started Here=================================================================================================================================================================================================================================================
			EntityAddress_Txt_Addr1 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address1_");
			EntityAddress_Txt_Addr2 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address2_");	
			EntityAddress_Txt_Addr3 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address3_");	
			EntityAddress_Txt_Addr4 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Address4_");	
 			EntityAddress_Txt_City = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "City_");
 			EntityAddress_Txt_County = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "County_");
			EntityAddress_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(100000000,999999999);
	
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAddition","RMA_EntityAddition_Utility",0)+" To Successfully Create An Entity From Maintenance Screen");
			testcall4 = true;
			Entity_Txt_Name = RMA_Maintenance_Functionality_Utility.RMA_EntityAddition_Utility("Hospital","HADDR",EntityAddress_Txt_Addr1,EntityAddress_Txt_Addr2,EntityAddress_Txt_Addr3,EntityAddress_Txt_Addr4,EntityAddress_Txt_City,"AL",EntityAddress_Txt_County,"USA",EntityAddress_Txt_ZipCode,logval1);
			parentlogger.log(LogStatus.INFO, "Entity Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(Entity_Txt_Name, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			driver.close();
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			//=========================================Maintenance-->Entity Set Up Is Completed Here=================================================================================================================================================================================================================================================
			//=========================================Steps To Create Combined Payee Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CombinedPayee","RMA_CombinedPayment_Add_Utility",0)+" To Successfully Create A Combined Payee");
			testcall5 = true;
			CombinedPayee_Txt_LastName = RMA_Functionality_Utility.RMA_CombinedPayee_Add_Utility(BankAccount_Txt_AccountName,Entity_Txt_Name,"PB",logval1);
			parentlogger.log(LogStatus.INFO, "Combined Payee Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CombinedPayee_Txt_LastName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Create Combined Payee Is Completed Here===============================================================================================================================================================================================================================================
			
			//=========================================Steps To Stop Combined Payee Is Started Here===============================================================================================================================================================================================================================================
		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Stop Payment"), "Stop Payment Tab On Combined Payment Setup Page",logval);// Combined Payment Tab On Combined Payment Setup Page Is Clicked
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Txt_StopAsOf(driver), "Stop As Of Date TextBox On Combined Payment Setup Page", CombinedPayStopPaymnt_Txt_StopAsOf, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_CombinedPayment.RMA_CombinedPaySetUp_Chk_StopCombinedPay(driver), "check", "Enable Stop Combined Pay CheckBox",  "RMA Application's Combined Payment Setup Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Combined Payment SetUp Page", logval);// Save Button Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Combined Payment Page Is Getting Saved");
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Stop Combined Payee", " Stop Payment To Combined Payee Is Done Successfully")));
			//=========================================Steps To Stop Combined Payee Is Completed Here===============================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
		
		
		}catch (Exception|Error e) {
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
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Suite07_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_CheckStocksCreation_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_EntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
			}
			if ((testcall5 == true) && (loggerval5.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_CombinedPayee_Add_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		} catch (Exception|Error e) {	
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}	
		finally
		{
			try {
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
