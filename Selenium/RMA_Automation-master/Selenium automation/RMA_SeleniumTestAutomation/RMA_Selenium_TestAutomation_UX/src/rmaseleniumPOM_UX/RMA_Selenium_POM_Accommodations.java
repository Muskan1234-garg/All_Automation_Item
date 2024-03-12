package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Accommodations {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Btn_AccommStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Status Lookup Button On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Btn_AccommStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_accommstatus']")); //Unique Id  Of  Accomm. Status Lookup Button On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_AccommStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Status TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_AccommStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accommstatus']")); //Unique Id  Of  Accomm. Status TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Btn_AccommScope
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Scope Lookup Button On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Btn_AccommScope(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_accommscope']")); //Unique Id  Of  Accomm. Scope Lookup Button On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_AccommScope
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Scope TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_AccommScope(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accommscope']")); //Unique Id  Of  Accomm. Scope TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Btn_AccommType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Type Lookup Button On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Btn_AccommType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_accommtype']")); //Unique Id  Of  Accomm. Type Lookup Button On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_AccommType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Type TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_AccommType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accommtype']")); //Unique Id  Of  Accomm. Type TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Btn_Position
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Position Lookup Button On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Btn_Position(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_accommposition']")); //Unique Id  Of  Position Lookup Button On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_Position
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Position TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_Position(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accommposition']")); //Unique Id  Of  Position TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Btn_Jobclassification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Job Classification Lookup Button On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Btn_Jobclassification(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_jobclasscode']")); //Unique Id  Of Job Classification Lookup Button On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_Jobclassification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Job Classification TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_Jobclassification(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_jobclasscode']")); //Unique Id  Of Job Classification TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_AccommRequested
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Requested TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_AccommRequested(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='accommrequested' and @type='text']")); //Unique Id  Of Accomm. Requested TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_AccommOffered
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Offered TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_AccommOffered(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='accommoffered' and @type='text']")); //Unique Id  Of Accomm. Offered TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_AccommAccepted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accomm. Accepted TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_AccommAccepted(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='accommaccepted' and @type='text']")); //Unique Id  Of Accomm. Accepted TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Btn_Department
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department Lookup Button On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Btn_Department(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='accommdepartment']/p/span/button")); //Unique Id  Of Department Lookup Button On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Accomodations_Txt_Department
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Department TextBox On RMA Application Accommodations Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-04-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Accomodations_Txt_Department(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_accommdepartment']")); //Unique Id  Of Department TextBox On RMA Application Accommodations Creation Page Is Fetched
		return Element;
	}
}
