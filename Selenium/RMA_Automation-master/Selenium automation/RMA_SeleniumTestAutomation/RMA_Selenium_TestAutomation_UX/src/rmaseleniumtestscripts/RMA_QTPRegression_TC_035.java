package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_035
//Description    : Verify new tab 'Reserve/Incurred Balance Options' is created in LOB Setup 
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-08-18-2017
//===================================================================================================================================================================================================================================================================================================================================

public class RMA_QTPRegression_TC_035 extends RMA_TC_BaseTest {	
	@Test
	public void RMA_QTPRegression_TC_035_Test() throws Exception,Error {
		try{ 
			parentlogger = reports.startTest("RMA_QTPRegression_TC_035_Reserve/Incurred Balance Options Is Created In LOB Setup", "Verify new tab 'Reserve/Incurred Balance Options' is created in LOB Setup");
			parentlogger.assignAuthor("Abhishek Rai");
			
			//Region =====================================================Global Variable Initialization Is Started Here=====================================================================================================
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_QTPRegression_TC_035";			
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;	
			//EndRegion ==================================================Global Variable Initialization Is Completed Here==================================================================================================
						
			//Region =====================================================Local Variable Declaration Started Here=====================================================================================================
			String LineOfBussinessParameterSetup_Lst_LOBType;					
			//EndRegion ==================================================Local Variable Declaration Completed Here==================================================================================================
						
			//Region =====================================================Data Fetch From Excel WorkBook Is Started Here=====================================================================================================
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite20_QTPRegression_09.xlsx"); //Excel WorkBook RMA_Suite20_QTPRegression_09 IS Fetched To Retrieve Data 
			LineOfBussinessParameterSetup_Lst_LOBType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_035", 1, 0); //LOB Type Is Fetched From DataSheet RMA_QTPRegression_TC_035
			//EndRegion ==================================================Data Fetch From Excel WorkBook Is Completed Here==================================================================================================
			
			//Region ============================================================Steps To Select Reserve/Incurred Balance Options Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation();
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite20_Check_Utility(StrScreenShotTCName,LineOfBussinessParameterSetup_Lst_LOBType,"NA", "NA", logval);	
			//EndRegion ============================================================Steps To Select Reserve/Incurred Balance Options Is Completed Here=========================================================================================================================================================================================================================================================================
			
			//Region ============================================================Steps To Revert LOB Parameter Setup Page Settings Is Started Here===========================================================================================================================================================================================================================================================================
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite20_UnCheck_Utility(StrScreenShotTCName,LineOfBussinessParameterSetup_Lst_LOBType,"NA", "NA" , logval);
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();	
			//EndRegion ============================================================Steps To Revert LOB Parameter Setup Page Settings Is Completed Here=========================================================================================================================================================================================================================================================================
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
