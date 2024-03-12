package rmaseleniumtestscripts;

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
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_057
//Description    : RMA_SeleniumRegression_TC_057_Verify that notes are displayed in Task Name
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-02-15-2018
//=================================================================================================

public class RMA_SeleniumRegression_TC_057 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	@Test
	public void RMA_SeleniumRegression_TC_057_Test() throws Exception,Error {
		
		StrScreenShotTCName = "RMA_SeleniumRegression_TC_057";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_057_Verify that notes are displayed in Task Name", "Successfully Verify that notes are displayed in Task Name");
			parentlogger.assignAuthor("NidhiJha");

			String DiaryTaskName;
			String ActivityList_TC_057;
			String DiaryNote_TC_057;
			String DueDate;
			//Local Variable Declaration Completed
			

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList_TC_057 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_057", 1, 0); // Activity List Is Fetched From DataSheet RMA_SeleniumRegression_TC_016
			DiaryNote_TC_057=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_057", 1, 1)+RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "_Diary_"); // Diary Note Is Fetched From DataSheet RMA_SeleniumRegression_TC_016
			DueDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");// Diary Due Date After 5 Day of the Current Date
			//Variable Initialization Completed
			
			//==============================Steps To Create Diary On Diary List Page Is Started Here===============================================================================================						RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Create(driver), "Create Diary Image On Diary List Page", logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Create", DiaryNote_TC_057, ActivityList_TC_057, "uncheck", "check", DueDate,"Important","NA", logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 3)+" "+"On Diary List Page");				
			//==============================Steps To Create Diary On Diary List Page Is Ended Here================================================================================================
			
			//==============================Steps To Verify The Display Of Notes In Task Name Is Started Here=====================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "check", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(ActivityList_TC_057, "Diary UX Grid",new String[]{ "Task Name","Priority","Due"},new String[]{DiaryNote_TC_057,"Important",DueDate }, logval);
			//==============================Steps To Verify The Display Of Notes In Task Name Is Ended Here=====================================================================================
			
			
			//==============================Steps To Verify The Display Of Task Name In Task Name Column Is Started Here=====================================================================================
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); 
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(ActivityList_TC_057, "Diary UX Grid",new String[]{ "Task Name","Priority","Due"},new String[]{DiaryTaskName,"Important",DueDate }, logval);
			//==============================Steps To Verify The Display Of Task Name In Task Name Column Is Ended Here=====================================================================================
			
		
			
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
				
				parentlogger.log(LogStatus.INFO, "Finally Block Is Executed");
				if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null )
				{						
					RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On View Record Diary Screen", logval);// close Transaction History screen
				}	
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				
					
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

