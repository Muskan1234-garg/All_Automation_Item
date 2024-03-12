package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
//import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
//import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_ScreenCapture_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_041
//Description    : Existence Of Person Involved Entity Option For Saved Property Claim Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-08-21-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_041 extends RMA_TC_BaseTest {

	@Test
	public void RMA_SeleniumRegression_TC_041_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_041_Existence Of Person Involved Entity Option For Saved Property Claim", "Person Involved Entity Option Existence On Created Property Claim's Right Hand Navigation Tree Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			//String PropertyClaim_Txt_ClaimType;
			//String PropertyClaim_Txt_Department;
			/*String PropertyClaim_Txt_Jurisdiction;
			String PropertyClaim_Txt_DateOfEvent;
			String PropertyClaim_Txt_TimeOfEvent;
			String PropertyClaim_Txt_DateOfClaim;
			String PropertyClaim_Txt_TimeOfClaim;
			int PropertyClaim_Txt_EmployeeNo;
			String PropertyClaim_Txt_ClaimInfoDept;
			//Local Variable Declaration Completed Here

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_041";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 

			PropertyClaim_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, -1, 0,"MM/dd/yyyy");
			PropertyClaim_Txt_DateOfClaim = PropertyClaim_Txt_DateOfEvent;
			PropertyClaim_Txt_TimeOfEvent=RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			PropertyClaim_Txt_TimeOfClaim=PropertyClaim_Txt_TimeOfEvent;
			PropertyClaim_Txt_EmployeeNo=RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(1111111, 9999999);
			//Local Variable Initialization Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data
			PropertyClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1, 0); // Claim Type Is Fetched From DataSheet RMA_Smoke_TC_002_PC
			PropertyClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1, 2); // Department Is Fetched From DataSheet RMA_Smoke_TC_002_PC
			PropertyClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1, 3); // Jurisdiction Is Fetched From DataSheet RMA_Smoke_TC_002_PC
			PropertyClaim_Txt_ClaimInfoDept = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_002_PC", 1, 4); // Claim Info Department Is Fetched From DataSheet RMA_Smoke_TC_002_PC
			//Fetch Of Data From Excel WorkBook Completed*/
			
			driver.switchTo().parentFrame();
			//===========================================================Property Claim Creation Is Started Here===============================================================================================================================================================================================================================================================================
			/*parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PropClaim", "RMA_PropertyClaimCreation",0)+" To Create Property Claim");
			testcall1 = true;
			StrClaimNumber = RMA_Functionality_Utility.RMA_PropertyClaimCreation( PropertyClaim_Txt_ClaimType,"Open", PropertyClaim_Txt_EmployeeNo,  PropertyClaim_Txt_Department,  PropertyClaim_Txt_DateOfEvent,  PropertyClaim_Txt_TimeOfEvent,  PropertyClaim_Txt_DateOfClaim,  PropertyClaim_Txt_TimeOfClaim,  PropertyClaim_Txt_Jurisdiction, PropertyClaim_Txt_ClaimInfoDept, logval1);
			loggerval1 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Property Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Property Claim Creation Is Successfully Created
			//===========================================================Property Claim Creation Is Completed Here==================================================================================================================================================================================================================================================================================*/

			//===========================================================Verification Of Person Involved Entity Option Existence On Created Property Claim's Right Hand Navigation Tree Is Started Here==============================================================================================================================================================================================
			driver.switchTo().parentFrame();	
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Reload(driver), "Reload Image Button On Claim Page"+ " ", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Verification_Utility.RMA_ObjectDisplayVerify_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver,"Persons Involved" ),"displayed","Person Involved Entity Option On Right Hand Property Claim Tree", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Entity Option Existence", "Person Involved Entity Option Existence For Property Claim")));
			//===========================================================Verification Of Person Involved Entity Option Existence On Created Property Claim's Right Hand Navigation Tree Is Completed Here==============================================================================================================================================================================================

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
			StackTraceElement[] TraceElement = e.getStackTrace();
			for (StackTraceElement ObjectName : TraceElement)
			{
				if(ObjectName.toString().contains("rmaseleniumPOM") || ObjectName.toString().contains("rmaseleniumutilities") )
				{
					FinalErrorMessage = FinalErrorMessage +" "+"And Error Occured In :"+" "+ObjectName.toString(); 
					break;
				}
			}
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PropertyClaimCreation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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

