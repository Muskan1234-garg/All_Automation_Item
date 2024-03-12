package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Expert {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Expert_Txt_ExpertLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Textbox On RMA Application Expert Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Expert_Txt_ExpertLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_expertlastname']")); //Unique Id  Of Last Name TextBox On RMA Application Expert Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Expert_Txt_ExpertFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Name TextBOx On RMA Application Expert Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-02-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Expert_Txt_ExpertFirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='expertfirstname']")); //Unique Id  Of First Name TextBox On RMA Application Expert Creation Page Is Fetched
		return Element;
	}
}
