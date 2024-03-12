package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_AdminTracking {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Lst_Table
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table Element On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Lst_Table(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Bond Abstract')]"));//Unique Id  Of Table Element On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Btn_BondType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bond Type Image Lookup Button On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Btn_BondType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btn_bond_type_txcd']"));//Unique Id  Of Bond Type Image Lookup Button On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Txt_BondType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bond Type TextBox On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Txt_BondType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_bond_type_txcd']"));//Unique Id  Of Bond Type TextBox On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_AdminTracking_Txt_BondNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bond Number TextBox On RMA Application Admin Tracking Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-22-2017                                 
	//============================================================================================
	public static WebElement RMAApp_AdminTracking_Txt_BondNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='bond_num_text']"));//Unique Id  Of Bond Number TextBox On RMA Application Admin Tracking Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Btn_AddNew(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("New_FieldListGrid"));//Unique Id Of Add New Button On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Button On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Btn_Edit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Edit_FieldListGrid"));//Unique Id Of Edit Button On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Button On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Btn_Delete(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Delete_AdminTrackingGrid"));//Unique Id Of Delete Button On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Txt_UserTableName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User Table Name TextBox On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Txt_UserTableName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("UserTableName"));//Unique Id Of User Table Name TextBox On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Txt_SystemTableName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which System Table Name TextBox On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Txt_SystemTableName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("SysTableName"));//Unique Id Of System Table Name TextBox On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Chk_AllowSoftDelete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Allow Soft Delete CheckBox On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Chk_AllowSoftDelete(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("AllowSoftDelete"));//Unique Id Of Allow Soft Delete CheckBox On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Btn_SaveTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Btn_SaveTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnSave"));//Unique Id Of Save Button On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Rdo_TableName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Table Name Radio Button On RMA Application Administrative Tracking Page On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Rdo_TableName(WebDriver driver, String TableName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[text()='"+TableName+"']//ancestor::tr[1]//input"));//Unique Id Of Table Name Radio Button On RMA Application Administrative Tracking Page On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Btn_SaveFieldOnTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Administrative Tracking Page On Table Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Btn_SaveFieldOnTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Save_PV"));//Unique Id Of Save Button On RMA Application Administrative Tracking Page On Table Window On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Btn_SaveField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Btn_SaveField(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Save"));//Unique Id Of Save Button On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Txt_FieldType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Field Type DropDown On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Txt_FieldType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("FieldType"));//Unique Id Of Field Type DropDown On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Txt_UserPrompt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User Prompt TextBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Txt_UserPrompt(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("UserPrompt"));//Unique Id Of User Prompt TextBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Txt_SystemFieldName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which System Field Name TextBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Txt_SystemFieldName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("SysFieldName"));//Unique Id Of System Field Name TextBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Chk_DeleteFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Flag ChechBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Chk_DeleteFlag(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DeleteFlag"));//Unique Id Of Delete Flag ChechBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckgUtil_Chk_RequiredFlag
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Required Flag ChechBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckgUtil_Chk_RequiredFlag(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("RequiredFlag"));//Unique Id Of Required Flag ChechBox On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}	
	
	//============================================================================================
	//FunctionName 			: RMAApp_AdmTrckMaint_Btn_CreatedField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Created field Button On RMA Application Administrative Tracking Page On Add Field Window On Utilities Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-28-2019                                 
	//============================================================================================
	public static WebElement RMAApp_AdmTrckMaint_Btn_CreatedField(WebDriver driver, String SysName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//input[contains(@id,'"+SysName+"')]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique Id Of Created field Button On RMA Application Administrative Tracking Page On Add Field Window On Utilities Is Fetched
		return Element;
	}
}
