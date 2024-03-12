package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
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
//TestCaseID     : RMA_TC_233
//Description    : TC_233_Verify Adding,Editing And Deleting Of New Driver As Person Involved on Non Occupational Claim
//Depends On TC  : RMA_TC_230
//Revision       : 0.0 - RenuVerma-08-03-2016 
//=================================================================================================

public class RMA_TC_233 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	

	@Test
	public void RMA_TC_233_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_233_Adding, Editing And Deleting Of New Driver On Non Occupational Claim", "Verify Adding,Editing And Deleting Of New Driver As Person Involved On Non Occupational Claim");
			parentlogger.assignAuthor("Renu Verma");

			String StrDriverLastName_233;
			String StrDriverLastNameChanged_233;
			String StrDriverLastNameChanged_Actual_233;
			String StrClaimNaumberActual;
			//Local Variable Declaration Completed Here

			
			StrScreenShotTCName = "TC_233";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			//===============================================Search Of The Claim Created In TC_230 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_230.StrClaimNumber_230,RMA_TC_230.StrClaimNumber_230,RMA_TC_230.StrClaimNumber_230,"num",2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_230.StrClaimNumber_230, StrClaimNaumberActual , "Claim Number", logval);
			//===============================================Search Of The Claim Created In TC_230 Is Completed=====================================================================================================
			
			//===============================================Addition Of New Driver On Claim Created in TC_230 Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_230.StrClaimNumber_230), "Expand Image Corresponding To Non Occupational Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,RMA_TC_230.StrClaimNumber_230)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,RMA_TC_230.StrClaimNumber_230), "Person Involved Link On Left Hand Navigation Tree For Non Occupational Claim", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create Driver ");
			testcall1 = true;
			StrDriverLastName_233 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Driver", logval1);
			parentlogger.log(LogStatus.INFO, "New Driver Is Created Successfully With Driver Name::"+ " " + color.RMA_ChangeColor_Utility(StrDriverLastName_233, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Driver Is Added As Persons Involved", StrScreenShotTCName)));
			/*====================================================Addition Of New Driver On Claim Created in TC_230 Is Completed Here=======================================*/

			/*===============================================Editing Of An Existing Driver Is Started Here================================*/
			StrDriverLastNameChanged_233 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Driver_233_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Driver Page ", StrDriverLastNameChanged_233, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pidriver",false,"NA","Persons Involved-->Driver Page", logval);
			StrDriverLastNameChanged_Actual_233 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrDriverLastNameChanged_233, StrDriverLastNameChanged_Actual_233 , "Driver Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Driver Name Is Edited", StrScreenShotTCName)));
			/*=================================================Editing Of An Existing Driver Is Completed Here=============================================*/

			/*===========================================================Deletion Of New Driver Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Driver :" +" "+ color.RMA_ChangeColor_Utility(StrDriverLastNameChanged_233, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Driver Page", logval1);
			parentlogger.log(LogStatus.INFO, "Driver Is Deleted Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrDriverLastNameChanged_233, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of New Driver Is Completed Here================================================*/


		}
		catch(Exception|Error e)
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

