package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

//import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
//import rmaseleniumutilties.RMA_Functionality_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_UserCreationSASuite3_Updated
//Description    : TC_UserCreationSASuite3_ModuleGroup and User Creation
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-02-24-2016 
//Revision       : 0.1 - ImteyazAhmad-06-28-2016
//=================================================================================================

public class RMA_TC_UserCreationSASuite3_Updated extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	public static String StrUsera2_TC_UserCreationSASuite3;
	public static String StrUsera1_TC_UserCreationSASuite3;
	public static String StrUsercsc_TC_UserCreationSASuite3;
	public static String StrUserq1_TC_UserCreationSASuite3;
	public static String StrUserq2_TC_UserCreationSASuite3;
	public static String StrUserb2_TC_UserCreationSASuite3;
	public static String StrUserb1_TC_UserCreationSASuite3;

	@Test 
	public void RMA_TC_UserCreationSASuite3_Test () throws Exception, Error

	{
		try {
			parentlogger = reports.startTest("TC_UserCreationSASuite3_ Module Group And Users Are Created", "Module Group Is Created and User Is Added Into Respective Group");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			StrScreenShotTCName = "TC_UserCreationSASuite3";


			StrUsera2_TC_UserCreationSASuite3  = "loginmgr2";
			StrUsera1_TC_UserCreationSASuite3  = "loginmgr1";
			StrUsercsc_TC_UserCreationSASuite3 = "loginuser";
			StrUserq1_TC_UserCreationSASuite3 = "userq1";
			StrUserq2_TC_UserCreationSASuite3 =	"userq2";		
			StrUserb1_TC_UserCreationSASuite3 = "userb1";
			StrUserb2_TC_UserCreationSASuite3 = "userb2";

			parentlogger.log(LogStatus.PASS, "User Assigned To Correct Variable Is Successfull");

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
				RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,0);
			}

		} catch (Exception |Error e) {

			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}

		finally
		{
			reports.endTest(parentlogger);
		}
	}
}

