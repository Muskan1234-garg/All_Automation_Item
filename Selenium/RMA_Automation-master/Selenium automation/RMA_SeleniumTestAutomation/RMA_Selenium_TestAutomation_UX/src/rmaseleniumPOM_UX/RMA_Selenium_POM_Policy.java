package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_Policy {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_PolicyName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name TextBox On Maintenance-->Policy Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_PolicyName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("policyname")); //Unique Id Of Name Of Policy TextBox On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_policyStatus
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy Status TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_policyStatus(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_policystatuscode")); //Unique Id Of Policy Status TextBox On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_Premium
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Premium TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_Premium(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='premium' and @type ='text']")); //Unique Id Of Premium TextBox On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_EffectiveDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Effective Date TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_EffectiveDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='effectivedate' and @type ='text']")); //Unique Id Of Effective Date TextBox On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_ExpirationDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Expiration Date TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_ExpirationDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='expirationdate' and @type ='text']")); //Unique Id Of Expiration Date TextBox On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_PolicyNumber
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy Number TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_PolicyNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("policynumber")); //Unique Id Of Policy Number TextBox On Policy Page Is Fetched
		return Element;
	}
	
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_BrokerInfoAddress4Line
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address Line 4 TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_BrokerInfoAddress4Line(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("brkaddr4")); //Unique Id Of Address Line 4 TextBox On Policy Page Is Fetched
		return Element;
	}
	
	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Coverage Type TextBox On Policy Coverage Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-12-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_CoverageType(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='lookup_coveragetypecode' and @type ='text']")); //Unique Id Of Coverage Type TextBox On Policy Coverage Page Is Fetched
		return Element;
	}
	
	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_PolicyCoverage_Txt_BrokerLastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Broker Last Name TextBox On Policy Coverage Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-12-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_PolicyCoverage_Txt_BrokerLastName(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("brokername")); //Unique Id Of Broker Last Name TextBox On Policy Coverage Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Policy_chk_PrimaryPolicy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Primary Policy checkBox  On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Policy_chk_PrimaryPolicy(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.id("primarypolicyflg")); ///Unique xpath Of Primary Policy CheckBox On Policy Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Policy_chk_ClaimsMadeCoverage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Claims Made Coverage checkBox  On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Policy_chk_ClaimsMadeCoverage(WebDriver driver)
	{
		Element = null;		
		Element = driver.findElement(By.id("triggerclaimflag")); ///Unique xpath Of Claims Made Coverage CheckBox On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Tab_PolicyInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy Information Tab On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Tab_PolicyInfo(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Policy Information ')]//i")); //Unique Id Of Policy Information Tab On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Tab_InsurerInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Insurer Information Tab On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Tab_InsurerInfo(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Insurer Information ')]//i")); //Unique Id Of Insurer Information Tab On Policy Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Tab_BrokerInfo
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Broker Information Tab On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Tab_BrokerInfo(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Broker Information ')]//i")); //Unique Id Of Broker Information Tab On Policy Page Is Fetched
		return Element;
	}

	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplementals Tab On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Tab_Supplementals(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath("//*[contains(text(),'Supplementals ')]//i")); //Unique Id Of Supplementals Tab On Policy Page Is Fetched
		return Element;
	}
	
	// =================================================================================================================================================================================================
		//FunctionName 			: RMAApp_Policy_Tab_CoverageInfo
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Coverage Information Tab On Policy Coverage Page Can Be Identified
		//Input Parameter 		: Entity Variable Of The Type WebEntity		 
		//Revision				: 0.0 - AbhishekRai-11-08-2017                                 
		//================================================================================================================================================================================================
		public static WebElement RMAApp_Policy_Tab_CoverageInfo(WebDriver Entity)
		{
			Element = null;
			Element = Entity.findElement(By.xpath("//*[contains(text(),'Coverage Information ')]//i")); //Unique Id Of Coverage Information Tab On Policy Coverage Page Is Fetched
			return Element;
		}

	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Btn_SubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Submit Query Button On Search Criteria On On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Btn_SubmitQuery(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.xpath(".//*[@id='submitquery']/i")); //Unique Id Of Submit Query Button On Search Criteria On Policy Page Is Fetched
		return Element;
	}

	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Btn_Insurer
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Insurer Button On Search Criteria On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Btn_Insurer(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("btn_inslastname")); //Unique Id Of Insurer Button On Search Criteria On Policy Page Is Fetched
		return Element;
	}

	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Btn_Insured
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Insured Button On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Btn_Insured(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("btn_policyInsured")); //Unique Id Of Insured Button On Policy Page Is Fetched
		return Element;
	}
	
	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Btn_ClonePolicy
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Clone Policy Button On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-09-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Btn_ClonePolicy(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("Clone Policy")); //Unique Id Of Clone Policy Button On Policy Page Is Fetched
		return Element;
	}

	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account ListBox On Policy Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-11-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Lst_BankAccount(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("bankaccount")); //Unique Id Of Bank Account ListBox On Policy Page Is Fetched
		return Element;
	}

	// =================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Btn_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Coverage Type Button On Coverage Page Can Be Identified
	//Input Parameter 		: Entity Variable Of The Type WebEntity		 
	//Revision				: 0.0 - AbhishekRai-12-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Btn_CoverageType(WebDriver Entity)
	{
		Element = null;
		Element = Entity.findElement(By.id("btn_coveragetypecode")); //Unique Id Of Coverage Type Button On Coverage Page Is Fetched
		return Element;
	}
	
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_PolicyLimit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy Limit TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-12-06-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_PolicyLimit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='policylimit' and @type ='text']")); //Unique Id Of Policy Limit TextBox On Policy Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Policy_Btn_GenericLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name )  On The Basis Of Which Coverage Lookup Button On Policy Coverage Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-08-2017                                  
	//============================================================================================
	public static WebElement RMAApp_Policy_Btn_GenericLookup(WebDriver driver)
	{
		Element = null;		
		//Element = driver.findElement(By.xpath(".//*[@id='frmData']/div[1]/div[2]/a/i")); ///Unique xpath Of Employee Number TextBox On RMA Application Claim Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Lookup']"));
		return Element;
	}
	
	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_Policy_Txt_PolicyMCO
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy MCO TextBox On Policy Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-11-08-2017                                 
	//================================================================================================================================================================================================
	public static WebElement RMAApp_Policy_Txt_PolicyMCO(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_mcoeid' and @type ='text']")); //Unique Id Of Policy MCO TextBox On Policy Page Is Fetched
		return Element;
	}
	
	//=================================================================================================================================================================================================
		//FunctionName 			: RMAApp_PolicyLookup_Txt_PolicyName
		//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Policy Name TextBox On Policy LookUp Window On Policy page Can Be Identified
		//Input Parameter 		: Driver Variable Of The Type WebDriver		 
		//Revision				: 0.0 - AbhishekRai-11-08-2017                                 
		//================================================================================================================================================================================================
		public static WebElement RMAApp_PolicyLookup_Txt_PolicyName(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath("//*[contains(text(),'Policy Name')]//ancestor::div[2]/div[2]//*[@class = 'ui-grid-filter-container ng-scope']//*[@class = 'ng-scope']//input")); //Unique Id Of Policy Name TextBox Policy LookUp Window On Policy Page Is Fetched
			return Element;
		}
}
