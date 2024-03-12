package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_067
//Description    : Inspections Can Be Added, Edited And Deleted To Created Vehicle Is Validated
//Depends On TC  : RMA_Smoke_TC_066
//Revision       : 0.0 - KumudNaithani-11-14-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_067 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_067_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_067_Inspections Can Be Added, Edited And Deleted To Created Vehicle", "Inspections Can Be Added, Edited And Deleted To Created Vehicle Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			//Region =====================================================Global Variable Initialization Is Started Here=========================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_067";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;			
			ErrorMessage = null;
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here============================================================================== 
			
			//Region =====================================================Local Variable Declaration Started Here===============================================================================================================================================================================================================================================================================		
			String StrVehInspection;
			String StrVehInspection_1;
			//EndRegion ==================================================Local Variable Declaration Completed Here==============================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Open Existing Vehicle Is Started Here============================================================================================================================================================================================================================================================================		
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Vehicle", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame);		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Btn_GenericVehicleLookUp(driver), "LookUp Button On Vehicle Creation Page",logval);						
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Txt_LookUpFilterVehicleID(driver), "VehicleID TextBox On Vehicle Search Window",RMA_Smoke_TC_066.StrVehicleID, logval);			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_Smoke_TC_066.StrVehicleID, "Vechile Lookup Window", logval);	
			Thread.sleep(3000);
			driver.switchTo().parentFrame(); //	Navigate To Parent Frame
			driver.switchTo().frame(1);		
			//EndRegion ==================================================Steps To Open Existing Vehicle Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Add First Inspections Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintVehNewEntity", "RMA_VehicleEntityAddition_Utility",0)+" To Add New Inspections For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			testcall1 = true;
			StrVehInspection = RMA_Functionality_Utility.RMA_VehicleEntityAddition_Utility("Inspection", "NA", "NA",RMA_Smoke_TC_066.StrVehicleID,logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);			
			parentlogger.log(LogStatus.INFO, "Following Inspections Is Created:: " + color.RMA_ChangeColor_Utility(StrVehInspection, 2) + "For Vehicle With ID " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_066.StrVehicleID, 2));		
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion ==================================================Steps To Add First Inspections Is Completed Here======================================================================================================================================================================================================================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Inpection Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			
			//Region =====================================================Steps To Add Second Inspections Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintVehNewEntity", "RMA_VehicleEntityAddition_Utility",0)+" To Add New Inspections For Following Policy " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_059.StrPolicyName, 2));
			testcall2 = true;
			StrVehInspection_1 = RMA_Functionality_Utility.RMA_VehicleEntityAddition_Utility("Inspection", "NA", "NA",RMA_Smoke_TC_066.StrVehicleID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);			
			parentlogger.log(LogStatus.INFO, "Following Inspections Is Created:: " + color.RMA_ChangeColor_Utility(StrVehInspection_1, 2) + "For Vehicle With ID " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_066.StrVehicleID, 2));		
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//EndRegion ==================================================Steps To Add Second Inspections Is Completed Here======================================================================================================================================================================================================================================================================================
			
			/*//Region =====================================================Steps To Delete First Inspections Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Inspections Page",logval);					
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(strEntityName, "Inspections Grid Window", logval);							
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Inspections Page", true, logval);	
			//EndRegion ==================================================Steps To Delete First Inspections Is Completed Here======================================================================================================================================================================================================================================================================================
			
			//Region =====================================================Steps To Delete First Inspections Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Inspections Page",logval);					
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(strEntityName, "Inspections Grid Window", logval);							
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Inspections Page", true, logval);	
			//EndRegion ==================================================Steps To Delete First Inspections Is Completed Here======================================================================================================================================================================================================================================================================================
			
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Inspections ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Inspections "), "Add Image Button For Inspections  For The Following Policy:: " + StrPolicyName + " On Vehicle Page",logval);
			//Above Steps Are Added As On Delete Of Inspections, The Application Is Getting Redirect To Vehicle Page
			
			//Region =====================================================Steps To Delete Second Inspections Is Started Here============================================================================================================================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Policy.RMAApp_Policy_Btn_GenericLookup(driver), "Lookup Button On Inspections Page",logval);			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(strEntityName_1, "Coverage Types Lookup Window", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Inspections Is Getting Loaded");					
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Inspections Page", true, logval);	
			//EndRegion ==================================================Steps To Delete Second Inspections Is Completed Here=====================================================================================================================================================================================================================================================================================*/
						
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PolicyEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PolicyEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

