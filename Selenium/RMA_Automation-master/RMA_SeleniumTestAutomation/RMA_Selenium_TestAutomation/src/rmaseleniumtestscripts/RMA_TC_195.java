package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_NonOccupational;
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
//TestCaseID     : RMA_TC_195
//Description    : TC_195_Verify Adding,Editing And Deleting Of Existing Patient As Person Involved For Non Occupational Claim
//Depends On TC  : RMA_TC_190
//Revision       : 0.0 - ImteyazAhmad-07-20-2016 
//=================================================================================================

public class RMA_TC_195 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	

	@Test
	public void RMA_TC_195_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_195_Adding, Editing And Deleting Of An Existing Patient", "Verify Adding,Editing And Deleting Of An Existing Patient As Person Involved For Non Occupational Claim");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String StrPatientLastName_195;
			String StrPrimaryWindowHandle;
			String StrPatientLastNameActual_195;
			String StrPatientNameChanged;
			String StrClaimNaumberActual;

			//Local Variable Declaration Completed Here

		
			StrScreenShotTCName = "TC_195";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			/*===========================================================Creation Of Patient From Maintenance Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Patient");
			testcall1 = true;
			StrPatientLastName_195 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("PatientTracking", logval1);
			parentlogger.log(LogStatus.INFO, "New Patient Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrPatientLastName_195, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Patient From Maintenance Is Completed Here================================================*/

			//====================================================Search Of Claim Created In TC_190 Is Started====================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Search => Claim Page ", "Claim Number TextBox", RMA_TC_190.StrClaimNumber_190, RMA_TC_190.StrClaimNumber_190, RMA_TC_190.StrClaimNumber_190, "int", 2, logval);
			StrClaimNaumberActual = RMA_POM_NonOccupational.RMAApp_NonOccupational_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_190.StrClaimNumber_190, StrClaimNaumberActual , "Claim Number", logval);
			//========================================================= Search Of Claim Created In TC_190 Is Completed=====================================================================


			/*==================================================Addition Of An Existing Patient Is Started Here================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_190.StrClaimNumber_190), "Expand Image Corresponding To Non Occupational Claim Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Non Occupational Claim Link On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, RMA_TC_190.StrClaimNumber_190), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Patient"), "Add Existing Patient In Person Involved Submenu Under Claim", logval);
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPatient_Txt_PatientLastName(driver), "Standard Patient Search Page", "Patient Last Name TextBox", StrPatientLastName_195, StrPatientLastName_195, "pipatient", StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pipatient", false, "NA", "Save Image On PI Patient Page", logval);
			StrPatientLastNameActual_195 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrPatientLastName_195, StrPatientLastNameActual_195 , "Patient Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Patient Is Added As Persons Involved", StrScreenShotTCName)));

			/*====================================================Addition Of An Existing Patient Is Completed Here=======================================*/

			/*===============================================Editing Of An Existing Patient Is Started Here================================*/
			StrPatientNameChanged = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Patient_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Patient Page ", StrPatientNameChanged, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pipatient", false, "NA", "Save Image On PI Patient Page", logval);
			StrPatientLastNameActual_195 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrPatientNameChanged, StrPatientLastNameActual_195 , "Patient Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Patient Is Edited ", StrScreenShotTCName)));

			/*=================================================Editing Of An Existing Patient Is Completed Here=============================================*/

			/*===========================================================Deletion Of An Existing Patient Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Patient :" +" "+ color.RMA_ChangeColor_Utility(StrPatientNameChanged, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Patient Page", logval1);
			parentlogger.log(LogStatus.INFO, "Patient Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrPatientNameChanged, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An Existing Patient Is Completed Here================================================*/


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

