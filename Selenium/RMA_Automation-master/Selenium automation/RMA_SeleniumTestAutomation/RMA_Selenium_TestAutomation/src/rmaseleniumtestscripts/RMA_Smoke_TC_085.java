package rmaseleniumtestscripts;

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
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_085
//Description    : Successful Add, Edit And Delete Of Vehicle From Maintenance & Create, Edit And Delete Inspections From Vehicle Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-23-2016 
//=================================================================================================

public class RMA_Smoke_TC_085 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_085_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_085_ Create, Edit And Delete Vehicle From Maintenance & Create, Edit And Delete Inspections From Vehicle", " Successful Add, Edit And Delete Of Vehicle From Maintenance & Create, Edit And Delete Inspections From Vehicle Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String StrVehicleID;
			String StrVehicleMake;
			String StrVehicleModel ;
			int IntVehicleYear;
			int IntLeaseAmount;
			String StrLicenseNumber;
			int IntLeaseNumber;
			int IntLeaseTerm;
			String StrLeaseExpiration;
			int IntOriginalCost;
			String StrEditedVehicleID;
			String StrUnitType;
			String StrDisposalDate;
			String StrLastServiceDate;
			String StrInspectionsDate1;
			String StrInspectionsDate2;
			String StrEditedInspectionsDate;
			String StrContent1;
			String StrContent2;
			String StrEditedContent1;
			String PrimaryWindowHandle;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_085";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData Is Fetched To Retrieve Data
			
			StrVehicleMake = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 1, 0); // Vehicle Make Value Is Fetched From DataSheet RMA_TC_085
			StrVehicleModel = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 1, 1); // Vehicle Model Value Is Fetched From DataSheet RMA_TC_085
			IntVehicleYear = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_085", 1, 2); // Vehicle Year Value Is Fetched From DataSheet RMA_TC_085
			IntLeaseAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_085", 1, 3); // Lease Amount Value Is Fetched From DataSheet RMA_TC_085
			StrLicenseNumber = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 1, 4); // License Number Value Is Fetched From DataSheet RMA_TC_085
			IntLeaseNumber =  ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_085", 1, 5); // LeaseNumber Value Is Fetched From DataSheet RMA_TC_085
			IntLeaseTerm = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_085", 1, 6); // Lease Term Value Is Fetched From DataSheet RMA_TC_085
			IntOriginalCost = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_085", 1, 7); // Original Cost Value Is Fetched From DataSheet RMA_TC_085
			StrUnitType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 1, 8); // Unit Type Value Is Fetched From DataSheet RMA_TC_085
			StrContent1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 5, 0); // First Content Value Is Fetched From DataSheet RMA_TC_085
			StrContent2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 5, 1); // Second Content Value Is Fetched From DataSheet RMA_TC_085
			StrEditedContent1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_085", 5, 2); // Third Content Value Is Fetched From DataSheet RMA_TC_085
		
			StrLeaseExpiration = RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			StrDisposalDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 0, 20);
			StrLastServiceDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0);
			StrInspectionsDate1 = StrLeaseExpiration;
			StrInspectionsDate2 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(4, 0, 0);
			StrEditedInspectionsDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(6, 0, 0);
		
			/*================================================== Steps To Add New Vehicle Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			parentlogger.log(LogStatus.INFO,"Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintenanceVehicle","RMA_MaintenanceVehicle_AddEdit_Utility",0)+" Is Called To Add New Vehicle");
			testcall1 = true;
			StrVehicleID=RMA_Functionality_Utility.RMA_MaintenanceVehicle_AddEdit_Utility("Create", StrVehicleMake, StrVehicleModel, IntVehicleYear, IntLeaseAmount, StrLicenseNumber, IntLeaseNumber, IntLeaseTerm, StrLeaseExpiration, IntOriginalCost, StrUnitType, StrDisposalDate, StrLastServiceDate, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);	
			parentlogger.log(LogStatus.INFO, "A Vehicle Is Created Successfully With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrVehicleID, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Vehicle Is Created Successfully", StrScreenShotTCName)));
			/*================================================== Steps To Add New Vehicle Is Ended Here================================================================*/
			
			/*================================================== Steps To Edit Vehicle Is Started Here================================================================*/
			parentlogger.log(LogStatus.INFO, "Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintenanceVehicle","RMA_MaintenanceVehicle_AddEdit_Utility",1)+" Is Called To Edit Created Vehicle");
			testcall2 = true;
			StrEditedVehicleID=RMA_Functionality_Utility.RMA_MaintenanceVehicle_AddEdit_Utility("Edit", "NA", "NA", 00, 00, "NA", 00, 00, "NA", 00, "NA", "NA", "NA", false, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);		
			parentlogger.log(LogStatus.INFO, "A Vehicle Is Edited Successfully With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(StrEditedVehicleID, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Vehicle Last Name", StrScreenShotTCName)));
			/*================================================== Steps To Edit Vehicle Is Ended Here================================================================*/
			
			/*================================================== Steps To Add Inspection On Vehicle Is Started Here================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Img_Inspections(driver),  "Vehicle Inspection Image On Maintenance-->Vehicle Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_InspectionsDate(driver), "Inspections Date TextBox On Maintenance-->Vehicle --> Inspection Page.", StrInspectionsDate1, logval);
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Btn_InspectionResult(driver),  "Inspection Result Button On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_ContentMemo(driver), "Content Memo On Riskmaster Editor Page.", StrContent1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Btn_GenericMemoPage(driver, "  OK  "),  "OK Button On Riskmaster Editor Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),  "Save Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_New(driver), "New Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_InspectionsDate(driver), "Inspections Date TextBox On Maintenance-->Vehicle --> Inspection Page.", StrInspectionsDate2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Btn_InspectionResult(driver),  "Inspection Result Button On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_ContentMemo(driver), "Content Memo On Riskmaster Editor Page.", StrContent2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Btn_GenericMemoPage(driver, "  OK  "),  "OK Button On Riskmaster Editor Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),  "Save Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "Maintenance-->Vehicle --> Inspection 'Lookup Result' Page", logval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), StrContent1, "LINK", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			/*================================================== Steps To Add Inspection On Vehicle Is Ended Here================================================================*/
			
			/*================================================== Steps To Edit Inspection On Vehicle Is Started Here================================================================*/		
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_InspectionsDate(driver), "Inspections Date TextBox On Maintenance-->Vehicle --> Inspection Page.", StrEditedInspectionsDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Btn_InspectionResult(driver),  "Inspection Result Button On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Txt_ContentMemo(driver), "Content Memo On Riskmaster Editor Page.", StrEditedContent1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintVehicle_Btn_GenericMemoPage(driver, "  OK  "),  "OK Button On Riskmaster Editor Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),  "Save Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, " 'Lookup Result' Table", logval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver),  StrEditedContent1, "LINK", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			/*================================================== Steps To Edit Inspection On Vehicle Is Ended Here================================================================*/	
			
			/*================================================== Steps To Delete Inspection On Vehicle Is Started Here================================================================*/
			String Expmsg;
			Expmsg = "Are you sure you want to delete?";
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Vehicle --> Inspection Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Vehicle --> Inspection Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Vehicle --> Inspection Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(StrEditedInspectionsDate, 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete Inspection"+ " "+ color.RMA_ChangeColor_Utility(StrEditedInspectionsDate, 3));
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Vehicle --> Inspection Page", logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Inspection Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedInspectionsDate, 3));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Vehicle --> Inspection Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 2, true, false, " 'Lookup Result' Table", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Vehicle");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Maintenance-->Vehicle --> Inspection Page", logval);
			/*================================================== Steps To Delete Inspection On Vehicle Is Ended Here================================================================*/
			
			//================================================== Steps To Delete The Vehicle Is Started =================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Vehicle Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Vehicle Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Vehicle Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(StrEditedInspectionsDate, 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",1)+" Is Called To Delete The Vehicle"+ " "+ color.RMA_ChangeColor_Utility(StrEditedVehicleID, 3));
			testcall4= true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Vehicle Page", logval1);
			parentlogger.log(LogStatus.INFO, "Vehicle Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedVehicleID, 3));
			loggerval4= logger.toString();
			parentlogger.appendChild(logger);
			//================================================= Steps To Delete The Vehicle Is Completed=================================================================================================================================================


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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintenanceVehicle_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintenanceVehicle_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall4== true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
			if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
			{ FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); break; }
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
			reports.endTest(parentlogger); 
			reports.flush();
			
		}
	}		
}

