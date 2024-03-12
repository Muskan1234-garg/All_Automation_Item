package rmaseleniumtestscripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_Address;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_007
//Description    : Successful Address Creation Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-11-04-2015 
//=================================================================================================
public class RMA_TC_007 extends rmaseleniumtestscripts.RMA_TC_BaseTest
{
static String ExceptionRecorded;
static String []ErrorMessage;
static String FinalErrorMessage;
static String RMAApp_Maintenance_Address_Txt_Addr1;
static String RMAApp_Maintenance_Address_Txt_Addr2;
static String RMAApp_Maintenance_Address_Txt_Addr3;
static String RMAApp_Maintenance_Address_Txt_Addr4;
static String RMAApp_Maintenance_Address_Txt_City;
static String RMAApp_Maintenance_Address_Txt_State;
static String RMAApp_Maintenance_Address_Txt_Country;
static String RMAApp_Maintenance_Address_Txt_County;
int RMAApp_Maintenance_Address_Txt_ZipPostalCode;
static String ErrorMessageType;
static String StrScreenShotTCName;

@Test
public void RMAApp_AddressCreation() throws Exception, Error 
{
	try {
		logger = reports.startTest("TC_007_Address_AddressCreation", "Address Is Created In Maintenannce-->Address Screen");
		String StrAddr1;
		//Local Variable Declaration
		
		RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Maintenance_Address_Txt_Addr1 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 0); //Addr1 Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_Addr2 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 1); //Addr2 Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_Addr3 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 2); //Addr3 Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_Addr4 = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 3); //Addr4 Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_City = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 4); //City Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_State = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 5); //State Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_Country = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 6); //Country Fetched From DataSheet RMA_TC_007
		RMAApp_Maintenance_Address_Txt_County = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_007", 1, 7); //County Fetched From DataSheet RMA_TC_007
		
		RMAApp_Maintenance_Address_Txt_Addr1 =  RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, RMAApp_Maintenance_Address_Txt_Addr1); //Final Value Of Address 1 After Random String Append Is Fetched
		RMAApp_Maintenance_Address_Txt_Addr2 =  RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, RMAApp_Maintenance_Address_Txt_Addr2); //Final Value Of Address 2 After Random String Append Is Fetched
		RMAApp_Maintenance_Address_Txt_Addr3 =  RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, RMAApp_Maintenance_Address_Txt_Addr3); //Final Value Of Address 3 After Random String Append Is Fetched
		RMAApp_Maintenance_Address_Txt_Addr4 =  RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, RMAApp_Maintenance_Address_Txt_Addr4); //Final Value Of Address 4 After Random String Append Is Fetched
		RMAApp_Maintenance_Address_Txt_City =   RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, RMAApp_Maintenance_Address_Txt_City); //Final Value Of City After Random String Append Is Fetched
		RMAApp_Maintenance_Address_Txt_County = RMA_GenericUsages_Utility.RMA_RandomStringGeneration_Utility(5, RMAApp_Maintenance_Address_Txt_County); //Final Value Of County After Random String Append Is Fetched
		RMAApp_Maintenance_Address_Txt_ZipPostalCode = RMA_GenericUsages_Utility.RMA_RandomIntGeneration_Utility(111111111, 999999999 ); //Final Value Of ZipPostalCode After Random Number Append Is Fetched

		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 4).click(); //Maintenance Menu Option Is Selected
		logger.log(LogStatus.INFO, "Maintenance Menu Option Is Clicked On RISKMASTER Default View Page");
		
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 4, 2).click(); //Address Menu Option Is Selected
		logger.log(LogStatus.INFO, "Maintenance-->Address Menu Option Is Clicked On RISKMASTER Default View Page");

		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_Maint_Address(driver)); //A Switch To The Frame Containing Maintenance-->Address Controls Is Done
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Address1(driver).sendKeys(RMAApp_Maintenance_Address_Txt_Addr1); //Address1 Is Typed In Addr1 TextBox On Maintenance-->Address Creation Page
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Address1 Typed In Addr1 TextBox On Maintenance-->Address Creation Page Is" + " " + "::" + " " + RMAApp_Maintenance_Address_Txt_Addr1.toUpperCase());
				
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Address2(driver).sendKeys(RMAApp_Maintenance_Address_Txt_Addr2); //Address2 Is Typed In Addr2 TextBox On Maintenance-->Address Creation Page
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Address2 Typed In Addr2 TextBox On Maintenance-->Address Creation Page Is" + " " + "::"+ " "+ RMAApp_Maintenance_Address_Txt_Addr2.toUpperCase());
		
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Address3(driver).sendKeys(RMAApp_Maintenance_Address_Txt_Addr3); //Address3 Is Typed In Addr3 TextBox On Maintenance-->Address Creation Page
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Address3 Typed In Addr3 TextBox On Maintenance-->Address Creation Page Is" +" " + "::" + "" + RMAApp_Maintenance_Address_Txt_Addr3.toUpperCase());
				
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Address4(driver).sendKeys(String.valueOf(RMAApp_Maintenance_Address_Txt_Addr4)); //Address4 Is Typed In Addr4 TextBox On Maintenance-->Address Creation Page
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Address4 Typed In Addr4 TextBox On Maintenance-->Address Creation Page Is" + "" + "::" + RMAApp_Maintenance_Address_Txt_Addr4.toUpperCase());
		
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_City(driver).sendKeys(RMAApp_Maintenance_Address_Txt_City); //City Is Typed In City TextBox On Maintenance-->Address Creation Page
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "City Typed In City TextBox On Maintenance-->Address Creation Page Is" + " "+ "::" + " "+ RMAApp_Maintenance_Address_Txt_City.toUpperCase() );
		
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_State(driver).sendKeys(RMAApp_Maintenance_Address_Txt_State); //State Is Typed In State TextBox On Maintenance-->Address Creation Page
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_State(driver).sendKeys(Keys.TAB);
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "State Typed In State TextBox On Maintenance-->Address Creation Page Is" + " " + "::" + " "+ RMAApp_Maintenance_Address_Txt_State.toUpperCase());
				
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Country(driver).sendKeys(RMAApp_Maintenance_Address_Txt_Country); //Country Is Typed In Country TextBox On Maintenance-->Address Creation Page
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Country(driver).sendKeys(Keys.TAB);
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "Country Typed In Country TextBox On Maintenance-->Address Creation Page Is" + " " + "::"+ " "+ RMAApp_Maintenance_Address_Txt_Country.toUpperCase());
		
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_County(driver).sendKeys(RMAApp_Maintenance_Address_Txt_County); //County Is Typed In County TextBox On Maintenance-->Address Creation Page
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "County Typed In County TextBox On Maintenance-->Address Creation Page Is" + " " + "::"+ " "+ RMAApp_Maintenance_Address_Txt_County.toUpperCase());
		
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_ZipPostalCode(driver).sendKeys(String.valueOf(RMAApp_Maintenance_Address_Txt_ZipPostalCode)); //ZipPostalCode Is Typed In ZipPostalCode TextBox On Maintenance-->Address Creation Page
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "ZipPostalCode Typed In ZipPostalCode TextBox On Maintenance-->Address Creation Page Is" + " " + "::"+ " "+ RMAApp_Maintenance_Address_Txt_County.toUpperCase());
				
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Btn_Save(driver).click();
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "Save Button Is Clicked On Maintenance-->Address Creation Page");
		
		StrAddr1 = RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Address1(driver).getAttribute("value");
		Assert.assertFalse(StrAddr1.isEmpty());
		logger.log(LogStatus.PASS, "Address Creation And Save Is Successful And The Primary Address Is" + " " + "_"+ " " + StrAddr1);
		
		driver.switchTo().parentFrame(); 
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Btn_Close(driver).click();
		
		Thread.sleep(7000);
		RMA_ExcelDataRetrieval_Utility.WriteDataToExcel(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx","RMA_TC_007", 10, 0, StrAddr1);
		logger.log(LogStatus.INFO, "Generated Event Number:" + " " + StrAddr1 + " " + "Is Also Written In The Corresponding Excel Data Sheet RMA_TC_003");
			
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
		throw (e);
	}
	}

@AfterMethod
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{ 
	try {
		StrScreenShotTCName = "TC_007";
		String TestCaseName;
		if (ITestResult.FAILURE == result.getStatus())
		{
			TestCaseName = result.getName();
			RMA_ExtentReports_Utility.RMA_ExtentFailureReport(FinalErrorMessage, TestCaseName, StrScreenShotTCName,1);
		}
		reports.endTest(logger);
	} catch (Exception|Error e) {
		System.out.println("Following Error Occurred In AfterMethod Code Block Of Test Case :" +" " +StrScreenShotTCName +" :" +" " +e.getMessage() );
	}
	}
}
