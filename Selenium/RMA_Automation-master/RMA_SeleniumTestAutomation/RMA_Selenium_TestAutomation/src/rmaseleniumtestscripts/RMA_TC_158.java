package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_158
//Description    : TC_158_Verify That Litigation Can Be Added To A NonOccupational Claim
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-07-04-2016 
//=================================================================================================

public class RMA_TC_158 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_158;
	public static String DocketNumber_158;


	@Test
	public void RMA_TC_158_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_158_Litigation Addtion To NonOccupational Claim", "Verify That Litigation Can Be Added To A NonOccupational Claim");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String RMAApp_NonOccupationalClaim_Txt_ClaimType;
			int RMAApp_NonOccupationalClaim_Txt_EmployeeNo;
			String RMAApp_NonOccupationalClaim_Txt_Department;
			int RMAApp_NonOccupationalClaim_Txt_DateOfEvent;
			int RMAApp_NonOccupationalClaim_Txt_TimeOfEvent;
			int RMAApp_NonOccupationalClaim_Txt_DateOfClaim;
			int RMAApp_NonOccupationalClaim_Txt_TimeOfClaim;
			String RMAApp_NonOccupationalClaim_Txt_Jurisdiction;
			int RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate;

			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "TC_158";
			testcall1 = false;			
			loggerval1 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_07_PI_AddNew_LitigationTestData.xlsx"); //Excel WorkBook RMA_Suite_07_PI_AddNew_LitigationTestData.xlsx Is Fetched To Retrieve Data
			RMAApp_NonOccupationalClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_158", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_158", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_158", 1, 2); // Department Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_158", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_158", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_158", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_158", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_158", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_TC_158
			RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_158", 1, 8);//Disability Start Date Is Fetched From DataSheet RMA_TC_158
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed

			/*===========================================================Creation Of Non Occupational Claim Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_NonOccupationalClaimCreation Is Called To Create A Non Occupational Claim");
			testcall1 = true;
			StrClaimNumber_158 = RMA_Functionality_Utility.RMA_NonOccupationalClaimCreation(RMAApp_NonOccupationalClaim_Txt_ClaimType, RMAApp_NonOccupationalClaim_Txt_EmployeeNo, RMAApp_NonOccupationalClaim_Txt_Department, RMAApp_NonOccupationalClaim_Txt_DateOfEvent, RMAApp_NonOccupationalClaim_Txt_TimeOfEvent, RMAApp_NonOccupationalClaim_Txt_DateOfClaim, RMAApp_NonOccupationalClaim_Txt_TimeOfClaim,RMAApp_NonOccupationalClaim_Txt_Jurisdiction, "MyPlan",RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate, logval1);
			parentlogger.log(LogStatus.INFO, "New Non Occupational Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_158, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Non Occupational Claim Is Completed Here================================================*/

			/*===========================================================New Litigation Creation Is Started Here=======================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_ClaimEntityAddition_Utility Is Called To Create An Litigation ");
			testcall1 = true;
			DocketNumber_158 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Litigation", "Litigation (0)", StrClaimNumber_158, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
			parentlogger.log(LogStatus.INFO, "New Litigation Is Created Successfully With Docket Number::"+ " " + color.RMA_ChangeColor_Utility(DocketNumber_158, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================New Litigation Creation Is Completed Here======================================================================================================================================================================================*/
			/*========================================Addition Of Litigation Is Started Here===============================================================*/
			//			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Litigation (0)"), "Litigation", logval);
			//			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_AddNew(driver), "Add New Link For Litigation",logval);
			//			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Add New Context Menu Option Is Clicked");
			//			// Add New Litigation Link Is Selected
			//
			//			DocketNumber_158 = String.valueOf("Lit_"+RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111, 9999));
			//			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("litigation");
			//			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Page" , DocketNumber_158, logval);
			//			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Page", logval);
			//			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Litigation Page Is Saved ");
			//
			//			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			//			driver.switchTo().parentFrame();
			//			RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Litigation Page" , logval);
			//			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("litigation");			
			//			StrLitigationDocketNum_158 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
			//			RMA_Verification_Utility.RMA_TextCompare(DocketNumber_158, StrLitigationDocketNum_158 , "Litigation Docket Number Value", logval);
			//			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Non Existence Of RMA Application Error", StrScreenShotTCName)));
			//			

			//===============================================Addition Of Litigation Is Completed========================================================================================================
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Started========================================================================================================

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Litigation ("+DocketNumber_158+")"), "Expand/Collapse Image For The Created Litigation On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To Litigation "+" "+DocketNumber_158 +"Is Clicked");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(driver, "Litigation ("+DocketNumber_158+")"), "Persons Involved Link Under Created Litigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existence Of Person Involved Link Under Litigation", StrScreenShotTCName)));
			//===============================================Steps To Verify Persons Involved Link In Created Litigation Completed========================================================================================================



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


		} catch (Exception|Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}

		finally 
		{
			reports.endTest(parentlogger); 
		}
	}		
}

