package rmaseleniumtestscripts_REGRESSION;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_SMS;
import rmaseleniumtestscripts.RMA_TC_002;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//===================================================================================================================================================================================================================================
//TestCaseID     : RMA_TC_024
//Description    : Functionality of General Claim Permission Setting On Security Management System Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-04-14-2017
//===================================================================================================================================================================================================================================
public class RMA_TC_024 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
@Test	
public void RMA_TC_024_Test() throws Exception, Error
{   
	try {	 	 
	String RMAApp_SMS_Lnk_DataSourceName;
	String RMAApp_SMS_Lnk_ModuleSecurityGroup;
	String RMAApp_SMS_Lnk_ModuleAccessPermission;
	String RMAApp_Login_Txt_UserName;
	String RMAApp_Login_Txt_Password;
	String LoginUserNameActual;
	//Local Variable Declaration Completed
	 
	 parentlogger = reports.startTest("RMA_TC_024 General Claim Permission Setting Validation", "Functionality of General Claim Permission Setting On Security Management System Is Validated");
	 parentlogger.assignAuthor("Kumud Naithani");
	 
	 StrScreenShotTCName = "TC_024";
	 loggerval1 = "NotInitialized";
	 testcall1 = false; 
	 loggerval2 = "NotInitialized";
	 testcall2 = false; 
	 
	 RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
	 RMAApp_SMS_Lnk_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", DSRow, 0); //Data Source Name Is Fetched From DataSheet RMA_TC_002	
	 RMA_ExcelDataRetrieval_Utility ExcelData_1 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite10_AdvancedSecurityManagementSystem.xlsx"); //Excel WorkBook RMA_RegressionSuite10_AdvancedSecurityManagementSystem Is Fetched To Retrieve Data 
	 RMAApp_SMS_Lnk_ModuleSecurityGroup = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_TC_024", 1, 0); //Module Security Group Name Is Fetched From DataSheet RMA_TC_024
	 RMAApp_SMS_Lnk_ModuleAccessPermission = ExcelData_1.RMA_ExcelStringDataRead_Utility("RMA_TC_024", 1, 1); //Module Access Permission Name Is Fetched From DataSheet RMA_TC_024	
	 RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
	 RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
	 //Data Fetch From Excel Data Sheet Is Completed
     
	 RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
	 
	//===========================================================Enabling Of "Use General Claim:" Setting In General System Parameters Is Started Here==================================================================================================================================================================================================================================================================================================================================================================
	 RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
	 RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
	 RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseGeneralClaim(driver), "uncheck", "Use General Claim: Checkbox", "General System Parameter Setup Page", logval);
	 RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseGeneralClaim(driver), "check", "Use General Claim: Checkbox", "General System Parameter Setup Page", logval);
	 //"Use General Claim: Check Box" Is Checked
	 
	 RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	 RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window On General System Parameter Setup Page", "USEMASTER", logval);
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window On General System Parameter Setup Page", logval);
	 driver.switchTo().window(StrRMAWindowHandle);
	 //Activation Code Is Set In Activation Code Window
	 
	 RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	 RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
	 RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
	 //=========================================================== Enabling Of "Use General Claim:" Setting In General System Parameters Is Completed Here=============================================================================================================================================================================================================================================================================================================================================================
	
	 //=========================================================== Disabling Of RiskMaster-->General Claims Permission In Security Management System Is Started Here===================================================================================================================================================================================================================================================================================================================================================
	 driver.switchTo().parentFrame();
	 RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
	 RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 //Security Management System Page Is Refreshed To Restore The Default State
	 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName),"Expand Image Of "+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
	 // Required Data Source Link Is Expanded
	 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link For Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup),color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+ " "+ "Module Security Group Link Of Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3) + " "+ "On Left Navigation Tree Of Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	// Required Module Security Group Link Is Expanded
	 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "General Claims"), "uncheck", "General Claims Checkbox", "Security Management System Page", logval);
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Revoke(driver),"Revoke Image On Module Access Permissions Block Of Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 driver.close();
	 driver.switchTo().window(StrRMAWindowHandle);
	 //Required Module Access Permissions Are Set
	 //===========================================================Disabling Of RiskMaster-->General Claims Permission In Security Management System Is Completed Here==================================================================================================================================================================================================================================================================================================================================================
	
	 //===========================================================Application LogOut And Re-Login Is Started Here======================================================================================================================================================================================================================================================================================================================================================================================================
	  RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
	  RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
	  //Application Is Logged Out
	  RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, logval);
	  RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, logval);
	  RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
	  //Application Is Logged In	
	  //===========================================================Application LogOut And Re-Login Is Completed Here===========================================================================================================================================================================================================================================================================================================================================================================================================
	  
	  //===========================================================Data Source Selection Is Started Here====================================================================================================================================================================================================================================================================================================================================================================================================================== 
	  parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
	  testcall1 = true;
	  RMA_TC_002 dsnselection = new RMA_TC_002();
	  dsnselection.RMAApp_DSNSelection();
	  loggerval1 = logger.toString();
	  parentlogger.appendChild(logger);

	  LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
	  RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName Display", logval);
	  // Correct User Is Logged In Verification Is Done
	  //===========================================================Data Source Selection Is Completed Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 
	 
	  //===========================================================Steps To Verify That General Claim Creation Menu Option Is Not Displayed Is Started Here=====================================================================================================================================================================================================================================================================================================================================================================
	  RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	  RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "General Claim"), "General Claim MDI Menu Link On RMA Application Default View", logval);  
	 //===========================================================Steps To Verify That General Claim Creation Menu Option Is Not Displayed Is Completed Here=================================================================================================================================================================================================================================================================================================================================================================
	
	  //=========================================================== Enabling Of RiskMaster-->General Claims Permission In Security Management System Is Started Here==========================================================================================================================================================================================================================================================================================================================================================
		 
	 RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Security-SecurityManagementSystem", logval);
	 RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Btn_Refresh(driver),"Refresh Image On Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 //Security Management System Page Is Refreshed To Restore The Default State
	 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources")));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "DataSources"),"Expand Image Of DataSources Link On Left Navigation Menu Tree Of Security Management System Page",logval);
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, RMAApp_SMS_Lnk_DataSourceName),"Expand Image Of "+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+ " "+"Link On Left Navigation Menu Tree Of Security Management System Page",logval);
	 // Required Data Source Link Is Expanded
	 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups")));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Img_ExpandCollapseLeftMenuLink(driver, "Module Security Groups"),"Expand Image Of Module Security Groups Link For Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMS_Lnk_LeftMenuLinkName(driver, RMAApp_SMS_Lnk_ModuleSecurityGroup),color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+ " "+ "Module Security Group Link Of Following DataSource:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_DataSourceName,3) + " "+ "On Left Navigation Tree Of Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	// Required Module Security Group Link Is Expanded
	 
	 globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission)));
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Img_ExpandCollapse(driver, RMAApp_SMS_Lnk_ModuleAccessPermission),"Expand Image Of Following Module Access Permission" + " "+ color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleAccessPermission,3)+ " " + "For Module Security Group:"+ " "+color.RMA_ChangeColor_Utility(RMAApp_SMS_Lnk_ModuleSecurityGroup,3)+  " " +"On Left Navigation Menu Tree Of Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Chk_ModuleAccessPermission(driver, "General Claims"), "check", "General Claims Checkbox", "Security Management System Page", logval);
	 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SMS.RMAApp_SMSModuleAccPerm_Btn_Grant(driver),"Grant Image On Module Access Permissions Block Of Security Management System Page",logval);
	 RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
	 driver.close();
	 driver.switchTo().window(StrRMAWindowHandle);
	 //Required Module Access Permissions Are Set
	//===========================================================Enabling Of RiskMaster-->General Claims Permission In Security Management System Is Completed Here======================================================================================================================================================================================================================================================================================================================================================
	
	 //===========================================================Application LogOut And Re-Login Is Started Here==========================================================================================================================================================================================================================================================================================================================================================================================================
	  RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",logval);
	  RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, "Yes"); //Windows Pop Up Dialog Is Accepted
	 //Application Is Logged Out
	  RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, logval);
	  RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, logval);
	  RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Login Page",logval);
	 //Application Is Logged In	
	//===========================================================Application LogOut And Re-Login Is Completed Here===========================================================================================================================================================================================================================================================================================================================================================================================================
	
	  //===========================================================Data Source Selection Is Started Here====================================================================================================================================================================================================================================================================================================================================================================================================================== 
	  parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_002 To Select Data Source");
	  testcall2 = true;
	  dsnselection.RMAApp_DSNSelection();
	  loggerval2 = logger.toString();
	  parentlogger.appendChild(logger);

	  LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
	  RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName Display", logval);
	  // Correct User Is Logged In Verification Is Done
	  //===========================================================Data Source Selection Is Completed Here=========================================================================================================================================================================================================================================================================================================================================================================================================== 
	  
	  //===========================================================Steps To Verify That General Claim Creation Menu Option Is Displayed Is Started Here=====================================================================================================================================================================================================================================================================================================================================================================
	  RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	  RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "General Claim"),"General Claim MDI Menu Link On RMA Application Default View", logval);  
	//===========================================================Steps To Verify That General Claim Creation Menu Option Is Displayed Is Completed Here====================================================================================================================================================================================================================================================================================================================================================================
	
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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			
			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
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
		 } catch (Exception|Error e) {
		 System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		 }
		 finally
		    {
			 try {
				 driver.switchTo().parentFrame();
				 RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);		 
			 } catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}		
}