package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_TC_182
//Description    : TC_182_Verify That Litigation Can Be Added To A General Claim
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-07-11-2016 
//=================================================================================================

public class RMA_TC_182 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_RMA_TC_182;
	public static String StrWitLastNameActual_182;

	@Test 
	public void RMA_TC_182_Test () throws Exception, Error
	{
		parentlogger = reports.startTest("TC_182_General Claim Creation", "Verify That General Claim Can Be Created Successfully");
		parentlogger.assignAuthor("Kumud Naithani");
		
		try {
			testcall1 = false;			
			loggerval1 = "NotInitialized";
			testcall2 = false;			
			loggerval2 = "NotInitialized";
			StrScreenShotTCName = "TC_182";		

			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			driver.switchTo().parentFrame(); 
			//===============================================Creation Of General Claim Is Started=======================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Test Is Called :: RMA_TC_004 To Create New General Claim");
			testcall1 = true;
			RMA_TC_004 generalclaim = new RMA_TC_004();
			StrClaimNumber_RMA_TC_182 = generalclaim.GeneralClaimCreation(); //Claim Number Is Fetched And Stored In Variable StrClaimNumber_RMA_TC_182
			parentlogger.log(LogStatus.INFO, "New Claim Is Created With Claim Number::"+ " " + color.RMA_ChangeColor_Utility(StrClaimNumber_RMA_TC_182, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			// New Claim Is Created

			//===============================================Creation Of General Claim Is Completed======================================================================================================================================================
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_GCExpander(driver), "Created General Claim's Expander On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Left Hand Navigation Tree Is Expanded For The Created General Claim");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_RMA_TC_182), "Person Involved Link Under General Claim On Left Hand Navigation Tree", logval);
			
			//===============================================Steps To Create A New Witness Started========================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Claim_PI(driver, StrClaimNumber_RMA_TC_182), "Person Involved Link Under Claim On Left Hand Navigation Tree", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +"RMA_PIAddNewEntity_Utility Is Called To Create A Witness ");
			testcall2 = true;
			StrWitLastNameActual_182 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Witness", logval1);
			parentlogger.log(LogStatus.INFO, "New Witness Is Created Successfully With Witness Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrWitLastNameActual_182, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Witness Creation Is Successfull", StrScreenShotTCName)));
			//===============================================Steps To Create A New Witness Completed===============================================================================================================================================================

			
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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Test Case" +" "+ "RMA_TC_004: GeneralClaim Creation" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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
			
		} catch (Exception |Error e) {
			System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		}
		
		finally
		{
			reports.endTest(parentlogger); 
		}
	}
}

