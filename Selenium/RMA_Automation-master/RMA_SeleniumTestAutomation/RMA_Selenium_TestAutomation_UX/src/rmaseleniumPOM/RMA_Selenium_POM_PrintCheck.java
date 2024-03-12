package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PrintCheck {
public static WebElement Element = null;
	
	
//============================================================================================
//FunctionName 			: RMAApp_Print_Btn_Check
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Button On RMA Application Print Check Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-06-2016                                    
//============================================================================================
public static WebElement RMAApp_Print_Btn_Check(WebDriver driver)
{
	Element = driver.findElement(By.id("Ok")); //Unique Id Of Print Button On RMA Application Print Check Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_Print_Btn_Check
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On RMA Application Print Check Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-19-2017                                   
//============================================================================================
public static WebElement RMAApp_Print_Btn_Cancel(WebDriver driver)
{
	Element = driver.findElement(By.id("Cancel")); //Unique Id Of Cancel Button On RMA Application Print Check Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_Print_Btn_Check
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Preview Button On RMA Application Print Check Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-01-19-2017                                   
//============================================================================================
public static WebElement RMAApp_Print_Btn_PrintPreview(WebDriver driver)
{
	Element = driver.findElement(By.id("Ok")); //Unique Id Of Print Preview Button On RMA Application Print Check Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_Print_Btn_OK
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On RMA Application Print Check Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-06-2016                                    
//============================================================================================
public static WebElement RMAApp_Print_Btn_OK(WebDriver driver)
{
	Element = driver.findElement(By.id("btnOk")); //Unique Id Of OK Button On RMA Application Print Check Page Is Fetched
	return Element;	
}
//============================================================================================
//FunctionName 			: RMAApp_Print_Btn_OK
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On RMA Application Print Check Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-07-06-2016                                    
//============================================================================================
public static WebElement RMAApp_Print_Lnk_Check(WebDriver driver)
{
	Element = driver.findElement(By.id("PrintCheck")); //Unique Id Of OK Button On RMA Application Print Check Page Is Fetched
	return Element;	
}

}
