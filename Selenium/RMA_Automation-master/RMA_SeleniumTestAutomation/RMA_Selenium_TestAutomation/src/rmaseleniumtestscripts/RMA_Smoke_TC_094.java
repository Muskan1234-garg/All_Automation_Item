package rmaseleniumtestscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_094
//Description    : Successfully Verify The Functionality Of Claim Involvement History on Workers' Comp Claim
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - RenuVerma-01-27-2017 
//=================================================================================================

public class RMA_Smoke_TC_094 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_094_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_094_Claim Involvement History On WC Claim", "Successfully Verify The Functionality Of Claim Involvement History on Workers' Comp Claim");
			parentlogger.assignAuthor("Renu Verma");
			
			StrScreenShotTCName = "Smoke_TC_094";
			testcall1 = false;	
			loggerval1 = "NotInitialized";

			//===============================================Claim Involvement History On Workers Comp Is Started Here=====================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employee Info"), "Employee Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Img_EmployeeClaimHistory(driver), "Employee Claim History Image Under Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmpClaimHis_Tbl_EmployeeClaimHistory(driver), StrClaimNumber_002, 4 ,"O Open","Employee Claim History Table", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmpClaimHis_Btn_Print(driver), "Print Button On Claim Involvement History Page" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(12, logval, "Wait Is Added So That Print Window Pop Up Is Successfully Loaded");
			//RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_Print_Btn_Cancel(), "Cancel Button On Print Window Popup", logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Cancel Button On Print Window Popup Is Clicked And Dissappered");
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmpClaimHis_Btn_Cancel(driver), "Cancel Button On Claim Involvement History Page" , logval);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			driver.switchTo().window(StrRMAWindowHandle);
			//===============================================Claim Involvement History On Workers Comp Is Ended Here=====================================================================================================	
			
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
			
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_PrintPreview_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {
			String TestCaseName;
			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
			
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}
	}
