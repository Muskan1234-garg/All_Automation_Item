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
//TestCaseID     : RMA_TC_174
//Description    : TC_174_Verify That  Workers Comp Claim Can Be Created
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-07-08-2016
//=================================================================================================

public class RMA_TC_174 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_174;
	public static String StrWitnessLastName_174;


	@Test
	public void RMA_TC_174_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_174_Workers Comp Claim Creation", "Verify That  Workers Comp Claim Can Be Created");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String RMAApp_WorkersCompClaim_Txt_ClaimType;
			int RMAApp_WorkersCompClaim_Txt_EmployeeNo;
			String RMAApp_WorkersCompClaim_Txt_Department;
			int RMAApp_WorkersCompClaim_Txt_DateOfEvent;
			int RMAApp_WorkersCompClaim_Txt_TimeOfEvent;
			int RMAApp_WorkersCompClaim_Txt_DateOfClaim;
			int RMAApp_WorkersCompClaim_Txt_TimeOfClaim;
			String RMAApp_WorkersCompClaim_Txt_Jurisdiction;


			//Local Variable Declaration Completed Here


			StrScreenShotTCName = "TC_174";
			testcall1 = false;		
			testcall2 = false;
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_08_PI_AddExisting_OnClaimTestData.xlsx"); //Excel WorkBook RMA_Suite_05_PersonsInvolvedTestData Is Fetched To Retrieve Data
			RMAApp_WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_174", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_174", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_174", 1, 2); // Department Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_174", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_174", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_174", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_174", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_TC_174
			RMAApp_WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_174", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_TC_174

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed

			/*===========================================================Creation Of Workers Comp Claim Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_WorkersCompClaimCreation Is Called To Create A Workers Comp Claim");
			testcall1 = true;
			StrClaimNumber_174 = RMA_Functionality_Utility.RMA_WorkersCompClaimCreation(RMAApp_WorkersCompClaim_Txt_ClaimType, RMAApp_WorkersCompClaim_Txt_EmployeeNo, RMAApp_WorkersCompClaim_Txt_Department, RMAApp_WorkersCompClaim_Txt_DateOfEvent, RMAApp_WorkersCompClaim_Txt_TimeOfEvent, RMAApp_WorkersCompClaim_Txt_DateOfClaim, RMAApp_WorkersCompClaim_Txt_TimeOfClaim, RMAApp_WorkersCompClaim_Txt_Jurisdiction, logval1);
			parentlogger.log(LogStatus.INFO, "New Workers Comp Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_174, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_174), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_174), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			/*===========================================================Creation Of Workers Comp Claim Is Completed Here================================================*/

			//===============================================Steps To Create A New Witness Started============================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_174), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create A Witness ");
			testcall2 = true;
			StrWitnessLastName_174 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Witness", logval1);
			parentlogger.log(LogStatus.INFO, "New Witness Is Created Successfully With Witness Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrWitnessLastName_174, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Witness Creation Is Successfull", StrScreenShotTCName)));
			//===============================================Steps To Create A New Witness Completed============================================================================================================================================

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
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PIAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

