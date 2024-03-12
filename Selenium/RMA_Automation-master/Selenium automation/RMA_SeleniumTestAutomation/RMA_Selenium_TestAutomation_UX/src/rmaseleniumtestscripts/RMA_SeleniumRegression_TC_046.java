package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM_UX.RMA_Selenium_POM_AttachCreateDiary;
import rmaseleniumPOM_UX.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SMS;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SystemUsers;
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
//TestCaseID     : RMA_SeleniumRegression_TC_046
//Description    : RMA_SeleniumRegression_TC_046_ Successful Peek The Diary On Diary List Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-09-05-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_046 extends rmaseleniumtestscripts.RMA_TC_BaseTest {


	@Test
	public void RMA_SeleniumRegression_TC_046_Test() throws Exception,Error {
		
		StrScreenShotTCName ="RMA_SeleniumRegression_TC_046";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed 
		
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_046_ Peek The Diary On Diary List Page", "Successful Peek The Diary On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String DueDate;
			//String  DueDateOnFilter;
			String DiaryNote;
			String UserFirstName;
			String UserLastName;
			String UserEmail;
			String DSNName;			
			String ManagerName;
			String ModuleName;
			String ActivityList;
			String DiaryTaskName;
			//Local Variable Declaration Completed

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_046", 1, 0); // Activity List Is Fetched From DataSheet RMA_SeleniumRegression_TC_046
			UserEmail=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_046", 1, 1); // User Email Address Is Fetched From DataSheet RMA_SeleniumRegression_TC_046
			DiaryNote= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_046", 1, 2); // Diary Note Is Fetched From DataSheet RMA_SeleniumRegression_TC_046
			ManagerName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_046", 1, 3); // Manager Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_046
			ModuleName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_046", 1,4); // Module Name Is Fetched From DataSheet RMA_SeleniumRegression_TC_046

			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002

			DueDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");// Diary Due Date 
			//DueDateOnFilter=new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(DueDate));
			UserFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "TUF_");
			UserLastName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "TUL_");
			//Variable Initialization Completed

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			//Navigated To NonUX RMA Application

			//==============================Steps To Enabling Setting For Peek Diary Is Started Here================================================================================================	
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Diaries / Text Fields"), "Diaries / Text Fields Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "uncheck", "Default 'Assigned to' in Create Diary to Current User CheckBox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowDiaryPeek(driver), "check", "Allow Global Peek for Diaries CheckBox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup",false, "NA", "General System Parameter Setup Page", logval);
			//==============================Steps To Enabling Setting For Peek Diary Is Ended Here================================================================================================

			//==============================Steps To Add User On SMS Screen Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_SMS(driver), "Security Management System Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
			RMA_Functionality_Utility.RMA_SMSUserAddEditDelete_Utility("Add",UserFirstName, UserLastName,UserFirstName+" "+ UserLastName,ManagerName, UserEmail, "USA" ,"check", "check", DSNName,ModuleName,"No", false, logval);
			
			//==============================Steps To Add User On SMS Screen Is Ended Here================================================================================================

			//==============================Steps To Create Diary On Diary List Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("rmA Claim System");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Diary");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_TaskName(driver), "Task Name TextBox On Create Diary Page", DiaryTaskName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_Notes(driver), "Diary Note Text Box On Create Diary Page", DiaryNote, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_WorkActivitiesLookup(driver), "WorkActivities Lookup Button On Create Diary Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Lst_Activity(driver), ActivityList, "Activity Drop Down ", "Create Diary Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_WorkActivitiesOK(driver), "OK Button On Work Activities Window Of Attach Diary Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Btn_AssignedUserTo(driver), "Assign Diary To Lookup Button On Create Diary Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_UsersIcon(driver), "Select User(s) Icon Image On System User Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter Box On System User Page", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_RowSelector(driver, UserFirstName), "Selected Tick Mark Of System User UX Grid Corrsponding To User: "+UserFirstName+" On System User Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_Ok(driver), "Ok Image On System User Page", logval);
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationCompleted(driver), "check", "Automatic Notification When Completed CheckBox", "Create Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Chk_AutoNotificationLate(driver), "check", "Automatic Notification When Late CheckBox", "Create Diary Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_AttachCreateDiary.RMAApp_AttachCreate_Diary_Txt_DueDate(driver), "Due Date TextBox On Create Diary Page", DueDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Create Diary Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Create Diary Page",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver)));
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 3)+" "+"On Diary List Page");				
			//==============================Steps To Create Diary On Diary List Page Is Ended Here================================================================================================

			//==============================Steps To Peek Diary Is Started Here================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Peek(driver), "Peek Diary Image On Diary List Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_AvailableUser(driver)));
			Thread.sleep(2000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_AvailableUser(driver), "Available User Button Of Peek Diary Popup On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_UsersIcon(driver), "Select User(s) Icon Image On System User Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter TextBox Of Peek Diary User Popup On Diary List Page ", UserFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_RowSelector(driver, UserFirstName), "Selected Tick Mark Of UX Grid Corrsponding To User: "+UserFirstName+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_Ok(driver), "Ok Image On Diary List Page", logval);
			Thread.sleep(3000);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_Peek(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_Peek(driver), "Peek Button Of Peek Diary Popup On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			Thread.sleep(3000);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);	
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(DiaryTaskName,"Diary UX Grid",new String[] {"Due","Assigned User"},new String[]{DueDate, UserFirstName},  logval);
			//==============================Steps To Peek Diary Is Ended Here================================================================================================

		/*	//==============================Steps To Remove Manger From The Created User On SMS Screen Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"), "Expand Users Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName +" "+UserLastName), "Expand "+UserFirstName +" "+UserLastName+" Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Btn_EditUser(driver), "Edit User Button From User Setting On Security Management Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSUser_Lst_Manager(driver), "", "Manager List", "Security Management System Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Security Management System Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_Verification_Utility.RMA_VerifyUXMessage("User '"+UserFirstName +" "+ UserLastName+"' Saved Successfully.", false,"Security Management System Page", logval);
			//RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
			//RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			//driver.switchTo().window(StrRMAWindowHandle);

			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Ended Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("rmA Claim System");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Home(driver), "Home Image On Currently Peeking At"+UserFirstName+ "'s diary(s) Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Peek(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Peek(driver), "Peek Diary Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			Thread.sleep(2000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPeek_Btn_AvailableUser(driver), "Available User Button Of Peek Diary Popup On Diary List Page", logval);
			//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter TextBox Of Peek Diary User Popup On Diary List Page ", UserFirstName, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_UsersIcon(driver), "Select User(s) Icon Image On System User Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter Box On System User Page", UserFirstName, logval);
		
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, UserFirstName), UserFirstName+"On The Table", logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_Ok(driver), "Ok Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Cancel(driver), "Cancel Image Of Peek Diary Popup On Diary List Page", logval);

			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Ended Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Riskmaster Security");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Security Management System Page Is Refreshed To Restore The Default State

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Users"), "Expand Users Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, UserFirstName +" "+UserLastName), "Expand "+UserFirstName +" "+UserLastName+" Link From Left Navigation Bar On Security Management Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Delete(driver), "Delete Button On Security Management Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSDelete_Btn_Delete(driver), "Delete Button Delete Popup On Security Management Page", logval);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Ok(driver), "Ok Image Of The Warning Popup On Security Management System Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Genereic_UX_ToastError(driver), "Error Message On Security Management System Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Riskmaster Security");
			driver.switchTo().window(StrRMAWindowHandle);
			//==============================Steps To Remove Manger From The Created User On SMS Screen Is Ended Here================================================================================================
*/

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
				RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);
				//Navigated To NonUX RMA Application
				RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
				RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Diaries / Text Fields"), "Diaries / Text Fields Tab On General System Parameter Setup Page", logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowDiaryPeek(driver), "check", "Allow Global Peek for Diaries CheckBox", "General System Parameter Setup Page", logval);
				RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_DefaultAssignedToDairyCurrentUser(driver), "uncheck", "Default 'Assigned to' in Create Diary to Current User CheckBox", "General System Parameter Setup Page", logval);
				RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup",false, "NA", "General System Parameter Setup Page", logval);
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("rmA Claim System");
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

