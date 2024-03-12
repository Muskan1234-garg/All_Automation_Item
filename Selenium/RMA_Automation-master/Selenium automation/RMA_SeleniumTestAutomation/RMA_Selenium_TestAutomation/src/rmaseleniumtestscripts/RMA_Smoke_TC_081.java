package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import rmaseleniumPOM.RMA_Selenium_POM_Home;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Utilities_UIAdmins;
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
//TestCaseID     : RMA_Smoke_TC_081
//Description    : Successfully Creation, Edition and Deletion Of Power View Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-12-14-2016
//=================================================================================================

public class RMA_Smoke_TC_081 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_081_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_081_Create, Edit and Delete Power View", "Successfully Creation, Edition and Deletion Of Power View Is Validated");
			parentlogger.assignAuthor("Renu Verma");			

			String PowerViewName;
			String HomePageValue;
			String EditedPowerViewName;
			String AvailableUserName;
	
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_081";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			HomePageValue= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 0); // Home Page List Value Is Fetched From DataSheet RMA_TC_081
			AvailableUserName= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_081", 1, 1); // Available User List Value Is Fetched From DataSheet RMA_TC_081
			
			PowerViewName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "TC_081_View_");
			EditedPowerViewName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedTC_081_View_");
					
			//===========================================================Creation Of Power View Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-PowerviewEditor", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Powerview");			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "TestPowerView"), "TestPowerView Link On Powerview Editor Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "View definition for: "), "Lable name On Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Back to Views")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Back to Views"), "Back To Views Button on Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Create New")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Create New"), "Create New Button on Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Txt_ViewName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Txt_ViewName(driver), "View Name TextBox on Powerview Editor Page", PowerViewName, logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lst_HomePage(driver), HomePageValue, "Home Page List", "Powerview Editor Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Chk_Clone(driver), "check", "Clone Base View Checkbox", "Powerview Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Save"), "Save Button on Powerview Editor Page", logval);
			//===========================================================Creation Of Power View Is Ended Here===========================================================
			
			//===========================================================Edition Of Power View Is Started Here===========================================================
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lnk_PowerViewTable(driver, PowerViewName, "Edit")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lnk_PowerViewTable(driver, PowerViewName, "Edit"), "Edit Link Corresponding To "+PowerViewName +" PowerView On Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Txt_ViewName(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Txt_ViewName(driver), "View Name TextBox on Powerview Editor Page", EditedPowerViewName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Save"), "Save Button on Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, EditedPowerViewName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, EditedPowerViewName), EditedPowerViewName+" Link On Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lst_AvailableUser(driver)));
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lst_AvailableUser(driver),AvailableUserName, "Available User/Groups List", "Powerview Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Save"), "Save Button on Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Back to Views")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Generic_Btn(driver, "Back to Views"), "Back To Views Button on Powerview Editor Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lnk_PowerViewTable(driver, EditedPowerViewName, "Delete")));
			//===========================================================Edition Of Power View Is Ended Here===========================================================
			
			//===========================================================Deletion Of Power View Is Started Here===========================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lnk_PowerViewTable(driver, EditedPowerViewName, "Delete"), "Delete Link Corresponding To "+PowerViewName +" PowerView On Powerview Editor Page", logval);
			String Expmsg="View will be permanently deleted. Are you sure?";
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility(" PowerView On Powerview Editor Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("  PowerView On Powerview Editor Page", 4), logval);
			parentlogger.log(LogStatus.INFO,color.RMA_ChangeColor_Utility(PowerViewName , 3)+ " Is Not Deleted After Dismiss The Delete Popup.");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_UIAdmins.RMAApp_UIPowerView_Lnk_PowerViewTable(driver, EditedPowerViewName, "Delete"), "Delete Link Corresponding To "+PowerViewName +" PowerView On Powerview Editor Page", logval);	
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility(" PowerView On Powerview Editor Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver,"Yes");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, EditedPowerViewName), EditedPowerViewName+" Link in Power Views Setup Table on Powerview Editor Page", logval);		
			//===========================================================Deletion Of Power View Is Ended Here===========================================================
			
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

