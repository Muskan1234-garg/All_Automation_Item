package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Funds_SprApproval;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_040
//Description    : Transaction Created In RMA_TC_036 Is Listed For Manager Of Login User Manager And User Has Also Received A Diary For The Same Is Validated
//Depends On TC  : TC_011, TC_035, TC_036, TC_039
//Revision       : 0.0 - KumudNaithani-01-20-2016
//Modified By    : 0.1 - KumudNaithani-08-08-2016
//				 : Modified To Include Change Related To UX Screen Change, Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching
//=======================================================================================================================================================================================================================================================================================================================================================================


public class RMA_TC_040 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


@Test 
public void RMA_TC_040_Test () throws Exception, Error
//Transaction Created In RMA_TC_036 Is Listed For Manager Of Login User Manager And User Has Also Received A Diary For The Same Is Validated
{
	try {
		parentlogger = reports.startTest("TC_040_Transaction Is Listed For Manager Of Login User Manager", "Is Listed For Manager Of Login User Manager And And User Has Also Received A Diary For The Same Is Validated");
		String StrAccept;
		String RMAApp_Login_Txt_UserName;
		String RMAApp_Login_Txt_Password;
		String AttachedRecord;
		String TaskName;
		String ParentRecord;
		String TaskNameVal;
		String Strlogstatement;
		String LoginUserNameActual;
		//Local Variable Declaration
		
		StrAccept = "Yes";
		AttachedRecord = "FUNDS:"+" "+RMA_TC_036.StrControlNumber_RMA_TC_036;
		TaskName = "Check On Hold";
		TaskNameVal = "Payments:"+" "+ RMA_TC_036.StrControlNumber_RMA_TC_036;
		ParentRecord = "Claim:"+RMA_TC_036.StrClaimNumber_RMA_TC_036;
		loggerval1 = "NotInitialized";
		testcall1 = false;
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_040", 1, 0); //UserName Fetched From DataSheet RMA_TC_040
		RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_040", 1, 1); //Password Fetched From DataSheet RMA_TC_040
		
		
		//==============================================='LoginMgr2' Logging In Is Started====================================================================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		//Application Is Logged Out
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Application Is Being Logged In");;
		//Application Is Logged In
		
		parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select The DataSource");
		testcall1 = true;
		RMA_TC_002 dsnselection = new RMA_TC_002();
		dsnselection.RMAApp_DSNSelection();
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		//Data Source Is Selected
		
		LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName", 0);
		
		//==============================================='LoginMgr2' Logging In Is Completed====================================================================================================================================================================================================================================================================================================================
		
		//===============================================Existence Of Payment Created In TC_036 In Diaries Page Validation Is Started==========================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_Functionality_Utility.RMA_DiaryRecordsCheck_Utility(AttachedRecord, 1, 7, 0, TaskName,  TaskNameVal, ParentRecord, "Not Required", "Not Required", false, logval);
		//Values In The Diaries Table Displayed In The Default RMA Application Page Are Verified
		//===============================================Existence Of Payment Created In TC_036 In Diaries Page Validation Is Completed==========================================================================================================================================================================================================================================================================
		
		//==============================================Payment Created In TC_036 Approval Is Started=================================================================================================================================================================================================================================================================================================================
		driver.switchTo().parentFrame(); // A Switch To The Web Frame Containing Menu Options Is Made
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-SupervisoryApproval", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Supervisory Approval");
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Tab_Payment(driver), "Payment Tab On User View On The Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added Pending Payments View Is Loaded");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_036.StrControlNumber_RMA_TC_036, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");

		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_UXPymntGridFilterRowSelectorMark(driver), "Control Number Selection Tick Mark Arrow On Payment Tab Of Supervisory Approval Page", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_PymntApprove(driver), "Approve Image On The Supervisory Approval Page", logval);
		
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Img_GenericcSave(driver), "Save Image On The Approval Window On The Supervisory Approval Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Save Image Is Clicked On Payment Approval Window On Supervisory Approval Page");
			
		if (RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_PaymntNoRecordsAvailable(driver).isDisplayed() )
		{
			Strlogstatement  = "Payment with Control Number" + " " + RMA_TC_036.StrControlNumber_RMA_TC_036 + " " + "Does Not Exist In Payment UXGrid On Supervisory Approval Page";
			parentlogger.log(LogStatus.INFO, Strlogstatement);
		}
		else
		{
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Control Number",2), "Control Number Filter TextBox On Payment Tab  On Supervisory Approval Page", RMA_TC_036.StrControlNumber_RMA_TC_036 , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Funds_SprApproval.RMAApp_SprApproval_Txt_UXPymntGridFilterTxtBox(driver,2,"Split Amount",2), "Split Amount Filter TextBox On Payment Tab On Supervisory Approval Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Control Number Value Is Set In Filter TextBox In Payment Tab On Supervisory Approval Page");
			//Payments Grid Is Filtered On The Basis Of The Provided Control Number
			RMA_Verification_Utility.RMA_VerifyRecordNotExistInUXGrid_Utility(RMA_TC_036.StrControlNumber_RMA_TC_036 , "Payment UXGrid On Supervisory Page", logval);
		}
		//==============================================Payment Created In TC_036 Approval Is Completed==========================================================================================================================================================================================================================================================================	
		
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
		
		if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result)//All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		StrScreenShotTCName = "TC_040";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
		}
		
	} catch (Exception |Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );

	}
	finally
	{
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}
	