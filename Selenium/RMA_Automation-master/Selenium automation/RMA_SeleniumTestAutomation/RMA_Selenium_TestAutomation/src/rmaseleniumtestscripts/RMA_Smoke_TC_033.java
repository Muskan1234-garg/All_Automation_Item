package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_033
//Description    : RMA_Smoke_TC_033_ Verify Successful Diary Creation From ToolBar Of Payment
//Depends On TC  : RMA_Smoke_TC_002,RMA_Smoke_TC_032
//Revision       : 0.0 - ImteyazAhmad-08-30-2016
//=================================================================================================

public class RMA_Smoke_TC_033 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	

	@Test
	public void RMA_Smoke_TC_033_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_033_ Verify Successful Diary Creation For Payment", " Verify Successful Diary Creation From ToolBar Of Payment");
			parentlogger.assignAuthor("Imteyaz Ahmad");
			
			String AttachedRecord;
			String ParentRecord;	
			String DiaryTaskName_Smoke_TC_033;
		    //Local Variable Declaration Completed
			
			StrScreenShotTCName ="Smoke_TC_033";
			AttachedRecord = "FUNDS:"+" "+RMA_Smoke_TC_032.StrControlNumber_RMA_Smoke_TC_032;
			ParentRecord = "Claim:"+StrClaimNumber_002;
			
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");			
         	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Diary(driver), "Diary Image On Payment Of Control Number :"+" "+color.RMA_ChangeColor_Utility(RMA_Smoke_TC_032.StrControlNumber_RMA_Smoke_TC_032,2), logval);
         	DiaryTaskName_Smoke_TC_033 = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attach","NA","CQE Complete Quick Entry","NA","NA", "NA", logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName_Smoke_TC_033, 2)+" "+"On Payment Of Control Number :"+" "+color.RMA_ChangeColor_Utility(RMA_Smoke_TC_032.StrControlNumber_RMA_Smoke_TC_032,2));							
           
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  Funds :"+" "+RMA_Smoke_TC_032.StrControlNumber_RMA_Smoke_TC_032, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching("Diary List (Filtered)");
			// Failed JIRA logged RMA-43784 
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(DiaryTaskName_Smoke_TC_033, "Diary UX Grid",new String[]{"Attach Record","Parent Record"},new String[]{AttachedRecord,ParentRecord}, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			//			driver.switchTo().parentFrame();
//			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
//			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
//			
			
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

