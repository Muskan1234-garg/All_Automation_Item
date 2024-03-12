package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_047
//Description    : RMA_SeleniumRegression_TC_047_ Successful Creation Of A Diary From Adjuster Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-09-06-2017
//=================================================================================================

public class RMA_SeleniumRegression_TC_047 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	@Test
	public void RMA_SeleniumRegression_TC_047_Test() throws Exception,Error {

		StrScreenShotTCName ="RMA_SeleniumRegression_TC_047";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		//Global Variable Initialization Completed 
		
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_047_ Attach A Diary From Adjuster", "Successful Creation Of A Diary From Adjuster Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String StrAdjuster;
			String DiaryTaskName;
			String ActivityList;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases Is Fetched To Retrieve Data
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_SeleniumRegression_TC_047", 1, 0); // Activity List Is Fetched From DataSheet RMA_SeleniumRegression_TC_047
			//Variable Initialization Completed			
				
			/*===========================================================New Adjustor Creation Is Started Here=======================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" Is Called To Create An Adjuster ");
			testcall1 = true;
			StrAdjuster = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Adjuster", StrClaimNumber, "NA", "NA",logval);
			parentlogger.log(LogStatus.INFO, "New Adjuster Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrAdjuster, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================New Adjustor Creation Is Completed Here======================================================================================================================================================================================*/
			
			/*===========================================================Steps To Attach Diary On Adjustor Is Started Here=======================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following  Adjuster Screen::"+" "+StrAdjuster,logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA",ActivityList,"NA","NA", "NA", "Important","adjuster",logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"On Adjuster :"+" "+color.RMA_ChangeColor_Utility(StrAdjuster,4));							
			Thread.sleep(1000);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  Adjuster :"+" "+StrAdjuster, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(RMA_Selenium_POM_VerificationMessage.DiaryFrame);
			RMA_Verification_Utility.RMA_VerifyUXGridPartially_Utility("Claim:"+StrClaimNumber, "Diary UX Grid",new String[]{ "Task Name","Priority","Attach Record"},new String[]{ DiaryTaskName,"Important", "Adjuster"}, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Record Summary Screen", logval);// close Transaction History screen
			/*===========================================================Steps To Attach Diary On Adjustor Is Ended Here=======================================================================================================================================================================================*/		
		
			//==========================================================Delete Of Created Adjuster Is Started Here=========================================================================================================================================================================================================================================================================================
				RMA_Functionality_Utility.RMA_GenericDelete_Utility("Adjuster Creation Page", true, logval);
			//==========================================================Delete Of Created Adjuster Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				}				
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);						

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

