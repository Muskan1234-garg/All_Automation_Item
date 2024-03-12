package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_NonOccupational;
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
//TestCaseID     : RMA_Smoke_TC_064
//Description    : Successful Creation Of  NonOccupational Claim By Entering All Mandatory Fields Is Validated.
//Depends On TC  : RMA_Smoke_TC_063(Event Creation)
//Revision       : 0.0 - RenuVerma-10-14-2016
//=================================================================================================

public class RMA_Smoke_TC_064 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_064_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_064_Create NonOccupational Claim", "Successful Creation Of  NonOccupational Claim By Entering All Mandatory Fields Is Validated. ");
			parentlogger.assignAuthor("Renu Verma");

			String NonOccClaim_Txt_ClaimType;
			String NonOccClaim_Txt_TimeOfEvent;
			String NonOccClaim_Txt_DateOfClaim;
			String NonOccClaim_Txt_DateOfEvent;
			String NonOccClaim_Txt_Department;
			String NonOccClaim_Txt_TimeOfClaim;
			int NonOccClaim_Txt_EmployeeNo;
			String NonOccClaim_Txt_Jurisdiction;
			String NonOccClaim_Txt_DisStartDate;
			String StrPlanname;
			String StrPlanStatus;
			String StrPlanEffectiveDate;
			String StrPlanExpirationDate;
			String StrPlanInsured;
			String StrNonOccupationalClaimNumber;
			String StrPrimaryWindowHandle;
			String StrEventNaumberActual;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_064";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2= "NotInitialized";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			NonOccClaim_Txt_ClaimType   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_064", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_064
			NonOccClaim_Txt_EmployeeNo  =   ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_064", 1, 1); // Employee Is Fetched From DataSheet RMA_TC_064
			NonOccClaim_Txt_Jurisdiction =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_064", 1, 2); // Jurisdiction Is Fetched From DataSheet RMA_TC_064
			StrPlanInsured= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_064", 5, 0); // Insured Is Fetched From DataSheet RMA_TC_064
			StrPlanStatus= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_064", 5, 1); // Status Is Fetched From DataSheet RMA_TC_064
		
			NonOccClaim_Txt_DateOfClaim =RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			NonOccClaim_Txt_DisStartDate = NonOccClaim_Txt_DateOfClaim;
			NonOccClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();
			NonOccClaim_Txt_TimeOfClaim=NonOccClaim_Txt_TimeOfEvent;
			NonOccClaim_Txt_DateOfEvent=NonOccClaim_Txt_DateOfClaim;
			StrPlanEffectiveDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 0, -8);
			StrPlanExpirationDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(5, 0, 0);
							
			/*=====================================Creation Of Valid Plan From Plan Management Screen Is Started Here================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_MaintenancePlan_AddEdit_Utility",0)+" Is Called To Create The Plan");
			testcall1 = true;
			StrPlanname=RMA_Functionality_Utility.RMA_MaintenancePlan_AddEdit_Utility("Create", StrPlanStatus, StrPlanEffectiveDate, StrPlanExpirationDate, StrPlanInsured, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Maintenance -> Plan Management Page", logval);
			/*=====================================Creation Of Valid Plan From Plan Management Screen Is Ended Here================================================*/
			
			//===============================================Search Of The Event Created In Sm0ke-2_TC_063 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Event", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchEvent_Txt_EventNumber(driver)," Search-->Event Criteria Page","Event Number Text Box",RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063,"num",2, logval);
			StrEventNaumberActual = RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EvntNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063, StrEventNaumberActual , "Event Number", logval);
			//===============================================Search Of The Event Created In Sm0ke-2_TC_063 Is Completed=====================================================================================================
			
			/*=====================================Creation Of NonOccupation Claim Is Started Here================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063),  " Event Link On Left Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Non-occupational"), "From Event Context Menu 'Non-occupational' Link Under Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait For Clicked Of 'Non-Occupational' Link Under Left Navigation Tree ");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Non-occupational");
			NonOccClaim_Txt_DateOfEvent=RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DateOfEvent(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_063.StrEventDate_Smoke_TC_063, NonOccClaim_Txt_DateOfEvent, "Date of Event", logval);
			NonOccClaim_Txt_Department=RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DepartmentID(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_063.StrEventDepartment_Smoke_TC_063, NonOccClaim_Txt_Department, "Department", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_ClaimType(driver), "Claim Type TextBox On NonOccupational Claim Page", NonOccClaim_Txt_ClaimType, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_EmployeeNumber(driver), "Employee No TextBox On NonOccupational Claim Page", String.valueOf(NonOccClaim_Txt_EmployeeNo), logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_Jurisdiction(driver), "Jurisdiction TextBox On NonOccupational Claim Page", NonOccClaim_Txt_Jurisdiction, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_TimeOfEvent(driver), "Time Of Event TextBox On NonOccupational Claim Page", NonOccClaim_Txt_TimeOfEvent, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DateOfClaim(driver), "Date Of Claim TextBox On NonOccupational Claim Page", NonOccClaim_Txt_DateOfClaim, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On NonOccupational Claim Page", NonOccClaim_Txt_TimeOfClaim, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DateOfEvent(driver), "Date Of Event TextBox On NonOccupational Claim Page", NonOccClaim_Txt_DateOfEvent, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_DisabilityStartDate(driver), "Disability Start Date TextBox On NonOccupational Claim Page", NonOccClaim_Txt_DisStartDate, logval);
			
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_NonOccupational.RMAApp_NonOccupational_Btn_ClaimStatus(driver), "ClaimStatus Button On NonOccupational Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Non-occupational");

			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_NonOccupational.RMAApp_NonOccupational_Btn_PlanName(driver), "PlanName Button On NonOccupational Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Link Is Done
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrPlanname, "Plan Lookup Window", logval);				
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Non-occupational");
			
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Info"), "Event Info Tab Link On NonOccupational Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employee Info"), "Employee Info Tab Link On NonOccupational Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employment Info"), "Employment Info Tab Link On NonOccupational Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Medical Info"), "Medical Info Tab Link On NonOccupational Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Tab Link On NonOccupational Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Claim Info"), "Claim Info Tab Link On NonOccupational Claim Page", logval);
	
			RMA_Functionality_Utility.RMA_GenericSave_Utility("Non-occupational", false, "NA", "NonOccupational Claim Page", logval);
			StrNonOccupationalClaimNumber = RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrWorkersCompClaimNumber
			parentlogger.log(LogStatus.INFO, "NonOccupational Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrNonOccupationalClaimNumber, 2));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "NonOccupational Claim Claim By Entering All Mandatory Fields", StrScreenShotTCName)));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,RMA_Smoke_TC_063.StrEventNumber_Smoke_TC_063),  " Event Link On Left Naviogation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Close All"), "Close All Link On Event Link Left Navigation ", logval);
			/*=====================================Creation Of NonOccupation Claim Is Ended Here================================================*/	
			
			/*=====================================Deleted Plan From Plan Management Screen Is Started Here================================================*/	
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PlanManagement", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Plan Management");			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-> Plan Management Lookup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), StrPlanname, "LINK", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Plan Management");
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Plan "+ " "+ color.RMA_ChangeColor_Utility(StrPlanname, 3));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-> Plan Management", logval);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Plan Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrPlanname, 3));
			/*=====================================Deleted Plan From Plan Management Screen Is Ended Here================================================*/
		
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
				
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintenancePlan_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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

