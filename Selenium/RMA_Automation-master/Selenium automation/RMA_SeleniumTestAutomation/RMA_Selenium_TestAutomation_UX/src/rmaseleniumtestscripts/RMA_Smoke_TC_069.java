package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Physician;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_069
//Description    : Certifications can be added , edited and deleted from a Physician Is Validated
//Depends On TC  : RMA_Smoke_TC_041_I
//Revision       : 0.0 - NidhiJha-12-01-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_069  extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_069_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_069_ Certifications can be added , edited and deleted from a Physician", " Certifications can be added , edited and deleted from a Physician Is Validated");
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
			StrScreenShotTCName = "RMA_Smoke_TC_069";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			String StrPhysicianLastName;
			String Certification_Creation_Txt_Name;
			String Certification_Creation_Txt_Name_1;
			String Certification_Creation_Txt_Status;
			String Certification_Creation_Txt_Board;
			String Certification_Creation_Txt_StartDate;
			String Certification_Creation_Txt_StartDate_Edit;
			String Certification_Creation_Txt_EndDate;
			String Certification_Creation_Txt_EndDate_Edit;
			String CertificationName;
			//Local Variable Declaration Completed Here

			Certification_Creation_Txt_Name = " ACS";
			Certification_Creation_Txt_Name_1 ="AMA";
			Certification_Creation_Txt_Status = "A";
			Certification_Creation_Txt_Board = "CT-MED";
			Certification_Creation_Txt_StartDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			Certification_Creation_Txt_EndDate = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,+31,0,"MM/dd/yyyy");
			Certification_Creation_Txt_StartDate_Edit = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-2,0,"MM/dd/yyyy");
			Certification_Creation_Txt_EndDate_Edit = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,+30,0,"MM/dd/yyyy");
			//Local Variable Initialization Completed 

			//===========================================================New Physician Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Physician From Maintenance Screen");
			testcall1 = true;
			StrPhysicianLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Physician", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			// New Physician From Maintenance Screen Is Successfully Created
			//============================================================New Physician Creation Is Completed Here================================================================================================================================================================================================================================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Certification ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Certification "), "Add Image Button For Certification  For The Created Physician On Physician Maintenance Page",logval);

			//===========================================================New Physician Certification Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianCertificationAdd", "RMA_PhysicianCertificationAddEditDeleteEntity_Utility",0)+" To Create New Certification From Physician Screen");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_PhysicianCertificationAddEditDeleteEntity_Utility("Create",Certification_Creation_Txt_Name, Certification_Creation_Txt_Status,Certification_Creation_Txt_Board, Certification_Creation_Txt_StartDate,Certification_Creation_Txt_EndDate,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Certification Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			// New Physician From Maintenance Screen Is Successfully Created
			//============================================================New Physician Certification Creation Is Completed Here================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Certification Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Physician Certification Grid", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ViewAllPopup_AddNew(driver), "Add Icon On Physician Certification Grid ", logval);
			//Add Button To Add New Certification Is Clicked

			//===========================================================Second Physician Certification Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianCertificationAdd", "RMA_PhysicianCertificationAddEditDeleteEntity_Utility",0)+" To Create New Certification From Physician Screen");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PhysicianCertificationAddEditDeleteEntity_Utility("Create",Certification_Creation_Txt_Name_1, Certification_Creation_Txt_Status,Certification_Creation_Txt_Board, Certification_Creation_Txt_StartDate,Certification_Creation_Txt_EndDate,logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Certification Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			// New Physician From Maintenance Screen Is Successfully Created
			//============================================================Second Physician Certification Creation Is Completed Here================================================================================================================================================================================================================================================================

			//=============================================================Steps To Extract Exact Certificate Name From Certification Page Is Started Here===============================================================================================================================================================================================================================================
			CertificationName = RMA_Selenium_POM_Physician.RMAApp_Physician_Certifications_Txt_Name(driver).getAttribute("value");
			String FCertificationName[] = CertificationName.split(" ");
			String nameLink ="";
			for ( int i=0; i<=FCertificationName.length -1;i++)
			{	
				if(i == FCertificationName.length -1)
				{
					nameLink = nameLink + FCertificationName[i] ;
				}
				else if (i !=0){
					nameLink = nameLink +  FCertificationName[i] + " ";
				}				
			}
			//=============================================================Steps To Extract Exact Certificate Name From Certificate Page Is Completed Here===============================================================================================================================================================================================================================================

			//===========================================================Steps To Edit Certification Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Certification Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 2, "Physician Certification Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(nameLink, "Certification Name Link In the Grid", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Txt_StartDate(driver), "Start Date textbox on privileges page", Certification_Creation_Txt_StartDate_Edit, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Txt_EndDate(driver), "End date textbox on privileges page", Certification_Creation_Txt_EndDate_Edit, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Certifications Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Visible");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Certification Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 2, "Physician Certification Grid", logval);
			//Verification Of The Row Count Is Done Here
			
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(nameLink, "Certification Name Link In the Grid", logval);
			//===========================================================Steps To Edit Certification Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Steps To Verify Delete Functionality On Physician Privilege Page Is Started Here=======================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_DeleteRecord(driver), "Delete Record Icon On Physician Privileges Page ", logval);
			RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("No", "Partial",RMA_Selenium_POM_VerificationMessage.PrivilegeDeleteConfirmation, "Delete Message On Deleting a Certification", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Certification Page Needs To Get Loaded");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianPrivilegeAdd", "RMA_PhysicianPrivilegeAddNewEntity_Utility",0)+" To Create New Privilege From Physician Screen");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PhysicianCertificationAddEditDeleteEntity_Utility("Delete",Certification_Creation_Txt_Name_1, Certification_Creation_Txt_Status,Certification_Creation_Txt_Board, Certification_Creation_Txt_StartDate,Certification_Creation_Txt_EndDate,logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Created Certification Is Deleted With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//===========================================================Steps To Verify Delete Functionality On Physician Privilege Page Is Ended Here=================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Certification ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Certification "), "Add Image Button For Certification  For The Created Physician On Physician Maintenance Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Privilege Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Physician Certification Grid", logval);
			//Verification Of The Row Count Is Done Here

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianCertificationAddEditDeleteEntity_Utility" + " " +  "To create a new certification on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianCertificationAddEditDeleteEntity_Utility" + " " +  "To create second certification on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianCertificationAddEditDeleteEntity_Utility" + " " +  "To delete certification on the created physician And Hence The Test Case Is A Fail");
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

