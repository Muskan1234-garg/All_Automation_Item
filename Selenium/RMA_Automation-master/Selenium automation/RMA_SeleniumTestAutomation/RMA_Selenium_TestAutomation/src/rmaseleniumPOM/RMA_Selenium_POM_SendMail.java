package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_SendMail {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_To
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Text Box On RMA Application Claim's Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-02-2016                                 
// ============================================================================================
public static WebElement RMAApp_SendMail_Txt_To(WebDriver driver)
{
	Element = driver.findElement(By.id("emailidto")); //Unique Id Of To Text Box On RMA Application Claim's Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_CC
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CC Text Box On RMA Application Claim's Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-02-2016                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Txt_CC(WebDriver driver)
{
	Element = driver.findElement(By.id("emailidcc")); //Unique Id Of CC Text Box On RMA Application Claim's Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Txt_Body
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Body Text Box On RMA Application Claim's Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-02-2016                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Txt_Body(WebDriver driver)
{
	Element = driver.findElement(By.id("body")); //Unique Id Of Body Text Box On RMA Application Claim's Send Mail Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_SendMail_Btn_Send
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Send Button On RMA Application Claim's Send Mail Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-08-02-2016                                 
//============================================================================================
public static WebElement RMAApp_SendMail_Btn_Send(WebDriver driver)
{
	Element = driver.findElement(By.id("btnEmail")); //Unique Id Of Send Button On RMA Application Claim's Send Mail Page Is Fetched
	return Element;
}

}