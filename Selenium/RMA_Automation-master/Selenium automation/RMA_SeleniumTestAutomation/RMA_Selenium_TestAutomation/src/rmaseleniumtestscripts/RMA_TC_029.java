package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed 

//======================================================================================================================================================================================================================================================================================================================================================================================
//TestCaseId     : RMA_TC_022
//Description    : Verify Payment can be created and is going on Hold because of exceeded payment limits
//Depends On TC  : TC_011 & TC_028
//Revision       : 0.0 - ImteyazAhmad-12-23-2015 
//Modified By    : 0.1 - KumudNaithani-08-09-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching, Corrected Test Case ID. Added Web Page Refresh At The Beginning
//==============================================================================================================================================================================================================================================================================================================================================================================

public class RMA_TC_029 extends RMA_TC_BaseTest {
	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;	
	static String StrClaimNumber_029;
	static String StrControlNum_029;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_TC_029_Test() throws Exception,Error {
		try{
		parentlogger = reports.startTest("TC_029_Payment is Created and Going on Hold","Verify Payment can be created and is going on Hold because of exceeded payment limits");
		
		String RMAApp_Login_Txt_UserName;
		String RMAApp_Login_Txt_Password;
		String StrAccept;
		String AdjusterName_TC_029;
		String StrActualErrorMessage;
		String StrErrorMessageExpected;
		String LoginUserNameActual;
		String StrCheckStatusExpected;
		String StrCheckStatusActual;
		//Local Variable Declaration Completed
		
		
		StrAccept = "Yes";
		StrCheckStatusExpected ="H Hold";
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		loggerval3 = "NotInitialized";
		loggerval4 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		testcall3 = false;
		testcall4 = false;
		
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_029", 1, 0); //UserName Fetched From DataSheet RMA_TC_029
		RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_029", 1, 1); //Password Fetched From DataSheet RMA_TC_029
		
		
		//==============================================='LoginUser' Logging In Is Started==========================================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
		driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application",0);
		RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName,0);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password,0);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
		// Application Is Logged In
		
		parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select DSN :: RMA_TC_002, ");
		testcall1 = true;
		RMA_TC_002 dsnselection = new RMA_TC_002();
		dsnselection.RMAApp_DSNSelection();
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		
		// Data Source Is Selected 
		LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
		RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName", 0);
		//==============================================='LoginUser' Logging In Is Completed=========================================================================================================================================================================================================================================================================
		
		//===============================================General Claim Creation Is Started=============================================================================================================================================================================================================================================================================
		parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A General Claim :: RMA_TC_004");
		testcall2 = true;
		RMA_TC_004 generalClaim = new RMA_TC_004(); 
		StrClaimNumber_029 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_022
		loggerval2 = logger.toString();
		parentlogger.log(LogStatus.INFO,  "New Claim, After TC_004 Is Called ,Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_029, 2));	
		parentlogger.appendChild(logger);
		// New Claim Is Created	
		//===============================================General Claim Creation Is Completed=============================================================================================================================================================================================================================================================================
		
		//===============================================General Claim's Adjuster Creation Is Started=========================================================================================================================================================================================================================================================================	  
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_029), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_029+" " +" On Left Navigation Tree", logval);
		parentlogger.log(LogStatus.INFO, "Created General Claim Is Expanded To Access The Menu Options");
		RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded");
		//Left Hand Navigation Tree Is Expanded
	
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_ClaimEntityAddition_Utility Is Called To Create An Adjuster ");
		testcall4 = true;
		AdjusterName_TC_029 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Adjustor", "Adjuster (0)", StrClaimNumber_029, "curradj", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
		parentlogger.log(LogStatus.INFO, "New Adjuster Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(AdjusterName_TC_029, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		driver.switchTo().parentFrame();
		//===============================================General Claim's Adjuster Creation Is Completed============================================================================================================================================================================================================================================================================	
		
		//===============================================Creation Of New Payment Is Started=========================================================================================================================================================================================================================================================================================	
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, "Financials"), "Financial/Reserves Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2,0,"Wait Is Added As FinancialReserves Link on Left Navigation Tree Is Clicked");	
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials");
			
		//PaymentAddition Function is instantiated 
		parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A Payment :: RMA_TC_006 ");
		testcall3 = true;
		RMA_TC_006 PaymentAdd = new RMA_TC_006();
		StrControlNum_029 = PaymentAdd.PaymentAddition();// Control Number is fetched and stored in variable StrControlNum_029
		loggerval3 = logger.toString();
		parentlogger.log(LogStatus.INFO, "Control Number,After TC_006 is Called, is Generated::"+ " " + color.RMA_ChangeColor_Utility(StrControlNum_029, 2));
		parentlogger.appendChild(logger);
		//===============================================Creation Of New Payment Is Completed========================================================================================================================================================================================================================================================================================
		
		//===============================================Payment Going On Hold Verification Is Started=========================================================================================================================================================================================================================================================================	
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Error Message",0);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "Payment On Hold Requires SuperVisory Approval Error Message",0);//Check the existence of supervisory approval message
		StrActualErrorMessage = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Err_SprApprovalHoldText(driver), "innerHTML");//Supervisor Approval message is saved in variable .
		StrErrorMessageExpected = "A hold requiring supervisory approval has been placed on this payment because Exceeded Payment Limit and requires managerial approval."; 
		RMA_Verification_Utility.RMA_TextCompare(StrErrorMessageExpected, StrActualErrorMessage, "Correct Error Message Display", 0);//Compare Actual and Expected Message
		StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);
		//===============================================Payment Going On Hold Verification Is Started=========================================================================================================================================================================================================================================================================			
		
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			StrScreenShotTCName = "TC_029";

			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
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
	
	