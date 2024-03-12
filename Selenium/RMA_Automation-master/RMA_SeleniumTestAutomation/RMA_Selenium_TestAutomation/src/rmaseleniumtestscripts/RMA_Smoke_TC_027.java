package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_POM_ClaimCommentsSummary;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_027
//Description    : RMA_Smoke_TC_027_Verify That Claim Comments Summary Window Displays Comments, Added On Comments Window Previously
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_024
//Revision       : 0.0 - ImteyazAhmad-08-01-2016
//Modify By		: 0.1 - RenuVerma-02-02-2017 Modified as Comment screen is changed into the UX screen
//=================================================================================================

public class RMA_Smoke_TC_027 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_027_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_027_ Comments Verification On Claim Comments Summary", "Verify That Claim Comments Summary Window Displays Comments, Added On Comments Window Previously");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			StrScreenShotTCName ="Smoke_TC_027";

			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrClaimNumber_002, "Left Navigation Tree", logval);// Claim Link Is Clicked To Load Claim Page
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ClaimCommentsSummary(driver), "Claim Comments Summary Image On  Claim : "+" "+StrClaimNumber_002, logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			driver.manage().window().maximize();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_POM_ClaimCommentsSummary.RMAApp_Comments_Btn_Close(driver)));
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Smoke_TC_024.StrComments_Smoke_TC_024),RMA_Smoke_TC_024.StrComments_Smoke_TC_024+ " Text On Claim Comments Summary Table", logval);
			//RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_POM_ClaimCommentsSummary.RMAApp_Comments_Tbl_CommentSummaryTable(driver), RMA_Smoke_TC_024.StrComments_Smoke_TC_024, 0, RMA_Smoke_TC_024.StrComments_Smoke_TC_024, "Claim Comments Summary Table", logval);parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Claim Comments Summary Verification", StrScreenShotTCName)));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Claim Comments Summary Verification", StrScreenShotTCName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_ClaimCommentsSummary.RMAApp_Comments_Btn_Close(driver), "Close Button On Claim Comments Summary Page", logval);
			globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);

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

