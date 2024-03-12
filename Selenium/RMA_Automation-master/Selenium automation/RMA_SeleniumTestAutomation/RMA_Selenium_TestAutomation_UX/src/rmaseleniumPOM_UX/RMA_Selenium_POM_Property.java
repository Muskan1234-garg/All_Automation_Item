package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Property {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_PropertyID
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property ID Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_PropertyID(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pin']")); //Unique Id  Of  PropertyID Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address 1 Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_Address1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addr1']")); //Unique Id  Of  Address 1 Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_ZipPostalCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip/Postal Code Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_ZipPostalCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='zipcode']")); //Unique Id  Of Zip/Postal Code Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='city']")); //Unique Id  Of City Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Lookup Button On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_stateid']")); //Unique Id  Of State Lookup Button On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_stateid']")); //Unique Id  Of State TextBox On RMA Application Property Creation Page Is Fetched
		return Element;
	}
}
