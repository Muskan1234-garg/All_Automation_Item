package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_106
//Description    : TC_106_Verify Adding,Editing And Deleting Of Existing Other Person As Person Involved In Litigation For Vehicle Claim
//Depends On TC  : RMA_TC_102
//Revision       : 0.0 - KumudNaithani-06-15-2016 
//=================================================================================================

public class RMA_TC_106 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_106_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_106_Adding, Editing And Deleting Of An Existing Other Person", "Verify Adding,Editing And Deleting Of An Existing Other Person As Person Involved In Litigation For Vehicle Claim");
			parentlogger.assignAuthor("Kumud Naithani");

			String StrOtherPersonLastName_106;
			String StrPrimaryWindowHandle;
			String StrOtherPersonLastNameActual_106;
			String OtherPersonLastNameChanged;

			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_106";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			/*===========================================================Creation Of Other Person From Maintenance => People Page Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Other Person");
			testcall1 = true;
			StrOtherPersonLastName_106 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("OtherPeople", logval1);
			parentlogger.log(LogStatus.INFO, "Other Person Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrOtherPersonLastName_106, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Other Person From Maintenance => People Page Is Completed Here================================================*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===============================================Search Of The Claim Created In TC_102 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Claim Criteria Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Number Text Box On Search-->Claim Criteria Page", RMA_TC_102.StrClaimNumber_RMA_TC_102, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search-->Claim Criteria Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Search Page Specific To Searched Claim Criteria Is Loaded");

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Frame Containing Controls Of Screen That Is Specific To Searched Claim Criteria Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_102.StrClaimNumber_RMA_TC_102, "Search Page Specific To Searched Claim Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Vehicle Claim Page is Loaded");
			//===============================================Search Of The Claim Created In TC_102 Is Completed=====================================================================================================

			/*==================================================Addition Of An Existing Other Person Is Started Here================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Vehicle"), "Expand Image Corresponding To Vehicle Claim Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Claim Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Litigation (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_102.StrLitigation_RMA_TC_102, "Litigation's Lookup Results Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_102.StrLitigation_RMA_TC_102+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_102.StrLitigation_RMA_TC_102 +"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_102.StrLitigation_RMA_TC_102+")"), "Person Involded Present Under Litigation Tree", logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Person Involved Under Litigation Is Right Clicked");
            RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Other Person"), "Other Person Under Add Existing On Person Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Standard Entity Search Window Is Loaded");	

			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Last Name TextBox On Standard Entity Search Page", StrOtherPersonLastName_106, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Standard Entity Search Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Standard Entity Search Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Search Page Specific To Searched Other Person Crietria Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Other People", "Search Page Specific To Searched Other Person Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As PI Other Person Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piother"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Other Person Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Other Person Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Other Person Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();

			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Other Person Page" , logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piother"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Other Person Screen Controls Is Done");
			StrOtherPersonLastNameActual_106 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrOtherPersonLastName_106, StrOtherPersonLastNameActual_106 , "Other Person Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Other Person Is Added As Persons Involved", StrScreenShotTCName)));

			/*====================================================Addition Of An Existing Other Person Is Completed Here=======================================*/

			/*===============================================Editing Of An Existing Other Person Is Started Here================================*/
			OtherPersonLastNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OtherPerson_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Other Person Page ", OtherPersonLastNameChanged, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Other Person Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Other Person Page Is Saved");			
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Other Person Page" , logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piother"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Other Person Screen Controls Is Done");
			StrOtherPersonLastNameActual_106 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(OtherPersonLastNameChanged, StrOtherPersonLastNameActual_106 , "Other Person Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Other Person Is Edited ", StrScreenShotTCName)));

			/*=================================================Editing Of An Existing Other Person Is Completed Here=============================================*/

			/*===========================================================Deletion Of An Existing Other Person Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Other Person :" +" "+ color.RMA_ChangeColor_Utility(OtherPersonLastNameChanged, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Other Person Page", logval1);
			parentlogger.log(LogStatus.INFO, "Other Person Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(OtherPersonLastNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An Existing Other Person Is Completed Here================================================*/


		}catch(Exception|Error e)
		{
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not Handled Exception And Print Log Of It
			ErrorMessageType = e.toString();
			System.out.println("The Error Mssg Is : " +" " +ExceptionRecorded + "And " +" " +ErrorMessageType);
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_MaintEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

		} catch (Exception|Error e) {
			
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			
		}
	}		
}

