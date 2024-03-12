package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_028
//Description    : Successful Send Mail For A Claim Is With Cancel Button Functionality Validation, Data Entry In To, CC Text Box & Type List Box , Subject And Regarding Text Box (Value Verification), Attach To Document And Executive Summary CheckBox Checked
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-06-22-2017
//===============================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_028 extends RMA_TC_BaseTest {
@Test 
public void RMA_Smoke_TC_028_Test () throws Exception, Error 
{
	try {
		
		StrScreenShotTCName = null;
		StrScreenShotTCName = "Smoke_TC_028";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Declaration
		
		String RMAApp_SendMail_Txt_To;
		String RMAApp_SendMail_Txt_CC;
		String MailBody;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_028_Send Mail Verification", "Successful Send Mail For A Claim Is With Cancel Button Functionality Validation, Data Entry In To, CC Text Box & Type List Box , Subject And Regarding Text Box (Value Verification), Attach To Document And Executive Summary CheckBox Checked");
		testcall1 = false;			
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_028";
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 IS Fetched To Retrieve Data 
		RMAApp_SendMail_Txt_To = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 0); //To Email ID Is Fetched From DataSheet RMA_Smoke_TC_028
		RMAApp_SendMail_Txt_CC = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 1); //CC Email ID  Is Fetched From DataSheet RMA_Smoke_TC_028
		//===========================================================Steps To Open Send Mail Page Started Here============================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		RMA_Functionality_Utility.RMA_ListOptionClick_Utility("Claim-SendMail", logval);
		//===========================================================Steps To Open Send Mail Page Completed Here============================================================================================================================================================================================================================================================
		//===========================================================Steps To Send Mail Started Here============================================================================================================================================================================================================================================================
		parentlogger.log(LogStatus.INFO,"Following Function:: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SendMail","RMA_SendMail_Utility",0)+" Is Called To Send Mail For Claim::"+ " "+StrClaimNumber);
		testcall1 = true;
		MailBody = RMA_Functionality_Utility.RMA_SendMail_Utility(RMAApp_SendMail_Txt_To, RMAApp_SendMail_Txt_CC, "Claims Page For Claim Number" +  " " +StrClaimNumber , "Email", StrClaimNumber,false,logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "Email Is Sent Successfully With Mail Body"+ " "+color.RMA_ChangeColor_Utility(MailBody, 2));
		//===========================================================Steps To Send Mail Completed Here============================================================================================================================================================================================================================================================
	
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
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_SendMail_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		} catch (Exception |Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	
	finally
	{
		driver.switchTo().parentFrame();
		reports.endTest(parentlogger); 
		reports.flush();
	}
}
}
