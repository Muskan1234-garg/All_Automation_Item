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
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_096
//Description    : TC_096_Verify Adding,Editing And Deleting Of Existing Medical Staff As Person Involved In Litigation For WC Claim
//Depends On TC  : RMA_TC_094
//Revision       : 0.0 - ImteyazAhmad-05-03-2016 
//=================================================================================================

public class RMA_TC_096 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	int logval;
	int logval1;

	@Test
	public void RMA_TC_096_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_096_Adding, Editing And Deleting Of Existing Medical Staff", "Verify Adding,Editing And Deleting Of Existing Medical Staff As Person Involved In Litigation For Workers Comp Claim");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String StrMedicalStaff_096;
			String StrPrimaryWindowHandle;
			String StrMedicalLastNameActual_096;
			String StrEntityNameChanged;

			//Local Variable Declaration Completed Here

			logval = 0;
			logval1 = 1;
			StrScreenShotTCName = "TC_096";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			/*===========================================================Creation Of Medical Staff Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Medical Staff ");
			testcall1 = true;
			StrMedicalStaff_096 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("MedicalStaff", logval1);
			parentlogger.log(LogStatus.INFO, "New Medical Staff Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrMedicalStaff_096, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Medical Staff Is Completed Here================================================*/

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===============================================Search Of The Claim Created In TC_094 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Search-->Claim Criteria Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Number Text Box On Search-->Claim Criteria Page", RMA_TC_094.StrClaimNumber_094, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Search-->Claim Criteria Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait is Added As Search Page Specific To Searched Claim Criteria Is Loaded");

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Frame Containing Controls Of Screen That Is Specific To Searched Claim Criteria Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_094.StrClaimNumber_094, "Search Page Specific To Searched Claim Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Workers Comp Claim Page is Loaded");
			//===============================================Search Of The Claim Created In TC_094 Is Completed=====================================================================================================

			/*==================================================Addition Of Existing Medical Staff Is Started Here================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Workers"), "Expand Image Corresponding To Workers Comp Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Workers Comp Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (1)"), "Litigation (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation's Lookup Results Page Is Loaded ");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_094.DocketNumber_094, "Litigation's Lookup Results Page" , logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+RMA_TC_094.DocketNumber_094+")"), "Expand Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+RMA_TC_094.DocketNumber_094 +"Is Clicked");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_094.DocketNumber_094+")"), "Person Involded Present Under Litigation Tree", logval);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Medical Staff"));
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Search Window Is Loaded");

			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_Search_Txt_MedicalStaffLastName(driver), "Medical Staff Last Name TextBox On Search Window", StrMedicalStaff_096, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Medical Staff Search Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Medical Staff Search Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Search Page Specific To Searched Medical Staff Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrMedicalStaff_096, "Search Page Specific To Searched Medical Staff" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait is Added As PI Medical Staff Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("pimedstaff"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To PI Medical Staff's Frame Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Medical Staff Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Medical Staff Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			StrMedicalLastNameActual_096 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrMedicalStaff_096, StrMedicalLastNameActual_096 , "Medical Staff Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Medical Staff Is Added As Person Involved", StrScreenShotTCName)));

			/*====================================================Addition Of Existing Medical Staff Is Completed Here=======================================*/

			/*===============================================Editing Of Existing Medical Staff Is Started Here================================*/
			StrEntityNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, StrMedicalStaff_096);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Medical Staff Page ", StrEntityNameChanged, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Medical Staff Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Medical Staff Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			StrMedicalLastNameActual_096 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEntityNameChanged, StrMedicalLastNameActual_096 , "Medical Staff Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Medical Staff Is Edited", StrScreenShotTCName)));

			/*=================================================Editing Of Existing Medical Staff Is Completed Here=============================================*/

			/*===========================================================Deletion Of Existing Medical Staff Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Medical Staff ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Medical Staff", logval1);
			parentlogger.log(LogStatus.INFO, "Medical Staff Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEntityNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of Existing Medical Staff Is Completed Here================================================*/


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
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
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

