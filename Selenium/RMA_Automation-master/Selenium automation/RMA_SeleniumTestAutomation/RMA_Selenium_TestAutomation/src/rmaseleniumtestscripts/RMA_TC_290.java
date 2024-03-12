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
//TestCaseID     : RMA_TC_290
//Description    : TC_290_Verify Adding,Editing And Deleting Of New Physician As Person Involved For Workers' Comp Claim At Policy level
//Depends On TC  : RMA_TC_284
//Revision       : 0.0 - RenuVerma-09-14-2016  
//=================================================================================================

public class RMA_TC_290 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC__Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_290_Verify Adding,Editing And Deleting Of New Physician As Person Involved For Workers' Comp Claim At Policy level", "Verify Adding,Editing And Deleting Of New Physician As Person Involved For Workers' Comp Claim At Policy level");
		parentlogger.assignAuthor("Renu Verma");
		try {
			String StrPhysicianLastName_290;
			String StrEditedPhysicianLastName_Actual_290;
			String StrEditedPhysicianLastName_290;
			String StrClaimNumberActual;
			//Local Variable Declaration Completed Here
			
			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_290";
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);

			
			//===============================================Search Of The Workers' Comp Claim Policy Created In TC_284 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_284.StrClaimNumber_284,RMA_TC_284.StrClaimNumber_284,RMA_TC_284.StrClaimNumber_284,"num",2, logval);
			StrClaimNumberActual = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_284.StrClaimNumber_284, StrClaimNumberActual, "Workers' comp Number", logval);
			//===============================================Search Of The Workers' Comp Claim Policy Created In TC_284 Is Completed=====================================================================================================
			
			//===============================================Addition Of Physician On Workers' Comp Claim Policy Created in TC_284 Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_284.StrClaimNumber_284), "Expand Image Corresponding To Workers' comp Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)"), "Policy (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy");	
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_284.RMAApp_WorkersCompClaim_Txt_PolicyNo, "Policy Lookup Result Page",logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Policy ("+RMA_TC_284.StrPolicyName_284), "Expand Image For The Created Policy On Left Hand Navigation Tree",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_284.StrPolicyName_284)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_284.StrPolicyName_284), "Persons Involded Link Present Under Policy Tree", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create Physician ");
			testcall1 = true;
			StrPhysicianLastName_290 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Physician", logval1);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created Successfully With Physician Name::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName_290, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Physician Is Added As Persons Involved", StrScreenShotTCName)));
			//===============================================Addition Of Physician On Workers' comp Created in TC_284 Is Completed Here =================================================================================================================================================
			
			//===============================================Steps To Edit The Physician Added As Persons Involved Started ======================================================================================================================================================
			StrEditedPhysicianLastName_290 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Physician_290_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Physician Page", StrEditedPhysicianLastName_290, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piphysician",false,"NA","Persons Involved-->Physician Page", logval);
			StrEditedPhysicianLastName_Actual_290 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEditedPhysicianLastName_290, StrEditedPhysicianLastName_Actual_290 , "Physician Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of New Physician", StrScreenShotTCName)));
			//===============================================Steps To Edit The Physician Added As Persons Involved Completed =================================================================================================================================================
			
			//===============================================Steps To Delete The Physician Added As Persons Involved Started =================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Physician"+ " "+ color.RMA_ChangeColor_Utility(StrEditedPhysicianLastName_Actual_290, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Physician Page", logval1);
			parentlogger.log(LogStatus.INFO, "Physician Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPhysicianLastName_Actual_290, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Physician Added As Persons Involved Completed=================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_Selenium_POM_Home And Physician Creation Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
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
