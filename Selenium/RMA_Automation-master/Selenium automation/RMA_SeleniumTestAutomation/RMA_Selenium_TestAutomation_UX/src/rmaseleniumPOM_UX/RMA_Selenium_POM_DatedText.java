package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_DatedText {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_DatedText_Txt_DateEntered
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Entered Textbox On RMA Application Dated Text On Event Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_DatedText_Txt_DateEntered(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dateentered' and @type='text']")); //Unique Id Of Date Entered Textbox On RMA Application Dated Text On Event Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DatedText_Txt_DatedTextType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated Text Type Textbox On RMA Application Dated Text On Adjuster Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_DatedText_Txt_DatedTextType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_texttypecode']")); //Unique Id Of Dated Text Type Textbox On RMA Application Dated Text On Adjuster Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_DatedText_Btn_DatedTextType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Dated Text Type Lookup Button On RMA Application Dated Text On Adjuster Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_DatedText_Btn_DatedTextType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_texttypecode']")); //Unique Id Of Dated Text Type Lookup Button On RMA Application Dated Text On Adjuster Page Is Fetched
		return Element;
	}
}
