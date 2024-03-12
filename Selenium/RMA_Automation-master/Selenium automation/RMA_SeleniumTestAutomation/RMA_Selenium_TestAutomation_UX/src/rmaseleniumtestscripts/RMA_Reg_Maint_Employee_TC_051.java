package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Packages Import complete

import rmaseleniumPOM_UX.RMA_Selenium_POM_BankingInformation;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Employee;
import rmaseleniumPOM_UX.RMA_Selenium_POM_Home;
import rmaseleniumutilties_UX.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties_UX.RMA_ExtentReports_Utility;
import rmaseleniumutilties_UX.RMA_GenericUsages_Utility;
import rmaseleniumutilties_UX.RMA_Maintenance_Functionality_Utility;
import rmaseleniumutilties_UX.RMA_Navigation_Utility;
import rmaseleniumutilties_UX.RMA_Verification_Utility;
// RMA Packages Import complete

//====================================================================================================================================================================================================================================================================================
//TestCaseID     : RMA_Reg_Maint_Employee_TC_051
//Description    : Verification of Banking Information feature of Employee Maintenance
//Depends On TC  : None
//Revision       : 0.0 - SheikhFaiza-02-09-2018 
//======================================================================================================================================================================================================================================================================================

public class RMA_Reg_Maint_Employee_TC_051 extends RMA_TC_BaseTest {
	@Test
	public void RMA_Reg_Maint_Employee_TC_051_Test() throws Exception,Error {

		try{
			parentlogger = reports.startTest("RMA_Reg_Maint_Employee_TC_051_Creating Of Banking Information From Employee Maintenance Screen", " Create, Edit And Delete Of Banking Information From Employee Maintenance Screen Is Validated");
			parentlogger.assignAuthor("Faiza Sheikh");

			testcall1 = false;	
			loggerval1 = "NotInitialized";
			testcall2 = false;	
			loggerval2 = "NotInitialized";
			testcall3 = false;	
			loggerval3 = "NotInitialized";
			ExceptionRecorded = null;
			FinalErrorMessage = null;
			ErrorMessageType = null;
			StrScreenShotTCName = null;
			StrScreenShotTCName = "RMA_Reg_Maint_Employee_TC_051";
			ErrorMessage = null;
			//Global Variable Initialization Completed 

			String StrEmployeeNumber;
			String StrEmployeeLastName;
			String StrBankName;
			String BankingInfo_Creation_Txt_BankName;
			int BankingInfo_Creation_Txt_AccountNo; 
			String BankingInfo_Creation_Txt_Status;
			int BankingInfo_Creation_Txt_RoutingNo;
			String BankingInfo_Creation_Txt_AccountType;
			String BankingInfo_Creation_Txt_StartDate;
			String BankingInfo_Creation_Txt_EndDate;
			//Local Variable Declaration Completed Here

			BankingInfo_Creation_Txt_StartDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			BankingInfo_Creation_Txt_EndDate= RMA_GenericUsages_Utility.RMA_PastFutureDateInfo_Utility(0,0,+1,"MM/dd/yyyy");
			//Local Variable Initialization Completed 
			
			RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMA_Suite02_Maint_Employee_Regression.xlsx"); //Excel WorkBook RMA_Suite02_Maint_Employee_Regression.xlsx Is Fetched To Retrieve Data
			BankingInfo_Creation_Txt_BankName = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_051", 1, 0); // Activity List Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_054
		    BankingInfo_Creation_Txt_AccountNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Reg_Maint_Employee_TC_051", 1, 1); // Account Number Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_051
			BankingInfo_Creation_Txt_Status = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_051", 1, 2); // Status Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_051
			BankingInfo_Creation_Txt_RoutingNo = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_Reg_Maint_Employee_TC_051", 1, 3); // Routing Number Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_051
			BankingInfo_Creation_Txt_AccountType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_Reg_Maint_Employee_TC_051", 1, 4); // Account Type Is Fetched From DataSheet RMA_Reg_Maint_Employee_TC_051
			//Data Retrieval from DataSheet Completed
			
			//===========================================================New Employee Creation Is Started Here============================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("MaintAddNewEntity", "RMA_MaintenanceAddNewEntity_Utility",0)+" To Create New Employee From Maintenance Screen");
			testcall1 = true;
			StrEmployeeNumber=RMA_Maintenance_Functionality_Utility.RMA_MaintenanceAddNewEntity_Utility("Employee", "Great Britain", "Alberta",logval1);
			loggerval1 = logger.toString();
			parentlogger.appendChild(logger);
			StrEmployeeLastName =  RMA_Verification_Utility.RMA_AttributeFetch_Utility(RMA_Selenium_POM_Employee.RMAApp_Employee_Txt_LastName(driver), "value");
			parentlogger.log(LogStatus.INFO, "New Employee Is Created With Employee Number::"+ " " + color.RMA_ChangeColor_Utility(StrEmployeeNumber, 2)+ " "+ "And Employee Last Name"+ " "+color.RMA_ChangeColor_Utility(StrEmployeeLastName, 2));
			// New Employee From Maintenance Screen Is Successfully Created
			//============================================================New Employee Creation Is Completed Here============================================================================================================================================================================================================================================================================

			globalWait.until(ExpectedConditions.visibilityOf(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Banking Information ")));
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_Home.RMAApp_GenericBtn_EnityAdd(driver, "Banking Information "), "Add Image Button For Banking Information For The Created Employee On Maintenance Page",logval);

			//===========================================================New Banking Information Creation Is Started Here================================================================================================================================================================================================================================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EmployeeBankingInformationAdd", "RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility",0)+" To Create New Banking Information from Employee Maintenance Screen");
			testcall2 = true;
			StrBankName= RMA_Maintenance_Functionality_Utility.RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility("Create",BankingInfo_Creation_Txt_BankName, BankingInfo_Creation_Txt_AccountNo,BankingInfo_Creation_Txt_Status, String.valueOf(BankingInfo_Creation_Txt_RoutingNo), BankingInfo_Creation_Txt_AccountType, BankingInfo_Creation_Txt_StartDate, BankingInfo_Creation_Txt_EndDate, logval1);
			loggerval2 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Banking Information Is Created With Bank Name::"+ " " + color.RMA_ChangeColor_Utility(StrBankName, 2));
			//============================================================New Banking Information Creation Is Completed Here================================================================================================================================================================================================================================================================
			
			//============================================================Lookup Verification Is Started Here==================================================================================================================================================================
			RMA_Navigation_Utility.RMA_ObjectJavaScriptClick(RMA_Selenium_POM_BankingInformation.RMAApp_BankingInformation_Img_Lookup(driver), "Add Image Button  For Lookup on Employee Maintenance Page",logval);
			RMA_Navigation_Utility.RMA_WebPartialLinkSelect(StrBankName, "Lookup Window on Banking Information creation page", logval);
			RMA_Verification_Utility.RMA_PartialTextVerification(BankingInfo_Creation_Txt_BankName,StrBankName , "Bank Name Name on Banking Information Page", logval);
			RMA_Verification_Utility.RMA_VerifyUXSpinnerDisappered(logval);
			//============================================================Lookup Verification Is Completed Here==================================================================================================================================================================
			
			//===========================================================Steps To Verify Delete Functionality of Banking Information on Employee Maintenance Screen Is Started Here=======================================================
			parentlogger.log(LogStatus.INFO, "Following Function Is Called :: "+RMA_GenericUsages_Utility.RMA_LoggerHyperlink("EmployeeBankingInformationAdd", "RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility",0)+" To Delete Created Banking Information From Employee Maintenance Screen");
			testcall3= true;
			RMA_Maintenance_Functionality_Utility.RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility("Delete",BankingInfo_Creation_Txt_BankName, BankingInfo_Creation_Txt_AccountNo,BankingInfo_Creation_Txt_Status,  String.valueOf(BankingInfo_Creation_Txt_RoutingNo), BankingInfo_Creation_Txt_AccountType, BankingInfo_Creation_Txt_StartDate, BankingInfo_Creation_Txt_EndDate,logval1);
			loggerval3 = logger.toString();
			parentlogger.appendChild(logger);
			parentlogger.log(LogStatus.INFO, "New Banking Information Is Deleted Bank Name ::"+ " " + color.RMA_ChangeColor_Utility(StrBankName, 2));
			//===========================================================Steps To Verify Delete Functionality of Banking Information on Employee Maintenance Screen Is Completed Here=================================================			
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

			if (testcall2 == true && loggerval2.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
				parentlogger.appendChild(logger);
				reports.endTest(logger);	
			}
			if (testcall3 == true && loggerval3.equalsIgnoreCase("NotInitialized"))				
			{
				logger.log(LogStatus.FAIL, "Following Error Occurred  ::" + " "+  color.RMA_ChangeColor_Utility(FinalErrorMessage,1)+ " " + "While Executing Following Function: " +" "+ "RMA_EmployeeBankingInformationAddEditDeleteEntity_Utility" + " " +  "And Hence The Test Case Is A Fail");
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
				RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility_UX(logval);
				driver.switchTo().parentFrame();
			} catch (Exception|Error e) {
				System.out.println("Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
				parentlogger.log(LogStatus.FAIL,"Following Error Occurred In Finally Logic Of AfterMethod Code Block Of Test Case::" +" " +StrScreenShotTCName +" :" +" " +"<span style='color:red'>" + e.getMessage()+ "</script></span>");
			}
			reports.endTest(parentlogger);	
			reports.flush();
		}
	}	

}
