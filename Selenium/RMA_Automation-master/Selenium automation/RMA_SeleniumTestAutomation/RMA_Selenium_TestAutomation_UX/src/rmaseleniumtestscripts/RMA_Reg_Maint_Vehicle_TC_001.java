package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_001
//Description    : Verify The Functionality Of ToolBar Buttons From Vehicle Maintenance Screen Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NikitaThani-02-17-2018 
//======================================================================================================================================================================================================================================================================================


public class RMA_Reg_Maint_Vehicle_TC_001 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Vehicle_TC_001_Test() throws Exception,Error
	{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_TC_001_Verify The Functionality Of ToolBar Buttons From Vehicle Maintenance Screen", "Verify The Functionality Of ToolBar Buttons From Vehicle Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Nikita Thani");
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
			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_TC_003";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed Here

			String StrVehicleID;
			String FileName;
			String FileSize;
			String DiaryTaskName;
			//Local Variable Declaration Is Completed Here

			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization Completed Here

			//===========================================================New Vehicle Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Vehicle From Maintenance Screen");
			testcall1 = true;
			StrVehicleID=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Vehicle", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Vehicle Is Created With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrVehicleID, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//============================================================New Vehicle Creation Is Completed Here================================================================================================================================================================================================================================================================

			//=================================================Steps To Create And Edit Attachments Started Here==============================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Vehicle  "+" "+StrVehicleID, logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Property Id :"+" "+StrVehicleID);
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", FileName, FileSize, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached And Edited Successfully On Claim :"+" "+StrVehicleID);
			parentlogger.appendChild(logger);
			//=================================================Steps To Create And Edit Attachments Started Here==============================================================================================================================================================================
			
			//=================================================Steps To Delete Created Attachments Started Here==============================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Property Id :"+" "+StrVehicleID);
			testcall3 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", FileName, FileSize, false, logval1);
			parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Vehicle :"+" "+StrVehicleID);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button Attchement Screen", logval);// close attachment screen
			//=================================================Steps To Delete Created Attachments Completed Here==============================================================================================================================================================================
			
			DefaultFrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();			
			//===========================================================New Diary Creation On Newly Created Dependent Is Started Here=====================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following Vehicle Screen::"+" "+StrVehicleID,logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("VehicleDiaryAdd", "RMA_AttachCreateEdit_Diary",0)+" To Attach a Diary On Vehicle Maintenance Screen");
			testcall4 = true;
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA","CQE Complete Quick Entry","NA","NA", "NA", "Important","vehicle",logval1);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"On Vehicle :"+" "+color.RMA_ChangeColor_Utility(StrVehicleID,4));							
			loggerval4 = logger.toString();
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.appendChild(logger);
			//============================================================New Diary Creation On Newly Created Dependent Is Completed Here==================================================================================================================================================================

			//============================================================Record Summary Verification Is Started Here==================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_RecordSummary(driver), "Add Image Button  For Record Summary on Vehicle Page",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_RecordSummary_Txt_Data(driver, StrVehicleID), "Data on Record Summary", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_RecordSummary_btn_Cancel(driver), "Image Button For Closing Record Summary on Vehicle Page",logval);
			//============================================================Record Summary Verification Is Completed Here==================================================================================

			//============================================================Lookup Verification Is Started Here==================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Btn_GenericVehicleLookUp(driver), "Image Button For Lookup on Vehicle Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Lookup_Txt_VehicleId(driver), "Vehicle Id On Vehicle Lookup Page", StrVehicleID, logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrVehicleID, "Lookup Window On Vehicle Creation page", logval);
			//RMA_Verification_Utility.RMA_PartialTextVerification(Dependent_Creation_Txt_FirstName,StrFirstName , "First Name on Dependent Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//============================================================Lookup Verification Is Completed Here==================================================================================================================================================================

			//==========================================================Delete Of Created Vehicle Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Vehicle Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Vehicle Creation Page", true, logval);
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_AttachCreateEdit_Diary" + " " +  "And Hence The Test Case Is A Fail");
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
			}
			
			catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}	

}
