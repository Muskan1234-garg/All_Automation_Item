package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
// RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_004
//Description    : Successful General Claim Creation Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-10-22-2015 
//Modified By	 : 0.1 - KumudNaithani-08-03-2016
//				 : Modified To Include Change Related To Calling RMA_MenuOptionClick_Utility Function Instead Of Directly Calling The Numeric X-Path Of The Function And Removing Unnecessary Static Waits And Replacing Existing Static Waits With Dynamic Waits If Possible And Dynamic Frame Switching
//=================================================================================================
public class RMA_TC_004 extends rmaseleniumtestscripts.RMA_TC_BaseTest
{
static String ExceptionRecorded;
static String []ErrorMessage;
static String FinalErrorMessage;
static String ErrorMessageType;
static String StrEventNumber_RMA_TC_004;
static String StrClaimNumber_RMA_TC_004;
static String StrScreenShotTCName;

@Test 
public String GeneralClaimCreation() throws Exception, Error
{
	try {
		logger = reports.startTest("<span id='TC004GeneralClaim'>TC_004_General Claim Creation</span>", "A New General Claim Is Created");
		String RMAApp_GeneralClaimCreation_Txt_Claimype;
		String RMAApp_GeneralClaimCreation_Txt_DepteId;
		int RMAApp_GeneralClaimCreation_Txt_TimeOfEvent;
		int RMAApp_GeneralClaimCreation_Txt_DateOfClaim;
		int RMAApp_GeneralClaimCreation_Txt_TimeOfClaim;
		int RMAApp_GeneralClaimCreation_Txt_DateOfEvent;
		String StrPrimaryWindowHandle;
		//Local Variable Declaration
		
		//String EventNumber = RMA_TC_003.StrEventNumber_RMA_TC_003;
		//logger.log(LogStatus.INFO, "Event Number Generated In Test Case RMA_TC_003 Is::" + " " + EventNumber);
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_GeneralClaimCreation_Txt_Claimype = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_004", 1, 0); //ClaimType Is Fetched From DataSheet RMA_TC_004
		RMAApp_GeneralClaimCreation_Txt_DepteId = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_004", 1, 6); //Department Id Is Fetched From DataSheet RMA_TC_004
		RMAApp_GeneralClaimCreation_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_004", 1, 2); //TimeOfEvent Is Fetched From DataSheet RMA_TC_004
		RMAApp_GeneralClaimCreation_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_004", 1, 4); //DateOfReporting Is Fetched From DataSheet RMA_TC_004
		RMAApp_GeneralClaimCreation_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_004", 1, 5); //TimeOfReporting Is Fetched From DataSheet RMA_TC_004
		RMAApp_GeneralClaimCreation_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_004", 1, 1); //DateOfEvent Is Fetched From DataSheer RMA_TC_004		
		
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-GeneralClaim", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc");
			
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Img_ClaimStatusSrchBtn(driver), "Claim Status Search Button On RMA Application General Claim Creation Page",logval1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Lnk_Open(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Lnk_Open(driver), "Open Link On RMA Application's General Claim Status Selection Page",logval1);
		globalWait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimgc");
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfEvent(driver), "TimeOfEvent TextBox On General Claim Creation Page", String.valueOf(RMAApp_GeneralClaimCreation_Txt_TimeOfEvent),logval1);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfClaim(driver), "DateOfClaim TextBox On GeneralClaim Creation Page", String.valueOf(RMAApp_GeneralClaimCreation_Txt_DateOfClaim),logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_Dept_Id(driver), "DeptId TextBox On General Claim Creation Page", RMAApp_GeneralClaimCreation_Txt_DepteId,logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(4, logval1, "Wait Is Added As Payment Parameter Set Up Page Is Saved");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_TimeOfClaim(driver), "TimeOfClaim TextBox On GeneralClaim Creation Page", String.valueOf(RMAApp_GeneralClaimCreation_Txt_TimeOfClaim),logval1);	
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_DateOfEvent(driver), "DateOfEvent TextBox On General Claim Creation Page", String.valueOf(RMAApp_GeneralClaimCreation_Txt_DateOfEvent),logval1);	
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimType(driver), "Claim Type TextBox On General Claim Creation Page", RMAApp_GeneralClaimCreation_Txt_Claimype,logval1);
		
		RMA_Functionality_Utility.RMA_GenericSave_Utility("claimgc", false, "NA", "General Claim Creation Page", logval1);
			
		StrEventNumber_RMA_TC_004 = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_EventNumber(driver).getAttribute("value"); //Value Of the Generated Event Number Is Fetched In The Variable StrEventNumber
		StrClaimNumber_RMA_TC_004 = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber
		String StrlogClaimNumber_RMA_TC_004 = color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_004, 2);
		String StrlogEventNumber_RMA_TC_004 = color.RMA_ChangeColor_Utility(StrEventNumber_RMA_TC_004, 2);
		
		logger.log(LogStatus.PASS, "Claim Creation Is Successful And Generated Claim And Event Number Are Respectively" + " " + "::"+ " "+ StrlogClaimNumber_RMA_TC_004 +" " + "And" + " " + StrlogEventNumber_RMA_TC_004);		
				
		RMA_ExcelDataRetrieval_Utility.WriteDataToExcel(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx","RMA_TC_004",10, 0, StrEventNumber_RMA_TC_004);
		logger.log(LogStatus.INFO, "Generated Event Number:" +  " " + StrlogEventNumber_RMA_TC_004 + " "  + "Is Also Written In The Corresponding Excel Data Sheet RMA_TC_004");
		
		RMA_ExcelDataRetrieval_Utility.WriteDataToExcel(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx","RMA_TC_004", 10, 1, StrClaimNumber_RMA_TC_004);
		logger.log(LogStatus.INFO, "Generated Claim Number:" + " " + StrlogClaimNumber_RMA_TC_004 + " " + "Is Also Written In The Corresponding Excel Data Sheet RMA_TC_004");
		
		driver.switchTo().parentFrame(); //A Switch To The Parent Frame That Contains Menu Options And Left Hand Navigation Tree Is Done
		return StrClaimNumber_RMA_TC_004;
		
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
		throw (e);
	}
	}
	
@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{
	try {
		StrScreenShotTCName = "TC_004";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1 );
		}
		reports.endTest(logger);
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	finally
	{
		reports.endTest(logger); 
		reports.flush();
	}
}
}