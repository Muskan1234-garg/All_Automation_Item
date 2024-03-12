package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_295
//Description    : RMA_TC_295_Attachment Add, Edit & Delete On Defendant Screen Of A CLAIM
//Depends On TC  : RMA_TC_292
//Revision       : 0.0 - MahendraPSingh-01-10-2017
//Revision       : 0.1 - MahendraPSingh-01-20-2017- Updated for attachment method call for Add_ edit & delete
//=================================================================================================


public class RMA_TC_295 extends RMA_TC_BaseTest {	
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	
@Test 
public void RMA_TC_295_Test() throws Exception, Error
{
 try
	{
	 parentlogger = reports.startTest("RMA_TC_295_Attachment Add, Edit & Delete On "+ " "+ color.RMA_ChangeColor_Utility("CLAIM-> Defendant ", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On Defendant Screen of a CLAIM");
	 parentlogger.assignAuthor("Mahendra Singh");
			
	 String StrDefendantLastName;	
	 String StrPrimaryWindowHandle;    
	 //Local Variable Declaration Completed Here	
	
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
     loggerval2 = "NotInitialized";	
     StrScreenShotTCName = "RMA_TC_295";
     
     RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Frame is switched to Main Menu frame");
				
//+++++++++++++++++++++++++++++++++++++++++++Defendant addition to a claim utility is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
	 parentlogger.log(LogStatus.INFO, "HTML", "The Functional Utility:: RMA_ClaimEntityAddition_Utility Is Called To Create A Defendant On CLAIM" );
	 testcall1 = true;
	 StrDefendantLastName = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Defendant", "Defendant (0)", StrClaimNumber_292, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
	 parentlogger.log(LogStatus.INFO, "New Defendant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrDefendantLastName, 2) + " " +"To CLAIM Number::" + color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
	 loggerval1 = logger.toString();
	 parentlogger.appendChild(logger);
//+++++++++++++++++++++++++++++++++++++++++++Defendant addition to a claim utility is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
	
//++++++++++++++++++++++++++++++++++++++++Attachment Add,edit functionality on Defendant screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents image on Defendant page", logval);
     StrPrimaryWindowHandle = driver.getWindowHandle();
     RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	 parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Add & Edit On Defendant screen");
	 testcall2 = true;
	 RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
	 parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on Defendant Screen for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
	 loggerval2 = logger.toString();
	 parentlogger.appendChild(logger);
	
//++++++++++++++++++++++++++++++++++++++++Attachment Add,edit  functionality on Defendant screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
 //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on Defendant screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
     
     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Delete on Defendant screen");
     testcall3 = true;
     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on Defendant Screen for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
     loggerval3 = logger.toString();
     parentlogger.appendChild(logger);
    
     driver.close();
	 driver.switchTo().window(StrPrimaryWindowHandle);	
//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on Defendant screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
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
	 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		    driver.switchTo().frame(ParentFrame);
		    reports.endTest(parentlogger);	
		    reports.flush();
		   }
}		
}


