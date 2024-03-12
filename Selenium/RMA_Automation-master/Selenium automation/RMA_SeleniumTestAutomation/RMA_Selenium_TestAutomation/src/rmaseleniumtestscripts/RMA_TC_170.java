package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_PropertyClaim;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_170
//Description    : TC_170_Verify Adding,Editing And Deleting Of Existing Other Person As Person Involved on Property Claim
//Depends On TC  : RMA_TC_166
//Revision       : 0.0 -RenuVerma-07-05-2016 
//=================================================================================================

public class RMA_TC_170 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_170_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_170_Adding, Editing And Deleting Of An Existing Other Person On Property Claim", "Verify Adding,Editing And Deleting Of An Existing Other Person As Person Involved on Property Claim");
			parentlogger.assignAuthor("Renu Verma");

			String StrOtherPersonLastName_170;
			String StrPrimaryWindowHandle;
			String StrOtherPersonLastNameActual_170;
			String OtherPersonLastNameChanged_170;
			String OtherPersonLastNameChanged_170_Actual;
			String StrClaimNaumberActual;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_170";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			/*===========================================================Creation Of Other Person From Maintenance => People Page Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Other Person");
			testcall1 = true;
			StrOtherPersonLastName_170 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("OtherPeople", logval1);
			parentlogger.log(LogStatus.INFO, "Other Person Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrOtherPersonLastName_170, 2));
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Other People Is Created Successfully", StrScreenShotTCName)));
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			/*===========================================================Creation Of Other Person From Maintenance => People Page Is Completed Here================================================*/

			//===============================================Addition Of Other Person On Claim Created in TC_166 Is Started Here=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver),"Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_166.StrClaimNumber_166,RMA_TC_166.StrClaimNumber_166,"claimpc","num",2, logval);
			StrClaimNaumberActual = RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_166.StrClaimNumber_166, StrClaimNaumberActual , "Claim Number", logval);
			
			driver.switchTo().parentFrame();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Property Claim"), "Expand Image Corresponding To Property Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,"PROP")));// Wait Is Added until Persons Involved (0) link Is Loaded while Expanding The claim
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,"PROP"), "Person Involved Link On Left Hand Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Other Person"), "Other Person Under Add Existing On Person Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Claim-->PI-->Search-->Existing Other People Criteria Page","Other People Last Name Text Box",StrOtherPersonLastName_170,"Other People", "piother",StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piother",false,"NA","Persons Involved-->Other Person Page", logval);
			StrOtherPersonLastNameActual_170 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrOtherPersonLastName_170, StrOtherPersonLastNameActual_170 , "Other Person Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Other Person Is Added As Persons Involved", StrScreenShotTCName)));

			/*====================================================Addition Of Other Person On Claim Created Completed Here=======================================*/

			/*===============================================Editing Of An Existing Other Person Is Started Here================================*/
			OtherPersonLastNameChanged_170 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OtherPerson_170");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Other Person Page ", OtherPersonLastNameChanged_170, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Other Person Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piother",false,"NA", "Persons Involved-->Other Person Page", logval);
			OtherPersonLastNameChanged_170_Actual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(OtherPersonLastNameChanged_170, OtherPersonLastNameChanged_170_Actual , "Other Person Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Other Person Is Edited ", StrScreenShotTCName)));

			/*=================================================Editing Of An Existing Other Person Is Completed Here=============================================*/

			/*===========================================================Deletion Of An Existing Other Person Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Other Person :" +" "+ color.RMA_ChangeColor_Utility(OtherPersonLastNameChanged_170, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Other Person Page", logval1);
			parentlogger.log(LogStatus.INFO, "Other Person Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(OtherPersonLastNameChanged_170, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An Existing Other Person Is Completed Here================================================*/


		}
		catch(Exception|Error e)
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

		} catch (Exception|Error e) {
			
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
			
		}
		finally
		{
			reports.endTest(parentlogger); 
		}
	}		
}

