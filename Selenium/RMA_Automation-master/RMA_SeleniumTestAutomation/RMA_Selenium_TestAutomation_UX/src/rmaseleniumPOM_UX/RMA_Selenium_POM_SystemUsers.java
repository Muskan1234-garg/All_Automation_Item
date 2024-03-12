package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_SystemUsers {
	public static WebElement Element;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FirstName Text Box On RMA Application System Users Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	// ============================================================================================
	public static WebElement RMAApp_SystemUsers_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id Of FirstName Text Box On RMA Application System Users Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LastName Text Box On RMA Application System Users Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of LastName Text Box On RMA Application System Users Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Lst_UserGroups
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User Groups WebList On RMA Application System Users Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Lst_UserGroups(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstUserGroups")); //Unique Id Of User Groups WebList On RMA Application System Users Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Table_SystemUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which System User Table On RMA Application System Users Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Table_SystemUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("gvUserList")); //Unique Id Of System User Table On RMA Application System Users Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Generic_BtnName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Button On RMA Application System Users Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Generic_BtnName(WebDriver driver,String ButtonName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@value='"+ButtonName+"']")); //Unique xpath Of Button On RMA Application System Users Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Generic_RadioOption
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RadioButton On RMA Application System Users Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Generic_RadioOption(WebDriver driver,String RadioOption)
	{
		Element = null;
		Element = driver.findElement(By.id("rd"+RadioOption)); //Unique Id Of RadioButton On RMA Application System Users Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Txt_Filter
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter TextBox RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Txt_Filter(WebDriver driver,String FilterName) throws InterruptedException
	{
		Element = null;
		Thread.sleep(2000);
		String Aria_labelledby=driver.findElement(By.xpath(".//*[text()='"+FilterName+"']/parent::div[1]/parent::div[1]")).getAttribute("aria-labelledby");
		Element = driver.findElement(By.xpath(".//*[@aria-labelledby='"+Aria_labelledby+"']//span[text()='"+FilterName+"']//following::input[1]")); //Unique xpath Of Filter TextBox On RMA Application System Users UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Img_RowSelector
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Row Selector On RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, UserName		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                          
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
	//FunctionName 			: RMAApp_SystemUsers_Img_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ID of Ok Image On RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                          
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Img_Ok(WebDriver driver)
	{
		Element = null;
		Element =driver.findElement(By.id("complete")); //Unique ID of Ok Image On RMA Application System Users UX Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Img_UsersIcon
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ID of User(s) Icon Image On RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-04-2017                                          
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Img_UsersIcon(WebDriver driver)
	{
		Element = null;
		Element =driver.findElement(By.id("usericon")); //Unique ID of User(s) Icon Image On RMA Application System Users UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Img_GroupIcon
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ID of User(s) Icon Image On RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-029-2018                                        
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Img_GroupIcon(WebDriver driver)
	{
		Element = null;
		Element =driver.findElement(By.id("gropuicon")); //Unique ID of User(s) Icon Image On RMA Application System Users UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SystemUsers_Txt_GroupFilter
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter TextBox RMA Application System Users UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-19-2017                                      
	//============================================================================================
	public static WebElement RMAApp_SystemUsers_Txt_GroupFilter(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Group Name')]/ancestor::div[2]/div[3]/div[1]/div[1]/input")); //Unique xpath Of Filter TextBox On RMA Application System Users UX Page Is Fetched
		return Element;
	}

}