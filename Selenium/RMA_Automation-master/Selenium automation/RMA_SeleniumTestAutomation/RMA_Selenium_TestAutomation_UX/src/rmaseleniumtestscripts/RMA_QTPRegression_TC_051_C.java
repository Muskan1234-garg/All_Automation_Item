package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_LOB_ResIncBalOptions;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Utilities_LOB;
//RMA Package Import Completed
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;

//==================================================================================================================================================================================
//TestCaseID   	 : RMA_QTPRegression_TC_051_C
//Description  	 : To Reset LOB Parameter Setting After Suite24 Is Validated
//Depends On TC  : None
//Revision		 : 0.0 - AnubhutiVyas -08-09-2017 
//========================================================================================================================================================================================
public class RMA_QTPRegression_TC_051_C extends RMA_TC_BaseTest{

	@Test 
	public void RMA_QTPRegression_TC_051_C_Test() throws Exception, Error
	{	
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_051_C";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		//Global Variable Initialization Is Completed Here

		try {
			parentlogger = reports.startTest("RMA_QTPRegression_TC_051_C_To Reset LOB Parameter Setting Related To Suite24", "To Reset LOB Parameter Setting After Suite24 Is Validated");
			parentlogger.assignAuthor("Anubhuti Vyas");
			
			String LOBParameterSetUp_Lst_LOB;
			//Local Variable Declaration Is Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite17_QTPRegression_07.xlsx"); //Excel WorkBook RMA_Suite17_QTPRegression_07 IS Fetched To Retrieve Data 
			LOBParameterSetUp_Lst_LOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_051_C", 1, 0); //LOB Type Is Fetched From DataSheet RMA_QTPRegression_TC_051_C
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			//==============================================================Steps To Navigate To LOB Parameter Setup Screen Is Started Here=================================================================================================================================================================================================================================================
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-LineOfBusinessParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.LOBParameterFrame);
			//==============================================================Steps To Navigate To LOB Parameter Setup Screen Is Completed Here=================================================================================================================================================================================================================================================
			//==============================================================LOB Parameter Setup Is Started Here=================================================================================================================================================================================================================================================
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Lst_LineOfBusiness(driver), LOBParameterSetUp_Lst_LOB, "Line of Business List Box", "LOB Parameter Setup" ,logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Added On Line of Business List Box ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Reserve Options"), "Reserve Options Tab On LOB Parameter Setup Page",logval);// Reserve Options Tab On LOB Parameter Setup Page Is Clicked
			RMA_Navigation_Utility.RMA_RadioButtonSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOBReserveOptions_Rdb_DoNothing(driver), "Do Nothing On Claim Closed", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOBReserveOptions_Chk_AutoAdjustOpenClaims(driver), "uncheck", "Auto Adjust Negative Reserves To Zero(Open Claims) Check Box", "LOB Reserve Options Setup", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOBReserveOptions_Chk_AutoAdjustOpenClaimsPerResrv(driver), "uncheck", "Auto Adjust Negative Reserves To Zero(Open Claims) Check Box Per Reserve", "LOB Reserve Options Setup", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_UseReserveWorsheet(driver), "uncheck", "Use Reserve WorkSheet", "LOB Reserve Options Setup", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_CheckForInsufficientReserveFnd(driver), "uncheck", "Check for Insufficient Reserve Funds", "LOB Reserve Options Setup", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Reserve/Incurred Balance Options"), "Reserve/Incurred Balance Options Tab On LOB Parameter Setup Page",logval);// Reserve/Incurred Balance Options Tab On LOB Parameter Setup Page Is Clicked
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_LOB_ResIncBalOptions.RMAApp_LOB_Chk_CalculateCollectionsinIncurredBalance(driver), "uncheck", "Calculate Collections in Reserve Balance:", "LOB Reserve Options Setup", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_LOB_ResIncBalOptions.RMAApp_LOB_Chk_CalculateCollectionsinReserveBalance(driver), "uncheck", "Calculate Collections in Incurred Balance", "LOB Reserve Options Setup", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(RMA_Selenium_POM_VerificationMessage.LOBParameterFrame, false, "NA", "Line of Business Parameter Setup Page", logval);
			//Save Button Is Clicked To Save The Settings
			//==============================================================LOB Parameter Setup Is Completed Here=================================================================================================================================================================================================================================================
				
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}



