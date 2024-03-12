package rmaseleniumtestscripts_REGRESSION;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_006
//Description    : Successfully Display A Diary Based On Criteria On Diary List Page Is Validated
//Depends On TC  :  RMA_TC_005: As Verify Diaries On basis on Due Date and Task Name Which Is Created
//Revision       : 0.0 - RenuVerma-02-28-2017
//=================================================================================================

public class RMA_TC_006 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String CurrentUserName;
	static String CurrentUserPassword;

	@Test
	public void RMA_TC_006_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_006_ Display A Diary Based On Criteria On Diary List Page", "Successfully Display A Diary Based On Criteria On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			StrScreenShotTCName ="RMA_TC_006";
			//Variable Initialization Completed

			//==============================Steps To Display A Diary Based On Criteria On Diary List Page Is Started Here================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiaryList");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Print(driver), "Print Diary Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate(driver), "Open Diaries by Due Date Radio Option Of Print Diary Popup On Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Txt_FromDate(driver), "From Date Of Print Diary Popup  On Diary List Page", RMA_TC_005.RollDate_TC_005,logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Txt_ToDate(driver), "To Date Of Print Diary Popup On Diary List Page", RMA_TC_005.RollDate_TC_005,logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Chk_FilterbyTaskDescription(driver), "check", "Filter by Task Description CheckBox Of Print Diary Popup", "Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Txt_TaskDescription(driver), "Task Description Of Print Diary Popup On Diary List Page", RMA_TC_005.DiaryTaskName_TC_005,logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesPrint_Img_Print(driver), "Print Image Of Print Diary Popup On Diary List Page", logval);
			if(RMAApp_BrowserName.equalsIgnoreCase("IE"))// when IE browser driver is Used
			{
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Open Button Is appeared On IE Notification Popup");
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Download_Btn_Open(), "Open Button On IE Notification Popup", logval);
			}
			if(RMAApp_BrowserName.equalsIgnoreCase("Chrome"))//  when Chrome driver is Used
			{
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As File Is Getting Downloaded");
				RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_ChromeDownload_Img_PdfIcon(), "Downloaded PDF File Icon on Chrome Browser", logval);
			}
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Opened");
			String StrPdfContents =   RMA_GenericUsages_Utility.RMA_WebPageCopyPaste_Utility(logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_TC_005.DiaryTaskName_TC_005,StrPdfContents, "Diary Task Name Verification On PDF", logval);// Verification done 
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(RMA_TC_005.DiaryTaskName_TC_005, 3)+" Is Appeared On The PDF, Hence Diary Displayed Successfully ased On Criteria. ");
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Screen_Img_Close(), "Close Image on PDF Authentication Popup", logval);	// Close The Popup
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As PDF Is Getting Closed");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Cancel(driver), "Cancel Image Of Print Diary Popup On Diary List Page", logval);
			//==============================Steps To Display A Diary Based On Criteria On Diary List Page Is Ended Here================================================================================================

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

