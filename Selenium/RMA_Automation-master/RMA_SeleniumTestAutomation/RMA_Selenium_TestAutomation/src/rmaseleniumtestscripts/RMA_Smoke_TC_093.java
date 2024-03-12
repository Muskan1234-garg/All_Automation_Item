package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_WorkersComp;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_093
//Description    : Successfully Verify that Restrictions Can be Added And Deleted for WC Claim
//Depends On TC  : RMA_Smoke_TC_002_WC
//Revision       : 0.0 - RenuVerma-01-27-2017 
//=================================================================================================

public class RMA_Smoke_TC_093 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_093_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_093_Add And Delete Restrictions For WC Claim", "Successfully Verify that Restrictions Can be Added And Deleted for WC Claim");
			parentlogger.assignAuthor("Renu Verma");
			
			String FirstDayRestricted;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "Smoke_TC_093";
			FirstDayRestricted=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();// First Day Restricted Value Is Fetched
			
			//========================================= Addition Of Restrictions For Worker's Comp Claim Is Started Here=====================================================================================================
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching(StrClaimNumber_002);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employment Info"), "Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Img_EmployeeRestrictions(driver), "Employee Restrictions Image Under Employment Info Tab On Workers' Comp Claim Page", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_WorkersComp.RMAApp_WorkerComp_Img_AddNew(driver)));
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkerComp_Img_AddNew(driver), "Employee Restrictions Add New Image On Workers' Comp Employee RestrictionsPage", logval);
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmpRestriction_Txt_FirstDayRestricted(driver)));
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmpRestriction_Txt_FirstDayRestricted(driver), "First Day Restricted Textbox on Workers' Comp Employee Restrictions Page", FirstDayRestricted, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility(StrClaimNumber_002, false, "NA", "Workers' Comp Employee Restrictions Page", logval);
			//========================================= Addition Of Restrictions For Worker's Comp Claim Is Ended Here=====================================================================================================
		
			//=========================================Deletion Of Restrictions For Worker's Comp Claim Is Started Here=====================================================================================================
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, "Employment Info"), "Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WorkersComp_Img_EmployeeRestrictions(driver), "Employee Restrictions Image Under Employment Info Tab On Workers' Comp Claim Page", logval);
			RMA_Navigation_Utility.RMA_SelectWTObjectByValue_Utility(RMA_Selenium_POM_WorkersComp.RMAApp_WC_Tbl_Restricted_LossWork(driver),  new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(FirstDayRestricted)), "WEBCHECKBOX", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_WorkersComp.RMAApp_WCEmp_Img_Delete(driver), "Delete Image On Workers' Comp Employee Restrictions Page", logval);
			RMA_GenericUsages_Utility.RMA_WindMsgHandlerAndTextVerify_Utility("Yes", "Complete", "Do you want to delete this record?",  "Message To Confirm Deletion For" + " "+ color.RMA_ChangeColor_Utility("Employee Restrictions", 4), logval);
			RMA_Verification_Utility.RMA_VerifyLoadingBarDisappered(logval);
			RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(FirstDayRestricted))), new SimpleDateFormat("MM/dd/yyyy").format( new SimpleDateFormat("MMddyyyy").parse(FirstDayRestricted))+" Link On Workers' Comp Employee Restrictions Table", logval);
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_BackToParent(driver), "Back Image On Workers' Comp Employee Restrictions Page", logval);
			//=========================================Deletion Of Restrictions For Worker's Comp Claim Is Completed Here=====================================================================================================

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
