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
import rmaseleniumutilties.RMA_Verification_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumPOM.RMA_Selenium_POM_Defendant;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_005
//Description    : Creation, Edition and Deletion of Defendant Under Claim Tree Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - Imteyaz-07-04-2016 
//=================================================================================================
public class RMA_Smoke_TC_005 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_005_Test () throws Exception, Error 
//Creation, Edition and Deletion of Defendant Under Claim Tree.
{
	try {
		
		String StrDefendant_RMA_Smoke_TC_005;
		String StrDefendantActual_RMA_Smoke_TC_005;
		String StrDefendant_Edited_RMA_Smoke_TC_005;
		String StrDefendantChanged_RMA_Smoke_TC_005;
		String StrPrimaryWindowHandle;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_005_Defendant Creation, Addition and Deletion", "Creation, Edition and Deletion of Defendant Under Claim Tree Is Validated.");
		
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		
		StrScreenShotTCName = "RMA_Smoke_TC_005";
		
		/*===========================================================New Defendant Creation Is Started Here=======================================================================================================================================================================================*/
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Defendant ");
		testcall1 = true;
		StrDefendant_RMA_Smoke_TC_005 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Defendant", "Defendant (0)", StrClaimNumber_002, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
		parentlogger.log(LogStatus.INFO, "New Defendant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrDefendant_RMA_Smoke_TC_005, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		driver.switchTo().parentFrame();
		/*===========================================================New Defendant Creation Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Search Of Created Defendant Is Started Here======================================================================================================================================================================================*/
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Defendant Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Defendant (1)"), "Defendant (1) Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Defendant's Lookup Results Page Is Loaded ");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("defendant");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrDefendant_RMA_Smoke_TC_005, "Defendant Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Defendant's Page Is Loaded ");
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrDefendant_RMA_Smoke_TC_005);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Btn_LastNameLookupButton(driver), "Search Button On Defendant Creation Page",logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to The Search Window
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver),"Standard Entity Search Window", "Last Name TextBox", StrDefendant_RMA_Smoke_TC_005, "Other People", StrDefendant_RMA_Smoke_TC_005, StrPrimaryWindowHandle ,logval);
		StrDefendantActual_RMA_Smoke_TC_005 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrDefendant_RMA_Smoke_TC_005, StrDefendantActual_RMA_Smoke_TC_005,"Defendant Last Name Value", logval);
		/*===========================================================Search Of Created Defendant Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Edit Of Created Defendant Is Started Here======================================================================================================================================================================================*/
			
		StrDefendant_Edited_RMA_Smoke_TC_005 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Defendant_");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Txt_LastName(driver), "Defendant LastName TextBox On Defendant Page", StrDefendant_Edited_RMA_Smoke_TC_005,logval); 
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Btn_Edit(driver), "Edit Button On Created Claim Defendant Page's Edit Window",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Defendant Screen From Add New Defendant Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrDefendant_RMA_Smoke_TC_005);
		// Defendant Last Name Is Set
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Defendant Page",logval);//Save Image On Defendant Creation Page Is Clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Newly Created Defendant Is Getting Saved");
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Defendant Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrDefendant_Edited_RMA_Smoke_TC_005);
		StrDefendantChanged_RMA_Smoke_TC_005 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrDefendant_Edited_RMA_Smoke_TC_005, StrDefendantChanged_RMA_Smoke_TC_005,"Defendant Last Name Value", logval);
		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Lnk_DefendantInfo(driver), "Defendant Info Tab Link On Defendant Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Lnk_Supplementals(driver), "Supplementals Tab Link On Defendant Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Defendant.RMAApp_Defendant_Lnk_DefendantAttorney(driver), "Defendant Attorney Tab Link On Defendant Page",logval);
		/*===========================================================Edit Of Created Defendant Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Deletion Of Existing Defendant Is Started Here================================================*/

		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete An Defendant : " +" "+ color.RMA_ChangeColor_Utility(StrDefendantChanged_RMA_Smoke_TC_005, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Defendant Page", logval1);
		parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrDefendantChanged_RMA_Smoke_TC_005, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Deletion Of Existing Defendant Is Completed Here================================================*/
		
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
