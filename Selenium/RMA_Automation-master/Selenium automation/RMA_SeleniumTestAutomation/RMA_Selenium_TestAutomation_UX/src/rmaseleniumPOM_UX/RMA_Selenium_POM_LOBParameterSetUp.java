package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_LOBParameterSetUp
{
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_LOBParaSetup_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application LOB Parameter SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-07-21-2017                                 
	//============================================================================================
	public static WebElement RMAApp_LOBParaSetup_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("Save")); 
		return Element;
	} 
}
