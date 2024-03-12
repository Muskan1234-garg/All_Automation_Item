package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_SupplementalField {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_SupplementalField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental CheckBox On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_SupplementalField(WebDriver driver,String Text)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[@id='selectrdo' and @value='"+Text+"']")); //Unique Id  Of Supplemental CheckBox On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_SupplementalFieldEdit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Field Edit Image Button  On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_SupplementalFieldEdit(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Edit_SupplementalDataGrid")); //Unique Id  Of Supplemental Field Edit Image Button On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_SupplementalNewFieldAdd
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Field Add New Image Button  On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_SupplementalNewFieldAdd(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("New_FieldListGrid")); //Unique Id  Of Supplemental Field Add New Image Button On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Lst_FieldSelect
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Field Select List On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Lst_FieldSelect(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("FieldType")); //Unique Id  Of Supplemental Field Select List On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Txt_UserPrompt
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On User Prompt TextBox On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Txt_UserPrompt(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("UserPrompt")); //Unique Id  Of User Prompt TextBox On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Txt_SystemFieldName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On System Field Name TextBox On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Txt_SystemFieldName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("SysFieldName")); //Unique Id  Of System Field Name TextBox On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Img_SaveAddField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Save Image Button On Add Field Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Img_SaveAddField(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Save")); //Unique Id  Of Save Image Button On Add Field Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Img_SaveSupplemental
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Save Image Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Img_SaveSupplemental(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Save_PV")); //Unique Id  Of Save Image Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_Required
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Required CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-15-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_Required(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("RequiredFlag")); //Unique Id  Of Required CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_EditFieldOnLastWindow
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Edit button On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-16-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_EditFieldOnLastWindow(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("Edit_FieldListGrid")); //Unique Id  Of Edit Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_DeleteField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Delete Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-16-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_DeleteField(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("DeleteFlag")); //Unique Id  Of Delete Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}
}