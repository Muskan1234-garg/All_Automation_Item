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
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_034
//Description    : Add, Edit And Delete Of Existing MedicalStaff As Person Involved For Created Claim/Event/Litigation Is Validated
//Depends On TC  : RMA_SeleniumRegression_TC_021/RMA_SeleniumRegression_TC_022/RMA_SeleniumRegression_TC_023/RMA_SeleniumRegression_TC_024/RMA_SeleniumRegression_TC_025/RMA_SeleniumRegression_TC_026
//Revision       : 0.0 - KumudNaithani-08-11-2017 
//======================================================================================================================================================================================================================================================================================
public class RMA_SeleniumRegression_TC_034 extends RMA_TC_BaseTest {
	@Test
	public void RMA_SeleniumRegression_TC_034_Test() throws Exception,Error {
		try{
			parentlogger = reports.startTest("RMA_SeleniumRegression_TC_034_Add, Edit And Delete Of Existing PI MedicalStaff", "Add, Edit And Delete Of Existing MedicalStaff As Person Involved For Created Claim/Event/Litigation Is Validated");
			parentlogger.assignAuthor("Kumud Naithani");
			
			String StrMedicalStaffLastName;
			//Local Variable Declaration
			
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_034";
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed 
			
			//===========================================================Addition Of Existing Medical Staff As Person Involved Is Started Here================================================================================================================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIExistingEntityAdd", "RMA_PersonInvolvedExistingEntityAdd_Utility",0)+" To Add Existing MedicalStaff As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall1 = true;
			StrMedicalStaffLastName=RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedExistingEntityAdd_Utility("MedicalStaff", StrClaimNumber, RMA_SeleniumRegression_TC_034_PI_DataCreation.StrMedicalStaffLastName, "NA",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "Existing MedicalStaff With Last Name"+ " "+color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2)+ " "+ "Is Added As Person Involved To Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));;
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// Existing MedicalStaff As Person Involved Is Successfully Created
			//============================================================Addition Of Existing Medical Staff As Person Involved Is Completed Here================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That Added MedicalStaff As Person Involved Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Started Here==================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On MedicalStaff Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver, StrMedicalStaffLastName),"Created MedicalStaff" + " "+color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2)+ " "+ "Link On Right Hand Claim Tree",logval);
			//===========================================================Verification That Added MedicalStaff As Person Involved Is Displayed On Claim Right Hand Navigation Tree And Can Be Navigated From There Is Completed Here=====================================================================================================================================================================
			
			//==========================================================Edit Of Existing MedicalStaff Added Person Involved Is Started Here===========================================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIEditEntity", "RMA_PersonInvolvedEditEntity_Utility",0)+" To Edit An Already Created MedicalStaff As Person Involved For Record"+ " "+color.RMA_ChangeColor_Utility(StrClaimNumber, 2));
			testcall2 = true;
			StrMedicalStaffLastName = RMA_Maintenance_Functionality_Utility.RMA_PersonInvolvedEditEntity_Utility("MedicalStaff", StrClaimNumber,DefaultFrameID,logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.PASS, "Edit Of MedicalStaff Is Successful, Edited MedicalStaff Last Name"+ " "+color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2));
			CurrentFrameID = RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			//==========================================================Edit Of Created MedicalStaff Is Completed Here==========================================================================================================================================================================================================================================================================================
			
			//===========================================================Verification That Edited MedicalStaff As Person Involved Is Displayed On Right Hand Claim Tree Is Started Here=============================================================================================================================================================================================================================
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Img_Back(driver),"Back Image Button On MedicalStaff Creation Page",logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(CurrentFrameID);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppPartialLink(driver, StrMedicalStaffLastName),"Edited MedicalStaff" + " "+color.RMA_ChangeColor_Utility(StrMedicalStaffLastName, 2)+ " "+ "Link On Right Hand Claim Tree",logval);

			//===========================================================Verification That Edited MedicalStaff As Person Involved Is Displayed On Right Hand Claim Tree Is Completed Here======================================================================================================================================================================================================================
			
			//==========================================================Delete Of Created MedicalStaff Is Started Here=========================================================================================================================================================================================================================================================================================
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("MedicalStaff Creation Page", false, logval);
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("MedicalStaff Creation Page", true, logval);
			//==========================================================Delete Of Created MedicalStaff Is Completed Here==========================================================================================================================================================================================================================================================================================*/
		
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
			
			if (!(RMA_Selenium_POM_Home.RMAApp_PersonInvolvedWindow_Btn_Close(driver)==null))
			{
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_PersonInvolvedWindow_Btn_Close(driver), "Close Image Button On Person Involved Window/Pop-Up (Displayed On Clicking Add New Button For Person Involved On RMA Application Claim/Event/Litigation Page)",logval);
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
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}		
}

