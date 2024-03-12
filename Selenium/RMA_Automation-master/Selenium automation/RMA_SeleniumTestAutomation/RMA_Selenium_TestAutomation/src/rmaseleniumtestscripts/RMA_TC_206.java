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
//TestCaseID     : RMA_TC_206
//Description    : TC_206_ Verify A Property Claim can be created
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-07-15-2016 
//=================================================================================================

public class RMA_TC_206 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_206;

	@Test
	public void RMA_TC_206_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_206_ Verify that Persons Involved Link/Option Is Present For Property Claim", "Verify that Persons Involved Link/Option Is Present For Property Claim");
			parentlogger.assignAuthor("Renu Verma");
			
			String RMAApp_PropertyClaim_Txt_ClaimType;
			String RMAApp_PropertyClaim_Txt_Department;
			int RMAApp_PropertyClaim_Txt_DateOfEvent;
			int RMAApp_PropertyClaim_Txt_TimeOfEvent;
			int RMAApp_PropertyClaim_Txt_DateOfClaim;
			int RMAApp_PropertyClaim_Txt_TimeOfClaim;
			String RMAApp_PropertyClaim_Txt_PropertyID;
			//Local Variable Declaration Completed Here
		
			StrScreenShotTCName = "TC_206";
			testcall1 = false;			
			loggerval1 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_09_PI_AddNewEntity_ClaimTestData.xlsx"); //Excel WorkBook RMA_Suite_05_PersonsInvolvedTestData Is Fetched To Retrieve Data
			RMAApp_PropertyClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_206", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_206
			RMAApp_PropertyClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_206", 1, 1); // Department Is Fetched From DataSheet RMA_TC_206
			RMAApp_PropertyClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_206", 1, 2);//DateOfEvent Is Fetched From DataSheet RMA_TC_206
			RMAApp_PropertyClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_206", 1, 3);//TimeOfEvent Is Fetched From DataSheet RMA_TC_206
			RMAApp_PropertyClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_206", 1, 4);//DateOfClaim Is Fetched From DataSheet RMA_TC_206
			RMAApp_PropertyClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_206", 1, 5);//TimeOfClaim Is Fetched From DataSheet RMA_TC_206
			RMAApp_PropertyClaim_Txt_PropertyID = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_206", 1, 6); // PropertyId Is Fetched From DataSheet RMA_TC_206
			
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			
			/*===========================================================Creation Of Property Claim Is Started Here================================================*/
			
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PropertyClaim Creation Is Called To Create A Property Claim");
			testcall1 = true;
			StrClaimNumber_206 = RMA_Functionality_Utility.RMA_PropertyClaimCreation(RMAApp_PropertyClaim_Txt_ClaimType, RMAApp_PropertyClaim_Txt_Department, RMAApp_PropertyClaim_Txt_DateOfEvent, RMAApp_PropertyClaim_Txt_TimeOfEvent, RMAApp_PropertyClaim_Txt_DateOfClaim, RMAApp_PropertyClaim_Txt_TimeOfClaim, RMAApp_PropertyClaim_Txt_PropertyID, logval1);
			parentlogger.log(LogStatus.INFO, "New Property Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_206, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Property Claim Is Completed Here================================================*/
			
			//===============================================Expand The Persons Involved Link/Option On General Claim Is Started=====================================================================================================
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver,"PROP"), "Person Involved Link On Left Hand Navigation Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Link Of Claim", StrScreenShotTCName)));
			//===============================================Expand The Persons Involved Link/Option On General Claim Is Completed=====================================================================================================
			
						
		}
		catch(Exception|Error e)
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PropertyClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
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

