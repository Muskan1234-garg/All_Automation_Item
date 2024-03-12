package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Utilities_PolicyInterfaceCodeMapping {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Lst_SelectPolicySystem
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Lst_SelectPolicySystem(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("lstPolicySystem")); //Unique Id  Of Add New Button On RMA Application Policy Interface Code Mapping Page Is Fetched
		} catch (Exception e) {
			System.out.println("Element No Found");
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Lst_SelectCodeType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy System Type TextBox On Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Lst_SelectCodeType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstCodeType")); //Unique Id  Of  Which Policy System Type TextBox On Policy Interface Code Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Lst_RiskmasterCodes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Policy System Name TextBox On Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Lst_RiskmasterCodes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstRMCodes")); //Unique Id  Of  Policy System Name TextBox On Policy Interface Code Mapping Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Lst_PolSysInterfaceCodes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Mapping Table Prefix TextBox On Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Lst_PolSysInterfaceCodes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstPolSysCodes")); //Unique Id  Of  Mapping Table Prefix TextBox On Policy Interface Code Mapping Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Btn_AddSPolicybtn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Btn_AddSPolicybtn(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("addSPolicybtn")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Btn_RemovePolicybtn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Btn_RemovePolicybtn(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("removePolicybtn")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PolInterfaceCode_Tbl_PolicyCodeMappingGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  forgot password link value in Hex Format TextBox On Policy Interface Code Mapping Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-02-14-2019                                 
	//============================================================================================
	public static WebElement RMAApp_PolInterfaceCode_Tbl_PolicyCodeMappingGrid(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.id("gvPolicyCodeMappingGrid"));
		} catch (Exception e) {
		} 
		return Element;
	}

}