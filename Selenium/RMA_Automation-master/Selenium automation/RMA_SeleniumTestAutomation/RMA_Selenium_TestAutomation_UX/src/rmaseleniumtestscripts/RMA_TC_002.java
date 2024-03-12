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

//================================================================================================
//TestCaseID     : RMA_TC_002
//Description    : Successful DSN Selection Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-05-19-2017 
//=================================================================================================
public class RMA_TC_002 extends rmaseleniumtestscripts.RMA_TC_BaseTest
{
@Test
public void RMAApp_DSNSelection() throws Exception, Error
{
	try {
		parentlogger = reports.startTest("TC_002_RiskMaster DSN Selection", "Required DSN Is Selected And DataSource Label On Application DashBoard Is Verified");
		parentlogger.assignAuthor("Kumud Naithani");
		String DSNSelect_Lst_DataSourceName;
		//Local Variable Declaration
		
		StrScreenShotTCName = null;
		StrScreenShotTCName = "TC_002";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		//Value Assignment to Required Variables Is Completed
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002
		//Data Fetch From Excel WorkBook Is Completed
		
		//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
		testcall1 = true;
		RMA_Functionality_Utility.RMA_DataSourceSelection(DSNSelect_Lst_DataSourceName, logval1);
		parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(DSNSelect_Lst_DataSourceName, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		//==============================Steps To Select Required DataSource And Navigate To DashBaord Completed Here===========================================================================================================================================================================================================================
		
	} catch (Exception |Error e) {
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
		StackTraceElement[] TraceElement = e.getStackTrace();
		 for (StackTraceElement ObjectName : TraceElement)
		 {
			if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
		 }
		 if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_DataSource_Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);	
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
	 try {
		//==============================Steps To Navigate To RMA Claim System Started Here===========================================================================================================================================================================================================================
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Navigation Option Label On RiskMaster Application'sDashboard Page",logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		StrRMAUXWindowHandle = driver.getWindowHandle();
		//globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Img_RecentlyViewed(driver)));
		Thread.sleep(15000);
		//==============================Steps To Navigate To RMA Claim System Completed Here===========================================================================================================================================================================================================================
		//Since Till Here No Frame Navigation Is Done Hence Not Added Code For Parent Frame Switch Or Any Other Frame Switch
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		logger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}
