package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Document_Event;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_VehicleAccident;
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
//TestCaseID     : RMA_Smoke_TC_063
//Description    : Successful Creation Of  Vehicle Accident Claim By Entering All Mandatory Fields Is Validated.
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-13-2016
//=================================================================================================

public class RMA_Smoke_TC_063 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String StrEventNumber_Smoke_TC_063;
	static String StrEventDepartment_Smoke_TC_063;
	static String StrEventDate_Smoke_TC_063;
	
	@Test
	public void RMA_Smoke_TC_063_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_063_Create Vehicle Accident Claim", "Successful Creation Of  Vehicle Accident Claim By Entering All Mandatory Fields Is Validated. ");
			parentlogger.assignAuthor("Renu Verma");
	
			String VehAccClaim_Txt_ClaimType;
			String VehAccClaim_Txt_TimeOfEvent;
			String VehAccClaim_Txt_DateOfClaim;
			String VehAccClaim_Txt_DateOfEvent;
			String VehAccClaim_Txt_Department;
			String VehAccClaim_Txt_AccidentType;
			String VehAccClaim_Txt_AccidentDesc;
			String VehAccClaim_Txt_TimeOfClaim;
			String VehAccClaim_Txt_DateOfFed;
			String VehAccClaim_Txt_DateOfState;
			String StrVehicleAccClaimNum;
			String StrPrimaryWindowHandle;		
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_063";
			testcall1 = false;			
			loggerval1 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			VehAccClaim_Txt_ClaimType   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_063", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_063
			VehAccClaim_Txt_AccidentType  =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_063", 1, 2); // Accident Type Is Fetched From DataSheet RMA_TC_063
			VehAccClaim_Txt_AccidentDesc  =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_063", 1, 3); // Accident Desc  Is Fetched From DataSheet RMA_TC_063
			VehAccClaim_Txt_DateOfClaim =RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			VehAccClaim_Txt_DateOfFed = VehAccClaim_Txt_DateOfClaim;
			VehAccClaim_Txt_DateOfState = VehAccClaim_Txt_DateOfClaim;
			VehAccClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility();
			VehAccClaim_Txt_TimeOfClaim=VehAccClaim_Txt_TimeOfEvent;
			
			/*===================================Creation Of Event Is Started Here================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			parentlogger.log(LogStatus.INFO,"HTML", "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink( "TC003Event Creation","RMA_TC_003",0)+" To Create Event");
			testcall1 = true;
			RMA_TC_003 event1 = new RMA_TC_003();
			StrEventNumber_Smoke_TC_063 = event1.EventCreation();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEventDepartment_Smoke_TC_063=RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DepteId(driver).getAttribute("value");
			StrEventDate_Smoke_TC_063=RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DateOfEvent(driver).getAttribute("value");
			parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrEventNumber_Smoke_TC_063, 2));
			/*=====================================Creation Of Event Is Completed Here================================================*/
			
			/*=====================================Creation Of Vehicle Accident Is Started Here================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,StrEventNumber_Smoke_TC_063),  " Event Link On Left Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Vehicle Accident"), "From Event Context Menu 'Vehicle Accident' Link Under Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait For Clicked Of 'Vehicle' Link Under Left Navigation Tree ");
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			VehAccClaim_Txt_DateOfEvent=RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfEvent(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(StrEventDate_Smoke_TC_063, VehAccClaim_Txt_DateOfEvent, "Date of Event", logval);
			VehAccClaim_Txt_Department=RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_Dept_Id(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(StrEventDepartment_Smoke_TC_063, VehAccClaim_Txt_Department, "Department", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimType(driver), "Claim Type TextBox On Vehicle Accident Page",VehAccClaim_Txt_ClaimType , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Vehicle Accident Page", VehAccClaim_Txt_TimeOfEvent, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Vehicle Accident Page",VehAccClaim_Txt_DateOfClaim, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Vehicle Accident Page", VehAccClaim_Txt_TimeOfClaim, logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Btn_ClaimStatusSrchBtn(driver), "ClaimStatus Button On Vehicle Accident Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Links Is Done
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle Accident");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Vehicle Accident"), "Vehicle Accident Tab Link On Vehicle Accident Claim Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_AccidentType(driver), "Accident Type TextBox On Vehicle Accident Page",VehAccClaim_Txt_AccidentType  , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfFederal(driver), "Date of Federal DOT Report TextBox On Vehicle Accident Page",VehAccClaim_Txt_DateOfFed, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_AccidentDecs(driver), "Accident Desc TextBox On Vehicle Accident Page",VehAccClaim_Txt_AccidentDesc  , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfState(driver), "Date of State Spill Report TextBox On Vehicle Accident Page",VehAccClaim_Txt_DateOfState, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("Vehicle Accident", false, "NA", "Vehicle Accident Page", logval);
			StrVehicleAccClaimNum = RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimNum(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrVehicleAccClaimNum
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Tab Link On Vehicle Accident Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Tab Link On Vehicle Accident Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "ACORD"), "ACORD Tab Link On Vehicle Accident Claim Page", logval);
			parentlogger.log(LogStatus.INFO, "Vehicle Accident Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrVehicleAccClaimNum, 2));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Accident Claim By Entering All Mandatory Fields", StrScreenShotTCName)));
			/*=====================================Creation Of Vehicle Accident Is Ended Here================================================*/		
					
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Testcase RMA_TC_003_EventCreation And Hence The Test Case Is A Fail");
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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

