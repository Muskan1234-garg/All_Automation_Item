package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PaymentParameterSetUp;
import rmaseleniumPOM_UX.RMA_Selenium_POM_UserPrivilegesSetUp;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_029_C
//Description  	 : To Reset The Payment Parameter, General System Parameter And User Privilege Settings After Suite32 Is Validated
//Revision		 : 0.0 - AnubhutiVyas -09-19-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_029_C extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_029_C_Test() throws Exception, Error
	{	
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_029_C";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Is Completed Here
		
		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_029_C_To Reset The Old UI Settings Of Suite32", "To Reset The Payment Parameter, General System Parameter And User Privilege Settings After Suite32 Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");
			
			String RMAApp_UserPrev_Lst_LOB;
			String RMAApp_UserPrev_Lst_CurrUser;
			String StrPrimaryWindowHandle;
			//Local Variable Declaration Is Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite11_QTPRegression_04.xlsx"); //Excel WorkBook RMA_Suite_11_QTPRegression_04 IS Fetched To Retrieve Data 
			RMAApp_UserPrev_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_029", 1, 7); //LOB Is Fetched From DataSheet RMA_QTPRegression_TC_029
			RMAApp_UserPrev_Lst_CurrUser =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_029", 1,8 ); //User Is Fetched From DataSheet RMA_QTPRegression_TC_029
			// Data Fetch From Excel WorkBook Is Completed Here
			
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
			
			//==============================================================Steps To Navigate To Payment Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-PaymentParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PaymntParaSetupFrame);
			//==============================================================Steps To Navigate To Payment Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================
			//==============================================================Payment Parameter Setup Is Started Here=================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supervisor Approval Configuration"), "Supervisor Approval Configuration Tab On Payment Parameter Setup Page",logval);//Supervisor Approval Configuration On Payment Parameter Setup Page Is Clicked
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentParameterSetUp.RMAApp_PmntSetUpSprVsr_Chk_QueuePaymentInsteadOFPlacingOnHold(driver), "uncheck", "Queue Payment Instead Of Placing On Hold Check Box", "Payment Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.PaymntParaSetupFrame, false, "NA", "Payment Parameter Setup Page", logval);
			//==============================================================Payment Parameter Setup Is Completed Here=================================================================================================================================================================================================================================================
			//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame);
			//==============================================================Steps To Navigate To General System Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================
			//==============================================================General System Parameter Setup Is Started Here=================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "System Settings"), "System SettingsTab On General System Parameter Setup Page",logval);//System Settings Tab On General System Parameter Setup Page Is Clicked
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseEntityPaymentApproval(driver), "uncheck","Use Entity Payment Approval CheckBox", "General System Parameter Setup Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Diaries / Text Fields"), "Diaries / Text Fields Tab On General System Parameter Setup Page",logval);// Diaries / Text Fields Tab On General System Parameter Setup Page Is Clicked
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Txt_HrsForWhichEnhNoteAreEditable(driver), "Hours For Which Enhanced Notes Are Editable TextBox On General System Parameter Setup Page", "0.00",logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.GenSysParaSetupFrame, false, "NA", "General System Parameter Setup Page", logval);
			//Save Button Is Clicked To Save The Settings
			//==============================================================General System Parameter Setup Is Completed Here=================================================================================================================================================================================================================================================
			//==============================================================Steps To Navigate To User Privileges Set Up Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Security-UserPrivilegesSetup", logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, StrPrimaryWindowHandle, "NA", "NA", "Navigation TO User Privileges Setup", logval);
			logger.log(LogStatus.INFO, "User-Privileges SetUp Page Of RMA Application Is Opened");
			driver.manage().window().maximize();
			//==============================================================Steps To Navigate To User Privileges Set Up Screen Is Completed Here=================================================================================================================================================================================================================================================
			//==============================================================User Privileges Set Up Is Started Here=================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_LOB(driver), RMAApp_UserPrev_Lst_LOB,"LineOfBusiness List Box","RISKMASTER User-Privileges SetUp Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Payment Limits"), "Payment Limits Tab On User Privileges Setup Page",logval);//Payment Limits Tab On User Privileges Setup Page Is Clicked
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Payment Limits Tab Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Rdb_Users(driver), "Users Radio Button On User Privileges Setup Page",logval);//Payment Limits Tab On User Privileges Setup Page Is Clicked
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrev_Lst_UserGroup(driver), RMAApp_UserPrev_Lst_CurrUser,"User List Box","RISKMASTER User-Privileges SetUp Page's Payment Limits Tab",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(12, logval, "Wait Is Added As User Is Selected in Users/Group List");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Rdb_PaymentLimitsGridRadioButton(driver), "Payment Limit Radio Button On User Privileges SetUp Page's Payment Limits Tab", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_UserPrivilegesSetUp.RMAApp_UserPrevPymntLimit_Btn_Remove(driver), "Remove Button For Payment Limits", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 1, "Wait Is Added As Payment Limit Max Amount For User Is Removed");
			driver.close();
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//==============================================================User Privileges Set Up Is Completed Here=================================================================================================================================================================================================================================================
				
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



