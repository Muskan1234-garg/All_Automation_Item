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
import rmaseleniumPOM.RMA_Selenium_POM_Claimant;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_004
//Description    : Creation, Edition and Deletion of Claimant Under Claim Tree Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-07-01-2016 
//=================================================================================================
public class RMA_Smoke_TC_004 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_004_Test () throws Exception, Error 
//Creation, Edition and Deletion of Claimant Under Claim Tree.
{
	try {
		
		String StrClaimant_RMA_Smoke_TC_004;
		String StrClaimant_Edited_RMA_Smoke_TC_004;
		String StrClaimant_Final_RMA_Smoke_TC_004;
		String StrPrimaryWindowHandle;
		String[] ClaimName;
		String Expmsg;
		String StrClmActual_RMA_Smoke_TC_004;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_004_Claimant Creation, Addition and Deletion", "Creation, Edition and Deletion of Claimant Under Claim Tree Is Validated.");
		//Local Variable Declaration
		
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		StrScreenShotTCName = "Smoke_TC_004";
		/*===========================================================New Claimant Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Claimant ");
		testcall1 = true;
		StrClaimant_RMA_Smoke_TC_004 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Claimant", "Claimant (0)", StrClaimNumber_002, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
		parentlogger.log(LogStatus.INFO, "New Claimant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant_RMA_Smoke_TC_004, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		driver.switchTo().parentFrame();
		/*===========================================================New Claimant Creation Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Search Of Created Claimant Is Started Here======================================================================================================================================================================================*/
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Claimant Page",logval);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Claimant (1)"), "Claimant (1) Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Claimant's Lookup Results Page Is Loaded ");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Claimant");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrClaimant_RMA_Smoke_TC_004, "Claimant Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Claimant's Page Is Loaded ");
		ClaimName = StrClaimant_RMA_Smoke_TC_004.split("Claimant_");
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ClaimName[1]);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Btn_LastNameSearch(driver), "Search Button On Claimant Creation Page",logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to The Search Window
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver),"Standard Entity Search Window", "Last Name TextBox", StrClaimant_RMA_Smoke_TC_004, "Claimant", ClaimName[1], StrPrimaryWindowHandle ,logval);
		StrClmActual_RMA_Smoke_TC_004 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrClaimant_RMA_Smoke_TC_004, StrClmActual_RMA_Smoke_TC_004,"Claimant Last Name Value", logval);
		/*===========================================================Search Of Created Claimant Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Edit Of Created Claimant Is Started Here======================================================================================================================================================================================*/
		
		
		StrClaimant_Edited_RMA_Smoke_TC_004 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Claimant_");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_LastName(driver), "Claimant LastName TextBox On Claimant Page", StrClaimant_Edited_RMA_Smoke_TC_004,logval); 
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Btn_Edit(driver), "Edit Button On Created Claim Claimant Page's Edit Window",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Claimant Screen From Add New Claimant Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ClaimName[1]);
		// Claimant Last Name Is Set
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image On Claimant Page",logval);//Save Image On Claimant Creation Page Is Clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Newly Created Claimant Is Getting Saved");
		//Claimant Addition Is Completed Here
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Claimant Creation Page", logval);
		ClaimName = StrClaimant_Edited_RMA_Smoke_TC_004.split("Claimant_");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ClaimName[1]);
		StrClaimant_Final_RMA_Smoke_TC_004 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrClaimant_Edited_RMA_Smoke_TC_004, StrClaimant_Final_RMA_Smoke_TC_004,"Claimant Last Name Value", logval);
		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Lnk_ClaimantInfo(driver), "Claimant Info Tab Link On Claimant Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Lnk_Supplementals(driver), "Supplementals Tab Link On Claimant Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Claimant.RMAApp_Claimant_Lnk_ClaimantAttorney(driver), "Claimant Attorney Tab Link On Claimant Page",logval);
		
		Expmsg = "Are you sure you want to delete?";
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Claimant Page", 4)+ "", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Claimant Page", 4)+ " " + "Is Clicked");
		RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Claimant Page", 4), logval);
		parentlogger.log(LogStatus.INFO, "Cancel Button On Message Deletion Pop Up Message Is Clicked");
		/*===========================================================Edit Of Created Claimant Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Deletion Of Existing Claimant Is Started Here================================================*/

		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete An Claimant : " +" "+ color.RMA_ChangeColor_Utility(StrClaimant_Final_RMA_Smoke_TC_004, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Claimant Page", logval1);
		parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant_Final_RMA_Smoke_TC_004, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Deletion Of Existing Claimant Is Completed Here================================================*/
		
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
