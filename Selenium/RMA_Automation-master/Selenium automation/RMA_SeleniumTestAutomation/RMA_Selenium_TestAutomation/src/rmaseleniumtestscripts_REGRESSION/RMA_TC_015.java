package rmaseleniumtestscripts_REGRESSION;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumtestscripts.RMA_Smoke_TC_001;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_015
//Description    : RMA_TC_015_ Successful Creation Of A Diary From Dated Text Is Validated
//Depends On TC  : RMA_TC_016
//Revision       : 0.0 - RenuVerma-03-06-2017
//=================================================================================================

public class RMA_TC_015 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_015_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_015_ Attach A Diary From Dated Text", "Successful Creation Of A Diary From Dated Text Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String StrEventDatedText;
			String DiaryTaskName;		
			String ActivityList;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_015", 1, 0); // Activity List Is Fetched From DataSheet RMA_TC_015
			testcall1 = false;			
			loggerval1 = "NotInitialized";
			StrScreenShotTCName = "RMA_TC_015";
			//Variable Initialization Completed
			
			/*================================================== Steps To Add New Dated Text Is Started Here================================================================*/
			parentlogger.log(LogStatus.INFO, "HTML", "The Functional Utility:: RMA_ClaimEntityAddition_Utility Is Called To Create A EVENT -> DATED TEXT" );
			 testcall1 = true;
			 StrEventDatedText = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Dated Text - Event", "Dated Text (0)", RMA_Smoke_TC_001.StrEventNumber_RMA_Smoke_TC_001, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
			 parentlogger.log(LogStatus.INFO, "New EVENT -> DATED TEXT Is Created Successfully With Event Dated Text::"+ " "+ color.RMA_ChangeColor_Utility(StrEventDatedText, 3));
			 loggerval1 = logger.toString();
			 parentlogger.appendChild(logger);
			/*==================================================  Steps To Add New Dated Text Is Ended Here================================================================*/
		
			/*===================================================Steps To Attach Diary On Dated text Is Started Here=======================================================================================================================================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Diary(driver), "Diary Image On  Event Dated :"+" "+StrEventDatedText, logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attach","NA",ActivityList,"NA","NA", "NA", logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 3)+" "+"On Event Dated :"+" "+color.RMA_ChangeColor_Utility(StrEventDatedText,4));							
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Diaries-DiaryList", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiaryList");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On View Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowRegarding(driver), "uncheck", "Show Regarding CheckBox", "Diary List Page", logval);
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page",DiaryTaskName, "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(DiaryTaskName, "Diary UX Grid", "CQE Complete Quick Entry", 4, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Diary List (Filtered) Page", logval);
			/*====================================================Steps To Attach Diary On Dated text Is Ended Here=======================================================================================================================================================================================*/		
			
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

