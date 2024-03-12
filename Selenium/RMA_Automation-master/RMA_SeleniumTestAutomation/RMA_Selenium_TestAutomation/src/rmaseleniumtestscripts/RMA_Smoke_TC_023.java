package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_023
//Description    : RMA_Smoke_TC_023_Verify View Record Diary Is Showing Diary, Created For Claim
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_022
//Revision       : 0.0 - ImteyazAhmad-07-28-2016
//=================================================================================================

public class RMA_Smoke_TC_023 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_023_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_023_View Record Diary", "Verify View Record Diary Is Showing Diary, Created For Claim");
			parentlogger.assignAuthor("Imteyaz Ahmad");
			
			StrScreenShotTCName ="Smoke_TC_023";
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(StrClaimNumber_002);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  Claim :"+" "+StrClaimNumber_002, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As View Diary Image Is Clicked");
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Diary List (Filtered)");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries", "Diary List Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes", "Diary List Page", logval);
			//RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(RMA_Smoke_TC_022.DiaryTaskName_Smoke_TC_022, "Diary UX Grid", "CQE Complete Quick Entry", 4, logval);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility("Claim: "+StrClaimNumber_002, "Diary UX Grid",new String[]{ "Task Name"},new String[]{ RMA_Smoke_TC_022.DiaryTaskName_Smoke_TC_022 }, logval);
			
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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

