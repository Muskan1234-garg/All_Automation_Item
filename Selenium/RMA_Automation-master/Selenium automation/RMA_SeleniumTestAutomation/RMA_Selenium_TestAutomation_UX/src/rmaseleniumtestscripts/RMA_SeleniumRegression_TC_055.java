package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_OSHA;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_055
//Description    : RMA_SeleniumRegression_TC_055_ Successful Creation Of A Diary From OSHA Is Validated
//Depends On TC  : RMA_TC_016
//Revision       : 0.0 - RenuVerma-03-08-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_055 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	public static String StrEventNumber;

	@Test
	public void RMA_SeleniumRegression_TC_055_Test() throws Exception,Error {
		StrScreenShotTCName ="RMA_SeleniumRegression_TC_055";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		//Global Variable Initialization Completed 

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_055_ Attach A Diary From OSHA", "Successful Creation Of A Diary From OSHA Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String DiaryTaskName;	
			String StrSafeguardsProvided;
			String StrFailureToUseSafeguards;
			String StrFailureToFollowRules;
			String ActivityList;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			StrSafeguardsProvided = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_055", 1, 0); // Safeguards Provided Is Fetched From DataSheet RMA_SeleniumRegression_TC_055
			StrFailureToUseSafeguards=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_055", 1, 1); // Failure To Use Safeguards Is Fetched From DataSheet RMA_SeleniumRegression_TC_055
			StrFailureToFollowRules=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_055", 1, 2); // Failure To Follow Rules Is Fetched From DataSheet RMA_SeleniumRegression_TC_055
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_055", 1, 3); // Activity List Is Fetched From DataSheet RMA_SeleniumRegression_TC_055
		
			//Variable Initialization Completed
			
			/*================================================== Steps To Add New OSHA Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			StrEventNumber = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_EventNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrEventNumber),StrEventNumber +" Event Number Link At Top Of The Screen",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(DefaultFrameID);
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		
			RMA_Functionality_Utility.RMA_ListOptionClick_Utility("Event-OSHA", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Chk_EventOSHARecordable(driver), "check", "Event OSHA Recordable Checkbox", "OSHA Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Chk_PrivacyCase(driver), "check", "Privacy Case Checkbox", "OSHA Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Txt_SafeguardsProvided(driver), "Safeguards Provided TextBox On OSHA Page", StrSafeguardsProvided, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Txt_FailureToUseSafeguards(driver), "Failure To Use Safeguards TextBox On OSHA Page", StrFailureToUseSafeguards, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_OSHA.RMAApp_OSHA_Txt_FailureToFollowRules(driver), "Failure to Follow Rules TextBox On OSHA Page", StrFailureToFollowRules, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "OSHA Page", logval);
			/*==================================================  Steps To Add New OSHA Is Ended Here================================================================*/
		
			/*===================================================Steps To Attach Diary On OSHA Is Started Here=======================================================================================================================================================================================*/
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following  Event--> OSHA Screen::"+" "+StrEventNumber,logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA",ActivityList,"NA","NA", "NA", "Important","OSHA",logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"On Event--> OSHA :"+" "+color.RMA_ChangeColor_Utility(StrEventNumber,4));							
			Thread.sleep(1000);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  Event--> OSHA :"+" "+StrEventNumber, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryFrame);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility(DiaryTaskName, "Diary UX Grid",new String[]{ "Priority","Attach Record","Parent Record"},new String[]{ "Important", "OSHA",StrEventNumber}, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On View Diary Screen", logval);// close Transaction History screen
			/*====================================================Steps To Attach Diary On OSHA Is Ended Here=======================================================================================================================================================================================*/		
		
			//==========================================================Delete Of Created EVENT -> OSHA Is Started Here=========================================================================================================================================================================================================================================================================================
			
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("EVENT -> OSHA Page", true, logval);
			//==========================================================Delete Of Created EVENT -> OSHA Is Completed Here==========================================================================================================================================================================================================================================================================================

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
			
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
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
	public void RMA_FailureReport(ITestResult result)   //All The Information Associated With The Test Case Is Stored In Result Variable
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
				parentlogger.log(LogStatus.INFO, "Finally Block Is Executed");
				if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null )
				{						
					RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On View Record Diary Screen", logval);// close Transaction History screen
					driver.switchTo().parentFrame();
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrEventNumber),StrEventNumber +" Event Number Link At Top Of The Screen",logval);
					RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
					RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
					RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			
				}				
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, StrClaimNumber),StrClaimNumber+ " Created Claim Link On Right Hand Event Tree",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);		
				driver.switchTo().parentFrame();		
	
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

