package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
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
//TestCaseID     : RMA_TC_117
//Description    : TC_117_Verify Add,Edit And Delete Of Existing Witness As Person Involved In Litigation For Non Occupational Claims
//Depends On TC  : RMA_TC_117
//Revision       : 0.0 - ImteyazAhmad-06-15-2016 
//=================================================================================================

public class RMA_TC_117 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	

	@Test 
	public void RMA_TC_117_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_117_Adding, Editing And Deleting Of An Existing Witness", "Verify Adding,Editing And Deleting Of An Existing Witness As Person Involved In Litigation For Non Occupational Claim");
		parentlogger.assignAuthor("Imteyaz Ahmad");
		try {
			String StrPrimaryWindowHandle;
			String StrEditedWitLastNameActual;
			String StrEditedWitLastName;
			String StrWitLastNameActual;
			String StrClaimNumber_TC_117;
			String DocketNumber_TC_117;
			String StrLitigationDocketNumActual_TC_117;
			String RMAApp_NonOccupationalClaim_Txt_ClaimType;
			int RMAApp_NonOccupationalClaim_Txt_EmployeeNo;
			String RMAApp_NonOccupationalClaim_Txt_Department;
			int RMAApp_NonOccupationalClaim_Txt_DateOfEvent;
			int RMAApp_NonOccupationalClaim_Txt_TimeOfEvent;
			int RMAApp_NonOccupationalClaim_Txt_DateOfClaim;
			int RMAApp_NonOccupationalClaim_Txt_TimeOfClaim;
			String RMAApp_NonOccupationalClaim_Txt_Jurisdiction;
			int RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate;

			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			
			StrScreenShotTCName = "TC_117";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_05_PersonsInvolvedTestData.xlsx"); //Excel WorkBook RMA_Suite_05_PersonsInvolvedTestData Is Fetched To Retrieve Data
			RMAApp_NonOccupationalClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_117", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_117", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_117", 1, 2); // Department Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_117", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_117", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_117", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_117", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_117", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_TC_117
			RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_117", 1, 8);//Disability Start Date Is Fetched From DataSheet RMA_TC_117
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			
			/*===========================================================Creation Of Non Occupational Claim Is Started Here================================================*/
			
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_NonOccupationalClaimCreation Is Called To Create A Non Occupational Claim");
			testcall1 = true;
			StrClaimNumber_TC_117 = RMA_Functionality_Utility.RMA_NonOccupationalClaimCreation(RMAApp_NonOccupationalClaim_Txt_ClaimType, RMAApp_NonOccupationalClaim_Txt_EmployeeNo, RMAApp_NonOccupationalClaim_Txt_Department, RMAApp_NonOccupationalClaim_Txt_DateOfEvent, RMAApp_NonOccupationalClaim_Txt_TimeOfEvent, RMAApp_NonOccupationalClaim_Txt_DateOfClaim, RMAApp_NonOccupationalClaim_Txt_TimeOfClaim, "MyPlan", RMAApp_NonOccupationalClaim_Txt_Jurisdiction,RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate, logval1);
			parentlogger.log(LogStatus.INFO, "New Non Occupational Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_TC_117, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Non Occupational Claim Is Completed Here================================================*/

			/*========================================Addition Of Litigation Is Started Here===============================================================*/
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (0)"), "Litigation", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
			// Add New Litigation Link Is Selected
			
			DocketNumber_TC_117 = String.valueOf("Lit_117_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Page" , DocketNumber_TC_117, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation Page Is Saved ");
			
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Litigation Page" , logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Litigation Frame Is Done");			
			StrLitigationDocketNumActual_TC_117 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(DocketNumber_TC_117, StrLitigationDocketNumActual_TC_117 , "Litigation Docket Number Value", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Litigation Saved Successfull", StrScreenShotTCName)));
			//===============================================Addition Of Litigation Is Completed========================================================================================================
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Started========================================================================================================
		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+DocketNumber_TC_117+")"), "Expand/Collapse Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+DocketNumber_TC_117 +"Is Clicked");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber_TC_117+")"), "Persons Involved Link Under Created Litigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existence Of Person Involved Link Under Litigation", StrScreenShotTCName)));
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Completed========================================================================================================
			
			//===============================================Steps To Search An Existing Witness Started==========================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber_TC_117+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_EntName(driver, "Witness"), "Witness Under Add Existing On Person Involved Submenu", logval);
			
			StrPrimaryWindowHandle = driver.getWindowHandle();			
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver), "Last Name TextBox On Standard Entity Search Window", RMA_TC_110.StrWitnessLastNameActual_110, logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_Search.RMAApp_Search_Chk_Soundex(driver), "uncheck", "Soundex CheckBox", " Standard Entity Search Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Search.RMAApp_Search_Btn_Submit(driver), "Submit Button On Standard Entity Search Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As Search Page Specific To Searched Witness Crietria Is Loaded");
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Witness", "Search Page Specific To Searched Witness Criteria" , logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait is Added As PI Witness Page is Loaded");
			driver.switchTo().window(StrPrimaryWindowHandle);
			driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done

			//===============================================Steps To Search An Existing Witness Completed===================================================================================================================================================================
			//===============================================Steps To Save The Searched Witness As Persons Involved Started =================================================================================================================================================
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piwitness"));
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Witness Screen Controls Is Done");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Witness Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As PI Witness Page Is Saved");
			StrWitLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Witness Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(RMA_TC_110.StrWitnessLastNameActual_110, StrWitLastNameActual, "Witness Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Witness Is Added As Persons Involved", StrScreenShotTCName)));

			//===============================================Steps To Save The Searched Witness As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Edit The Witness Added As Persons Involved Started ======================================================================================================================================================

			StrEditedWitLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_TC_117_");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piwitness"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Witness Screen Controls Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Witness Page", StrEditedWitLastName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Witness Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Persons Involved-->Witness Page Is Saved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			StrEditedWitLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Witness Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrEditedWitLastName, StrEditedWitLastNameActual , "Witness Last Name Value",logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Edit Of Existing Witness", StrScreenShotTCName)));
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piwitness"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, 0, "Wait Is Added As Switch To Frame Containing Persons Involved-->Witness Screen Controls Is Done");
			//===============================================Steps To Edit The Witness Added As Persons Involved Completed =================================================================================================================================================
			//===============================================Steps To Delete The Witness Added As Persons Involved Started =================================================================================================================================================

			parentlogger.log(LogStatus.INFO, "Following Utility :" +" " +"RMA_GenericDelete_Utility Is Called To Delete The Witness"+ " "+ color.RMA_ChangeColor_Utility(StrEditedWitLastNameActual, 2) +" " +"Added As Persons Involved");
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Persons Involved-->Witness Page", logval1);
			parentlogger.log(LogStatus.INFO, "Witness Added As Persons Involved Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(StrEditedWitLastNameActual, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			//===============================================Steps To Delete The Witness Added As Persons Involved Completed=================================================================================================================================================
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_WorkersCompClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}
}
