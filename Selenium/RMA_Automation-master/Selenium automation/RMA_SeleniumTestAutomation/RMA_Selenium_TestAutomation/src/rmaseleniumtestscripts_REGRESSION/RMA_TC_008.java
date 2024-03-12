package rmaseleniumtestscripts_REGRESSION;

import java.text.SimpleDateFormat;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_AttachCreateDiary;
import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_SMS;
import rmaseleniumPOM.RMA_Selenium_POM_SystemUsers;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_008
//Description    : RMA_TC_008_ Successful Peek The Diary On Diary List Page Is Validated
//Depends On TC  : RMA_TC_004
//Revision       : 0.0 - RenuVerma-02-02-2017
//=================================================================================================

public class RMA_TC_008 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_TC_008_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_008_ Peek The Diary On Diary List Page", "Successful Peek The Diary On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String DueDate;
			String  DueDateOnFilter;
			String DiaryNote;
			String UserFirstName;
			String UserLastName;
			String UserEmail;
			String DSNName;			
			String CurrentFrameId;
			String ManagerName;
			String ModuleName;
			String ActivityList;
			String DiaryTaskName;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_008", 1, 0); // Activity List Is Fetched From DataSheet RMA_TC_008
			UserEmail=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_008", 1, 1); // User Email Address Is Fetched From DataSheet RMA_TC_008
			DiaryNote= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_008", 1, 2); // Diary Note Is Fetched From DataSheet RMA_TC_008
			ManagerName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_008", 1, 3); // Manager Name Is Fetched From DataSheet RMA_TC_008
			ModuleName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_008", 1,4); // Module Name Is Fetched From DataSheet RMA_TC_008
					
			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002
		
			DueDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();// Diary Due Date 
			StrScreenShotTCName ="RMA_TC_008";
			DueDateOnFilter=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(DueDate));
			UserFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "TUF_");
			UserLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "TUL_");
			//Variable Initialization Completed
			
			//==============================Steps To Enabling Setting For Peek Diary Is Started Here================================================================================================	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Diaries / Text Fields"), "Diaries / Text Fields Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "uncheck", "Default 'Assigned to' in Create Diary to Current User CheckBox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowDiaryPeek(driver), "check", "Allow Global Peek for Diaries CheckBox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup",false, "NA", "General System Parameter Setup Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On General System Parameter Setup Page", logval);
			//==============================Steps To Enabling Setting For Peek Diary Is Ended Here================================================================================================
			
			//==============================Steps To Add User On SMS Screen Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Add",UserFirstName, UserLastName,UserFirstName+" "+ UserLastName,ManagerName, UserEmail, "USA" ,"check", "check", DSNName,ModuleName,"No", false, logval);
			//==============================Steps To Add User On SMS Screen Is Ended Here================================================================================================
		
			//==============================Steps To Create Diary On Diary List Page Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiaryList");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Diary");
			CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_TaskName(driver), "Task Name TextBox On Create Diary Page", DiaryTaskName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_Notes(driver), "Diary Note Text Box On Create Diary Page", DiaryNote, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_WorkActivitiesLookup(driver), "WorkActivities Lookup Button On Create Diary Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Lst_Activity(driver), ActivityList, "Activity Drop Down ", "Create Diary Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_Ok(driver), "Ok Button On Create Diary Page", logval);
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_AssignedUserTo(driver), "Assign Diary To Lookup Button On Create Diary Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Table_SystemUser(driver), UserFirstName, "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Generic_BtnName(driver, "Ok"), "Ok Button on System User(s) Page", logval);
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted(driver), "check", "Automatic Notification When Completed CheckBox", "Create Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate(driver), "check", "Automatic Notification When Late CheckBox", "Create Diary Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_DueDate(driver), "Due Date TextBox On Create Diary Page", DueDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Create Diary Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Create Diary Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver)));
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 3)+" "+"On Diary List Page");				
			//==============================Steps To Create Diary On Diary List Page Is Ended Here================================================================================================
			
			//==============================Steps To Peek Diary Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Peek(driver), "Peek Diary Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_AvailableUser(driver), "Available User Button Of Peek Diary Popup On Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter TextBox Of Peek Diary User Popup On Diary List Page ", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_RowSelector(driver, UserFirstName), "Selected Tick Mark Of UX Grid Corrsponding To User: "+UserFirstName+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_Ok(driver), "Ok Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_Peek(driver), "Peek Button Of Peek Diary Popup On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);	
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(DiaryTaskName, "Diary UX Grid", UserFirstName, 7, DueDateOnFilter, 2, logval);
			//==============================Steps To Peek Diary Is Ended Here================================================================================================
			
			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"), "Expand Users Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName +" "+UserLastName), "Expand "+UserFirstName +" "+UserLastName+" Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver), "Edit User Button From User Setting On Security Management Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), "", "Manager List", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);

			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Ended Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiaryList");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Peek(driver), "Peek Diary Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_AvailableUser(driver), "Available User Button Of Peek Diary Popup On Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter TextBox Of Peek Diary User Popup On Diary List Page ", UserFirstName, logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, UserFirstName), UserFirstName+"On The Table", logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_Ok(driver), "Ok Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Cancel(driver), "Cancel Image Of Peek Diary Popup On Diary List Page", logval);
		
			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Ended Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"), "Expand Users Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName +" "+UserLastName), "Expand "+UserFirstName +" "+UserLastName+" Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Button On Security Management Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button Delete Popup On Security Management Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		//	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Ended Here================================================================================================
	
			
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
				
			try {
			//==============================Steps To Enabling Setting For Diary Creation Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Diaries / Text Fields"), "Diaries / Text Fields Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowDiaryPeek(driver), "check", "Allow Global Peek for Diaries CheckBox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "uncheck", "Default 'Assigned to' in Create Diary to Current User CheckBox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup",false, "NA", "General System Parameter Setup Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On General System Parameter Setup Page", logval);
			//==============================Steps To Enabling Setting For Diary Creation Is Ended Here================================================================================================
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			} 
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

