package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankingInformation;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Dependents;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Violations;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Input_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Packages Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_049
//Description    : Verify The Correct Validation When User Tries To Save A Record Without Entering Values In Mandatory Fields
//Depends On TC  : None
//Revision       : 0.0 - ShrutiShruti-02-20-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_049 extends RMA_TC_BaseTest{
	@Test
	public void RMA_Reg_Maint_Employee_TC_049_Test() throws Exception, Error{
		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_049_Correct Validation For Saving Record Without Mandatory Fields", "Correct Validations Are Displayed When User Tries To Save Any Record Without Entering Values In Mandatory Fields Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_049";
			ErrorMessage = null;
			DefaultFrameID = null;
			//Global Variables Declaration Completed here

			String StrEmployeeLastName;
			String StrEmployeeNumber;
			String StrBankName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "BankName_");
			String StrFirstName=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(3, "DepFirstName_");
			//Local Variables Are Declared Here

			//===========================================================New Employee Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			DefaultFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
			// New Employee From Maintenance Screen Is Successfully Created
			//============================================================New Employee Creation Is Completed Here======================================================================================================================================================================================================================================================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Violations")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Violations"), "Add Image Button For Violation For The Created Employee On Maintenance Page",logval);
			//Violation Screen Is Opened

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Violations.RMAApp_Violations_Txt_Violation(driver), "Violation TextBox On Violation Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Violations.RMAApp_Violations_Btn_Violation(driver), "Violation TextBox On Violation Creation Page", logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect("Major", "Violation Lookup Window On Violation Creation Page", logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Violation Creation Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage( "Not all required fields contain the value. Please enter data in all mandatory fields.", true, "Violation Creation Page", logval);
			//Verification For Validation Message For Violations Page

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrEmployeeNumber),StrEmployeeNumber +" Employee Number Link At Top Of The Screen",logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			driver.switchTo().frame(DefaultFrameID);
			//Switch To Employee Page

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Banking Information")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Banking Information"), "Add Image Button For Banking Information For The Created Employee On Maintenance Page",logval);
			//Banking Information Screen Is Opened

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_BankName(driver), "Bank Name TextBox On Banking Information Creation Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Txt_BankName(driver), "Bank NAme TextBox On Banking Information Creation Page", StrBankName, logval);		
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Banking Information Creation Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage("Not all required fields contain the value. Please enter data in all mandatory fields.", true, "Banking Information Creation Page", logval);
			//Verification For Validation Message On Banking Information Page

			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrEmployeeNumber),StrEmployeeNumber +" Employee Number Link At Top Of The Screen",logval);
			RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			driver.switchTo().frame(DefaultFrameID);
			//Switch To Employee Page

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Dependents")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Dependents"), "Add Image Button For Dependents For The Created Employee On Maintenance Page",logval);
			//Dependents Screen Is Opened

			RMA_Verification_Utility.RMA_ElementExist_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_FirstName(driver), "First Name TextBox On Dependents Creation Page", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_LastName(driver), "Last NAme TextBox On Dependents Creation Page", "", logval);
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Dependents.RMAApp_Dependents_Txt_FirstName(driver), "First Name TextBox On Dependents Creation Page", StrFirstName, logval);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Save(driver), "Save Image Button On Dependents Creation Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXMessage("Not all required fields contain the value. Please enter data in all mandatory fields.", true, "Dependents Creation Page", logval);
			//Verification For Validation Message On Dependents Page
		}	
		catch(Exception|Error e)
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_MaintenanceAddNewEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);				
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
