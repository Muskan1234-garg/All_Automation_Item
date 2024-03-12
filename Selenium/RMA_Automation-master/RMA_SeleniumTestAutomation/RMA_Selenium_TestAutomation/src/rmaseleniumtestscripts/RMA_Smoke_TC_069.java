package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;

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
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_069
//Description    : Successful Add, Edit And Delete Contracts From A Physician
//Depends On TC  : RMA_Smoke_TC_068
//Revision       : 0.0 - RenuVerma-10-21-2016 
//=================================================================================================

public class RMA_Smoke_TC_069 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_069_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_069_ Add, Edit And Delete Contracts From A Physician", " Successful Add, Edit And Delete Contracts From A Physician");
			parentlogger.assignAuthor("RenuVerma");
	
			String RMA_PhysicianContractsStartDate1;
			String RMA_PhysicianContractsEndDate1;
			String RMA_PhysicianContractsStartDate2;
			String RMA_PhysicianContractsEndDate2;
			int RMA_PhysicianContractsAmounts1;
			String RMA_PhysicianContractsComments1;
			int RMA_PhysicianContractsFirstRate1;
			int RMA_PhysicianContractsAmounts2;
			String RMA_PhysicianContractsComments2;
			int RMA_PhysicianContractsFirstRate2;
			String RMA_PhysicianContractsState;
			String 	RMA_EditedPhysicianContractsStartDate;
			String RMA_EditedPhysicianContractsEndDate;
			String 	RMA_OverlappedEditedPhysicianContractsStartDate;
			String RMA_OverlappedEditedPhysicianContractsEndDate;
			String StrPrimaryWindowHandle;
						
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_069";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData Is Fetched To Retrieve Data
			RMA_PhysicianContractsAmounts1=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_069", 1, 0); // Physician Contract Amounts1 Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsComments1= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_069", 1, 1); // Physician Contracts Comments1 Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsFirstRate1= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_069", 1, 2); // Physician Contracts FirstRate1 Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsAmounts2=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_069", 5, 0); // Physician Contract Amounts2 Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsComments2= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_069", 5, 1); // Physician Contracts Comments2  Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsFirstRate2= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_069", 5, 2); // Physician Contracts FirstRate2 Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsState= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_069", 1, 3); // Physician Contracts State Is Fetched From DataSheet RMA_TC_069
			RMA_PhysicianContractsStartDate1 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-3, 0, 0);
			RMA_PhysicianContractsEndDate1 =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-2, 0, 0);
			RMA_PhysicianContractsStartDate2 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-1, 0, 0);
			RMA_PhysicianContractsEndDate2=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			RMA_OverlappedEditedPhysicianContractsStartDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -20,0 );
			RMA_OverlappedEditedPhysicianContractsEndDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -10, 0);
			RMA_EditedPhysicianContractsStartDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-5,0 ,0 );
			RMA_EditedPhysicianContractsEndDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-4, 0, 0);

			/*================================================== Step Add Two New Physician Contract Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068)));
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068 , " Maintenance-->Physician 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			
			// Add First Contract 
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_Contracts(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_Contracts(driver), "Contract Image On Maintenance-->Physician Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Contracts Start Date TextBox On Maintenance-->Physician-->Contract Page",RMA_PhysicianContractsStartDate1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Contracts End Date TextBox On Maintenance-->Physician-->Contract Page",RMA_PhysicianContractsEndDate1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Contract Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(true, "You must select either: a Fee Schedule/Discount combination a Contract Amount a Per Diem Rate or an Amount Billed Discount.", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_ContractsAmount(driver), "Contracts Amount TextBox On Maintenance-->Physician-->Contract Page",String.valueOf(RMA_PhysicianContractsAmounts1), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_ContractsComments(driver), "Contracts Comment TextBox On Maintenance-->Physician-->Contract Page",RMA_PhysicianContractsComments1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Per Diem Rate"), "Per Diem Rate Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_ContractsFirstRate(driver), "Contracts First Rate TextBox On Maintenance-->Physician-->Contract Page",String.valueOf(RMA_PhysicianContractsFirstRate1), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "State/WC Fee Schedule/Discount"), "State/WC Fee Schedule/Discount Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Chk_ContractsApplyDiscount(driver), "check", "Apply Discount Checkbox", "Maintenance-->Physician-->Contract Page",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Contract Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(true, "When choosing to apply discount to State WC Fee Schedule Type you must choose either a fee schedule or a state", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Lst_ContractsState(driver),RMA_PhysicianContractsState , "State WebList", "Maintenance-->Physician-->Contract Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Other"), "Other Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Amount Billed"), "Amount Billed Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Contract Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			
			// Add Second Contract 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Contract"), "Contract Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_New(driver), "New Image On Maintenance-->Physician Physician -->Contract Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Contracts Start Date TextBox On Maintenance-->Physician-->Contract Page",RMA_PhysicianContractsStartDate2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Contracts End Date TextBox On Maintenance-->Physician-->Contract Page",RMA_PhysicianContractsEndDate2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_ContractsAmount(driver), "Contracts Amount TextBox On Maintenance-->Physician-->Contract Page",String.valueOf(RMA_PhysicianContractsAmounts2), logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_ContractsComments(driver), "Contracts Comments TextBox On Maintenance-->Physician-->Contract Page",RMA_PhysicianContractsComments2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Per Diem Rate"), "Per Diem Rate Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_ContractsFirstRate(driver), "Contracts First Rate Date TextBox On Maintenance-->Physician-->Contract Page",String.valueOf(RMA_PhysicianContractsFirstRate2), logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect("State/WC Fee Schedule/Discount", "Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Chk_ContractsApplyDiscount(driver), "check", "Apply Discount Checkbox", "Maintenance-->Physician-->Contract Page",logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Lst_ContractsState(driver),RMA_PhysicianContractsState , "State WebList", "Maintenance-->Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "State/WC Fee Schedule/Discount"), "State/WC Fee Schedule/Discount Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Contract Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Contract"), "Contract Link Tab On Maintenance--> Physician-->Contract Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, " 'Lookup Result' Table", logval);
			String RMA_Lnk_PhysicianContractsStartDate1=new SimpleDateFormat("M/d/yyyy").format((new SimpleDateFormat("MMddyyyy").parse(RMA_PhysicianContractsStartDate1)));// Convert Date Into M/d/YYYY format from the MMddyyyy format
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianContractsStartDate1, " Maintenance-->Physician-->Physician Contract 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			/*================================================== Step Add Two New Physician Contract Is Ended Here================================================================*/
			
			//===============================================Steps To Edit The Physician Contract Is Started =================================================================================================================================================		
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Contracts Start Date TextBox On Maintenance-->Physician-->Contract Page",RMA_OverlappedEditedPhysicianContractsStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Contracts End Date TextBox On Maintenance-->Physician-->Contract Page",RMA_OverlappedEditedPhysicianContractsEndDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), " Maintenance-->Physician-->Contract Page", logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(true, "The period between the contract Start Date and End Date overlaps with the period from an existing contract for this entity.", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Contracts Start Date TextBox On Maintenance-->Physician-->Contract Page",RMA_EditedPhysicianContractsStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Contracts End Date TextBox On Maintenance-->Physician-->Contract Page",RMA_EditedPhysicianContractsEndDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Contract Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, " 'Lookup Result' Table", logval);
			String RMA_Lnk_EditedPhysicianContractsStartDate=new SimpleDateFormat("M/d/yyyy").format((new SimpleDateFormat("MMddyyyy").parse(RMA_EditedPhysicianContractsStartDate)));// Convert Date Into MM/dd/YYYY format from the MMddyyyy format
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_EditedPhysicianContractsStartDate, " Maintenance-->Physician-->Physician Contract 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			//===============================================Steps To Edit The Physician Contract Is Ended Here =================================================================================================================================================	
			
			//===============================================Steps To Delete The Physician Contract Is Started Here=================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Physician Contract"+ " "+ color.RMA_ChangeColor_Utility(RMA_Lnk_EditedPhysicianContractsStartDate, 2));
			testcall1 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Physician-->Physician Contract Page", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Physician Contract Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Lnk_EditedPhysicianContractsStartDate, 2));
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician-->Physician Contract 'Lookup Result' Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 2, true, false, "'Lookup Result' Table", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			//===============================================Steps To Delete The Physician Contract Is Ended Here=================================================================================================================================================

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

