package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_024
//Description    : Existence Of Person Involved Entity Option For Saved Litigation For A Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-07-26-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_024 extends RMA_TC_BaseTest {
	public static String LitCreation_Txt_DocketNumber;
	@Test
	public void RMA_SeleniumRegression_TC_024_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_024_Existence Of Person Involved Entity Option For Saved Litigation For A Claim", "Person Involved Entity Option Existence On Created Claim Litigation's Right Hand Navigation Tree Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");


			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_024";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			//===========================================================Litigation Creation Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Litigation");
			testcall1 = true;
			LitCreation_Txt_DocketNumber = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Litigation", StrClaimNumber, "NA", "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Litigation Is Created With Docket Number::"+ " " + color.RMA_ChangeColor_Utility(LitCreation_Txt_DocketNumber, 2));
			parentlogger.appendChild(logger);
			// New Litigation Is Successfully Created
			//===========================================================Litigation Creation Is Completed Here================================================================================================================================================================================================================================================================
			//===========================================================Verification Of Person Involved Entity Option Existence On Created General Claim's Right Hand Navigation Tree Is Started Here==============================================================================================================================================================================================
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,"Persons Involved" ), "displayed","Person Involved Entity Option On Right Hand General Claim Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Entity Option Existence", "Person Involved Entity Option Existence For Litigation")));
			//===========================================================Verification Of Person Involved Entity Option Existence On Created General Claim's Right Hand Navigation Tree Is Completed Here==============================================================================================================================================================================================


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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

