/*package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_TC_UserDeletionSASuite3
//Description    : TC_UserDeletionSASuite3_ModuleGroup and User Creation
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-03-01-2016 
//=================================================================================================

public class RMA_TC_UserDeletionSASuite3 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_UserDeletionSASuite3_Test () throws Exception, Error

	{
		try {
			parentlogger = reports.startTest("TC_UserDeletionSASuite3_ Module Group And Users Are Deleted", "Module Group And User Is Deleted");
			parentlogger.assignAuthor("Kumud Naithani And Imteyaz Ahmad");
			String RMAApp_DSNSelect_Lst_DataSourceName;
			String StrAccept;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String LoginUserNameActual;
			//Local Variable Declaration Completed
			
			StrScreenShotTCName = "TC_UserDeletionSASuite3";
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			loggerval3 = "NotInitialized";
			loggerval4 = "NotInitialized";
			loggerval5 = "NotInitialized";
			loggerval6 = "NotInitialized";
			loggerval7 = "NotInitialized";
			loggerval8 = "NotInitialized";
			loggerval9 = "NotInitialized";
			loggerval10 = "NotInitialized";
			loggerval11 = "NotInitialized";
			loggerval12 = "NotInitialized";
			loggerval13= "NotInitialized";
			testcall1 = false; 
			testcall2 = false; 
			testcall3 = false;
			testcall4 = false; 
			testcall5 = false; 
			testcall6 = false;	
			testcall7 = false;
			testcall8 = false;
			testcall9 = false;
			testcall10 = false;
			testcall11= false;
			testcall12= false;
			testcall13= false;
			StrAccept = "Yes";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMA_Suite_03_SprVsrApprovalTestData Is Fetched To Retrieve Data
			RMAApp_DSNSelect_Lst_DataSourceName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_002", 1, 0); //DSN Name  Is Fetched From DataSheet RMA_TC_002
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 0); //UserName Fetched From DataSheet RMA_TC_001
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_001", 1, 1); //Password Fetched From DataSheet RMA_TC_001
			
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out
			
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName,0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password,0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Link On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Application Is Being Logged In");
			
			
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select DSN :: RMA_TC_002");
			testcall7 = true;
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval7 = logger.toString();
			// Data Source Is Selected 
			parentlogger.appendChild(logger);
		
			// Application Is Logged In
			
			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare( RMAApp_Login_Txt_UserName, LoginUserNameActual, "Correct UserName Display", 0);
			// Correct User Is Logged In Verification Is Done
			
			//Users - Usera2_ , Usera1_ , Usercsc_ , Userq2 , Userq1, Userb2, Userb1 - Are Deleted
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall1 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUsera2_TC_UserCreationSASuite3, 1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUsera2_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall2 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUsera1_TC_UserCreationSASuite3,1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUsera1_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall3 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUsercsc_TC_UserCreationSASuite3, 1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUsercsc_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall8 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUserq2_TC_UserCreationSASuite3, 1);
			loggerval8 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUserq2_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall9 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUserq1_TC_UserCreationSASuite3, 1);
			loggerval9 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUserq1_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall10 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUserb2_TC_UserCreationSASuite3, 1);
			loggerval10 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUserb2_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_UserDeletion To Delete A User");
			testcall11 = true;			
			RMA_Functionality_Utility.RMA_UserDeletionUtility(RMA_TC_UserCreationSASuite3.StrUserb1_TC_UserCreationSASuite3, 1);
			loggerval11 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A User With Name : " +" " +RMA_TC_UserCreationSASuite3.StrUserb1_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			//ModuleGroups- ModuleGroupa2_, ModuleGroupa1_,ModuleGroupcsc_ - Are Deleted
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupDeletion To Delete A ModuleGroup");
			testcall4 = true;
			RMA_Functionality_Utility.RMA_ModuleGroupDeletion(RMA_TC_UserCreationSASuite3.StrModuleGroupa2_TC_UserCreationSASuite3, RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A Module Group With Name : " +" " +RMA_TC_UserCreationSASuite3.StrModuleGroupa2_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupDeletion To Delete A ModuleGroup");
			testcall5 = true;
			RMA_Functionality_Utility.RMA_ModuleGroupDeletion(RMA_TC_UserCreationSASuite3.StrModuleGroupa1_TC_UserCreationSASuite3, RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A Module Group With Name : " +" " +RMA_TC_UserCreationSASuite3.StrModuleGroupa1_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
					
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupDeletion To Delete A ModuleGroup");
			testcall6 = true;
			RMA_Functionality_Utility.RMA_ModuleGroupDeletion(RMA_TC_UserCreationSASuite3.StrModuleGroupcsc_TC_UserCreationSASuite3, RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval6 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A Module Group With Name : " +" " +RMA_TC_UserCreationSASuite3.StrModuleGroupcsc_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
											
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupDeletion To Delete A ModuleGroup");
			testcall12 = true;
			RMA_Functionality_Utility.RMA_ModuleGroupDeletion(RMA_TC_UserCreationSASuite3.StrModuleGroupb2_TC_UserCreationSASuite3, RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval12 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A Module Group With Name : " +" " +RMA_TC_UserCreationSASuite3.StrModuleGroupb2_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_ModuleGroupDeletion To Delete A ModuleGroup");
			testcall13 = true;
			RMA_Functionality_Utility.RMA_ModuleGroupDeletion(RMA_TC_UserCreationSASuite3.StrModuleGroupb1_TC_UserCreationSASuite3, RMAApp_DSNSelect_Lst_DataSourceName, 1);
			loggerval13 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "A Module Group With Name : " +" " +RMA_TC_UserCreationSASuite3.StrModuleGroupb1_TC_UserCreationSASuite3 +" " + "Is Deleted Successfully");
			
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			else if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupDeletionUtility");
				parentlogger.appendChild(logger);
			}
			else if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupDeletionUtility");
				parentlogger.appendChild(logger);
			}
			else if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if ((testcall7 == true) && (loggerval7.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			}
			
			else if (testcall8 == true && loggerval8.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall9 == true && loggerval9.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall10 == true && loggerval10.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall11 == true && loggerval11.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_UserDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall12 == true && loggerval12.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupDeletionUtility");
				parentlogger.appendChild(logger);
			}
			
			else if (testcall13 == true && loggerval13.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing A Function Utility :" +" "+ "RMA_ModuleGroupDeletionUtility");
				parentlogger.appendChild(logger);
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {
			
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}

*/