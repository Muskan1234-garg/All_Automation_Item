package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_051
//Description    : Quick Summary For WC Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - AbhishekRai-10-30-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_051 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_051_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_051_Quick Summary For WC Claim", "Quick Summary For WC Claim Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = "RMA_Smoke_TC_051";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID= null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
			
			//Region =====================================================Local Variable Declaration Started Here=====================================================================
			String StrClaimStaus;			
			//EndRegion ==================================================Local Variable Declaration Completed Here=======================================================================================================
			
			//Region =================================================Quick Summary For WC Claim Is Started Here=====================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
			StrClaimStaus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver), "value"); // Fetch Claim Status Value
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_QuickSummary(driver), "Quick Summary Shutter Tab On Workers' Comp Claim Creation Page",logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Get Quick Summary Window Loaded In Worker's Compensation Claim Creation Page");			
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.quickSummaryFarme);		
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Tbl_QuickSummary(driver), StrClaimStaus, 0, StrClaimNumber, "Quick Summary Table On Workers' Comp Claim Creation Page", logval);		
			//EndRegion ==================================================Quick Summary For WC Claim Is  Completed Here=====================================================================================================
			
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
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
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
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver), "Back Image Button On Claim Page"+ " ", logval);
				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

