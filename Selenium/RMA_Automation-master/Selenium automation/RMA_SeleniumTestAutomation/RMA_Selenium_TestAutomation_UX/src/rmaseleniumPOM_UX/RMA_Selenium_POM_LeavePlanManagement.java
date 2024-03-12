package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_LeavePlanManagement {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Code TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2018                               
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='plancode']")); //Unique Id  Of  Plan Code TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='planname']")); //Unique Id  Of  Plan Name TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Date TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_EffectiveDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='effectivedate']")); //Unique Id  Of Effective Date TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expiration Date TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_ExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate']")); //Unique Id  Of Expiration Date TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_DefaultHours
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default Hours Per Week TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_DefaultHours(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='defaulthours']")); //Unique Id  Of Default Hours Per Week TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Txt_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Status TextBox On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Txt_PlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='planstatus_codelookup']")); //Unique Id  Of Plan Status TextBox On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeavePlanManagement_Btn_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Status Image Lookup Button On RMA Application Leave Plan Management Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_LeavePlanManagement_Btn_PlanStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='planstatus_codelookupbtn']")); //Unique Id  Of Plan Status Image Lookup Button On RMA Application Leave Plan Management Creation Page Is Fetched
		return Element;
	}
}
