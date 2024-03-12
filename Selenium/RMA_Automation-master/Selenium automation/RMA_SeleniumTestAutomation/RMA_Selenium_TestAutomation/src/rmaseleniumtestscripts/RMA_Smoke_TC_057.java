package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_057
//Description    : Successful Creation, Edit, And Delete Of Employee From Maintenance Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-05-2016 
//=================================================================================================
public class RMA_Smoke_TC_057 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_057_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	testcall3 = false;	
	loggerval3 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_057";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_057_Create, Edit And Delete Employee From Maintenance", "Successful Creation, Edit, And Delete Of Employee From Maintenance Is Validated");
		parentlogger.assignAuthor("Renu Verma");
			
		String StrEmployeeNumber;
		String StrEditedEmpNum;
		String CurrentFrameID;
		String StrPrimaryWindowHandle;
	//Local Variable Declaration
	
		/*=====================================Creation Of Employee From Maintenance Is Started Here================================================*/
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityAdd", "RMA_MaintEntityAddition_Utility",0)+" Is Called To Create An Employee ");
		testcall1 = true;
		StrEmployeeNumber = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("Employee", logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "New Employee Is Created Successfully With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2));
		/*===================================Creation Of Employee From Maintenance Is Completed Here================================================*/

		/*===================================Edit Employee Is Started Here================================*/
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Employee");
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityEdit", "RMA_MaintenanceEntityEdit_Utility",0)+" Is Called To Edit An Employee ");
		testcall2 = true;
		StrEditedEmpNum = RMA_Functionality_Utility.RMA_MaintenanceEntityEdit_Utility("Employee", logval1);
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Edited", StrScreenShotTCName)));
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		/*=================================================Edit Employee Is Completed Here=============================================*/

		/*======================================Delete Existing Employee Is Started Here================================================*/
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete An Employee ");
		testcall3 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance--> Employee Page", logval1);
		loggerval3 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully And Its Employee Number Was::"+ " " + color.RMA_ChangeColor_Utility(StrEditedEmpNum, 3));
		driver.switchTo().parentFrame();
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Employee", logval1);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameID);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance--> Employee Page", logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(	RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, StrEditedEmpNum), StrEditedEmpNum + " Employee Number Link", logval);
		RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
		driver.switchTo().window(StrPrimaryWindowHandle);		
		/*======================================Delete Existing Employee Is Completed Here================================================*/
	
		
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_MaintEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_MaintenanceEntityEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
