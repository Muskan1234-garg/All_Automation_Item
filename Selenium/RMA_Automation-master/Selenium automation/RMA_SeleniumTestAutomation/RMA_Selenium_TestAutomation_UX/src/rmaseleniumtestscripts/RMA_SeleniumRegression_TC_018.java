package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_018
//Description    : Successfully Mark Diary As Completed And Also Checked Diary Existence On Diary History Page 
//Depends On TC  : RMA_SeleniumRegression_TC_016, RMA_SeleniumRegression_TC_017
//Revision       : 0.0 - RenuVerma-09-04-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_018 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	@Test
	public void RMA_SeleniumRegression_TC_018_Test() throws Exception,Error {
		
		StrScreenShotTCName = "RMA_SeleniumRegression_TC_018";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_018_ Mark Diary As Completed And Also Checked Diary Existence On Diary History", "Successfully Mark Diary As Completed And Also Checked Diary Existence On Diary History Page ");
			parentlogger.assignAuthor("RenuVerma");
			
			String CompletionDate;
			//Local Variable Declaration Completed
			
			CompletionDate=	RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -6, 0,"MM/dd/yyyy");
			StrScreenShotTCName ="RMA_SeleniumRegression_TC_018";
			//Variable Initialization Completed
			
			//==============================Steps To Mark Diary As Completed On Diary List Page Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+"Diary List Page"+ " ", logval);
			Thread.sleep(10000);
			//RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Complete(driver), "Complete Diary Image On Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesComp_Txt_CompletedOn(driver), "Completed On TextBox Of Diary Task Completion On Diary List Page ", CompletionDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesComp_Txt_CompletionResponse(driver), "Completion Response On TextBox Of Diary Task Completion On Diary List Page ", "Complete a Diary set successfully", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Done(driver), "Done Image Of Diary Task Completion On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			
			//Verify Toast Message After Diary Completion
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.DiaryCompletionMessage, false, "Diary Completion Message", logval);
			Thread.sleep(4000);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017), RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017+" On Diary List UX Grid", logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017, 3)+" Is Not On The Diary List UX Grid Hence Completed Successfully.");
			//==============================Steps To Mark Diary As Completed On Diary List Page Is Ended Here================================================================================================
	
			//==============================Steps To Verify The Functionality Of Diary History Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_History(driver), "History Diary Image On Diary List Page", logval);
			// Verify That Completed Diary Should Appear on History UX Grid
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017+"\n"+RMA_SeleniumRegression_TC_016.DiaryNote_TC_016,"Diary UX Grid",new String[] {"Due","Diary Status"},new String[]{RMA_SeleniumRegression_TC_017.EditedDueDate_TC_017, "Complete"},  logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017, 3)+" Is Existed Of The Diary History UX Grid On Diary History Page ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesUXGrid_Chk_SelectAll(driver), "Select All CheckBox Of Diary History UX Grid On Diary History Page", logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Cancel(driver), "Cancel Image On Diary History Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_History(driver), "History Diary Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017+"\n"+RMA_SeleniumRegression_TC_016.DiaryNote_TC_016,"Diary UX Grid",new String[] {"Due","Diary Status"},new String[]{RMA_SeleniumRegression_TC_017.EditedDueDate_TC_017, "Complete"},  logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesUXGrid_Chk_SelectAll(driver), "Select All CheckBox Of Diary History UX Grid On Diary History Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Delete(driver), "Delete Image On Diary History Page", logval);	
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.DiaryDeletionMessage, false, "Diary Deletion Message", logval);
			Thread.sleep(4000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_History(driver), "History Diary Image On Diary List Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017), RMA_SeleniumRegression_TC_017.EditedDiaryTaskName_TC_017+" On Diary History UX Grid", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+"Diary List Page"+ " ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			Thread.sleep(4000);
			//==============================Steps To Verify The Functionality Of Diary History Is Ended Here================================================================================================
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

