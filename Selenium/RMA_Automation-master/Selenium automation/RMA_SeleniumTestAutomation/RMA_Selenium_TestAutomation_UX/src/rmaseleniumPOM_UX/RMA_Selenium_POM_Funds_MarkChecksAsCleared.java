package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_MarkChecksAsCleared {

	public static WebElement Element = null;


	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Lst_Bankaccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Lst_Bankaccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("selBankAccounts")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Btn_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Button On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Btn_SelectAll(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@name='ctl10']")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Btn_DeSelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DeSelect All Button On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Btn_DeSelectAll(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@name='ctl11']")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Btn_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Button On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Btn_Refresh(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnRefresh"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Btn_MarkCleared
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Marked Cleared Button On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Btn_MarkCleared(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnProcess2")); 
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Txt_ZeroChecksToDisplay
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Zero Checks To Display Message On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Txt_ZeroChecksToDisplay(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gvSelectChecksFrame']/tbody/tr/td")); 
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_FundsMarkChecks_Txt_Msg
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Message On RMA Application Funds--->Mark Checks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -NidhiJha-05-31-2017                                                                   
	//============================================================================================
	public static WebElement RMAApp_FundsMarkChecks_Txt_Msg(WebDriver driver, String Text)
	{
		Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Text+"')]"));
		} catch (Exception|Error e) {	
			System.out.println(Text + " Text Not Found On RMA Application");
		}
		return Element;
	}
}

