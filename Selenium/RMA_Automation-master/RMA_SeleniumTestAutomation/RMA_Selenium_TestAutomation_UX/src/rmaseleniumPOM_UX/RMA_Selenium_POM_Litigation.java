package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Litigation {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_DocketNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation DocketNumber On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Litigation_Txt_DocketNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("docketnumber")); //Unique Id  Of  Litigation DocketNumber On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_JudgeLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Judge LastName On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_JudgeLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='judgelastname']/div/span/p/input")); //Unique Id  Of Litigation Judge LastName On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_AttorneyLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Attorney LastName On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_AttorneyLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='litattlastname']/div/span/p/input")); //Unique Id  Of Litigation Attorney LastName On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_MatterName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Matter Name On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_MatterName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("mattername")); //Unique Id  Of Litigation Matter Name On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_JudgeFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Judge FirstName On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_JudgeFirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("judgefirstname")); //Unique Id  Of Litigation Judge FirstName On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                
	//============================================================================================
	public static WebElement RMAApp_Litigation_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-path Of Supplemental Tab On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Tab_LitigationInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Information Tab On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                
	//============================================================================================
	public static WebElement RMAApp_Litigation_Tab_LitigationInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Litigation Info')]/i")); //Unique X-path Of Litigation Information Tab On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Tab_MatterInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation MatterInfo Tab On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                
	//============================================================================================
	public static WebElement RMAApp_Litigation_Tab_MatterInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Matter Info')]/i")); //Unique X-path Of MatterInfo Tab On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_MatterInfoFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Name TextBox On Matter Info Tab On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_MatterInfoFirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("claimantfirstname")); //Unique Id Of First Name TextBox On Matter Info Tab On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Tab_AttorneyInformation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Attorney Information Tab On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-05-2017                                
	//============================================================================================
	public static WebElement RMAApp_Litigation_Tab_AttorneyInformation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Attorney Information')]/i")); //Unique X-path Of Attorney Information Tab On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which County Text Box On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-28-2017                                
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_County(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='county']")); //Unique X-path Of County TextBox On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_CourtDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CourtDate Text Box On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-28-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_CourtDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='courtdate' and@ type='text']")); //Unique X-path Of CourtDate Text Box On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_ZipCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ZipCode Text Box On RMA Application Claim's Litigation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-28-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_ZipCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='litattzipcode']")); //Unique X-path Of ZipCode Text Box On RMA Application Claim's Litigation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Btn_AttorneyLastNameSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Attorney LastName Search Button On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-20-2019                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Btn_AttorneyLastNameSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_litattlastname']")); //Unique Id  Of Litigation Attorney LastName Search Button On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_AttorneyState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Attorney State On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-20-2019                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_AttorneyState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_litattstateid']")); //Unique Id  Of Litigation Attorney State On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Btn_JudgeLastNameSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Judge LastName Search Button On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-21-2019                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Btn_JudgeLastNameSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_judgelastname']")); //Unique Id  Of Litigation Judge LastName Search Button On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_JudgeCountry
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Judge Country On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-21-2019                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_JudgeCountry(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_judgecountrycode']")); //Unique Id  Of Litigation Judge Country On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Txt_VenueState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Venue State On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-20-2019                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Txt_VenueState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_venuestateid']")); //Unique Id  Of Litigation Venue State On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Litigation_Btn_VenueState
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Venue State Lookup Button On RMA Application Litigation Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-20-2019                                 
	//============================================================================================
	public static WebElement RMAApp_Litigation_Btn_VenueState(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_venuestateid_openlookup']")); //Unique Id  Of Litigation Venue State Lookup Button On RMA Application Litigation Creation Page Is Fetched
		return Element;
	}
}




