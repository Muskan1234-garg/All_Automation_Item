package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_OSHA {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_OSHA_Chk_EventOSHARecordable
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Event OSHA Recordable Check Box On RMA Application OSHA  Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-08-2017                                 
// ============================================================================================
public static WebElement RMAApp_OSHA_Chk_EventOSHARecordable(WebDriver driver)
{
	Element = driver.findElement(By.id("recordableflag")); //Unique Id Of Event OSHA Recordable Check Box On RMA Application OSHA  Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_OSHA_Chk_PrivacyCase
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Privacy Case Check Box On RMA Application OSHA  Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-08-2017                                 
//============================================================================================
public static WebElement RMAApp_OSHA_Chk_PrivacyCase(WebDriver driver)
{
	Element = driver.findElement(By.id("privacycaseflag")); //Unique Id Of Privacy Case Check Box On RMA Application OSHA  Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_OSHA_Txt_SafeguardsProvided
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Safeguards Provided TextBox On RMA Application OSHA Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-08-2017                                   
//============================================================================================
public static WebElement RMAApp_OSHA_Txt_SafeguardsProvided(WebDriver driver)
{
	Element = driver.findElement(By.id("safeguardflag_codelookup")); //Unique Id Of Safeguards Provided TextBox On RMA Application OSHA Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_OSHA_Txt_FailureToUseSafeguards
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Failure To Use Safeguards TextBox On RMA Application OSHA Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-08-2017                                   
//============================================================================================
public static WebElement RMAApp_OSHA_Txt_FailureToUseSafeguards(WebDriver driver)
{
	Element = driver.findElement(By.id("safegnotusedflag_codelookup")); //Unique Id Of Failure To Use Safeguards TextBox On RMA Application OSHA Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_OSHA_Txt_FailureToFollowRules
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Failure to Follow Rules TextBox On RMA Application OSHA Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-08-2017                                   
//============================================================================================
public static WebElement RMAApp_OSHA_Txt_FailureToFollowRules(WebDriver driver)
{
	Element = driver.findElement(By.id("norulesflag_codelookup")); //Unique Id Of Failure to Follow Rules TextBox On RMA Application OSHA Page Is Fetched
	return Element;
}
}
