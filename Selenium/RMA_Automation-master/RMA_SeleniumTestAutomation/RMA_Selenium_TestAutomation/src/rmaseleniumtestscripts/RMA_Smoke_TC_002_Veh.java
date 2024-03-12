package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_VehicleAccident;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_002_Veh
//Description    : RMA_Smoke_TC_002_Veh_Successful Creation Of Vehicle Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-06-27-2016 
//Modified By	 : 0.0-RenuVerma-01-02-2017 Changes done for Link Navigation
//Modified By    : 0.1-KumudNaithani-01-02-2017: Added Code To Create Vehicle Accident Claim In Test Case Only 
//				 : So That It Can Be Called Directly To Create Vehicle Accident, Changed Return Type To String
//========================================================================================================================

public class RMA_Smoke_TC_002_Veh extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public String RMA_Smoke_TC_002_Veh_Test() throws Exception,Error {

	try{
		logger = reports.startTest("<span id='RMASmokeTC002Veh'>RMA_Smoke_TC_002_Veh_Vehicle Accident Claim Creation</span>", "Verify That Vehicle Accident Claim Is Created Successfully");
		logger.assignAuthor("Imteyaz Ahmad");

		String RMAApp_VehAccClaim_Txt_ClaimType;
		String RMAApp_VehAccClaim_Txt_Department;
		String StrPrimaryWindowHandle;
		int RMAApp_VehAccClaim_Txt_DateOfEvent;
		int RMAApp_VehAccClaim_Txt_TimeOfEvent;
		int RMAApp_VehAccClaim_Txt_DateOfClaim;
		int RMAApp_VehAccClaim_Txt_TimeOfClaim;
		//Local Variable Declaration Completed Here

		StrScreenShotTCName = "RMA_Smoke_TC_002_Veh";
		//Local Variable Declaration Completed

		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
		RMAApp_VehAccClaim_Txt_ClaimType   = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Veh", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_Veh
		RMAApp_VehAccClaim_Txt_Department  = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_Veh", 1, 1); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_Veh
		RMAApp_VehAccClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Veh", 1, 2);//DateOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_Veh
		RMAApp_VehAccClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Veh", 1, 3);//TimeOfEvent Is Fetched From DataSheet RMA_Smoke_TC_002_Veh
		RMAApp_VehAccClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Veh", 1, 4);//DateOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_Veh
		RMAApp_VehAccClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_002_Veh", 1, 5);//TimeOfClaim Is Fetched From DataSheet RMA_Smoke_TC_002_Veh
		
		//===============================================Creation Of Vehicle Accident Claim Is Started=====================================================================================================
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval1); //Web Page Is Refreshed
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Document-VehicleAccident", logval1);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle Accident");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimType(driver), "Claim Type TextBox On Vehicle Accident Page", RMAApp_VehAccClaim_Txt_ClaimType, logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Claim Type Value Is Set In Claim Type TextBox On Vehicle Accident Page");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_Dept_Id(driver), "Department TextBox On Vehicle Accident Page",RMAApp_VehAccClaim_Txt_Department, logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval1, "Wait Is Added As Claim Type Value Is Set In Department ID TextBox On Vehicle Accident Page");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfEvent(driver), "Date Of Event TextBox On Vehicle Accident Page", String.format("%08d",RMAApp_VehAccClaim_Txt_DateOfEvent), logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_TimeOfEvent(driver), "Time Of Event TextBox On Vehicle Accident Page", String.valueOf(RMAApp_VehAccClaim_Txt_TimeOfEvent), logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_DateOfClaim(driver), "Date Of Claim TextBox On Vehicle Accident Page", String.format("%08d",RMAApp_VehAccClaim_Txt_DateOfClaim), logval1);
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_TimeOfClaim(driver), "Time Of Claim TextBox On Vehicle Accident Page", String.valueOf(RMAApp_VehAccClaim_Txt_TimeOfClaim), logval1);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Btn_ClaimStatusSrchBtn(driver), "ClaimStatus Button On Vehicle Accident Page", logval1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); //Switch To The Window Which Contains Claim Status Links Is Done
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Open", "Open Link On Code Selection Window",logval1);
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle Accident");
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Vehicle Accident", false, "NA", "Vehicle Accident Page", logval1);
		StrClaimNumber_002 = RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimNum(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber_002
		logger.log(LogStatus.INFO, "Vehicle Accident Claim Is Created Successfully And Claim Number Is :" +" " +color.RMA_ChangeColor_Utility(StrClaimNumber_002, 2));
		driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Vehicle"), "Expand Image Corresponding To Vehicle Accident Claim On Left Hand Navigation Tree", logval1);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval1, "Wait Is Added As Expand Image Corresponding To Vehicle Accident Claim Link On Left Hand Navigation Tree Is Clicked ");
		// New Vehicle Accident Claim Is Created

		//===============================================Creation Of Vehicle Accident Claim Is Completed==========================================================================================================================================	
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Link Tab On Vehicle Accident Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Vehicle Accident"), "Vehicle Accident Link Tab On Vehicle Accident Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On Vehicle Accident Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "ACORD"), "ACORD Link Tab On Vehicle Accident Claim Page", logval1);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Claim Info"), "Claim Info Data Link Tab On Vehicle Accident Claim Page", logval1);
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

