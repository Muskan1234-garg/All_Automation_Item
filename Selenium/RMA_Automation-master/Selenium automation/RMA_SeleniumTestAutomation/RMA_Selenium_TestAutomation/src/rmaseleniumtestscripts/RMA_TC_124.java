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
//TestCaseID     : RMA_TC_124
//Description    : TC_124_Verify Add,Edit And Delete Of Existing Physician As Person Involved In Litigation For Property Claims
//Depends On TC  : RMA_TC_118
//Revision       : 0.0 - KumudNaithani-06-16-2016 
//=================================================================================================

public class RMA_TC_124 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_124_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_124_Existing Physician As Person Involved", "Verify Add,Edit And Delete Of Existing Physician As Person Involved In Litigation For Property Claims");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String StrPhysicianLastName;
			String StrPrimaryWindowHandle;
			String StrEditedPhysicianLastNameActual;
			String StrEditedPhysicianLastName;
			String StrPhysicianLastNameActual;

			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_124";
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);

			//===============================================Creation Of Physician Entity Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_MaintEntityAddition_Utility To Create A New Physician");
			testcall1 = true;
			StrPhysicianLastName = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("Physician", logval1);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician Name::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Physician Is Created

			//===============================================Creation Of Physician Completed=====================================================================================================
			//===============================================Search Of The Claim Created In TC_118 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Search-->Claim Crietria Page Is Loaded");

			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("Search"));//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Frame Containing Search Screen Controls Is Done");;
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Claim Criteria Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Number Text Box On Search-->Claim Criteria Page", RMA_TC_118.StrClaimNumber_118, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search-->Claim Criteria Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Search Page Specific To Searched Claim Criteria Is Loaded");

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Frame Containing Controls Of Screen That Is Specific To Searched Claim Criteria Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_118.StrClaimNumber_118, "Search Page Specific To Searched Claim Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Property Claim Page Is Loaded");

			//===============================================Search Of The Claim Created In TC_118 Is Completed=====================================================================================================
			//===============================================Steps To Open The Persons Involved Page To Add Existing Physician Are Started=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Property"), "Expand Image Corresponding To Property Claim Link On Left Hand Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5,logval, "Wait Is Added As Expand Image Corresponding To Property Link On Left Hand Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Created Litigation Link On Left Hand Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To The Frame Containing Litigation Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_118.DocketNumber_118, "Litigation's Lookup Results Page" , logval);

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_118.DocketNumber_118+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_118.DocketNumber_118 +" "+"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_118.DocketNumber_118+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Physician"), "Physician Under Add Existing On Persons Involved Submenu", logval);

			//===============================================Steps To Open The Persons Involved Page To Page To Add Existing Physician Are Completed=====================================================================================================
			//===============================================Steps To Search An Existing Physician Started==============================================================================================================================================
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchPhysician_Txt_LastName(driver), "Physician Last Name TextBox On Search Window", StrPhysicianLastName, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Physician Search Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Physician Search Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Search Page Specific To Searched Physician Crietria Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrPhysicianLastName, "Search Page Specific To Searched Physician Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Physician Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done

			//===============================================Steps To Search An Existing Physician Completed===================================================================================================================================================================
			//===============================================Steps To Save The Searched Physician As Persons Involved Started =================================================================================================================================================
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piphysician"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Physician Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Physician On Persons Involved Page Is Saved");
			StrPhysicianLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Physician Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrPhysicianLastName, StrPhysicianLastNameActual, "Physician Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Physician Is Added As Persons Involved", StrScreenShotTCName)));

			//===============================================Steps To Save The Searched Physician As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Edit The Physician Added As Persons Involved Started ======================================================================================================================================================

			StrEditedPhysicianLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Physician_RMA_TC_124_");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piphysician"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Physician Screen Controls Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Physician Page", StrEditedPhysicianLastName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Physician Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Persons Involved-->Physician Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			StrEditedPhysicianLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Physician Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrEditedPhysicianLastName, StrEditedPhysicianLastNameActual , "Physician Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing Physician", StrScreenShotTCName)));
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piphysician"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Physician Screen Controls Is Done");
			//===============================================Steps To Edit The Physician Added As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Delete The Physician Added As Persons Involved Started =================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Physician"+ " "+ color.RMA_ChangeColor_Utility(StrEditedPhysicianLastNameActual, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Physician Page", logval1);
			parentlogger.log(LogStatus.INFO, "Physician Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPhysicianLastNameActual, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Physician Added As Persons Involved Completed=================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_MaintEntityAddition_Utility And Physician Creation Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility And Delete Of Physician Added As Persons Involved Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
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
