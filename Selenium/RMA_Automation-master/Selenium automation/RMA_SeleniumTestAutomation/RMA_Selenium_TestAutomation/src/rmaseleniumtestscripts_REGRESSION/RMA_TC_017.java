package rmaseleniumtestscripts_REGRESSION;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_OSHA;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_017
//Description    : RMA_TC_017_ Successful Creation Of A Diary From OSHA Is Validated
//Depends On TC  : RMA_TC_016
//Revision       : 0.0 - RenuVerma-03-08-2017
//=================================================================================================

public class RMA_TC_017 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_017_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_017_ Attach A Diary From OSHA", "Successful Creation Of A Diary From OSHA Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String DiaryTaskName;	
			String StrSafeguardsProvided;
			String StrFailureToUseSafeguards;
			String StrFailureToFollowRules;
			String ActivityList;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			StrSafeguardsProvided = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_017", 1, 0); // Safeguards Provided Is Fetched From DataSheet RMA_TC_017
			StrFailureToUseSafeguards=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_017", 1, 1); // Failure To Use Safeguards Is Fetched From DataSheet RMA_TC_017
			StrFailureToFollowRules=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_017", 1, 2); // Failure To Follow Rules Is Fetched From DataSheet RMA_TC_017
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_017", 1, 3); // Activity List Is Fetched From DataSheet RMA_TC_017
			testcall1 = false;			
			loggerval1 = "NotInitialized";
			StrScreenShotTCName = "RMA_TC_017";
			//Variable Initialization Completed
			
			/*================================================== Steps To Add New OSHA Is Started Here================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "OSHA"), "OSHA Link On Left Hand Navigation Tree Under Event", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("OSHA");
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Chk_EventOSHARecordable(driver), "check", "Event OSHA Recordable Checkbox", "OSHA Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Chk_PrivacyCase(driver), "check", "Privacy Case Checkbox", "OSHA Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Txt_SafeguardsProvided(driver), "Safeguards Provided TextBox On OSHA Page", StrSafeguardsProvided, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Txt_FailureToUseSafeguards(driver), "Failure To Use Safeguards TextBox On OSHA Page", StrFailureToUseSafeguards, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Txt_FailureToFollowRules(driver), "Failure to Follow Rules TextBox On OSHA Page", StrFailureToFollowRules, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("OSHA", false, "NA", "OSHA Page", logval);
			/*==================================================  Steps To Add New OSHA Is Ended Here================================================================*/
		
			/*===================================================Steps To Attach Diary On OSHA Is Started Here=======================================================================================================================================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Diary(driver), "Diary Image On  OSHA Page",logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attach","NA",ActivityList,"NA","NA", "NA", logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 3)+" "+"On OSHA Page");							
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  OSHA Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As View Diary Image Is Clicked");
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Diary List (Filtered)");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On View Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries Checkbox", "View Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes Checkbox", "View Diary Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(DiaryTaskName, "Diary UX Grid", "CQE Complete Quick Entry", 4, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Diary List (Filtered) Page", logval);
			/*====================================================Steps To Attach Diary On OSHA Is Ended Here=======================================================================================================================================================================================*/		
			
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

