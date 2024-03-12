package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_DemandOffer {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_DemandOffer_Txt_Activity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activity Textbox On RMA Application DemandOffer Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_DemandOffer_Txt_Activity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_activitycode']")); //Unique Id  Of  Activity Textbox On RMA Application DemandOffer Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DemandOffer_Txt_ActivityLookUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Activity Look-Up Button On RMA Application DemandOffer Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_DemandOffer_Btn_ActivityLookUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_activitycode_openlookup']")); //Unique Id  Of  Activity Look-Up Button On RMA Application DemandOffer Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DemandOffer_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount On RMA Application DemandOffer Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_DemandOffer_Txt_Amount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='demandofferamount' and @type = 'text']")); //Unique Id  Of  Amount On RMA Application DemandOffer Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DemandOffer_Txt_Date
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date On RMA Application DemandOffer Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_DemandOffer_Txt_Date(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='demandofferdate' and @type='text']")); //Unique Id  Of  Date On RMA Application DemandOffer Creation Page Is Fetched
		return Element;
	}
	
	//============================================================================================
		//FunctionName 			: RMAApp_DemandOffer_Txt_Decision
		//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Decision On RMA Application DemandOffer Creation Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
		// ============================================================================================
		public static WebElement RMAApp_DemandOffer_Txt_Decision(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@id='lookup_decisioncode']")); //Unique Id  Of  Decision On RMA Application DemandOffer Creation Page Is Fetched
			return Element;
		}
}
