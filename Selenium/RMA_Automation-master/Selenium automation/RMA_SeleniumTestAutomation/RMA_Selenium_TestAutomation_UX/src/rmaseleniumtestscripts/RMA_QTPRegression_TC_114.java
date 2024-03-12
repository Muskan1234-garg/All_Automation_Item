package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Adjuster;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Search;
import rmaseleniumPOM_UX.RMA_Selenium_POM_VerificationMessage;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//=====================================================================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_QTPRegression_TC_114
//Description    : Ability To Force The Auto Expansion Of All Adjusters On Load Of Claim Is Validated 
//Depends On TC  : None
//Revision       : 0.0 - NidhiJha-09-10-2017
//===================================================================================================================================================================================================================================================================================================================================


public class RMA_QTPRegression_TC_114 extends RMA_TC_BaseTest {
	@Test
	public void RMA_QTPRegression_TC_114_Test() throws Exception,Error {

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
		StrScreenShotTCName = null;
		StrScreenShotTCName = "RMA_QTPRegression_TC_114";
		ExceptionRecorded = null;
		FinalErrorMessage = null;
		ErrorMessageType = null;
		ErrorMessage = null;
		DefaultFrameID = null;
		//Global Variable Initialization Is Completed Here

		try{

			parentlogger = reports.startTest("RMA_QTPRegression_TC_114_Auto_Expansion_Of_All_Adjusters_On_Load_Of_Claim_Validation", " Ability To Force The Auto Expansion Of All Adjusters On Load Of Claim Is Validated ");
			parentlogger.assignAuthor("Nidhi Jha");

			String GenClaimCreation_Txt_DateOfEvent;
			String GenClaimCreation_Txt_TimeOfEvent;
			String GenClaimCreation_Txt_TimeOfClaim;
			String GenClaimCreation_Txt_DateOfClaim;
			String GenClaimCreation_Txt_ClaimStatus;
			String GenClaimCreation_Txt_Department;
			String GenClaimCreation_Txt_ClaimType;	
			String ClaimNumber;
			String AdjCreation_Txt_LastName;
			String AdjCreation_Txt_LastName_1;
			//Local Variable Declaration Completed Here

			GenClaimCreation_Txt_DateOfEvent = RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,-1,0,"MM/dd/yyyy");
			GenClaimCreation_Txt_DateOfClaim = 	GenClaimCreation_Txt_DateOfEvent;
			GenClaimCreation_Txt_TimeOfClaim = RMA_GenericUsages_Utility.RMA_CurrentTimeInfo_Utility("HH:mm");
			GenClaimCreation_Txt_TimeOfEvent =  GenClaimCreation_Txt_TimeOfClaim;
			//Local Variable Initialization Completed 

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite28_QTPRegression_010.xlsx"); 
			GenClaimCreation_Txt_ClaimType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_114", 1, 0); //Claim Type Is Fetched From DataSheet RMA_QTPRegression_TC_114
			GenClaimCreation_Txt_ClaimStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_114", 1,1 ); //Claim Status Is Fetched From DataSheet RMA_QTPRegression_TC_114
			GenClaimCreation_Txt_Department = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_QTPRegression_TC_114", 1,2 ); //Department Is Fetched From DataSheet RMA_QTPRegression_TC_114
			//General claim Data Fetch From Excel WorkBook Is Completed Here


			//============================================================Steps To Create General Claim Is Started Here===========================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("GCCorporateCreation","RMA_GenClaimCorpCreation",0)+" To Successfully Create A General Claim");
			testcall1 = true;
			ClaimNumber = RMA_Functionality_Utility.RMA_GenClaimCorpCreation(GenClaimCreation_Txt_DateOfClaim, GenClaimCreation_Txt_TimeOfClaim, GenClaimCreation_Txt_TimeOfEvent, GenClaimCreation_Txt_DateOfEvent, GenClaimCreation_Txt_ClaimStatus, GenClaimCreation_Txt_ClaimType, GenClaimCreation_Txt_Department, logval1);
			parentlogger.log(LogStatus.INFO, "Claim Is Created Successfully With Number"+ " " + color.RMA_ChangeColor_Utility(ClaimNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			DefaultFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//=============================================================Steps To Create General Claim Is Completed Here======================================================================
			
			//===========================================================Steps To Create First Adjuster Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Adjuster");
			testcall2 = true;
			AdjCreation_Txt_LastName = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Adjuster", StrClaimNumber, "NA", "NA",logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Adjuster Is Created With AdjusterLastName::"+ " " + color.RMA_ChangeColor_Utility(AdjCreation_Txt_LastName, 2));
			parentlogger.appendChild(logger);
			// New Adjuster Is Successfully Created
			//===========================================================Steps To Create First Adjuster Is Completed Here==================================================================================================================================================================================================================================================

			//==============================================================Steps To Navigate From Adjuster Screen To General Claim Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Claim"),"General Claim Breadcrumb From Adjusters Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Adjuster Screen To General Claim Screen Is Completed Here===============================================================================================================================================================================================================================================

			//===========================================================Steps To Create Second Adjuster Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Claim/EventEntityAdd", "RMA_ClaimEventEntityAddition_Utility",0)+" To Create Adjuster");
			testcall3 = true;
			AdjCreation_Txt_LastName_1 = RMA_Functionality_Utility.RMA_ClaimEventEntityAddition_Utility("Adjuster", StrClaimNumber, "NA", "NA",logval1);
			loggerval3 = logger.toString();
			parentlogger.log(LogStatus.INFO, "New Adjuster Is Created With AdjusterLastName::"+ " " + color.RMA_ChangeColor_Utility(AdjCreation_Txt_LastName_1, 2));
			parentlogger.appendChild(logger);
			// New Adjuster Is Successfully Created
			//===========================================================Steps To Create Adjuster Is Completed Here================================================================================================================================================================================================================================================================

			//===========================================================Steps To Navigate From Adjuster Screen To General Claim Screen Is Started Here=================================================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Claim"),"General Claim Breadcrumb From Adjusters Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//==============================================================Steps To Navigate From Adjuster Screen To General Claim Screen Is Completed Here===============================================================================================================================================================================================================================================

			//============================================================Steps To Close The Adjuster Creation Window  Is Started Here===========================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(6, logval, "Wait Is Added As Bank Account Needs To Get Verified");
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Button On Claim Page", logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Toolbar Needs To Get Loaded");
			//============================================================Steps To Close The Adjuster Creation Window  Is Ended Here===========================================================================================================================================================================================================================================================================Here============================================================================================//
		
			//===========================================================Negetive Verification Of Adjuster Link Is Started Here============================================================================================//
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, AdjCreation_Txt_LastName), "Adjuster Link On General Claim Page", logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, AdjCreation_Txt_LastName_1), "Adjuster Link On General Claim Page", logval);
			//===========================================================Negetive Verification Of Adjuster Link Is Completed Here============================================================================================//

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);

			//===========================================================Steps To Do Settings In Navigation Tree Settings Page Is StarHere============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28GenSysParaSetupSettings","RMA_Suite28_Utility",0)+" To Successfully Do Settings On General System Parameter Setup Page");
			testcall4 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_114_Check", logval1);
			parentlogger.log(LogStatus.INFO, "General System Parameter Setup Settings Are Done For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval4 = logger.toString();
			parentlogger.appendChild(logger);
			//=========================================================Steps To Do Settings In Navigation Tree Settings Page Is Completed Here===============================================================================================================================================================================================

			//==========================================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

			//==========================================================Steps To Search The Created General Claim Is Started He===============================================================================================================================================================		

			//============================================================Steps To Search The Created General Claim Is Started Here ===============================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Parent Frame Needs To Be Activated");
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(RMA_Selenium_POM_VerificationMessage.SearchFrame);//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Utility(RMA_Selenium_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver), "Claim Search Page", "Claim Number TextBox", ClaimNumber, ClaimNumber,DefaultFrameID,logval);			
			//===========================================================Steps To Search The Created General Claim Is Completed Here ===============================================================================================================================================================

			//====================================================== Verification Of First And Second Adjuster Link Is Started Here============================================================================================//
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Adjuster.RMAApp_Adjuster_Lnk_ClaimRightHandTree(driver, AdjCreation_Txt_LastName),"Created Adjuster" + " "+color.RMA_ChangeColor_Utility(AdjCreation_Txt_LastName, 2)+ " "+ "Link On Right Hand Claim Tree",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_TextCompare(AdjCreation_Txt_LastName, RMA_Selenium_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver).getAttribute("value"), "Adjuster Last Name On Adjuster Page", logval);
			driver.switchTo().parentFrame();
			//Verification Of First Adjuster Completed Here

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Claim"),"General Claim Breadcrumb From Adjusters Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Adjuster.RMAApp_Adjuster_Lnk_ClaimRightHandTree(driver, AdjCreation_Txt_LastName),"Created Adjuster" + " "+color.RMA_ChangeColor_Utility(AdjCreation_Txt_LastName_1, 2)+ " "+ "Link On Right Hand Claim Tree",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_Verification_Utility.RMA_TextCompare(AdjCreation_Txt_LastName, RMA_Selenium_POM_Adjuster.RMAApp_Adjuster_Txt_LastName(driver).getAttribute("value"), "Adjuster Last Name On Adjuster Page", logval);
			driver.switchTo().parentFrame();
			//Verification Of Second Adjuster Completed Here

			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, "Claim"),"General Claim Breadcrumb From Adjusters Page",logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(DefaultFrameID);
			//====================================================== Verification Of First And Second Adjuster Link Is Completed Here============================================================================================//

			RMA_GenericUsages_Utility.RMA_Non_UXNavigation(true);

			//====================================================Steps To Revert Settings In Navigation Tree Settings Page Is Started Here===============================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Suite28ParaSetupSettings","RMA_Suite28_Utility",0)+" To Successfully Revert Settings On Customization-NavigationTreeSettings Page");
			testcall5 = true;
			rmaseleniumutilties_UX.RMA_Functionality_Utility.RMA_Suite28_Utility("RMA_QTPRegression_TC_114_UnCheck", logval1);
			parentlogger.log(LogStatus.INFO, "Customization Navigation Tree Settings Are Reverted For Test Case:"+ " " + color.RMA_ChangeColor_Utility(StrScreenShotTCName, 2));
			loggerval5 = logger.toString();
			parentlogger.appendChild(logger);
			//====================================================Steps To Revert Settings In Navigation Tree Settings Page Is CompleHere==============================================================================================================================================================================================

			
			//==========================================================Steps To Navigate To UX Screen Is Started Here===========================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_Non_UX_Dashboard_Navigation(logval);
			RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility_NonUX();
			//==========================================================Steps To Navigate To UX Screen Is Completed Here===========================================================================================================================================================================================================

		}
		catch (Exception|Error e) {

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_GenClaimCorpCreation" + " " +  "To Create First Corporate General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "To Create First Adjuster On The Created Corporate General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_ClaimEventEntityAddition_Utility" + " " +  "To Create Second Adjuster On The Created Corporate General Claim And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall4 == true && loggerval4.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Do Settings In Customization-Navigation Tree Settings And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall5 == true && loggerval5.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Suite28_Utility" + " " +  "To Revert Settings In Customization-Navigation Tree Settings And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
			try {
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();

			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" 

+" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " 

+StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}
