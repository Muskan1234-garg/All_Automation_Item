package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Policy;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_059
//Description    : Policy Is Getting Created By Entering All Mandatory Fields Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-11-06-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_059 extends RMA_TC_BaseTest {
	
	public static String StrPolicyName;
	
	@Test
	public void RMA_Smoke_TC_059_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_059_Policy Is Getting Created By Entering All Mandatory Fields", "Policy Is Getting Created By Entering All Mandatory Fields Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");
			
			//Region =====================================================Global Variable Initialization Is Started Here=========================================================================================
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_059";
			ErrorMessage = null;
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 
			
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================			
			String StrPolicyNumber;
			String StrPolicyAmount;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
			
			//Region =====================================================New Policy Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Policy From Maintenance Screen");
			testcall1 = true;
			StrPolicyName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("PolicyTracking", "I", "10",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrPolicyNumber =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyNumber(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Policy Is Created With Policy Name::"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName, 2)+ " "+ "And Policy Number"+ " "+color.RMA_ChangeColor_Utility(StrPolicyNumber, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion ==================================================New Policy Creation Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Verification That All Tabs Are Present For Policy Screen Is Started Here=======================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_PolicyInfo(driver), "Policy Info Tab On Policy Tracking Page",logval);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_InsurerInfo(driver), "Insurer Tab On Policy Tracking Page",logval);				
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_BrokerInfo(driver), "Broker Info Tab On Policy Tracking Page",logval);			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_BrokerInfoAddress4Line(driver), "Broker Info Address Line 4 TextBox On Broker Info Tab  On Maintenance-->Policy Page", "Broker Info Address Line", logval);			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_Supplementals(driver), "Supplementals Tab On Policy Tracking Page",logval);				
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_PolicyInfo(driver), "Policy Info Tab On Maintenance-->Policy Page", logval);
			//EndRegion ==================================================Verification That All Tabs Are Present For Policy Screen Is Completed Here=======================================================================================================================================================================================================================================================
			
			//Region =====================================================Edit Of Created Policy Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Policy From Maintenance Screen");
			testcall2 = true;			
			RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("PolicyTracking", "20" ,CurrentFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			StrPolicyNumber =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyNumber(driver), "value");
			StrPolicyAmount =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_Premium(driver), "value");
			parentlogger.log(LogStatus.PASS, "Edit Of Following Policy Is Successful, Edited Policy Premium Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrPolicyAmount, 2)+ " "+ "And Policy Number"+ " "+color.RMA_ChangeColor_Utility(StrPolicyNumber, 2));
			//EndRegion ==================================================Edit Of Created Policy Is Completed Here==========================================================================================================================================================================================================================================================================================
					
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceEditEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

