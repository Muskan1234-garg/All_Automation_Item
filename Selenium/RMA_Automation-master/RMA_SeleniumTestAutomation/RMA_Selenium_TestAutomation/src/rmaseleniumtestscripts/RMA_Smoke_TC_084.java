package rmaseleniumtestscripts;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Sikuli_Images;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_Technicians;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_084
//Description    : Successfully Verify Creation Of A Record Using XML Import Functionality Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-28-2016
//=================================================================================================

public class RMA_Smoke_TC_084 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_084_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_084_Create A Record Using XML Import Functionality", "Successfully Verify Creation Of A Record Using XML Import Functionality Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			StrScreenShotTCName = "Smoke_TC_084";
			
			//===========================================================XML Import Functionality Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Technicians-XML Import-XMLImportTemplateGeneration", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("XML Import Template Generation");			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Technicians.RMAApp_TechXMLImport_Rdb_EventsAndClaims(driver), "Events And Claims Radio Button On XML Import Template Generation Page", logval);
			RMA_Selenium_POM_Utilities_Technicians.RMAApp_TechXMLImport_Rdb_EventsAndClaims(driver).sendKeys(Keys.PAGE_DOWN);// Navigate to page down as GenerateTemplate button is appearing below on the page in some machine(e.g. 32 machine)
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_XMLImport_Btn_GenerateTemplate(), "Generate Template Button on XML Import Template Generation Page", logval);//Focus is Getting lost when used Selenium Webdriver, therefore  Click Generate Template Button through Sikuli instead of Selenium webdriver
			if(RMAApp_BrowserName.equalsIgnoreCase("IE"))
			{
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_SavePopUp_Btn_Save(), "Save Button Bottom On Notification popup on XML Import Template Generation Page", logval);
			RMA_Verification_Utility.RMA_SikuliPatternExist_Utility(RMA_Selenium_POM_Sikuli_Images.RMAApp_XMLImport_Text_XMLDownload(RMAApp_BrowserName),"XML downloaded successfully Text Pattern", logval);
			RMA_Navigation_Utility.RMA_SikuliObjectClick(RMA_Selenium_POM_Sikuli_Images.RMAApp_PopUp_Btn_CloseX(), "Close X Image On Bottom Notification popup on XML Import Template Generation Page", logval);
			}
			if(RMAApp_BrowserName.equalsIgnoreCase("Chrome"))
			{
			RMA_Verification_Utility.RMA_SikuliPatternExist_Utility(RMA_Selenium_POM_Sikuli_Images.RMAApp_XMLImport_Text_XMLDownload(RMAApp_BrowserName),"XML downloaded successfully Text Pattern", logval);
			}
			//===========================================================XML Import Functionality Is Ended Here===========================================================
			
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

