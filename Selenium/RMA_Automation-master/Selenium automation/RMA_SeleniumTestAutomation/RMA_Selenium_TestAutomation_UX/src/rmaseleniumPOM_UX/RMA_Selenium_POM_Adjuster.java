package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Adjuster {
public static WebElement Element = null;

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Adjuster Last Name On RMA Application Adjuster Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-02-2017                                 
// ============================================================================================
public static WebElement RMAApp_Adjuster_Txt_LastName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='adjlastname']/div/span/p/input")); //Unique Id  Of  Adjuster Last Name On RMA Application Adjuster Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Adjuster First Name On RMA Application Adjuster Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-02-2017                                 
//============================================================================================
public static WebElement RMAApp_Adjuster_Txt_FirstName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("adjfirstname")); //Unique Id  Of Adjuster First Name On RMA Application Adjuster Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Txt_MiddleName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Adjuster Middle Name On RMA Application Adjuster Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-02-2017                                 
//============================================================================================
public static WebElement RMAApp_Adjuster_Txt_MiddleName(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("adjmiddlename")); //Unique Id  Of Adjuster Middle Name On RMA Application Adjuster Creation Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Tab_Supplementals
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On RMA Application Claim's Adjuster Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-02-2017                                
//============================================================================================
public static WebElement RMAApp_Adjuster_Tab_Supplementals(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-path Of Supplemental Tab On RMA Application Claim's Adjuster Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Tab_ClaimAdjusterInfo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Adjuster Information Tab On RMA Application Claim's Adjuster Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-02-2017                                
//============================================================================================
public static WebElement RMAApp_Adjuster_Tab_ClaimAdjusterInfo(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[contains(text(),'Claim Adjuster Information')]/i")); //Unique X-path Of Claim Adjuster Information Tab On RMA Application Claim's Adjuster Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Lnk_ClaimRightHandTree
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Adjuster Information Link On RMA Application Claim's Adjuster Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-02-2017                                
//============================================================================================
public static WebElement RMAApp_Adjuster_Lnk_ClaimRightHandTree(WebDriver driver, String AdjName)
{
	Element = null;
	try{
	Element = driver.findElement(By.xpath(".//*[contains(text(),'"+AdjName+"')and @class='rightPanel-alink ng-binding']")); //Unique X-path Of Claim Adjuster Information Link On RMA Application Claim's Adjuster Page Is Fetched
	}catch(Exception|Error e){
	}
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Adjuster_Txt_Addr1
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addr1 Text Box On RMA Application Adjuster Creation Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-28-2017                                 
//============================================================================================
public static WebElement RMAApp_Adjuster_Txt_Addr1(WebDriver driver)
{
	Element = null;
	Element = driver.findElement(By.id("adjaddr1")); //Unique Id  Of Addr1 Text Box On RMA Application Adjuster Creation Page Is Fetched
	return Element;
}
}

