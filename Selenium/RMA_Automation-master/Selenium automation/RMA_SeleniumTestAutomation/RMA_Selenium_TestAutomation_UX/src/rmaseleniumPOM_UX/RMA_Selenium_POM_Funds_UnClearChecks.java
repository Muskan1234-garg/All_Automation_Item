package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_UnClearChecks {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_FundsUnClearChecks_Lst_Bankaccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Funds--->UnClearChecks As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsUnClearChecks_Lst_Bankaccount(WebDriver driver)
	{Element=null;
	Element = driver.findElement(By.id("selBankAccounts")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsUnClearChecks_Btn_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Button On RMA Application Funds--->UnClearChecks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsUnClearChecks_Btn_Refresh(WebDriver driver)
	{
		Element=null;
	Element = driver.findElement(By.xpath(".//*[@value='Refresh']")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsUnClearChecks_Btn_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Button On RMA Application Funds--->UnClear Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsUnClearChecks_Btn_SelectAll(WebDriver driver)
	{ 	
		Element=null;
		Element = driver.findElement(By.name("ctl10")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsUnClearChecks_Btn_MarkUncleared
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Mark Uncleared Button On RMA Application Funds--->UnClear Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsUnClearChecks_Btn_MarkUncleared(WebDriver driver)
	{

		Element=null;
		Element = driver.findElement(By.id("btnProcess1")); 
		return Element;
	}

}
