package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
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
//TestCaseID     : RMA_TC_126
//Description    : TC_126_Verify That Litigation Can Be Added To A General Claim
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-06-28-2016 
//=================================================================================================

public class RMA_TC_126 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_RMA_TC_126;
	public static String StrLitigation_RMA_TC_126;

	@Test 
	public void RMA_TC_126_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_126_Addition Of Litigation To Claim", "Verify That Litigation Can Be Added To A General Claim");
		parentlogger.assignAuthor("Kumud Naithani");
		try {
			String DocketNumber;
			loggerval1 = "NotInitialized";
			testcall1 = false;
			StrScreenShotTCName = "TC_126";		
			//===============================================Creation Of General Claim Is Started=====================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New General Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_126 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_126
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_126, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			//===============================================Creation Of General Claim Is Completed======================================================================================================	
			//===============================================Steps To Open Litigation Screen Started =====================================================================================================	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim's Expander On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Left Hand Navigation Tree Is Expanded For The Created General Claim");

			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (0)"), "Litigation", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
			// Add New Litigation Link Is Selected

			//===============================================Steps To Open Litigation Screen Completed =================================================================================================
			//===============================================Steps To Create Litigation Started ========================================================================================================
			DocketNumber = String.valueOf("Lit_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("litigation");
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Addition Page" , DocketNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Addition Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Litigation Is Saved ");

			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of RMA Application Generic Error Message", StrScreenShotTCName)));
			StrLitigation_RMA_TC_126 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(DocketNumber, StrLitigation_RMA_TC_126 , "Litigation Docket Number Value", logval);
			//===============================================Steps To Create Litigation Completed======================================================================================================================================
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Started========================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+DocketNumber+")"), "Expand/Collapse Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber+")"), "Persons Involved Link Under Created Litigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existence Of Persons Involved Link Under Litigation Section Of Created GC", StrScreenShotTCName)));
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Completed========================================================================================================
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
			
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(parentlogger); 
		}
	}
}

