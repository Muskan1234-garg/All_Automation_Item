package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Arbitration {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Txt_Type
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Text Box On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_Arbitration_Txt_Type(WebDriver driver)
{
	Element = driver.findElement(By.id("arbtypecode_codelookup")); //Unique Id Of Type Text Box On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Btn_TypeSearch
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Search Button On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-01-2016                                 
//============================================================================================
public static WebElement RMAApp_Arbitration_Btn_TypeSearch(WebDriver driver)
{
	Element = driver.findElement(By.id("arbtypecode_codelookupbtn")); //Unique Id Of Type Search Button On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Lnk_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Arbitration_Lnk_Supplementals(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSsuppgroup")); //Unique Id Of Supplemental Link On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Lnk_ArbitrationInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ArbitrationInfo Link On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Arbitration_Lnk_ArbitrationInfo(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSarbitrationinfo")); //Unique Id Of ArbitrationInfo Link On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}
}