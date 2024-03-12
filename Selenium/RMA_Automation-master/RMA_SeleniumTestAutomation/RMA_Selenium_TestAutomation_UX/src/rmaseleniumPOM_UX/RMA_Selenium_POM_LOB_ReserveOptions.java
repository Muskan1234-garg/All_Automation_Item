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

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chkbox_AllocateReservesWhenAutoChecksCreated
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allocate Reserves when Auto Checks are created CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-18-2019                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chkbox_AllocateReservesWhenAutoChecksCreated(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("AllocateAutoChecks")); 
		return Element;
	} 

	//================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_LOB_Chkbox_DisplayReserveAllocation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Display Reserve Allocation on Summary Screens CheckBox On RMA Application Line Of Business ParameterSetup Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-18-2019                                 
	//================================================================================================================================================================================================================

	public static WebElement RMAApp_LOB_Chkbox_DisplayReserveAllocation(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DisplayAllocation")); 
		return Element;
	} 
}
