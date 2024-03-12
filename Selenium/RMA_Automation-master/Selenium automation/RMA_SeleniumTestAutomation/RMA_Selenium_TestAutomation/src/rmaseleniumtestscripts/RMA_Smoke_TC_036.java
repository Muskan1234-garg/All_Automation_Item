package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_POM_Search;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_Smoke_TC_036
//Description    : RMA_Smoke_TC_036_Verify Attachment of Documents Happens On Collection Successfully.
//Depends On TC  : RMA_Smoke_TC_002
//Revision       : 0.0 - ImteyazAhmad-08-30-2016
//Modify By 	: 0.1- RenuVerma-02-02-2017 Reserve Grid Value is Modify In RMA_Smoke_TC_013 when runs with full suite hence make RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_36 as global variable
//Modify By	:0.2 -MahendraPSingh-02-22-2017 - Updated Attachment Method & its Call, First to Add, Edit And Second For Delete 
//=================================================================================================

public class RMA_Smoke_TC_036 extends RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	public static String StrControlNumber_RMA_Smoke_TC_036;
	public static int RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_36;;

	@Test
	public void RMA_Smoke_TC_036_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Smoke_TC_036_Document Attachment On Collection", "Verify Attachment of Documents Happens On Collection Successfully");
			parentlogger.assignAuthor("Imteyaz Ahmad");

			String RMAApp_Collection_Lst_BankAccount;
			String RMAApp_Collection_Lst_PayeeType;
			String RMAApp_FundsSplitDetails_Lst_TransactionType;
			String RMAApp_Collection_Txt_LastName;
			String RMAApp_Collection_Txt_DisType;
			String PhysicalPath;
			String FileSize;
			String StrPrimaryWindowHandle;
			//Local Variable Declaration Completed Here
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_06_SmokeSuite_01.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
			RMAApp_Collection_Lst_BankAccount = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_036", 1, 0); //Bank Account Is Fetched From DataSheet RMA_Smoke_TC_036
			RMAApp_Collection_Lst_PayeeType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_036", 1, 1); // Payee Type Is Fetched From DataSheet RMA_Smoke_TC_036
			RMAApp_FundsSplitDetails_Lst_TransactionType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_036", 1, 2); //Transaction Type Is Fetched From DataSheet RMA_Smoke_TC_036
			RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_36 = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Smoke_TC_036", 1, 3); //Amount Is Fetched From DataSheet RMA_Smoke_TC_036
			RMAApp_Collection_Txt_LastName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_036", 1, 4); //LastName Is Fetched From DataSheet RMA_Smoke_TC_036
			RMAApp_Collection_Txt_DisType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Smoke_TC_036", 1, 5); //Distribution Type Is Fetched From DataSheet RMA_Smoke_TC_036
		
			loggerval1 = "NotInitialized";
			testcall1 = false;
			loggerval2 = "NotInitialized";
			testcall2 = false;
			loggerval3 = "NotInitialized";
			testcall3 = false;
			StrScreenShotTCName = "Smoke_TC_036";
			PhysicalPath = System.getProperty("user.dir")+"\\RMATestInputFile\\UploadTestFile\\RightClick.txt";
			FileSize = "0.0393 MB";
			
			RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(logval);
			RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
			RMA_Functionality_Utility.RMA_MenuOptionClick_Utility("Search-Claim", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Search");//A Switch To The Frame Containing Search Screen Controls Is Done
			RMA_Functionality_Utility.RMA_StandardSearch_Screen(RMA_POM_Search.RMAApp_SearchClaims_Txt_ClaimNumber(driver)," Search-->Claim Criteria Page","Claim Number Text Box",StrClaimNumber_002,StrClaimNumber_002,StrClaimNumber_002,"num",2, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Img_ExpandCollapse(driver, StrClaimNumber_002), "Expand Image Corresponding To Claim Link" +" "+StrClaimNumber_002+" " +" On Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(3, logval, "Wait Is Added As Expand Image Corresponding To Claim Link" +" " +StrClaimNumber_002+" " +" On Left Navigation Tree Is Clicked ");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
			globalWait.until(ExpectedConditions.elementToBeClickable(RMA_Selenium_POM_FinancialReserves.RMAApp_FinReserves_Img_AddCollection(driver)));

			/*===========================================================Creation Of Collection Is Started Here================================================*/
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("AddCollection","RMA_AddNewCollection_Utility",0)+" Is Called To Create A Collection");
			testcall1 = true;
			StrControlNumber_RMA_Smoke_TC_036 = RMA_Functionality_Utility.RMA_AddNewCollection_Utility(RMAApp_Collection_Lst_BankAccount, RMAApp_Collection_Lst_PayeeType, RMAApp_FundsSplitDetails_Lst_TransactionType, RMAApp_FundsSplitDetails_Txt_Amount_Smoke_TC_36, RMAApp_Collection_Txt_LastName, RMAApp_Collection_Txt_DisType, logval1);
			parentlogger.log(LogStatus.INFO, "A Collection Is Created Successfully With Control Number::"+ " " + color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_036, 2));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			/*===========================================================Creation Of Collection Is Completed ================================================*/
			
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Attach(driver), "Attach Documents Image On Collection Page", logval);
		    StrPrimaryWindowHandle = driver.getWindowHandle();
		    RMA_GenericUsages_Utility.RMA_WindowSwitching_Utility();
		    
			//***************************************************Add, Edit Of Document ON Collection Screen Is Started***************************************************************************
			parentlogger.log(LogStatus.INFO,"The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Attachment_Add_Edit_Email_Delete", "Attachment_Add_Edit_Email_Delete",0)+" Is Called To Add And Edit Attached Document On Collection Page With Control Number :"+" "+color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_036,2));
			testcall2 = true;
			RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Add_Edit", PhysicalPath, FileSize, false, logval1);
			loggerval2 = logger.toString();
			parentlogger.log(LogStatus.INFO,  "Document Is Attached, Edited And Deleted Successfully On Collection With Control Number:"+" "+color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_036,2));
			parentlogger.appendChild(logger);
			//***************************************************Add, Edit Of Document On Collection Screen  Is Completed***************************************************************************
			
			//++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on Collection screen is started here ++++++++++++++++++++++++++++++++++++++++++++++++	
		     
		     parentlogger.log(LogStatus.INFO, "The Functional Utility : " +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("Attachment_Add_Edit_Email_Delete", "Attachment_Add_Edit_Email_Delete",0)+" Is Called To Delete Attached Document On Collection Page With Control Number :"+" "+color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_036,2));
		     testcall3 = true;
		     RMA_Functionality_Utility.RMA_Attachment_Add_Edit_Delete("Delete", PhysicalPath, FileSize, false, logval1);
		     parentlogger.log(LogStatus.INFO, "Document Is Deleted Successfully On Collection With Control Number:"+" "+color.RMA_ChangeColor_Utility(StrControlNumber_RMA_Smoke_TC_036,2));
		     loggerval3 = logger.toString();
		     parentlogger.appendChild(logger);
		    
		     driver.close();
			 driver.switchTo().window(StrPrimaryWindowHandle);	
		   //++++++++++++++++++++++++++++++++++++++++Attachment delete functionality on Collection screen is finished here ++++++++++++++++++++++++++++++++++++++++++++++++	

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
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Functional Utility" +" "+ "RMA_AddNewCollection_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			else if ((testcall2 == true) && (loggerval2.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
			}

			else if ((testcall3== true) && (loggerval3.equalsIgnoreCase("NotInitialized")))
			{
				logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "Attachment_Add_Edit_Email_Delete" + " " +  "And Hence The Test Case Is A Fail");
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
			driver.switchTo().frame(ParentFrame);
			reports.endTest(parentlogger); 
			reports.flush();
		}
	}		
}

