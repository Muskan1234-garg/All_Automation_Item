package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_MailMerge {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Chk_SaveMySettings
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Save My Settings CheckBox on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Chk_SaveMySettings(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("check-Settings")); //Unique Id Of Type Of Save My Settings CheckBox on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Btn_Next1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of First Next Button on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Btn_Next1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnext")); //Unique Id Of Type Of First Next Button on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Lst_LetterName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Letter Name List on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Lst_LetterName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("TemplateName")); //Unique Id Of Type Of Letter Name List on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Chk_AskFirstRecord
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Ask To Use Record CheckBox on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Chk_AskFirstRecord(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("check-records")); //Unique Id Of Type Of Ask To Use Record CheckBox on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Btn_Next2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Second Next Button on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Btn_Next2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnNext2")); //Unique Id Of Type Of Second Next Button on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Chk_UseRecord
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Use Record CheckBox on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Chk_UseRecord(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("check-record")); //Unique Id Of Type Of Use Record CheckBox on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Btn_Next3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Third Next Button on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Btn_Next3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnNext4")); //Unique Id Of Type Of Third Next Button on Mail Merge Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MailMerge_Lbl_Launch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Launch Word Merge Link Label on Mail Merge Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-08-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_MailMerge_Lbl_Launch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lblMrgEditLstOpt1']/b")); //Unique Id Of Type Of Launch Word Merge Link Label on Mail Merge Page Is Fetched
		return Element;
	}
}
