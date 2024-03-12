package rmaseleniumtestscripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumPOM.RMA_Selenium_POM_Maintenance_Address;
import rmaseleniumutilties.RMA_ExtentReports_Utility;
import rmaseleniumutilties.RMA_GenericUsages_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_010
//Description    : Successful Address Search From Address Search NG Grid Table Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-11-26-2015 
//=================================================================================================
public class RMA_TC_010 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
	static String ErrorMessageType;
	static String StrScreenShotTCName;
	
@Test 
public void Address_AddressSearch() throws Exception, Error
{
	try {
		logger = reports.startTest("TC_010_Address_Search", "Address Created In Maintenannce-->Address Screen Is Searched Using The Search Look Up button On The Same Screen");
		String RMAApp_Maintenance_Address_Txt_Addr1;
		//RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
		RMAApp_Maintenance_Address_Txt_Addr1 = "Addr1_RMA_TC_007_IPROZ"; //Addr1 Is Fetched From DataSheet RMA_TC_07
		
		//driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 4).click(); //Maintenance Menu Option Is Selected
		logger.log(LogStatus.INFO, "Maintenance Menu Option Is Clicked On RISKMASTER Default View Page");
		
		RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 4, 2).click(); //Address Menu Option Is Selected
		logger.log(LogStatus.INFO, "Maintenance-->Address Menu Option Is Clicked On RISKMASTER Default View Page");
				
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_Maint_Address(driver)); //A Switch To The Frame Containing Maintenance-->Address Controls Is Done
		Thread.sleep(3000);
		RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Btn_AddrSearch(driver).click(); //Address Search Button Is Clicked
		logger.log(LogStatus.INFO, "Address Search Button On Maintenance-->Address Page Is Clicked");
		
		String StrPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		Set<String> strWindowHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
		Iterator<String>windowiterator = strWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
		while (windowiterator.hasNext())
		{
			String ChildWindow = windowiterator.next();
			if (!StrPrimaryWindowHandle.equalsIgnoreCase(ChildWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
			{
				driver.switchTo().window(ChildWindow);
				Thread.sleep(10000);
			}
		}
		
		RMA_Selenium_POM_Maintenance_Address.RMAApp_AddressSearch_Txt_Address1(driver).sendKeys(RMAApp_Maintenance_Address_Txt_Addr1); //Address1 Is Typed In Address1 TextBox In AddressSearch Window
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Addr1 Value To Be Searched Is Typed In Address1 TextBox On Maintenance-->Address-->AddressSearch Page");

		RMA_Selenium_POM_Maintenance_Address.RMAApp_AddressSearch_Btn_SubmitQuery(driver).click();
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "SubmitQuery Button On Maintenance-->Address-->AddressSearch Page Is Clicked");
		Thread.sleep(2000);
		
		String StrSecPrimaryWindowHandle = driver.getWindowHandle(); //Window Handle Of The Current Window Is Fetched
		Set<String> strsecWindowHandles = driver.getWindowHandles(); //Entire Set Of The Present Window Handles Is Fetched
		Iterator<String>windowseciterator = strsecWindowHandles.iterator(); //Entire Set Of The Present Window Handles Is Iterated
		while (windowiterator.hasNext())
		{
			String ChildSecWindow = windowseciterator.next();
			if (!StrSecPrimaryWindowHandle.equalsIgnoreCase(ChildSecWindow)) //If The Fetched Child Window Is Not Equal To the Parent Window Then A Switch To The Child Window Is Done
			{
				driver.switchTo().window(ChildSecWindow);
				driver.manage().window().maximize();
				Thread.sleep(10000);
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}
		}
		List<WebElement> AddressLinkHandles = RMA_Selenium_POM_Maintenance_Address.RMAApp_AddressSearch_Grd_Address(driver).findElements(By.tagName("A"));
		int IntAddressHandles_Count = AddressLinkHandles.size();
		System.out.println(IntAddressHandles_Count);
		int IntAddressIterator =0;
		for (int AddrLinks = 0; AddrLinks<IntAddressHandles_Count; AddrLinks++)
		{
			  String addrLinkText = AddressLinkHandles.get(AddrLinks).getText();
			  if (!addrLinkText.isEmpty()){
				  IntAddressIterator = IntAddressIterator+1;
				  
			  }
		}
		
		breakloop:
		for (int IntIterator = 1; IntIterator<=IntAddressIterator ; IntIterator++)
		{
			String StrSearchValue = RMA_Selenium_POM_Maintenance_Address.RMAApp_AddressSearch_Grd_AddressLinkIterator(driver,IntIterator, 2, "span").getText();
			System.out.println(IntIterator);
			System.out.println(StrSearchValue);
			if (StrSearchValue.equalsIgnoreCase("SampleAddr2_3"))
			{
				String Addr3value = RMA_Selenium_POM_Maintenance_Address.RMAApp_AddressSearch_Grd_AddressLinkIterator(driver,IntIterator, 3, "span").getText();
				System.out.println("Matched Addr3 Value Is" + Addr3value);
				Assert.assertEquals(Addr3value, "SampleAddr2_6");
				RMA_Selenium_POM_Maintenance_Address.RMAApp_AddressSearch_Grd_AddressLinkIterator(driver,IntIterator, 1, "a").click();;
				break breakloop;
			}
		}

		
		
		driver.switchTo().window(StrPrimaryWindowHandle); //A Switch To The Parent Window Is Done
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
		Thread.sleep(5000);
		driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_Maint_Address(driver)); //A Switch To The Frame Containing Maintenance-->Address Controls Is Done
		Thread.sleep(5000);
		
		String Actual_RMAApp_Maintenance_Address_Txt_Addr1 = RMA_Selenium_POM_Maintenance_Address.RMAApp_MaintAddress_Txt_Address1(driver).getAttribute("value");
		Assert.assertEquals(Actual_RMAApp_Maintenance_Address_Txt_Addr1, RMAApp_Maintenance_Address_Txt_Addr1);
		logger.log(LogStatus.PASS, "Address 1 Expected Value:" + RMAApp_Maintenance_Address_Txt_Addr1.toUpperCase() + "And Actual Value:" + Actual_RMAApp_Maintenance_Address_Txt_Addr1.toUpperCase()+ "Are the Same");

		RMA_GenericUsages_Utility.RMA_WebPageRefresh_Utility(1);
		
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
public void RMA_FailureReport(ITestResult result) //All The Information Associated With The Test Case Is Stored In Result Variable
{ 
	try {
		StrScreenShotTCName = "TC_010";
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

