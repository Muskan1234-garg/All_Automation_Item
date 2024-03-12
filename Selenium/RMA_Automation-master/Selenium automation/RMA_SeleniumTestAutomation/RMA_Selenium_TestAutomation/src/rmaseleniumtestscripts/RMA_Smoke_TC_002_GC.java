package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_002_GC
//Description    : RMA_Smoke_TC_002_GC_Verify General Claim Creation
//Depends On TC  : None
//Revision       : 0.0 - ImteyazAhmad-06-27-2016 
//Modify By	: 0.0-RenuVerma-01-02-2017 Changes done for Link Navigation
//=================================================================================================

public class RMA_Smoke_TC_002_GC extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;


	@Test
	public void RMA_Smoke_TC_002_GC_Test() throws Exception,Error {

		testcall1 = false;			
		loggerval1 = "NotInitialized";
		StrScreenShotTCName = "RMA_Smoke_TC_002_GC";

		try{
			parentlogger = reports.startTest("<span id='RMA_Smoke_TC_002_GC'>RMA_Smoke_TC_002_GC_General Claim Creation</span>", "Verify That General Claim Is Created Successfully");
			parentlogger.assignAuthor("Imteyaz Ahmad");
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame();

			//General Claim Function Is Instantiated
			parentlogger.log(LogStatus.INFO, "Following Test Is Called To Create A General Claim :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("TC004GeneralClaim", "RMA_TC_004",0));
			testcall1 = true;
			RMA_TC_004 generalClaim = new RMA_TC_004(); 
			StrClaimNumber_002 = generalClaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_002
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "New Claim, After TC_004 IS Called ,Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_002, 2));
			parentlogger.appendChild(logger);
			// New Claim Is Created	
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Event Detail"), "Event Detail Link Tab On General Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Loss Information"), "Loss Information Link Tab On General Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Supplementals"), "Supplementals Link Tab On General Claim Page", logval);
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "ACORD"), "ACORD Link Tab On General Claim Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To General Claim Link On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Expand Image Corresponding To General Claim Link On Left Navigation Tree Is Clicked ");
			
		}catch(Exception|Error e)
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

			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))

			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: General Claim Creation" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

