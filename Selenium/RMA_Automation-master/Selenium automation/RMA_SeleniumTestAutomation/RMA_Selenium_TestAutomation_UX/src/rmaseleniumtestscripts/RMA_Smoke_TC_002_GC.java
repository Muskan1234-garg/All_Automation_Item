package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_002_GC
//Description    : Successful Corporate General Claim Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Edit Of Created Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-05-30-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_002_GC extends RMA_TC_BaseTest {
@Test
public void RMA_Smoke_TC_002_GC_Test() throws Exception,Error {
	
	String GenClaimCreation_Txt_DateOfEvent;
	String GenClaimCreation_Txt_TimeOfEvent;
	String GenClaimCreation_Txt_TimeOfClaim;
	String GenClaimCreation_Txt_DateOfClaim;
	String GenClaimCreation_Txt_ClaimStatus;
	String GenClaimCreation_Txt_Department;
	String GenClaimCreation_Txt_ClaimType;
	String GenClaimCreation_Txt_TimeOfEventEdited;
	String GenClaimCreation_Txt_TimeOfEventEdited_Final;
	String StrClaimNumberEdited;
	//Local Variable Declaration
		
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_002_GC_Corporate General Claim Creation", "Successful Corporate General Claim Creation On Providing Mandatory Data, Existence of Necessary Tabs Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Edit Of Created Claim Is Validated");
	parentlogger.assignAuthor("Kumud Naithani");
	
	StrScreenShotTCName = "Smoke_TC_002_GC";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	StrScreenShotTCName = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed 
	
	GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
	GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
	GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
	GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
	GenClaimCreation_Txt_TimeOfEventEdited = RMA_GenericUsages_Utility.RMA_PastFutureTimeInfo_Utility(-10);
	GenClaimCreation_Txt_TimeOfEventEdited_Final = RMA_GenericUsages_Utility.RMA_TimeConversion_Utility(GenClaimCreation_Txt_TimeOfEventEdited, "hh:mm");
	//Local Variable Initialization  Completed
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_004", 1, 0); //Claim Type Is Fetched From DataSheet RMA_TC_004
	GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_004", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_TC_004
	GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_004", 1,2 ); //Department Is Fetched From DataSheet RMA_TC_004
	//Fetch Of Data From Excel WorkBook Completed
	
	
	RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
	//===========================================================General Claim Creation Is Started Here=======================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation", "RMA_GenClaimCorpCreation",0)+" To Create GeneralClaim");
	testcall1 = true;
	StrClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim,GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department,logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New General Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
	parentlogger.appendChild(logger);
	DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	// New General Claim Is Successfully Created
	//===========================================================General Claim Creation Is Completed Here=====================================================================================================================================================================================================================================================
	
	//===========================================================Verification That All Tabs Are Present For General Claim Screen Started Here==============================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On General Claim Creation Page",logval);	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EventDetail(driver), "Event Detail Tab On General Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_LocationAddress_1(driver), "Location Address_1 Text Box On Event Detail Tab Of General Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "LocAddr1_"),logval);		
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_LossInformation(driver), "Loss Information Tab On General Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ReportNumber(driver), "Reporter Number Text Box On Loss Information Tab Of General Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "ReportNumber_"),logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Supplementals(driver), "Supplementals Tab On General Claim Creation Page",logval);
	//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_SupplementalPermanentBodyPartLoss(driver), "Permanent Body Part Loss Text Box On Supplementals Tab Of General Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Loss_"),logval);		
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Acord(driver), "Acord Tab On General Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_AccordRemarks(driver), "Remarks Text Box On Accord Tab Of General Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Remarks_"),logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On General Claim Creation Page",logval);
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval);
	//===========================================================Verification That All Tabs Are Present For General Claim Screen Completed Here==============================================================================================================================================================================================
	
	//==========================================================Edit Of Created Claim Is Started Here==============================================================================================================================================================================================
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On General Claim Creation Page", GenClaimCreation_Txt_TimeOfEventEdited,logval);		
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval);
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver)));
	GenClaimCreation_Txt_TimeOfEventEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver).getAttribute("value");
	if (GenClaimCreation_Txt_TimeOfEventEdited.length()== 7)
	{
		GenClaimCreation_Txt_TimeOfEventEdited = "0"+GenClaimCreation_Txt_TimeOfEventEdited;
	}
	RMA_Verification_Utility.RMA_PartialTextVerification(GenClaimCreation_Txt_TimeOfEventEdited_Final,GenClaimCreation_Txt_TimeOfEventEdited , "Claim Number After Edit",logval);
	StrClaimNumberEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
	RMA_Verification_Utility.RMA_TextCompare(StrClaimNumberEdited, StrClaimNumber, "Claim Number After Edit",logval);
	parentlogger.log(LogStatus.PASS, "Claim Edit Is Successful And Claim Number Value Remains Same As Before Edit That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumberEdited, 2));
	//==========================================================Edit Of Created Claim Is Completed Here==============================================================================================================================================================================================*/

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
	 if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_GeneralClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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
		 driver.switchTo().parentFrame();		 //In Claim Creation Test Cases In The Try Block Have Kept The Logic To Switch To Parent Frame As To Facilitate Code Stability
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}
