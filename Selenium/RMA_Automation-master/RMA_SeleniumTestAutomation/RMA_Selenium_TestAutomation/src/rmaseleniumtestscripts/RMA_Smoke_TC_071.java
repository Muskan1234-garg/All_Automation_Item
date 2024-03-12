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
//TestCaseID     : RMA_Smoke-2_TC_071
//Description    : Successful Add, Edit And Delete Certifications From A Physician
//Depends On TC  : RMA_Smoke-2_TC_068
//Revision       : 0.0 - RenuVerma-10-25-2016 
//=================================================================================================

public class RMA_Smoke_TC_071 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_071_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_071_ Add, Edit And Delete Certifications From Physician", " Successful Add, Edit And Delete Certifications From A Physician");
			parentlogger.assignAuthor("RenuVerma");
	
			String RMA_PhysicianCertificationsStartDate1;
			String RMA_PhysicianCertificationsEndDate1;
			String RMA_PhysicianCertificationsStartDate2;
			String RMA_PhysicianCertificationsEndDate2;
			String RMA_PhysicianCertificationsName1;
			String RMA_PhysicianCertificationsBoard1;
			String RMA_PhysicianCertificationsStatus1;
			String RMA_PhysicianCertificationsName2;
			String RMA_PhysicianCertificationsBoard2;
			String RMA_PhysicianCertificationsStatus2;
			String 	RMA_EditedPhysicianCertificationsStartDate;
			String RMA_EditedPhysicianCertificationsEndDate;
			String RMA_Lnk_PhysicianCertificationsName;
			String StrPrimaryWindowHandle;
						
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_071";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
					
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14Suite_02TestData.xlsx Is Fetched To Retrieve Data
			RMA_PhysicianCertificationsName1=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_071", 1, 0); // Physician Certifications Name1 Is Fetched From DataSheet RMA_TC_071
			RMA_PhysicianCertificationsBoard1= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_071", 1, 1); // Physician Certifications Board1 Is Fetched From DataSheet RMA_TC_071
			RMA_PhysicianCertificationsStatus1= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_071", 1, 2); // Physician Certifications Status1 Is Fetched From DataSheet RMA_TC_071
			RMA_PhysicianCertificationsName2=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_071", 5, 0); // Physician Certifications Name2 Is Fetched From DataSheet RMA_TC_071
			RMA_PhysicianCertificationsBoard2= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_071", 5, 1); // Physician Certifications Board2 Is Fetched From DataSheet RMA_TC_071
			RMA_PhysicianCertificationsStatus2= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_071", 5, 2); // Physician Certifications Status2 Is Fetched From DataSheet RMA_TC_071
			
			RMA_PhysicianCertificationsStartDate1 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-3, 0, 0);
			RMA_PhysicianCertificationsEndDate1 =RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-2, 0, 0);
			RMA_PhysicianCertificationsStartDate2 = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-1, 0, 0);
			RMA_PhysicianCertificationsEndDate2 =RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			RMA_EditedPhysicianCertificationsStartDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(-4,0 ,0 );
			RMA_EditedPhysicianCertificationsEndDate= RMA_PhysicianCertificationsEndDate1;

			/*================================================== Step Add Two New Physician Certifications Is Started Here================================================================*/
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
			
			// Add First Certification
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_Certification(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Img_Certification(driver), "Certifications Image On Maintenance-->Physician", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationName(driver), "Certifications Name TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsName1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Certifications Start Date TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsStartDate1, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver), "Certifications Status TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsStatus1, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Certifications End Date TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsEndDate1, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationBoard(driver), "Certifications Board TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsBoard1, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Certifications Page", logval1);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_PhysicianCertificationsName1,RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationName(driver).getAttribute("value"),"Certifications Name", logval);
			RMA_Lnk_PhysicianCertificationsName=RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationName(driver).getAttribute("value").replace(RMA_PhysicianCertificationsName1 + " ", ""); //HDCD CIRRHOSIS-DECOMP replaced As CIRRHOSIS-DECOMP For Link Name In Lookup 

			// Add First Certification
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_New(driver), "New Image On Maintenance-->Physician -->Certifications Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationName(driver)));
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationName(driver), "Certifications Name TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsName2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Certifications Start Date TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsStartDate2, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_Status(driver), "Certifications Status TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsStatus2, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Certifications End Date TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsEndDate2, logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationBoard(driver), "Certifications Board TextBox On Maintenance-->Physician-->Certifications Page",RMA_PhysicianCertificationsBoard2, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Certifications Page", logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(RMA_PhysicianCertificationsName2,RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_CertificationName(driver).getAttribute("value"),"Certifications Name", logval);
			logger.log(LogStatus.INFO, "Certification On Physician Is Created Successfully And Certification Names Are :" +" " +color.RMA_ChangeColor_Utility(RMA_PhysicianCertificationsName1, 3)+ " And "+color.RMA_ChangeColor_Utility(RMA_PhysicianCertificationsName2, 3));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "Lookup Result Table", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianCertificationsName, " Maintenance-->Physician-->Physician Certifications 'Lookup Result' Page",logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			/*================================================== Step Add Two New Physician Certifications Is Ended Here================================================================*/
			
			//===============================================Steps To Edit The Physician Certifications Is Started =================================================================================================================================================		
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_StartDate(driver), "Certifications Start Date TextBox On Maintenance-->Physician-->Certifications Page",RMA_EditedPhysicianCertificationsStartDate, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintPhysician_Txt_EndDate(driver), "Certifications End Date TextBox On Maintenance-->Physician-->Certifications Page",RMA_EditedPhysicianCertificationsEndDate, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Maintenance-->Physician-->Certifications Page", logval1);
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='pleaseWaitFrame']/img")));// Wait For Load Image To Be Disappear
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 3, true, false, "'Lookup Result' Table", logval);
			RMA_Navigation_Utility.RMA_WebLinkSelect(RMA_Lnk_PhysicianCertificationsName, " Maintenance-->Physician-->Physician Certifications 'Lookup Result' Page",logval);	driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Physician");
			//===============================================Steps To Edit The Physician Certifications Is Ended Here =================================================================================================================================================	
			
			//===============================================Steps To Delete The Physician Certifications Is Started Here=================================================================================================================================================
			String Expmsg;
			Expmsg = "Are you sure you want to delete?";
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Physician-->Certification Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Physician-->Certification Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Physician-->Certification Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianCertificationsName, 2)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO,"Following Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Physician Certifications"+ " "+ color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianCertificationsName, 3));
			testcall1 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Physician-->Certifications Page", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Physician Certifications Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Lnk_PhysicianCertificationsName, 3));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Physician-->Certifications Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_RowColCountVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), 3, 2, true, false, "'Lookup Result' Table", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			//===============================================Steps To Delete The Physician Certifications Is Ended Here=================================================================================================================================================


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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger); 
			reports.flush();			
		}
	}		
}

