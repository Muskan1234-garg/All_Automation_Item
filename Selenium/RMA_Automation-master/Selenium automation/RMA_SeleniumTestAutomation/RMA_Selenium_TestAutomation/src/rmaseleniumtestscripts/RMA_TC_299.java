package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;

//================================================================================================================
//TestCaseID     : RMA_TC_299
//Description    : RMA_TC_299_Attachment Add, Edit & Delete On CLAIM -> Person Involved-> Add New PHYSICIAN screen
//Depends On TC  : RMA_TC_292
//Revision       : 0.0 - MahendraPSingh-01-10-2017
//Revision       : 0.1 - MahendraPSingh-01-20-2017- Updated for attachment method call for Add_ edit & delete
//=================================================================================================================

public class RMA_TC_299 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String StrPhysicianNumber;
	
@Test	
public void RMA_TC_299_Test() throws Exception, Error
  {   
	try {
		 String StrPrimaryWindowHandle;
		
		parentlogger = reports.startTest("RMA_TC_299_Attachment Add, Edit & Delete On "+ " "+ color.RMA_ChangeColor_Utility("CLAIM -> Person Involved-> Add New PHYSICIAN", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On CLAIM -> Person Involved-> Add New PHYSICIAN screen");
		parentlogger.assignAuthor("Mahendra Singh");
				
		testcall1 = false;
		loggerval1 = "NotInitialized";	
		testcall2 = false;
	    loggerval2 = "NotInitialized";	
		testcall3 = false;
	    loggerval3 = "NotInitialized";	
	    StrScreenShotTCName = "RMA_TC_299";
	
	    RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Frame is switched to main menu frame");
	    
		//++++++++++++++++++++++++++++++++++++++++ Step CLAIM -> Person Involved-> Add New PHYSICIAN  Started Here ++++++++++++++++++++++++++++++++++++++++++++++++	
	    if (StrClaimNumber_292.contains("EVT"))
		{
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Event_PI(driver, StrClaimNumber_292), "Person Involved Link On Left Hand Navigation Tree", logval);
		}
		else 
		{	
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_292), "Person Involved Link On Left Hand Navigation Tree", logval); 
		}
	    parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create A PHYSICIAN");
		testcall1 = true;
		StrPhysicianNumber = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Physician", logval1);
		parentlogger.log(LogStatus.INFO, "New PHYSICIAN Is Created Successfully With PHYSICIAN Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianNumber, 2) +" " + "for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New PHYSICIAN Is Added As Persons Involved", StrScreenShotTCName)));
		//++++++++++++++++++++++++++++++++++++++++  Step CLAIM -> Person Involved-> Add New PHYSICIAN Finished Here ++++++++++++++++++++++++++++++++++++++++++++++++	
		
		//++++++++++++++++++++++++++++++++++++++++Attachment Add,edit  functionality on CLAIM -> Person Involved-> Add New PHYSICIAN screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
		 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents image on PHYSICIAN screen", logval);
	     StrPrimaryWindowHandle = driver.getWindowHandle();
	     RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		 parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Add & Edit On CLAIM -> Person Involved-> Add New PHYSICIAN screen");
		 testcall2 = true;
		 RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
		 parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on CLAIM -> Person Involved-> Add New PHYSICIAN screen for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
		 loggerval2 = logger.toString();
		 parentlogger.appendChild(logger);
	
	    //++++++++++++++++++++++++++++++++++++++++Attachment Add,edit  functionality on CLAIM -> Person Involved-> Add New PHYSICIAN screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
		
		//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on CLAIM -> Person Involved-> Add New PHYSICIAN screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
	     
	     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Delete on CLAIM -> Person Involved-> Add New PHYSICIAN screen");
	     testcall3 = true;
	     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
	     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on CLAIM -> Person Involved-> Add New PHYSICIAN screen for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
	     loggerval3 = logger.toString();
	     parentlogger.appendChild(logger);
	    
	     driver.close();
		 driver.switchTo().window(StrPrimaryWindowHandle);	
	   //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on  CLAIM -> Person Involved-> Add New PHYSICIAN screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PIAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	     try {
				driver.switchTo().parentFrame();		
		        driver.switchTo().frame(ParentFrame);
			    RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Frame is switched to main menu frame");
			    RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close button on default application view screen",logval);
		        } catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
		     }
		  reports.endTest(parentlogger);	
		  reports.flush();
	 }
 }		
}



