package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Input_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_NegativeVerification_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_058
//Description    : Successful Creation, Edit, And Delete Of Catastrophe From Maintenance Is Validated
//Depends On TC  : None
//Revision       : 0.0 - RenuVerma-10-07-2016 
//=================================================================================================
public class RMA_Smoke_TC_058 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

@Test 
public void RMA_Smoke_TC_058_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_058";
	
	try {
		parentlogger = reports.startTest("Smoke_TC_058_Create, Edit And Delete Catastrophe from Maintenance", "Successful Creation, Edit And Delete Of Catastrophe From Maintenance Is Validated");
		parentlogger.assignAuthor("Renu Verma");
			
		String StrCatastropheNumber;
		String StrAfterSaveCatastropheNumber;
		String StrCatastropheType;
		String StrEditedCatastropheType;
		String StrCatastropheLossDate;
		String StrEditedCatNum;
		String StrEditedActualCatNum;
		String StrPrimaryWindowHandle;
		String CurrentFrameID;
	//Local Variable Declaration
	
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_14_SmokeSuite_02TestData.xlsx"); //Excel WorkBook RMA_Suite_14_SmokeSuite_02TestData IS Fetched To Retrieve Data
		StrCatastropheType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_058", 1, 0); //Catastrophe Type Is Fetched From DataSheet RMA
		StrEditedCatastropheType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_058", 1, 1); // Edited Catastrophe Type Is Fetched From DataSheet RMA
		StrCatastropheLossDate= RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();//CurrentDate
		
		/*=====================================Creation Of Catastrophe From Maintenance Is Started Here================================================*/
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Catastrophe", logval);	RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As Maintenance--> CatastrophePage Is Opened");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Catastrophe");
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_LossStartDate(driver)));
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_LossStartDate(driver), "Loss Start Date TextBox On Maintenance--> Catastrophe Page",StrCatastropheLossDate, logval);
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_CatType(driver), "Catastrophe Type TextBox On Maintenance--> Catastrophe Page", StrCatastropheType, logval);
		StrCatastropheNumber=RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "Cat");
		RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_CatNumber(driver), "Catastrophe Number TextBox On Maintenance--> Catastrophe Page", StrCatastropheNumber, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Catastrophe", false, "NA", "Catastrophe Page", logval);
		StrAfterSaveCatastropheNumber=  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_CatNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrCatastropheNumber, StrAfterSaveCatastropheNumber, "Catastrophe Number Value", logval);
		/*===================================Creation Of Catastrophe From Maintenance Is Completed Here================================================*/

		/*===============================================Edit Catastrophe Is Started Here================================*/
		RMA_Input_Utility.RMA_SetTextValueandTabOut_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_CatType(driver), "Catastrophe Type TextBox On Maintenance-->Catastrophe Page", StrEditedCatastropheType, logval);
		 StrEditedCatNum= RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(4, "EditedCat");
		 RMA_Input_Utility.RMA_SetValue_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_CatNumber(driver), "Catastrophe Number TextBox On Maintenance--> Catastrophe Page ", StrEditedCatNum, logval);
		RMA_Functionality_Utility.RMA_GenericSave_Utility("Maintenance", false, "NA", "Maintenance--> Catastrophe Page", logval);
		CurrentFrameID=RMA_GenericUsages_Utility.RMA_GetCurrentFrameID();
		StrEditedActualCatNum = RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Maintenance.RMAApp_MaintCatastrophe_Lst_CatNumber(driver), "value");
		RMA_Verification_Utility.RMA_TextCompare(StrEditedCatNum, StrEditedActualCatNum , "Catastrophe Number", logval);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Existing Catastrophe Is Edited", StrScreenShotTCName)));
		/*=================================================Edit Catastrophe Is Completed Here=============================================*/

		/*===========================================================Deletion Of Existing Catastrophe Is Started Here================================================*/
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("DeleteLink", "RMA_GenericDelete_Utility",0)+" Is Called To Delete A Catastrophe ");
		testcall1 = true;
		RMA_Functionality_Utility.RMA_GenericDelete_Utility("Maintenance--> Catastrophe Page", logval1);
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);		
		parentlogger.log(LogStatus.INFO, "Catastrophe Is Deleted Successfully And Its Catastrophe Number Was::"+ " " + color.RMA_ChangeColor_Utility(StrEditedActualCatNum, 3));
		driver.switchTo().parentFrame();
		RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Maintenance-Catastrophe", logval1);
		RMA_GenericUsages_Utility.RMA_SwitchNextFrameID(CurrentFrameID);
		StrPrimaryWindowHandle = driver.getWindowHandle();
		globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver)));
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Lookup(driver), "Lookup Image On Maintenance--> Catastrophe Page", logval);
		RMA_NegativeVerification_Utility.RMA_ElementNotExist_Utility(	RMA_Selenium_POM_Home.RMAApp_Generic_RMAAppLink(driver, StrEditedActualCatNum), StrEditedActualCatNum + " Catstrophe Link", logval);
		RMA_GenericUsages_Utility.RMA_CloseWindowBasedOnTitle("Lookup Data");
		driver.switchTo().window(StrPrimaryWindowHandle);		
		/*===========================================================Deletion Of Existing Catastrophe Is Completed Here================================================*/
			
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Un-Handled Exception And Print Log Of It
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
		
		if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
		{
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_GenericDelete_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
		driver.switchTo().parentFrame();
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
