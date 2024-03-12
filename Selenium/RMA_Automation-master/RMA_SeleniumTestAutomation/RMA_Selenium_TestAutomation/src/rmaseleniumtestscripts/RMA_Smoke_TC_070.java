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
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_070
//Description    : Successful Add, Edit And Delete Privileges From A Physician
//Depends On TC  : RMA_Smoke_TC_068
//Revision       : 0.0 - RenuVerma-10-21-2016 
//=================================================================================================

public class RMA_Smoke_TC_070 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_070_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_070_ Add, Edit Delete Privileges From Physician", " Successful Add, Edit And Delete Privileges From A Physician");
			parentlogger.assignAuthor("RenuVerma");
	
			String RMA_PhysicianPrivilegesStartDate1;
			String RMA_PhysicianPrivilegesEndDate1;
			String RMA_PhysicianPrivilegesStartDate2;
			String RMA_PhysicianPrivilegesEndDate2;
			String RMA_PhysicianPrivilegesCategory1;
			String RMA_PhysicianPrivilegesType1;
			String RMA_PhysicianPrivilegesStatus1;
			String RMA_PhysicianPrivilegesCategory2;
			String RMA_PhysicianPrivilegesType2;
			String RMA_PhysicianPrivilegesStatus2;
			String 	RMA_EditedPhysicianPrivilegesStartDate;
			String RMA_EditedPhysicianPrivilegesEndDate;
			String RMA_Lnk_PhysicianPrivilegesCat;

			String StrPrimaryWindowHandle;
						
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_070";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData Is Fetched To Retrieve Data
			RMA_PhysicianPrivilegesCategory1=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_070", 1, 0); // Physician Privileges Category1 Is Fetched From DataSheet RMA_TC_070
			RMA_PhysicianPrivilegesType1= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_070", 1, 1); // Physician Privileges Type1 Is Fetched From DataSheet RMA_TC_070
			RMA_PhysicianPrivilegesStatus1= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_070", 1, 2); // Physician Privileges Status1 Is Fetched From DataSheet RMA_TC_070
			RMA_PhysicianPrivilegesCategory2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_070", 5, 0); // Physician Privileges Category2 Is Fetched From DataSheet RMA_TC_070
			RMA_PhysicianPrivilegesType2= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_070", 5, 1); // Physician Privileges Type2  Is Fetched From DataSheet RMA_TC_070
			RMA_PhysicianPrivilegesStatus2= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_070", 5, 2); // Physician Privileges Status2 Is Fetched From DataSheet RMA_TC_070
			
			RMA_PhysicianPrivilegesStartDate1 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-3, 0, 0);
			RMA_PhysicianPrivilegesEndDate1 =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-2, 0, 0);
			RMA_PhysicianPrivilegesStartDate2 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-1, 0, 0);
			RMA_PhysicianPrivilegesEndDate2 =RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			RMA_EditedPhysicianPrivilegesStartDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-4,0 ,0 );
			RMA_EditedPhysicianPrivilegesEndDate= RMA_PhysicianPrivilegesEndDate1 ;

			/*================================================== Step Add Two New Physician Privileges Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Physician", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(By.linkText(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068)));
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Smoke_TC_068.StrEditedPhysicianLastName_068 , " Maintenance-->Physician 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			// Add First Privileges 
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_Privileges(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_Privileges(driver), "Privileges Image On Maintenance-->Physician Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesCategory(driver), "Privileges Category TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesCategory1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Privileges Start Date TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesStartDate1, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesType(driver), "Privileges Type TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesType1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Privileges End Date TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesEndDate1, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver), "Privileges Status TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesStatus1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Privileges Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_PhysicianPrivilegesCategory1,RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesCategory(driver).getAttribute("value"),"Privileges Category", logval);
			RMA_Lnk_PhysicianPrivilegesCat=RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesCategory(driver).getAttribute("value").replace(RMA_PhysicianPrivilegesCategory1 + " ", ""); //HDCD CIRRHOSIS-DECOMP replaced As CIRRHOSIS-DECOMP For Link Name In Lookup 
			
			// Add Second Privileges 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_New(driver), "New Image On Maintenance-->Physician -->Privileges Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesCategory(driver)));
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesCategory(driver), "Privileges Category TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesCategory2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Privileges Start Date TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesStartDate2, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesType(driver), "Privileges Type TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesType2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Privileges End Date TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesEndDate2, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver), "Privileges Status TextBox On Maintenance-->Physician-->Privileges Page",RMA_PhysicianPrivilegesStatus2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Privileges Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_PhysicianPrivilegesCategory2,RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_PrivilegesCategory(driver).getAttribute("value"),"Privileges Category", logval);
			logger.log(LogStatus.INFO, "Privileges On Physician Is Created Successfully And Privileges Categories Are :" +" " +color.RMA_ChangeColor_Utility(RMA_PhysicianPrivilegesCategory1, 3)+ " And "+color.RMA_ChangeColor_Utility(RMA_PhysicianPrivilegesCategory2, 3));
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "'Lookup Result' Table", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianPrivilegesCat, " Maintenance-->Physician-->Physician Privileges 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			/*================================================== Step Add Two New Physician Privileges Is Ended Here================================================================*/
			
			//===============================================Steps To Edit The Physician Privileges Is Started =================================================================================================================================================		
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Privileges Start Date TextBox On Maintenance-->Physician-->Privileges Page",RMA_EditedPhysicianPrivilegesStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Privileges End Date TextBox On Maintenance-->Physician-->Privileges Page",RMA_EditedPhysicianPrivilegesEndDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Privileges Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "'Lookup Result' Table", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianPrivilegesCat, " Maintenance-->Physician-->Physician Privileges 'Lookup Result' Page",logval);	driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			//===============================================Steps To Edit The Physician Privileges Is Ended Here =================================================================================================================================================	
			
			//===============================================Steps To Delete The Physician Privileges Is Started Here=================================================================================================================================================
			
			String Expmsg;
			Expmsg = "Are you sure you want to delete?";
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Physician-->Physician Privileges Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Physician-->Physician Privileges Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Physician-->Physician Privileges Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianPrivilegesCat, 2)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO, "Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Physician Privileges"+ " "+ color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianPrivilegesCat, 2));
			testcall1 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Physician-->Physician Privileges Page", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Physician Privileges Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianPrivilegesCat, 2));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician-->Privileges Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 2, true, false, "'Lookup Result' Table", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image On Maintenance-->Physician-->Physician Privileges Page", logval);
			//===============================================Steps To Delete The Physician Privileges Is Ended Here=================================================================================================================================================


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

