package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_CustomPayNotification 
{
	public static WebElement Element = null;
	//============================================================================================
	//FunctionName 			: RMAApp_FundsCustomPayNotification_Rdb_ShowPaymntsDueBy
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show Payments Due By Radio Button On Custom Payment Notification Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-12-18-2017                            
	//============================================================================================
	public static WebElement RMAApp_FundsCustomPayNotification_Rdb_ShowPaymntsDueBy(WebDriver driver)
	{
		Element = driver.findElement(By.id("weekmonth")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsCustomPayNotification_Rdb_EndOfMonth
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which End Of Month Radio Button On Custom Payment Notification Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-12-18-2017                            
	//============================================================================================
	public static WebElement RMAApp_FundsCustomPayNotification_Rdb_EndOfMonth(WebDriver driver)
	{
		Element = driver.findElement(By.id("month")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsCustomPayNotification_Btn_Refresh
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Refresh Button On Custom Payment Notification Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-12-18-2017                            
	//============================================================================================
	public static WebElement RMAApp_FundsCustomPayNotification_Btn_Refresh(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnSubmit")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsCustomPayNotification_Btn_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Button On Custom Payment Notification Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-12-18-2017                            
	//============================================================================================
	public static WebElement RMAApp_FundsCustomPayNotification_Btn_Print(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnPrint")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FundsCustomPayNotification_Lbl_NumberOfChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Number Of Checks On Custom Payment Notification Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-12-18-2017                            
	//============================================================================================
	public static WebElement RMAApp_FundsCustomPayNotification_Lbl_NumberOfChecks(WebDriver driver)
	{
		Element = driver.findElement(By.id("lblChecks")); 
		return Element;
	}
}
