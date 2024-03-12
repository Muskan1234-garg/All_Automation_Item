package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_030
//Description    : Add And Delete Of Work Loss Of WC Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - AbhishekRai-10-30-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_030 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_030_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_030_Add And Delete Of Work Loss Of WC Claim", "Add And Delete Of Work Loss Of WC Claim Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region ==================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = "RMA_Smoke_TC_030";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID= null;
			//EndRegion ==============================================Global Variable Initialization Is Completed Here==================================================================================================

			//Region =================================================Local Variable Declaration Started Here=====================================================================================================
			String LastWorkDay;
			String ReturnToWork;
			//EndRegion ==============================================Local Variable Declaration Completed Here=====================================================================================================

			//Region =================================================Local Variable Initialization Started Here=====================================================================================================
			LastWorkDay = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, -1,"MM/dd/yyyy");
			ReturnToWork = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			//EndRegion ==============================================Local Variable Initialization Completed Here=====================================================================================================

			//Region =================================================Add Work Loss For WC Claim Is Started Here=====================================================================================================		
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers' Comp Claim Creation Page",logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Get Employee Work Loss Image Button In Clickable Status In Worker's Compensation Claim Creation Page");	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Img_EmploymentInfoWorkLoss(driver), "Work Loss Image Button On Workers' Comp Claim Creation Page",logval);			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_AddRestrictionWrokLoss(driver), "Add New Work Loss Button On Work Loss Window On Workers' Comp Claim Creation Page",logval);			
			RMA_Input_Utility.RMA_ActionSendKeys_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_LastWorkDayWorkLoss(driver), "Last Work Day TextBox On Work Loss Window On Workers' Comp Claim Creation Page",LastWorkDay, logval);			
			Thread.sleep(5000);
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_Stateduration(driver), "State Duration TextBox On Work Loss Window On Workers' Comp Claim Creation Page",logval);	
			RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "Work Loss Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Supplementals(driver), "Supplementals Tab On Work Loss Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_LostDayInfo(driver), "Lost Day Info Tab On Work Loss Page",logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_DateReturnedWorkLoss(driver), "Return To Work TextBox On Work Loss Window On Workers' Comp Claim Creation Page",ReturnToWork, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Img_CalculateDuration(driver), "Calculate Durations Image Button On Work Loss Window On Workers' Comp Claim Creation Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(DefaultFrameID, false, "NA", "Work Loss Page", logval);
			//EndRegion =================================================Add Work Loss For WC Claim Is Completed Here=====================================================================================================

			//Region =================================================Delete Work Loss For WC Claim Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver), "Back Image Button On Claim Page ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID); 	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers' Comp Claim Creation Page",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Get Employee Work Loss Image Button In Clickable Status In Worker's Compensation Claim Creation Page");	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Img_EmploymentInfoWorkLoss(driver), "Work Loss Image Button On Work Loss List Window On Workers' Comp Claim Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_chk_SelectWorkList(driver), " Select All Work Loss check Box On Work Loss List Window On Workers' Comp Claim Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_DeleteRestrictionsWorkLossList(driver), "Delete Button On Work Loss List Window On Workers' Comp Claim Creation Page",logval);
			//RMA_Functionality_Utility.RMA_GenericDelete_Utility("Work Loss Page", true, logval); 			
			//EndRegion =================================================Delete Work Loss For WC Claim Is Completed Here=====================================================================================================
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
				driver.switchTo().parentFrame();			
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page ", logval);
				//driver.switchTo().parentFrame();
				//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericUXTable_Btn_Close(driver), "Close Image Button On Workers Compensation Restrictions Page ", logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

