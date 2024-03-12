package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

//Default Package Import Completed
import rmaseleniumPOM.RMA_Selenium_POM_SystemUsers;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_ToolsAndDesigners;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_080
//Description    : Successfully Creation, Edition and Deletion Of WPA Auto dairies Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-14-2016
//=================================================================================================

public class RMA_Smoke_TC_080 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_080_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_080_Create, Edit and Delete WPA Auto dairies", "Successfully Creation, Edition and Deletion Of WPA Auto dairies Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			String AutoDiaryName;
			String AutoDiaryDate;
			int DiaryDueDate;
			String DiaryPriority;
			int AvailableFiltersXdays;
			String SelectedUserName;
			int NotificationDays;
			int ReRoutedDays;
			int DiaryRelatedInstructions;
			int EditedNotificationDays;
			int EditedDiaryRelatedInstructions;
			int EditedEstimatedAmountOfTime;
			int EstimatedAmountOfTime;
			String AvailableActivities;
			String EditedAutoDiaryName;
			String PrimaryWindowHandle;
	
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_080";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			DiaryPriority= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_080", 1, 0); // Diary Priority Is Fetched From DataSheet RMA_TC_080
			DiaryDueDate=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 1, 1); // Diary Due Date Is Fetched From DataSheet RMA_TC_080
			AvailableFiltersXdays=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 1, 2); // X days Is Fetched From DataSheet RMA_TC_080
			SelectedUserName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_080", 1, 3); // User Is Fetched From DataSheet RMA_TC_080
			NotificationDays=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 1, 4); // Notification Days Is Fetched From DataSheet RMA_TC_080
			ReRoutedDays=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 1, 5); // 	ReRouted Days Is Fetched From DataSheet RMA_TC_080
			DiaryRelatedInstructions=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 1, 6); // Diary Related Instructions Is Fetched From DataSheet RMA_TC_080
			EstimatedAmountOfTime=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 1, 7); // Estimated Amount Of Time Is Fetched From DataSheet RMA_TC_080
			AvailableActivities=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_080", 1, 8); // Available Activities Is Fetched From DataSheet RMA_TC_080
			EditedNotificationDays=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 5, 0); // Notification Days Is Fetched From DataSheet RMA_TC_080
			EditedEstimatedAmountOfTime=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 5, 1); // 	Estimated Amount Of Time Is Fetched From DataSheet RMA_TC_080
			EditedDiaryRelatedInstructions=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_080", 5, 2); // Diary Related Instructions Is Fetched From DataSheet RMA_TC_080
		
			AutoDiaryName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "DiaTC_080_");
			EditedAutoDiaryName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditDiaTC_080_");
			AutoDiaryDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
				
			//===========================================================Creation Of WPA Auto Dairies Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-ToolsandDesigners-AutoDiarySetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Auto Diary Setup");
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Img_New(driver), "New Image on WPA Auto Diary Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >")));
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Auto Diary Creation - Step 1 of 6 (Introduction)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);			
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 2 Page load");
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Radio_AutoDiaryWizard(driver)));
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Auto Diary Creation - Step 2 of 6 (Creation Process)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Radio_AutoDiaryWizard(driver), "'Auto Diary Wizard Option' on WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 1 of 6 (Best Practice Scenerio) Page load");
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_Template(driver)));
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "New Auto Diary - Step 1 of 6 (Best Practice Scenerio)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_Template(driver), "Claim Review", "Which auto diary template do you wish to use? List", "WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_AutoDiaryDiaryName(driver), "Auto Diary Definition TextBox on WPA Auto Diary Setup Page", AutoDiaryName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_DiaryDate(driver), "Diary Date Textbox on WPA Auto Diary Setup Page", AutoDiaryDate,logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_DueDate(driver), "Diary Due Date Textbox on WPA Auto Diary Setup Page",String.valueOf(DiaryDueDate),logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_Priority(driver), DiaryPriority, " Priority Level List", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 2 of 6 (Business Rule Definition) Page load");
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_AvailableFilters(driver)));
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "New Auto Diary - Step 2 of 6 (Business Rule Definition)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_AvailableFilters(driver), "X Days From Event Date", "Available Filters List", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Add >"), "Add > Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Auto Diary Filter");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_Xdays(driver), "X Days From Event Date Textbox on Add Auto Diary FilterPage", String.valueOf(AvailableFiltersXdays),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Ok"), "Ok Button on Add Auto Diary FilterPage", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_AvailableFilters(driver), "Claim Status(s)", "Available Filters List", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Add >"), "Add > Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Auto Diary Filter");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Add All >"), "Add All > Button on Add Auto Diary FilterPage", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Ok"), "Ok Button on Add Auto Diary FilterPage", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_UserCreated(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 3 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "New Auto Diary - Step 3 of 6 (Workflow Notification)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_UserCreated(driver), "check", "Send diary to user that created record Checkbox", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_UserModified(driver), "check", "Send diary to user that last modified record Checkbox", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_AdjAssign(driver), "check", "Send diary to adjuster assigned to record Checkbox", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_AdjAssigSupervisor(driver), "check", "Send diary to the Supervisor of adjuster assigned to record Checkbox", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Btn_UsersGroupbtn(driver), "Other User(s)/Group(s) Button on Add Auto Diary FilterPage", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("System User(s)");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Table_SystemUser(driver), SelectedUserName, "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Generic_BtnName(driver, "Ok"), "Ok Button on System User(s) Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_NotificationDays(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 4 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "New Auto Diary - Step 4 of 6 (Escalation Management)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_NotificationDays(driver), "Notification Days Textbox on WPA Auto Diary Setup Page", String.valueOf(NotificationDays),logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_ReRoutedDays(driver), "Re-Routed Days Textbox on WPA Auto Diary Setup Page",String.valueOf(ReRoutedDays),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Btn_UsersRoutedbtn(driver), "User Rerouted Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("System User(s)");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Table_SystemUser(driver), SelectedUserName, "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Generic_BtnName(driver, "Ok"), "Ok Button on System User(s) Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_EstTime(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 5 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "New Auto Diary - Step 5 of 6 (Time & Task Management)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_EstTime(driver), "Estimated Amount Of Time Textbox on WPA Auto Diary Setup Page", String.valueOf(EstimatedAmountOfTime),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_Instruction(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 6 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "New Auto Diary - Step 6 of 6 (Instructions/Procedures)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_Instruction(driver), "Diary Related Instructions Textbox on WPA Auto Diary Setup Page",  String.valueOf(DiaryRelatedInstructions),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Btn_WorkActivity(driver), "Work Activity Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Work Activities");
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_AvailableActivities(driver), AvailableActivities, "Available Activities List", "Work Activity Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Add >"), "Add > Button on Add Auto Diary FilterPage", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Ok"), "Ok Button on Add Auto Diary FilterPage", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Finish"), "Finish Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Auto Diary Setup");			
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef(driver), AutoDiaryName, "Current Auto Diary Definitions List on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef(driver), AutoDiaryName, "Current Auto Diary Definitions List", "WPA Auto Diary Setup Page", logval);
			//===========================================================Creation Of WPA Auto Dairies Is Ended Here===========================================================	
		
			//===========================================================Edition Of WPA Auto Dairies Is Started Here===========================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Img_Edit(driver), "Edit Image on WPA Auto Diary Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_Template(driver)));
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Edit Auto Diary - Step 1 of 6 (Best Practice Scenerio)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_Template(driver), "Claim Review", "Which auto diary template do you wish to use? List", "WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_AutoDiaryDiaryName(driver), "Auto Diary Definition TextBox on WPA Auto Diary Setup Page", EditedAutoDiaryName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_AvailableFilters(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 2 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Edit Auto Diary - Step 2 of 6 (Business Rule Definition)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_AvailableFilters(driver), "Claim Type(s)", "Available Filters List", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Add >"), "Add > Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("Add Auto Diary Filter");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Add All >"), "Add All > Button on Add Auto Diary FilterPage", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Ok"), "Ok Button on Add Auto Diary FilterPage", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_UserCreated(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 3 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Edit Auto Diary - Step 3 of 6 (Workflow Notification)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Chk_AdjAssigSupervisor(driver), "uncheck", "Send diary to the Supervisor of adjuster assigned to record Checkbox", "WPA Auto Diary Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Btn_UsersGroupbtn(driver), "Other User(s)/Group(s) Button on Add Auto Diary FilterPage", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("System User(s)");
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Table_SystemUser(driver), SelectedUserName, "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Generic_BtnName(driver, "Ok"), "Ok Button on System User(s) Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("WPA Auto Diary Setup");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_NotificationDays(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 4 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Edit Auto Diary - Step 4 of 6 (Escalation Management)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_NotificationDays(driver), "Notification Days Textbox on WPA Auto Diary Setup Page", String.valueOf(EditedNotificationDays),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_EstTime(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 5 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Edit Auto Diary - Step 5 of 6 (Time & Task Management)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_EstTime(driver), "Estimated Amount Of Time Textbox on WPA Auto Diary Setup Page", String.valueOf(EditedEstimatedAmountOfTime),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Next >"), "Next Button on WPA Auto Diary Setup Page", logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_Instruction(driver)));
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Step 6 Page load");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lbl_StepsHeading(driver).getAttribute("innerText"), "Edit Auto Diary - Step 6 of 6 (Instructions/Procedures)", "Step Heading on WPA Auto Diary Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Txt_Instruction(driver), "Diary Related Instructions Textbox on WPA Auto Diary Setup Page",  String.valueOf(EditedDiaryRelatedInstructions),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_ToolAndDesigner_Generic_Btn(driver, "Finish"), "Finish Button on WPA Auto Diary Setup Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Auto Diary Setup");
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef(driver), EditedAutoDiaryName, "Current Auto Diary Definitions List on WPA Auto Diary Setup Page", logval);
			//===========================================================Edition Of WPA Auto Dairies Is Ended Here===========================================================
		
			//===========================================================Deletion Of WPA Auto Dairies Is Started Here===========================================================
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef(driver), EditedAutoDiaryName, "Current Auto Diary Definitions List", "WPA Auto Diary Setup Page", logval);
			String Expmsg="Are you sure you want to delete this auto diary definition?";
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Img_Delete(driver), "Delete Image on WPA Auto Diary Setup Page", logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Utilities-->Tools and Designers-->Auto Diary Setup", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Utilities-->Tools and Designers-->Auto Diary Setup", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(EditedAutoDiaryName , 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Img_Delete(driver), "Delete Image on WPA Auto Diary Setup Page", logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Utilities-->Tools and Designers-->Auto Diary Setup", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes");
			RMA_NegativeVerification_Utility.RMA_NegVerifyMultipleDataInWebList(RMA_Selenium_POM_Utilities_ToolsAndDesigners.RMAApp_TDAutoDiarySet_Lst_CurrentAutoDiaryDef(driver), EditedAutoDiaryName, "Current Auto Diary Definitions List on WPA Auto Diary Setup Page", logval);
			//===========================================================Deletion Of WPA Auto Dairies Is Ended Here===========================================================
		
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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

