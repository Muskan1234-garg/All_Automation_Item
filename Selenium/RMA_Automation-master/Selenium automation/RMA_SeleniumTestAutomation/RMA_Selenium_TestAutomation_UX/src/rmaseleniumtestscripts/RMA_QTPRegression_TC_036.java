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
//TestCaseID     : RMA_QTPRegression_TC_036
//Description    : Verify Incurred Handling Options : Add settings for Recovery Reserves to add their Recovery Incurred Amount to the Total Claim Incurred Amount or subtract their Recovery Incurred Amount from the Total Claim Incurred Amount
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-08-18-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_036 extends RMA_TC_BaseTest {	
	@Test
	public void RMA_QTPRegression_TC_036_Test() throws Exception,Error {
		try{ 
			parentlogger = reports.startTest("RMA_QTPRegression_TC_036_Add settings for Recovery Reserves to add their Recovery Incurred Amount to the Total Claim Incurred Amount", "Verify Incurred Handling Options : Add settings for Recovery Reserves to add their Recovery Incurred Amount to the Total Claim Incurred Amount or subtract their Recovery Incurred Amount from the Total Claim Incurred Amount");
			parentlogger.assignAuthor("Abhishek Rai");		
			
			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_036";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";		
			testcall3 = false;
			loggerval3 = "NotInitialized";	
			testcall4 = false;
			loggerval4 = "NotInitialized";	
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			DefaultFrameID = null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
					
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================
			String LineOfBussinessParameterSetup_Lst_LOBType;					
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;
			String ReserveCreation_Lst_ReserveStatus;
			String ReserveCreation_Lst_ReserveType;
			String ReserveCreation_Lst_ReserveType_1;
			String ReserveCreation_Lst_ReserveType_2;
			int ReserveCreation_Txt_ReserveAmount;
			int ReserveCreation_Txt_ReserveAmount_1;
			int ReserveCreation_Txt_ReserveAmount_2;		
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
				
			//Region =====================================================Variable Initialization Started Here===========================================================================================================			
			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//EndRegion ==================================================Variable Initialization Completed Here============================================================================================================= 			
			
			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite20_QTPRegression_09.xlsx"); //Excel WorkBook RMA_Suite20_QTPRegression_09 IS Fetched To Retrieve Data 
			LineOfBussinessParameterSetup_Lst_LOBType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 0); //LOB Type Is Fetched From DataSheet RMA_QTPRegression_TC_042
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 1); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_036			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 2); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_036
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 3); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Lst_ReserveStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 4); // Reserve Status Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 5); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_036", 1, 6);  //Reserve Amount Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Lst_ReserveType_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 7); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Txt_ReserveAmount_1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_036", 1, 8);  //Reserve Amount Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Lst_ReserveType_2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_036", 1, 9); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_036
			ReserveCreation_Txt_ReserveAmount_2 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_036", 1, 10);  //Reserve Amount Is Fetched From DataSheet RMA_QTPRegression_TC_036
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================			
            			
			//Region =====================================================Steps To Select Reserve Options Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();			
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite20_Generic_UnCheck_Utility(LineOfBussinessParameterSetup_Lst_LOBType,logval);
			
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite20_Check_Utility("RMA_QTPRegression_TC_036_01",LineOfBussinessParameterSetup_Lst_LOBType, "NA", "NA", logval);	
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();				
			//EndRegion ==================================================Steps To Select Reserve Options Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);			
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();		
			//EndRegion ==================================================Steps To Create General Claim Is Completed Here============================================================================================================================
			
			//Region =====================================================Steps To Create Reserve For Created General Claim Is Started Here==========================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);			
			
			//Region =====================================================Steps To Create Medical Reserve  Is Started Here=================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Medical Reserve ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_ReserveStatus, ReserveCreation_Lst_ReserveType, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Medical Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_2, 2) + " " + "And Amount::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount_2),2) + " " + "And Claim Number::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(StrClaimNumber), 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//EndRegion ==================================================Steps To Create Medical Reserve Creation Is Completed Here=======================================================================================
			
			//Region =====================================================Steps To Create Expense Reserve  Is Started Here===================================================================================================			
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",1)+" Is Called To Create A Expense Reserve ");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount_1, ReserveCreation_Lst_ReserveStatus, ReserveCreation_Lst_ReserveType_1, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Expense Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_2, 2) + " " + "And Amount::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount_2),2) + " " + "And Claim Number::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(StrClaimNumber), 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//EndRegion ==================================================Steps To Create Expense Reserve Is Completed Here=======================================================================================
			
			//Region =====================================================Steps To Create Recovery Reserve  Is Started Here================================================================================================			
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",2)+" Is Called To Create A Recovery Reserve ");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount_2, ReserveCreation_Lst_ReserveStatus, ReserveCreation_Lst_ReserveType_2, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Indemnity Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType_2, 2) + " " + "And Amount::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount_2),2) + " " + "And Claim Number::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(StrClaimNumber), 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			//EndRegion ==================================================Steps To Create Recovery Reserve Is Completed Here====================================================================================================================================================================================================================================================================================================			
			
			//EndRegion ==================================================Steps To Create Reserve For Created General Claim Is Completed Here==========================================================================================================
			
			//Region =====================================================Steps To Verify Reserve Amount On Claim Reserve Summary Window Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Btn_ClaimReserveSummary(driver), "Claim Reserve Summary Link On Financial Reserves Page", logval);
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ClaimReserveSummaryFrame);	
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowReserve_Tbl(driver), "Totals:", 1, "$150.00" , "Reserve Incurred Total Table", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_ClaimReserveSummary_Btn_Close(driver), "Close Image Button On RMA Application Default View Page", logval);			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Already Opened Claim Creation Page Is Closed");
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
			//EndRegion ==================================================Steps To Verify Reserve Amount On Claim Reserve Summary Window Is Completed Here==========================================================================================================
						
						
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite20_Check_Utility("RMA_QTPRegression_TC_036_02",LineOfBussinessParameterSetup_Lst_LOBType, "NA", "NA", logval);	
			driver.close();
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 
			
			//Region =====================================================Steps To Verify Reserve Amount On Claim Reserve Summary Window Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Btn_ClaimReserveSummary(driver), "Claim Reserve Summary Link On Financial Reserves Page", logval);
			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.ClaimReserveSummaryFrame);	
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowReserve_Tbl(driver), "Totals:", 1, "$150.00" , "Reserve Incurred Total Table", logval);
			//EndRegion ==================================================Steps To Verify Reserve Amount On Claim Reserve Summary Window Is Completed Here==========================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_ClaimReserveSummary_Btn_Close(driver), "Close Image Button On RMA Application Default View Page", logval);			
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Already Opened Claim Creation Page Is Closed");
			driver.switchTo().parentFrame();
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create New Medical Reserve And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3== true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create New Expense Reserve And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4== true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create New Recovery Reserve And Hence The Test Case Is A Fail");
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
