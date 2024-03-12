package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_046
//Description    : Creation Of Auto Check from Funds Link Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-09-04-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_046 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_046_Test() throws Exception,Error {

		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		testcall3 = false;	
		loggerval3 = "NotInitialized";
		testcall4 = false;	
		loggerval4 = "NotInitialized";
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_046";	
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_046_Auto_Check_Creation_Validation",  "Creation Of Auto Check From Funds Link Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");

			String BankAccountCreation_Txt_BankAccountName;
			String GenClaimNumber;
			String ControlNumber;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_ClaimType;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_ServiceCode;
			String ScheduleChecksCreation_Txt_Payeetype;
			String ScheduleChecksCreation_Txt_TransType;
			String ScheduleChecksCreation_Txt_LastName;
			String ScheduleChecksCreation_Txt_PayInterval;
			int ScheduleChecksCreation_Txt_NumberOfPayment;
			String ScheduleChecksCreation_Txt_DistributionType;
			int BankAccountCreation_Txt_ZipCode;
			int ScheduleChecksCreation_Txt_Amount;
			String ReserveCreation_Lst_Status;
			String ReserveCreation_Lst_ReserveType;
			int ReserveCreation_Txt_ReserveAmount;
			//Local Variable Declaration Completed 

			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "RMABank_");
			GenClaimCreation_Txt_DateOfEvent =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_21_QTPRegression_10.xlsx"); //Excel WorkBook RMA_Suite_21_QTPRegression_10 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_046			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,1 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_046
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,2 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_046
			GenClaimCreation_Txt_ServiceCode = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,3 ); //Service Code Is Fetched From DataSheet RMA_QTPRegression_TC_046
			//General Claim Fetch From Excel WorkBook Is Completed Here
			
			ScheduleChecksCreation_Txt_Payeetype = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,4 ); //Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ScheduleChecksCreation_Txt_TransType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,5 );//Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ScheduleChecksCreation_Txt_LastName =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,6 );//Last Name Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ScheduleChecksCreation_Txt_PayInterval = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,7 );//Pay Interval Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ScheduleChecksCreation_Txt_NumberOfPayment = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_046", 1,8 );//Number Of Payments Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ScheduleChecksCreation_Txt_DistributionType  = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1,9 );//Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ScheduleChecksCreation_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_046", 1,10 );//Amount Is Fetched From DataSheet RMA_QTPRegression_TC_046
			//Schedule Check Fetch From Excel WorkBook Is Completed Here
			
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1, 11); //Status Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_046", 1, 12); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_046
			ReserveCreation_Txt_ReserveAmount =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_046", 1, 13);// Amount Is Fetched From DataSheet RMA_QTPRegression_TC_046
			//Payment Data Fetch From Excel WorkBook Is Completed Here


			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();

			RMA_Functionality_Utility.RMA_Suite23_Utility("RMA_QTPRegression_TC_046", logval);

			//========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create","BANKADDR1","texas","SD",BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountName, "SA", 2, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//========================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//========================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//========================================Steps To Create Corporate General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall2 = true;
			GenClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(GenClaimNumber, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ServiceCode(driver), "Service Code Lookup Button On General Claim Page", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(GenClaimCreation_Txt_ServiceCode, "Service Code Lookup Window On General Claims Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is added As General Claim Page Needs To Get Loaded");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "General Claim Creation Page", logval);
			//=========================================Steps To Create Corporate General Claim Is Completed Here=========================================================================================================================================================================================================================================================================================


			//========================================Steps To Navigate To FinancialsReserves Page Is Started Here============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Financials/Reserves Page Needs To Get Loaded");
			//========================================Steps To Navigate To FinancialsReserves Page Is Completed Here============================================================================================================================================================================================================

			//=============================	===========Steps To Create Reserve On The Created General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Reserve");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", GenClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//========================================Steps To Create Reserve On The Created General Claim Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Navigate To Financials/Reserves Page And Select Reserve In The Reserve Grid Is Started Here===========================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Reserve Grid Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Selection Of First Row In Reserve Grid", logval);
			//========================================Steps To Navigate To Financials/Reserves Page And Select Reserve In The Reserve Grid Is Completed Here===========================================================================================================================================================================================================================================================

			//========================================Steps To Schedule Checks Is Started Here==================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ScheduleCheck","RMA_ScheduleCheckCreation",0)+" To Successfully Schedule A Check");
			testcall4 = true;
			ControlNumber = rmaseleniumutilties.RMA_Functionality_Utility.RMA_ScheduleCheckCreation(ScheduleChecksCreation_Txt_PayInterval, ScheduleChecksCreation_Txt_NumberOfPayment, BankAccountCreation_Txt_BankAccountName, ScheduleChecksCreation_Txt_Payeetype, ScheduleChecksCreation_Txt_DistributionType,ScheduleChecksCreation_Txt_TransType , ScheduleChecksCreation_Txt_Amount, ScheduleChecksCreation_Txt_LastName, true, logval1);
			parentlogger.log(LogStatus.INFO, "Schedule Check Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(ControlNumber, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//========================================Steps To Schedule Checks Is Completed Here===========================================================================================================================================================================================================================

			//========================================Steps To Do Verification Of Auto Checks Is Started Here==================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval,"Wait Is Added As Menu ToolBar Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_TransactionHistory(driver), "Transaction History Image On Financials/Reserves Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.TransactionHistoryFrame);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is added As Record Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Img_AutoChecks(driver), "Auto Checks Image On Transaction History Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), "Transaction History Auto checks Grid", RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), 1, logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), "Transaction History Auto checks Grid", ControlNumber, 2, logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), "Transaction History Auto checks Grid",ScheduleChecksCreation_Txt_LastName , 3, logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), "Transaction History Auto checks Grid", "$"+String.valueOf(ScheduleChecksCreation_Txt_Amount)+".00", 5, logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy"), "Transaction History Auto checks Grid", GenClaimNumber, 4, logval);
			//========================================Steps To Do Verification Of Auto Checks Is Completed Here==================================================================================================================================================================================================================================================================================
	
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);	
					
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
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create New Reserve On General Claim To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ScheduleCheckCreation" + " " +  "To Create Schedule Check To Validate An Error Scenario And Hence The Test Case Is A Fail");
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
