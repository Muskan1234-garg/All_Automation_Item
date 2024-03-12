package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_009
//Description    : Successful Reserve Creation, Reserve Grid Value Verification, Color Code Change And Tool Tip Amount Of Reserve Progress Image On Claim Screen Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-06-06-2017 
//========================================================================================================================================================================================
public class RMA_Smoke_TC_009 extends RMA_TC_BaseTest{

	@Test 
	public void RMA_Smoke_TC_009_Test() throws Exception, Error
	{
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_009";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//global Variable Initialization Completed Here

		try {
			parentlogger = reports.startTest("RMA_Smoke_TC_009_Reserve Creation On Corporate Claim", "Successful Reserve Creation, Reserve Grid Value Verification, Color Code Change And Tool Tip Amount Of Reserve Progress Image On Claim Screen Is Validated");
			parentlogger.assignAuthor("Renu Verma");
			int ReserveCreation_Txt_ReserveAmount;
			String ReserveCreation_Lst_ReserveType;
			String ReserveCreation_Lst_Status;		
			//Local Variable Declaration Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_009", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_009
			ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_009
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
			//Local Variable Initialization Completed Here

			/*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//Thread.sleep(2000);
			//driver.switchTo().parentFrame();	
			//RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);
			//RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);	
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Reserve ");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status, ReserveCreation_Lst_ReserveType, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 3) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 3));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================New Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/

			/*===========================================================Reserve Creation Verification On Claim Progress Menu Is Started Here====================================================================================================================================================================================================================================================================================================*/
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),"Claim Number At The Top Of The RMA Application Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Verification_Utility.RMA_TextCompare(String.valueOf("Reserves(1)"), RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Lbl_RightClaimProgress(driver, 2).getAttribute("uib-tooltip"), "Reserve Status Tool Tip Value On Claim Progress Menu", logval);//Tool Tip verification
			RMA_Verification_Utility.RMA_PartialTextVerification("rgb(255, 255, 255)", RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Lbl_RightClaimProgress(driver, 2).getAttribute("style"), "Color Of Reserve Status Value On Claim Progress Menu", logval);// Color Verification
			/*===========================================================Reserve Creation Verification On Claim Progress Menu Is Ended Here====================================================================================================================================================================================================================================================================================================*/

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
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);
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

