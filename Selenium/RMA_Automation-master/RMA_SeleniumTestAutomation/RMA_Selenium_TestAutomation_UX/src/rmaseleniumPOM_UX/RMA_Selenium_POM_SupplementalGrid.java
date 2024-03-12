package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Imported

public class RMA_Selenium_POM_SupplementalGrid {
	public static WebElement Element = null;

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_SupplementalGrid_Btn_AddRow
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add New Row Image Button On Supplemental Grid Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_SupplementalGrid_Btn_AddRow(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnRoute']/i")); //Unique Id Of Add New Row Image Button On Supplemental Grid Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_SupplementalGrid_Btn_OK
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which OK Image Button On Supplemental Grid Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_SupplementalGrid_Btn_OK(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnRouteCancel']/i")); //Unique Id Of OK Image Button On Supplemental Grid Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_SupplementalGrid_Txt_Department
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Department TextBox On Supplemental Grid Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_SupplementalGrid_Txt_Department(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-00FV']/textarea")); //Unique Id Of Department TextBox On Supplemental Grid Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[contains(@class,'animate msd-elastic')]")); //Unique Id Of TextBox On Supplemental Grid Page Is Fetched
		return Element;
	}

	//=================================================================================================================================================================================================
	//FunctionName 			: RMAApp_SupplementalGrid_Btn_DeleteRow
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Delete Row Image Button On Supplemental Grid Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-21-2017                                 
	// ================================================================================================================================================================================================
	public static WebElement RMAApp_SupplementalGrid_Btn_DeleteRow(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Delete Row']")); //Unique Id Of Delete Row Image Button On Supplemental Grid Page Is Fetched
		return Element;
	}
}
