package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_028
//Description    : Send Mail Functionality For A Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-08-02-2016 
//=================================================================================================
public class RMA_Smoke_TC_028 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_028_Test () throws Exception, Error 
//Send Mail Functionality For A Claim Is Validated
{
	try {
		
		String StrPrimaryWindowHandle;
		String RMAApp_SendMail_Txt_To;
		String RMAApp_SendMail_Txt_CC;
		String RMAApp_SendMail_Txt_Body;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_028_Send Mail Verification", "Send Mail Functionality For A Claim Is Validated");
		
		testcall1 = false;			
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "Smoke_TC_028";
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_SendMail_Txt_To = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 1); //To Email ID Is Fetched From DataSheet RMA_Smoke_TC_028
		RMAApp_SendMail_Txt_CC = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 2); //CC Email ID  Is Fetched From DataSheet RMA_Smoke_TC_028
		RMAApp_SendMail_Txt_Body = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_028", 1, 0); //Mail Body Is Fetched From DataSheet RMA_Smoke_TC_028
		//===========================================================Steps To Open Send Mail Page Started Here============================================================================================================================================================================================================================================================
		
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver, StrClaimNumber_002), "Claim Number" + " " + StrClaimNumber_002 + "Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_SendMail(driver), "Send Mail Image On Claims Page",logval);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		//===========================================================Steps To Open Send Mail Page Completed Here============================================================================================================================================================================================================================================================
		//===========================================================Steps To Send Mail Started Here============================================================================================================================================================================================================================================================
		parentlogger.log(LogStatus.INFO,"Following Function:: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("SendMail","RMA_SendMail_Utility",0)+" Is Called To Send Mail");
		testcall1 = true;
		RMA_Functionality_Utility.RMA_SendMail_Utility(RMAApp_SendMail_Txt_To, RMAApp_SendMail_Txt_CC, RMAApp_SendMail_Txt_Body, "Claims Page Of Calim Number" +  " " +StrClaimNumber_002 , logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "Email Is Sent Successfully");
		//===========================================================Steps To Send Mail Completed Here============================================================================================================================================================================================================================================================
		driver.switchTo().window(StrPrimaryWindowHandle);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
	
	
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
