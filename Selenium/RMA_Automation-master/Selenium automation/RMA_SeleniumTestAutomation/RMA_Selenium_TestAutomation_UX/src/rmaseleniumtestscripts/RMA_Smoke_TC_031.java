package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_031
//Description    : Edit Of Reserve Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-07-06-2017 
//=================================================================================================
public class RMA_Smoke_TC_031 extends rmaseleniumtestscripts.RMA_TC_BaseTest{

	@Test 
	public void RMA_Smoke_TC_031_Test() throws Exception, Error
	{	
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "RMA_Smoke_TC_031";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;

		parentlogger = reports.startTest("RMA_Smoke_TC_031_Reserve Edit", "Edit Of Reserve Is Validated");
		parentlogger.assignAuthor("Renu Verma");
		try 
		{

			String ReserveCreation_Lst_ReserveType;
			String ReserveCreation_Lst_Status;
			int Reserve_Txt_EditedReserveAmount;
			int ReserveCreation_Txt_ReserveAmount;
			//Local Variable Declaration

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 IS Fetched To Retrieve Data
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_009
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_031", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_009
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_031", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
			//RMA_ExcelDataRetrieval_Utility ExcelData1 = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01-01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01-01 IS Fetched To Retrieve Data
			Reserve_Txt_EditedReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_031", 1, 3); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_031
			String []ExpectedColHeadersToBeVerified={"Balance","Paid","Collection","Incurred","Status"};		
			String []ExpectedEdiedValuesToBeVerified={"$"+Reserve_Txt_EditedReserveAmount+ ".00", "$0.00", "$0.00", "$"+Reserve_Txt_EditedReserveAmount+ ".00", ReserveCreation_Lst_Status};
			//Local Variable Initialization Completed Here

			/*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Reserve ");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 3) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 3));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================New Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/

			/*===========================================================Edit Of Reserve Is Started==============================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Chk_ReserveFirstRowSelection(driver), "Financial Reserve Row On Reserve Table", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_EditReserve(driver), "Edit Reserve Image On Financial Reserve Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver).clear();
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Txt_ReserveAmount(driver), "Reserve Amount Field On Edit Reserve Window On Financial Reserves Page", String.valueOf(Reserve_Txt_EditedReserveAmount),logval);
			RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lst_Status(driver).click();
			RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Edit Reserve Page", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Reserve Edited", "Reserve Is Edited Successfully")));

			driver.switchTo().parentFrame();			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Financials/Reserves"),"Financials/Reserves Link At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_NGGrid_Btn_NGGridColumnSort(driver), "Column Header of Reserve NG Grid Table",logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Btn_RestoreState(driver), "Restore State Button In Column Selection Header On Reserves NG Grid Table", logval);
			RMA_GenericUsages_Utility.RMA_CheckVerificationNGGridColumnHeader(ExpectedColHeadersToBeVerified, "Reserve", logval);
			RMA_Input_Utility.RMA_JavaScriptSetValue_Utility(RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreationTbl_Txt_ReserveNGGrid_FilterTextBox(driver, "Reserve Type"), "Reserve Type Filter Text Box On Reserve Table", ReserveCreation_Lst_ReserveType,logval);//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			//Name of The Reserve Type Is Entered In Reserve Type Input Box On Reserves NG Grid
			RMA_Verification_Utility.RMA_VerifyUXGrid_Utility(ReserveCreation_Lst_ReserveType, "Reserve UX Grid",ExpectedColHeadersToBeVerified, ExpectedEdiedValuesToBeVerified, logval);
			//Verification Of Correct Reserve Creation Is Being Displayed On Reserves NG Grid Is Done
			/*=============================================================Edit Of Reserve Is Completed==============================================================================*/

		} catch (Exception|Error e) {
			ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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

			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ReserveAdditionModified_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
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
			try {
				if(RMA_GenericUsages_Utility.RMA_GetCurrentFrameID().equalsIgnoreCase(DefaultFrameID)){
					driver.switchTo().parentFrame();
				}
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
