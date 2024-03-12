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
//TestCaseID     : RMA_Smoke_TC_072
//Description    : Contracts can be added , edited and deleted from a Physician Is Validated
//Depends On TC  : RMA_Smoke_TC_041_I
//Revision       : 0.0 - NidhiJha-15-01-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_072 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_072_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_072_ Contracts can be added , edited and deleted from a Physician", "Contracts can be added , edited and deleted from a Physician Is Validated");
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
			StrScreenShotTCName = "RMA_Smoke_TC_072";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			String StrPhysicianLastName;
			String Contract_Creation_Txt_StartDte;
			String Contract_Creation_Txt_StartDte_1;
			String Contract_Creation_Txt_StartDte_Edit;
			String Contract_Creation_Txt_EndDte;
			String Contract_Creation_Txt_EndDte_1;
			String Contract_Creation_Txt_EndDte_Edit;
			int Contract_Creation_Txt_Amount;
			int Contract_Creation_Txt_Amount_1;
			String Contracts_Creation_Txt_Comments;
			int Contracts_Creation_Txt_FirstRate;
			int Contracts_Creation_Txt_FirstRate_1;
			String Contracts_Creation_Lst_State;
			String Contract_Creation_Txt_StartDte_2;
			String Contract_Creation_Txt_EndDte_2;
			//Local Variable Declaration Completed Here

			Contract_Creation_Txt_StartDte = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_StartDte_1 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,+1,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_StartDte_Edit = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,+2,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_StartDte_2 =  RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+2,-16,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_EndDte = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,0,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_EndDte_1 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,+5,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_EndDte_Edit = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+1,+3,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_EndDte_2 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(+2,+13,+1,"MM/dd/yyyy");
			Contract_Creation_Txt_Amount = 10;
			Contract_Creation_Txt_Amount_1 = 20;
			Contracts_Creation_Txt_Comments = "Maintenance Physician Contracts";
			Contracts_Creation_Txt_FirstRate = 10;
			Contracts_Creation_Txt_FirstRate_1 = 20;
			Contracts_Creation_Lst_State = "AB - Alberta";

			//===========================================================New Physician Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Physician From Maintenance Screen");
			testcall1 = true;
			StrPhysicianLastName=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Physician", "NA","NA", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			// New Physician From Maintenance Screen Is Successfully Created
			//============================================================New Physician Creation Is Completed Here================================================================================================================================================================================================================================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Contracts ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Contracts "), "Add Image Button For Contracts For The Created Physician On Physician Maintenance Page",logval);

			//===========================================================New Physician Contract Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianContractAdd", "RMA_PhysicianContractsAddEditDeleteEntity_Utility",0)+" To Create New Contract From Physician Screen");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_PhysicianContractsAddEditDeleteEntity_Utility("Create", Contract_Creation_Txt_StartDte, Contract_Creation_Txt_EndDte, Contract_Creation_Txt_Amount, Contracts_Creation_Txt_Comments, Contracts_Creation_Txt_FirstRate, Contracts_Creation_Lst_State, "Yes", logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Contract Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//============================================================New Physician Contract Creation Is Completed Here================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Contracts Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Physician Contracts Grid", logval);
			//Verification Of The Row Count Is Done Here

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_ViewAllPopup_AddNew(driver), "Add Icon On Physician Contracts Grid ", logval);
			//Add Button To Add New Education Is Clicked

			//===========================================================Second Physician Contract Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianContractAdd", "RMA_PhysicianContractsAddEditDeleteEntity_Utility",0)+" To Create New Contract From Physician Screen");
			testcall3 = true;
			RMA_Functionality_Utility.RMA_PhysicianContractsAddEditDeleteEntity_Utility("Create", Contract_Creation_Txt_StartDte_1, Contract_Creation_Txt_EndDte_1, Contract_Creation_Txt_Amount_1, Contracts_Creation_Txt_Comments, Contracts_Creation_Txt_FirstRate_1, Contracts_Creation_Lst_State, "No", logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Contract Is Created With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//============================================================Second Physician Contract Creation Is Completed Here================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_StaticWait(7, logval, "Wait Is Added As Lookup Button Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Contracts Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 2, "Physician Contracts Grid", logval);
			//Verification Of The Row Count Is Done Here

			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(Contract_Creation_Txt_StartDte, "Contracts Date Link In the Grid", logval);

			//============================================================Steps To Edit The Created Contract Is Started Here=========================================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Contracts_Txt_StartDate(driver), "Start Date Text Box On Contracts Page", Contract_Creation_Txt_StartDte_Edit, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Txt_EndDate(driver), "End Date Text Box On Contracts Page", Contract_Creation_Txt_EndDte_Edit, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Contracts Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage(RMA_Selenium_POM_VerificationMessage.DateOverlapMsg, true, "Date Overlap Message on Contracts Page", logval);
			//Red Error Toast Message Verified
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Contracts_Txt_StartDate(driver), "Start Date Text Box On Contracts Page", Contract_Creation_Txt_StartDte_2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Txt_EndDate(driver), "End Date Text Box On Contracts Page", Contract_Creation_Txt_EndDte_2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image on Contracts Page", logval);
			//============================================================Steps To Edit The Created Contract Is Completed Here=========================================================================================================================================================================================================================================================================

			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Started Here=======================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Delete Image Needs To Get Loaded");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_DeleteRecord(driver), "Delete Record Icon On Physician Contracts Page ", logval);
			RMA_GenericUsages_Utility.RMA_ModalDialogTextVerify_Utility("No", "Partial",RMA_Selenium_POM_VerificationMessage.PrivilegeDeleteConfirmation, "Delete Message On Deleting a Contracts", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Education Page Needs To Get Loaded");
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PhysicianEducationAdd", "RMA_PhysicianEducationAddEditDeleteEntity_Utility",0)+" To Delete Created Contracts From Physician Screen");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_PhysicianContractsAddEditDeleteEntity_Utility("Delete", Contract_Creation_Txt_StartDte_1, Contract_Creation_Txt_EndDte_1, Contract_Creation_Txt_Amount_1, Contracts_Creation_Txt_Comments, Contracts_Creation_Txt_FirstRate_1, Contracts_Creation_Lst_State, "NA", logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Contract Is Deleted With Physician LastName::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			//===========================================================Steps To Verify Delete Functionality On Physician Education Page Is Ended Here=================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Contracts ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Contracts "), "Add Image Button For Contracts For The Created Physician On Physician Maintenance Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Physician.RMAApp_Physician_Privileges_Img_Lookup(driver), "Lookup Button On Physician Contracts Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXRowColumnCount_Utility("row", 1, "Physician Contracts Grid", logval);
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianContractsAddEditDeleteEntity_Utility" + " " +  "To create a new Contract on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianContractsAddEditDeleteEntity_Utility" + " " +  "To create second Contract on the created physician And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PhysicianContractsAddEditDeleteEntity_Utility" + " " +  "To delete the created contract on the created physician And Hence The Test Case Is A Fail");
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

