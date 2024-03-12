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
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Lst_Bankaccount(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.id("selBankAccounts")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Btn_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Button On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Btn_Refresh(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.id("btnRefresh")); 
	return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsResetPrintedCheck_Btn_DeSelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Button On RMA Application Funds--->Reset Printed Check Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsResetPrintedCheck_Btn_SelectAll(WebDriver driver)
	{Element =  null;
	Element = driver.findElement(By.xpath(".//*[@name='ctl05']")); 
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
	Element = driver.findElement(By.id("btnProcess")); 
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
