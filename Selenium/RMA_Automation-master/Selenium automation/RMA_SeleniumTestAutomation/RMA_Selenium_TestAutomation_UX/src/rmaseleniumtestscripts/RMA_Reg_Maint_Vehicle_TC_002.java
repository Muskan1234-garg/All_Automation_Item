package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_002
//Description    : Revert General Parameter Settings 'AutoNumber Vehicle ID' Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NikitaThani-02-19-2018 
//======================================================================================================================================================================================================================================================================================
public class RMA_Reg_Maint_Vehicle_TC_002 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Vehicle_TC_002_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_TC_002_Revert General Parameter Settings 'Autonumber Vehicle ID(VIN)'", "Revert General Parameter Settings 'Autonumber Vehicle ID(VIN)' Is Validated");
			parentlogger.assignAuthor("Nikita Thani");

			testcall1 = false;	
			loggerval1="NotInitialized";
			testcall2 = false;	
			loggerval2="NotInitialized";
			testcall3 = false;	
			loggerval3="NotInitialized";
			//Global Variables Are Initialized Here

			String vehicleId;
			String RMAUIWindowHandle;
			//Local Variables Declared Here

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(); 
			RMAUIWindowHandle = driver.getWindowHandle();
			//=====================================================Steps To Revert General System Parameter Settings Is Started Here=============================================================         
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AutoNumberVID", "RMA_AutoNumber_VehicleID_Utility",0)+" To Check AutoNumber Vehicle ID Check Box On UI Screen");
			testcall1 = true;
			RMA_Maintenance_Functionality_Utility.RMA_Suite1_Maint_AutoNumber_VehicleID_Utility("check", logval1);
			parentlogger.log(LogStatus.INFO, "UI Settings Successfully Completed");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==================================================Steps To Revert General System Parameter Settings Is Completed Here=============================================================

			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(4, StrRMAWindowHandle, StrRMAUXWindowHandle, RMAUIWindowHandle, "NA", "NA", "Navigation To RMA Maintenance Screen", logval);	
			StrRMAMaintUXWindowHandle = driver.getWindowHandle(); 
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Vehicle Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewVehicle", "RMA_Maintenance_Vehicle_AddVehicle",0)+" To Create New Vehicle From Maintenance Screen");
			testcall2=true;
			vehicleId = RMA_Maintenance_Functionality_Utility.RMA_Maintenance_Vehicle_AddVehicle(logval1);
			parentlogger.log(LogStatus.INFO, "New Vehicle Is Created With Auto Generated Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(vehicleId, 2));
			loggerval2=logger.toString();
			parentlogger.appendChild(logger);
			driver.close();
			driver.switchTo().window(RMAUIWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			//===========================================================New Vehicle Creation Is Completed Here================================================================================================================================================================================================================================================================

			//=====================================================Steps To Revert General System Parameter Settings Is Started Here=============================================================         
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AutoNumberVID", "RMA_AutoNumber_VehicleID_Utility",0)+" To Uncheck AutoNumber Vehicle ID Check Box On UI Screen");
			testcall3 = true;
			RMA_Maintenance_Functionality_Utility.RMA_Suite1_Maint_AutoNumber_VehicleID_Utility("uncheck", logval1);
			parentlogger.log(LogStatus.INFO, "Revert Of UI Settings Successfully Completed");
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.close();
			driver.switchTo().window(StrRMAUXWindowHandle);
			//==================================================Steps To Revert General System Parameter Settings Is Completed Here=============================================================



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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Suite1_Maint_AutoNumber_VehicleID_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Maintenance_Vehicle_AddVehicle" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Suite1_Maint_AutoNumber_VehicleID_Utility" + " " +  "And Hence The Test Case Is A Fail");
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



