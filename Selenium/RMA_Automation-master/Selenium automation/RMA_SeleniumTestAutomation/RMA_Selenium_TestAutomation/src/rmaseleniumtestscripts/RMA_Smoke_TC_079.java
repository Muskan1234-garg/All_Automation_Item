package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_POM_PropertyClaim;
import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_Document_GeneralClaims;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_079
//Description    : Successfully Verify The Functionality Of Add Claimant On Enable Person Involved Check Box Under Utilities MDI Menu
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-11-17-2016
//=================================================================================================

public class RMA_Smoke_TC_079 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
	@Test
	public void RMA_Smoke_TC_079_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("Smoke_TC_079_Add Claimant Functionality On Enabling Person Involved Check Box", "Successfully Verify The Functionality Of Add Claimant On Enable Person Involved Check Box Under Utilities MDI Menu");
			parentlogger.assignAuthor("Renu Verma");
			
			String StrGeneralClaimNumberActual;
			String StrClaimant1_Smoke;
			String StrClaimant2_Smoke;
			String StrEventNumber_Smoke;
			String StrClaimNaumberActual ;
	
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "Smoke_TC_079";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
			//===========================================================Enabling  Setting For Claimant as Person Involved Is Started Here===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AddClaimantPI(driver), "check", "Add Claimant as Person Involved Checkbox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===========================================================Enabling  Setting For Claimant as Person Involved Is Ended Here===========================================================
			
			//===============================================Search Of The Claim Created In Smoke_TC_002 Is Started=====================================================================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver),"Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);
			StrClaimNaumberActual = RMA_POM_PropertyClaim.RMAApp_PropertyClaim_Txt_ClaimNumber(driver).getAttribute("value"); 
			RMA_Verification_Utility.RMA_TextCompare(StrClaimNumber_002, StrClaimNaumberActual , "Claim Number", logval);
			StrEventNumber_Smoke=RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_EventNumber(driver).getAttribute("value");
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Claimant (0)")));
			//===============================================Search Of The Claim Created In Smoke_TC_002 Is Completed=====================================================================================================
			
			//===========================================================New Claimant Creation On Claim Is Started Here=======================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO,"The Functional Utility : "+ RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity","RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Claimant ");
			testcall1 = true;
			StrClaimant1_Smoke = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Claimant", "Claimant (0)", StrClaimNumber_002, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Claimant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant1_Smoke, 3));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Lnk_LeftNavLink(driver, "Persons Involved (1)"), "Persons Involved (1) Link On Left Hand Navigation Tree Of Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Persons Involved");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, StrClaimant1_Smoke), StrClaimant1_Smoke+" Link On Person Involved Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,StrEventNumber_Smoke),  " Event Link On Left Naviogation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Close All"), "Close All All option On Event Link Left Navigation", logval);
			//===========================================================New Claimant Creation On Claim Is Ended Here=======================================================================================================================================================================================*/
		
			//===========================================================Disabling Setting For Claimant as Person Involved Is Started Here===========================================================
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_AddClaimantPI(driver), "uncheck", "Add Claimant as Person Involved Checkbox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Button On General System Parameter Setup Page", logval);
			//===========================================================Disabling Setting For Claimant as Person Involved Is Ended Here===========================================================
	
			//===============================================Search Of The Claim Created In Smoke_TC_002 Is Started=====================================================================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed same Same Search Screen frame is Already Loaded in Line No 71
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);
			StrGeneralClaimNumberActual = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value");
			RMA_Verification_Utility.RMA_TextCompare(StrClaimNumber_002, StrGeneralClaimNumberActual, "General Claim Number", logval);	
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link On Left Navigation Tree", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Claimant (1)")));
			//===============================================Search Of The Claim Created In Smoke_TC_002 Is Completed=====================================================================================================
	
			/*===========================================================New Claimant Creation Is Started Here=======================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO, "The Functional Utility : "+ RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity","RMA_ClaimEntityAddition_Utility",1)+" Is Called To Create An Claimant ");
			testcall2 = true;
			StrClaimant2_Smoke = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Claimant", "Claimant (1)", StrClaimNumber_002, "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", "Not Required", logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Claimant Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrClaimant2_Smoke, 3));
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Lnk_LeftNavLink(driver, "Persons Involved (1)"), "Person Involved Link On Left Hand Navigation Tree Of Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Persons Involved");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, StrClaimant2_Smoke), StrClaimant2_Smoke+" Link On Person Involved Page", logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntNamePartially(driver,StrEventNumber_Smoke),  " Event Link On Left Naviogation Tree", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_LeftHandTreeRightClick_LnkName(driver, "Close All"), "Close All Link On Event Link Left Navigation ", logval);
			/*===========================================================New Claimant Creation Is Completed Here======================================================================================================================================================================================*/
		
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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

