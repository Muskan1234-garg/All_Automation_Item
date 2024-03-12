package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//=======================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_021
//Description    : Verify That Attachment Can Be Created,Edited And Deleted Successfully From Claim Page Along-with Data Entry In Title, Subject, Notes, Keywords TextBox And NG Grid Search Filter Functionalities.
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-06-15-2017
//============================================================================================================================================================================================================================

public class RMA_Smoke_TC_021 extends RMA_TC_BaseTest {

	@Test
	public void RMA_Smoke_TC_21_Test() throws Exception,Error {

		loggerval1 = "NotInitialized";
		testcall1 = false;
		loggerval2 = "NotInitialized";
		testcall2 = false;
		StrScreenShotTCName = "RMA_Smoke_TC_021";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed Here

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_21_Document Attachment On Claim", "Verify That Attachment Can Be Created,Edited And Deleted Successfully From Claim Page Along-with Data Entry In Title, Subject, Notes, Keywords TextBox And NG Grid Search Filter Functionalities");
			parentlogger.assignAuthor("Renu Verma");

			String FileName;
			String FileSize;
			//Local Variable Declaration Completed Here

			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization Completed Here

			//***************************************************Add, Edit  Of Document Is Started*********************************************************************************************************************************************************************************************************************************
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Claim :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Claim :"+" "+StrClaimNumber);
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", FileName, FileSize, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached And Edited Successfully On Claim :"+" "+StrClaimNumber);
			parentlogger.appendChild(logger);
			//***************************************************Add, Edit Of Document Is Completed*********************************************************************************************************************************************************************************************************************************

			//***************************************************Attachment delete functionality on CLAIM screen is started here *********************************************************************************************************************************************************************************************************	
			parentlogger.log(LogStatus.INFO, "Following Function Is Called ::" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",1)+" Is Called To  Delete Attached Document On Claim :"+" "+StrClaimNumber);
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", FileName, FileSize, false, logval1);
			parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Claim :"+" "+StrClaimNumber);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();// switch to claim frame
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button Attchement Screen", logval);// close attachment screen
			Thread.sleep(5000);
			//***************************************************Attachment delete functionality on CLAIM screen is finished here *********************************************************************************************************************************************************************************************************	

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_Attachment_Add_Edit_Delete'" + " " +  "To Create And Edit An Attachment And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);

			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_Attachment_Add_Edit_Delete'" + " " +  "To Delete An Attachment And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
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
			try {
				System.out.println("k");
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

