package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Packages Import Completedt

public class RMA_Selenium_POM_BankingInformation {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_BankName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Name Text Box On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_BankName(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='bankname']")); //Unique Id Of Bank Name Text Box On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_AccountNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account# Text Box On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_AccountNumber(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='accountnumber']")); //Unique Id Of Account# Text Box On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_BankingStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Banking Status Text Box On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_BankingStatus(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_bankingstatus']")); //Unique Id Of Banking Status Text Box On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Btn_BankingStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Banking Status Button On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Btn_BankingStatus(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_bankingstatus_openlookup']")); //Unique Id Of Banking Status Button On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_EffectiveStartDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Start Date TextBox On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_EffectiveStartDate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='effectiveDate' and @type='text']")); //Unique Id Of Effective Start Date TextBox On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_EffectiveEndDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective End Date TextBox On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_EffectiveEndDate(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='expirationDate' and @type='text']")); //Unique Id Of Effective End Date TextBox On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_AccountType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Type TextBox On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_AccountType(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accttypecode']")); //Unique Id Of Account Type TextBox On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Btn_AccountType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Account Type Button On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Btn_AccountType(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_accttypecode_openlookup']")); //Unique Id Of Account Type Button On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Txt_RoutingNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transit/Routing Number TextBox On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Txt_RoutingNumber(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@id='transit']")); //Unique Id Of Transit/Routing Number TextBox On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Img_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Image Button On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Img_Lookup(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']")); //Unique Id Of Lookup Image Button On RMA Application Banking Information Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_BankingInformation_Link_LookupInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link On Lookup Table On RMA Application Banking Information Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-06-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_BankingInformation_Link_LookupInfo(WebDriver driver,String Entity)
	{
		Element =null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),"+Entity+")]")); //Unique Id Of Link On Lookup Table On RMA Application Banking Information Page Is Fetched
		return Element;
	}
}
