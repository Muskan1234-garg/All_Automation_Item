package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Utilities_Managers;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_TableMaintenance;
import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
//RMA Package Import Completed
import rmaseleniumutilties.RMA_Verification_Utility;

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_092_GC_C
//Description    : Successfully Reverted All The Setting Of Internal Policy Tracking For General Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_087_GC, RMA_Smoke_TC_088_GC
//Revision       : 0.0 - RenuVerma-01-12-2017
//=================================================================================================

public class RMA_Smoke_TC_092_GC_C extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_092_GC_C_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_092_GC_C_ Revert All The Setting Of Internal Policy Tracking For General Claim", "Successfully Reverted All The Setting Of Internal Policy Tracking For General Claim Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			String PrimaryWindowHandle;
			String CurrentFrameId;
			String StrClaimNumberActual;
			//Local Variable Declaration

			StrScreenShotTCName = "RMA_Smoke_TC_092_GC_C";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
		
			//===========================================================Delete Claim Corresponding To Internal Policy Is Started Here================================================	
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",RMA_Smoke_TC_088_GC.StrClaimNumber_Smoke_088_GC, RMA_Smoke_TC_088_GC.StrClaimNumber_Smoke_088_GC, RMA_Smoke_TC_088_GC.StrClaimNumber_Smoke_088_GC,"num",2, logval);
			StrClaimNumberActual = RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(RMA_Smoke_TC_088_GC.StrClaimNumber_Smoke_088_GC, StrClaimNumberActual, "Workers' comp Claim Number", logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete A Claim :" +" "+ color.RMA_ChangeColor_Utility(RMA_Smoke_TC_088_GC.StrClaimNumber_Smoke_088_GC, 2));
			testcall1= true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Claim Page", logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Deleted Successfully With Claim No. ::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_088_GC.StrClaimNumber_Smoke_088_GC, 2));
			loggerval1= logger.toString();
			parentlogger.appendChild(logger);
			//===========================================================Delete Claim Corresponding To Internal Policy Is Ended Here================================================	===========================================================Delete Policy In Policy Tracking Is Started Here================================================ 

			/*===========================================================Delete Policy In Policy Tracking Is Started Here================================================*/
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			PrimaryWindowHandle=driver.getWindowHandle();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_Table_Lookup(driver), RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC, "LINK", logval);
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy Tracking");
			CurrentFrameId=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",1)+" Is Called To Delete A Policy :" +" "+ color.RMA_ChangeColor_Utility(RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC, 3));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance--> Policy Tracking Page" , logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Policy Is Deleted Successfully::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_051.StrPolicyName_RMA_Smoke_TC_051, 3));
			driver.switchTo().parentFrame();
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-PolicyTracking", logval);
			RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameId);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Policy Tracking Page", logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver,String.valueOf(RMA_Smoke_TC_087_GC.StrPolicyNum_Smoke_TC_087_GC)), String.valueOf(RMA_Smoke_TC_087_GC.StrPolicyName_Smoke_TC_087_GC) + " Policy Link", logval);
			RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
			driver.switchTo().window(PrimaryWindowHandle);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);
			/*===========================================================Delete Policy In Policy Tracking Is Ended Here================================================*/

			/*===========================================================Deletion Of Financial Key Setting Is Started Here================================================*/
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-Managers-FinancialkeySetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financial key Setup");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Img_Delete(driver)));
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Tbl_FinancialKeyGrid(driver),RMA_Smoke_TC_087_GC.PolicyDetailOnMaintTable_Smoke_TC_087_GC , "RADIOBUTTON", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_ManagersFinanKey_Img_Delete(driver),"Delete Image on Financial Key Setup Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_ErrorMessage_Heading(driver), "Error Message On Financial Key Setup Page",logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Smoke_TC_087_GC.PolicyDetailOnMaintTable_Smoke_TC_087_GC), RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Smoke_TC_087_GC.PolicyDetailOnMaintTable_Smoke_TC_087_GC)+"Policy Description", logval);
			parentlogger.log(LogStatus.INFO, "Financial Key Setting Is Deleted Successfully For Policy  ::"+ " " + color.RMA_ChangeColor_Utility(RMA_Smoke_TC_087_GC.PolicyDetailOnMaintTable_Smoke_TC_087_GC, 3));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On General System Parameter Setup Page", logval);
			/*===========================================================Deletion Of Financial Key Setting Is Ended Here================================================*/

			/*===========================================================Deletion Of PolicyLOB Code From Table Maintenance Is Started Here================================================*/
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-TableMaintenance", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Table Maintenance");
			globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Top_Menu"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "P"),"P Link On Table Maintenance Page", logval);
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Tables"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given 
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Policy LOB"),"Policy LOB Link Under 'Code Tables' Section On Table Maintenance Page", logval);
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm_Code_Detail"));// RMA_DynamicFrameSwitching method is not Used as id of the frame is not given 
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Edit Code")));
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Tbl_CodeMaint(driver),RMA_Smoke_TC_087_GC.PolicyDescription_Smoke_TC_087_GC , "RADIOBUTTON", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Utilities_Managers.RMAApp_Managers_Btn_Generic(driver, "Edit Code"),"Edit Code Button Under 'Code Texts' Section On Table Maintenance Page", logval);
			globalWait.until(ExpectedConditions.attributeContains(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Txt_Code(driver), "value",RMA_Smoke_TC_087_GC.StrPolicyCode_Smoke_TC_087_GC));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Maintenance_TableMaintenance.RMAApp_MaintTableMaintenance_Btn_Generic(driver, "Delete"),"Delete Button Under 'Enter Code Detail' Section On Table Maintenance Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Complete", "Are you sure you want to permanently delete current record?", "'Enter Code Detail' Section On Table Maintenance Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppText(driver, RMA_Smoke_TC_087_GC.PolicyDescription_Smoke_TC_087_GC), "Policy Description", logval);
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On Table Maintenance Page", logval);
			/*===========================================================Deletion Of PolicyLOB Code From Table Maintenance Is Ended Here================================================*/

			/*===========================================================Disabling Of Settings For Internal Policy On General System Parameter Page Is Started Here================================================*/
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Policy Interface Settings"),"Policy Interface Settings Link Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "uncheck", "Use Policy System Interface Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Funds Settings"),"Funds Settings Link Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(driver), "uncheck", "Use Reserve Type to Filter Transaction Type Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Globalization Settings"),"Globalization Settings Link Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseMultiCurrency(driver), "uncheck", "Use Multiple Currency Checkbox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "General System Parameter Setup Page", logval);			
			/*===========================================================Disabling Of Settings For Internal Policy On General System Parameter Page Is Ended Here================================================*/

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
			if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result)  //All The Information Associated With The Test Case Is Stored In Result Variable
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
			driver.switchTo().parentFrame();
			reports.endTest(parentlogger);	
			reports.flush();

		}
	}		
}

