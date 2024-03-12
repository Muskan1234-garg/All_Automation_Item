package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed


//=======================================================================================================================================================
//TestCaseID     : RMA_TC_374
//Description    : Creation, Edit And Deletion Of Enhanced Notes For An Injury (Person Involved) Associated With A Claim
//Depends On TC  : RMA_TC_335
//Revision       : 0.0 - KumudNaithani-03-20-2017
//==============================================================================================================================================================
public class RMA_TC_374 extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrInjuryType_374;
@Test	
public void RMA_TC_374_Test() throws Exception, Error
{   
	try {	 	 
	 String StrPrimaryWindowHandle;
 	 String ProgressNotes;
 	 String AttributeValue;
 	 boolean Edit;
	 //Local Variable Declaration Completed
	 
	 parentlogger = reports.startTest("RMA_TC_374_Creation, Edit And Deletion Of Enhanced Notes For An Injury (Person Involved) For Created Claim", "Creation, Edit And Deletion Of Enhanced Notes For An Injury (Person Involved) Associated With A Claim");
	 parentlogger.assignAuthor("Kumud Naithani");
			
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";	
	 testcall3 = false;
	 loggerval3 = "NotInitialized";	
	 StrScreenShotTCName = "RMA_TC_374";
	 Edit = true;
	 //Variable Initialization Completed
     
	//===========================================================Steps To Enable Settings Related To Case Management on General System Parameter Page Is Started Here=====================================================================================================================================================================================================================================================================================================================================
	RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
	StrPrimaryWindowHandle = driver.getWindowHandle();
	AttributeValue = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseCaseManagement(driver), "checked");
	
	if (AttributeValue == null)
	{
	RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseCaseManagement(driver), "check", "Use Case Management Checkbox", "General System Parameter Setup Page", logval);
	
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	RMA_Input_Utility.RMA_SetValue_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Txt_ActivationCode(driver), "Activation Code TextBox On Activation Code Window On General System Parameter Setup Page", "USEMASTER", logval);
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetupActivationCodeWind_Btn_ActivationCodeOk(driver), "OK Button On Activation Code Window On General System Parameter Setup Page", logval);
	driver.switchTo().window(StrPrimaryWindowHandle);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
	RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
	}
	
	driver.switchTo().parentFrame();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
	//=========================================================== Steps To Enable Settings Related To Case Management on General System Parameter Page Is Completed Here=======================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================New Injury/Illness Creation Associated With Claim Is Started Here=====================================================================================================================================================================================================================================================================================================================================
	 parentlogger.log(LogStatus.INFO, "The Functional Utility :" +" " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "Claim Entity Addition",0)+ " "+ "Is Called To Add Injury/Illness To Claim" + " "+color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	 testcall1 = true;
	 StrInjuryType_374 = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Injury", "Injury/Illness", StrClaimNumber_335, "Not Required", "Lumbago", "Fire", "Not Required", "Not Required", "Not Required", "FR Fire", logval1);
	 parentlogger.log(LogStatus.INFO, "New Injury/Illness Is Added Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrInjuryType_374, 2) + " " +"To Claim Number::" + color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	 loggerval1 = logger.toString();
	 parentlogger.appendChild(logger);
	 parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Injury/Illness Creation", StrScreenShotTCName)));
	//=========================================================== New Injury/Illness Creation Associated With Claim Is Completed Here=======================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Create And Edit Progress Notes Started Here==================================================================================================================================================================================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image For Injury"+ " "+ color.RMA_ChangeColor_Utility(StrInjuryType_374, 2)+ " "+ "Added As Person Involved To Claim"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumber_335,2), logval); // Claim ID Is Same For All Line Of Business
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create And Edit Progress Note");
	testcall2 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber_335, "NotRequired", Edit, logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Progress Notes Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2));
	parentlogger.appendChild(logger);
	// New Progress Notes Is Created And Edited	
	//===========================================================Steps To Create And Edit Progress Notes Completed Here===================================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Delete Progress Notes Started Here=====================================================================================================================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",2)+" Is Called To Delete An Already Created Progress Note");
	testcall3 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "Not Required", "Not Required", ProgressNotes, Edit, logval1);
	loggerval3 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Existing Progress Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2)+ "Is Deleted");
	parentlogger.appendChild(logger);
	// Created Progress Notes Is Deleted
	driver.close();
	driver.switchTo().window(StrPrimaryWindowHandle);
	//===========================================================Steps To Delete Progress Notes Completed Here===============================================================================================================================================================================================================================================================================================================================================================
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " For New Injury (Person Involved) Creation Associated With A Claim And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit An Enhanced Notes And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Enhanced Notes And Hence The Test Case Is A Fail");
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
		 } catch (Exception|Error e) {
		 System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
		 }
		 finally
		    {
			 try {
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Injury"), "Expand Image Corresponding To Injury/Illness Link On Left Navigation Tree", logval);
			 
			 } catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}		
}