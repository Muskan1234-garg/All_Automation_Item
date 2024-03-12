package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_061
//Description    : Successful Event Number Prefix Utility And Include Year Utility Setting Is Validated.
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-11-2016
//=================================================================================================

public class RMA_Smoke_TC_061 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_Smoke_061;
	public static String StrPolicyName_Smoke_061;
	public static String RMAApp_GeneralClaim_Txt_PolicyNo;
	
	@Test
	public void RMA_Smoke_TC_061_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_061_Event Number Prefix And Include Year Utility Setting Functionality", "Successful Event Number Prefix Utility And Include Year Utility Setting Is Validated. ");
			parentlogger.assignAuthor("Renu Verma");

			String StrEventNumber;
			String StrEventPrefix;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_061";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
		
			StrEventPrefix=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(1, "EV");
			//===================================Enabling of General System Parameter Page Setting Is Started Here===================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Txt_EventNumPrefix(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Txt_EventNumPrefix(driver), "Event Number Prefix On General System Parameter Setup Page", StrEventPrefix, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_IncludeYear(driver), "check", "Include Year In Event Number CheckBox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseQualityMangaForEvent(driver), "check", "Use Quality Management CheckBox", "General System Parameter Setup Page", logval);
			Thread.sleep(4000);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===================================Enabling of General System Parameter Page Setting Is Completed Here ===================================

			/*===================================Creation Of Event Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("TC003Event Creation", " RMA_TC_003",0)+" To Create Event");
			testcall1 = true;
			RMA_TC_003 event1 = new RMA_TC_003();
			StrEventNumber = event1.EventCreation();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrEventPrefix + "2015"+ StrEventNumber.substring(7, 11), StrEventNumber, "Event Number", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,StrEventNumber),  " Event Link On Left Naviogation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Close All"), "Close All Option On Event Link Left Navigation ", logval);
			parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrEventNumber, 2));
			/*=====================================Creation Of Event Is Completed Here================================================*/
			
			//===================================  Revert of General System Parameter Page Setting Is Started Here ===================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Txt_EventNumPrefix(driver), "Event Number Prefix On General System Parameter Setup Page", "EVT", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_IncludeYear(driver), "uncheck", "Include Year In Event Number CheckBox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseQualityMangaForEvent(driver), "uncheck", "Use Quality Management CheckBox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===================================Revert of General System Parameter Page Setting Is Completed ===================================
			
			/*===================================Creation Of Event With Reverted Setting Is Started Here================================================*/
			//RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			parentlogger.log(LogStatus.INFO,"Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EventCreation", " RMA_TC_003",1)+" To Create Event");
			testcall2 = true;
			RMA_TC_003 event2 = new RMA_TC_003();
			StrEventNumber = event2.EventCreation();
			loggerval2= logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_PartialTextVerification("EVT" + StrEventNumber.substring(3, 6), StrEventNumber, "Event Number", logval);
			parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrEventNumber, 2));
			/*===================================Creation Of Event With Reverted Setting Is Ended Here================================================*/
			
					
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Testcase RMA_TC_003_EventCreation For First Event And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Testcase RMA_TC_003_EventCreation For Second Event And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

