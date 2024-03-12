package rma_appiumtestcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed
import rma_appiumutilities.RMA_ExcelDataRetrieval_Utility;
import rma_appiumutilities.RMA_ExtentReports_Utility;
import rma_appiumutilities.RMA_Navigation_Utility;
import rma_appiumutilities.RMA_ScreenCapture_Utility;
import rma_appiumutilities.RMA_Verification_Utility;
import rma_appiumutilities.RMA_GenericUsages_Utility;
import rma_appiumutilities.RMA_Input_Utility;
import rma_appiumPOM.RMA_Appium_POM_DefaultView;
import rma_appiumPOM.RMA_Appium_POM_NewTask;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_005
//Description    : Successful New Task Creation Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-02-22-2017
//=================================================================================================
public class RMA_TC_005 extends rma_appiumtestcases.BaseTest{	

@Test
public void RMAApp_TaskCreation() throws Exception,Error
{
	try {
		logger = reports.startTest("TC_005_Task Creation", "New Task Creation Is Validated");
		String TaskName;
		String Description;
		String RMAApp_AttachTask_Lst_TaskType;
		String ActualTaskType;
		String ActualTaskName;
		String ActualDesciption;
		String ActualTaskDueOn;
		//Local Variable Declaration Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMAAppiumTestDataSheets\\RMA_Suite_01_RMAMobileApplication.xlsx");  
		RMAApp_AttachTask_Lst_TaskType = ExcelData.RMA_ExcelStringDataRead_Utility("TC_005", 1, 0); //Task type Fetched From DataSheet TC_005
		//Data Fetched From Excel Data Sheet TC_005
		
		StrScreenShotTCName = "RMA_TC_005";
		//Variable Initialization Completed
	
		RMA_GenericUsages_Utility.RMA_HomeViewUtility(loggerval);
		//RMA Mobile Application Default View Is Loaded Again
		//=========================================New Task Creation Started========================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_DefaultView.RMAApp_DefaultView_Btn_Tasks(),"Tasks Button On Default View Of RMA Mobile App",loggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);;
		globalWait.until(ExpectedConditions.visibilityOf(RMA_Appium_POM_NewTask.RMAApp_Tasks_Btn_New()));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_Tasks_Btn_New(),"New Button On RMA Mobile Application Tasks Page",loggerval);
		//New Task Creation Window Is Opened
		
		TaskName =  RMA_GenericUsages_Utility.RMA_Random_StringGeneration_Utility(3, "Task_");
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Txt_Name(), "Name TextBox On New Tasks Window Of RMA Mobile Application", TaskName, loggerval);
		RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Lst_TaskType(), RMAApp_AttachTask_Lst_TaskType, "Due Date TextBox", "New Tasks Window Of RMA Mobile Application", loggerval);
		// Task Name And Type Is Provided
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Txt_DueDate(),"Due Date TextBox On New Tasks Window Of RMA Mobile Application",loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Txt_DueDate(),"Due Date TextBox On New Tasks Window Of RMA Mobile Application",loggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Btn_DateTimeSet(),"Set Button On Due Date Selector Of RMA Mobile Application Attach Tasks Page",loggerval);
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Txt_TimeDue(),"Time Due TextBox On New Tasks Window Of RMA Mobile Application",loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Txt_TimeDue(),"Time Due TextBox On New Tasks Window Of RMA Mobile Application",loggerval);
		RMA_GenericUsages_Utility.RMA_NativeViewContextSwitch_Utility(loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Btn_DateTimeSet(),"Set Button On Time Due Selector Of RMA Mobile Application Attach Tasks Page",loggerval);
		//Due Date and Time Of Task Is Set
		
		RMA_GenericUsages_Utility.RMA_WebViewContextSwitch_Utility(loggerval);
		Description =  RMA_GenericUsages_Utility.RMA_Random_StringGeneration_Utility(3, "Description_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Txt_Description(),"Description TextBox On New Tasks Window Of RMA Mobile Application", Description,loggerval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Appium_POM_NewTask.RMAApp_AttachTask_Btn_Submit(),"Submit Button On New Tasks Window Of RMA Mobile Application",loggerval);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, loggerval, "Newly Created Task Is Saved");
		//Task Description Is Provided and Newly Created Task Is Saved
		//=========================================New Task Creation Ended========================================================================================================================================================================
		//=========================================Verification Of The Created Task Started========================================================================================================================================================
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Appium_POM_NewTask.RMAApp_Tasks_Txt_SearchTasks(),"Search Tasks TextBox On Tasks Window Of RMA Mobile Application", TaskName,loggerval);
		ActualTaskName = RMA_Appium_POM_NewTask.RMAApp_Tasks_Lbl_SearchedTaskSubject().getText();
		RMA_Verification_Utility.RMA_PartialTextVerification(TaskName, ActualTaskName, "Task Name", loggerval);
		RMA_Verification_Utility.RMA_PartialTextVerification("Subject", ActualTaskName, "Subject Label", loggerval);
		ActualDesciption = RMA_Appium_POM_NewTask.RMAApp_Tasks_Lbl_SearchedTaskDescription().getText();
		RMA_Verification_Utility.RMA_PartialTextVerification(Description, ActualDesciption, "Task Description", loggerval);
		RMA_Verification_Utility.RMA_PartialTextVerification("Entry Notes", ActualDesciption, "Entry Notes Label", loggerval);
		ActualTaskType = RMA_Appium_POM_NewTask.RMAApp_Tasks_Lbl_SearchedTaskActivity().getText();
		RMA_Verification_Utility.RMA_PartialTextVerification(RMAApp_AttachTask_Lst_TaskType, ActualTaskType, "Task Name", loggerval);
		RMA_Verification_Utility.RMA_PartialTextVerification("Work Activity", ActualTaskType, "Work Activity Label", loggerval);
		
		ActualTaskDueOn = RMA_Appium_POM_NewTask.RMAApp_Tasks_Lbl_SearchedDueOn().getText();
		RMA_Verification_Utility.RMA_PartialTextVerification("Due on", ActualTaskDueOn, "Due ON Label", loggerval);
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility("Successful New Task Creation", StrScreenShotTCName,loggerval)));
		//=========================================Verification Of The Created Task Ended========================================================================================================================================================
	} catch (Exception e) {
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

		StackTraceElement[] TraceElement = e.getStackTrace();
		for (StackTraceElement ObjectName : TraceElement)
		{
			if(ObjectName.toString().contains("rma_appiumPOM") || ObjectName.toString().contains("rma_appiumutilities") )
			{
				FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In Following Package :"+" "+ObjectName.toString(); 
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,loggerval);
		}
		
	} catch (Exception |Error e) {

		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
			reports.endTest(logger);
			reports.flush();
	}
}
}



	


