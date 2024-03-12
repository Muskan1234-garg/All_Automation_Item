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
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================================
//TestCaseID     : RMA_TC_301
//Description    : RMA_TC_301_Attachment Add, Edit & Delete On CLAIM -> Financial/Reserves-> Payment screen
//Depends On TC  : RMA_TC_292
//Revision       : 0.0 - MahendraPSingh-01-10-2017
//Revision       : 0.1 - MahendraPSingh-01-20-2017- Updated for attachment method call for Add_ edit & delete
//=================================================================================================================

public class RMA_TC_301 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName; 
	
	
@Test	
public void RMA_TC_301_Test() throws Exception, Error
  {   
	try {
		 String StrPrimaryWindowHandle;
		
	    parentlogger = reports.startTest("RMA_TC_301_Attachment Add, Edit & Delete On "+ " "+ color.RMA_ChangeColor_Utility("CLAIM -> Financial/Reserves-> Payment", 3) +" " +"Screen", "Verifying Attachment Add, Edit & Delete On CLAIM -> Financial/Reserves-> Payment screen screen");
		parentlogger.assignAuthor("Mahendra Singh");
		
		String RMAApp_Payment_Lst_BankAccount;
		String RMAApp_Payment_Lst_PayeeType;
		String RMAApp_FundsSplitDetails_Lst_TransactionType;
		String RMAApp_Payment_Txt_LastName;
		String RMAApp_Payment_Txt_DisType;
		int FundsSplitDetails_Txt_Amount_TC_332;
		String StrControlNumber_Payment;
		//Local Variable Declaration
		
		testcall1 = false;
		loggerval1 = "NotInitialized";	
		testcall2 = false;
	    loggerval2 = "NotInitialized";	
		testcall3 = false;
	    loggerval3 = "NotInitialized";	
	    StrScreenShotTCName = "RMA_TC_301";
	        
	    RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Payment_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_Payment_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_011
		FundsSplitDetails_Txt_Amount_TC_332 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_011", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_Payment_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_011
		RMAApp_Payment_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_011", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_011
		
		RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Frame is switched to main menu frame");
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
		
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Financials/Reserves");
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As frame is switched to Financials/Reserves frame");
		
		//++++++++++++++++++++++++++++++++++++++++ CLAIM -> Financial/Reserves-> Payment screen Started Here ++++++++++++++++++++++++++++++++++++++++++++++++		
		parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("PaymentAddition","RMA_PaymentAddition_Utility",0)+" To Create New Payment");
		testcall1 = true;
		StrControlNumber_Payment = RMA_Functionality_Utility.RMA_PaymentAddition_Utility(RMAApp_Payment_Lst_BankAccount, RMAApp_Payment_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, 		FundsSplitDetails_Txt_Amount_TC_332, RMAApp_Payment_Txt_LastName, RMAApp_Payment_Txt_DisType, logval1);
		parentlogger.log(LogStatus.INFO, "New Payment With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_Payment, 2)+ " "+ "Is Done");
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Payment is added to a CLAIM", StrScreenShotTCName)));
		//++++++++++++++++++++++++++++++++++++++++ CLAIM -> Financial/Reserves-> Payment screen Finished Here ++++++++++++++++++++++++++++++++++++++++++++++++	
		
		//++++++++++++++++++++++++++++++++++++++++Attachment Add,edit,delete functionality on CLAIM -> Person Involved-> Add New WITNESS screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
		 RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents image on CLAIM -> Financial/Reserves-> Payment screen", logval);
	     StrPrimaryWindowHandle = driver.getWindowHandle();
	     RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		 parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Add & Edit On CLAIM -> Financial/Reserves-> Payment screen");
		 testcall2 = true;
		 RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
		 parentlogger.log(LogStatus.INFO, "Attachment Add & Edit Functionality is verified on CLAIM -> Financial/Reserves-> Payment screen for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
		 loggerval2 = logger.toString();
		 parentlogger.appendChild(logger);
	    //++++++++++++++++++++++++++++++++++++++++Attachment Add,edit,delete functionality on CLAIM -> Person Involved-> Add New WITNESS screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
		
		//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on CLAIM -> Financial/Reserves-> Payment screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
	     
	     parentlogger.log(LogStatus.INFO, "Following Function Is Called :: Attachment_Add_Edit_Email_Delete To Verify Attachment Delete on CLAIM -> Financial/Reserves-> Payment screen");
	     testcall3 = true;
	     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
	     parentlogger.log(LogStatus.INFO, "Attachment Delete Functionality is verified on CLAIM -> Financial/Reserves-> Payment screen for CLAIM Number:: "+ color.RMA_ChangeColor_Utility(StrClaimNumber_292, 2));
	     loggerval3 = logger.toString();
	     parentlogger.appendChild(logger);
	    
	     driver.close();
		 driver.switchTo().window(StrPrimaryWindowHandle);	
	    //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on CLAIM -> Financial/Reserves-> Payment screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	
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
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_PaymentAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 else if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
		 parentlogger.appendChild(logger);
		 }
		 else if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
		 {
		 logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
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
  try 
	 {
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
	  driver.switchTo().frame(ParentFrame);
	  reports.endTest(parentlogger);	
	  reports.flush();
	 }
 }		
}



