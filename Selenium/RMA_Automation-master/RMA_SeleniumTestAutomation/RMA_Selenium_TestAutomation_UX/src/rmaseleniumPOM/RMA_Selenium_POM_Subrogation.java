package rmaseleniumPOM;

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
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_Subrogation_Txt_Type(WebDriver driver)
{
	Element = driver.findElement(By.id("subtypecode_codelookup")); //Unique Id Of Type Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Txt_Status
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Status Text Box On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Txt_Status(WebDriver driver)
{
	Element = driver.findElement(By.id("substatuscode_codelookup")); //Unique Id Of Status Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Txt_Date
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Text Box On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Txt_Date(WebDriver driver)
{
	Element = driver.findElement(By.id("statusdate")); //Unique Id Of Date Text Box On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Lnk_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Lnk_Supplementals(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSsuppgroup")); //Unique Id Of Supplemental Link On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Lnk_SubrogationInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SubrogationInfo Link On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Lnk_SubrogationInfo(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSsibrogationinfo")); //Unique Id Of SubrogationInfo Link On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Subrogation_Lnk_Subrogation Financial
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Subrogation Financial Link On RMA Application Claim's Subrogation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Subrogation_Lnk_SubrogationFinancial(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSsubrogationfinancial")); //Unique Id Of Subrogation Financial Link On RMA Application Claim's Subrogation Page Is Fetched
	return Element;
}
}