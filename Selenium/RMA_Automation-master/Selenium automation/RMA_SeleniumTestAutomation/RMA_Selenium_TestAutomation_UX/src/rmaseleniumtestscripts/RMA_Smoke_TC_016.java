package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_016
//Description    : Successful Claim Status Change (Open-->Close-->Reopen) Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-25-06-2017
//=================================================================================================
public class RMA_Smoke_TC_016 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_016_Test() throws Exception,Error {
		try{
		parentlogger = reports.startTest("RMA_Smoke_TC_016_Claim Status Change", "Successful Claim Status Change (Open-->Close-->Reopen) Is Validated");
		parentlogger.assignAuthor("Kumud Naithani");

		StrScreenShotTCName = "Smoke_TC_016";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		StrScreenShotTCName = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed 
		
		//================================================================= Claim Status Change To Close Is Started===============================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On General Claim Creation Page",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claim Status Selection Window Is Opened");
		RMA_Navigation_Utility.RMA_WebLinkSelect("Closed", "Claim Status LookUp Window On General Claim Creation Page", logval);
		//Value Is Entered In Claim Status Text Box
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claim Status Is Selected And Claim Selection Window Is Closed");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("DefaultFrameID", false, "NA", "General Claim Creation Page", logval);
		 RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
		RMA_Verification_Utility.RMA_PartialTextVerification("C Closed",RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver).getAttribute("value") , "Closed Claim  Status",logval);
		
		//================================================================= Claim Status Change To Close Is Completed===============================================================================================================================================================
		//===========================================================Claim Status Change To Reopen Is Started Here==============================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_ClaimStatus(driver), "Claim Status Look Up Image Button On General Claim Creation Page",logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claim Status Selection Window Is Opened");
		RMA_Navigation_Utility.RMA_WebLinkSelect("Reopened", "Claim Status LookUp Window On General Claim Creation Page", logval);
		//Value Is Entered In Claim Status Text Box
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claim Status Is Selected And Claim Selection Window Is Closed");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("DefaultFrameID", false, "NA", "General Claim Creation Page", logval);
		RMA_Verification_Utility.RMA_PartialTextVerification("OR Reopened",RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimStatus(driver).getAttribute("value") , "Reopened Claim  Status",logval);
		//===========================================================Claim Status Change To Reopen Is Completed Here==========================================================================================================================================================================
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
	}}		

@AfterMethod
public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			//Since Here The Code Starts And Ends At Claim Frame Itself Hence No Need To Switch Parent Frame
		 } catch (Exception|Error e) {
			System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
		}
		 reports.endTest(parentlogger);	
		 reports.flush();
		}
}		
}

