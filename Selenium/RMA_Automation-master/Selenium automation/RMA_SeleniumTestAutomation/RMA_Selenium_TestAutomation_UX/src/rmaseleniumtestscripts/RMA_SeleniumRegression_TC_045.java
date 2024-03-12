package rmaseleniumtestscripts;

import org.openqa.selenium.By;
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
//TestCaseID     : RMA_SeleniumRegression_TC_045
//Description    : Successfully Void A Diary On Diary List Page Is Validated
//Depends On TC  :  RMA_SeleniumRegression_TC_043: As Verify Diaries On basis on Due Date and Task Name Which Is Created
//Revision       : 0.0 - RenuVerma-09-05-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_045 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	
	@Test
	public void RMA_SeleniumRegression_TC_045_Test() throws Exception,Error {
		
		StrScreenShotTCName = "RMA_SeleniumRegression_TC_045";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_045_ Void A Diary On Diary List Page", "Successfully Void A Diary On Diary List Page Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String FromDateForVoidDiary;
			String  ToDateForVoidDiary;
			//Local Variable Declaration Completed
		
			FromDateForVoidDiary=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility("MM/dd/yyyy");//From Date for Void Diary
			ToDateForVoidDiary=RMA_SeleniumRegression_TC_043.FutureRollDate_TC_043;// TO Date for Void Diary
			//Variable Initialization Completed

			//==============================Steps To Do Void A Diary On Diary List Page Is Started Here================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On" + " "+"RMA Page"+ " ", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryListFrame);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_RowSelector(driver, RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043), "Selected Tick Mark Of Diary UX Grid Corrsponding To Diary: "+RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043+" On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_Void(driver), "Void Diary Image On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesVoid_Chk_VoidSelectedDiary(driver), "uncheck", "Void the Selected Diary(s) CheckBox Of Void Diary Popup", "Diary List Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesVoid_Txt_FromDate(driver), "From Date Of Void Diary Popup  On Diary List Page", FromDateForVoidDiary,logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_DiaryList.RMAApp_DiariesVoid_Txt_ToDate(driver), "To Date Of Void Diary Popup On Diary List Page", ToDateForVoidDiary,logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_DiariesVoid_Img_Void(driver), "Void Diary Image Of Void Diary Popup On Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.DiaryVoidedMessage, false, "Void Diary Message", logval);
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[contains(text(),'"+RMA_Selenium_POM_VerificationMessage.DiaryVoidedMessage+"')]")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "check", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043), RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043+" On Diary List UX Grid", logval);
			parentlogger.log(LogStatus.INFO, "Diary With TaskName :"+" "+color.RMA_ChangeColor_Utility(RMA_SeleniumRegression_TC_043.DiaryTaskName_TC_043, 3)+" Is Not Appeared On The Diary UX Grid On Diary Page, Hence Diary Voided Successfully ");
			//==============================Steps To Do Void A Diary On Diary List Page Is Ended Here================================================================================================

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

