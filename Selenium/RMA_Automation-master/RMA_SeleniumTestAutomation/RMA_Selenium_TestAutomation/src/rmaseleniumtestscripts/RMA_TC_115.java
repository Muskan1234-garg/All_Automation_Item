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
//TestCaseID     : RMA_TC_115
//Description    : TC_115_Verify Adding,Editing And Deleting Of Existing Patient As Person Involved In Litigation For Non Occupational Claim
//Depends On TC  : RMA_TC_110
//Revision       : 0.0 - ImteyazAhmad-06-14-2016 
//=================================================================================================

public class RMA_TC_115 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_TC_115_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_115_Adding, Editing And Deleting Of An Existing Patient", "Verify Adding,Editing And Deleting Of An Existing Patient As Person Involved In Litigation For Non Occupational Claim");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String StrPatientLastName_115;
			String StrPrimaryWindowHandle;
			String StrPatientLastNameActual_115;
			String PatientLastNameChanged;

			//Local Variable Declaration Completed Here


			StrScreenShotTCName = "TC_115";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			/*===========================================================Creation Of Patient From Maintenance Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Patient");
			testcall1 = true;
			StrPatientLastName_115 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("PatientTracking", logval1);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName_115, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Patient From Maintenance Is Completed Here================================================*/

		

			//===============================================Search Of The Claim Created In TC_110 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Claim Criteria Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Number Text Box On Search-->Claim Criteria Page", RMA_TC_110.StrClaimNumber_110, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search-->Claim Criteria Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Search Page Specific To Searched Claim Criteria Is Loaded");

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Frame Containing Controls Of Screen That Is Specific To Searched Claim Criteria Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_110.StrClaimNumber_110, "Search Page Specific To Searched Claim Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Non Occupational Claim Page is Loaded");
			//===============================================Search Of The Claim Created In TC_110 Is Completed=====================================================================================================

			/*==================================================Addition Of An Existing Patient Is Started Here================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "occupational"), "Expand Image Corresponding To Non Occupational Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Non Occupational Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Litigation (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_110.DocketNumber_110, "Litigation's Lookup Results Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_110.DocketNumber_110+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_110.DocketNumber_110 +"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_110.DocketNumber_110+")"), "Person Involded Present Under Litigation Tree", logval);
			//RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Person Involved Under Litigation Is Right Clicked");
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Patient"), "Patient Under Add Existing On Person Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Standard Patient Search Window Is Loaded");	

			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchPatient_Txt_PatientLastName(driver), "Patient Last Name TextBox On Standard Patient Search Page", StrPatientLastName_115, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", "Standard Patient Search Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Standard Patient Search Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Search Page Specific To Searched Patient Crietria Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrPatientLastName_115, "Search Page Specific To Searched Patient Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As PI Patient Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pipatient"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Patient Screen Controls Is Done");

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Patient Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Patient Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Patient Page" , logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pipatient"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Patient Screen Controls Is Done");
			StrPatientLastNameActual_115 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrPatientLastName_115, StrPatientLastNameActual_115 , "Patient Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Patient Is Added As Persons Involved", StrScreenShotTCName)));

			/*====================================================Addition Of An Existing Patient Is Completed Here=======================================*/

			/*===============================================Editing Of An Existing Patient Is Started Here================================*/
			PatientLastNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Patient Page ", PatientLastNameChanged, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Patient Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Patient Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Patient Page" , logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pipatient"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Patient Screen Controls Is Done");
			StrPatientLastNameActual_115 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(PatientLastNameChanged, StrPatientLastNameActual_115 , "Patient Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Patient Is Edited ", StrScreenShotTCName)));

			/*=================================================Editing Of An Existing Patient Is Completed Here=============================================*/

			/*===========================================================Deletion Of An Existing Patient Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Patient :" +" "+ color.RMA_ChangeColor_Utility(PatientLastNameChanged, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Patient Page", logval1);
			parentlogger.log(LogStatus.INFO, "Patient Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(PatientLastNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An Existing Patient Is Completed Here================================================*/


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

