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
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_292_Event
//Description    : RMA_TC_292_Event_Attachment Add, Edit & Delete On Event Screen 
//Depends On TC  : NA
//Revision       : 0.0 - MahendraPSingh-01-10-2017
//Revision       : 0.1 - MahendraPSingh-01-20-2017- Updated for attachment method call for Add_ edit & delete
//=================================================================================================

public class RMA_TC_292_Event extends RMA_TC_BaseTest {	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName; 
	
@Test 
public void RMA_TC_292_Event_Test() throws Exception, Error
{
try
	{
	 String StrPrimaryWindowHandle;
	
	 parentlogger = reports.startTest("RMA_TC_292_Event_Attachment Add, Edit & Delete On " + " " +color.RMA_ChangeColor_Utility("EVENT", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On Event Screen");
	 parentlogger.assignAuthor("Mahendra Singh");
     
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";	
	 testcall3 = false;
	 loggerval3 = "NotInitialized";	
	 StrScreenShotTCName = "RMA_TC_292_Event";
	 
	 RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
	 RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Risk Master Application Is Getting Loaded");
  /*===========================================================Creation Of Event Is Started Here================================================*/

	 parentlogger.log(LogStatus.INFO, "Following Test Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("TC003_Event Creation", "RMA_TC_003",0)+" To Create Event");
	 testcall1 = true;
	 RMA_TC_003 event = new RMA_TC_003();
	 StrClaimNumber_292 = event.EventCreation();  // Though its Event but Using the variable StrClaimNumber_292 to avoid unnecessary Creation of cases for Event alone
	 loggerval1 = logger.toString();
	 parentlogger.log(LogStatus.INFO, "New Event Is Created With Event Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
	 parentlogger.appendChild(logger);
 /*===========================================================Creation Of Event Is Completed Here================================================*/

//++++++++++++++++++++++++++++++++++++++++Attachment Add & edit functionality on Event screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
     RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attachchment document Image on DRIVER screen", logval);
     StrPrimaryWindowHandle = driver.getWindowHandle();
     RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To verify attachment Add & Edit on Event screen");
     testcall2 = true;
     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
     parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on Event Screen for Event Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
     loggerval2 = logger.toString();
     parentlogger.appendChild(logger);
	
//++++++++++++++++++++++++++++++++++++++++Attachment Add & edit functionality on Event screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
	
//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on Event screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
     
     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To verify attachment Delete on Event screen");
     testcall3 = true;
     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on Event Screen for Event Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
     loggerval3 = logger.toString();
     parentlogger.appendChild(logger);
    
     driver.close();
	 driver.switchTo().window(StrPrimaryWindowHandle);	
//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on Event screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
	} catch (Exception|Error e)  {
				
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
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_003" + " " +  "And Hence The Test Case Is A Fail");
	 parentlogger.appendChild(logger);
	 }
	 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
	 {
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
	 parentlogger.appendChild(logger);
	 }
	 if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
	 {
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
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
public void RMA_FailureReport(ITestResult result) throws Exception  //All The Information Associated With The Test Case Is Stored In Result Variable
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
				  driver.switchTo().parentFrame();		
			      driver.switchTo().frame(ParentFrame);     
				  RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_292), "Expand Image Corresponding To Property Claim Link On Left Navigation Tree", logval);
			      } catch (Exception|Error e){
				   System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				   parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			 }
		     reports.endTest(parentlogger);	
			 reports.flush();				
			}
	  }		
}
