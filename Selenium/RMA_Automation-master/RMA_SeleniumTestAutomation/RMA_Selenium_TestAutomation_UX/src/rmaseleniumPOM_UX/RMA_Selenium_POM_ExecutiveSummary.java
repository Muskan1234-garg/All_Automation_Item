package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_ExecutiveSummary {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_ExeSummary_Lbl_Tab
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Different Tabs On Executive Summary Configurations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-31-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ExeSummary_Lbl_Tab(WebDriver driver, String TabName)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='custom ng-binding' and contains(text(),'"+TabName+"')]")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ExeSummary_Btn_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Image Button On Executive Summary Configurations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-31-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ExeSummary_Btn_SelectAll(WebDriver driver)
	{	
		Element = null;
		Element = driver.findElement(By.id("btn_selectAll")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ExeSummary_Btn_DeSelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Un-Select All Image Button On Executive Summary Configurations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-31-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ExeSummary_Btn_DeSelectAll(WebDriver driver)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Unselect All']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ExeSummary_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image Button On Executive Summary Configurations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-31-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ExeSummary_Btn_Save(WebDriver driver)
	{	
		Element = null;
		Element = driver.findElement(By.id("btn_save")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_ExeSummary_Chk_Entities
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Different Entities Checkboxes On Executive Summary Configurations Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-31-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_ExeSummary_Chk_Entities(WebDriver driver, String CheckBoxLabel)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@class,'tab-pane showTab')]//*[normalize-space(text())='"+CheckBoxLabel+"']//ancestor::div[1]/input")); 
		return Element;
	}
}
