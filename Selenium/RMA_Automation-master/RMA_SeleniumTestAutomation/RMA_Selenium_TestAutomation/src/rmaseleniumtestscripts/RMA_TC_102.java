package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Litigation;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_102
//Description    : TC_102_Verify That Litigation Can Be Added To A Vehicle Accident Claim
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-05-12-2016 
//=================================================================================================

public class RMA_TC_102 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_RMA_TC_102;
	public static String StrLitigation_RMA_TC_102;
	public static String StrWitLastNameActual;
	
	@Test 
	public void RMA_TC_102_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_102_Litigation Addition To Vehicle Accident Claim", "Verify That Litigation Can Be Added To A Vehicle Accident Claim");
		parentlogger.assignAuthor("Kumud Naithani");
		String RMAApp_VehAccClaim_Txt_ClaimType;
		String RMAApp_VehAccClaim_Txt_Department;
		int RMAApp_VehAccClaim_Txt_DateOfEvent;
		int RMAApp_VehAccClaim_Txt_TimeOfEvent;
		int RMAApp_VehAccClaim_Txt_DateOfClaim;
		int RMAApp_VehAccClaim_Txt_TimeOfClaim;
		
		
		try {
			String DocketNumber;
			int LitFrameIndex;
			String StrWitLastName;
			loggerval1 = "NotInitialized";
			testcall1 = false;
			StrScreenShotTCName = "TC_102";	
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_05_PersonsInvolvedTestData.xlsx"); //Excel WorkBook RMA_Suite_05_PersonsInvolvedTestData Is Fetched To Retrieve Data
			RMAApp_VehAccClaim_Txt_ClaimType   =   ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_102", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_102
			RMAApp_VehAccClaim_Txt_Department  =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_102", 1, 1); // Department Is Fetched From DataSheet RMA_TC_102
			RMAApp_VehAccClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_102", 1, 2);//DateOfEvent Is Fetched From DataSheet RMA_TC_102
			RMAApp_VehAccClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_102", 1, 3);//TimeOfEvent Is Fetched From DataSheet RMA_TC_102
			RMAApp_VehAccClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_102", 1, 4);//DateOfClaim Is Fetched From DataSheet RMA_TC_102
			RMAApp_VehAccClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_102", 1, 5);//TimeOfClaim Is Fetched From DataSheet RMA_TC_102
			//===============================================Creation Of Vehicle Accident Claim Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: RMA_VehicleAccClaimCreation To Create New Vehicle Accident Claim");
			testcall1 = true;
			StrClaimNumber_RMA_TC_102 = RMA_Functionality_Utility.RMA_VehicleAccClaimCreation(RMAApp_VehAccClaim_Txt_ClaimType, RMAApp_VehAccClaim_Txt_Department, RMAApp_VehAccClaim_Txt_DateOfEvent, RMAApp_VehAccClaim_Txt_TimeOfEvent, RMAApp_VehAccClaim_Txt_DateOfClaim, RMAApp_VehAccClaim_Txt_TimeOfClaim, logval1); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_102
			parentlogger.log(LogStatus.INFO, "New Vehicle Accident Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_102, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Vehicle Accident Claim Is Created
		
			//===============================================Creation Of Vehicle Accident Claim Is Completed==========================================================================================================================================	
			//===============================================Steps To Open Litigation Screen Started ========================================================================================================================================	
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (0)"), "Litigation", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
			// Add New Litigation Link Is Selected
			
			//===============================================Steps To Open Litigation Screen Completed =================================================================================================
			//===============================================Steps To Create Litigation Started ========================================================================================================
			DocketNumber = String.valueOf("Lit_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
			LitFrameIndex = RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation");
			driver.switchTo().frame(LitFrameIndex);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Addition Page" , DocketNumber, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Addition Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Litigation Is Saved ");
			StrLitigation_RMA_TC_102 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of RMA Application Generic Error Message", StrScreenShotTCName)));
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Vehicle Accident-->Litigation Creation Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(DocketNumber, StrLitigation_RMA_TC_102 , "Litigation Docket Number Value", logval);
			//===============================================Steps To Create Litigation Completed======================================================================================================================================
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Started========================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+DocketNumber+")"), "Expand/Collapse Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber+")"), "Persons Involved Link Under Created Litigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existence Of Persons Involved Link Under Litigation Section Of Created Vehicle Accident Claim", StrScreenShotTCName)));
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Completed========================================================================================================
			//===============================================Steps To Create A New Witness Started============================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+RMA_TC_102.StrLitigation_RMA_TC_102+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, "Witness"), "Witness Under Add New On Persons Involved Submenu", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Persons Involved-->Witness Page Is Loaded");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piwitness"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Witness Screen Controls Is Done");
			StrWitLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_RMA_TC_102_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Witness Page", StrWitLastName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Witness Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Witness On Persons Involved Page Is Saved");
			StrWitLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Witness Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrWitLastName, StrWitLastNameActual, "Witness Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Witness Is Added As Persons Involved", StrScreenShotTCName)));
			
			//===============================================Steps To Create A New Witness Completed=======================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_VehicleAccClaimCreation" + " " +  "And Hence Vehicle Accident Claim Creation Is Not Successful And The Test Case Is A Fail");
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
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );

		}
	}
}

