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
//TestCaseID     : RMA_Smoke_TC_002_VC
//Description    : Successful Corporate Vehicle Claim Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Edit Of Created Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-05-31-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_002_VC extends RMA_TC_BaseTest {

@Test
public void RMA_Smoke_TC_002_VC_Test() throws Exception,Error {
	
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_002_VC_Corporate Vehicle Claim Creation", "Successful Corporate Vehicle Claim Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Edit Of Created Claim Is Validated");
	parentlogger.assignAuthor("Renu Verma");
	
	String VehicleClaim_Txt_ClaimType;
	String VehicleClaim_Txt_DateOfEvent;
	String VehicleClaim_Txt_TimeOfEvent;
	String VehicleClaim_Txt_DateOfClaim;
	String VehicleClaim_Txt_TimeOfClaim;
	String VehicleClaim_Txt_TimeOfEventEdited;
	String VehicleClaim_Txt_TimeOfEventEdited_Final;
	String StrClaimNumberEdited;
	String VehicleClaim_Txt_Department;
	//Local Variable Declaration Completed Here

	StrScreenShotTCName = "RMA_Smoke_TC_002_VC";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed 
	
	VehicleClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
	VehicleClaim_Txt_DateOfClaim = VehicleClaim_Txt_DateOfEvent;
	VehicleClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
	VehicleClaim_Txt_TimeOfClaim=VehicleClaim_Txt_TimeOfEvent;
	VehicleClaim_Txt_TimeOfEventEdited = RMA_GenericUsages_Utility.RMA_PastFutureTimeInfo_Utility(-10);
	VehicleClaim_Txt_TimeOfEventEdited_Final = RMA_GenericUsages_Utility.RMA_TimeConversion_Utility(VehicleClaim_Txt_TimeOfEventEdited, "hh:mm");
	//Variable Initialization Completed Here
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
	VehicleClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_VC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_VC
	VehicleClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_VC", 1, 1); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_VC
	//Fetch Of Data From Excel WorkBook Completed

	RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
	//===========================================================Switch To The Parent Frame To Click On Vehicle Claim Menu Option Is Started Here===============================================================================================================================================================================================
	if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(DefaultFrameID)|| RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().contains("claimwc"))
	{
		driver.switchTo().parentFrame();// In Case The Application Is Still Inside Claim Frame Or Any Other Frame (Can Be Added By Or Condition) A Switch To The Parent Frame Is Done To Click Menu Options
	}
	//===========================================================Switch To The Parent Frame To Click On Vehicle Claim Menu Option Is Started Here===============================================================================================================================================================================================
	//===========================================================Vehicle Compensation Claim Creation Is Started Here===============================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("VehicleCorp", "RMA_VehicleCorpClaimCreation",0)+" To Create New Vehicle Compensation Claim");
	testcall1 = true;
	StrClaimNumber = RMA_Functionality_Utility.RMA_VehicleCorpClaimCreation( VehicleClaim_Txt_ClaimType, "Open", VehicleClaim_Txt_DateOfEvent,  VehicleClaim_Txt_TimeOfEvent,  VehicleClaim_Txt_DateOfClaim,  VehicleClaim_Txt_TimeOfClaim, VehicleClaim_Txt_Department, logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Vehicle Claim Is Created With Vehicle Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
	parentlogger.appendChild(logger);
	DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	// New Vehicle Compensation Claim Is Successfully Created
	//===========================================================Vehicle Compensation Claim Creation Is Completed Here==============================================================================================================================================================================================
	
	//===========================================================Verification That All Tabs Are Present For Vehicle Compensation Claim Started Here==============================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_EventDetail(driver), "Event Detail Tab On Vehicle Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ZipCode(driver), "Zip Code Text Box On Event Detail Tab Of Vehicle Claim Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111, 999999)),logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_VehicleAccident(driver), "Vehicle Accident  Tab On Vehicle Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DOTReport(driver), "DOTReport Text Box On Vehicle Accident Tab Of Vehicle Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "DOTReport_"),logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Supplementals(driver), "Supplementals Tab On Vehicle Claim Creation Page",logval);
	//RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_SupplementalPermanentBodyPartLoss(driver), "Permanent Body Part Loss Text Box On Supplementals Tab Of Vehicle Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Loss_"),logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_Acord(driver), "Acord Tab On Vehicle Claim Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_AccordRemarks(driver), "Remarks Text Box On Accord Tab Of Vehicle Claim Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "Remarks_"),logval);
	
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Tab_ClaimInfo(driver), "Claim Info Tab On Vehicle Claim Creation Page",logval);
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimva", false, "NA", "Vehicle Claim Page", logval);
	//===========================================================Verification That All Tabs Are Present For Vehicle Compensation Claim Completed Here==============================================================================================================================================================================================
	
	//==========================================================Edit Of Created Vehicle Compensation Claim Is Started Here==============================================================================================================================================================================================
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On Vehicle Claim Creation Page", VehicleClaim_Txt_TimeOfEventEdited,logval);		
	RMA_Functionality_Utility.RMA_GenericSave_Utility("claimva", false, "NA", "Vehicle Claim Page", logval);
	DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfEvent(driver)));
	VehicleClaim_Txt_TimeOfEventEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_TimeOfEvent(driver).getAttribute("value");
	if (VehicleClaim_Txt_TimeOfEventEdited.length()== 7)
	{
		VehicleClaim_Txt_TimeOfEventEdited = "0"+VehicleClaim_Txt_TimeOfEventEdited;
	}
	RMA_Verification_Utility.RMA_PartialTextVerification(VehicleClaim_Txt_TimeOfEventEdited_Final, VehicleClaim_Txt_TimeOfEventEdited, "Claim Number After Edit",logval);
	StrClaimNumberEdited = RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
	RMA_Verification_Utility.RMA_TextCompare(StrClaimNumberEdited, StrClaimNumber, "Claim Number After Edit",logval);
	parentlogger.log(LogStatus.PASS, "Claim Edit Is Successful And Claim Number Value Remains Same As Before Edit That Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumberEdited, 2));
	//==========================================================Edit Of Created Created Vehicle Compensation Claim Is Completed Here==============================================================================================================================================================================================

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
		logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_VehicleCorpClaimCreation" + " " +  "And Hence The Test Case Is A Fail");	
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
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

