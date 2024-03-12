package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_118
//Description    : Create, Edit and Delete of Attachments On A Newly Created Non-Occupational Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-01-11-2018
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_118 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegressionTC_118_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_118_Create, Edit And Delete Of Attachments On A Newly Created NonOccupational Claim", "Create, Edit And Delete Of Attachments On A Newly Created NonOccupational Claim Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			//String NonOccupationalClaim_Txt_ClaimType;
			String NonOccupationalClaim_Txt_Department;
			String NonOccupationalClaim_Txt_Jurisdiction;
			String NonOccupationalClaim_Txt_DateOfEvent;
			String NonOccupationalClaim_Txt_TimeOfEvent;
			String NonOccupationalClaim_Txt_DateOfClaim;
			String NonOccupationalClaim_Txt_TimeOfClaim;
			String NonOccupationalClaim_Txt_PolicyLOB;
			String NonOccupationalClaim_Txt_ClaimStatus;
			String NonOccupationalClaim_Txt_PlanName;
			String FileName;
			String FileSize;
			//Local Variable Declaration Completed Here

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
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_118";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			NonOccupationalClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			NonOccupationalClaim_Txt_DateOfClaim = NonOccupationalClaim_Txt_DateOfEvent;
			NonOccupationalClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			NonOccupationalClaim_Txt_TimeOfClaim=NonOccupationalClaim_Txt_TimeOfEvent;
			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			NonOccupationalClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_ClaimStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 1); // Claim Status Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 4); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_PolicyLOB=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 5); // Policy LOB Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			NonOccupationalClaim_Txt_PlanName=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_NonOcc", 1, 6); // PlanName Is Fetched From DataSheet RMA_Smoke_TC_002_NonOcc
			//Fetch Of Data From Excel WorkBook Completed*/
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//===========================================================NonOccupational Claim Creation Is Started Here========================================================================================================================================================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("NonOcc", "RMA_NonOccupationalClaimCreation",0)+" To Create NonOccupational Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_NonOccClaimCreation("Non OCC", NonOccupationalClaim_Txt_ClaimStatus, NonOccupationalClaim_Txt_DateOfEvent, NonOccupationalClaim_Txt_TimeOfEvent, NonOccupationalClaim_Txt_DateOfClaim, NonOccupationalClaim_Txt_TimeOfClaim, NonOccupationalClaim_Txt_Department, 12345,NonOccupationalClaim_Txt_Jurisdiction, NonOccupationalClaim_Txt_PolicyLOB, NonOccupationalClaim_Txt_PlanName,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New NonOccupational Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New NonOccupational Claim  Is Successfully Created
			//===========================================================NonOccupational Claim Creation Is Completed Here=============================================================================================================================================================================================================================================================================================================================================================================================================================

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
					logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_NonOccClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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
				 RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Error Condition Has Occured During Enhanced Notes Create, Edit And Delete Attachments Screen Needs To Be Closed");
					if (!(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)== null)){
						RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Attachments Page (Finally Block Step)", logval);		
					}
			 } catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}

}
