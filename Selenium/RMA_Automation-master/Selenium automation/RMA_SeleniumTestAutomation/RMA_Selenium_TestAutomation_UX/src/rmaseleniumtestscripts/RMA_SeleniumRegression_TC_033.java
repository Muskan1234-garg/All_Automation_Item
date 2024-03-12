package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_NegativeVerification_Utility;
//RMA Package Import Completed
import rmaseleniumutilties_UX.RMA_Verification_Utility;

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_033
//Description    : Create, Edit And Delete Of OtherPerson As Person Involved For Created Claim/Event/Litigation Is Validated
//Depends On TC  : RMA_SeleniumRegression_TC_021/RMA_SeleniumRegression_TC_022/RMA_SeleniumRegression_TC_023/RMA_SeleniumRegression_TC_024/RMA_SeleniumRegression_TC_025/RMA_SeleniumRegression_TC_026
//Revision       : 0.0 - KumudNaithani-07-27-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_033 extends RMA_TC_BaseTest {
	public static String StrOtherPersonLastName;
	@Test
	public void RMA_SeleniumRegression_TC_033_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_033_Create, Edit And Delete Of PI OtherPerson", " Create, Edit And Delete Of OtherPerson As Person Involved For Created Claim/Event/Litigation Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_033";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			//===========================================================New OtherPerson Creation As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity", "RMA_PersonInvolvedAddNewEntity_Utility",0)+" To Create New OtherPerson As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall1 = true;
			StrOtherPersonLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedAddNewEntity_Utility("OtherPerson", StrClaimNumber,logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New OtherPerson Is Created With OtherPerson Last Name"+ " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New OtherPerson As Person Involved Is Successfully Created
			//============================================================New OtherPerson Creation As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That Created OtherPerson As Person Involved Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On OtherPerson Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver, StrOtherPersonLastName),"Created OtherPerson" + " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2)+ " "+ "Link On Right Hand Claim Tree",logval);
			//===========================================================Verification That Created OtherPerson As Person Involved Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Completed Here=====================================================================================================================================================================
			
			//==========================================================Edit Of Created OtherPerson Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIEditEntity", "RMA_PersonInvolvedEditEntity_Utility",0)+" To Edit An Already Created OtherPerson As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall2 = true;
			StrOtherPersonLastName = RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedEditEntity_Utility("OtherPerson", StrClaimNumber,DefaultFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of OtherPerson Is Successful, Edited OtherPerson Last Name"+ " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==========================================================Edit Of Created OtherPerson Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That Edited OtherPerson As Person Involved Is Displayed On Right Hand Claim Tree Is Started Here=============================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On OtherPerson Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver, StrOtherPersonLastName),"Edited OtherPerson" + " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2)+ " "+ "Link On Right Hand Claim Tree",logval);

			//===========================================================Verification That Edited OtherPerson As Person Involved Is Displayed On Right Hand Claim Tree Is Completed Here======================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created OtherPerson Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("OtherPerson Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("OtherPerson Creation Page", true, logval);
			//==========================================================Delete Of Created OtherPerson Is Completed Here==========================================================================================================================================================================================================================================================================================
		
			//===========================================================Verification That Deleted OtherPerson Is Not Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver, StrOtherPersonLastName), "Created OtherPerson" + " "+color.RMA_ChangeColor_Utility(StrOtherPersonLastName, 2)+ " "+ "Link On Right Hand Claim Tree", logval);
			//===========================================================Verification That Deleted OtherPerson Is Not Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==============================================================================================================================================================================================
			
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_PersonInvolvedEditEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				//driver.switchTo().parentFrame();
				//RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As User Migrates To The Default Frame To Click On Close Button");
			   // RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Close(driver), "Close Image Button On RMA Application Default View Page", logval);
			    //RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			    //RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Close Button On RMA Application Default View Page Is Clicked");
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

