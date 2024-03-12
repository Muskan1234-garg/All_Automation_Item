package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_ISO {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	
//============================================================================================
//FunctionName 			: RMAApp_ISO_Chk_SubmitToISO
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit To ISO Check Box On RMA Application ISO Submission Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
// ============================================================================================
public static WebElement RMAApp_ISO_Chk_SubmitToISO(WebDriver driver)
{
	Element = driver.findElement(By.id("chkSubmitToISOFlag")); //Unique Id Of Submit To ISO Check Box On RMA Application ISO Submission Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_ISO_Img_Save
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Image On RMA Application ISO Submission Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-06-20-2016                                 
//============================================================================================
public static WebElement RMAApp_ISO_Img_Save(WebDriver driver)
{
	Element = driver.findElement(By.id("Save")); //Unique Id Of Save Image On RMA Application ISO Submission Page Is Fetched
	return Element;
}
}
