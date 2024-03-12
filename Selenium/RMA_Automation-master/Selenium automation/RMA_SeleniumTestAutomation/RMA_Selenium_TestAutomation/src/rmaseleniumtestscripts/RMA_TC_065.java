package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExtentReports_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_065
//Description    : TC_065_Verify that Notify immediate manager setting is Off in payment system parameters
//Revision       : 0.0 - ImteyazAhmad-02-03-2016 
//=================================================================================================

public class RMA_TC_065 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test 
	public void RMA_TC_065_Test () throws Exception, Error
	{
		try {
			loggerval1 = "NotInitialized";
			testcall1 = false; 
			parentlogger = reports.startTest("TC_065_Notify Immediate Manager Setting Is Off In Payment System Parameters", "Verify That Notify Immediate Manager Setting Is Off In Payment System Parameters");

			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Enable Settings On Payment Parameter Setup Page :  RMA_TC_021 ");
			testcall1 = true;
			RMA_TC_021 PaymentParaSetup = new RMA_TC_021();
			PaymentParaSetup.RMA_TC_021_Test();
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);		

		} catch (Exception|Error e) {
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
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_021: Enable Settings On Payment Parameter Setup" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			throw (e);
		}
	}

	@AfterMethod
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
	{
		try {

			StrScreenShotTCName = "TC_065";
			String TestCaseName;
			if (ITestResult.FAILURE == result.getStatus())
			{
				TestCaseName = result.getName();
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}
			reports.endTest(parentlogger);
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		finally
		{
			reports.endTest(parentlogger);
			reports.flush();
		}
	}
}