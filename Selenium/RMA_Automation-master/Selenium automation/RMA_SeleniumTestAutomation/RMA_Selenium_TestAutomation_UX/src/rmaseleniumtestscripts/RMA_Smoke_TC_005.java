package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Defendant;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Smoke_TC_005
//Description    : Successful Defendant Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Created Defendant Display On Claim Screen And Select Of The Same, Edit And Delete Of Created Defendant Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - RenuVerma-06-02-2017 
//======================================================================================================================================================================================================================================================================================

public class RMA_Smoke_TC_005 extends RMA_TC_BaseTest {
	
@Test
public void RMA_Smoke_TC_005_Test() throws Exception,Error {
	String DefCreation_Txt_LastName;
	String DefCreation_Txt_LastName_Edited;
	//Local Variable Declaration
		
	try{
	parentlogger = reports.startTest("RMA_Smoke_TC_005_Defendant Creation", "Successful Defendant Creation On Providing Mandatory Data, Existence of Necessary Tabs With Data Entry Of One Text Field In Each, Created Defendant Display On Claim Screen And Select Of The Same, Edit And Delete Of Created Defendant Is Validated");
	parentlogger.assignAuthor("Renu Verma");
	
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	testcall2 = false;	
	loggerval2 = "NotInitialized";
	ExceptionRecorded = null;
	CurrentFrameID=null;
	FinalErrorMessage = null;
	ErrorMessageType = null;
	ErrorMessage = null;
	StrScreenShotTCName = "Smoke_TC_005";
	//Global Variable Initialization Completed 
	
	//===========================================================Defendant Creation Is Started Here================================================================================================================================================================================================================================================================
	RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Defendant");
	testcall1 = true;
	DefCreation_Txt_LastName = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Defendant", StrClaimNumber, "NA", "NA",logval1);
	loggerval1 = logger.toString();
	parentlogger.log(LogStatus.INFO, "New Defandent Is Created With Defentdant LastName::"+ " " + color.RMA_ChangeColor_Utility(DefCreation_Txt_LastName, 2));
	parentlogger.appendChild(logger);
	//===========================================================Defendant Creation Is Completed Here================================================================================================================================================================================================================================================================
	
	//===========================================================Verification That All Tabs Are Present For Defendant Screen Started Here===============================================================================================================================================================================================================================
	CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Tab_ClaimDefendantInfo(driver),"Claim Defendant Info Tab On Claim Defendant Creation Page",logval);
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Tab_ClaimDefendantAttorney(driver),"Claim Defendant Attorney Tab On Claim Defendant Creation Page",logval);
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Txt_AttorneyMiddleName(driver), "Attorney Middle Name Text Box On Defendant Attorney Tab Of Claim Defendant Creation Page", RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, "AttorneyMid_"),logval);		
	RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Tab_Supplementals(driver), "Supplementals Tab On Claim Defendant Creation Page",logval);
	RMA_Functionality_Utility.RMA_GenericSave_Utility(CurrentFrameID, false, "NA", "Defendant Creation Page", logval);
	//===========================================================Verification That All Tabs Are Present For Defendant Screen Completed Here=================================================================================================================================================================================================================================
	//===========================================================Verification That Created Defendant Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On Defendant Creation Page",logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Lnk_ClaimRightHandTree(driver, DefCreation_Txt_LastName),DefCreation_Txt_LastName+ " Created Defendant Link On Right Hand Claim Tree",logval);
	//===========================================================Verification That Created Defendant Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	
	//==========================================================Edit Of Created Defendant Is Started Here===========================================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityEdit", "RMA_ClaimEventEntityEdit_Utility",0)+" To Edit Created Defendant");
	testcall2 = true;
	DefCreation_Txt_LastName_Edited = RMA_Functionality_Utility.RMA_ClaimEventEntityEdit_Utility("Defendant", StrClaimNumber, "NA","NA",logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO, "Created Defandent Is Edited With Defentdant LastName::"+ " " + color.RMA_ChangeColor_Utility(DefCreation_Txt_LastName_Edited, 2));
	parentlogger.appendChild(logger);
	//==========================================================Edit Of Created Defendant Is Completed Here==========================================================================================================================================================================================================================================================================================

	//==========================================================Delete Of Created Defendant Is Started Here=========================================================================================================================================================================================================================================================================================
	RMA_Functionality_Utility.RMA_GenericDelete_Utility("Defentdant Creation Page", false, logval);
	RMA_Functionality_Utility.RMA_GenericDelete_Utility("Defentdant Creation Page", true, logval);
	//==========================================================Delete Of Created Defendant Is Completed Here==========================================================================================================================================================================================================================================================================================
	
	//===========================================================Verification That Deleted Defendant Is Not Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Lnk_ClaimRightHandTree(driver, DefCreation_Txt_LastName_Edited ), DefCreation_Txt_LastName_Edited+" Edited Defendant Link On Right Hand Claim Tree", logval);
	//===========================================================Verification That Deleted Defendant Is Not Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
	
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
			logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_ClaimEventEntityEdit_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

