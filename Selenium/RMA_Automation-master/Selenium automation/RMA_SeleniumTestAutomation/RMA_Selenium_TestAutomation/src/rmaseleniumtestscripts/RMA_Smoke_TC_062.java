package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_BankAccount;
import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_062
//Description    : Successful Use Account owner for Funds utility Setting Is Validated.
//Depends On TC  : RMA_Smoke_TC_002GC/Veh/Prop/WC/NonOcc
//Revision       : 0.0 - RenuVerma-10-12-2016
//=================================================================================================

public class RMA_Smoke_TC_062 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
		
	@Test
	public void RMA_Smoke_TC_062_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_062_Use Account owner for Funds utility Setting", "Successful Use Account owner for Funds utility Setting Is Validated. ");
			parentlogger.assignAuthor("Renu Verma");

			String StrPrimaryWindowHandle;
			String StrClaimNaumberActual ;
			int  BankAccNum;
			String  BankOwner;
			String  BankName;
			String GeneralClaim2_Txt_Department;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_062";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestDatas IS Fetched To Retrieve Data
			BankAccNum= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_062", 1, 0); // Bank Account Number Is Fetched From DataSheet RMA_Smoke_TC_062	
			BankOwner=  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_062", 1, 1); // Bank Owner Is Fetched From DataSheet RMA_TC_062
			BankName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_062", 1, 2); // Bank Name Is Fetched From DataSheet RMA_TC_062
			GeneralClaim2_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_062", 5, 0); // Changed Department Is Fetched From DataSheet RMA_TC_062
		
			//=================================== Enabling of General System Parameter Page Setting Is Started===================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Funds Settings", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(driver), "check", "Use Account Owner for Funds", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(driver), "uncheck", "Use Sub Bank Accounts", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===================================Enabling of General System Parameter Page Setting Is Ended ===================================

			//===================================Account owner Setting Under Funds-BankAccount Page Is Started Here================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "LookUp Image On Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(String.valueOf(BankAccNum))));
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(String.valueOf(BankAccNum), "Bank Account Lookup Table", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Bank Account");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Account Owner", "Bank Account Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_BankAccount.RMAApp_BankAccount_Txt_Owner(driver), "Owner TextBox On Bank Account Page", BankOwner, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("Bank Account", false, "NA","Bank Account Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Funds-> Bank Account Page", logval);
			//===================================Account owner Setting Under Funds-BankAccount Page Is Ended Here================================================
			
			//===============================================Search Of The Claim Created In RMA_Smoke_TC_002 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_Home.RMAApp_Genereic_Txt_ClaimNum(driver).getAttribute("value");
			String StrDept= RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver).getAttribute("value");
			String StrDefaultDepartmentCode_002[]=StrDept.split(" ");
			RMA_Verification_Utility.RMA_TextCompare(StrClaimNumber_002, StrClaimNaumberActual , "Claim Number", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");		
			//===============================================Search Of The Claim Created In RMA_Smoke_TC_002 Is Completed=====================================================================================================
		
			//===================================Verify the functionality of 'Use Account owner=ON' for Funds utility Setting Is Started Here================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Financial Reserves Page",logval);
			
			// Verify That Bank is Available for the Same Department When Account owner Setting Is 'ON' .
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), BankName,"Bank Name List On Payment Addition Page", logval);
			driver.switchTo().parentFrame();			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Payment Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Lnk_LeftNavLink(driver,StrClaimNumber_002),  " Claim Link On Left Navigation Tree", logval);
			
			//Change the Department 
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "DeptId TextBox On Claim Creation Page", GeneralClaim2_Txt_Department,logval);
			Thread.sleep(4000);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_002, false, "NA", "Claim Page", logval);
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Financial Reserves Page",logval);
		
			// Verify Bank is Not Available for the Different Department When Account owner Setting Is 'ON' .
			RMA_NegativeVerification_Utility.RMA_NegVerifyMultipleDataInWebList(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), BankName,"Bank Name List On Payment Addition Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Payment Creation Page", logval);
			//===================================Verify the functionality of 'Use Account owner=ON' for Funds utility Setting Is Ended Here================================================
			
			//=================================== Disabling of General System Parameter Page Setting Is Started ===================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Funds Settings", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseAccountOwnerForFunds(driver), "uncheck", "Use Account Owner for Funds", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseSubBankAccount(driver), "uncheck", "Use Sub Bank Accounts", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===================================Disabling of General System Parameter Page Setting Is Ended ===================================
		
			//===================================Verify the functionality of 'Use Account owner=OFF' for Funds utility Setting Is Started Here================================================	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Lnk_LeftNavLink(driver,StrClaimNumber_002),  " Event Link On Left Naviogation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			//	RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "DeptId TextBox On General Claim Creation Page", GeneralClaim2_Txt_Department,logval);
			//	RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_002, false, "NA", "General Claim Page", logval);
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Financial Reserves Page",logval);
			// Verify Bank is Available for the Different Department When Account owner Setting Is 'OFF' .
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Lst_BankAccount(driver), BankName,"Bank Name List On Payment Addition Page", logval);
			
			//Change the department as set into the Smoke_TC_002
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Payment Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Lnk_LeftNavLink(driver,StrClaimNumber_002),  " Event Link On Left Naviogation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "DeptId TextBox On Claim Creation Page", StrDefaultDepartmentCode_002[0],logval);// Code of the Department
			Thread.sleep(4000);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_002, false, "NA", "Claim Page", logval);
			RMA_Verification_Utility.RMA_TextCompare(StrDept, RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver).getAttribute("value") , "Claim Department", logval);
			//===================================Verify the functionality of 'Use Account owner=OFF' for Funds utility Setting Is Ended Here================================================
			
		}catch(Exception|Error e)
		{
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility RMA_GeneralClaimCreation_ACOFF  And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

