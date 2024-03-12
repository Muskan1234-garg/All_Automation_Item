package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Withholding {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Withholding_Txt_Percentage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Percentage TextBox On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Withholding_Txt_Percentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtPercentage")); //Unique Id Of Percentage TextBox On Withholding Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Withholding_CheckBox_EnableWithholding
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Enable Backup Withholding CheckBox On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Withholding_CheckBox_EnableWithholding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkEnableWithholding")); //Unique Id Of Enable Backup Withholding CheckBox On Withholding Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Withholding_Txt_Recipient
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Recipient TextBox On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Withholding_Txt_Recipient(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_luRecipient")); //Unique Id Of Recipient TextBox On Withholding Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Withholding_Btn_Recipient
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Recipient Button On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Withholding_Btn_Recipient(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_luRecipient")); //Unique Id Of Recipient Button On Withholding Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_WithholdingSearch_Btn_SearchButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Search Button On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_WithholdingSearch_Btn_SearchButton(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("submitquery")); //Unique Id Of Search Button On Withholding Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Withholding_CheckBox_VoucherPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Search Button On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Withholding_CheckBox_VoucherPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkVoucherPayment")); //Unique Id Of Search Button On Withholding Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Withholding_Img_CloseBtn
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Withholding Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Withholding_Img_CloseBtn(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='P1' and @class='close']")); //Unique Id Of Close Button On Withholding Page Is Fetched
		return Element;
	}

}
