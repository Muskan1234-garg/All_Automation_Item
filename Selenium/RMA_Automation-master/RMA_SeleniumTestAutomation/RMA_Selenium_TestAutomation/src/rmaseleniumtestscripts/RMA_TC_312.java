package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================================
//TestCaseID     : RMA_TC_312
//Description    : RMA_TC_312_Attachment Add, Edit & Delete On Maintenance -> Medical Staff screen
//Depends On TC  : NA
//Revision       : 0.0 - MahendraPSingh-02-24-2017
//=================================================================================================================

public class RMA_TC_312 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String StrMedicalStaffLastName;
	
@Test	
public void RMA_TC_312_Test() throws Exception, Error
  {   
	try {
		String StrPrimaryWindowHandle;  
		
		parentlogger = reports.startTest("RMA_TC_312_Attachment Add, Edit & Delete On "+ " "+ color.RMA_ChangeColor_Utility("Maintenance -> Medical Staff", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On Maintenance -> Medical Staff screen");
		parentlogger.assignAuthor("Mahendra Singh");
				
		testcall1 = false;
		loggerval1 = "NotInitialized";	
		testcall2 = false;
	    loggerval2 = "NotInitialized";
		testcall3 = false;
	    loggerval3 = "NotInitialized";
	    StrScreenShotTCName = "RMA_TC_312";
	    
	    RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
	    
		driver.switchTo().parentFrame();
		driver.switchTo().frame(ParentFrame);
	    
		//++++++++++++++++++++++++++++++++++++++++ Step Maintenance -> Medical Staff Addition Started Here ++++++++++++++++++++++++++++++++++++++++++++++++	
	  
	    parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Medical Staff ");
		testcall1 = true;
		StrMedicalStaffLastName = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("MedicalStaff", logval1);
		parentlogger.log(LogStatus.INFO, "New Medical Staff Is Created Successfully With Medical Staff Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Medical Staff Is Added From Maintenance", StrScreenShotTCName)));
		//++++++++++++++++++++++++++++++++++++++++  Step Maintenance -> Medical Staff Additon Finished Here ++++++++++++++++++++++++++++++++++++++++++++++++	
		
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Medical Staff"));
		
		//++++++++++++++++++++++++++++++++++++++++ Attachment Add & Edit functionality on Maintenance -> Medical Staff screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
		 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attachchment document Image on Medical Staff screen", logval);
         StrPrimaryWindowHandle = driver.getWindowHandle();
         RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		 parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Add & Edit On Maintenance -> Medical Staff screen");
		 testcall2 = true;
		 RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
		 parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on Maintenance -> Medical Staff screen");
		 loggerval2 = logger.toString();
		 parentlogger.appendChild(logger);
	
	    //++++++++++++++++++++++++++++++++++++++++ Attachment Add & Edit functionality on Maintenance -> Medical Staff screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
		 
		//++++++++++++++++++++++++++++++++++++++++ Attachment Delete functionality on Maintenance -> Medical Staff screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
	     
	     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Delete On Maintenance -> Medical Staff screen");
	     testcall3 = true;
	     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
	     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on Maintenance -> Medical Staff screen");
	     loggerval3 = logger.toString();
	     parentlogger.appendChild(logger);
	    
	     driver.close();
		 driver.switchTo().window(StrPrimaryWindowHandle);	
	   //++++++++++++++++++++++++++++++++++++++++++ Attachment Delete functionality on Maintenance -> Medical Staff screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
	
	
	
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_MaintEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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


