package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_TransactionHistory {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	

//============================================================================================
//FunctionName 			: RMAApp_TransHistory_Tbl_TransactionHistory
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transaction History Table On Transaction History Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-15-2016                                 
//============================================================================================
public static WebElement RMAApp_TransHistory_Tbl_TransactionHistory(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='grdPaymentHistory_ctl00']")); //Unique Id Of Transaction History Table On Transaction History Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_TransHistory_Btn_BackToFinanacials
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Financial Button On RMA Application Payments Related Page Like Payments History Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-15-2016                                 
//============================================================================================
public static WebElement RMAApp_TransHistory_Btn_BackToFinanacials(WebDriver driver)
{
	Element = driver.findElement(By.id("btnBackToFinancials")); //Unique Id Of Back To Financial Button On RMA Application Payments Related Page Like Payments History Is Fetched
	return Element;
}
}