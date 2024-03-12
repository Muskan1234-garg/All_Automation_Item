package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_BulkCheckRelease {
	public static WebElement Element;


	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_ClaimNumberLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_ClaimNumberLookup(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btn_claimnumber")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Txt_ClaimSearchClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Number TextBox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_ClaimSearchClaimNumber(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("FLD100")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_ClaimSearchSubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Query Button On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_ClaimSearchSubmitQuery(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnSubmit1")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_Search
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Search Button On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-09-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_Search(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrePrint' and @uib-tooltip='Search']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Button On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_SelectAll(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'bulkCheckGrid')]//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")); //Unique Id  Of Reserve First Row Selection CheckBox Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_Process
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Process Button On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_Process(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id ='btnSaveComment']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckReleaseProcessPayments_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Funds--->Bulk Check Release--->Process Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckReleaseProcessPayments_Btn_Close(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("hConApprClose")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Txt_Msg
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Message On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -NidhiJha-09-12-2017                                                                   
	//============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_Msg(WebDriver driver, String Text)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Text+"')]"));
		} catch (Exception|Error e) {	
			System.out.println(Text + " Text Not Found On RMA Application");
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Txt_ClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Number TextBox On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-09-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_ClaimNumber(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("lookup_claimnumber")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Txt_ClaimSearchClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account Name TextBox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-09-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_AccountName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txt_accountname")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Lst_CurrentStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Current Status Drop-Down ListBox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-28-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Lst_CurrentStatus(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("dllCheckStatus")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Txt_TransactionFromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction From Date Textbox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-28-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_TransactionFromDate(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='txt_transactionfromdate' and @type='text']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Txt_TransactionToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transaction To Date Textbox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-28-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_TransactionToDate(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='txt_transactiontodate' and @type='text']")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_SearchResults_Chk_ReadyToPrint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ready To Print Checkbox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-28-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SearchResults_Chk_ReadyToPrint(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("chkReadyToPrint")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_SearchResults_Lst_TargetCheckStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Target Check Status Listbox On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-11-28-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SearchResults_Lst_TargetCheckStatus(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Target Check Status:')]//ancestor::div[2]//select")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_CloseProcessedPay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Processed Payments PopUp On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_CloseProcessedPay(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btnSaveComment']/i[contains(text(),'cancel')]")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_BulkCheckRel_Tbl_ProcessPayments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table On Process Payments PopUp On RMA Application Funds--->Bulk Check Release--->Claim Search Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-27-2020                                 
	// ============================================================================================
	public static WebElement RMAApp_BulkCheckRel_Tbl_ProcessPayments(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Process Payments')]//ancestor::div[4]//tbody")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_CloseSearchResults
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On Search Results PopUp On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-02-04-2021                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_CloseSearchResults(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='btnCancelComment']/i[contains(text(),'cancel')]")); 
		return Element;
	}
}