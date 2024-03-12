package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Subrogation {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Txt_Type
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Type Text Box On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
// ============================================================================================
public static WebElement RMAApp_Subrogation_Txt_Type(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='subtypecode']/p/span/input")); //Unique Id Of Type Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Txt_Status
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Status Text Box On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Txt_Status(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='substatuscode']/p/span/input")); //Unique Id Of Status Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Txt_Date
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Text Box On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Txt_Date(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='statusdate' and@ type='text']"));//Unique X-Path Of Date Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Btn_TypeLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subrogation Type LookUp Image Button On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement  RMAApp_Subrogation_Btn_TypeLookUp(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.name("btn_subtypecode")); //Unique Id Of Subrogation Type LookUp Image Button On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Btn_StatusLookUp
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subrogation StatusLookUp Image Button On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement  RMAApp_Subrogation_Btn_StatusLookUp(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.name("btn_substatuscode")); //Unique Id Of Subrogation StatusLookUp Image Button On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Txt_NumberOfYears
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Number Of Years Text Box On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Txt_NumberOfYears(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("nbofyears")); //Unique Id Of Number Of Years Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Tab_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Tab_Supplementals(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-Path Of Supplementals Tab On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Tab_SubrogationInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SubrogationInfo Tab On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Tab_SubrogationInfo(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Subrogation Info')]/i")); //Unique X-Path Of SubrogationInfo Tab On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Tab_Subrogation Financial
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subrogation Financial Tab On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-06-2017                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Tab_SubrogationFinancial(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Subrogation Financial')]/i")); //Unique X-Path Of Subrogation Financial Tab On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}
}