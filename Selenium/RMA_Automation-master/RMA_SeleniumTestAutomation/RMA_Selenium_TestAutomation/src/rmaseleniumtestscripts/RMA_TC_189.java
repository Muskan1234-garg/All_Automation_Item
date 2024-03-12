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
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_189
//Description    : TC_189_Verify Add,Edit And Delete Of Existing Witness As Person Involved For General Claims
//Depends On TC  : RMA_TC_182
//Revision       : 0.0 - KumudNaithani-07-15-2016 
//=================================================================================================

public class RMA_TC_189 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test 
	public void RMA_TC_189_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_189_Adding, Editing And Deleting Of An Existing Witness", "Verify Adding,Editing And Deleting Of An Existing Witness As Person Involved For General Claim");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String StrPrimaryWindowHandle;
			String StrEditedWitLastNameActual;
			String StrEditedWitLastName;
			String StrWitLastNameActual;
			String StrClaimNumber_TC_189;

			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_189";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			
			//===============================================Creation Of General Claim Is Started=======================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New General Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_TC_189 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_182
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_TC_189, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			//===============================================Creation Of General Claim Is Completed======================================================================================================================================================
								
			//===============================================Addition Of An Existing Witness Is Started Here==========================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim's Expander On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Left Hand Navigation Tree Is Expanded For The Created General Claim");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_TC_189), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Witness"), "Add Existing Witness In Person Involved Submenu Under Claim", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Standard Entity Search Page", "Last Name TextBox", RMA_TC_182.StrWitLastNameActual_182, "Witness", "piwitness", StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piwitness", false, "NA", "Save Image On PI Witness Page", logval);
			StrWitLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_182.StrWitLastNameActual_182, StrWitLastNameActual , "Witness Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Addition Of Existing Witness", StrScreenShotTCName)));
			//===============================================Addition Of An Existing Witness Is Completed===================================================================================================================================================================
			//===============================================Steps To Edit The Witness Added As Persons Involved Started ======================================================================================================================================================

			StrEditedWitLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_TC_189_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Witness Page", StrEditedWitLastName, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piwitness", false, "NA", "Save Image On PI Witness Page", logval);
			StrEditedWitLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEditedWitLastName, StrEditedWitLastNameActual , "Witness Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing Witness", StrScreenShotTCName)));
			//===============================================Steps To Edit The Witness Added As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Delete The Witness Added As Persons Involved Started =================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Witness"+ " "+ color.RMA_ChangeColor_Utility(StrEditedWitLastNameActual, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Witness Page", logval1);
			parentlogger.log(LogStatus.INFO, "Witness Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedWitLastNameActual, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Witness Added As Persons Involved Completed=================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: GeneralClaim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility And Delete Of Witness Added As Persons Involved Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
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
			
		} catch (Exception |Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			reports.endTest(parentlogger);
		}
	}
}
