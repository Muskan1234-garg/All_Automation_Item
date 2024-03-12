package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
//import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
//import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_023
//Description    : RMA_Smoke_TC_023_Verify View Record Diary Is Showing Diary, Created For Claim
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_022
//Revision       : 0.0 - RenuVerma-07-10-2017
//=================================================================================================

public class RMA_Smoke_TC_023 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_023_Test() throws Exception,Error {
		
		StrScreenShotTCName = null;
		StrScreenShotTCName = "Smoke_TC_023";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_023_View Record Diary", "Verify View Record Diary Is Showing Diary, Created For Claim");
			parentlogger.assignAuthor("Renu Verma");
		
			//RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);
			//RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim", "Search", StrClaimNumber, StrClaimNumber,DefaultFrameID, logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  Claim :"+" "+StrClaimNumber, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryFrame);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility("Claim: "+StrClaimNumber, "Diary UX Grid",new String[]{ "Task Name","Priority"},new String[]{ RMA_Smoke_TC_022.Diary_Smoke_TC_022,"Important" }, logval);
		
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
				if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(RMA_Selenium_POM_VerificationMessage.TransactionHistoryFrame))
				{
					driver.switchTo().parentFrame();//switch to claim frame
				}				
				if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null)
				{
					RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Record Summary Screen", logval);// close Transaction History screen
				}
			 driver.switchTo().parentFrame();	
		 } catch (Exception|Error e) {
			System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
		}
		 reports.endTest(parentlogger);	
		 reports.flush();
		}
	}		
}

