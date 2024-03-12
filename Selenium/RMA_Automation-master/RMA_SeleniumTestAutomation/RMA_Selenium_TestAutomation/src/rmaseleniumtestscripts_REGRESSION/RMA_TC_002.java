package rmaseleniumtestscripts_REGRESSION;

import java.text.SimpleDateFormat;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_002
//Description    : RMA_TC_002_ Successfully Edit The Diary On Diary List Page Is Validated
//Depends On TC  : RMA_TC_001
//Revision       : 0.0 - RenuVerma-02-23-2017
//=================================================================================================

public class RMA_TC_002 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String EditedDiaryTaskName_TC_002;
	public static String EditedDueDateOnFilter_TC_002;

	@Test
	public void RMA_TC_002_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_002_ Edit The Diary On Diary List Page", " Successfully Edit The Diary On Diary List Page Is Validated ");
			parentlogger.assignAuthor("RenuVerma");
			
			String EditedDueDate;
			//Local Variable Declaration Completed
			
			EditedDueDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 6, 0);
			StrScreenShotTCName ="RMA_TC_002";
			//Variable Initialization Completed
				
			//==============================Steps To Edit The Diary On Diary List Page Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, RMA_TC_001.DiaryTaskName_TC_001), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+RMA_TC_001.DiaryTaskName_TC_001+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Edit(driver), "Edit Diary Image On Diary List Page", logval);
			EditedDiaryTaskName_TC_002 = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Edit", "NA", "NA", "NA", "NA", EditedDueDate, logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Edited Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(EditedDiaryTaskName_TC_002, 3)+" "+"On Diary List Page");				
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",EditedDiaryTaskName_TC_002, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);	
			EditedDueDateOnFilter_TC_002=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(EditedDueDate));
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(EditedDiaryTaskName_TC_002, "Diary UX Grid", RMA_TC_001.ActivityList_TC_001, 4, EditedDueDateOnFilter_TC_002, 2, logval);
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

