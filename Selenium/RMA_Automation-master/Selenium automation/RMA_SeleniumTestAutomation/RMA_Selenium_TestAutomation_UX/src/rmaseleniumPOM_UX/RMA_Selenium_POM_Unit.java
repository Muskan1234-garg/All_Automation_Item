package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Unit {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Btn_VehicleId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which VehicleId Button On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Btn_VehicleId(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_vehvin']/ancestor::div[1]//.[@class = 'input-group']/span[1]/button")); //Unique Id  Of VehicleId TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_VehicleId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which VehicleId TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_VehicleId(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_vehvin']")); //Unique Id  Of  VehicleId TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_VehicleMake
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which VehicleMake TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_VehicleMake(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='vehvehiclemake']")); //Unique Id  Of  VehicleMake TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_VehicleModel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which VehicleModel TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_VehicleModel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='vehvehiclemodel']")); //Unique Id  Of  VehicleModel TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_VehicleYear
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which VehicleYear TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_VehicleYear(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='vehvehicleyear']")); //Unique Id  Of VehicleYear TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_UnitType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UnitType TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_UnitType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_vehunittypecode']")); //Unique Id  Of UnitType TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_UnitState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UnitState TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_UnitState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_vehstaterowid']")); //Unique Id  Of UnitState TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_Department
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_Department(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_vehhomedepteid']")); //Unique Id  Of Department TextBox On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Btn_Department
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Button On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Btn_Department(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='vehhomedepteid']/p/span/button")); //Unique Id  Of Department Button On RMA Application Unit Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Unit_Txt_VehicleDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Vehicle Description TextBox On RMA Application Unit Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Unit_Txt_VehicleDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='vehdesc']")); //Unique Id  Of Vehicle Description TextBox On RMA Application DemandOffer Creation Page Is Fetched
		return Element;
	}
}
