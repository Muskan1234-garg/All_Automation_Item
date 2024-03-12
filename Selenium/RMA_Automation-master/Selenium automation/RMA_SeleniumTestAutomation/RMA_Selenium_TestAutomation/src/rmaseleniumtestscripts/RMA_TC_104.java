package rmaseleniumtestscripts;

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
//TestCaseID     : RMA_TC_104
//Description    : TC_104_Verify Add,Edit And Delete Of Existing Medical Staff As Person Involved In Litigation In Vehicle Accident Claim.
//Depends On TC  : RMA_TC_102
//Revision       : 0.0 - KumudNaithani-05-13-2016 
//=================================================================================================

public class RMA_TC_104 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test 
	public void RMA_TC_104_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_104_Existing Medical Staff As Person Involved For Vehicle Accident Claim", "Verify Add,Edit And Delete Of Existing Medical Staff As Person Involved In Litigation For Vehicle Accident Claim");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String StrMedStaffLastName_RMA_TC_104;
			String StrPrimaryWindowHandle;
			String StrEditMedStaffLastNameAct_RMA_TC_104;
			String StrEditMedStaffLastName;
			String StrMedStaffActual_RMA_TC_104;
			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_104";
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			
			//===============================================Creation Of MedicalStaff Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_MaintEntityAddition_Utility To Create A New MedicalStaff");
			testcall1 = true;
			StrMedStaffLastName_RMA_TC_104 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("MedicalStaff", logval1);
			parentlogger.log(LogStatus.INFO, "New MedicalStaff Is Created With MedicalStaff Number::"+ " " + color.RMA_ChangeColor_Utility(StrMedStaffLastName_RMA_TC_104, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New MedicalStaff Is Created
			
			//===============================================Creation Of MedicalStaff Completed=====================================================================================================
			//===============================================Search Of The Claim Created In TC_104 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Claim Criteria Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Number Text Box On Search-->Claim Criteria Page", RMA_TC_102.StrClaimNumber_RMA_TC_102, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search-->Claim Criteria Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Search Page Specific To Searched Claim Criteria Is Loaded");

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Frame Containing Controls Of Screen That Is Specific To Searched Claim Criteria Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_102.StrClaimNumber_RMA_TC_102, "Search Page Specific To Searched Claim Criteria" , 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Vehicle Accident Claim Page is Loaded");
			
			//===============================================Search Of The Claim Created In TC_104 Is Completed=====================================================================================================
			//===============================================Steps To Open The Persons Involved Page To Add Existing MedicalStaff Are Started=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Vehicle"), "Expand Image Corresponding To Vehicle Accident Claim Link On Left Hand Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Accident Claim Link On Left Hand Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Created Litigation Link On Left Hand Navigation Tree", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5,logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Frame Containing Litigation Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_102.StrLitigation_RMA_TC_102, "Litigation's Lookup Results Page" , logval);
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_102.StrLitigation_RMA_TC_102+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_102.StrLitigation_RMA_TC_102 +" "+"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_102.StrLitigation_RMA_TC_102+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Medical Staff"), "MedicalStaff Under Add Existing On Persons Involved Submenu", logval);
			
			//===============================================Steps To Open The Persons Involved Page To Page To Add Existing MedicalStaff Are Completed=====================================================================================================
			//===============================================Steps To Search An Existing MedicalStaff Started==============================================================================================================================================
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_Search_Txt_MedicalStaffLastName(driver), "MedicalStaff Number TextBox On Search Window", StrMedStaffLastName_RMA_TC_104, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " MedicalStaff Search Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On MedicalStaff Search Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Search Page Specific To Searched MedicalStaff Crietria Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrMedStaffLastName_RMA_TC_104, "Search Page Specific To Searched MedicalStaff Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As MedicalStaff Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			
			//===============================================Steps To Search An Existing MedicalStaff Completed===================================================================================================================================================================
			//===============================================Steps To Save The Searched MedicalStaff As Persons Involved Started =================================================================================================================================================
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pimedstaff"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->MedicalStaff Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->MedicalStaff Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As MedicalStaff On Persons Involved Page Is Saved");
			StrMedStaffActual_RMA_TC_104 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing MedicalStaff Is Added As Persons Involved", StrScreenShotTCName)));
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->MedicalStaff Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrMedStaffLastName_RMA_TC_104, StrMedStaffActual_RMA_TC_104, "MedicalStaff Number", logval);
			
			//===============================================Steps To Save The Searched MedicalStaff As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Edit The MedicalStaff Added As Persons Involved Started ======================================================================================================================================================
			
			StrEditMedStaffLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "MedStaff_RMA_TC_104_");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pimedstaff"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->MedicalStaff Screen Controls Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->MedicalStaff Page", StrEditMedStaffLastName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->MedicalStaff Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Persons Involved-->MedicalStaff Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing MedicalStaff", StrScreenShotTCName)));
			StrEditMedStaffLastNameAct_RMA_TC_104 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->MedicalStaff Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrEditMedStaffLastName, StrEditMedStaffLastNameAct_RMA_TC_104 , "MedicalStaff Last Name Value",logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pimedstaff"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->MedicalStaff Screen Controls Is Done");
			//===============================================Steps To Edit The MedicalStaff Added As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Delete The MedicalStaff Added As Persons Involved Started =================================================================================================================================================
			
			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The MedicalStaff"+ " "+ StrEditMedStaffLastNameAct_RMA_TC_104 +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->MedicalStaff Page", logval1);
			parentlogger.log(LogStatus.INFO, "MedicalStaff Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditMedStaffLastNameAct_RMA_TC_104, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The MedicalStaff Added As Persons Involved Completed=================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_MaintEntityAddition_Utility And MedicalStaff Creation Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility And Delete Of MedicalStaff Added As Persons Involved Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {
			
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}
