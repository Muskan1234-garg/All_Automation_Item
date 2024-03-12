package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed
import rmaseleniumPOM.RMA_POM_PropertyClaim;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Document_Event;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_065
//Description    : Successful Creation Of  Property Claim By Entering All Mandatory Fields Is Validated.
//Depends On TC  : RMA_Smoke_TC_063(Event Creation)
//Revision       : 0.0 - RenuVerma-10-14-2016
//=================================================================================================

public class RMA_Smoke_TC_065 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_065_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_065_Create Property Claim", "Successful Creation Of  Property Claim By Entering All Mandatory Fields Is Validated. ");
			parentlogger.assignAuthor("Renu Verma");

			String RMAApp_PropClaim_Txt_ClaimType;
			String RMAApp_PropClaim_Txt_TimeOfEvent;
			String RMAApp_PropClaim_Txt_DateOfClaim;
			String RMAApp_PropClaim_Txt_DateOfEvent;
			String RMAApp_PropClaim_Txt_Department;
			String RMAApp_PropClaim_Txt_TimeOfClaim;
			String RMAApp_PropClaim_Txt_PropertyID;
			String StrPropertyClaimNumber;
			String StrPrimaryWindowHandle;
			String StrEventNumberActual;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_065";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			RMAApp_PropClaim_Txt_ClaimType   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_065", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_065
			RMAApp_PropClaim_Txt_PropertyID  =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_065", 1, 1); // PropertyID Is Fetched From DataSheet RMA_Smoke_TC_065
			RMAApp_PropClaim_Txt_DateOfClaim =RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			RMAApp_PropClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();
			RMAApp_PropClaim_Txt_TimeOfClaim=RMAApp_PropClaim_Txt_TimeOfEvent;
					
			//===============================================Search Of The Event Created In Sm0ke-2_TC_063 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Event", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchEvent_Txt_EventNumber(driver)," Search-->Event Criteria Page","Event Number Text Box",RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063,"num",2, logval);
			StrEventNumberActual = RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EvntNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063, StrEventNumberActual , "Event Number", logval);
			//===============================================Search Of The Event Created In Sm0ke-2_TC_063 Is Completed=====================================================================================================
					
			/*=====================================Creation Of Property Claim Is Started Here================================================*/
			driver.switchTo().parentFrame();	
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063),  " Event Link On Left Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Property Claim"), "From Event Context Menu 'Property Claim' Link Under Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait For Clicked Of 'Property Claim' Link Under Left Navigation Tree ");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");
			RMAApp_PropClaim_Txt_DateOfEvent=RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_DateOfEvent(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_063.StrEventDate_Smoke_TC_063, RMAApp_PropClaim_Txt_DateOfEvent, "Date of Event", logval);
			RMAApp_PropClaim_Txt_Department=RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_Dept_Id(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_063.StrEventDepartment_Smoke_TC_063, RMAApp_PropClaim_Txt_Department, "Department", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimType(driver), "Claim Type TextBox On Property Claim Page", RMAApp_PropClaim_Txt_ClaimType, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Property Claim Page", String.valueOf(RMAApp_PropClaim_Txt_TimeOfEvent), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Property Claim Page", String.valueOf(RMAApp_PropClaim_Txt_DateOfClaim), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Property Claim Page", String.valueOf(RMAApp_PropClaim_Txt_TimeOfClaim), logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Btn_ClaimStatusBtn(driver), "ClaimStatus Button On Property Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Property Info"), "Property Info Tab Link On Property Claim Page", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Btn_PropertyIDButton(driver), "PropertID LookUp Button On Property Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPropertyId_Txt_PropertyID(driver), "Standard Property Search Page", "Property ID Text Box", RMAApp_PropClaim_Txt_PropertyID, RMAApp_PropClaim_Txt_PropertyID, "claimpc", StrPrimaryWindowHandle, logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Tab Link On Property Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "COPE Data"), "COPE Data Tab Link On Property Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Optional COPE Data"), "Optional COPE Data Tab Link On Property Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Tab Link On Property Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Claim Info"), "Claim Info Tab Link On Property Claim Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("claimpc", false, "NA", "Property Claim Page", logval);
			StrPropertyClaimNumber = RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrPropertyClaimNumber
			parentlogger.log(LogStatus.INFO, "Property Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrPropertyClaimNumber, 3));
			parentlogger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Property Claim Saved Successfully", "Property Claim Creation")));
			/*=====================================Creation Of Property Claim Is Ended Here================================================*/	
				
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

