package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Policy;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Packages Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_124
//Description    : Create,Edit And Delete Of Attachments On Policy Tracking On Maintenance Screen
//Depends On TC  : RMA_Smoke_TC_041_I
//Revision       : 0.0 - ShrutiShruti-01-11-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_124 extends RMA_TC_BaseTest{
	@Test
	public void RMA_seleniumRegression_TC_124_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_124_Create, Edit and Delete of Attachmments On Policy Tracking Page On Maintenance Screen", "Create, Edit and Delete of Attachments On Policy Tracking Page on Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_124";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variables Declaration Completed here
			
			String StrPolicyNumber;
			String StrPolicyName;
			String FileName;
			String FileSize;
			//Local Variables Declaration Completed Here

			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variables Initialization Completed Here
			
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA", "NA", "Navigation To RMA Maintenance Screen", logval);	
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//=============================================================New Policy Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Policy From Maintenance Screen");
			testcall1 = true;
			StrPolicyName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("PolicyTracking", "I", "10",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrPolicyNumber =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Policy.RMAApp_Policy_Txt_PolicyNumber(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Policy Is Created With Policy Name::"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName, 2)+ " "+ "And Policy Number"+ " "+color.RMA_ChangeColor_Utility(StrPolicyNumber, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==============================================================New Policy Creation Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//=================================================Steps To Create And Edit Attachments Started Here==============================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Claim :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Payment :"+" "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011);
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", FileName, FileSize, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached And Edited Successfully On Event :"+" "+StrClaimNumber);
			parentlogger.appendChild(logger);
			//=================================================Steps To Create And Edit Attachments Started Here=======================================================================================================================================================================================

			//=================================================Steps To Delete Created Attachments Started Here==============================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called ::" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",1)+" Is Called To  Delete Attached Document On Payment :"+" "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011);
			testcall3 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", FileName, FileSize, false, logval1);
			parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Event :"+" "+StrClaimNumber);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Attachments Screen Is To Be Closed");// switch to claim frame
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button Attchement Screen", logval);// close attachment screen
			//=================================================Steps To Delete Created Attachments Started Here==============================================================================================================================================================================	
		
			//=================================================Steps To Delete Policy Tracking Started Here=================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Policy Tracking", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Policy Tracking", true, logval);
			//=================================================Steps To Delete Policy Tracking Completed Here=============================================================================================================================================================================================================================
		}
		catch(Exception|Error e)
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "And Hence The Test Case Is A Fail");
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
