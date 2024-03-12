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
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Arbitration;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_008
//Description    : Creation, Edition and Deletion of Arbitration Under Claim Tree Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-01-2016 
//=================================================================================================
public class RMA_Smoke_TC_008 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_008_Test () throws Exception, Error 
//Creation, Edition and Deletion of Arbitration Under Claim Tree.
{
	try {
		
		String StrArbitration_RMA_Smoke_TC_008;
		String[] StrArbitrationName;
		String RMAApp_ArbitrationCreation_Txt_Type;
		String StrExpMsg;
		String RMAApp_ArbitrationCreation_Txt_FinType;
		String StrActualArbitrationType;
		String RMAApp_ArbitrationCreation_Txt_EditedFinType;
		String StrPrimaryWindowHandle ;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_008_Arbitration Creation, Addition and Deletion", "Creation, Edition and Deletion of Arbitration Under Claim Tree Is Validated.");
		parentlogger.assignAuthor("Kumud Naithani");
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_ArbitrationCreation_Txt_Type = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 0);
		RMAApp_ArbitrationCreation_Txt_FinType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 1);
		RMAApp_ArbitrationCreation_Txt_EditedFinType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 3); 
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		StrScreenShotTCName = "Smoke_TC_008";
		/*===========================================================New Arbitration Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Arbitration ");
		testcall1 = true;
		StrArbitration_RMA_Smoke_TC_008 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Arbitration", "Arbitration (0)", StrClaimNumber_002, "Not Required", RMAApp_ArbitrationCreation_Txt_Type, "Not Required", "Not Required", "Not Required", "Not Required", RMAApp_ArbitrationCreation_Txt_FinType, logval1);
		parentlogger.log(LogStatus.INFO, "New Arbitration Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrArbitration_RMA_Smoke_TC_008, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		String CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		System.out.println("CurrentFrameID"+CurrentFrameID);
		driver.switchTo().parentFrame();
		
		/*===========================================================New Arbitration Creation Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Search Of Created Arbitration Is Started Here======================================================================================================================================================================================*/
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Arbitration Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Arbitration (1)"), "Arbitration (1) Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Arbitration's Lookup Results Page Is Loaded ");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Arbitration");
		StrArbitrationName = StrArbitration_RMA_Smoke_TC_008.split(" ");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrArbitrationName[1], "Arbitration Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Arbitration's Page Is Loaded ");
		driver.switchTo().parentFrame();
		

		/*===========================================================Search Of Created Arbitration Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Edit Of Created Arbitration Is Started Here==========================================================================================================================================================================================*/
		
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(CurrentFrameID);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Btn_TypeSearch(driver), "Type Search Button On RMA Application Adjuster Creation Page",1);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility(); 
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Special", "Adjuster Type Selection Page", logval);
		
		driver.switchTo().window(StrPrimaryWindowHandle);
		driver.switchTo().frame(ParentFrame); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		driver.switchTo().frame(RMA_GenericUsages_Utility.RMA_FrameNavigation(CurrentFrameID));
		Thread.sleep(4000); 
		RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA",  "Arbitration Page", logval);
		StrActualArbitrationType = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Txt_Type(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrActualArbitrationType, RMAApp_ArbitrationCreation_Txt_EditedFinType,"Arbitration Last Name Value", logval);
		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Lnk_Supplementals(driver), "Supplementals Link On Created Claim's Arbitration Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Lnk_ArbitrationInfo(driver), "ArbitrationInfo On Created Claim's Arbitration Page",logval);
		
		StrExpMsg = "Are you sure you want to delete?";
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Arbitration Page", 4)+ "", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Arbitration Page", 4)+ " " + "Is Clicked");
		RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", StrExpMsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Arbitration Page", 4), logval);
		parentlogger.log(LogStatus.INFO, "Cancel Button On Message Deletion Pop Up Message Is Clicked");
		/*===========================================================Edit Of Created Arbitration Is Completed Here===============================================================================================================================================================================================*/
		/*===========================================================Deletion Of Existing Arbitration Is Started Here========================================================================================================================================================================================*/

		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete An Arbitration : " +" "+ color.RMA_ChangeColor_Utility(RMAApp_ArbitrationCreation_Txt_FinType, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Arbitration Page", logval1);
		parentlogger.log(LogStatus.INFO, "Arbitration Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrActualArbitrationType, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Deletion Of Existing Arbitration Is Completed Here==========================================================================================================================================================================================*/
		
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
