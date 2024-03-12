package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Globalization {
	public static WebElement Element = null;
	public static WebElement Element2 = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Chk_CurrencyType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type Checkbox Will Be Identified On Globalization Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Chk_CurrencyType(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("basecurrencytype_codelookup")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Chk_Multi_Currency
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Multi Currency Check Box Will Be Identified On Globalization Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Chk_Multi_Currency(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("UseMultiCurrency")); //Unique Id Of Multi Currency Check Box On Globalization Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_Button_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which AddNew Button Will Be Identified On Exchange Rate Setup Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_Button_AddNew(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("MultiCurrencySetupGrid_New")); //Unique Id Of AddNew Button On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_Source_Currency_InputBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Source Currency InputBox Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_Source_Currency_InputBox(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("SourceCurrency_codelookup")); //Unique Id Of Source Currency InputBox Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_Destination_Currency_InputBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Destination Currency InputBox Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_Destination_Currency_InputBox(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("DestinationCurrency_codelookup")); //Unique Id Of Destination Currency InputBox Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_ExchangeRate_InputBox
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ExchangeRate InputBox Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_ExchangeRate_InputBox(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("ExchangeRate")); //Unique Id Of Destination ExchangeRate InputBox Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_Save_Button
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Button Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_Save_Button(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.name("Save")); //Unique Id Of Destination Save Button Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_ExistingRecord_Table
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Existing Rates Table Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_ExistingRecord_Table(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath("//*[@id='MultiCurrencySetupGrid_gvData_ctl00']/tbody"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_ExistingRecord_Table_Row
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Existing Rates Table Row Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_ExistingRecord_Table_Row(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("MultiCurrencySetupGrid_gvData_ctl07_0")); //Unique Id Of Existing Rates Table Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_ExistingRecord_Table_column
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Existing Rates Table Row Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_ExistingRecord_Table_column(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("MultiCurrencySetupGrid_gvData_ctl09_0")); //Unique Id Of Existing Rates Table Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_ExistingRecord_Table_Row1
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Existing Rates Table Row Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_ExistingRecord_Table_Row1(WebDriver driver,WebDriver dr1 )
	{
		Element = null;
		Element2 =null;
		try {
			Element = driver.findElement(By.id("MultiCurrencySetupGrid_gvData_ctl07_0")); //Unique Id Of Existing Rates Table Exists Will Be Identified On AddModify Currency Popup On Exchange Rate Setup Page Is Fetched
			Element2 =driver.findElement(By.id("MultiCurrencySetupGrid_gvData_ctl09_0"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Claim_Currency_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type TextBox Will Be Identified On Claim Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Claim_Currency_Type(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lookup_currencytypetext")); //Unique Id Of Currency Type TextBox On Claim Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Reserve_Currency_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type DropDown Will Be Identified On Financial Reserve Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Reserve_Currency_Type(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@name='currencyTypeList']")); //Unique Id Of Currency Type DropDown On Financial Reserve Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_ClaimReserveSummary_Currency_Option
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type DropDown Will Be Identified On Financial Reserve Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_ClaimReserveSummary_Currency_Option(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='table table-hover']")); //Unique Id Of Currency Type DropDown On Financial Reserve Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Option_Button
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type Checkbox Will Be Identified On Globalization Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Option_Button(WebDriver driver,int counter)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='MyRadioButton']//ancestor::td[@id='MultiCurrencySetupGrid_gvData_ctl00_"+counter+"']"));
			//Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_Button_Edit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type Checkbox Will Be Identified On Globalization Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_Button_Edit(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("MultiCurrencySetupGrid_Edit")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_FinancialReserve_UnitCoverageFinancialSummary_Table
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type Checkbox Will Be Identified On Globalization Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_FinancialReserve_UnitCoverageFinancialSummary_Table(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@class='panel-body filterPadd']//table[@class='table table-hover']")); //Unique Id Of Policy/Unit/Coverage Financial Summary Button On Financial/Reserves Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ClaimReserveSummary_Header
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type Checkbox Will Be Identified On Globalization Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ClaimReserveSummary_Header(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DivHeader")); //Unique Id Of Enhanced Notes Screen Header Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_ClaimReserveSummary_Claimant_Table
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type DropDown Will Be Identified On Financial Reserve Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_ClaimReserveSummary_Claimant_Table(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='claimSummaryDetails']//table[@class='table table-hover']")); //Unique Id Of Currency Type DropDown On Financial Reserve Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Policy_Open_Option
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Open Button Of Policy Field Will Be Identified On Claim Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-11-15-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Policy_Open_Option(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='ctrlHolder']//*[@title='Open']")); //Unique Id Of Open Button Of Policy Field On Claim Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_Policy_CurrencyOption
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type Input Field Will Be Identified On Policy Tracking Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-11-15-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_Policy_CurrencyOption(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lookup_currencyCode']")); //Unique Id Of Currency Type Input Field On Policy Tracking Screen
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_ORG_Level_Drp
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type DropDown Will Be Identified On Financial Reserve Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_LOB_ORG_Level_Drp(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lstCaptionTypes")); //Unique Id Of Currency Type DropDown On Financial Reserve Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchangeRateSetup_Button_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Currency Type DropDown Will Be Identified On Financial Reserve Screen 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-10-31-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchangeRateSetup_Button_Delete(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("MultiCurrencySetupGrid_Delete")); //Unique Id Of Currency Type Check Box On Globalization Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Globalization_EmpSalary_Currency_Type
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Salary Currency Type TextBox Will Be Identified On Claim Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-02-06-2020                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Globalization_EmpSalary_Currency_Type(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lookup_salarycurrency")); //Unique Id Of Employee Salary Currency Type TextBox On Claim Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchRateSetup_SelectRadioButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Radio Button for One Record Will Be Selected On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-26-2020                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchRateSetup_SelectRadioButton(WebDriver driver, String SourceCurrency, String DestinationCurrency)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+SourceCurrency+"')]//ancestor::tr[1]/td[4][contains(text(),'"+DestinationCurrency+"')]//ancestor::tr[1]//input[@id='MyRadioButton']")); //Unique Id Of Radio Button for One Record Will Be Selected On Exchange Rate Setup Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_ExchRateSetup_VerifySelectRadioButton
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Verifying Radio Button for One Record Will Be Selected On Exchange Rate Setup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-26-2020                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_ExchRateSetup_VerifySelectRadioButton(WebDriver driver, String SourceCurrency, String DestinationCurrency, String CurrencyRate)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+SourceCurrency+"')]//ancestor::tr[1]/td[4][contains(text(),'"+DestinationCurrency+"')]//ancestor::tr[1]/td[6][contains(text(),'"+CurrencyRate+"')]//ancestor::tr[1]//input[@id='MyRadioButton']")); //Unique Id Of Radio Button for One Verifying Record Will Be Selected On Exchange Rate Setup Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	
}