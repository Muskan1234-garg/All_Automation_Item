package rmaseleniumtestscripts;

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
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_055
//Description    : Successful Attach a Policy to a Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-04-2016 
//=================================================================================================
public class RMA_Smoke_TC_055 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_055_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_055";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_055_Verify that Policy Can Be Attach On Claim.", "Successful Attach a Policy to a Claim Is Validated");
		parentlogger.assignAuthor("Renu Verma");

		String StrPrimaryWindowHandle;
		//Local Variable Declaration
		
		/*===========================================================Clone Policy On Policy Tracking Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
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
		globalWait.until(ExpectedConditions.attributeContains(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver),"value", "Copy of " + RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Policy Coverage Page", logval);
		driver.switchTo().parentFrame();
		globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Image To Be Disappear
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false,"NA",logval);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Saved Clone Policy", StrScreenShotTCName)));
		String CopyOfPolicyName_RMA_Smoke_TC_055= RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver).getAttribute("value");
		String CopyOfPolicyNum_RMA_Smoke_TC_055= RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver).getAttribute("value");
		RMA_Verification_Utility.RMA_TextCompare( "Copy of " + RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, CopyOfPolicyName_RMA_Smoke_TC_055, "Clone Policy Name", logval);
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Policy Tracking", logval);
		
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(CopyOfPolicyNum_RMA_Smoke_TC_055)));
		RMA_Navigation_Utility.RMA_WebLinkSelect(CopyOfPolicyNum_RMA_Smoke_TC_055, "Policy From The Policy Tracking Lookup Page", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		
		/*===========================================================Clone Policy On Policy Tracking Creation Is Started Here=======================================================================================================================================================================================*/
				
		/*===========================================================Deletion Of Clone Policy In Policy Tracking Is Started Here================================================*/

		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Clone Policy :" +" "+ color.RMA_ChangeColor_Utility(CopyOfPolicyName_RMA_Smoke_TC_055, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy Coverage ::" + CopyOfPolicyName_RMA_Smoke_TC_055 , logval1);
		parentlogger.log(LogStatus.INFO, "Policy MCO Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(CopyOfPolicyName_RMA_Smoke_TC_055, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Coverage Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(	driver.findElement(By.linkText("CopyOfPolicyName_RMA_Smoke_TC_055")), CopyOfPolicyName_RMA_Smoke_TC_055 + "Clone Policy Link", logval);
		RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
		driver.switchTo().window(StrPrimaryWindowHandle);
		
		/*===========================================================Deletion Of Clone Policy In Policy Tracking Is Ended Here================================================*/

		
		
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PolicyTracking_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	}
	}
}
