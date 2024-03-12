package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_019
//Description    : TC_019_Verify That Executive Summary Displays Correct Claim Details
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-06-23-2017 
//ModifyBy       : 0.0 - RenuVerma-09-15-2017: As PDf Content Verification Code changes 
//=================================================================================================

public class RMA_Smoke_TC_019 extends RMA_TC_BaseTest {
	
	@Test
	public void RMA_TC_019_Test() throws Exception,Error {
		
		final WebDriver driver1 = new ChromeDriver();
		StrScreenShotTCName = "Smoke_TC_019";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		CurrentFrameID=null;
		//Global Variable Initialization Completed Here

		try{

			parentlogger = reports.startTest("RMA_Smoke_TC_019_Executive Summary Details Verification", "Verify That Executive Summary Displays Correct Claim Details");
			parentlogger.assignAuthor("Renu Verma");

			Object[] ContentToBeVerified;			
			//Local Variable Declaration Completed Here
			
			ContentToBeVerified=new Object[]{"Executive Summary",StrClaimNumber,"Note:","Confidential Data"};
			//===========================================================Steps To Verify Executive Summary Details Started Here============================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ExecSummary(driver), "Execution Summary Image On Claim Page", logval);
			//RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, "Executive Summary"), "Executive Summary Text", logval);
			Thread.sleep(4000);
			String PdfURL=driver.findElement(By.id(RMA_Selenium_POM_VerificationMessage.ExecutiveSummary)).getAttribute("src");
			// Open New browser to navigate and download the pdf content of executive summary is Started here
		
			driver1.navigate().to(PdfURL);
			driver1.manage().window().maximize(); //Maximizing The RMA Application Login Page
			RMA_Verification_Utility.PDFReaderContentVerification_Utility("NA",ContentToBeVerified,logval);
			// Open New browser to navigate and download the pdf content of executive summary is Ended here
			
			//RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Executive Summary Screen", logval);
			//Thread.sleep(2000);// wait to Disappear Close button From DOM
			//===========================================================Steps To Verify Executive Summary Details Ended Here============================================================

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
			try {
				parentlogger.log(LogStatus.INFO,"Finally Block Is Executed");
				driver.switchTo().window(StrRMAUXWindowHandle);				
				//if(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)!=null)
				//{
					//RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button On Executive Summary Screen", logval);// close Executive Summary screen
				//}
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
