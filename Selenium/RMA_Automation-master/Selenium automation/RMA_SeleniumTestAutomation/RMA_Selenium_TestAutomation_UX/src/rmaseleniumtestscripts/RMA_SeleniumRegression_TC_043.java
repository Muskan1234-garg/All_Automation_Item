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
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_043
//Description    : Successfully Roll A Diary For Future Date And Not Roll For Past Date On Diary List Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-02-28-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_043 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	public static String DiaryTaskName_TC_043;
	public static String FutureRollDate_TC_043;	

	@Test
	public void RMA_SeleniumRegression_TC_043_Test() throws Exception,Error {

		StrScreenShotTCName = "RMA_SeleniumRegression_TC_043";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_043_ Roll A Diary On Diary List Page", "Successfully Roll A Diary For Future Date And Not Roll For Past Date On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String DueDate;
			String ActivityList;
			String DiaryNote;
			String PastRollDate;
			//Local Variable Declaration Completed

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_043", 1, 0); // Activity List Is Fetched From DataSheet RMA_SeleniumRegression_TC_043
			DiaryNote=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_043", 1, 1); // Diary Note Is Fetched From DataSheet RMA_SeleniumRegression_TC_043
			DueDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");// Due Date Of the Diary
			FutureRollDate_TC_043=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 9, 0,"MM/dd/yyyy");// Roll Date Of the Diary
			PastRollDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -9, 0,"MM/dd/yyyy");// Roll Date Of the Diary
			//Variable Initialization Completed

			//==============================Steps To Roll A Diary On Diary List Page Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+"RMA Page"+ " ", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName_TC_043 = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Create", DiaryNote, ActivityList, "check", "check", DueDate,"Important","NA", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_043, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, DiaryTaskName_TC_043), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+DiaryTaskName_TC_043+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Roll(driver), "Roll Diary Image On Diary List Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Txt_RollDate(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Txt_RollDate(driver), "Select Roll Date TextBox Of Roll Diary Popup On Diary List Page", PastRollDate,logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Img_Roll(driver), "Roll Image Of Roll Diary Popup On Diary List Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partially", RMA_Selenium_POM_VerificationMessage.DiaryPastDateRollMessage, "Message To Confirm Roll Diary For Diary: " + " "+ color.RMA_ChangeColor_Utility(DiaryTaskName_TC_043, 4), logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_043, 3)+" Is Not Rolled For Past Date As Roll Date must be greater than Creation Date");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Txt_RollDate(driver), "Select Roll Date TextBox Of Roll Diary Popup On Diary List Page", FutureRollDate_TC_043,logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Img_Roll(driver), "Roll Image Of Roll Diary Popup On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			Thread.sleep(3000);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_043, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(DiaryTaskName_TC_043,"Diary UX Grid",new String[] {"Rollable","Due"},new String[]{"Yes", FutureRollDate_TC_043},  logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_043, 3)+" Is Appeared On The Diary UX Grid On Diary Page, Hence Diary Rolled Successfully On Future Date ");
			//==============================Steps To Roll A Diary On Diary List Page Is Ended Here================================================================================================

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
	public void RMA_FailureReport(ITestResult result) throws Exception, Error   //All The Information Associated With The Test Case Is Stored In Result Variable
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

