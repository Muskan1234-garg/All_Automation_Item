package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

//import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
//RMA Package Import Completed


//================================================================================================
//TestCaseID     : RMA_TC_067
//Description    : Verify transaction is listed in my pending transactions and in submitted to column, listed user should be the one in current adjuster's hierarchy having  sufficient limits to approve.  
//Dependent On TC: TC_064, TC_065, TC_066
//Revision       : 0.0 - ImteyazAhmad-02-04-2016
//Revision       : 0.1 - ImteyazAhmad-08-17-2016
//=================================================================================================
public class RMA_TC_067 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	public static String ExceptionRecorded;
	public static String []ErrorMessage;
	public static String FinalErrorMessage;
	public static String ErrorMessageType;
	public static String StrScreenShotTCName;
	
	
@Test 
public void RMA_TC_067_Test () throws Exception, Error 
{
	try {
		logger = reports.startTest("TC_067_Listing Of Hold Transaction In Submitted Pending Transactions", "Verify Transaction Is Listed In My Pending Transactions And In Submitted To Column, Listed User Should Be The One In Current Adjuster's Hierarchy Having  Sufficient Limits To Approve");
		
		String StrExpSubmittedVal;
		String StrExpSubmittedVal1;
		//Local Variable Declaration
		
		StrExpSubmittedVal = "user4";
		StrExpSubmittedVal1 = "user5";
		//RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		//String StrControlNumber_RMA_TC_013 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_006", 10, 0); //Payment Control Number Is Fetched From Data Sheet RMA_TC_006
		
		//===============================================Pending Transactions View Selection In SuperVisory Approval Page Is Started==========================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(1);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");				
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On Pending View On The Supervisory Approval Page", logval1);
//		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_aSelectedView2(driver)));
//		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_aSelectedView2(driver), "Selected View Image On The Supervisory Approval Page", logval1);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntPending(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntPending(driver), "Pending Image On The Supervisory Approval Page", logval1);
		//RMA_GenericUsages_Utility.RMA_StaticWait(7, 1, "Wait Is Added Pending Payments View Is Loaded");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2)));
	//===============================================Pending Transactions View Selection In SuperVisory Approval Page Is Completed==========================================================================================================================================================================================================================================================================
		
		
		//===============================================Submitted To User Verification For Created Payment In Pending Transactions View Is Started==========================================================================================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab Of Pending View On Supervisory Approval Page", logval1);
		RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab Of Pending View On Supervisory Approval Page", RMA_TC_066.StrControlNumber_RMA_TC_066, logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(8, 1, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab Of Pending View On Supervisory Approval Page");
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Text Box", logval1);
		//My Pending Funds Transactions Grid Is Filtered On The Basis Of The Provided Control Number			
	
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPaymentColumnSelector(driver), "Columns Selector For Pending Payments Grid On Supervisory Approval Page", 1);
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claimant"), "Claimant Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Fund Date"), "Fund Date Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Payee"), "Payee Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Amount"), "Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Split Amount"), "Split Amount Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Trans Type"), "Trans Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Comments"), "Comments Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Submitted By"), "Submitted By Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Status"), "Claim Status Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Claim Type"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Line Of Business"), "Claim Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Reserve Type").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Reserve Type")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Reserve Type"), "Reserve Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Service Dates").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Service Dates")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Service Dates"), "Service Dates Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		
		WebElement Element = RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_Type(driver, 1);
		if (Element == null)
		{
			logger.log(LogStatus.INFO,  "Type Column Selector Button For Pending Payments Grid On Supervisory Approval Page");
		}
		
		else
		{
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type").isDisplayed())
		{
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Type"), "Policy Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		}
		
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name").isDisplayed())
		{
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name")));
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Btn_ColToDisplay(driver, 1, "Policy Name"), "Policy Name Column Selector Button For Pending Payments Grid On Supervisory Approval Page", 1);
		}
		//Columns Are Unselected From My Pending Funds Transactions Grid
		
		RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_TC_066.StrControlNumber_RMA_TC_066, "Pending Payments Grid In Supervisory Approval Page", StrExpSubmittedVal, 7, logval1);
		RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab Of Pending View On Supervisory Approval Page", RMA_TC_066.StrControlNumber_RMA_TC_066_01, logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(8,1, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab Of Pending View On Supervisory Approval Page");
		RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXRsvPymntGridFilterTxtBox(driver, 4), "Search Text Box", logval1);;
		RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_TC_066.StrControlNumber_RMA_TC_066_01, "Pending Payments Grid In Supervisory Approval Page", StrExpSubmittedVal1, 7, logval1);
		//===============================================Submitted To User Verification For Created Payment In Pending Transactions View Is Completed==========================================================================================================================================================================================================================================================================
	
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not handled Exception And Print Log Of It
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
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		
		String TestCaseName;
		StrScreenShotTCName = "TC_067";
		
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
			
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		reports.endTest(logger);
		reports.flush();
	}
}
}
