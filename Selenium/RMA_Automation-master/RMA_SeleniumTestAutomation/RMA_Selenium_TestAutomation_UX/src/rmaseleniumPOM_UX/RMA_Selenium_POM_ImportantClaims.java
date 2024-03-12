package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_ImportantClaims {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_ImpClaims_Lbl_ImportantRecords
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Important Records Icon On Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ImpClaims_Lbl_ImportantRecords(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Important Records']/i"));//Unique Id Of Important Records Icon On Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ImpClaims_Tab_Claims
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claims Tab On Important Records Area On Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ImpClaims_Tab_Claims(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnClaim"));//Unique Id Of Claims Tab On Important Records Area On Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ImpClaims_Tab_Events
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Events Tab On Important Records Area On Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ImpClaims_Tab_Events(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnEvent"));//Unique Id Of Events Tab On Important Records Area On Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ImpClaims_Btn_ImpClaims
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Important Claims Icon On Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ImpClaims_Btn_ImpClaims(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='importantclaim']/i"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique Id Of Events Tab On Important Claims Icon On Claims Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Lst_Theme
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Theme ListBox On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Lst_Theme(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dbtheme"));//Unique Id Of Theme ListBox On Theme Settings Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Btn_AddUsers
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Users Lookup Button On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Btn_AddUsers(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_selectUsrTheme']/i"));//Unique Id Of Add Users Lookup Button On Theme Settings Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Btn_UserIcon
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Users Icon Button On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Btn_UserIcon(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='usericon']/i"));//Unique Id Of Users Icon Button On Theme Settings Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Txt_SysUserSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Textbox On System Users Grid On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Txt_SysUserSearch(WebDriver driver, String TextName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TextName+"')]//ancestor::div[2]//input"));//Unique Id Of Search Textbox On System Users Grid On Theme Settings Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Btn_SysUserSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Button On System Users Grid On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Btn_SysUserSearch(WebDriver driver, String TextName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+TextName+"')]//ancestor::div[2]//span[@role='button']"));//Unique Id Of Search Button On System Users Grid On Theme Settings Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Img_RowSelector
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row Selector On RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, UserName		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                          
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Img_RowSelector(WebDriver driver,String UserName)
	{
		Element = null;
		String id=driver.findElement(By.xpath(".//*[contains(text(),'"+UserName+"')]/parent::div[@role='gridcell']")).getAttribute("id");
		String IdContents[]=id.split("uiGrid-");
		String RowNo=IdContents[0];
		Element = driver.findElement(By.xpath(" .//*[contains(@id,'"+RowNo+"uiGrid-"+"')]//div[contains(@class,'ui-grid-icon-ok')]")); //Unique XPATH of Row Selector On RMA Application System Users UX Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Btn_SysUserSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On System Users Grid On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Btn_OK(WebDriver driver, String TextName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='complete']/i"));//Unique Id Of OK Button On System Users Grid On Theme Settings Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Btn_SaveTheme
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Theme Button On System Users Grid On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Btn_SaveTheme(WebDriver driver, String TextName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button1']/i"));//Unique Id Of Save Theme Button On System Users Grid On Theme Settings Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ThemeSettings_Btn_ShowAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show All Theme Button On System Users Grid On Theme Settings Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-16-2019                                 
	//============================================================================================
	public static WebElement RMAApp_ThemeSettings_Btn_ShowAll(WebDriver driver, String TextName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button2']/i"));//Unique Id Of Show All Theme Button On System Users Grid On Theme Settings Page Is Fetched
		return Element;
	}
}
