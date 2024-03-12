package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Driver {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Lst_TypeOfDriver
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Driver ListBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Lst_TypeOfDriver(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("drivertyped")); //Unique Id Of Type Of Driver List Box On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintDriver_Lst_TypeOfDriver
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Driver ListBox On Maintenance -->Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-31-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintDriver_Lst_TypeOfDriver(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of Driver List Box On Maintenance -->Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintenanceDriver_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PIDriver_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_lastname")); //Unique Id Of Last Name TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Address1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address1 TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Address1(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr1")); //Unique Id Of Address1 TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Supplementals')]//i")); //Unique Id Of Supplementals Tab On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Tab_Driver
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Driver Tab On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Tab_Driver(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("//*[contains(text(),'Driver')]//i")); //Unique Id Of Driver Tab On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Txt_LookupLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which LastName TextBox On Lookup On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Txt_LookupLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-container ng-scope']/div[@class='ng-scope']/input ")); //Unique Id Of LastName TextBox On Lookup Window TextBox On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_MaintPatient_Btn_LookupLastPage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Page Button On Lookup Page On Maintenance -->Patient Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-10-2018                                  
	//================================================================================================================================================================================================
	public static WebElement RMAApp_MaintPatient_Btn_LookupLastPage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ui-grid-pager-last']")); //Unique Id Of Last Page Button On Lookup Page On Maintenance -->Patient Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_Diary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Image Button On RMA Claims Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-14-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_Diary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Diary']")); //Unique Id Of Diary Image Button On RMA Application Claim Page Is Fetched
		return Element;

	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_RecordSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Record Summary Image Button On RMA Application Generic Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_RecordSummary(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='Record Summary']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unique Id  Of Record Summary Image Button On RMA Application Generic Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericClaim_Btn_MailMerge
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Mail Merge Image Button On RMA Application Generic Claim Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-08-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_GenericClaim_Btn_MailMerge(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Mail Merge']")); //Unique Id  Of Mail Merge Image Button On RMA Application Generic Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Employee_Img_WithHolding
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Withholding Image Button On RMA Application Employee Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-07-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_Employee_Img_WithHolding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Withholding']")); //Unique Id  Of Withholding Image Button On RMA Application Employee Creation Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Address2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address2 TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Address2(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr2")); //Unique Id Of Address2 TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Address3
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address3 TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Address3(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr3")); //Unique Id Of Address3 TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Address4
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address4 TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Address4(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addr4")); //Unique Id Of Address4 TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Middle Name TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_MiddleName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("middlename")); //Unique Id Of Middle Name TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Name TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("firstname")); //Unique Id Of First Name TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Initials
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Initials TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Initials(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("abbreviation")); //Unique Id Of Initials TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_AlsoKnownAs
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Also Known As TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_AlsoKnownAs(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("alsoknownas")); //Unique Id Of Also Known As TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_City
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which City TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_City(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("city")); //Unique Id Of City TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_stateid")); //Unique Id Of State TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Btn_State
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State Button On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Btn_State(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_stateid")); //Unique Id Of State Button On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_countrycode")); //Unique Id Of Country TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Country Button On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_country_openlookup")); //Unique Id Of Country Button On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_SSN
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SSN TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_SSN(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("taxid")); //Unique Id Of SSN TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_DateOfBirth
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Date Of Birth TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_DateOfBirth(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='birthdate' and @type='text']")); //Unique Id Of Date Of Birth TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_SearchLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name TextBox On Search Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_SearchLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("FLD70000")); //Unique Id Of Last Name TextBox On Search Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Btn_SubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Submit Query Button On Search Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-04-19-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Btn_SubmitQuery(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("submitquery")); //Unique Id Of Submit Query Button On Search Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_ZipCode
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Zip/Postal Code TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_ZipCode(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("zipcode")); //Unique Id Of Zip/Postal Code TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_OfficePhone
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Office Phone TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_OfficePhone(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("phone1")); //Unique Id Of Office Phone TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_HomePhone
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Home Phone TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_HomePhone(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("phone2")); //Unique Id Of Home Phone TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_Sex
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sex TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_Sex(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_sexcode")); //Unique Id Of Sex TextBox On Driver Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Driver_Txt_MaritalStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Marital Status TextBox On Driver Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-10-2018                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Driver_Txt_MaritalStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_maritalstatcode")); //Unique Id Of Marital Status TextBox On Driver Page Is Fetched
		return Element;
	}

}
