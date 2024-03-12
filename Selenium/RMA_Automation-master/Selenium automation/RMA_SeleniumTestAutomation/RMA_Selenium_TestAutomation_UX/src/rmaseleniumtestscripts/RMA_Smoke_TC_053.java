package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_053
//Description    : Successful Reserve Creation On The Created Carrier General claim Is Validated
//Depends On TC  : RMA_Smoke_TC_058
//Revision       : 0.0 - NidhiJha-10-31-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_053 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Smoke_TC_053_Test() throws Exception,Error {

		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TC_053";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_053_Carrier Reserve Creation", "Successful Reserve Creation , Successful Reserve Creation On The Created Carrier General claim Is Validated");
			parentlogger.assignAuthor("Nidhi Jha");


			int ReserveCreation_Txt_ReserveAmount;
			int ReserveCreation_Txt_ReserveUnit;
			String ReserveCreation_Txt_Status;
			String ReserveCreation_Txt_ReserveType;
			String ReserveCreation_Txt_CoverageType;
			String ReserveCreation_Txt_LossType;
			//Local Variable Declaration Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite23_SmokeSuite03.xlsx"); //Excel WorkBook RMA_Suite23_SmokeSuite03 IS Fetched To Retrieve Data 
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_053", 1,0 ); //Reserve Amount Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_Status= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_053", 1,1 ); //Reserve Status Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_ReserveType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_053", 1,2 ); //Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_ReserveUnit = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_053", 1,3 ); //Reserve Unit Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_CoverageType =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_053", 1,4 ); //Coverage Type Is Fetched From DataSheet RMA_Smoke_TC_053
			ReserveCreation_Txt_LossType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_053", 1,5 ); //Loss Type Is Fetched From DataSheet RMA_Smoke_TC_053
			//Reserve Creation Data Fetch From Excel WorkBook Is Completed Here


			//Steps To Navigate To Financials/Reserves Page Is Started Here
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);	
			//Steps To Navigate To Financials/Reserves Page Is Ended Here

			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CarrierReserveAddition","RMA_CarrierReserveCorpAddition_Utility",0)+" To Successfully Create A Reserve On A Created Carrier General Claim");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_CarrierReserveAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Txt_Status, ReserveCreation_Txt_ReserveType, "00000" + ReserveCreation_Txt_ReserveUnit,ReserveCreation_Txt_CoverageType,ReserveCreation_Txt_LossType,logval1);
			parentlogger.log(LogStatus.INFO, "Reserve Is Created Successfully On The Created Carrier GC Claim");
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//=============================================================Steps To Create General Claim Is Completed Here=======================================================================



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
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CarrierReserveCorpAddition_Utility" + " To Create A Reserve On The Created Carrier GC Claim Successfully" +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
				driver.switchTo().parentFrame();
				//Thread.sleep(5000);
				// RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On Event Creation Page", logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

