package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_074
//Description    : Successful Add, Edit And Delete Property From Maintenance
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-21-2016 
//=================================================================================================

public class RMA_Smoke_TC_074 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_074_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_074_ Add, Edit And Delete Property From Maintenance", " Successful Add, Edit And Delete Of Property From Maintenance");
			parentlogger.assignAuthor("RenuVerma");

			String RMA_PropertyAddr1;
			String RMA_PropertyCity;
			String RMA_PropertyState;
			int RMA_PropertyZipCode;
			String RMA_PropertyYearofConstruction;
			int RMA_PropertySquareFootage;			
			String RMA_EditedPropertyID ;
			String RMA_PropertyID;
			String CurrentFrameID;
			String StrPrimaryWindowHandle;						
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_074";
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			RMA_PropertyAddr1  =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074", 1, 0); // Property Address1 Is Fetched From DataSheet RMA_TC_074
			RMA_PropertyCity =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074", 1, 1); // Property City Is Fetched From DataSheet RMA_TC_074
			RMA_PropertyState =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_074", 1, 2); // Property State Is Fetched From DataSheet RMA_TC_074
			RMA_PropertyZipCode   =   ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_074", 1, 3); // Property Zip Code Is Fetched From DataSheet RMA_TC_074
			RMA_PropertySquareFootage =   ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_074", 1, 5); // Property Square Footage Is Fetched From DataSheet RMA_TC_074
			RMA_PropertyYearofConstruction =   new SimpleDateFormat("yyyy").format(new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility())); // Property Year Of Construction Is Fetched From DataSheet RMA_Smoke_TC_074

			/*================================================== Steps To Add New Property Is Started Here================================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			parentlogger.log(LogStatus.INFO, "Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintenanceProperty","RMA_MaintenanceProperty_AddEdit_Utility",0)+" Is Called To Add New Property");
			testcall1 = true;
			RMA_PropertyID= RMA_Functionality_Utility.RMA_MaintenanceProperty_AddEdit_Utility("Create", RMA_PropertyAddr1, RMA_PropertyCity, RMA_PropertyZipCode, RMA_PropertyState, RMA_PropertyYearofConstruction, RMA_PropertySquareFootage, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);		
			parentlogger.log(LogStatus.INFO, "A Property Is Created Successfully With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(RMA_PropertyID, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Property Is Created Successfully", StrScreenShotTCName)));
			/*====================================================Steps To Add New Property Is Completed Here=======================================*/

			//===============================================Steps To Edit Created Property Is Started Here======================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintenanceProperty","RMA_MaintenanceProperty_AddEdit_Utility",1)+" Is Called To Edit Created Property");
			testcall2 = true;
			RMA_EditedPropertyID=RMA_Functionality_Utility.RMA_MaintenanceProperty_AddEdit_Utility("Edit", "NA", "NA", 00, "NA", "NA", 00, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);		
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			parentlogger.log(LogStatus.INFO, "A Property Is Edited Successfully With Vehicle ID::"+ " " + color.RMA_ChangeColor_Utility(RMA_EditedPropertyID, 3));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Property ID", StrScreenShotTCName)));
			//===============================================Steps To Edit Created Property Is Completed Here=================================================================================================================================================

			//===============================================Steps To Delete Created Property Is Started Here=================================================================================================================================================
			String Expmsg;
			Expmsg = "Are you sure you want to delete?";
			StrPrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility( "Maintenance-->Property Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Maintenance-->Property Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility(" Maintenance-->Property Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(RMA_EditedPropertyID, 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			parentlogger.log(LogStatus.INFO,"Following Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete The Property"+ " "+ color.RMA_ChangeColor_Utility(RMA_EditedPropertyID, 3));
			testcall3 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance-->Physician-->Physician Privileges Page", logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Property Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_EditedPropertyID, 3));
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Property", logval);
			RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance-->Property Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, RMA_EditedPropertyID), RMA_EditedPropertyID+ " Link On Maintenance-->Property 'Lookup Result' Page", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(StrPrimaryWindowHandle);
			//===============================================Steps To Delete Created Property Is Completed Here=================================================================================================================================================


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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintenanceProperty_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintenanceProperty_AddEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
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

