package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_Customization;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_077
//Description    : Successful Functionality Of View/Update Portal Logo & Create, Edit and Delete Portlet Using Portal Settings In Utilities Is Validated.
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-13-2016
//=================================================================================================

public class RMA_Smoke_TC_077 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_077_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_077_Functionality Of View/Update Portal Logo & Create, Edit and Delete Portlet Using Portal Settings", "Successful Functionality Of View/Update Portal Logo & Create, Edit and Delete Portlet Using Portal Settings In Utilities Is Validated. ");
			parentlogger.assignAuthor("Renu Verma");
	
			String StrBgcolorHexFormat;
			String StrLoginLabelHexFormat;
			String StrLoginvalueHexFormat;
			String StrRevertedBgcolorHexFormat;
			String StrRevertedLoginLabelHexFormat;
			String StrRevertedLoginvalueHexFormat;
			String StrNameofPortlet;
			String StrURLofPortlet;
			String StrEditedNameofPortlet;
			String StrEditedURLofPortlet;
			String StrPrimaryWindowHandle;		
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_077";
		
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			StrBgcolorHexFormat   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 0); // Background color Is Fetched From DataSheet RMA_TC_077
			StrLoginLabelHexFormat  =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 1); // Login Label Is Fetched From DataSheet RMA_TC_077
			StrLoginvalueHexFormat  =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 1, 2); // Login value Is Fetched From DataSheet RMA_TC_077
			StrRevertedBgcolorHexFormat= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 5, 0); // Reverted Background color Is Fetched From DataSheet RMA_TC_077
			StrRevertedLoginLabelHexFormat=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 5, 1); // Reverted Login Label Hex Format Value Is Fetched From DataSheet RMA_TC_077
			StrRevertedLoginvalueHexFormat  =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077",5, 2); // Reverted Login value Is Fetched From DataSheet RMA_TC_077
			StrURLofPortlet= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 9, 0); // URL of Portlet Is Fetched From DataSheet RMA_TC_077
			StrEditedURLofPortlet= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_077", 9, 1); // Edit Value Of URL of Portlet Is Fetched From DataSheet RMA_TC_077
			StrNameofPortlet=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Portlet_077_");
			StrEditedNameofPortlet=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedPortlet_077_");
					
			/*===================================Verify Functionality Of View/Update Portal Logo Is Started Here================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-PortalSettings", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			StrPrimaryWindowHandle = driver.getWindowHandle();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver), "View/Update Portal Logo Button On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_BgcolorHexFormat(driver), "'Please enter the background color in Hex Format' TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrBgcolorHexFormat, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_LoginLabelHexFormat(driver), "'Please enter the font color for login label in Hex Format' TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrLoginLabelHexFormat, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_LoginvalueHexFormat(driver), "'Please enter the font color for login value in Hex Format' TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrLoginvalueHexFormat, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Upload Banner");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();
			String PortletStyle=RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Lbl_LoginInfo(driver).getAttribute("style");
			String StrRGBLoginLabelHexFormat=RMA_GenericUsages_Utility.RMA_ColorCode_hex2Rgb(StrLoginLabelHexFormat);
			String StrRGBBgcolorHexFormat=RMA_GenericUsages_Utility.RMA_ColorCode_hex2Rgb(StrBgcolorHexFormat);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrRGBBgcolorHexFormat, PortletStyle, "Portlet Background Color", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification( StrRGBLoginLabelHexFormat, PortletStyle, "Portlet Login Label Color", logval);
			
			// Reverted View/Update Portal Logo Setting as Default View
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-PortalSettings", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver)));
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver), "View/Update Portal Logo Button On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_BgcolorHexFormat(driver), "'Please enter the background color in Hex Format' TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrRevertedBgcolorHexFormat, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_LoginLabelHexFormat(driver), "'Please enter the font color for login label in Hex Format' TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrRevertedLoginLabelHexFormat, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_LoginvalueHexFormat(driver), "'Please enter the font color for login value in Hex Format' TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrRevertedLoginvalueHexFormat, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			RMA_GenericUsages_Utility.RMA_ErrorMessageOnSave(false, "NA", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Upload Banner");
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();
			String RevertedPortletStyle=RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DefaultView_Lbl_LoginInfo(driver).getAttribute("style");
			String StrRevertedRGBLoginLabelHexFormat=RMA_GenericUsages_Utility.RMA_ColorCode_hex2Rgb(StrRevertedLoginLabelHexFormat);
			String StrRevertedRGBBgcolorHexFormat=RMA_GenericUsages_Utility.RMA_ColorCode_hex2Rgb(StrRevertedBgcolorHexFormat);
			RMA_Verification_Utility.RMA_PartialTextVerification(StrRevertedRGBLoginLabelHexFormat, RevertedPortletStyle, "Portlet Background Color", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification( StrRevertedRGBBgcolorHexFormat, RevertedPortletStyle, "Portlet Login Label Color", logval);
			/*===================================Verify Functionality Of View/Update Portal Logo Is Ended Here================================================*/
			
			/*===================================Creation Of New Portlet Is Started Here================================================*/
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-PortalSettings", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Img_New(driver), "New Image On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_NameofPortlet(driver), "Name Of Portlet TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrNameofPortlet, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_URLofPortlet(driver), "'URL Of Portlet TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrURLofPortlet, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_Ok(driver), "Ok Button On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			RMA_Functionality_Utility.RMA_GenericSave_Utility("PortalCustomize", false,"NA", "Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-PortalSettings", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver)));
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Grid(driver),StrNameofPortlet , 5, StrURLofPortlet, "Common Portlets Customization Grid", logval);
			/*===================================Creation Of New Portlet Is Ended Here================================================*/
		
			/*===================================Edit Created Portlet Is Started Here================================================*/
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Grid(driver), StrNameofPortlet, "RADIOBUTTON", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Img_Edit(driver), "Edit Image On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_NameofPortlet(driver), "Name Of Portlet TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrEditedNameofPortlet, logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Txt_URLofPortlet(driver), "'URL Of Portlet TextBox On Utilities -->UI Admins -->Customization -->Portal Setting Page", StrEditedURLofPortlet, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_Ok(driver), "Ok Button On Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			driver.switchTo().window(StrPrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			RMA_Functionality_Utility.RMA_GenericSave_Utility("PortalCustomize", false,"NA", "Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Bank Account Page", logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-UIAdmins-Customization-PortalSettings", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("PortalCustomize");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Btn_ViewUpdatePortal(driver)));
			RMA_Verification_Utility.RMA_TableSingleTextVerify_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Grid(driver),StrEditedNameofPortlet , 5, StrEditedURLofPortlet, "Common Portlets Customization Grid", logval);
			/*===================================Edit Created Portlet Is Ended Here================================================*/
			
			/*===================================Delete Created Portlet Is Started Here================================================*/
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Grid(driver), StrEditedNameofPortlet, "RADIOBUTTON", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Utilities -->UI Admins -->Customization -->Portal Setting Page", 4)+ "", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Utilities -->UI Admins -->Customization -->Portal Setting Page", 4)+ " " + "Is Clicked");
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Complete","You can choose to delete the selected common portlet", "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Utilities -->UI Admins -->Customization -->Portal Setting Page", 4), logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("PortalCustomize", false, "NA", "Utilities -->UI Admins -->Customization -->Portal Setting Page", logval);
			//RMA_NegativeVerification_Utility.RMA_NegSingleTextVerifyInTable_Utility(RMA_Selenium_POM_Utilities_Customization.RMAApp_CustPortalSetting_Grid(driver),StrEditedNameofPortlet_077, 5, StrEditedURLofPortlet_077, "Common Portlets Customization Grid", logval);
			/*===================================Delete Created Portlet Is Ended Here================================================*/				
			
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

