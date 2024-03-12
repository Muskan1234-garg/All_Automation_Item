package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Vehicle;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_017
//Description    : Verify That ToolBar Buttons On Vehicle Screen In PowerView Are Working Fine Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NikitaThani-03-22-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Vehicle_TC_017 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Vehicle_TC_017_Test() throws Exception,Error
	{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Vehicle_TC_017_Verify That ToolBar Buttons On Vehicle Screen In PowerView Are Working Fine", "Verify That ToolBar Buttons On Vehicle Screen In PowerView Are Working Fine Is Validated");
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
			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_TC_017";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed Here

			String RMAApp_SMS_Lst_DataSourceName;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String RMAApp_Login_Txt_UserName1;
			String RMAApp_Login_Txt_Password1;
			String StrVechicleID;
			String FileName;
			String FileSize;
			String DiaryTaskName;
			//Local Variable Declaration Is Completed Here

			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite01_Maint_Vehicle_Module.xlsx"); //Excel WorkBook RMA_Suite01_Maint_Vehicle_Module IS Fetched To Retrieve Data 
			RMAApp_SMS_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_017",DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_017
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_017", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_017
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_017", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_017		 
			RMAApp_Login_Txt_UserName1=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_017", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_017		 
			RMAApp_Login_Txt_Password1 =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_TC_017", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_TC_017		 
			//Data Fetch From Excel WorkBook Is Completed

			//===========================================================Application LogOut And Re-Login Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "Username TextBox On RMA Application Login Page", RMAApp_Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver),"Password TextBox On RMA_Application Login Page", RMAApp_Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RMA Application Login Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//===========================================================Application LogOut And Re-Login Is Completed Here===========================================================================================================================================================================================================================================================================================================================================================================================================

			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();	
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================New Vehicle Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Vehicle From Maintenance Screen");
			testcall1 = true;
			StrVechicleID=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Vehicle", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Vehicle Is Created With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrVechicleID, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//============================================================New Vehicle Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//=================================================Steps To Create And Edit Attachments Started Here==============================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Vehicle  "+" "+StrVechicleID, logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Vehicle ID :"+" "+StrVechicleID);
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", FileName, FileSize, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached And Edited Successfully On Vehicle ID :"+" "+StrVechicleID);
			parentlogger.appendChild(logger);
			//=================================================Steps To Create And Edit Attachments Started Here==============================================================================================================================================================================

			//=================================================Steps To Delete Created Attachments Started Here==============================================================================================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Vehicle ID :"+" "+StrVechicleID);
			testcall3 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", FileName, FileSize, false, logval1);
			parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Property :"+" "+StrVechicleID);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button Attchement Screen", logval);// close attachment screen
			//=================================================Steps To Delete Created Attachments Completed Here==============================================================================================================================================================================

			DefaultFrameID= RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();			
			//===========================================================New Diary Creation On Newly Created Dependent Is Started Here=====================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_Diary(driver), "Diary Image On Following Vehicle Screen::"+" "+StrVechicleID,logval);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("VehicleDiaryAdd", "RMA_AttachCreateEdit_Diary",0)+" To Attach a Diary On Vehicle Maintenance Screen");
			testcall4 = true;
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attached","NA","CQE Complete Quick Entry","NA","NA", "NA", "Important","Vehicle",logval1);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"On Vehicle :"+" "+color.RMA_ChangeColor_Utility(StrVechicleID,4));							
			loggerval4 = logger.toString();
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.appendChild(logger);
			//============================================================New Diary Creation On Newly Created Dependent Is Completed Here==================================================================================================================================================================

			//============================================================Record Summary Verification Is Started Here==================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericClaim_Btn_RecordSummary(driver), "Add Image Button  For Record Summary on Vehicle Creation Page",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_RecordSummary_Txt_Data(driver, StrVechicleID), "Data on Record Summary", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_RecordSummary_btn_Cancel(driver), "Image Button For Closing Record Summary on Vehicle Page",logval);
			//============================================================Record Summary Verification Is Completed Here==================================================================================

			//============================================================Lookup Verification Is Started Here==================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Btn_GenericVehicleLookUp(driver), "Image Button For Lookup on Vehicle Creation Page",logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Vehicle.RMAApp_Vehicle_Lookup_Txt_VehicleId(driver), "Vehicle Id On Property Lookup Page", StrVechicleID, logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrVechicleID, "Lookup Window On Property Creation page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//============================================================Lookup Verification Is Completed Here==================================================================================================================================================================

			//==========================================================Delete Of Created Vehicle Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Property Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Property Creation Page", true, logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//==========================================================Delete Of Created Vehicle Is Completed Here==========================================================================================================================================================================================================================================================================================

		
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Logout From Current User

			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Application_Login(RMAApp_Login_Txt_UserName1, RMAApp_Login_Txt_Password1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName1, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================Steps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMAApp_SMS_Lst_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMAApp_SMS_Lst_DataSourceName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Label From Dashboard", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			//==============================Steps To Select Required DataSource And Navigate To DashBaord Completed Here===========================================================================================================================================================================================================================

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


