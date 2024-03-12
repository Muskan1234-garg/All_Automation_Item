package rmaseleniumtestscripts_REGRESSION;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_DiaryList;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_Verification_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID     : RMA_TC_013
//Description    : RMA_TC_013_ Successful Creation Of A Diary From Subrogation Is Validated
//Depends On TC  : RMA_Smoke_TC_002: For Claim Creation
//Revision       : 0.0 - RenuVerma-03-06-2017
//=================================================================================================

public class RMA_TC_013 extends rmaseleniumtestscripts.RMA_TC_BaseTest {

	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;

	@Test
	public void RMA_TC_013_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_TC_013_ Attach A Diary From Subrogation", "Successful Creation Of A Diary From Subrogation Is Validated");
			parentlogger.assignAuthor("RenuVerma");
			
			String StrSubrogation;
			String DiaryTaskName;
			String SubrogationCreation_Txt_Status;
			String SubrogationCreation_Txt_Date;
			String SubrogationCreation_Txt_FinType;
			String SubrogationCreation_Txt_Type;
			String ActivityList;
			//Local Variable Declaration Completed
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_RegressionSuite3_DiaryCases.xlsx"); //Excel WorkBook RMA_RegressionSuite3_DiaryCases.xlsx IS Fetched To Retrieve Data 
			SubrogationCreation_Txt_Type = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_013", 1, 0);//Subrogation Creation Type Is Fetched From TestData Sheet RMA_Smoke_TC_007
			SubrogationCreation_Txt_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_013", 1, 1);//Subrogation Creation Status Is Fetched From TestData Sheet RMA_Smoke_TC_007
			SubrogationCreation_Txt_FinType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_013", 1, 2);//Subrogation Creation FinType Is Fetched From TestData Sheet RMA_Smoke_TC_007
			ActivityList = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_013", 1, 3); // Activity List Is Fetched From DataSheet RMA_TC_013
		
			SubrogationCreation_Txt_Date=RMA_GenericUsages_Utility.RMA_CurrentDateInfo_Utility();//Subrogation Creation Date
			testcall1 = false;			
			loggerval1 = "NotInitialized";
			StrScreenShotTCName = "RMA_TC_013";
			//Variable Initialization Completed
			
			/*===========================================================New Subrogation Creation Is Started Here=======================================================================================================================================================================================*/
			parentlogger.log(LogStatus.INFO,"The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ClaimEntity", "RMA_ClaimEntityAddition_Utility",0)+" Is Called To Create An Subrogation ");
			testcall1 = true;
			StrSubrogation = RMA_Functionality_Utility.RMA_ClaimEntityAddition_Utility("Subrogation", "Subrogation (0)", StrClaimNumber_002, "Not Required", SubrogationCreation_Txt_Type, SubrogationCreation_Txt_Status,SubrogationCreation_Txt_Date, "Not Required", "Not Required", SubrogationCreation_Txt_FinType, logval1);
			parentlogger.log(LogStatus.INFO, "New Subrogation Is Created Successfully With Last Name::"+ " " + color.RMA_ChangeColor_Utility(StrSubrogation, 3));
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);		
			/*===========================================================New Subrogation Creation Is Completed Here======================================================================================================================================================================================*/
				
			/*===========================================================Steps To Attach Diary On Adjustor Is Started Here=======================================================================================================================================================================================*/
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_Diary(driver), "Diary Image On  Claim :"+" "+StrClaimNumber_002, logval);
			DiaryTaskName = RMA_Functionality_Utility.RMA_AttachCreateEdit_Diary("Attach","NA",ActivityList,"NA","NA", "NA", logval);
			parentlogger.log(LogStatus.INFO, "Diary Is Created Successfully With TaskName :"+" "+color.RMA_ChangeColor_Utility(DiaryTaskName, 2)+" "+"On Claim :"+" "+color.RMA_ChangeColor_Utility(StrClaimNumber_002,4));							
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_Generic_Img_ViewRecordDiaries(driver), "View Record Diaries Image On  Claim :"+" "+StrClaimNumber_002, logval);
			RMA_GenericUsages_Utility.RMA_StaticWait(4, logval, "Wait Is Added As View Diary Image Is Clicked");
			driver.switchTo().parentFrame();
			RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("Diary List (Filtered)");
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Img_DropDown(driver), "Filter Drop-Down Image On View Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ActiveDiaries(driver), "uncheck", "Active Diaries CheckBox", "View Diary Page", logval);
			RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_DiaryList.RMAApp_Diaries_Chk_ShowNotes(driver), "uncheck", "Show Notes CheckBox", "View Diary Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXGridSingleText_Utility(DiaryTaskName, "Diary UX Grid", "CQE Complete Quick Entry", 4, logval);
			driver.switchTo().parentFrame();
			RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver), "Close Image On Diary List (Filtered) Page", logval);
			/*===========================================================Steps To Attach Diary On Adjustor Is Ended Here=======================================================================================================================================================================================*/		
			
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
			
			if ((testcall1 == true) && (loggerval1.equalsIgnoreCase("NotInitialized")))
			{
			logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ClaimEntityAddition_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
	public void RMA_FailureReport(ITestResult result)   //All The Information Associated With The Test Case Is Stored In Result Variable
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

