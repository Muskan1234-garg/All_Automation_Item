package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PersonInvolved;
import rmaseleniumPOM.RMA_Selenium_POM_VehicleAccident;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_199
//Description    : TC_199_Verify Adding,Editing And Deleting Of Existing Employee As Person Involved For Vehicle Accident Claim
//Depends On TC  : RMA_TC_198
//Revision       : 0.0 - KumudNaithani-07-18-2016 
//=================================================================================================

public class RMA_TC_199 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_TC_199_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_199_Adding, Editing And Deleting Of Existing Employee", "Verify Adding,Editing And Deleting Of Existing Employee As Person Involved  For Vehicle Accident Claim");
			parentlogger.assignAuthor("Kumud Naithani");

			String StrEmployeeNumber_199;
			String StrEmployeeNumberActual_199;
			String StrPrimaryWindowHandle;
			String StrEmployeeLastNameActual_199;
			String StrEmployeeNameChanged;
			String StrClaimNaumberActual;

			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_199";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===========================================================Creation Of Employee From Maintenance Is Started Here=======================================================================================================================================================================================================================//

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create An Employee ");
			testcall1 = true;
			StrEmployeeNumber_199 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("Employee", logval1);
			parentlogger.log(LogStatus.INFO, "New Employee Is Created Successfully With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber_199, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Creation Of Employee From Maintenance Is Completed Here============================================================================================================================================================================================================================//

			//====================================================Search Of Claim Created In TC_198 Is Started===============================================================================================================================================================================================================================================//
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Search => Claim Page ", "Claim Number TextBox", RMA_TC_198.StrClaimNumber_198, RMA_TC_198.StrClaimNumber_198, "Vehicle Accident", "int", 2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimNum(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_198.StrClaimNumber_198, StrClaimNaumberActual , "Claim Number", logval);
			//========================================================= Search Of Claim Created In TC_198 Is Completed===========================================================================================================================================================================================================================================//

			//==================================================Addition Of Existing Employee Is Started Here====================================================================================================================================================================================================================================================//
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_198.StrClaimNumber_198), "Expand Image Corresponding To Vehicle Accident Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Accident Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, RMA_TC_198.StrClaimNumber_198), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Employee"), "Add Existing Employee In Person Involved Submenu Under Claim", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEmployee_Txt_EmployeeNumber(driver), "Standard Employee Search Page", "EmployeeNumber TextBox", StrEmployeeNumber_199, StrEmployeeNumber_199, "piemployee", StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piemployee", false, "NA", "Persons Involved-->Employee Page", logval);
			StrEmployeeNumberActual_199 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_PersonInvolved.RMAApp_PIEmp_Txt_EmpNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNumber_199, StrEmployeeNumberActual_199 , "EmployeeNumber", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Added As Persons Involved", StrScreenShotTCName)));

			//====================================================Addition Of Existing Employee Is Completed Here==================================================================================================================================================================================================================================================================//

			//===============================================Editing Of Existing Employee Is Started Here==============================================================================================================================================================================================================================================================================//
			StrEmployeeNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Employee Page ", StrEmployeeNameChanged, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piemployee", false, "NA", "Persons Involved-->Employee Page", logval);
			StrEmployeeLastNameActual_199 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNameChanged, StrEmployeeLastNameActual_199 , "EmployeeLast Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Edited", StrScreenShotTCName)));

			//=================================================Editing Of Existing Employee Is Completed Here===================================================================================================================================================================================================================================================================================//

			//===========================================================Deletion Of Existing Employee Is Started Here==========================================================================================================================================================================================================================================================================//

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete An Employee ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Employee Page", logval1);
			parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully And Its Employee Number Was::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Deletion Of Existing Employee Is Completed Here=======================================================================================================================================================================================================================================================================//


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

