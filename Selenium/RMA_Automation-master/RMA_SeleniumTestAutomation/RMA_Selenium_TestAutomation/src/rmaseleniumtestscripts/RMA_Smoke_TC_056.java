package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_056
//Description    : Successful Deletion OF Delete Created Policy From Policy Tracking And MCO Entity From Maintenance Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_051,RMA_Smoke_TC_053
//Revision       : 0.0 - RenuVerma-10-04-2016 
//=================================================================================================
public class RMA_Smoke_TC_056 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_056_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	testcall3 = false;	
	loggerval3 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_056";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_056_Delete Created Policy From Policy Tracking And MCO Entity From Maintenance Screen", "Successful Deletion OF Delete Created Policy From Policy Tracking And MCO Entity From Maintenance Screen Is Validated");
		parentlogger.assignAuthor("Renu Verma");
	
		String StrPrimaryWindowHandle;
		String CurrentFrameId;
		//Local Variable Declaration		
		
		/*===========================================================Delete Policy In Policy Tracking Is Started Here================================================*/
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		StrPrimaryWindowHandle=driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, "LINK", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete A Policy :" +" "+ color.RMA_ChangeColor_Utility(RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, 3));
		testcall1 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance--> Policy Tracking Page" , logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "Policy Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, 3));
		driver.switchTo().parentFrame();
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,String.valueOf(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051)), String.valueOf(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051) + " Policy Link", logval);
		RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);
		/*===========================================================Delete Policy In Policy Tracking Is Ended Here================================================*/
		
		/*===========================================================Delete MCO From Entity Is Started Here================================================*/
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Entity");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		StrPrimaryWindowHandle=driver.getWindowHandle();
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver), RMA_Smoke_TC_053.EntityMain_TypeOfEntity_Smoke_TC_053, "Type Of Entity WebList", "Entity Maintenance Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-> Entity Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_053.EntityMain_MCOName1_Smoke_TC_053, " Maintenance-> Entity Lookup Screen", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Entity");
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",1)+" Is Called To Delete MCO1 Entity :" +" "+ color.RMA_ChangeColor_Utility(RMA_Smoke_TC_053.EntityMain_MCOName1_Smoke_TC_053, 3));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance--> Entity Page" , logval1);
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "Entity Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_053.EntityMain_MCOName1_Smoke_TC_053, 2));
		driver.switchTo().parentFrame();
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", logval);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver), RMA_Smoke_TC_053.EntityMain_TypeOfEntity_Smoke_TC_053, "Type Of Entity WebList", "Entity Maintenance Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-> Entity Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,String.valueOf(RMA_Smoke_TC_053.EntityMain_MCOName1_Smoke_TC_053)), RMA_Smoke_TC_053.EntityMain_MCOName1_Smoke_TC_053 + " MCO1 Link On Maintenance-> Entity Page", logval);
		RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_053.EntityMain_MCOName2_Smoke_TC_053, " Maintenance-> Entity Lookup Screen", logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",2)+" Is Called To Delete MCO2 Entity :" +" "+ color.RMA_ChangeColor_Utility(RMA_Smoke_TC_053.EntityMain_MCOName2_Smoke_TC_053, 3));
		testcall3 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance--> Entity Page" , logval1);
		loggerval3 = logger.toString();
		parentlogger.appendChild(logger);
		driver.switchTo().parentFrame();
		parentlogger.log(LogStatus.INFO, "Entity Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_053.EntityMain_MCOName2_Smoke_TC_053, 2));
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", logval);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver), RMA_Smoke_TC_053.EntityMain_TypeOfEntity_Smoke_TC_053, "Type Of Entity WebList", "Entity Maintenance Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-> Entity Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,String.valueOf(RMA_Smoke_TC_053.EntityMain_MCOName2_Smoke_TC_053)), RMA_Smoke_TC_053.EntityMain_MCOName2_Smoke_TC_053 + " MCO2 Link On Maintenance-> Entity Page", logval);
		RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);		
		/*===========================================================Delete MCO From Entity Is Ended Here================================================*/
		
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
		if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		if ((testcall3 == true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
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
