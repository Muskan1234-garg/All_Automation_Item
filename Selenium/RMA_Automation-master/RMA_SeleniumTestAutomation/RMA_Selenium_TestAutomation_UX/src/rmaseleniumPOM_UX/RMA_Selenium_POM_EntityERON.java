package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_EntityERON {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Lst_EntityType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Entity ListBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Lst_EntityType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("entitytypecode")); //Unique Id Of Type Of Entity ListBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Category
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Category TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Category(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_entitycategory")); //Unique Id Of Type Of Category TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_SSN
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of SSN TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_SSN(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("taxid")); //Unique Id Of Type Of SSN TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Last Name TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("erlastname")); //Unique Id Of Type Of LastName TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Contact
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Contact TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Contact(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("contact")); //Unique Id Of Type Of Contact TextBox On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_DBA
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of DBA TextBox On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_DBA(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("alsoknownas")); //Unique Id Of Type Of DBA TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_PhoneSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone search Image Button On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Btn_PhoneSearch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-search']//ancestor::button[@uib-tooltip='Add/Edit']")); //Unique Id Of Phone search Image Button On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Lst_PhoneType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone Type List On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Lst_PhoneType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Select2']")); //Unique Id Of Phone Type List On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_PhoneNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Phone Number TextBox On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_PhoneNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='newfoldername']")); //Unique Id Of Phone Number TextBox On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Img_SavePhone
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Phone Number Image Button On RMA Application Patient Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Img_SavePhone(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='A1']/i")); //Unique Id Of Save Phone Number Image Button On Patient Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Title
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Title TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Title(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("title")); //Unique Id Of Title TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_NatureOfBusiness
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Nature Of Business TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_NatureOfBusiness(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("natureofbusiness")); //Unique Id Of Nature Of Business TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address1 TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Address1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr1")); //Unique Id Of Address1 TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address2 TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Address2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr2")); //Unique Id Of Address2 TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Address3
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address3 TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Address3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr3")); //Unique Id Of Address3 TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Address4
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Address4 TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Address4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr4")); //Unique Id Of Address4 TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which City TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("city")); //Unique Id Of City TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_stateid")); //Unique Id Of State TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Lookup Button On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_stateid")); //Unique Id Of State Button On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_ZipPostalCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zip/Postal Code TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_ZipPostalCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("zipcode")); //Unique Id Of Zip/Postal Code TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_County
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which County TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_County(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("county")); //Unique Id Of County TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_countrycode")); //Unique Id Of Country TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_countrycode")); //Unique Id Of Country Button On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Fax
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FAX TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Fax(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("faxnumber")); //Unique Id Of FAX TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_EmailType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Email Type TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_EmailType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_emailtypecode")); //Unique Id Of Email type TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_EmailType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Email Type Button On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Btn_EmailType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_emailtypecode")); //Unique Id Of Email Type Button On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_Email
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Email TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_Email(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("emailaddress")); //Unique Id Of Email TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_NPINumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which NPI Number TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_NPINumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("npinumber")); //Unique Id Of NPI Number TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Txt_ReferenceNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reference Number TextBox On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Txt_ReferenceNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("referenceNumber")); //Unique Id Of Reference Number TextBox On Entity Page Is Fetched
		return Element;
	}

	//=========================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Img_DriverInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Driver Info Image Button On RMA Application Entity Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                  
	//===============================================================================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Img_DriverInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Driver Info")); //Unique Id Of Driver Info Image Button On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Btn_Category
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Category Lookup Button On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Btn_Category(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_entitycategory")); //Unique Id Of Type Of Category Lookup Button On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Img_SelectRowMark
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Row Mark Selector On Category Lookup On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Img_SelectRowMark(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-click='selectButtonClick(row, $event)']")); //Unique Id Of Type Of Row Mark Selector On Category Lookup On Entity Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Entity_Img_OK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of OK Button On Category Lookup On Entity Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-04-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Entity_Img_OK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("complete")); //Unique Id Of Type Of OK Button On Category Lookup On Entity Page Is Fetched
		return Element;
	}
}
