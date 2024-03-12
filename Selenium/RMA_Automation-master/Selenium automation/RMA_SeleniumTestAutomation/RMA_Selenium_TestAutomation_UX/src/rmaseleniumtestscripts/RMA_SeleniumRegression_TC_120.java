package rmaseleniumtestscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM_UX.RMA_Selenium_POM_Generic_Claims;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
//RMA Package Import Completed

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_SeleniumRegression_TC_120
//Description    : Create, Edit and Delete of Attachments On A Newly Created Collection Is Validated
//Depends On TC  : RMA_SeleniumRegression_TC_102
//Revision       : 0.0 - ShrutiShruti-01-11-2018
//======================================================================================================================================================================================================================================================================================

public class RMA_SeleniumRegression_TC_120 extends RMA_TC_BaseTest{
	@Test
	public void RMA_SeleniumRegression_TC_120_Test() throws Exception,Error{
		try{
			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2=false;
			loggerval2="NotInitialized";
			testcall3=false;
			loggerval3="NotInitialized";
			StrScreenShotTCName = "RMA_SeleniumRegression_TC_120";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			ErrorMessage = null;
			CurrentFrameID=null;
			//Global Variable Initialization Completed Here

			parentlogger = reports.startTest("RMA_Smoke_TC_120_Create, Edit and Delete of Attachments For A Newly Created Collection", "Create, Edit and Delete of Attachments For A Newly Created Collection Is Validated");
			parentlogger.assignAuthor("Shruti Shruti");
			String Collection_Lst_BankAccount;
			String Collection_Lst_PayeeType;
			String FundsSplitDetails_Lst_TransactionType;
			String Collection_Txt_LastName;
			String Collection_Txt_DisType;
			int FundsSplitDetails_Txt_AmountForCollection;
			String ReserveType;
			String FileName;
			String FileSize;
			String StrControlNumber;
			//Local Variable Declaration Completed Here

			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_01_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			Collection_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_014
			Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_014
			FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_014
			FundsSplitDetails_Txt_AmountForCollection= ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_014", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_014
			Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_014
			Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_014", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_014
			ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_009", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_Smoke_TC_009
			FileName="RightClick.txt";
			FileSize = "0.0393 MB";
			//Local Variable Initialization Completed Here	

			/*===========================================================Creation Of Collection Is Started Here=====================================================================================================================================================*/
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Generic_Claims.RMAApp_GenericClaim_Btn_FinancialsReserves(driver), "Financials/Reserves Button from Tool Bar On Claim Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AddNewCollection","RMA_CollectionCorpAddition_Utility",0)+" Is Called To Create A Collection");
			testcall1 = true;
			StrControlNumber = RMA_Functionality_Utility.RMA_CollectionCorpAddition_Utility(Collection_Lst_BankAccount, Collection_Lst_PayeeType, ReserveType, FundsSplitDetails_Lst_TransactionType, FundsSplitDetails_Txt_AmountForCollection, Collection_Txt_LastName, Collection_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "A Collection Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Collection Is Completed Here ===================================================================================================================================================*/

			//=================================================Steps To Create And Edit Attachments Started Here==============================================================================================================================================================================
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(DefaultFrameID);			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Claim :"+" "+StrClaimNumber, logval);
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",0)+" Is Called To Add And Edit Attached Document On Payment :"+" "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011);
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", FileName, FileSize, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached And Edited Successfully On Event :"+" "+StrClaimNumber);
			parentlogger.appendChild(logger);
			//=================================================Steps To Create And Edit Attachments Started Here=======================================================================================================================================================================================

			//=================================================Steps To Delete Created Attachments Started Here==============================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called ::" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("RMA_Attachment_Add_Edit_Delete","RMA_Attachment_Add_Edit_Delete",1)+" Is Called To  Delete Attached Document On Payment :"+" "+RMA_Smoke_TC_011.StrControlNumber_Smoke_TC_011);
			testcall3 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", FileName, FileSize, false, logval1);
			parentlogger.log(LogStatus.INFO, "Document Is  Deleted Successfully On Event :"+" "+StrClaimNumber);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_StaticWait(8, logval, "Wait Is Added As Attachments Screen Is To Be Closed");// switch to claim frame
			RMA_Navigation_Utility.RMA_ObjectActionsClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close button Attchement Screen", logval);// close attachment screen
			//=================================================Steps To Delete Created Attachments Started Here==============================================================================================================================================================================	
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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_CollectionCorpAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall2== true && loggerval2.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "To Create And Edit Attachments And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))								
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function Utility" +" "+ "RMA_Attachment_Add_Edit_Delete" + " " +  "To Delete An Already Created Attachments And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_StaticWait(5, logval, "Wait Is Added As Error Condition Has Occured During Enhanced Notes Create, Edit And Delete Attachments Screen Needs To Be Closed");
				if (!(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver)== null)){
					RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_Generic_ModelPopup_Img_Close(driver), "Close Image Button On Attachments Page (Finally Block Step)", logval);		
				}
				driver.switchTo().parentFrame();
				RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Lbl_BreadcrumbName(driver, StrClaimNumber),StrClaimNumber +" Claim Number Link At Top Of The Screen",logval);
				RMA_GenericUsages_Utility.RMA_ModelDialogHandler_Utility(driver, "Yes", logval);
				RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}
}
