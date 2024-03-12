package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_CombinedPayment 
{
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Lnk_CombinedPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Combined Payment Link On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Lnk_CombinedPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABScombinedpay']")); //Unique x-path  Of Combined Payment Link On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bankaccount']")); //Unique x-path  Of Bank Account List On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_StopAsOf	
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop As Of Date TextBox On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-25-2018                                
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_StopAsOf(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("stopdate")); //Unique Id Of  Stop As Of Date TextBox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Chk_StopCombinedPay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Combined Pay Check Box On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-01-25-2018                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Chk_StopCombinedPay(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("stopcombpay")); //Unique Id  Of Last Name Textbox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Textbox On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_rmalookupfinanciallastname2_lastName' and@ type='text']")); //Unique Id  Of Last Name Textbox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Lnk_ScheduleSetUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Schedule SetUp Link On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Lnk_ScheduleSetUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSschedulesetup']")); //Unique x-path  Of Schedule SetUp Link On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_PayInterval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay Interval Text Box On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_PayInterval(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_payment_interval")); //Unique Id  Of Pay Interval Text Box On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}	
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Btn_PayInterval
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay Interval Search Button On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                  
	//============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Btn_PayInterval(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_payment_interval_openlookup")); //Unique Id  Of Pay Interval Search Button On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_NxtSchDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Scheduled Date TextBox On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                  
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_NxtSchDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("nxtschdate")); //Unique Id Of Next Scheduled Date TextBox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_Startdate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Start Date TextBox On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_Startdate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("startdate")); //Unique Id Of Start Date TextBox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_NxtSchdPrint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Scheduled Print Date TextBox On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_NxtSchdPrint(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("nxtschdprint")); //Unique Id Of Next Scheduled Print Date TextBox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_NxtPrintOverride
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Scheduled Print Date TextBox On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-08-14-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_NxtPrintOverride(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("nxtprintoverride")); //Unique Id Of Next Scheduled Print Date TextBox On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Lst_CombinedPayeeSelection
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Payee Last Name Is Selected On RMA Application Combined Payment SetUp Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-06-2017                              
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Lst_CombinedPayeeSelection(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='optResults']")); //Unique x-path  Of Payee Last Name List On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Btn_ChooseHighlighted
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Choose Highlighted Button On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-06-2017                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Btn_ChooseHighlighted(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("cmdSubmit2")); //Unique Id Of Choose Highlighted Button On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CombinePayment_Tab_CombinedPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Combined Payment Tab On RMA Application Combined Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-04-04-2018                                  
	//============================================================================================
	public static WebElement RMAApp_CombinePayment_Tab_CombinedPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Combined Payment ')]/i")); //Unique x-path Of Acord Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CombinePayment_Tab_ScheduleSetup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Schedule Tab On RMA Application Combined Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-04-04-2018                                  
	//============================================================================================
	public static WebElement RMAApp_CombinePayment_Tab_ScheduleSetup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Schedule Setup ')]/i")); //Unique x-path Of Acord Tab On RMA Application Claim Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Btn_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Button On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-29-2018                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Btn_Lookup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='material-icons material-icons-clr']/ancestor::span[@aria-label='Lookup']")); //Unique Id Of Lookup Button On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMA_CombinedPaySetUp_Txt_LookupLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Text Box On Combined Payment Lookup On RMA Application Combined Payment SetUp Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-29-2018                                 
	// ============================================================================================
	public static WebElement RMA_CombinedPaySetUp_Txt_LookupLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Last Name')]/ancestor::div[2]/div[2]/div[1]/div[1]/input")); //Unique Id Of Last Name Text Box On Combined Payment Lookup On RMA Application Combined Payment SetUp Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CombinePayment_Tab_StopPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Stop Payment Tab On RMA Application Combined Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-29-2018                                 
	//============================================================================================
	public static WebElement RMAApp_CombinePayment_Tab_StopPayment(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Stop Payment')]/i")); //Unique x-path Of Stop Payment Tab On RMA Application Combined Payment Page  Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_CombinePayment_Btn_ClosePeriods
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Image Button On Pay Interval Lookup On RMA Application Combined Payment Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-29-2018                                 
	//============================================================================================
	public static WebElement RMAApp_CombinePayment_Btn_ClosePeriods(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='glyphicon glyphicon-remove closeBtn']")); //Unique x-path Of Close Image Button On Pay Interval Lookup On RMA Application Combined Payment Page  Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName                    : RMAApp_Funds_CombinedPayment_Txt_Link
	//Description                     : To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Combined Payment in Funds On RMA Application Employee Page Can Be Identified
	//Input Parameter                 : Driver Variable Of The Type WebDriver       
	//Revision                        : 0.0 - NikitaThani-05-29-2018                          
	//============================================================================================
	public static WebElement RMAApp_Funds_CombinedPayment_Txt_Link(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.linkText("Combined Payment"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id Of Combined Payment in Funds On RMA Application Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAAp_CombinedPayment_Btn_State
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  State lookup On RMA Application Bank Account Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - MishalKantawala-06-10-2020                                
	 ============================================================================================ */
	public static WebElement RMAAp_CombinedPayment_Btn_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_pye_stateid_openlookup")); //Unique xpath  Check Stock List On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAAp_CombinedPayment_Txt_State
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  State lookup On RMA Application Bank Account Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - MishalKantawala-06-10-2020                                
	 ============================================================================================ */
	public static WebElement RMAAp_CombinedPayment_Txt_State(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_pye_stateid")); //Unique xpath  Check Stock List On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
	
	/*============================================================================================
	FunctionName 			: RMAAp_CombinedPayment_Btn_Country
	Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Country lookup On RMA Application Bank Account Can Be Identified
	Input Parameter 		: Driver Variable Of The Type WebDriver		 
	Revision				: 0.0 - MishalKantawala-06-10-2020                                
	 ============================================================================================ */
	public static WebElement RMAAp_CombinedPayment_Btn_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_pye_countrycode_openlookup")); //Unique xpath  Check Stock List On RMA Application Bank Account-->SubAccount Page Is Fetched
		return Element;
	}
}
