package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_GST {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Chk_GSTRegistered
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Registered Check Box On Entity Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Chk_GSTRegistered(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("gstregistered")); //Unique Id Of GST Registered Check Box On Entity Maintenance Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_ABNGSTNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ABN/GST Number Text Box On Entity Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_ABNGSTNumber(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("gstnumber")); //Unique Id Of ABN/GST Number Text Box On Entity Maintenance Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_GSTRegistrationStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Registration Status Text Box On Entity Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_GSTRegistrationStatus(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lookup_gststatus")); //Unique Id Of GST Registration Status Text Box On Entity Maintenance Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Btn_GSTRegistrationStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Registration Status Lookup Button On Entity Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Btn_GSTRegistrationStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_gststatus_openlookup")); //Unique Id Of GST Registration Status Lookup Button On Entity Maintenance Page Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Chk_SettlementPayment
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Settlement Payment Check Box On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Chk_SettlementPayment(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("gstsettlementflag")); //Unique Id Of Settlement Payment Check Box On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_GSTStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Status Text Box On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_GSTStatus(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lookup_gststatuscode")); //Unique Id Of GST Status Text Box On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Btn_GSTStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Status Lookup Button On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Btn_GSTStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_gststatuscode_openlookup")); //Unique Id Of GST Status Lookup Button On Transaction Screen Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Tab_GSTDetails
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Tab_GSTDetails(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'GST Details')]//i")); //Unique Id Of GST Details Tab On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_GSTExclusiveAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Exclusive Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_GSTExclusiveAmount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='fundsAmtExcGST' and @type='text']")); //Unique Id Of GST Exclusive Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_GSTInclusiveAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Inclusive Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_GSTInclusiveAmount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='fundsAmtIncGST' and @type='text']")); //Unique Id Of GST Inclusive Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_GSTRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Rate Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_GSTRate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gstRate' and @type='number']")); //Unique Id Of GST Rate Text Box On GST Details Tab On Transaction Screen Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_GSTAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_GSTAmount(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gstAmount' and @type='text']")); //Unique Id Of GST Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_ITCEntitlement 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ITC Entitlement Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_ITCEntitlement(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='itcInsurer' and @type='number']")); //Unique Id Of ITC Entitlement Text Box On GST Details Tab On Transaction Screen Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_ITCAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ITC Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_ITCAmount(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='itcAmount' and @type='text']")); //Unique Id Of ITC Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_ITCEntitlementPayee 
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ITC Entitlement Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_ITCEntitlementPayee(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='itcPayee' and @type='number']")); //Unique Id Of ITC Entitlement Text Box On GST Details Tab On Transaction Screen Is Fetched
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_ITCAmountPayee
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ITC Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_ITCAmountPayee(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='itcPayeeAmt' and @type='text']")); //Unique Id Of ITC Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_DecreasingAdjustmentAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Decreasing Adjustment Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_DecreasingAdjustmentAmount(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='descAdjAmount' and @type='text']")); //Unique Id Of Decreasing Adjustment Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_ExcessonInsurance
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Excess on Insurance Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_ExcessonInsurance(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='excessInsurance' and @type='text']")); //Unique Id Of Excess on Insurance Text Box On GST Details Tab On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_IncreasingAdjustmentAmount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Increasing Adjustment Amount Text Box On GST Details Tab On Transaction Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_IncreasingAdjustmentAmount(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='incAdjAmount' and @type='text']")); //Unique Id Of Increasing Adjustment Amount Text Box On GST Details Tab On Transaction Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	
	
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_PolicyGSTExclusivePremium
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which GST Exclusive Premium Text Box On Policy Information Tab On Policy Tracking Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_PolicyGSTExclusivePremium(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='premiumWOGST' and @type='text']")); //Unique Id Of GST Exclusive Premium Text Box On Policy Information Tab On Policy Tracking Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	
	
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GST_Txt_PolicyUnitITCRate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ITC Rate Text Box On Unit Info Tab On Policy Unit Screen Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-17-2019                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_GST_Txt_PolicyUnitITCRate(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='itcRate']")); //Unique Id Of ITC Rate Text Box On Unit Info Tab On Policy Unit Screen Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}	
}
