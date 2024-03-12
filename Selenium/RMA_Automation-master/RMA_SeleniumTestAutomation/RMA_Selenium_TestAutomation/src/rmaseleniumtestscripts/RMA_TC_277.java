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
//TestCaseID     : RMA_TC_277
//Description    : TC_277_Verify Adding,Editing And Deleting Of new Employee As Person Involved For General Claim At Policy Level
//Depends On TC  : RMA_TC_276
//Revision       : 0.0 - RenuVerma-08-26-2016 
//=================================================================================================

public class RMA_TC_277 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_TC_277_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_277_Adding, Editing And Deleting Of New Employee As Person Involved For General Claim At Policy Level", "Verify Adding,Editing And Deleting Of New Employee As Person Involved For General Claim At Policy Level");
			parentlogger.assignAuthor("Renu Verma");

			String StrEmployeeNumber_277;
			String StrEmployeeLastNameActual_277;
			String StrEmployeeNameChanged_277;
			String StrGeneralClaimNumberActual;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_277";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
					

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===============================================Search Of The General Claim Policy Created In TC_276 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_TC_276.StrClaimNumber_276,RMA_TC_276.StrClaimNumber_276,RMA_TC_276.StrClaimNumber_276,"num",2, logval);
			StrGeneralClaimNumberActual = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_276.StrClaimNumber_276, StrGeneralClaimNumberActual, "General Claim Number", logval);
			//===============================================Search Of The General Claim Policy Created In TC_276 Is Completed=====================================================================================================
			
			/*================================================== Step Add New Employee Is On General Claim Policy--> PI Started Here================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_276.StrClaimNumber_276), "Expand Image Corresponding To General Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)"), "Policy (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy");	
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMA_TC_276.RMAApp_GeneralClaim_Txt_PolicyNo, "Policy Lookup Result Page",logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Policy ("+RMA_TC_276.StrPolicyName_276), "Expand Image For The Created Policy On Left Hand Navigation Tree",logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_276.StrPolicyName_276)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, RMA_TC_276.StrPolicyName_276), "Persons Involded Link Present Under Policy Tree", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create An Employee ");
			testcall1 = true;
			StrEmployeeNumber_277 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Employee", logval1);
			parentlogger.log(LogStatus.INFO, "New Employee Is Created Successfully With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber_277, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Employee Is Added As Persons Involved", StrScreenShotTCName)));
			/*================================================== Step Add New Employee Is On General Claim Policy--> PI Started Here================================================================*/
			
			/*===============================================Editing Of An Employee Is Started Here================================*/
			StrEmployeeNameChanged_277 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_277_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Employee Page ", StrEmployeeNameChanged_277, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piemployee", false, "NA","Persons Involved-->Employee Page", logval);
			StrEmployeeLastNameActual_277 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNameChanged_277, StrEmployeeLastNameActual_277 , "EmployeeLast Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Edited", StrScreenShotTCName)));
			/*=================================================Editing Of An Employee Is Completed Here=============================================*/

			/*===========================================================Deletion Of An Employee Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete An Employee : " +" "+ color.RMA_ChangeColor_Utility(StrEmployeeNameChanged_277, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Employee Page", logval1);
			parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNameChanged_277, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of An Employee Is Completed Here================================================*/


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

