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

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_106
//Description    : Verify Reserve Is Added Successfully Is Validated 
//Depends On TC  : RMA_QTPRegression_TC_105
//Revision       : 0.0 - AbhishekRai-10-13-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_106 extends RMA_TC_BaseTest {

	@Test
	public void RMA_QTPRegression_TC_106_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_106_Verify Reserve Is Added Successfully", "Verify Reserve Is Added Succesfully Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");

			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			testcall1 = false;	
			loggerval1 = "NotInitialized";			
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_106";
			ErrorMessage = null;
			CurrentFrameID=null;
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================

			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================				
			String ReserveCreation_Lst_ReserveStatus;
			String ReserveCreation_Lst_ReserveType;
			int ReserveCreation_Txt_ReserveAmount;		
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
					
			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite18_QTPRegression_10.xlsx"); //Excel WorkBook RMA_Suite18_QTPRegression_10 IS Fetched To Retrieve Data			
			ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_106", 1, 0); //Reserve Type Is Fetched From DataSheet RMA_QTPRegression_TC_106
			ReserveCreation_Lst_ReserveStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_106", 1, 1); //Reserve Status Is Fetched From DataSheet RMA_QTPRegression_TC_106
			ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_QTPRegression_TC_106", 1, 2); //Reserve Amount Is Fetched From DataSheet RMA_QTPRegression_TC_106
			//ReserveCreation_Lst_ReserveReason = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_106", 1, 2); //Reserve Reason Is Fetched From DataSheet RMA_QTPRegression_TC_106
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);			
			
			//Region =====================================================Steps To Create Reserve  Is Started Here=================================================================================================
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveCorpAddition","RMA_ReserveCorpAddition_Utility",0)+" Is Called To Create A Medical Reserve ");
			testcall1 = true;
			RMA_Functionality_Utility.RMA_ReserveCorpAddition_Utility(ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_ReserveStatus, ReserveCreation_Lst_ReserveType, "No", StrClaimNumber, logval1);
			parentlogger.log(LogStatus.INFO, "New Medical Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 2) + " " + "And Amount::"+ " " + color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount),2) + " " + "And Claim Number::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(StrClaimNumber), 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			//EndRegion ==================================================Steps To Create Reserve Creation Is Completed Here=======================================================================================
			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber+" Claim Number Link At The Top Of The RMA Application Page",logval);					
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ReserveCorpAddition_Utility" + " " +  "To Create Reserve And Hence The Test Case Is A Fail");
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

