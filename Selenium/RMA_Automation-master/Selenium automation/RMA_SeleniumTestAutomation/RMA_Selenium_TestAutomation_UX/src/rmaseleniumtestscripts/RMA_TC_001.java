package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;

//=============================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_001
//Description    : Successful Login To The Application, Correct Application Page Title  And Correct User After Login Is Verified
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-05-18-2017
//=============================================================================================================================================================================================================================================================================
public class RMA_TC_001 extends rmaseleniumtestscripts.RMA_TC_BaseTest{	

@Test
public void RMAApp_login() throws Exception,Error
{
try{
	parentlogger = reports.startTest("TC_001_RiskMaster Login Verification","Successful Login To The Application, Correct Application Page Title  And Correct User After Login Is Verified");
	parentlogger.assignAuthor("Kumud Naithani");
	String Login_Txt_UserName;
	String Login_Txt_Password;
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "TC_001";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;	
	//Value Assignment to Required Variables Is Completed
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
	Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
	//Data Fetch From Excel WorkBook Is Completed
				
	parentlogger.log(LogStatus.INFO, "Rismaster Application URL Is Provided And Application Is Started");
	//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
	testcall1 = true;
	RMA_Functionality_Utility.RMA_Application_Login(Login_Txt_UserName, Login_Txt_Password, logval1);
	parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(Login_Txt_UserName, 2));
	loggerval1 = logger.toString();
	parentlogger.appendChild(logger);
	//==============================SSteps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================
	}catch(Exception|Error e){
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not handled Exception And Print Log Of It
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
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
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
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
		//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
		 if (RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Cmb_DataSourceName(driver)== null)
		{
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
		 
		 }
		//==============================Steps To Navigate To RMA Claim System Completed Here===========================================================================================================================================================================================================================
		//Since Till Here No Frame Navigation Is Done Hence Not Added Code For Parent Frame Switch Or Any Other Frame Switch
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}
