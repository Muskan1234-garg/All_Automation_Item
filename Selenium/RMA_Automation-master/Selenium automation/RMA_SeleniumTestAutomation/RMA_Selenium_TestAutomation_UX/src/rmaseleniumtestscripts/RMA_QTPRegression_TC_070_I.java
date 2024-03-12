package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_070_I
//Description    : General Parameter Settings 'Sub Bank Account' Is Validated
//Depends On TC  : None
//Revision       : 0.0 - AbhishekRai-10-05-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_QTPRegression_TC_070_I extends RMA_TC_BaseTest {

	@Test
	public void RMA_QTPRegression_TC_070_I_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_QTPRegression_TC_070_I_General Parameter Settings Sub Bank Account Is Checked", "General Parameter Settings 'Sub Bank Account' Is Validated");
			parentlogger.assignAuthor("Abhishek Rai");
			
			//Region =====================================================Steps To Select General System Parameter And Select Reserve Options Is Started Here=============================================================         
			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);  
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite19__Utility(logval);           			
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();		
			//EndRegion ==================================================Steps To Select General System Parameter And Select Reserve Options Is Completed Here=============================================================
			
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
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

