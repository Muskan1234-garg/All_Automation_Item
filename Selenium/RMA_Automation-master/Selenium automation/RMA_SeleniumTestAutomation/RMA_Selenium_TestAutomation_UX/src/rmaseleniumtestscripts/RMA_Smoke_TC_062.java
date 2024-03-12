package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Policy;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_062
//Description    : Policy MCO Can Be Added, Edited And Deleted From Policy Is Validated
//Depends On TC  : RMA_Smoke_TC_059
//Revision       : 0.0 - AbhishekRai-11-08-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_062 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_062_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_062_Policy MCO Can Be Added, Edited And Deleted From Policy", "Policy MCO Can Be Added, Edited And Deleted From Policy Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");
			
			//Region =====================================================Global Variable Initialization Is Started Here=========================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_062";
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
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 
			
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================		
			String strEntityName;	
			String strEntityName_1;
			String StrPolicyMCO;
			String StrPolicyMCO_1;
			String StrPolicyName;
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
			
			//Region =====================================================Steps To Add First New  Entity Is Started Here============================================================================================================================================================================================================================================================================
			StrPolicyName = RMA_Smoke_TC_059.StrPolicyName;
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall1 = true;
			strEntityName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "Managed Care Organizations", "SSN",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);			
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity Name::"+ " " + color.RMA_ChangeColor_Utility(strEntityName, 2) + "For Following Policy"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName, 2));			
			//EndRegion ==================================================Steps To Add First New  Entity Is Completed Here======================================================================================================================================================================================================================================================================================
					
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			
			//Region =====================================================Steps To Add Second New  Entity Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Entity From Maintenance Screen");
			testcall2 = true;
			strEntityName_1=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Entity", "Managed Care Organizations", "SSN",logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Entity Is Created With Entity Name::"+ " " + color.RMA_ChangeColor_Utility(strEntityName_1, 2) + "For Following Policy"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName, 2));		
			//EndRegion ==================================================Steps To Add Second New  Entity Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Open Existing Policy Is Started Here============================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);			
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Policy Tracking ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PolicyFrame);		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "LookUp Button On Policy Tracking Page",logval);	
			
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added For Policy Search Window To Be Open");					
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Policy.RMAApp_PolicyLookup_Txt_PolicyName(driver), "Policy Name TextBox On Policy Search Window",StrPolicyName, logval);			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrPolicyName, "Policy Tracking Lookup Window", logval);			
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame
			driver.switchTo().frame(1);		
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion ==================================================Steps To Open Existing Policy Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Add First Policy MCO Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_PolicyEntityAddition_Utility",0)+" To Add New Policy MCO For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			testcall3 = true;
			StrPolicyMCO = RMA_Maintenance_Functionality_Utility.RMA_PolicyEntityAddition_Utility("PolicyMCO", strEntityName, "NA",StrPolicyName,logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);			
			parentlogger.log(LogStatus.INFO, "Following Policy MCO Is Created:: " + color.RMA_ChangeColor_Utility(StrPolicyMCO, 2) + "For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));		
			//EndRegion ==================================================Steps To Add First Policy MCO Is Completed Here======================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame 
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Policy Tracking"),"Policy Name Breadcrumb From Policy Tracking Page",logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);
			
			//Region =====================================================Steps To Add Second Policy MCO Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_PolicyEntityAddition_Utility",0)+" To Add New Policy MCO For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			testcall4 = true;
			StrPolicyMCO_1 = RMA_Maintenance_Functionality_Utility.RMA_PolicyEntityAddition_Utility("PolicyMCO", strEntityName_1, "NA",StrPolicyName,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);			
			parentlogger.log(LogStatus.INFO, "Following Policy MCO Is Created:: " + color.RMA_ChangeColor_Utility(StrPolicyMCO_1, 2) + "For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));			
			//EndRegion ==================================================Steps To Add Second Policy MCO Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Delete First Policy MCO Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Policy MCO Page",logval);					
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(strEntityName, "Policy MCO Grid Window", logval);							
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy MCO Page", true, logval);	
			//EndRegion ==================================================Steps To Delete First Policy MCO Is Completed Here======================================================================================================================================================================================================================================================================================
			
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Policy MCO ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Policy MCO "), "Add Image Button For Policy MCO  For The Following Policy:: " + StrPolicyName + " On Policy Tracking Page",logval);
			//Above Steps Are Added As On Delete Of Policy MCO, The Application Is Getting Redirect To Policy Tracking Page
			
			//Region =====================================================Steps To Delete Second Policy MCO Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Policy MCO Page",logval);			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(strEntityName_1, "Coverage Types Lookup Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Policy MCO Is Getting Loaded");					
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Policy MCO Page", true, logval);	
			//EndRegion ==================================================Steps To Delete Second Policy MCO Is Completed Here======================================================================================================================================================================================================================================================================================
						
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PolicyEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
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
				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

