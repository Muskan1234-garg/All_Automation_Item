package rmaseleniumtestscripts;

import java.util.Date;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_GeneralSystemParameterSetUP;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_PolicyDownload;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_284
//Description    : TC_284_Verify To Create A Workers' Comp Claim And DownLoad A Policy
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-09-12-2016 
//=================================================================================================

public class RMA_TC_284 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrClaimNumber_284;
	public static String StrPolicyName_284;
	public static String StrWitnessLastName_284;
	public static String RMAApp_WorkersCompClaim_Txt_PolicyNo;
	
	@Test
	public void RMA_TC_284_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("TC_284_Verify To Create A Workers' Comp Claim And DownLoad A Policy", "Verify That Person Involved Link Is Present In Created Workers Compensation Claim");
			parentlogger.assignAuthor("Renu Verma");

			String RMAApp_WorkersCompClaim_Txt_ClaimType;
			int RMAApp_WorkersCompClaim_Txt_EmployeeNo;
			String RMAApp_WorkersCompClaim_Txt_Department;
			Date RMAApp_WorkersCompClaim_Txt_DateOfEvent;
			int RMAApp_WorkersCompClaim_Txt_TimeOfEvent;
			Date RMAApp_WorkersCompClaim_Txt_DateOfClaim;
			int RMAApp_WorkersCompClaim_Txt_TimeOfClaim;
			String RMAApp_WorkersCompClaim_Txt_Jurisdiction;	
			String RMAApp_WorkersCompClaim_Txt_PolicyLOB;
			String RMAApp_WorkersCompClaim_Txt_PolicySystemName;
			String StrPolicyNo_284;
			
		
			//Local Variable Declaration Completed Here
			
			StrScreenShotTCName = "TC_284";
			testcall1 = false;
			loggerval1 = "NotInitialized";
			testcall2 = false;
			loggerval2 = "NotInitialized";
						
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_12_PI_AddNewEntity_PolicyTestData.xlsx"); //Excel WorkBook RMA_Suite_09_PI_AddNewEntity_ClaimTestData.xlsx Is Fetched To Retrieve Data
			RMAApp_WorkersCompClaim_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_284", 1, 0); // Claim Type Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_EmployeeNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_284", 1, 1);//Employee Number Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_284", 1, 2); // Department Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_DateOfEvent = ExcelData.RMA_ExcelDateDataRead_Utility("RMA_TC_284", 1, 3);//DateOfEvent Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_284", 1, 4);//TimeOfEvent Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_DateOfClaim = ExcelData.RMA_ExcelDateDataRead_Utility("RMA_TC_284", 1, 5);//DateOfClaim Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_TimeOfClaim = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_284", 1, 6);//TimeOfClaim Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_Jurisdiction = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_284", 1, 7); // Jurisdiction Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_PolicyLOB = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_284", 1, 8); // PolicyLOB  Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_PolicySystemName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_284", 1, 9); // PolicySystemName Is Fetched From DataSheet RMA_TC_284
			RMAApp_WorkersCompClaim_Txt_PolicyNo = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_284", 1, 10); // PolicyNo Is Fetched From DataSheet RMA_TC_284
					
			//===========================================================Settings To Be Enabled On System Settings Tab On General System Parameter Page Is Started ===========================================================
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval); //Web Page Is Refreshed
			//driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver));
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Utilities-SystemParameters-GeneralSystemParameterSetup", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("GeneralSystemParameterSetup");
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_DefaultView_Err_StaticErrorText(driver), "RMA Application Static Error Message",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Policy Interface Settings", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "uncheck", "Use Policy System Interface Checkbox", "General System Parameter Setup Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UsePolicySysInterface(driver), "check", "Use Policy System Interface Checkbox", "General System Parameter Setup Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Partial", "Policy Interface is used for point policy system.", "Message To Confirm Check For " + color.RMA_ChangeColor_Utility("Policy System Interface Settiing On General System Parameter Setup Page", 4), logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_POM_GeneralSystemParameterSetUP.RMAApp_GenSysParaSetup_Chk_UseCodeMapping(driver), "check", "Use Code Mapping Checkbox", "General System Parameter Setup Page", logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("GeneralSystemParameterSetup", false, "NA", "Utilities-->General System Parameter Setup Page", logval);			
			//===========================================================Settings To Be Enabled On System Settings Tab On General System Parameter Page Is Ended Here ===========================================================
				
			//===========================================================Creation Of Workers Comp Claim Is Started Here================================================
			driver.switchTo().parentFrame();
			parentlogger.log(LogStatus.INFO, "The Functional Utility : "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("WorkerCompACON", "RMA_WorkersCompClaimCreation_ACON", 0)+" Is Called To Create A Workers Comp Claim");
			testcall1 = true;
			StrClaimNumber_284 = RMA_Functionality_Utility.RMA_WorkersCompClaimCreation_ACON(RMAApp_WorkersCompClaim_Txt_ClaimType, RMAApp_WorkersCompClaim_Txt_EmployeeNo, RMAApp_WorkersCompClaim_Txt_Department,RMAApp_WorkersCompClaim_Txt_DateOfEvent, RMAApp_WorkersCompClaim_Txt_TimeOfEvent,  RMAApp_WorkersCompClaim_Txt_DateOfClaim, RMAApp_WorkersCompClaim_Txt_TimeOfClaim, RMAApp_WorkersCompClaim_Txt_Jurisdiction,RMAApp_WorkersCompClaim_Txt_PolicyLOB,false, logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_284);
			//===========================================================Creation Of Workers Comp Claim Is Ended Here================================================
			
			/*===========================================================Attached Policy On Created Worker Claim Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO,  "The Functional Utility : "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PolicyDown", "RMA_PolicyDownload_Utility", 0) +" Is Called To Download Policy And Save Claim");
			testcall2 = true;
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_PolicyDownload.RMAApp_PolicyDownload_Btn_multipolicyDownload(driver), "Click on Policy Download Button", logval1);// Policy download button click
			StrPolicyName_284=RMA_Functionality_Utility.RMA_PolicyDownload_Utility(RMAApp_WorkersCompClaim_Txt_PolicySystemName, RMAApp_WorkersCompClaim_Txt_DateOfEvent,RMAApp_WorkersCompClaim_Txt_PolicyLOB , RMAApp_WorkersCompClaim_Txt_PolicyNo, "Status:Verified",StrClaimNumber_284 ,"NA","Download Policy",logval1);
		//	StrClaimNumber_284 = RMA_Selenium_POM_Document_GeneralClaims.RMAApp_GeneralClaim_Txt_ClaimNumber(driver).getAttribute("value"); //Value Of the Generated Claim Number Is Fetched In The Variable StrClaimNumber
			String StrPolicyName[]=StrPolicyName_284.split(" "); // Split The Policy No from the Policy Name
			StrPolicyNo_284=StrPolicyName[1];// Filter Box Value// Fetch the Policy No Which Is On The First Index(e.g.APV 0381852 03)
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Workers' comp With Claim Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_284, 3)+ " Is Successfully Download Policy With Policy Number:: "+color.RMA_ChangeColor_Utility(StrPolicyNo_284, 2));
			
			driver.switchTo().parentFrame();
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)")));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Policy (1)"), "Policy (1) In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Policy");	
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(RMAApp_WorkersCompClaim_Txt_PolicyNo, "Policy Lookup Result Page",logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, "Policy ("+StrPolicyName_284), "Expand Image For The Created Policy On Left Hand Navigation Tree",logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Policy "+" "+StrPolicyName_284 +" Is Clicked");
			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Policy_PI(driver, StrPolicyName_284), "Person Involved Link On Left Hand Navigation Tree Of Workers Comp Claim-->Policy", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Person Involved Link Is Present In Workers Comp Claim", StrScreenShotTCName)));
			/*===========================================================Attached Policy On Created Worker Claim Is Ended Here================================================*/
			
						
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_WorkersCompClaimCreation_ACON" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_PolicyDownload_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
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
		}
	}		
}

