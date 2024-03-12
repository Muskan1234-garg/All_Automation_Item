package rmaseleniumtestscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_090
//Description    : TC_090_Verify Add,Edit And Delete Of Existing Patient As Person Involved In Litigation For General Claims
//Depends On TC  : RMA_TC_086
//Revision       : 0.0 - KumudNaithani-05-10-2016 
//=================================================================================================

public class RMA_TC_090 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_090_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_090_Existing Patient As Person Involved", "Verify Add,Edit And Delete Of Existing Patient As Person Involved In Litigation For General Claims");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String StrPatLastName_RMA_TC_090;
			String StrPrimaryWindowHandle;
			String StrEditedPatLastNameAct_RMA_TC_090;
			String StrEditedPatLastName;
			String StrPatActualLastName_RMA_TC_090;

			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_090";
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);

			//===============================================Creation Of Patient Entity Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_MaintEntityAddition_Utility To Create A New Patient");
			testcall1 = true;
			StrPatLastName_RMA_TC_090 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("PatientTracking", 1);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created With Patient Name::"+ " " + color.RMA_ChangeColor_Utility(StrPatLastName_RMA_TC_090, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Patient Is Created

			//===============================================Creation Of Patient Completed=====================================================================================================
			//===============================================Search Of The Claim Created In TC_086 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(0);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Claim Criteria Page", 0);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Number Text Box On Search-->Claim Criteria Page", RMA_TC_086.StrClaimNumber_RMA_TC_086, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search-->Claim Criteria Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait is Added As Search Page Specific To Searched Claim Criteria Is Loaded");

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To Frame Containing Controls Of Screen That Is Specific To Searched Claim Criteria Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_086.StrClaimNumber_RMA_TC_086, "Search Page Specific To Searched Claim Criteria" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As General Claim Page is Loaded");

			//===============================================Search Of The Claim Created In TC_086 Is Completed=====================================================================================================
			//===============================================Steps To Open The Persons Involved Page To Add Existing Patient Are Started=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "General"), "Expand Image Corresponding To General Claim Link On Left Hand Navigation Tree", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Expand Image Corresponding To General Claim Link On Left Hand Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Created Litigation Link On Left Hand Navigation Tree", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As A Switch To The Frame Containing Litigation Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_086.StrLitigation_RMA_TC_086, "Litigation's Lookup Results Page" , 0);

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_086.StrLitigation_RMA_TC_086+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, 0, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_086.StrLitigation_RMA_TC_086 +" "+"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_086.StrLitigation_RMA_TC_086+")"), "Persons Involded Link Present Under Litigation Tree", 0);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Patient"));
			
			//===============================================Steps To Open The Persons Involved Page To Page To Add Existing Patient Are Completed=====================================================================================================
			//===============================================Steps To Search An Existing Patient Started==============================================================================================================================================
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchPatient_Txt_PatientLastName(driver), "Patient Last Name TextBox On Search Window", StrPatLastName_RMA_TC_090, 0);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Patient Search Page", 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Patient Search Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As Search Page Specific To Searched Patient Crietria Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrPatLastName_RMA_TC_090, "Search Page Specific To Searched Patient Criteria" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait is Added As Patient Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done

			//===============================================Steps To Search An Existing Patient Completed===================================================================================================================================================================
			//===============================================Steps To Save The Searched Patient As Persons Involved Started =================================================================================================================================================
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pipatient"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->Patient Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Patient Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Patient On Persons Involved Page Is Saved");
			StrPatActualLastName_RMA_TC_090 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",0);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Patient Page" , 0);
			RMA_Verification_Utility.RMA_TextCompare(StrPatLastName_RMA_TC_090, StrPatActualLastName_RMA_TC_090, "Patient Name", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Patient Is Added As Persons Involved", StrScreenShotTCName)));

			//===============================================Steps To Save The Searched Patient As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Edit The Patient Added As Persons Involved Started ======================================================================================================================================================

			StrEditedPatLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_RMA_TC_090_");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pipatient"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->Patient Screen Controls Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Patient Page", StrEditedPatLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Patient Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Persons Involved-->Patient Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",0);
			StrEditedPatLastNameAct_RMA_TC_090 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Patient Page" , 0);
			RMA_Verification_Utility.RMA_TextCompare(StrEditedPatLastName, StrEditedPatLastNameAct_RMA_TC_090 , "Patient Last Name Value",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing Patient", StrScreenShotTCName)));
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pipatient"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->Patient Screen Controls Is Done");
			//===============================================Steps To Edit The Patient Added As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Delete The Patient Added As Persons Involved Started =================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Patient"+ " "+ color.RMA_ChangeColor_Utility(StrEditedPatLastNameAct_RMA_TC_090, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Patient Page", 1);
			parentlogger.log(LogStatus.INFO, "Patient Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPatLastNameAct_RMA_TC_090, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Patient Added As Persons Involved Completed=================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_MaintEntityAddition_Utility And Patient Creation Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility And Delete Of Patient Added As Persons Involved Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}
