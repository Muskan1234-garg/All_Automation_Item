package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//=============================================================================================================================
//TestCaseID     : RMA_TC_361
//Description    : Creation, Edit And Deletion Of Enhanced Notes For Collection Associated With A Claim
//Depends On TC  : RMA_TC_335
//Revision       : 0.0 - KumudNaithani-03-13-2017
//==============================================================================================================================

public class RMA_TC_361 extends RMA_TC_BaseTest {
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
@Test	
public void RMA_TC_361_Test() throws Exception, Error
{   
	try {
	 String StrPrimaryWindowHandle;
 	 String ProgressNotes;
 	 String StrControlNumber;
 	 String RMAApp_Collection_Lst_BankAccount;
	 String RMAApp_Collection_Lst_PayeeType;
	 String RMAApp_FundsSplitDetails_Lst_TransactionType;
	 String RMAApp_Collection_Txt_LastName;
	 String RMAApp_Collection_Txt_DisType;
	 int RMA_FundsSplitDetails_Txt_Amount;
 	 boolean Edit;
	 //Local Variable Declaration Completed
	 
	 parentlogger = reports.startTest("RMA_TC_361_Creation, Edit And Deletion Of Enhanced Notes For A Collection", "Creation, Edit And Deletion Of Enhanced Notes For Collection Associated With A Claim");
	 parentlogger.assignAuthor("Kumud Naithani");
			
	 testcall1 = false;
	 loggerval1 = "NotInitialized";	
	 testcall2 = false;
	 loggerval2 = "NotInitialized";	
	 testcall3 = false;
	 loggerval3 = "NotInitialized";	
	 StrScreenShotTCName = "RMA_TC_361";
	 Edit = true;
	 //Variable Initialization Completed
	 
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	RMAApp_Collection_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_014
	RMAApp_Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_014
	RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_014
	RMA_FundsSplitDetails_Txt_Amount= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_014", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
	RMAApp_Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_014
	RMAApp_Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_014
	
	//===========================================================Creation Of Collection Associated With Claim Is Started Here=====================================================================================================================================================================================================================================================================================================================================
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree Associated With Claim"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2), logval);
	RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree"+ " "+ "Associated With Claim"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2)+ " "+ "Is Clicked");
	RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
	parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AddCollection","RMA_AddNewCollection_Utility",0)+" Is Called To Create A Collection");
	testcall1 = true;
	StrControlNumber = RMA_Functionality_Utility.RMA_AddNewCollection_Utility(RMAApp_Collection_Lst_BankAccount, RMAApp_Collection_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMA_FundsSplitDetails_Txt_Amount, RMAApp_Collection_Txt_LastName, RMAApp_Collection_Txt_DisType, logval1);
	parentlogger.log(LogStatus.INFO, "A Collection Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2)+ " "+ "Associated With Claim"+ " "+ color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2));
	loggerval1 = logger.toString();
	parentlogger.appendChild(logger);
	//=========================================================== Creation Of Collection Associated With Claim Is Completed Here=======================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Create And Edit Progress Notes Started Here==================================================================================================================================================================================================================================================================================================================================================
    StrPrimaryWindowHandle = driver.getWindowHandle();
	RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_EnhancedNotes(driver), "Enhanced Notes Image For Collection"+ " "+ "Associated With Claim:"+" "+color.RMA_ChangeColor_Utility(StrClaimNumber_335, 2), logval); // Claim ID Is Same For All Line Of Business
	RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",0)+" Is Called To Create And Edit Progress Note");
	testcall2 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Create/Edit", "Confidential", "CF Confidential", StrClaimNumber_335, "NotRequired", Edit, logval1);
	loggerval2 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Progress Notes Exists With Text::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2));
	parentlogger.appendChild(logger);
	// New Progress Notes Is Created And Edited	
	//===========================================================Steps To Create And Edit Progress Notes Completed Here===================================================================================================================================================================================================================================================================================================================================================
	
	//===========================================================Steps To Delete Progress Notes Started Here=====================================================================================================================================================================================================================================================================================================================================================================
	parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EnhancedNotesCreateEditDelete", "RMA_EnhancedNotesCreateEditDelete_Utility",2)+" Is Called To Delete An Already Created Progress Note");
	testcall3 = true;
	ProgressNotes = RMA_Functionality_Utility.RMA_EnhancedNotesCreateEditDelete_Utility("Delete", "Not Required", "Not Required", "Not Required", ProgressNotes, Edit, logval1);
	loggerval3 = logger.toString();
	parentlogger.log(LogStatus.INFO,  "Existing Progress Notes ,With NotesText::"+ " " + color.RMA_ChangeColor_Utility(ProgressNotes, 2)+ "Is Deleted");
	parentlogger.appendChild(logger);
	// Created Progress Notes Is Deleted
	driver.close();
	driver.switchTo().window(StrPrimaryWindowHandle);
	//===========================================================Steps To Delete Progress Notes Completed Here=====================================================================================================================================================================================================================================================================================================================================================================
	
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
		 if (testcall1 == true && loggerval1.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_AddNewCollection_Utility" + " " +  "To Create New Collection And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Create And Edit An Enhanced Notes And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_EnhancedNotesCreateEditDelete_Utility" + " " +  "To Delete An Already Created Enhanced Notes And Hence The Test Case Is A Fail");
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
			 try {
				driver.switchTo().parentFrame();
				RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL, "HTML", "Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			 reports.endTest(parentlogger);	
			 reports.flush();
			}
	}		
}