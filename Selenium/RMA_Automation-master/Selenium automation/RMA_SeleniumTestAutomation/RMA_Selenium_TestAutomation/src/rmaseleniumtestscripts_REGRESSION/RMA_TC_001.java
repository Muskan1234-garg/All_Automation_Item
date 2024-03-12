package rmaseleniumtestscripts_REGRESSION;

import java.text.SimpleDateFormat;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_001
//Description    : RMA_TC_001_ Successful Creation Of Diary With Verification Of Active Diary And Diary Notes On Diary List Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-02-20-2017
//=================================================================================================

public class RMA_TC_001 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String DiaryTaskName_TC_001;
	public static String ActivityList_TC_001;
	public static String DiaryNote_TC_001;

	@Test
	public void RMA_TC_001_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_001_ Creation Of Diary With Verification Of Active Diary And Diary Notes", "Successful Creation Of Diary With Verification Of Active Diary And Diary Notes On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String DueDate;
			String  DueDateOnFilter;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList_TC_001 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); // Activity List Is Fetched From DataSheet RMA_TC_001
			DiaryNote_TC_001=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); // Diary Note Is Fetched From DataSheet RMA_TC_001
			DueDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 5, 0);// Diary Due Date After 5 Day of the Current Date
			StrScreenShotTCName ="RMA_TC_001";
			DueDateOnFilter=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(DueDate));
			//Variable Initialization Completed
			
			//==============================Steps To Enabling Setting For Diary Creation Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Diaries / Text Fields"), "Diaries / Text Fields Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "check", "Default 'Assigned to' in Create Diary to Current User CheckBox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AutoLaunchDiary(driver), "check", "Auto Launch Diary (Non-Powerview) CheckBox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup",false, "NA", "General System Parameter Setup Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On General System Parameter Setup Page", logval);
			//==============================Steps To Enabling Setting For Diary Creation Is Ended Here================================================================================================
			
			//==============================Steps To Create Diary On Diary List Page Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiaryList");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName_TC_001 = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Create", DiaryNote_TC_001, ActivityList_TC_001, "check", "check", DueDate, logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_001, 3)+" "+"On Diary List Page");				
			//==============================Steps To Create Diary On Diary List Page Is Ended Here================================================================================================
			
			//==============================Steps To Verify Active Diary And Diary Notes Is Started Here================================================================================================
			//If Un-check active diaries check box (not show future due date diaries)
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_001, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, DiaryTaskName_TC_001), DiaryTaskName_TC_001+" On Diary List UX Grid", logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_001, 3)+ " And Future Due Date: "+ color.RMA_ChangeColor_Utility(DueDateOnFilter, 3)+"Is Not On The Diary List UX Grid As This Is Not An Active Diary");	
	
			//	If Check Active Diaries check box(current due date and future due date diaries)
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_001, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(DiaryTaskName_TC_001, "Diary UX Grid", ActivityList_TC_001, 4, DueDateOnFilter, 2, logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_001, 3)+ " And Future Due Date: "+ color.RMA_ChangeColor_Utility(DueDateOnFilter, 3)+"Is On The Diary List UX Grid As This Is An Active Diary");
	
			//	If Check Show Notes check box
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "check", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName_TC_001, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(DueDateOnFilter, "Diary UX Grid", ActivityList_TC_001, 4, DiaryNote_TC_001,3, logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_TC_001, 3)+ " And Diary Note: "+ color.RMA_ChangeColor_Utility(DiaryNote_TC_001, 3)+"Is On The Diary List UX Grid");
			//==============================Steps To Verify Active Diary And Diary Notes Is Ended Here================================================================================================
			
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

