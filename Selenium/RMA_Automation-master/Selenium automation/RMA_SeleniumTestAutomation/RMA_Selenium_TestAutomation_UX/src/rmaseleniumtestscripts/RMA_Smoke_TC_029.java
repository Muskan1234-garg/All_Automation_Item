package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_029
//Description    : Verify Claim Involvement History Functionality For WC Is Validated
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - AbhishekRai-10-25-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_029 extends RMA_TC_BaseTest {

@Test
public void RMA_Smoke_TC_029_Test() throws Exception,Error {
	
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_029_Verify Claim Involvement History Functionality For WC", "Claim Involvement History Functionality For WC Is Validated");
	parentlogger.assignAuthor("Abhishek Rai");
		
	//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
	StrScreenShotTCName = "RMA_Smoke_TC_029";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID= null;
	//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================================================================================================================================

	//Region =====================================================Local Variable Declaration Started Here======================================================================================================================================================================================================
	String strClaimType;
	//EndRegion ==================================================Local Variable Declaration Completed Here=====================================================================================================================================================================================================

	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
	strClaimType = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimType(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
	
	//Region =====================================================Steps To Open Claim Involvement History Page Is Started Here================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeInfo(driver), "Employee Info Tab On Worker Comp Claim Creation Page",logval);	
	RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Get Employee Claim History Button In Clickable Status In Worker's Compensation Claim Creation Page");	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_EmployeeClaimHistory(driver), "Employee Claim History Button On Workers' Comp Claim Creation Page",logval);
	//EndRegion ==================================================Steps To Open Claim Involvement History Page Is Completed Here==================================================================================================================================================================================
	
	//Region =====================================================Steps To Verify Claim Involvement History Is Started Here=========================================================================================================================================================================================			
	String []ExpectedColHeadersToBeVerified = {"Claim Number","Claim Type","Claim Status"};		
	String []ExpectedValuesToBeVerified = {StrClaimNumber,strClaimType, "O Open"};
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Claim Involvement History NG Grid Table",logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Claim Involvement History NG Grid Table", logval);			
	RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(StrClaimNumber, "Claim Involvement History UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, logval);
	RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(strClaimType, "Claim Involvement History UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, logval);
	RMA_Verification_Utility.RMA_VerifyUXGrid_Utility("O Open", "Claim Involvement History UX Grid",ExpectedColHeadersToBeVerified, ExpectedValuesToBeVerified, logval);
	//EndRegion ==================================================Steps To Verify Claim Involvement History Is Completed Here=========================================================================================================================================================================================
	
	RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Employee Claim History Is Clickable In Workers Compensation Claim Creation Page");	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Btn_CloseEmployeeClaimHistory(driver), "Close Button On Employee Claim History Popup On  Workers' Comp Claim Creation Page",logval);	
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
		 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

