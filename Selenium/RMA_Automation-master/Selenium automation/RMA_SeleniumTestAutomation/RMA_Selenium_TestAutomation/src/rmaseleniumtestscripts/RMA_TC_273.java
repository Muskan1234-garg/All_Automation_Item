package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_273
//Description    : TC_273_Verify Adding,Editing And Deleting Of Existing Patient As Person Involved For Workers' Comp Claim At Policy level
//Depends On TC  : RMA_TC_268
//Revision       : 0.0 - RenuVerma-09-07-2016  
//=================================================================================================

public class RMA_TC_273 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
	@Test 
	public void RMA_TC_273_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_273_Verify Adding,Editing And Deleting Of Existing Patient As Person Involved For Workers' Comp Claim At Policy level", "Verify Adding,Editing And Deleting Of Existing Patient As Person Involved For Workers' Comp Claim At Policy level");
		parentlogger.assignAuthor("Renu Verma");
		try {
			String StrPrimaryWindowHandle;
			String StrPatientLastName_273;
			String StrEditedPatientLastName_Actual_273;
			String StrEditedPatientLastName_273;
			String StrPatientLastName_Actual_273;
			String StrClaimNumberActual;
			//Local Variable Declaration Completed Here
			
			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_273";
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);

			//===============================================Creation Of Patient Entity Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_MaintEntityAddition_Utility To Create A New Patient");
			testcall1 = true;
			StrPatientLastName_273 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("PatientTracking", logval1);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created With Patient Name::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName_273, 2));
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Patient Is Created Successfully", StrScreenShotTCName)));
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			//===============================================Creation Of Patient Completed=====================================================================================================
			
			//===============================================Search Of The Workers' Comp Claim Policy Created In TC_268 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_268.StrClaimNumber_268,RMA_TC_268.StrClaimNumber_268,RMA_TC_268.StrClaimNumber_268,"num",2, logval);
			StrClaimNumberActual = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_268.StrClaimNumber_268, StrClaimNumberActual, "Workers' comp Number", logval);
			//===============================================Search Of The Workers' Comp Claim Policy Created In TC_268 Is Completed=====================================================================================================
			
			//===============================================Addition Of Patient On Workers' comp Created in TC_268 Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_268.StrClaimNumber_268), "Expand Image Corresponding To General Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)"), "Policy (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy");	
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_268.RMAApp_WorkersCompClaim_Txt_PolicyNo, "Policy Lookup Result Page",logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Policy ("+RMA_TC_268.StrPolicyName_268), "Expand Image For The Created Policy On Left Hand Navigation Tree",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_268.StrPolicyName_268)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_268.StrPolicyName_268), "Persons Involded Link Present Under Policy Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Patient"), "Patient Under Add Existing On Persons Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPatient_Txt_PatientLastName(driver), "Standard Entity Search page","Last Name Text Box",StrPatientLastName_273,StrPatientLastName_273, "pipatient",StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pipatient",false,"NA","Persons Involved-->Patient Page", logval);
			StrPatientLastName_Actual_273 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrPatientLastName_273, StrPatientLastName_Actual_273, "Patient Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Patient Is Added As Persons Involved", StrScreenShotTCName)));
			//===============================================Addition Of Patient On Workers' comp Created in TC_268 Is Completed =================================================================================================================================================
			
			
			//===============================================Steps To Edit The Patient Added As Persons Involved Started ======================================================================================================================================================
			StrEditedPatientLastName_273 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_273_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Patient Page", StrEditedPatientLastName_273, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pipatient",false,"NA","Persons Involved-->Patient Page", logval);
			StrEditedPatientLastName_Actual_273 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEditedPatientLastName_273, StrEditedPatientLastName_Actual_273 , "Patient Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing Patient", StrScreenShotTCName)));
			//===============================================Steps To Edit The Patient Added As Persons Involved Completed =================================================================================================================================================
			
			
			//===============================================Steps To Delete The Patient Added As Persons Involved Started =================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Patient"+ " "+ color.RMA_ChangeColor_Utility(StrEditedPatientLastName_Actual_273, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Patient Page", logval1);
			parentlogger.log(LogStatus.INFO, "Patient Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPatientLastName_Actual_273, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Patient Added As Persons Involved Completed=================================================================================================================================================
		}
		catch (Exception|Error e) {

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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,logval);
			}
		} catch (Exception |Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			reports.endTest(parentlogger); 
		}
	}
}
