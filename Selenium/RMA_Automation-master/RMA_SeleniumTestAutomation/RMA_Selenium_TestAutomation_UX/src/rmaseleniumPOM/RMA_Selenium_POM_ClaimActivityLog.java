package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_ClaimActivityLog {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_ClmActLog_Txt_ClmActLogFilter
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Activity Log NGGrid Filter TextBoxes On RMA Application Claim Activity Log Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-30-2016                                
// ============================================================================================
public static WebElement RMAApp_ClmActLog_Txt_ClmActLogFilter(WebDriver driver, int col)
{
	Element = driver.findElement(By.xpath(".//*[@id='divActLogGrid']/div[1]/div[2]/div/div["+col+"]/div[2]/input")); //Unique Id Of Claim Activity Log NGGrid Filter TextBoxes On RMA Application Claim Activity Log Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_ClmActLog_Grd_ClmActLog
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Activity Log NGGrid Rows (After Filtering The Rows) On RMA Application Claim Activity Log Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-30-2016                                
//============================================================================================
public static WebElement RMAApp_ClmActLog_Grd_ClmActLog(WebDriver driver, int col)
{
	Element = driver.findElement(By.xpath(".//*[@id='divActLogGrid']/div[2]/div/div/div["+col+"]/div[2]/div/span")); //Unique Id Of Claim Activity Log NGGrid Rows (After Filtering The Rows) On RMA Application Claim Activity Log Page Is Fetched
	return Element;
}
}