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
//TestCaseID     : RMA_Smoke_TC_021
//Description    : RMA_Smoke_TC_21_Verify Attachment of Documents Happens In Claim Successfully.
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-07-22-2016
//Modify By	:0.1 -RenuVerma-01-24-2017 Change the input file and its location
//Modify By	:0.2 -MahendraPSingh-02-22-2017 - Updated Attachment Method & its Call, First to Add, Edit And Second For Delete 
//=================================================================================================

public class RMA_Smoke_TC_021 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_21_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_21_Document Attachment On Claim", "Verify Attachment of Documents Happens In Claim Successfully");
			parentlogger.assignAuthor("Imteyaz Ahmad");
			
			String PhysicalPath;
			String FileSize;
			String StrPrimaryWindowHandle;
			//Local Variable Declaration Completed Here
			
			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "RMA_Smoke_TC_021";
			PhysicalPath = System.getProperty("user.dir")+"\\RMATestInputFile\\UploadTestFile\\RightClick.txt";
			FileSize = "0.0393 MB";
			
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrClaimNumber_002, "Left Navigation Tree", logval);// Claim Link Is Clicked To Load Claim Page
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Claim :"+" "+StrClaimNumber_002, logval);
		    StrPrimaryWindowHandle = driver.getWindowHandle();
		    RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		     
			//***************************************************Add, Edit  Of Document Is Started***************************************************************************
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Attachment_Add_Edit_Email_Delete","Attachment_Add_Edit_Email_Delete",0)+" Is Called To Add And Edit Attached Document On Claim :"+" "+StrClaimNumber_002);
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached AND Edited Successfully On Claim :"+" "+StrClaimNumber_002);
			parentlogger.appendChild(logger);
			//***************************************************Add, Edit Of Document Is Completed***************************************************************************
			
			 //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on CLAIM screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
		     
		     parentlogger.log(LogStatus.INFO, "Following Function Is Called ::" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Attachment_Add_Edit_Email_Delete","Attachment_Add_Edit_Email_Delete",0)+" Is Called To  Delete Attached Document On Claim :"+" "+StrClaimNumber_002);
		     testcall3 = true;
		     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
		     parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Claim :"+" "+StrClaimNumber_002);
		     loggerval3 = logger.toString();
		     parentlogger.appendChild(logger);
		    
		     driver.close();
			 driver.switchTo().window(StrPrimaryWindowHandle);	
		    //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on CLAIM screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
		
			 
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);						
					
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

