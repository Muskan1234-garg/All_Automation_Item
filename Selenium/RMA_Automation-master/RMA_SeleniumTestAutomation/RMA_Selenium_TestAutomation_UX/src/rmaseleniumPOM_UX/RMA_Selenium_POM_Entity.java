package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Entity {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Lst_TypeOfEntity
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Entity ListBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Lst_TypeOfEntity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of Entity ListBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Name
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Name(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Name TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Lst_IDType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which IDType ListBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Lst_IDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("typeid")); //Unique Id Of IDType ListBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_NatureOfBusiness
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which NatureOfBusiness TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_NatureOfBusiness(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("natureofbusiness")); //Unique Id Of NatureOfBusiness TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Tittle
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Title TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Tittle(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("title")); //Unique X-path Of Title TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Tab_ContactInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ContactInfo Tab On Entity Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Tab_ContactInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Contact Info ')]//i")); //Unique Id Of ContactInfo Tab On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Tab_OperatingAs
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OperatingAs Tab On Entity Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                               
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Tab_OperatingAs(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Operating As')]//i")); //Unique Id Of OperatingAs Tab On Entity Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Entity_Tab_Addresses
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Addresses Tab On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Entity_Tab_Addresses(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i")); //Unique x-path  Of Addresses Tab On RMA Application Entity Creation Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Entity_Tab_EntityIDType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EntityIDType Tab On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-01-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Entity_Tab_EntityIDType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Entity ID Type')]/i")); //Unique x-path  Of EntityIDType Tab On RMA Application Entity Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Entity Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Supplementals')]//i")); //Unique Id Of Supplementals Tab On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Tab_Entity
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Tab On Entity Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - KumudNaithani-02-11-2017                               
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Tab_Entity(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Entity')]//i")); //Unique Id Of Entity Tab On Entity Page Is Fetched
		return Element;
	}	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_Addr1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 1 Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_Addr1(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr1")); //Unique Id Of Address 1 TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_Addr2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 2 Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_Addr2(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr2")); //Unique Id Of Address 2 TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_Addr3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 3 Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_Addr3(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr3")); //Unique Id Of Address 3 TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_Addr4
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 4 Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_Addr4(WebDriver driver)
	{
		Element = driver.findElement(By.id("addr4")); //Unique Id Of Address 4 TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which City Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_City(WebDriver driver)
	{
		Element = driver.findElement(By.id("city")); //Unique Id Of City TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_State(WebDriver driver)
	{
		//Element = driver.findElement(By.id("lookup_state")); //Unique Id Of State TextBox On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='lookup_state' or @id='lookup_stateid']")); //Unique Id Of State TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Btn_State(WebDriver driver)
	{
		//Element = driver.findElement(By.id("btn_state")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='btn_state_openlookup' or @id='btn_stateid_openlookup']")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Btn_Country(WebDriver driver)
	{
		//Element = driver.findElement(By.id("btn_country")); //Unique Id Of Country Button On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='btn_country_openlookup' or @id='btn_countrycode_openlookup']")); //Unique Id Of Country Button On RMA Application Entity Page Is Fetched
		return Element;
	}
	/*============================================================================================
	FunctionName 			: RMAApp_EntityAddresses_Txt_ZipCode
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip Code TextBox On RMA Application Entity Page Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - AnubhutiVyas-11-08-2017                               
	 ============================================================================================ */
	public static WebElement RMAApp_EntityAddresses_Txt_ZipCode(WebDriver driver)
	{
		//Element = driver.findElement(By.id("zipCode")); //Unique Id  Of Entity Zip Code TextBox On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='zipCode' or @id='zipcode']")); //Unique Id  Of Entity Zip Code TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_Country(WebDriver driver)
	{
		//Element = driver.findElement(By.id("lookup_country")); //Unique Id Of Country TextBox On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='lookup_country' or @id='lookup_countrycode']")); //Unique Id Of Country TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which County Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_County(WebDriver driver)
	{
		Element = driver.findElement(By.id("county")); //Unique Id Of County TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Btn_AddNewAddress
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Address Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Btn_AddNewAddress(WebDriver driver)
	{
		//Element = driver.findElement(By.xpath(".//*[@id='entityXAddressesInfoGrid']/ancestor::div[1]/*[@id='entityXAddressesInfoGrid']/div[1]/span[2]/button"));//Unique x-path Of Add New Address Button On RMA Application Entity Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@id='entityXAddressesInfoGrid']/div[1]/span[2]/button"));
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_EntityAddresses_Txt_AddrType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address Type Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-11-08-2017                            
	//============================================================================================
	public static WebElement RMAApp_EntityAddresses_Txt_AddrType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_addressType")); //Unique Id Of Address Type TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Entity_BankingInfoSetup_Txt_BankName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Name Text Box On RMA Application Entity->Banking Information Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-30-2018                          
	//============================================================================================
	public static WebElement RMAApp_Entity_BankingInfoSetup_Txt_BankName(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankname")); //Unique Id Of Bank Name TextBox On RMA Application Entity->Banking Information Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Entity_BankingInfoSetup_Txt_AccountNo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Account# Text Box On RMA Application Entity->Banking Information Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-30-2018                          
	//============================================================================================
	public static WebElement RMAApp_Entity_BankingInfoSetup_Txt_AccountNo(WebDriver driver)
	{
		Element = driver.findElement(By.id("accountnumber")); //Unique Id Of Account# TextBox On RMA Application Entity->Banking Information Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Entity_BankingInfoSetup_Btn_BankingStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Banking Status Button On RMA Application Entity->Banking Information Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-30-2018                          
	//============================================================================================
	public static WebElement RMAApp_Entity_BankingInfoSetup_Btn_BankingStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_bankingstatus_openlookup")); //Unique Id Of Banking Status Button On RMA Application Entity->Banking Information Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Entity_BankingInfoSetup_Btn_AccountType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Account Type Button On RMA Application Entity->Banking Information Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-30-2018                          
	//============================================================================================
	public static WebElement RMAApp_Entity_BankingInfoSetup_Btn_AccountType(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_accttypecode_openlookup")); //Unique Id Of Account Type Button On RMA Application Entity->Banking Information Setup Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Entity_BankingInfoSetup_Txt_TransitNo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Transit Number Text Box On RMA Application Entity->Banking Information Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-30-2018                          
	//============================================================================================
	public static WebElement RMAApp_Entity_BankingInfoSetup_Txt_TransitNo(WebDriver driver)
	{
		Element = driver.findElement(By.id("transit")); //Unique Id Of Transit Number Text Box On RMA Application Entity->Banking Information Setup Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_DriverInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Driver Info Image Button On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-02-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Btn_DriverInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Driver Info")); //Unique Id Of Driver Info Image Button On Entity Page Is Fetched
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Img_ViewPaymentHistory
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which View Payment History Image Button On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-05-29-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Img_ViewPaymentHistory(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("View Payment History")); //Unique Id Of View Payment History Image Button On Entity Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_ApprovalStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Approval Status Code Text Box On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-26-2018                            
	//============================================================================================
	public static WebElement RMAApp_Entity_Txt_ApprovalStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_entityapprovalstatuscode")); //Unique Id Of Entity Approval Status Code TextBox On RMA Application Entity Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_ApprovalStatusLookup
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Approval Status LookUp Button On RMA Application Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-26-2018                            
	//============================================================================================
	public static WebElement RMAApp_Entity_Btn_ApprovalStatusLookup(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_entityapprovalstatuscode_openlookup")); //Unique Id Of Entity Approval Status LookUp Button On RMA Application Entity Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntitySearch_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name TextBox On RMA Application Entity Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-28-2018                            
	//============================================================================================
	public static WebElement RMAApp_EntitySearch_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.name("Last Name")); //Unique Id  Last Name TextBox On RMA Application Entity Search Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Tab_Contract
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Contract Tab On RMA Application Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Tab_Contract(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Contract')]/descendant::i[1]")); //Unique Id  Of Contract Tab On RMA Application Entity->Contract Page Is Fetched
		return Element;
	}

//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_StartDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract's Start Date on Entity->Contract->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-30-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_StartDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='startdate' and @role='textbox']")); //Unique Id Of Which Contract's Start Date on Entity->Contract->Contract Page Can Be Identified
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_EndtDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract's End Date on Entity->Contract->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-11-30-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_EndDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='enddate' and @role='textbox']")); //Unique Id Of Which Contract's End Date on Entity->Contract->Contract Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract's Amount on Entity->Contract->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_Amount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='amount' and @role='textbox']")); //Unique Id Of Which Contract's Amount on Entity->Contract->Contract Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_Comments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract's Comments on Entity->Contract->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_Comments(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='comments' and @role='textbox']")); //Unique Id Of Which Contract's Comments on Entity->Contract->Contract Page Can Be Identified
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Tab_PerDiemRate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Per Diem Rate Tab On RMA Application Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Tab_PerDiemRate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Per Diem Rate')]/descendant::i[1]")); //Unique Id  Of Per Diem Rate Tab On RMA Application Entity->Contract Page Is Fetched
		return Element;
	}
	
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_FirstRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Rate on Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_FirstRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='firstrate' and @role='textbox']")); //Unique Id Of Which First Rate on Entity->Contract Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_SecondRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Second Rate on Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_SecondRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='secondrate' and @role='textbox']")); //Unique Id Of Which Second Rate on Entity->Contract Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_LastRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Rate on Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_LastRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lastrate' and @role='textbox']")); //Unique Id Of Which Last Rate on Entity->Contract Page Can Be Identified
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_Day2ndRateStarts
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Day 2nd Rate Starts on Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_Day2ndRateStarts(WebDriver driver)
	{
		Element = driver.findElement(By.id("firstratechanged")); //Unique Id Of Which Day 2nd Rate Starts on Entity->Contract Page Can Be Identified
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_DayLastRateStarts
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Day Last Rate Starts on Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                 
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_DayLastRateStarts(WebDriver driver)
	{
		Element = driver.findElement(By.id("secondratechanged")); //Unique Id Of Which Day Last Rate Starts on Entity->Contract Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Tab_StateWCFeeScheduleDiscount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State/WC Fee Schedule/Discount Tab On RMA Application Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Tab_StateWCFeeScheduleDiscount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'State/WC Fee Schedule/Discount')]/descendant::i[1]")); //Unique Id  Of State/WC Fee Schedule/Discount Tab On RMA Application Entity->Contract Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Btn_SDApplyDiscount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Discount check box On Entity ->Contract ->StateWCFeeScheduleDiscount Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Btn_SDApplyDiscount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("discschd")); //Unique Id Of Apply Discount check box On Entity ->Contract ->StateWCFeeScheduleDiscount Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_SDFactorPercentage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Factor Percentage textbox On Entity ->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_SDFactorPercentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dfactor")); //Unique Id Of Factor Percentage textbox On Entity ->Contract->StateWCFeeScheduleDiscount Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_SDDiscountPercentage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Discount Percentage textbox On Entity ->Contract->StateWCFeeScheduleDiscount Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_SDDiscountPercentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dpercentage")); //Unique Id Of Discount Percentage textbox On Entity ->Contract->StateWCFeeScheduleDiscount Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Lst_SDTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fee Schedule Table DropDown On Entity ->Contract->StateWCFeeScheduleDiscount Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - MishalKantawala-12-01-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EntityContract_Lst_SDTable(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("feesched")); //Unique Id Of Fee Schedule Table DropDown On Entity ->Contract->StateWCFeeScheduleDiscount Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Tab_Other
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Other Tab On RMA Application Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Tab_Other(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Other')]/descendant::i[1]")); //Unique Id  Of Other Tab On RMA Application Entity->Contract Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Btn_OtherApplyDiscount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Discount check box On Entity->Contract->Other Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Btn_OtherApplyDiscount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("discschd2")); //Unique Id Of Apply Discount check box On Entity ->Contract ->Other Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_OtherFactorPercentage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Factor Percentage textbox On Entity->Contract->Other Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_OtherFactorPercentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dfactor2")); //Unique Id Of Factor Percentage textbox On Entity ->Contract->Other Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_OtherDiscountPercentage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Discount Percentage textbox On Entity ->Contract->Other Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_OtherDiscountPercentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dpercentage2")); //Unique Id Of Discount Percentage textbox On Entity ->Contract->Other Page Can Be Identified
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Lst_OtherTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Fee Schedule Table DropDown On Entity ->Contract->Other Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:0.0 - MishalKantawala-12-01-2020                                  
	// ============================================================================================
	public static WebElement RMAApp_EntityContract_Lst_OtherTable(WebDriver driver)
	{
		Element =null;
		Element = driver.findElement(By.id("feesched2")); //Unique Id Of Fee Schedule Table DropDown On Entity ->Contract->Other Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Tab_AmountBilled
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount Billed Tab On RMA Application Entity->Contract Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                   
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Tab_AmountBilled(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Amount Billed')]/descendant::i[1]")); //Unique Id  Of Amount Billed Tab On RMA Application Entity->Contract Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Btn_ABApplyDiscount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Apply Discount check box On Entity->Contract->Amount Billed Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Btn_ABApplyDiscount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("discschdbill")); //Unique Id Of Apply Discount check box On Entity ->Contract ->Amount Billed Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_ABFactorPercentage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Factor Percentage textbox On Entity->Contract->Amount Billed Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_ABFactorPercentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dfactorbill")); //Unique Id Of Factor Percentage textbox On Entity ->Contract->Amount Billed Page Can Be Identified
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_EntityContract_Txt_ABDiscountPercentage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Discount Percentage textbox On Entity ->Contract->Amount Billed Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - MishalKantawala-12-01-2020                                     
	//============================================================================================
	public static WebElement RMAApp_EntityContract_Txt_ABDiscountPercentage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dpercentagebill")); //Unique Id Of Discount Percentage textbox On Entity ->Contract->Amount Billed Page Can Be Identified
		return Element;
	}
}