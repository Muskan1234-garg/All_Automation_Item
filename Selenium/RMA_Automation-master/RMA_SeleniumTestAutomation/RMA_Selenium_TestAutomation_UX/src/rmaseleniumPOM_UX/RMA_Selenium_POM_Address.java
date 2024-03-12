package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Address {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Addresses_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.1 - MishalKantawala-06-11-2020   Nikhil Kr.                         
	//============================================================================================
	public static WebElement RMAApp_Addresses_Btn_State(WebDriver driver)
	{
		//Element = driver.findElement(By.id("btn_state")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='btn_state_openlookup']")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Addresses_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.1 - MishalKantawala-06-11-2020                            
	//============================================================================================
	public static WebElement RMAApp_Addresses_Btn_Country(WebDriver driver)
	{
		//Element = driver.findElement(By.id("btn_state")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='btn_country_openlookup']")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Addresses_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.1 - MishalKantawala-06-11-2020                            
	//============================================================================================
	public static WebElement RMAApp_Addresses_Txt_State(WebDriver driver)
	{
		//Element = driver.findElement(By.id("btn_state")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='lookup_state']")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		return Element;
	}
	
}


