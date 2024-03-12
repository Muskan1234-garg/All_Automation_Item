package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_054
//Description    : Successfully Functionality Of Clone Policy button Is Validated
//Depends On TC  : RMA_Smoke_TC_051
//Revision       : 0.0 - RenuVerma-10-04-2016 
//=================================================================================================
public class RMA_Smoke_TC_054 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_054_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_054";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_054_Clone Policy", "Successfully Functionality Of Clone Policy button Is Validated");
		parentlogger.assignAuthor("Renu Verma");
	
		String StrPrimaryWindowHandle;
		int PolicyTracking_PolicyNo;
		//Local Variable Declaration		
		
		PolicyTracking_PolicyNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11111, 99999);
		/*===========================================================Clone Policy Functionality Verification On Policy Tracking Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051)));
		RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051, "Policy From The Policy Tracking Lookup Page", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Img_PolicyClone(driver), "Policy Clone Image On Policy Tracking Page", logval);
		globalWait.until(ExpectedConditions.attributeToBe(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver),"value", "Copy of " + RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051));
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver), "Policy No TextBox On Policy Tracking Page", String.valueOf(PolicyTracking_PolicyNo), logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Policy Coverage Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false,"NA",logval);	
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Saved Clone Policy", StrScreenShotTCName)));
		String CopyOfPolicyName_RMA_Smoke_TC_054= RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver).getAttribute("value");
		RMA_Verification_Utility.RMA_TextCompare( "Copy of " + RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, CopyOfPolicyName_RMA_Smoke_TC_054, "Clone Policy Name", logval);
		RMA_Verification_Utility.RMA_TextCompare( new SimpleDateFormat("MM/dd/yyyy").format(RMA_Smoke_TC_051.PolicyTracking_EffDate_Smoke_TC_051),  RMA_Selenium_POM_PolicyTracking.RMAApp_Policy_Txt_Effectivedate(driver).getAttribute("value"),"Effective Date", logval);
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Policy Tracking", logval);
		
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
	
		 StrPrimaryWindowHandle = driver.getWindowHandle();		 
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), CopyOfPolicyName_RMA_Smoke_TC_054, "LINK", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");		
		/*===========================================================Clone Policy Functionality Verification On Policy Tracking Is Ended Here=======================================================================================================================================================================================*/
				
		/*===========================================================Delete Clone Policy In Policy Tracking Is Started Here================================================*/
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete A Clone Policy :" +" "+ color.RMA_ChangeColor_Utility(CopyOfPolicyName_RMA_Smoke_TC_054, 2));
		testcall1 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy Tracking --> Cloned Policy Page " , logval1);
		parentlogger.log(LogStatus.INFO, "Clone Policy Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(CopyOfPolicyName_RMA_Smoke_TC_054, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Delete Clone Policy In Policy Tracking Is Ended Here================================================*/

		
		
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Un-Handled Exception And Print Log Of It
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		driver.switchTo().parentFrame();
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
