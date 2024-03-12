package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_SystemUsers;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_Customization;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_082
//Description    : Successfully Creation, Edition and Deletion Of Web Link Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-16-2016
//=================================================================================================

public class RMA_Smoke_TC_082 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_082_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_082_Create, Edit and Delete Web Link", "Successfully Verify that you can setup Web Links Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			String URLShortName;
			String URLString;
			String EditedURLShortName;
			String EditedURLString;
			String URLWindowTitle;
			String EditedURLWindowTitle;
			String PrimaryWindowHandle;
			String RMAApp_Login_Txt_UserName;
			
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_082";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			URLString= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_082", 1, 0); // URL StringValue Is Fetched From DataSheet RMA_TC_082
			EditedURLString= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_082", 1, 1); // Edited URL StringValue Is Fetched From DataSheet RMA_TC_082
			URLWindowTitle=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_082", 1, 2); // URL Window Title Value Is Fetched From DataSheet RMA_TC_082
			EditedURLWindowTitle=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_082", 1, 3); // Edited URL Window Title Value Is Fetched From DataSheet RMA_TC_082
			RMA_ExcelDataRetrieval_Utility ExcelData1 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data
			RMAApp_Login_Txt_UserName=ExcelData1.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			URLShortName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC82_WebLink_");
			EditedURLShortName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedTC82_WebLink_");
					
			//===========================================================Creation Of Web Link Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-WebLinksSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("WebLinks");			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Img_New(driver), "New Image On Web Links Setup Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_ShortName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_ShortName(driver), "URL Short Name TextBox on Web Links Setup Page", URLShortName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_URLString(driver), "URL String TextBox on Web Links Setup Page", URLString, logval);
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Btn_User(driver), "User Button On Web Links Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Generic_BtnName(driver, "Ok")));	
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Table_SystemUser(driver), RMAApp_Login_Txt_UserName, "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SystemUsers.RMAApp_SystemUsers_Generic_BtnName(driver, "Ok"), "Ok Button on System User(s) Page", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("WebLinks");
			RMA_Functionality_Utility.RMA_GenericSave_Utility("WebLinks", false, "NA", "Web Links Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("MyWork-WebLinks", logval);
			RMA_Verification_Utility.RMA_TextCompare(URLShortName,RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, URLShortName).getText(), URLShortName+" Web Link on MDI Menu", logval);
			RMA_Navigation_Utility.RMA_MDIMenuClick(URLShortName, logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_TextCompare(URLWindowTitle,driver.getTitle(), "Window Title", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle(URLWindowTitle);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			//===========================================================Creation Of Web Link Is Ended Here===========================================================
			
			//===========================================================Edition Of Web Link Is Started Here===========================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-WebLinksSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("WebLinks");			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Lst_SelectedURL(driver), URLShortName, "Selected URL List", "Web Links Setup Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_ShortName(driver), "URL Short Name TextBox on Web Links Setup Page", EditedURLShortName , logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Txt_URLString(driver), "URL String TextBox on Web Links Setup Page", EditedURLString, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Rdb_URLShortName(driver, "Public"), "URL Short Name Radio Option on Web Links Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("WebLinks", false, "NA", "Web Links Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("MyWork-WebLinks", logval);
			RMA_Verification_Utility.RMA_TextCompare(EditedURLShortName,RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, EditedURLShortName).getText(), EditedURLShortName+" Web Link on MDI Menu", logval);
			RMA_Navigation_Utility.RMA_MDIMenuClick(EditedURLShortName, logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Verification_Utility.RMA_TextCompare(EditedURLWindowTitle,driver.getTitle(),"Window Title", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle(EditedURLWindowTitle);
			//============================================ ===============Edition Of Web Link Is Ended Here===========================================================
		
			//===========================================================Deletion Of Web Link Is Started Here===========================================================
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-WebLinksSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("WebLinks");			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Lst_SelectedURL(driver), EditedURLShortName, "Selected URL List", "Web Links Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustWebLink_Img_Delete(driver), "Delete Image On Web Links Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("MyWork-WebLinks", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, EditedURLShortName), EditedURLShortName+" Web Link on MDI Menu", logval);
			//===========================================================Deletion Of Web Link Is Ended Here===========================================================
					
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

