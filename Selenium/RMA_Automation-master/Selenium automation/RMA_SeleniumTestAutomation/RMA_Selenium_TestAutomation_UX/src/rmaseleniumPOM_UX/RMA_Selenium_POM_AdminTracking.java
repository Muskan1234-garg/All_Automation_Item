package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_AdminTracking {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Lst_Table
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table Element On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Lst_Table(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Bond Abstract')]"));//Unique Id  Of Table Element On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Btn_BondType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bond Type Image Lookup Button On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Btn_BondType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_bond_type_txcd']"));//Unique Id  Of Bond Type Image Lookup Button On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Txt_BondType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bond Type TextBox On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Txt_BondType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_bond_type_txcd']"));//Unique Id  Of Bond Type TextBox On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Txt_BondNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bond Number TextBox On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Txt_BondNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bond_num_text']"));//Unique Id  Of Bond Number TextBox On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}
}
