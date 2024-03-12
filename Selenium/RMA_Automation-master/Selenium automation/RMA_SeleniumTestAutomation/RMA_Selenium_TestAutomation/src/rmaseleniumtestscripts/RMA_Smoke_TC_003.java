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
import rmaseleniumPOM.RMA_POM_Adjuster;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_003
//Description    : Creation, Edition and Deletion of Adjuster Under Claim Tree Is Validated
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - KumudNaithani-06-28-2016 
//=================================================================================================
public class RMA_Smoke_TC_003 extends rmaseleniumtestscripts.RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	
@Test 
public void RMA_Smoke_TC_003_Test () throws Exception, Error 
//Creation, Edition and Deletion of Adjuster Under Claim Tree.
{
	try {
		
		String StrAdjuster_RMA_Smoke_TC_003;
		String StrAdjuster_Edited_RMA_Smoke_TC_003;
		String StrAdjuster_Final_RMA_Smoke_TC_003;
		String StrPrimaryWindowHandle;
		String[] AdjName;
		String Expmsg;
		//Local Variable Declaration
		
		parentlogger = reports.startTest("RMA_Smoke_TC_003_Adjustor Creation, Addition and Deletion", "Creation, Edition and Deletion of Adjuster Under Claim Tree Is Validated.");
		parentlogger.assignAuthor("Kumud Naithani");
		
		
		loggerval1 = "NotInitialized";
		loggerval2 = "NotInitialized";
		loggerval3 = "NotInitialized";
		testcall1 = false; 
		testcall2 = false; 
		StrScreenShotTCName = "Smoke_TC_003";
		
		/*===========================================================New Adjustor Creation Is Started Here=======================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_CloseAllWindowOtherThanRMA();
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Adjuster ");
		testcall1 = true;
		StrAdjuster_RMA_Smoke_TC_003 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Adjustor", "Adjuster (0)", StrClaimNumber_002, "curradj", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
		parentlogger.log(LogStatus.INFO, "New Adjuster Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrAdjuster_RMA_Smoke_TC_003, 2));
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		driver.switchTo().parentFrame();
		/*===========================================================New Adjustor Creation Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Search Of Created Adjustor Is Started Here======================================================================================================================================================================================*/
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On Adjuster Page",logval);
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Adjuster (1)"), "Adjuster (1) Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Adjuster's Lookup Results Page Is Loaded ");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("adjuster");
		RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrAdjuster_RMA_Smoke_TC_003, "Adjuster Creation Page", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Selected Adjuster's Page Is Loaded ");
		AdjName = StrAdjuster_RMA_Smoke_TC_003.split("Adjustor_");
		driver.switchTo().parentFrame();
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(AdjName[1]);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_AdjSearch(driver), "Search Button On Adjustor Creation Page",logval);
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to The Search Window
		RMA_Functionality_Utility.RMA_StandardSearch_Window(RMA_POM_Search.RMAApp_SearchEntity_Txt_LastName(driver),"Standard Entity Search Window", "Last Name TextBox", StrAdjuster_RMA_Smoke_TC_003, "Adjusters", AdjName[1], StrPrimaryWindowHandle ,logval);
		
		/*===========================================================Search Of Created Adjustor Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Edit Of Created Adjustor Is Started Here======================================================================================================================================================================================*/
		
		
		StrAdjuster_Edited_RMA_Smoke_TC_003 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Adjustor_");
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver), "Adjuster LastName TextBox On Adjuster Page", StrAdjuster_Edited_RMA_Smoke_TC_003,logval); 
		StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();//Switched to Add New window
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Btn_Edit(driver), "Edit Button On Created Claim Adjuster Page's Edit Window",logval);
		driver.switchTo().window(StrPrimaryWindowHandle); // A Switch Back To The Parent Window Is Done
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As A Switch To Main Adjustor Screen From Add New Adjustor Screen Is Done");
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(AdjName[1]);
		// Adjustor Last Name Is Set
		
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_Adjuster.RMAApp_Adjuster_Img_Save(driver), "Save Image On Adjuster Page",logval);//Save Image On Adjuster Creation Page Is Clicked
		RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Newly Created Adjustor Is Getting Saved");
		//Adjuster Addition Is Completed Here
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
		driver.switchTo().parentFrame();
		RMA_Verification_Utility.RMA_UnsavedChangeVerification_Utility("Adjustor Creation Page", logval);
		AdjName = StrAdjuster_Edited_RMA_Smoke_TC_003.split("Adjustor_");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(AdjName[1]);
		StrAdjuster_Final_RMA_Smoke_TC_003 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrAdjuster_Edited_RMA_Smoke_TC_003, StrAdjuster_Final_RMA_Smoke_TC_003,"Adjustor Last Name Value", logval);
		
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Lnk_ClaimAdjusterInfo(driver), "Claim Adjuster Information Tab Link On Adjuster Page",logval);
		RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_POM_Adjuster.RMAApp_Adjuster_Lnk_Supplementals(driver), "Supplementals Tab Link On Adjuster Page",logval);

		Expmsg = "Are you sure you want to delete?";
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Delete(driver), "Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Adjuster Page", 4)+ "", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Delete Image On" + " "+ color.RMA_ChangeColor_Utility("Adjuster Page", 4)+ " " + "Is Clicked");
		RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("No", "Complete", Expmsg, "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Adjuster Page", 4), logval);
		parentlogger.log(LogStatus.INFO, "Cancel Button On Message Deletion Pop Up Message Is Clicked");
		/*===========================================================Edit Of Created Adjustor Is Completed Here======================================================================================================================================================================================*/
		/*===========================================================Deletion Of Existing Adjuster Is Started Here================================================*/

		parentlogger.log(LogStatus.INFO, "HTML","The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete An Adjuster : " +" "+ color.RMA_ChangeColor_Utility(StrAdjuster_Final_RMA_Smoke_TC_003, 2));
		testcall2 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Adjustor Page", logval1);
		parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrAdjuster_Final_RMA_Smoke_TC_003, 2));
		loggerval2 = logger.toString();
		parentlogger.appendChild(logger);
		/*===========================================================Deletion Of Existing Adjuster Is Completed Here================================================*/
		
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
