package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankAccount;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Claims_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_074
//Description    : Verify That You Can Create, Edit And Delete A Bank Account Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-02-26-2018 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_074  extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_074_Test() throws Exception,Error {			

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_074_Create, Edit And Delete A Bank Account Is Validated", "Verify That You Can Create, Edit And Delete A Bank Account Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=========================================================================================
			StrScreenShotTCName = "RMA_Smoke_TC_074";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			ErrorMessage = null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 

			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================	
			String BankAccountCreation_Txt_BankAccountName;			
			int BankAccountCreation_Txt_ZipCode;
			String BankAccountCreation_Txt_BankAccountAddr1;			
			String BankAccountCreation_Txt_BankAccountStateId;
			String BankAccountCreation_Txt_BankAccountCity;
			int BankAccountCreation_Txt_BankAccountChkNumber;
			int BankAccountCreation_Txt_BankAccountNo;
			String BankAccountCreation_Txt_BankAccountType;
			String BankAccountCreation_Txt_BankAccountType_Edited;
			int BankAccountCreation_Txt_BankAccountChkNumber_Edited;	 
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================

			//Region =====================================================Local Variable Initialization Started Here=====================================================================================================
			BankAccountCreation_Txt_BankAccountName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "AQRMABank_");
			BankAccountCreation_Txt_ZipCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999);	
			BankAccountCreation_Txt_BankAccountNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
			BankAccountCreation_Txt_BankAccountAddr1 = "1200 barclay towers";			
			BankAccountCreation_Txt_BankAccountStateId = "NJ";
			BankAccountCreation_Txt_BankAccountCity = "Mount Laurel";
			BankAccountCreation_Txt_BankAccountType = "SA";			
			BankAccountCreation_Txt_BankAccountChkNumber =95641;
			BankAccountCreation_Txt_BankAccountType_Edited = "CA";
			BankAccountCreation_Txt_BankAccountChkNumber_Edited = 95800;
			//EndRegion ==================================================Local Variable Initialization Completed Here==================================================================================================
			
			//Region========================================Steps To Create Bank Account Is Started Here==============================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Create A Bank Account");
			testcall1 = true;
			RMA_Claims_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Create",BankAccountCreation_Txt_BankAccountAddr1,BankAccountCreation_Txt_BankAccountCity,BankAccountCreation_Txt_BankAccountStateId,BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountNo,BankAccountCreation_Txt_BankAccountName, BankAccountCreation_Txt_BankAccountType, BankAccountCreation_Txt_BankAccountChkNumber, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Created Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion========================================Steps To Create Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//Region===========================================================Verification That All Tabs Are Present For Bank Account Screen Started Here==============================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Tab_AccountOwner(driver), "Account Owner Tab On Bank Account Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Tab_Supplementals(driver), "Supplementals Tab On Bank Account Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Tab_GeneralInfo(driver), "General Info Tab On Bank Account Creation Page",logval);
			//EndRegion===========================================================Verification That All Tabs Are Present For Bank Account Screen Completed Here==============================================================================================================================================================================================

			driver.switchTo().parentFrame();			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On RMA Application Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			
			//Region========================================Steps To Edit Bank Account Is Started Here==============================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Funds-BankAccount", logval);	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.BankAccountFrame);					
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_BankAccount.RMAApp_BankAccount_Img_LookUp(driver), "Lookup Image Button On RMA Application Bank Account Page", logval);			
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_BankAccount.RMAApp_BankAccountTbl_Txt_BankAccountNGGrid_FilterTextBox(driver,"Account Name"), "Account Number Filter Text Box On Bank Account Table", BankAccountCreation_Txt_BankAccountName,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid			
			RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(BankAccountCreation_Txt_BankAccountNo), "Bank Accounts LookUp Window On Bank Account Page", logval);
						
			driver.switchTo().parentFrame();	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Status Is Selected On Reserve Creation Page");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Bank Account (New)", "Left Panel Link For Blank Bank Account  On Bank Account Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On RMA Application Bank Account Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Status Is Selected On Reserve Creation Page");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(BankAccountCreation_Txt_BankAccountName, "Left Panel Link For Created Claim On Bank Account Page", logval);
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("BankAccount","RMA_BankAccount_AddEdit_Utility",0)+" To Successfully Edit A Bank Account");
			testcall2 = true;
			RMA_Claims_Functionality_Utility.RMA_BankAccount_AddEdit_Utility("Edit",BankAccountCreation_Txt_BankAccountAddr1,BankAccountCreation_Txt_BankAccountCity,BankAccountCreation_Txt_BankAccountStateId,BankAccountCreation_Txt_ZipCode,BankAccountCreation_Txt_BankAccountNo,BankAccountCreation_Txt_BankAccountName, BankAccountCreation_Txt_BankAccountType_Edited, BankAccountCreation_Txt_BankAccountChkNumber_Edited, "Anodizing", true,"BANKADDR2", logval1);
			parentlogger.log(LogStatus.INFO, "Bank Account Is Edited Successfully With Name"+ " " + color.RMA_ChangeColor_Utility(BankAccountCreation_Txt_BankAccountName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion========================================Steps To Edit Bank Account Is Completed Here==============================================================================================================================================================================================================================================

			//Region==========================================================Delete Of Created Bank Account Is Started Here=============================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Bank Account Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Bank Account Page", true, logval);
			//EndRegion==========================================================Delete Of Created Bank Account Is Completed Here========================================================================================================================================================================================================================
			

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_BankAccount_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				// driver.switchTo().parentFrame();		 //In Claim Creation Test Cases In The Try Block Have Kept The Logic To Switch To Parent Frame As To Facilitate Code Stability
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}	

}

