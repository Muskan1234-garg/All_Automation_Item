package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Litigation;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_086
//Description    : TC_086_Verify That Litigation Can Be Added To A General Claim
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-05-02-2016 
//=================================================================================================

public class RMA_TC_086 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_RMA_TC_086;
	public static String StrLitigation_RMA_TC_086;
	public static String StrWitLastNameActual;

	@Test 
	public void RMA_TC_086_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_086_Addition Of Litigation To Claim", "Verify That Litigation Can Be Added To A General Claim");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String DocketNumber;
			int LitFrameIndex;
			String StrWitLastName;
			loggerval1 = "NotInitialized";
			testcall1 = false;
			StrScreenShotTCName = "TC_086";		
			//===============================================Creation Of General Claim Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New General Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_086 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_086
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_086, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			//===============================================Creation Of General Claim Is Completed======================================================================================================	
			//===============================================Steps To Open Litigation Screen Started =====================================================================================================	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim's Expander On Left Hand Navigation Tree",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Left Hand Navigation Tree Is Expanded For The Created General Claim");

			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (0)"), "Litigation", 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",0);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Add New Context Menu Option Is Clicked");
			// Add New Litigation Link Is Selected

			//===============================================Steps To Open Litigation Screen Completed =================================================================================================
			//===============================================Steps To Create Litigation Started ========================================================================================================
			DocketNumber = String.valueOf("Lit_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
			LitFrameIndex = RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation");
			driver.switchTo().frame(LitFrameIndex);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Addition Page" , DocketNumber, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Addition Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Created Litigation Is Saved ");

			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of RMA Application Generic Error Message", StrScreenShotTCName)));
			StrLitigation_RMA_TC_086 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(DocketNumber, StrLitigation_RMA_TC_086 , "Litigation Docket Number Value", 0);
			//===============================================Steps To Create Litigation Completed======================================================================================================================================
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Started========================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+DocketNumber+")"), "Expand/Collapse Image For The Created Litigation On Left Hand Navigation Tree",0);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber+")"), "Persons Involved Link Under Created Litigation Tree", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existence Of Persons Involved Link Under Litigation Section Of Created GC", StrScreenShotTCName)));
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Completed========================================================================================================
			//===============================================Steps To Create A New Witness Started============================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_086.StrLitigation_RMA_TC_086+")"), "Persons Involded Link Present Under Litigation Tree", 0);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", (RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, "Witness")));
			RMA_GenericUsages_Utility.RMA_StaticWait(4, 0, "Wait Is Added As Persons Involved-->Witness Page Is Loaded");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piwitness"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->Witness Screen Controls Is Done");
			StrWitLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_RMA_TC_086_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Witness Page", StrWitLastName, 0);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Witness Page", 0);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, 0, "Wait Is Added As Witness On Persons Involved Page Is Saved");
			StrWitLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",0);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Witness Page" , 0);
			RMA_Verification_Utility.RMA_TextCompare(StrWitLastName, StrWitLastNameActual, "Witness Name", 0);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Witness Is Added As Persons Involved", StrScreenShotTCName)));

			//===============================================Steps To Create A New Witness Started========================================================================================================================================================
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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}

