package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Policy;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_061
//Description    : Coverage Can Be Added, Edited And Deleted From Policy Is Validated
//Depends On TC  : RMA_Smoke_TC_059
//Revision       : 0.0 - AbhishekRai-11-07-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_061 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_061_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_061_Coverage Can Be Added, Edited And Deleted From Policy", "Coverage Can Be Added, Edited And Deleted From Policy Is Validated");
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
			StrScreenShotTCName = "RMA_Smoke_TC_061";
			ErrorMessage = null;			
			//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 
			
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================				
			String StrPolicyLimit;
			String StrPolicyName;
			String StrCoverageType;
			String StrPolicyLimit_1;
			String StrCoverageType_1;
			String FrameID;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
			
			//Region =====================================================Steps To Add First Policy Coverage Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_PolicyEntityAddition_Utility",0)+" To Add New Policy Coverage For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			testcall1 = true;
			StrPolicyName = RMA_Smoke_TC_059.StrPolicyName;
			StrPolicyLimit=RMA_Maintenance_Functionality_Utility.RMA_PolicyEntityAddition_Utility("PolicyCoverage", "Auto Liability", "100",StrPolicyName,logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrCoverageType =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_CoverageType(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Coverage Is Created With Policy Coverege Type::"+ " " + color.RMA_ChangeColor_Utility(StrCoverageType, 2)+ " "+ "And Policy Limit"+ " "+color.RMA_ChangeColor_Utility(StrPolicyLimit, 2) + "For Following Policy"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion ==================================================Steps To Add First Policy Coverage Is Completed Here======================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Policy Tracking"),"Policy Name Breadcrumb From Policy Tracking Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			
			//Region =====================================================Steps To Add Second Policy Coverage Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_PolicyEntityAddition_Utility",0)+" To Add New Policy Coverage For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			testcall2 = true;
			StrPolicyLimit_1=RMA_Maintenance_Functionality_Utility.RMA_PolicyEntityAddition_Utility("PolicyCoverage", "General Liability", "200",StrPolicyName,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			StrCoverageType_1 =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_CoverageType(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Coverage Is Created With Policy Coverege Type::"+ " " + color.RMA_ChangeColor_Utility(StrCoverageType_1, 2)+ " "+ "And Policy Limit"+ " "+color.RMA_ChangeColor_Utility(StrPolicyLimit_1, 2) + "For Following Policy"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			//EndRegion ==================================================Steps To Add Second Policy Coverage Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Verification Policy Coverage Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_Supplementals(driver), "Supplementals Tab On Policy Coverage Page",logval);
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Tab_CoverageInfo(driver), "Coverage Information Tab On Policy Coverage Page",logval);		
			//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Policy.RMAApp_PolicyCoverage_Txt_BrokerLastName(driver), "Premium TextBox On Maintenance-->Policy Coverage Page", "Broker_LastName", logval);						
			//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Policy Coverage Page",logval);			
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Policy Tracking"),"Policy Name Breadcrumb From Policy Tracking Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityViewAll(driver,"Policy Coverage"), "View All Button On Policy Coverage Page",logval);
			Thread.sleep(5000);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 2, "Policy Coverage Grid", logval);	
			//EndRegion ==================================================Steps To Verification Policy Coverage  Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Update Policy Coverage Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_WebLinkSelect("Auto Liability", "Policy Coverage Grid Window", logval);			
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added As Coverage With Coverage Type Auto Liability Is Loaded ");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_CoverageType(driver), "Coverage Type LookUp Button On Policy Coverage Page",logval);						
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added As Policy Coverage Window Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Other Structures", "Coverage Type Lookup Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Other Structures Is Selected As  Coverage Type In Coverage Type TextBox On Policy Coverage Page");			
			FrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();					
			RMA_Functionality_Utility.RMA_GenericSave_Utility(FrameID, false, "NA",  "Maintenance-->Policy Coverage Page", logval);			
			//EndRegion ==================================================Steps To Update Policy Coverage Is Completed Here======================================================================================================================================================================================================================================================================================

			//Region =====================================================Steps To Delete Policy Coverage Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy Coverage Page", true, logval);			
			//EndRegion ==================================================Steps To Delete Policy Coverage Is Completed Here======================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Policy Tracking"),"Policy Name Breadcrumb From Policy Tracking Page",logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PolicyEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PolicyEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

