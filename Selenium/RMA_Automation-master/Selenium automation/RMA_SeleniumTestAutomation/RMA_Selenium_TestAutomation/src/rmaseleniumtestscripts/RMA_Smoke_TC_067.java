package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_067
//Description    : Successful Add,Edit And Delete Patient from Maintenance Page And Also Successfully Add, Edit And Delete Procedure On That Patient Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-17-2016 
//=================================================================================================

public class RMA_Smoke_TC_067 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_067_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_067_Add, Edit And Delete Patient And Procedure On That Patient.", " Successful Add,Edit And Delete Patient from Maintenance Page And Also Successfully Add, Edit And Delete Procedure On That Patient Is Validated");
			parentlogger.assignAuthor("RenuVerma");

			String StrEditedPatientLastName;
			String StrPatientLastNameActual;
			String RMA_PatientLstName;
			String RMA_PatientAddress1;
			int  RMA_PatientPhone1;
			String RMA_PatientSex;
			String RMA_PatientType;
			String RMA_PatientProcedureDate1;
			String RMA_PatientProcedureDate2;
			String RMA_EditedPatientProcedureDate;
			String CurrentFrameID;
			String StrPrimaryWindowHandle;
			String RMA_Lnk_EditedPatientProcedureDate;
			String RMA_Lnk_PatientProcedureDate1;
						
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_067";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			testcall4 = false;	
			loggerval4 = "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_06_SmokeSuite_01 Is Fetched To Retrieve Data
			RMA_PatientAddress1   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_067", 1, 0); // Address1 Is Fetched From DataSheet RMA_Smoke_TC_067
			RMA_PatientPhone1 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_067", 1, 1); // Phone 1 Is Fetched From DataSheet RMA_Smoke_TC_067
			RMA_PatientSex = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_067", 1, 2); // Patient Sex Is Fetched From DataSheet RMA_Smoke_TC_067
			RMA_PatientType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_067", 1, 3); // Patient Type Is Fetched From DataSheet RMA_Smoke_TC_067
			//RMA_PatientParimaryPayCode_067= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_067", 1, 4); // Patient Primary Code Is Fetched From DataSheet RMA_Smoke_TC_067
			
			RMA_PatientProcedureDate1 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -3, 0);
			RMA_PatientProcedureDate2=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			RMA_EditedPatientProcedureDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -2, 0);
	
			//=================================== Disabling Of Multiple Addresses for Entities CheckBox Under General System Parameter Page Setting Is Started===================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_EnableMultipleAddressesForEntities(driver), "uncheck", "Enable Multiple Addresses for Entities", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===================================Disabling Of Multiple Addresses for Entities CheckBox Under General System Parameter Page Setting Is Started ===================================
			
			/*================================================== Step Add New Patient Is Started Here================================================================*/
			//RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PatientTracking", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Patient");
			RMA_PatientLstName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver), "Last Name TextBox On Maintenance-->Patient Tracking Page",RMA_PatientLstName, logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_QuickLookup_Generic_Btn_AddNew(driver), color.RMA_ChangeColor_Utility(RMA_PatientLstName,3)+"Add New Button On Patient Tracking Page.", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Patient");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_Addr1(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_Addr1(driver), "Address 1 TextBox On Patient Tracking Page.", RMA_PatientAddress1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_Phone1(driver), "Phone Number TextBox On Patient Tracking Page.", String.valueOf(RMA_PatientPhone1), logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_Sex(driver), "Sex TextBox On Patient Tracking Page.", RMA_PatientSex, logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Admission Info"), "Admission Info Link Tab On Patient Tracking Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Patient/Facility Info"), "Patient/Facility Info Link Tab On Patient Tracking Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_PatientType(driver), "Patient TypeTextBox On Patient Tracking Page.", RMA_PatientType, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("Patient", false, "NA", "Patient Tracking Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Physician/Diagnosis Info"), "Physician/Diagnosis Info Link Tab On Patient Tracking Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Newborn Info"), "Newborn Info Link Tab On Patient Tracking Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Entity ID Type"), "Entity ID Type Link Tab On Patient Tracking Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On Patient Tracking Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Patient"), "Patient Link Tab On Patient Tracking Page", logval);
			StrPatientLastNameActual = RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_PatientLstName,  StrPatientLastNameActual, "Patient Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created With Patient Name::"+ " " + color.RMA_ChangeColor_Utility(RMA_PatientLstName, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Patient Is Created Successfully", StrScreenShotTCName)));
			/*====================================================Step Add New Patient Is Completed Here=======================================*/

			//===============================================Steps To Edit The Patient Is Started ======================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Functionality: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EntityEdit", "RMA_MaintenanceEntityEdit_Utility", 0)+ "Is Called");
			testcall1 = true;
			StrEditedPatientLastName=RMA_Functionality_Utility.RMA_MaintenanceEntityEdit_Utility("PatientTracking",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Patient Is Edited With Patient Name::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPatientLastName, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Patient Is Edited Successfully", StrScreenShotTCName)));
			//===============================================Steps To Edit The Patient Is Completed =================================================================================================================================================
			
			/*================================================== Step To Add, Edit Delete Procedure On Procedure Is Started Here================================================================*/
			// Add Procedure on Patient
			parentlogger.log(LogStatus.INFO, "Following Step"+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ProcedureLink", "Add, Edit And Delete Procedure", 0)+ "Is Called");
			testcall2 = true;
			logger = reports.startTest("<span id='ProcedureLink' > Add And Edit Procedure</span>", "Enables The User To Add And Edit Procedure From A Patient");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Img_Procedures(driver), "Procedure Image On Patient Tracking Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver), "Date Of Procedure TextBox On Patient Procedure Page", RMA_PatientProcedureDate1, logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Patient Tracking Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_New(driver), "New Image On Patient Tracking-->Patient Procedure Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver), "Date Of Procedure TextBox On Patient Procedure Page", RMA_PatientProcedureDate2, logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Patient Tracking Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			// Edit Procedure on Patient
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Patient Tracking-->Patient Procedure Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "Lookup Result Table", logval1);
			RMA_Lnk_PatientProcedureDate1=new SimpleDateFormat("M/d/yyyy").format(new SimpleDateFormat("MMddyyyy").parse(RMA_PatientProcedureDate1));// Convert Date Into M/d/YYYY format from the MMddyyyy format
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PatientProcedureDate1 , " Patient Tracking-->Patient Procedure 'Lookup Result' Page",logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			globalWait.until(ExpectedConditions.attributeContains(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver),"value" ,new SimpleDateFormat("MM/dd/yyyy").format(new SimpleDateFormat("MMddyyyy").parse(RMA_PatientProcedureDate1))));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver), "Date Of Procedure TextBox On Patient Procedure Page", RMA_EditedPatientProcedureDate, logval1);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Patient Tracking Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Patient Tracking-->Patient Procedure Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "Lookup Result Page", logval1);
			RMA_Lnk_EditedPatientProcedureDate=new SimpleDateFormat("M/d/yyyy").format((new SimpleDateFormat("MMddyyyy").parse(RMA_EditedPatientProcedureDate)));// Convert Date Into MM/dd/YYYY format from the MMddyyyy format
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(	RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, RMA_Lnk_PatientProcedureDate1 ) ,RMA_Lnk_PatientProcedureDate1 +" Patient Prodcedure Is Edited as "+RMA_Lnk_EditedPatientProcedureDate+" Record And Hence "+RMA_Lnk_PatientProcedureDate1, logval1);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_EditedPatientProcedureDate , " Patient Tracking-->Patient Procedure 'Lookup Result' Page",logval1);
			driver.switchTo().window(StrPrimaryWindowHandle);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			
			// Delete Procedure on Patient
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			globalWait.until(ExpectedConditions.attributeContains(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_DateofProcedure(driver),"value" ,new SimpleDateFormat("MM/dd/yyyy").format(new SimpleDateFormat("MMddyyyy").parse(RMA_EditedPatientProcedureDate))));
			String Expmsg;
			Expmsg = "Are you sure you want to delete?";
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Patient Tracking-->Patient Procedure Page", 4)+ "", logval1);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Patient Tracking-->Patient Procedure Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Patient Tracking-->Patient Procedure Page", 4), logval1);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(RMA_Lnk_EditedPatientProcedureDate, 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			
			parentlogger.log(LogStatus.INFO, "Following Utility : "+ RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Procedure"+ " "+ color.RMA_ChangeColor_Utility(RMA_EditedPatientProcedureDate, 3));
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Patient Tracking-->Patient Procedure Page", logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Procedure Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_EditedPatientProcedureDate, 3));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Patient Tracking-->Patient Procedure Page", logval1);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, RMA_Lnk_EditedPatientProcedureDate), RMA_Lnk_EditedPatientProcedureDate+" Link On Patient Tracking-->Patient Procedure 'Lookup Table' Page", RMA_PatientPhone1);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Patient Tracking-->Patient Procedure Page", logval1);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPatient_Txt_LastName(driver)));
			/*================================================== Step To Add, Edit Delete Procedure On Procedure Is Ended Here================================================================*/
			
			//===============================================Steps To Delete The Patient Is Started =================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Utility : "+ RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",1)+" Is Called To Delete The Patient"+ " "+ color.RMA_ChangeColor_Utility(StrEditedPatientLastName, 3));
			testcall4 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Patient Tracking Page", logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Patient Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPatientLastName, 3));
			//===============================================Steps To Delete The Patient Is Completed=================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility: " +" "+ "RMA_MaintenanceEntityEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Step" +" "+ "Add And Edit Procedure" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility: " +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility: " +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			reports.endTest(parentlogger); 
			reports.flush();			
		}
	}		
}

