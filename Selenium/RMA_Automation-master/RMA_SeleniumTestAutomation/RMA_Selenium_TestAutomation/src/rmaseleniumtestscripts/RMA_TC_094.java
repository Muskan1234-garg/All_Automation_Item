package rmaseleniumtestscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Litigation;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_094
//Description    : TC_094_Verify That Litigation Can Be Added To A Workers Comp Claim
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-05-02-2016 
//=================================================================================================

public class RMA_TC_094 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_094;
	public static String DocketNumber_094;
	public static String StrWitnessLastNameActual;
	int logval;
	int logval1;

	@Test
	public void RMA_TC_094_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_094_Litigation Addtion To Workers Comp Claim", "Verify That Litigation Can Be Added To A Workers Comp Claim");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String RMAApp_WorkersCompClaim_Txt_ClaimType;
			int RMAApp_WorkersCompClaim_Txt_EmployeeNo;
			String RMAApp_WorkersCompClaim_Txt_Department;
			int RMAApp_WorkersCompClaim_Txt_DateOfEvent;
			int RMAApp_WorkersCompClaim_Txt_TimeOfEvent;
			int RMAApp_WorkersCompClaim_Txt_DateOfClaim;
			int RMAApp_WorkersCompClaim_Txt_TimeOfClaim;
			String RMAApp_WorkersCompClaim_Txt_Jurisdiction;
			String StrWitnessLastName;
			
			String StrLitigationDocketNum_094;			
			//Local Variable Declaration Completed Here
			
			logval = 0;
			logval1 = 1;
			StrScreenShotTCName = "TC_094";
			testcall1 = false;			
			loggerval1 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_05_PersonsInvolvedTestData.xlsx"); //Excel WorkBook RMA_Suite_05_PersonsInvolvedTestData Is Fetched To Retrieve Data
			RMAApp_WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_094", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_094", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_094", 1, 2); // Department Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_094", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_094", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_094", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_094", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_TC_094
			RMAApp_WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_094", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_TC_094

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			
			/*===========================================================Creation Of Workers Comp Claim Is Started Here================================================*/
			
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_WorkersCompClaimCreation Is Called To Create A Workers Comp Claim");
			testcall1 = true;
			StrClaimNumber_094 = RMA_Functionality_Utility.RMA_WorkersCompClaimCreation(RMAApp_WorkersCompClaim_Txt_ClaimType, RMAApp_WorkersCompClaim_Txt_EmployeeNo, RMAApp_WorkersCompClaim_Txt_Department, RMAApp_WorkersCompClaim_Txt_DateOfEvent, RMAApp_WorkersCompClaim_Txt_TimeOfEvent, RMAApp_WorkersCompClaim_Txt_DateOfClaim, RMAApp_WorkersCompClaim_Txt_TimeOfClaim, RMAApp_WorkersCompClaim_Txt_Jurisdiction, logval1);
			parentlogger.log(LogStatus.INFO, "New Workers Comp Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_094, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Workers Comp Claim Is Completed Here================================================*/

			/*========================================Addition Of Litigation Is Started Here===============================================================*/
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (0)"), "Litigation", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
			// Add New Litigation Link Is Selected
			
			DocketNumber_094 = String.valueOf("Lit_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To The Litigation Frame Is Done");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Page" , DocketNumber_094, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation Page Is Saved ");
			
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Litigation Page" , logval);
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("litigation"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Litigation Frame Is Done");			
			StrLitigationDocketNum_094 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(DocketNumber_094, StrLitigationDocketNum_094 , "Litigation Docket Number Value", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of RMA Application Error", StrScreenShotTCName)));
			//===============================================Addition Of Litigation Is Completed========================================================================================================
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Started========================================================================================================
		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+DocketNumber_094+")"), "Expand/Collapse Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+DocketNumber_094 +"Is Clicked");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber_094+")"), "Persons Involved Link Under Created Litigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existence Of Person Involved Link Under Litigation", StrScreenShotTCName)));
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Completed========================================================================================================
			
			//===============================================Steps To Create A New Witness Started============================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber_094+")"), "Persons Involded Link Present Under Litigation Tree", logval);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", (RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(driver, "Witness")));
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Persons Involved-->Witness Page Is Loaded");
			driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation("piwitness"));
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Switch To Frame Containing Persons Involved-->Witness Screen Controls Is Done");
			StrWitnessLastName = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Witness_TC_094_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On Persons Involved-->Witness Page", StrWitnessLastName, logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Persons Involved-->Witness Page", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Witness On Persons Involved Page Is Saved");
			StrWitnessLastNameActual = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			driver.switchTo().parentFrame();
			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Persons Involved-->Witness Page" , logval);
			RMA_Verification_Utility.RMA_TextCompare(StrWitnessLastName, StrWitnessLastNameActual, "Witness Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Witness Is Added As Persons Involved", StrScreenShotTCName)));
			
			//===============================================Steps To Create A New Witness Started========================================================================================================================================================
		
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_WorkersCompClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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

		} catch (Exception|Error e) {
			
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
	}		
}

