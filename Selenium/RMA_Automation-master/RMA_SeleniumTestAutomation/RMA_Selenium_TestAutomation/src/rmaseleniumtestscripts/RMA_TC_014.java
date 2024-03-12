package rmaseleniumtestscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
//RMA Package Import Completed

//===============================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_014
//Description    : Listing Of Transactions Created In RMA_TC_013 In Pending Transaction's Submitted Column Under Current Adjuster's Hierarchy Having  Sufficient Limits To Approve Is Validated. 
//Depends On TC  : TC_011, TC_012, TC_013
//Revision       : 0.0 - KumudNaithani-12-21-2015 
//Modified By    : 0.1 - KumudNaithani-08-03-2016
//				 : Modified To Include Change Related To UX Screen Change, Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching
//==================================================================================================================================================================================================================================================================================================================================

public class RMA_TC_014 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	public static String ExceptionRecorded;
	public static String []ErrorMessage;
	public static String FinalErrorMessage;
	public static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	
@Test 
public void RMA_TC_014_Test () throws Exception, Error 
//Listing Of Transactions Created In RMA_TC_013 In Pending Transaction's Submitted Column Under Current Adjuster's Hierarchy Having  Sufficient Limits To Approve Is Validated. 	
{
	try {
		logger = reports.startTest("TC_014_Listing Of Transactions In Submitted Pending Transactions", "Listing Of Transactions In Submitted Pending Transactions Under Current Adjuster's Hierarchy Having  Sufficient Limits To Approve Is Validated");
		
		String StrExpSubmittedVal;
		//Local Variable Declaration
		
		StrExpSubmittedVal = "curradj";
		
		//===============================================Pending Transactions View Selection In SuperVisory Approval Page Is Started=================================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(1);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On Pending View On The Supervisory Approval Page", logval1);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntPending(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntPending(driver), "Pending Image On The Supervisory Approval Page", logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added Pending Payments View Is Loaded");
		//===============================================Pending Transactions View Selection In SuperVisory Approval Page Is Started======================================================================================================================================================================================================================================================================================
		
		//===============================================Submitted To User Verification For Created Payment In Pending Transactions View Is Started==========================================================================================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_013.StrControlNumber_RMA_TC_013, logval1);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
		
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
		
		RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_TC_013.StrControlNumber_RMA_TC_013, "Pending Payments Grid In Supervisory Approval Page", StrExpSubmittedVal, 7, logval1);
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
		StrScreenShotTCName = "TC_014";
		
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
