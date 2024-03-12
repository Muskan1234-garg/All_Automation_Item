package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DE_Selenium_POM_CMS_DSMC {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_System
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which System TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_System(WebDriver driver)
	{
		Element = driver.findElement(By.id("_id2:logon:CMS")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_Username
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Username TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_Username(WebDriver driver)
	{
		Element = driver.findElement(By.id("_id2:logon:USERNAME")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_Password
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Password TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_Password(WebDriver driver)
	{
		Element = driver.findElement(By.id("_id2:logon:PASSWORD")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_Authentication
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Authentication TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_Authentication(WebDriver driver)
	{
		Element = driver.findElement(By.id("_id2:logon:AUTH_TYPE")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Btn_LogOn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LogOn Button On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Btn_LogOn(WebDriver driver)
	{
		Element = driver.findElement(By.id("_id2:logon:logonButton")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_NavSelect
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Navigation Drop Down On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_NavSelect(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='navSelect']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Btn_ConfigureNewDataRepository
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Configure New Data Repository Button On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Btn_ConfigureNewDataRepository(WebDriver driver)
	{
		Element = driver.findElement(By.id("IconImg_UniversalRepositoryExplorer_toolbarItem1_0")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_RepoName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Repository Name Textbox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_RepoName(WebDriver driver)
	{
		Element = driver.findElement(By.name("_id2:_id11:0:_id15")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_DatabaseType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Database Type Drop-Down On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_DatabaseType(WebDriver driver)
	{
		Element = driver.findElement(By.name("_id2:_id11:2:_id23")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_DatabaseServerName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Database Server Name TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_DatabaseServerName(WebDriver driver)
	{
		Element = driver.findElement(By.name("_id2:_id11:3:_id17")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_RepoUserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Username TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_RepoUserName(WebDriver driver)
	{
		Element = driver.findElement(By.name("_id2:_id11:7:_id17")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_RepoPassword
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Password TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_RepoPassword(WebDriver driver)
	{
		Element = driver.findElement(By.name("_id2:_id11:8:_id18")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Txt_DatabaseName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Database Name TextBox On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Txt_DatabaseName(WebDriver driver)
	{
		Element = driver.findElement(By.name("_id2:_id11:5:_id17")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Btn_TestConnection
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Test Connection Button On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Btn_TestConnection(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@value='Test Connection']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_CMS_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On CMS Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_CMS_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@value='Save']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Txt_SystemName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which System Name TextBox On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Txt_SystemName(WebDriver driver)
	{
		Element = driver.findElement(By.id("apsTextEdit")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Txt_UserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserName TextBox On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Txt_UserName(WebDriver driver)
	{
		Element = driver.findElement(By.id("usernameTextEdit")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Txt_Password
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Password TextBox On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Txt_Password(WebDriver driver)
	{
		Element = driver.findElement(By.id("passwordTextEdit")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Txt_Authentication
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Authentication DropDown On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Txt_Authentication(WebDriver driver)
	{
		Element = driver.findElement(By.id("authenticationSelectBox")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Btn_LogOn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LogOn Button On DSMC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Btn_LogOn(WebDriver driver)
	{
		Element = driver.findElement(By.name("formAction")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Txt_ActionList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Action List DropDown On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Txt_ActionList(WebDriver driver)
	{
		Element = driver.findElement(By.name("actionList")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Btn_Apply
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Button On DSMC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Btn_Apply(WebDriver driver)
	{
		Element = driver.findElement(By.name("ACTION_REQUEST")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Txt_Repository
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Repository DropDown On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Txt_Repository(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='buttonbar']/select")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: DE_DSMC_Chk_JobName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Job Name CheckBox On DMSC Login Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-01-2019                                 
	// ============================================================================================
	public static WebElement DE_DSMC_Chk_JobName(WebDriver driver, String JobName)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+JobName+"')]//ancestor::tr[1]//input")); 
		return Element;
	}
	
}
