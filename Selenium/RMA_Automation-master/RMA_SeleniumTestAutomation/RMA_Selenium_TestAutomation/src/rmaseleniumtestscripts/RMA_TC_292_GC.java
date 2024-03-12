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
//TestCaseID     : RMA_TC_292_GC
//Description    : RMA_TC_292_GC_Verify Adding,Editing And Deleting Of Attachment on GC CLAIM Page 
//Depends On TC  : NA
//Revision       : 0.0 - MahendraPSingh-01-10-2017
//Revision       : 0.1 - MahendraPSingh-01-20-2017- Updated for attachment method call for Add_ edit & delete
//=================================================================================================

public class RMA_TC_292_GC extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_TC_292_GC_Test () throws Exception, Error
{
try {
     parentlogger = reports.startTest("RMA_TC_292_GC_Attachment Add, Edit & Delete On" + " "+ color.RMA_ChangeColor_Utility("GC CLAIM", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On GC CLAIM Screen");
	 parentlogger.assignAuthor("Mahendra Singh");
			
	 testcall1 = false;
	 loggerval1 = "NotInitialized";		
	 testcall2 = false;
	 loggerval2 = "NotInitialized";
	 testcall3 = false;
	 loggerval3 = "NotInitialized";
	 StrScreenShotTCName = "RMA_TC_292";
	 String StrPrimaryWindowHandle;
					
     RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
     driver.switchTo().parentFrame();
			
//++++++++++++++++++++++++++++++++++++++++General GC CLAIM creation test is called++++++++++++++++++++++++++++++++++++++++++++++++
     parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A General GC CLAIM:: RMA_TC_004");
 
     testcall1 = true;
     RMA_TC_004 NewGCCLAIM = new RMA_TC_004();
     StrClaimNumber_292 = NewGCCLAIM.GeneralClaimCreation();  //GC CLAIM no is saved in variable StrGC CLAIMNumber292
     loggerval1 = logger.toString();
     parentlogger.log(LogStatus.INFO, "A New GC CLAIM Is Created With GC CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
     parentlogger.appendChild(logger);
//++++++++++++++++++++++++++++++++++++++++General GC CLAIM creation is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
     
     RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_292);
     
//++++++++++++++++++++++++++++++++++++++++Attachment Add & edit functionality on GC CLAIM screen is started here  ++++++++++++++++++++++++++++++++++++++++++++++++	
     RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents image on General GC CLAIM Page", logval);
     StrPrimaryWindowHandle = driver.getWindowHandle();
     RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To verify attachment Add & Edit on GC CLAIM screen");
     testcall2 = true;
     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
     parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on GC CLAIM Screen for GC CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
     loggerval2 = logger.toString();
     parentlogger.appendChild(logger);
     
//++++++++++++++++++++++++++++++++++++++++Attachment Add & edit functionality on GC CLAIM screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	

//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on GC CLAIM  screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
     
     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To verify attachment Delete on Event screen");
     testcall3 = true;
     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on GC CLAIM Screen for GC Claim Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
     loggerval3 = logger.toString();
     parentlogger.appendChild(logger);
    
     driver.close();
	 driver.switchTo().window(StrPrimaryWindowHandle);	
//++++++++++++++++++++++++++++++++++++++++Attachment Delete functionality on GC CLAIM screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
  
   } catch (Exception| Error e) {
    	 
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
		logger.log(LogStatus.FAIL, "Following Error Occurred::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
	 }
	 else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
	 {
		logger.log(LogStatus.FAIL, "Following Error Occurred::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
	 }
	 else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
	 {
		logger.log(LogStatus.FAIL, "Following Error Occurred::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
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
				  RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Expand Image Corresponding To  GC CLAIM Link On Left Navigation Tree", logval);
			    } catch (Exception|Error e){
				  System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				  parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			  }
		     reports.endTest(parentlogger);	
			 reports.flush();			
		}
	  }		
}




