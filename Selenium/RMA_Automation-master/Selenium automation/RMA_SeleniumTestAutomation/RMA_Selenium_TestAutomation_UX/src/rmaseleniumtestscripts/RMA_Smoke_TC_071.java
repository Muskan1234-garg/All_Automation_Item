package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Physician;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_071
//Description    : Previous Hospitals can be added , edited and deleted from a Physician Is Validated
//Depends On TC  : RMA_Smoke_TC_041_I
//Revision       : 0.0 - NidhiJha-15-01-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_071 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_071_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_071_ Previous Hospitals can be added , edited and deleted from a Physician", " Previous Hospitals can be added , edited and deleted from a Physician Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");


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
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Smoke_TC_071";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			String StrPhysicianLastName;
			String PreviousHospital_Creation_Txt_Status;
			String PreviousHospital_Creation_Txt_Privilege;
			String PreviousHospital_Creation_Txt_StartDate;
			String PreviousHospital_Creation_Txt_EndDate;
			String PrevHospitalStatus;
			String PreviousHospital_Creation_Txt_Privilege_1;
			//Local Variable Declaration Completed Here
			
			PreviousHospital_Creation_Txt_Status = "A";
			PreviousHospital_Creation_Txt_Privilege = "HDHE";
			PreviousHospital_Creation_Txt_StartDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			PreviousHospital_Creation_Txt_EndDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+5,"MM/dd/yyyy");
			PreviousHospital_Creation_Txt_Privilege_1 = "GDPA";
			//Local Variable Initialization Completed 
			
			//===========================================================New Physician Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Physician From Maintenance Screen");
			testcall1 = true;
			StrPhysicianLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Physician", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Physician From Maintenance Screen Is Successfully Created
			//============================================================New Physician Creation Is Completed Here================================================================================================================================================================================================================================================================
		
			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Previous Hospitals ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Previous Hospitals "), "Add Image Button For Previous Hospital For The Created Physician On Physician Maintenance Page",logval);

			//===========================================================New Physician Previous Hospital Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianPrevHospitalAdd", "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility",0)+" To Create New Previous Hospital From Physician Screen");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility("Create",PreviousHospital_Creation_Txt_Status, PreviousHospital_Creation_Txt_Privilege,PreviousHospital_Creation_Txt_StartDate,PreviousHospital_Creation_Txt_EndDate,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Previous Hospital Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//============================================================New Physician Previous Hospital Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//=============================================================Steps To Extract Exact Previous Hospital Status Value From Previous Hospital Page Is Started Here===============================================================================================================================================================================================================================================
			PrevHospitalStatus = RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Txt_Status(driver).getAttribute("value");
			String FPrevHospitalStatus[] = PrevHospitalStatus.split(" ");
			String NameLink ="";
			for ( int i=0; i<=FPrevHospitalStatus.length -1;i++)
			{	
				if(i == FPrevHospitalStatus.length -1)
				{
					NameLink = NameLink + FPrevHospitalStatus[i] ;
				}
				else if (i !=0){
					NameLink = NameLink +  FPrevHospitalStatus[i] + " ";
				}				
			}
			//=============================================================Steps To Extract Exact Previous Hospital Status Value From Previous Hospital Page Is Completed Here===============================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Previous Hospital Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Physician Previous Hospital Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(NameLink, "Previous Hospital Privilege Link In the Grid", logval);
		
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Started Here=======================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianPrevHospitalAdd", "RMA_PhysicianEducationAddEditDeleteEntity_Utility",0)+" To Delete Created Previous Hospital From Physician Screen");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility("Delete",PreviousHospital_Creation_Txt_Status, PreviousHospital_Creation_Txt_Privilege,PreviousHospital_Creation_Txt_StartDate,PreviousHospital_Creation_Txt_EndDate,logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Previous Hospital Is Deleted With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Ended Here=================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Previous Hospitals ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Previous Hospitals "), "Add Image Button For Previous Hospital For The Created Physician On Physician Maintenance Page",logval);

			//===========================================================Second Physician Previous Hospital Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianPrevHospitalAdd", "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility",0)+" To Create Second Previous Hospital From Physician Screen");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility("Create",PreviousHospital_Creation_Txt_Status, PreviousHospital_Creation_Txt_Privilege_1,PreviousHospital_Creation_Txt_StartDate,PreviousHospital_Creation_Txt_EndDate,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Second Previous Hospital Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//============================================================Second Physician Previous Hospital Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Previous Hospital Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Physician Previous Hospital Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(NameLink, "Previous Hospital Privilege Link In the Grid", logval);
	
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Started Here=======================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianPrevHospitalAdd", "RMA_PhysicianEducationAddEditDeleteEntity_Utility",0)+" To Delete Created Previous Hospital From Physician Screen");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility("Delete",PreviousHospital_Creation_Txt_Status, PreviousHospital_Creation_Txt_Privilege,PreviousHospital_Creation_Txt_StartDate,PreviousHospital_Creation_Txt_EndDate,logval1);
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Previous Hospital Is Deleted With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Ended Here=================================================

			//==============================================================Steps To Navigate From Previous Hospital Screen To Physician Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Physician"),"Physician Breadcrumb From Previous Hospital Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Previous Hospital Screen To Physician Screen Is Completed Here===============================================================================================================================================================================================================================================
		
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Started Here=======================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianPrevHospitalAdd", "RMA_PhysicianEducationAddEditDeleteEntity_Utility",0)+" To Delete Created Previous Hospital From Physician Screen");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility("Delete",PreviousHospital_Creation_Txt_Status, PreviousHospital_Creation_Txt_Privilege,PreviousHospital_Creation_Txt_StartDate,PreviousHospital_Creation_Txt_EndDate,logval1);
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Previous Hospital Is Deleted With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Ended Here=================================================
			
					
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "To create a new physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility" + " " +  "To create a new previous hospital on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility" + " " +  "To delete the created previous hospital on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility" + " " +  "To create second previous hospital on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility" + " " +  "To delete second previous hospital on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianPrevHospitalAddEditDeleteEntity_Utility" + " " +  "To delete the created physician And Hence The Test Case Is A Fail");
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

