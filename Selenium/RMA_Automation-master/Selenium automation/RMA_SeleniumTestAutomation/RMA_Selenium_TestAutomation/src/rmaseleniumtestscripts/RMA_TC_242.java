package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
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
//TestCaseID     : RMA_TC_242
//Description    : TC_242_Verify Adding,Editing And Deleting Of New Other Person As Person Involved on Vehicle Accident Claim
//Depends On TC  : RMA_TC_238
//Revision       : 0.0 -RenuVerma-07-27-2016 
//=================================================================================================

public class RMA_TC_242 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_242_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_242_Adding, Editing And Deleting Of New Other Person On Vehicle Accident Claim", "Verify Adding,Editing And Deleting Of New Other Person As Person Involved on Vehicle Accident Claim");
			parentlogger.assignAuthor("Renu Verma");

			String StrOtherPersonLastName_242;
			String OtherPersonLastNameChanged_242;
			String OtherPersonLastNameChanged_Actual_242;
			String StrClaimNaumberActual;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_242";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			//===============================================Search Of The Claim Created In TC_238 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_238.StrClaimNumber_238,RMA_TC_238.StrClaimNumber_238,"claimva","num",2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_VehicleAccident.RMAApp_VehicleAccident_Txt_ClaimNum(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_238.StrClaimNumber_238, StrClaimNaumberActual , "Claim Number", logval);
				//===============================================Search Of The Claim Created In TC_238 Is Completed=====================================================================================================
			
			//===============================================Addition Of Other Person On Claim Created in TC_238 Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_238.StrClaimNumber_238), "Expand Image Corresponding To Vehicle Accident Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,RMA_TC_238.StrClaimNumber_238)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,RMA_TC_238.StrClaimNumber_238), "Person Involved Link On Left Hand Navigation Tree", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create An Other Person ");
			testcall1 = true;
			StrOtherPersonLastName_242 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Other Person", logval1);
			parentlogger.log(LogStatus.INFO, "New Other Person Is Created Successfully With Other Person Name::"+ " " + color.RMA_ChangeColor_Utility(StrOtherPersonLastName_242, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Other Person Is Added As Persons Involved", StrScreenShotTCName)));
			
			/*====================================================Addition Of Other Person On Claim Created Completed Here=======================================*/

			/*===============================================Editing Of An New Other Person Is Started Here================================*/
			OtherPersonLastNameChanged_242 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "OtherPerson_242_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Other Person Page ", OtherPersonLastNameChanged_242, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piother",false,"NA", "Persons Involved-->Other Person Page", logval);
			OtherPersonLastNameChanged_Actual_242 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(OtherPersonLastNameChanged_242, OtherPersonLastNameChanged_Actual_242 , "Other Person Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Other Person Is Edited ", StrScreenShotTCName)));

			/*=================================================Editing Of An New Other Person Is Completed Here=============================================*/

			/*===========================================================Deletion Of An New Other Person Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Other Person :" +" "+ color.RMA_ChangeColor_Utility(OtherPersonLastNameChanged_242, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Other Person Page", logval1);
			parentlogger.log(LogStatus.INFO, "Other Person Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(OtherPersonLastNameChanged_242, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An New Other Person Is Completed Here================================================*/


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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PIAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

