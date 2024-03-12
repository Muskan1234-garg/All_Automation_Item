package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

//RMA Package Import Started
import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_006
//Description    : Create And Edit Vehicle With Lease Fields From Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - JannathHussain- 02-19-2018 
//======================================================================================================================================================================================================================================================================================
public class RMA_Reg_Maint_Vehicle_TC_006 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	@Test
	public void RMA_Maint_Vehicle_TC006_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_TC_006_Create and verify Lease Functionality Of Vehicle From Maintenance Screen", " Create And Edit Vehicle With Lease Fields From Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Jannath Hussain");

			//Global Variables Initialization Started
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_TC_006";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			//Local Variables Declaration Started
			String StrVehicleID;
			String 	Leasetxt;
			String LeaseNum;
			//Local Variables Declaration Completed

			Leasetxt=String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 5555));
			//Initialization Of Local Variables Completed Here
			//===========================================================New Vehicle Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Vehicle From Maintenance Screen");
			testcall1 = true;
			StrVehicleID=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Vehicle", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger); 
			parentlogger.log(LogStatus.INFO, "New Vehicle Is Created With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrVehicleID, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//===========================================================New Vehicle Creation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Verify Lease Functionality Of Vehicle Is Started Here================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Chk_LeaseFlag(driver), "check", "Lease CheckBox", "Maintenance-->Vehicle  Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseNumber(driver), "Lease Number TextBox On Maintenance-->Vehicle  Page", Leasetxt, logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseTerm(driver), "Lease Term TextBox On Maintenance-->Vehicle  Page", String.valueOf(RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(11, 99)), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseExpirationDate(driver), "Lease Expiration Date TextBox On Maintenance-->Vehicle  Page",  RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(1,+3,+3,"MM/dd/yyyy"), logval);	
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseAmount(driver), "Lease Amount TextBox On Maintenance-->Vehicle  Page", "2000", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_txt_LeaseCompany(driver), "Lease company Look Up Image Button On Vehicle page","City of Oak Hills",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("City of Oak Hills", "Lease company Look Up Image Button On Vehicle page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added To Select Lease Company From Quick Lookup And Click On Save Button From Vehicle");
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Maintenance-->Vehicle Page", logval);	
			LeaseNum =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LeaseNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(Leasetxt, LeaseNum, "Vehicle Lease Number", logval);
			if (logval == 0)
			{
				parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Edited Successfully", "Successful Vehicle Edit With Vehicle Lease Fields For Vehicle ID"+ " "+ StrVehicleID)));
			}else{	
				logger.log(LogStatus.INFO, logger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Vehicle Edited Successfully", "Successful Vehicle Edit With Vehicle Lease Fields For Vehicle ID"+ " "+ StrVehicleID)));
			}
			//===========================================================Verify Lease Functionality Of Vehicle Is Completed Here================================================================================================================================================================================================================================================================
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
