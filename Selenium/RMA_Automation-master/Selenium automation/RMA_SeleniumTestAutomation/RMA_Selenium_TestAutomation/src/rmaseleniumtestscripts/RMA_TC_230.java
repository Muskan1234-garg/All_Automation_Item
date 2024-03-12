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
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_230
//Description    : TC_230_Verify That Person Involved Link Is Present In Created Non Occupational Claim
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-07-29-2016 
//=================================================================================================

public class RMA_TC_230 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_230;
	
	@Test
	public void RMA_TC_230_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_230_Person Involved Link In Non Occupational Claim", "Verify That Person Involved Link Is Present In Created Non Occupational Claim");
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

			StrScreenShotTCName = "TC_230";
			testcall1 = false;		
			testcall2 = false;
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_09_PI_AddNewEntity_ClaimTestData.xlsx"); //Excel WorkBook RMA_Suite_09_PI_AddNewEntity_ClaimTestData Is Fetched To Retrieve Data
			RMAApp_NonOccupationalClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_230", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_230", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_230", 1, 2); // Department Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_230", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_230", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_230", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_230", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_230", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_TC_230
			RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_230", 1, 8);//Disability Start Date Is Fetched From DataSheet RMA_TC_230
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed

			/*===========================================================Creation Of Non Occupational Claim Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_NonOccupationalClaimCreation Is Called To Create A Non Occupational Claim");
			testcall1 = true;
			StrClaimNumber_230 = RMA_Functionality_Utility.RMA_NonOccupationalClaimCreation(RMAApp_NonOccupationalClaim_Txt_ClaimType, RMAApp_NonOccupationalClaim_Txt_EmployeeNo, RMAApp_NonOccupationalClaim_Txt_Department, RMAApp_NonOccupationalClaim_Txt_DateOfEvent, RMAApp_NonOccupationalClaim_Txt_TimeOfEvent, RMAApp_NonOccupationalClaim_Txt_DateOfClaim, RMAApp_NonOccupationalClaim_Txt_TimeOfClaim, RMAApp_NonOccupationalClaim_Txt_Jurisdiction,"MyPlan",RMAApp_NonOccupationalClaim_Txt_DisabilityStartDate, logval1);
			parentlogger.log(LogStatus.INFO, "New Non Occupational Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_230, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_230), "Person Involved Link Under Non Occupational Claim On Left Hand Navigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Link Is Present In Workers Comp Claim", StrScreenShotTCName)));
			
			/*===========================================================Creation Of Non Occupational Claim Is Completed Here================================================*/
							
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_NonOccupationalClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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

