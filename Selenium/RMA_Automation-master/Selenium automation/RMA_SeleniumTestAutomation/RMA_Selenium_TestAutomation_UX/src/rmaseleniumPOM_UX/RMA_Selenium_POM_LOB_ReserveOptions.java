package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_LOB_ReserveOptions {
	public static WebElement Element = null;



	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chkbox_ChecforInsufficientReserveFunds
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Check for Insufficient Reserve Funds Checkbox On Reserve Options Tab On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chkbox_ChecforInsufficientReserveFunds(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkInsuff")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chkbox_CheckforInsufficientReserveFundsinAutoChecks
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check for Insufficient Reserve Funds in AutoChecks CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chkbox_CheckforInsufficientReserveFundsinAutoChecks(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkInsuffAutoPay")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chkbox_DoNotAllowNegativeReserveAdjustments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Do Not Allow Negative Reserve Adjustments CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-21-2017                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chkbox_DoNotAllowNegativeReserveAdjustments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkNegtiveRA")); 
		return Element;
	} 
}
