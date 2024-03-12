package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_015
//Description    : RMA_Smoke_TC_015_Verify Adding,Editing And Deleting Of new Employee As Person Involved For Event
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-07-18-2016 
//=================================================================================================

public class RMA_Smoke_TC_015 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_Smoke_TC_015_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_015_Adding, Editing And Deleting Of New Employee", "Verify Adding,Editing And Deleting Of New Employee As Person Involved  For Event");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String StrEmployeeNumber_RMA_Smoke_TC_015;
			String StrEmployeeLastNameActual_RMA_Smoke_TC_015;
			String StrEmployeeNameChanged_RMA_Smoke_TC_015;
			//Local Variable Declaration Completed Here

			StrScreenShotTCName = "RMA_Smoke_TC_015";
			testcall1 = false;	
			testcall2 = false;	
			loggerval1 = "NotInitialized";
			loggerval2 = "NotInitialized";

			/*================================================== Step Add New Employee Is On Claim--> PI Started Here================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Collapse Image Corresponding To Claim Link" +" "+StrClaimNumber_002+" " +" On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Collapse Image Corresponding To Claim Link" +" " +StrClaimNumber_002+" " +" On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectRightClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_Event_PI(driver,StrClaimNumber_002), "Person Involved Link On Left Hand Navigation Tree Under Event", logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PIAddNewEntity" ,"RMA_PIAddNewEntity_Utility",0)+" Is Called To Create An Employee ");
			testcall1 = true;
			StrEmployeeNumber_RMA_Smoke_TC_015 = RMA_Functionality_Utility.RMA_PIAddNewEntity_Utility("Employee", logval1);
			parentlogger.log(LogStatus.INFO, "New Employee Is Created Successfully With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber_RMA_Smoke_TC_015, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "New Employee Is Added As Persons Involved Under Event", StrScreenShotTCName)));
			/*================================================== Step Add New Employee Is On Claim--> PI Started Here================================================================*/

			/*===============================================Editing Of New Employee Is Started Here================================*/
			StrEmployeeNameChanged_RMA_Smoke_TC_015 = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EmpName_");
			RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "LastName TextBox On PI Employee Page ", StrEmployeeNameChanged_RMA_Smoke_TC_015, logval);
			RMA_Functionality_Utility.RMA_GenericSave_Utility("piemployee", false, "NA","Persons Involved-->Employee Page", logval);
			StrEmployeeLastNameActual_RMA_Smoke_TC_015 = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Home.RMAApp_Generic_LastName(driver), "value");
			RMA_Verification_Utility.RMA_TextCompare(StrEmployeeNameChanged_RMA_Smoke_TC_015, StrEmployeeLastNameActual_RMA_Smoke_TC_015 , "EmployeeLast Name", logval);
			parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Employee Is Edited Under Event", StrScreenShotTCName)));

			/*=================================================Editing Of New Employee Is Completed Here=============================================*/

			/*===========================================================Deletion Of New Employee Is Started Here================================================*/

			parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink","RMA_GenericDelete_Utility",0)+" Is Called To Delete An Employee : " +" "+ color.RMA_ChangeColor_Utility(StrEmployeeNameChanged_RMA_Smoke_TC_015, 2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_GenericDelete_Utility("PI Employee Page", logval1);
			parentlogger.log(LogStatus.INFO, "Employee Is Deleted Successfully ::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNameChanged_RMA_Smoke_TC_015, 2));
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Deletion Of New Employee Is Completed Here================================================*/

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "PIAddNewEntity" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}
			else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
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
			try 
			{
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrClaimNumber_002, "Left Navigation Tree", logval);// Claim Link Is Clicked To Load Claim Page 
				RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link" +StrClaimNumber_002+" " +" On Left Navigation Tree", logval);
				RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Claim Link" +StrClaimNumber_002+" " +" On Left Navigation Tree Is Clicked ");
				reports.endTest(parentlogger); 
				reports.flush();

			}catch (Exception|Error e)
			{

			}
		}
	}
}


