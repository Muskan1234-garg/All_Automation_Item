package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Salvage {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Txt_SalvageStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Salvage Status Textbox On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Txt_SalvageStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_salvagestatus']")); //Unique Id  Of  Salvage Status Textbox On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Btn_SalvageStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Salvage Status LookUp Button On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Btn_SalvageStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_salvagestatus']")); //Unique Id  Of  Salvage Status LookUp Button On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Txt_ClosedDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Closed Date TextBox On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Txt_ClosedDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='closedate' and @type='text']")); //Unique Id  Of  Closed Date TextBox On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Txt_ClosedDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CutOff Date TextBox On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Txt_CutOffDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='cutoffdate' and @type='text']")); //Unique Id  Of CutOff Date TextBox On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Btn_InsuredVeh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Insured Veh/Prop Radio Button On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Btn_InsuredVeh(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='isinsuredveh']")); //Unique Id  Of Insured Veh/Prop Radio Button On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number TextBox On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Txt_ControlNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='controlnumber']")); //Unique Id  Of Control Number TextBox On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Txt_DateMoved
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Moved TextBox On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Txt_DateMoved(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='movedate' and @type='text']")); //Unique Id  Of Date Moved TextBox On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Salvage_Txt_StockNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stock Number TextBox On RMA Application Salvage Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Salvage_Txt_StockNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='stocknumber']")); //Unique Id  Of Stock Number TextBox On RMA Application Salvage Creation Page Is Fetched
		return Element;
	}
}
