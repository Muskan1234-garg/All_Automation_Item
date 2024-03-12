package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_InsufficientReserves {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Txt_SetReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SetReserve TextBox On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Txt_SetReserve(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtsetreserve")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Btn_SetReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SetReserve Button On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Btn_SetReserve(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("setreservebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Txt_AddReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AddReserve TextBox On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Txt_AddReserve(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtaddreserve")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Btn_AddReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which AddReserve Button On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Btn_AddReserve(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("addreservebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Btn_Continue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Continue Button On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Btn_Continue(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("continue")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-01-16-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Btn_Cancel(WebDriver driver)
	{Element=null;
	Element = driver.findElement(By.id("cancel")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Txt_CurrentBalance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Balance TextBox On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-23-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Txt_CurrentBalance(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='lblCurrBal' and @type='text']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Txt_CurrentReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Reserve TextBox On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-23-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Txt_CurrentReserve(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='lblCurrRes' and @type='text']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_InsufficientReserves_Txt_PaymentAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payment Amount TextBox On RMA Application Insufficient Reserves  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-23-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_InsufficientReserves_Txt_PaymentAmount(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='lblPayAmount' and @type='text']")); 
		return Element;
	}
}
