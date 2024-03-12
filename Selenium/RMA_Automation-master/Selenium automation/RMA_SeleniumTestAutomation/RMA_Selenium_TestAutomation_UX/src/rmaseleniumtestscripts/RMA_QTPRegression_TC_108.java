package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_108
//Description    : Verify Collection Happen Successfully Is Validated
//Depends On TC  : RMA_QTPRegression_TC_105, RMA_QTPRegression_TC_106
//Revision       : 0.0 - AbhishekRai-10-17-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_108 extends RMA_TC_BaseTest {	
	
	public static String StrControlNumber_QTPRegression_TC_106;
	
	@Test
	public void RMA_QTPRegression_TC_108_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_108_Verify Collection Happen Successfully", "Verify Collection Happen Successfully Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");		
			
			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_108";
			testcall1 = false;	
			loggerval1 = "NotInitialized";			
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;		
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
						
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================			
			String ReserveCreation_Lst_ReserveType;							
			String PaymentCreation_Lst_BankAccount;
			String PaymentCreation_Lst_PayeeType;							
			String FundsSplitDetails_Lst_TransactionType;				
			String PaymentCreation_Txt_DisType;		
			int FundsSplitDetails_Txt_Amount;			
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
							
			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite18_QTPRegression_10.xlsx"); //Excel WorkBook RMA_Suite18_QTPRegression_10 IS Fetched To Retrieve Data
			
			PaymentCreation_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_108", 1, 0); //Bank Account Is Fetched From DataSheet RMA_QTPRegression_TC_108
			PaymentCreation_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_108", 1, 1); // Payee Type Is Fetched From DataSheet RMA_QTPRegression_TC_108
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_108", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_108						
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_108", 1, 3); //Transaction Type Is Fetched From DataSheet RMA_QTPRegression_TC_108
			FundsSplitDetails_Txt_Amount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_108", 1, 4); //Amount Is Fetched From DataSheet RMA_QTPRegression_TC_108						
			PaymentCreation_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_108", 1, 6); //Distribution Type Is Fetched From DataSheet RMA_QTPRegression_TC_108									
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================
					
			//Region =====================================================Steps To Select General System Parameter And Reserve Options Settings Is Started Here=============================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();			
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite21_Check_Utility(StrScreenShotTCName,"NA", logval);			
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();	
			//EndRegion ==================================================Steps To Select General System Parameter And Reserve Options Settings Is Completed Here=============================================================
						
			//=================================================================Steps To Search Claim Is Started Here ===============================================================================================================================================================			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", StrClaimNumber, StrClaimNumber,DefaultFrameID,logval);			
			//=================================================================Steps To Search Claim Is Completed Here ===============================================================================================================================================================
						
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "General Claim"),"General Claim Breadcrumb From Financial Reserves Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);			

			//Region =====================================================Steps To Add Collection For Created Claim Is Started Here==========================================================================================================
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, "User Makes A New Collection");	
			}
			else
			{
				logger = reports.startTest("<span id='AddNewCollection'>Add New Collection</span> ", "User Makes A New Collection");
			}
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CollectionCorpAddition","RMA_CollectionCorpAddition_Utility",0)+" Is Called To Create A Collection ");
			testcall1 = true;		
			CurrentFrameID=null;
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();			

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_AddCollection(driver), "Add Collection Image On Financial Reserve Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_BankAccount(driver), PaymentCreation_Lst_BankAccount, "Bank Account Drop Down List", "Collection Creation Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Lst_PayeePayorType(driver), PaymentCreation_Lst_PayeeType, "Payee Type Drop Down List", "Collection Creation Page",logval);

			Thread.sleep(8000);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_LastName(driver), "Last Name Look Up Image Button On Payment Creation Page",logval);				
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Org Hierarchy Last Name Window");
			driver.switchTo().frame(0);
			driver.findElement(By.id("orgpanel"));			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_List_OrgLevel(driver), "Department", "Org Hierarchy Level DropDown List on Org Hierarchy Window Popup" , "Funds Details Model Popup On Collection Creation Page",logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_OrgHierarchy_Lnk_LastName(driver),"Last Name LookUp Window On Payment Creation Page",logval);
			Thread.sleep(8000);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_DistributionType(driver), "Distribution Type Code Look Up Button On Collection Creation Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PaymentCreation_Txt_DisType, "Distribution Type Link On Distribution Selection Window", logval);

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_TransactionDetail(driver), "Transaction Details Tab On On Collection Creation Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Btn_AddNewFunds(driver), "Add Payment Button On Collection Creation Page",logval);
			//Add New Button Is Clicked And Funds Split Details View Is Opened

			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_List_ReserveType(driver), ReserveCreation_Lst_ReserveType, "Resreve Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",logval);

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Model Popup On Collection Creation Page", logval);
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Txt_Amount(driver), "Amount TextBox On Funds Details Window On Collection Creation Page", String.valueOf(FundsSplitDetails_Txt_Amount),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), "Transaction Type DropDown List On Funds Details Model Popup On Collection Creation Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Transaction Type Is Clickable In Collection Page");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_FundsSplitDetails_Lst_TransactionType(driver), FundsSplitDetails_Lst_TransactionType, "Transaction Type DropDown List" , "Funds Details Model Popup On Collection Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_FundsSplitDetails_Save(driver), "Save Button On Funds Split Details Window On Collection Creation Page",logval);// OK Button Is Clicked  On Funds Details Window On Collection Creation Page
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			// Collection Is Added And Funds Split Details View Is Closed

			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Collection Creation Page", logval);
			//Save Button Is Clicked To Save The Collection

			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_PaymentCollection_Tab_Transaction(driver), "Transaction Tab On Collection Creation Page",logval);// Transaction Tab On Transaction Page Is Clicked
			StrControlNumber_QTPRegression_TC_106 = RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Txt_ControlNumber(driver).getAttribute("value"); //Generated Control Number Is Stored In Variable StrControlNumber
			parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_QTPRegression_TC_106, 2)+ " "+ "Is Done");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);	
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Collection Creation", "New Collection Is Created Successfully")));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Collection Creation", "New Collection Is Created Successfully")));
			}
			//EndRegion ==================================================Steps To Add Collection For Created Claim Is Completed Here=======================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);						
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_CollectionCorpAddition_Utility" + " " +  "To Add Collection For Created General Claim And Hence The Test Case Is A Fail");
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
