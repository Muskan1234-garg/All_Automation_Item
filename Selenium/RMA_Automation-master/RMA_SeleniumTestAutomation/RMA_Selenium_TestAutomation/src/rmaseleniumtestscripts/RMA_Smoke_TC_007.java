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
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Subrogation;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_007
//Description    : Creation, Edition and Deletion of Subrogation Under Claim Tree Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-01-2016 
//=================================================================================================
public class RMA_Smoke_TC_007 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_007_Test () throws Exception, Error 
//Creation, Edition and Deletion of Subrogation Under Claim Tree.
{
	try {
		
		String StrSubrogation_RMA_Smoke_TC_007;
		String[] StrSubrogationName;
		String RMAApp_SubrogationCreation_Txt_Type;
		String StrExpMsg;
		String RMAApp_SubrogationCreation_Txt_Status;
		int RMAApp_SubrogationCreation_Txt_Date;
		String RMAApp_SubrogationCreation_Txt_FinType;
		int RMAApp_SubrogationCreation_Txt_EditedDate;
		String DtmFinEditedDate;
		
		//Local Variable Declaration
		
		String DtmFinEditDate = "11/12/2015";
		String DtmDate = "11/11/2015";
		parentlogger = reports.startTest("RMA_Smoke_TC_007_Subrogation Creation, Addition and Deletion", "Creation, Edition and Deletion of Subrogation Under Claim Tree Is Validated.");
		parentlogger.assignAuthor("Kumud Naithani");
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_SubrogationCreation_Txt_Type = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_007", 1, 0);
		RMAApp_SubrogationCreation_Txt_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_007", 1, 1);
		RMAApp_SubrogationCreation_Txt_FinType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_007", 1, 2);
		RMAApp_SubrogationCreation_Txt_Date = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_007", 1, 3);
		RMAApp_SubrogationCreation_Txt_EditedDate = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_007", 1, 4);
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		StrScreenShotTCName = "Smoke_TC_007";
		/*===========================================================New Subrogation Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create Subrogation ");
		testcall1 = true;
		StrSubrogation_RMA_Smoke_TC_007 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Subrogation", "Subrogation (0)", StrClaimNumber_002, "Not Required", RMAApp_SubrogationCreation_Txt_Type, RMAApp_SubrogationCreation_Txt_Status, String.valueOf(RMAApp_SubrogationCreation_Txt_Date), "Not Required", "Not Required", RMAApp_SubrogationCreation_Txt_FinType, logval1);
		parentlogger.log(LogStatus.INFO, "New Subrogation Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrSubrogation_RMA_Smoke_TC_007, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		driver.switchTo().parentFrame();
		/*===========================================================New Subrogation Creation Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Search Of Created Subrogation Is Started Here======================================================================================================================================================================================*/
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Subrogation Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Subrogation (1)"), "Subrogation (1) Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Subrogation's Lookup Results Page Is Loaded ");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Subrogation");
		StrSubrogationName = StrSubrogation_RMA_Smoke_TC_007.split(RMAApp_SubrogationCreation_Txt_Type+" ");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrSubrogationName[1], "Subrogation Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Subrogation's Page Is Loaded ");
		driver.switchTo().parentFrame();
		

		/*===========================================================Search Of Created Subrogation Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Edit Of Created Subrogation Is Started Here==========================================================================================================================================================================================*/
		
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DtmDate);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Date(driver), "RMAApp_SubrogationCreation_Txt_Date Text Box On Subrogation Addition Page" , String.valueOf(RMAApp_SubrogationCreation_Txt_EditedDate), logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Subrogation Page",logval);//Save Image On Subrogation Creation Page Is Clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Newly Created Subrogation Is Getting Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Subrogation Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DtmFinEditDate);
		
		DtmFinEditedDate = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Txt_Date(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(DtmFinEditedDate, DtmFinEditDate,"Subrogation Last Name Value", logval);
		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Lnk_SubrogationFinancial(driver), "Subrogation Financial On Created Claim's Subrogation Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Lnk_Supplementals(driver), "Supplementals Link On Created Claim's Subrogation Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Subrogation.RMAApp_Subrogation_Lnk_SubrogationInfo(driver), "Subrogation Info On Created Claim's Subrogation Page",logval);
		
		StrExpMsg = "Are you sure you want to delete?";
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Subrogation Page", 4)+ "", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Subrogation Page", 4)+ " " + "Is Clicked");
		RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", StrExpMsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Subrogation Page", 4), logval);
		parentlogger.log(LogStatus.INFO, "Cancel Button On Message Deletion Pop Up Message Is Clicked");
		
		/*===========================================================Edit Of Created Subrogation Is Completed Here===============================================================================================================================================================================================*/
		/*===========================================================Deletion Of Existing Subrogation Is Started Here========================================================================================================================================================================================*/

		parentlogger.log(LogStatus.INFO, "HTML","The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete Subrogation : " +" "+ color.RMA_ChangeColor_Utility(RMAApp_SubrogationCreation_Txt_FinType, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Subrogation Page", logval1);
		parentlogger.log(LogStatus.INFO, "Subrogation Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(RMAApp_SubrogationCreation_Txt_FinType, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Deletion Of Existing Subrogation Is Completed Here==========================================================================================================================================================================================*/
		
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
