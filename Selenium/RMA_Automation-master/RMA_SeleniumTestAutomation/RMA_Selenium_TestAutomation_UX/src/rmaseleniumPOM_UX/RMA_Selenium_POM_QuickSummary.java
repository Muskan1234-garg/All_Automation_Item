package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_QuickSummary {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_QuickSummary_Tbl_QuickSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Quick Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-29-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_QuickSummary_Tbl_QuickSummary(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//table")); //Unique Id Of Quick Summary Table On RMA Application Quick Summary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QuickSummary_Btn_ExpandCollapse
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Quick Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-22-2019                                 
	//============================================================================================
	public static WebElement RMAApp_QuickSummary_Btn_ExpandCollapse(WebDriver driver, String LinkName)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+LinkName+"')]/preceding::i[2]")); //Unique Id Of Quick Summary Table On RMA Application Quick Summary Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_QuickSummary_Tbl_CurrentFinancials
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Quick Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_QuickSummary_Tbl_CurrentFinancials(WebDriver driver, int RowNumber)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(@class,'table table-hover filterPadd ng-scope')]/tbody["+RowNumber+"]")); //Unique Id Of Quick Summary Table On RMA Application Quick Summary Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_QuickSummary_Tbl_CurrentFinancialsLastTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Quick Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_QuickSummary_Tbl_CurrentFinancialsLastTable(WebDriver driver)
	{	
		Element = null;
		List<WebElement> list = driver.findElements(By.xpath(".//*[contains(@class,'table table-hover filterPadd ng-scope')]/tbody")); //Unique Id Of Quick Summary Table On RMA Application Quick Summary Page Is Fetched
		Element = list.get(list.size()-2);
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_QuickSummary_Btn_Reload
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Quick Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-07-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_QuickSummary_Btn_Reload(WebDriver driver)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-click='main.reloadSumm($event)']")); //Unique Id Of Quick Summary Table On RMA Application Quick Summary Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_QuickSummary_Tbl_CurrentFinancialsReservesType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Table On RMA Application Quick Summary Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-10-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_QuickSummary_Tbl_CurrentFinancialsReservesType(WebDriver driver, String ReserveType)
	{	
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ReserveType+"')]//ancestor::tbody[1]")); //Unique Id Of Quick Summary Table On RMA Application Quick Summary Page Is Fetched
		return Element;
	}
}
