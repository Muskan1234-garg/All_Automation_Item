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
//TestCaseID     : RMA_TC_263
//Description    : TC_263_Verify That Adding,Editing And Deleting Of Existing Driver As Person Involved on General Claim Policy
//Depends On TC  : RMA_TC_260
//Revision       : 0.0 - RenuVerma-08-24-2016
//=================================================================================================

public class RMA_TC_263 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_263_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_263_Verify That Adding, Editing And Deleting Of An Existing Driver On General Claim Policy", "Verify Adding,Editing And Deleting Of An Existing Driver As Person Involved On General Claim Policy");
			parentlogger.assignAuthor("Renu Verma");

			String StrDriverLastName_263;
			String StrPrimaryWindowHandle;
			String StrDriverLastNameActual_263;
			String StrDriverLastNameChanged_263;
			String StrDriverLastNameChanged_Actual_263;
			String StrGeneralClaimNumberActual;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_263";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			/*===========================================================Creation Of Driver From Maintenance Page Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_MaintEntityAddition_Utility Is Called To Create A Driver ");
			testcall1 = true;
			StrDriverLastName_263 = RMA_Functionality_Utility.RMA_MaintEntityAddition_Utility("Driver", logval1);
			parentlogger.log(LogStatus.INFO, "New Driver Is Created Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrDriverLastName_263, 2));
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Driver Is Created Successfully", StrScreenShotTCName)));
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed
			/*===========================================================Creation Of Driver From Maintenance Page Is Completed Here================================================*/

			//===============================================Search Of The General Claim Policy Created In TC_260 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_260.StrClaimNumber_260,RMA_TC_260.StrClaimNumber_260,RMA_TC_260.StrClaimNumber_260,"num",2, logval);
			StrGeneralClaimNumberActual = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_260.StrClaimNumber_260, StrGeneralClaimNumberActual, "General Claim Number", logval);
			//===============================================Search Of The General Claim Policy Created In TC_260 Is Completed=====================================================================================================
	
			
			//===============================================Addition Of Driver Employee On Claim Created in TC_260 Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();
			StrPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_260.StrClaimNumber_260), "Expand Image Corresponding To General Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)"), "Policy (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy");	
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_260.RMAApp_GeneralClaim_Txt_PolicyNo, "Policy Lookup Result Page",logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Policy ("+RMA_TC_260.StrPolicyName_260), "Expand Image For The Created Policy On Left Hand Navigation Tree",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_260.StrPolicyName_260)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_260.StrPolicyName_260), "Persons Involded Link Present Under Policy Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Driver"), "Driver Under Add Existing On Person Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchDriver_Txt_DriverLastName(driver), " Standard Entity Search page","Last Name Text Box",StrDriverLastName_263,StrDriverLastName_263, "pidriver",StrPrimaryWindowHandle, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pidriver",false,"NA","Persons Involved-->Driver Page", logval);
			StrDriverLastNameActual_263 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrDriverLastName_263, StrDriverLastNameActual_263 , "Driver Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Driver Is Added As Persons Involved", StrScreenShotTCName)));
			/*====================================================Addition Of Existing Driver On Claim Created in TC_260 Is Completed Here=======================================*/

			/*===============================================Editing Of An Existing Driver Is Started Here================================*/
			StrDriverLastNameChanged_263 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Driver_263_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Driver Page ", StrDriverLastNameChanged_263, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("pidriver",false,"NA","Persons Involved-->Driver Page", logval);
			StrDriverLastNameChanged_Actual_263 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrDriverLastNameChanged_263, StrDriverLastNameChanged_Actual_263 , "Driver Last Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Driver Is Edited", StrScreenShotTCName)));

			/*=================================================Editing Of An Existing Driver Is Completed Here=============================================*/

			/*===========================================================Deletion Of An Existing Driver Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete A Driver :" +" "+ color.RMA_ChangeColor_Utility(StrDriverLastNameChanged_263, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Driver Page", logval1);
			parentlogger.log(LogStatus.INFO, "Driver Is Deleted Successfully With Name::"+ " " + color.RMA_ChangeColor_Utility(StrDriverLastNameChanged_263, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An Existing Driver Is Completed Here================================================*/


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

