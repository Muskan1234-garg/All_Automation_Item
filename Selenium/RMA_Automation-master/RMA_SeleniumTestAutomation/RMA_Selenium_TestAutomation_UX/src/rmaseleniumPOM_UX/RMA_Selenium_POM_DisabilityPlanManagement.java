package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_DisabilityPlanManagement {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_PlanNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Number/Code Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_PlanNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("plannumber")); //Unique Id  Of Plan Number/Code Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_Planname
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Name Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_PlanName(WebDriver driver)
	{
		Element = driver.findElement(By.id("planname")); //Unique Id  Of Plan Name Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_PlanDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Description Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_PlanDescription(WebDriver driver)
	{
		Element = driver.findElement(By.id("plandesc")); //Unique Id  Of Plan Description Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan StatusText Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                  
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_PlanStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_planstatuscode")); //Unique Id  Of Plan Status Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Btn_PlanStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Status Button On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                  
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Btn_PlanStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_planstatuscode_openlookup")); //Unique Id  Of Plan Status Button On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Effective Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_EffectiveDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='effectivedate' and @type ='text']")); //Unique Id Of Effective Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expiration Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                              
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_ExpirationDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate' and @type ='text']")); //Unique Id Of Expiration Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                              
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup_countrycode")); //Unique Id Of Country Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                              
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Btn_Country(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_countrycode_openlookup	")); //Unique Id Of Country Button On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_Insured
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Insured(s)/Account(s) Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_Insured(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lookup_insuredlist']/ul/li/input")); //Unique Id Of Insured(s)/Account(s) Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched

		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Btn_Insured
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Insured(s)/Account(s) Button On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Btn_Insured(WebDriver driver)
	{
		Element = driver.findElement(By.id("btn_insuredlist")); //Unique Id Of Insured(s)/Account(s) Button On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_Premium
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Premium Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_Premium(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='premium' and @type ='text']")); //Unique Id  Of Premium Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Lst_BankAccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankaccount")); //Unique Id Of Bank Account ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_PayPeriodStartDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pay Period Start Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_PayPeriodStartDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id ='startofpayperiod' and @type ='text']")); //Unique Id Of Pay Period Start Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_IssueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Issue Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_IssueDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id ='issuedate' and @type = 'text']")); //Unique Id Of Issue Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_ReviewDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Review Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_ReviewDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id = 'reviewdate' and @type = 'text']")); //Unique Id Of Review Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_RenewalDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Renewal Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_RenewalDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id = 'renewaldate' and @type = 'text']")); //Unique Id Of Renewal Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Txt_CancelDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018                                 
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Txt_CancelDate(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id = 'canceldate' and @type = 'text']")); //Unique Id Of Cancel Date Text Box On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_CheckBox_CheckPrintsBeforeEndOfPayPeriod
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which CheckPrintsBeforeEndOfPayPeriod CheckBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-13-2018                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_CheckBox_CheckPrintsBeforeEndOfPayPeriod(WebDriver driver)
	{
		Element = driver.findElement(By.id("printbeforepayendflag")); //Unique Id Of CheckPrintsBeforeEndOfPayPeriod CheckBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}	

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lst_PreferredPaymentSchedule
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PreferredPaymentSchedule ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Lst_PreferredPaymentSchedule(WebDriver driver)
	{
		Element = driver.findElement(By.id("prefpayschedcode")); //Unique Id Of PreferredPaymentSchedule ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lst_PreferredDayOfWeekForPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PreferredDayOfWeekForPayments ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Lst_PreferredDayOfWeekForPayments(WebDriver driver)
	{	
		Element = null;
		try{
			Element = driver.findElement(By.id("prefpaydaycode")); //Unique Id Of PreferredDayOfWeekForPayments ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		}
		catch(Exception|Error e){
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lst_MonthlyPaymentType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Monthly Payment Type ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Lst_MonthlyPaymentType(WebDriver driver)
	{
		Element = driver.findElement(By.id("typeofmonthlypay")); //Unique Id Of Monthly Payment Type ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lst_PreferredMonthlyDay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Preferred Monthly Day ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Lst_PreferredMonthlyDay(WebDriver driver)
	{
		Element = null;
		try{
			Element = driver.findElement(By.id("prefDayOfMCode")); //Unique Id Of Preferred Monthly Day ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		}
		catch(Exception|Error e){
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lst_PreferredPrintDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Preferred Print Date ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-07-11-2018          	                   
	//============================================================================================
	public static WebElement RMAApp_DisabilityPlanManagement_Lst_PreferredPrintDate(WebDriver driver)
	{
		Element = driver.findElement(By.id("prefdate")); //Unique Id Of Preferred Print Date ListBox On RMA Application's Maintenance-->DisabilityPlanManagement Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lookup_Txt_PlanNum
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PlanNumber TextBox On Vehicle Lookup Page On RMA Application Can Be Identified 	
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-03-2018                                
	//============================================================================================

	public static WebElement RMAApp_DisabilityPlanManagement_Lookup_Txt_PlanNum(WebDriver driver)
	{
		{
			Element = driver.findElement(By.xpath(".//*[@class='ui-grid-filter-container ng-scope']/div[@class='ng-scope']/input")); //Unique Id Of PlanNumber TextBox On DisabilityPlanManagement Lookup Page Is Fetched
			return Element;
		}
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Tab_Supplemental
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Tab On Disability Plan Management Page On RMA Application Can Be Identified 	
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-08-03-2018                                
	//============================================================================================

	public static WebElement RMAApp_DisabilityPlanManagement_Tab_Supplemental(WebDriver driver)
	{
		{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique Id Of Supplemental Tab On DisabilityPlanManagement Page Is Fetched
			return Element;
		}
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Tab_PlanInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Information Tab On Disability Plan Management Page On RMA Application Can Be Identified 	
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-20-2018                                
	//============================================================================================

	public static WebElement RMAApp_DisabilityPlanManagement_Tab_PlanInfo(WebDriver driver)
	{
		{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Plan Information')]/i")); //Unique Id Of Plan Information Tab On DisabilityPlanManagement Page Is Fetched
			return Element;
		}
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_DisabilityPlanManagement_Lnl_RightHandSideChild
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Plan Information Tab On Disability Plan Management Page On RMA Application Can Be Identified 	
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-11-20-2018                                
	//============================================================================================

	public static WebElement RMAApp_DisabilityPlanManagement_Lnl_RightHandSideChild(WebDriver driver, String Text)
	{
		{
			Element = driver.findElement(By.xpath(".//*[@class='rightPanel-alink ng-binding' and contains(text(),'"+Text+"')]")); //Unique Id Of Plan Information Tab On DisabilityPlanManagement Page Is Fetched
			return Element;
		}
	}

}
