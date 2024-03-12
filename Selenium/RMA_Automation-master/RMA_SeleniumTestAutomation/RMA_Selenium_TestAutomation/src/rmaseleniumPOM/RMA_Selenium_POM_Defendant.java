package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Defendant {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_Defendant_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_Defendant_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("deflastname")); //Unique Id Last Name Text Box On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}


//============================================================================================
//FunctionName 			: RMAApp_Defendant_Btn_AddNew
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Btn_AddNew(WebDriver driver)
{
	Element = driver.findElement(By.id("cmdKeep4")); //Unique Id Of Add New Button On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Btn_LastNameLookupButton
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Which Defendant LastNameLookup Button On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-07-01-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Btn_LastNameLookupButton(WebDriver driver)
{
	Element = driver.findElement(By.id("deflastnamebtn")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Btn_Edit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Which Edit Button On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-07-01-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Btn_Edit(WebDriver driver)
{
	Element = driver.findElement(By.id("cmdEdit2")); 
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Btn_DefendantHistory
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Defendant History Button On RMA Application Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-19-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Btn_DefendantHistory(WebDriver driver)
{
	Element = driver.findElement(By.id("btnClaimHistory")); //Unique Id Of Defendant History Button On RMA Application Defendant Page Is Fetched
		return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Tbl_DefendantHistory
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim INvolvement History Table On RMA Application Defendant History Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-19-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Tbl_DefendantHistory(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//html/body/div[2]/table")); //Unique Id Of Claim INvolvement History Table On RMA Application Defendant History Page Is Fetched
		return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Lnk_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Lnk_Supplementals(WebDriver driver)
{
	Element = driver.findElement(By.linkText("Supplementals")); //Unique Id Of Supplemental Link On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Lnk_DefendantInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DefendantInfo Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Lnk_DefendantInfo(WebDriver driver)
{
	Element = driver.findElement(By.linkText("Defendant Info")); //Unique Id Of DefendantInfo Link On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Defendant_Lnk_DefendantAttorney
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DefendantAttorney Link On RMA Application Claim's Defendant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Defendant_Lnk_DefendantAttorney(WebDriver driver)
{
	Element = driver.findElement(By.linkText("Defendant Attorney")); //Unique Id Of DefendantAttorney Link On RMA Application Claim's Defendant Page Is Fetched
	return Element;
}
}
