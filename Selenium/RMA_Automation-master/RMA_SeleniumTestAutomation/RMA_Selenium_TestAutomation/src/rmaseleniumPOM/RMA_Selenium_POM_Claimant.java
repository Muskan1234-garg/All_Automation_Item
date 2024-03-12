package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Claimant {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_Claimant_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_Claimant_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("clmntlastname")); //Unique Id Last Name Text Box On RMA Application Claim's Claimant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Btn_AddNew
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Btn_AddNew(WebDriver driver)
{
	Element = driver.findElement(By.id("cmdKeep4")); //Unique Id Add New Button On RMA Application Claim's Claimant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Btn_LastNameSearch
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Search Button On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Btn_LastNameSearch(WebDriver driver)
{
	Element = driver.findElement(By.id("clmntlastnamebtn")); //Unique Id Of Last Name Search Button On RMA Application Claim's Claimant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Btn_Edit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Button On RMA Application Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-29-2016                                 
// ============================================================================================
public static WebElement RMAApp_Claimant_Btn_Edit(WebDriver driver)
{
	Element = driver.findElement(By.id("cmdEdit2")); //Unique Id  Of Edit Button On RMA Application Claimant Page Is Fetched
		return Element;
	}
	
//============================================================================================
//FunctionName 			: RMAApp_Claimant_Lnk_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Lnk_Supplementals(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSclmntattorney")); //Unique Id Of Supplemental Link On RMA Application Claim's Claimant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Lnk_ClaimantInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimantInfo Link On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Lnk_ClaimantInfo(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSclmntinfo")); //Unique Id Of ClaimantInfo Link On RMA Application Claim's Claimant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Lnk_ClaimantAttorney
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimantAttorney Link On RMA Application Claim's Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Lnk_ClaimantAttorney(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSclmntattorney")); //Unique Id Of ClaimantAttorney Link On RMA Application Claim's Claimant Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Btn_ClaimantHistory
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant History Button On RMA Application Claimant Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-19-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Btn_ClaimantHistory(WebDriver driver)
{
	Element = driver.findElement(By.id("btnClaimHistory")); //Unique Id Of Claimant History Button On RMA Application Claimant Page Is Fetched
		return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Claimant_Tbl_ClaimantHistory
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant History Table On RMA Application Claimant History Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-19-2016                                 
//============================================================================================
public static WebElement RMAApp_Claimant_Tbl_ClaimantHistory(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//div[2]/table")); //Unique Id Of Claimant History Table On RMA Application Claimant History Page Is Fetched
		return Element;
}

}
