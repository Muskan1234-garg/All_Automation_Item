package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_066
//Description    : Create, Edit And Delete Of Vehicle From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-11-12-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_066 extends RMA_TC_BaseTest {
	
	public static String StrVehicleID;
	@Test
	public void RMA_Smoke_TC_066_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_066_Create, Edit And Delete Of Vehicle From Maintenance Screen", " Create, Edit And Delete Of Vehicle From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_066";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
		
			//===========================================================New Vehicle Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Vehicle From Maintenance Screen");
			testcall1 = true;
			StrVehicleID=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Vehicle", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Vehicle Is Created With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrVehicleID, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Vehicle From Maintenance Screen Is Successfully Created
			//============================================================New Vehicle Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_PurchaseDate(driver), "PurchaseDate TextBox On Maintenance-->Vehicle  Page", RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-1,-1,-1,"MM/dd/yyyy"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_VehicleYear(driver), "Vehicle Year TextBox On Maintenance-->Vehicle  Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1900, 2010)), logval);	
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_State(driver), "State TextBox On Maintenance-->Vehicle  Page", "AB", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Chk_LeaseFlag(driver), "check", "Lease CheckBox", "Maintenance-->Vehicle  Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseNumber(driver), "LeaseNumber TextBox On Maintenance-->Vehicle  Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 5555)), logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseTerm(driver), "LeaseTerm TextBox On Maintenance-->Vehicle  Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11, 99)), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseExpirationDate(driver), "LeaseExpirationDate TextBox On Maintenance-->Vehicle  Page",  RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,+3,+3,"MM/dd/yyyy"), logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseAmount(driver), "LeaseAmount TextBox On Maintenance-->Vehicle  Page", "2000", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_RenewalDate(driver), "RenewalDate TextBox On Maintenance-->Vehicle  Page", RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,+2,+2,"MM/dd/yyyy"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_OriginalCost(driver), "OriginalCost TextBox On Maintenance-->Vehicle  Page", "20000", logval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Tab_VehicleInfo(driver), "Vehicle Info Tab On Vehicle Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Tab_VehicleDetail(driver), "Vehicle Details Tab On Vehicle Creation Page",logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_Weight(driver), "Weight Text Box On Vehicle Info Tab Of Vehicle Creation Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(10, 99)),logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LastServiceDate(driver), "LastServiceDate TextBox On Maintenance-->Vehicle  Page", RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,-1,1,"MM/dd/yyyy"), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_DisposalDate(driver), "DisposalDate TextBox On Maintenance-->Vehicle  Page", RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,+4,+4,"MM/dd/yyyy"), logval);
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Tab_Supplementals(driver), "Supplementals Tab On Vehicle Creation Page",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Tab_VehicleInfo(driver), "Vehicle Info Tab On Vehicle Creation Page",logval);	
			//===========================================================Verification That All Tabs Are Present For Entity Screen Started Here=======================================================================================================================================================================================================================================================
			
			//==========================================================Edit Of Created Vehicle Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintEditEntity", "RMA_MainenanceEditEntity_Utility",0)+" To Edit An Already Created Vehicle From Maintenance Screen");
			testcall2 = true;
			StrVehicleID = RMA_Maintenance_Functionality_Utility.RMA_MainenanceEditEntity_Utility("Vehicle", "NA" ,CurrentFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of Following Vehicle Is Successful, Edited Vehicle ID  Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(StrVehicleID, 2));
			// New Vehicle From Maintenance Screen Is Successfully Edited
			//==========================================================Edit Of Created Vehicle Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created Vehicle Is Started Here=========================================================================================================================================================================================================================================================================================
			//RMA_Functionality_Utility.RMA_GenericDelete_Utility("Vehicle Creation Page", false, logval);
			//RMA_Functionality_Utility.RMA_GenericDelete_Utility("Vehicle Creation Page", true, logval);
			//==========================================================Delete Of Created Vehicle Is Completed Here==========================================================================================================================================================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceEditEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

