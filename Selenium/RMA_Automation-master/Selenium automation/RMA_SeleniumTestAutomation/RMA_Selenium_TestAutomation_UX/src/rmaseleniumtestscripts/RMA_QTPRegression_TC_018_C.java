package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_LOBClaimOptions;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_018_C
//Description    : CleanUp Of Duplicate Claim Criteria Settings Is Validated 
//Revision       : 0.0 - AbhishekRai-07-27-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_018_C extends RMA_TC_BaseTest {	
	@Test
	public void RMA_QTPRegression_TC_018_C_Test() throws Exception,Error {
		try{ 
			String LOBParameterSetUp_Lst_ClaimType;
			String LOBParameterSetUp_Lst_ClaimType_1;
			//Local Variable Declaration Completed Here

			parentlogger = reports.startTest("RMA_QTPRegression_TC_018_C_Duplicate_Claim_Criteria Settings CleanUp", "CleanUp Of Duplicate Claim Criteria Settings Is Validated ");
			parentlogger.assignAuthor("Kumud Naithani");
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_018_C";
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_04_QTPRegression_03.xlsx"); //Excel WorkBook RMA_Suite_04_QTPRegression_03 IS Fetched To Retrieve Data 
			LOBParameterSetUp_Lst_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_018_C", 1, 0); //LOBParameterSetUp_Lst_ClaimType Is Fetched From DataSheet RMA_QTPRegression_TC_018_C			
			LOBParameterSetUp_Lst_ClaimType_1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_018_C", 1, 1); //LOBParameterSetUp_Lst_ClaimType_1 Is Fetched From DataSheet RMA_QTPRegression_TC_018_C		
			//============================================================Steps To Un-Check Duplicate Claim Criteria Setting Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);		
			rmaseleniumutilties.RMA_Functionality_Utility.RMA_MDIMenuClick_Utility("Utilities-SystemParameters-LineOfBusinessParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.LOBParameterFrame);					
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_LOBClaimOptions.RMAApp_LOBParaSetUp_Lst_LOB(driver), LOBParameterSetUp_Lst_ClaimType, "Line of Business List Box", "LOBParameter Setup Page" ,logval);		

			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claim Options Tab Needs To Be Clicked");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_LOBClaimOptions.RMAApp_LOBClaimOptions_Lnk_ClaimOptions(driver), "Claim Options Tab On LOB Parameter Setup Page",logval);// Claim Options Tab On LOB Parameter Setup Page Is Clicked			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_LOBClaimOptions.RMAApp_LOBClaimOptions_Chk_AllowDuplicateClaimChecking(driver), "uncheck", "Allow Duplicate Claim Checking Check Box", "LOB Parameter Setup Page", logval);
			//Settings Unchecked For ClaimType ::LOBParameterSetUp_Lst_ClaimType
			
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_LOBClaimOptions.RMAApp_LOBParaSetUp_Lst_LOB(driver), LOBParameterSetUp_Lst_ClaimType_1, "Line of Business List Box", "LOBParameter Setup Page" ,logval);		
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claim Options Tab Needs To Be Clicked");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_LOBClaimOptions.RMAApp_LOBClaimOptions_Lnk_ClaimOptions(driver), "Claim Options Tab On LOB Parameter Setup Page",logval);// Claim Options Tab On LOB Parameter Setup Page Is Clicked			
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_LOBClaimOptions.RMAApp_LOBClaimOptions_Chk_AllowDuplicateClaimChecking(driver), "uncheck", "Allow Duplicate Claim Checking Check Box", "LOB Parameter Setup Page", logval);
			//Settings Unchecked For ClaimType ::LOBParameterSetUp_Lst_ClaimType_1
			
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver),"Save Image On Duplicate Claim Criteria" ,logval);		
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==============================================================Steps To Un-Check Duplicate Claim Criteria Setting Is Completed Here======================================================================================================================================================================================================================================
		} 
		catch (Exception|Error e) {

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

		} catch (Exception |Error e) {
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
