package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_017
//Description    : '1 - Department and Event Date within X Days' Duplicate Claim Criteria Is Validated 
//Revision       : 0.0 - AbhishekRai-07-27-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_017 extends RMA_TC_BaseTest {	
	@Test
	public void RMA_QTPRegression_TC_017_Test() throws Exception,Error {
		try{ 
			String LOBParameterSetUp_Lst_ClaimType;
			String ClaimNumber;
			String ClaimNumber_1;			
			String EventNumber;
			String EventNumber_1;
			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String DefaultFrameID_1;
			//Local Variable Declaration Completed Here

			parentlogger = reports.startTest("RMA_QTPRegression_TC_017_Duplicate_Claim_Criteria_1_Validation", "'1 - Department and Event Date within X Days' Duplicate Claim Criteria Is Validated ");
			parentlogger.assignAuthor("Abhishek Rai");
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_017";
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

			GenClaimCreation_Txt_DateOfEvent = "07/30/2017"; 
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Variable Initialization Completed 			
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_04_QTPRegression_03.xlsx"); //Excel WorkBook RMA_Suite_04_QTPRegression_03 IS Fetched To Retrieve Data 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_017", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_017			
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_017", 1,1 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_017
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_017", 1,2 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_017
			LOBParameterSetUp_Lst_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_017", 1, 3); //LOBParameterSetUp_Lst_ClaimType Is Fetched From DataSheet RMA_QTPRegression_TC_017	
			//Data Fetch From Excel WorkBook Is Completed Here			

			//============================================================Steps To Select Duplicate Claim Criteria Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);		
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_DuplicateClaimCriteria_Utility("1 - Department and Event Date within X Days", 2, LOBParameterSetUp_Lst_ClaimType, logval);	
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//============================================================Steps To Select Duplicate Claim Criteria Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//============================================================Steps To Create First General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			ClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(ClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			EventNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EventNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber			
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//=============================================================Steps To Create First General Claim Is Completed Here=======================================================================
			
			//============================================================Steps To Create Second General Claim (Unsuccessful Duplicate Claim Criteria) Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall2 = true;
			ClaimNumber_1 = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);			
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);			
			//=============================================================Steps To Create Second General Claim (Unsuccessful Duplicate Claim Criteria) Is Completed Here=======================================================================
			
			//==============================================================Steps To Verify Date Of Claim and Date Of Event On Duplicate Claim Criteria Window Is Started Here==========================================================================================================================================================================================									
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber, 0, ClaimNumber , "Duplicate Claim Criteria Table",logval);
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber, 4, GenClaimCreation_Txt_DateOfClaim , "Duplicate Claim Criteria Table", logval); 
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber,5, GenClaimCreation_Txt_DateOfEvent, "Duplicate Claim Criteria Table", logval);			                                                            
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Duplicate Claim Criteria Message Window Verification", "Duplicate Claim Criteria Message Window Verification Is Successfull")));
			//==============================================================Steps To Verify Date Of Claim and Date Of Event On Duplicate Claim Criteria Window Is Completed Here===========================================================================================================================================================================
			
			//==============================================================Steps To Save Above Created Unsuccessful Claim Created Is Started Here==========================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Btn_Save(driver), "Save Image On Duplicate Claim Criteria Window", logval);// Save Button Is Clicked			
			ClaimNumber_1 = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); 
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(ClaimNumber_1, 2));
			EventNumber_1 = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EventNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
			
			DefaultFrameID_1=  RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();						
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//==============================================================Steps To Save Above Created Unsuccessful Claim Created Is Completed Here==================================================================================================================================================================================================================================================================================
			
			//============================================================Steps To Create Third General Claim (Unsuccessful Duplicate Claim Criteria) Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);			
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);			
			//=============================================================Steps To Create Third General Claim (Unsuccessful Duplicate Claim Criteria) Is Completed Here=======================================================================
			
			//==============================================================Steps To Verify Date Of Claim and Date Of Event On Duplicate Claim Criteria Window Is Started Here==========================================================================================================================================================================================									
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber, 0, ClaimNumber , "Duplicate Claim Criteria Table",logval);
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber, 4, GenClaimCreation_Txt_DateOfClaim , "Duplicate Claim Criteria Table", logval); 
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber,5, GenClaimCreation_Txt_DateOfEvent, "Duplicate Claim Criteria Table", logval);
			//Steps To Verify First Claim Created Is Completed
			
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber_1, 0, ClaimNumber_1 , "Duplicate Claim Criteria Table",logval);
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber_1, 4, GenClaimCreation_Txt_DateOfClaim , "Duplicate Claim Criteria Table", logval); 
			RMA_Verification_Utility.RMA_TableSingleTextPartialVerify_Utility(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Tbl(driver), EventNumber_1,5, GenClaimCreation_Txt_DateOfEvent, "Duplicate Claim Criteria Table", logval);
			// Steps To Verify Second Claim Created Is Completed
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Duplicate Claim Criteria Message Window Verification_1", "Duplicate Claim Criteria Message Window Verification Is Successfull_1")));
			//==============================================================Steps To Verify Date Of Claim and Date Of Event On Duplicate Claim Criteria Window Is Completed Here===========================================================================================================================================================================
			
			//==============================================================Steps To Cancel Duplicate Claim Is Started Here==========================================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericUXWindowDupClaim_Btn_Cancel(driver), "Cancel Image On Duplicate Claim Criteria Window", logval);// Save Button Is Clicked			
			driver.switchTo().parentFrame();			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On RMA Application Default View Page", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			//==============================================================Steps To Cancel Duplicate Claim Is Completed Here==================================================================================================================================================================================================================================================================================
	
			
			//=================================================================Steps To Search First Claim Is Started Here ===============================================================================================================================================================			
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", ClaimNumber, ClaimNumber,DefaultFrameID,logval);			
			//=================================================================Steps To Search First Claim Is Completed Here ===============================================================================================================================================================
			
			//===========================================================Steps To Delete First Created Claim Is Started Here==============================================================================================================================================================						
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Claim Creation Page", true, logval);
			//===========================================================Steps To Delete First Created Claim Is Completed Here==========================================================================================================================================================================
						
			//=================================================================Steps To Second Claim Search Is Started Here ===============================================================================================================================================================			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);			//
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", ClaimNumber_1, ClaimNumber_1,DefaultFrameID_1,logval);			
		
			//=================================================================Steps To Second Claim Search Is Completed Here ===============================================================================================================================================================
			
			//===========================================================Steps To Delete Second Created Claim Is Started Here==============================================================================================================================================================					
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Claim Creation Page", true, logval);			
			//===========================================================Steps To Delete Second Created Claim Is Completed Here==========================================================================================================================================================================
						
		} 
		catch (Exception|Error e) {

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
			if (testcall1== true && loggerval1.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create New General Claim To Validate An Error Scenario And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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

		} catch (Exception |Error e) {
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
