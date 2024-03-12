package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_095
//Description    : Successfully Verify that Work Loss Can be Added And Deleted for WC Claim
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - RenuVerma-01-27-2017 
//=================================================================================================

public class RMA_Smoke_TC_095 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_095_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_095_Add And Delete Work Loss For WC Claim", "Successfully Verify that Work Loss Can be Added And Deleted for WC Claim");
			parentlogger.assignAuthor("Renu Verma");
			
			String LastWorkDay;
			String ReturnToWork;
			long differenceDatesDuration;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_095";
			LastWorkDay=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();// Last Work Day Value Is Fetched
			ReturnToWork=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 5, 0);// Return To WorkDay Value Is Fetched
			
            //Subtracting dates LastWorkDay from ReturnToWork 
            differenceDatesDuration = (Math.abs(new SimpleDateFormat("MMddyyyy").parse(ReturnToWork).getTime() - new SimpleDateFormat("MMddyyyy").parse(LastWorkDay).getTime())/ (24 * 60 * 60 * 1000))-1;// Convert the dates into the time(ms) and substract then again changed into the no of days. 
           
			//========================================= Addition Of Work Loss For Worker's Comp Claim Is Started Here=====================================================================================================
            RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employment Info"), "Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Img_WorkLoss(driver), "Work Loss Image Under Employment Info Tab On Workers' Comp Claim Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_WorkersComp.RMAApp_WorkerComp_Img_AddNew(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkerComp_Img_AddNew(driver), "Employee Work Loss Add New Image On Workers' Comp Employee Work LossPage", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_WorkersComp.RMAApp_WCWorkLoss_Txt_LastWorkDay(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WCWorkLoss_Txt_RetuenToWork(driver), "Return To Work Textbox on Workers' Comp Work Loss Page", ReturnToWork , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WCWorkLoss_Txt_LastWorkDay(driver), "Last Work Day Textbox on Workers' Comp Work Loss Page",LastWorkDay , logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WCWorkLoss_Img_CalcDuration(driver), "Calculate Duration Image on Workers' Comp Work Loss Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);			
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Workers' Comp Work Loss Page", logval);// No error message should appear while calculating the time duration
			RMA_Verification_Utility.RMA_TextCompare(Long.toString(differenceDatesDuration), RMA_Selenium_POM_WorkersComp.RMAApp_WCWorkLoss_Txt_Duration(driver).getAttribute("value"),"Duration TextBox Value" , logval);// Verify that duration calculation should be correct
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_002, false, "NA", "Workers' Comp Work Loss Page", logval);
			//========================================= Addition Of Work Loss For Worker's Comp Claim Is Ended Here=====================================================================================================
		
			//=========================================Deletion Of Work Loss For Worker's Comp Claim Is Started Here=====================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employment Info"), "Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Img_WorkLoss(driver), "Work Loss Image Under Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WC_Tbl_Restricted_LossWork(driver),  new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(LastWorkDay)), "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmp_Img_Delete(driver), "Delete Image On Workers' Comp Loss Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Complete", "Do you want to delete this record?",  "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Work Loss",4), logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);		
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(LastWorkDay))), new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(LastWorkDay))+" Link On Workers' Comp Employee Work Loss Table", logval);
			//=========================================Deletion Of Work Loss For Worker's Comp Claim Is Ended Here=====================================================================================================

		} catch (Exception|Error e) {
			
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
	}
