package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Catastrophe {

	public static WebElement Element = null;
	
	
	public static WebElement RMAApp_Catastrophe_Txt_Loss_Start_Date(WebDriver driver)
	{
		
		Element = driver.findElement(By.xpath(".//*[@id='lossstartdate' and @type ='text']"));
		return Element;
	}
	
	public static WebElement RMAApp_Catastrophe_Type(WebDriver driver)
	{
		
		Element = driver.findElement(By.id("btn_typeofcat_openlookup")); 
		return Element;
		
	}
	
	public static WebElement RMAApp_Catastrophe_Number(WebDriver driver)
	{
		
		Element = driver.findElement(By.id("catastrophenumber")); 
		return Element;
		
	}
	public static WebElement RMAApp_Catastrophe_Loss_End_Date(WebDriver driver)
	{
		
		Element = driver.findElement(By.id("lossenddate")); 
		return Element;
		
	}
	
	public static WebElement RMAApp_Catastrophe_Button_County(WebDriver driver)
	{
		
		Element = driver.findElement(By.id("btn_county")); 
		return Element;
		
	}
	
	public static WebElement RMAApp_Catastrophe_Button_Country(WebDriver driver)
	{
		
		Element = driver.findElement(By.id("btn_countrycode_openlookup")); 
		return Element;
		
	}
	
	public static WebElement RMAApp_Catastrophe_States(WebDriver driver)
	{		
		Element = driver.findElement(By.id("btn_states")); 
		return Element;
	}
	
	public static WebElement RMAApp_Catastrophe_CauseOfLoss(WebDriver driver)
	{
		
		Element = driver.findElement(By.id("btn_causeofloss")); 
		return Element;
		
	}
	public static WebElement RMAApp_Catastrophe_AttachCatastrophe_Yes(WebDriver driver)
	{
		Element= driver.findElement(By.xpath(".//*[@id='r1']"));
		return Element;
	}
	
	public static WebElement RMAApp_MaintCatastrophe_Txt_CatNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='1589439852413-6-uiGrid-0038-cell']/div/span")); //Unique Id Of Cat Number TextBox On Lookup Window TextBox On Maintenance -->Catastrophe Page Is Fetched
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_YesRadioButton(WebDriver driver)
	{
		Element = null;
		Element= driver.findElement(By.xpath(".//*[@id='r1']"));
		return Element;
	}
	
	public static WebElement RMAApp_Catastrophe_NoRadioButton(WebDriver driver)
	{
		Element = null;
		Element= driver.findElement(By.xpath(".//*[@id='r2']"));
		return Element;
	}
	
	public static WebElement RMAApp_Catastrophe_NotKnownRadioButton(WebDriver driver)
	{
		Element = null;
		Element= driver.findElement(By.xpath(".//*[@id='r3']"));
		return Element;
	}
	
	public static WebElement RMAApp_Catastrophe_RecordSelectionRadioButton(WebDriver driver)
	{
		Element =null;
		Element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/table/tbody[2]/tr/td[1]/input"));
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_SaveBtn(WebDriver driver)
	{
		Element =null;
		Element=driver.findElement(By.xpath(".//*[@id='btnRoll']/i"));
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_LossLocation(WebDriver driver)
	{
		Element=null;
		Element=driver.findElement(By.xpath(".//*[@id='losslocation']/div/span/button/i"));
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_LossLocation_FreeText(WebDriver driver)
	{
		Element=null;
		Element=driver.findElement(By.xpath(".//*[@id='newTextComments']"));
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_Comments(WebDriver driver)
	{
		Element=null;
		Element=driver.findElement(By.xpath(".//*[@id='comments']/div/span/button"));
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_Comments_FreeText(WebDriver driver)
	{
		Element=null;
		Element=driver.findElement(By.xpath(".//*[@id='newTextComments']"));
		return Element;
	}
	public static WebElement RMAApp_Catastrophe_Comments_FreeText_OkButton(WebDriver driver)
	{
		Element=null;
		Element=driver.findElement(By.xpath(".//*[@id='usericon']/i"));
		return Element;
	}

}




