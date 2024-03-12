package rmaseleniumtestscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumPOM.RMA_Selenium_POM_PrintCheck;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_012
//Description    : Successful Printing of Check Is Validated
//Depends On TC  : RMA_Smoke_TC_002, RMA_Smoke_TC_009, RMA_Smoke_TC_011
//Revision       : 0.0 - KumudNaithani-07-07-2016 
// Modify By	: 0.1 - RenuVerma-01-27-2017 Updated ReservesFinancials frame name as current frame function name becuase it can work on ReservesFinancials and Funds trasaction screen both
//=================================================================================================
public class RMA_Smoke_TC_012 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void PrintCheck() throws Exception, Error
{
	String StrAccept;
	String ActualCheckStatus;
	String ExpCheckStatus;
	String StrExpMsg;
	Robot robot=new Robot();
	//Local Variable Declaration Completed
	try {
		String CurrentFrameId;
		
		ExpCheckStatus = "P Printed";
		StrExpMsg = "to record all of checks as having printed successfully";
		StrAccept = "Yes";
		
		StrScreenShotTCName = "Smoke_TC_012";
		parentlogger = reports.startTest("RMA_Smoke_TC_012_Printing Of Check", "Successful Printing Of Check Is Validated");	
		
		

		//===============================================Search Of Control No. Created In Smoke_TC_011 Is Started=====================================================================================================
		RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
		RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver)," Search-->Funds Criteria Page","Control Number Text Box",RMA_Smoke_TC_011.StrControlNumber_RMA_Smoke_TC_011,RMA_Smoke_TC_011.StrControlNumber_RMA_Smoke_TC_011,"fundsTransaction","num",2, logval);
		//===============================================Search Of Control No. Created In Smoke_TC_011 Is Completed=====================================================================================================
		//===========================Steps To Click On Print Check Image On Payment Parameter Set Up Page Started=================================================================================================================================================================================================================================
		CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Chk_MailToSameAsPayee(driver), "uncheck", "Mail To Same As Payee CheckBox", "Payments Page", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Img_PrintCheck(driver), "Print Check Image On Payments Page", logval);
		//===========================Steps To Click On Print Check Image On Payment Parameter Set Up Page Completed===============================================================================================================================================================================================================================
		
		//===========================Steps To Click On Print Button On Print Check Page Started==================================================================================================================================================================================================================================================
		String StrSecPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Last Name Is Done
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_Check(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_Check(driver), "Print Button On Print Check Window", logval);
		//===========================Steps To Click On Print Button On Print Check Page Completed==================================================================================================================================================================================================================================================
		
		//===========================Steps To Switch Back To The RMA Application Window Started=====================================================================================================================================================================================================================================================
		String StrPrimaryWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(StrSecPrimaryWindowHandle);
		//===========================Steps To Switch Back To The RMA Application Window Completed=====================================================================================================================================================================================================================================================
				
		RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrSecPrimaryWindowHandle, StrPrimaryWindowHandle, "No Required", "No Required", "No Required", "Print Check Window", logval);
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_OK(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_OK(driver), "OK Button On Print Check Window", logval);
				
		//RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept);
		Thread.sleep(2000);
		driver.switchTo().window(StrSecPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Last Name Is Done
		//RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrSecPrimaryWindowHandle, StrPrimaryWindowHandle, "No Required", "No Required", "No Required", "Print Check Window", logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PrintCheck.RMAApp_Print_Btn_Cancel(driver), "Cancel Button On Print Check Window", logval);
		driver.switchTo().window(StrSecPrimaryWindowHandle);
		
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameId);
		ActualCheckStatus = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(ExpCheckStatus, ActualCheckStatus,"Check Status Value", logval);
	
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
		}
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	
	finally
	{
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
