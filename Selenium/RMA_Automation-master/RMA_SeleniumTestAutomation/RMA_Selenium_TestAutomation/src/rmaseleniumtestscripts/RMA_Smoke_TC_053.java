package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
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
//TestCaseID   	 : RMA_Smoke_TC_053
//Description    : Successful Policy MCO Can Be Added, Edited And Deleted From Policy Is Validated
//Depends On TC  : RMA_Smoke_TC_051,RMA_Smoke_TC_052
//Revision       : 0.0 - RenuVerma-09-30-2016 
//=================================================================================================
public class RMA_Smoke_TC_053 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String EntityMain_MCOName1_Smoke_TC_053;
	static String EntityMain_MCOName2_Smoke_TC_053;
	static String EntityMain_TypeOfEntity_Smoke_TC_053;

@Test 
public void RMA_Smoke_TC_053_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_053";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_053_ Add, Edit And Delete Policy MCO From Policy ", "Successful Policy MCO Can Be Added, Edited And Deleted From Policy Is Validated");
		parentlogger.assignAuthor("Renu Verma");
	
		String PolicyTracMCO_BeginDate;
		String PolicyTracMCO_EndDate;
		String StrPrimaryWindowHandle;
		//Local Variable Declaration
		EntityMain_TypeOfEntity_Smoke_TC_053 = "Managed Care Organizations";
		EntityMain_MCOName1_Smoke_TC_053=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Smoke_TC_053_MCO1_");
		EntityMain_MCOName2_Smoke_TC_053=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "Smoke_TC_053_MCO2_");
		
		PolicyTracMCO_BeginDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
		PolicyTracMCO_EndDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(4, 0, 0);
			
		/*===================================New Policy MCO On Maintenance --> Entity Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		// First MCO Creation
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("maintEntity");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver)));
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver), EntityMain_TypeOfEntity_Smoke_TC_053, "Type Of Entity WebList", "Entity Maintenance Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "Name On Entity Maintenance Page", EntityMain_MCOName1_Smoke_TC_053, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("maintEntity", false, "NA", "Maintenance--> Entity Page" ,logval);
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Maintenance--> Entity Page", logval);
		
		// Second MCO Creation
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Entity", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("maintEntity");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver)));
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintEnt_Lst_EntityType(driver), EntityMain_TypeOfEntity_Smoke_TC_053, "Type Of Entity WebList", "Entity Maintenance Page", logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "Name On Entity Maintenance Page", EntityMain_MCOName2_Smoke_TC_053, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("maintEntity", false, "NA", "Maintenance--> Entity Page" ,logval);
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Maintenance--> Entity Page", logval);
		/*=====================================New Policy MCO On Maintenance --> Entity Creation Is Ended Here==========================================================================================================================*/
	
		/*===================================== Policy MCO Addition On Policy Is Started Here==========================================================================================================================*/
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyName(driver)));
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051)));
		RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_051.StrPolicyNum_RMA_Smoke_TC_051, " Policy From The Policy Tracking Lookup Page", logval);
	
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		// First MCO Addition On Policy
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Img_PolicyMCO(driver), "Policy MCO Image On Policy Tracking Page ", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver)));
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver), "Policy MCO TextBox on Policy MCO Page",EntityMain_MCOName1_Smoke_TC_053, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_BeginDate(driver), "Begin Date TextBox on Policy MCO Page",PolicyTracMCO_BeginDate, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_EndDate(driver), "End Date TextBox on Policy MCO Page",PolicyTracMCO_EndDate, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Policy MCO Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false,"NA",logval);
		RMA_Verification_Utility.RMA_TextCompare(EntityMain_MCOName1_Smoke_TC_053, RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver).getAttribute("value"), "Policy MCO", logval);
		
		// Second MCO Addition On Policy
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTrakCov_Img_New(driver), "New Image on Policy MCO Page", logval);
		globalWait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver),"value" ,EntityMain_MCOName1_Smoke_TC_053) ));
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver), "Policy MCO TextBox on Policy MCO Page",EntityMain_MCOName2_Smoke_TC_053, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_BeginDate(driver), "Begin Date TextBox on Policy MCO Page",PolicyTracMCO_BeginDate, logval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_EndDate(driver), "End Date TextBox on Policy MCO Page",PolicyTracMCO_EndDate, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Policy MCO Page", logval);
		RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
		RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false,"NA",logval);
		RMA_Verification_Utility.RMA_TextCompare(EntityMain_MCOName2_Smoke_TC_053, RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver).getAttribute("value"), "Policy MCO", logval);
		/*===================================== Policy MCO Addition On Policy Is Started Here==========================================================================================================================*/
		
		/*===============================================Verify Lookup Table Of Policy In Policy MCO Is Started Here================================*/
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy MCO Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "'Lookup Result' Table", logval);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Look Up Table Verification Is Being Done", StrScreenShotTCName)));
		RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(EntityMain_MCOName1_Smoke_TC_053) , " Policy MCO Lookup",logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.attributeToBe(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver),"value" ,EntityMain_MCOName1_Smoke_TC_053) );
		/*===============================================Verify Lookup Table Of Policy In Policy MCO Is Ended Here================================*/
		
		/*================================================Deletion Of Policy MCO From Policy Is Started Here================================================*/
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete A Policy MCO :" +" "+ color.RMA_ChangeColor_Utility(EntityMain_MCOName1_Smoke_TC_053, 3));
		// First MCO Deletion From Policy
		testcall1 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy MCO in Policy Traking Page" , logval1);
		parentlogger.log(LogStatus.INFO, "Policy MCO Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(EntityMain_MCOName1_Smoke_TC_053, 3));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy MCO Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 2, true, false, "'Lookup Result' Table", logval);
		
		// Second MCO Deletion From Policy
		RMA_Navigation_Utility.RMA_WebLinkSelect(String.valueOf(EntityMain_MCOName2_Smoke_TC_053) , " Policy MCO Lookup",logval);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
		globalWait.until(ExpectedConditions.attributeToBe(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracMCO_Txt_PolicyMCO(driver),"value" ,EntityMain_MCOName2_Smoke_TC_053) );
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",1)+" Is Called To Delete A Policy MCO :" +" "+ color.RMA_ChangeColor_Utility(EntityMain_MCOName2_Smoke_TC_053, 3));
		testcall2= true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy MCO in Policy Traking Page" , logval1);
		parentlogger.log(LogStatus.INFO, "Policy MCO Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(EntityMain_MCOName2_Smoke_TC_053, 3));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy MCO Page", logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_NoRecordToShow(driver), "There Are No Records To Show Label On Policy MCO Lookup Table", logval);
		RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
		driver.switchTo().window(StrPrimaryWindowHandle);
		/*===========================================================Deletion Of Policy MCO On Policy  Is Started Here================================================*/

		
		
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function RMA_GenericDelete_Utility While Deleting First MCO And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function RMA_GenericDelete_Utility While Deleting Second MCO And Hence The Test Case Is A Fail");
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
