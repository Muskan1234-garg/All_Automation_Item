package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseId     : RMA_TC_047
//Description    :Verify if "Restrict unspecified user" is unchecked then he should be able to approve payment of any amount.
//Depends On TC  : TC_045,TC_035
//Revision       : 0.0 - ImteyazAhmad-01-25-2016
//Modified By    : 0.1 - KumudNaithani-08-03-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching
//========================================================================================================================================================================================================================================================================================================================

public class RMA_TC_047 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;	
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_047_Test() throws Exception,Error
	{
		try
		{
			parentlogger = reports.startTest("TC_047_Payment Can Be Approved Of Any Ammount When Restrict Unspecified Users CheckBox Is Unchecked","Verify If Restrict Unspecified User CheckBox Is Unchecked Then He Should Be Able To Approve Payment Of Any Amount");

			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String LoginUserNameActual;
			String StrClaimNumber_047;
			String StrControlNum_047;
			String StrCheckStatusActual;
			String StrCheckStatusExpected;
			String StrActualErrorMessage;
			String StrErrorMessageExpected;
			String RMAApp_Login_Txt_UserName1;
			String RMAApp_Login_Txt_Password1;
			String LoginUserNameActual1;
			String StrCheckStatusExpected1;
			String StrPrimaryWindowHandle;
			String StrScreenShotTCName;
			int Resframeid;
			//Local Variable Declaration Completed

			String StrAccept = "Yes";
			StrScreenShotTCName = "TC_047";
			StrCheckStatusExpected = "H Hold";
			StrCheckStatusExpected1 = "R Released";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";
			
			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			testcall4 = false;
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMA_Suite_01_SprVsrApprovalTestData Is Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 0); //UserName Fetched From DataSheet RMA_TC_047
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 1); //Password Fetched From DataSheet RMA_TC_047
			RMAApp_Login_Txt_UserName1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 2); //UserName Fetched From DataSheet RMA_TC_047
			RMAApp_Login_Txt_Password1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_047", 1, 3); //Password Fetched From DataSheet RMA_TC_047
			
				
			//==============================================='User 4' Logging In Is Started==========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select A DSN :: RMA_TC_002 ");
			testcall1 = true;	
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			// Data Source Is Selected 
			parentlogger.appendChild(logger);
			
			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "UserName", 0);
			
			//==============================================='User 4' Logging In Is Completed==========================================================================================================================================================================================================================================================================
			//===============================================General Claim Creation Is Started=========================================================================================================================================================================================================================================================================	
					
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A General Claim :: RMA_TC_004");
			testcall2 = true;
			RMA_TC_004 generalClaim = new RMA_TC_004(); 
			StrClaimNumber_047 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_047
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Claim, After TC_004 Is Called ,Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_047, 2));
			parentlogger.appendChild(logger);
			// New Claim Is Created
			//===============================================General Claim Creation Is Completed=========================================================================================================================================================================================================================================================================	
			//===============================================Creation Of New Payment Is Started=====================================================================================================================================================================================================================================================================================	
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_047), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_047+" " +" On Left Navigation Tree", logval);
			parentlogger.log(LogStatus.INFO, "Created General Claim Is Expanded To Access The Menu Options");
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
			//Left Hand Navigation Tree Is Expanded
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, "Financials"), "Financial/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As FinancialReserves Link on Left Navigation Tree Is Clicked");
			
			Resframeid = RMA_GenericUsages_Utility.RMA_FrameNavigation("ReservesFinancials");	
			driver.switchTo().frame(Resframeid);
			RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As  Switch To Financial Reserve Frame  Is Done");

			//PaymentAddition Function is instantiated 
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A Payment :: RMA_TC_006 ");
			testcall3 = true;
			RMA_TC_006 PaymentAdd = new RMA_TC_006();
			StrControlNum_047 = PaymentAdd.PaymentAddition();// Control Number is fetched and stored in variable StrControlNum_047
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "Control Number,After TC_006 Is Called, Is Generated::"+ " " + color.RMA_ChangeColor_Utility(StrControlNum_047, 2));
			parentlogger.appendChild(logger);
			
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);//Check the existence of supervisory approval message
			StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");//Supervisor Approval message is saved in variable .
			StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval."; 
			
			RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Payment Hold Message", 0);//Compare Actual and Expected Message
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Message Verification", StrScreenShotTCName)));
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);
			//===============================================Creation Of New Payment Is Completed=====================================================================================================================================================================================================================================================================================	
			//==============================================='User 5' Logging In Is Started==========================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName1, 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password1, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "DSN Selection Page is loaded");
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select A DSN :: RMA_TC_002 ");
			testcall4 = true;
			dsnselection.RMAApp_DSNSelection();
			loggerval4 = logger.toString();
			// Data Source Is Selected 
			parentlogger.appendChild(logger);
			LoginUserNameActual1 = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName1, LoginUserNameActual1, "UserName", 0);
			//==============================================='User 5' Logging In Completed======================================================================================================================================================================================================================================================================================
			//===============================================Payment Release From Search Screen Is Started==========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("cphMainBody_uwtPortal_frame0");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search_Funds", "Check Control Number Text Box", StrControlNum_047, StrControlNum_047, "Transaction", "num", 2, logval);
			StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Btn_CheckStatusLookUp(driver), "CheckStatus Lookup Button On Transaction Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As CheckStatus Lookup Window Is Loaded");
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Released", "CheckStatus Lookup Window" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait is Added As CheckStatus Selection Is Done");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As Switch To Current Window Is Done");
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Transaction"));//A Switch To The Frame Containing Transaction Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait is Added As Switch To Transaction Frame Is Done ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_Payment_Btn_Save(driver), "Save Image On Transaction Page",0);// Save Image Is Clicked On Transaction Page
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As Transaction Page Is Getting Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Hold Message Negative Verification", StrScreenShotTCName)));
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected1, StrCheckStatusActual, "Check Status ", 0);
			//===============================================Payment Release From Search Screen Is Completed==========================================================================================================================================================================================================================================================================
		
		
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
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);

			}
			else if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_006: Payment Addition" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}	

			else if ((testcall4 == true) && (loggerval4.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			throw (e);	
			}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {
			String TestCaseName;
			StrScreenShotTCName = "TC_047";

			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);

			}
			reports.endTest(parentlogger); 

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
