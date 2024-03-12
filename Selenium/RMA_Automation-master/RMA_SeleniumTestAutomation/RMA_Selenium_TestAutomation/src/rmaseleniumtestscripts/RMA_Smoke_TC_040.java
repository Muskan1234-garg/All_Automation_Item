package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_040
//Description    : RMA_Smoke_TC_040_Verify Claim Is Deleted Successfully.
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-09-09-2016
//=================================================================================================

public class RMA_Smoke_TC_040 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_040_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_040_Claim Deletion", "Verify Claim Is Deleted Successfully.");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			loggerval1 = "NotInitialized";
			testcall1 = false;
			StrScreenShotTCName = "Smoke_TC_040";
			
			//************************************ Claim Search Is Started********************************************
			RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);
			
			//****************************************Claim Search Is Completed*****************************************************
			
			/*===========================================================Deletion Of Claim Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete A Claim : " +" "+ color.RMA_ChangeColor_Utility(StrClaimNumber_002, 2));
			testcall1 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Claim Page", logval1);
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "Claim Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_002, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of New Driver Is Completed Here================================================*/
			
			
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			try {
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

