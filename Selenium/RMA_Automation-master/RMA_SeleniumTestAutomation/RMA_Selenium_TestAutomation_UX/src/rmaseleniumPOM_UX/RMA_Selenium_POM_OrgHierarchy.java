package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_OrgHierarchy 
{
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Img_New
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which New Image On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-07-2017  
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Img_New(WebDriver driver)
	{
		Element = driver.findElement(By.id("idnodeadd")); //Unique Id Of New Image On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Txt_Name
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-07-2017  
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Txt_Name(WebDriver driver)
	{
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Name Text Box On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Txt_Abbreviation
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Abbreviation Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-07-2017  
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Txt_Abbreviation(WebDriver driver)
	{
		Element = driver.findElement(By.id("deptabbreviation")); //Unique Id Of Abbreviation Text Box On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Txt_NatureOfBusiness
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Nature Of Business Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-07-2017  
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Txt_NatureOfBusiness(WebDriver driver)
	{
		Element = driver.findElement(By.id("natureofbusiness")); //Unique Id Of Nature Of Business Text Box On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_ClientInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Client Info Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_ClientInfo(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Client Info')]/i"));//Unique x-path Of Client Info Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_ClientLimits
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Client Limits Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_ClientLimits(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Client Limits')]/i"));//Unique x-path Of Client Limits Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_OperatingAs
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Operating As Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_OperatingAs(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Operating As')]/i"));//Unique x-path Of Operating As Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_ContactInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Contact Info Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_ContactInfo(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Contact Info')]/i"));//Unique x-path Of Contact Info Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addresses Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_Addresses(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i"));//Unique x-path Of Addresses Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Entity ID Type Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_EntityIDType(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i"));//Unique x-path Of Entity ID Type Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplementals Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_Supplementals(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i"));//Unique x-path Of Supplementals Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyClientInfo_Txt_WCFillingNo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which WC Filling Number Text Box On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyClientInfo_Txt_WCFillingNo(WebDriver driver)
	{
		Element = driver.findElement(By.id("wcfn"));//Unique x-path Of WC Filling Number Text Box On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Btn_AddNewAddress
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Address Button On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Btn_AddNewAddress(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='entityXAddressesInfoGrid']/ancestor::div[1]/*[@id='entityXAddressesInfoGrid']/div[1]/span[2]/button"));//Unique x-path Of Add New Address Button On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_AddrType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address Type Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_AddrType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_addressType")); //Unique Id Of Address Type TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_Addr1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 1 Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_Addr1(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[(@id='addr1' or @id='lookup_addr1') and @type='text']")); //Unique Id Of Address 1 TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_Addr2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 2 Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_Addr2(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr2")); //Unique Id Of Address 2 TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_Addr3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 3 Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_Addr3(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr3")); //Unique Id Of Address 3 TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_Addr4
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 4 Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_Addr4(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr4")); //Unique Id Of Address 4 TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which City Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_City(WebDriver driver)
	{
		Element = driver.findElement(By.id("city")); //Unique Id Of City TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//Revision				: 0.0 - MishalKantawala-11-05-2020                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_stateid")); //Unique Id Of State TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyClient_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Text Box On Client Tab On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyClient_Txt_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_stateid")); //Unique Id Of State TextBox On Client Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Btn_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_state_openlookup")); //Unique Id Of State Button On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Button On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Btn_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_country_openlookup")); //Unique Id Of Country Button On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_ZipCode
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip Code TextBox On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - AnubhutiVyas-11-08-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_ZipCode(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[(@id='zipCode')or(@id='zipcode')]")); //Unique Id  Of Entity Zip Code TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_OrgHierarchyClient_Txt_ZipCode
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip Code TextBox On Client Tab On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - AnubhutiVyas-11-08-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_OrgHierarchyClient_Txt_ZipCode(WebDriver driver)
	{
		Element = driver.findElement(By.id("zipcode")); //Unique Id  Of Entity Zip Code TextBox On Client Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_countrycode")); //Unique Id Of Country TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyClient_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Text Box On Client Tab On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyClient_Txt_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_countrycode")); //Unique Id Of Country TextBox On On Client Tab RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchyAddresses_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which County Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchyAddresses_Txt_County(WebDriver driver)
	{
		Element = driver.findElement(By.id("county")); //Unique Id Of County TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchySupplementals_Txt_ClaimIndxBureauNo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Index Bureau Number Text Box On RMA Application Maintenance Org Hierarchy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		  
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchySupplementals_Txt_ClaimIndxBureauNo(WebDriver driver)
	{
		Element = driver.findElement(By.id("supp_index_bureau_numb")); //Unique Id Of Claim Index Bureau Number Text Box TextBox On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Tab_Client
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Client Tab On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Tab_Client(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='accordiongroup-98-3265-tab']/h4/a/span/div"));//Unique x-path Of Client Tab On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Lst_DefaultExpansionLevel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Default Expansion Level List On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-24-2019
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Lst_DefaultExpansionLevel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@name='orghLevel']"));//Unique x-path Of Default Expansion Level List On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Lst_SearchSpecificLevel 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Specific Level List On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-09-12-2019
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Lst_SearchSpecificLevel(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='OrgSearch_cmb_slevel']"));//Unique x-path Of Search Specific Level List On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_OrgHierarchy_Btn_ListView 
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which List View Button On RMA Application Maintenance Org Hierarchyn Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-09-12-2019
	//============================================================================================
	public static WebElement RMAApp_OrgHierarchy_Btn_ListView(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='OrgSearch_btnlview']"));//Unique x-path Of List View Button On RMA Application Maintenance Org Hierarchy Page Is Fetched
		return Element;
	}
}
