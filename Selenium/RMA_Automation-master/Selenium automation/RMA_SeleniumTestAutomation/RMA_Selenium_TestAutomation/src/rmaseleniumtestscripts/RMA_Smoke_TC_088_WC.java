package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyDownload;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_088_WC
//Description    : Successful Attach An Internal Policy On Worker's Comp Claim For Carrier Client Is Validated
//Depends On TC  : RMA_Smoke_TC_087_WC
//Revision       : RenuVerma-01-05-2017 
//Note				: No Need to Add Claimant on Workers' Comp
//=================================================================================================

public class RMA_Smoke_TC_088_WC extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_Smoke_088_WC;
		
	@Test
	public void RMA_Smoke_TC_088_WC_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_088_WC_Attach An Internal Policy On Worker's Comp Claim For Carrier Client", "Successful Attach An Internal Policy On Worker's Comp Claim For Carrier Client Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			String WorkersCompClaim_Txt_ClaimType;
			String WorkersCompClaim_Txt_Department;
			Date WorkersCompClaim_Txt_DateOfEvent;
			int WorkersCompClaim_Txt_TimeOfEvent;
			Date WorkersCompClaim_Txt_DateOfClaim;
			int WorkersCompClaim_Txt_TimeOfClaim;
			int WorkersCompClaim_Txt_EmployeeNo;
			String WorkersCompClaim_Txt_Jurisdiction;
			String strPrimaryWindowHandle;
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_088_WC";
			testcall1 = false;
			loggerval1 = "NotInitialized";
				
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_08TestData Is Fetched To Retrieve Data
			WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_088_WC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_088_WC
			WorkersCompClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_088_WC", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_088_WC
			WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_088_WC", 1, 2); // Department Is Fetched From DataSheet RMA_TC_088_WC
			WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_088_WC", 1, 3); // Jurisdiction Is Fetched From DataSheet RMA_TC_088_WC
		
			// Current Date and Time is Required to Create the Claim as Internal Policy Is Also Created For Current Date Only.
			WorkersCompClaim_Txt_DateOfEvent=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());//Current Date Of Event Is Fetched
			WorkersCompClaim_Txt_DateOfClaim=WorkersCompClaim_Txt_DateOfEvent; //Current Date Of Claim Is Fetched 
			WorkersCompClaim_Txt_TimeOfEvent= Integer.parseInt(RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility());//Current Time Of Event Is Fetched
			WorkersCompClaim_Txt_TimeOfClaim=WorkersCompClaim_Txt_TimeOfEvent;//Current Time Of Claim Is Fetched

			/*===========================================================Attached Internal Policy On Worker's Comp Claim Is Started  Here================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WorkerCompACON","RMA_WorkersCompClaimCreation_ACON",0)+" Is Called To Create A Workers Comp Claim");
			testcall1 = true;
			StrClaimNumber_Smoke_088_WC = RMA_Functionality_Utility.RMA_WorkersCompClaimCreation_ACON(WorkersCompClaim_Txt_ClaimType, WorkersCompClaim_Txt_EmployeeNo, WorkersCompClaim_Txt_Department,WorkersCompClaim_Txt_DateOfEvent, WorkersCompClaim_Txt_TimeOfEvent,  WorkersCompClaim_Txt_DateOfClaim, WorkersCompClaim_Txt_TimeOfClaim, WorkersCompClaim_Txt_Jurisdiction,RMA_Smoke_TC_087_WC.StrPolicyCode_Smoke_TC_087_WC,false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
		
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_Smoke_088_WC);
			strPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_rmAPolicySearch(driver), "rmA Policy Search Button On Worker's Comp Claim Page", logval);// Policy download button click
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPolicy_Txt_PolicyName(driver), "Standard Policy Search page","Policy Name TextBox",RMA_Smoke_TC_087_WC.StrPolicyName_Smoke_TC_087_WC,RMA_Smoke_TC_087_WC.StrPolicyName_Smoke_TC_087_WC, StrClaimNumber_Smoke_088_WC,strPrimaryWindowHandle, logval);
			RMA_Verification_Utility.RMA_PartialTextVerification("USD", RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_CurrencyType(driver).getAttribute("value"), "Currency Type", logval);// Verify currency type is auto-populated as saved in Policy LOB.
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_Smoke_088_WC, false, "NA", "Worker's Comp Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_List_multipolicyid(driver), RMA_Smoke_TC_087_WC.StrPolicyName_Smoke_TC_087_WC, "Policy Name List On Claim Page", logval);
			parentlogger.log(LogStatus.INFO, "New Worker's Comp Claim Is Created With Claim Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_Smoke_088_WC, 2)+ " And Attached Policy Number Is:: "+color.RMA_ChangeColor_Utility(RMA_Smoke_TC_087_WC.StrPolicyNum_Smoke_TC_087_WC, 3));
			/*===========================================================Attached Internal Policy On Worker's Comp Claim Is Completed Here================================================*/
				
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_WorkersCompClaimCreation_ACON" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
						
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

