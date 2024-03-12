package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//===========================================================================================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_014GridVerification
//Description    : Successful Collection Grid Value Verification, Color Code Change And Tool Tip Amount Of Payment Progress Image On Claim Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009,RMA_Smoke_TC_011,RMA_Smoke_TC_011GridVerification, RMA_Smoke_TC_014
//Revision       : 0.0 - RenuVerma-06-20-2017 
//============================================================================================================================================================================
public class RMA_Smoke_TC_014GridVerification extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	
@Test 
public void RMA_Smoke_TC_014GridVerification_Test() throws Exception, Error
{
	
	StrScreenShotTCName = "RMA_Smoke_TC_014GridVerification";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	
	try {
		parentlogger = reports.startTest("RMA_Smoke_TC_014_Collection Creation Verification", "Successful Collection Grid Value Verification, Color Code Change And Tool Tip Amount Of Payment Progress Image On Claim Screen Is Validated");
		parentlogger.assignAuthor("Renu Verma");
		int FundsSplitDetails_Txt_AmountForCollection;
		int FundsSplitDetails_Txt_AmountForPayment;
		String ReserveType;
		int ExpBalIncAmountBeforePaymentOnGrid;
		int ExpBalanceAmountAfterPaymentOnGrid;
		String []ExpectedColHeadersToBeVerified;
		Object []ExpectedValuesToBeVerified;
		//Local Variable Declaration
				
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		FundsSplitDetails_Txt_AmountForCollection= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_014", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
		ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
		ExpBalIncAmountBeforePaymentOnGrid = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_009
		FundsSplitDetails_Txt_AmountForPayment=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_011", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
		
		//ExpBalanceAmountAfterPaymentOnGrid=ExpBalIncAmountBeforePaymentOnGrid-FundsSplitDetails_Txt_AmountForPayment+FundsSplitDetails_Txt_AmountForCollection;// Balance Amount After Payment and Collection On NG Grid
		// Uncomment When setting 'Calculate Collections in Reserve Balance:' under Line Of Business --'Reserve/Incurred Balance Options' tab is enabled
	
		ExpBalanceAmountAfterPaymentOnGrid=ExpBalIncAmountBeforePaymentOnGrid-FundsSplitDetails_Txt_AmountForPayment;// Balance Amount After Payment and Collection On NG Grid
		// Uncomment When All Setting is off  under Line Of Business --'Reserve/Incurred Balance Options' tab 
		
		ExpectedColHeadersToBeVerified=new String[]{"Balance","Paid","Collection","Incurred"};		// Column Header Name For NG Grid Verification 
		ExpectedValuesToBeVerified=new Object[]{ "$"+ExpBalanceAmountAfterPaymentOnGrid+ ".00",  "$"+FundsSplitDetails_Txt_AmountForPayment+ ".00", "$"+FundsSplitDetails_Txt_AmountForCollection+".00", "$"+ExpBalIncAmountBeforePaymentOnGrid+ ".00"};	// Column Value For NG Grid Verification
			
		/*===========================================================Collection Creation Verification On Reserve NG Grid Is Started Here====================================================================================================================================================================================================================================================================================================*/
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Breadcrumb From Financial Reserves Page",logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
		RMA_GenericUsages_Utility.RMA_CheckVerificationNGGridColumnHeader(ExpectedColHeadersToBeVerified, "Reserve", logval);
		RMA_Input_Utility.RMA_JavaScriptSetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
		//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid		
		RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveType, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified,logval);
		/*===========================================================Collection Creation Verification On Reserve NG Grid Is Ended Here====================================================================================================================================================================================================================================================================================================*/
		
		/*===========================================================Collection Creation Verification On Claim Progress Menu Is Started Here====================================================================================================================================================================================================================================================================================================*/
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number At The Top Of The RMA Application Page",logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
		if((FundsSplitDetails_Txt_AmountForCollection-FundsSplitDetails_Txt_AmountForPayment)==0)
			RMA_Verification_Utility.RMA_PartialTextVerification("color: red", RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Lbl_RightClaimProgress(driver, 3).getAttribute("style"), "Color Of Payment Status Value On Claim Progress Menu", logval);
		else
			RMA_Verification_Utility.RMA_PartialTextVerification("rgb(255, 255, 255)", RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Lbl_RightClaimProgress(driver, 3).getAttribute("style"), "Color Of Payment Status Value On Claim Progress Menu", logval);
		/*===========================================================Collection Creation Verification On Claim Progress Menu Is Ended Here====================================================================================================================================================================================================================================================================================================*/
	
	} catch (Exception|Error e) {
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
		 if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(DefaultFrameID)){
				driver.switchTo().parentFrame();
		}
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
		RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}
