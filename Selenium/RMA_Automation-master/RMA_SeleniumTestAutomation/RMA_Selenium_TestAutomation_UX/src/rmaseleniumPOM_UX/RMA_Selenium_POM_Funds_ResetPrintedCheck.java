package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_ResetPrintedCheck {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Lst_Bankaccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Funds--->Reset Printed Check  As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Lst_Bankaccount(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.id("ddlBankAcc")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Txt_DateFrom
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check From date On RMA Application Funds--->Reset Printed Check  As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Txt_DateFrom(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@id='txtcheckdatefrom' and @type='text']")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Txt_DateTo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check To date On RMA Application Funds--->Reset Printed Check  As Cleared  Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Txt_DateTo(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@id='txtcheckdateto' and @type='text']")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Btn_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Button On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Btn_Refresh(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@id='RefreshGrid']/i")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Btn_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Button On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Btn_SelectAll(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']")); 
	return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Btn_DeSelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DeSelect All Button On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Btn_DeSelectAll(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope ui-grid-all-selected']")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Btn_MarkAsReleased
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Marked Cleared Button On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Btn_MarkAsReleased(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@id='MarkRelease']/i")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Tbl_SelectChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Checks Table On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Tbl_SelectChecks(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.id("gvSelectChecksFrame")); 
	return Element;
	}
}
