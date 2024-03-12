package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_229
//Description    : TC_229_Verify Add,Edit And Delete Of New Witness As Person Involved For Workers Comp Claims
//Depends On TC  : RMA_TC_222
//Revision       : 0.0 - ImteyazAhmad-07-28-2016 
//=================================================================================================

public class RMA_TC_229 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_229_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_229_Adding, Editing And Deleting Of New Witness As Person Involved", "Verify Add,Edit And Delete Of New Witness As Person Involved For Workers Comp Claim");
		parentlogger.assignAuthor("Imteyaz Ahmad");
		try {

			String StrEditedWitLastNameActual_229;
			String StrEditedWitLastName229;
			String StrWitLastName_229;
			String StrClaimNaumberActual;
			//Local Variable Declaration Completed Here

			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			StrScreenShotTCName = "TC_229";

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);//Web Page Is Refreshed

			//===============================================Search Of The Claim Created In TC_222 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver),"Search-->Claim Criteria Page","Claim Number Text Box ",RMA_TC_222.StrClaimNumber_222,RMA_TC_222.StrClaimNumber_222,RMA_TC_222.StrClaimNumber_222,"num",2, logval);
			StrClaimNaumberActual = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_222.StrClaimNumber_222, StrClaimNaumberActual , "Claim Number", logval);
			//===============================================Search Of The Claim Created In TC_222 Is Completed=====================================================================================================	

			//===============================================Addition Of Witness On Claim Created in TC_166 Is Started Here=====================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, RMA_TC_222.StrClaimNumber_222), "Expand Image Corresponding To Workers Comp Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,RMA_TC_222.StrClaimNumber_222)));
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,RMA_TC_222.StrClaimNumber_222), "Person Involved Link On Left Hand Navigation Tree For Workers Comp", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create A Witness ");
			testcall1 = true;
			StrWitLastName_229 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Witness", logval1);
			parentlogger.log(LogStatus.INFO, "New Witness Is Created Successfully With Witness Name::"+ " " + color.RMA_ChangeColor_Utility(StrWitLastName_229, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Witness Is Added As Persons Involved", StrScreenShotTCName)));
			//===============================================Steps To Save The Searched Witness As Persons Involved Completed =================================================================================================================================================

			//===============================================Steps To Edit The Witness Added As Persons Involved Started ======================================================================================================================================================
			StrEditedWitLastName229 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_RMA_TC_229_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Witness Page", StrEditedWitLastName229, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piwitness",false,"NA","Persons Involved-->Witness Page", logval);
			StrEditedWitLastNameActual_229 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEditedWitLastName229, StrEditedWitLastNameActual_229 , "Witness Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of New Witness", StrScreenShotTCName)));
			//===============================================Steps To Edit The Witness Added As Persons Involved Completed =================================================================================================================================================

			//===============================================Steps To Delete The Witness Added As Persons Involved Started =================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Witness"+ " "+ color.RMA_ChangeColor_Utility(StrEditedWitLastNameActual_229, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Witness Page", logval1);
			parentlogger.log(LogStatus.INFO, "Witness Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedWitLastNameActual_229, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Witness Added As Persons Involved Completed=================================================================================================================================================

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_MaintEntityAddition_Utility And Witness Creation Was Not Successful" + " " +  "And Hence The Test Case Is A Fail");
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
