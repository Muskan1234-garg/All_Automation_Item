package rmaseleniumPOM_UX;

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
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
// ============================================================================================
public static WebElement RMAApp_Arbitration_Txt_Type(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='arbtypecode']/p/span/input")); //Unique Id Of Type Text Box On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Txt_ClaimNumber
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber Text Box On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Arbitration_Txt_ClaimNumber(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("arbclaimnum")); //Unique Id Of ClaimNumber Text Box On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Btn_TypeSearch
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Search Button On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                
//============================================================================================
public static WebElement RMAApp_Arbitration_Btn_TypeSearch(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.name("btn_arbtypecode")); //Unique Id Of Type Search Button On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

///============================================================================================
//FunctionName 			: RMAApp_Arbitration_Tab_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                      
//============================================================================================
public static WebElement RMAApp_Arbitration_Tab_Supplementals(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-Path Of Supplemental Tab On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Arbitration_Tab_ArbitrationInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ArbitrationInfo Tab On RMA Application Claim's Arbitration Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                              
//============================================================================================
public static WebElement RMAApp_Arbitration_Tab_ArbitrationInfo(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Arbitration Info')]/i")); //Unique  X-Path Of ArbitrationInfo Tab On RMA Application Claim's Arbitration Page Is Fetched
	return Element;
}
}