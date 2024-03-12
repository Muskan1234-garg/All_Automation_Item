package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
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
//TestCaseID     : RMA_TC_200
//Description    : TC_200_Verify Adding,Editing And Deleting Of Existing Medical Staff As Person Involved For Vehicle Accident Claim
//Depends On TC  : RMA_TC_198
//Revision       : 0.0 - KumudNaithani-07-18-2016 
//=================================================================================================

public class RMA_TC_200 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_200_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_200_Adding, Editing And Deleting Of Existing Medical Staff", "Verify Adding,Editing And Deleting Of Existing Medical Staff As Person Involved For Vehicle Accident Claim");
			parentlogger.assignAuthor("Kumud Naithani");

			String StrMedicalStaff_200;
			String StrPrimaryWindowHandle;
			String StrMedicalLastNameActual_200;
			String StrMedicalStaffNameChanged;
			String StrClaimNaumberActual;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_200";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";


			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===========================================================Creation Of Medical Staff Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Medical Staff ");
			testcall1 = true;
			StrMedicalStaff_200 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("MedicalStaff", logval1);
			parentlogger.log(LogStatus.INFO, "New Medical Staff Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrMedicalStaff_200, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Creation Of Medical Staff Is Completed Here================================================*/

			//====================================================Search Of Claim Created In TC_198 Is Started====================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Search => Claim Page ", "Claim Number TextBox", RMA_TC_198.StrClaimNumber_198, RMA_TC_198.StrClaimNumber_198, "Vehicle Accident", "int", 2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimNum(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_198.StrClaimNumber_198, StrClaimNaumberActual , "Claim Number", logval);
			//========================================================= Search Of Claim Created In TC_198 Is Completed=====================================================================

			//==================================================Addition Of Existing Medical Staff Is Started Here================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_198.StrClaimNumber_198), "Expand Image Corresponding To Vehicle Accident Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Vehicle Claim Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, RMA_TC_198.StrClaimNumber_198), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Medical Staff"), "Add Existing Medical Staff In Person Involved Submenu Under Claim", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_Search_Txt_MedicalStaffLastName(driver), "Medical Staff Search Page", "Medical Staff Last Name TextBox", StrMedicalStaff_200, StrMedicalStaff_200, "pimedstaff", StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pimedstaff", false, "NA", "Persons Involved-->Medical Staff Page", logval);
			StrMedicalLastNameActual_200 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrMedicalStaff_200, StrMedicalLastNameActual_200 , "Medical Staff Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Medical Staff Is Added As Person Involved", StrScreenShotTCName)));

			//====================================================Addition Of Existing Medical Staff Is Completed Here=======================================*/

			//===============================================Editing Of Existing Medical Staff Is Started Here================================*/
			StrMedicalStaffNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, StrMedicalStaff_200);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Medical Staff Page ", StrMedicalStaffNameChanged, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pimedstaff", false, "NA", "Persons Involved-->Medical Staff Page", logval);
			StrMedicalLastNameActual_200 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrMedicalStaffNameChanged, StrMedicalLastNameActual_200 , "Medical Staff Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Medical Staff Is Edited", StrScreenShotTCName)));

			//=================================================Editing Of Existing Medical Staff Is Completed Here=============================================*/

			//===========================================================Deletion Of Existing Medical Staff Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Medical Staff ");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Medical Staff", logval1);
			parentlogger.log(LogStatus.INFO, "Medical Staff Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrMedicalStaffNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Deletion Of Existing Medical Staff Is Completed Here================================================*/


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

		} catch (Exception|Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			reports.endTest(parentlogger); 
		}
	}		
}

