package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Property {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_PropertyID
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Property ID Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_PropertyID(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pin']")); //Unique Id  Of  PropertyID Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address 1 Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_Address1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='addr1']")); //Unique Id  Of  Address 1 Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_ZipPostalCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip/Postal Code Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_ZipPostalCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='zipcode']")); //Unique Id  Of Zip/Postal Code Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City Textbox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='city']")); //Unique Id  Of City Textbox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Lookup Button On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_stateid_openlookup']")); //Unique Id  Of State Lookup Button On RMA Application Property Creation Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Property_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Lookup Button On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_countrycode_openlookup']")); //Unique Id  Of State Lookup Button On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Property_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On RMA Application Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-12-19-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Property_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_stateid']")); //Unique Id  Of State TextBox On RMA Application Property Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Property_Btn_PropertyLookUp
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PropertyLookUp Image Button On Property Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-22-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Property_Btn_PropertyLookUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']/i")); //Unique X-path Of PropertyLookUp Image Button On Property Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Property_Lookup_Txt_PropertyId
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PropertyID TextBox On Property Lookup Page On RMA Application Can Be Identified 	
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-22-2018                                
	//============================================================================================

	public static WebElement RMAApp_Property_Lookup_Txt_PropertyId(WebDriver driver)
	{
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-container ng-scope']/div[@class='ng-scope']/input")); //Unique Id Of PropertyID TextBox On PRoperty Lookup Page Is Fetched
			return Element;
		}
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Property_View_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )On The Basis Of Which Property View Link On RMA Application Property SMS Page Can Be Identified
	//Input Parameter 		: Driver Property Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                                
	//============================================================================================

	public static WebElement RMAApp_Property_ID_Search(WebDriver driver)
	{
		{
			Element = null;
			Element = driver.findElement(By.xpath("//input[@id='FLD60719' and @name='Property ID']")); //Unique Id Of View Link On SMS For Property Maintenance Page Is Fetched
			return Element;
		}
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Property_Txt_Appraiseddate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Appraised Date TextBox On Property Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-21-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PropertyUnit_Txt_Appraiseddate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='appraiseddate' and @type= 'text']")); //Unique Id Of Appraised Date TextBox On Property Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Property_RecordSummary_btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Record Summary Cancel Button On Property Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - JannathHussain-03-16-2018                                
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Property_RecordSummary_btn_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnclose']/i")); //Unique Id Of Record Summary Cancel Button On Property Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Property_View_SMS_Lnk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )On The Basis Of Which Property View Link On RMA Application Property SMS Page Can Be Identified
	//Input Parameter 		: Driver Property Of The Type WebDriver		 
	//Revision				: 0.0 - JannathHussain-03-09-2018                                
	//============================================================================================

	public static WebElement RMAApp_Property_View_SMS_Lnk(WebDriver driver,String View)
	{
		{
			Element = null;
			Element = driver.findElement(By.linkText(View)); //Unique Id Of View Link On SMS For Property Maintenance Page Is Fetched
			return Element;
		}
	}
	//=================================================================================================================================================================================================
	//FunctionName           : RMAApp_MaintProperty_Btn_LookupLastPage
	//Description            : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Page Button On Lookup Page On Maintenance -->Property Page Can Be Identified
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - NikitaThani-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintProperty_Btn_LookupLastPage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-last']")); //Unique Id Of Last Page Button On Lookup Page On Maintenance -->Property Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Property_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On Property Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Property_Img_Save(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[@class='material-icons material-icons-clr' and contains(text(),'save')]//ancestor::a[1]")); //Unique Id Of Save Image On Property Creation Page Is Fetched
		return Element;
	}


	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Property_Img_HelpMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Help Message Image On Property Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-03-16-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Property_Img_HelpMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-if='field.helpmsg']")); //Unique Id Of Help Message Image On Property Page Is Fetched
		return Element;
	}
} 
