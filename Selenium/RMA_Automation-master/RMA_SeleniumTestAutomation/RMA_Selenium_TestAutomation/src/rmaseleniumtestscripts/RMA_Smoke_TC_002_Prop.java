package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_PropertyClaim;
import rmaseleniumPOM.RMA_POM_Search;
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

//=======================================================================================================================
//TestCaseID     : RMA_Smoke_TC_002_Prop
//Description    : RMA_Smoke_TC_002_Prop_Successful Creation Of Property Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0-ImteyazAhmad-06-27-2016 
//Modified By	 : 0.0-RenuVerma-01-02-2017 Changes done for Link Navigation
//Modified By    : 0.1-KumudNaithani-01-02-2017: Added Code To Create Property Claim In Test Case Only 
//				 : So That It Can Be Called Directly To Create Property Claim, Changed Return Type To String
//========================================================================================================================

public class RMA_Smoke_TC_002_Prop extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public String RMA_Smoke_TC_002_Prop_Test() throws Exception,Error {
	try{
		logger = reports.startTest("<span id='RMASmokeTC002Prop'>RMA_Smoke_TC_002_Prop_Property Claim Creation</span>", "Verify That Property Claim Is Created Successfully");
		logger.assignAuthor("Imteyaz Ahmad");

		String RMAApp_PropertyClaim_Txt_ClaimType;
		String RMAApp_PropertyClaim_Txt_Department;
		String StrPrimaryWindowHandle;
		String RMAApp_PropertyClaim_Txt_PropertyID;
		int RMAApp_PropertyClaim_Txt_DateOfEvent;
		int RMAApp_PropertyClaim_Txt_TimeOfEvent;
		int RMAApp_PropertyClaim_Txt_DateOfClaim;
		int RMAApp_PropertyClaim_Txt_TimeOfClaim;
		//Local Variable Declaration Completed Here

		StrScreenShotTCName = "RMA_Smoke_TC_002_Prop";
		//Local Variable Initialization Completed

		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
		RMAApp_PropertyClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 1); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 2);//DateOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 3);//TimeOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 4);//DateOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 5);//TimeOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_Prop
		RMAApp_PropertyClaim_Txt_PropertyID = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Prop", 1, 6); // PropertyId Is Fetched From DataSheet RMA_Smoke_TC_002_Prop

		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1); //Web Page Is Refreshed
		//===========================================================Creation Of Property Claim Is Started Here================================================*/
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-PropertyClaim", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimType(driver), "Claim Type TextBox On Property Claim Page", RMAApp_PropertyClaim_Txt_ClaimType, logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_Dept_Id(driver), "Department TextBox On Property Claim Page", RMAApp_PropertyClaim_Txt_Department, logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_DateOfEvent(driver), "Date Of Event TextBox On Property Claim Page", String.format("%08d",RMAApp_PropertyClaim_Txt_DateOfEvent), logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Property Claim Page", String.valueOf(RMAApp_PropertyClaim_Txt_TimeOfEvent), logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Property Claim Page", String.format("%08d",RMAApp_PropertyClaim_Txt_DateOfClaim), logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Property Claim Page", String.valueOf(RMAApp_PropertyClaim_Txt_TimeOfClaim), logval1);

		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Btn_ClaimStatusBtn(driver), "ClaimStatus Button On Property Claim Page", logval1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval1);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimpc");

		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Property Info", "Property Claim Page", logval1);	
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Btn_PropertyIDButton(driver), "PropertID LookUp Button On Property Claim Page", logval1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPropertyId_Txt_PropertyID(driver), "Standard Property Search Page", "Property ID Text Box", RMAApp_PropertyClaim_Txt_PropertyID, RMAApp_PropertyClaim_Txt_PropertyID, "claimpc", StrPrimaryWindowHandle, logval1);

		RMA_Functionality_Utility.RMA_GenericSave_Utility("claimpc", false, "NA", "Property Claim Page", logval1);
		StrClaimNumber_002 = RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber_002
		logger.log(LogStatus.INFO, "Property Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrClaimNumber_002, 2));
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Property Claim Saved Successfully", "Property Claim Creation")));
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Property Claim"), "Expand Image Corresponding To Property Claim Link On Left Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval1, "Wait Is Added As Expand Image Corresponding To Property Claim Link On Left Navigation Tree Is Clicked ");

		//===========================================================Creation Of Property Claim Is Completed Here================================================*/
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Link Tab On Property Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Property Info"), "Property Info Link Tab On Property Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "COPE Data"), "COPE Data Link Tab On Property Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Optional COPE Data"), "Optional COPE Data Link Tab On Property Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On Property Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Claim Info"), "Claim Info Data Link Tab On Property Claim Page", logval1);
		return StrClaimNumber_002;
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
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval1);
		}


	} catch (Exception|Error e) {

		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			driver.switchTo().parentFrame();
			reports.endTest(logger);	
			reports.flush();
		}

	}		
}

