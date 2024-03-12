package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_073
//Description    : Successful Add, Edit And Delete Previous Hospital From A Physician And Delete Created Physician Also 
//Depends On TC  : RMA_Smoke_TC_068
//Revision       : 0.0 - RenuVerma-10-25-2016 
//=================================================================================================

public class RMA_Smoke_TC_073 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_073_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_073_ Add, Edit Delete Hospital From Physician And Delete Created Physician Also", " Successful Add, Edit And Delete Previous Hospital From A Physician And Delete Created Physician Also");
			parentlogger.assignAuthor("RenuVerma");
	
			String RMA_PhysicianPrevHospitalStartDate1;
			String RMA_PhysicianPrevHospitalEndDate1;
			String RMA_PhysicianPrevHospitalStartDate2;
			String RMA_PhysicianPrevHospitalEndDate2;
			String RMA_PhysicianPrevHospitalPrivileges1;
			String RMA_PhysicianPrevHospitalStatus1;
			String RMA_PhysicianPrevHospitalPrivileges2;
			String RMA_PhysicianPrevHospitalStatus2;
			String 	RMA_EditedPhysicianPrevHospitalStartDate;
			String RMA_EditedPhysicianPrevHospitalEndDate;
			String RMA_Lnk_PhysicianPrevHospitalStatus;
			String CurrentFrameID;
			String StrPrimaryWindowHandle;
			String Expmsg;
						
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_073";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			Expmsg = "Are you sure you want to delete?";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData.xlsx Is Fetched To Retrieve Data
			RMA_PhysicianPrevHospitalStatus1=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_073", 1, 1); // Physician Previous Hospital Status1 Is Fetched From DataSheet RMA_Smoke_TC_073
			RMA_PhysicianPrevHospitalPrivileges1= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_073", 1, 0); // Physician Previous Hospital Privileges1 Is Fetched From DataSheet RMA_Smoke_TC_073
			RMA_PhysicianPrevHospitalStatus2= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_073", 5, 1); // Physician Previous Hospital Status2 Is Fetched From DataSheet RMA_Smoke_TC_073
			RMA_PhysicianPrevHospitalPrivileges2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_073", 5, 0); // Physician Previous Hospital Privileges2 Is Fetched From DataSheet RMA_Smoke_TC_073
				
			RMA_PhysicianPrevHospitalStartDate1= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-3, 0, 0);
			RMA_PhysicianPrevHospitalEndDate1 =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-2, 0, 0);
			RMA_PhysicianPrevHospitalStartDate2 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-1, 0, 0);
			RMA_PhysicianPrevHospitalEndDate2 =RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			RMA_EditedPhysicianPrevHospitalStartDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-4,0 ,0 );
			RMA_EditedPhysicianPrevHospitalEndDate= RMA_PhysicianPrevHospitalEndDate1;

			/*================================================== Step Add Two New Physician Previous Hospital Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068)));
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068 , " Maintenance-->Physician 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			
			//First Hospital Addition:
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_PrevHospital(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_PrevHospital(driver), "Previous Hospital Image On Maintenance-->Physician Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver), "Status TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalStatus1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Start Date TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalStartDate1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "End Date TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalEndDate1, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrevHospitalPrivileges(driver), "Privileges TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalPrivileges1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->PrevHospital Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_PhysicianPrevHospitalStatus1, RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver).getAttribute("value"), "Previous Hospital Status", logval);
			
			//Second Hospital Addition:
			RMA_Lnk_PhysicianPrevHospitalStatus=RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver).getAttribute("value").replace(RMA_PhysicianPrevHospitalStatus1 + " ", ""); //HDCD CIRRHOSIS-DECOMP replaced As CIRRHOSIS-DECOMP For Link Name In Lookup 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_New(driver), "New Image On Maintenance-->Physician Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver)));
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver), "Status TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalStatus2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Start Date TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalStartDate2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "End Date TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalEndDate2, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrevHospitalPrivileges(driver), "Privileges TextBox On Maintenance-->Physician-->Previous Hospital Page",RMA_PhysicianPrevHospitalPrivileges2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->PrevHospital Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_PhysicianPrevHospitalStatus2, RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver).getAttribute("value"), "Previous Hospital Status", logval);
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "'Lookup Result' Table", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianPrevHospitalStatus, " Maintenance-->Physician-->Physician Previous Hospital 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			/*================================================== Step Add Two New Physician Previous Hospital Is Ended Here================================================================*/
			
			//===============================================Steps To Edit The Physician Previous Hospital Is Started =================================================================================================================================================		
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "PrevHospital Start Date TextBox On Maintenance-->Physician-->PrevHospital Page",RMA_EditedPhysicianPrevHospitalStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "PrevHospital End Date TextBox On Maintenance-->Physician-->PrevHospital Page",RMA_EditedPhysicianPrevHospitalEndDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->PrevHospital Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, " 'Lookup Result' Table", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianPrevHospitalStatus, " Maintenance-->Physician-->Physician Previous Hospital 'Lookup Result' Page",logval);	driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			//===============================================Steps To Edit The Physician Previous Hospital Is Ended Here =================================================================================================================================================	
			
			//===============================================Steps To Delete The Physician Previous Hospital Is Started Here=================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Physician-->PrevHospital Page", 4)+ "", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Physician-->PrevHospital PageZA", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Physician-->PrevHospital Page", 4), logval1);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianPrevHospitalStatus, 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Physician Previous Hospital"+ " "+ color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianPrevHospitalStatus, 3));
			testcall1 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Physician-->PrevHospital Page", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Physician Previous Hospital Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianPrevHospitalStatus, 3));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician-->PrevHospital Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 2, true, false, "'Lookup Result' Table", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Maintenance-->Physician-->PrevHospital Page", logval);
			//===============================================Steps To Delete The Physician Previous Hospital Is Ended Here=================================================================================================================================================

			//===============================================Steps To Delete The Physician Is Started =================================================================================================================================================
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Physician Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Physician-->PrevHospital PageZA", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Physician Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068, 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO, "Following Utility : "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",1)+" Is Called To Delete The Physician"+ " "+ color.RMA_ChangeColor_Utility(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068, 3));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Physician Page", logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Physician Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068, 3));
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,RMA_Smoke_TC_068.StrEditedPhysicianLastName_068), RMA_Smoke_TC_068.StrEditedPhysicianLastName_068+ " Link On Maintenance-->Physician 'Lookup Result' Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			//===============================================Steps To Delete The Physician Is Completed=================================================================================================================================================
			
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger); 
			reports.flush();
			
		}
	}		
}

