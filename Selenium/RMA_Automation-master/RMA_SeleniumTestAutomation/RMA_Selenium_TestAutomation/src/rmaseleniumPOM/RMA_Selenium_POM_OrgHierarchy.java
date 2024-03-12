package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_OrgHierarchy {
public static WebElement Element = null;
	
	
//============================================================================================
//FunctionName 			: RMAApp_OrgHierarchy_Lst_SearchSpecificLevel
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Specific Level On RMA Application Orgnisation Hierarchy Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_OrgHierarchy_Lst_SearchSpecificLevel(WebDriver driver)
{
	Element = driver.findElement(By.id("OrgSearch_cmb_slevel")); //Unique Id Of Policy Name On RMA Application Orgnisation Hierarchy Page Is Fetched
	return Element;	
}

//============================================================================================
//FunctionName 			: RMAApp_OrgHierarchy_Txt_OrgHierarchyStatus
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PolicyStatus On RMA Application Orgnisation Hierarchy Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-09-30-2016                                    
//============================================================================================
public static WebElement RMAApp_OrgHierarchy_Lst_DefaultExpLevel(WebDriver driver)
{
	Element = driver.findElement(By.id("OT_cmb_dlevel")); //Unique Id Of Default Expansion Level On RMA Application Orgnisation Hierarchy Page Is Fetched
	return Element;	
}



}
