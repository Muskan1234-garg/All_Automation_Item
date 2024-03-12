package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_BulkCheckRelease {
	public static WebElement Element;


	//============================================================================================
	//FunctionName 			: RMAApp_FundsBulkCheckRelease_Btn_ClaimNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Funds--->Bulk Check Release Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_ClaimNumber(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtClaimNumberbtn")); 
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
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Btn_Search(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnSearch")); 
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
		Element = driver.findElement(By.name("ctl04")); 
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
		Element = driver.findElement(By.id("btnProcess")); 
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
		Element = driver.findElement(By.id("btnClose")); 
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
	//Revision				: 0.0 - NidhiJha-09-12-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsBulkCheckRelease_Txt_ClaimNumber(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtClaimNumber")); 
		return Element;
	}
}
