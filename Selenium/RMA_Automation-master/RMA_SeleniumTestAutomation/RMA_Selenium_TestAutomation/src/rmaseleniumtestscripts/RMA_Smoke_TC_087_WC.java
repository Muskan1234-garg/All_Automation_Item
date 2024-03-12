package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyTracking;
import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_087_WC
//Description    : RMA_Smoke_TC_087_WC_Successfully Verify That User Can Set A Policy LOB In Table Maintenance And Financial Key For Created LOB Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-01-04-2017
//=================================================================================================

public class RMA_Smoke_TC_087_WC extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrPolicyName_Smoke_TC_087_WC;
	public static String StrPolicyNum_Smoke_TC_087_WC;
	public static String StrPolicyCode_Smoke_TC_087_WC;
	public static String StrUnitName_Smoke_TC_087_WC;
	public static String CoverageType_Smoke_TC_087_WC;
	public static String LstRMALossCode_Smoke_TC_087_WC;
	public static String PolicyDetailOnMaintTable_Smoke_TC_087_WC;
	public static String PolicyDescription_Smoke_TC_087_WC;

	@Test
	public void RMA_Smoke_TC_087_WC_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_087_WC_Set All The Requirements For Internal Policy Tracking Under Carrier Claim ", "Successfully Set All The Requirements For Internal Policy Tracking Under Carrier Claim Is Validated");
			parentlogger.assignAuthor("Renu Verma");

			String PolicyParentCode;
			String EffStartDate;
			String EffEndDate;
			String PolicyLOB;
			String CoverageType;			
			String SelectLOB;
			String SelectPolicyLOB;
			String LstRelationshipType;
			String LstRelationshipSubType;
			String LstAvailable_WC;
			String LstPolicySystemNames;
			String PolicyTracking_Status;
			Date PolicyTracking_ExpDate;
			String PolicyTracking_PriPolicyState;
			String PolicyTracking_CMCState;
			String PolicyTracking_InsurerLName;
			String PolicyTracking_Insured;
			int PolicyTracking_Premium;
			Date PolicyTracking_EffDate;
			String UnitType;
			String LstCoverageType;

			int PolicyTracking_PolicyLimit;
			//Local Variable Declaration

			StrScreenShotTCName = "RMA_Smoke_TC_087";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
			testcall3 = false;
			loggerval3 = "NotInitialized";
			testcall4 = false;
			loggerval4 = "NotInitialized";
			testcall5 = false;
			loggerval5 = "NotInitialized";
			testcall6= false;
			loggerval6 = "NotInitialized";

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13_SmokeSuite_03.xlsx Is Fetched To Retrieve Data

			// Test Data for Maintenance Table screen
			PolicyLOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 1, 0); // Policy LOB Lookup Code Is Fetched From DataSheet RMA_Smoke_TC_087
			PolicyParentCode=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 1, 1); // Policy Parent Code Is Fetched From DataSheet RMA_Smoke_TC_087
			EffStartDate=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();
			EffEndDate=RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0, 0, 1);
			StrPolicyCode_Smoke_TC_087_WC=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "PolicyLOB_");
			PolicyDescription_Smoke_TC_087_WC="Verify - "+StrPolicyCode_Smoke_TC_087_WC;

			// Test Data for Financial screen
			SelectLOB=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 17, 0); // Select Policy LOB List Value Is Fetched From DataSheet RMA_Smoke_TC_087
			SelectPolicyLOB=StrPolicyCode_Smoke_TC_087_WC+"- "+PolicyDescription_Smoke_TC_087_WC;
			PolicyDetailOnMaintTable_Smoke_TC_087_WC=StrPolicyCode_Smoke_TC_087_WC+" - "+PolicyDescription_Smoke_TC_087_WC;
	
			// Test Data for Code Relationship screen
			LstRelationshipType=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 5, 0); // Relationship Type Is Fetched From DataSheet RMA_Smoke_TC_087
			LstRelationshipSubType	=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 5, 1); // Relationship Sub Type Is Fetched From DataSheet RMA_Smoke_TC_087
			LstAvailable_WC=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 5, 2); //Available List Value Is Fetched From DataSheet RMA_Smoke_TC_087

			// Test Data for Loss Code Mapping screen
			LstPolicySystemNames	=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 9, 0); // Policy System Names Is Fetched From DataSheet RMA_Smoke_TC_087
			LstRMALossCode_Smoke_TC_087_WC=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 9, 1); //RMA Loss Code Is Fetched From DataSheet RMA_Smoke_TC_087
			LstCoverageType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 9, 2); //Coverage Code Is Fetched From DataSheet RMA_Smoke_TC_087

			// Test Data for Policy Tracking screen
			PolicyTracking_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 0); //Policy Status Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_PriPolicyState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 1); //Primary Policy State Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_CMCState = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 2); //CMC State Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_InsurerLName =ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 3); //Insurer Last Name Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_Insured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 4); // Insured Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_Premium = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_087_WC", 13, 5); // Premium Is Fetched From DataSheet RMA_TC_087_WC	
			UnitType=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 7); // Vehicle Type Is Fetched From DataSheet RMA_TC_087_WC
			StrUnitName_Smoke_TC_087_WC=ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 6); // Vehicle ID Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_EffDate=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility());
			PolicyTracking_ExpDate=new SimpleDateFormat("MMddyyyy").parse(RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(4,10,2));

			// Test Data for Policy Coverage screen
			CoverageType= ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_087_WC", 13, 8); // Coverage Type Is Fetched From DataSheet RMA_TC_087_WC
			PolicyTracking_PolicyLimit=ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_087_WC", 13, 9); // Policy Limit Is Fetched From DataSheet RMA_TC_087_WC

			//===========================================================Enabling Of Settings For Internal Policy On General System Parameter Page Is Started Here================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Policy Interface Settings"),"Policy Interface Settings Link Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "uncheck", "Use Policy System Interface Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "check", "Use Policy System Interface Checkbox", "General System Parameter Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partial", "Policy Interface is used for point policy system.", "Message To Confirm Enabling" + color.RMA_ChangeColor_Utility("Policy System Interface Settings", 4), logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowInternalPolicySearch(driver), "uncheck", "Allow Internal Policy Search Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AllowInternalPolicySearch(driver), "check", "Allow Internal Policy Search Checkbox", "General System Parameter Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partial", "Computer Sciences Corporation does not recommend to use two policy systems at same time,", "Message To Confirm Enabling " + color.RMA_ChangeColor_Utility("Allow Internal Policy Search Settings", 4), logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Funds Settings"),"Funds Settings Link Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseResTypeFilterTransactionType(driver), "uncheck", "Use Reserve Type to Filter Transaction Type Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Globalization Settings"),"Globalization Settings Link Tab On General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseMultiCurrency(driver), "check", "Use Multiple Currency Checkbox", "General System Parameter Setup Page", logval);
			RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Txt_SelectBaseCurrency(driver), "Select Base Currency Textbox on General System Parameter Setup Page", "USD", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "General System Parameter Setup Page", logval);			
			// ===========================================================Enabling Of Settings For Internal Policy On General System Parameter Page Is Ended Here================================================

			//===========================================================Setup Of PolicyLOB In Table Maintenance Is Started Here================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On General System Parameter Setup Page", logval);

			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("TableMaintenanceCode", "TableMaintenanceCodeAddition_Utility",0)+ " To Create New PolicyTracking");
			testcall1 = true;		
			RMA_Functionality_Utility.RMA_TableMaintenanceCodeAddition_Utility("Policy LOB","P", "Policy LOB", StrPolicyCode_Smoke_TC_087_WC, PolicyDescription_Smoke_TC_087_WC, PolicyParentCode, EffStartDate, EffEndDate, PolicyLOB,1,StrPolicyCode_Smoke_TC_087_WC+"-"+PolicyLOB, false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Code For Policy"+ " " + color.RMA_ChangeColor_Utility(StrPolicyCode_Smoke_TC_087_WC, 3)+ " "+ "Is Created On Maintenance Table");		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On Table Maintenance Page", logval);
			//===========================================================Setup Of PolicyLOB In Table Maintenance Is Ended Here================================================

			//===========================================================Set Financial Key For PolicyLOB Is Started Here================================================*/
			//RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(ParentFrame);

			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("FinancialKey", "RMA_FinancialKeySetup_Utility",0)+ " To Do Financial Key Setup");
			testcall2 = true;		
			RMA_Functionality_Utility.RMA_FinancialKeySetup_Utility(SelectLOB, SelectPolicyLOB, PolicyDetailOnMaintTable_Smoke_TC_087_WC, PolicyLOB, false,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On Financial Key Setup Page", logval);
			//===========================================================Set Financial Key For PolicyLOB Is Ended Here================================================*/

			//===========================================================Set Code Relationship For PolicyLOB Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("CodeRelationship", "RMA_CodeRelationshipAddition_Utility",0)+ " To Do Code Relationship");
			testcall3 = true;		
			RMA_Functionality_Utility.RMA_CodeRelationshipAddition_Utility(LstRelationshipType, LstRelationshipSubType, PolicyDetailOnMaintTable_Smoke_TC_087_WC, LstAvailable_WC, false,logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On Code Relationship Page", logval);
			//===========================================================Set Code Relationship For PolicyLOB Is Ended Here================================================*/

			//===========================================================Set Loss Code Mapping For PolicyLOB Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("LossCodeMapping", "RMA_LossCodeMapping_Utility",0)+ " To Map Loss Code");
			testcall4 = true;		
			RMA_Functionality_Utility.RMA_LossCodeMapping_Utility(LstPolicySystemNames, PolicyDetailOnMaintTable_Smoke_TC_087_WC, LstCoverageType,LstRMALossCode_Smoke_TC_087_WC , false, logval1);
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Done Loss Code Mapping For Loss Code:"+ " " + color.RMA_ChangeColor_Utility(LstRMALossCode_Smoke_TC_087_WC, 3));		
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver),"Close Button On Loss Code Mapping Page", logval);
			//===========================================================Set Loss Code Mapping For PolicyLOB Is Ended Here================================================*/

			//===========================================================New Policy Creation With Created PolicyLOB On Policy Tracking Is Started Here=======================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO, " Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolTrack", "RMA_PolicyTracking_Utility",0)+ " To Create New PolicyTracking");
			testcall5 = true;		
			StrPolicyName_Smoke_TC_087_WC= RMA_Functionality_Utility.RMA_PolicyTracking_Utility(PolicyTracking_Status,PolicyTracking_EffDate ,PolicyTracking_ExpDate,PolicyTracking_Premium, PolicyTracking_PriPolicyState, PolicyTracking_CMCState, PolicyTracking_InsurerLName, PolicyTracking_Insured, StrPolicyCode_Smoke_TC_087_WC,UnitType,StrUnitName_Smoke_TC_087_WC,true, logval1);	
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			StrPolicyNum_Smoke_TC_087_WC=RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Txt_PolicyNumber(driver).getAttribute("value");
			parentlogger.log(LogStatus.INFO, "New PolicyTracking With Policy Name::"+ " " + color.RMA_ChangeColor_Utility(StrPolicyName_Smoke_TC_087_WC, 3)+ " And Policy Number: "+color.RMA_ChangeColor_Utility(StrPolicyNum_Smoke_TC_087_WC, 3)+ " Is Created");		
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Successful Policy Creation On Policy Tracking Page", StrScreenShotTCName)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Unit Information"), " Unit Information Link Tab On Policy Tracking Page", logval);
			RMA_Input_Utility.RMA_ElementWebListSelect_Utility(RMA_Selenium_POM_PolicyTracking.RMAApp_PolicyTracking_Lst_UnitName(driver), "Site Unit: "+StrUnitName_Smoke_TC_087_WC, "Unit Name List", "Policy Tracking Page", PolicyTracking_Premium);
			//===========================================================New Policy Creation With Created PolicyLOB On Policy Tracking Is Ended Here=======================================================================================================================================================================================*/

			//===========================================================Add Policy Coverage On Created Policy Is Started Here=======================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolicyCoverage", "RMA_PolicyCoverage_Utility",0) +" Is Called Add Policy Coverage");
			testcall6 = true;
			CoverageType_Smoke_TC_087_WC=RMA_Functionality_Utility.RMA_PolicyCoverage_Utility(CoverageType, PolicyTracking_PolicyLimit,false, logval1);
			parentlogger.log(LogStatus.INFO, "First Policy Coverage Is Added Successfully With Coverage Type::"+ " " + color.RMA_ChangeColor_Utility(CoverageType_Smoke_TC_087_WC, 3));
			loggerval6= logger.toString();
			parentlogger.appendChild(logger);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back To Parent Image Of Policy Coverage On Policy Coverage Page", logval);
			//===========================================================Add Policy Coverage On Created Policy Is Ended Here=======================================================================================================================================================================================*/

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "TableMaintenanceCodeAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_FinancialKeySetup_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall3 == true && loggerval1.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_CodeRelationshipAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_LossCodeMapping_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PolicyTracking_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall6 == true && loggerval6.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PolicyCoverage_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
			reports.endTest(parentlogger);	
			reports.flush();

		}
	}		
}

