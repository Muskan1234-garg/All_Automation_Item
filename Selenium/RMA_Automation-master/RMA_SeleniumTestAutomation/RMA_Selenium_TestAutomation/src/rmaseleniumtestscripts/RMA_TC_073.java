package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Login_DSNSelect_Frames;
import rmaseleniumPOM.RMA_Selenium_POM_PaymentsCollections;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_073
//Description    : TC_073_Diary/email is sent to the current adjuster of the claim
//Revision       : 0.0 - ImteyazAhmad-02-12-2016 
//=================================================================================================

public class RMA_TC_073 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	public static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_073_Test () throws Exception, Error

	{
		try {
			parentlogger = reports.startTest("TC_073_Diary Is Received By Current Adjuster Of Claim", "Diary/email Is Sent To The Current Adjuster Of The Claim.");
			String StrAccept;
			String RMAApp_Login_Txt_UserName;
			String RMAApp_Login_Txt_Password;
			String AttachedRecord;
			String AttachedRecord1;
			String TaskName;
			String ParentRecord;
			String TaskNameVal;	
			String TaskNameVal1;
			String LoginUserNameActual;
			String StrCheckStatusActual;
			String StrCheckStatusExpected;
			//Local Variable Declaration Completed

			StrAccept = "Yes";
			AttachedRecord = "FUNDS:"+" "+RMA_TC_066.StrControlNumber_RMA_TC_066;
			TaskNameVal = "Payments:"+" "+ RMA_TC_066.StrControlNumber_RMA_TC_066;
			AttachedRecord1 = "FUNDS:"+" "+RMA_TC_066.StrControlNumber_RMA_TC_066_01;
			TaskNameVal1 = "Payments:"+" "+ RMA_TC_066.StrControlNumber_RMA_TC_066_01;		
			TaskName = "Check Approved";		
			ParentRecord = "Claim:"+RMA_TC_066.StrClaimNumber_RMA_TC_066;
			StrCheckStatusExpected = "R Released";
			testcall1 = false;
			loggerval1 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_02_SprVsrApprovalTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData Is Fetched To Retrieve Data 
			RMAApp_Login_Txt_UserName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_073", 1, 0); //UserName Fetched From DataSheet RMA_TC_073
			RMAApp_Login_Txt_Password = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_073", 1, 1); //Password Fetched From DataSheet RMA_TC_073
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed
			driver.switchTo().parentFrame(); // A Switch To The Parent Web Frame Is Made		
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lnk_LogOut(driver), "LogOut Button On RMA Application Default View Page",0);
			RMA_GenericUsages_Utility.RMA_WindowsMessageHandler_Utility(driver, StrAccept); //Windows Pop Up Dialog Is Accepted
			//Application Is Logged Out

			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_UserName(driver), "UserName Text Box On RMA Application Login Page", RMAApp_Login_Txt_UserName, 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Txt_PassWord(driver), "Password Text Box On RMA Application Login Page", RMAApp_Login_Txt_Password, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_Login_Btn_Login(driver), "LogIn Button On RMA Application Default View Page",0);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Login_DSNSelect_Frames.RMAApp_DSNSelect_Lst_DataSourceName(driver)));
			//Application Is Logged In

			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Select DSN :: RMA_TC_002 ");
			testcall1 = true;
			RMA_TC_002 dsnselection = new RMA_TC_002();
			dsnselection.RMAApp_DSNSelection();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//DSN Is Selected 		

			LoginUserNameActual = RMA_Selenium_POM_Home.RMAApp_DefaultView_LoginUserName(driver).getText();
			RMA_Verification_Utility.RMA_TextCompare(RMAApp_Login_Txt_UserName, LoginUserNameActual, "UserName", 0); //Login User is Verified

			//===============================================Existence Of Payment (Created In TC_066) Approval Diary In Diaries Page Validation Is Started==========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("DiarieszDiaryListDiaryListDiary ListUI/Diaries/Diary ListFalse"); 
			
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page", "Check Approved", "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			driver.switchTo().parentFrame();
			
			RMA_Functionality_Utility.RMA_DiaryRecordsCheck_Utility(AttachedRecord, 1, 7, 0, TaskName,  TaskNameVal, ParentRecord, "Not Required", "Not Required", false, logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_GridColumnSelector(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_GridColumnSelector(driver), "Column Selector For Diary List UX Grid On Diary List Page", logval);
			
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_ColumnSelectorRestore(driver)));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_ColumnSelectorRestore(driver), "Restore Icon Of Column Selector Table For Diary List UX Grid On Diary List Page", logval);
			
			RMA_Functionality_Utility.RMA_GridRecordsFilter_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Txt_TaskName(driver), "Task Name TextBox On Diary List Page", "Check Approved", "Task Name Filter On Diary List Page", RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Btn_TaskNameFilter(driver),logval);
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_DiaryRecordsCheck_Utility(AttachedRecord1, 1, 7, 0, TaskName,  TaskNameVal1, ParentRecord, "Not Required", "Not Required", false, logval);
			//Values In The Diaries Table Displayed In The Default RMA Application Page Are Verified
			//================================================Existence Of Payment (Created In TC_066) Approval Diary In Diaries Page Validation Is Completed==========================================================================================================================================================================================================================================================================


			//================================================Payment Check Status Verification For $2000 Is Started==========================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed;
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search_Funds", "Check Control Number Text Box", RMA_TC_066.StrControlNumber_RMA_TC_066, RMA_TC_066.StrControlNumber_RMA_TC_066, "Transaction", "num", 2, logval);
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);

			//================================================Payment Check Status Verification For $2000 Is Completed==========================================================================================================================================================================================================================================================================		

			//================================================Payment Check Status Verification For $2500 Is Started==========================================================================================================================================================================================================================================================================

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0); //Web Page Is Refreshed;
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Funds", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchFunds_Txt_ControlNumber(driver), "Search_Funds", "Check Control Number Text Box", RMA_TC_066.StrControlNumber_RMA_TC_066_01, RMA_TC_066.StrControlNumber_RMA_TC_066_01, "Transaction", "num", 2, logval);
			StrCheckStatusActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PaymentsCollections.RMAApp_Payment_Txt_CheckStatus(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrCheckStatusExpected, StrCheckStatusActual, "Check Status ", 0);

			//================================================Payment Check Status Verification For $2500 Is Completed==========================================================================================================================================================================================================================================================================		

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_002: DSN Selection" + " " +  "And Hence The Test Case Is A Fail");
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
			StrScreenShotTCName = "TC_073";

			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
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

