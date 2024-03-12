package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
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
//TestCaseID     : RMA_Smoke_TC_002_WC
//Description    : RMA_Smoke_TC_002_WC_Verify That Workers Comp Claim Is Created Successfully
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-06-27-2016 
//Modified By	 : 0.0-RenuVerma-01-02-2017 Changes done for Link Navigation
//Modified By    : 0.1-KumudNaithani-01-02-2017: Added Code To Create Workers Compensation Claim In Test Case Only 
//				 : So That It Can Be Called Directly To Create Workers Compensation, Changed Return Type To String
//========================================================================================================================

public class RMA_Smoke_TC_002_WC extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public String RMA_Smoke_TC_002_WC_Test() throws Exception,Error {
	try{
		logger = reports.startTest("<span id='RMASmokeTC002WC'>RMA_Smoke_TC_002_WC_WorkersCompensation Claim Creation</span>", "Verify That Workers Comp Claim Is Created Successfully");
		logger.assignAuthor("Imteyaz Ahmad");

		String RMAApp_WorkersCompClaim_Txt_ClaimType;
		String RMAApp_WorkersCompClaim_Txt_Department;
		String StrPrimaryWindowHandle;
		String RMAApp_WorkersCompClaim_Txt_Jurisdiction;
		int RMAApp_WorkersCompClaim_Txt_DateOfEvent;
		int RMAApp_WorkersCompClaim_Txt_TimeOfEvent;
		int RMAApp_WorkersCompClaim_Txt_DateOfClaim;
		int RMAApp_WorkersCompClaim_Txt_TimeOfClaim;
		int RMAApp_WorkersCompClaim_Txt_EmployeeNo;
		//Local Variable Declaration Completed Here

		StrScreenShotTCName = "RMA_Smoke_TC_002_WC";
		//Variable Initialization Completed Here
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
		RMAApp_WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 1);//Employee Number Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_WC
		RMAApp_WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_WC", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_WC

		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
		//===========================================================Creation Of Workers Compensation Claim Is Started Here================================================*/
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-Workers’Comp.", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Workers");	
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DateOfEvent(driver), "Date Of Event TextBox On Workers Comp Page", String.format("%08d",RMAApp_WorkersCompClaim_Txt_DateOfEvent), logval1);
		Thread.sleep(2000);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_EmployeeNumber(driver), "Employee No TextBox On Workers Comp Page", String.valueOf(RMAApp_WorkersCompClaim_Txt_EmployeeNo), logval1);
		Thread.sleep(7000);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Workers Comp Page", String.valueOf(RMAApp_WorkersCompClaim_Txt_TimeOfEvent), logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimType(driver), "Claim Type TextBox On Workers Comp Page",RMAApp_WorkersCompClaim_Txt_ClaimType, logval1);
		Thread.sleep(4000);		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Workers Comp Page", String.format("%08d", RMAApp_WorkersCompClaim_Txt_DateOfClaim), logval1);
		Thread.sleep(2000);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_DepartmentID(driver), "Department TextBox On Workers Comp Page",RMAApp_WorkersCompClaim_Txt_Department, logval1);
		Thread.sleep(4000);			
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Workers Comp Page",String.valueOf(RMAApp_WorkersCompClaim_Txt_TimeOfClaim), logval1);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_Jurisdiction(driver), "Jurisdiction TextBox On Workers Comp Page", RMAApp_WorkersCompClaim_Txt_Jurisdiction, logval1);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Btn_ClaimStatus(driver), "ClaimStatus Button On Workers Comp Page", logval1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval1);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Workers");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Workers", false, "NA", "Workers Comp Page", logval1);
		StrClaimNumber_002 = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber_002
		logger.log(LogStatus.INFO, "Workers Comp Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrClaimNumber_002, 2));
		logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Workers Comp Saved Successfully", "Workers Comp Claim Creation")));
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Workers"), "Expand Image Corresponding To Workers Comp Link On Left Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval1, "Wait Is Added As Expand Image Corresponding To Workers Comp Link On Left Navigation Tree Is Clicked ");
		/*===========================================================Creation Of Workers Compensation Claim Is Completed Here================================================*/

		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Link Tab On Workers Comp Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employee Info"), "Employee Info Link Tab On Workers Comp Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employment Info"), "Employment Info Link Tab On Workers Comp Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employee Event Detail"), "Employee Event Detail Link Tab On Workers Comp Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Loss Information"), "Loss Information Link Tab On Workers Comp Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On Workers Comp Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Claim Info"), "Claim Info Data Link Tab On Workers Comp Claim Page", logval1);
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

