package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_People {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Lst_TypeOPerson
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of People ListBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_People_Lst_TypeOPerson(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of People ListBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Txt_Name
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name TextBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Txt_Name(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Name TextBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Lst_IDType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which IDType ListBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Lst_IDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("typeid")); //Unique Id Of IDType ListBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Txt_ReferenceNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ReferenceNumber TextBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Txt_ReferenceNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("referencenumber")); //Unique Id Of ReferenceNumber TextBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Txt_Tittle
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title TextBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Txt_Tittle(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("title")); //Unique X-path Of Title TextBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Tab_ContactInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ContactInfo Tab On People Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Tab_ContactInfo(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Contact Info ')]//i")); //Unique Id Of ContactInfo Tab On People Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Tab_OperatingAs
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OperatingAs Tab On People Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                               
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Tab_OperatingAs(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Operating As')]//i")); //Unique Id Of OperatingAs Tab On People Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_People_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addresses Tab On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_People_Tab_Addresses(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i")); //Unique x-path  Of Addresses Tab On RMA Application Entity Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_People_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EntityIDType Tab On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_People_Tab_EntityIDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i")); //Unique x-path  Of EntityIDType Tab On RMA Application Entity Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On People Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Tab_Supplementals(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Supplementals')]//i")); //Unique Id Of Supplementals Tab On People Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Tab_People
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which People Tab On People Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                               
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Tab_People(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'People')]//i")); //Unique Id Of People Tab On People Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Txt_Prefix
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Prefix TextBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-15-2020                              
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Txt_Prefix(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_prefix")); //Unique X-path Of Prefix TextBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Btn_Prefix
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Prefix Button On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-15-2020                              
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Btn_Prefix(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_prefix_openlookup")); //Unique X-path Of Prefix Button On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Txt_SuffixCommon
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Suffix (Common) TextBox On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-15-2020                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Txt_SuffixCommon(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_suffixcommon")); //Unique X-path Of Suffix (Common) TextBox On Maintenance-->People Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_People_Btn_SuffixCommon
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Suffix Button On Maintenance-->People Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-15-2020                              
	//================================================================================================================================================================================================
	public static WebElement RMAApp_People_Btn_SuffixCommon(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_suffixcommon_openlookup")); //Unique X-path Of Suffix Button On Maintenance-->People Is Fetched
		return Element;
	}
}

