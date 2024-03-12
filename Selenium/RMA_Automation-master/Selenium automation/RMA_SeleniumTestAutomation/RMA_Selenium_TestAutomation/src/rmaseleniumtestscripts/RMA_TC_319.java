package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================================
//TestCaseID     : RMA_TC_319
//Description    : RMA_TC_319_Attachment Add, Edit & Delete On Maintenance -> Policy Tracking  screen
//Depends On TC  : NA
//Revision       : 0.0 - MahendraPSingh-02-24-2017
//=================================================================================================================

public class RMA_TC_319 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test	
public void RMA_TC_319_Test() throws Exception, Error
  {   
	try {
		parentlogger = reports.startTest("Smoke_TC_051_Policy Creation On Policy Tracking", "Successful Policy Creation On Policy Tracking Is Validated");
		parentlogger.assignAuthor("Renu Verma");
	
		String StrPrimaryWindowHandle;
		String PolicyTracking_Status;
		Date PolicyTracking_ExpDate;
		String PolicyTracking_PriPolicyState;
		String PolicyTracking_CMCState;
		String PolicyTracking_InsurerLName;
		String PolicyTracking_Insured;
		int PolicyTracking_Premium;
		String StrPolicyName_RMA_TC_319;
		String StrPolicyNum_RMA_TC_319;
		Date PolicyTracking_EffDate_RMA_TC_319;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData IS Fetched To Retrieve Data 
		PolicyTracking_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 0); //Policy Status Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_PriPolicyState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 1); //Primary Policy State Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_CMCState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 2); //CMC State Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_InsurerLName =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 3); //Insurer Last Name Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_Insured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_051", 1, 4); // Insured Is Fetched From DataSheet RMA_TC_051
		PolicyTracking_Premium = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_051", 1, 5); // Premium Is Fetched From DataSheet RMA_TC_051	
		PolicyTracking_EffDate_RMA_TC_319 =new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());
		PolicyTracking_ExpDate=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(4,10,2));
		
		/*===========================================================New Policy Creation On Policy Tracking Is Started Here=======================================================================================================================================================================================*/
		//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolTrack", "RMA_PolicyTracking_Utility",0)+ " To Create New PolicyTracking");
		testcall1 = true;		
		StrPolicyName_RMA_TC_319= RMA_Functionality_Utility.RMA_PolicyTracking_Utility(PolicyTracking_Status,PolicyTracking_EffDate_RMA_TC_319 ,PolicyTracking_ExpDate,PolicyTracking_Premium, PolicyTracking_PriPolicyState, PolicyTracking_CMCState, PolicyTracking_InsurerLName, PolicyTracking_Insured, "NA","NA","NA",false, logval1);	
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		StrPolicyNum_RMA_TC_319 =RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver).getAttribute("value");
		parentlogger.log(LogStatus.INFO, "New PolicyTracking With Policy Name::"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName_RMA_TC_319, 3) +"And Policy Number" + color.RMA_ChangeColor_Utility(StrPolicyNum_RMA_TC_319, 3) + "Is Created");		
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Policy Creation On Policy Tracking Page", StrScreenShotTCName)));
		/*===========================================================New Policy Creation On Policy Tracking Is Completed Here=======================================================================================================================================================================================*/
			
		
		//++++++++++++++++++++++++++++++++++++++++ Attachment Add & Edit functionality on Maintenance -> Policy Tracking  screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
		 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attachchment document Image on Policy Tracking  screen", logval);
         StrPrimaryWindowHandle = driver.getWindowHandle();
         RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		 parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Add & Edit On Maintenance -> Policy Tracking  screen");
		 testcall2 = true;
		 RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
		 parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on Maintenance -> Policy Tracking  screen");
		 loggerval2 = logger.toString();
		 parentlogger.appendChild(logger);
	
	    //++++++++++++++++++++++++++++++++++++++++ Attachment Add & Edit functionality on Maintenance -> Policy Tracking  screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
		 
		//++++++++++++++++++++++++++++++++++++++++ Attachment Delete functionality on Maintenance -> Policy Tracking  screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
	     
	     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Delete On Maintenance -> Policy Tracking  screen");
	     testcall3 = true;
	     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
	     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on Maintenance -> Policy Tracking  screen");
	     loggerval3 = logger.toString();
	     parentlogger.appendChild(logger);
	    
	     driver.close();
		 driver.switchTo().window(StrPrimaryWindowHandle);	
	   //++++++++++++++++++++++++++++++++++++++++++ Attachment Delete functionality on Maintenance -> Policy Tracking  screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	

	} catch (Exception|Error e) {
		
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PolicyTracking_Utility" + " " +  "And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 else if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
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
  try 
	 {
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
	  driver.switchTo().frame(ParentFrame);
	  reports.endTest(parentlogger);	
	  reports.flush();
	 }
 }		
}


