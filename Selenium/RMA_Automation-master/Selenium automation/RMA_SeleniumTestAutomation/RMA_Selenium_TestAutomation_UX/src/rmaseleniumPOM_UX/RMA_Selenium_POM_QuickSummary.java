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
}
