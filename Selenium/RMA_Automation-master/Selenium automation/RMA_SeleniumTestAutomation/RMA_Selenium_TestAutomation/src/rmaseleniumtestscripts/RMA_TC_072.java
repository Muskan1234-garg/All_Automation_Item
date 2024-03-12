package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_TC_072
//Description    : Verify user is able to approve the transaction  
//Depends On TC  : TC_064, TC_065 , TC_066 & TC_071
//Revision       : 0.0 - ImteyazAhmad-02-10-2016 
//=================================================================================================

public class RMA_TC_072 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_072_Test () throws Exception, Error
	{
		try {
			logger = reports.startTest("TC_072_ $2500 Hold Transactions Is Approved By Top Level Manager", "Verify Top Level Manager Is Able To Approve The Transactions");

			String ObjDescription;			
			//Local Variable Declaration

			StrScreenShotTCName = "TC_072";


			//==============================================Existence Verification Of Control $2500 In TC_066 Is Started==========================================================================================================================================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval1);
			
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval1, "Wait Is Added Payments View Is Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval1);
			RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_066.StrControlNumber_RMA_TC_066_01, logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval1, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval1);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_TC_066.StrControlNumber_RMA_TC_066_01, "Payment UXGrid On Supervisory Approval", "$2,500.00", 7, logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval1);

			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval1, "Wait Is Added As Save Image On Supervisory Approval Is Clicked");

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image On Supervisory Approval Page", logval1);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval1, "Wait Is Added As Payemnt Tab On Supervisory Approval Page Is Clicked");

			if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
			{				
				ObjDescription  = "Record With Control Number" + " " + RMA_TC_066.StrControlNumber_RMA_TC_066_01 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
				logger.log(LogStatus.PASS, ObjDescription);
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "$2500 Hold Transaction Approved By Top Level Manager's List", StrScreenShotTCName)));
				
			}

			else
			{
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval1);
				RMA_Input_Utility.RMA_ActionSetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Control Number", 2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_066.StrControlNumber_RMA_TC_066_01, logval1);
				RMA_GenericUsages_Utility.RMA_StaticWait(7, logval1, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver, 2, "Fund Date", 2), "Fund Date Filter TextBox On Payment Tab On Supervisory Approval Page", logval1);
				RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(RMA_TC_066.StrControlNumber_RMA_TC_066_01, "Payment UXGrid On Supervisory Approval Page", logval1);
			}

		} catch (Exception|Error e) {

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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
			}

		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			reports.endTest(logger);
			reports.flush();
		}
	}
}
