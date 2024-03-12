package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Litigation;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_006
//Description    : Creation, Edition and Deletion of Litigation Under Claim Tree Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-07-04-2016 
//=================================================================================================
public class RMA_Smoke_TC_006 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_006_Test () throws Exception, Error 
//Creation, Edition and Deletion of Litigation Under Claim Tree.
{
	try {
		
		String StrLitigation_RMA_Smoke_TC_006;
		String StrLitigation_Edited_RMA_Smoke_TC_006;
		String StrLitigationChanged_RMA_Smoke_TC_006;
		
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_006_Litigation Creation, Addition and Deletion", "Creation, Edition and Deletion of Litigation Under Claim Tree Is Validated.");
		
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		loggerval3 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		testcall3 = false;
		StrScreenShotTCName = "RMA_Smoke_TC_006";
		
		/*===========================================================New Litigation Creation Is Started Here=======================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Litigation ");
		testcall1 = true;
		StrLitigation_RMA_Smoke_TC_006 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Litigation", "Litigation (0)", StrClaimNumber_002, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
		parentlogger.log(LogStatus.INFO, "New Litigation Is Created Successfully With Docket Number::"+ " " + color.RMA_ChangeColor_Utility(StrLitigation_RMA_Smoke_TC_006, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Tab_AttorneyInformation(driver), "Attorney Information Tab On Litigation Page", logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Tab_Supplementals(driver), "Supplementals Tab On Litigation Page", logval);
		/*===========================================================New Litigation Creation Is Completed Here======================================================================================================================================================================================*/
		
		/*===========================================================Edit Of Created Litigation Is Started Here======================================================================================================================================================================================*/
			
		StrLitigation_Edited_RMA_Smoke_TC_006 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Litigation_");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "Docket Number Text Box On Litigation Addition Page" , StrLitigation_Edited_RMA_Smoke_TC_006, logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Litigation Addition Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Created Litigation Is Saved ");

		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Litigation Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("litigation");
		StrLitigationChanged_RMA_Smoke_TC_006 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Txt_DocketNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrLitigation_Edited_RMA_Smoke_TC_006, StrLitigationChanged_RMA_Smoke_TC_006 , "Litigation Docket Number Value",logval);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Edit Of Litigation Is Successfull", StrScreenShotTCName)));
		/*===========================================================Edit Of Created Litigation Is Completed Here======================================================================================================================================================================================*/
		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Tab_AttorneyInformation(driver), "Attorney Information Tab Link On Litigation Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Litigation.RMAApp_Litigation_Tab_Supplementals(driver), "Supplementals Tab Link On Litigation Page",logval);
		
		/*===========================================================Deletion Of Created Litigation Is Started Here================================================*/

		parentlogger.log(LogStatus.INFO, "HTML","The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete An Litigation : " +" "+ color.RMA_ChangeColor_Utility(StrLitigationChanged_RMA_Smoke_TC_006, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Litigation Page", logval1);
		parentlogger.log(LogStatus.INFO, "Litigation Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrLitigationChanged_RMA_Smoke_TC_006, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Deletion Of Created Litigation Is Completed Here================================================*/
		
				
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
		parentlogger.appendChild(logger);
		}
		else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
