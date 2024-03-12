package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_SystemUsers;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_019
//Description    : Successfully Route Diary To a Specific User On Diary List Page Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-09-04-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_019 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	public static String DSNName;
	public static String 	Login_Txt_UserName;
	public static String Login_Txt_Password;
	//Global Variable Declaration Completed 
	
	@Test
	public void RMA_SeleniumRegression_TC_019_Test() throws Exception,Error {
		
		StrScreenShotTCName = "RMA_SeleniumRegression_TC_019";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		testcall2 = false;	
		loggerval2 = "NotInitialized";
		//Global Variable Initialization Completed 
		
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_019_ Route Diary To A Specific User On Diary List Page", "Successfully Route Diary To a Specific User On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String DueDate;
			String ActivityList;		
			String DiaryTaskName;
			String RoutedUserName;
			String RoutedPassword;	
			String DiaryNote;
			
			//Local Variable Declaration Completed

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_019", 1, 0); // Activity List Is Fetched From DataSheet RMA_SeleniumRegression_TC_019
			RoutedUserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_019", 1, 1); //RoutedUserName Fetched From DataSheet RMA_SeleniumRegression_TC_019
			RoutedPassword = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_019", 1, 2); //RoutedPassword Fetched From DataSheet RMA_SeleniumRegression_TC_019
			DiaryNote= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_019", 1, 3); //DiaryNote Fetched From DataSheet RMA_SeleniumRegression_TC_019			
			RMA_ExcelDataRetrieval_Utility ExcelData3 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			Login_Txt_UserName = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			Login_Txt_Password = ExcelData3.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001			
			DueDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");// Due Date Of the Diary
				
			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			DSNName= ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002			
			//Variable Initialization Completed

			//==============================Steps To Route Diary On Diary List Page Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+"RMA Page"+ " ", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Create", DiaryNote, ActivityList, "check", "check", DueDate,"Important","NA", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, DiaryTaskName), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+DiaryTaskName+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Route(driver), "Route Diary Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_SelectUser(driver)));
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_SelectUser(driver), "Select User Image Of Route Diary On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_UsersIcon(driver), "Select User(s) Icon Image On System User Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Txt_Filter(driver, "Login Name"), "Login Name Filter Box On System User Page", RoutedUserName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_RowSelector(driver, RoutedUserName), "Selected Tick Mark Of System User UX Grid Corrsponding To User: "+RoutedUserName+" On System User Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Img_Ok(driver), "Ok Image On System User Page", logval);
			//RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoute_Img_Route(driver)));
			Thread.sleep(3000);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesRoute_Img_Route(driver), "Route Image Of Route Diary Popup On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.DiaryRoutedMessage, false, "Diary Routed Message", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, DiaryTaskName), DiaryTaskName+" On Diary List UX Grid", logval);
			

			//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
			RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
			//Application Is Logged Out
			RMA_Functionality_Utility.RMA_Application_Logout(logval);
			//Application Is Logged Out
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall2= true;
			RMA_Functionality_Utility.RMA_Application_Login(RoutedUserName, RoutedPassword, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RoutedUserName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);	
			//Application Is Logged In
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(DSNName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNName, 2));
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected
			
			//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAUXWindowHandle = driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			//RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(DiaryTaskName, "Diary UX Grid", RoutedUserName, 7, logval);
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(DiaryTaskName,"Diary UX Grid",new String[] {"Routable","Assigned User","Assigning User"},new String[]{"Yes", RoutedUserName,Login_Txt_UserName},  logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 3)+" Is On The Diary List UX Grid Hence Routed Successfully.");
			//==============================Steps To Route Diary On Diary List Page Is Ended Here================================================================================================

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
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
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
			try {
				// Finally Logout and Do login into the Current User
				//==============================Steps To Login Into Default Credentials Is Started Here================================================================================================
				parentlogger.log(LogStatus.PASS, "Login Into RMA With Default User Under Finally Block!");
				RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
				RMA_GenericUsages_Utility.RMA_WindowSwitchingBasedOnTitle("CSC Riskmaster Accelerator");
				RMA_Functionality_Utility.RMA_Application_Logout(logval);
				//Application Is Logged Out			
				
				RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName, Login_Txt_Password, logval);
				parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName, 2));
				//Application Is Logged In
				
				RMA_Functionality_Utility.RMA_DataSourceSelection(DSNName, logval);
				parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNName, 2));
				//DSN Is Selected
				
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
				RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
				StrRMAUXWindowHandle = driver.getWindowHandle();
				globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
				
				//==============================Steps To Login Into Default Credentials Is Ended Here================================================================================================
				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

