package rmaseleniumtestscripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Utilities_LOB;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
import rmaseleniumutilties.RMA_Navigation_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_PreConditionCheck
//Description    : PreCondition Check Is Validated
//Revision       : 0.0 - KumudNaithani-12-02-2015 
//=================================================================================================
public class RMA_TC_PreConditionCheck extends rmaseleniumtestscripts.RMA_TC_BaseTest
{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
@Test
public void RMAApp_TC_PreCondition() throws Exception, Error
{
	try {
		logger = reports.startTest("RMAApp_TC_PreConditionCheck_PreCondition Enabling", "PreConditions That Are Required To Execute And Test A Particular Set Of TestConditions Are Enabled");
		String StrRMAApp_LOB_Lst_LineOfBusiness;
		//Local Variable Declaration
				
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		StrRMAApp_LOB_Lst_LineOfBusiness = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_PreConditionsCheck", 1, 0); //Line Of Business Name Is Fetched From DataSheet RMA_TC_PreCheck		
		
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 10).click(); // Utilities Menu Option Is Clicked
		logger.log(LogStatus.INFO, "Utilities Menu Option Is Clicked On RISKMASTER Default View Page");

		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 10, 3).click(); //Utilities-->System Parameters Menu Option Is Clicked
		logger.log(LogStatus.INFO, "Utilities-->System Parameters Menu Option Is Clicked On RISKMASTER Default View Page");
				
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 10, 3, 2).click(); //Utilities-->System Parameters-->Line Of Business Parameter Set Up Menu Option Is Clicked
		logger.log(LogStatus.INFO, "Utilities-->System Parameters-->Line Of Business Parmeter Set Up Menu Option Is Clicked On RISKMASTER Default View Page");

		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_LineOfBusinessParameterSetUp(driver)); //A Switch To The Frame Containing Line Of Business Parameter Set Up Page Is Done
		Select dropdown = new Select (RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Lst_LineOfBusiness(driver)); //Required Line Of Business Is Selected In Line Of Business List Box On Line Of Business Parameter Set Up Page
		dropdown.selectByVisibleText(StrRMAApp_LOB_Lst_LineOfBusiness);
		logger.log(LogStatus.INFO, "Line Of Business Selected In Line Of Business ListBox Is" +  " " + "::"+ " "+ StrRMAApp_LOB_Lst_LineOfBusiness.toUpperCase() );
		Thread.sleep(3000); //Sleep Statement Is Introduced To Handle The Delay That Browser Takes To Select General Claim As Options And Then Load The Corresponding UI 
				
		RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Tab_ClaimOptions(driver).click(); //Claim Options Tab On Line Of Business Parameter Set Up Page Is Clicked
		logger.log(LogStatus.INFO, "Claim Options Tab On Line Of Business Parameter Set Up Page Is Clicked");
		Thread.sleep(3000); //Sleep Statement Is Introduced To Handle The Delay That Browser Takes To Click On Claim Options Tab  And Then Load The Corresponding UI 
		
		RMA_Navigation_Utility.RMA_WebCheckBoxSelect_Utility(RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Chk_ClaimType(driver), "check", "Claim Type CheckBox", "Line Of Business Parameter Set Up Page",1);
		
		Thread.sleep(3000); //Sleep Statement Is Introduced To Make The UI Movement FRom Selection Of Options To Save Clear			
		RMA_Selenium_POM_Utilities_LOB.RMAApp_LOB_Btn_Save(driver).click();  //Save Button Is Checked In Line Of Business Parameter Set Up Page
		logger.log(LogStatus.PASS, "Save Button Is Checked In Line Of Business Parameter Set Up Page");
		
		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(1);
		//reports.endTest(logger);
		
		//RMA_TC_003 EventCreation = new RMA_TC_003();
		//EventCreation.EventCreation();
		
	} catch (Exception|Error e) {
		ExceptionRecorded = e.getMessage();	//Try Catch Statement Is Used To Handle Any Type Of Not Handled Exception And Print Log Of It
		if (ExceptionRecorded.contains("Command"))
		{
		ErrorMessage = ExceptionRecorded.split("Command");
		FinalErrorMessage = ErrorMessage[0];
		}
		else
		{
			FinalErrorMessage = ExceptionRecorded;
		}
		throw (e);
	}
	}
	
@AfterMethod
public void RMA_FailureReport(ITestResult result) throws Exception, Error //All The Information Associated With The Test Case Is Stored In Result Variable
{ 
	try {
		String StrScreenShotTCName = "RMA_TC_PreConditionCheck";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);
	} catch (Exception|Error e) {
		throw (e);
	}
	}	
}
