package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Policy;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed


//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_063
//Description    : Functionality Of Clone Policy Button Is Validated
//Depends On TC  : RMA_Smoke_TC_059
//Revision       : 0.0 - AbhishekRai-11-08-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_063 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_063_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_063_Functionality Of Clone Policy Button", "Functionality Of Clone Policy Button Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");
			
			//Region =====================================================Global Variable Initialization Is Started Here=========================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_063";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;			
			ErrorMessage = null;		
			//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 
			
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================		
			String PolicyName;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
			
			//Region =====================================================Steps To Clone Policy Is Started Here============================================================================================================================================================================================================================================================================
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_ClonePolicy(driver), "Clone Policy Button On Maintenance-->Policy Tracking Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Maintenance-->Policy Tracking Page", logval);
			PolicyName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyName(driver), "value");
			//EndRegion ==================================================Steps To Clone Policy Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Open Cloned Policy Is Started Here============================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Policy Tracking ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PolicyFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Policy Tracking Page",logval);	
			//EndRegion ==================================================Steps To Open Cloned Policy Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Delete Cloned Policy Is Started Here============================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added As Policy Search Window To Be Open");					
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_PolicyLookup_Txt_PolicyName(driver), "Policy Name TextBox On Policy LookUp Window",PolicyName, logval);			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(PolicyName, "Policy Lookup Window", logval);			
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Policy Tracking Page Is Loaded");	
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame
			driver.switchTo().frame(1);		
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy Tracking Page", true, logval);	
			//EndRegion ==================================================Steps To Delete Cloned Policy Is Completed Here======================================================================================================================================================================================================================================================================================
			
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
				//RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				//driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

