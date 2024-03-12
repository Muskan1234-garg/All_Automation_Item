package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_076
//Description    : Payment For Org. Hierarchy Using Sub Bank Account Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-10-09-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_076 extends RMA_TC_BaseTest {

	@Test
	public void RMA_QTPRegression_TC_076_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_076_Payment For Org. Hierarchy Using Sub Bank Account", "Payment For Org. Hierarchy Using Sub Bank Account Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_076";
			ErrorMessage = null;
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================

			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================				
			String PaymentCreation_Lst_BankAccount;
			String PaymentCreation_Lst_PayeeType;
			String ReserveCreation_Lst_ReserveType;
			String FundsSplitDetails_Lst_TransactionType;
			int FundsSplitDetails_Txt_Amount;
			//String PaymentCreation_Txt_LastName;
			String PaymentCreation_Txt_DisType;
			String StrControlNumber;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================

			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite19_QTPRegression_08.xlsx"); //Excel WorkBook RMA_Suite19_QTPRegression_08 IS Fetched To Retrieve Data 
			PaymentCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_076", 1, 0); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_076
			PaymentCreation_Lst_PayeeType =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_076", 1, 1); //Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_076
			ReserveCreation_Lst_ReserveType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_076", 1, 2); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_076
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_076", 1, 3); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_076
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_076", 1, 4); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_076			
			//PaymentCreation_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_076", 1, 5); //Last Name Is Fetched From DataSheet RMA_QTPRegression_TC_076
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_076", 1, 6); //DisType Is Fetched From DataSheet RMA_QTPRegression_TC_076			
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================

			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		

			//Region =====================================================Steps To Add Payment For Created Claim Is Started Here==========================================================================================================
			if (logval1 == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Payment ");
			}else{	
				logger = reports.startTest("<span id='PaymentAddition'>TC_Payment Addition</span>", "User Makes A New Payment");
			}	
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentCorpAddition","RMA_PaymentCorpAddition_Utility",0)+" Is Called To Create A Payment ");
			testcall1 = true;		
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Btn_AddPayment(driver), "Add Payment Button On Reserve Creation Page",logval1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), PaymentCreation_Lst_BankAccount, RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lbl_BankAccount(driver).getText()+" Drop Down List", "Payment Creation Page",logval1);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PaymentCreation_Lst_PayeeType, "Payee Type Drop Down List", "Payment Creation Page",logval1);

			Thread.sleep(8000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_LastName(driver), "Last Name Look Up Image Button On Payment Creation Page",logval1);				
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Org Hierarchy Last Name Window");
			driver.switchTo().frame(0);
			driver.findElement(By.id("orgpanel"));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_List_OrgLevel(driver), "Department", "Org Hierarchy Level DropDown List on Org Hierarchy Window Popup" , "Funds Details Model Popup On Collection Creation Page",logval1);
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_Lnk_LastName(driver),"Last Name LookUp Window On Payment Creation Page",logval1);
			Thread.sleep(8000);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Type Button  ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On RMA Application Payments Creation Page",logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Distribution Selection Window");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PaymentCreation_Txt_DisType, "Distribution Type Link On Distribution Selection Window", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added As Distribution Type Is Selected In Payments Creation Page");

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Payment Creation Page",logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Funds Split Button On Payment Creation Page",logval1);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveCreation_Lst_ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",logval1);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Payment Creation Page", logval1);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Payment Creation Page", String.valueOf(FundsSplitDetails_Txt_Amount),logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Payment Creation Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Transaction Type Is Clickable In Payments Creation Page");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), FundsSplitDetails_Lst_TransactionType, "Transaction Type DropDown List" , "Funds Details Model Popup On Payment Creation Page",logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Payment Creation Page",logval1);// OK Button Is Clicked  On Funds Details Window On Payment Creation Page
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval1);
			// Payment Is Added And Funds Split Details View Is Closed

			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Payment Creation Page", logval1);
			//Save Button Is Clicked To Save The Transaction

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Payment Creation Page",logval1);// Transaction Tab On Payment Creation Page Is Clicked
			StrControlNumber = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);	
			if (logval1 == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation", "New Payment Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Payment Creation", "New Payment Is Created Successfully")));
			}
			//EndRegion ==================================================Steps To Add Payment For Created Claim Is Completed Here=======================================================================================================================================================================================

		}
		catch(Exception|Error e)
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
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PaymentCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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

