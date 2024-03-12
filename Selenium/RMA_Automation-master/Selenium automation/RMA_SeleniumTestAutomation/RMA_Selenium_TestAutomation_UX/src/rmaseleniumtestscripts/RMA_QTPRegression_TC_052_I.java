package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties_UX.RMA_Claims_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_052_I
//Description    : Setting Up Combined Payment For Roll Up Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AnubhutiVyas-09-27-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_052_I extends RMA_TC_BaseTest
{
	public static String BankAccount_Txt_AccountName;
	public static String CombinedPayee_Txt_LastName;
	public static String EntityAddress_Txt_Addr1;
	public static String EntityAddress_Txt_Addr2;
	public static String EntityAddress_Txt_Addr3;
	public static String EntityAddress_Txt_Addr4;
	@Test  
	public void RMA_QTPRegression_TC_052_I_Test() throws Exception, Error
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
		StrScreenShotTCName = "RMA_QTPRegression_TC_052_I";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		String EntityAddress_Txt_County;
		//Global Variable Initialization Is Completed Here
		
		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_052_I_Setting Up Combined Payment", "Setting Up Combined Payment For Roll Up Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");
			
			String CheckStockCreation_Txt_StockName;
			String CheckStockCreation_Txt_FontStyle;
			int CheckStockCreation_Txt_FontSize;
			String Entity_Txt_Name;
			String BankAccountCreation_Txt_BankAccountAddr1;			
			String BankAccountCreation_Txt_BankAccountStateId;
			String BankAccountCreation_Txt_BankAccountCity;
			int BankAccountCreation_Txt_BankAccountChkNumber;
			int BankAccountCreation_Txt_BankAccountNo;
			String BankAccountCreation_Txt_BankAccountType;
			String BankAccountCreation_Txt_BankAccountName;
			int BankAccountCreation_Txt_ZipCode;
			
			String EntityAddress_Txt_City;
			int    EntityAddress_Txt_ZipCode;
			//Local Variable Declaration Is Completed Here
		    
			BankAccountCreation_Txt_BankAccountAddr1 = "1200 barclay towers";			
			BankAccountCreation_Txt_BankAccountStateId = "NJ";
			BankAccountCreation_Txt_BankAccountCity = "Mount Laurel";
			BankAccountCreation_Txt_BankAccountType = "SA";			
			BankAccountCreation_Txt_BankAccountChkNumber =95641;
			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AQRMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);	
			BankAccountCreation_Txt_BankAccountNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite21_QTPRegression_08.xlsx"); //Excel WorkBook RMA_Suite21_QTPRegression_08.xlsx IS Fetched To Retrieve Data 
			CheckStockCreation_Txt_StockName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_052_I", 1, 0); //Stock Name Is Fetched From DataSheet RMA_QTPRegression_TC_052_I
			CheckStockCreation_Txt_FontStyle =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_052_I", 1,1 ); //Font Style Is Fetched From DataSheet RMA_QTPRegression_TC_052_I
			CheckStockCreation_Txt_FontSize = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_052_I", 1,2 ); //Font Size Is Fetched From DataSheet RMA_QTPRegression_TC_052_I
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
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			
			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AccountName_"); //Bank Account Name Is Created
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall2 = true;
			//BankAccount_Txt_AccountName = RMA_Claims_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","texas","delhi","SD",201301876,BankAccountName, "s", 1, "Anodizing", true,"Adddr2", logval1);
			BankAccount_Txt_AccountName = RMA_Claims_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create",BankAccountCreation_Txt_BankAccountAddr1,BankAccountCreation_Txt_BankAccountCity,BankAccountCreation_Txt_BankAccountStateId,BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountNo,BankAccountCreation_Txt_BankAccountName, BankAccountCreation_Txt_BankAccountType, BankAccountCreation_Txt_BankAccountChkNumber, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccount_Txt_AccountName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			
			//========================================Steps To Create Bank Account Is Completed Here ===============================================================================================================================================================================================================================================
			//========================================Steps To Create Check Stocks Is Started Here=======================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CheckStocks","RMA_CheckStocksCreation_Utility",0)+" To Successfully Create A Check Stock");
			testcall3 = true;
			RMA_Claims_Functionality_Utility.RMA_CheckStocksCreation_Utility(CheckStockCreation_Txt_StockName, CheckStockCreation_Txt_FontStyle,CheckStockCreation_Txt_FontSize, logval1);
			parentlogger.log(LogStatus.INFO, "Check Stock Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CheckStockCreation_Txt_StockName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			
			//========================================Steps To Create Check Stocks Is Completed Here==========================================================================================================================================================================================================================
				
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
			Entity_Txt_Name = RMA_Maintenance_Functionality_Utility.RMA_EntityAddition_Utility("Hospital","HADDR",EntityAddress_Txt_Addr1,EntityAddress_Txt_Addr2,EntityAddress_Txt_Addr3,EntityAddress_Txt_Addr4,EntityAddress_Txt_City,"AL",EntityAddress_Txt_County,"ATR",EntityAddress_Txt_ZipCode,logval1);
			parentlogger.log(LogStatus.INFO, "Entity Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(Entity_Txt_Name, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			driver.close();
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//=========================================Maintenance-->Entity Set Up Is Completed Here=================================================================================================================================================================================================================================================
			//=========================================Steps To Create Combined Payee Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CombinedPayee","RMA_CombinedPayment_Add_Utility",0)+" To Successfully Create A Combined Payee");
			testcall5 = true;
			CombinedPayee_Txt_LastName = RMA_Claims_Functionality_Utility.RMA_CombinedPayee_Add_Utility(BankAccount_Txt_AccountName,Entity_Txt_Name,"PB",logval1);
			parentlogger.log(LogStatus.INFO, "Combined Payee Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(CombinedPayee_Txt_LastName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================Steps To Create Combined Payee Is Completed Here===============================================================================================================================================================================================================================================
		
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
