package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Arbitration;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_008
//Description    : Successful Arbitration Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Created Subrogation Display On Claim Screen And Select Of The Same, Edit And Delete Of Created Arbitration Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-06-08-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_008 extends RMA_TC_BaseTest {
@Test
public void RMA_Smoke_TC_008_Test() throws Exception,Error {
	
	String ArbCreation_Txt_Type;
	String ArbCreation_Txt_TypeEdited;
	String ArbCreationType;
	String ArbCreationTypeEdited;
	String ArbCreation_Txt_TypeFinal;
	String ArbCreation_Txt_TypeEditedFinal;
	//Local Variable Declaration

	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_008_Arbitration Creation", "Successful Arbitration Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Created Subrogation Display On Claim Screen And Select Of The Same, Edit And Delete Of Created Arbitration Is Validated");
	parentlogger.assignAuthor("Kumud Naithani");
	
	StrScreenShotTCName = null;
	StrScreenShotTCName = "Smoke_TC_008";
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	ExceptionRecorded = null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	CurrentFrameID=null;
	//Global Variable Initialization Completed 
	
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMA_Suite_01_SmokeSuite_01 Is Fetched To Retrieve Data 
	ArbCreationType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 0); //Arbitration Creation Type Is Fetched From DataSheet RMA_Smoke_TC_008
	ArbCreationTypeEdited = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 1); //Arbitration Creation Type Edited Is Fetched From DataSheet RMA_Smoke_TC_008
	ArbCreation_Txt_TypeFinal = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 2); //Arbitration Creation Type Final Value Is Fetched From DataSheet RMA_Smoke_TC_008
	ArbCreation_Txt_TypeEditedFinal = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_008", 1, 3); //Arbitration Creation Type Edited Final Value Is Fetched From DataSheet RMA_Smoke_TC_008
	//Fetch Of Data From Excel WorkBook Completed
	//===========================================================Arbitration Creation Is Started Here================================================================================================================================================================================================================================================================
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Arbitration");
	testcall1 = true;
	ArbCreation_Txt_Type = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Arbitration", StrClaimNumber, ArbCreationType, ArbCreation_Txt_TypeFinal, logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Arbitration Is Created With Type::"+ " " + color.RMA_ChangeColor_Utility(ArbCreation_Txt_Type, 2));
	parentlogger.appendChild(logger);
	//===========================================================Arbitration Creation Is Completed Here================================================================================================================================================================================================================================================================
	
	//===========================================================Verification That All Tabs Are Present For Arbitration Screen Started Here===============================================================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Tab_ArbitrationInfo(driver),"Arbitration Info Tab On Claim Arbitration Creation Page",logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Arbitration.RMAApp_Arbitration_Tab_Supplementals(driver),"Supplementals Tab On Claim Arbitration Creation Page",logval);
	CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	//===========================================================Verification That All Tabs Are Present For Arbitration Screen Completed Here=================================================================================================================================================================================================================================
	
	//===========================================================Verification That Created Arbitration Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Arbitration Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, ArbCreationType),"Created Arbitration Link:" + " "+ color.RMA_ChangeColor_Utility(ArbCreationType, 2)+ " "+ "On Right Hand Claim Tree",logval);
	//===========================================================Verification That Created Arbitration Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	
	//==========================================================Edit Of Created Arbitration Is Started Here===========================================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityEdit", "RMA_ClaimEventEntityEdit_Utility",0)+" To Edit Created Arbitration");
	testcall2 = true;
	ArbCreation_Txt_TypeEdited = RMA_Functionality_Utility.RMA_ClaimEventEntityEdit_Utility("Arbitration", StrClaimNumber, ArbCreationTypeEdited, ArbCreation_Txt_TypeEditedFinal, logval1);
	loggerval2 = logger.toString();
parentlogger.log(LogStatus.PASS, "Arbitration Edit Is Successful, Edited Arbitration Is" + " " + "::"+ " "+ color.RMA_ChangeColor_Utility(ArbCreation_Txt_TypeEdited, 2));
	parentlogger.appendChild(logger);
	//==========================================================Edit Of Created Arbitration Is Completed Here==========================================================================================================================================================================================================================================================================================

	//==========================================================Delete Of Created Arbitration Is Started Here=========================================================================================================================================================================================================================================================================================
	RMA_Functionality_Utility.RMA_GenericDelete_Utility("Arbitration Creation Page", false, logval);
	RMA_Functionality_Utility.RMA_GenericDelete_Utility("Arbitration Creation Page", true, logval);
	//==========================================================Delete Of Created Arbitration Is Completed Here==========================================================================================================================================================================================================================================================================================
	
	//===========================================================Verification That Deleted Arbitration Is Not Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, ArbCreationTypeEdited), "Created Arbitration Link:" + " "+ color.RMA_ChangeColor_Utility(ArbCreationTypeEdited, 2)+ " "+ "On Right Hand Claim Tree", logval);
	//===========================================================Verification That Deleted Arbitration Is Not Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================*/
	
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);
		}
	 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
		{
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
			parentlogger.appendChild(logger);
			reports.endTest(logger);
		}
	 	driver.switchTo().parentFrame();
		RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
		RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
		RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
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
		 driver.switchTo().parentFrame();
		 
	 } catch (Exception|Error e) {
		System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		parentlogger.log(LogStatus.FAIL, "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
	}
	 reports.endTest(parentlogger);	
	 reports.flush();
	}
}		
}

