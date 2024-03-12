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
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_109
//Description    : Create, Edit and Delete of Attachments For A Litigation Is Validated
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-01-10-2018
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_109 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_109_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_109_Create, Edit And Delete An Attachment on Litigation Screen", "Create,Edit And Delete of Attachment On The Litigation Screen Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");

			StrScreenShotTCName = "RMA_SeleniumRegression_TC_109";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed

			String StrLitigation;
			String FileName;
			String FileSize;
			//Local Variables Declared Here

			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization  Completed

			/*===========================================================New Litigation Creation Is Started Here=======================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Litigation");
			testcall1 = true;
			StrLitigation = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Litigation", StrClaimNumber, "NA", "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Litigation Is Created With Docket Number::"+ " " + color.RMA_ChangeColor_Utility(StrLitigation, 2));
			parentlogger.appendChild(logger);
			// New Litigation Is Successfully Created
			/*===========================================================New Litigation Creation Is Completed Here======================================================================================================================================================================================*/

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

			//==========================================================Delete Of Created Litigation Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Litigation Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Litigation Creation Page", true, logval);
			//==========================================================Delete Of Created Litigation Is Completed Here==========================================================================================================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "To Create And Edit Attachments And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "To Delete An Already Created Attachments And Hence The Test Case Is A Fail");
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
				if (!(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)== null))
				{
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Attachments Page (Finally Block Step)", logval);		
				}
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}

}
