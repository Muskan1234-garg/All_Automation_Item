package rmaseleniumtestscripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM_UX.RMA_Selenium_POM_PowerView;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Vehicle_TC_011
//Description    : Verify When User Changes The Order Of ToolbarButton In UX PV Then The Same Is Reflected In UX Is Validated
//Depends On TC  : None
//Revision       : 0.0 - NikitaThani-02-23-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Vehicle_TC_011 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Vehicle_TC_011_Test() throws Exception,Error{
		try{
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_011_Verify When User Changes The Order Of ToolbarButton In UX PV Then The Same Is Reflected In UX", "Verify When User Changes The Order Of ToolbarButton In UX PV Then The Same Is Reflected In UX Is Validated");
			parentlogger.assignAuthor("Nikita Thani");
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Vehicle_TC_011";
			ErrorMessage = null;
			//Global Variables Declaration Completed here

			String RMAApp_Lst_DataSourceName;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String RMAApp_Login_Txt_UserName1;
			String RMAApp_Login_Txt_Password1;
			int Flag=0;
			String Option=null;
			String StrExpected=null;
			int FlagVerify=0;
			String OptionVerify=null;
			String StrExpectedVerify=null;
			//Local Variables Declaration Completed

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite01_Maint_Vehicle_Module.xlsx"); //Excel WorkBook RMA_Suite01_Maint_Vehicle_Module IS Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_011", 1, 0); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_011
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_011", 1, 1); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_011
			RMAApp_Login_Txt_UserName1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_011", 1, 2); //UserName Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_011
			RMAApp_Login_Txt_Password1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_011", 1, 3); //Password Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_011
			RMAApp_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Vehicle_PV_TC_011", DSRow, 4); //Data Source Name Is Fetched From DataSheet RMA_Reg_Maint_Vehicle_PV_TC_011			
			//Data Fetch From Excel WorkBook Is Completed

			//===========================================================Application LogOut And Re-Login Is Started Here================================================================================================
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "Username TextBox On RMA Application Login Page", RMAApp_Login_Txt_UserName, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver),"Password TextBox On RMA_Application Login Page", RMAApp_Login_Txt_Password, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "Login Button On RMA Application Login Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//===========================================================Application LogOut And Re-Login Is Completed Here================================================================================================

			//===========================================================Maintenance Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Maintenance(driver), "Maintenance Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			StrRMAMaintUXWindowHandle = driver.getWindowHandle();
			//===========================================================Maintenance Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Vehicle", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame );
			//Vehicle Creation Page Is Opened

			//==========================================Function TO Verify Sequence Of ToolBar Buttons Started Here================================================================================
			String [] expected={"Save","Delete Record","Diary","Record Summary","Attach Documents","Mail Merge","Lookup"};
			List<WebElement> UX_row = driver.findElements(By.xpath(".//*[@ng-style='{color: $root.dynamicThemeNew}']//ancestor::a"));
			if(expected.length!=UX_row.size()){
				System.out.println("fail");				
			}

			for(int i=0;i<expected.length;i++){
				Option=UX_row.get(i).getAttribute("uib-tooltip");
				if(Option.equals(expected[i])){}
				else
				{
					Flag++;
					StrExpected=expected[i];
					break;
				}
			}
			if(Flag!=0)
			{
				parentlogger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(StrExpected, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(Option, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility("ToolBar Buttons", 4) + " " + "ToolTip Verification Is UnSuccessful" );
			}
			else{
				parentlogger.log(LogStatus.PASS, "Expected ToolTip And Actual ToolTip Of All Elements Are Same And Hence Sequence Verification Is Successful For All Elements");
			}
			//===========================================Function To Verify Sequence Of ToolBar Buttons Completed Here===================================================================================

			//===========================================================Utilities Screen Navigation Is Started Here================================================================================================================================================================================================================================================================
			driver.switchTo().window(StrRMAWindowHandle);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DashBoard_Lbl_Utilities(driver), "Utilities Navigation Option Label On RiskMaster Application's Dashboard Page",logval);
			RMA_GenericUsages_Utility.RMA_MultipleWindowSwitching_Utility(3, StrRMAWindowHandle, StrRMAUXWindowHandle, "NA", "NA","NA", "Navigation To RMA Maintenance Screen", logval);	
			StrRMAUtilitiesUXWindowHandle = driver.getWindowHandle();
			//===========================================================Utilities Screen Navigation Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Changes Made In Power View Editor Are Started Here=================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Vehicle"), "PowerView Link On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Vehicle Maintenance"), "Vehicle Maintenance Label On Power View Editor Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver),"ToolBar DropDown Menu On Power View Editor Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_DropDownField(driver, "Mail Merge"), RMA_Selenium_POM_PowerView.RMAApp_PowerView_Area_ToolBarField(driver), "Mail Merge Field", "ToolBar DropDown Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//==========================================================Changes Made In Power View Editor Are Completed Here==========================================================================================================================================================================

			driver.switchTo().window(StrRMAMaintUXWindowHandle);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Vehicle Creation Page", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.VehicleFrame);

			//===================================================Function To Verify Sequence Of ToolBar Buttons Started Here=====================================================================================
			String [] expectedVerify={"Save","Delete Record","Diary","Mail Merge","Record Summary","Attach Documents","Lookup"};
			List<WebElement> UX_rowVerify = driver.findElements(By.xpath(".//*[@ng-style='{color: $root.dynamicThemeNew}']//ancestor::a"));

			if(expectedVerify.length!=UX_rowVerify.size()){
				System.out.println("fail");				
			}

			for(int i=0;i<expectedVerify.length;i++){
				OptionVerify=UX_rowVerify.get(i).getAttribute("uib-tooltip");
				if(OptionVerify.equals(expectedVerify[i])){}
				else
				{
					FlagVerify++;
					StrExpectedVerify=expectedVerify[i];
					break;
				}
			}
			if(FlagVerify!=0)
			{
				parentlogger.log(LogStatus.FAIL, "Expected ToolTip" + " "+ color.RMA_ChangeColor_Utility(StrExpectedVerify, 3) + " " + "And Actual ToolTip" + " " + color.RMA_ChangeColor_Utility(OptionVerify, 2) + " "  + "Are Not Same And Hence" + " " + color.RMA_ChangeColor_Utility("ToolBar Buttons", 4) + " " + "ToolTip Verification Is UnSuccessful" );
			}
			else{
				parentlogger.log(LogStatus.PASS, "Expected ToolTip And Actual ToolTip Of All Elements Are Same And Hence Sequence Verification Is Successful For All Elements");
			}
			//=====================================================Function TO Verify Sequence Of ToolBar Buttons Completed Here===============================================================================
			driver.close();
			//Verification Is Done After MAking Changes In Power View Editor

			driver.switchTo().window(StrRMAUtilitiesUXWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);

			//===========================================================Steps To Revert Changes Made In Power View Editor Are Started Here=================================================================================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-PowerViewEditor",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.PowerViewFrame);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_PowerViewName(driver, "Vehicle"), "PowerView Link On Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_Entity(driver, "Vehicle Maintenance"), "Vehicle Maintenance Label On Power View Editor Page", logval1);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_DropDwn_ToolbarMainForm(driver),"ToolBar DropDown Menu On Power View Editor Page ", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_DropDownField(driver, "Attach Documents"), RMA_Selenium_POM_PowerView.RMAApp_PowerView_Area_ToolBarField(driver), "Attach Documents Field", "ToolBar DropDown Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectDragAndDrop(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Lbl_DropDownField(driver, "Record Summary"), RMA_Selenium_POM_PowerView.RMAApp_PowerView_Area_ToolBarField(driver), "Record Summary Field", "ToolBar DropDown Area", "Power View Editor Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_PowerView.RMAApp_PowerView_Btn_Save(driver), "Save Image Button On Power View Editor Page", logval);
			//==========================================================Steps To Revert Changes Made In Power View Editor Are Completed Here==========================================================================================================================================================================

			//Application Is Logged Out
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Functionality_Utility.RMA_Application_Logout_UX(logval);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Application Is Logged Out

			//==============================Steps To Login Application And Verify Whether Correct User Logged In Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AppLogin","RMA_Application_Login",0)+" To Successfully Login RMA Application");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_Application_Login(RMAApp_Login_Txt_UserName1, RMAApp_Login_Txt_Password1, logval1);
			parentlogger.log(LogStatus.INFO, "Application Is Logged In Successfully With User"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Login_Txt_UserName1, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//==============================Steps To Login Application And Verify Whether Correct User Logged In Completed Here===========================================================================================================================================================================================================================

			//==============================Steps To Select Required DataSource And Navigate To DashBaord Started Here===========================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DataSourceSelect","RMA_DataSource_Selection",0)+" To Select Required DataSource");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_DataSourceSelection(RMAApp_Lst_DataSourceName, logval1);
			parentlogger.log(LogStatus.INFO, "Following Data Source Is Selected Successfully"+ " " + color.RMA_ChangeColor_Utility(RMAApp_Lst_DataSourceName, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Dashboard_Lbl_Claims(driver), "Claims Label From Dashboard", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			//==============================Steps To Select Required DataSource And Navigate To DashBaord Completed Here===========================================================================================================================================================================================================================			

		}
		catch(Exception|Error e)
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_Application_Login" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_DataSourceSelection" + " " +  "And Hence The Test Case Is A Fail");
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
		} catch (Exception|Error e) {	
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}	
		finally
		{
			try {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}

}
