package rmaseleniumtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
//Default Package Import Completed

import rmaseleniumPOM.RMA_Selenium_POM_Document_Event;
import rmaseleniumPOM.RMA_Selenium_POM_Home;
import rmaseleniumutilties.RMA_ExcelDataRetrieval_Utility;
//RMA Package Import Completed

//================================================================================================
//TestCaseID   	 : RMA_TC_008
//Description    : Successful Event Creation And Left Hand Navigation Tree Expand Is Validated
//Depends On TC  : None
//Revision       : 0.0 - KumudNaithani-11-05-2015 
//=================================================================================================
public class RMA_TC_008 extends rmaseleniumtestscripts.RMA_TC_BaseTest{
	static String ExceptionRecorded;
	static String []ErrorMessage;
	static String FinalErrorMessage;
@Test 
public void EventAndGCCreation() throws Exception 
{
	String RMAApp_EventCreation_Txt_EventType;
	String RMAApp_EventCreation_Txt_DepteId;
	int RMAApp_EventCreation_Txt_TimeOfEvent;
	String RMAApp_EventCreation_Txt_EventStatus;
	int RMAApp_EventCreation_Txt_DateReported;
	int RMAApp_EventCreation_Txt_TimeReported;
	int RMAApp_EventCreation_Txt_DateOfEvent;
	//Local Variable Declaration
			
	RMA_ExcelDataRetrieval_Utility ExcelData = new RMA_ExcelDataRetrieval_Utility(System.getProperty("user.dir")+"\\RMASeleniumTestDataSheets\\RMASeleniumAutomationTestData.xlsx"); //Excel WorkBook RMASeleniumAutomationTestData IS Fetched To Retrieve Data 
	RMAApp_EventCreation_Txt_EventType = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 0); //TypeOfEvent Is Fetched From DataSheet RMA_TC_003
	RMAApp_EventCreation_Txt_DepteId = ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 6); //Dept Id Is Fetched From DataSheet RMA_TC_003
	RMAApp_EventCreation_Txt_EventStatus =  ExcelData.RMA_ExcelStringDataRead_Utility("RMA_TC_003", 1, 3); //Event Status Is Fetched From DataSheet RMA_TC_003
	RMAApp_EventCreation_Txt_TimeOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 2); //TimeOfEvent Is Fetched From DataSheet RMA_TC_003
	RMAApp_EventCreation_Txt_DateReported = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 4); //DateOfReporting Is Fetched From DataSheet RMA_TC_003
	RMAApp_EventCreation_Txt_TimeReported = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 5); //TimeOfReporting Is Fetched From DataSheet RMA_TC_003
	RMAApp_EventCreation_Txt_DateOfEvent = ExcelData.RMA_ExcelNumberDataRead_Utility("RMA_TC_003", 1, 1); //DateOfEvent Is Fetched From DataSheer RMA_TC_003
			
	driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_Frm_MenuOptionFrame(driver)); //A Switch To The Frame Containing RMA Application Menu Option Is Done
	RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 1).click(); //Document Menu Option Is Selected
	logger.log(LogStatus.INFO, "Document Menu Option Is Clicked On RISKMASTER Default View Page");
			
	RMA_Selenium_POM_Home.RMAApp_DefaultView_Mnu_Options(driver, 1, 1).click(); //Event Menu Option Is Selected
	logger.log(LogStatus.INFO, "Document-->Event Menu Option Is Clicked On RISKMASTER Default View Page");
			
	driver.switchTo().frame(RMA_Selenium_POM_Home.RMAApp_DefaultView_FrmEventCreation(driver)); //A Switch To The Frame Containing Event Creation Controls IS Done
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventType(driver).sendKeys(RMAApp_EventCreation_Txt_EventType);
	Thread.sleep(5000);
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventType(driver).sendKeys(Keys.TAB);
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "Event Type Is Typed In Event Type TextBox On Event Creation Page" + " "+ "::" + " "+ RMAApp_EventCreation_Txt_EventType.toUpperCase() );
			
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DepteId(driver).sendKeys(RMAApp_EventCreation_Txt_DepteId);
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DepteId(driver).sendKeys(Keys.TAB);
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "DeptId Is Typed In DeptId TextBox On Event Creation Page" + " " + "::" + " " + RMAApp_EventCreation_Txt_DepteId.toUpperCase());
			
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_TimeOfEvent(driver).sendKeys(String.valueOf(RMAApp_EventCreation_Txt_TimeOfEvent));
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "TimeOfEvent Is Typed In TimeOfEvent TextBox On Event Creation Page" + " " + "::"+ " "+ RMAApp_EventCreation_Txt_TimeOfEvent);
			
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventStatus(driver).sendKeys(RMAApp_EventCreation_Txt_EventStatus);
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_EventStatus(driver).sendKeys(Keys.TAB);
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "EventStatus Is Typed In EventStatus TextBox On Event Creation Page" +" " + "::" + "" + RMAApp_EventCreation_Txt_EventStatus.toUpperCase());
			
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DateReported(driver).sendKeys(String.valueOf(RMAApp_EventCreation_Txt_DateReported));
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "DateReported Is Typed In DateReported TextBox On Event Creation Page" + "" + "::" + RMAApp_EventCreation_Txt_DateReported);
			
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_TimeReported(driver).sendKeys(String.valueOf(RMAApp_EventCreation_Txt_TimeReported));
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "TimeReported Is Typed In TimeReported TextBox On Event Creation Page" + " " + "::" + " "+ RMAApp_EventCreation_Txt_TimeReported );
			
	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Txt_DateOfEvent(driver).sendKeys(String.valueOf(RMAApp_EventCreation_Txt_DateOfEvent));
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "DateOfEvent Is Typed In DateOfEvent TextBox On Event Creation Page" + " " + "::"+ " "+ RMAApp_EventCreation_Txt_DateOfEvent );

	RMA_Selenium_POM_Document_Event.RMAApp_EventCreation_Btn_Save(driver).click();
	Thread.sleep(7000);
	logger.log(LogStatus.INFO, "Save Button Is Clicked On Event Creation Page");
	
	driver.switchTo().parentFrame();
	Thread.sleep(10000);
	WebElement E = driver.findElement(By.xpath(".//*[@id='navTreet4']/span"));
	Actions oAction = new Actions(driver);
	oAction.moveToElement(E);
	oAction.contextClick(E).build().perform();
	WebElement elementOpen = driver.findElement(By.xpath("//div[3]/span"));
	elementOpen.click();
	logger.log(LogStatus.PASS, "RightClick Is Successful And GC Claim Screen Is Opened");
	Thread.sleep(10000);
	
}	
}
