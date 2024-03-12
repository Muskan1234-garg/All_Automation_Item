package rmaseleniumtestscripts;

import java.net.InetAddress;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_SendMail;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TCCompletionMailReport
//Description    : Successful Send Mail Send Mail After Suite Completion
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-06-29-2017
//===============================================================================================================================================================================================================================================================================
public class RMA_Smoke_TCCompletionMailReport extends RMA_TC_BaseTest {
@Test 
public void RMA_Smoke_TCCompletionMailReport_Test () throws Exception, Error 
{
	try {
		
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_Smoke_TCCompletionMailReport_Test";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Declaration
		
		String RMAApp_SendMail_Txt_To[];
		String RMAApp_SendMail_Txt_CC[];
		String MailBody;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TCCompletionMailReport_Test_Send Mail After Suite Completion", "Successful Send Mail Send Mail After Suite Completion");
		RMAApp_SendMail_Txt_To = new String[]{"saravanan","knaithani"}; //To Email ID Is Fetched From DataSheet RMA_Smoke_TC_028
		RMAApp_SendMail_Txt_CC = new String[]{"Renu"}; //CC Email ID  Is Fetched From DataSheet RMA_Smoke_TC_028
		MailBody="file://"+InetAddress.getLocalHost().getHostAddress()+"/RMASeleniumTestEvidence/RMASeleniumExtentReports/"+RMA_ExtentReports_Utility.RMAApp_ExtentReports;
		
		//===========================================================Steps To Open Send Mail Page Started Here============================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
		RMA_Functionality_Utility.RMA_ListOptionClick_Utility("Claim-SendMail", logval);
		//===========================================================Steps To Open Send Mail Page Completed Here============================================================================================================================================================================================================================================================
		//===========================================================Steps To Send Mail Started Here============================================================================================================================================================================================================================================================
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SendMailFrame);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Header Text Value Needs To Be Fetched For Verification");
				
		// Fill To Mail List
			for(int i=0; i<RMAApp_SendMail_Txt_To.length;i++){
			RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_To(driver).sendKeys(RMAApp_SendMail_Txt_To[i]);
			Thread.sleep(1000);
			RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_To(driver).sendKeys(Keys.TAB);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_To(driver)));
			parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(RMAApp_SendMail_Txt_To[i], 3) +" " +"Is Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility("To TextBox On Send Mail Page",4));	
		}
		
		// Fill CC Mail List
		for(int i=0; i<RMAApp_SendMail_Txt_CC.length;i++){
			RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_CC(driver).sendKeys(RMAApp_SendMail_Txt_CC[i]);
			Thread.sleep(1000);
			RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_CC(driver).sendKeys(Keys.TAB);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_CC(driver)));
			parentlogger.log(LogStatus.INFO, "Provided Text :" +" " +color.RMA_ChangeColor_Utility(RMAApp_SendMail_Txt_CC[i], 3) +" " +"Is Set Successfully In WebElement :" +" " +color.RMA_ChangeColor_Utility("To TextBox On Send Mail Page",4));	
		}
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_Body(driver), "Body TextBox On Send Mail Page",MailBody,logval);	
		//Send Mail Frame Is Switched, To And CC, Mail Body TextBoxes Are Provided Values
		
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Txt_Subject(driver), "Body TextBox On Send Mail Page","Demo Mail for Smoke Suite Result",logval);
		// Subject In Subject Field
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_SendMail.RMAApp_SendMail_Btn_Send(driver), "Send Button On Send Mail Page",logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval); // Wait For UX Page Load Bar To Disappear
		Thread.sleep(10000);
		//Regarding And Subject Field Values Are Checked And Mail Is Sent
		driver.switchTo().parentFrame();		
		driver.switchTo().parentFrame();
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
