package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_OccurrenceParameterSetUp {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("Savebtn")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Tab_FacilityInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Facility Information Tab On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Tab_FacilityInfo(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSOccParmsFacInfo")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Tab_EventConfig
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Configurations Tab On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Tab_EventConfig(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSOccParmsEventConfig")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_FacilityName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Facility Name TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_FacilityName(WebDriver driver)
	{
		Element = driver.findElement(By.id("FacilityName")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_FacilityAdd
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Facility Address TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_FacilityAdd(WebDriver driver)
	{
		Element = driver.findElement(By.id("FacilityAddress")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_AddressLine2
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address Line2 TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_AddressLine2(WebDriver driver)
	{
		Element = driver.findElement(By.id("Address2")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_City(WebDriver driver)
	{
		Element = driver.findElement(By.id("City")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_StateZip
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State/Zip TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_StateZip(WebDriver driver)
	{
		Element = driver.findElement(By.id("StateZip")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_HCFANumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which HCFA Number TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_HCFANumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("HCFANumber")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_ContactPerson
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Contact Person TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_ContactPerson(WebDriver driver)
	{
		Element = driver.findElement(By.id("ContactPerson")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_FacilityPhone
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Facility Phone TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_FacilityPhone(WebDriver driver)
	{
		Element = driver.findElement(By.id("FacilityPhone")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_FallEventCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fall Event Categories TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_FallEventCategory(WebDriver driver)
	{
		Element = driver.findElement(By.id("FallEventCateg_multicode")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_MedicationEventCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medication Event Categories TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_MedicationEventCategory(WebDriver driver)
	{
		Element = driver.findElement(By.id("Medication_multicode")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_SentinelEventIndicators
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sentinel Event Indicators TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_SentinelEventIndicators(WebDriver driver)
	{
		Element = driver.findElement(By.id("Sentinel_multicode")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Txt_EquipEventCategories
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Equipment Event Categories TextBox On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Txt_EquipEventCategories(WebDriver driver)
	{
		Element = driver.findElement(By.id("Equipment_multicode")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_FallEventCatLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fall Event Categories Lookup Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_FallEventCatLookUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("FallEventCateg_multicodebtn")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_MedEventCatLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medication Event Categories Lookup Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_MedEventCatLookUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("Medication_multicodebtn")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_SentinelEventIndLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sentinel Event Indicators Lookup Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_SentinelEventIndLookUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("Sentinel_multicodebtn")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_EquipEventCatLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Equipment Event Categories Lookup Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_EquipEventCatLookUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("Equipment_multicodebtn")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_FallEventCatDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fall Event Categories Delete Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_FallEventCatDelete(WebDriver driver)
	{
		Element = driver.findElement(By.id("FallEventCateg_multicodebtndel")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_MedEventCatDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medication Event Categories Delete Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_MedEventCatDelete(WebDriver driver)
	{
		Element = driver.findElement(By.id("Medication_multicodebtndel")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_SentinelEventIndDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sentinel Event Indicators Delete Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_SentinelEventIndDelete(WebDriver driver)
	{
		Element = driver.findElement(By.id("Sentinel_multicodebtndel")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Btn_EquipEventCatDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Equipment Event Categories Delete Button On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Btn_EquipEventCatDelete(WebDriver driver)
	{
		Element = driver.findElement(By.id("Equipment_multicodebtndel")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_OccParamSetup_Lst_Values
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Selected List Box For Selected Value On RMA Application Occurrence Parameters Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-07-11-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_OccParamSetup_Lst_Values(WebDriver driver, String Value)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Value+"')]//ancestor::select")); 
		return Element;
	}
}
