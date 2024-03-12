package rmaseleniumtestscripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import rmaseleniumPOM.RMA_Selenium_POM_FinancialReserves;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
//Default Package Import Completed

import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_Functionality_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
import rmaseleniumutilties.RMA_ScreenCapture_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_Smoke_TC_046
//Description    : Successful Reserve Creation For Created Carrier Claim Is Validated
//Depends On TC  : RMA_Smoke_TC_045_GC/RMA_Smoke_TC_045_WC
//Revision       : 0.0 - RenuVerma-09-18-2016 
//=================================================================================================
public class RMA_Smoke_TC_046 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	static String ReserveCreation_Lst_ReserveType;
	static String ClaimType_046;

@Test 
public void RMA_Smoke_TC_046_Test() throws Exception, Error
{
	testcall1 = false;	
	loggerval1 = "NotInitialized";
	StrScreenShotTCName = "Smoke_TC_046";	
	
	try {
		parentlogger = reports.startTest("Smoke_TC_046_Reserve Creation On Carrier Claim", "Successful Reserve Creation For Created Carrier Claim Is Validated");
		parentlogger.assignAuthor("Renu Verma");
		
		int ReserveCreation_Txt_ReserveAmount;
		String ReserveCreation_Lst_Status;
		String ReserveCreation_Lst_ExpStatus;
		String ReserveGrid_Cell_Balance;
		String ReserveGrid_Cell_Paid;
		String ReserveGrid_Cell_Incured;
		String ReserveGrid_Cell_Collection;
		String ReserveCreation_DateEntered;
		
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite_13_SmokeSuite_03.xlsx"); //Excel WorkBook RMA_Suite_13Suite_03 IS Fetched To Retrieve Data 
		ReserveCreation_Txt_ReserveAmount = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_046", 1, 0); //Reserve Amount Is Fetched From DataSheet RMA_TC_046
		ReserveCreation_Lst_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 1); // Reserve Status Is Fetched From DataSheet RMA_TC_046
		ReserveCreation_Lst_ReserveType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 2); // Reserve Type Is Fetched From DataSheet RMA_TC_046
		ReserveCreation_Lst_ExpStatus = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 3); // Expected Reserve Status Is Fetched From DataSheet RMA_TC_046
		ReserveGrid_Cell_Balance = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 4); //Reserve Grid Balance Amount Is Fetched From DataSheet RMA_TC_046
		ReserveGrid_Cell_Paid = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 5); // Reserve Grid Paid Amount Is Fetched From DataSheet RMA_TC_046
		ReserveGrid_Cell_Incured = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 6); // Reserve Grid Type AmountIs Fetched From DataSheet RMA_TC_046
		ReserveGrid_Cell_Collection = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_046", 1, 7); // Reserve grid Collection Amount Is Fetched From DataSheet RMA_TC_046
		ReserveCreation_DateEntered=new SimpleDateFormat("MM/dd/yyyy").format(new Date());// Reserve Creation Date Is Fetched Current Date 
				
		/*===========================================================New Reserve Creation Is Started Here========================================================================================================================================================================================================================================================================================================*/
		RMA_GenericUsages_Utility.RMA_ConditionalFrameSwitching(ParentFrame);
		RMA_Navigation_Utility.RMA_ObjectClick(RMA_Selenium_POM_Home.RMAApp_LeftHandNavTree_Lnk_EntName(driver, "Financials/Reserves"), "Financials/Reserves Link In Left Navigation Tree", logval);
		RMA_GenericUsages_Utility.RMA_StaticWait(2, logval, "Wait Is Added As Financials/Reserves Link In Left Hand Navigation Tree Is Clicked");
		RMA_GenericUsages_Utility.RMA_DynamicFrameSwitching("ReservesFinancials");
		ClaimType_046=RMA_Selenium_POM_FinancialReserves.RMAApp_ReserveCreation_Lbl_HeaderCaption(driver).getText();
	
		parentlogger.log(LogStatus.INFO, "The Functional Utility :" +RMA_GenericUsages_Utility.RMA_LoggerHyperlink("ReserveAddOnExternalPol", "RMA_ReserveAddOnExternalPol_Utility_ACON",0)+" Is Called To Create A Reserve On External Policy Attached Carrier Claim");
		testcall1 = true;		
		if(ClaimType_046.contains("General Claim")){
			RMA_Functionality_Utility.RMA_ReserveAddOnExternalPol_Utility_ACON(RMA_Smoke_TC_045_GC.StrPolicyName_Smoke_045,  "NA","MYCODE", ReserveCreation_Lst_ReserveType, ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status,ReserveCreation_DateEntered ,ReserveCreation_Lst_ExpStatus,ReserveGrid_Cell_Balance,ReserveGrid_Cell_Incured,ReserveGrid_Cell_Paid,ReserveGrid_Cell_Collection,false,logval1);
		}
		else if(ClaimType_046.contains("Worker")){
			RMA_Functionality_Utility.RMA_ReserveAddOnExternalPol_Utility_ACON(RMA_Smoke_TC_045_WC.StrPolicyName_Smoke_045,  "TestDC","DisType", ReserveCreation_Lst_ReserveType, ReserveCreation_Txt_ReserveAmount, ReserveCreation_Lst_Status,ReserveCreation_DateEntered ,ReserveCreation_Lst_ExpStatus,ReserveGrid_Cell_Balance,ReserveGrid_Cell_Incured,ReserveGrid_Cell_Paid,ReserveGrid_Cell_Collection,false,logval1);
		}	
		loggerval1 = logger.toString();
		parentlogger.appendChild(logger);
		parentlogger.log(LogStatus.INFO, "New Reserve Is Created With Type::" + " " + color.RMA_ChangeColor_Utility(ReserveCreation_Lst_ReserveType, 3) + " " + "And Amount::"+ " "+ color.RMA_ChangeColor_Utility(String.valueOf(ReserveCreation_Txt_ReserveAmount), 3));
		parentlogger.log(LogStatus.INFO, parentlogger.addScreenCapture(RMA_ScreenCapture_Utility.RMA_ScreenShotCapture_Utility(driver, "Creation Of New Reserve Is Successful", StrScreenShotTCName)));
		/*===========================================================New Reserve Creation Is Completed Here====================================================================================================================================================================================================================================================================================================*/
			
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Unhandled Exception And Print Log Of It
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
		logger.log(LogStatus.FAIL,"Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Function" +" "+ "RMA_ReserveAddOnExternalPol_Utility_ACON" + " " +  "And Hence The Test Case Is A Fail");
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
		reports.endTest(parentlogger);	
		reports.flush();
	}
	}
}
