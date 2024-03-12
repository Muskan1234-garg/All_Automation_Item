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
//TestCaseID     : RMA_Smoke_TC_088_GC
//Description    : Successfully Verify Created Policy Is Attached On General Claim And Addition Of Claimant For Carrier Client Is Validated
//Depends On TC  : RMA_Smoke_TC_087_GC
//Revision       : RenuVerma-01-05-2017 
//Note				: Need to Add Claimant on General Claim For Policy Attachment
//=================================================================================================

public class RMA_Smoke_TC_088_GC extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_Smoke_088_GC;

	@Test
	public void RMA_Smoke_TC_088_GC_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_088_GC_Attach Created Policy On General Claim For Carrier Client And Add Claimant", "Successfully Verify Created Policy Is Attached On General Claim And Addition Of Claimant For Carrier Client Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			String GeneralClaim_Txt_ClaimType;
			String GeneralClaim_Txt_Department;
			Date GeneralClaim_Txt_DateOfEvent;
			int GeneralClaim_Txt_TimeOfEvent;
			Date GeneralClaim_Txt_DateOfClaim;
			int GeneralClaim_Txt_TimeOfClaim;
			String ClaimantLstName;
			String strPrimaryWindowHandle;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_088_GC";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData Is Fetched To Retrieve Data
			GeneralClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_088_GC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_088_GC
			GeneralClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_088_GC", 1,1); // Department Is Fetched From DataSheet RMA_TC_088_GC
			GeneralClaim_Txt_DateOfEvent=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());// Current Date Of Event Is Fetched
			GeneralClaim_Txt_DateOfClaim=GeneralClaim_Txt_DateOfEvent;//Current Date Of Claim Is Fetched
			GeneralClaim_Txt_TimeOfEvent= Integer.parseInt(RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility());//Current Time Of Event Is Fetched
			GeneralClaim_Txt_TimeOfClaim=GeneralClaim_Txt_TimeOfEvent;//Current Time Of Claim Is Fetched

			/*===========================================================Attached Internal Policy On General Claim Is Started  Here================================================*/
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCClaimACON", "RMA_GeneralClaimCreation_ACON",0)+" Is Called To Create A General Claim");
			testcall1 = true;
			StrClaimNumber_Smoke_088_GC=RMA_Functionality_Utility.RMA_GeneralClaimCreation_ACON(GeneralClaim_Txt_ClaimType, GeneralClaim_Txt_Department, GeneralClaim_Txt_DateOfEvent, GeneralClaim_Txt_TimeOfEvent, GeneralClaim_Txt_DateOfClaim, GeneralClaim_Txt_TimeOfClaim,RMA_Smoke_TC_087_GC.StrPolicyCode_Smoke_TC_087_GC,false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_Smoke_088_GC);
			strPrimaryWindowHandle = driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_rmAPolicySearch(driver), "rmA Policy Search Button On Genral Claim Page", logval);// Policy download button click
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchPolicy_Txt_PolicyName(driver), "Standard Policy Search page","Policy Name TextBox",RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC,RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC, StrClaimNumber_Smoke_088_GC,strPrimaryWindowHandle, logval);
			RMA_Verification_Utility.RMA_PartialTextVerification("USD", RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_CurrencyType(driver).getAttribute("value"), "Currency Type", logval);// Verify currency type is auto-populated as saved in Policy LOB.
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_Smoke_088_GC, false, "NA", "General Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifySingle_MultipleWebListData(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_List_multipolicyid(driver), RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC, "Policy Name List On Claim Page", logval);
			parentlogger.log(LogStatus.INFO, "New General Claim Is Created With Claim Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_Smoke_088_GC, 2)+ " And Policy Attached Policy Number Is:: "+color.RMA_ChangeColor_Utility(RMA_Smoke_TC_087_GC.StrPolicyNum_Smoke_TC_087_GC, 3));
			/*===========================================================Attached Internal Policy On General Claim Is Completed Here================================================*/

			/*===========================================================New Claimant Creation Is Started Here=======================================================================================================================================================================================*/
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "HTML","The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Claimant ");
			testcall2 = true;
			ClaimantLstName=RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Claimant", "Claimant (0)", StrClaimNumber_Smoke_088_GC, "NA", "NA", "NA", "NA", "NA", "NA", "NA", logval1);
			parentlogger.log(LogStatus.INFO, "New Claimant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(ClaimantLstName, 3));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================New Claimant Creation Is Completed Here======================================================================================================================================================================================*/

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GeneralClaimCreation_ACON" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

