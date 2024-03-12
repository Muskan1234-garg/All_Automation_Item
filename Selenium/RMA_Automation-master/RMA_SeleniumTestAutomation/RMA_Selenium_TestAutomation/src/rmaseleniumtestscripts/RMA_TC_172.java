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
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_172
//Description    : TC_172_Verify Add,Edit And Delete Of Existing Physician As Person Involved on Property Claims
//Depends On TC  : RMA_TC_166
//Revision       : 0.0 - RenuVerma-07-05-2016 
//=================================================================================================

public class RMA_TC_172 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC__Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_172_Adding, Editing And Deleting Of An Eisting Physician As Person Involved", "Verify Add,Edit And Delete Of Existing Physician As Person Involved on Property Claims");
		parentlogger.assignAuthor("Renu Verma");
		try {
			String StrPhysicianLastName_172;
			String StrPrimaryWindowHandle;
			String StrEditedPhysicianLastName_Actual_172;
			String StrEditedPhysicianLastName_172;
			String StrPhysicianLastName_Actual_172;
			String StrClaimNaumberActual;
			//Local Variable Declaration Completed Here
			
			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_172";
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);

			//===============================================Creation Of Physician Entity Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_MaintEntityAddition_Utility To Create A New Physician");
			testcall1 = true;
			StrPhysicianLastName_172 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("Physician", logval1);
			parentlogger.log(LogStatus.INFO, "New Physician Is Created With Physician Name::"+ " " + color.RMA_ChangeColor_Utility(StrPhysicianLastName_172, 2));
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Physicain Is Created Successfully", StrScreenShotTCName)));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===============================================Creation Of Physician Completed=====================================================================================================
						
			
			//===============================================Addition Of Physician On Claim Created in TC_166 Is Started Here=====================================================================================================
			
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
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Physician"), "Physician Under Add Existing On Persons Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPhysician_Txt_LastName(driver), "Claim-->PI-->Search-->Existing Physician Criteria Page","Physician Last Name Text Box",StrPhysicianLastName_172,StrPhysicianLastName_172, "piphysician",StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piphysician",false,"NA","Persons Involved-->Physician Page", logval);
			StrPhysicianLastName_Actual_172 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrPhysicianLastName_172, StrPhysicianLastName_Actual_172, "Physician Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Physician Is Added As Persons Involved", StrScreenShotTCName)));
			//===============================================Addition Of Physician On Claim Created in TC_166 Is Completed Here =================================================================================================================================================
			
			//===============================================Steps To Edit The Physician Added As Persons Involved Started ======================================================================================================================================================
			StrEditedPhysicianLastName_172 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Physician_172_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Physician Page", StrEditedPhysicianLastName_172, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piphysician",false,"NA","Persons Involved-->Physician Page", logval);
			StrEditedPhysicianLastName_Actual_172 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEditedPhysicianLastName_172, StrEditedPhysicianLastName_Actual_172 , "Physician Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing Physician", StrScreenShotTCName)));
			//===============================================Steps To Edit The Physician Added As Persons Involved Completed =================================================================================================================================================
			
			//===============================================Steps To Delete The Physician Added As Persons Involved Started =================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Physician"+ " "+ color.RMA_ChangeColor_Utility(StrEditedPhysicianLastName_Actual_172, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Physician Page", logval1);
			parentlogger.log(LogStatus.INFO, "Physician Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedPhysicianLastName_Actual_172, 2));
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
