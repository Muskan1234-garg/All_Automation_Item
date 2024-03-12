package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_SupplementalsField {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

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

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_FieldVerificationNor
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Delete Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_FieldVerificationNor(WebDriver driver, String FieldType)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='data']//ancestor::tr[1]/td[5]/span[normalize-space(text())='"+FieldType+"']//ancestor::tr[1]/td[8]/span[contains(text(),'No')]//ancestor::tr[1]/td[1]/input"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Verification Of Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_FieldVerification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Delete Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_FieldVerification(WebDriver driver, String FieldType)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='data']//ancestor::tr[1]/td[5]/span[contains(text(),'"+FieldType+"')]//ancestor::tr[1]/td[8]/span[contains(text(),'No')]//ancestor::tr[1]/td[1]/input"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Verification Of Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_FieldNegVerification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Delete Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_FieldNegVerification(WebDriver driver, String FieldType)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='data']//ancestor::tr[1]/td[4]/span[contains(text(),'"+FieldType+"')]//ancestor::tr[1]/td[8]/span[contains(text(),'Yes')]//ancestor::tr[1]/td[1]/input"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Verification Of Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Chk_FieldDeleteVerification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Delete Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Chk_FieldDeleteVerification(WebDriver driver, String FieldType)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='data']//ancestor::tr[1]/td[4]/span[contains(text(),'"+FieldType+"')]//ancestor::tr[1]/td[8]/span[contains(text(),'No')]//ancestor::tr[1]/td[1]/input"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Verification Of Field CheckBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_ModifyGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Modify Grid Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_ModifyGrid(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("ModifyGrid")); //Unique Id Of Add Column Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_AddColumn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Add Column Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_AddColumn(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnAdd")); //Unique Id Of Add Column Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Txt_ColName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Column Name TextBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Txt_ColName(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("txtColName")); //Unique Id Of Column Name TextBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_AddColOk
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Add Column OK Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_AddColOk(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnOK")); //Unique Id Of Add Column OK Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Btn_ColCancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Cancel Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Btn_ColCancel(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("btnClose")); //Unique Id Of Cancel Button On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Txt_FieldSize
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Field Size TextBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Txt_FieldSize(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("FieldSize")); //Unique Id Of Field Size TextBox On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Lst_SupplFieldList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Supplemental Field List On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Lst_SupplFieldList(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("supplementalFieldList")); //Unique Id Of Supplemental Field List On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalFieldSetup_Lst_HyperLink
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis On Supplemental Field List On Supplemental Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-08-13-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalFieldSetup_Lst_HyperLink(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("CodeFileId")); //Unique Id Of Supplemental Field List On Supplemental Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalGroupAsso_Lst_SourceField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Group Association Source Field Select List On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-03-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalGroupAsso_Lst_SourceField(WebDriver driver)
	{
		Element=null;
		try {
			Element = driver.findElement(By.id("SourceField")); //Unique Id  Of Supplemental Group Association Source Field Select List On RMA Application Supplemental Field Setup View Page Is Fetched
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalGroupAsso_Btn_CodesLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Group Association Codes Lookup On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-03-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalGroupAsso_Btn_CodesLookup(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("MultiCodeLookup1_multicodebtn")); //Unique Id  Of Supplemental Group Association Codes Lookup On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalGroupAsso_Btn_EntitiesLookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Group Association Codes Lookup On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-03-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalGroupAsso_Btn_EntitiesLookup(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("GAListbtn2")); //Unique Id  Of Supplemental Group Association Codes Lookup On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalGroupAsso_ChkBox_SelectCode
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Select Code CheckBox On Supplemental Group Association Codes Lookup Window On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-07-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalGroupAsso_ChkBox_SelectCode(WebDriver driver, String CodeDescription)
	{
		Element=null;
		Element = driver.findElement(By.xpath("//input[contains(@value, '"+CodeDescription+"')]/preceding-sibling::input[@type = 'checkbox']")); //Unique Id Of Select Code CheckBox On Supplemental Group Association Codes Lookup Window On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalGroupAsso_Btn_CodeSelectionOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On Supplemental Group Association Code Selection Lookup Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-07-2019                                 
	//============================================================================================
	public static WebElement RMAApp_SupplementalGroupAsso_Btn_CodeSelectionOK(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='btnOk2']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_GenericInputBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Input Box Of Supplemental Field On Supplemental Tab On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_GenericInputBox(WebDriver driver, String SystemName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//input[contains(@id, '"+SystemName+"')]"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Input Box Of Supplemental Field On Supplemental Tab On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_HyperLinkName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis HyperLink Name On Supplemental Tab On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_HyperLinkName(WebDriver driver, String SystemName, String LnkName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'"+SystemName+"')]//following::a[contains(text(),'"+LnkName+"')]"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of HyperLink Name On Supplemental Tab On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_NotExistVerification
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Supplemental Field Not Exist On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_NotExistVerification(WebDriver driver, String SystemName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'"+SystemName+"')]//parent::div[@aria-hidden='false']"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Supplemental Field Not Exist On RMA Application Supplemental Tab Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_GenericSearchButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Search Button For Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-13-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_GenericSearchButton(WebDriver driver, String SystemName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'"+SystemName+"') and @role='button']/i[@class='glyphicon glyphicon-search']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Lnk_SelectRecordByIndex
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Record Selected By Index Value In Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-13-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Lnk_SelectRecordByIndex(WebDriver driver, int Index)
	{
		Element=null;
		try {
			ElementList=driver.findElements(By.xpath(".//*[@class = 'ui-grid-cell-contents ng-scope']/*"));
			Element = ElementList.get(Index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Lnk_SelectRecordByIndexNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Record Selected By Index Value In Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-13-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Lnk_SelectRecordByIndexNew(WebDriver driver, int Index)
	{
		Element=null;
		try {
			ElementList=driver.findElements(By.xpath(".//*[@class = 'ui-grid-cell-contents ng-scope']/span[@role='link']"));
			Element = ElementList.get(Index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Img_RowSelector
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Check Box Selected Corresponding To The Row Number In Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Chk_RowSelector(WebDriver driver, int RowNo)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'"+RowNo+"-uiGrid-')]//div[contains(@class,'ui-grid-icon-ok')]")); //Unique Id  Of Check Box Selected Corresponding To The Row Number In Supplemental Field On RMA Application Supplemental Tab Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Txt_SelectedRowValue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Column Value Corresponding To The Selected Row Number In Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Txt_SelectedRowValue(WebDriver driver, int RowNo)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'"+RowNo+"-uiGrid-')]//div[contains(@class,'ui-grid-cell-contents ng-binding ng-scope')]")); //Unique Id  Of Column Value Corresponding To The Selected Row Number In Supplemental Field On RMA Application Supplemental Tab Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_GenericLookupButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Lookup Button For Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-14-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_GenericLookupButton(WebDriver driver, String SystemName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id,'"+SystemName+"')]//following-sibling::span[1]/button[@class='btn btn-primary']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Txt_VerifyMultiInputFieldValue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Multi Code / Multi Entity Supplemental Field Value On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-21-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Txt_VerifyMultiInputFieldValue(WebDriver driver, String SystemName, String TextValue)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'"+SystemName+"')]//*[contains(text(),'"+TextValue+"')]"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Txt_GetMultiInputFieldValue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Record Selected By Index Value In Supplemental Field On RMA Application Supplemental Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-13-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Txt_GetMultiInputFieldValue(WebDriver driver,String SystemName, int LiIndex)
	{
		Element=null;
		try {
			Element=driver.findElement(By.xpath(".//*[contains(@id,'"+SystemName+"')]/ul/span/li["+LiIndex+"]//*[contains(@class,'ng-binding')]"));			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_GenericTextArea
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Text Area Of HTML Type Supplemental Field On Supplemental Tab On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_GenericTextArea(WebDriver driver, String SystemName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id, '"+SystemName+"')]//textarea"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Input Box Of Supplemental Field On Supplemental Tab On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Btn_Generic
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Button Of HTML Type Supplemental Field On Supplemental Tab On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Btn_Generic(WebDriver driver, String SystemName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id, '"+SystemName+"')]//button"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Text_GenericInputArea
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Button Of HTML Type Supplemental Field On Supplemental Tab On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-22-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Text_GenericInputArea(WebDriver driver, String SystemName)
	{
		Element=null;
		Element = driver.findElement(By.xpath(".//*[contains(@id, '"+SystemName+"')]//input"));
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Lst_UserGroups
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of User/Groups ListBox On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-23-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Lst_UserGroups(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("ddUsersGroups")); //Unique Id  Of User/Groups ListBox On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_Chk_MultiSelect
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of MultiSelect CheckBox On RMA Application Supplemental Field Setup View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-05-23-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_Chk_MultiSelect(WebDriver driver)
	{
		Element=null;
		Element = driver.findElement(By.id("MultiSelect")); //Unique Id  Of MultiSelect CheckBox On RMA Application Supplemental Field Setup View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SupplementalField_GenericHTMLTextArea
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of HTML Text Area Of HTML Type Supplemental Field On Supplemental Tab On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-06-08-2019                                 
	// ============================================================================================
	public static WebElement RMAApp_SupplementalField_GenericHTMLTextArea(WebDriver driver, String SystemName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id, '"+SystemName+"') and contains(@class,'form-control noresize ng-binding')]"));
		} catch (Exception e) {
			e.printStackTrace();
		} //Unique Id  Of Input Box Of Supplemental Field On Supplemental Tab On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Btn_SupplementalGrid
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Supplemental Grid Image Button On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-17-2019                            
	//============================================================================================
	public static WebElement RMAApp_Btn_SupplementalGrid(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Supplemental Grid']")); //Unique Id Supplemental Grid Image Button On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Supplemental_GridDDMenu
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name Of Grid On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - DebasmitaPati-10-17-2019                                
	//============================================================================================
	public static WebElement RMAApp_Supplemental_GridDDMenu(WebDriver driver,String DDMenuName)
	{
		Element=null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='dropdown-menu ng-scope']/li/a[contains(text(),'"+DDMenuName+"')]")); //Unique Id Name Of Grid On RMA Application Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}
}
