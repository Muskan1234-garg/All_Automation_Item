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
//TestCaseID     : RMA_SeleniumRegression_TC_104
//Description    : Create, Edit and Delete of Attachments For A Newly Created Worker's Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-01-10-2018
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_104 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_104_Test() throws Exception,Error{
		try{
			String WorkersCompClaim_Txt_ClaimType;
			String WorkersCompClaim_Txt_Department;
			String WorkersCompClaim_Txt_Jurisdiction;
			String WorkersCompClaim_Txt_DateOfEvent;
			String WorkersCompClaim_Txt_TimeOfEvent;
			String WorkersCompClaim_Txt_DateOfClaim;
			String WorkersCompClaim_Txt_TimeOfClaim;
			String WorkersCompClaim_Txt_ClaimInfoDept;
			String FileName;
			String FileSize;
			//Local Variable Declaration Completed
			
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_104_Create, Edit And Delete Of Attachments_Worker's Compensation Claim", "Create, Edit And Delete Of Attachments On A Newly Created Worker's Compensation Claim Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_060";
			loggerval1 = "NotInitialized";
			testcall1 = false; 
			loggerval2 = "NotInitialized";
			testcall2 = false; 
			loggerval3 = "NotInitialized";
			testcall3 = false;  
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			WorkersCompClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			WorkersCompClaim_Txt_DateOfClaim = WorkersCompClaim_Txt_DateOfEvent;
			WorkersCompClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			WorkersCompClaim_Txt_TimeOfClaim=WorkersCompClaim_Txt_TimeOfEvent;
			//WorkersCompClaim_Txt_EmployeeNo=111111111;//RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
			
			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData2 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data
			WorkersCompClaim_Txt_ClaimType = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			WorkersCompClaim_Txt_Department = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			WorkersCompClaim_Txt_Jurisdiction = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 3); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			WorkersCompClaim_Txt_ClaimInfoDept = ExcelData2.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 4); // Claim Info Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
			//Fetch Of Data From Excel WorkBook Completed
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//===========================================================WorkerComp Creation Is Started Here===============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WorkersCompCorp", "RMA_WorkersCompCorpClaimCreation",0)+" To Create Worker Comp Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_WorkersCompCorpClaimCreation( WorkersCompClaim_Txt_ClaimType,"Open", 111111111,  WorkersCompClaim_Txt_Department,  WorkersCompClaim_Txt_DateOfEvent,  WorkersCompClaim_Txt_TimeOfEvent,  WorkersCompClaim_Txt_DateOfClaim,  WorkersCompClaim_Txt_TimeOfClaim,  WorkersCompClaim_Txt_Jurisdiction, WorkersCompClaim_Txt_ClaimInfoDept, true,logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Workers Comp Claim Is Created With WorkerComp Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New WorkerComp Is Successfully Created
			//===========================================================WorkerComp Creation Is Completed Here==============================================================================================================================================================================================
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_WorkersCompCorpClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "To Create And Edit Attachment And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Error Condition Has Occured During attachments Create, Edit And Delete And Attachments Screen Needs To Be Closed");
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
