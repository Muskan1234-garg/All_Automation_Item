package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Entity_ERON {
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

	//Hussain
	
	//=================================================================================================================================================================================================
		//FunctionName 			: RMAApp_Entity_Lst_TypeOfEntity_ERON
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Entity ListBox On Entity ERON Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - Jannathhussain-10-31-2017                                 
		// ================================================================================================================================================================================================
		public static WebElement RMAApp_Entity_Lst_TypeOfEntity_ERON(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath("//*[@id='entitytypecode']")); //Unique Id Of Type Of Entity ListBox On Entity ERON Page Is Fetched
			return Element;
		}
		
		//=================================================================================================================================================================================================
		//FunctionName 			: RMAApp_Entity_Txt_Name_ERON
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name TextBox On Entity Page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - Jannathhussain-03-28-2018                                
		//================================================================================================================================================================================================
		public static WebElement RMAApp_Entity_Txt_Name_ERON(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("erlastname")); //Unique Id Of Name TextBox On Entity Page Is Fetched
			return Element;
		}
	//Hussain
		
		
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
	
	
	//a[@id='Employee Info' and @name='Employee Info']
	////*[@class='material-icons mdi mdi-account-location']
	
	
	
	//=================================================================================================================================================================================================
		//FunctionName 			: RMAApp_Employee_Button
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Button On Entity Page Can Be Identified
		//Input Parameter 		: None		 
		//Revision				: 0.0 - JannathHussain-03-27-2018                                
		//================================================================================================================================================================================================
		public static WebElement RMAApp_Entity_Employee(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath("//*[@class='material-icons mdi mdi-account-location']")); //Unique Id Of Employee Button On Entity Page Is Fetched
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
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Addresses')]/i")); //Unique x-path  Of Addresses Tab On RMA Application Entity Creation Page Is Fetched
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
		Element = driver.findElement(By.id("lookup_state")); //Unique Id Of State TextBox On RMA Application Entity Page Is Fetched
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
		Element = driver.findElement(By.id("btn_state")); //Unique Id Of State Button On RMA Application Entity Page Is Fetched
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
		Element = driver.findElement(By.id("btn_country")); //Unique Id Of Country Button On RMA Application Entity Page Is Fetched
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
		Element = driver.findElement(By.id("zipCode")); //Unique Id  Of Entity Zip Code TextBox On RMA Application Entity Page Is Fetched
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
		Element = driver.findElement(By.id("lookup_country")); //Unique Id Of Country TextBox On RMA Application Entity Page Is Fetched
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
		Element = driver.findElement(By.id("btn_bankingstatus")); //Unique Id Of Banking Status Button On RMA Application Entity->Banking Information Setup Page Is Fetched
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
		Element = driver.findElement(By.id("btn_accttypecode")); //Unique Id Of Account Type Button On RMA Application Entity->Banking Information Setup Page Is Fetched
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
		//FunctionName 			: RMAApp_Entity_Category
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Category On Entity Page Can Be Identified
		//Input Parameter 		: Entity Variable Of The Type WebEntity		 
		//Revision				: 0.0 - KumudNaithani-02-11-2017                               
		//================================================================================================================================================================================================
		public static WebElement RMAApp_Entity_Category(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath("//input[@type='search']")); //Unique Id Of Entity Category On Entity Page Is Fetched
			return Element;
		}
		//=================================================================================================================================================================================================
				//FunctionName 			: RMAApp_Entity_Category_Value
				//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Category Value On Entity Page Can Be Identified
				//Input Parameter 		: Entity Variable Of The Type WebEntity		 
				//Revision				: 0.0 - KumudNaithani-02-11-2017                               
				//================================================================================================================================================================================================
				public static WebElement RMAApp_Entity_Category_Value(WebDriver driver)
				{
					Element = null;
					Element = driver.findElement(By.xpath("//*[@class='select2-result-label ui-select-choices-row-inner']")); //Unique Id Of Entity Category Value On Entity Page Is Fetched
					return Element;
				}
				

				//=================================================================================================================================================================================================
					//FunctionName 			: RMAApp_Physicianinfo_Button 
					//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Physician Button On Entity Page Can Be Identified
					//Input Parameter 		: None	 
					//Revision				: 0.0 - Jannathhussain-03-27-2018                                 
					//================================================================================================================================================================================================
					public static WebElement RMAApp_Physicianinfo_Button(WebDriver Entity)
					{
						Element = null;
						Element = Entity.findElement(By.xpath("//a[contains(text(),'Physician Info')]")); //Unique Id Of Start date Textbox On Privileges Page Is Fetched
						return Element;
					}
				
					//============================================================================================
					//FunctionName 			: RMAApp_ToolBarButtons_Dropdown
					//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State/WC Fee Schedule/Discount Tab On RMA Application Contracts Creation Page Can Be Identified
					//Input Parameter 		: Driver Variable Of The Type WebDriver		 
					//Revision				: 0.0 - Jannathhussain-03-27-2018                                   
					//============================================================================================
					public static WebElement RMAApp_Physician_Dropdown(WebDriver driver)
					{
						Element = null;
						Element = driver.findElement(By.xpath("//i[@class='material-icons material-icons-clr' and @data-toggle='dropdown']")); //Unique x-path  Of Dropdown To Get Extra Tool Bar Buttons On RMA Application Contracts Creation Page Is Fetched
						return Element;
					}
				
					
}

