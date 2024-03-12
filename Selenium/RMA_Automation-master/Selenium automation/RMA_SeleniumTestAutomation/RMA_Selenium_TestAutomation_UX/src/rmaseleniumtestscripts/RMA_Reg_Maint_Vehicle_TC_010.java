package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_010
//Description    : Verification Of Claim Number And Accident Date From Accident Child Record From Vehicle Is Validated
//Depends On TC  : None
//Revision       : 0.0 - JannathHussain-02-28-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Vehicle_TC_010 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	@Test
	public void RMA_Maint_Vehicle_TC010_Test() throws Exception,Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_TC_010_ Verify Claim Number And Accident Date From Accident Child Menu Of Vehicle Maintenance", "  Check The Functionality Of Accident Child Menu From Vehicle Maintenance And Verify Claim Number And Accident Date Is Validated");
			parentlogger.assignAuthor("Jannath Hussain");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_TC_010";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			String StrVehicleID;
			String VehicleClaim_Txt_ClaimType;
			String VehicleClaim_Txt_DateOfEvent;
			String VehicleClaim_Txt_TimeOfEvent;
			String VehicleClaim_Txt_DateOfClaim;
			String VehicleClaim_Txt_TimeOfClaim;
			String VehicleClaim_Txt_Department;
			//Local Variable Declaration Completed
			
			VehicleClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			VehicleClaim_Txt_DateOfClaim = VehicleClaim_Txt_DateOfEvent;
			VehicleClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			VehicleClaim_Txt_TimeOfClaim=VehicleClaim_Txt_TimeOfEvent;
			//Variable Initialization Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite01_Maint_Vehicle_Module.xlsx"); //Excel WorkBook RMA_Suite01_Maint_Vehicle_Module Is Fetched To Retrieve Data
			VehicleClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_010", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_010
			VehicleClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_010", 1, 1); // Department Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_010
			//Fetch Of Data From Excel WorkBook Completed
			
			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA", "NA", "Navigation To RMA Maintenance Screen", logval);	
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================New Vehicle Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Vehicle From Maintenance Screen");
			testcall1 = true;
			StrVehicleID=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Vehicle", "NA","NA", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added To Get The Validation Message For Invalid Year From Vehicle");
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Vehicle Is Created With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrVehicleID, 2));
			parentlogger.appendChild(logger);
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//===========================================================New Vehicle Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Switch To The Parent Frame To Click On Vehicle Claim Menu Option Is Started Here===============================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAMaintUXWindowHandle, "NA", "NA", "NA", "Navigation To RMA Claims Screen", logval);	
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//===========================================================Switch To The Parent Frame To Click On Vehicle Claim Menu Option Is Completed Here===============================================================================================================================================================================================

			//===========================================================Vehicle Accident Claim Creation Is Started Here===============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("VehicleCorp", "RMA_VehicleCorpClaimCreation",0)+" To Create New Vehicle Accident Claim");
			testcall2 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_VehicleCorpClaimCreation( VehicleClaim_Txt_ClaimType, "Open", VehicleClaim_Txt_DateOfEvent,  VehicleClaim_Txt_TimeOfEvent,  VehicleClaim_Txt_DateOfClaim,  VehicleClaim_Txt_TimeOfClaim, VehicleClaim_Txt_Department, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Vehicle Claim Is Created With Vehicle Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//===========================================================Vehicle Accident Claim Creation Is Completed Here==============================================================================================================================================================================================

			//===========================================================Unit Creation For VA Claim Started Here===============================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("VehicleCorp", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create New Unit For Vehicle Accident Claim");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Unit", StrClaimNumber,StrVehicleID , "",logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added To Get The Validation Message For Invalid Year From Vehicle");
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Vehicle Accident Claim Is Created With Vehicle Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//===========================================================Unit Creation For VA Claim Completed Here===============================================================================================================================================================================================================

			//===========================================================Switch To Maintenance Window Started Here===============================================================================================================================================================================================================
			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame );
			//===========================================================Switch To Maintenance Window Completed Here===============================================================================================================================================================================================================

			//===========================================================Verification Claim Number And Accident Date From Accident Of Vehicle Started Here===============================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Chk_LeaseFlag(driver), "check", "Lease CheckBox", "Maintenance-->Vehicle  Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Maintenance-->Vehicle Page", logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added To Save Vehicle");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Accidents_Lnk_VehicleRightHandTree(driver, StrClaimNumber), "Accident Record",  logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added To Load Accident Data From Vehicle");
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("claimva");
			String ClaimDate = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_DateOfClaim(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(VehicleClaim_Txt_DateOfClaim, ClaimDate, "Vehicle Weight Value", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added To Verify Date Of Claim From Vehicle");
			String Claimnumber = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Txt_ClaimNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrClaimNumber, Claimnumber, "Claim number Value", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added To Verify Claim Number From Vehicle");
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			driver.close();
			//===========================================================Verification Of Claim Number And Accident Date From Accident Of Vehicle Completed Here===============================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_VehicleCorpClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			//	RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			//	driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
