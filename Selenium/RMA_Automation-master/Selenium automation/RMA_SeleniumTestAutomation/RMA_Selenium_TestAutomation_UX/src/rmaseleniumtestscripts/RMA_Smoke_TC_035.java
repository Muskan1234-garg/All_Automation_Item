package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_035
//Description    : Successful Send Mail For A Claim Is With Cancel Button Functionality Validation, Data Entry In To, CC Text Box & Type List Box , Subject And Regarding Text Box (Value Verification), Attach To Document And Executive Summary CheckBox Checked
//Depends On TC  : RMA_Smoke_TC_002,RMA_Smoke_TC_009,RMA_Smoke_TC_011
//Revision       : 0.0 - RenuVerma-06-26-2017
//===============================================================================================================================================================================================================================================================================================
public class RMA_Smoke_TC_035 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	@Test 
	public void RMA_Smoke_TC_035_Test () throws Exception, Error 
	{
		StrScreenShotTCName = null;
		StrScreenShotTCName = "Smoke_TC_035";
		testcall1 = false;	
		loggerval1 = "NotInitialized";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed Here
		try {
		
		parentlogger = reports.startTest("RMA_Smoke_TC_035_Send Mail Verification For Payment", "Send Mail Functionality For A Payment Is Validated");
		parentlogger.assignAuthor("Renu Verma");
		String RMAApp_SendMail_Txt_To ;
		String RMAApp_SendMail_Txt_CC;
		String MailBody;
		//Local Variable Declaration Completed Here
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data 
		RMAApp_SendMail_Txt_To = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 0); //To Email ID Is Fetched From DataSheet RMA_Smoke_TC_028
		RMAApp_SendMail_Txt_CC = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 1); //CC Email ID  Is Fetched From DataSheet RMA_Smoke_TC_028
		//Local Variable Initialization Completed Here
		//===========================================================Steps To Open Send Mail Page Started Here===========================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_SendMail(driver), "Send Mail Image On Payment Page", logval);
		//===========================================================Steps To Open Send Mail Page Completed Here=========================================================================================================
		//===========================================================Steps To Send Mail Started Here===================================================================================================================
		parentlogger.log(LogStatus.INFO,"Following Function:: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SendMail","RMA_SendMail_Utility",0)+" Is Called To Send Mail For Payment::"+ " "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011);
		testcall1 = true;
		MailBody = RMA_Functionality_Utility.RMA_SendMail_Utility(RMAApp_SendMail_Txt_To , RMAApp_SendMail_Txt_CC, "Payment Page For Control Number" +  " " +RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011 , "Email", StrClaimNumber,true,logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "Email Is Sent Successfully With Mail Body"+ " "+color.RMA_ChangeColor_Utility(MailBody, 2));
		//===========================================================Steps To Send Mail Completed Here================================================================================================================
		
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
		} catch (Exception |Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	
	 finally
	    {
		 try {
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
