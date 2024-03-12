package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PersonInvolved;
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
//TestCaseID     : RMA_TC_183
//Description    : TC_183_Verify Adding,Editing And Deleting Of Existing Employee As Person Involved For General Claim
//Depends On TC  : RMA_TC_182
//Revision       : 0.0 - KumudNaithani-07-08-2016 
//=================================================================================================

public class RMA_TC_183 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_TC_183_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_183_Adding, Editing And Deleting Of Existing Employee", "Verify Adding,Editing And Deleting Of Existing Employee As Person Involved  For General Claim");
			parentlogger.assignAuthor("Kumud Naithani");

			String StrEmployeeNumber_183;
			String StrEmployeeNumberActual_183;
			String StrPrimaryWindowHandle;
			String StrEmployeeLastNameActual_183;
			String StrEmployeeNameChanged;
			String StrClaimNaumberActual;

			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_183";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===========================================================Creation Of Employee From Maintenance Is Started Here==============================================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create An Employee ");
			testcall1 = true;
			StrEmployeeNumber_183 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("Employee", logval1);
			parentlogger.log(LogStatus.INFO, "New Employee Is Created Successfully With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber_183, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Creation Of Employee From Maintenance Is Completed Here=============================================================================================================================================================================

			//====================================================Search Of Claim Created In TC_182 Is Started===============================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Search => Claim Page ", "Claim Number TextBox", RMA_TC_182.StrClaimNumber_RMA_TC_182, RMA_TC_182.StrClaimNumber_RMA_TC_182, "claimgc", "int", 2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_182.StrClaimNumber_RMA_TC_182, StrClaimNaumberActual , "Claim Number", logval);
			//========================================================= Search Of Claim Created In TC_182 Is Completed====================================================================================================================================================================================================

			//==================================================Addition Of Existing Employee Is Started Here=====================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "General"), "Expand Image Corresponding To General Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To General Claim Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, RMA_TC_182.StrClaimNumber_RMA_TC_182), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Employee"), "Add Existing Employee In Person Involved Submenu Under Claim", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEmployee_Txt_EmployeeNumber(driver), "Standard Employee Search Page", "EmployeeNumber TextBox", StrEmployeeNumber_183, StrEmployeeNumber_183, "piemployee", StrPrimaryWindowHandle, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Employee Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Employee On Persons Involved Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			StrEmployeeNumberActual_183 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PersonInvolved.RMAApp_PIEmp_Txt_EmpNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNumber_183, StrEmployeeNumberActual_183 , "EmployeeNumber", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Added As Persons Involved", StrScreenShotTCName)));

			//====================================================Addition Of Existing Employee Is Completed Here=====================================================================================================================================================================================================================

			//===============================================Editing Of Existing Employee Is Started Here==================================================================================================================================================================================================================================
			StrEmployeeNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Employee Page ", StrEmployeeNameChanged, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On PI Employee Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Employee Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("PI Employee Page" , logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("piemployee");
			StrEmployeeLastNameActual_183 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNameChanged, StrEmployeeLastNameActual_183 , "EmployeeLast Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Edited", StrScreenShotTCName)));

			//=================================================Editing Of Existing Employee Is Completed Here======================================================================================================================================================================================================================================

			//===========================================================Deletion Of Existing Employee Is Started Here=====================================================================================================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete An Employee ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Employee Page", logval1);
			parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully And Its Employee Number Was::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Deletion Of Existing Employee Is Completed Here================================================================================================================================================================================================================================================


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

