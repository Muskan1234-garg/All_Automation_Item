package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_017
//Description    : RMA_SeleniumRegression_TC_017_ Successfully Edit The Diary On Diary List Page Is Validated
//Depends On TC  : RMA_SeleniumRegression_TC_016
//Revision       : 0.0 - RenuVerma-09-01-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_017 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	public static String EditedDiaryTaskName_TC_017;
	public static String EditedDueDate_TC_017;
	@Test
	public void RMA_SeleniumRegression_TC_017_Test() throws Exception,Error {
		
		StrScreenShotTCName = null;
		StrScreenShotTCName ="RMA_SeleniumRegression_TC_017";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed 

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_017_ Edit The Diary On Diary List Page", " Successfully Edit The Diary On Diary List Page Is Validated ");
			parentlogger.assignAuthor("RenuVerma");
			
			EditedDueDate_TC_017=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 6, 0,"MM/dd/yyyy");
			//Variable Initialization Completed
				
			//==============================Steps To Edit The Diary On Diary List Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, RMA_SeleniumRegression_TC_016.DiaryTaskName_TC_016), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+RMA_SeleniumRegression_TC_016.DiaryTaskName_TC_016+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Edit(driver), "Edit Diary Image On Diary List Page", logval);
			EditedDiaryTaskName_TC_017 = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Edit", "NA", "NA", "NA", "NA", EditedDueDate_TC_017, "Important","NA", logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Edited Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(EditedDiaryTaskName_TC_017, 3)+" "+"On Diary List Page");				
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",EditedDiaryTaskName_TC_017, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);	
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(EditedDiaryTaskName_TC_017, "Diary UX Grid",new String[]{ "Work Activity","Priority","Due"},new String[]{ RMA_SeleniumRegression_TC_016.ActivityList_TC_016,"Important",EditedDueDate_TC_017}, logval);
			//==============================Steps To Edit The Diary On Diary List Page Is Ended Here================================================================================================
			
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
			
			throw (e);
		}

	}		

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)   //All The Information Associated With The Test Case Is Stored In Result Variable
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

