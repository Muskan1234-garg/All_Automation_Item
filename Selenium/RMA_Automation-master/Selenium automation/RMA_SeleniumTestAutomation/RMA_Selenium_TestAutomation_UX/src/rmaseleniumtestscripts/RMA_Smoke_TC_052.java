package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_052
//Description    : Iso Submission Is Validated
//Depends On TC  : RMA_Smoke_TC_002_GC, 
//Revision       : 0.0 - AbhishekRai-11-01-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_052 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_052_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_052_Iso Submission Is Working Correctly", "Iso Submission Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = "RMA_Smoke_TC_052";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID= null;
			String ClmntCreation_Txt_LastName;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================

			 driver.switchTo().parentFrame();	
		     RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);	
			//===========================================================Claimant Creation Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Claimant");
			testcall1 = true;
			ClmntCreation_Txt_LastName = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Claimant", StrClaimNumber, "Great Britain", "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Claimant Is Created With Claimant LastName::"+ " " + color.RMA_ChangeColor_Utility(ClmntCreation_Txt_LastName, 2));
			parentlogger.appendChild(logger);
			//reports.endTest(logger);
			//===========================================================Claimant Creation Is Completed Here================================================================================================================================================================================================================================================================
			//===========================================================Verification That Created Claimant Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Claimant Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Lnk_ClaimRightHandTree(driver, ClmntCreation_Txt_LastName),ClmntCreation_Txt_LastName+ " Created Claimant Link On Right Hand Claim Tree",logval);
			//===========================================================Verification That Created Claimant Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================

			//Region =====================================================Steps To Open ISO Claim Submission Page Started Here============================================================================================================================================================================================================================================================

			RMA_Functionality_Utility.RMA_ListOptionClick_Utility("Claim-ISO Claim Submission", logval);
			//EndRegion ==================================================Steps To Open ISO Claim Submission Page Completed Here============================================================================================================================================================================================================================================================

			//Region =====================================================Steps To Create Initial Submission Is Started Here=================================================================================================			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Lst_SubmissionType(driver), "IN - Initial", "Submission Type Drop Down List", "ISO Submission Page",logval); 
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Chk_ISOSubmission(driver), "check", "Eligible for ISO Submission Check Box", "ISO Submission Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added To Save Button Needs To Be Clicked In ISO Submission Page In Worker's Compensation Claim Creation Page");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_ISOSubmissionSave(driver), "Save Image On ISO Submission Page", logval);
			//EndRegion ==================================================Steps To Create Initial Submission Is Completed Here=======================================================================================

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
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

