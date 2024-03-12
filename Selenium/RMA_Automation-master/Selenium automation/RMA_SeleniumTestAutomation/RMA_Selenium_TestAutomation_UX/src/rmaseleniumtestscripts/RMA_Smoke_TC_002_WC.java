package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_002_WC
//Description    : Successful Corporate Workers Compensation Claim Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Edit Of Created Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-05-29-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_002_WC extends RMA_TC_BaseTest {

@Test
public void RMA_Smoke_TC_002_WC_Test() throws Exception,Error {
	
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_002_WC_Corporate Workers Comp. Claim Creation", "Successful Corporate Workers Comp. Claim Creation On Providing Mandatory Data, Existence of Necessary Tabs With Edit Of One Text Field In Each, Edit Of Created Claim Is Validated");
	parentlogger.assignAuthor("Renu Verma");
	
	String WorkersCompClaim_Txt_ClaimType;
	String WorkersCompClaim_Txt_Department;
	String WorkersCompClaim_Txt_Jurisdiction;
	String WorkersCompClaim_Txt_DateOfEvent;
	String WorkersCompClaim_Txt_TimeOfEvent;
	String WorkersCompClaim_Txt_DateOfClaim;
	String WorkersCompClaim_Txt_TimeOfClaim;
	//int WorkersCompClaim_Txt_EmployeeNo;
	String WorkersCompClaim_Txt_TimeOfEventEdited;
	String WorkersCompClaim_Txt_TimeOfEventEditedFinal;
	String StrClaimNumberEdited;
	String WorkersCompClaim_Txt_ClaimInfoDept;
	//Local Variable Declaration Completed Here

	StrScreenShotTCName = "RMA_Smoke_TC_002_WC";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID= null;
	//Global Variable Initialization Completed 
	
	WorkersCompClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
	WorkersCompClaim_Txt_DateOfClaim = WorkersCompClaim_Txt_DateOfEvent;
	WorkersCompClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
	WorkersCompClaim_Txt_TimeOfClaim=WorkersCompClaim_Txt_TimeOfEvent;
	WorkersCompClaim_Txt_TimeOfEventEdited = RMA_GenericUsages_Utility.RMA_PastFutureTimeInfo_Utility(-10);
	WorkersCompClaim_Txt_TimeOfEventEditedFinal = RMA_GenericUsages_Utility.RMA_TimeConversion_Utility(WorkersCompClaim_Txt_TimeOfEventEdited, "hh:mm");
	//WorkersCompClaim_Txt_EmployeeNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
	//Local Variable Initialization Completed Here
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data
	WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_WC
	WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
	WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 3); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_WC
	WorkersCompClaim_Txt_ClaimInfoDept = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 4); // Claim Info Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
	//Fetch Of Data From Excel WorkBook Completed

	RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
	//===========================================================Frame Switch To Click Workers Compensation Claim Menu Option Is Started Here===============================================================================================================================================================================================
	if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(DefaultFrameID))
	{
		driver.switchTo().parentFrame();// In Case The Application Is Still Inside Claim Frame Or Any Other Frame (Can Be Added By Or Condition) A Switch To The Parent Frame Is Done To Click Menu Options
	}
	//===========================================================Frame Switch To Click Workers Compensation Claim Menu Option Is Completed Here===============================================================================================================================================================================================
	
	//===========================================================WorkerComp Creation Is Started Here===============================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WorkersCompCorp", "RMA_WorkersCompCorpClaimCreation",0)+" To Create Worker Comp Claim");
	testcall1 = true;
	StrClaimNumber = RMA_Functionality_Utility.RMA_WorkersCompCorpClaimCreation( WorkersCompClaim_Txt_ClaimType,"Open", 111111111,  WorkersCompClaim_Txt_Department,  WorkersCompClaim_Txt_DateOfEvent,  WorkersCompClaim_Txt_TimeOfEvent,  WorkersCompClaim_Txt_DateOfClaim,  WorkersCompClaim_Txt_TimeOfClaim,  WorkersCompClaim_Txt_Jurisdiction, WorkersCompClaim_Txt_ClaimInfoDept, true, logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Workers Comp Claim Is Created With WorkerComp Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
	parentlogger.appendChild(logger);
	DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	// New WorkerComp Is Successfully Created
	//===========================================================WorkerComp Creation Is Completed Here==============================================================================================================================================================================================
	
	//===========================================================Verification That All Tabs Are Present For WorkerComp Screen Started Here==============================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EventDetail(driver), "Event Detail Tab On Workers Comp Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_City(driver), "City Text Box On Event Detail Tab Of Workers Compensation Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "City_"),logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeInfo(driver), "Employee Info Tab On Workers Comp Claim Creation Page",logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmploymentInfo(driver), "Employment Info Tab On Workers Comp Claim Creation Page",logval);

	//RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EmployeeEventDetail(driver), "Employee Event Detail Tab On Workers Comp Claim Creation Page",logval);
	//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_WorkersCompEstablishedLenghtOfDisabilityy(driver), "EstablishedLenghtOfDisabilityy Text Box On Employee Event Detail Of Workers Compensation Claim Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11, 99)),logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_LossInformation(driver), "Loss Information Tab On Workers Comp Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ReportNumber(driver), "Reporter Number Text Box On Loss Information Tab Of Workers Compensation Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "ReportNumber_"),logval);
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Supplementals(driver), "Supplementals Tab On Workers Comp Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_WorkersComp_Txt_PreExtCond(driver), "Pre-Existing Text Box On Supplementals Tab Of Workers Compensation Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "PreExist_"),logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Workers Comp Claim Creation Page",logval);
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimwc", false, "NA", "Workers Compensation Claim Creation Page", logval);
	//===========================================================Verification That All Tabs Are Present For WorkerComp Screen Completed Here==============================================================================================================================================================================================
	
	//==========================================================Edit Of Created Workers Compensation Claim Is Started Here==============================================================================================================================================================================================
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On WorkersCompensation Claim Creation Page", WorkersCompClaim_Txt_TimeOfEventEdited,logval);		
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimwc", false, "NA", "Workers Compensation Claim Creation Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver)));
	WorkersCompClaim_Txt_TimeOfEventEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver).getAttribute("value");
	if (WorkersCompClaim_Txt_TimeOfEventEdited.length()== 7)
	{
		WorkersCompClaim_Txt_TimeOfEventEdited = "0"+WorkersCompClaim_Txt_TimeOfEventEdited;
	}
	RMA_Verification_Utility.RMA_PartialTextVerification(WorkersCompClaim_Txt_TimeOfEventEditedFinal, WorkersCompClaim_Txt_TimeOfEventEdited, "Claim Number After Edit",logval);
	StrClaimNumberEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
	RMA_Verification_Utility.RMA_TextCompare(StrClaimNumberEdited, StrClaimNumber, "Claim Number After Edit",logval);
	parentlogger.log(LogStatus.PASS, "Claim Edit Is Successful And Claim Number Value Remains Same As Before Edit That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumberEdited, 2));
	//==========================================================Edit Of Created Workers Compensation Is Completed Here==============================================================================================================================================================================================

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
	 if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				{		 
		logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_WorkersCompCorpClaimCreation" + " " +  "And Hence The Test Case Is A Fail");	
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
		 driver.switchTo().parentFrame();	
	     RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);	
	 	RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
		 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

