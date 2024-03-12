package rmaseleniumtestscripts_REGRESSION;

import java.text.SimpleDateFormat;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_005
//Description    : Successfully Roll A Diary On Diary List Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-02-28-2017
//=================================================================================================

public class RMA_TC_005 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String DiaryTaskName_TC_005;
	public static String RollDate_TC_005;	

	@Test
	public void RMA_TC_005_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_005_ Roll A Diary On Diary List Page", "Successfully Roll A Diary On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String DueDate;
			String ActivityList;
			String DiaryNote;
			//Local Variable Declaration Completed

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_005", 1, 0); // Activity List Is Fetched From DataSheet RMA_TC_005
			DiaryNote=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_005", 1, 1); // Diary Note Is Fetched From DataSheet RMA_TC_005
			DueDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();// Due Date Of the Diary
			RollDate_TC_005=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 9, 0)));// Roll Date Of the Diary
			StrScreenShotTCName ="RMA_TC_005";
			//Variable Initialization Completed

			//==============================Steps To Roll A Diary On Diary List Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiaryList");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName_TC_005 = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Create", DiaryNote, ActivityList, "check", "check", DueDate, logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_005, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, DiaryTaskName_TC_005), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+DiaryTaskName_TC_005+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Roll(driver), "Roll Diary Image On Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Txt_RollDate(driver), "Select Roll Date TextBox Of Roll Diary Popup On Diary List Page", RollDate_TC_005,logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoll_Img_Roll(driver), "Roll Image Of Roll Diary Popup On Diary List Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_005, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(DiaryTaskName_TC_005, "Diary UX Grid", RollDate_TC_005, 2, logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_005, 3)+" Is Appeared On The Diary UX Grid On Diary Page, Hence Diary Rolled Successfully On Future Date ");
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

